package software.xdev.bzst.dip.client.model.message.cesop;

/**
 * @param nameType Type of name {@link BzstCesopNameTypeEnum}
 * @param value    Payment service provider
 */
public record BzstCesopName(BzstCesopNameTypeEnum nameType, String value)
{
}
