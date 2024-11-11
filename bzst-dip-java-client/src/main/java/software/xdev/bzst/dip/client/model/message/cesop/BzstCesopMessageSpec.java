package software.xdev.bzst.dip.client.model.message.cesop;

import software.xdev.bzst.dip.client.xmldocument.model.AddressFixType;
import software.xdev.bzst.dip.client.xmldocument.model.cesop.MessageSpecType;


public record BzstCesopMessageSpec(String transmittingCountry, BzstCesopReportingPeriod reportingPeriod)
{
	public MessageSpecType toXmlType()
	{
	
	}
}
