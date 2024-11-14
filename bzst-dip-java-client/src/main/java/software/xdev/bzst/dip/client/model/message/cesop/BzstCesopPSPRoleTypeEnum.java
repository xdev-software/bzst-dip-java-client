package software.xdev.bzst.dip.client.model.message.cesop;

public enum BzstCesopPSPRoleTypeEnum
{
	/**
	 * The market category of the Payment Service Provider is Three party card scheme.
	 */
	THREE_PARTY_CARD_SCHEME("Three party card scheme"),
	
	/**
	 * The market category of the Payment Service Provider is Four party card scheme.
	 */
	FOUR_PARTY_CARD_SCHEME("Four party card scheme"),
	
	/**
	 * The market category of the Payment Service Provider is E-money provider.
	 */
	E_MONEY_PROVIDER("E-money provider"),
	
	/**
	 * The market category of the Payment Service Provider is Acquirer.
	 */
	ACQUIRER("Acquirer"),
	
	/**
	 * The market category of the Payment Service Provider is e-Wallet provider.
	 */
	E_WALLET_PROVIDER("e-Wallet provider"),
	
	/**
	 * The market category of the Payment Service Provider is Money Transfer operator.
	 */
	MONEY_TRANSFER_OPERATOR("Money Transfer operator"),
	
	/**
	 * The market category of the Payment Service Provider is Issuer of payment instruments.
	 */
	ISSUER_OF_PAYMENT_INSTRUMENTS("Issuer of payment instruments"),
	
	/**
	 * The market category of the Payment Service Provider is Payment Processor.
	 */
	PAYMENT_PROCESSOR("Payment Processor"),
	
	/**
	 * The market category of the Payment Service Provider is E-payment.
	 */
	E_PAYMENT("E-payment"),
	
	/**
	 * The market category of the Payment Service Provider is Payment collector.
	 */
	PAYMENT_COLLECTOR("Payment collector"),
	
	/**
	 * Other category of Payment Service Provider.
	 */
	OTHER("Other");
	private final String value;
	
	BzstCesopPSPRoleTypeEnum(final String v)
	{
		this.value = v;
	}
	
	public String value()
	{
		return this.value;
	}
}
