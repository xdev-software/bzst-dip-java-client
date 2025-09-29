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
 * <p>Java-Klasse für DocTypeIndic_EnumType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="DocTypeIndic_EnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CESOP1"/&gt;
 *     &lt;enumeration value="CESOP2"/&gt;
 *     &lt;enumeration value="CESOP3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DocTypeIndic_EnumType", namespace = "urn:eu:taxud:commontypes:v1")
@XmlEnum
public enum DocTypeIndicEnumType {


    /**
     * New Data
     * 
     */
    @XmlEnumValue("CESOP1")
    CESOP_1("CESOP1"),

    /**
     * Corrected Data
     * 
     */
    @XmlEnumValue("CESOP2")
    CESOP_2("CESOP2"),

    /**
     * Deletion of Data
     * 
     */
    @XmlEnumValue("CESOP3")
    CESOP_3("CESOP3");
    private final String value;

    DocTypeIndicEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocTypeIndicEnumType fromValue(String v) {
        for (DocTypeIndicEnumType c: DocTypeIndicEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
