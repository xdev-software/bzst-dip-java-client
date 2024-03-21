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

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PermanentEstablishments_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PermanentEstablishments_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PermanentEstablishment" type="{urn:oecd:ties:isodpitypes:v1}MSCountryCode_Type" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PermanentEstablishments_Type", namespace = "urn:oecd:ties:dpi:v1", propOrder = {
    "permanentEstablishment"
})
public class PermanentEstablishmentsType {

    @XmlElement(name = "PermanentEstablishment", namespace = "urn:oecd:ties:dpi:v1", required = true)
    @XmlSchemaType(name = "string")
    protected List<MSCountryCodeType> permanentEstablishment;

    /**
     * Gets the value of the permanentEstablishment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the permanentEstablishment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermanentEstablishment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MSCountryCodeType }
     * 
     * 
     */
    public List<MSCountryCodeType> getPermanentEstablishment() {
        if (this.permanentEstablishment == null) {
			this.permanentEstablishment = new ArrayList<>();
        }
        return this.permanentEstablishment;
    }

}
