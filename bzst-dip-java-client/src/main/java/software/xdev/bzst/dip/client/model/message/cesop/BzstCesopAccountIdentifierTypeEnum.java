package software.xdev.bzst.dip.client.model.message.cesop;

public enum BzstCesopAccountIdentifierTypeEnum
{
	
	/**
	 * The IBAN of the payer/payee's payment account which unambiguously identifies, and gives the location of the
	 * payer/payee.
	 */
	IBAN("IBAN"),
	
	/**
	 * The OBAN of the payer/payee’s payment account which unambiguously identifies, and gives the location of the
	 * payer/payee.
	 */
	OBAN("OBAN"),
	
	/**
	 * Other identifier which unambiguously identifies, and gives the location of the payer/payee.
	 */
	OTHER("Other");
	private final String value;
	
	BzstCesopAccountIdentifierTypeEnum(final String v)
	{
		this.value = v;
	}
	
	public String value()
	{
		return this.value;
	}
}
