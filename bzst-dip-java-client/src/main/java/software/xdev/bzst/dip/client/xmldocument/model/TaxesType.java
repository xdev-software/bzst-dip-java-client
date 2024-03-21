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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The Taxes element is further split into four elements, representing the quarters in respect of which reporting takes place.
 * 			Each quarter element is further comprised of the MonAmnt_Type, used to communicate taxes withheld in respect of Sellers. Such amounts shall be given in full units, i.e. without decimals. The code for the currency, in which the value is expressed has to be taken from the ISO code list 4217 and added in attribute currCode.
 * 
 * <p>Java class for TaxesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxQ1" type="{urn:oecd:ties:dpi:v1}MonAmnt_Type"/&gt;
 *         &lt;element name="TaxQ2" type="{urn:oecd:ties:dpi:v1}MonAmnt_Type"/&gt;
 *         &lt;element name="TaxQ3" type="{urn:oecd:ties:dpi:v1}MonAmnt_Type"/&gt;
 *         &lt;element name="TaxQ4" type="{urn:oecd:ties:dpi:v1}MonAmnt_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxesType", namespace = "urn:oecd:ties:dpi:v1", propOrder = {
    "taxQ1",
    "taxQ2",
    "taxQ3",
    "taxQ4"
})
public class TaxesType {

    @XmlElement(name = "TaxQ1", namespace = "urn:oecd:ties:dpi:v1", required = true)
    protected MonAmntType taxQ1;
    @XmlElement(name = "TaxQ2", namespace = "urn:oecd:ties:dpi:v1", required = true)
    protected MonAmntType taxQ2;
    @XmlElement(name = "TaxQ3", namespace = "urn:oecd:ties:dpi:v1", required = true)
    protected MonAmntType taxQ3;
    @XmlElement(name = "TaxQ4", namespace = "urn:oecd:ties:dpi:v1", required = true)
    protected MonAmntType taxQ4;

    /**
     * Gets the value of the taxQ1 property.
     * 
     * @return
     *     possible object is
     *     {@link MonAmntType }
     *     
     */
    public MonAmntType getTaxQ1() {
        return this.taxQ1;
    }

    /**
     * Sets the value of the taxQ1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonAmntType }
     *     
     */
    public void setTaxQ1(final MonAmntType value) {
        this.taxQ1 = value;
    }

    /**
     * Gets the value of the taxQ2 property.
     * 
     * @return
     *     possible object is
     *     {@link MonAmntType }
     *     
     */
    public MonAmntType getTaxQ2() {
        return this.taxQ2;
    }

    /**
     * Sets the value of the taxQ2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonAmntType }
     *     
     */
    public void setTaxQ2(final MonAmntType value) {
        this.taxQ2 = value;
    }

    /**
     * Gets the value of the taxQ3 property.
     * 
     * @return
     *     possible object is
     *     {@link MonAmntType }
     *     
     */
    public MonAmntType getTaxQ3() {
        return this.taxQ3;
    }

    /**
     * Sets the value of the taxQ3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonAmntType }
     *     
     */
    public void setTaxQ3(final MonAmntType value) {
        this.taxQ3 = value;
    }

    /**
     * Gets the value of the taxQ4 property.
     * 
     * @return
     *     possible object is
     *     {@link MonAmntType }
     *     
     */
    public MonAmntType getTaxQ4() {
        return this.taxQ4;
    }

    /**
     * Sets the value of the taxQ4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonAmntType }
     *     
     */
    public void setTaxQ4(final MonAmntType value) {
        this.taxQ4 = value;
    }

}
