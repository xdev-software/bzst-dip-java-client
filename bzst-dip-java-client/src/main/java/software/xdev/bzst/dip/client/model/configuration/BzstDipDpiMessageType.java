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

import software.xdev.bzst.dip.client.xmldocument.model.DPIMessageTypeIndicEnumType;


/**
 * Defines weather new information ({@link BzstDipDpiMessageType#DPI_401}, corrective information
 * ({@link BzstDipDpiMessageType#DPI_402} or no information ({@link BzstDipDpiMessageType#DPI_403}) is contained.
 */
public enum BzstDipDpiMessageType
{
	/**
	 * The message contains new (including additional) information.
	 */
	DPI_401,
	
	/**
	 * The message contains corrections for previously sent information.
	 */
	DPI_402,
	
	/**
	 * The message advises that there is no data to report.
	 */
	DPI_403;
	
	public DPIMessageTypeIndicEnumType toXmlType()
	{
		return switch(this)
		{
			case DPI_401 -> DPIMessageTypeIndicEnumType.DPI_401;
			case DPI_402 -> DPIMessageTypeIndicEnumType.DPI_402;
			case DPI_403 -> DPIMessageTypeIndicEnumType.DPI_403;
		};
	}
}
