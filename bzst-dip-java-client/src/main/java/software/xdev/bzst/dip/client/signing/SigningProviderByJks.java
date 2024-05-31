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
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.function.Supplier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import software.xdev.bzst.dip.client.exception.SigningException;


/**
 * Provides a certificate and a private key to use in the {@link XmlSigner} by reading the JKS-Keystore and a password.
 */
public class SigningProviderByJks implements SigningProvider
{
	private static final Logger LOGGER = LoggerFactory.getLogger(SigningProviderByJks.class);
	public static final String KEYSTORE_TYPE = "JKS";
	private final Supplier<InputStream> certificateKeystoreInputStream;
	private final String certificateKeystorePassword;
	private X509Certificate certificate;
	private PrivateKey privateKey;
	
	public SigningProviderByJks(
		final String certificateKeystorePath,
		final String certificateKeystorePassword
	)
	{
		this(
			() -> ClassLoader.getSystemClassLoader().getResourceAsStream(certificateKeystorePath),
			certificateKeystorePassword
		);
	}
	
	public SigningProviderByJks(
		final Supplier<InputStream> certificateKeystoreInputStream,
		final String certificateKeystorePassword
	)
	{
		this.certificateKeystoreInputStream = certificateKeystoreInputStream;
		this.certificateKeystorePassword = certificateKeystorePassword;
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
		try(final InputStream keystoreInputStream = this.certificateKeystoreInputStream.get())
		{
			// Get private key
			final KeyStore.PrivateKeyEntry privateKeyEntry =
				this.getPrivateKeyEntry(
					keystoreInputStream,
					this.certificateKeystorePassword,
					KEYSTORE_TYPE
				);
			this.certificate = (X509Certificate)privateKeyEntry.getCertificate();
			this.privateKey = privateKeyEntry.getPrivateKey();
		}
		catch(final IOException e)
		{
			throw new SigningException("Could not read keystore.", e);
		}
	}
	
	/**
	 * Reads the given {@link InputStream} with the corresponding password and returns it as
	 * {@link KeyStore.PrivateKeyEntry}.
	 */
	private KeyStore.PrivateKeyEntry getPrivateKeyEntry(
		final InputStream keyStoreInputStream,
		final String keyStorePassword,
		final String type)
	{
		try
		{
			LOGGER.debug("Loading keystore file...");
			final KeyStore ks = KeyStore.getInstance(type);
			ks.load(keyStoreInputStream, keyStorePassword.toCharArray());
			
			final KeyStore.PrivateKeyEntry certificate = (KeyStore.PrivateKeyEntry)ks.getEntry(
				"certificate",
				new KeyStore.PasswordProtection(keyStorePassword.toCharArray()));
			
			if(certificate == null)
			{
				throw new SigningException("The private key entry in the keystore is null.");
			}
			return certificate;
		}
		catch(final Exception e)
		{
			throw new SigningException(
				"Something wrong happened while getting the private key entry from the keystore.",
				e);
		}
	}
}
