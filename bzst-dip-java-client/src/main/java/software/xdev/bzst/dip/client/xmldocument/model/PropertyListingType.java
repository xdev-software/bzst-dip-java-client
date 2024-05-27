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

import java.math.BigInteger;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropertyListingType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PropertyListingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Address" type="{urn:oecd:ties:dpi:v1}Address_Type"/&gt;
 *         &lt;element name="LandRegistrationNumber" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type" minOccurs="0"/&gt;
 *         &lt;element name="Consideration" type="{urn:oecd:ties:dpi:v1}ConsiderationType"/&gt;
 *         &lt;element name="NumberOfActivities" type="{urn:oecd:ties:dpi:v1}NumberOfActivities_Type"/&gt;
 *         &lt;element name="Fees" type="{urn:oecd:ties:dpi:v1}FeesType"/&gt;
 *         &lt;element name="Taxes" type="{urn:oecd:ties:dpi:v1}TaxesType"/&gt;
 *         &lt;element name="PropertyType" type="{urn:oecd:ties:dpi:v1}DPIPropertyType_EnumType" minOccurs="0"/&gt;
 *         &lt;element name="OtherPropertyType" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type" minOccurs="0"/&gt;
 *         &lt;element name="RentedDays" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;totalDigits value="4"/&gt;
 *               &lt;minInclusive value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyListingType", namespace = "urn:oecd:ties:dpi:v1", propOrder = {
	"address",
	"landRegistrationNumber",
	"consideration",
	"numberOfActivities",
	"fees",
	"taxes",
	"propertyType",
	"otherPropertyType",
	"rentedDays"
})
public class PropertyListingType
{
	
	@XmlElement(name = "Address", namespace = "urn:oecd:ties:dpi:v1", required = true)
	protected AddressType address;
	@XmlElement(name = "LandRegistrationNumber", namespace = "urn:oecd:ties:dpi:v1")
	protected String landRegistrationNumber;
	@XmlElement(name = "Consideration", namespace = "urn:oecd:ties:dpi:v1", required = true)
	protected ConsiderationType consideration;
	@XmlElement(name = "NumberOfActivities", namespace = "urn:oecd:ties:dpi:v1", required = true)
	protected NumberOfActivitiesType numberOfActivities;
	@XmlElement(name = "Fees", namespace = "urn:oecd:ties:dpi:v1", required = true)
	protected FeesType fees;
	@XmlElement(name = "Taxes", namespace = "urn:oecd:ties:dpi:v1", required = true)
	protected TaxesType taxes;
	@XmlElement(name = "PropertyType", namespace = "urn:oecd:ties:dpi:v1")
	@XmlSchemaType(name = "string")
	protected DPIPropertyTypeEnumType propertyType;
	@XmlElement(name = "OtherPropertyType", namespace = "urn:oecd:ties:dpi:v1")
	protected String otherPropertyType;
	@XmlElement(name = "RentedDays", namespace = "urn:oecd:ties:dpi:v1")
	protected BigInteger rentedDays;
	
	/**
	 * Gets the value of the address property.
	 *
	 * @return possible object is {@link AddressType }
	 */
	public AddressType getAddress()
	{
		return this.address;
	}
	
	/**
	 * Sets the value of the address property.
	 *
	 * @param value allowed object is {@link AddressType }
	 */
	public void setAddress(final AddressType value)
	{
		this.address = value;
	}
	
	/**
	 * Gets the value of the landRegistrationNumber property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getLandRegistrationNumber()
	{
		return this.landRegistrationNumber;
	}
	
	/**
	 * Sets the value of the landRegistrationNumber property.
	 *
	 * @param value allowed object is {@link String }
	 */
	public void setLandRegistrationNumber(final String value)
	{
		this.landRegistrationNumber = value;
	}
	
	/**
	 * Gets the value of the consideration property.
	 *
	 * @return possible object is {@link ConsiderationType }
	 */
	public ConsiderationType getConsideration()
	{
		return this.consideration;
	}
	
	/**
	 * Sets the value of the consideration property.
	 *
	 * @param value allowed object is {@link ConsiderationType }
	 */
	public void setConsideration(final ConsiderationType value)
	{
		this.consideration = value;
	}
	
	/**
	 * Gets the value of the numberOfActivities property.
	 *
	 * @return possible object is {@link NumberOfActivitiesType }
	 */
	public NumberOfActivitiesType getNumberOfActivities()
	{
		return this.numberOfActivities;
	}
	
	/**
	 * Sets the value of the numberOfActivities property.
	 *
	 * @param value allowed object is {@link NumberOfActivitiesType }
	 */
	public void setNumberOfActivities(final NumberOfActivitiesType value)
	{
		this.numberOfActivities = value;
	}
	
	/**
	 * Gets the value of the fees property.
	 *
	 * @return possible object is {@link FeesType }
	 */
	public FeesType getFees()
	{
		return this.fees;
	}
	
	/**
	 * Sets the value of the fees property.
	 *
	 * @param value allowed object is {@link FeesType }
	 */
	public void setFees(final FeesType value)
	{
		this.fees = value;
	}
	
	/**
	 * Gets the value of the taxes property.
	 *
	 * @return possible object is {@link TaxesType }
	 */
	public TaxesType getTaxes()
	{
		return this.taxes;
	}
	
	/**
	 * Sets the value of the taxes property.
	 *
	 * @param value allowed object is {@link TaxesType }
	 */
	public void setTaxes(final TaxesType value)
	{
		this.taxes = value;
	}
	
	/**
	 * Gets the value of the propertyType property.
	 *
	 * @return possible object is {@link DPIPropertyTypeEnumType }
	 */
	public DPIPropertyTypeEnumType getPropertyType()
	{
		return this.propertyType;
	}
	
	/**
	 * Sets the value of the propertyType property.
	 *
	 * @param value allowed object is {@link DPIPropertyTypeEnumType }
	 */
	public void setPropertyType(final DPIPropertyTypeEnumType value)
	{
		this.propertyType = value;
	}
	
	/**
	 * Gets the value of the otherPropertyType property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getOtherPropertyType()
	{
		return this.otherPropertyType;
	}
	
	/**
	 * Sets the value of the otherPropertyType property.
	 *
	 * @param value allowed object is {@link String }
	 */
	public void setOtherPropertyType(final String value)
	{
		this.otherPropertyType = value;
	}
	
	/**
	 * Gets the value of the rentedDays property.
	 *
	 * @return possible object is {@link BigInteger }
	 */
	public BigInteger getRentedDays()
	{
		return this.rentedDays;
	}
	
	/**
	 * Sets the value of the rentedDays property.
	 *
	 * @param value allowed object is {@link BigInteger }
	 */
	public void setRentedDays(final BigInteger value)
	{
		this.rentedDays = value;
	}
}
