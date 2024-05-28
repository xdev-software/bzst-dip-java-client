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
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import software.xdev.bzst.dip.client.factory.DocumentBuilderFactoryNoExternalEntities;


/**
 * Helps in communicating as web client.
 */
public final class WebClientUtil
{
	private static final Logger LOGGER = LoggerFactory.getLogger(WebClientUtil.class);
	public static final String TAG_NAME_DATENTRANSFERNUMMER = "Datentransfernummer";
	
	private WebClientUtil()
	{
	}
	
	
	public static List<String> extractTransferNumberFromXml(final String xmlString) throws IOException
	{
		try
		{
			final DocumentBuilderFactory dbf = DocumentBuilderFactoryNoExternalEntities.newInstance();
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
