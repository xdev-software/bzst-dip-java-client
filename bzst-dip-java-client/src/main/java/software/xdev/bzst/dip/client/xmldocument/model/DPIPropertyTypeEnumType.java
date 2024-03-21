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
 * <p>Java class for DPIPropertyType_EnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DPIPropertyType_EnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DPI901"/&gt;
 *     &lt;enumeration value="DPI902"/&gt;
 *     &lt;enumeration value="DPI903"/&gt;
 *     &lt;enumeration value="DPI904"/&gt;
 *     &lt;enumeration value="DPI905"/&gt;
 *     &lt;enumeration value="DPI906"/&gt;
 *     &lt;enumeration value="DPI907"/&gt;
 *     &lt;enumeration value="DPI908"/&gt;
 *     &lt;enumeration value="DPI909"/&gt;
 *     &lt;enumeration value="DPI910"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DPIPropertyType_EnumType", namespace = "urn:oecd:ties:dpi:v1")
@XmlEnum
public enum DPIPropertyTypeEnumType {


    /**
     * Office
     * 
     */
    @XmlEnumValue("DPI901")
    DPI_901("DPI901"),

    /**
     * Hotel room
     * 
     */
    @XmlEnumValue("DPI902")
    DPI_902("DPI902"),

    /**
     * Bed and Breakfast room
     * 
     */
    @XmlEnumValue("DPI903")
    DPI_903("DPI903"),

    /**
     * House
     * 
     */
    @XmlEnumValue("DPI904")
    DPI_904("DPI904"),

    /**
     * Apartment
     * 
     */
    @XmlEnumValue("DPI905")
    DPI_905("DPI905"),

    /**
     * Mobile Home
     * 
     */
    @XmlEnumValue("DPI906")
    DPI_906("DPI906"),

    /**
     * Campground
     * 
     */
    @XmlEnumValue("DPI907")
    DPI_907("DPI907"),

    /**
     * Boat
     * 
     */
    @XmlEnumValue("DPI908")
    DPI_908("DPI908"),

    /**
     * Parking Space
     * 
     */
    @XmlEnumValue("DPI909")
    DPI_909("DPI909"),

    /**
     * Other
     * 
     */
    @XmlEnumValue("DPI910")
    DPI_910("DPI910");
    private final String value;

    DPIPropertyTypeEnumType(final String v) {
		this.value = v;
    }

    public String value() {
        return this.value;
    }

    public static DPIPropertyTypeEnumType fromValue(final String v) {
        for (final DPIPropertyTypeEnumType c: DPIPropertyTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
