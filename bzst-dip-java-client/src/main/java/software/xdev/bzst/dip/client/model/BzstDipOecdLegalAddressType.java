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
package software.xdev.bzst.dip.client.model;

import software.xdev.bzst.dip.client.xmldocument.model.OECDLegalAddressTypeEnumType;


public enum BzstDipOecdLegalAddressType
{
	/**
	 * residentialOrBusiness
	 */
	OECD_301,
	
	/**
	 * residential
	 */
	OECD_302,
	
	/**
	 * business
	 */
	OECD_303,
	
	/**
	 * registeredOffice
	 */
	OECD_304,
	
	/**
	 * unspecified
	 */
	OECD_305;
	
	public OECDLegalAddressTypeEnumType toXmlType()
	{
		return switch(this)
		{
			case OECD_301 -> OECDLegalAddressTypeEnumType.OECD_301;
			case OECD_302 -> OECDLegalAddressTypeEnumType.OECD_302;
			case OECD_303 -> OECDLegalAddressTypeEnumType.OECD_303;
			case OECD_304 -> OECDLegalAddressTypeEnumType.OECD_304;
			case OECD_305 -> OECDLegalAddressTypeEnumType.OECD_305;
		};
	}
}
