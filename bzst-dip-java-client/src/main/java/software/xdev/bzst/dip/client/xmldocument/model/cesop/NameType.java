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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * The name of a company.
 * 
 * <p>Java-Klasse für Name_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Name_Type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:eu:taxud:commontypes:v1&gt;StringMin1Max200_Type"&gt;
 *       &lt;attribute name="nameType" use="required" type="{urn:eu:taxud:commontypes:v1}NameType_EnumType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Name_Type", namespace = "urn:eu:taxud:commontypes:v1", propOrder = {
    "value"
})
public class NameType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "nameType", required = true)
    protected NameTypeEnumType nameType;

    /**
     * Defines a string with minimum length of 1 and maximum length of 200.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Ruft den Wert der nameType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NameTypeEnumType }
     *     
     */
    public NameTypeEnumType getNameType() {
        return nameType;
    }

    /**
     * Legt den Wert der nameType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NameTypeEnumType }
     *     
     */
    public void setNameType(NameTypeEnumType value) {
        this.nameType = value;
    }

}
