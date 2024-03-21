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

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * This correctable extends the information about the Reportable Seller by considering the DocSpec element used to identify the particular report within the DPI message being transmitted.
 * 
 * <p>Java class for CorrectableReportableSeller_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorrectableReportableSeller_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oecd:ties:dpi:v1}ReportableSeller_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocSpec" type="{urn:oecd:ties:dpistf:v1}DocSpec_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrectableReportableSeller_Type", namespace = "urn:oecd:ties:dpi:v1", propOrder = {
    "docSpec"
})
public class CorrectableReportableSellerType extends ReportableSellerType
{

    @XmlElement(name = "DocSpec", namespace = "urn:oecd:ties:dpi:v1", required = true)
    protected DocSpecType docSpec;

    /**
     * Gets the value of the docSpec property.
     * 
     * @return
     *     possible object is
     *     {@link DocSpecType }
     *     
     */
    public DocSpecType getDocSpec() {
        return this.docSpec;
    }

    /**
     * Sets the value of the docSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocSpecType }
     *     
     */
    public void setDocSpec(final DocSpecType value) {
        this.docSpec = value;
    }

}
