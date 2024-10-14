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

// CPD-OFF - Will be refactored in #14
/**
 * <p>Java class for OtherActivities_Type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="OtherActivities_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Consideration" type="{urn:oecd:ties:dpi:v1}ConsiderationType"/&gt;
 *         &lt;element name="NumberOfActivities" type="{urn:oecd:ties:dpi:v1}NumberOfActivities_Type"/&gt;
 *         &lt;element name="Fees" type="{urn:oecd:ties:dpi:v1}FeesType"/&gt;
 *         &lt;element name="Taxes" type="{urn:oecd:ties:dpi:v1}TaxesType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherActivities_Type", namespace = "urn:oecd:ties:dpi:v1", propOrder = {
	"consideration",
	"numberOfActivities",
	"fees",
	"taxes"
})
public class OtherActivitiesType
{
	
	@XmlElement(name = "Consideration", namespace = "urn:oecd:ties:dpi:v1", required = true)
	protected ConsiderationType consideration;
	@XmlElement(name = "NumberOfActivities", namespace = "urn:oecd:ties:dpi:v1", required = true)
	protected NumberOfActivitiesType numberOfActivities;
	@XmlElement(name = "Fees", namespace = "urn:oecd:ties:dpi:v1", required = true)
	protected FeesType fees;
	@XmlElement(name = "Taxes", namespace = "urn:oecd:ties:dpi:v1", required = true)
	protected TaxesType taxes;
	
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
}
