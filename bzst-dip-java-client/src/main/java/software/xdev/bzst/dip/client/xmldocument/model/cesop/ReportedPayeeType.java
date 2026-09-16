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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ReportedPayee_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ReportedPayee_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{urn:eu:taxud:commontypes:v1}Name_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Country" type="{urn:eu:taxud:isotypes:v1}CountryCode_Type"/&gt;
 *         &lt;element name="Address" type="{urn:eu:taxud:commontypes:v1}Address_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="EmailAddress" type="{urn:eu:taxud:commontypes:v1}Email_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WebPage" type="{urn:eu:taxud:commontypes:v1}WebPage_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TAXIdentification" type="{urn:ec.europa.eu:taxud:fiscalis:cesop:v1}TAXIdentifier_Type"/&gt;
 *         &lt;element name="AccountIdentifier" type="{urn:ec.europa.eu:taxud:fiscalis:cesop:v1}AccountIdentifier_Type"/&gt;
 *         &lt;element name="ReportedTransaction" type="{urn:ec.europa.eu:taxud:fiscalis:cesop:v1}ReportedTransaction_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Representative" type="{urn:ec.europa.eu:taxud:fiscalis:cesop:v1}Representative_Type" minOccurs="0"/&gt;
 *         &lt;element name="DocSpec" type="{urn:eu:taxud:commontypes:v1}DocSpec_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportedPayee_Type", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1", propOrder = {
    "name",
    "country",
    "address",
    "emailAddress",
    "webPage",
    "taxIdentification",
    "accountIdentifier",
    "reportedTransaction",
    "representative",
    "docSpec"
})
public class ReportedPayeeType {

    @XmlElement(name = "Name", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1", required = true)
    protected List<NameType> name;
    @XmlElement(name = "Country", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1", required = true)
    @XmlSchemaType(name = "string")
    protected CountryCodeType country;
    @XmlElement(name = "Address", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1", required = true, nillable = true)
    protected List<AddressType> address;
    @XmlElement(name = "EmailAddress", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1")
    protected List<String> emailAddress;
    @XmlElement(name = "WebPage", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1")
    protected List<String> webPage;
    @XmlElement(name = "TAXIdentification", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1", required = true, nillable = true)
    protected TAXIdentifierType taxIdentification;
    @XmlElement(name = "AccountIdentifier", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1", required = true, nillable = true)
    protected AccountIdentifierType accountIdentifier;
    @XmlElement(name = "ReportedTransaction", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1")
    protected List<ReportedTransactionType> reportedTransaction;
    @XmlElement(name = "Representative", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1")
    protected RepresentativeType representative;
    @XmlElement(name = "DocSpec", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1", required = true)
    protected DocSpecType docSpec;

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getName() {
        if (name == null) {
            name = new ArrayList<NameType>();
        }
        return this.name;
    }

    /**
     * Ruft den Wert der country-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getCountry() {
        return country;
    }

    /**
     * Legt den Wert der country-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setCountry(CountryCodeType value) {
        this.country = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressType }
     * 
     * 
     */
    public List<AddressType> getAddress() {
        if (address == null) {
            address = new ArrayList<AddressType>();
        }
        return this.address;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the emailAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEmailAddress() {
        if (emailAddress == null) {
            emailAddress = new ArrayList<String>();
        }
        return this.emailAddress;
    }

    /**
     * Gets the value of the webPage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the webPage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWebPage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWebPage() {
        if (webPage == null) {
            webPage = new ArrayList<String>();
        }
        return this.webPage;
    }

    /**
     * Ruft den Wert der taxIdentification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TAXIdentifierType }
     *     
     */
    public TAXIdentifierType getTAXIdentification() {
        return taxIdentification;
    }

    /**
     * Legt den Wert der taxIdentification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TAXIdentifierType }
     *     
     */
    public void setTAXIdentification(TAXIdentifierType value) {
        this.taxIdentification = value;
    }

    /**
     * Ruft den Wert der accountIdentifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentifierType }
     *     
     */
    public AccountIdentifierType getAccountIdentifier() {
        return accountIdentifier;
    }

    /**
     * Legt den Wert der accountIdentifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentifierType }
     *     
     */
    public void setAccountIdentifier(AccountIdentifierType value) {
        this.accountIdentifier = value;
    }

    /**
     * Gets the value of the reportedTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the reportedTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportedTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportedTransactionType }
     * 
     * 
     */
    public List<ReportedTransactionType> getReportedTransaction() {
        if (reportedTransaction == null) {
            reportedTransaction = new ArrayList<ReportedTransactionType>();
        }
        return this.reportedTransaction;
    }

    /**
     * Ruft den Wert der representative-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RepresentativeType }
     *     
     */
    public RepresentativeType getRepresentative() {
        return representative;
    }

    /**
     * Legt den Wert der representative-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RepresentativeType }
     *     
     */
    public void setRepresentative(RepresentativeType value) {
        this.representative = value;
    }

    /**
     * Ruft den Wert der docSpec-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DocSpecType }
     *     
     */
    public DocSpecType getDocSpec() {
        return docSpec;
    }

    /**
     * Legt den Wert der docSpec-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DocSpecType }
     *     
     */
    public void setDocSpec(DocSpecType value) {
        this.docSpec = value;
    }

}
