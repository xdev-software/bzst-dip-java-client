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

import software.xdev.bzst.dip.client.xmldocument.model.ConsiderationType;


public record BzstDipConsiderations(
	BzstDipMonetaryAmount considerationQuarter1,
	BzstDipMonetaryAmount considerationQuarter2,
	BzstDipMonetaryAmount considerationQuarter3,
	BzstDipMonetaryAmount considerationQuarter4
)
{
	public ConsiderationType toXmlType()
	{
		final ConsiderationType considerationType = new ConsiderationType();
		considerationType.setConsQ1(this.considerationQuarter1.toXmlType());
		considerationType.setConsQ2(this.considerationQuarter2.toXmlType());
		considerationType.setConsQ3(this.considerationQuarter3.toXmlType());
		considerationType.setConsQ4(this.considerationQuarter4.toXmlType());
		return considerationType;
	}
}
