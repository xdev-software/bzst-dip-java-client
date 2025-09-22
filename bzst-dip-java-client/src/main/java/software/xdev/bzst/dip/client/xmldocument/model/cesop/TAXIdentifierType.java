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
 * 
 * 					Article 243d(1c) If a TAX identifier is available, it must be reported. Otherwise it can be empty.
 * 					
 * 
 * <p>Java-Klasse für TAXIdentifier_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TAXIdentifier_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VATId" type="{urn:eu:taxud:commontypes:v1}VATId_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TAXId" type="{urn:eu:taxud:commontypes:v1}TAXId_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAXIdentifier_Type", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1", propOrder = {
    "vatId",
    "taxId"
})
public class TAXIdentifierType {

    @XmlElement(name = "VATId", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1")
    protected List<VATIdType> vatId;
    @XmlElement(name = "TAXId", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1")
    protected List<TAXIdType> taxId;

    /**
     * Gets the value of the vatId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the vatId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVATId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VATIdType }
     * 
     * 
     */
    public List<VATIdType> getVATId() {
        if (vatId == null) {
            vatId = new ArrayList<VATIdType>();
        }
        return this.vatId;
    }

    /**
     * Gets the value of the taxId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the taxId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTAXId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TAXIdType }
     * 
     * 
     */
    public List<TAXIdType> getTAXId() {
        if (taxId == null) {
            taxId = new ArrayList<TAXIdType>();
        }
        return this.taxId;
    }

}
