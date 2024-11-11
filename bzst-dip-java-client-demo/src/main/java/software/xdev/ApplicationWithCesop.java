package software.xdev;

import java.io.IOException;
import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import software.xdev.bzst.dip.client.BzstDipClient;
import software.xdev.bzst.dip.client.exception.HttpStatusCodeNotExceptedException;
import software.xdev.bzst.dip.client.model.configuration.BzstDipConfiguration;
import software.xdev.bzst.dip.client.model.configuration.BzstDipConfigurationBuilder;
import software.xdev.bzst.dip.client.model.configuration.BzstDipDpiMessageType;
import software.xdev.bzst.dip.client.model.configuration.BzstDipOecdDocType;
import software.xdev.bzst.dip.client.model.message.dac7.BzstDipAddressFix;
import software.xdev.bzst.dip.client.model.message.dac7.BzstDipCompleteResult;
import software.xdev.bzst.dip.client.model.message.dac7.BzstDipMessage;


@SuppressWarnings("checkstyle:MagicNumber")
public final class ApplicationWithCesop
{
	private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationWithCesop.class);
	
	public static void main(final String[] args)
		throws InterruptedException, HttpStatusCodeNotExceptedException, IOException
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
			.setApplicationCode(BzstDipConfiguration.SupportedApplicationCode.CESOP)
			.setClientId("abcd1234-ab12-ab12-ab12-abcdef123456")
			.setTaxID("86095742719")
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
			// TODO Build CESOP Message
		);
	}
	
	private ApplicationWithCesop()
	{
	}
}
