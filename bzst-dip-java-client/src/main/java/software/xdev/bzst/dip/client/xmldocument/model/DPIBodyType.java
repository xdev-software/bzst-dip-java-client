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
 * <p>Java class for DPIBody_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DPIBody_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PlatformOperator" type="{urn:oecd:ties:dpi:v1}CorrectablePlatformOperator_Type"/&gt;
 *         &lt;element name="OtherPlatformOperators" type="{urn:oecd:ties:dpi:v1}OtherPlatformOperators_Type" minOccurs="0"/&gt;
 *         &lt;element name="ReportableSeller" type="{urn:oecd:ties:dpi:v1}CorrectableReportableSeller_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DPIBody_Type", namespace = "urn:oecd:ties:dpi:v1", propOrder = {
    "platformOperator",
    "otherPlatformOperators",
    "reportableSeller"
})
public class DPIBodyType {

    @XmlElement(name = "PlatformOperator", namespace = "urn:oecd:ties:dpi:v1", required = true)
    protected CorrectablePlatformOperatorType platformOperator;
    @XmlElement(name = "OtherPlatformOperators", namespace = "urn:oecd:ties:dpi:v1")
    protected OtherPlatformOperatorsType otherPlatformOperators;
    @XmlElement(name = "ReportableSeller", namespace = "urn:oecd:ties:dpi:v1")
    protected List<CorrectableReportableSellerType> reportableSeller;

    /**
     * Gets the value of the platformOperator property.
     * 
     * @return
     *     possible object is
     *     {@link CorrectablePlatformOperatorType }
     *     
     */
    public CorrectablePlatformOperatorType getPlatformOperator() {
        return this.platformOperator;
    }

    /**
     * Sets the value of the platformOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectablePlatformOperatorType }
     *     
     */
    public void setPlatformOperator(final CorrectablePlatformOperatorType value) {
        this.platformOperator = value;
    }

    /**
     * Gets the value of the otherPlatformOperators property.
     * 
     * @return
     *     possible object is
     *     {@link OtherPlatformOperatorsType }
     *     
     */
    public OtherPlatformOperatorsType getOtherPlatformOperators() {
        return this.otherPlatformOperators;
    }

    /**
     * Sets the value of the otherPlatformOperators property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherPlatformOperatorsType }
     *     
     */
    public void setOtherPlatformOperators(final OtherPlatformOperatorsType value) {
        this.otherPlatformOperators = value;
    }

    /**
     * Gets the value of the reportableSeller property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the reportableSeller property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportableSeller().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorrectableReportableSellerType }
     * 
     * 
     */
    public List<CorrectableReportableSellerType> getReportableSeller() {
        if (this.reportableSeller == null) {
			this.reportableSeller = new ArrayList<>();
        }
        return this.reportableSeller;
    }

}
