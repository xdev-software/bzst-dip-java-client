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

import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.time.LocalDate;
import java.time.ZonedDateTime;

import software.xdev.bzst.dip.client.model.message.cesop.BzstCesopMessageTypeEnum;
import software.xdev.bzst.dip.client.model.message.cesop.BzstCesopMessageTypeIndicEnum;
import software.xdev.bzst.dip.client.model.message.dac7.BzstDipAddressFix;
import software.xdev.bzst.dip.client.model.message.dac7.BzstDipCountryCode;
import software.xdev.bzst.dip.client.signing.SigningProvider;


/**
 * Holds all the information and configuration to use the Bzst-Dip-Client
 */
public class BzstDipConfiguration
{
	/**
	 * DAC7 and CESOP both EU regulatory frameworks aimed at improving tax transparency and combating tax evasion
	 * within
	 * the European Union. This data is shared with EU tax authorities to ensure proper taxation of digital econmy
	 * participants across member states
	 * <p>
	 * DAC7: requires digital platform (e.g. facilitating e-commerce, short term rental) to report income earned by
	 * sellers using their services.
	 * <p>
	 * CESOP: requires payment service providers (e.g. banks and payment platforms) to report cross-border payments
	 * involving EU businesses to a central EU system. This data helps tax authorities and monitor transactions more
	 * effectively across borders.
	 */
	public enum SupportedApplicationCode
	{
		DAC7("DAC7"),
		
		CESOP("CESOP");
		
		String value;
		
		SupportedApplicationCode(final String value)
		{
			this.value = value;
		}
	}
	
	
	/**
	 * Country Code. {@link BzstDipCountryCode}
	 */
	private final BzstDipCountryCode transmittingCountry;
	
	/**
	 * The element declares the type of message such as
	 * Payment data or validation result {@link BzstCesopMessageTypeEnum}
	 */
	private final BzstCesopMessageTypeEnum messageType;
	
	/**
	 * Contains a unique identifier for the message in the form of a UUID version 4
	 */
	private final String messageRefId;
	
	/**
	 * Stands for the year to which the payment data relates
	 */
	private final String reportingPeriodCesopYear;
	
	/**
	 * Stands for the quarter to which the payment data relates
	 */
	private final int reportingPeriodCesopQuarter;
	
	/**
	 * The exact date and time at which the PSP generated the message
	 */
	private final ZonedDateTime timestamp;
	
	/**
	 * Indicates whether the message contains new data, corrections/deletions to previously sent data or whether no
	 * data is to be reported
	 * {@link BzstCesopMessageTypeIndicEnum}
	 */
	private final BzstCesopMessageTypeIndicEnum messageTypeIndicEnum;
	
	/**
	 * Describes if the format is DAC7 or CESOP.
	 * {@link SupportedApplicationCode}
	 */
	private final String applicationCode;
	
	/**
	 * This is the provided production endpoint url of the BZST.
	 */
	public static final String ENDPOINT_URL_PRODUCTION = "https://mds.bzst.bund.de";
	/**
	 * This is the provided test endpoint url of the BZST.
	 */
	public static final String ENDPOINT_URL_TEST = "https://mds-ktst.bzst.bund.de";
	
	/**
	 * Defines the password for the certificate keystore that is used to decrypt the local keystore.
	 */
	private final String certificateKeystorePassword;
	
	/**
	 * Defines the alias of the private key within the key store.
	 */
	private final String keyStorePrivateKeyAlias;
	/**
	 * Is used for identifying this client to the BZST API. A valid issuer/clientId is defined by the BZST and must
	 * have been received from them.
	 * <p>
	 * See <a href="https://www.bzst.de/SharedDocs/Downloads/DE/EOP_BOP/khb_dip
	 * .pdf?__blob=publicationFile&v=9">Kommunikationshandbuch DIP-Standard 1.4</a> - Section 2.2.1:<br>
	 * <i>DIP-ID des Kunden, welche bei der Freischaltung vergeben wurde</i>
	 * </p>
	 */
	private final String clientId;
	/**
	 * Steueridentifikationsnummer (Steuer-ID) without spaces or slashes ({@code /})
	 */
	private final String taxID;
	/**
	 * If {@code true} the {@link #taxID} is validated by the {@link TaxNumberValidator}. Default value is
	 * {@code true}.
	 */
	private final boolean validateTaxID;
	/**
	 * <p>
	 * Organizational characteristic for the specified provider. The Steueridentifikationsnummer (for identification in
	 * the portal via Elster) or the BZST number and the associated type (ELSTER or BZSTCERT) are used.
	 * </p>
	 * <p>
	 * See <a href="https://www.bzst.de/SharedDocs/Downloads/DE/EOP_BOP/khb_dip
	 * .pdf?__blob=publicationFile&v=9">Kommunikationshandbuch DIP-Standard 1.4</a> - Section 5.1.3:
	 * </p>
	 */
	private final String taxNumber;
	/**
	 * <ul>
	 * <li>For production: {@link #ENDPOINT_URL_PRODUCTION}</li>
	 * <li>For test (default):  {@link #ENDPOINT_URL_TEST}</li>
	 * </ul>
	 */
	private final String realmEnvironmentBaseUrl;
	/**
	 * Defines if the client is running in an {@link BzstDipEnvironment#PRODUCTION} or in an
	 * {@link BzstDipEnvironment#TEST} environment.
	 */
	private final BzstDipEnvironment environment;
	
	/**
	 * Defines weather the message that is to send contains new information ({@link BzstDipDpiMessageType#DPI_401},
	 * corrective information ({@link BzstDipDpiMessageType#DPI_402} or no information
	 * ({@link BzstDipDpiMessageType#DPI_403}).
	 */
	private final BzstDipDpiMessageType messageTypeIndic;
	
	/**
	 * References the last day of the year that is sent.
	 * <p>
	 * E.g. for the year 2023 this would be {@code LocalDate.of(2023,12,31)}
	 * </p>
	 * <p>
	 * Date must be in the past or current date.<br> See <a
	 * href="https://www.bzst.de/SharedDocs/Downloads/DE/Digitale_Plattformbetreiber/kommunikationshandbuch_dac7_dpi
	 * .pdf?__blob=publicationFile&v=9"> Kommunikationshandbuch Meldepflichten digitaler Plattformbetreiber (Section
	 * 2.2)
	 * </a>
	 * <i>"Eine Lieferung von Daten zu in der Zukunft liegenden Meldejahren ist nicht möglich, d.h. das
	 * Kalenderjahr in ReportingPeriod muss kleiner gleich dem aktuellen Kalenderjahr sein.</i>
	 * </p>
	 */
	private final LocalDate reportingPeriod;
	
	/**
	 * Defines which type of message is sent and why.
	 */
	private final BzstDipOecdDocType docType;
	
	/**
	 * Defines a way to get a {@link X509Certificate} and an {@link PrivateKey} for signing the xml to send.
	 * <p>
	 *     This can be done by providing two PEM files ({@link SigningProviderByPem},
	 *     a JKS file ({@link SigningProviderByJks}) or by implementing a custom
	 *     {@link SigningProvider}.
	 * </p>
	 */
	private final SigningProvider signingProvider;
	
	/**
	 * Must get set if {@link #docType} is {@link BzstDipOecdDocType#OECD_0}.<br/> The id references the xml document
	 * which is supposed to be overwritten.
	 */
	private final String platformOperatorDocRefId;
	/**
	 * Must get set if {@link #docType} is {@link BzstDipOecdDocType#OECD_2} or {@link BzstDipOecdDocType#OECD_3}.<br/>
	 * The id references the xml document which is supposed to be corrected or deleted.
	 */
	private final String platformOperatorCorrDocRefId;
	
	private final BzstDipQueryResultConfiguration queryResultConfiguration;
	
	/**
	 * Defines the name of the operators organization. (e.g. XDEV Software GmbH)
	 */
	private final String platformOperatorOrganizationName;
	/**
	 * Defines the name of the operators platform. (e.g. TestApp)
	 */
	private final String platformOperatorPlatformName;
	
	/**
	 * Defines the address of the operator.
	 */
	private final BzstDipAddressFix platformOperatorAddress;
	
	@SuppressWarnings("PMD.ExcessiveParameterList")
	public BzstDipConfiguration(
		final BzstDipCountryCode transmittingCountry,
		final BzstCesopMessageTypeEnum messageType,
		final String messageRefId,
		final String reportingPeriodCesopYear,
		final int reportingPeriodCesopQuarter,
		final ZonedDateTime timestamp,
		final BzstCesopMessageTypeIndicEnum messageTypeIndicEnum,
		final SupportedApplicationCode applicationCode,
		final String certificateKeystorePassword,
		final String keyStorePrivateKeyAlias,
		final String clientId,
		final String taxID,
		final boolean validateTaxID,
		final String taxNumber,
		final String realmEnvironmentBaseUrl,
		final BzstDipEnvironment environment,
		final BzstDipDpiMessageType messageTypeIndic,
		final LocalDate reportingPeriod,
		final BzstDipOecdDocType docType,
		final SigningProvider signingProvider,
		final String platformOperatorDocRefId,
		final String platformOperatorCorrDocRefId,
		final BzstDipQueryResultConfiguration queryResultConfiguration,
		final String platformOperatorOrganizationName,
		final String platformOperatorPlatformName,
		final BzstDipAddressFix platformOperatorAddress)
	{
		this.transmittingCountry = transmittingCountry;
		this.messageType = messageType;
		this.messageRefId = messageRefId;
		this.reportingPeriodCesopYear = reportingPeriodCesopYear;
		this.reportingPeriodCesopQuarter = reportingPeriodCesopQuarter;
		this.timestamp = timestamp;
		this.messageTypeIndicEnum = messageTypeIndicEnum;
		this.applicationCode = applicationCode.value;
		this.certificateKeystorePassword = certificateKeystorePassword;
		this.keyStorePrivateKeyAlias = keyStorePrivateKeyAlias;
		this.clientId = clientId;
		this.taxID = taxID;
		this.validateTaxID = validateTaxID;
		this.taxNumber = taxNumber;
		this.realmEnvironmentBaseUrl = realmEnvironmentBaseUrl;
		this.environment = environment;
		this.messageTypeIndic = messageTypeIndic;
		this.reportingPeriod = reportingPeriod;
		this.docType = docType;
		this.signingProvider = signingProvider;
		this.platformOperatorDocRefId = platformOperatorDocRefId;
		this.platformOperatorCorrDocRefId = platformOperatorCorrDocRefId;
		this.queryResultConfiguration = queryResultConfiguration;
		this.platformOperatorOrganizationName = platformOperatorOrganizationName;
		this.platformOperatorPlatformName = platformOperatorPlatformName;
		this.platformOperatorAddress = platformOperatorAddress;
	}
	
	public String getCertificateKeystorePassword()
	{
		return this.certificateKeystorePassword;
	}
	
	public String getKeyStorePrivateKeyAlias()
	{
		return this.keyStorePrivateKeyAlias;
	}
	
	public String getClientId()
	{
		return this.clientId;
	}
	
	public String getTaxID()
	{
		return this.taxID;
	}
	
	public String getTaxNumber()
	{
		return this.taxNumber;
	}
	
	public String getRealmEnvironmentBaseUrl()
	{
		return this.realmEnvironmentBaseUrl;
	}
	
	public BzstDipEnvironment getEnvironment()
	{
		return this.environment;
	}
	
	public BzstDipDpiMessageType getMessageTypeIndic()
	{
		return this.messageTypeIndic;
	}
	
	public LocalDate getReportingPeriod()
	{
		return this.reportingPeriod;
	}
	
	public BzstDipOecdDocType getDocType()
	{
		return this.docType;
	}
	
	public String getPlatformOperatorDocRefId()
	{
		return this.platformOperatorDocRefId;
	}
	
	public String getPlatformOperatorCorrDocRefId()
	{
		return this.platformOperatorCorrDocRefId;
	}
	
	public SigningProvider getSigningProvider()
	{
		return this.signingProvider;
	}
	
	public BzstDipQueryResultConfiguration getQueryResultConfiguration()
	{
		return this.queryResultConfiguration;
	}
	
	public String getPlatformOperatorOrganizationName()
	{
		return this.platformOperatorOrganizationName;
	}
	
	public String getPlatformOperatorPlatformName()
	{
		return this.platformOperatorPlatformName;
	}
	
	public BzstDipAddressFix getPlatformOperatorAddress()
	{
		return this.platformOperatorAddress;
	}
	
	public boolean isValidateTaxID()
	{
		return this.validateTaxID;
	}
	
	public String getApplicationCode()
	{
		return this.applicationCode;
	}
	
	public BzstDipCountryCode getTransmittingCountry()
	{
		return this.transmittingCountry;
	}
	
	public BzstCesopMessageTypeEnum getMessageType()
	{
		return this.messageType;
	}
	
	public String getMessageRefId()
	{
		return this.messageRefId;
	}
	
	public int getReportingPeriodCesopQuarter()
	{
		return this.reportingPeriodCesopQuarter;
	}
	
	public String getReportingPeriodCesopYear()
	{
		return this.reportingPeriodCesopYear;
	}
	
	public ZonedDateTime getTimestamp()
	{
		return this.timestamp;
	}
	
	public BzstCesopMessageTypeIndicEnum getMessageTypeIndicEnum()
	{
		return this.messageTypeIndicEnum;
	}
}
