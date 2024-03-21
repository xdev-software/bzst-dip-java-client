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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * This element provides information about the place of birth. This element must be filled in at least with the city and the country of birth (either the current jurisdiction identified by 2-characters country code or a former jurisdiction identified by a name).
 * 
 * <p>Java class for BirthPlace_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BirthPlace_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="City" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type"/&gt;
 *         &lt;element name="CitySubentity" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type" minOccurs="0"/&gt;
 *         &lt;element name="CountryInfo"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="CountryCode" type="{urn:oecd:ties:isodpitypes:v1}CountryCode_Type"/&gt;
 *                   &lt;element name="FormerCountryName" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type"/&gt;
 *                 &lt;/choice&gt;
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
@XmlType(name = "BirthPlace_Type", namespace = "urn:oecd:ties:dpi:v1", propOrder = {
    "city",
    "citySubentity",
    "countryInfo"
})
public class BirthPlaceType {

    @XmlElement(name = "City", namespace = "urn:oecd:ties:dpi:v1", required = true)
    protected String city;
    @XmlElement(name = "CitySubentity", namespace = "urn:oecd:ties:dpi:v1")
    protected String citySubentity;
    @XmlElement(name = "CountryInfo", namespace = "urn:oecd:ties:dpi:v1", required = true)
    protected BirthPlaceType.CountryInfo countryInfo;

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(final String value) {
        this.city = value;
    }

    /**
     * Gets the value of the citySubentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitySubentity() {
        return this.citySubentity;
    }

    /**
     * Sets the value of the citySubentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitySubentity(final String value) {
        this.citySubentity = value;
    }

    /**
     * Gets the value of the countryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BirthPlaceType.CountryInfo }
     *     
     */
    public BirthPlaceType.CountryInfo getCountryInfo() {
        return this.countryInfo;
    }

    /**
     * Sets the value of the countryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BirthPlaceType.CountryInfo }
     *     
     */
    public void setCountryInfo(final BirthPlaceType.CountryInfo value) {
        this.countryInfo = value;
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
     *       &lt;choice&gt;
     *         &lt;element name="CountryCode" type="{urn:oecd:ties:isodpitypes:v1}CountryCode_Type"/&gt;
     *         &lt;element name="FormerCountryName" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "countryCode",
        "formerCountryName"
    })
    public static class CountryInfo {

        @XmlElement(name = "CountryCode", namespace = "urn:oecd:ties:dpi:v1")
        @XmlSchemaType(name = "string")
        protected CountryCodeType countryCode;
        @XmlElement(name = "FormerCountryName", namespace = "urn:oecd:ties:dpi:v1")
        protected String formerCountryName;

        /**
         * Gets the value of the countryCode property.
         * 
         * @return
         *     possible object is
         *     {@link CountryCodeType }
         *     
         */
        public CountryCodeType getCountryCode() {
            return this.countryCode;
        }

        /**
         * Sets the value of the countryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link CountryCodeType }
         *     
         */
        public void setCountryCode(final CountryCodeType value) {
            this.countryCode = value;
        }

        /**
         * Gets the value of the formerCountryName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFormerCountryName() {
            return this.formerCountryName;
        }

        /**
         * Sets the value of the formerCountryName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFormerCountryName(final String value) {
            this.formerCountryName = value;
        }

    }

}
