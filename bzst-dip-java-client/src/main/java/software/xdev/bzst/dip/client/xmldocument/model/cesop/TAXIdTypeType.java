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
 * <p>Java-Klasse für TAXIdType_Type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="TAXIdType_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNCONFIRMED_VAT"/&gt;
 *     &lt;enumeration value="TIN"/&gt;
 *     &lt;enumeration value="IOSS"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TAXIdType_Type", namespace = "urn:eu:taxud:commontypes:v1")
@XmlEnum
public enum TAXIdTypeType {


    /**
     * Unconfirmed VAT identifier.
     * 			 
     * 
     */
    UNCONFIRMED_VAT,

    /**
     * Tax Identification Number (TIN).
     * 			 
     * 
     */
    TIN,

    /**
     * Import One Stop Shop (IOSS-Id).
     * 			 
     * 
     */
    IOSS,

    /**
     * Other tax identifier.
     * 			 
     * 
     */
    OTHER;

    public String value() {
        return name();
    }

    public static TAXIdTypeType fromValue(String v) {
        return valueOf(v);
    }

}
