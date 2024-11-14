package software.xdev.bzst.dip.client.model.message.cesop;

/**
 * @param pspIdType The BIC or another business identifier that payment service provider uniquely identifies the payment
 *                  service provider. {@link BzstCesopPSPIdType}
 * @param name      Name of the reporting payment service provider {@link BzstCesopName}
 */
public record BzstCesopReportingPSP(BzstCesopPSPIdType pspIdType, BzstCesopName name)
{
}
