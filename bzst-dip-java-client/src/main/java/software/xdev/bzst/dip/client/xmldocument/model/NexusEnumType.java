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
 * <p>Java class for Nexus_EnumType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="Nexus_EnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RPONEX1"/&gt;
 *     &lt;enumeration value="RPONEX2"/&gt;
 *     &lt;enumeration value="RPONEX3"/&gt;
 *     &lt;enumeration value="RPONEX4"/&gt;
 *     &lt;enumeration value="RPONEX5"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "Nexus_EnumType", namespace = "urn:oecd:ties:dpi:v1")
@XmlEnum
public enum NexusEnumType
{
	
	/**
	 * The Reporting Platform Operator is resident for tax purposes in the EU Member State.
	 */
	@XmlEnumValue("RPONEX1")
	RPONEX_1("RPONEX1"),
	
	/**
	 * The Reporting Platform Operator does not have a residence for tax purposes but it is incorporated under the laws
	 * of the EU Member State.
	 */
	@XmlEnumValue("RPONEX2")
	RPONEX_2("RPONEX2"),
	
	/**
	 * The Reporting Platform Operator does not have a residence for tax purposes but it has its place of management
	 * (including effective management) in the EU Member State.
	 */
	@XmlEnumValue("RPONEX3")
	RPONEX_3("RPONEX3"),
	
	/**
	 * The Reporting Platform Operator does not have a residence for tax purposes but it has a permanent establishment
	 * in the EU Member State and it is not a Qualified Non-Union Platform Operator.
	 */
	@XmlEnumValue("RPONEX4")
	RPONEX_4("RPONEX4"),
	
	/**
	 * The Reporting Platform Operator is neither resident for tax purposes, nor incorporated or managed in the EU
	 * Member State, nor has a permanent establishment in the EU Member State but it facilitates the carrying out of a
	 * Relevant Activity by Reportable Sellers or a Relevant Activity involving the rental of immovable property
	 * located
	 * in the EU Member State and it is not a Qualified Non-Union Platform Operator.
	 */
	@XmlEnumValue("RPONEX5")
	RPONEX_5("RPONEX5");
	private final String value;
	
	NexusEnumType(final String v)
	{
		this.value = v;
	}
	
	public String value()
	{
		return this.value;
	}
	
	public static NexusEnumType fromValue(final String v)
	{
		for(final NexusEnumType c : NexusEnumType.values())
		{
			if(c.value.equals(v))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}
}
