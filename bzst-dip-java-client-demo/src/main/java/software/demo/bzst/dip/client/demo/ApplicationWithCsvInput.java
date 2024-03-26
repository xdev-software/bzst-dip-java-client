package software.demo.bzst.dip.client.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import software.xdev.bzst.dip.client.BzstDipClient;
import software.xdev.bzst.dip.client.exception.HttpStatusCodeNotExceptedException;
import software.xdev.bzst.dip.client.model.configuration.BzstDipConfiguration;
import software.xdev.bzst.dip.client.model.message.BzstDipCompleteResult;


@SuppressWarnings("checkstyle:MagicNumber")
public final class ApplicationWithCsvInput
{
	private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationWithCsvInput.class);
	
	public static void main(final String[] args)
		throws InterruptedException, HttpStatusCodeNotExceptedException, IOException
	{
		final BzstDipConfiguration configuration = Application.createConfiguration();
		
		final String csvData = getResourceFileAsString("DemoCsvData.csv");
		
		final BzstDipClient bzstDipClient = new BzstDipClient(configuration);
		final BzstDipCompleteResult bzstDipCompleteResult = bzstDipClient.sendDipAndQueryResult(csvData);
		LOGGER.info(
			"Sending dip message with transfer number {} {}",
			bzstDipCompleteResult.dataTransferNumber(),
			bzstDipCompleteResult.isSuccessful() ? "was successful." : "has failed!"
		);
	}
	
	private static String getResourceFileAsString(final String fileName) throws IOException
	{
		final ClassLoader classLoader = ClassLoader.getSystemClassLoader();
		try(final InputStream is = classLoader.getResourceAsStream(fileName))
		{
			if(is == null)
			{
				return null;
			}
			try(final InputStreamReader isr = new InputStreamReader(is);
				final BufferedReader reader = new BufferedReader(isr))
			{
				return reader.lines().collect(Collectors.joining(System.lineSeparator()));
			}
		}
	}
	
	private ApplicationWithCsvInput()
	{
	}
}
