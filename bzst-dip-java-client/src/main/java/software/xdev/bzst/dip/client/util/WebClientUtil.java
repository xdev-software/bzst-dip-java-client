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
import java.security.Key;
import java.security.KeyStore;
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
import io.jsonwebtoken.SignatureAlgorithm;
import software.xdev.bzst.dip.client.BzstDipConfiguration;
import software.xdev.bzst.dip.client.factory.DocumentBuilderFactoryExtension;


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
		LOGGER.info("Creating jwt token...");
		try(final InputStream keystoreInputStream = configuration.getCertificateKeystoreInputStream().get())
		{
			final KeyStore.PrivateKeyEntry privateKeyEntry = SigningUtil.getPrivateKeyEntry
				(
					keystoreInputStream,
					configuration.getCertificateKeystorePassword(),
					SigningUtil.KEYSTORE_TYPE
				);
			
			if(privateKeyEntry == null)
			{
				throw new RuntimeException("The private key entry in the keystore is null.");
			}
			
			final Key privateKey = privateKeyEntry.getPrivateKey();
			final String clientId = configuration.getClientId();
			LOGGER.info("Using client id: {}", clientId);
			
			return Jwts.builder()
				.issuer(clientId)
				.subject(clientId)
				.audience().add(
					configuration.getRealmEnvironmentBaseUrl() + MDS_POSTFIX)
				.and()
				.issuedAt(new Date())
				.expiration(new Date(System.currentTimeMillis() + (5 * 60 * 1000L)))
				.id(UUID.randomUUID().toString())
				.notBefore(new Date(System.currentTimeMillis() - 60 * 1000L))
				.signWith(privateKey, SignatureAlgorithm.RS256)
				.compact();
		}
		catch(final IOException ioException)
		{
			throw new RuntimeException("An error occurred while creating the request token.", ioException);
		}
	}
	
	public static List<String> convertTransferNumberXML(final String xmlString)
	{
		try
		{
			final DocumentBuilderFactory dbf = DocumentBuilderFactoryExtension.newInstance();
			final DocumentBuilder db = dbf.newDocumentBuilder();
			final Document doc = db.parse(new InputSource(new StringReader(xmlString)));
			
			final NodeList nodeList = doc.getElementsByTagName(TAG_NAME_DATENTRANSFERNUMMER);
			final List<String> stringList = new ArrayList<>();
			
			for(int i = 0;
				i < nodeList.getLength();
				i++)
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
			throw new RuntimeException("An error occurred while parsing the transfer numbers.", e);
		}
	}
}
