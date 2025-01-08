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

import static java.util.Collections.singletonList;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import software.xdev.bzst.dip.client.exception.SigningException;
import software.xdev.bzst.dip.client.factory.DocumentBuilderFactoryNoExternalEntities;
import software.xdev.bzst.dip.client.factory.TransformerFactoryExtension;


/**
 * Helps with signing XML-Documents
 */
public final class XmlSigner
{
	private static final Logger LOGGER = LoggerFactory.getLogger(XmlSigner.class);
	private static final String DIGEST_METHOD = DigestMethod.SHA256;
	private static final String SIGNATURE_METHOD = SignatureMethod.SHA256_RSA_MGF1;
	
	private final SigningProvider certAndKeyProvider;
	
	public XmlSigner(final SigningProvider certAndKeyProvider)
	{
		this.certAndKeyProvider = certAndKeyProvider;
	}
	
	/**
	 * Signs an unsigned xml string with the corresponding {@link SigningProvider}.
	 *
	 * @return the signed xml document as string
	 */
	public String signXMLDocument(final String unsignedXmlString)
	{
		try(final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			final ByteArrayInputStream unsignedXmlByteArrayInputStream =
				new ByteArrayInputStream(unsignedXmlString.getBytes(StandardCharsets.UTF_8)))
		{
			final DocumentBuilderFactory dbf = DocumentBuilderFactoryNoExternalEntities.newInstance();
			dbf.setNamespaceAware(true);
			
			final Document dipXmlDocument = dbf.newDocumentBuilder().parse(unsignedXmlByteArrayInputStream);
			final Document newDocument = dbf.newDocumentBuilder().newDocument();
			final XMLSignatureFactory xmlSignatureFactory = XMLSignatureFactory.getInstance("DOM");
			
			final X509Certificate certificate = this.certAndKeyProvider.getCertificate();
			final PrivateKey privateKey = this.certAndKeyProvider.getPrivateKey();
			
			// Sign context
			this.createDomSignContext(certificate, privateKey, newDocument, xmlSignatureFactory, dipXmlDocument);
			
			final Result outputTarget = new StreamResult(outputStream);
			final TransformerFactory transformerFactory = TransformerFactoryExtension.newInstance();
			transformerFactory.newTransformer().transform(new DOMSource(newDocument), outputTarget);
			
			if(!this.validateSignature(newDocument, xmlSignatureFactory, certificate))
			{
				throw new SigningException("The validation of the signature from the XML document has failed.");
			}
			
			return outputStream.toString(StandardCharsets.UTF_8);
		}
		catch(final Exception e)
		{
			throw new SigningException("Something wrong happened while signing the xml document.", e);
		}
	}
	
	private void createDomSignContext(
		final X509Certificate certificate,
		final PrivateKey privateKey,
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
		final SignedInfo signedInfo = this.createSignedInfo(xmlSignatureFactory);
		
		// Key info
		final KeyInfo keyInfo = this.createKeyInfo(certificate, xmlSignatureFactory);
		
		final DOMStructure content = new DOMStructure(dipXmlDocument.getDocumentElement());
		final XMLObject signedObject = xmlSignatureFactory.newXMLObject(Collections.singletonList(content), "object",
			null, null);
		
		final DOMSignContext domSignContext = new DOMSignContext(privateKey, newDocument);
		domSignContext.setDefaultNamespacePrefix("ds");
		
		final XMLSignature xmlSignature = xmlSignatureFactory.newXMLSignature(signedInfo, keyInfo,
			Collections.singletonList(signedObject), null, null);
		xmlSignature.sign(domSignContext);
	}
	
	private SignedInfo createSignedInfo(final XMLSignatureFactory xmlSignatureFactory)
		throws InvalidAlgorithmParameterException, NoSuchAlgorithmException
	{
		
		final Reference reference = xmlSignatureFactory.newReference("#object",
			xmlSignatureFactory.newDigestMethod(DIGEST_METHOD, null), List.of(), null, null);
		
		return xmlSignatureFactory.newSignedInfo(
			xmlSignatureFactory.newCanonicalizationMethod(
				CanonicalizationMethod.INCLUSIVE,
				(C14NMethodParameterSpec)null),
			xmlSignatureFactory.newSignatureMethod(SIGNATURE_METHOD, null),
			Collections.singletonList(reference)
		);
	}
	
	private KeyInfo createKeyInfo(
		final X509Certificate certificate,
		final XMLSignatureFactory xmlSignatureFactory)
	{
		final KeyInfoFactory kif = xmlSignatureFactory.getKeyInfoFactory();
		
		final List<Object> x509Content = new ArrayList<>();
		x509Content.add(certificate.getSubjectX500Principal().getName());
		x509Content.add(certificate);
		
		final X509Data xd = kif.newX509Data(x509Content);
		return kif.newKeyInfo(singletonList(xd));
	}
	
	private boolean validateSignature(
		final Document doc,
		final XMLSignatureFactory fac,
		final X509Certificate certificate)
		throws MarshalException, XMLSignatureException
	{
		LOGGER.debug("Validating xml signature...");
		
		// Find Signature element.
		final NodeList nl = doc.getElementsByTagNameNS(XMLSignature.XMLNS, "Signature");
		if(nl.getLength() == 0)
		{
			throw new SigningException("Cannot find Signature element.");
		}
		
		// Create a DOMValidateContext and specify a KeySelector
		// and document context.
		final DOMValidateContext valContext = new DOMValidateContext(
			certificate.getPublicKey(),
			nl.item(0));
		
		// Unmarshal the XMLSignature.
		final XMLSignature s = fac.unmarshalXMLSignature(valContext);
		
		LOGGER.debug("Finished validating xml signature.");
		// Validate the XMLSignature.
		return s.validate(valContext);
	}
}
