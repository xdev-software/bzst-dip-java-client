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

import javax.xml.datatype.XMLGregorianCalendar;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * This container brings together all data about a person as a party. Name and address are required components and each can be present more than once to enable as complete a description as possible. Whenever possible one or more identifiers (TIN etc) should be added as well as a residence country code. Additional data that describes and identifies the party can be given. The code for the legal type according to the OECD codelist must be added. The structures of all of the subelements are defined elsewhere in this schema.
 * 
 * <p>Java class for PersonParty_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonParty_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResCountryCode" type="{urn:oecd:ties:isodpitypes:v1}CountryCode_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="TIN" type="{urn:oecd:ties:dpi:v1}TIN_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="VAT" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{urn:oecd:ties:dpi:v1}NamePerson_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Address" type="{urn:oecd:ties:dpi:v1}Address_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Nationality" type="{urn:oecd:ties:isodpitypes:v1}CountryCode_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BirthInfo"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                   &lt;element name="BirthPlace" type="{urn:oecd:ties:dpi:v1}BirthPlace_Type" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonParty_Type", namespace = "urn:oecd:ties:dpi:v1", propOrder = {
    "resCountryCode",
    "tin",
    "vat",
    "name",
    "address",
    "nationality",
    "birthInfo"
})
public class PersonPartyType {

    @XmlElement(name = "ResCountryCode", namespace = "urn:oecd:ties:dpi:v1", required = true)
    @XmlSchemaType(name = "string")
    protected List<CountryCodeType> resCountryCode;
    @XmlElement(name = "TIN", namespace = "urn:oecd:ties:dpi:v1", required = true)
    protected List<TINType> tin;
    @XmlElement(name = "VAT", namespace = "urn:oecd:ties:dpi:v1")
    protected String vat;
    @XmlElement(name = "Name", namespace = "urn:oecd:ties:dpi:v1", required = true)
    protected List<NamePersonType> name;
    @XmlElement(name = "Address", namespace = "urn:oecd:ties:dpi:v1", required = true)
    protected List<AddressType> address;
    @XmlElement(name = "Nationality", namespace = "urn:oecd:ties:dpi:v1")
    @XmlSchemaType(name = "string")
    protected List<CountryCodeType> nationality;
    @XmlElement(name = "BirthInfo", namespace = "urn:oecd:ties:dpi:v1", required = true)
    protected PersonPartyType.BirthInfo birthInfo;

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
     * {@link NamePersonType }
     * 
     * 
     */
    public List<NamePersonType> getName() {
        if (this.name == null) {
			this.name = new ArrayList<>();
        }
        return this.name;
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
     * Gets the value of the nationality property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the nationality property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNationality().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryCodeType }
     * 
     * 
     */
    public List<CountryCodeType> getNationality() {
        if (this.nationality == null) {
			this.nationality = new ArrayList<>();
        }
        return this.nationality;
    }

    /**
     * Gets the value of the birthInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PersonPartyType.BirthInfo }
     *     
     */
    public PersonPartyType.BirthInfo getBirthInfo() {
        return this.birthInfo;
    }

    /**
     * Sets the value of the birthInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonPartyType.BirthInfo }
     *     
     */
    public void setBirthInfo(final PersonPartyType.BirthInfo value) {
        this.birthInfo = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *         &lt;element name="BirthPlace" type="{urn:oecd:ties:dpi:v1}BirthPlace_Type" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "birthDate",
        "birthPlace"
    })
    public static class BirthInfo {

        @XmlElement(name = "BirthDate", namespace = "urn:oecd:ties:dpi:v1", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar birthDate;
        @XmlElement(name = "BirthPlace", namespace = "urn:oecd:ties:dpi:v1")
        protected BirthPlaceType birthPlace;

        /**
         * Gets the value of the birthDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBirthDate() {
            return this.birthDate;
        }

        /**
         * Sets the value of the birthDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setBirthDate(final XMLGregorianCalendar value) {
            this.birthDate = value;
        }

        /**
         * Gets the value of the birthPlace property.
         * 
         * @return
         *     possible object is
         *     {@link BirthPlaceType }
         *     
         */
        public BirthPlaceType getBirthPlace() {
            return this.birthPlace;
        }

        /**
         * Sets the value of the birthPlace property.
         * 
         * @param value
         *     allowed object is
         *     {@link BirthPlaceType }
         *     
         */
        public void setBirthPlace(final BirthPlaceType value) {
            this.birthPlace = value;
        }

    }

}
