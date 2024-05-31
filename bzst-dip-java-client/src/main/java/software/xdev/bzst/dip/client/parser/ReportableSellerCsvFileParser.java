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
package software.xdev.bzst.dip.client.parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import software.xdev.bzst.dip.client.model.configuration.BzstDipConfiguration;
import software.xdev.bzst.dip.client.xmldocument.ReportableSellerCreator;
import software.xdev.bzst.dip.client.xmldocument.model.AddressFixType;
import software.xdev.bzst.dip.client.xmldocument.model.ConsiderationType;
import software.xdev.bzst.dip.client.xmldocument.model.CorrectableReportableSellerType;
import software.xdev.bzst.dip.client.xmldocument.model.CountryCodeType;
import software.xdev.bzst.dip.client.xmldocument.model.CurrCodeType;
import software.xdev.bzst.dip.client.xmldocument.model.FeesType;
import software.xdev.bzst.dip.client.xmldocument.model.MonAmntType;
import software.xdev.bzst.dip.client.xmldocument.model.NumberOfActivitiesType;
import software.xdev.bzst.dip.client.xmldocument.model.OECDLegalAddressTypeEnumType;
import software.xdev.bzst.dip.client.xmldocument.model.TINType;
import software.xdev.bzst.dip.client.xmldocument.model.TaxesType;


/**
 * Parses CSV files in a very specific way and creates {@link CorrectableReportableSellerType}s from it.
 * <p>
 * See {@code test/resources/TestCsvData.csv}
 * </p>
 */
public final class ReportableSellerCsvFileParser
{
	private static final Logger LOGGER = LoggerFactory.getLogger(ReportableSellerCsvFileParser.class);
	private static final String DELIMITER = ";";
	private final BzstDipConfiguration configuration;
	
	public ReportableSellerCsvFileParser(final BzstDipConfiguration configuration)
	{
		this.configuration = configuration;
	}
	
	public List<CorrectableReportableSellerType> parseCsvData(final String csvData)
	{
		return this.parseReportableSeller(this.readCSVFile(csvData));
	}
	
	private List<List<String>> readCSVFile(final String csvData)
	{
		final List<List<String>> records = new ArrayList<>();
		
		try(final StringReader stringReader = new StringReader(csvData))
		{
			final BufferedReader br = new BufferedReader(stringReader);
			
			String line;
			String[] st;
			
			while((line = br.readLine()) != null)
			{
				st = line.split(DELIMITER);
				
				records.add(Arrays.asList(st));
			}
			
			return records;
		}
		catch(final IOException e)
		{
			LOGGER.error("Error occurred while reading the csv file.", e);
		}
		catch(final RuntimeException e)
		{
			LOGGER.error("There is a null value in the csv file.", e);
		}
		
		return records;
	}
	
	@SuppressWarnings("checkstyle:MagicNumber")
	private List<CorrectableReportableSellerType> parseReportableSeller(final List<List<String>> data)
	{
		final List<CorrectableReportableSellerType> reportableSeller = new ArrayList<>();
		final ReportableSellerCreator xmlDocBodyReportableSeller = new ReportableSellerCreator(
			this.configuration);
		
		LOGGER.debug("Looping through data now...");
		for(final List<String> list : data.stream().skip(1).toList())
		{
			reportableSeller.add(xmlDocBodyReportableSeller.createReportableSeller(
					// Ansässigkeitsstaat
					CountryCodeType.valueOf(list.get(0)),
					// Steuer-ID & Issued by
				this.createTIN(
						list.get(1),
						CountryCodeType.valueOf(list.get(2))),
					// Handelsregisternummer
					list.get(3),
					// VAT
					list.get(4),
					// First name
					list.get(5),
					// Last name
					list.get(6),
					// Birthdate
					list.get(7),
					// AddressType
				this.createAddressType(list.get(8)),
					// Address with city
				this.createAddressFixForReportableSeller(list.get(9)),
				this.createNumberOfActivities(
						new BigInteger(list.get(10)),
						new BigInteger(list.get(11)),
						new BigInteger(list.get(12)),
						new BigInteger(list.get(13))
					),
				this.createConsiderationType(
					this.createMonAmntType(new BigInteger(list.get(14))),
					this.createMonAmntType(new BigInteger(list.get(15))),
					this.createMonAmntType(new BigInteger(list.get(16))),
					this.createMonAmntType(new BigInteger(list.get(17)))
					),
				this.createFeesType(
					this.createMonAmntType(new BigInteger(list.get(18))),
					this.createMonAmntType(new BigInteger(list.get(19))),
					this.createMonAmntType(new BigInteger(list.get(20))),
					this.createMonAmntType(new BigInteger(list.get(21)))
					),
				this.createTaxesType(
					this.createMonAmntType(new BigInteger(list.get(22))),
					this.createMonAmntType(new BigInteger(list.get(23))),
					this.createMonAmntType(new BigInteger(list.get(24))),
					this.createMonAmntType(new BigInteger(list.get(25)))
					),
					// Split Betriebsstättenstaaten
					list.get(26),
					list.get(27)
				)
			);
		}
		
		return reportableSeller;
	}
	
	public TINType createTIN(final String tin, final CountryCodeType issuedBy)
	{
		final TINType tinType = new TINType();
		tinType.setIssuedBy(issuedBy);
		tinType.setValue(tin);
		
		return tinType;
	}
	
	private OECDLegalAddressTypeEnumType createAddressType(final String addressType)
	{
		
		return switch(addressType)
		{
			case "residentialOrBusiness" -> OECDLegalAddressTypeEnumType.OECD_301;
			case "residential" -> OECDLegalAddressTypeEnumType.OECD_302;
			case "business" -> OECDLegalAddressTypeEnumType.OECD_303;
			case "registeredOffice" -> OECDLegalAddressTypeEnumType.OECD_304;
			default -> OECDLegalAddressTypeEnumType.OECD_305;
		};
	}
	
	private AddressFixType createAddressFixForReportableSeller(final String city)
	{
		final AddressFixType addressFixType = new AddressFixType();
		addressFixType.setCity(city);
		return addressFixType;
	}
	
	private MonAmntType createMonAmntType(final BigInteger value)
	{
		final MonAmntType monAmntType = new MonAmntType();
		monAmntType.setCurrCode(CurrCodeType.EUR);
		monAmntType.setValue(value);
		
		return monAmntType;
	}
	
	private NumberOfActivitiesType createNumberOfActivities(
		final BigInteger numberOfActivitiesQ1,
		final BigInteger numberOfActivitiesQ2,
		final BigInteger numberOfActivitiesQ3,
		final BigInteger numberOfActivitiesQ4)
	{
		final NumberOfActivitiesType numberOfActivitiesType = new NumberOfActivitiesType();
		numberOfActivitiesType.setNumbQ1(numberOfActivitiesQ1);
		numberOfActivitiesType.setNumbQ2(numberOfActivitiesQ2);
		numberOfActivitiesType.setNumbQ3(numberOfActivitiesQ3);
		numberOfActivitiesType.setNumbQ4(numberOfActivitiesQ4);
		
		return numberOfActivitiesType;
	}
	
	private TaxesType createTaxesType(
		final MonAmntType taxQ1,
		final MonAmntType taxQ2,
		final MonAmntType taxQ3,
		final MonAmntType taxQ4
	)
	{
		final TaxesType taxesType = new TaxesType();
		taxesType.setTaxQ1(taxQ1);
		taxesType.setTaxQ2(taxQ2);
		taxesType.setTaxQ3(taxQ3);
		taxesType.setTaxQ4(taxQ4);
		
		return taxesType;
	}
	
	private FeesType createFeesType(
		final MonAmntType feesQ1,
		final MonAmntType feesQ2,
		final MonAmntType feesQ3,
		final MonAmntType feesQ4
	)
	{
		final FeesType feesType = new FeesType();
		feesType.setFeesQ1(feesQ1);
		feesType.setFeesQ2(feesQ2);
		feesType.setFeesQ3(feesQ3);
		feesType.setFeesQ4(feesQ4);
		
		return feesType;
	}
	
	private ConsiderationType createConsiderationType(
		final MonAmntType consQ1,
		final MonAmntType consQ2,
		final MonAmntType consQ3,
		final MonAmntType consQ4
	)
	{
		final ConsiderationType considerationType = new ConsiderationType();
		considerationType.setConsQ1(consQ1);
		considerationType.setConsQ2(consQ2);
		considerationType.setConsQ3(consQ3);
		considerationType.setConsQ4(consQ4);
		
		return considerationType;
	}
}
