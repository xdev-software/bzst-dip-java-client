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
package software.xdev.bzst.dip.client.model.message;

import java.util.List;


/**
 * Represents the result of querying for a response on the BZST API.
 *
 * @param dataTransferNumber    of the sent message
 * @param singleTransferResults of all received results
 */
public record BzstDipCompleteResult(String dataTransferNumber, List<BzstDipSingleTransferResult> singleTransferResults)
{
	
	public static BzstDipCompleteResult fromResult(
		final BzstDipSendingResult sendingResult,
		final BzstDipRequestStatusResult requestStatusResult)
	{
		return new BzstDipCompleteResult(
			sendingResult.dataTransferNumber(),
			requestStatusResult.singleTransferResults()
		);
	}
	
	/**
	 * @return {@code true} if the set {@link #dataTransferNumber} is found in the results and the status
	 * of the result is
	 * {@link software.xdev.bzst.dip.client.model.message.BzstDipSingleTransferResult.StatusCodeMeaning#OK}.
	 */
	public boolean isSuccessful()
	{
		return this.singleTransferResults.stream().anyMatch(
			result -> result.transferNumber().equals(this.dataTransferNumber)
				&& result.getStatusCodeMeaning().equals(BzstDipSingleTransferResult.StatusCodeMeaning.OK)
		);
	}
}
