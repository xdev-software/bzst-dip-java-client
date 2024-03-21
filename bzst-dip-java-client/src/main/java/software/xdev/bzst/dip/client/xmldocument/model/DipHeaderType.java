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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DipHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DipHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consignment" type="{http://itzbund.de/ozg/bzst/post/dip/v1/}ConsignmentType"/&gt;
 *         &lt;element name="application" type="{http://itzbund.de/ozg/bzst/post/dip/v1/}ApplicationType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="environment" use="required" type="{http://itzbund.de/ozg/bzst/post/dip/v1/}environmentType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DipHeaderType", namespace = "http://itzbund.de/ozg/bzst/post/dip/v1/", propOrder = {
    "consignment",
    "application"
})
public class DipHeaderType {

    @XmlElement(namespace = "http://itzbund.de/ozg/bzst/post/dip/v1/", required = true)
    protected ConsignmentType consignment;
    @XmlElement(namespace = "http://itzbund.de/ozg/bzst/post/dip/v1/", required = true)
    protected ApplicationType application;
    @XmlAttribute(name = "environment", required = true)
    protected EnvironmentType environment;

    /**
     * Gets the value of the consignment property.
     * 
     * @return
     *     possible object is
     *     {@link ConsignmentType }
     *     
     */
    public ConsignmentType getConsignment() {
        return this.consignment;
    }

    /**
     * Sets the value of the consignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsignmentType }
     *     
     */
    public void setConsignment(final ConsignmentType value) {
        this.consignment = value;
    }

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationType }
     *     
     */
    public ApplicationType getApplication() {
        return this.application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationType }
     *     
     */
    public void setApplication(final ApplicationType value) {
        this.application = value;
    }

    /**
     * Gets the value of the environment property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentType }
     *     
     */
    public EnvironmentType getEnvironment() {
        return this.environment;
    }

    /**
     * Sets the value of the environment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentType }
     *     
     */
    public void setEnvironment(final EnvironmentType value) {
        this.environment = value;
    }

}
