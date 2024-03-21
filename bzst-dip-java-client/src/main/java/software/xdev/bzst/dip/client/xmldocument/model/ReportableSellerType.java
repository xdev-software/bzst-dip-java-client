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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportableSeller_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportableSeller_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Identity"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="EntitySeller"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;choice&gt;
 *                             &lt;element name="Standard"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="EntSellerID" type="{urn:oecd:ties:dpi:v1}OrganisationParty_Type"/&gt;
 *                                       &lt;element name="FinancialIdentifier" type="{urn:oecd:ties:dpi:v1}FinancialIdentifier_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                       &lt;element name="PermanentEstablishments" type="{urn:oecd:ties:dpi:v1}PermanentEstablishments_Type" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="GVS" type="{urn:oecd:ties:dpi:v1}GVSType"/&gt;
 *                           &lt;/choice&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IndividualSeller"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;choice&gt;
 *                             &lt;element name="Standard"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="IndSellerID" type="{urn:oecd:ties:dpi:v1}PersonParty_Type"/&gt;
 *                                       &lt;element name="FinancialIdentifier" type="{urn:oecd:ties:dpi:v1}FinancialIdentifier_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="GVS" type="{urn:oecd:ties:dpi:v1}GVSType"/&gt;
 *                           &lt;/choice&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RelevantActivities"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ImmovableProperty" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PropertyListing" type="{urn:oecd:ties:dpi:v1}PropertyListingType" maxOccurs="unbounded"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PersonalServices" type="{urn:oecd:ties:dpi:v1}OtherActivities_Type" minOccurs="0"/&gt;
 *                   &lt;element name="SaleOfGoods" type="{urn:oecd:ties:dpi:v1}OtherActivities_Type" minOccurs="0"/&gt;
 *                   &lt;element name="TransportationRental" type="{urn:oecd:ties:dpi:v1}OtherActivities_Type" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportableSeller_Type", namespace = "urn:oecd:ties:dpi:v1", propOrder = {
    "identity",
    "relevantActivities"
})
@XmlSeeAlso({
    CorrectableReportableSellerType.class
})
public class ReportableSellerType {

    @XmlElement(name = "Identity", namespace = "urn:oecd:ties:dpi:v1", required = true)
    protected ReportableSellerType.Identity identity;
    @XmlElement(name = "RelevantActivities", namespace = "urn:oecd:ties:dpi:v1", required = true)
    protected ReportableSellerType.RelevantActivities relevantActivities;

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link ReportableSellerType.Identity }
     *     
     */
    public ReportableSellerType.Identity getIdentity() {
        return this.identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportableSellerType.Identity }
     *     
     */
    public void setIdentity(final ReportableSellerType.Identity value) {
        this.identity = value;
    }

    /**
     * Gets the value of the relevantActivities property.
     * 
     * @return
     *     possible object is
     *     {@link ReportableSellerType.RelevantActivities }
     *     
     */
    public ReportableSellerType.RelevantActivities getRelevantActivities() {
        return this.relevantActivities;
    }

    /**
     * Sets the value of the relevantActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportableSellerType.RelevantActivities }
     *     
     */
    public void setRelevantActivities(final ReportableSellerType.RelevantActivities value) {
        this.relevantActivities = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice&gt;
     *         &lt;element name="EntitySeller"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;choice&gt;
     *                   &lt;element name="Standard"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="EntSellerID" type="{urn:oecd:ties:dpi:v1}OrganisationParty_Type"/&gt;
     *                             &lt;element name="FinancialIdentifier" type="{urn:oecd:ties:dpi:v1}FinancialIdentifier_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                             &lt;element name="PermanentEstablishments" type="{urn:oecd:ties:dpi:v1}PermanentEstablishments_Type" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="GVS" type="{urn:oecd:ties:dpi:v1}GVSType"/&gt;
     *                 &lt;/choice&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="IndividualSeller"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;choice&gt;
     *                   &lt;element name="Standard"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="IndSellerID" type="{urn:oecd:ties:dpi:v1}PersonParty_Type"/&gt;
     *                             &lt;element name="FinancialIdentifier" type="{urn:oecd:ties:dpi:v1}FinancialIdentifier_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="GVS" type="{urn:oecd:ties:dpi:v1}GVSType"/&gt;
     *                 &lt;/choice&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "entitySeller",
        "individualSeller"
    })
    public static class Identity {

        @XmlElement(name = "EntitySeller", namespace = "urn:oecd:ties:dpi:v1")
        protected ReportableSellerType.Identity.EntitySeller entitySeller;
        @XmlElement(name = "IndividualSeller", namespace = "urn:oecd:ties:dpi:v1")
        protected ReportableSellerType.Identity.IndividualSeller individualSeller;

        /**
         * Gets the value of the entitySeller property.
         * 
         * @return
         *     possible object is
         *     {@link ReportableSellerType.Identity.EntitySeller }
         *     
         */
        public ReportableSellerType.Identity.EntitySeller getEntitySeller() {
            return this.entitySeller;
        }

        /**
         * Sets the value of the entitySeller property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReportableSellerType.Identity.EntitySeller }
         *     
         */
        public void setEntitySeller(final ReportableSellerType.Identity.EntitySeller value) {
            this.entitySeller = value;
        }

        /**
         * Gets the value of the individualSeller property.
         * 
         * @return
         *     possible object is
         *     {@link ReportableSellerType.Identity.IndividualSeller }
         *     
         */
        public ReportableSellerType.Identity.IndividualSeller getIndividualSeller() {
            return this.individualSeller;
        }

        /**
         * Sets the value of the individualSeller property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReportableSellerType.Identity.IndividualSeller }
         *     
         */
        public void setIndividualSeller(final ReportableSellerType.Identity.IndividualSeller value) {
            this.individualSeller = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;choice&gt;
         *         &lt;element name="Standard"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="EntSellerID" type="{urn:oecd:ties:dpi:v1}OrganisationParty_Type"/&gt;
         *                   &lt;element name="FinancialIdentifier" type="{urn:oecd:ties:dpi:v1}FinancialIdentifier_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                   &lt;element name="PermanentEstablishments" type="{urn:oecd:ties:dpi:v1}PermanentEstablishments_Type" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="GVS" type="{urn:oecd:ties:dpi:v1}GVSType"/&gt;
         *       &lt;/choice&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "standard",
            "gvs"
        })
        public static class EntitySeller {

            @XmlElement(name = "Standard", namespace = "urn:oecd:ties:dpi:v1")
            protected ReportableSellerType.Identity.EntitySeller.Standard standard;
            @XmlElement(name = "GVS", namespace = "urn:oecd:ties:dpi:v1")
            protected GVSType gvs;

            /**
             * Gets the value of the standard property.
             * 
             * @return
             *     possible object is
             *     {@link ReportableSellerType.Identity.EntitySeller.Standard }
             *     
             */
            public ReportableSellerType.Identity.EntitySeller.Standard getStandard() {
                return this.standard;
            }

            /**
             * Sets the value of the standard property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportableSellerType.Identity.EntitySeller.Standard }
             *     
             */
            public void setStandard(final ReportableSellerType.Identity.EntitySeller.Standard value) {
                this.standard = value;
            }

            /**
             * Gets the value of the gvs property.
             * 
             * @return
             *     possible object is
             *     {@link GVSType }
             *     
             */
            public GVSType getGVS() {
                return this.gvs;
            }

            /**
             * Sets the value of the gvs property.
             * 
             * @param value
             *     allowed object is
             *     {@link GVSType }
             *     
             */
            public void setGVS(final GVSType value) {
                this.gvs = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="EntSellerID" type="{urn:oecd:ties:dpi:v1}OrganisationParty_Type"/&gt;
             *         &lt;element name="FinancialIdentifier" type="{urn:oecd:ties:dpi:v1}FinancialIdentifier_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
             *         &lt;element name="PermanentEstablishments" type="{urn:oecd:ties:dpi:v1}PermanentEstablishments_Type" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "entSellerID",
                "financialIdentifier",
                "permanentEstablishments"
            })
            public static class Standard {

                @XmlElement(name = "EntSellerID", namespace = "urn:oecd:ties:dpi:v1", required = true)
                protected OrganisationPartyType entSellerID;
                @XmlElement(name = "FinancialIdentifier", namespace = "urn:oecd:ties:dpi:v1")
                protected List<FinancialIdentifierType> financialIdentifier;
                @XmlElement(name = "PermanentEstablishments", namespace = "urn:oecd:ties:dpi:v1")
                protected PermanentEstablishmentsType permanentEstablishments;

                /**
                 * Gets the value of the entSellerID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrganisationPartyType }
                 *     
                 */
                public OrganisationPartyType getEntSellerID() {
                    return this.entSellerID;
                }

                /**
                 * Sets the value of the entSellerID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrganisationPartyType }
                 *     
                 */
                public void setEntSellerID(final OrganisationPartyType value) {
                    this.entSellerID = value;
                }

                /**
                 * Gets the value of the financialIdentifier property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a <CODE>set</CODE> method for the financialIdentifier property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getFinancialIdentifier().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link FinancialIdentifierType }
                 * 
                 * 
                 */
                public List<FinancialIdentifierType> getFinancialIdentifier() {
                    if (this.financialIdentifier == null) {
						this.financialIdentifier = new ArrayList<>();
                    }
                    return this.financialIdentifier;
                }

                /**
                 * Gets the value of the permanentEstablishments property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PermanentEstablishmentsType }
                 *     
                 */
                public PermanentEstablishmentsType getPermanentEstablishments() {
                    return this.permanentEstablishments;
                }

                /**
                 * Sets the value of the permanentEstablishments property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PermanentEstablishmentsType }
                 *     
                 */
                public void setPermanentEstablishments(final PermanentEstablishmentsType value) {
                    this.permanentEstablishments = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;choice&gt;
         *         &lt;element name="Standard"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="IndSellerID" type="{urn:oecd:ties:dpi:v1}PersonParty_Type"/&gt;
         *                   &lt;element name="FinancialIdentifier" type="{urn:oecd:ties:dpi:v1}FinancialIdentifier_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="GVS" type="{urn:oecd:ties:dpi:v1}GVSType"/&gt;
         *       &lt;/choice&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "standard",
            "gvs"
        })
        public static class IndividualSeller {

            @XmlElement(name = "Standard", namespace = "urn:oecd:ties:dpi:v1")
            protected ReportableSellerType.Identity.IndividualSeller.Standard standard;
            @XmlElement(name = "GVS", namespace = "urn:oecd:ties:dpi:v1")
            protected GVSType gvs;

            /**
             * Gets the value of the standard property.
             * 
             * @return
             *     possible object is
             *     {@link ReportableSellerType.Identity.IndividualSeller.Standard }
             *     
             */
            public ReportableSellerType.Identity.IndividualSeller.Standard getStandard() {
                return this.standard;
            }

            /**
             * Sets the value of the standard property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReportableSellerType.Identity.IndividualSeller.Standard }
             *     
             */
            public void setStandard(final ReportableSellerType.Identity.IndividualSeller.Standard value) {
                this.standard = value;
            }

            /**
             * Gets the value of the gvs property.
             * 
             * @return
             *     possible object is
             *     {@link GVSType }
             *     
             */
            public GVSType getGVS() {
                return this.gvs;
            }

            /**
             * Sets the value of the gvs property.
             * 
             * @param value
             *     allowed object is
             *     {@link GVSType }
             *     
             */
            public void setGVS(final GVSType value) {
                this.gvs = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="IndSellerID" type="{urn:oecd:ties:dpi:v1}PersonParty_Type"/&gt;
             *         &lt;element name="FinancialIdentifier" type="{urn:oecd:ties:dpi:v1}FinancialIdentifier_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "indSellerID",
                "financialIdentifier"
            })
            public static class Standard {

                @XmlElement(name = "IndSellerID", namespace = "urn:oecd:ties:dpi:v1", required = true)
                protected PersonPartyType indSellerID;
                @XmlElement(name = "FinancialIdentifier", namespace = "urn:oecd:ties:dpi:v1")
                protected List<FinancialIdentifierType> financialIdentifier;

                /**
                 * Gets the value of the indSellerID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PersonPartyType }
                 *     
                 */
                public PersonPartyType getIndSellerID() {
                    return this.indSellerID;
                }

                /**
                 * Sets the value of the indSellerID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PersonPartyType }
                 *     
                 */
                public void setIndSellerID(final PersonPartyType value) {
                    this.indSellerID = value;
                }

                /**
                 * Gets the value of the financialIdentifier property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a <CODE>set</CODE> method for the financialIdentifier property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getFinancialIdentifier().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link FinancialIdentifierType }
                 * 
                 * 
                 */
                public List<FinancialIdentifierType> getFinancialIdentifier() {
                    if (this.financialIdentifier == null) {
						this.financialIdentifier = new ArrayList<>();
                    }
                    return this.financialIdentifier;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ImmovableProperty" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PropertyListing" type="{urn:oecd:ties:dpi:v1}PropertyListingType" maxOccurs="unbounded"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PersonalServices" type="{urn:oecd:ties:dpi:v1}OtherActivities_Type" minOccurs="0"/&gt;
     *         &lt;element name="SaleOfGoods" type="{urn:oecd:ties:dpi:v1}OtherActivities_Type" minOccurs="0"/&gt;
     *         &lt;element name="TransportationRental" type="{urn:oecd:ties:dpi:v1}OtherActivities_Type" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "immovableProperty",
        "personalServices",
        "saleOfGoods",
        "transportationRental"
    })
    public static class RelevantActivities {

        @XmlElement(name = "ImmovableProperty", namespace = "urn:oecd:ties:dpi:v1")
        protected ReportableSellerType.RelevantActivities.ImmovableProperty immovableProperty;
        @XmlElement(name = "PersonalServices", namespace = "urn:oecd:ties:dpi:v1")
        protected OtherActivitiesType personalServices;
        @XmlElement(name = "SaleOfGoods", namespace = "urn:oecd:ties:dpi:v1")
        protected OtherActivitiesType saleOfGoods;
        @XmlElement(name = "TransportationRental", namespace = "urn:oecd:ties:dpi:v1")
        protected OtherActivitiesType transportationRental;

        /**
         * Gets the value of the immovableProperty property.
         * 
         * @return
         *     possible object is
         *     {@link ReportableSellerType.RelevantActivities.ImmovableProperty }
         *     
         */
        public ReportableSellerType.RelevantActivities.ImmovableProperty getImmovableProperty() {
            return this.immovableProperty;
        }

        /**
         * Sets the value of the immovableProperty property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReportableSellerType.RelevantActivities.ImmovableProperty }
         *     
         */
        public void setImmovableProperty(final ReportableSellerType.RelevantActivities.ImmovableProperty value) {
            this.immovableProperty = value;
        }

        /**
         * Gets the value of the personalServices property.
         * 
         * @return
         *     possible object is
         *     {@link OtherActivitiesType }
         *     
         */
        public OtherActivitiesType getPersonalServices() {
            return this.personalServices;
        }

        /**
         * Sets the value of the personalServices property.
         * 
         * @param value
         *     allowed object is
         *     {@link OtherActivitiesType }
         *     
         */
        public void setPersonalServices(final OtherActivitiesType value) {
            this.personalServices = value;
        }

        /**
         * Gets the value of the saleOfGoods property.
         * 
         * @return
         *     possible object is
         *     {@link OtherActivitiesType }
         *     
         */
        public OtherActivitiesType getSaleOfGoods() {
            return this.saleOfGoods;
        }

        /**
         * Sets the value of the saleOfGoods property.
         * 
         * @param value
         *     allowed object is
         *     {@link OtherActivitiesType }
         *     
         */
        public void setSaleOfGoods(final OtherActivitiesType value) {
            this.saleOfGoods = value;
        }

        /**
         * Gets the value of the transportationRental property.
         * 
         * @return
         *     possible object is
         *     {@link OtherActivitiesType }
         *     
         */
        public OtherActivitiesType getTransportationRental() {
            return this.transportationRental;
        }

        /**
         * Sets the value of the transportationRental property.
         * 
         * @param value
         *     allowed object is
         *     {@link OtherActivitiesType }
         *     
         */
        public void setTransportationRental(final OtherActivitiesType value) {
            this.transportationRental = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="PropertyListing" type="{urn:oecd:ties:dpi:v1}PropertyListingType" maxOccurs="unbounded"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "propertyListing"
        })
        public static class ImmovableProperty {

            @XmlElement(name = "PropertyListing", namespace = "urn:oecd:ties:dpi:v1", required = true)
            protected List<PropertyListingType> propertyListing;

            /**
             * Gets the value of the propertyListing property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a <CODE>set</CODE> method for the propertyListing property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPropertyListing().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PropertyListingType }
             * 
             * 
             */
            public List<PropertyListingType> getPropertyListing() {
                if (this.propertyListing == null) {
					this.propertyListing = new ArrayList<>();
                }
                return this.propertyListing;
            }

        }

    }

}
