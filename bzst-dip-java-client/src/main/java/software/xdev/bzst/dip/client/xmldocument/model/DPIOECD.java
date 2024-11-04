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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element name="MessageSpec" type="{urn:oecd:ties:dpi:v1}MessageSpec_Type"/&gt;
 *         &lt;element name="DPIBody" type="{urn:oecd:ties:dpi:v1}DPIBody_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" type="{urn:oecd:ties:dpistf:v1}StringMin1Max10_Type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
	"messageSpec",
	"dpiBody"
})
@XmlRootElement(name = "DPI_OECD", namespace = "urn:oecd:ties:dpi:v1")
public class DPIOECD
{
	
	@XmlElement(name = "MessageSpec", namespace = "urn:oecd:ties:dpi:v1", required = true)
	protected MessageSpecType messageSpec;
	@XmlElement(name = "DPIBody", namespace = "urn:oecd:ties:dpi:v1")
	protected List<DPIBodyType> dpiBody;
	@XmlAttribute(name = "version")
	protected String version;
	
	/**
	 * Gets the value of the messageSpec property.
	 *
	 * @return possible object is {@link MessageSpecType }
	 */
	public MessageSpecType getMessageSpec()
	{
		return this.messageSpec;
	}
	
	/**
	 * Sets the value of the messageSpec property.
	 *
	 * @param value allowed object is {@link MessageSpecType }
	 */
	public void setMessageSpec(final MessageSpecType value)
	{
		this.messageSpec = value;
	}
	
	/**
	 * Gets the value of the dpiBody property.
	 *
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
	 * make to
	 * the returned list will be present inside the Jakarta XML Binding object. This is why there is not a
	 * <CODE>set</CODE> method for the dpiBody property.
	 *
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getDPIBody().add(newItem);
	 * </pre>
	 *
	 *
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link DPIBodyType }
	 */
	public List<DPIBodyType> getDPIBody()
	{
		if(this.dpiBody == null)
		{
			this.dpiBody = new ArrayList<>();
		}
		return this.dpiBody;
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
