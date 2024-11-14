package software.xdev.bzst.dip.client.model.message.cesop;

public enum BzstCesopLegalAdressTypeEnum
{
	/**
	 * residentialOrBusiness
	 */
	CESOP_301("CESOP301"),
	
	/**
	 * residential
	 */
	CESOP_302("CESOP302"),
	
	/**
	 * business
	 */
	CESOP_303("CESOP303"),
	
	/**
	 * registeredOffice
	 */
	CESOP_304("CESOP304"),
	
	/**
	 * unspecified
	 */
	CESOP_309("CESOP309");
	
	private final String value;
	
	BzstCesopLegalAdressTypeEnum(final String v)
	{
		this.value = v;
	}
	
	public String value()
	{
		return this.value;
	}
}
