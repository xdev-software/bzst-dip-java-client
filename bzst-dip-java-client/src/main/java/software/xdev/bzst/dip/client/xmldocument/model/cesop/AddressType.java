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

package software.xdev.bzst.dip.client.xmldocument.model.cesop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 			The user has the option to enter the data about the address either as one long field or to spread the data over up to nine elements or even to use both formats. If the user chooses the option to enter the data required in separate elements, the container element for this will be 'AddressFix'. If the user chooses the option to enter the data required in a less structured way in 'AddressFree' all available address details shall be presented as one string of bytes, blank or "/" (slash) or carriage return- line feed used as a delimiter between parts of the address. PLEASE NOTE that the address country code is outside  both of these elements. If available, the 'AddressFix format is preferred.
 * 			
 * 
 * <p>Java-Klasse für Address_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Address_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountryCode" type="{urn:eu:taxud:isotypes:v1}CountryCode_Type" minOccurs="0"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="AddressFix" type="{urn:eu:taxud:commontypes:v1}AddressFix_Type" minOccurs="0"/&gt;
 *           &lt;element name="AddressFree" type="{urn:eu:taxud:commontypes:v1}StringMin1Max1000_Type" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="legalAddressType" type="{urn:eu:taxud:commontypes:v1}LegalAddressType_EnumType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address_Type", namespace = "urn:eu:taxud:commontypes:v1", propOrder = {
    "countryCode",
    "addressFix",
    "addressFree"
})
public class AddressType {

    @XmlElement(name = "CountryCode", namespace = "urn:eu:taxud:commontypes:v1")
    @XmlSchemaType(name = "string")
    protected CountryCodeType countryCode;
    @XmlElement(name = "AddressFix", namespace = "urn:eu:taxud:commontypes:v1")
    protected AddressFixType addressFix;
    @XmlElement(name = "AddressFree", namespace = "urn:eu:taxud:commontypes:v1")
    protected String addressFree;
    @XmlAttribute(name = "legalAddressType")
    protected LegalAddressTypeEnumType legalAddressType;

    /**
     * Ruft den Wert der countryCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getCountryCode() {
        return countryCode;
    }

    /**
     * Legt den Wert der countryCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setCountryCode(CountryCodeType value) {
        this.countryCode = value;
    }

    /**
     * Ruft den Wert der addressFix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AddressFixType }
     *     
     */
    public AddressFixType getAddressFix() {
        return addressFix;
    }

    /**
     * Legt den Wert der addressFix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressFixType }
     *     
     */
    public void setAddressFix(AddressFixType value) {
        this.addressFix = value;
    }

    /**
     * Ruft den Wert der addressFree-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressFree() {
        return addressFree;
    }

    /**
     * Legt den Wert der addressFree-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressFree(String value) {
        this.addressFree = value;
    }

    /**
     * Ruft den Wert der legalAddressType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LegalAddressTypeEnumType }
     *     
     */
    public LegalAddressTypeEnumType getLegalAddressType() {
        return legalAddressType;
    }

    /**
     * Legt den Wert der legalAddressType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalAddressTypeEnumType }
     *     
     */
    public void setLegalAddressType(LegalAddressTypeEnumType value) {
        this.legalAddressType = value;
    }

}
