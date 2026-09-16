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
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for INType_EnumType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="INType_EnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LEI"/&gt;
 *     &lt;enumeration value="EIN"/&gt;
 *     &lt;enumeration value="IIN"/&gt;
 *     &lt;enumeration value="BRN"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "INType_EnumType", namespace = "urn:oecd:ties:dpi:v1")
@XmlEnum
public enum INTypeEnumType
{
	
	/**
	 * Legal Entity Identifier
	 */
	LEI("LEI"),
	
	/**
	 * Entity Identification Number
	 */
	EIN("EIN"),
	
	/**
	 * Individual Identification Number
	 */
	IIN("IIN"),
	
	/**
	 * Business Registration Number
	 */
	BRN("BRN"),
	
	/**
	 * Other
	 */
	@XmlEnumValue("Other")
	OTHER("Other");
	private final String value;
	
	INTypeEnumType(final String v)
	{
		this.value = v;
	}
	
	public String value()
	{
		return this.value;
	}
	
	public static INTypeEnumType fromValue(final String v)
	{
		for(final INTypeEnumType c : INTypeEnumType.values())
		{
			if(c.value.equals(v))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}
}
