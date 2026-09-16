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

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DipResponseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DipResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="responseTransferticketId" type="{http://itzbund.de/ozg/bzst/post/dip/v2/}customTicketIdNumberType"/&gt;
 *         &lt;element name="dipProtocol" type="{http://itzbund.de/ozg/bzst/post/dip/v2/}DipProtocolType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DipResponseType", propOrder = {
    "responseTransferticketId",
    "dipProtocol"
})
public class DipResponseType {

    @XmlElement(required = true)
    protected String responseTransferticketId;
    @XmlElement(required = true)
    protected DipProtocolType dipProtocol;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Ruft den Wert der responseTransferticketId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseTransferticketId() {
        return this.responseTransferticketId;
    }

    /**
     * Legt den Wert der responseTransferticketId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseTransferticketId(final String value) {
        this.responseTransferticketId = value;
    }

    /**
     * Ruft den Wert der dipProtocol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DipProtocolType }
     *     
     */
    public DipProtocolType getDipProtocol() {
        return this.dipProtocol;
    }

    /**
     * Legt den Wert der dipProtocol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DipProtocolType }
     *     
     */
    public void setDipProtocol(final DipProtocolType value) {
        this.dipProtocol = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(final String value) {
        this.version = value;
    }

}
