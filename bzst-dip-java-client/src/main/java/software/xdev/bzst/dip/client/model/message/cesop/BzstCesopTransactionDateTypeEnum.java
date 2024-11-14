package software.xdev.bzst.dip.client.model.message.cesop;

public enum BzstCesopTransactionDateTypeEnum
{
	/**
	 * Execution Date
	 */
	CESOP_701("CESOP701"),
	
	/**
	 * Clearing Date
	 */
	CESOP_702("CESOP702"),
	
	/**
	 * Authorisation Date
	 */
	CESOP_703("CESOP703"),
	
	/**
	 * Purchase Date
	 */
	CESOP_704("CESOP704"),
	
	/**
	 * Other Date
	 */
	CESOP_709("CESOP709");
	private final String value;
	
	BzstCesopTransactionDateTypeEnum(final String v)
	{
		this.value = v;
	}
	
	public String value()
	{
		return this.value;
	}
}
