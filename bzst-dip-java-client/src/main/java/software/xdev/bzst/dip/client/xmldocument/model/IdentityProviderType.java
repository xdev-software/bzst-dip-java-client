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
 * <p>Java class for identityProviderType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="identityProviderType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BZST-CERT"/&gt;
 *     &lt;enumeration value="ELSTER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "identityProviderType", namespace = "http://itzbund.de/ozg/bzst/post/dip/v1/")
@XmlEnum
public enum IdentityProviderType
{
	
	@XmlEnumValue("BZST-CERT")
	BZST_CERT("BZST-CERT"),
	ELSTER("ELSTER");
	private final String value;
	
	IdentityProviderType(final String v)
	{
		this.value = v;
	}
	
	public String value()
	{
		return this.value;
	}
	
	public static IdentityProviderType fromValue(final String v)
	{
		for(final IdentityProviderType c : IdentityProviderType.values())
		{
			if(c.value.equals(v))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}
}
