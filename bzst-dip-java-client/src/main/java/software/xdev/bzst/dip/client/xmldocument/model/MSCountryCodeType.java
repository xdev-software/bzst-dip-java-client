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

package software.xdev.bzst.dip.client.xmldocument.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MSCountryCode_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MSCountryCode_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AT"/&gt;
 *     &lt;enumeration value="BE"/&gt;
 *     &lt;enumeration value="BG"/&gt;
 *     &lt;enumeration value="CY"/&gt;
 *     &lt;enumeration value="CZ"/&gt;
 *     &lt;enumeration value="DK"/&gt;
 *     &lt;enumeration value="EE"/&gt;
 *     &lt;enumeration value="FI"/&gt;
 *     &lt;enumeration value="FR"/&gt;
 *     &lt;enumeration value="DE"/&gt;
 *     &lt;enumeration value="GR"/&gt;
 *     &lt;enumeration value="HU"/&gt;
 *     &lt;enumeration value="HR"/&gt;
 *     &lt;enumeration value="IE"/&gt;
 *     &lt;enumeration value="IT"/&gt;
 *     &lt;enumeration value="LV"/&gt;
 *     &lt;enumeration value="LT"/&gt;
 *     &lt;enumeration value="LU"/&gt;
 *     &lt;enumeration value="MT"/&gt;
 *     &lt;enumeration value="NL"/&gt;
 *     &lt;enumeration value="PL"/&gt;
 *     &lt;enumeration value="PT"/&gt;
 *     &lt;enumeration value="RO"/&gt;
 *     &lt;enumeration value="SK"/&gt;
 *     &lt;enumeration value="SI"/&gt;
 *     &lt;enumeration value="ES"/&gt;
 *     &lt;enumeration value="SE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MSCountryCode_Type", namespace = "urn:oecd:ties:isodpitypes:v1")
@XmlEnum
public enum MSCountryCodeType {

    AT,
    BE,
    BG,
    CY,
    CZ,
    DK,
    EE,
    FI,
    FR,
    DE,
    GR,
    HU,
    HR,
    IE,
    IT,
    LV,
    LT,
    LU,
    MT,
    NL,
    PL,
    PT,
    RO,
    SK,
    SI,
    ES,
    SE;

    public String value() {
        return this.name();
    }

    public static MSCountryCodeType fromValue(final String v) {
        return valueOf(v);
    }

}
