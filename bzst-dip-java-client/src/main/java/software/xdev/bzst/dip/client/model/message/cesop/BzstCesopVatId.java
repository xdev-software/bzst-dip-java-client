package software.xdev.bzst.dip.client.model.message.cesop;

/**
 * @param msCountryCodeTypeEnum The member state from which the payees VAT identification number of the payee originates
 *                              from
 * @param value                 The VAT ID.
 */
public record BzstCesopVatId(BzstCesopMSCountryCodeTypeEnum msCountryCodeTypeEnum, String value)
{
}
