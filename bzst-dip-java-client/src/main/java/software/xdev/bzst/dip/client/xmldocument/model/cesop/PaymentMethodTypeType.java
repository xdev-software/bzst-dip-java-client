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
 * <p>Java-Klasse für PaymentMethodType_Type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="PaymentMethodType_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="20"/&gt;
 *     &lt;enumeration value="Card payment"/&gt;
 *     &lt;enumeration value="Bank transfer"/&gt;
 *     &lt;enumeration value="Direct debit"/&gt;
 *     &lt;enumeration value="E-money"/&gt;
 *     &lt;enumeration value="Money Remittance"/&gt;
 *     &lt;enumeration value="Marketplace"/&gt;
 *     &lt;enumeration value="Intermediary"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentMethodType_Type", namespace = "urn:eu:taxud:commontypes:v1")
@XmlEnum
public enum PaymentMethodTypeType {


    /**
     * The credit card as a means of payment.
     * 			 
     * 
     */
    @XmlEnumValue("Card payment")
    CARD_PAYMENT("Card payment"),

    /**
     * The bank transfer as a means of payment.
     * 			 
     * 
     */
    @XmlEnumValue("Bank transfer")
    BANK_TRANSFER("Bank transfer"),

    /**
     * The direct debit as a means of payment.
     * 			 
     * 
     */
    @XmlEnumValue("Direct debit")
    DIRECT_DEBIT("Direct debit"),

    /**
     * The e-Money as a means of payment.
     * 			 
     * 
     */
    @XmlEnumValue("E-money")
    E_MONEY("E-money"),

    /**
     * The money remittance as a means of payment.
     * 			 
     * 
     */
    @XmlEnumValue("Money Remittance")
    MONEY_REMITTANCE("Money Remittance"),

    /**
     * The marketplace as a means of payment.
     * 			 
     * 
     */
    @XmlEnumValue("Marketplace")
    MARKETPLACE("Marketplace"),

    /**
     * The intermediary as a means of payment.
     * 			 
     * 
     */
    @XmlEnumValue("Intermediary")
    INTERMEDIARY("Intermediary"),

    /**
     * Other mean of payment.
     * 					Please specify it in the element PaymentMethodOther.
     * 			 
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    PaymentMethodTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentMethodTypeType fromValue(String v) {
        for (PaymentMethodTypeType c: PaymentMethodTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
