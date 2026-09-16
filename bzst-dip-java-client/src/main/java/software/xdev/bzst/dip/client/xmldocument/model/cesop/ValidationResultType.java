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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ValidationResult_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ValidationResult_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValidationResult" type="{urn:ec.europa.eu:taxud:fiscalis:cesop:v1}ValidationResultType_Type"/&gt;
 *         &lt;element name="ValidationErrors" type="{urn:ec.europa.eu:taxud:fiscalis:cesop:v1}ValidationError_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationResult_Type", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1", propOrder = {
    "validationResult",
    "validationErrors"
})
public class ValidationResultType {

    @XmlElement(name = "ValidationResult", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1", required = true)
    @XmlSchemaType(name = "string")
    protected ValidationResultTypeType validationResult;
    @XmlElement(name = "ValidationErrors", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1")
    protected List<ValidationErrorType> validationErrors;

    /**
     * Ruft den Wert der validationResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValidationResultTypeType }
     *     
     */
    public ValidationResultTypeType getValidationResult() {
        return validationResult;
    }

    /**
     * Legt den Wert der validationResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationResultTypeType }
     *     
     */
    public void setValidationResult(ValidationResultTypeType value) {
        this.validationResult = value;
    }

    /**
     * Gets the value of the validationErrors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the validationErrors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidationErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidationErrorType }
     * 
     * 
     */
    public List<ValidationErrorType> getValidationErrors() {
        if (validationErrors == null) {
            validationErrors = new ArrayList<ValidationErrorType>();
        }
        return this.validationErrors;
    }

}
