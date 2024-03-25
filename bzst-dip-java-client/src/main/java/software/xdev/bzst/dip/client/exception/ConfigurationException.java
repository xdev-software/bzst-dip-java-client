package software.xdev.bzst.dip.client.exception;

public class ConfigurationException extends RuntimeException
{
	public ConfigurationException(final String property, final String error)
	{
		this(String.format("Error while configuring in property \"%s\": %s", property, error));
	}
	
	public ConfigurationException(final String message)
	{
		super(message);
	}
}
