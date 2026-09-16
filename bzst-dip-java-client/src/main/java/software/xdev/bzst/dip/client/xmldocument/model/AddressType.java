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

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The user has the option to enter the data about the address of a party either as one long field or to spread the data
 * over up to eight  elements or even to use both formats. If the user chooses the option to enter the data required in
 * separate elements, the container element for this will be 'AddressFix'. If the user chooses the option to enter the
 * data required in a less structured way in 'AddressFree' all available address details shall be presented as one
 * string of bytes, blank or "/" (slash) or carriage return- line feed used as a delimiter between parts of the address.
 * PLEASE NOTE that the address country code is outside  both of these elements. The use of the fixed form is
 * recommended as a rule to allow easy matching. However, the use of the free form is recommended if the sending state
 * cannot reliably identify and distinguish the different parts of the address. The user may want to use both formats
 * e.g. if besides separating the logical parts of the address he also wants to indicate a suitable breakdown into
 * print-lines by delimiters in the free text form. In this case 'AddressFix' has to precede 'AddressFree'.
 *
 *
 * <p>Java class for Address_Type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Address_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountryCode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{urn:oecd:ties:isodpitypes:v1}CountryCode_Type"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;choice&gt;
 *           &lt;element name="AddressFree" type="{urn:oecd:ties:dpistf:v1}StringMin1Max4000_Type"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="AddressFix" type="{urn:oecd:ties:dpi:v1}AddressFix_Type"/&gt;
 *             &lt;element name="AddressFree" type="{urn:oecd:ties:dpistf:v1}StringMin1Max4000_Type" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="legalAddressType" type="{urn:oecd:ties:dpistf:v1}OECDLegalAddressType_EnumType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address_Type", namespace = "urn:oecd:ties:dpi:v1", propOrder = {
	"content"
})
public class AddressType
{
	
	@XmlElementRefs({
		@XmlElementRef(name = "CountryCode", namespace = "urn:oecd:ties:dpi:v1", type = JAXBElement.class, required =
			false),
		@XmlElementRef(name = "AddressFree", namespace = "urn:oecd:ties:dpi:v1", type = JAXBElement.class, required =
			false),
		@XmlElementRef(name = "AddressFix", namespace = "urn:oecd:ties:dpi:v1", type = JAXBElement.class, required =
			false)
	})
	protected List<JAXBElement<?>> content;
	@XmlAttribute(name = "legalAddressType")
	protected OECDLegalAddressTypeEnumType legalAddressType;
	
	/**
	 * Gets the rest of the content model.
	 *
	 * <p>
	 * You are getting this "catch-all" property because of the following reason: The field name "AddressFree" is used
	 * by two different parts of a schema.
	 * <p>
	 * To get rid of this property, apply a property customization to one of both of the following declarations to
	 * change their names: Gets the value of the content property.
	 *
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
	 * make to
	 * the returned list will be present inside the Jakarta XML Binding object. This is why there is not a
	 * <CODE>set</CODE> method for the content property.
	 *
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getContent().add(newItem);
	 * </pre>
	 *
	 *
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link JAXBElement }{@code <}{@link String }{@code >}
	 * {@link JAXBElement }{@code <}{@link AddressFixType }{@code >}
	 * {@link JAXBElement }{@code <}{@link CountryCodeType }{@code >}
	 */
	public List<JAXBElement<?>> getContent()
	{
		if(this.content == null)
		{
			this.content = new ArrayList<>();
		}
		return this.content;
	}
	
	/**
	 * Gets the value of the legalAddressType property.
	 *
	 * @return possible object is {@link OECDLegalAddressTypeEnumType }
	 */
	public OECDLegalAddressTypeEnumType getLegalAddressType()
	{
		return this.legalAddressType;
	}
	
	/**
	 * Sets the value of the legalAddressType property.
	 *
	 * @param value allowed object is {@link OECDLegalAddressTypeEnumType }
	 */
	public void setLegalAddressType(final OECDLegalAddressTypeEnumType value)
	{
		this.legalAddressType = value;
	}
}
