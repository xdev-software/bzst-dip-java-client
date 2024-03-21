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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherPlatformOperators_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherPlatformOperators_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="AssumingPlatformOperator" type="{urn:oecd:ties:dpi:v1}CorrectableOtherRPO_Type"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="AssumedPlatformOperator" type="{urn:oecd:ties:dpi:v1}CorrectableOtherRPO_Type" maxOccurs="unbounded"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherPlatformOperators_Type", namespace = "urn:oecd:ties:dpi:v1", propOrder = {
    "assumingPlatformOperator",
    "assumedPlatformOperator"
})
public class OtherPlatformOperatorsType {

    @XmlElement(name = "AssumingPlatformOperator", namespace = "urn:oecd:ties:dpi:v1")
    protected CorrectableOtherRPOType assumingPlatformOperator;
    @XmlElement(name = "AssumedPlatformOperator", namespace = "urn:oecd:ties:dpi:v1")
    protected List<CorrectableOtherRPOType> assumedPlatformOperator;

    /**
     * Gets the value of the assumingPlatformOperator property.
     * 
     * @return
     *     possible object is
     *     {@link CorrectableOtherRPOType }
     *     
     */
    public CorrectableOtherRPOType getAssumingPlatformOperator() {
        return this.assumingPlatformOperator;
    }

    /**
     * Sets the value of the assumingPlatformOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectableOtherRPOType }
     *     
     */
    public void setAssumingPlatformOperator(final CorrectableOtherRPOType value) {
        this.assumingPlatformOperator = value;
    }

    /**
     * Gets the value of the assumedPlatformOperator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the assumedPlatformOperator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssumedPlatformOperator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorrectableOtherRPOType }
     * 
     * 
     */
    public List<CorrectableOtherRPOType> getAssumedPlatformOperator() {
        if (this.assumedPlatformOperator == null) {
			this.assumedPlatformOperator = new ArrayList<>();
        }
        return this.assumedPlatformOperator;
    }

}
