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

import software.xdev.bzst.dip.client.model.message.BzstDipAddressFix;


public class BzstDipConfiguration
{
	private final String certificateKeystorePassword;
	private final String clientId;
	/**
	 * Steueridentifikationsnummer (Steuer-ID) without spaces or slashes ({@code /})
	 */
	private final String taxID;
	/**
	 * Steuernummer in the "vereinheitlichtem Bundesschema".
	 * <p>
	 * See
	 * <a href="https://www.bzst.de/SharedDocs/Downloads/DE/EOP_BOP/khb_dip.pdf?__blob=publicationFile&v=9">Kommunikationshandbuch
	 * DIP-Standard 1.3</a> - Section 2.6.2
	 */
	private final String taxNumber;
	/**
	 * Default: <a href="https://mds-ktst.bzst.bund.de">https://mds-ktst.bzst.bund.de</a>
	 */
	private final String realmEnvironmentBaseUrl;
	private final BzstDipEnvironment environment;
	private final BzstDipDpiMessageType messageTypeIndic;
	private final LocalDate reportingPeriod;
	private final BzstDipOecdDocType docTypeIndic;
	private final String platformOperatorDocRefId;
	private final String platformOperatorCorrDocRefId;
	private final Supplier<InputStream> certificateKeystoreInputStream;
	private final Duration delayBeforeCheckingResults;
	private final int retryQueryResultsAmount;
	private final Duration delayInBetweenResultChecks;
	private final String platformOperatorOrganizationName;
	private final String platformOperatorPlatformName;
	private final BzstDipAddressFix platformOperatorAddress;
	
	public BzstDipConfiguration(
		final String certificateKeystorePassword,
		final String clientId,
		final String taxID,
		final String taxNumber,
		final String realmEnvironmentBaseUrl,
		final BzstDipEnvironment environment,
		final BzstDipDpiMessageType messageTypeIndic,
		final LocalDate reportingPeriod,
		final BzstDipOecdDocType docTypeIndic,
		final String platformOperatorDocRefId,
		final String platformOperatorCorrDocRefId,
		final Supplier<InputStream> certificateKeystoreInputStream,
		final Duration delayBeforeCheckingResults,
		final int retryQueryResultsAmount,
		final Duration delayInBetweenResultChecks,
		final String platformOperatorOrganizationName,
		final String platformOperatorPlatformName,
		final BzstDipAddressFix platformOperatorAddress)
	{
		this.certificateKeystorePassword = certificateKeystorePassword;
		this.clientId = clientId;
		this.taxID = taxID;
		this.taxNumber = taxNumber;
		this.realmEnvironmentBaseUrl = realmEnvironmentBaseUrl;
		this.environment = environment;
		this.messageTypeIndic = messageTypeIndic;
		this.reportingPeriod = reportingPeriod;
		this.docTypeIndic = docTypeIndic;
		this.platformOperatorDocRefId = platformOperatorDocRefId;
		this.platformOperatorCorrDocRefId = platformOperatorCorrDocRefId;
		this.certificateKeystoreInputStream = certificateKeystoreInputStream;
		this.delayBeforeCheckingResults = delayBeforeCheckingResults;
		this.retryQueryResultsAmount = retryQueryResultsAmount;
		this.delayInBetweenResultChecks = delayInBetweenResultChecks;
		this.platformOperatorOrganizationName = platformOperatorOrganizationName;
		this.platformOperatorPlatformName = platformOperatorPlatformName;
		this.platformOperatorAddress = platformOperatorAddress;
	}
	
	public String getCertificateKeystorePassword()
	{
		return this.certificateKeystorePassword;
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
	
	public BzstDipOecdDocType getDocTypeIndic()
	{
		return this.docTypeIndic;
	}
	
	public String getPlatformOperatorDocRefId()
	{
		return this.platformOperatorDocRefId;
	}
	
	public String getPlatformOperatorCorrDocRefId()
	{
		return this.platformOperatorCorrDocRefId;
	}
	
	public Supplier<InputStream> getCertificateKeystoreInputStream()
	{
		return this.certificateKeystoreInputStream;
	}
	
	public Duration getDelayBeforeCheckingResults()
	{
		return this.delayBeforeCheckingResults;
	}
	
	public int getRetryQueryResultsAmount()
	{
		return this.retryQueryResultsAmount;
	}
	
	public Duration getDelayInBetweenResultChecks()
	{
		return this.delayInBetweenResultChecks;
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
