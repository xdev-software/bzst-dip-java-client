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
 * <p>Java-Klasse für TransactionDateType_Type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="TransactionDateType_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CESOP701"/&gt;
 *     &lt;enumeration value="CESOP702"/&gt;
 *     &lt;enumeration value="CESOP703"/&gt;
 *     &lt;enumeration value="CESOP704"/&gt;
 *     &lt;enumeration value="CESOP709"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionDateType_Type", namespace = "urn:eu:taxud:commontypes:v1")
@XmlEnum
public enum TransactionDateTypeType {


    /**
     * Execution Date
     * 
     */
    @XmlEnumValue("CESOP701")
    CESOP_701("CESOP701"),

    /**
     * Clearing Date
     * 
     */
    @XmlEnumValue("CESOP702")
    CESOP_702("CESOP702"),

    /**
     * Authorisation Date
     * 
     */
    @XmlEnumValue("CESOP703")
    CESOP_703("CESOP703"),

    /**
     * Purchase Date
     * 
     */
    @XmlEnumValue("CESOP704")
    CESOP_704("CESOP704"),

    /**
     * Other Date
     * 
     */
    @XmlEnumValue("CESOP709")
    CESOP_709("CESOP709");
    private final String value;

    TransactionDateTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionDateTypeType fromValue(String v) {
        for (TransactionDateTypeType c: TransactionDateTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
