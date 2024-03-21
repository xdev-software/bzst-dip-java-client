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
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * This is the identification number/identification code for the party in question. As the identifier may be not strictly numeric, it is just defined as a string of characters. Attribute 'issuedBy' is required to designate the issuer of the identifier.
 *
 * <p>Java class for TIN_Type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TIN_Type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:oecd:ties:dpistf:v1&gt;StringMin0Max200_Type"&gt;
 *       &lt;attribute name="issuedBy" type="{urn:oecd:ties:isodpitypes:v1}CountryCode_Type" /&gt;
 *       &lt;attribute name="unknown" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIN_Type", namespace = "urn:oecd:ties:dpi:v1", propOrder =
        {
        "value"
})
public class TINType
{

    @XmlValue
    protected String value;
    @XmlAttribute(name = "issuedBy")
    protected CountryCodeType issuedBy;
    @XmlAttribute(name = "unknown")
    protected Boolean unknown;

    /**
     * Defines a string with minimum length 0 and maximum length of 200.
     *
     * @return possible object is
     * {@link String }
     */
    public String getValue()
    {
        return this.value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setValue(final String value)
    {
        this.value = value;
    }

    /**
     * Gets the value of the issuedBy property.
     *
     * @return possible object is
     * {@link CountryCodeType }
     */
    public CountryCodeType getIssuedBy()
    {
        return this.issuedBy;
    }

    /**
     * Sets the value of the issuedBy property.
     *
     * @param value allowed object is
     *              {@link CountryCodeType }
     */
    public void setIssuedBy(final CountryCodeType value)
    {
        this.issuedBy = value;
    }

    /**
     * Gets the value of the unknown property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isUnknown()
    {
        return this.unknown;
    }

    /**
     * Sets the value of the unknown property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setUnknown(final Boolean value)
    {
        this.unknown = value;
    }

}
