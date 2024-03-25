package software.demo.bzst.dip.client.demo;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import software.xdev.bzst.dip.client.BzstDipClient;
import software.xdev.bzst.dip.client.exception.HttpStatusCodeNotExceptedException;
import software.xdev.bzst.dip.client.model.configuration.BzstDipConfiguration;
import software.xdev.bzst.dip.client.model.configuration.BzstDipConfigurationBuilder;
import software.xdev.bzst.dip.client.model.configuration.BzstDipDpiMessageType;
import software.xdev.bzst.dip.client.model.configuration.BzstDipOecdDocType;
import software.xdev.bzst.dip.client.model.message.BzstDipAddressFix;
import software.xdev.bzst.dip.client.model.message.BzstDipCompleteResult;
import software.xdev.bzst.dip.client.model.message.BzstDipConsiderations;
import software.xdev.bzst.dip.client.model.message.BzstDipCorrectableReportableSellerType;
import software.xdev.bzst.dip.client.model.message.BzstDipCountryCode;
import software.xdev.bzst.dip.client.model.message.BzstDipCurrency;
import software.xdev.bzst.dip.client.model.message.BzstDipFees;
import software.xdev.bzst.dip.client.model.message.BzstDipMessage;
import software.xdev.bzst.dip.client.model.message.BzstDipMonetaryAmount;
import software.xdev.bzst.dip.client.model.message.BzstDipNumberOfActivities;
import software.xdev.bzst.dip.client.model.message.BzstDipOecdLegalAddressType;
import software.xdev.bzst.dip.client.model.message.BzstDipTaxes;
import software.xdev.bzst.dip.client.model.message.BzstDipTin;


@SuppressWarnings("checkstyle:MagicNumber")
public final class Application
{
	private static final Logger LOGGER = LogManager.getLogger(Application.class);
	
	public static void main(final String[] args)
		throws InterruptedException, HttpStatusCodeNotExceptedException, IOException
	{
		final BzstDipConfiguration configuration = createConfiguration();
		final BzstDipClient bzstDipClient = new BzstDipClient(configuration);
		final BzstDipCompleteResult bzstDipCompleteResult = bzstDipClient.sendDipAndQueryResult(createMessage());
		LOGGER.info(
			String.format(
				"Sending dip message with transfer number %s %s",
				bzstDipCompleteResult.getDataTransferNumber(),
				bzstDipCompleteResult.isSuccessful() ? "was successful." : "has failed!"
			)
		);
	}
	
	public static BzstDipConfiguration createConfiguration()
	{
		return new BzstDipConfigurationBuilder()
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
			.buildAndValidate();
	}
	
	public static BzstDipMessage createMessage()
	{
		return new BzstDipMessage(
			List.of(
				new BzstDipCorrectableReportableSellerType(
					BzstDipCountryCode.DE,
					new BzstDipTin(
						"123-456-789",
						BzstDipCountryCode.DE,
						null
					),
					"123-456-789",
					"123-456-789",
					"Mick",
					"Fleetwood",
					LocalDate.of(1947, 6, 24),
					BzstDipOecdLegalAddressType.OECD_301,
					new BzstDipAddressFix(
						"Weiden"
					),
					new BzstDipNumberOfActivities(1, 2, 3, 4),
					new BzstDipConsiderations(
						new BzstDipMonetaryAmount(10, BzstDipCurrency.EUR),
						new BzstDipMonetaryAmount(10, BzstDipCurrency.EUR),
						new BzstDipMonetaryAmount(10, BzstDipCurrency.EUR),
						new BzstDipMonetaryAmount(10, BzstDipCurrency.EUR)
					),
					new BzstDipFees(
						new BzstDipMonetaryAmount(1, BzstDipCurrency.EUR),
						new BzstDipMonetaryAmount(1, BzstDipCurrency.EUR),
						new BzstDipMonetaryAmount(1, BzstDipCurrency.EUR),
						new BzstDipMonetaryAmount(1, BzstDipCurrency.EUR)
					),
					new BzstDipTaxes(
						new BzstDipMonetaryAmount(1, BzstDipCurrency.EUR),
						new BzstDipMonetaryAmount(1, BzstDipCurrency.EUR),
						new BzstDipMonetaryAmount(1, BzstDipCurrency.EUR),
						new BzstDipMonetaryAmount(1, BzstDipCurrency.EUR)
					),
					"DE,AT,NL",
					UUID.randomUUID().toString()
				)
			)
		);
	}
	
	private Application()
	{
	}
}
