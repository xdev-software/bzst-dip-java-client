package software.xdev;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import software.xdev.bzst.dip.client.BzstDipClient;
import software.xdev.bzst.dip.client.exception.HttpStatusCodeNotExceptedException;
import software.xdev.bzst.dip.client.model.configuration.BzstDipConfiguration;
import software.xdev.bzst.dip.client.model.configuration.BzstDipConfigurationBuilder;
import software.xdev.bzst.dip.client.model.configuration.PropertiesSupplier;
import software.xdev.bzst.dip.client.model.message.BzstDipCompleteResult;


@SuppressWarnings("checkstyle:MagicNumber")
public final class ApplicationWithConfigurationFromProperties
{
	private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationWithConfigurationFromProperties.class);
	
	public static void main(final String[] args)
		throws InterruptedException, HttpStatusCodeNotExceptedException, IOException
	{
		final BzstDipConfiguration configuration = createConfigurationFromProperties();
		final BzstDipClient bzstDipClient = new BzstDipClient(configuration);
		final BzstDipCompleteResult bzstDipCompleteResult =
			bzstDipClient.sendDipAndQueryResult(Application.createMessage());
		LOGGER.info(
			"Sending dip message with transfer number {} {}",
			bzstDipCompleteResult.dataTransferNumber(),
			bzstDipCompleteResult.isSuccessful() ? "was successful." : "has failed!"
		);
	}
	
	public static BzstDipConfiguration createConfigurationFromProperties()
	{
		return new BzstDipConfigurationBuilder(
			new PropertiesSupplier(
				ClassLoader.getSystemClassLoader().getResourceAsStream("app.properties")
			))
			.buildAndValidate();
	}
	
	private ApplicationWithConfigurationFromProperties()
	{
	}
}
