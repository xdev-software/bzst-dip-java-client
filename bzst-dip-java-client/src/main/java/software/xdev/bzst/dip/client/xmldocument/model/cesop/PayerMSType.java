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
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java-Klasse für PayerMS_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PayerMS_Type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:eu:taxud:isotypes:v1&gt;MSCountryCode_Type"&gt;
 *       &lt;attribute name="PayerMSSource" use="required" type="{urn:eu:taxud:commontypes:v1}AccountIdentifierType_Type" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayerMS_Type", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1", propOrder = {
    "value"
})
public class PayerMSType {

    @XmlValue
    protected MSCountryCodeType value;
    @XmlAttribute(name = "PayerMSSource", required = true)
    protected AccountIdentifierTypeType payerMSSource;

    /**
     * List of the MS code.
     * 			
     * 
     * @return
     *     possible object is
     *     {@link MSCountryCodeType }
     *     
     */
    public MSCountryCodeType getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MSCountryCodeType }
     *     
     */
    public void setValue(MSCountryCodeType value) {
        this.value = value;
    }

    /**
     * Ruft den Wert der payerMSSource-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentifierTypeType }
     *     
     */
    public AccountIdentifierTypeType getPayerMSSource() {
        return payerMSSource;
    }

    /**
     * Legt den Wert der payerMSSource-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentifierTypeType }
     *     
     */
    public void setPayerMSSource(AccountIdentifierTypeType value) {
        this.payerMSSource = value;
    }

}
