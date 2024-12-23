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
package software.xdev.bzst.dip.client.model.message;

import software.xdev.bzst.dip.client.xmldocument.model.FeesType;


/**
 * From <a
 * href="https://www.oecd.org/tax/exchange-of-tax-information/model-rules-for-reporting-by-digital-platform-operators
 * -xml-schema-user-guide-for-tax-administrations.pdf" >Model Rules for Reporting by Digital Platform
 * Operators</a>:<br>
 * <p>
 * The Fees element specifies the fees and commissions that a Reporting Platform Operator has withheld in respect of a
 * Reportable Seller. It is split into four elements, representing the quarters in respect of which the reporting of
 * fees or commissions withheld or charged by the Reporting Platform Operator
 */
public record BzstDipFees(
	BzstDipMonetaryAmount feesQuarter1,
	BzstDipMonetaryAmount feesQuarter2,
	BzstDipMonetaryAmount feesQuarter3,
	BzstDipMonetaryAmount feesQuarter4
)
{
	public FeesType toXmlType()
	{
		final FeesType feesType = new FeesType();
		feesType.setFeesQ1(this.feesQuarter1.toXmlType());
		feesType.setFeesQ2(this.feesQuarter2.toXmlType());
		feesType.setFeesQ3(this.feesQuarter3.toXmlType());
		feesType.setFeesQ4(this.feesQuarter4.toXmlType());
		return feesType;
	}
}
