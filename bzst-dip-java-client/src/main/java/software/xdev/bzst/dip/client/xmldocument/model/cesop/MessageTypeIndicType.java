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
 * <p>Java-Klasse für MessageTypeIndic_Type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="MessageTypeIndic_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CESOP100"/&gt;
 *     &lt;enumeration value="CESOP101"/&gt;
 *     &lt;enumeration value="CESOP102"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageTypeIndic_Type", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1")
@XmlEnum
public enum MessageTypeIndicType {


    /**
     * The message contains new data.
     * 			 
     * 
     */
    @XmlEnumValue("CESOP100")
    CESOP_100("CESOP100"),

    /**
     * The message contains corrections or deletions of previously sent data.
     * 			 
     * 
     */
    @XmlEnumValue("CESOP101")
    CESOP_101("CESOP101"),

    /**
     * The message indicates there is no data to report.
     * 			 
     * 
     */
    @XmlEnumValue("CESOP102")
    CESOP_102("CESOP102");
    private final String value;

    MessageTypeIndicType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageTypeIndicType fromValue(String v) {
        for (MessageTypeIndicType c: MessageTypeIndicType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
