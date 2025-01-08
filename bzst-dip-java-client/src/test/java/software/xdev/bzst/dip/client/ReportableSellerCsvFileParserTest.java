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
package software.xdev.bzst.dip.client;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;

import software.xdev.bzst.dip.client.exception.CsvParseException;
import software.xdev.bzst.dip.client.model.configuration.BzstDipConfiguration;
import software.xdev.bzst.dip.client.model.configuration.BzstDipConfigurationBuilder;
import software.xdev.bzst.dip.client.model.configuration.BzstDipDpiMessageType;
import software.xdev.bzst.dip.client.model.configuration.BzstDipOecdDocType;
import software.xdev.bzst.dip.client.model.message.dac7.BzstDipAddressFix;
import software.xdev.bzst.dip.client.parser.ReportableSellerCsvFileParser;
import software.xdev.bzst.dip.client.xmldocument.model.CorrectableReportableSellerType;


@SuppressWarnings("MethodName")
class ReportableSellerCsvFileParserTest
{
	public static final String TEST_CSV_FILE = "src/test/resources/TestCsvData.csv";
	public static final String TEST_CSV_FILE_WITH_COMMA_SEPERATOR =
		"src/test/resources/TestCsvDataWithCommaSeperator.csv";
	public static final String TEST_CSV_FILE_WITH_CORRUPTED_DATA =
		"src/test/resources/TestCsvDataWithCorruptedData.csv";
	private final BzstDipConfiguration configuration = new BzstDipConfigurationBuilder()
		.setClientId("TestClient")
		.setTaxID("86095742719")
		.setTaxNumber("123")
		.setCertificateKeystorePassword("test123")
		.setCertificateKeystoreInputStream(() -> ClassLoader.getSystemClassLoader()
			.getResourceAsStream("DemoKeystore.jks"))
		.setRealmEnvironmentBaseUrl(BzstDipConfiguration.ENDPOINT_URL_TEST)
		.setMessageTypeIndic(BzstDipDpiMessageType.DPI_401)
		.setReportingPeriod(LocalDate.now())
		.setDocTypeIndic(BzstDipOecdDocType.OECD_1)
		.setPlatformOperatorOrganizationName("TestOrg")
		.setPlatformOperatorPlatformName("TestApp")
		.setPlatformOperatorAddress(
			new BzstDipAddressFix("TestCity")
		)
		.buildAndValidate();
	
	@Test
	void shouldParseSuccessfullyTest() throws IOException, CsvValidationException
	{
		final String resourceName = TEST_CSV_FILE;
		
		final String csvData = Files.readString(Path.of(resourceName));
		
		final List<CorrectableReportableSellerType> reportableSeller =
			new ReportableSellerCsvFileParser(this.configuration).parseCsvData(csvData);
		
		// Check size
		assertEquals(2, reportableSeller.size());
		// Check value
		assertEquals(
			"Liselotte",
			reportableSeller
				.get(0)
				.getIdentity()
				.getIndividualSeller()
				.getStandard()
				.getIndSellerID()
				.getName()
				.get(0)
				.getFirstName()
				.getValue());
	}
	
	@Test
	void parse_commaSeperator_correctConfig() throws IOException, CsvValidationException
	{
		final String resourceName = TEST_CSV_FILE_WITH_COMMA_SEPERATOR;
		
		final String csvData = Files.readString(Path.of(resourceName));
		
		try(final Reader reader = new StringReader(csvData))
		{
			final CSVParser parser = new CSVParserBuilder()
				.withSeparator(',')
				.withIgnoreQuotations(true)
				.build();
			
			try(
				final CSVReader csvReader = new CSVReaderBuilder(reader)
					.withSkipLines(1)
					.withCSVParser(parser)
					.build())
			{
				final List<CorrectableReportableSellerType> reportableSeller =
					new ReportableSellerCsvFileParser(this.configuration).parseCsvData(csvReader);
				
				// Check size
				assertEquals(2, reportableSeller.size());
				// Check value
				assertEquals(
					"Liselotte",
					reportableSeller
						.get(0)
						.getIdentity()
						.getIndividualSeller()
						.getStandard()
						.getIndSellerID()
						.getName()
						.get(0)
						.getFirstName()
						.getValue());
			}
		}
	}
	
	@Test
	void parse_commaSeperator_invalidConfig() throws IOException
	{
		final String resourceName = TEST_CSV_FILE_WITH_COMMA_SEPERATOR;
		
		final String csvData = Files.readString(Path.of(resourceName));
		
		Assertions.assertThrows(
			CsvParseException.class,
			() ->
				new ReportableSellerCsvFileParser(this.configuration).parseCsvData(csvData));
	}
	
	@Test
	void parse_invalidFile() throws IOException
	{
		final String resourceName = TEST_CSV_FILE_WITH_CORRUPTED_DATA;
		
		final String csvData = Files.readString(Path.of(resourceName));
		
		Assertions.assertThrows(
			CsvParseException.class,
			() ->
				new ReportableSellerCsvFileParser(this.configuration).parseCsvData(csvData));
	}
}
