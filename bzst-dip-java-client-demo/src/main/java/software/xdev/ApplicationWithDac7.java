package software.xdev;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import software.xdev.bzst.dip.client.BzstDipClient;
import software.xdev.bzst.dip.client.model.configuration.BzstDipConfiguration;
import software.xdev.bzst.dip.client.model.configuration.BzstDipConfigurationBuilder;
import software.xdev.bzst.dip.client.model.configuration.BzstDipDpiMessageType;
import software.xdev.bzst.dip.client.model.configuration.BzstDipOecdDocType;
import software.xdev.bzst.dip.client.model.message.dac7.BzstDipAddressFix;
import software.xdev.bzst.dip.client.model.message.dac7.BzstDipCompleteResult;
import software.xdev.bzst.dip.client.model.message.dac7.BzstDipConsiderations;
import software.xdev.bzst.dip.client.model.message.dac7.BzstDipCorrectableReportableSellerType;
import software.xdev.bzst.dip.client.model.message.dac7.BzstDipCountryCode;
import software.xdev.bzst.dip.client.model.message.dac7.BzstDipCurrency;
import software.xdev.bzst.dip.client.model.message.dac7.BzstDipFees;
import software.xdev.bzst.dip.client.model.message.dac7.BzstDipMessage;
import software.xdev.bzst.dip.client.model.message.dac7.BzstDipMonetaryAmount;
import software.xdev.bzst.dip.client.model.message.dac7.BzstDipNumberOfActivities;
import software.xdev.bzst.dip.client.model.message.dac7.BzstDipOecdLegalAddressType;
import software.xdev.bzst.dip.client.model.message.dac7.BzstDipTaxes;
import software.xdev.bzst.dip.client.model.message.dac7.BzstDipTin;


@SuppressWarnings("checkstyle:MagicNumber")
public final class ApplicationWithDac7
{
	private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationWithDac7.class);
	
	public static void main(final String[] args)
		throws InterruptedException, IOException
	{
		final BzstDipConfiguration configuration = createConfiguration();
		final BzstDipClient bzstDipClient = new BzstDipClient(configuration);
		final BzstDipCompleteResult bzstDipCompleteResult = bzstDipClient.sendDipAndQueryResult(createMessage());
		LOGGER.info(
			"Sending dip message with transfer number {} {}",
				bzstDipCompleteResult.dataTransferNumber(),
				bzstDipCompleteResult.isSuccessful() ? "was successful." : "has failed!"
		);
	}
	
	public static BzstDipConfiguration createConfiguration()
	{
		return new BzstDipConfigurationBuilder()
			.setApplicationCode(BzstDipConfiguration.SupportedApplicationCode.DAC7)
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
	
	private ApplicationWithDac7()
	{
	}
}
