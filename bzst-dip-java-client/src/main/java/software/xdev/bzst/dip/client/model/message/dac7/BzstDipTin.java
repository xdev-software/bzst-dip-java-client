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
package software.xdev.bzst.dip.client.model.message.dac7;

import software.xdev.bzst.dip.client.xmldocument.model.TINType;


public record BzstDipTin(
	String steuerId,
	BzstDipCountryCode issuedBy,
	Boolean unknown
)
{
	public TINType toXmlType()
	{
		final TINType tinType = new TINType();
		tinType.setIssuedBy(this.issuedBy.toXmlType());
		tinType.setValue(this.steuerId);
		tinType.setUnknown(this.unknown);
		return tinType;
	}
}
