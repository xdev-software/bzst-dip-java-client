package software.xdev.bzst.dip.client.model.message.cesop;

import software.xdev.bzst.dip.client.model.message.dac7.BzstDipCountryCode;


/**
 * @param legalAdressType different address types. {@link BzstCesopLegalAdressTypeEnum}
 * @param countryCode     Country code (e.g. DE, FR, EN) {@link BzstDipCountryCode}
 * @param addressFree     Street name, street number, postal code, city. Address belongs to the reported payee
 */
public record BzstCesopAdress(BzstCesopLegalAdressTypeEnum legalAdressType, BzstDipCountryCode countryCode,
							  String addressFree)
{
}
