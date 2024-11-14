package software.xdev.bzst.dip.client.model.message.cesop;

import java.math.BigDecimal;

import software.xdev.bzst.dip.client.model.message.dac7.BzstDipCurrency;


/**
 * @param currency    The currency of the payment or payment refund. {@link BzstDipCurrency}
 * @param amountValue The amount of the payment or payment refund.
 */
public record BzstCesopAmount(BzstDipCurrency currency, BigDecimal amountValue)
{
}
