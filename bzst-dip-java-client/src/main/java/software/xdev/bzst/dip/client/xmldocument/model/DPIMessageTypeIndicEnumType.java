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
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DPIMessageTypeIndic_EnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DPIMessageTypeIndic_EnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DPI401"/&gt;
 *     &lt;enumeration value="DPI402"/&gt;
 *     &lt;enumeration value="DPI403"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DPIMessageTypeIndic_EnumType", namespace = "urn:oecd:ties:dpi:v1")
@XmlEnum
public enum DPIMessageTypeIndicEnumType {


    /**
     * The message contains new (including additional) information.
     * 
     */
    @XmlEnumValue("DPI401")
    DPI_401("DPI401"),

    /**
     * The message contains corrections for previously sent information.
     * 
     */
    @XmlEnumValue("DPI402")
    DPI_402("DPI402"),

    /**
     * The message advises that there is no data to report.
     * 
     */
    @XmlEnumValue("DPI403")
    DPI_403("DPI403");
    private final String value;

    DPIMessageTypeIndicEnumType(final String v) {
		this.value = v;
    }

    public String value() {
        return this.value;
    }

    public static DPIMessageTypeIndicEnumType fromValue(final String v) {
        for (final DPIMessageTypeIndicEnumType c: DPIMessageTypeIndicEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
