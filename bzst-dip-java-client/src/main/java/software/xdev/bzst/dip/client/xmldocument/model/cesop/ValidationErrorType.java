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

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ValidationError_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ValidationError_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorCode" type="{urn:ec.europa.eu:taxud:fiscalis:cesop:v1}ErrorCode_Type"/&gt;
 *         &lt;element name="ErrorCounter" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="ErrorShortDesc" type="{urn:eu:taxud:commontypes:v1}StringMin1Max100_Type"/&gt;
 *         &lt;element name="ErrorDescription" type="{urn:eu:taxud:commontypes:v1}StringMin1Max1000_Type"/&gt;
 *         &lt;element name="TransactionIdentifier" type="{urn:eu:taxud:commontypes:v1}StringMin1Max40_Type" minOccurs="0"/&gt;
 *         &lt;element name="DocRefId" type="{urn:eu:taxud:commontypes:v1}UUID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationError_Type", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1", propOrder = {
    "errorCode",
    "errorCounter",
    "errorShortDesc",
    "errorDescription",
    "transactionIdentifier",
    "docRefId"
})
public class ValidationErrorType {

    @XmlElement(name = "ErrorCode", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1", required = true)
    protected String errorCode;
    @XmlElement(name = "ErrorCounter", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1", required = true)
    protected BigInteger errorCounter;
    @XmlElement(name = "ErrorShortDesc", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1", required = true)
    protected String errorShortDesc;
    @XmlElement(name = "ErrorDescription", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1", required = true)
    protected String errorDescription;
    @XmlElement(name = "TransactionIdentifier", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1")
    protected String transactionIdentifier;
    @XmlElement(name = "DocRefId", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1")
    protected String docRefId;

    /**
     * Ruft den Wert der errorCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Legt den Wert der errorCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Ruft den Wert der errorCounter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getErrorCounter() {
        return errorCounter;
    }

    /**
     * Legt den Wert der errorCounter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setErrorCounter(BigInteger value) {
        this.errorCounter = value;
    }

    /**
     * Ruft den Wert der errorShortDesc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorShortDesc() {
        return errorShortDesc;
    }

    /**
     * Legt den Wert der errorShortDesc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorShortDesc(String value) {
        this.errorShortDesc = value;
    }

    /**
     * Ruft den Wert der errorDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * Legt den Wert der errorDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDescription(String value) {
        this.errorDescription = value;
    }

    /**
     * Ruft den Wert der transactionIdentifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionIdentifier() {
        return transactionIdentifier;
    }

    /**
     * Legt den Wert der transactionIdentifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionIdentifier(String value) {
        this.transactionIdentifier = value;
    }

    /**
     * Ruft den Wert der docRefId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocRefId() {
        return docRefId;
    }

    /**
     * Legt den Wert der docRefId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocRefId(String value) {
        this.docRefId = value;
    }

}
