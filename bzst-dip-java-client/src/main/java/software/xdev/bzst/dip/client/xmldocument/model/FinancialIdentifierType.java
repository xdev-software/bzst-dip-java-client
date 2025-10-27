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

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The Financial Identifier is an optional (mandatory) element that reflects the Financial Account Identifier which,
 * under the OECD Model Rules or [EU Specific] [EU DIR2021/514], is the unique identifying number or reference available
 * to the Reporting Platform Operator of the bank account or other payment account to which the Consideration is paid or
 * credited. Under subparagraphs B(2)(c) and B(3)(c) of Section III of the OECD Model Rules or [EU Specific]
 * subparagraphs B(2)(b) and B(3)(b) of Section III of [EU DIR2021/514], the Financial Identifier must be reported and
 * exchanged provided that it is available to the Reporting Platform Operator and that the jurisdiction of the
 * Reportable Seller’s residence has indicated that it wishes to receive such Financial Identifiers for taxpayer
 * matching purposes.
 *
 * <p>Java class for FinancialIdentifier_Type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="FinancialIdentifier_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Identifier" type="{urn:oecd:ties:dpi:v1}Identifier_Type"/&gt;
 *         &lt;element name="AccountHolderName" type="{urn:oecd:ties:dpistf:v1}StringMin1Max200_Type" minOccurs="0"/&gt;
 *         &lt;element name="OtherInfo" type="{urn:oecd:ties:dpistf:v1}StringMin1Max400_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialIdentifier_Type", namespace = "urn:oecd:ties:dpi:v1", propOrder = {
	"identifier",
	"accountHolderName",
	"otherInfo"
})
public class FinancialIdentifierType
{
	
	@XmlElement(name = "Identifier", namespace = "urn:oecd:ties:dpi:v1", required = true)
	protected IdentifierType identifier;
	@XmlElement(name = "AccountHolderName", namespace = "urn:oecd:ties:dpi:v1")
	protected String accountHolderName;
	@XmlElement(name = "OtherInfo", namespace = "urn:oecd:ties:dpi:v1")
	protected String otherInfo;
	
	/**
	 * Gets the value of the identifier property.
	 *
	 * @return possible object is {@link IdentifierType }
	 */
	public IdentifierType getIdentifier()
	{
		return this.identifier;
	}
	
	/**
	 * Sets the value of the identifier property.
	 *
	 * @param value allowed object is {@link IdentifierType }
	 */
	public void setIdentifier(final IdentifierType value)
	{
		this.identifier = value;
	}
	
	/**
	 * Gets the value of the accountHolderName property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getAccountHolderName()
	{
		return this.accountHolderName;
	}
	
	/**
	 * Sets the value of the accountHolderName property.
	 *
	 * @param value allowed object is {@link String }
	 */
	public void setAccountHolderName(final String value)
	{
		this.accountHolderName = value;
	}
	
	/**
	 * Gets the value of the otherInfo property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getOtherInfo()
	{
		return this.otherInfo;
	}
	
	/**
	 * Sets the value of the otherInfo property.
	 *
	 * @param value allowed object is {@link String }
	 */
	public void setOtherInfo(final String value)
	{
		this.otherInfo = value;
	}
}
