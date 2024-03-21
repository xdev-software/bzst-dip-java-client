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

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 			This container brings together all data about an organisation as a party. Name and address are required components and each can be present more than once to enable as complete a description as possible. Whenever possible one or more identifiers (TIN etc) should be added as well as a residence country code. Additional data that describes and identifies the party can bgiven . The code for the legal type according to the OECD codelist must be added. The structures of all of the subelements are defined elsewhere in this schema.
 * 
 * <p>Java class for OrganisationParty_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganisationParty_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResCountryCode" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{urn:oecd:ties:isodpitypes:v1}CountryCode_Type"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TIN" type="{urn:oecd:ties:dpi:v1}TIN_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="IN" type="{urn:oecd:ties:dpi:v1}OrganisationIN_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="VAT" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{urn:oecd:ties:dpi:v1}NameOrganisation_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="PlatformBusinessName" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{urn:oecd:ties:dpi:v1}Address_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Nexus" type="{urn:oecd:ties:dpi:v1}Nexus_EnumType" minOccurs="0"/&gt;
 *         &lt;element name="AssumedReporting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationParty_Type", namespace = "urn:oecd:ties:dpi:v1", propOrder = {
    "resCountryCode",
    "tin",
    "in",
    "vat",
    "name",
    "platformBusinessName",
    "address",
    "nexus",
    "assumedReporting"
})
@XmlSeeAlso({
    CorrectablePlatformOperatorType.class
})
public class OrganisationPartyType {

    @XmlElement(name = "ResCountryCode", namespace = "urn:oecd:ties:dpi:v1")
    protected List<CountryCodeType> resCountryCode;
    @XmlElement(name = "TIN", namespace = "urn:oecd:ties:dpi:v1", required = true)
    protected List<TINType> tin;
    @XmlElement(name = "IN", namespace = "urn:oecd:ties:dpi:v1")
    protected List<OrganisationINType> in;
    @XmlElement(name = "VAT", namespace = "urn:oecd:ties:dpi:v1")
    protected String vat;
    @XmlElement(name = "Name", namespace = "urn:oecd:ties:dpi:v1", required = true)
    protected List<NameOrganisationType> name;
    @XmlElement(name = "PlatformBusinessName", namespace = "urn:oecd:ties:dpi:v1")
    protected List<String> platformBusinessName;
    @XmlElement(name = "Address", namespace = "urn:oecd:ties:dpi:v1", required = true)
    protected List<AddressType> address;
    @XmlElement(name = "Nexus", namespace = "urn:oecd:ties:dpi:v1")
    @XmlSchemaType(name = "string")
    protected NexusEnumType nexus;
    @XmlElement(name = "AssumedReporting", namespace = "urn:oecd:ties:dpi:v1")
    protected Boolean assumedReporting;

    /**
     * Gets the value of the resCountryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the resCountryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResCountryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryCodeType }
     * 
     * 
     */
    public List<CountryCodeType> getResCountryCode() {
        if (this.resCountryCode == null) {
			this.resCountryCode = new ArrayList<>();
        }
        return this.resCountryCode;
    }

    /**
     * Gets the value of the tin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTIN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TINType }
     * 
     * 
     */
    public List<TINType> getTIN() {
        if (this.tin == null) {
			this.tin = new ArrayList<>();
        }
        return this.tin;
    }

    /**
     * Gets the value of the in property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the in property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationINType }
     * 
     * 
     */
    public List<OrganisationINType> getIN() {
        if (this.in == null) {
			this.in = new ArrayList<>();
        }
        return this.in;
    }

    /**
     * Gets the value of the vat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAT() {
        return this.vat;
    }

    /**
     * Sets the value of the vat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAT(final String value) {
        this.vat = value;
    }

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
     * {@link NameOrganisationType }
     * 
     * 
     */
    public List<NameOrganisationType> getName() {
        if (this.name == null) {
			this.name = new ArrayList<>();
        }
        return this.name;
    }

    /**
     * Gets the value of the platformBusinessName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the platformBusinessName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlatformBusinessName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPlatformBusinessName() {
        if (this.platformBusinessName == null) {
			this.platformBusinessName = new ArrayList<>();
        }
        return this.platformBusinessName;
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
        if (this.address == null) {
			this.address = new ArrayList<>();
        }
        return this.address;
    }

    /**
     * Gets the value of the nexus property.
     * 
     * @return
     *     possible object is
     *     {@link NexusEnumType }
     *     
     */
    public NexusEnumType getNexus() {
        return this.nexus;
    }

    /**
     * Sets the value of the nexus property.
     * 
     * @param value
     *     allowed object is
     *     {@link NexusEnumType }
     *     
     */
    public void setNexus(final NexusEnumType value) {
        this.nexus = value;
    }

    /**
     * Gets the value of the assumedReporting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssumedReporting() {
        return this.assumedReporting;
    }

    /**
     * Sets the value of the assumedReporting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssumedReporting(final Boolean value) {
        this.assumedReporting = value;
    }

}
