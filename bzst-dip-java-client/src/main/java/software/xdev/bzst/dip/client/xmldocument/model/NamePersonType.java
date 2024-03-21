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

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * The user must spread the data about the name of a party over up to six elements. The container element for this will be 'NameFix'. 
 * 
 * <p>Java class for NamePerson_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NamePerson_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrecedingTitle" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FirstName"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;urn:oecd:ties:dpistf:v1&gt;StringMin1Max200_Type"&gt;
 *                 &lt;attribute name="xnlNameType" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MiddleName" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;urn:oecd:ties:dpistf:v1&gt;StringMin1Max200_Type"&gt;
 *                 &lt;attribute name="xnlNameType" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NamePrefix" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;urn:oecd:ties:dpistf:v1&gt;StringMin1Max200_Type"&gt;
 *                 &lt;attribute name="xnlNameType" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LastName"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;urn:oecd:ties:dpistf:v1&gt;StringMin1Max200_Type"&gt;
 *                 &lt;attribute name="xnlNameType" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GenerationIdentifier" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Suffix" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GeneralSuffix" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="nameType" type="{urn:oecd:ties:dpistf:v1}OECDNameType_EnumType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NamePerson_Type", namespace = "urn:oecd:ties:dpi:v1", propOrder = {
    "precedingTitle",
    "title",
    "firstName",
    "middleName",
    "namePrefix",
    "lastName",
    "generationIdentifier",
    "suffix",
    "generalSuffix"
})
public class NamePersonType {

    @XmlElement(name = "PrecedingTitle", namespace = "urn:oecd:ties:dpi:v1")
    protected String precedingTitle;
    @XmlElement(name = "Title", namespace = "urn:oecd:ties:dpi:v1")
    protected List<String> title;
    @XmlElement(name = "FirstName", namespace = "urn:oecd:ties:dpi:v1", required = true)
    protected NamePersonType.FirstName firstName;
    @XmlElement(name = "MiddleName", namespace = "urn:oecd:ties:dpi:v1")
    protected List<NamePersonType.MiddleName> middleName;
    @XmlElement(name = "NamePrefix", namespace = "urn:oecd:ties:dpi:v1")
    protected NamePersonType.NamePrefix namePrefix;
    @XmlElement(name = "LastName", namespace = "urn:oecd:ties:dpi:v1", required = true)
    protected NamePersonType.LastName lastName;
    @XmlElement(name = "GenerationIdentifier", namespace = "urn:oecd:ties:dpi:v1")
    protected List<String> generationIdentifier;
    @XmlElement(name = "Suffix", namespace = "urn:oecd:ties:dpi:v1")
    protected List<String> suffix;
    @XmlElement(name = "GeneralSuffix", namespace = "urn:oecd:ties:dpi:v1")
    protected String generalSuffix;
    @XmlAttribute(name = "nameType")
    protected OECDNameTypeEnumType nameType;

    /**
     * Gets the value of the precedingTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecedingTitle() {
        return this.precedingTitle;
    }

    /**
     * Sets the value of the precedingTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecedingTitle(final String value) {
        this.precedingTitle = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the title property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTitle() {
        if (this.title == null) {
			this.title = new ArrayList<>();
        }
        return this.title;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link NamePersonType.FirstName }
     *     
     */
    public NamePersonType.FirstName getFirstName() {
        return this.firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamePersonType.FirstName }
     *     
     */
    public void setFirstName(final NamePersonType.FirstName value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the middleName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiddleName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NamePersonType.MiddleName }
     * 
     * 
     */
    public List<NamePersonType.MiddleName> getMiddleName() {
        if (this.middleName == null) {
			this.middleName = new ArrayList<>();
        }
        return this.middleName;
    }

    /**
     * Gets the value of the namePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link NamePersonType.NamePrefix }
     *     
     */
    public NamePersonType.NamePrefix getNamePrefix() {
        return this.namePrefix;
    }

    /**
     * Sets the value of the namePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamePersonType.NamePrefix }
     *     
     */
    public void setNamePrefix(final NamePersonType.NamePrefix value) {
        this.namePrefix = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link NamePersonType.LastName }
     *     
     */
    public NamePersonType.LastName getLastName() {
        return this.lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamePersonType.LastName }
     *     
     */
    public void setLastName(final NamePersonType.LastName value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the generationIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the generationIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenerationIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGenerationIdentifier() {
        if (this.generationIdentifier == null) {
			this.generationIdentifier = new ArrayList<>();
        }
        return this.generationIdentifier;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the suffix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuffix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSuffix() {
        if (this.suffix == null) {
			this.suffix = new ArrayList<>();
        }
        return this.suffix;
    }

    /**
     * Gets the value of the generalSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneralSuffix() {
        return this.generalSuffix;
    }

    /**
     * Sets the value of the generalSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneralSuffix(final String value) {
        this.generalSuffix = value;
    }

    /**
     * Gets the value of the nameType property.
     * 
     * @return
     *     possible object is
     *     {@link OECDNameTypeEnumType }
     *     
     */
    public OECDNameTypeEnumType getNameType() {
        return this.nameType;
    }

    /**
     * Sets the value of the nameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OECDNameTypeEnumType }
     *     
     */
    public void setNameType(final OECDNameTypeEnumType value) {
        this.nameType = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;urn:oecd:ties:dpistf:v1&gt;StringMin1Max200_Type"&gt;
     *       &lt;attribute name="xnlNameType" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class FirstName {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "xnlNameType")
        protected String xnlNameType;

        /**
         * Defines a string with minimum length 1 and maximum length of 200.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return this.value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(final String value) {
            this.value = value;
        }

        /**
         * Gets the value of the xnlNameType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXnlNameType() {
            return this.xnlNameType;
        }

        /**
         * Sets the value of the xnlNameType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXnlNameType(final String value) {
            this.xnlNameType = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;urn:oecd:ties:dpistf:v1&gt;StringMin1Max200_Type"&gt;
     *       &lt;attribute name="xnlNameType" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class LastName {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "xnlNameType")
        protected String xnlNameType;

        /**
         * Defines a string with minimum length 1 and maximum length of 200.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return this.value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(final String value) {
            this.value = value;
        }

        /**
         * Gets the value of the xnlNameType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXnlNameType() {
            return this.xnlNameType;
        }

        /**
         * Sets the value of the xnlNameType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXnlNameType(final String value) {
            this.xnlNameType = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;urn:oecd:ties:dpistf:v1&gt;StringMin1Max200_Type"&gt;
     *       &lt;attribute name="xnlNameType" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class MiddleName {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "xnlNameType")
        protected String xnlNameType;

        /**
         * Defines a string with minimum length 1 and maximum length of 200.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return this.value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(final String value) {
            this.value = value;
        }

        /**
         * Gets the value of the xnlNameType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXnlNameType() {
            return this.xnlNameType;
        }

        /**
         * Sets the value of the xnlNameType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXnlNameType(final String value) {
            this.xnlNameType = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;urn:oecd:ties:dpistf:v1&gt;StringMin1Max200_Type"&gt;
     *       &lt;attribute name="xnlNameType" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class NamePrefix {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "xnlNameType")
        protected String xnlNameType;

        /**
         * Defines a string with minimum length 1 and maximum length of 200.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return this.value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(final String value) {
            this.value = value;
        }

        /**
         * Gets the value of the xnlNameType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXnlNameType() {
            return this.xnlNameType;
        }

        /**
         * Sets the value of the xnlNameType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXnlNameType(final String value) {
            this.xnlNameType = value;
        }

    }

}
