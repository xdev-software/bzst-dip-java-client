package software.demo.bzst.dip.client.demo;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import software.xdev.bzst.dip.client.BzstDipClient;
import software.xdev.bzst.dip.client.exception.HttpStatusCodeNotExceptedException;
import software.xdev.bzst.dip.client.model.configuration.BzstDipConfiguration;
import software.xdev.bzst.dip.client.model.configuration.BzstDipConfigurationBuilder;
import software.xdev.bzst.dip.client.model.configuration.PropertiesSupplier;
import software.xdev.bzst.dip.client.model.message.BzstDipCompleteResult;


@SuppressWarnings("checkstyle:MagicNumber")
public final class ApplicationWithConfigurationFromProperties
{
	private static final Logger LOGGER = LogManager.getLogger(ApplicationWithConfigurationFromProperties.class);
	
	public static void main(final String[] args)
		throws InterruptedException, HttpStatusCodeNotExceptedException, IOException
	{
		final BzstDipConfiguration configuration = createConfigurationFromProperties();
		final BzstDipClient bzstDipClient = new BzstDipClient(configuration);
		final BzstDipCompleteResult bzstDipCompleteResult =
			bzstDipClient.sendDipAndQueryResult(Application.createMessage());
		LOGGER.info(
			String.format(
				"Sending dip message with transfer number %s %s",
				bzstDipCompleteResult.getDataTransferNumber(),
				bzstDipCompleteResult.isSuccessful() ? "was successful." : "has failed!"
			)
		);
	}
	
	public static BzstDipConfiguration createConfigurationFromProperties()
	{
		return new BzstDipConfigurationBuilder(
			new PropertiesSupplier(
				ClassLoader.getSystemClassLoader().getResourceAsStream("app.properties")
			))
			.build();
	}
	
	private ApplicationWithConfigurationFromProperties()
	{
	}
}
