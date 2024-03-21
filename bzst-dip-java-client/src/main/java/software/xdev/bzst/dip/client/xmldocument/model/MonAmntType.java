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

import java.math.BigInteger;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * This data type is to be used whenever monetary amounts are to be communicated. Such amounts shall be given in full units, i.e. without decimals.  The code for the currency in which the value is expressed has to be taken from the ISO codelist 4217 and added in attribute currCode.
 * 
 * 
 * <p>Java class for MonAmnt_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonAmnt_Type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;integer"&gt;
 *       &lt;attribute name="currCode" use="required" type="{urn:oecd:ties:isodpitypes:v1}currCode_Type" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonAmnt_Type", namespace = "urn:oecd:ties:dpi:v1", propOrder = {
    "value"
})
public class MonAmntType {

    @XmlValue
    protected BigInteger value;
    @XmlAttribute(name = "currCode", required = true)
    protected CurrCodeType currCode;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValue() {
        return this.value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setValue(final BigInteger value) {
        this.value = value;
    }

    /**
     * Gets the value of the currCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrCodeType }
     *     
     */
    public CurrCodeType getCurrCode() {
        return this.currCode;
    }

    /**
     * Sets the value of the currCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrCodeType }
     *     
     */
    public void setCurrCode(final CurrCodeType value) {
        this.currCode = value;
    }

}
