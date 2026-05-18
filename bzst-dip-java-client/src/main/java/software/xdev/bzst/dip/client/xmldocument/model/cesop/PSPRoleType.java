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
 * The role of the Payment Service Provider acting on behalf of the payee.
 * 			 
 * 
 * <p>Java-Klasse für PSPRole_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PSPRole_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PSPRoleType" type="{urn:eu:taxud:commontypes:v1}PSPRoleType_Type"/&gt;
 *         &lt;element name="PSPRoleOther" type="{urn:eu:taxud:commontypes:v1}StringMin1Max200_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PSPRole_Type", namespace = "urn:eu:taxud:commontypes:v1", propOrder = {
    "pspRoleType",
    "pspRoleOther"
})
public class PSPRoleType {

    @XmlElement(name = "PSPRoleType", namespace = "urn:eu:taxud:commontypes:v1", required = true)
    @XmlSchemaType(name = "string")
    protected PSPRoleTypeType pspRoleType;
    @XmlElement(name = "PSPRoleOther", namespace = "urn:eu:taxud:commontypes:v1")
    protected String pspRoleOther;

    /**
     * Ruft den Wert der pspRoleType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PSPRoleTypeType }
     *     
     */
    public PSPRoleTypeType getPSPRoleType() {
        return pspRoleType;
    }

    /**
     * Legt den Wert der pspRoleType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PSPRoleTypeType }
     *     
     */
    public void setPSPRoleType(PSPRoleTypeType value) {
        this.pspRoleType = value;
    }

    /**
     * Ruft den Wert der pspRoleOther-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSPRoleOther() {
        return pspRoleOther;
    }

    /**
     * Legt den Wert der pspRoleOther-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSPRoleOther(String value) {
        this.pspRoleOther = value;
    }

}
