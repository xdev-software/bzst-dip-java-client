package software.xdev.bzst.dip.client.model.message.cesop;

public enum BzstCesopDocTypeIndicEnum
{
	/**
	 * New Data
	 */
	CESOP_1("CESOP1"),
	
	/**
	 * Corrected Data
	 */
	CESOP_2("CESOP2"),
	
	/**
	 * Deletion of Data
	 */
	CESOP_3("CESOP3");
	private final String value;
	
	BzstCesopDocTypeIndicEnum(final String v)
	{
		this.value = v;
	}
	
	public String value()
	{
		return this.value;
	}
}
