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

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * CESOP payment data message root element.
 * 					
 * 
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MessageSpec" type="{urn:ec.europa.eu:taxud:fiscalis:cesop:v1}MessageSpec_Type"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="PaymentDataBody" type="{urn:ec.europa.eu:taxud:fiscalis:cesop:v1}PaymentDataBody_Type" minOccurs="0"/&gt;
 *           &lt;element name="ValidationResult" type="{urn:ec.europa.eu:taxud:fiscalis:cesop:v1}ValidationResult_Type" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" fixed="4.02" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "messageSpec",
    "paymentDataBody",
    "validationResult"
})
@XmlRootElement(name = "CESOP", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1")
public class CESOP {

    @XmlElement(name = "MessageSpec", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1", required = true)
    protected MessageSpecType messageSpec;
    @XmlElement(name = "PaymentDataBody", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1")
    protected PaymentDataBodyType paymentDataBody;
    @XmlElement(name = "ValidationResult", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1")
    protected ValidationResultType validationResult;
    @XmlAttribute(name = "version", required = true)
    protected BigDecimal version;

    /**
     * Ruft den Wert der messageSpec-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MessageSpecType }
     *     
     */
    public MessageSpecType getMessageSpec() {
        return messageSpec;
    }

    /**
     * Legt den Wert der messageSpec-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageSpecType }
     *     
     */
    public void setMessageSpec(MessageSpecType value) {
        this.messageSpec = value;
    }

    /**
     * Ruft den Wert der paymentDataBody-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDataBodyType }
     *     
     */
    public PaymentDataBodyType getPaymentDataBody() {
        return paymentDataBody;
    }

    /**
     * Legt den Wert der paymentDataBody-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDataBodyType }
     *     
     */
    public void setPaymentDataBody(PaymentDataBodyType value) {
        this.paymentDataBody = value;
    }

    /**
     * Ruft den Wert der validationResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValidationResultType }
     *     
     */
    public ValidationResultType getValidationResult() {
        return validationResult;
    }

    /**
     * Legt den Wert der validationResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationResultType }
     *     
     */
    public void setValidationResult(ValidationResultType value) {
        this.validationResult = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVersion() {
        if (version == null) {
            return new BigDecimal("4.02");
        } else {
            return version;
        }
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVersion(BigDecimal value) {
        this.version = value;
    }

}
