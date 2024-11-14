package software.xdev.bzst.dip.client.model.message.cesop;

import software.xdev.bzst.dip.client.model.message.dac7.BzstDipCountryCode;


/**
 * @param name                Name of the reporting payment service provider {@link BzstCesopName}
 * @param countryCode         Transferring state {@link BzstDipCountryCode}
 * @param address             The address of the payee as it appears in the records of the payment service provider.
 *                            {@link BzstCesopAdress}
 * @param taxIdentification   Any sales tax identification number or other national tax number of the payee. It is clear
 *                            from the legal basis that this element must be specified if it is available. Otherwise it
 *                            can be left blank {@link BzstCesopTAXIdentification}
 * @param accountIdentifier   The IBAN of the payees payment account or another identifier that uniquely identifies the
 *                            payee and indicates its location {@link BzstCesopAccountIdentifier}
 * @param reportedTransaction The superordinate element reportedTransaction, in which all payments and payment refunds
 *                            received for the beneficiary concerned that have been reported by the payment service
 *                            provider. {@link BzstCesopReportedTransaction}
 * @param docSpec             Defines data that make it possible to correct payees in the message.
 *                            {@link BzstCesopDocSpec}
 */
public record BzstCesopReportedPayee(BzstCesopName name, BzstDipCountryCode countryCode, BzstCesopAdress address,
									 BzstCesopTAXIdentification taxIdentification,
									 BzstCesopAccountIdentifier accountIdentifier,
									 BzstCesopReportedTransaction reportedTransaction,
									 BzstCesopDocSpec docSpec)
{
}
