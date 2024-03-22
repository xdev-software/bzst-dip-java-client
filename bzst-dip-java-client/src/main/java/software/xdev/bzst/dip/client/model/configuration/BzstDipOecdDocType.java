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
package software.xdev.bzst.dip.client.model.configuration;

import software.xdev.bzst.dip.client.xmldocument.model.OECDDocTypeIndicEnumType;


public enum BzstDipOecdDocType
{
	/**
	 * Resent Data
	 */
	OECD_0,
	
	/**
	 * New Data
	 */
	OECD_1,
	
	/**
	 * Corrected Data
	 */
	OECD_2,
	
	/**
	 * Deletion of Data
	 */
	OECD_3,
	
	/**
	 * Resent Test Data
	 */
	OECD_10,
	
	/**
	 * New Test Data
	 */
	OECD_11,
	
	/**
	 * Corrected Test Data
	 */
	OECD_12,
	
	/**
	 * Deletion of Test Data
	 */
	OECD_13;
	
	public OECDDocTypeIndicEnumType toXmlType()
	{
		return switch(this)
		{
			case OECD_0 -> OECDDocTypeIndicEnumType.OECD_0;
			case OECD_1 -> OECDDocTypeIndicEnumType.OECD_1;
			case OECD_2 -> OECDDocTypeIndicEnumType.OECD_2;
			case OECD_3 -> OECDDocTypeIndicEnumType.OECD_3;
			case OECD_10 -> OECDDocTypeIndicEnumType.OECD_10;
			case OECD_11 -> OECDDocTypeIndicEnumType.OECD_11;
			case OECD_12 -> OECDDocTypeIndicEnumType.OECD_12;
			case OECD_13 -> OECDDocTypeIndicEnumType.OECD_13;
		};
	}
	
	public boolean isNewTransmission()
	{
		return this.equals(BzstDipOecdDocType.OECD_0);
	}
	
	public boolean isCorrectionOrDeletion()
	{
		return this.equals(BzstDipOecdDocType.OECD_2)
			|| this.equals(BzstDipOecdDocType.OECD_3);
	}
}
