package software.xdev.bzst.dip.client.model.message.cesop;

/**
 * @param paymentMethodEnum The payment Method (e.g. Bank Transfer) {@link BzstCesopPaymentMethodEnum}
 */
public record BzstCesopPaymentMethod(BzstCesopPaymentMethodEnum paymentMethodEnum)
{
}
