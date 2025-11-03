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
package software.xdev.bzst.dip.client.webclient;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import software.xdev.bzst.dip.client.generated.api.MdEinreichenProviderApi;
import software.xdev.bzst.dip.client.generated.client.ApiClient;
import software.xdev.bzst.dip.client.model.configuration.BzstDipConfiguration;
import software.xdev.bzst.dip.client.model.message.dac7.BzstDipRequestStatusResult;
import software.xdev.bzst.dip.client.model.message.dac7.BzstDipSingleTransferResult;
import software.xdev.bzst.dip.client.util.WebClientUtil;


/**
 * Helps to communicate with the BZST API.
 */
public class WebClient
{
	private static final Logger LOGGER = LoggerFactory.getLogger(WebClient.class);
	public static final int OK_HTTP_STATUS_CODE = 200;
	
	private final MdEinreichenProviderApi client;
	private final BearerTokenRequester bearerTokenRequester;
	
	public WebClient(final BzstDipConfiguration configuration)
	{
		this(configuration, new MdEinreichenProviderApi());
		this.client.getApiClient().setBasePath(configuration.getRealmEnvironmentBaseUrl());
	}
	
	public WebClient(final BzstDipConfiguration configuration, final ApiClient apiClient)
	{
		this(configuration, new MdEinreichenProviderApi(apiClient));
	}
	
	public WebClient(
		final BzstDipConfiguration configuration,
		final MdEinreichenProviderApi mdEinreichenProviderApi)
	{
		this.client = mdEinreichenProviderApi;
		this.bearerTokenRequester = new BearerTokenRequester(configuration, this.client);
	}
	
	/**
	 * @return XML as string with data transfer numbers
	 */
	public String getDataTransferNumber()
	{
		return this.getDataTransferNumber("DAC7");
	}
	
	public String getDataTransferNumber(final String fachverfahren)
	{
		LOGGER.debug("Getting data transfer number...");
		return this.client.einreichungAnmelden(
			fachverfahren,
			this.bearerTokenRequester.getAccessTokenWithBearerPrefix()
		);
	}
	
	public void uploadMassData(final String dataTransferNumber, final String xmlString)
	{
		LOGGER.debug("Uploading the xml data...");
		
		this.client.massendatenEinreichen(
			dataTransferNumber,
			this.bearerTokenRequester.getAccessTokenWithBearerPrefix(),
			new ByteArrayInputStream(xmlString.getBytes())
		);
		
		LOGGER.debug("Uploaded data successfully!");
	}
	
	/**
	 * Requests the closing of the submission with the given dataTransferNumber.
	 */
	public void closeSubmission(final String dataTransferNumber)
	{
		LOGGER.debug("Closing submission...");
		this.client.einreichungBeenden(
			dataTransferNumber,
			this.bearerTokenRequester.getAccessTokenWithBearerPrefix()
		);
		LOGGER.debug("Closed submission successfully!");
	}
	
	/**
	 * Retrieval of the results log
	 *
	 * @return String list with data transfer numbers
	 */
	public List<String> requestResultLogs() throws IOException
	{
		try(
			final InputStream inputStream = this.client.alleProtokollnummern(
				this.bearerTokenRequester.getAccessTokenWithBearerPrefix()
			)
		)
		{
			final String responseBody = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
			LOGGER.debug("ResponseBody from data transfer number request:\n{}", responseBody);
			
			return WebClientUtil.extractTransferNumberFromXml(responseBody);
		}
	}
	
	/**
	 * Get the result protocol
	 *
	 * @return Returns complete HttpResponse
	 */
	public BzstDipSingleTransferResult requestTransferResult(final String dataTransferNumber)
		throws IOException
	{
		try(
			final InputStream inputStream = this.client.protokollAbrufen(
				dataTransferNumber,
				this.bearerTokenRequester.getAccessTokenWithBearerPrefix()
			)
		)
		{
			// TODO: Check text
			return new BzstDipSingleTransferResult(dataTransferNumber, 2);
			
			// return new BzstDipSingleTransferResult(dataTransferNumber, httpResponse.statusCode());
		}
	}
	
	/**
	 * Confirm the result protocol
	 */
	public BzstDipSingleTransferResult confirmTransfer(final String dataTransferNumber)
	{
		this.client.protokollErhalten(
			dataTransferNumber,
			this.bearerTokenRequester.getAccessTokenWithBearerPrefix()
		);
		return new BzstDipSingleTransferResult(dataTransferNumber, OK_HTTP_STATUS_CODE);
	}
	
	public void abortSubmission(final String dataTransferNumber)
	{
		LOGGER.error("Aborting submission...");
		this.client.einreichungAbbrechen(
			dataTransferNumber,
			this.bearerTokenRequester.getAccessTokenWithBearerPrefix()
		);
		LOGGER.debug("Aborted successfully.");
	}
	
	/**
	 * Gets all data transfer numbers. Get the result protocol from a transfer number and confirm them if possible.
	 *
	 * @return returns true if the method should be called later again because the result is not yet available
	 */
	public BzstDipRequestStatusResult readAndConfirmDataTransferNumbers()
		throws IOException
	{
		final List<String> dataTransferNumbers = this.requestResultLogs();
		LOGGER.debug("DataTransferNumbers {}", dataTransferNumbers);
		
		final List<BzstDipSingleTransferResult> singleTransferResults = new ArrayList<>();
		
		for(final String transferNumber : dataTransferNumbers)
		{
			singleTransferResults.add(this.requestSingleTransferAndConfirm(transferNumber));
		}
		
		return new BzstDipRequestStatusResult(singleTransferResults);
	}
	
	private BzstDipSingleTransferResult requestSingleTransferAndConfirm(final String transferNumber)
		throws IOException
	{
		final BzstDipSingleTransferResult singleTransferResult = this.requestTransferResult(transferNumber);
		LOGGER.debug(
			"Transfer number {} with result protocol:\n{}",
			transferNumber,
			singleTransferResult.httpStatusCode());
		
		if(!singleTransferResult.getStatusCodeMeaning().equals(BzstDipSingleTransferResult.StatusCodeMeaning.OK))
		{
			// Confirming result, removing from list with data transfer numbers
			this.confirmTransfer(transferNumber);
		}
		return singleTransferResult;
	}
}
