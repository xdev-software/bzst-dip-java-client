package software.xdev.bzst.dip.client.model.message.cesop;

public enum BzstCesopMessageTypeIndicEnum
{
	
	/**
	 * The message contains new data.
	 */
	CESOP_100("CESOP100"),
	
	/**
	 * The message contains corrections or deletions of previously sent data.
	 */
	CESOP_101("CESOP101"),
	
	/**
	 * The message indicates there is no data to report.
	 */
	CESOP_102("CESOP102");
	private final String value;
	
	BzstCesopMessageTypeIndicEnum(final String v)
	{
		this.value = v;
	}
	
	public String value()
	{
		return this.value;
	}
}
