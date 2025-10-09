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

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LegalAddressType_EnumType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="LegalAddressType_EnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CESOP301"/&gt;
 *     &lt;enumeration value="CESOP302"/&gt;
 *     &lt;enumeration value="CESOP303"/&gt;
 *     &lt;enumeration value="CESOP304"/&gt;
 *     &lt;enumeration value="CESOP309"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LegalAddressType_EnumType", namespace = "urn:eu:taxud:commontypes:v1")
@XmlEnum
public enum LegalAddressTypeEnumType {


    /**
     * residentialOrBusiness
     * 
     */
    @XmlEnumValue("CESOP301")
    CESOP_301("CESOP301"),

    /**
     * residential
     * 
     */
    @XmlEnumValue("CESOP302")
    CESOP_302("CESOP302"),

    /**
     * business
     * 
     */
    @XmlEnumValue("CESOP303")
    CESOP_303("CESOP303"),

    /**
     * registeredOffice
     * 
     */
    @XmlEnumValue("CESOP304")
    CESOP_304("CESOP304"),

    /**
     * unspecified
     * 
     */
    @XmlEnumValue("CESOP309")
    CESOP_309("CESOP309");
    private final String value;

    LegalAddressTypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LegalAddressTypeEnumType fromValue(String v) {
        for (LegalAddressTypeEnumType c: LegalAddressTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
