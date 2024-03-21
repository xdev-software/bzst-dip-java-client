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
 * The GVS element reflects the Government Verification Service (GVS) due diligence procedures and is composed of the Name GVS, Jurisdiction GVS, Reference GVS and Other TIN GVS elements, which contain the information items subject to reporting (and exchange) in respect of a Reportable Seller that has been identified on the basis of a Government Verification Service, as well as the Financial Identifier element.
 * 			[EU Specific] At the time of publication, the collection and exchange of GVS information is not a legal requirement under [EU DIR2021/514].
 * 
 * <p>Java class for GVSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GVSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NameGVS" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type"/&gt;
 *         &lt;element name="JurisdictionGVS"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{urn:oecd:ties:isodpitypes:v1}CountryCode_Type"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReferenceGVS" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type"/&gt;
 *         &lt;element name="OtherTINGVS" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type" minOccurs="0"/&gt;
 *         &lt;element name="FinancialIdentifier" type="{urn:oecd:ties:dpi:v1}FinancialIdentifier_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GVSType", namespace = "urn:oecd:ties:dpi:v1", propOrder = {
    "nameGVS",
    "jurisdictionGVS",
    "referenceGVS",
    "otherTINGVS",
    "financialIdentifier"
})
public class GVSType {

    @XmlElement(name = "NameGVS", namespace = "urn:oecd:ties:dpi:v1", required = true)
    protected String nameGVS;
    @XmlElement(name = "JurisdictionGVS", namespace = "urn:oecd:ties:dpi:v1", required = true)
    protected CountryCodeType jurisdictionGVS;
    @XmlElement(name = "ReferenceGVS", namespace = "urn:oecd:ties:dpi:v1", required = true)
    protected String referenceGVS;
    @XmlElement(name = "OtherTINGVS", namespace = "urn:oecd:ties:dpi:v1")
    protected String otherTINGVS;
    @XmlElement(name = "FinancialIdentifier", namespace = "urn:oecd:ties:dpi:v1")
    protected FinancialIdentifierType financialIdentifier;

    /**
     * Gets the value of the nameGVS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameGVS() {
        return this.nameGVS;
    }

    /**
     * Sets the value of the nameGVS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameGVS(final String value) {
        this.nameGVS = value;
    }

    /**
     * Gets the value of the jurisdictionGVS property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getJurisdictionGVS() {
        return this.jurisdictionGVS;
    }

    /**
     * Sets the value of the jurisdictionGVS property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setJurisdictionGVS(final CountryCodeType value) {
        this.jurisdictionGVS = value;
    }

    /**
     * Gets the value of the referenceGVS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceGVS() {
        return this.referenceGVS;
    }

    /**
     * Sets the value of the referenceGVS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceGVS(final String value) {
        this.referenceGVS = value;
    }

    /**
     * Gets the value of the otherTINGVS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTINGVS() {
        return this.otherTINGVS;
    }

    /**
     * Sets the value of the otherTINGVS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTINGVS(final String value) {
        this.otherTINGVS = value;
    }

    /**
     * Gets the value of the financialIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialIdentifierType }
     *     
     */
    public FinancialIdentifierType getFinancialIdentifier() {
        return this.financialIdentifier;
    }

    /**
     * Sets the value of the financialIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialIdentifierType }
     *     
     */
    public void setFinancialIdentifier(final FinancialIdentifierType value) {
        this.financialIdentifier = value;
    }

}
