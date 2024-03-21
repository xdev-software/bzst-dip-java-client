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
package software.xdev.bzst.dip.client.util;

import static java.util.Collections.singletonList;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.xml.crypto.MarshalException;
import javax.xml.crypto.dom.DOMStructure;
import javax.xml.crypto.dsig.CanonicalizationMethod;
import javax.xml.crypto.dsig.DigestMethod;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.SignatureMethod;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.XMLObject;
import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.dom.DOMValidateContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.keyinfo.X509Data;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import software.xdev.bzst.dip.client.BzstDipConfiguration;
import software.xdev.bzst.dip.client.factory.DocumentBuilderFactoryExtension;
import software.xdev.bzst.dip.client.factory.TransformerFactoryExtension;


public final class SigningUtil
{
	private static final Logger LOGGER = LogManager.getLogger(SigningUtil.class);
	private static final String DIGEST_METHOD = DigestMethod.SHA256;
	private static final String SIGNATURE_METHOD = SignatureMethod.SHA256_RSA_MGF1;
	public static final String KEYSTORE_TYPE = "JKS";
	
	private SigningUtil()
	{
	}
	
	public static String signXMLDocument(final String unsignedXmlString, final BzstDipConfiguration configuration)
	{
		try(final InputStream keystoreInputStream = configuration.getCertificateKeystoreInputStream().get();
			final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			final ByteArrayInputStream unsignedXmlByteArrayInputStream =
				new ByteArrayInputStream(unsignedXmlString.getBytes(StandardCharsets.UTF_8)))
		{
			final DocumentBuilderFactory dbf = DocumentBuilderFactoryExtension.newInstance();
			dbf.setNamespaceAware(true);
			
			final Document dipXmlDocument = dbf.newDocumentBuilder().parse(unsignedXmlByteArrayInputStream);
			final Document newDocument = dbf.newDocumentBuilder().newDocument();
			final XMLSignatureFactory xmlSignatureFactory = XMLSignatureFactory.getInstance("DOM");
			
			// Get private key
			final KeyStore.PrivateKeyEntry privateKeyEntry =
				getPrivateKeyEntry(
					keystoreInputStream,
					configuration.getCertificateKeystorePassword(),
					KEYSTORE_TYPE
				);
			
			if(privateKeyEntry == null)
			{
				throw new RuntimeException("Private key entry is null.");
			}
			
			// Sign context
			createDomSignContext(privateKeyEntry, newDocument, xmlSignatureFactory, dipXmlDocument);
			
			final Result outputTarget = new StreamResult(outputStream);
			final TransformerFactory transformerFactory = TransformerFactoryExtension.newInstance();
			transformerFactory.newTransformer().transform(new DOMSource(newDocument), outputTarget);
			
			if(validateSignature(newDocument, xmlSignatureFactory, privateKeyEntry))
			{
				return outputStream.toString(StandardCharsets.UTF_8);
			}
			
			throw new RuntimeException("The validation of the signature from the XML document has failed.");
		}
		catch(final Exception e)
		{
			throw new RuntimeException("Something wrong happened while signing the xml document.", e);
		}
	}
	
	private static void createDomSignContext(
		final KeyStore.PrivateKeyEntry privateKeyEntry,
		final Document newDocument,
		final XMLSignatureFactory xmlSignatureFactory,
		final Document dipXmlDocument
	)
		throws
		MarshalException,
		XMLSignatureException,
		InvalidAlgorithmParameterException,
		NoSuchAlgorithmException
	{
		
		// Sign info
		final SignedInfo signedInfo = createSignedInfo(xmlSignatureFactory);
		
		// Key info
		final KeyInfo keyInfo = createKeyInfo(privateKeyEntry, xmlSignatureFactory);
		
		final DOMStructure content = new DOMStructure(dipXmlDocument.getDocumentElement());
		final XMLObject signedObject = xmlSignatureFactory.newXMLObject(Collections.singletonList(content), "object",
			null, null);
		
		final DOMSignContext domSignContext = new DOMSignContext(privateKeyEntry.getPrivateKey(), newDocument);
		domSignContext.setDefaultNamespacePrefix("ds");
		
		final XMLSignature xmlSignature = xmlSignatureFactory.newXMLSignature(signedInfo, keyInfo,
			Collections.singletonList(signedObject), null, null);
		xmlSignature.sign(domSignContext);
	}
	
	private static SignedInfo createSignedInfo(final XMLSignatureFactory xmlSignatureFactory)
		throws InvalidAlgorithmParameterException, NoSuchAlgorithmException
	{
		
		final Reference reference = xmlSignatureFactory.newReference("#object",
			xmlSignatureFactory.newDigestMethod(DIGEST_METHOD, null), List.of(), null, null);
		
		return xmlSignatureFactory.newSignedInfo
			(
				xmlSignatureFactory.newCanonicalizationMethod(
					CanonicalizationMethod.INCLUSIVE,
					(C14NMethodParameterSpec)null),
				xmlSignatureFactory.newSignatureMethod(SIGNATURE_METHOD, null),
				Collections.singletonList(reference)
			);
	}
	
	private static KeyInfo createKeyInfo(
		final KeyStore.PrivateKeyEntry privateKeyEntry,
		final XMLSignatureFactory xmlSignatureFactory)
	{
		final X509Certificate cert = (X509Certificate)privateKeyEntry.getCertificate();
		final KeyInfoFactory kif = xmlSignatureFactory.getKeyInfoFactory();
		
		final List<Object> x509Content = new ArrayList<>();
		x509Content.add(cert.getSubjectX500Principal().getName());
		x509Content.add(cert);
		
		final X509Data xd = kif.newX509Data(x509Content);
		return kif.newKeyInfo(singletonList(xd));
	}
	
	private static boolean validateSignature(
		final Document doc,
		final XMLSignatureFactory fac,
		final KeyStore.PrivateKeyEntry privateKeyEntry)
		throws MarshalException, XMLSignatureException
	{
		LOGGER.info("Validating xml signature...");
		
		// Find Signature element.
		final NodeList nl = doc.getElementsByTagNameNS(XMLSignature.XMLNS, "Signature");
		if(nl.getLength() == 0)
		{
			throw new RuntimeException("Cannot find Signature element.");
		}
		
		// Create a DOMValidateContext and specify a KeySelector
		// and document context.
		final DOMValidateContext valContext = new DOMValidateContext(
			privateKeyEntry.getCertificate().getPublicKey(),
			nl.item(0));
		
		// Unmarshal the XMLSignature.
		final XMLSignature s = fac.unmarshalXMLSignature(valContext);
		
		LOGGER.info("Finished validating xml signature.");
		// Validate the XMLSignature.
		return s.validate(valContext);
	}
	
	public static KeyStore.PrivateKeyEntry getPrivateKeyEntry(
		final InputStream keyStoreInputStream,
		final String keyStorePassword,
		final String type)
	{
		try
		{
			LOGGER.info("Loading keystore file...");
			final KeyStore ks = KeyStore.getInstance(type);
			ks.load(keyStoreInputStream, keyStorePassword.toCharArray());
			
			return (KeyStore.PrivateKeyEntry)ks.getEntry(
				"certificate",
				new KeyStore.PasswordProtection(keyStorePassword.toCharArray()));
		}
		catch(final Exception e)
		{
			throw new RuntimeException(
				"Something wrong happened while getting the private key entry from the keystore.",
				e);
		}
	}
}
