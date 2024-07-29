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
 * <p>Java class for AccountHolder_Type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AccountHolder_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Individual" type="{urn:oecd:ties:dpi:v1}NameReportableSeller_Type"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="Organisation" type="{urn:oecd:ties:dpi:v1}OrganisationParty_Type"/&gt;
 *             &lt;element name="AcctHolderType" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountHolder_Type", namespace = "urn:oecd:ties:dpi:v1", propOrder = {
	"individual",
	"organisation",
	"acctHolderType"
})
public class AccountHolderType
{
	
	@XmlElement(name = "Individual", namespace = "urn:oecd:ties:dpi:v1")
	protected NameReportableSellerType individual;
	@XmlElement(name = "Organisation", namespace = "urn:oecd:ties:dpi:v1")
	protected OrganisationPartyType organisation;
	@XmlElement(name = "AcctHolderType", namespace = "urn:oecd:ties:dpi:v1")
	protected Object acctHolderType;
	
	/**
	 * Gets the value of the individual property.
	 *
	 * @return possible object is {@link NameReportableSellerType }
	 */
	public NameReportableSellerType getIndividual()
	{
		return this.individual;
	}
	
	/**
	 * Sets the value of the individual property.
	 *
	 * @param value allowed object is {@link NameReportableSellerType }
	 */
	public void setIndividual(final NameReportableSellerType value)
	{
		this.individual = value;
	}
	
	/**
	 * Gets the value of the organisation property.
	 *
	 * @return possible object is {@link OrganisationPartyType }
	 */
	public OrganisationPartyType getOrganisation()
	{
		return this.organisation;
	}
	
	/**
	 * Sets the value of the organisation property.
	 *
	 * @param value allowed object is {@link OrganisationPartyType }
	 */
	public void setOrganisation(final OrganisationPartyType value)
	{
		this.organisation = value;
	}
	
	/**
	 * Gets the value of the acctHolderType property.
	 *
	 * @return possible object is {@link Object }
	 */
	public Object getAcctHolderType()
	{
		return this.acctHolderType;
	}
	
	/**
	 * Sets the value of the acctHolderType property.
	 *
	 * @param value allowed object is {@link Object }
	 */
	public void setAcctHolderType(final Object value)
	{
		this.acctHolderType = value;
	}
}
