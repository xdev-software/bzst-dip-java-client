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
//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2025.10.29 um 12:56:51 PM CET 
//

package software.xdev.bzst.dip.client.xmldocument.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DipProtocolType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="DipProtocolType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consignment" type="{http://itzbund.de/ozg/bzst/post/dip/v2/}ConsignmentType" minOccurs="0"/&gt;
 *         &lt;element name="processStatus" type="{http://itzbund.de/ozg/bzst/post/dip/v2/}processStatusType"/&gt;
 *         &lt;element name="dipResult" type="{http://itzbund.de/ozg/bzst/post/dip/v2/}DipResultType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="payloadResult" type="{http://itzbund.de/ozg/bzst/post/dip/v2/}PayloadResultType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DipProtocolType", propOrder = {
	"consignment",
	"processStatus",
	"dipResult",
	"payloadResult"
})
public class DipProtocolType
{
	
	protected ConsignmentType consignment;
	@XmlElement(required = true)
	@XmlSchemaType(name = "string")
	protected ProcessStatusType processStatus;
	protected List<DipResultType> dipResult;
	protected List<PayloadResultType> payloadResult;
	
	/**
	 * Ruft den Wert der consignment-Eigenschaft ab.
	 *
	 * @return possible object is {@link ConsignmentType }
	 *
	 */
	public ConsignmentType getConsignment()
	{
		return this.consignment;
	}
	
	/**
	 * Legt den Wert der consignment-Eigenschaft fest.
	 *
	 * @param value allowed object is {@link ConsignmentType }
	 *
	 */
	public void setConsignment(final ConsignmentType value)
	{
		this.consignment = value;
	}
	
	/**
	 * Ruft den Wert der processStatus-Eigenschaft ab.
	 *
	 * @return possible object is {@link ProcessStatusType }
	 *
	 */
	public ProcessStatusType getProcessStatus()
	{
		return this.processStatus;
	}
	
	/**
	 * Legt den Wert der processStatus-Eigenschaft fest.
	 *
	 * @param value allowed object is {@link ProcessStatusType }
	 *
	 */
	public void setProcessStatus(final ProcessStatusType value)
	{
		this.processStatus = value;
	}
	
	/**
	 * Gets the value of the dipResult property.
	 *
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
	 * make to
	 * the returned list will be present inside the Jakarta XML Binding object. This is why there is not a
	 * <CODE>set</CODE> method for the dipResult property.
	 *
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getDipResult().add(newItem);
	 * </pre>
	 *
	 *
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link DipResultType }
	 *
	 *
	 */
	public List<DipResultType> getDipResult()
	{
		if(this.dipResult == null)
		{
			this.dipResult = new ArrayList<>();
		}
		return this.dipResult;
	}
	
	/**
	 * Gets the value of the payloadResult property.
	 *
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
	 * make to
	 * the returned list will be present inside the Jakarta XML Binding object. This is why there is not a
	 * <CODE>set</CODE> method for the payloadResult property.
	 *
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getPayloadResult().add(newItem);
	 * </pre>
	 *
	 *
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link PayloadResultType }
	 *
	 *
	 */
	public List<PayloadResultType> getPayloadResult()
	{
		if(this.payloadResult == null)
		{
			this.payloadResult = new ArrayList<>();
		}
		return this.payloadResult;
	}
}
