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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DipType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DipType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="header" type="{http://itzbund.de/ozg/bzst/post/dip/v1/}DipHeaderType"/&gt;
 *         &lt;element name="body" type="{http://itzbund.de/ozg/bzst/post/dip/v1/}DipBodyType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DipType", propOrder = {
	"header",
	"body"
})
@XmlRootElement(name = "dip")
public class DipType
{
	
	@XmlElement(namespace = "http://itzbund.de/ozg/bzst/post/dip/v1/", required = true)
	protected DipHeaderType header;
	@XmlElement(namespace = "http://itzbund.de/ozg/bzst/post/dip/v1/", required = true)
	protected DipBodyType body;
	@XmlAttribute(name = "version", required = true)
	protected String version;
	
	/**
	 * Gets the value of the header property.
	 *
	 * @return possible object is {@link DipHeaderType }
	 */
	public DipHeaderType getHeader()
	{
		return this.header;
	}
	
	/**
	 * Sets the value of the header property.
	 *
	 * @param value allowed object is {@link DipHeaderType }
	 */
	public void setHeader(final DipHeaderType value)
	{
		this.header = value;
	}
	
	/**
	 * Gets the value of the body property.
	 *
	 * @return possible object is {@link DipBodyType }
	 */
	public DipBodyType getBody()
	{
		return this.body;
	}
	
	/**
	 * Sets the value of the body property.
	 *
	 * @param value allowed object is {@link DipBodyType }
	 */
	public void setBody(final DipBodyType value)
	{
		this.body = value;
	}
	
	/**
	 * Gets the value of the version property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getVersion()
	{
		return this.version;
	}
	
	/**
	 * Sets the value of the version property.
	 *
	 * @param value allowed object is {@link String }
	 */
	public void setVersion(final String value)
	{
		this.version = value;
	}
}
