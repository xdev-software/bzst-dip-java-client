package software.xdev.bzst.dip.client.model.message.cesop;

import software.xdev.bzst.dip.client.model.message.dac7.BzstDipCountryCode;


/**
 * @param countryCode           see {@link software.xdev.bzst.dip.client.model.message.dac7.BzstDipCurrency}
 * @param accountIdentifierType see {@link BzstCesopAccountIdentifierTypeEnum}
 * @param value                 describes the IBAN (e.g. DE32503302010298200040)
 */
public record BzstCesopAccountIdentifier(BzstDipCountryCode countryCode,
										 BzstCesopAccountIdentifierTypeEnum accountIdentifierType, String value)
{
}
