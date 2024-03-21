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
 * The Identifier field is a required element which contains the Financial Account Identifier pertaining to the Reportable Seller should be reflected. Financial Account Identifiers can include the IBAN number, sort code and account number and any other payment account identifier that the Reporting Platform Operator used for transferring the Consideration in respect to a Reportable Seller.
 * 
 * <p>Java class for Identifier_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Identifier_Type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:oecd:ties:dpistf:v1&gt;StringMin1Max200_Type"&gt;
 *       &lt;attribute name="AccountNumberType" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Identifier_Type", namespace = "urn:oecd:ties:dpi:v1", propOrder = {
    "value"
})
public class IdentifierType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "AccountNumberType")
    protected String accountNumberType;

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
     * Gets the value of the accountNumberType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumberType() {
        return this.accountNumberType;
    }

    /**
     * Sets the value of the accountNumberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumberType(final String value) {
        this.accountNumberType = value;
    }

}
