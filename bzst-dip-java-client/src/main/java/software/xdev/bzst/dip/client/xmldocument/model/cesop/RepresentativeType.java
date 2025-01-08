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

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Representative_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Representative_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RepresentativeId" type="{urn:ec.europa.eu:taxud:fiscalis:cesop:v1}PSPId_Type"/&gt;
 *         &lt;element name="Name" type="{urn:eu:taxud:commontypes:v1}Name_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Representative_Type", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1", propOrder = {
    "representativeId",
    "name"
})
public class RepresentativeType {

    @XmlElement(name = "RepresentativeId", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1", required = true)
    protected PSPIdType representativeId;
    @XmlElement(name = "Name", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1")
    protected List<NameType> name;

    /**
     * Ruft den Wert der representativeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PSPIdType }
     *     
     */
    public PSPIdType getRepresentativeId() {
        return representativeId;
    }

    /**
     * Legt den Wert der representativeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PSPIdType }
     *     
     */
    public void setRepresentativeId(PSPIdType value) {
        this.representativeId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getName() {
        if (name == null) {
            name = new ArrayList<NameType>();
        }
        return this.name;
    }

}
