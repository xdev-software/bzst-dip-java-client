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
package software.xdev.bzst.dip.client.signing;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import software.xdev.bzst.dip.client.ConfigurationTestUtil;
import software.xdev.bzst.dip.client.model.configuration.BzstDipConfiguration;
import software.xdev.bzst.dip.client.xmldocument.XMLDocumentBodyCreator;
import software.xdev.bzst.dip.client.xmldocument.XMLDocumentCreator;


class XmlSignerTest
{
	private static Stream<Arguments> provideConfigurations()
	{
		return Stream.of(
			Arguments.of(ConfigurationTestUtil.getConfigurationWithJksSigning()),
			Arguments.of(ConfigurationTestUtil.getConfigurationWithPemSigning())
		);
	}
	
	@ParameterizedTest
	@MethodSource("provideConfigurations")
	void signXMLDocument(final BzstDipConfiguration configuration)
	{
		final XMLDocumentCreator xmlDocumentCreator = new XMLDocumentCreator(configuration);
		final String unsignedXml = xmlDocumentCreator.buildXMLDocument(
			List.of(),
			XMLDocumentBodyCreator.createPlatformOperatorFromConfiguration(configuration)
		);
		
		final XmlSigner xmlSigner = new XmlSigner(configuration.getSigningProvider());
		final String signedXml = xmlSigner.signXMLDocument(unsignedXml);
		
		Assertions.assertNotNull(signedXml);
		Assertions.assertTrue(signedXml.contains("SignedInfo"));
		Assertions.assertTrue(signedXml.contains("SignatureValue"));
		Assertions.assertTrue(signedXml.contains(
			"<ds:X509SubjectName>CN=xdev.software,O=XDEV Software GmbH,L=city,ST=Bavaria,C=DE</ds:X509SubjectName>"));
		Assertions.assertTrue(signedXml.contains("X509Certificate"));
	}
}
