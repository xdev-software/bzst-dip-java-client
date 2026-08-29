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

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;

import org.w3c.dom.Element;


/**
 * <p>Java-Klasse für PayloadResultType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PayloadResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="consignmentItemPosition" use="required" type="{http://itzbund.de/ozg/bzst/post/dip/v2/}consignmentItemPositionType" /&gt;
 *       &lt;attribute name="schemaVersion" type="{http://itzbund.de/ozg/bzst/post/dip/v2/}schemaVersionType" /&gt;
 *       &lt;anyAttribute processContents='skip'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayloadResultType", propOrder = {
	"any"
})
public class PayloadResultType
{
	
	@XmlAnyElement
	protected List<Element> any;
	@XmlAttribute(name = "consignmentItemPosition", required = true)
	protected BigInteger consignmentItemPosition;
	@XmlAttribute(name = "schemaVersion")
	protected String schemaVersion;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<>();
	
	/**
	 * Gets the value of the any property.
	 *
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
	 * make to
	 * the returned list will be present inside the Jakarta XML Binding object. This is why there is not a
	 * <CODE>set</CODE> method for the any property.
	 *
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getAny().add(newItem);
	 * </pre>
	 *
	 *
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Element }
	 *
	 *
	 */
	public List<Element> getAny()
	{
		if(this.any == null)
		{
			this.any = new ArrayList<>();
		}
		return this.any;
	}
	
	/**
	 * Ruft den Wert der consignmentItemPosition-Eigenschaft ab.
	 *
	 * @return possible object is {@link BigInteger }
	 *
	 */
	public BigInteger getConsignmentItemPosition()
	{
		return this.consignmentItemPosition;
	}
	
	/**
	 * Legt den Wert der consignmentItemPosition-Eigenschaft fest.
	 *
	 * @param value allowed object is {@link BigInteger }
	 *
	 */
	public void setConsignmentItemPosition(final BigInteger value)
	{
		this.consignmentItemPosition = value;
	}
	
	/**
	 * Ruft den Wert der schemaVersion-Eigenschaft ab.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getSchemaVersion()
	{
		return this.schemaVersion;
	}
	
	/**
	 * Legt den Wert der schemaVersion-Eigenschaft fest.
	 *
	 * @param value allowed object is {@link String }
	 *
	 */
	public void setSchemaVersion(final String value)
	{
		this.schemaVersion = value;
	}
	
	/**
	 * Gets a map that contains attributes that aren't bound to any typed property on this class.
	 *
	 * <p>
	 * the map is keyed by the name of the attribute and the value is the string value of the attribute.
	 * <p>
	 * the map returned by this method is live, and you can add new attribute by updating the map directly. Because of
	 * this design, there's no setter.
	 *
	 * @return always non-null
	 */
	public Map<QName, String> getOtherAttributes()
	{
		return this.otherAttributes;
	}
}
