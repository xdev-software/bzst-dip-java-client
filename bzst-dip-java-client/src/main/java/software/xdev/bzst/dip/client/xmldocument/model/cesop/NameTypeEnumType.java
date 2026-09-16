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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NameType_EnumType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="NameType_EnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BUSINESS"/&gt;
 *     &lt;enumeration value="TRADE"/&gt;
 *     &lt;enumeration value="LEGAL"/&gt;
 *     &lt;enumeration value="PERSON"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NameType_EnumType", namespace = "urn:eu:taxud:commontypes:v1")
@XmlEnum
public enum NameTypeEnumType {


    /**
     * Business name
     * 
     */
    BUSINESS,

    /**
     * Trade name
     * 
     */
    TRADE,

    /**
     * Legal name
     * 
     */
    LEGAL,

    /**
     * Person name
     * 
     */
    PERSON,

    /**
     * Other name
     * 
     */
    OTHER;

    public String value() {
        return name();
    }

    public static NameTypeEnumType fromValue(String v) {
        return valueOf(v);
    }

}
