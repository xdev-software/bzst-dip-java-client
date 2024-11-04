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

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MessageSpec_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MessageSpec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransmittingCountry" type="{urn:eu:taxud:isotypes:v1}MSCountryCode_Type"/&gt;
 *         &lt;element name="MessageType" type="{urn:ec.europa.eu:taxud:fiscalis:cesop:v1}MessageType_Type"/&gt;
 *         &lt;element name="MessageTypeIndic" type="{urn:ec.europa.eu:taxud:fiscalis:cesop:v1}MessageTypeIndic_Type"/&gt;
 *         &lt;element name="MessageRefId" type="{urn:eu:taxud:commontypes:v1}UUID"/&gt;
 *         &lt;element name="CorrMessageRefId" type="{urn:eu:taxud:commontypes:v1}UUID" minOccurs="0"/&gt;
 *         &lt;element name="SendingPSP" type="{urn:ec.europa.eu:taxud:fiscalis:cesop:v1}PSP_Type" minOccurs="0"/&gt;
 *         &lt;element name="ReportingPeriod" type="{urn:ec.europa.eu:taxud:fiscalis:cesop:v1}ReportingPeriod_Type"/&gt;
 *         &lt;element name="Timestamp" type="{urn:eu:taxud:commontypes:v1}dateTimeWithRequiredTimeZone"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageSpec_Type", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1", propOrder = {
    "transmittingCountry",
    "messageType",
    "messageTypeIndic",
    "messageRefId",
    "corrMessageRefId",
    "sendingPSP",
    "reportingPeriod",
    "timestamp"
})
public class MessageSpecType {

    @XmlElement(name = "TransmittingCountry", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1", required = true)
    @XmlSchemaType(name = "string")
    protected MSCountryCodeType transmittingCountry;
    @XmlElement(name = "MessageType", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1", required = true)
    @XmlSchemaType(name = "string")
    protected MessageTypeType messageType;
    @XmlElement(name = "MessageTypeIndic", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1", required = true)
    @XmlSchemaType(name = "string")
    protected MessageTypeIndicType messageTypeIndic;
    @XmlElement(name = "MessageRefId", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1", required = true)
    protected String messageRefId;
    @XmlElement(name = "CorrMessageRefId", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1")
    protected String corrMessageRefId;
    @XmlElement(name = "SendingPSP", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1")
    protected PSPType sendingPSP;
    @XmlElement(name = "ReportingPeriod", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1", required = true)
    protected ReportingPeriodType reportingPeriod;
    @XmlElement(name = "Timestamp", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;

    /**
     * Ruft den Wert der transmittingCountry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MSCountryCodeType }
     *     
     */
    public MSCountryCodeType getTransmittingCountry() {
        return transmittingCountry;
    }

    /**
     * Legt den Wert der transmittingCountry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MSCountryCodeType }
     *     
     */
    public void setTransmittingCountry(MSCountryCodeType value) {
        this.transmittingCountry = value;
    }

    /**
     * Ruft den Wert der messageType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MessageTypeType }
     *     
     */
    public MessageTypeType getMessageType() {
        return messageType;
    }

    /**
     * Legt den Wert der messageType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageTypeType }
     *     
     */
    public void setMessageType(MessageTypeType value) {
        this.messageType = value;
    }

    /**
     * Ruft den Wert der messageTypeIndic-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MessageTypeIndicType }
     *     
     */
    public MessageTypeIndicType getMessageTypeIndic() {
        return messageTypeIndic;
    }

    /**
     * Legt den Wert der messageTypeIndic-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageTypeIndicType }
     *     
     */
    public void setMessageTypeIndic(MessageTypeIndicType value) {
        this.messageTypeIndic = value;
    }

    /**
     * Ruft den Wert der messageRefId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageRefId() {
        return messageRefId;
    }

    /**
     * Legt den Wert der messageRefId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageRefId(String value) {
        this.messageRefId = value;
    }

    /**
     * Ruft den Wert der corrMessageRefId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrMessageRefId() {
        return corrMessageRefId;
    }

    /**
     * Legt den Wert der corrMessageRefId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrMessageRefId(String value) {
        this.corrMessageRefId = value;
    }

    /**
     * Ruft den Wert der sendingPSP-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PSPType }
     *     
     */
    public PSPType getSendingPSP() {
        return sendingPSP;
    }

    /**
     * Legt den Wert der sendingPSP-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PSPType }
     *     
     */
    public void setSendingPSP(PSPType value) {
        this.sendingPSP = value;
    }

    /**
     * Ruft den Wert der reportingPeriod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReportingPeriodType }
     *     
     */
    public ReportingPeriodType getReportingPeriod() {
        return reportingPeriod;
    }

    /**
     * Legt den Wert der reportingPeriod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingPeriodType }
     *     
     */
    public void setReportingPeriod(ReportingPeriodType value) {
        this.reportingPeriod = value;
    }

    /**
     * Ruft den Wert der timestamp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Legt den Wert der timestamp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

}
