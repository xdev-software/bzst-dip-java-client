package software.xdev.bzst.dip.client.model.message.cesop;

import java.time.format.DateTimeFormatter;

import software.xdev.bzst.dip.client.model.configuration.BzstDipConfiguration;
import software.xdev.bzst.dip.client.xmldocument.ReportableSellerCreator;
import software.xdev.bzst.dip.client.xmldocument.model.CorrectableReportableSellerType;


public class BzstCesopDipCorrectableReportableSellerType
{
	public CorrectableReportableSellerType toXmlType(final BzstDipConfiguration configuration)
	{
		final ReportableSellerCreator creator = new ReportableSellerCreator(configuration);
		return creator.createReportableSeller(
			this.ansaessigkeitsstaat.toXmlType(),
			this.tin.toXmlType(),
			this.handelsregisternummer,
			this.vat,
			this.firstName == null ? ReportableSellerCreator.NULL_STRING : this.firstName,
			this.lastName,
			this.birthDate == null
				? ReportableSellerCreator.NULL_STRING
				: this.birthDate.format(DateTimeFormatter.ISO_LOCAL_DATE),
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
