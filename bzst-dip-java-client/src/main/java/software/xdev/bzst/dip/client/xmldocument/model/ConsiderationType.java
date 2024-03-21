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
 * <p>Java class for ConsiderationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsiderationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsQ1" type="{urn:oecd:ties:dpi:v1}MonAmnt_Type"/&gt;
 *         &lt;element name="ConsQ2" type="{urn:oecd:ties:dpi:v1}MonAmnt_Type"/&gt;
 *         &lt;element name="ConsQ3" type="{urn:oecd:ties:dpi:v1}MonAmnt_Type"/&gt;
 *         &lt;element name="ConsQ4" type="{urn:oecd:ties:dpi:v1}MonAmnt_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsiderationType", namespace = "urn:oecd:ties:dpi:v1", propOrder = {
    "consQ1",
    "consQ2",
    "consQ3",
    "consQ4"
})
public class ConsiderationType {

    @XmlElement(name = "ConsQ1", namespace = "urn:oecd:ties:dpi:v1", required = true)
    protected MonAmntType consQ1;
    @XmlElement(name = "ConsQ2", namespace = "urn:oecd:ties:dpi:v1", required = true)
    protected MonAmntType consQ2;
    @XmlElement(name = "ConsQ3", namespace = "urn:oecd:ties:dpi:v1", required = true)
    protected MonAmntType consQ3;
    @XmlElement(name = "ConsQ4", namespace = "urn:oecd:ties:dpi:v1", required = true)
    protected MonAmntType consQ4;

    /**
     * Gets the value of the consQ1 property.
     * 
     * @return
     *     possible object is
     *     {@link MonAmntType }
     *     
     */
    public MonAmntType getConsQ1() {
        return this.consQ1;
    }

    /**
     * Sets the value of the consQ1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonAmntType }
     *     
     */
    public void setConsQ1(final MonAmntType value) {
        this.consQ1 = value;
    }

    /**
     * Gets the value of the consQ2 property.
     * 
     * @return
     *     possible object is
     *     {@link MonAmntType }
     *     
     */
    public MonAmntType getConsQ2() {
        return this.consQ2;
    }

    /**
     * Sets the value of the consQ2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonAmntType }
     *     
     */
    public void setConsQ2(final MonAmntType value) {
        this.consQ2 = value;
    }

    /**
     * Gets the value of the consQ3 property.
     * 
     * @return
     *     possible object is
     *     {@link MonAmntType }
     *     
     */
    public MonAmntType getConsQ3() {
        return this.consQ3;
    }

    /**
     * Sets the value of the consQ3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonAmntType }
     *     
     */
    public void setConsQ3(final MonAmntType value) {
        this.consQ3 = value;
    }

    /**
     * Gets the value of the consQ4 property.
     * 
     * @return
     *     possible object is
     *     {@link MonAmntType }
     *     
     */
    public MonAmntType getConsQ4() {
        return this.consQ4;
    }

    /**
     * Sets the value of the consQ4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonAmntType }
     *     
     */
    public void setConsQ4(final MonAmntType value) {
        this.consQ4 = value;
    }

}
