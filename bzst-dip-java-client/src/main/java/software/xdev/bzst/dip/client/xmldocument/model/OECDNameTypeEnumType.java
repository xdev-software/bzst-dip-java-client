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
 * <p>Java class for OECDNameType_EnumType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="OECDNameType_EnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OECD201"/&gt;
 *     &lt;enumeration value="OECD202"/&gt;
 *     &lt;enumeration value="OECD203"/&gt;
 *     &lt;enumeration value="OECD204"/&gt;
 *     &lt;enumeration value="OECD205"/&gt;
 *     &lt;enumeration value="OECD206"/&gt;
 *     &lt;enumeration value="OECD207"/&gt;
 *     &lt;enumeration value="OECD208"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "OECDNameType_EnumType", namespace = "urn:oecd:ties:dpistf:v1")
@XmlEnum
public enum OECDNameTypeEnumType
{
	
	/**
	 * SMFAliasOrOther
	 */
	@XmlEnumValue("OECD201")
	OECD_201("OECD201"),
	
	/**
	 * indiv (individual)
	 */
	@XmlEnumValue("OECD202")
	OECD_202("OECD202"),
	
	/**
	 * alias (alias)
	 */
	@XmlEnumValue("OECD203")
	OECD_203("OECD203"),
	
	/**
	 * nick (nickname)
	 */
	@XmlEnumValue("OECD204")
	OECD_204("OECD204"),
	
	/**
	 * aka (also known as)
	 */
	@XmlEnumValue("OECD205")
	OECD_205("OECD205"),
	
	/**
	 * dba (doing business as)
	 */
	@XmlEnumValue("OECD206")
	OECD_206("OECD206"),
	
	/**
	 * legal (legal name)
	 */
	@XmlEnumValue("OECD207")
	OECD_207("OECD207"),
	
	/**
	 * atbirth (name at birth)
	 */
	@XmlEnumValue("OECD208")
	OECD_208("OECD208");
	private final String value;
	
	OECDNameTypeEnumType(final String v)
	{
		this.value = v;
	}
	
	public String value()
	{
		return this.value;
	}
	
	public static OECDNameTypeEnumType fromValue(final String v)
	{
		for(final OECDNameTypeEnumType c : OECDNameTypeEnumType.values())
		{
			if(c.value.equals(v))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}
}
