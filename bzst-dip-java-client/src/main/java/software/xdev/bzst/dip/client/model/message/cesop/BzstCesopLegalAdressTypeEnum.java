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
package software.xdev.bzst.dip.client.model.message.cesop;

public enum BzstCesopLegalAdressTypeEnum
{
	/**
	 * residentialOrBusiness
	 */
	CESOP_301("CESOP301"),
	
	/**
	 * residential
	 */
	CESOP_302("CESOP302"),
	
	/**
	 * business
	 */
	CESOP_303("CESOP303"),
	
	/**
	 * registeredOffice
	 */
	CESOP_304("CESOP304"),
	
	/**
	 * unspecified
	 */
	CESOP_309("CESOP309");
	
	private final String value;
	
	BzstCesopLegalAdressTypeEnum(final String v)
	{
		this.value = v;
	}
	
	public String value()
	{
		return this.value;
	}
}
