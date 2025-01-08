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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java-Klasse für TransactionDate_Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TransactionDate_Type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:eu:taxud:commontypes:v1&gt;dateTimeWithRequiredTimeZone"&gt;
 *       &lt;attribute name="transactionDateType" use="required" type="{urn:eu:taxud:commontypes:v1}TransactionDateType_Type" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionDate_Type", namespace = "urn:eu:taxud:commontypes:v1", propOrder = {
    "value"
})
public class TransactionDateType {

    @XmlValue
    protected XMLGregorianCalendar value;
    @XmlAttribute(name = "transactionDateType", required = true)
    protected TransactionDateTypeType transactionDateType;

    /**
     * Date and time format with time zone.
     * 			This element provides the date, the time of the day (second or milisecond-precise) as specified in [ISO-8601] and the time zone: 'YYYY-MM-DDThh:mm:ss.SSSZ' if the time refers to the UTC time zone, otherwise 'YYYY-MM-DDThh:mm:ss.SSS-hh:mm' where hh:mm is the time shift from the UTC time zone. Note that the milliseconds part ".SSS" is optional may be omitted.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValue(XMLGregorianCalendar value) {
        this.value = value;
    }

    /**
     * Ruft den Wert der transactionDateType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransactionDateTypeType }
     *     
     */
    public TransactionDateTypeType getTransactionDateType() {
        return transactionDateType;
    }

    /**
     * Legt den Wert der transactionDateType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDateTypeType }
     *     
     */
    public void setTransactionDateType(TransactionDateTypeType value) {
        this.transactionDateType = value;
    }

}
