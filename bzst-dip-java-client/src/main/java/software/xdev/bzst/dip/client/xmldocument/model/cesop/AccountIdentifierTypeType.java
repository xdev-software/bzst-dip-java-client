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
 * <p>Java-Klasse für AccountIdentifierType_Type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="AccountIdentifierType_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IBAN"/&gt;
 *     &lt;enumeration value="OBAN"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccountIdentifierType_Type", namespace = "urn:eu:taxud:commontypes:v1")
@XmlEnum
public enum AccountIdentifierTypeType {


    /**
     * The IBAN of the payer/payee's payment account which unambiguously identifies, and gives the location of the payer/payee.
     * 			 
     * 
     */
    IBAN("IBAN"),

    /**
     * The OBAN of the payer/payee’s payment account which unambiguously identifies, and gives the location of the payer/payee.
     * 			 
     * 
     */
    OBAN("OBAN"),

    /**
     * Other identifier which unambiguously identifies, and gives the location of the payer/payee.
     * 			 
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    AccountIdentifierTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountIdentifierTypeType fromValue(String v) {
        for (AccountIdentifierTypeType c: AccountIdentifierTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
