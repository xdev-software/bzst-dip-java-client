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
 * Information in the message header identifies the Tax Administration that is sending the message.  It specifies when
 * the message was created, what period (normally a year) the report is for, and the nature of the report (original,
 * corrected, supplemental, etc).
 *
 * <p>Java class for MessageSpec_Type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MessageSpec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SendingEntityIN" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type" minOccurs="0"/&gt;
 *         &lt;element name="TransmittingCountry" type="{urn:oecd:ties:isodpitypes:v1}CountryCode_Type"/&gt;
 *         &lt;element name="ReceivingCountry" type="{urn:oecd:ties:isodpitypes:v1}CountryCode_Type"/&gt;
 *         &lt;element name="MessageType" type="{urn:oecd:ties:dpi:v1}MessageType_EnumType"/&gt;
 *         &lt;element name="Warning" type="{urn:oecd:ties:dpistf:v1}StringMin1Max4000_Type" minOccurs="0"/&gt;
 *         &lt;element name="Contact" type="{urn:oecd:ties:dpistf:v1}StringMin1Max4000_Type" minOccurs="0"/&gt;
 *         &lt;element name="MessageRefId" type="{urn:oecd:ties:dpistf:v1}StringMin1Max170_Type"/&gt;
 *         &lt;element name="MessageTypeIndic" type="{urn:oecd:ties:dpi:v1}DPIMessageTypeIndic_EnumType"/&gt;
 *         &lt;element name="ReportingPeriod" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageSpec_Type", namespace = "urn:oecd:ties:dpi:v1", propOrder = {
	"sendingEntityIN",
	"transmittingCountry",
	"receivingCountry",
	"messageType",
	"warning",
	"contact",
	"messageRefId",
	"messageTypeIndic",
	"reportingPeriod",
	"timestamp"
})
public class MessageSpecType
{
	
	@XmlElement(name = "SendingEntityIN", namespace = "urn:oecd:ties:dpi:v1")
	protected String sendingEntityIN;
	@XmlElement(name = "TransmittingCountry", namespace = "urn:oecd:ties:dpi:v1", required = true)
	@XmlSchemaType(name = "string")
	protected CountryCodeType transmittingCountry;
	@XmlElement(name = "ReceivingCountry", namespace = "urn:oecd:ties:dpi:v1", required = true)
	@XmlSchemaType(name = "string")
	protected CountryCodeType receivingCountry;
	@XmlElement(name = "MessageType", namespace = "urn:oecd:ties:dpi:v1", required = true)
	@XmlSchemaType(name = "string")
	protected MessageTypeEnumType messageType;
	@XmlElement(name = "Warning", namespace = "urn:oecd:ties:dpi:v1")
	protected String warning;
	@XmlElement(name = "Contact", namespace = "urn:oecd:ties:dpi:v1")
	protected String contact;
	@XmlElement(name = "MessageRefId", namespace = "urn:oecd:ties:dpi:v1", required = true)
	protected String messageRefId;
	@XmlElement(name = "message.type", namespace = "urn:oecd:ties:dpi:v1", required = true)
	@XmlSchemaType(name = "string")
	protected DPIMessageTypeIndicEnumType messageTypeIndic;
	@XmlElement(name = "reporting.period", namespace = "urn:oecd:ties:dpi:v1", required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar reportingPeriod;
	@XmlElement(name = "Timestamp", namespace = "urn:oecd:ties:dpi:v1", required = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar timestamp;
	
	/**
	 * Gets the value of the sendingEntityIN property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getSendingEntityIN()
	{
		return this.sendingEntityIN;
	}
	
	/**
	 * Sets the value of the sendingEntityIN property.
	 *
	 * @param value allowed object is {@link String }
	 */
	public void setSendingEntityIN(final String value)
	{
		this.sendingEntityIN = value;
	}
	
	/**
	 * Gets the value of the transmittingCountry property.
	 *
	 * @return possible object is {@link CountryCodeType }
	 */
	public CountryCodeType getTransmittingCountry()
	{
		return this.transmittingCountry;
	}
	
	/**
	 * Sets the value of the transmittingCountry property.
	 *
	 * @param value allowed object is {@link CountryCodeType }
	 */
	public void setTransmittingCountry(final CountryCodeType value)
	{
		this.transmittingCountry = value;
	}
	
	/**
	 * Gets the value of the receivingCountry property.
	 *
	 * @return possible object is {@link CountryCodeType }
	 */
	public CountryCodeType getReceivingCountry()
	{
		return this.receivingCountry;
	}
	
	/**
	 * Sets the value of the receivingCountry property.
	 *
	 * @param value allowed object is {@link CountryCodeType }
	 */
	public void setReceivingCountry(final CountryCodeType value)
	{
		this.receivingCountry = value;
	}
	
	/**
	 * Gets the value of the messageType property.
	 *
	 * @return possible object is {@link MessageTypeEnumType }
	 */
	public MessageTypeEnumType getMessageType()
	{
		return this.messageType;
	}
	
	/**
	 * Sets the value of the messageType property.
	 *
	 * @param value allowed object is {@link MessageTypeEnumType }
	 */
	public void setMessageType(final MessageTypeEnumType value)
	{
		this.messageType = value;
	}
	
	/**
	 * Gets the value of the warning property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getWarning()
	{
		return this.warning;
	}
	
	/**
	 * Sets the value of the warning property.
	 *
	 * @param value allowed object is {@link String }
	 */
	public void setWarning(final String value)
	{
		this.warning = value;
	}
	
	/**
	 * Gets the value of the contact property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getContact()
	{
		return this.contact;
	}
	
	/**
	 * Sets the value of the contact property.
	 *
	 * @param value allowed object is {@link String }
	 */
	public void setContact(final String value)
	{
		this.contact = value;
	}
	
	/**
	 * Gets the value of the messageRefId property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getMessageRefId()
	{
		return this.messageRefId;
	}
	
	/**
	 * Sets the value of the messageRefId property.
	 *
	 * @param value allowed object is {@link String }
	 */
	public void setMessageRefId(final String value)
	{
		this.messageRefId = value;
	}
	
	/**
	 * Gets the value of the messageTypeIndic property.
	 *
	 * @return possible object is {@link DPIMessageTypeIndicEnumType }
	 */
	public DPIMessageTypeIndicEnumType getMessageTypeIndic()
	{
		return this.messageTypeIndic;
	}
	
	/**
	 * Sets the value of the messageTypeIndic property.
	 *
	 * @param value allowed object is {@link DPIMessageTypeIndicEnumType }
	 */
	public void setMessageTypeIndic(final DPIMessageTypeIndicEnumType value)
	{
		this.messageTypeIndic = value;
	}
	
	/**
	 * Gets the value of the reportingPeriod property.
	 *
	 * @return possible object is {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getReportingPeriod()
	{
		return this.reportingPeriod;
	}
	
	/**
	 * Sets the value of the reportingPeriod property.
	 *
	 * @param value allowed object is {@link XMLGregorianCalendar }
	 */
	public void setReportingPeriod(final XMLGregorianCalendar value)
	{
		this.reportingPeriod = value;
	}
	
	/**
	 * Gets the value of the timestamp property.
	 *
	 * @return possible object is {@link XMLGregorianCalendar }
	 */
	public XMLGregorianCalendar getTimestamp()
	{
		return this.timestamp;
	}
	
	/**
	 * Sets the value of the timestamp property.
	 *
	 * @param value allowed object is {@link XMLGregorianCalendar }
	 */
	public void setTimestamp(final XMLGregorianCalendar value)
	{
		this.timestamp = value;
	}
}
