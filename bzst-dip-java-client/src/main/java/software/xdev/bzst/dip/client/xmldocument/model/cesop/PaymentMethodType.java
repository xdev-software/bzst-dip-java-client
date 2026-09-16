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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PaymentMethod_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PaymentMethod_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaymentMethodType" type="{urn:eu:taxud:commontypes:v1}PaymentMethodType_Type"/&gt;
 *         &lt;element name="PaymentMethodOther" type="{urn:eu:taxud:commontypes:v1}StringMin1Max200_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentMethod_Type", namespace = "urn:eu:taxud:commontypes:v1", propOrder = {
    "paymentMethodType",
    "paymentMethodOther"
})
public class PaymentMethodType {

    @XmlElement(name = "PaymentMethodType", namespace = "urn:eu:taxud:commontypes:v1", required = true)
    @XmlSchemaType(name = "string")
    protected PaymentMethodTypeType paymentMethodType;
    @XmlElement(name = "PaymentMethodOther", namespace = "urn:eu:taxud:commontypes:v1")
    protected String paymentMethodOther;

    /**
     * Ruft den Wert der paymentMethodType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodTypeType }
     *     
     */
    public PaymentMethodTypeType getPaymentMethodType() {
        return paymentMethodType;
    }

    /**
     * Legt den Wert der paymentMethodType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodTypeType }
     *     
     */
    public void setPaymentMethodType(PaymentMethodTypeType value) {
        this.paymentMethodType = value;
    }

    /**
     * Ruft den Wert der paymentMethodOther-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethodOther() {
        return paymentMethodOther;
    }

    /**
     * Legt den Wert der paymentMethodOther-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethodOther(String value) {
        this.paymentMethodOther = value;
    }

}
