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
package software.xdev.bzst.dip.client.model.configuration;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import software.xdev.bzst.dip.client.exception.ConfigurationException;
import software.xdev.bzst.dip.client.model.message.dac7.BzstDipAddressFix;
import software.xdev.bzst.dip.client.signing.SigningProviderByJks;
import software.xdev.bzst.dip.client.signing.SigningProviderByPem;


@SuppressWarnings("MethodName")
class BzstDipConfigurationBuilderTest
{
	
	@Test
	void buildAndValidate_noValue()
	{
		Assertions.assertThrows(
			ConfigurationException.class,
			() -> new BzstDipConfigurationBuilder().buildAndValidate()
		);
	}
	
	@Test
	void buildAndValidate_goodValue()
	{
		Assertions.assertDoesNotThrow(
			() -> new BzstDipConfigurationBuilder()
				.setClientId("abcd1234-ab12-ab12-ab12-abcdef123456")
				.setTaxID("86095742719")
				.setValidateTaxID(false)
				.setTaxNumber("123")
				.setSigningProvider(new SigningProviderByJks("DemoKeystore.jks", "test123"))
				.setRealmEnvironmentBaseUrl(BzstDipConfiguration.ENDPOINT_URL_TEST)
				.setMessageTypeIndic(BzstDipDpiMessageType.DPI_401)
				.setReportingPeriod(LocalDate.now())
				.setDocTypeIndic(BzstDipOecdDocType.OECD_1)
				.setPlatformOperatorOrganizationName("TestOrg")
				.setPlatformOperatorPlatformName("TestApp")
				.setPlatformOperatorAddress(new BzstDipAddressFix("TestCity"))
				.buildAndValidate()
		);
	}
	
	@Test
	void buildAndValidate_missingClientId()
	{
		Assertions.assertThrows(
			ConfigurationException.class,
			() -> new BzstDipConfigurationBuilder()
				.setTaxID("86095742719")
				.setTaxNumber("123")
				.setSigningProvider(new SigningProviderByJks("DemoKeystore.jks", "test123"))
				.setRealmEnvironmentBaseUrl(BzstDipConfiguration.ENDPOINT_URL_TEST)
				.setMessageTypeIndic(BzstDipDpiMessageType.DPI_401)
				.setReportingPeriod(LocalDate.now())
				.setDocTypeIndic(BzstDipOecdDocType.OECD_1)
				.setPlatformOperatorOrganizationName("TestOrg")
				.setPlatformOperatorPlatformName("TestApp")
				.setPlatformOperatorAddress(new BzstDipAddressFix("TestCity"))
				.buildAndValidate()
		);
	}
	
	@Test
	void buildAndValidate_missingTaxId()
	{
		Assertions.assertThrows(
			ConfigurationException.class,
			() -> new BzstDipConfigurationBuilder()
				.setClientId("abcd1234-ab12-ab12-ab12-abcdef123456")
				.setTaxNumber("123")
				.setSigningProvider(new SigningProviderByJks("DemoKeystore.jks", "test123"))
				.setRealmEnvironmentBaseUrl(BzstDipConfiguration.ENDPOINT_URL_TEST)
				.setMessageTypeIndic(BzstDipDpiMessageType.DPI_401)
				.setReportingPeriod(LocalDate.now())
				.setDocTypeIndic(BzstDipOecdDocType.OECD_1)
				.setPlatformOperatorOrganizationName("TestOrg")
				.setPlatformOperatorPlatformName("TestApp")
				.setPlatformOperatorAddress(new BzstDipAddressFix("TestCity"))
				.buildAndValidate()
		);
	}
	
	@Test
	void buildAndValidate_missingTaxNumber()
	{
		Assertions.assertThrows(
			ConfigurationException.class,
			() -> new BzstDipConfigurationBuilder()
				.setClientId("abcd1234-ab12-ab12-ab12-abcdef123456")
				.setTaxID("86095742719")
				.setSigningProvider(new SigningProviderByJks("DemoKeystore.jks", "test123"))
				.setRealmEnvironmentBaseUrl(BzstDipConfiguration.ENDPOINT_URL_TEST)
				.setMessageTypeIndic(BzstDipDpiMessageType.DPI_401)
				.setReportingPeriod(LocalDate.now())
				.setDocTypeIndic(BzstDipOecdDocType.OECD_1)
				.setPlatformOperatorOrganizationName("TestOrg")
				.setPlatformOperatorPlatformName("TestApp")
				.setPlatformOperatorAddress(new BzstDipAddressFix("TestCity"))
				.buildAndValidate()
		);
	}
	
	@Test
	void buildAndValidate_missingSigningProvider()
	{
		Assertions.assertThrows(
			ConfigurationException.class,
			() -> new BzstDipConfigurationBuilder()
				.setClientId("abcd1234-ab12-ab12-ab12-abcdef123456")
				.setTaxID("86095742719")
				.setTaxNumber("123")
				.setRealmEnvironmentBaseUrl(BzstDipConfiguration.ENDPOINT_URL_TEST)
				.setMessageTypeIndic(BzstDipDpiMessageType.DPI_401)
				.setReportingPeriod(LocalDate.now())
				.setDocTypeIndic(BzstDipOecdDocType.OECD_1)
				.setPlatformOperatorOrganizationName("TestOrg")
				.setPlatformOperatorPlatformName("TestApp")
				.setPlatformOperatorAddress(new BzstDipAddressFix("TestCity"))
				.buildAndValidate()
		);
	}
	
	@Test
	void buildAndValidate_defaultRealmBaseUrl()
	{
		Assertions.assertDoesNotThrow(
			() -> new BzstDipConfigurationBuilder()
				.setClientId("abcd1234-ab12-ab12-ab12-abcdef123456")
				.setTaxID("86095742719")
				.setTaxNumber("123")
				.setSigningProvider(new SigningProviderByJks("DemoKeystore.jks", "test123"))
				.setMessageTypeIndic(BzstDipDpiMessageType.DPI_401)
				.setReportingPeriod(LocalDate.now())
				.setDocTypeIndic(BzstDipOecdDocType.OECD_1)
				.setPlatformOperatorOrganizationName("TestOrg")
				.setPlatformOperatorPlatformName("TestApp")
				.setPlatformOperatorAddress(new BzstDipAddressFix("TestCity"))
				.buildAndValidate()
		);
	}
	
	@Test
	void buildAndValidate_cesop()
	{
		Assertions.assertDoesNotThrow(
			() -> new BzstDipConfigurationBuilder()
				.setApplicationCode(BzstDipConfiguration.SupportedApplicationCode.CESOP)
				.setApplicationCode(BzstDipConfiguration.SupportedApplicationCode.CESOP)
				.setClientId("abcd1234-ab12-ab12-ab12-abcdef123456")
				.setTaxID("86095742719")
				.setTaxNumber("123")
				.setCertificateKeystoreInputStream(() -> ClassLoader.getSystemClassLoader()
					.getResourceAsStream("DemoKeystore.jks"))
				.setCertificateKeystorePassword("test123")
				.setRealmEnvironmentBaseUrl(BzstDipConfiguration.ENDPOINT_URL_TEST)
				.setMessageTypeIndicCesop(BzstCesopMessageTypeIndicEnum.CESOP_101)
				.setReportingPeriod(LocalDate.now())
				.setDocTypeIndic(BzstDipOecdDocType.OECD_1)
				.setPlatformOperatorOrganizationName("TestOrg")
				.setPlatformOperatorPlatformName("TestApp")
				.setPlatformOperatorAddress(new BzstDipAddressFix("TestCity"))
				.setTransmittingCountry(BzstDipCountryCode.DE)
				.setMessageType(BzstCesopMessageTypeEnum.PMT)
				.setReportingPeriodCesopQuarter(2)
				.setReportingPeriodCesopYear("2024")
				.setMessageRefId(UUID.randomUUID().toString())
				.setTimestamp(ZonedDateTime.parse("2024-05-08T14:02:53Z", DateTimeFormatter.ISO_ZONED_DATE_TIME))
				.buildAndValidate()
		);
	}
	
	@Test
	void buildAndValidate_wrongReportingPeriod()
	{
		Assertions.assertThrows(
			ConfigurationException.class,
			() -> new BzstDipConfigurationBuilder()
				.setClientId("abcd1234-ab12-ab12-ab12-abcdef123456")
				.setTaxID("86095742719")
				.setTaxNumber("123")
				.setSigningProvider(new SigningProviderByJks("DemoKeystore.jks", "test123"))
				.setRealmEnvironmentBaseUrl(BzstDipConfiguration.ENDPOINT_URL_TEST)
				.setMessageTypeIndic(BzstDipDpiMessageType.DPI_401)
				.setReportingPeriod(LocalDate.now().plusDays(1))
				.setDocTypeIndic(BzstDipOecdDocType.OECD_1)
				.setPlatformOperatorOrganizationName("TestOrg")
				.setPlatformOperatorPlatformName("TestApp")
				.setPlatformOperatorAddress(new BzstDipAddressFix("TestCity"))
				.buildAndValidate()
		);
	}
	
	@Test
	void buildAndValidate_missingReportingPeriod()
	{
		Assertions.assertThrows(
			ConfigurationException.class,
			() -> new BzstDipConfigurationBuilder()
				.setClientId("abcd1234-ab12-ab12-ab12-abcdef123456")
				.setTaxID("86095742719")
				.setTaxNumber("123")
				.setSigningProvider(new SigningProviderByJks("DemoKeystore.jks", "test123"))
				.setRealmEnvironmentBaseUrl(BzstDipConfiguration.ENDPOINT_URL_TEST)
				.setMessageTypeIndic(BzstDipDpiMessageType.DPI_401)
				.setDocTypeIndic(BzstDipOecdDocType.OECD_1)
				.setPlatformOperatorOrganizationName("TestOrg")
				.setPlatformOperatorPlatformName("TestApp")
				.setPlatformOperatorAddress(new BzstDipAddressFix("TestCity"))
				.buildAndValidate()
		);
	}
	
	@Test
	void buildAndValidate_missingAddress()
	{
		Assertions.assertThrows(
			ConfigurationException.class,
			() -> new BzstDipConfigurationBuilder()
				.setClientId("abcd1234-ab12-ab12-ab12-abcdef123456")
				.setTaxID("86095742719")
				.setTaxNumber("123")
				.setSigningProvider(new SigningProviderByJks("DemoKeystore.jks", "test123"))
				.setRealmEnvironmentBaseUrl(BzstDipConfiguration.ENDPOINT_URL_TEST)
				.setMessageTypeIndic(BzstDipDpiMessageType.DPI_401)
				.setReportingPeriod(LocalDate.now())
				.setDocTypeIndic(BzstDipOecdDocType.OECD_1)
				.setPlatformOperatorOrganizationName("TestOrg")
				.setPlatformOperatorPlatformName("TestApp")
				.buildAndValidate()
		);
	}
}
