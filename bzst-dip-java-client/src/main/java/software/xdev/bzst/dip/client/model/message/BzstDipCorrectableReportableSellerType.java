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

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import software.xdev.bzst.dip.client.model.configuration.BzstDipConfiguration;
import software.xdev.bzst.dip.client.xmldocument.ReportableSellerCreator;
import software.xdev.bzst.dip.client.xmldocument.model.CorrectableReportableSellerType;


public record BzstDipCorrectableReportableSellerType(
	BzstDipCountryCode ansaessigkeitsstaat,
	BzstDipTin tin,
	String handelsregisternummer,
	String vat,
	String firstName,
	String lastName,
	LocalDate birthDate,
	BzstDipOecdLegalAddressType legalAddress,
	BzstDipAddressFix addressFix,
	BzstDipNumberOfActivities numberOfActivities,
	BzstDipConsiderations considerations,
	BzstDipFees feesType,
	BzstDipTaxes taxesType,
	String permanentEstablishments,
	String docRefUUID
)
{
	public CorrectableReportableSellerType toXmlType(final BzstDipConfiguration configuration)
	{
		final ReportableSellerCreator creator = new ReportableSellerCreator(configuration);
		return creator.createReportableSeller(
			this.ansaessigkeitsstaat.toXmlType(),
			this.tin.toXmlType(),
			this.handelsregisternummer,
			this.vat,
			this.firstName,
			this.lastName,
			this.birthDate.format(DateTimeFormatter.ISO_LOCAL_DATE),
			this.legalAddress.toXmlType(),
			this.addressFix.toXmlType(),
			this.numberOfActivities.toXmlType(),
			this.considerations.toXmlType(),
			this.feesType.toXmlType(),
			this.taxesType.toXmlType(),
			this.permanentEstablishments,
			this.docRefUUID
		);
	}
}
