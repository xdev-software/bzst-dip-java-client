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

public enum BzstCesopTransactionDateTypeEnum
{
	/**
	 * Execution Date
	 */
	CESOP_701("CESOP701"),
	
	/**
	 * Clearing Date
	 */
	CESOP_702("CESOP702"),
	
	/**
	 * Authorisation Date
	 */
	CESOP_703("CESOP703"),
	
	/**
	 * Purchase Date
	 */
	CESOP_704("CESOP704"),
	
	/**
	 * Other Date
	 */
	CESOP_709("CESOP709");
	private final String value;
	
	BzstCesopTransactionDateTypeEnum(final String v)
	{
		this.value = v;
	}
	
	public String value()
	{
		return this.value;
	}
}
