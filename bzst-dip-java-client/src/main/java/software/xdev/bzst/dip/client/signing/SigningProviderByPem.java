/*
 * Copyright © 2024 XDEV Software (https://xdev.software)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package software.xdev.bzst.dip.client.signing;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.function.Supplier;

import org.apache.hc.client5.http.utils.Base64;

import software.xdev.bzst.dip.client.exception.SigningException;


public class SigningProviderByPem implements SigningProvider
{
	public static final String DEFAULT_PRIVATE_KEY_ALGORITHM = "RSASSA-PSS";
	private final Supplier<InputStream> certificatePemInputStream;
	private final Supplier<InputStream> privateKeyPemInputStream;
	private final String privateKeyAlgorithm;
	private X509Certificate certificate;
	private PrivateKey privateKey;
	
	public SigningProviderByPem(
		final String certificatePemFilePath,
		final String privateKeyPemFilePath
	)
	{
		this(
			certificatePemFilePath,
			privateKeyPemFilePath,
			DEFAULT_PRIVATE_KEY_ALGORITHM
		);
	}
	
	public SigningProviderByPem(
		final String certificatePemFilePath,
		final String privateKeyPemFilePath,
		final String privateKeyAlgorithm
	)
	{
		this(
			() -> ClassLoader.getSystemClassLoader().getResourceAsStream(certificatePemFilePath),
			() -> ClassLoader.getSystemClassLoader().getResourceAsStream(privateKeyPemFilePath),
			privateKeyAlgorithm
		);
	}
	
	public SigningProviderByPem(
		final Supplier<InputStream> certificatePemInputStream,
		final Supplier<InputStream> privateKeyPemInputStream
	)
	{
		this(
			certificatePemInputStream,
			privateKeyPemInputStream,
			DEFAULT_PRIVATE_KEY_ALGORITHM
		);
	}
	
	public SigningProviderByPem(
		final Supplier<InputStream> certificatePemInputStream,
		final Supplier<InputStream> privateKeyPemInputStream,
		final String privateKeyAlgorithm)
	{
		this.certificatePemInputStream = certificatePemInputStream;
		this.privateKeyPemInputStream = privateKeyPemInputStream;
		this.privateKeyAlgorithm = privateKeyAlgorithm;
	}
	
	@Override
	public X509Certificate getCertificate()
	{
		if(this.certificate == null)
		{
			this.initKeys();
		}
		return this.certificate;
	}
	
	@Override
	public PrivateKey getPrivateKey()
	{
		if(this.privateKey == null)
		{
			this.initKeys();
		}
		return this.privateKey;
	}
	
	private void initKeys()
	{
		try
		{
			this.certificate = this.readCertificate(this.certificatePemInputStream.get());
		}
		catch(final Exception e)
		{
			throw new SigningException("Could not read certificate.", e);
		}
		try
		{
			this.privateKey = this.readPrivateKey(this.privateKeyPemInputStream.get());
		}
		catch(final Exception e)
		{
			throw new SigningException("Could not read private key.", e);
		}
	}
	
	private X509Certificate readCertificate(final InputStream certificateInputStream)
		throws CertificateException, IOException
	{
		try(certificateInputStream)
		{
			final CertificateFactory fact = CertificateFactory.getInstance("X.509");
			return (X509Certificate)fact.generateCertificate(certificateInputStream);
		}
	}
	
	private PrivateKey readPrivateKey(final InputStream privateKeyInputStream) throws Exception
	{
		final String key = new String(privateKeyInputStream.readAllBytes(), Charset.defaultCharset());
		
		final String privateKeyPEM = key
			.replace("-----BEGIN PRIVATE KEY-----", "")
			.replaceAll(System.lineSeparator(), "")
			.replace("-----END PRIVATE KEY-----", "");
		
		final byte[] encoded = Base64.decodeBase64(privateKeyPEM);
		
		final KeyFactory keyFactory = KeyFactory.getInstance(this.privateKeyAlgorithm);
		final PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(encoded);
		return keyFactory.generatePrivate(keySpec);
	}
}
