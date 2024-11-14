package software.xdev.bzst.dip.client.model.message.cesop;

import java.time.ZonedDateTime;


/**
 * @param transactionDateTypeEnum This element describes which type of time is specified as the time of the transaction.
 *                                See here which types are available: {@link BzstCesopTransactionDateTypeEnum}
 * @param value                   Date, Time, and Timezone
 */
public record BzstCesopTransactionDateType(BzstCesopTransactionDateTypeEnum transactionDateTypeEnum,
										   ZonedDateTime value)
{
}
