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

import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import io.jsonwebtoken.Jwts;
import software.xdev.bzst.dip.client.exception.EncryptionException;
import software.xdev.bzst.dip.client.exception.SigningException;
import software.xdev.bzst.dip.client.factory.DocumentBuilderFactoryExtension;
import software.xdev.bzst.dip.client.model.configuration.BzstDipConfiguration;


public final class WebClientUtil
{
	private static final Logger LOGGER = LogManager.getLogger(WebClientUtil.class);
	public static final String MDS_POSTFIX = "/auth/realms/mds";
	public static final String TAG_NAME_DATENTRANSFERNUMMER = "Datentransfernummer";
	
	private WebClientUtil()
	{
	}
	
	public static String createRequestToken(final BzstDipConfiguration configuration)
	{
		LOGGER.debug("Creating jwt token...");
		try(final InputStream keystoreInputStream = configuration.getCertificateKeystoreInputStream().get())
		{
			final KeyStore.PrivateKeyEntry privateKeyEntry = SigningUtil.getPrivateKeyEntry(
				keystoreInputStream,
				configuration.getCertificateKeystorePassword(),
				SigningUtil.KEYSTORE_TYPE
			);
			
			if(privateKeyEntry == null)
			{
				throw new SigningException("The private key entry in the keystore is null.");
			}
			
			final PrivateKey privateKey = privateKeyEntry.getPrivateKey();
			final String clientId = configuration.getClientId();
			LOGGER.debug("Using client id: {}", clientId);
			
			return Jwts.builder()
				.issuer(clientId)
				.subject(clientId)
				.audience().add(
					configuration.getRealmEnvironmentBaseUrl() + MDS_POSTFIX)
				.and()
				.issuedAt(new Date())
				.expiration(new Date(System.currentTimeMillis() + Duration.ofMinutes(5).toMillis()))
				.id(UUID.randomUUID().toString())
				.notBefore(new Date(System.currentTimeMillis() - Duration.ofMinutes(1).toMillis()))
				.signWith(privateKey, Jwts.SIG.RS256)
				.compact();
		}
		catch(final IOException ioException)
		{
			throw new EncryptionException("An error occurred while creating the request token.", ioException);
		}
	}
	
	public static List<String> extractTransferNumberFromXml(final String xmlString) throws IOException
	{
		try
		{
			final DocumentBuilderFactory dbf = DocumentBuilderFactoryExtension.newInstance();
			final DocumentBuilder db = dbf.newDocumentBuilder();
			final Document doc = db.parse(new InputSource(new StringReader(xmlString)));
			
			final NodeList nodeList = doc.getElementsByTagName(TAG_NAME_DATENTRANSFERNUMMER);
			final List<String> stringList = new ArrayList<>();
			
			for(int i = 0; i < nodeList.getLength(); i++)
			{
				final Node node = nodeList.item(i);
				if(node.getNodeType() == Node.ELEMENT_NODE)
				{
					final Element tElement = (Element)node;
					stringList.add(tElement.getTextContent());
				}
			}
			return stringList;
		}
		catch(final ParserConfigurationException | SAXException | IOException e)
		{
			throw new IOException("An error occurred while parsing the transfer numbers.", e);
		}
	}
}
