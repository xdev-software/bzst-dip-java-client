package software.xdev.bzst.dip.client.model.message.cesop;

public enum BzstCesopPaymentMethodEnum
{
	/**
	 * The credit card as a means of payment.
	 */
	CARD_PAYMENT("Card payment"),
	
	/**
	 * The bank transfer as a means of payment.
	 */
	BANK_TRANSFER("Bank transfer"),
	
	/**
	 * The direct debit as a means of payment.
	 */
	DIRECT_DEBIT("Direct debit"),
	
	/**
	 * The e-Money as a means of payment.
	 */
	E_MONEY("E-money"),
	
	/**
	 * The money remittance as a means of payment.
	 */
	MONEY_REMITTANCE("Money Remittance"),
	
	/**
	 * The marketplace as a means of payment.
	 */
	MARKETPLACE("Marketplace"),
	
	/**
	 * The intermediary as a means of payment.
	 */
	INTERMEDIARY("Intermediary"),
	
	/**
	 * Other mean of payment. Please specify it in the element PaymentMethodOther.
	 */
	OTHER("Other");
	private final String value;
	
	BzstCesopPaymentMethodEnum(final String v)
	{
		this.value = v;
	}
	
	public String value()
	{
		return this.value;
	}
}
