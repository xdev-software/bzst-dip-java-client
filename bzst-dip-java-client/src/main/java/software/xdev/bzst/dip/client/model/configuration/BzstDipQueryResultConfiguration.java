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
package software.xdev.bzst.dip.client.model.configuration;

import java.time.Duration;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;


/**
 * @param delayBeforeCheckingResults Defines the initial delay after the data is sent and the result is queried.<br>
 *                                   Defaults to
 *                                   {@link
 *                                   BzstDipConfigurationBuilder#DEFAULT_DELAY_BEFORE_CHECKING_RESULTS_IN_MILLIS}.
 * @param retryQueryResultsAmount    Defines how many times the result is queried until it stops and fails.<br> Defaults
 *                                   to {@link BzstDipConfigurationBuilder#DEFAULT_RETRY_QUERY_RESULTS}.
 * @param delayInBetweenResultChecks Defines the delay between each request for a result.<br> Defaults to
 *                                   {@link
 *                                   BzstDipConfigurationBuilder#DEFAULT_DELAY_IN_BETWEEN_RESULTS_CHECKS_IN_MILLIS}.
 */
public record BzstDipQueryResultConfiguration(
	@NotNull
	Duration delayBeforeCheckingResults,
	@PositiveOrZero
	int retryQueryResultsAmount,
	@NotNull
	Duration delayInBetweenResultChecks
)
{
}
