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
package software.xdev.bzst.dip.client.factory;

import javax.xml.XMLConstants;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;


/**
 * Creates a preconfigured {@link SchemaFactory}.
 */
public final class SchemaFactoryExtension
{
    private SchemaFactoryExtension()
    {
    }
    
    /**
     * @return a preconfigured {@link SchemaFactory} that accesses no external DTD and schema for validation.
     */
    public static SchemaFactory newInstance() throws SAXNotSupportedException, SAXNotRecognizedException
    {
        final SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        schemaFactory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
        schemaFactory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
        schemaFactory.setProperty(XMLConstants.ACCESS_EXTERNAL_DTD, "");
        schemaFactory.setProperty(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "");
        
        return schemaFactory;
    }
}
