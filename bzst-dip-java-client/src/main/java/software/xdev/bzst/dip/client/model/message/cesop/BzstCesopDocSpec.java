package software.xdev.bzst.dip.client.model.message.cesop;

import java.util.UUID;


/**
 * @param docTypeIndicEnum Describes whether it is new data, corrected dara or a deletion of data.
 *                         {@link BzstCesopDocTypeIndicEnum}
 * @param docRefId         Unique identifier for the payee
 */
public record BzstCesopDocSpec(BzstCesopDocTypeIndicEnum docTypeIndicEnum, UUID docRefId)
{
}
