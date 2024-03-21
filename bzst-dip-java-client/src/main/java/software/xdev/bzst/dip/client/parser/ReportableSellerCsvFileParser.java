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

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import software.xdev.bzst.dip.client.BzstDipConfiguration;
import software.xdev.bzst.dip.client.xmldocument.ReportableSellerCreator;
import software.xdev.bzst.dip.client.xmldocument.XMLDocumentBodyCreator;
import software.xdev.bzst.dip.client.xmldocument.model.CorrectableReportableSellerType;
import software.xdev.bzst.dip.client.xmldocument.model.CountryCodeType;


public final class ReportableSellerCsvFileParser
{
	private static final Logger logger = LogManager.getLogger(ReportableSellerCsvFileParser.class);
	private static final String DELIMITER = ";";
	private static final String DEFAULT_ENCODING = "UTF-8";
	
	private ReportableSellerCsvFileParser()
	{
	}
	
	public static List<CorrectableReportableSellerType> parseCsvData(
		final String csvData,
		final BzstDipConfiguration configuration)
	{
		return parseReportableSeller(readCSVFile(csvData), configuration);
	}
	
	private static List<List<String>> readCSVFile(final String csvData)
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
			logger.error("Error occurred while reading the csv file.", e);
		}
		catch(final RuntimeException e)
		{
			logger.error("There is a null value in the csv file.", e);
		}
		
		return records;
	}
	
	private static List<CorrectableReportableSellerType> parseReportableSeller(
		final List<List<String>> data,
		final BzstDipConfiguration configuration)
	{
		final List<CorrectableReportableSellerType> reportableSeller = new ArrayList<>();
		final ReportableSellerCreator xmlDocBodyReportableSeller = new ReportableSellerCreator(
			configuration);
		
		logger.info("Looping through data now...");
		for(final List<String> list : data.stream().skip(1).toList())
		{
			reportableSeller.add(xmlDocBodyReportableSeller.createReportableSeller(
					// Ansässigkeitsstaat
					CountryCodeType.valueOf(list.get(0)),
					// Steuer-ID & Issued by
					ReportableSellerCreator.createTIN(
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
					XMLDocumentBodyCreator.createAddressType(list.get(8)),
					// Address with city
					XMLDocumentBodyCreator.createAddressFixForReportableSeller(list.get(9)),
					ReportableSellerCreator.createNumberOfActivities(
						new BigInteger(list.get(10)),
						new BigInteger(list.get(11)),
						new BigInteger(list.get(12)),
						new BigInteger(list.get(13))
					),
					ReportableSellerCreator.createConsiderationType(
						XMLDocumentBodyCreator.createMonAmntType(new BigInteger(list.get(14))),
						XMLDocumentBodyCreator.createMonAmntType(new BigInteger(list.get(15))),
						XMLDocumentBodyCreator.createMonAmntType(new BigInteger(list.get(16))),
						XMLDocumentBodyCreator.createMonAmntType(new BigInteger(list.get(17)))
					),
					ReportableSellerCreator.createFeesType(
						XMLDocumentBodyCreator.createMonAmntType(new BigInteger(list.get(18))),
						XMLDocumentBodyCreator.createMonAmntType(new BigInteger(list.get(19))),
						XMLDocumentBodyCreator.createMonAmntType(new BigInteger(list.get(20))),
						XMLDocumentBodyCreator.createMonAmntType(new BigInteger(list.get(21)))
					),
					ReportableSellerCreator.createTaxesType(
						XMLDocumentBodyCreator.createMonAmntType(new BigInteger(list.get(22))),
						XMLDocumentBodyCreator.createMonAmntType(new BigInteger(list.get(23))),
						XMLDocumentBodyCreator.createMonAmntType(new BigInteger(list.get(24))),
						XMLDocumentBodyCreator.createMonAmntType(new BigInteger(list.get(25)))
					),
					// Split Betriebsstättenstaaten
					list.get(26),
					list.get(27)
				)
			);
		}
		
		return reportableSeller;
	}
}
