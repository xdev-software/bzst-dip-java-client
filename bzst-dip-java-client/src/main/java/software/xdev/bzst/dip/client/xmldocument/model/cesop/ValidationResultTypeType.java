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
 * <p>Java-Klasse für ValidationResultType_Type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="ValidationResultType_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="VALIDATED"/&gt;
 *     &lt;enumeration value="PARTIALLY REJECTED"/&gt;
 *     &lt;enumeration value="FULLY REJECTED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ValidationResultType_Type", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1")
@XmlEnum
public enum ValidationResultTypeType {


    /**
     * The message has been positively validated.
     * 			 
     * 
     */
    VALIDATED("VALIDATED"),

    /**
     * The message has been partially rejected.
     * 			 
     * 
     */
    @XmlEnumValue("PARTIALLY REJECTED")
    PARTIALLY_REJECTED("PARTIALLY REJECTED"),

    /**
     * The message has been fully rejected.
     * 			 
     * 
     */
    @XmlEnumValue("FULLY REJECTED")
    FULLY_REJECTED("FULLY REJECTED");
    private final String value;

    ValidationResultTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ValidationResultTypeType fromValue(String v) {
        for (ValidationResultTypeType c: ValidationResultTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
