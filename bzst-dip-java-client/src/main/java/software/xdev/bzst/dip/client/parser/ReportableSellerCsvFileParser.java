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

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;

import software.xdev.bzst.dip.client.exception.CsvParseException;
import software.xdev.bzst.dip.client.model.configuration.BzstDipConfiguration;
import software.xdev.bzst.dip.client.model.message.dac7.BzstDipConsiderations;
import software.xdev.bzst.dip.client.model.message.dac7.BzstDipFees;
import software.xdev.bzst.dip.client.model.message.dac7.BzstDipNumberOfActivities;
import software.xdev.bzst.dip.client.model.message.dac7.BzstDipTaxes;
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
 * If the CSV data is formatted differently, it is also possible to parse the data through a {@link CSVReader}, see
 * {@link #parseCsvData(CSVReader)}. The data must be in the following order:
 * <ol>
 *     <li>{@link CountryCodeType}</li>
 *     <li>TIN</li>
 *     <li>TIN Issued by</li>
 *     <li>Handelsregisternummer</li>
 *     <li>VAT</li>
 *     <li>First name</li>
 *     <li>Last name</li>
 *     <li>Birthdate</li>
 *     <li>AddressType</li>
 *     <li>Address with city</li>
 *     <li>NumberOfActivities (see {@link BzstDipNumberOfActivities}):
 *     1st quarter</li>
 *     <li>NumberOfActivities (see {@link BzstDipNumberOfActivities}):
 *     2nd quarter</li>
 *     <li>NumberOfActivities (see {@link BzstDipNumberOfActivities}):
 *     3rd quarter</li>
 *     <li>NumberOfActivities (see {@link BzstDipNumberOfActivities}):
 *     4th quarter</li>
 *     <li>ConsiderationType (see {@link BzstDipConsiderations}):
 *     1st quarter</li>
 *     <li>ConsiderationType (see {@link BzstDipConsiderations}):
 *     2nd quarter</li>
 *     <li>ConsiderationType (see {@link BzstDipConsiderations}):
 *     3rd quarter</li>
 *     <li>ConsiderationType (see {@link BzstDipConsiderations}):
 *     4th quarter</li>
 *     <li>FeesType (see {@link BzstDipFees}):
 *     1st quarter</li>
 *     <li>FeesType (see {@link BzstDipFees}):
 *     2nd quarter</li>
 *     <li>FeesType (see {@link BzstDipFees}):
 *     3rd quarter</li>
 *     <li>FeesType (see {@link BzstDipFees}):
 *     4th quarter</li>
 *     <li>TaxesType (see {@link BzstDipTaxes}):
 *     1st quarter</li>
 *     <li>TaxesType (see {@link BzstDipTaxes}):
 *     2nd quarter</li>
 *     <li>TaxesType (see {@link BzstDipTaxes}):
 *     3rd quarter</li>
 *     <li>TaxesType (see {@link BzstDipTaxes}):
 *     4th quarter</li>
 *     <li>Permanent establishments</li>
 *     <li>docRefUUID</li>
 * </ol>
 */
public final class ReportableSellerCsvFileParser
{
	private static final Logger LOGGER = LoggerFactory.getLogger(ReportableSellerCsvFileParser.class);
	private static final char DEFAULT_DELIMITER = ';';
	public static final int MAX_INDEX_IN_SINGLE_LINE = 28;
	private final BzstDipConfiguration configuration;
	
	public ReportableSellerCsvFileParser(final BzstDipConfiguration configuration)
	{
		this.configuration = configuration;
	}
	
	public List<CorrectableReportableSellerType> parseCsvData(final String csvData)
		throws CsvParseException
	{
		try(final Reader reader = new StringReader(csvData))
		{
			final CSVParser parser = new CSVParserBuilder()
				.withSeparator(DEFAULT_DELIMITER)
				.withIgnoreQuotations(true)
				.build();
			
			try(
				final CSVReader csvReader = new CSVReaderBuilder(reader)
					.withSkipLines(1)
					.withCSVParser(parser)
					.build())
			{
				return this.parseCsvData(csvReader);
			}
		}
		catch(final Exception e)
		{
			throw new CsvParseException("Could not parse CSV data.", e);
		}
	}
	
	public List<CorrectableReportableSellerType> parseCsvData(final CSVReader csvReader)
		throws CsvParseException
	{
		try
		{
			return this.parseReportableSeller(this.readCSVFile(csvReader));
		}
		catch(final Exception e)
		{
			throw new CsvParseException("Could not parse CSV data.", e);
		}
	}
	
	private List<String[]> readCSVFile(final CSVReader csvReader) throws IOException, CsvValidationException
	{
		final List<String[]> records = new ArrayList<>();
		
		String[] line;
		while((line = csvReader.readNext()) != null)
		{
			records.add(line);
		}
		return records;
	}
	
	@SuppressWarnings("checkstyle:MagicNumber")
	private List<CorrectableReportableSellerType> parseReportableSeller(final List<String[]> data)
		throws CsvParseException
	{
		final List<CorrectableReportableSellerType> reportableSeller = new ArrayList<>();
		final ReportableSellerCreator xmlDocBodyReportableSeller = new ReportableSellerCreator(
			this.configuration);
		
		LOGGER.debug("Looping through data now...");
		for(int lineIndex = 0; lineIndex < data.size(); lineIndex++)
		{
			final String[] lineData = data.get(lineIndex);
			if(lineData.length != MAX_INDEX_IN_SINGLE_LINE)
			{
				throw new CsvParseException("Length of line %d is %d and not %d. Therefore it is not valid.".formatted(
					lineIndex,
					lineData.length,
					MAX_INDEX_IN_SINGLE_LINE));
			}
			reportableSeller.add(xmlDocBodyReportableSeller.createReportableSeller(
					// Ansässigkeitsstaat
				CountryCodeType.valueOf(lineData[0]),
					// Steuer-ID & Issued by
				this.createTIN(
					lineData[1],
					CountryCodeType.valueOf(lineData[2])),
					// Handelsregisternummer
				lineData[3],
					// VAT
				lineData[4],
					// First name
				lineData[5],
					// Last name
				lineData[6],
					// Birthdate
				lineData[7],
					// AddressType
				this.createAddressType(lineData[8]),
					// Address with city
				this.createAddressFixForReportableSeller(lineData[9]),
				this.createNumberOfActivities(
					new BigInteger(lineData[10]),
					new BigInteger(lineData[11]),
					new BigInteger(lineData[12]),
					new BigInteger(lineData[13])
					),
				this.createConsiderationType(
					this.createMonAmntType(new BigInteger(lineData[14])),
					this.createMonAmntType(new BigInteger(lineData[15])),
					this.createMonAmntType(new BigInteger(lineData[16])),
					this.createMonAmntType(new BigInteger(lineData[17]))
					),
				this.createFeesType(
					this.createMonAmntType(new BigInteger(lineData[18])),
					this.createMonAmntType(new BigInteger(lineData[19])),
					this.createMonAmntType(new BigInteger(lineData[20])),
					this.createMonAmntType(new BigInteger(lineData[21]))
					),
				this.createTaxesType(
					this.createMonAmntType(new BigInteger(lineData[22])),
					this.createMonAmntType(new BigInteger(lineData[23])),
					this.createMonAmntType(new BigInteger(lineData[24])),
					this.createMonAmntType(new BigInteger(lineData[25]))
					),
					// Split Betriebsstättenstaaten
				lineData[26],
				lineData[27]
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
