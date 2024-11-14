package software.xdev.bzst.dip.client.model.message.cesop;

public enum BzstCesopNameTypeEnum
{
	/**
	 * Business name
	 */
	BUSINESS,
	
	/**
	 * Trade name
	 */
	TRADE,
	
	/**
	 * Legal name
	 */
	LEGAL,
	
	/**
	 * Person name
	 */
	PERSON,
	
	/**
	 * Other name
	 */
	OTHER;
	
	public String value()
	{
		return this.name();
	}
	
	public static BzstCesopNameTypeEnum fromValue(final String v)
	{
		return valueOf(v);
	}
}
