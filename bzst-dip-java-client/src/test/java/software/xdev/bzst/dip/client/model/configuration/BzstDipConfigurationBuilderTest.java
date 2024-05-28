package software.xdev.bzst.dip.client.model.configuration;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import software.xdev.bzst.dip.client.exception.ConfigurationException;
import software.xdev.bzst.dip.client.model.message.BzstDipAddressFix;


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
				.setTaxID("123")
				.setTaxNumber("123")
				.setCertificateKeystoreInputStream(() -> ClassLoader.getSystemClassLoader()
					.getResourceAsStream("DemoKeystore.jks"))
				.setCertificateKeystorePassword("test123")
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
				.setTaxID("123")
				.setTaxNumber("123")
				.setCertificateKeystoreInputStream(() -> ClassLoader.getSystemClassLoader()
					.getResourceAsStream("DemoKeystore.jks"))
				.setCertificateKeystorePassword("test123")
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
				.setCertificateKeystoreInputStream(() -> ClassLoader.getSystemClassLoader()
					.getResourceAsStream("DemoKeystore.jks"))
				.setCertificateKeystorePassword("test123")
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
				.setTaxID("123")
				.setCertificateKeystoreInputStream(() -> ClassLoader.getSystemClassLoader()
					.getResourceAsStream("DemoKeystore.jks"))
				.setCertificateKeystorePassword("test123")
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
	void buildAndValidate_missingKeystore()
	{
		Assertions.assertThrows(
			ConfigurationException.class,
			() -> new BzstDipConfigurationBuilder()
				.setClientId("abcd1234-ab12-ab12-ab12-abcdef123456")
				.setTaxID("123")
				.setTaxNumber("123")
				.setCertificateKeystorePassword("test123")
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
	void buildAndValidate_missingKeystorePassword()
	{
		Assertions.assertThrows(
			ConfigurationException.class,
			() -> new BzstDipConfigurationBuilder()
				.setClientId("abcd1234-ab12-ab12-ab12-abcdef123456")
				.setTaxID("123")
				.setTaxNumber("123")
				.setCertificateKeystoreInputStream(() -> ClassLoader.getSystemClassLoader()
					.getResourceAsStream("DemoKeystore.jks"))
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
				.setTaxID("123")
				.setTaxNumber("123")
				.setCertificateKeystoreInputStream(() -> ClassLoader.getSystemClassLoader()
					.getResourceAsStream("DemoKeystore.jks"))
				.setCertificateKeystorePassword("test123")
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
	void buildAndValidate_missingMessageTypeIndic()
	{
		Assertions.assertThrows(
			ConfigurationException.class,
			() -> new BzstDipConfigurationBuilder()
				.setClientId("abcd1234-ab12-ab12-ab12-abcdef123456")
				.setTaxID("123")
				.setTaxNumber("123")
				.setCertificateKeystoreInputStream(() -> ClassLoader.getSystemClassLoader()
					.getResourceAsStream("DemoKeystore.jks"))
				.setCertificateKeystorePassword("test123")
				.setRealmEnvironmentBaseUrl(BzstDipConfiguration.ENDPOINT_URL_TEST)
				.setReportingPeriod(LocalDate.now())
				.setDocTypeIndic(BzstDipOecdDocType.OECD_1)
				.setPlatformOperatorOrganizationName("TestOrg")
				.setPlatformOperatorPlatformName("TestApp")
				.setPlatformOperatorAddress(new BzstDipAddressFix("TestCity"))
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
				.setTaxID("123")
				.setTaxNumber("123")
				.setCertificateKeystoreInputStream(() -> ClassLoader.getSystemClassLoader()
					.getResourceAsStream("DemoKeystore.jks"))
				.setCertificateKeystorePassword("test123")
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
				.setTaxID("123")
				.setTaxNumber("123")
				.setCertificateKeystoreInputStream(() -> ClassLoader.getSystemClassLoader()
					.getResourceAsStream("DemoKeystore.jks"))
				.setCertificateKeystorePassword("test123")
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
				.setTaxID("123")
				.setTaxNumber("123")
				.setCertificateKeystoreInputStream(() -> ClassLoader.getSystemClassLoader()
					.getResourceAsStream("DemoKeystore.jks"))
				.setCertificateKeystorePassword("test123")
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
