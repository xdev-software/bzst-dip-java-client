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

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OECDLegalAddressType_EnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="OECDLegalAddressType_EnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="OECD301"/&gt;
 *     &lt;enumeration value="OECD302"/&gt;
 *     &lt;enumeration value="OECD303"/&gt;
 *     &lt;enumeration value="OECD304"/&gt;
 *     &lt;enumeration value="OECD305"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OECDLegalAddressType_EnumType", namespace = "urn:oecd:ties:dpistf:v1")
@XmlEnum
public enum OECDLegalAddressTypeEnumType {


    /**
     * residentialOrBusiness
     * 
     */
    @XmlEnumValue("OECD301")
    OECD_301("OECD301"),

    /**
     * residential
     * 
     */
    @XmlEnumValue("OECD302")
    OECD_302("OECD302"),

    /**
     * business
     * 
     */
    @XmlEnumValue("OECD303")
    OECD_303("OECD303"),

    /**
     * registeredOffice
     * 
     */
    @XmlEnumValue("OECD304")
    OECD_304("OECD304"),

    /**
     * unspecified
     * 
     */
    @XmlEnumValue("OECD305")
    OECD_305("OECD305");
    private final String value;

    OECDLegalAddressTypeEnumType(final String v) {
		this.value = v;
    }

    public String value() {
        return this.value;
    }

    public static OECDLegalAddressTypeEnumType fromValue(final String v) {
        for (final OECDLegalAddressTypeEnumType c: OECDLegalAddressTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
