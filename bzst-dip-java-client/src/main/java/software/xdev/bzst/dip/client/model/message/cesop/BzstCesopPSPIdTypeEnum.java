package software.xdev.bzst.dip.client.model.message.cesop;

public enum BzstCesopPSPIdTypeEnum
{
	
	/**
	 * The PSP Identifier is a BIC code.
	 */
	BIC("BIC"),
	
	/**
	 * Other PSP Identifier type.
	 */
	OTHER("Other");
	private final String value;
	
	BzstCesopPSPIdTypeEnum(final String v)
	{
		this.value = v;
	}
	
	public String value()
	{
		return this.value;
	}
}
