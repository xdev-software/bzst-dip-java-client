package software.xdev.bzst.dip.client.model.message.cesop;

/**
 * @param pspIdTypeEnum Type of identifier of the payment service provider of the payee. {@link BzstCesopPSPIdTypeEnum}
 * @param value         Value of e.g. BIC
 */
public record BzstCesopPSPIdType(BzstCesopPSPIdTypeEnum pspIdTypeEnum, String value)
{
}
