package software.xdev.bzst.dip.client.model.message.cesop;

/**
 * @param isRefund                              identifies the refund. The value 'FALSE' stands for a Payment, the value
 *                                              'TRUE' for a payment refund.
 * @param transactionIdentifier                 Note that clearly identifies the payment for the payment for the PSP
 * @param transactionDateType                   The element expresses the date and time of the corresponding
 *                                              transaction. {@link BzstCesopTransactionDateType}
 * @param amount                                The amount of the payment or reimbursement {@link BzstCesopAmount}
 * @param paymentMethod                         The payment method used. {@link BzstCesopPaymentMethod}
 * @param initiatedAtPhysicalPremisesOfMerchant Indication that the payment will be the merchants business premises. The
 *                                              element has the Value 'TRUE' if the payment is triggered at the
 *                                              merchants premises. Otherwise, the element has the value 'FALSE'
 * @param payerMS                               Member State of the client the principal is the client of the
 *                                              transaction, who is always domiciled in the EU.
 *                                              {@link BzstCesopPayerMS}
 * @param pspRole                               Role of the payment service provider. {@link BzstCesopPSPRole}
 */
public record BzstCesopReportedTransaction(boolean isRefund, String transactionIdentifier,
										   BzstCesopTransactionDateType transactionDateType, BzstCesopAmount amount,
										   BzstCesopPaymentMethod paymentMethod,
										   boolean initiatedAtPhysicalPremisesOfMerchant,
										   BzstCesopPayerMS payerMS,
										   BzstCesopPSPRole pspRole)
{
}
