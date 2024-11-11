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

package software.xdev.bzst.dip.client.xmldocument.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageType_EnumType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MessageType_EnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DPI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "MessageType_EnumType", namespace = "urn:oecd:ties:dpi:v1")
@XmlEnum
public enum MessageTypeEnumType
{
	
	/**
	 * This type defines the messages to be exchanged under the OECD Model Rules and [EU Specific] [EU DIR2021/514].
	 */
	DPI;
	
	public String value()
	{
		return this.name();
	}
	
	public static MessageTypeEnumType fromValue(final String v)
	{
		return valueOf(v);
	}
}
