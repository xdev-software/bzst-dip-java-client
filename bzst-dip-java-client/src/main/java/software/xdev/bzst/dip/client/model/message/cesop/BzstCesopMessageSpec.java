package software.xdev.bzst.dip.client.model.message.cesop;

import java.time.ZonedDateTime;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import software.xdev.bzst.dip.client.xmldocument.model.cesop.MSCountryCodeType;
import software.xdev.bzst.dip.client.xmldocument.model.cesop.MessageSpecType;
import software.xdev.bzst.dip.client.xmldocument.model.cesop.MessageTypeIndicType;
import software.xdev.bzst.dip.client.xmldocument.model.cesop.MessageTypeType;
import software.xdev.bzst.dip.client.xmldocument.model.cesop.ReportingPeriodType;


/**
 * @param transmittingCountry Country ID (e.g. DE, FR, EN).
 * @param messageType         Type if the message is filled with payment data or validation result. PMT = "Payment data"
 *                            or "No Payment data" and VLD = Validation Result message.
 * @param messageTypeIndic    Says if the report data are new data, corrections / deletions for last sent data or no
 *                            data reported (e.g. "CESOP100").
 * @param messageRefId        UUID from the report/message. This identify the report if the sender or the receiver do
 *                            corrections later.
 * @param corrMessageRefId    Correlation Message Reference ID.
 * @param reportingPeriod     defines the quarter and year to which the payment data provided by the payment service
 *                            provider pertains.
 * @param timestamp           Timestamp define the exact date and time the report was created.
 */
public record BzstCesopMessageSpec(String transmittingCountry,
								   String messageType,
								   String messageTypeIndic,
								   String messageRefId,
								   String corrMessageRefId,
								   BzstCesopReportingPeriod reportingPeriod,
								   ZonedDateTime timestamp)
{
	public MessageSpecType toXmlType() throws DatatypeConfigurationException
	{
		final MessageSpecType messageSpecType = new MessageSpecType();
		
		messageSpecType.setTransmittingCountry(MSCountryCodeType.fromValue(this.transmittingCountry));
		messageSpecType.setMessageType(MessageTypeType.fromValue(this.messageType));
		messageSpecType.setMessageTypeIndic(MessageTypeIndicType.fromValue(this.messageTypeIndic));
		messageSpecType.setMessageRefId(this.messageRefId);
		messageSpecType.setCorrMessageRefId(this.corrMessageRefId);
		
		final ReportingPeriodType reportingPeriodType = new ReportingPeriodType();
		reportingPeriodType.setQuarter(this.reportingPeriod.quarter());
		reportingPeriodType.setYear(this.reportingPeriod.year());
		messageSpecType.setReportingPeriod(reportingPeriodType);
		
		final GregorianCalendar gregorianCalendar = GregorianCalendar.from(this.timestamp);
		final XMLGregorianCalendar xmlGregorianCalendar =
			DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
		
		messageSpecType.setTimestamp(xmlGregorianCalendar);
		
		return messageSpecType;
	}
}
