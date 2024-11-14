package software.xdev.bzst.dip.client.model.message.cesop;

/**
 * @param accountIdentifierType Type of location identifier {@link BzstCesopAccountIdentifierTypeEnum}
 * @param msCountryCodeType     Country Code {@link BzstCesopMSCountryCodeTypeEnum}
 */
public record BzstCesopPayerMS(BzstCesopAccountIdentifierTypeEnum accountIdentifierType,
							   BzstCesopMSCountryCodeTypeEnum msCountryCodeType)
{
}
