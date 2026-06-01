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
package software.xdev.bzst.dip.client.model.message.dac7;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public record BzstDipSingleTransferResult(String transferNumber, int httpStatusCode)
{
	public enum StatusCodeMeaning
	{
		OK(200),
		UNGUELTIGE_DATENTRANSFERNUMMER(400),
		UNGUELTIGER_AUTHORIZATION_HEADER(401),
		PROTOKOLL_LIEGT_NICHT_VOR(404),
		DATENUEBERMITTLER_IST_DEM_VORGANG_NICHT_ZUGEORDNET(424),
		INTERNER_FEHLER(500),
		UNDEFINIERT(-1);
		
		private static final Map<Integer, StatusCodeMeaning> CODE_TO_MEANING =
			Arrays.stream(StatusCodeMeaning.values())
				.collect(Collectors.toMap(s -> s.httpStatusCode, Function.identity()));
		
		private final int httpStatusCode;
		
		StatusCodeMeaning(final int httpStatusCode)
		{
			this.httpStatusCode = httpStatusCode;
		}
		
		public static StatusCodeMeaning getMeaningFromStatusCode(final int httpStatusCode)
		{
			return CODE_TO_MEANING.getOrDefault(httpStatusCode, UNDEFINIERT);
		}
	}
	
	public StatusCodeMeaning getStatusCodeMeaning()
	{
		return StatusCodeMeaning.getMeaningFromStatusCode(this.httpStatusCode);
	}
}
