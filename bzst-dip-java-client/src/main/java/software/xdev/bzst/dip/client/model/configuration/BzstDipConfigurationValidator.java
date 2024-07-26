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
import java.time.LocalDate;

import software.xdev.bzst.dip.client.exception.ConfigurationException;


public final class BzstDipConfigurationValidator
{
	private BzstDipConfigurationValidator()
	{
	}
	
	public static void validateConfiguration(final BzstDipConfiguration configuration)
	{
		checkForNullOrBlank(
			PropertiesSupplier.PROPERTY_NAME_CERTIFICATE_KEYSTORE_PASSWORD,
			configuration.getCertificateKeystorePassword());
		checkForNullOrBlank(
			PropertiesSupplier.PROPERTY_NAME_CLIENT_ID, configuration.getClientId());
		checkForNullOrBlank(
			PropertiesSupplier.PROPERTY_NAME_TAX_ID, configuration.getTaxID());
		if(configuration.isValidateTaxID())
		{
			TaxNumberValidator.validateTaxNumber(configuration.getTaxID());
		}
		checkForNullOrBlank(
			PropertiesSupplier.PROPERTY_NAME_TAX_NUMBER, configuration.getTaxNumber());
		checkForNullOrBlank(
			PropertiesSupplier.PROPERTY_NAME_REALM_ENVIRONMENT_BASE_URL, configuration.getRealmEnvironmentBaseUrl());
		checkForNull(PropertiesSupplier.PROPERTY_NAME_ENVIRONMENT, configuration.getEnvironment());
		checkForNull(PropertiesSupplier.PROPERTY_NAME_MESSAGE_TYPE_INDIC, configuration.getMessageTypeIndic());
		checkForNull(PropertiesSupplier.PROPERTY_NAME_DOC_TYPE_INDIC, configuration.getDocType());
		checkForNull("certificate keystore input", configuration.getCertificateKeystoreInputStream());
		checkForNullOrBlank(
			PropertiesSupplier.PROPERTY_NAME_PLATFORM_OPERATOR_ORGANIZATION,
			configuration.getPlatformOperatorOrganizationName());
		checkForNullOrBlank(
			PropertiesSupplier.PROPERTY_NAME_PLATFORM_OPERATOR_PLATFORM,
			configuration.getPlatformOperatorPlatformName());
		checkForNull("platform address", configuration.getPlatformOperatorAddress());
		
		checkForNullOrFuture(
			PropertiesSupplier.PROPERTY_NAME_REPORTING_PERIOD, configuration.getReportingPeriod());
		if(
			configuration.getDocType().isNewTransmission()
				&& (configuration.getPlatformOperatorDocRefId() == null
				|| configuration.getPlatformOperatorDocRefId().isBlank())
		)
		{
			throw new ConfigurationException(
				PropertiesSupplier.PROPERTY_NAME_PLATFORM_OPERATOR_DOC_REF_ID,
				"When sending a new transmission (OECD_0) a DocRefId must be set!"
			);
		}
		if(configuration.getDocType().isCorrectionOrDeletion()
			&& (configuration.getPlatformOperatorCorrDocRefId() == null
			|| configuration.getPlatformOperatorCorrDocRefId().isBlank())
		)
		{
			throw new ConfigurationException(
				PropertiesSupplier.PROPERTY_NAME_PLATFORM_OPERATOR_CORR_DOC_REF_ID,
				"When sending a correction or deletion (OECD_2 or OECD_3) a CorrDocRefId must be set!"
			);
		}
		final BzstDipQueryResultConfiguration queryResultConfiguration =
			checkForNull("query result configuration", configuration.getQueryResultConfiguration());
		checkForNullOrNegative(
			PropertiesSupplier.PROPERTY_NAME_DELAY_BEFORE_CHECKING_RESULTS_IN_MS,
			queryResultConfiguration.delayBeforeCheckingResults());
		checkForNullOrNegative(
			PropertiesSupplier.PROPERTY_NAME_DELAY_IN_BETWEEN_RESULT_CHECKS_IN_MS,
			queryResultConfiguration.delayInBetweenResultChecks());
		checkForNullOrNegative(
			PropertiesSupplier.PROPERTY_NAME_RETRY_QUERY_RESULTS_AMOUNT,
			queryResultConfiguration.retryQueryResultsAmount());
	}
	
	private static <T> T checkForNull(final String propertyName, final T value)
	{
		if(value == null)
		{
			throw new ConfigurationException(
				propertyName,
				"Configuration value \"%s\" must not be null.".formatted(propertyName));
		}
		return value;
	}
	
	private static void checkForNullOrBlank(final String propertyName, final String value)
	{
		if(value == null || value.isBlank())
		{
			throw new ConfigurationException(
				propertyName,
				"Configuration value \"%s\" must not be null or blank.".formatted(propertyName));
		}
	}
	
	private static void checkForNullOrNegative(final String propertyName, final Duration value)
	{
		if(value == null || value.isNegative())
		{
			throw new ConfigurationException(
				propertyName,
				"Configuration value \"%s\" must not be null or negative.".formatted(propertyName));
		}
	}
	
	private static void checkForNullOrNegative(final String propertyName, final Integer value)
	{
		if(value == null || value < 0)
		{
			throw new ConfigurationException(
				propertyName,
				"Configuration value \"%s\" must not be null or negative.".formatted(propertyName));
		}
	}
	
	private static void checkForNullOrFuture(final String propertyName, final LocalDate value)
	{
		if(value == null || value.isAfter(LocalDate.now()))
		{
			throw new ConfigurationException(
				propertyName,
				"Configuration value \"%s\" must not be null or in the future.".formatted(propertyName));
		}
	}
}
