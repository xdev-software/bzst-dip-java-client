package software.xdev.bzst.dip.client.model.message.cesop;

/**
 * @param vatId The VAT identification number of the payee confirmed by the EU identification number of the paye
 * @param value The Tax ID.
 */
public record BzstCesopTAXIdentification(BzstCesopVatId vatId, String value)
{
}
