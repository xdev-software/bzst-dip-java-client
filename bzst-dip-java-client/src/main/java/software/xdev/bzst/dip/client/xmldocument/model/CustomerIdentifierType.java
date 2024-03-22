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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerIdentifierType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CustomerIdentifierType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identityProvider" type="{http://itzbund.de/ozg/bzst/post/dip/v1/}identityProviderType"/&gt;
 *         &lt;element name="identifier" type="{http://itzbund.de/ozg/bzst/post/dip/v1/}identifierType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerIdentifierType", namespace = "http://itzbund.de/ozg/bzst/post/dip/v1/", propOrder = {
	"identityProvider",
	"identifier"
})
public class CustomerIdentifierType
{
	
	@XmlElement(namespace = "http://itzbund.de/ozg/bzst/post/dip/v1/", required = true)
	@XmlSchemaType(name = "string")
	protected IdentityProviderType identityProvider;
	@XmlElement(namespace = "http://itzbund.de/ozg/bzst/post/dip/v1/", required = true)
	protected String identifier;
	
	/**
	 * Gets the value of the identityProvider property.
	 *
	 * @return possible object is {@link IdentityProviderType }
	 */
	public IdentityProviderType getIdentityProvider()
	{
		return this.identityProvider;
	}
	
	/**
	 * Sets the value of the identityProvider property.
	 *
	 * @param value allowed object is {@link IdentityProviderType }
	 */
	public void setIdentityProvider(final IdentityProviderType value)
	{
		this.identityProvider = value;
	}
	
	/**
	 * Gets the value of the identifier property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getIdentifier()
	{
		return this.identifier;
	}
	
	/**
	 * Sets the value of the identifier property.
	 *
	 * @param value allowed object is {@link String }
	 */
	public void setIdentifier(final String value)
	{
		this.identifier = value;
	}
}
