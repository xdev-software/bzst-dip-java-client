/*
 * Copyright © 2024 XDEV Software (https://xdev.software)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
