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
package software.xdev.bzst.dip.client.xmldocument;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import software.xdev.bzst.dip.client.model.configuration.BzstDipConfiguration;
import software.xdev.bzst.dip.client.model.configuration.BzstDipOecdDocType;
import software.xdev.bzst.dip.client.xmldocument.model.AddressFixType;
import software.xdev.bzst.dip.client.xmldocument.model.AddressType;
import software.xdev.bzst.dip.client.xmldocument.model.ConsignmentItemType;
import software.xdev.bzst.dip.client.xmldocument.model.CorrectablePlatformOperatorType;
import software.xdev.bzst.dip.client.xmldocument.model.CorrectableReportableSellerType;
import software.xdev.bzst.dip.client.xmldocument.model.CountryCodeType;
import software.xdev.bzst.dip.client.xmldocument.model.DPIBodyType;
import software.xdev.bzst.dip.client.xmldocument.model.DPIOECD;
import software.xdev.bzst.dip.client.xmldocument.model.DataType;
import software.xdev.bzst.dip.client.xmldocument.model.DipBodyType;
import software.xdev.bzst.dip.client.xmldocument.model.DocSpecType;
import software.xdev.bzst.dip.client.xmldocument.model.MessageSpecType;
import software.xdev.bzst.dip.client.xmldocument.model.MessageTypeEnumType;
import software.xdev.bzst.dip.client.xmldocument.model.NameOrganisationType;
import software.xdev.bzst.dip.client.xmldocument.model.NexusEnumType;
import software.xdev.bzst.dip.client.xmldocument.model.OECDLegalAddressTypeEnumType;
import software.xdev.bzst.dip.client.xmldocument.model.ObjectFactory;
import software.xdev.bzst.dip.client.xmldocument.model.TINType;
import software.xdev.bzst.dip.client.xmldocument.model.cesop.CESOP;


public class XMLDocumentBodyCreator
{
	private static final Logger LOGGER = LoggerFactory.getLogger(XMLDocumentBodyCreator.class);
	private final BzstDipConfiguration configuration;
	
	public XMLDocumentBodyCreator(final BzstDipConfiguration configuration)
	{
		this.configuration = configuration;
	}
	
	public DipBodyType createBody(
		final List<CorrectableReportableSellerType> correctableReportableSellerTypes,
		final CorrectablePlatformOperatorType platformOperatorType)
	{
		final DipBodyType dipBodyType = new DipBodyType();
		dipBodyType.getConsignmentItem()
			.add(this.createConsignmentItem(correctableReportableSellerTypes, platformOperatorType));
		return dipBodyType;
	}
	
	private ConsignmentItemType createConsignmentItem(
		final List<CorrectableReportableSellerType> correctableReportableSellerTypes,
		final CorrectablePlatformOperatorType platformOperatorType
	)
	{
		final ConsignmentItemType consignmentItem = new ConsignmentItemType();
		consignmentItem.setData(this.createData(correctableReportableSellerTypes, platformOperatorType));
		
		return consignmentItem;
	}
	
	private Object createData(
		final List<CorrectableReportableSellerType> correctableReportableSellerTypes,
		final CorrectablePlatformOperatorType platformOperatorType)
	{
		LOGGER.debug("Creating data...");
		
		final DataType dataType = new DataType();
		
		if(this.configuration.getApplicationCode().equals(BzstDipConfiguration.SupportedApplicationCode.DAC7))
		{
			final DPIOECD dpioecd = new DPIOECD();
			dpioecd.setMessageSpec(this.createMessageSpecDac7());
			dpioecd.getDPIBody().add(this.createDPIBody(correctableReportableSellerTypes, platformOperatorType));
			dpioecd.setVersion("1.0");
			dataType.setDpioecd(dpioecd);
		}
		else if(this.configuration.getApplicationCode().equals(BzstDipConfiguration.SupportedApplicationCode.CESOP))
		{
			final CESOP cesop = new CESOP();
			cesop.setMessageSpec(this.createMessageSpecCesop());
			// TODO
			dataType.setCesop(cesop);
		}
		else
		{
			throw new IllegalArgumentException(
				"Unsupported application code: " + this.configuration.getApplicationCode()
			);
		}
		
		return dataType;
	}
	
	private DPIBodyType createDPIBody(
		final List<CorrectableReportableSellerType> correctableReportableSellerTypes,
		final CorrectablePlatformOperatorType platformOperatorType)
	{
		LOGGER.debug("Creating DPIBody...");
		
		final DPIBodyType dpiBodyType = new DPIBodyType();
		dpiBodyType.setPlatformOperator(platformOperatorType);
		
		final String docRefId = dpiBodyType.getPlatformOperator().getDocSpec().getDocRefId();
		
		LOGGER.debug(
			"If you wish to correct or delete the following xml data, then copy this ID into the configuration file "
				+ "under PlatformOperator_CorrDocRefId. : '{}'",
			docRefId);
		
		LOGGER.debug(
			"If you wish to overwrite the following xml data, then copy this ID into the configuration file under "
				+ "PlatformOperator_DocRefId. : '{}'",
			docRefId);
		
		dpiBodyType.getReportableSeller().addAll(correctableReportableSellerTypes);
		
		return dpiBodyType;
	}
	
	
	
	private static DocSpecType createPlatformDocSpec(final BzstDipConfiguration configuration)
	{
		final BzstDipOecdDocType docTypeIndic = configuration.getDocType();
		
		LOGGER.debug("Using DocTypeIndic: {}", docTypeIndic);
		final DocSpecType specType = new DocSpecType();
		String docRefId = buildDocRefId(UUID.randomUUID().toString(), configuration.getReportingPeriod());
		specType.setDocRefId(docRefId);
		specType.setDocTypeIndic(docTypeIndic.toXmlType());
		
		// New transmission
		if(docTypeIndic.isNewTransmission())
		{
			// Just used for new transmission
			docRefId = configuration.getPlatformOperatorDocRefId();
			specType.setDocRefId(docRefId);
		}
		// Correction or deletion
		else if(docTypeIndic.isCorrectionOrDeletion())
		{
			// Just used for correction or deletion
			final String corrDocRefId = configuration.getPlatformOperatorCorrDocRefId();
			specType.setCorrDocRefId(corrDocRefId);
		}
		
		return specType;
	}
	
	public static CorrectablePlatformOperatorType createPlatformOperatorFromConfiguration(
		final BzstDipConfiguration configuration
	)
	{
		LOGGER.debug("Creating platform operator...");
		
		final CorrectablePlatformOperatorType correctablePlatformOperatorType = new CorrectablePlatformOperatorType();
		correctablePlatformOperatorType.getResCountryCode().add(CountryCodeType.DE);
		
		final TINType tinType = new TINType();
		tinType.setIssuedBy(CountryCodeType.DE);
		
		tinType.setValue(configuration.getTaxID());
		correctablePlatformOperatorType.getTIN().add(tinType);
		
		final NameOrganisationType name = new NameOrganisationType();
		name.setValue(configuration.getPlatformOperatorOrganizationName());
		correctablePlatformOperatorType.getName().add(name);
		correctablePlatformOperatorType.getPlatformBusinessName().add(configuration.getPlatformOperatorPlatformName());
		correctablePlatformOperatorType.getAddress().add(
			createAddress(
				configuration.getPlatformOperatorAddress().toXmlType(),
				OECDLegalAddressTypeEnumType.OECD_304
			)
		);
		correctablePlatformOperatorType.setNexus(NexusEnumType.RPONEX_1);
		correctablePlatformOperatorType.setAssumedReporting(false);
		correctablePlatformOperatorType.setDocSpec(createPlatformDocSpec(configuration));
		
		return correctablePlatformOperatorType;
	}
	
	
	
	protected static AddressType createAddress(
		final AddressFixType address,
		final OECDLegalAddressTypeEnumType legalAddressTypeEnumType)
	{
		final AddressType addressType = new AddressType();
		addressType.setLegalAddressType(legalAddressTypeEnumType);
		
		final ObjectFactory objectFactory = new ObjectFactory();
		addressType.getContent().add(objectFactory.createAddressTypeCountryCode(CountryCodeType.DE));
		addressType.getContent().add(objectFactory.createAddressTypeAddressFix(address));
		
		return addressType;
	}
	
	private software.xdev.bzst.dip.client.xmldocument.model.cesop.MessageSpecType createMessageSpecCesop()
	{
		LOGGER.debug("Creating messageSpec...");
		
		// TODO
	}
	
	private MessageSpecType createMessageSpecDac7()
	{
		LOGGER.debug("Creating messageSpec...");
		
		final MessageSpecType messageSpecType = new MessageSpecType();
		
		messageSpecType.setSendingEntityIN(this.configuration.getTaxID());
		messageSpecType.setTransmittingCountry(CountryCodeType.DE);
		messageSpecType.setReceivingCountry(CountryCodeType.DE);
		messageSpecType.setMessageType(MessageTypeEnumType.DPI);
		/*
		 * Das Freitextfeld enthält den eindeutigen Bezeichner des
		 * Übermittlers für die Meldung. Hierdurch wird für den
		 * Übermittler und den Empfänger eine spätere Identifikation der
		 * Meldung, z.B. bei Fragen, ermöglicht. Die MessageRefId
		 * muss mit dem Staatencode des übermittelnden Staates
		 * beginnen. Danach folgt das Meldejahr, der Staatencode des
		 * Empfängerstaates und ein eindeutiger Bezeichner.
		 * z.B. DE2023DE1234567
		 */
		
		final LocalDate reportingPeriod = this.configuration.getReportingPeriod();
		messageSpecType.setMessageRefId(createMessageRefId(reportingPeriod));
		messageSpecType.setMessageTypeIndic(this.configuration.getMessageTypeIndic().toXmlType());
		
		messageSpecType.setReportingPeriod(
			XMLDocumentCreator.parseLocalDateToXMLGregorianCalendarDate(this.configuration.getReportingPeriod())
		);
		
		messageSpecType.setTimestamp(
			XMLDocumentCreator.parseLocalDateToXMLGregorianCalendarDateTime(LocalDateTime.now())
		);
		
		return messageSpecType;
	}
	
	private static String createMessageRefId(final LocalDate reportYear)
	{
		final String messageRefId = "DE" + reportYear.getYear() + "DE" + UUID.randomUUID();
		LOGGER.debug("Created messageRefId '{}'.", messageRefId);
		
		return messageRefId;
	}
	
	public static String buildDocRefId(final String docRefUUID, final LocalDate reportingPeriod)
	{
		return "DE" + reportingPeriod.getYear() + "-" + docRefUUID;
	}
}
