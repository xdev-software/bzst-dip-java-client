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
 * This is the identification number/identification code for the Entity in question. As the identifier may be not strictly numeric, it is just defined as a string of characters. Attribute 'issuedBy' is required to designate the issuer of the identifier.  Attribute 'INType' defines the type of identification number. 
 * 
 * <p>Java class for OrganisationIN_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganisationIN_Type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:oecd:ties:dpistf:v1&gt;StringMin1Max200_Type"&gt;
 *       &lt;attribute name="issuedBy" type="{urn:oecd:ties:isodpitypes:v1}CountryCode_Type" /&gt;
 *       &lt;attribute name="INType" use="required" type="{urn:oecd:ties:dpi:v1}INType_EnumType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationIN_Type", namespace = "urn:oecd:ties:dpi:v1", propOrder = {
    "value"
})
public class OrganisationINType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "issuedBy")
    protected CountryCodeType issuedBy;
    @XmlAttribute(name = "INType", required = true)
    protected INTypeEnumType inType;

    /**
     * Defines a string with minimum length 1 and maximum length of 200.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(final String value) {
        this.value = value;
    }

    /**
     * Gets the value of the issuedBy property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getIssuedBy() {
        return this.issuedBy;
    }

    /**
     * Sets the value of the issuedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setIssuedBy(final CountryCodeType value) {
        this.issuedBy = value;
    }

    /**
     * Gets the value of the inType property.
     * 
     * @return
     *     possible object is
     *     {@link INTypeEnumType }
     *     
     */
    public INTypeEnumType getINType() {
        return this.inType;
    }

    /**
     * Sets the value of the inType property.
     * 
     * @param value
     *     allowed object is
     *     {@link INTypeEnumType }
     *     
     */
    public void setINType(final INTypeEnumType value) {
        this.inType = value;
    }

}
