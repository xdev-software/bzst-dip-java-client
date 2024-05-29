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

import software.xdev.bzst.dip.client.model.message.BzstDipAddressFix;
import software.xdev.bzst.dip.client.signing.SigningProvider;
import software.xdev.bzst.dip.client.signing.SigningProviderByJks;
import software.xdev.bzst.dip.client.signing.SigningProviderByPem;


/**
 * Holds all the information and configuration to use the Bzst-Dip-Client
 */
public class BzstDipConfiguration
{
	/**
	 * This is the provided production endpoint url of the BZST.
	 */
	public static final String ENDPOINT_URL_PRODUCTION = "https://mds.bzst.bund.de";
	/**
	 * This is the provided test endpoint url of the BZST.
	 */
	public static final String ENDPOINT_URL_TEST = "https://mds-ktst.bzst.bund.de";
	
	/**
	 * Is used for identifying this client to the BZST API.
	 * A valid issuer/clientId is defined by the BZST and must have been received from them.
	 * <p>
	 * See
	 * <a href="https://www.bzst.de/SharedDocs/Downloads/DE/EOP_BOP/khb_dip.pdf?__blob=publicationFile&v=9">Kommunikationshandbuch
	 * DIP-Standard 1.4</a> - Section 2.2.1:<br>
	 * <i>DIP-ID des Kunden, welche bei der Freischaltung vergeben wurde</i>
	 * </p>
	 */
	private final String clientId;
	/**
	 * Steueridentifikationsnummer (Steuer-ID) without spaces or slashes ({@code /})
	 */
	private final String taxID;
	/**
	 * <p>
	 *     Organizational characteristic for the specified provider. The Steueridentifikationsnummer
	 *     (for identification in the portal via Elster) or the BZST number
	 *     and the associated type (ELSTER or BZSTCERT) are used.
	 * </p>
	 * <p>
	 * See
	 * <a href="https://www.bzst.de/SharedDocs/Downloads/DE/EOP_BOP/khb_dip.pdf?__blob=publicationFile&v=9">Kommunikationshandbuch
	 * DIP-Standard 1.4</a> - Section 5.1.3:
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
	 * corrective information ({@link BzstDipDpiMessageType#DPI_402} or
	 * no information ({@link BzstDipDpiMessageType#DPI_403}).
	 */
	private final BzstDipDpiMessageType messageTypeIndic;
	
	/**
	 * References the last day of the year that is sent.
	 * <p>
	 * E.g. for the year 2023 this would be {@code LocalDate.of(2023,12,31)}
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
	
	public BzstDipConfiguration(
		final String clientId,
		final String taxID,
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
		this.clientId = clientId;
		this.taxID = taxID;
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
}
