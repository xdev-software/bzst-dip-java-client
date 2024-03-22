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

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * Defines a string with minimum length 1 and maximum length of 4000, with the Language attribute.
 *
 * <p>Java class for StringMin1Max4000WithLang_Type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="StringMin1Max4000WithLang_Type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:oecd:ties:dpistf:v1&gt;StringMin1Max4000_Type"&gt;
 *       &lt;attribute name="language" type="{urn:oecd:ties:isodpitypes:v1}LanguageCode_Type" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StringMin1Max4000WithLang_Type", namespace = "urn:oecd:ties:dpistf:v1", propOrder = {
	"value"
})
public class StringMin1Max4000WithLangType
{
	
	@XmlValue
	protected String value;
	@XmlAttribute(name = "language")
	protected LanguageCodeType language;
	
	/**
	 * Defines a string with minimum length 1 and maximum length of 4000.
	 *
	 * @return possible object is {@link String }
	 */
	public String getValue()
	{
		return this.value;
	}
	
	/**
	 * Sets the value of the value property.
	 *
	 * @param value allowed object is {@link String }
	 */
	public void setValue(final String value)
	{
		this.value = value;
	}
	
	/**
	 * Gets the value of the language property.
	 *
	 * @return possible object is {@link LanguageCodeType }
	 */
	public LanguageCodeType getLanguage()
	{
		return this.language;
	}
	
	/**
	 * Sets the value of the language property.
	 *
	 * @param value allowed object is {@link LanguageCodeType }
	 */
	public void setLanguage(final LanguageCodeType value)
	{
		this.language = value;
	}
}
