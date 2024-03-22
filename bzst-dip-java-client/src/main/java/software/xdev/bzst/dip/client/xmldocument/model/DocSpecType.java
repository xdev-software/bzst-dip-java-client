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
 * Document specification: Data identifying and describing the document, where 'document' here means the part of a
 * message that is to transmit the data about a single block of DPI information.
 *
 * <p>Java class for DocSpec_Type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DocSpec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocTypeIndic" type="{urn:oecd:ties:dpistf:v1}OECDDocTypeIndic_EnumType"/&gt;
 *         &lt;element name="DocRefId" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type"/&gt;
 *         &lt;element name="CorrMessageRefId" type="{urn:oecd:ties:dpistf:v1}StringMin1Max170_Type" minOccurs="0"/&gt;
 *         &lt;element name="CorrDocRefId" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocSpec_Type", namespace = "urn:oecd:ties:dpistf:v1", propOrder = {
	"docTypeIndic",
	"docRefId",
	"corrMessageRefId",
	"corrDocRefId"
})
public class DocSpecType
{
	
	@XmlElement(name = "DocTypeIndic", namespace = "urn:oecd:ties:dpistf:v1", required = true)
	@XmlSchemaType(name = "string")
	protected OECDDocTypeIndicEnumType docTypeIndic;
	@XmlElement(name = "DocRefId", namespace = "urn:oecd:ties:dpistf:v1", required = true)
	protected String docRefId;
	@XmlElement(name = "CorrMessageRefId", namespace = "urn:oecd:ties:dpistf:v1")
	protected String corrMessageRefId;
	@XmlElement(name = "CorrDocRefId", namespace = "urn:oecd:ties:dpistf:v1")
	protected String corrDocRefId;
	
	/**
	 * Gets the value of the docTypeIndic property.
	 *
	 * @return possible object is {@link OECDDocTypeIndicEnumType }
	 */
	public OECDDocTypeIndicEnumType getDocTypeIndic()
	{
		return this.docTypeIndic;
	}
	
	/**
	 * Sets the value of the docTypeIndic property.
	 *
	 * @param value allowed object is {@link OECDDocTypeIndicEnumType }
	 */
	public void setDocTypeIndic(final OECDDocTypeIndicEnumType value)
	{
		this.docTypeIndic = value;
	}
	
	/**
	 * Gets the value of the docRefId property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getDocRefId()
	{
		return this.docRefId;
	}
	
	/**
	 * Sets the value of the docRefId property.
	 *
	 * @param value allowed object is {@link String }
	 */
	public void setDocRefId(final String value)
	{
		this.docRefId = value;
	}
	
	/**
	 * Gets the value of the corrMessageRefId property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getCorrMessageRefId()
	{
		return this.corrMessageRefId;
	}
	
	/**
	 * Sets the value of the corrMessageRefId property.
	 *
	 * @param value allowed object is {@link String }
	 */
	public void setCorrMessageRefId(final String value)
	{
		this.corrMessageRefId = value;
	}
	
	/**
	 * Gets the value of the corrDocRefId property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getCorrDocRefId()
	{
		return this.corrDocRefId;
	}
	
	/**
	 * Sets the value of the corrDocRefId property.
	 *
	 * @param value allowed object is {@link String }
	 */
	public void setCorrDocRefId(final String value)
	{
		this.corrDocRefId = value;
	}
}
