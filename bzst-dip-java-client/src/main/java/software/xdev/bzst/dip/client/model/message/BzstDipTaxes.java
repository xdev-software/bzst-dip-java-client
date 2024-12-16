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

import software.xdev.bzst.dip.client.xmldocument.model.TaxesType;


/**
 * From <a
 * href="https://www.oecd.org/tax/exchange-of-tax-information/model-rules-for-reporting-by-digital-platform-operators
 * -xml-schema-user-guide-for-tax-administrations.pdf" >Model Rules for Reporting by Digital Platform
 * Operators</a>:<br>
 * <p>
 * The Taxes element specifies the taxes that a Reporting Platform Operator has withheld in respect of a Reportable
 * Seller. It is further split into four elements, representing the quarters in respect of which reporting of taxes
 * withheld by the Reporting Platform Operator.
 */
public record BzstDipTaxes(
	BzstDipMonetaryAmount taxesQuarter1,
	BzstDipMonetaryAmount taxesQuarter2,
	BzstDipMonetaryAmount taxesQuarter3,
	BzstDipMonetaryAmount taxesQuarter4
)
{
	public TaxesType toXmlType()
	{
		final TaxesType taxesType = new TaxesType();
		taxesType.setTaxQ1(this.taxesQuarter1().toXmlType());
		taxesType.setTaxQ2(this.taxesQuarter2().toXmlType());
		taxesType.setTaxQ3(this.taxesQuarter3().toXmlType());
		taxesType.setTaxQ4(this.taxesQuarter4().toXmlType());
		return taxesType;
	}
}
