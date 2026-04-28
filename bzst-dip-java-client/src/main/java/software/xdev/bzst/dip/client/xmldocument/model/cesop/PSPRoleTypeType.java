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
 * <p>Java-Klasse für PSPRoleType_Type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="PSPRoleType_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Three party card scheme"/&gt;
 *     &lt;enumeration value="Four party card scheme"/&gt;
 *     &lt;enumeration value="E-money provider"/&gt;
 *     &lt;enumeration value="Acquirer"/&gt;
 *     &lt;enumeration value="e-Wallet provider"/&gt;
 *     &lt;enumeration value="Money Transfer operator"/&gt;
 *     &lt;enumeration value="Issuer of payment instruments"/&gt;
 *     &lt;enumeration value="Payment Processor"/&gt;
 *     &lt;enumeration value="E-payment"/&gt;
 *     &lt;enumeration value="Payment collector"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PSPRoleType_Type", namespace = "urn:eu:taxud:commontypes:v1")
@XmlEnum
public enum PSPRoleTypeType {


    /**
     * The market category of the Payment Service Provider is Three party card scheme.
     * 					
     * 
     */
    @XmlEnumValue("Three party card scheme")
    THREE_PARTY_CARD_SCHEME("Three party card scheme"),

    /**
     * The market category of the Payment Service Provider is Four party card scheme.
     * 					
     * 
     */
    @XmlEnumValue("Four party card scheme")
    FOUR_PARTY_CARD_SCHEME("Four party card scheme"),

    /**
     * The market category of the Payment Service Provider is E-money provider.
     * 					
     * 
     */
    @XmlEnumValue("E-money provider")
    E_MONEY_PROVIDER("E-money provider"),

    /**
     * The market category of the Payment Service Provider is Acquirer.
     * 					
     * 
     */
    @XmlEnumValue("Acquirer")
    ACQUIRER("Acquirer"),

    /**
     * The market category of the Payment Service Provider is e-Wallet provider.
     * 					
     * 
     */
    @XmlEnumValue("e-Wallet provider")
    E_WALLET_PROVIDER("e-Wallet provider"),

    /**
     * The market category of the Payment Service Provider is Money Transfer operator.
     * 					
     * 
     */
    @XmlEnumValue("Money Transfer operator")
    MONEY_TRANSFER_OPERATOR("Money Transfer operator"),

    /**
     * The market category of the Payment Service Provider is Issuer of payment instruments.
     * 					
     * 
     */
    @XmlEnumValue("Issuer of payment instruments")
    ISSUER_OF_PAYMENT_INSTRUMENTS("Issuer of payment instruments"),

    /**
     * The market category of the Payment Service Provider is Payment Processor.
     * 					
     * 
     */
    @XmlEnumValue("Payment Processor")
    PAYMENT_PROCESSOR("Payment Processor"),

    /**
     * The market category of the Payment Service Provider is E-payment.
     * 					
     * 
     */
    @XmlEnumValue("E-payment")
    E_PAYMENT("E-payment"),

    /**
     * The market category of the Payment Service Provider is Payment collector.
     * 					
     * 
     */
    @XmlEnumValue("Payment collector")
    PAYMENT_COLLECTOR("Payment collector"),

    /**
     * Other category of Payment Service Provider.
     * 					
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    PSPRoleTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PSPRoleTypeType fromValue(String v) {
        for (PSPRoleTypeType c: PSPRoleTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
