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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorrectableAdditionalInfo_Type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CorrectableAdditionalInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocSpec" type="{urn:oecd:ties:dpistf:v1}DocSpec_Type"/&gt;
 *         &lt;element name="OtherInfo" type="{urn:oecd:ties:dpistf:v1}StringMin1Max4000WithLang_Type"
 *         maxOccurs="unbounded"/&gt;
 *         &lt;element name="ResCountryCode" type="{urn:oecd:ties:isodpitypes:v1}CountryCode_Type"
 *         maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrectableAdditionalInfo_Type", namespace = "urn:oecd:ties:dpi:v1", propOrder = {
	"docSpec",
	"otherInfo",
	"resCountryCode"
})
public class CorrectableAdditionalInfoType
{
	
	@XmlElement(name = "DocSpec", namespace = "urn:oecd:ties:dpi:v1", required = true)
	protected DocSpecType docSpec;
	@XmlElement(name = "OtherInfo", namespace = "urn:oecd:ties:dpi:v1", required = true)
	protected List<StringMin1Max4000WithLangType> otherInfo;
	@XmlElement(name = "ResCountryCode", namespace = "urn:oecd:ties:dpi:v1")
	@XmlSchemaType(name = "string")
	protected List<CountryCodeType> resCountryCode;
	
	/**
	 * Gets the value of the docSpec property.
	 *
	 * @return possible object is {@link DocSpecType }
	 */
	public DocSpecType getDocSpec()
	{
		return this.docSpec;
	}
	
	/**
	 * Sets the value of the docSpec property.
	 *
	 * @param value allowed object is {@link DocSpecType }
	 */
	public void setDocSpec(final DocSpecType value)
	{
		this.docSpec = value;
	}
	
	/**
	 * Gets the value of the otherInfo property.
	 *
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
	 * make to
	 * the returned list will be present inside the Jakarta XML Binding object. This is why there is not a
	 * <CODE>set</CODE> method for the otherInfo property.
	 *
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getOtherInfo().add(newItem);
	 * </pre>
	 *
	 *
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link StringMin1Max4000WithLangType }
	 */
	public List<StringMin1Max4000WithLangType> getOtherInfo()
	{
		if(this.otherInfo == null)
		{
			this.otherInfo = new ArrayList<>();
		}
		return this.otherInfo;
	}
	
	/**
	 * Gets the value of the resCountryCode property.
	 *
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
	 * make to
	 * the returned list will be present inside the Jakarta XML Binding object. This is why there is not a
	 * <CODE>set</CODE> method for the resCountryCode property.
	 *
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getResCountryCode().add(newItem);
	 * </pre>
	 *
	 *
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link CountryCodeType }
	 */
	public List<CountryCodeType> getResCountryCode()
	{
		if(this.resCountryCode == null)
		{
			this.resCountryCode = new ArrayList<>();
		}
		return this.resCountryCode;
	}
}
