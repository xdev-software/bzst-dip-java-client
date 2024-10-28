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
 * Structure of the address for a party broken down into its logical parts, recommended for easy matching. The 'City'
 * element is the only required subelement. All of the subelements are simple text - data type 'string'.
 *
 *
 * <p>Java class for AddressFix_Type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AddressFix_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Street" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type" minOccurs="0"/&gt;
 *       &lt;element name="BuildingIdentifier" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type" minOccurs="0"/&gt;
 *         &lt;element name="SuiteIdentifier" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type" minOccurs="0"/&gt;
 *         &lt;element name="FloorIdentifier" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type" minOccurs="0"/&gt;
 *         &lt;element name="DistrictName" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type" minOccurs="0"/&gt;
 *         &lt;element name="POB" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type" minOccurs="0"/&gt;
 *         &lt;element name="PostCode" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type"/&gt;
 *         &lt;element name="CountrySubentity" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressFix_Type", namespace = "urn:oecd:ties:dpi:v1", propOrder = {
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
public class AddressFixType
{
	
	@XmlElement(name = "Street", namespace = "urn:oecd:ties:dpi:v1")
	protected String street;
	@XmlElement(name = "BuildingIdentifier", namespace = "urn:oecd:ties:dpi:v1")
	protected String buildingIdentifier;
	@XmlElement(name = "SuiteIdentifier", namespace = "urn:oecd:ties:dpi:v1")
	protected String suiteIdentifier;
	@XmlElement(name = "FloorIdentifier", namespace = "urn:oecd:ties:dpi:v1")
	protected String floorIdentifier;
	@XmlElement(name = "DistrictName", namespace = "urn:oecd:ties:dpi:v1")
	protected String districtName;
	@XmlElement(name = "POB", namespace = "urn:oecd:ties:dpi:v1")
	protected String pob;
	@XmlElement(name = "PostCode", namespace = "urn:oecd:ties:dpi:v1")
	protected String postCode;
	@XmlElement(name = "City", namespace = "urn:oecd:ties:dpi:v1", required = true)
	protected String city;
	@XmlElement(name = "CountrySubentity", namespace = "urn:oecd:ties:dpi:v1")
	protected String countrySubentity;
	
	/**
	 * Gets the value of the street property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getStreet()
	{
		return this.street;
	}
	
	/**
	 * Sets the value of the street property.
	 *
	 * @param value allowed object is {@link String }
	 */
	public void setStreet(final String value)
	{
		this.street = value;
	}
	
	/**
	 * Gets the value of the buildingIdentifier property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getBuildingIdentifier()
	{
		return this.buildingIdentifier;
	}
	
	/**
	 * Sets the value of the buildingIdentifier property.
	 *
	 * @param value allowed object is {@link String }
	 */
	public void setBuildingIdentifier(final String value)
	{
		this.buildingIdentifier = value;
	}
	
	/**
	 * Gets the value of the suiteIdentifier property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getSuiteIdentifier()
	{
		return this.suiteIdentifier;
	}
	
	/**
	 * Sets the value of the suiteIdentifier property.
	 *
	 * @param value allowed object is {@link String }
	 */
	public void setSuiteIdentifier(final String value)
	{
		this.suiteIdentifier = value;
	}
	
	/**
	 * Gets the value of the floorIdentifier property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getFloorIdentifier()
	{
		return this.floorIdentifier;
	}
	
	/**
	 * Sets the value of the floorIdentifier property.
	 *
	 * @param value allowed object is {@link String }
	 */
	public void setFloorIdentifier(final String value)
	{
		this.floorIdentifier = value;
	}
	
	/**
	 * Gets the value of the districtName property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getDistrictName()
	{
		return this.districtName;
	}
	
	/**
	 * Sets the value of the districtName property.
	 *
	 * @param value allowed object is {@link String }
	 */
	public void setDistrictName(final String value)
	{
		this.districtName = value;
	}
	
	/**
	 * Gets the value of the pob property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getPOB()
	{
		return this.pob;
	}
	
	/**
	 * Sets the value of the pob property.
	 *
	 * @param value allowed object is {@link String }
	 */
	public void setPOB(final String value)
	{
		this.pob = value;
	}
	
	/**
	 * Gets the value of the postCode property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getPostCode()
	{
		return this.postCode;
	}
	
	/**
	 * Sets the value of the postCode property.
	 *
	 * @param value allowed object is {@link String }
	 */
	public void setPostCode(final String value)
	{
		this.postCode = value;
	}
	
	/**
	 * Gets the value of the city property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getCity()
	{
		return this.city;
	}
	
	/**
	 * Sets the value of the city property.
	 *
	 * @param value allowed object is {@link String }
	 */
	public void setCity(final String value)
	{
		this.city = value;
	}
	
	/**
	 * Gets the value of the countrySubentity property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getCountrySubentity()
	{
		return this.countrySubentity;
	}
	
	/**
	 * Sets the value of the countrySubentity property.
	 *
	 * @param value allowed object is {@link String }
	 */
	public void setCountrySubentity(final String value)
	{
		this.countrySubentity = value;
	}
}
