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
import static software.xdev.bzst.dip.client.ConfigurationTestUtil.getConfigurationWithJksSigning;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;

import software.xdev.bzst.dip.client.parser.ReportableSellerCsvFileParser;
import software.xdev.bzst.dip.client.xmldocument.model.CorrectableReportableSellerType;


class ReportableSellerCsvFileParserTest
{

	@Test
	void shouldParseSuccessfullyTest() throws IOException
	{
		final String resourceName = "src/test/resources/TestCsvData.csv";
		
		final List<CorrectableReportableSellerType> reportableSeller =
			new ReportableSellerCsvFileParser(getConfigurationWithJksSigning())
				.parseCsvData(Files.readString(Path.of(resourceName)));
		
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
