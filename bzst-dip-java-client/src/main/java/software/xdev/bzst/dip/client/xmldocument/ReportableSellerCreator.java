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
import java.time.format.DateTimeFormatter;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import software.xdev.bzst.dip.client.model.configuration.BzstDipConfiguration;
import software.xdev.bzst.dip.client.model.configuration.BzstDipOecdDocType;
import software.xdev.bzst.dip.client.xmldocument.model.AddressFixType;
import software.xdev.bzst.dip.client.xmldocument.model.ConsiderationType;
import software.xdev.bzst.dip.client.xmldocument.model.CorrectableReportableSellerType;
import software.xdev.bzst.dip.client.xmldocument.model.CountryCodeType;
import software.xdev.bzst.dip.client.xmldocument.model.DocSpecType;
import software.xdev.bzst.dip.client.xmldocument.model.FeesType;
import software.xdev.bzst.dip.client.xmldocument.model.INTypeEnumType;
import software.xdev.bzst.dip.client.xmldocument.model.MSCountryCodeType;
import software.xdev.bzst.dip.client.xmldocument.model.NameOrganisationType;
import software.xdev.bzst.dip.client.xmldocument.model.NamePersonType;
import software.xdev.bzst.dip.client.xmldocument.model.NumberOfActivitiesType;
import software.xdev.bzst.dip.client.xmldocument.model.OECDDocTypeIndicEnumType;
import software.xdev.bzst.dip.client.xmldocument.model.OECDLegalAddressTypeEnumType;
import software.xdev.bzst.dip.client.xmldocument.model.OrganisationINType;
import software.xdev.bzst.dip.client.xmldocument.model.OrganisationPartyType;
import software.xdev.bzst.dip.client.xmldocument.model.OtherActivitiesType;
import software.xdev.bzst.dip.client.xmldocument.model.PermanentEstablishmentsType;
import software.xdev.bzst.dip.client.xmldocument.model.PersonPartyType;
import software.xdev.bzst.dip.client.xmldocument.model.ReportableSellerType;
import software.xdev.bzst.dip.client.xmldocument.model.TINType;
import software.xdev.bzst.dip.client.xmldocument.model.TaxesType;


public class ReportableSellerCreator
{
	private static final Logger LOGGER = LoggerFactory.getLogger(ReportableSellerCreator.class);
	private final BzstDipConfiguration configuration;
	
	public ReportableSellerCreator(final BzstDipConfiguration configuration)
	{
		this.configuration = configuration;
	}
	
	@SuppressWarnings("PMD.ExcessiveParameterList")
	public CorrectableReportableSellerType createReportableSeller(
		final CountryCodeType resCountryCode,
		final TINType tin,
		final String in,
		final String vat,
		final String firstName,
		final String lastName,
		final String birthDate,
		final OECDLegalAddressTypeEnumType legalAddressTypeEnumType,
		final AddressFixType addressFixType,
		final NumberOfActivitiesType numberOfActivitiesType,
		final ConsiderationType considerationType,
		final FeesType feesType,
		final TaxesType taxesType,
		final String permanentEstablishments,
		final String docRefUUID
	)
	{
		final CorrectableReportableSellerType correctableReportableSellerType = new CorrectableReportableSellerType();
		correctableReportableSellerType.setIdentity(
			createIdentity(
				resCountryCode,
				tin,
				in,
				vat,
				firstName,
				lastName,
				addressFixType,
				legalAddressTypeEnumType,
				birthDate,
				permanentEstablishments
			)
		);
		
		correctableReportableSellerType.setRelevantActivities(
			createRelevantActivities(
				numberOfActivitiesType,
				considerationType,
				feesType,
				taxesType
			)
		);
		
		correctableReportableSellerType.setDocSpec(this.createReportableSellerDocSpec(docRefUUID));
		
		return correctableReportableSellerType;
	}
	
	private DocSpecType createReportableSellerDocSpec(final String docRefUUID)
	{
		final BzstDipOecdDocType docTypeIndic = this.configuration.getDocType();
		
		LOGGER.debug("Using DocTypeIndic: {}", docTypeIndic);
		final DocSpecType specType = new DocSpecType();
		
		final LocalDate reportingPeriod = this.configuration.getReportingPeriod();
		
		// Creating new UUID if the xml document should be corrected or deleted.
		if(docTypeIndic.isCorrectionOrDeletion())
		{
			// Just used for correction or deletion
			specType.setDocRefId(XMLDocumentBodyCreator.buildDocRefId(UUID.randomUUID().toString(), reportingPeriod));
			specType.setCorrDocRefId(XMLDocumentBodyCreator.buildDocRefId(docRefUUID, reportingPeriod));
		}
		else
		{
			specType.setDocRefId(XMLDocumentBodyCreator.buildDocRefId(docRefUUID, reportingPeriod));
		}
		
		if(docTypeIndic.isNewTransmission())
		{
			specType.setDocTypeIndic(OECDDocTypeIndicEnumType.OECD_1);
		}
		else
		{
			specType.setDocTypeIndic(docTypeIndic.toXmlType());
		}
		
		return specType;
	}
	
	private static ReportableSellerType.RelevantActivities createRelevantActivities(
		final NumberOfActivitiesType numberOfActivitiesType,
		final ConsiderationType considerationType,
		final FeesType feesType,
		final TaxesType taxesType
	)
	{
		final ReportableSellerType.RelevantActivities relevantActivities =
			new ReportableSellerType.RelevantActivities();
		relevantActivities.setSaleOfGoods(
			createSaleOfGoods(
				numberOfActivitiesType,
				considerationType,
				feesType,
				taxesType
			)
		);
		
		return relevantActivities;
	}
	
	private static OtherActivitiesType createSaleOfGoods(
		final NumberOfActivitiesType numberOfActivitiesType,
		final ConsiderationType considerationType,
		final FeesType feesType,
		final TaxesType taxesType
	)
	{
		final OtherActivitiesType otherActivitiesType = new OtherActivitiesType();
		otherActivitiesType.setNumberOfActivities(numberOfActivitiesType);
		otherActivitiesType.setConsideration(considerationType);
		otherActivitiesType.setFees(feesType);
		otherActivitiesType.setTaxes(taxesType);
		
		return otherActivitiesType;
	}
	
	private static ReportableSellerType.Identity createIdentity(
		final CountryCodeType resCountryCode,
		final TINType tin,
		final String in,
		final String vat,
		final String firstName,
		final String lastName,
		final AddressFixType addressFixType,
		final OECDLegalAddressTypeEnumType legalAddressTypeEnumType,
		final String birthDate,
		final String permanentEstablishments
	)
	{
		final ReportableSellerType.Identity identity = new ReportableSellerType.Identity();
		
		// If true entity is a 'Rechtsträger'
		// 'Rechtsträger' like 'Test AG'
		if(isNULLAsString(firstName) && isNULLAsString(birthDate))
		{
			identity.setEntitySeller(
				createEntitySeller(
					resCountryCode,
					tin,
					in,
					vat,
					createNameOrganisationType(lastName),
					addressFixType,
					legalAddressTypeEnumType,
					permanentEstablishments
				)
			);
		}
		else
		{
			identity.setIndividualSeller(
				createIndividualSeller(
					resCountryCode,
					tin,
					vat,
					createNamePerson(firstName, lastName),
					addressFixType,
					legalAddressTypeEnumType,
					LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"))
				)
			);
		}
		
		return identity;
	}
	
	private static NameOrganisationType createNameOrganisationType(final String lastName)
	{
		final NameOrganisationType nameOrganisationType = new NameOrganisationType();
		nameOrganisationType.setValue(lastName);
		
		return nameOrganisationType;
	}
	
	private static ReportableSellerType.Identity.EntitySeller createEntitySeller(
		final CountryCodeType resCountryCode,
		final TINType tin,
		final String in,
		final String vat,
		final NameOrganisationType nameOrganisationType,
		final AddressFixType addressFixType,
		final OECDLegalAddressTypeEnumType legalAddressTypeEnumType,
		final String permanentEstablishments
	)
	{
		final ReportableSellerType.Identity.EntitySeller entitySeller =
			new ReportableSellerType.Identity.EntitySeller();
		entitySeller.setStandard(
			createStandardForEntitySeller(
				resCountryCode,
				tin,
				in,
				vat,
				nameOrganisationType,
				addressFixType,
				legalAddressTypeEnumType,
				permanentEstablishments
			)
		);
		
		return entitySeller;
	}
	
	private static ReportableSellerType.Identity.EntitySeller.Standard createStandardForEntitySeller(
		final CountryCodeType resCountryCode,
		final TINType tin,
		final String in,
		final String vat,
		final NameOrganisationType nameOrganisationType,
		final AddressFixType addressFixType,
		final OECDLegalAddressTypeEnumType legalAddressTypeEnumType,
		final String permanentEstablishments)
	{
		final ReportableSellerType.Identity.EntitySeller.Standard standard =
			new ReportableSellerType.Identity.EntitySeller.Standard();
		standard.setEntSellerID(
			createOrganisationPartyType(
				resCountryCode,
				tin,
				in,
				vat,
				nameOrganisationType,
				addressFixType,
				legalAddressTypeEnumType
			)
		);
		
		final PermanentEstablishmentsType permanentEstablishmentsType = new PermanentEstablishmentsType();
		
		// Betriebsstättenstaaten
		for(final String permanentEstablishment : permanentEstablishments.split(","))
		{
			permanentEstablishmentsType.getPermanentEstablishment().add(
				MSCountryCodeType.valueOf(permanentEstablishment));
		}
		
		standard.setPermanentEstablishments(permanentEstablishmentsType);
		
		return standard;
	}
	
	private static OrganisationPartyType createOrganisationPartyType(
		final CountryCodeType resCountryCode, final TINType tin, final String
		in, final String vat, final NameOrganisationType nameOrganisationType, final AddressFixType
		addressFixType, final OECDLegalAddressTypeEnumType legalAddressTypeEnumType)
	{
		final OrganisationPartyType organisationPartyType = new OrganisationPartyType();
		organisationPartyType.getResCountryCode().add(resCountryCode);
		organisationPartyType.getTIN().add(tin);
		
		// Optional
		if(!isNULLAsString(vat))
		{
			organisationPartyType.setVAT(vat);
		}
		
		// Optional
		if(!isNULLAsString(in))
		{
			organisationPartyType.getIN().add(createIN(in));
		}
		
		organisationPartyType.getName().add(nameOrganisationType);
		organisationPartyType.getAddress().add(
			XMLDocumentBodyCreator.createAddress(addressFixType, legalAddressTypeEnumType));
		
		return organisationPartyType;
	}
	
	/**
	 * In the CSV file, fields with no value have 'NULL' as a string.
	 *
	 * @param checkNULLString String to check
	 * @return true if string equals 'NULL'
	 */
	public static boolean isNULLAsString(final String checkNULLString)
	{
		return checkNULLString.equals("NULL");
	}
	
	private static OrganisationINType createIN(final String in)
	{
		// Optional
		if(!isNULLAsString(in))
		{
			final OrganisationINType organisationINType = new OrganisationINType();
			organisationINType.setValue(in);
			// Handelsregisternummer
			organisationINType.setINType(INTypeEnumType.BRN);
			
			return organisationINType;
		}
		
		return null;
	}
	
	private static ReportableSellerType.Identity.IndividualSeller createIndividualSeller(
		final CountryCodeType resCountryCode,
		final TINType tin,
		final String vat,
		final NamePersonType namePersonType,
		final AddressFixType addressFixType,
		final OECDLegalAddressTypeEnumType legalAddressTypeEnumType,
		final LocalDate birthDate
	)
	{
		final ReportableSellerType.Identity.IndividualSeller individualSeller =
			new ReportableSellerType.Identity.IndividualSeller();
		
		individualSeller.setStandard(
			createStandard(
				resCountryCode,
				tin,
				vat,
				namePersonType,
				addressFixType,
				legalAddressTypeEnumType,
				birthDate
			)
		);
		
		return individualSeller;
	}
	
	private static ReportableSellerType.Identity.IndividualSeller.Standard createStandard(
		final CountryCodeType resCountryCode,
		final TINType tin,
		final String vat,
		final NamePersonType namePersonType,
		final AddressFixType addressFixType,
		final OECDLegalAddressTypeEnumType legalAddressTypeEnumType,
		final LocalDate birthDate
	)
	{
		final ReportableSellerType.Identity.IndividualSeller.Standard standard =
			new ReportableSellerType.Identity.IndividualSeller.Standard();
		standard.setIndSellerID(
			createPersonParty(
				resCountryCode,
				tin,
				vat,
				namePersonType,
				addressFixType,
				legalAddressTypeEnumType,
				createBirthdayInfo(birthDate)
			)
		);
		
		return standard;
	}
	
	private static PersonPartyType createPersonParty(
		final CountryCodeType resCountryCode,
		final TINType tin,
		final String vat,
		final NamePersonType namePersonType,
		final AddressFixType address,
		final OECDLegalAddressTypeEnumType legalAddressTypeEnumType,
		final PersonPartyType.BirthInfo birthInfo)
	{
		final PersonPartyType personPartyType = new PersonPartyType();
		personPartyType.getResCountryCode().add(resCountryCode);
		personPartyType.getTIN().add(tin);
		
		// Optional
		if(!isNULLAsString(vat))
		{
			personPartyType.setVAT(vat);
		}
		
		personPartyType.getName().add(namePersonType);
		personPartyType.getAddress().add(XMLDocumentBodyCreator.createAddress(address, legalAddressTypeEnumType));
		personPartyType.setBirthInfo(birthInfo);
		
		return personPartyType;
	}
	
	private static PersonPartyType.BirthInfo createBirthdayInfo(final LocalDate birthDate)
	{
		final PersonPartyType.BirthInfo birthInfo = new PersonPartyType.BirthInfo();
		birthInfo.setBirthDate(XMLDocumentCreator.parseLocalDateToXMLGregorianCalendarDate(birthDate));
		
		return birthInfo;
	}
	
	public static NamePersonType createNamePerson(final String firstName, final String lastName)
	{
		// Just first and last name needed
		final NamePersonType namePersonType = new NamePersonType();
		namePersonType.setFirstName(createFirstName(firstName));
		namePersonType.setLastName(createLastName(lastName));
		
		return namePersonType;
	}
	
	private static NamePersonType.LastName createLastName(final String lastName)
	{
		final NamePersonType.LastName lastNameType = new NamePersonType.LastName();
		lastNameType.setValue(lastName);
		
		return lastNameType;
	}
	
	private static NamePersonType.FirstName createFirstName(final String firstName)
	{
		final NamePersonType.FirstName firstNameType = new NamePersonType.FirstName();
		firstNameType.setValue(firstName);
		
		return firstNameType;
	}
}
