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

import java.io.InputStream;
import java.time.Duration;
import java.time.LocalDate;
import java.util.function.Supplier;

import software.xdev.bzst.dip.client.exception.ConfigurationException;
import software.xdev.bzst.dip.client.exception.PropertyNotSetException;
import software.xdev.bzst.dip.client.model.message.BzstDipAddressFix;


@SuppressWarnings({"unused", "UnusedReturnValue"})
public class BzstDipConfigurationBuilder
{
	private final PropertiesSupplier propertiesSupplier;
	private String certificateKeystorePassword;
	private String clientId;
	private String taxID;
	private String taxNumber;
	private String realmEnvironmentBaseUrl;
	private BzstDipEnvironment environment;
	private BzstDipDpiMessageType messageTypeIndic;
	private LocalDate reportingPeriod;
	private BzstDipOecdDocType docTypeIndic;
	private String platformOperatorDocRefId;
	private String platformOperatorCorrDocRefId;
	private Supplier<InputStream> certificateKeystoreInputStream;
	private Duration delayBeforeCheckingResults;
	private Integer retryQueryResultsAmount;
	private Duration delayInBetweenResultChecks;
	private String platformOperatorOrganizationName;
	private String platformOperatorPlatformName;
	private BzstDipAddressFix platformOperatorAddress;
	
	public BzstDipConfigurationBuilder(final PropertiesSupplier propertiesSupplier)
	{
		this.propertiesSupplier = propertiesSupplier;
	}
	
	public BzstDipConfigurationBuilder()
	{
		this(new PropertiesSupplier());
	}
	
	public BzstDipConfigurationBuilder setCertificateKeystorePassword(final String certificateKeystorePassword)
	{
		this.certificateKeystorePassword = certificateKeystorePassword;
		return this;
	}
	
	public BzstDipConfigurationBuilder setClientId(final String clientId)
	{
		this.clientId = clientId;
		return this;
	}
	
	public BzstDipConfigurationBuilder setTaxID(final String taxID)
	{
		this.taxID = taxID;
		return this;
	}
	
	public BzstDipConfigurationBuilder setTaxNumber(final String taxNumber)
	{
		this.taxNumber = taxNumber;
		return this;
	}
	
	public BzstDipConfigurationBuilder setRealmEnvironmentBaseUrl(final String realmEnvironmentBaseUrl)
	{
		this.realmEnvironmentBaseUrl = realmEnvironmentBaseUrl;
		return this;
	}
	
	public BzstDipConfigurationBuilder setEnvironment(final BzstDipEnvironment environment)
	{
		this.environment = environment;
		return this;
	}
	
	public BzstDipConfigurationBuilder setMessageTypeIndic(final BzstDipDpiMessageType messageTypeIndic)
	{
		this.messageTypeIndic = messageTypeIndic;
		return this;
	}
	
	public BzstDipConfigurationBuilder setReportingPeriod(final LocalDate reportingPeriod)
	{
		this.reportingPeriod = reportingPeriod;
		return this;
	}
	
	public BzstDipConfigurationBuilder setDocTypeIndic(final BzstDipOecdDocType docTypeIndic)
	{
		this.docTypeIndic = docTypeIndic;
		return this;
	}
	
	public BzstDipConfigurationBuilder setPlatformOperatorDocRefId(final String platformOperatorDocRefId)
	{
		this.platformOperatorDocRefId = platformOperatorDocRefId;
		return this;
	}
	
	public BzstDipConfigurationBuilder setPlatformOperatorCorrDocRefId(final String platformOperatorCorrDocRefId)
	{
		this.platformOperatorCorrDocRefId = platformOperatorCorrDocRefId;
		return this;
	}
	
	public BzstDipConfigurationBuilder setDelayBeforeCheckingResults(final Duration delayBeforeCheckingResults)
	{
		this.delayBeforeCheckingResults = delayBeforeCheckingResults;
		return this;
	}
	
	public BzstDipConfigurationBuilder setRetryQueryResultsAmount(final int retryQueryResultsAmount)
	{
		this.retryQueryResultsAmount = retryQueryResultsAmount;
		return this;
	}
	
	public BzstDipConfigurationBuilder setDelayInBetweenResultChecks(final Duration delayInBetweenResultChecks)
	{
		this.delayInBetweenResultChecks = delayInBetweenResultChecks;
		return this;
	}
	
	public BzstDipConfigurationBuilder setCertificateKeystoreInputStream(
		final Supplier<InputStream> certificateKeystoreInputStream)
	{
		this.certificateKeystoreInputStream = certificateKeystoreInputStream;
		return this;
	}
	
	public BzstDipConfigurationBuilder setPlatformOperatorOrganizationName(
		final String platformOperatorOrganizationName)
	{
		this.platformOperatorOrganizationName = platformOperatorOrganizationName;
		return this;
	}
	
	public BzstDipConfigurationBuilder setPlatformOperatorPlatformName(final String platformOperatorPlatformName)
	{
		this.platformOperatorPlatformName = platformOperatorPlatformName;
		return this;
	}
	
	public BzstDipConfigurationBuilder setPlatformOperatorAddress(final BzstDipAddressFix platformOperatorAddress)
	{
		this.platformOperatorAddress = platformOperatorAddress;
		return this;
	}
	
	public BzstDipConfiguration buildAndValidate()
	{
		final BzstDipConfiguration configuration = new BzstDipConfiguration(
			this.getSetPropertyOrReadFromFile(
				this.certificateKeystorePassword,
				PropertiesSupplier.PROPERTY_NAME_CERTIFICATE_KEYSTORE_PASSWORD,
				""),
			this.getSetPropertyOrReadFromFile(this.clientId, PropertiesSupplier.PROPERTY_NAME_CLIENT_ID),
			this.getSetPropertyOrReadFromFile(this.taxID, PropertiesSupplier.PROPERTY_NAME_TAX_ID),
			this.getSetPropertyOrReadFromFile(this.taxNumber, PropertiesSupplier.PROPERTY_NAME_TAX_NUMBER),
			this.getSetPropertyOrReadFromFile(
				this.realmEnvironmentBaseUrl,
				PropertiesSupplier.PROPERTY_NAME_REALM_ENVIRONMENT_BASE_URL,
				BzstDipConfiguration.ENDPOINT_URL_PRODUCTION),
			this.getSetPropertyOrReadFromFileEnv(
				this.environment,
				PropertiesSupplier.PROPERTY_NAME_ENVIRONMENT,
				BzstDipEnvironment.PRODUCTION),
			this.getSetPropertyOrReadFromFileDpiMessageType(
				this.messageTypeIndic,
				PropertiesSupplier.PROPERTY_NAME_MESSAGE_TYPE_INDIC),
			this.getSetPropertyOrReadFromFileDate(
				this.reportingPeriod,
				PropertiesSupplier.PROPERTY_NAME_REPORTING_PERIOD),
			this.getSetPropertyOrReadFromFileOecdDocType(
				this.docTypeIndic,
				PropertiesSupplier.PROPERTY_NAME_DOC_TYPE_INDIC),
			this.getSetPropertyOrReadFromFile(
				this.platformOperatorDocRefId,
				PropertiesSupplier.PROPERTY_NAME_PLATFORM_OPERATOR_DOC_REF_ID,
				""),
			this.getSetPropertyOrReadFromFile(
				this.platformOperatorCorrDocRefId,
				PropertiesSupplier.PROPERTY_NAME_PLATFORM_OPERATOR_CORR_DOC_REF_ID,
				""),
			this.getInputStreamSupplier(
				this.certificateKeystoreInputStream,
				PropertiesSupplier.PROPERTY_NAME_CERTIFICATE_KEYSTORE_FILE),
			this.getSetPropertyOrReadFromFileDuration(
				this.delayBeforeCheckingResults,
				PropertiesSupplier.PROPERTY_NAME_DELAY_BEFORE_CHECKING_RESULTS_IN_MS,
				Duration.ofMillis(1000)),
			this.getSetPropertyOrReadFromFileInteger(
				this.retryQueryResultsAmount,
				PropertiesSupplier.PROPERTY_NAME_RETRY_QUERY_RESULTS_AMOUNT,
				10),
			this.getSetPropertyOrReadFromFileDuration(
				this.delayInBetweenResultChecks,
				PropertiesSupplier.PROPERTY_NAME_DELAY_IN_BETWEEN_RESULT_CHECKS_IN_MS,
				Duration.ofMillis(1000)),
			this.getSetPropertyOrReadFromFile(
				this.platformOperatorOrganizationName,
				PropertiesSupplier.PROPERTY_NAME_PLATFORM_OPERATOR_ORGANIZATION),
			this.getSetPropertyOrReadFromFile(
				this.platformOperatorPlatformName,
				PropertiesSupplier.PROPERTY_NAME_PLATFORM_OPERATOR_PLATFORM),
			this.getSetPropertyOrReadFromFileAddress(this.platformOperatorAddress)
		);
		this.validateConfiguration(configuration);
		return configuration;
	}
	
	private void validateConfiguration(final BzstDipConfiguration configuration)
	{
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
	}
	
	private Supplier<InputStream> getInputStreamSupplier(
		final Supplier<InputStream> builderProperty,
		final String propertyNameInFile)
	{
		if(builderProperty != null)
		{
			return builderProperty;
		}
		final String inputFile = this.getSetPropertyOrReadFromFile(null, propertyNameInFile);
		return () -> ClassLoader.getSystemClassLoader().getResourceAsStream(inputFile);
	}
	
	private BzstDipAddressFix getSetPropertyOrReadFromFileAddress(final BzstDipAddressFix builderProperty)
	{
		if(builderProperty != null)
		{
			return builderProperty;
		}
		return new BzstDipAddressFix(
			this.getSetPropertyOrReadFromFile(
				null,
				PropertiesSupplier.PROPERTY_NAME_PLATFORM_OPERATOR_ADDRESS_STREET,
				null),
			this.getSetPropertyOrReadFromFile(
				null,
				PropertiesSupplier.PROPERTY_NAME_PLATFORM_OPERATOR_ADDRESS_BUILDING,
				null),
			this.getSetPropertyOrReadFromFile(
				null,
				PropertiesSupplier.PROPERTY_NAME_PLATFORM_OPERATOR_ADDRESS_SUITE,
				null),
			this.getSetPropertyOrReadFromFile(
				null,
				PropertiesSupplier.PROPERTY_NAME_PLATFORM_OPERATOR_ADDRESS_FLOOR,
				null),
			this.getSetPropertyOrReadFromFile(
				null,
				PropertiesSupplier.PROPERTY_NAME_PLATFORM_OPERATOR_ADDRESS_DISTRICT_NAME,
				null),
			null,
			this.getSetPropertyOrReadFromFile(
				null,
				PropertiesSupplier.PROPERTY_NAME_PLATFORM_OPERATOR_ADDRESS_POST_CODE,
				null),
			// Address should be at least the city
			this.getSetPropertyOrReadFromFile(
				null,
				PropertiesSupplier.PROPERTY_NAME_PLATFORM_OPERATOR_ADDRESS_CITY),
			null
		);
	}
	
	private LocalDate getSetPropertyOrReadFromFileDate(
		final LocalDate builderProperty,
		final String propertyNameInFile)
	{
		if(builderProperty != null)
		{
			return builderProperty;
		}
		return LocalDate.parse(this.getSetPropertyOrReadFromFile(null, propertyNameInFile));
	}
	
	private int getSetPropertyOrReadFromFileInteger(
		final Integer builderProperty,
		final String propertyNameInFile,
		final int defaultValue)
	{
		if(builderProperty != null)
		{
			return builderProperty;
		}
		return Integer.parseInt(this.getSetPropertyOrReadFromFile(
			null,
			propertyNameInFile,
			String.valueOf(defaultValue)));
	}
	
	private Duration getSetPropertyOrReadFromFileDuration(
		final Duration builderProperty,
		final String propertyNameInFile,
		final Duration defaultValue)
	{
		if(builderProperty != null)
		{
			return builderProperty;
		}
		return Duration.ofMillis(Long.parseLong(this.getSetPropertyOrReadFromFile(
			null,
			propertyNameInFile,
			Long.toString(defaultValue.toMillis()))));
	}
	
	private BzstDipEnvironment getSetPropertyOrReadFromFileEnv(
		final BzstDipEnvironment builderProperty,
		final String propertyNameInFile,
		final BzstDipEnvironment defaultProperty)
	{
		if(builderProperty != null)
		{
			return builderProperty;
		}
		return BzstDipEnvironment.valueOf(this.getSetPropertyOrReadFromFile(
			null,
			propertyNameInFile,
			defaultProperty.toString()));
	}
	
	private BzstDipOecdDocType getSetPropertyOrReadFromFileOecdDocType(
		final BzstDipOecdDocType builderProperty,
		final String propertyNameInFile)
	{
		if(builderProperty != null)
		{
			return builderProperty;
		}
		return BzstDipOecdDocType.valueOf(this.getSetPropertyOrReadFromFile(
			null,
			propertyNameInFile));
	}
	
	private BzstDipDpiMessageType getSetPropertyOrReadFromFileDpiMessageType(
		final BzstDipDpiMessageType builderProperty,
		final String propertyNameInFile)
	{
		if(builderProperty != null)
		{
			return builderProperty;
		}
		return BzstDipDpiMessageType.valueOf(this.getSetPropertyOrReadFromFile(
			null,
			propertyNameInFile));
	}
	
	private String getSetPropertyOrReadFromFile(final String builderProperty, final String propertyNameInFile)
	{
		if(builderProperty != null)
		{
			return builderProperty;
		}
		final String propertyFromFile = this.propertiesSupplier.getPropertyFromConfig(propertyNameInFile);
		if(propertyFromFile == null)
		{
			throw new PropertyNotSetException(propertyNameInFile);
		}
		return propertyFromFile;
	}
	
	private String getSetPropertyOrReadFromFile(
		final String builderProperty,
		final String propertyNameInFile,
		final String defaultValue)
	{
		
		if(builderProperty != null)
		{
			return builderProperty;
		}
		final String propertyFromFile = this.propertiesSupplier.getPropertyFromConfig(propertyNameInFile);
		if(propertyFromFile == null)
		{
			return defaultValue;
		}
		return propertyFromFile;
	}
}
