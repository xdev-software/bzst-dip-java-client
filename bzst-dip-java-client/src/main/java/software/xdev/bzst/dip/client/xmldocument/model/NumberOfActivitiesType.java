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
import jakarta.xml.bind.annotation.XmlType;


/**
 * The Number of Services element is further split into four elements, representing the quarters in respect of which
 * reporting takes place.
 *
 * <p>Java class for NumberOfActivities_Type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="NumberOfActivities_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumbQ1" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="NumbQ2" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="NumbQ3" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="NumbQ4" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberOfActivities_Type", namespace = "urn:oecd:ties:dpi:v1", propOrder = {
	"numbQ1",
	"numbQ2",
	"numbQ3",
	"numbQ4"
})
public class NumberOfActivitiesType
{
	
	@XmlElement(name = "NumbQ1", namespace = "urn:oecd:ties:dpi:v1", required = true)
	protected BigInteger numbQ1;
	@XmlElement(name = "NumbQ2", namespace = "urn:oecd:ties:dpi:v1", required = true)
	protected BigInteger numbQ2;
	@XmlElement(name = "NumbQ3", namespace = "urn:oecd:ties:dpi:v1", required = true)
	protected BigInteger numbQ3;
	@XmlElement(name = "NumbQ4", namespace = "urn:oecd:ties:dpi:v1", required = true)
	protected BigInteger numbQ4;
	
	/**
	 * Gets the value of the numbQ1 property.
	 *
	 * @return possible object is {@link BigInteger }
	 */
	public BigInteger getNumbQ1()
	{
		return this.numbQ1;
	}
	
	/**
	 * Sets the value of the numbQ1 property.
	 *
	 * @param value allowed object is {@link BigInteger }
	 */
	public void setNumbQ1(final BigInteger value)
	{
		this.numbQ1 = value;
	}
	
	/**
	 * Gets the value of the numbQ2 property.
	 *
	 * @return possible object is {@link BigInteger }
	 */
	public BigInteger getNumbQ2()
	{
		return this.numbQ2;
	}
	
	/**
	 * Sets the value of the numbQ2 property.
	 *
	 * @param value allowed object is {@link BigInteger }
	 */
	public void setNumbQ2(final BigInteger value)
	{
		this.numbQ2 = value;
	}
	
	/**
	 * Gets the value of the numbQ3 property.
	 *
	 * @return possible object is {@link BigInteger }
	 */
	public BigInteger getNumbQ3()
	{
		return this.numbQ3;
	}
	
	/**
	 * Sets the value of the numbQ3 property.
	 *
	 * @param value allowed object is {@link BigInteger }
	 */
	public void setNumbQ3(final BigInteger value)
	{
		this.numbQ3 = value;
	}
	
	/**
	 * Gets the value of the numbQ4 property.
	 *
	 * @return possible object is {@link BigInteger }
	 */
	public BigInteger getNumbQ4()
	{
		return this.numbQ4;
	}
	
	/**
	 * Sets the value of the numbQ4 property.
	 *
	 * @param value allowed object is {@link BigInteger }
	 */
	public void setNumbQ4(final BigInteger value)
	{
		this.numbQ4 = value;
	}
}
