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
import software.xdev.bzst.dip.client.exception.PropertyNotSetException;
import software.xdev.bzst.dip.client.model.message.BzstDipAddressFix;
import software.xdev.bzst.dip.client.signing.SigningProvider;
import software.xdev.bzst.dip.client.signing.SigningProviderByJks;
import software.xdev.bzst.dip.client.signing.SigningProviderByPem;


/**
 * Builder construct for the {@link BzstDipConfiguration}.
 */
@SuppressWarnings({"unused", "UnusedReturnValue"})
public class BzstDipConfigurationBuilder
{
	public static final int DEFAULT_DELAY_BEFORE_CHECKING_RESULTS_IN_MILLIS = 1_000;
	public static final int DEFAULT_RETRY_QUERY_RESULTS = 10;
	public static final int DEFAULT_DELAY_IN_BETWEEN_RESULTS_CHECKS_IN_MILLIS = 1_000;
	
	private final PropertiesSupplier propertiesSupplier;
	/**
	 * @see BzstDipConfiguration#getClientId()
	 */
	private String clientId;
	/**
	 * @see BzstDipConfiguration#getTaxID()
	 */
	private String taxID;
	/**
	 * @see BzstDipConfiguration#getTaxNumber()
	 */
	private String taxNumber;
	/**
	 * @see BzstDipConfiguration#getRealmEnvironmentBaseUrl()
	 */
	private String realmEnvironmentBaseUrl;
	/**
	 * @see BzstDipConfiguration#getEnvironment()
	 */
	private BzstDipEnvironment environment;
	/**
	 * @see BzstDipConfiguration#getMessageTypeIndic()
	 */
	private BzstDipDpiMessageType messageTypeIndic;
	/**
	 * @see BzstDipConfiguration#getReportingPeriod()
	 */
	private LocalDate reportingPeriod;
	/**
	 * @see BzstDipConfiguration#getDocType()
	 */
	private BzstDipOecdDocType docTypeIndic;
	/**
	 * @see BzstDipConfiguration#getPlatformOperatorDocRefId()
	 */
	private String platformOperatorDocRefId;
	/**
	 * @see BzstDipConfiguration#getPlatformOperatorCorrDocRefId()
	 */
	private String platformOperatorCorrDocRefId;
	/**
	 * @see BzstDipConfiguration#getSigningProvider()
	 */
	private SigningProvider signingProvider;
	/**
	 * @see BzstDipQueryResultConfiguration#delayBeforeCheckingResults
	 */
	private Duration delayBeforeCheckingResults;
	/**
	 * @see BzstDipQueryResultConfiguration#retryQueryResultsAmount
	 */
	private Integer retryQueryResultsAmount;
	/**
	 * @see BzstDipQueryResultConfiguration#delayInBetweenResultChecks
	 */
	private Duration delayInBetweenResultChecks;
	/**
	 * @see BzstDipConfiguration#getPlatformOperatorOrganizationName()
	 */
	private String platformOperatorOrganizationName;
	/**
	 * @see BzstDipConfiguration#getPlatformOperatorPlatformName()
	 */
	private String platformOperatorPlatformName;
	/**
	 * @see BzstDipConfiguration#getPlatformOperatorAddress()
	 */
	private BzstDipAddressFix platformOperatorAddress;
	
	public BzstDipConfigurationBuilder(final PropertiesSupplier propertiesSupplier)
	{
		this.propertiesSupplier = propertiesSupplier;
	}
	
	public BzstDipConfigurationBuilder()
	{
		this(new PropertiesSupplier());
	}
	
	/**
	 * @param clientId {@link #clientId}
	 * @return itself
	 */
	public BzstDipConfigurationBuilder setClientId(final String clientId)
	{
		this.clientId = clientId;
		return this;
	}
	
	/**
	 * @param taxID {@link #taxID}
	 * @return itself
	 */
	public BzstDipConfigurationBuilder setTaxID(final String taxID)
	{
		this.taxID = taxID;
		return this;
	}
	
	/**
	 * @param taxNumber {@link #taxNumber}
	 * @return itself
	 */
	public BzstDipConfigurationBuilder setTaxNumber(final String taxNumber)
	{
		this.taxNumber = taxNumber;
		return this;
	}
	
	/**
	 * @param realmEnvironmentBaseUrl {@link #realmEnvironmentBaseUrl}
	 * @return itself
	 */
	public BzstDipConfigurationBuilder setRealmEnvironmentBaseUrl(final String realmEnvironmentBaseUrl)
	{
		this.realmEnvironmentBaseUrl = realmEnvironmentBaseUrl;
		return this;
	}
	
	/**
	 * @param environment {@link #environment}
	 * @return itself
	 */
	public BzstDipConfigurationBuilder setEnvironment(final BzstDipEnvironment environment)
	{
		this.environment = environment;
		return this;
	}
	
	/**
	 * @param messageTypeIndic {@link #messageTypeIndic}
	 * @return itself
	 */
	public BzstDipConfigurationBuilder setMessageTypeIndic(final BzstDipDpiMessageType messageTypeIndic)
	{
		this.messageTypeIndic = messageTypeIndic;
		return this;
	}
	
	/**
	 * @param reportingPeriod {@link #reportingPeriod}
	 * @return itself
	 */
	public BzstDipConfigurationBuilder setReportingPeriod(final LocalDate reportingPeriod)
	{
		this.reportingPeriod = reportingPeriod;
		return this;
	}
	
	/**
	 * @param docTypeIndic {@link #docTypeIndic}
	 * @return itself
	 */
	public BzstDipConfigurationBuilder setDocTypeIndic(final BzstDipOecdDocType docTypeIndic)
	{
		this.docTypeIndic = docTypeIndic;
		return this;
	}
	
	/**
	 * @param platformOperatorDocRefId {@link #platformOperatorDocRefId}
	 * @return itself
	 */
	public BzstDipConfigurationBuilder setPlatformOperatorDocRefId(final String platformOperatorDocRefId)
	{
		this.platformOperatorDocRefId = platformOperatorDocRefId;
		return this;
	}
	
	/**
	 * @param platformOperatorCorrDocRefId {@link #platformOperatorCorrDocRefId}
	 * @return itself
	 */
	public BzstDipConfigurationBuilder setPlatformOperatorCorrDocRefId(final String platformOperatorCorrDocRefId)
	{
		this.platformOperatorCorrDocRefId = platformOperatorCorrDocRefId;
		return this;
	}
	
	/**
	 * @param delayBeforeCheckingResults {@link #delayBeforeCheckingResults}
	 * @return itself
	 */
	public BzstDipConfigurationBuilder setDelayBeforeCheckingResults(final Duration delayBeforeCheckingResults)
	{
		this.delayBeforeCheckingResults = delayBeforeCheckingResults;
		return this;
	}
	
	/**
	 * @param retryQueryResultsAmount {@link #retryQueryResultsAmount}
	 * @return itself
	 */
	public BzstDipConfigurationBuilder setRetryQueryResultsAmount(final Integer retryQueryResultsAmount)
	{
		this.retryQueryResultsAmount = retryQueryResultsAmount;
		return this;
	}
	
	/**
	 * @param delayInBetweenResultChecks {@link #delayInBetweenResultChecks}
	 * @return itself
	 */
	public BzstDipConfigurationBuilder setDelayInBetweenResultChecks(final Duration delayInBetweenResultChecks)
	{
		this.delayInBetweenResultChecks = delayInBetweenResultChecks;
		return this;
	}
	
	/**
	 * @param signingProvider {@link #signingProvider}
	 * @return itself
	 */
	public BzstDipConfigurationBuilder setSigningProvider(final SigningProvider signingProvider)
	{
		this.signingProvider = signingProvider;
		return this;
	}
	
	/**
	 * @param platformOperatorOrganizationName {@link #platformOperatorOrganizationName}
	 * @return itself
	 */
	public BzstDipConfigurationBuilder setPlatformOperatorOrganizationName(
		final String platformOperatorOrganizationName)
	{
		this.platformOperatorOrganizationName = platformOperatorOrganizationName;
		return this;
	}
	
	/**
	 * @param platformOperatorPlatformName {@link #platformOperatorPlatformName}
	 * @return itself
	 */
	public BzstDipConfigurationBuilder setPlatformOperatorPlatformName(final String platformOperatorPlatformName)
	{
		this.platformOperatorPlatformName = platformOperatorPlatformName;
		return this;
	}
	
	/**
	 * @param platformOperatorAddress {@link #platformOperatorAddress}
	 * @return itself
	 */
	public BzstDipConfigurationBuilder setPlatformOperatorAddress(final BzstDipAddressFix platformOperatorAddress)
	{
		this.platformOperatorAddress = platformOperatorAddress;
		return this;
	}
	
	/**
	 * @return a new created {@link BzstDipConfiguration} with the values provided by this builder.
	 */
	public BzstDipConfiguration buildAndValidate()
	{
		final BzstDipConfiguration configuration = new BzstDipConfiguration(
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
			this.getSigningProvider(this.signingProvider),
			this.getSetPropertyOrReadFromFile(
				this.platformOperatorDocRefId,
				PropertiesSupplier.PROPERTY_NAME_PLATFORM_OPERATOR_DOC_REF_ID,
				""),
			this.getSetPropertyOrReadFromFile(
				this.platformOperatorCorrDocRefId,
				PropertiesSupplier.PROPERTY_NAME_PLATFORM_OPERATOR_CORR_DOC_REF_ID,
				""),
			new BzstDipQueryResultConfiguration(
				this.getSetPropertyOrReadFromFileDuration(
					this.delayBeforeCheckingResults,
					PropertiesSupplier.PROPERTY_NAME_DELAY_BEFORE_CHECKING_RESULTS_IN_MS,
					Duration.ofMillis(DEFAULT_DELAY_BEFORE_CHECKING_RESULTS_IN_MILLIS)),
				this.getSetPropertyOrReadFromFileInteger(
					this.retryQueryResultsAmount,
					PropertiesSupplier.PROPERTY_NAME_RETRY_QUERY_RESULTS_AMOUNT,
					DEFAULT_RETRY_QUERY_RESULTS),
				this.getSetPropertyOrReadFromFileDuration(
					this.delayInBetweenResultChecks,
					PropertiesSupplier.PROPERTY_NAME_DELAY_IN_BETWEEN_RESULT_CHECKS_IN_MS,
					Duration.ofMillis(DEFAULT_DELAY_IN_BETWEEN_RESULTS_CHECKS_IN_MILLIS))
			),
			this.getSetPropertyOrReadFromFile(
				this.platformOperatorOrganizationName,
				PropertiesSupplier.PROPERTY_NAME_PLATFORM_OPERATOR_ORGANIZATION),
			this.getSetPropertyOrReadFromFile(
				this.platformOperatorPlatformName,
				PropertiesSupplier.PROPERTY_NAME_PLATFORM_OPERATOR_PLATFORM),
			this.getSetPropertyOrReadFromFileAddress(this.platformOperatorAddress)
		);
		BzstDipConfigurationValidator.validateConfiguration(configuration);
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
	
	private SigningProvider getSigningProvider(final SigningProvider builderProperty)
	{
		if(builderProperty != null)
		{
			return builderProperty;
		}
		final SigningProviderByJks signingProviderByJks = this.createJksKeyProvider();
		if(signingProviderByJks != null)
		{
			return signingProviderByJks;
		}
		
		final SigningProviderByPem signingProviderByPem = this.createPemKeyProvider();
		if(signingProviderByPem != null)
		{
			return signingProviderByPem;
		}
		throw new ConfigurationException("A signing provider must be set");
	}
	
	private SigningProviderByJks createJksKeyProvider()
	{
		final String jksKeystorePassword =
			this.propertiesSupplier.getPropertyFromConfig(PropertiesSupplier.PROPERTY_NAME_SIGNING_JKS_KEYSTORE_PASSWORD);
		final String jksKeystoreFile =
			this.propertiesSupplier.getPropertyFromConfig(PropertiesSupplier.PROPERTY_NAME_SIGNING_JKS_KEYSTORE_FILE);
		if(jksKeystorePassword == null && jksKeystoreFile == null)
		{
			return null;
		}
		if(jksKeystorePassword != null && jksKeystoreFile != null)
		{
			return new SigningProviderByJks(
				jksKeystoreFile,
				jksKeystorePassword
			);
		}
		if(jksKeystoreFile == null)
		{
			throw new ConfigurationException(
				"Invalid configuration of JKS Keystore: Keystore password is set, but the keystore file is not.");
		}
		throw new ConfigurationException(
			"Invalid configuration of JKS Keystore: Keystore file is set, but the keystore password is not.");
	}
	
	private SigningProviderByPem createPemKeyProvider()
	{
		final String signatureAlgorithm = this.getSetPropertyOrReadFromFile(
			null,
			PropertiesSupplier.PROPERTY_NAME_SIGNING_PEM_SIGNATURE_ALGORITHM,
			SigningProviderByPem.DEFAULT_PRIVATE_KEY_ALGORITHM);
		final String pemCertificateFile =
			this.propertiesSupplier.getPropertyFromConfig(PropertiesSupplier.PROPERTY_NAME_SIGNING_PEM_CERTIFICATE_FILE);
		final String pemPrivateKeyFile =
			this.propertiesSupplier.getPropertyFromConfig(PropertiesSupplier.PROPERTY_NAME_SIGNING_PEM_PRIVATE_KEY_FILE);
		if(pemCertificateFile == null && pemPrivateKeyFile == null)
		{
			return null;
		}
		if(pemCertificateFile != null && pemPrivateKeyFile != null)
		{
			return new SigningProviderByPem(
				pemCertificateFile,
				pemPrivateKeyFile,
				signatureAlgorithm
			);
		}
		if(pemCertificateFile == null)
		{
			throw new ConfigurationException(
				"Invalid configuration of PEM Signature: The private key is set, but the certificate file is not.");
		}
		throw new ConfigurationException(
			"Invalid configuration of PEM Signature: The certificate file is set, but the private key is not.");
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
