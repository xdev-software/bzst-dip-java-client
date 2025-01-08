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

package software.xdev.bzst.dip.client.xmldocument.model.cesop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The DocSpec type defines data to make it possible to correct records in the message.
 * 
 * <p>Java-Klasse für DocSpec_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DocSpec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocTypeIndic" type="{urn:eu:taxud:commontypes:v1}DocTypeIndic_EnumType"/&gt;
 *         &lt;element name="DocRefId" type="{urn:eu:taxud:commontypes:v1}UUID"/&gt;
 *         &lt;element name="CorrMessageRefId" type="{urn:eu:taxud:commontypes:v1}UUID" minOccurs="0"/&gt;
 *         &lt;element name="CorrDocRefId" type="{urn:eu:taxud:commontypes:v1}UUID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocSpec_Type", namespace = "urn:eu:taxud:commontypes:v1", propOrder = {
    "docTypeIndic",
    "docRefId",
    "corrMessageRefId",
    "corrDocRefId"
})
public class DocSpecType {

    @XmlElement(name = "DocTypeIndic", namespace = "urn:eu:taxud:commontypes:v1", required = true)
    @XmlSchemaType(name = "string")
    protected DocTypeIndicEnumType docTypeIndic;
    @XmlElement(name = "DocRefId", namespace = "urn:eu:taxud:commontypes:v1", required = true)
    protected String docRefId;
    @XmlElement(name = "CorrMessageRefId", namespace = "urn:eu:taxud:commontypes:v1")
    protected String corrMessageRefId;
    @XmlElement(name = "CorrDocRefId", namespace = "urn:eu:taxud:commontypes:v1")
    protected String corrDocRefId;

    /**
     * Ruft den Wert der docTypeIndic-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DocTypeIndicEnumType }
     *     
     */
    public DocTypeIndicEnumType getDocTypeIndic() {
        return docTypeIndic;
    }

    /**
     * Legt den Wert der docTypeIndic-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DocTypeIndicEnumType }
     *     
     */
    public void setDocTypeIndic(DocTypeIndicEnumType value) {
        this.docTypeIndic = value;
    }

    /**
     * Ruft den Wert der docRefId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocRefId() {
        return docRefId;
    }

    /**
     * Legt den Wert der docRefId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocRefId(String value) {
        this.docRefId = value;
    }

    /**
     * Ruft den Wert der corrMessageRefId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrMessageRefId() {
        return corrMessageRefId;
    }

    /**
     * Legt den Wert der corrMessageRefId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrMessageRefId(String value) {
        this.corrMessageRefId = value;
    }

    /**
     * Ruft den Wert der corrDocRefId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrDocRefId() {
        return corrDocRefId;
    }

    /**
     * Legt den Wert der corrDocRefId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrDocRefId(String value) {
        this.corrDocRefId = value;
    }

}
