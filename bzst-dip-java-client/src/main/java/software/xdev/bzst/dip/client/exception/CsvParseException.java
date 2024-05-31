package software.xdev.bzst.dip.client.exception;

import java.io.IOException;


public class CsvParseException extends IOException
{
	public CsvParseException(final String message)
	{
		super(message);
	}
	
	public CsvParseException(final String message, final Throwable cause)
	{
		super(message, cause);
	}
}
