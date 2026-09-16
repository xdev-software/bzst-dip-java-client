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

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ReportedTransaction_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ReportedTransaction_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransactionIdentifier" type="{urn:eu:taxud:commontypes:v1}StringMin1Max40_Type"/&gt;
 *         &lt;element name="CorrTransactionIdentifier" type="{urn:eu:taxud:commontypes:v1}StringMin1Max40_Type" minOccurs="0"/&gt;
 *         &lt;element name="DateTime" type="{urn:eu:taxud:commontypes:v1}TransactionDate_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Amount" type="{urn:eu:taxud:commontypes:v1}Amount_Type"/&gt;
 *         &lt;element name="PaymentMethod" type="{urn:eu:taxud:commontypes:v1}PaymentMethod_Type" minOccurs="0"/&gt;
 *         &lt;element name="InitiatedAtPhysicalPremisesOfMerchant" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PayerMS" type="{urn:ec.europa.eu:taxud:fiscalis:cesop:v1}PayerMS_Type"/&gt;
 *         &lt;element name="PSPRole" type="{urn:eu:taxud:commontypes:v1}PSPRole_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="IsRefund" type="{urn:eu:taxud:commontypes:v1}Refund_Type" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportedTransaction_Type", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1", propOrder = {
    "transactionIdentifier",
    "corrTransactionIdentifier",
    "dateTime",
    "amount",
    "paymentMethod",
    "initiatedAtPhysicalPremisesOfMerchant",
    "payerMS",
    "pspRole"
})
public class ReportedTransactionType {

    @XmlElement(name = "TransactionIdentifier", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1", required = true)
    protected String transactionIdentifier;
    @XmlElement(name = "CorrTransactionIdentifier", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1")
    protected String corrTransactionIdentifier;
    @XmlElement(name = "DateTime", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1", required = true)
    protected List<TransactionDateType> dateTime;
    @XmlElement(name = "Amount", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1", required = true)
    protected AmountType amount;
    @XmlElement(name = "PaymentMethod", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1")
    protected PaymentMethodType paymentMethod;
    @XmlElement(name = "InitiatedAtPhysicalPremisesOfMerchant", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1")
    protected boolean initiatedAtPhysicalPremisesOfMerchant;
    @XmlElement(name = "PayerMS", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1", required = true)
    protected PayerMSType payerMS;
    @XmlElement(name = "PSPRole", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1")
    protected PSPRoleType pspRole;
    @XmlAttribute(name = "IsRefund")
    protected Boolean isRefund;

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
     * Ruft den Wert der corrTransactionIdentifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrTransactionIdentifier() {
        return corrTransactionIdentifier;
    }

    /**
     * Legt den Wert der corrTransactionIdentifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrTransactionIdentifier(String value) {
        this.corrTransactionIdentifier = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionDateType }
     * 
     * 
     */
    public List<TransactionDateType> getDateTime() {
        if (dateTime == null) {
            dateTime = new ArrayList<TransactionDateType>();
        }
        return this.dateTime;
    }

    /**
     * Ruft den Wert der amount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmount() {
        return amount;
    }

    /**
     * Legt den Wert der amount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmount(AmountType value) {
        this.amount = value;
    }

    /**
     * Ruft den Wert der paymentMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodType }
     *     
     */
    public PaymentMethodType getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Legt den Wert der paymentMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodType }
     *     
     */
    public void setPaymentMethod(PaymentMethodType value) {
        this.paymentMethod = value;
    }

    /**
     * Ruft den Wert der initiatedAtPhysicalPremisesOfMerchant-Eigenschaft ab.
     * 
     */
    public boolean isInitiatedAtPhysicalPremisesOfMerchant() {
        return initiatedAtPhysicalPremisesOfMerchant;
    }

    /**
     * Legt den Wert der initiatedAtPhysicalPremisesOfMerchant-Eigenschaft fest.
     * 
     */
    public void setInitiatedAtPhysicalPremisesOfMerchant(boolean value) {
        this.initiatedAtPhysicalPremisesOfMerchant = value;
    }

    /**
     * Ruft den Wert der payerMS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PayerMSType }
     *     
     */
    public PayerMSType getPayerMS() {
        return payerMS;
    }

    /**
     * Legt den Wert der payerMS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PayerMSType }
     *     
     */
    public void setPayerMS(PayerMSType value) {
        this.payerMS = value;
    }

    /**
     * Ruft den Wert der pspRole-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PSPRoleType }
     *     
     */
    public PSPRoleType getPSPRole() {
        return pspRole;
    }

    /**
     * Legt den Wert der pspRole-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PSPRoleType }
     *     
     */
    public void setPSPRole(PSPRoleType value) {
        this.pspRole = value;
    }

    /**
     * Ruft den Wert der isRefund-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsRefund() {
        if (isRefund == null) {
            return false;
        } else {
            return isRefund;
        }
    }

    /**
     * Legt den Wert der isRefund-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRefund(Boolean value) {
        this.isRefund = value;
    }

}
