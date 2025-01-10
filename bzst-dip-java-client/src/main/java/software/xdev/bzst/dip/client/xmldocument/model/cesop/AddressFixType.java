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
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 			Structure of the address broken down into logical parts.
 * 			
 * 
 * <p>Java-Klasse für AddressFix_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AddressFix_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Street" type="{urn:eu:taxud:commontypes:v1}StringMin1Max200_Type" minOccurs="0"/&gt;
 *         &lt;element name="BuildingIdentifier" type="{urn:eu:taxud:commontypes:v1}StringMin1Max200_Type" minOccurs="0"/&gt;
 *         &lt;element name="SuiteIdentifier" type="{urn:eu:taxud:commontypes:v1}StringMin1Max200_Type" minOccurs="0"/&gt;
 *         &lt;element name="FloorIdentifier" type="{urn:eu:taxud:commontypes:v1}StringMin1Max200_Type" minOccurs="0"/&gt;
 *         &lt;element name="DistrictName" type="{urn:eu:taxud:commontypes:v1}StringMin1Max200_Type" minOccurs="0"/&gt;
 *         &lt;element name="POB" type="{urn:eu:taxud:commontypes:v1}StringMin1Max200_Type" minOccurs="0"/&gt;
 *         &lt;element name="PostCode" type="{urn:eu:taxud:commontypes:v1}StringMin1Max200_Type" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{urn:eu:taxud:commontypes:v1}StringMin1Max200_Type" minOccurs="0"/&gt;
 *         &lt;element name="CountrySubentity" type="{urn:eu:taxud:commontypes:v1}StringMin1Max200_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressFix_Type", namespace = "urn:eu:taxud:commontypes:v1", propOrder = {
    "street",
    "buildingIdentifier",
    "suiteIdentifier",
    "floorIdentifier",
    "districtName",
    "pob",
    "postCode",
    "city",
    "countrySubentity"
})
public class AddressFixType {

    @XmlElement(name = "Street", namespace = "urn:eu:taxud:commontypes:v1")
    protected String street;
    @XmlElement(name = "BuildingIdentifier", namespace = "urn:eu:taxud:commontypes:v1")
    protected String buildingIdentifier;
    @XmlElement(name = "SuiteIdentifier", namespace = "urn:eu:taxud:commontypes:v1")
    protected String suiteIdentifier;
    @XmlElement(name = "FloorIdentifier", namespace = "urn:eu:taxud:commontypes:v1")
    protected String floorIdentifier;
    @XmlElement(name = "DistrictName", namespace = "urn:eu:taxud:commontypes:v1")
    protected String districtName;
    @XmlElement(name = "POB", namespace = "urn:eu:taxud:commontypes:v1")
    protected String pob;
    @XmlElement(name = "PostCode", namespace = "urn:eu:taxud:commontypes:v1")
    protected String postCode;
    @XmlElement(name = "City", namespace = "urn:eu:taxud:commontypes:v1")
    protected String city;
    @XmlElement(name = "CountrySubentity", namespace = "urn:eu:taxud:commontypes:v1")
    protected String countrySubentity;

    /**
     * Ruft den Wert der street-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Legt den Wert der street-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Ruft den Wert der buildingIdentifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingIdentifier() {
        return buildingIdentifier;
    }

    /**
     * Legt den Wert der buildingIdentifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingIdentifier(String value) {
        this.buildingIdentifier = value;
    }

    /**
     * Ruft den Wert der suiteIdentifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuiteIdentifier() {
        return suiteIdentifier;
    }

    /**
     * Legt den Wert der suiteIdentifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuiteIdentifier(String value) {
        this.suiteIdentifier = value;
    }

    /**
     * Ruft den Wert der floorIdentifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloorIdentifier() {
        return floorIdentifier;
    }

    /**
     * Legt den Wert der floorIdentifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloorIdentifier(String value) {
        this.floorIdentifier = value;
    }

    /**
     * Ruft den Wert der districtName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictName() {
        return districtName;
    }

    /**
     * Legt den Wert der districtName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictName(String value) {
        this.districtName = value;
    }

    /**
     * Ruft den Wert der pob-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOB() {
        return pob;
    }

    /**
     * Legt den Wert der pob-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOB(String value) {
        this.pob = value;
    }

    /**
     * Ruft den Wert der postCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Legt den Wert der postCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

    /**
     * Ruft den Wert der city-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Legt den Wert der city-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Ruft den Wert der countrySubentity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountrySubentity() {
        return countrySubentity;
    }

    /**
     * Legt den Wert der countrySubentity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountrySubentity(String value) {
        this.countrySubentity = value;
    }

}
