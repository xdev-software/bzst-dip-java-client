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
 * <p>Java class for FeesType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="FeesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FeesQ1" type="{urn:oecd:ties:dpi:v1}MonAmnt_Type"/&gt;
 *         &lt;element name="FeesQ2" type="{urn:oecd:ties:dpi:v1}MonAmnt_Type"/&gt;
 *         &lt;element name="FeesQ3" type="{urn:oecd:ties:dpi:v1}MonAmnt_Type"/&gt;
 *         &lt;element name="FeesQ4" type="{urn:oecd:ties:dpi:v1}MonAmnt_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeesType", namespace = "urn:oecd:ties:dpi:v1", propOrder = {
	"feesQ1",
	"feesQ2",
	"feesQ3",
	"feesQ4"
})
public class FeesType
{
	
	@XmlElement(name = "FeesQ1", namespace = "urn:oecd:ties:dpi:v1", required = true)
	protected MonAmntType feesQ1;
	@XmlElement(name = "FeesQ2", namespace = "urn:oecd:ties:dpi:v1", required = true)
	protected MonAmntType feesQ2;
	@XmlElement(name = "FeesQ3", namespace = "urn:oecd:ties:dpi:v1", required = true)
	protected MonAmntType feesQ3;
	@XmlElement(name = "FeesQ4", namespace = "urn:oecd:ties:dpi:v1", required = true)
	protected MonAmntType feesQ4;
	
	/**
	 * Gets the value of the feesQ1 property.
	 *
	 * @return possible object is {@link MonAmntType }
	 */
	public MonAmntType getFeesQ1()
	{
		return this.feesQ1;
	}
	
	/**
	 * Sets the value of the feesQ1 property.
	 *
	 * @param value allowed object is {@link MonAmntType }
	 */
	public void setFeesQ1(final MonAmntType value)
	{
		this.feesQ1 = value;
	}
	
	/**
	 * Gets the value of the feesQ2 property.
	 *
	 * @return possible object is {@link MonAmntType }
	 */
	public MonAmntType getFeesQ2()
	{
		return this.feesQ2;
	}
	
	/**
	 * Sets the value of the feesQ2 property.
	 *
	 * @param value allowed object is {@link MonAmntType }
	 */
	public void setFeesQ2(final MonAmntType value)
	{
		this.feesQ2 = value;
	}
	
	/**
	 * Gets the value of the feesQ3 property.
	 *
	 * @return possible object is {@link MonAmntType }
	 */
	public MonAmntType getFeesQ3()
	{
		return this.feesQ3;
	}
	
	/**
	 * Sets the value of the feesQ3 property.
	 *
	 * @param value allowed object is {@link MonAmntType }
	 */
	public void setFeesQ3(final MonAmntType value)
	{
		this.feesQ3 = value;
	}
	
	/**
	 * Gets the value of the feesQ4 property.
	 *
	 * @return possible object is {@link MonAmntType }
	 */
	public MonAmntType getFeesQ4()
	{
		return this.feesQ4;
	}
	
	/**
	 * Sets the value of the feesQ4 property.
	 *
	 * @param value allowed object is {@link MonAmntType }
	 */
	public void setFeesQ4(final MonAmntType value)
	{
		this.feesQ4 = value;
	}
}
