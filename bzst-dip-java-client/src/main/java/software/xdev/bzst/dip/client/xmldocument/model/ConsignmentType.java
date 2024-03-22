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

import javax.xml.datatype.XMLGregorianCalendar;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsignmentType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsignmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerIdentifier" type="{http://itzbund.de/ozg/bzst/post/dip/v1/}CustomerIdentifierType"/&gt;
 *         &lt;element name="creationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="transferticketId" type="{http://itzbund.de/ozg/bzst/post/dip/v1/}customTicketIdNumberType"/&gt;
 *         &lt;element name="referenceId" type="{http://itzbund.de/ozg/bzst/post/dip/v1/}customTicketIdNumberType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsignmentType", namespace = "http://itzbund.de/ozg/bzst/post/dip/v1/", propOrder = {
	"customerIdentifier",
	"creationTime",
	"transferticketId",
	"referenceId"
})
public class ConsignmentType
{
	
	@XmlElement(namespace = "http://itzbund.de/ozg/bzst/post/dip/v1/", required = true)
	protected CustomerIdentifierType customerIdentifier;
	@XmlElement(namespace = "http://itzbund.de/ozg/bzst/post/dip/v1/", required = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar creationTime;
	@XmlElement(namespace = "http://itzbund.de/ozg/bzst/post/dip/v1/", required = true)
	protected String transferticketId;
	@XmlElement(namespace = "http://itzbund.de/ozg/bzst/post/dip/v1/")
	protected String referenceId;
	
	/**
	 * Gets the value of the customerIdentifier property.
	 *
	 * @return possible object is {@link CustomerIdentifierType }
	 */
	public CustomerIdentifierType getCustomerIdentifier()
	{
		return this.customerIdentifier;
	}
	
	/**
	 * Sets the value of the customerIdentifier property.
	 *
	 * @param value allowed object is {@link CustomerIdentifierType }
	 */
	public void setCustomerIdentifier(final CustomerIdentifierType value)
	{
		this.customerIdentifier = value;
	}
	
	/**
	 * Gets the value of the creationTime property.
	 *
	 * @return possible object is {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getCreationTime()
	{
		return this.creationTime;
	}
	
	/**
	 * Sets the value of the creationTime property.
	 *
	 * @param value allowed object is {@link XMLGregorianCalendar }
	 */
	public void setCreationTime(final XMLGregorianCalendar value)
	{
		this.creationTime = value;
	}
	
	/**
	 * Gets the value of the transferticketId property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getTransferticketId()
	{
		return this.transferticketId;
	}
	
	/**
	 * Sets the value of the transferticketId property.
	 *
	 * @param value allowed object is {@link String }
	 */
	public void setTransferticketId(final String value)
	{
		this.transferticketId = value;
	}
	
	/**
	 * Gets the value of the referenceId property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getReferenceId()
	{
		return this.referenceId;
	}
	
	/**
	 * Sets the value of the referenceId property.
	 *
	 * @param value allowed object is {@link String }
	 */
	public void setReferenceId(final String value)
	{
		this.referenceId = value;
	}
}
