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
package software.xdev.bzst.dip.client;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opencsv.exceptions.CsvValidationException;

import software.xdev.bzst.dip.client.exception.HttpStatusCodeNotExceptedException;
import software.xdev.bzst.dip.client.model.configuration.BzstDipConfiguration;
import software.xdev.bzst.dip.client.model.message.BzstDipCompleteResult;
import software.xdev.bzst.dip.client.model.message.BzstDipMessage;
import software.xdev.bzst.dip.client.model.message.BzstDipRequestStatusResult;
import software.xdev.bzst.dip.client.model.message.BzstDipSendingResult;
import software.xdev.bzst.dip.client.model.message.BzstDipSingleTransferResult;
import software.xdev.bzst.dip.client.parser.ReportableSellerCsvFileParser;
import software.xdev.bzst.dip.client.util.SigningUtil;
import software.xdev.bzst.dip.client.webclient.WebClient;
import software.xdev.bzst.dip.client.xmldocument.XMLDocumentBodyCreator;
import software.xdev.bzst.dip.client.xmldocument.XMLDocumentCreator;
import software.xdev.bzst.dip.client.xmldocument.model.CorrectablePlatformOperatorType;
import software.xdev.bzst.dip.client.xmldocument.model.CorrectableReportableSellerType;


/**
 * Uses the {@link WebClient} to send {@link BzstDipMessage}s to the BZST DIP API.
 */
@SuppressWarnings({"unused", "UnusedReturnValue"})
public class BzstDipClient
{
	private static final Logger LOGGER = LoggerFactory.getLogger(BzstDipClient.class);
	private final BzstDipConfiguration configuration;
	
	public BzstDipClient(final BzstDipConfiguration configuration)
	{
		this.configuration = configuration;
	}
	
	/**
	 * Sends the message without querying for a response. We recommend using the
	 * {@link #sendDipAndQueryResult(BzstDipMessage)} counterpart and suggest only using this method, if specifically
	 * needed.
	 *
	 * @param message with the data for the BZST DIP API.
	 * @return the result which only contains the dataTransferNumber
	 */
	public BzstDipSendingResult sendDipOnly(final BzstDipMessage message)
		throws HttpStatusCodeNotExceptedException
	{
		return this.sendDipOnly(message.toXmlType(this.configuration));
	}
	
	/**
	 * Sends the message without querying for a response. We recommend using the
	 * {@link #sendDipAndQueryResult(String)} counterpart and
	 * suggest only using this method, if specifically needed.
	 * @param csvData which will be parsed by the {@link ReportableSellerCsvFileParser}.
	 * @return the result which only contains the dataTransferNumber
	 */
	public BzstDipSendingResult sendDipOnly(final String csvData)
		throws HttpStatusCodeNotExceptedException, CsvValidationException, IOException
	{
		return this.sendDipOnly(new ReportableSellerCsvFileParser(this.configuration).parseCsvData(csvData));
	}
	
	/**
	 * Sends the message without querying for a response. We recommend using the {@link #sendDipAndQueryResult(List)}
	 * counterpart and suggest only using this method, if specifically needed.
	 *
	 * @param correctableReportableSellerTypes with the data for the BZST DIP API.
	 * @return the result which only contains the dataTransferNumber
	 */
	public BzstDipSendingResult sendDipOnly(
		final List<CorrectableReportableSellerType> correctableReportableSellerTypes)
		throws HttpStatusCodeNotExceptedException
	{
		return this.sendDipOnly(
			correctableReportableSellerTypes,
			XMLDocumentBodyCreator.createPlatformOperatorFromConfiguration(this.configuration)
		);
	}
	
	/**
	 * Sends the message without querying for a response. We recommend using the
	 * {@link #sendDipAndQueryResult(List, CorrectablePlatformOperatorType)} counterpart and suggest only using this
	 * method, if specifically needed.
	 *
	 * @param correctableReportableSellerTypes with the data for the BZST DIP API.
	 * @param correctablePlatformOperatorType  with the information about the platform operator.
	 * @return the result which only contains the dataTransferNumber
	 */
	public BzstDipSendingResult sendDipOnly(
		final List<CorrectableReportableSellerType> correctableReportableSellerTypes,
		final CorrectablePlatformOperatorType correctablePlatformOperatorType)
		throws HttpStatusCodeNotExceptedException
	{
		try(final WebClient client = new WebClient(this.configuration))
		{
			return this.sendDipOnlyInternal(correctableReportableSellerTypes, correctablePlatformOperatorType, client);
		}
	}
	
	/**
	 * Sends the message and queries a result.
	 * <p>
	 *     Querying the result might take a few seconds and is configured in
	 *     {@link BzstDipConfiguration#queryResultConfiguration}.
	 * </p>
	 * <p>
	 *     In special cases {@link #sendDipOnly(BzstDipMessage)} can be used, if the result is not needed,
	 *     or the results should be queried in some other way.
	 * </p>
	 * @param message with the data for the BZST DIP API.
	 * @return the result which contains the dataTransferNumber and all found responses in the API.
	 */
	public BzstDipCompleteResult sendDipAndQueryResult(final BzstDipMessage message)
		throws HttpStatusCodeNotExceptedException, InterruptedException, IOException
	{
		return this.sendDipAndQueryResult(message.toXmlType(this.configuration));
	}
	
	/**
	 * Sends the message and queries a result.
	 * <p>
	 *     Querying the result might take a few seconds and is configured in
	 *     {@link BzstDipConfiguration#queryResultConfiguration}.
	 * </p>
	 * <p>
	 *     In special cases {@link #sendDipOnly(String)} can be used, if the result is not needed,
	 *     or the results should be queried in some other way.
	 * </p>
	 * @param csvData which will be parsed by the {@link ReportableSellerCsvFileParser}.
	 * @return the result which contains the dataTransferNumber and all found responses in the API.
	 */
	public BzstDipCompleteResult sendDipAndQueryResult(final String csvData)
		throws HttpStatusCodeNotExceptedException, InterruptedException, IOException
	{
		return this.sendDipAndQueryResult(new ReportableSellerCsvFileParser(this.configuration).parseCsvData(csvData));
	}
	
	/**
	 * Sends the message and queries a result.
	 * <p>
	 *     Querying the result might take a few seconds and is configured in
	 *     {@link BzstDipConfiguration#queryResultConfiguration}.
	 * </p>
	 * <p>
	 *     In special cases {@link #sendDipOnly(List)} can be used, if the result is not needed,
	 *     or the results should be queried in some other way.
	 * </p>
	 * @param correctableReportableSellerTypes with the data for the BZST DIP API.
	 * @return the result which contains the dataTransferNumber and all found responses in the API.
	 */
	public BzstDipCompleteResult sendDipAndQueryResult(
		final List<CorrectableReportableSellerType> correctableReportableSellerTypes
	)
		throws HttpStatusCodeNotExceptedException, InterruptedException, IOException
	{
		return this.sendDipAndQueryResult(
			correctableReportableSellerTypes,
			XMLDocumentBodyCreator.createPlatformOperatorFromConfiguration(this.configuration)
		);
	}
	
	/**
	 * Sends the message and queries a result.
	 * <p>
	 *     Querying the result might take a few seconds and is configured in
	 *     {@link BzstDipConfiguration#queryResultConfiguration}.
	 * </p>
	 * <p>
	 *     In special cases {@link #sendDipOnly(List, CorrectablePlatformOperatorType)} can be used, if the result is
	 *     not needed,
	 *     or the results should be queried in some other way.
	 * </p>
	 * @param correctableReportableSellerTypes with the data for the BZST DIP API.
	 * @param correctablePlatformOperatorType with the information about the platform operator.
	 * @return the result which contains the dataTransferNumber and all found responses in the API.
	 */
	public BzstDipCompleteResult sendDipAndQueryResult(
		final List<CorrectableReportableSellerType> correctableReportableSellerTypes,
		final CorrectablePlatformOperatorType correctablePlatformOperatorType
	)
		throws HttpStatusCodeNotExceptedException, InterruptedException, IOException
	{
		try(final WebClient client = new WebClient(this.configuration))
		{
			final BzstDipSendingResult sendingResult =
				this.sendDipOnlyInternal(correctableReportableSellerTypes, correctablePlatformOperatorType, client);
			
			Thread.sleep(this.configuration.getQueryResultConfiguration().delayBeforeCheckingResults().toMillis());
			
			final BzstDipRequestStatusResult requestStatusResult = this.queryDipResultWithRetry(client, sendingResult);
			
			return BzstDipCompleteResult.fromResult(sendingResult, requestStatusResult);
		}
	}
	
	/**
	 * Queries for a DIP result. We recommend using the
	 * {@link #sendDipAndQueryResult(BzstDipMessage)} counterpart and
	 * suggest only using this method, if specifically needed.
	 * @return all found {@link BzstDipSingleTransferResult}s
	 */
	public BzstDipRequestStatusResult queryDipResult() throws HttpStatusCodeNotExceptedException, IOException
	{
		try(final WebClient client = new WebClient(this.configuration))
		{
			return client.readAndConfirmDataTransferNumbers();
		}
	}
	
	private BzstDipSendingResult sendDipOnlyInternal(
		final List<CorrectableReportableSellerType> correctableReportableSellerTypes,
		final CorrectablePlatformOperatorType correctablePlatformOperatorType,
		final WebClient client
	) throws HttpStatusCodeNotExceptedException
	{
		final XMLDocumentCreator xmlDocumentCreator = new XMLDocumentCreator(this.configuration);
		final String signedXML =
			SigningUtil.signXMLDocument(
				xmlDocumentCreator.buildXMLDocument(
					correctableReportableSellerTypes,
					correctablePlatformOperatorType
				),
				this.configuration);
		LOGGER.debug("Created following XML-Document:\n{}", signedXML);
		
		LOGGER.debug("XML data will now be uploaded...");
		final String dataTransferNumber = client.getDataTransferNumber();
		LOGGER.debug("Data transfer number: {}", dataTransferNumber);
		
		client.uploadMassData(dataTransferNumber, signedXML);
		
		client.closeSubmission(dataTransferNumber);
		
		return new BzstDipSendingResult(dataTransferNumber);
	}
	
	private BzstDipRequestStatusResult queryDipResultWithRetry(
		final WebClient webClient,
		final BzstDipSendingResult sendingResult)
		throws HttpStatusCodeNotExceptedException, InterruptedException, IOException
	{
		BzstDipRequestStatusResult requestStatusResult;
		int retryCounter = 0;
		do
		{
			if(retryCounter != 0)
			{
				final long delayInMilliseconds =
					this.configuration.getQueryResultConfiguration().delayInBetweenResultChecks().toMillis();
				LOGGER.debug("Waiting {}ms for next query...", delayInMilliseconds);
				Thread.sleep(delayInMilliseconds);
			}
			requestStatusResult = webClient.readAndConfirmDataTransferNumbers();
			retryCounter++;
		}
		while(
			this.configuration.getQueryResultConfiguration().retryQueryResultsAmount() != 0
				&& retryCounter < this.configuration.getQueryResultConfiguration().retryQueryResultsAmount()
				&& !this.dipResponseIsGood(sendingResult, requestStatusResult)
		);
		return requestStatusResult;
	}
	
	private boolean dipResponseIsGood(
		final BzstDipSendingResult sendingResult,
		final BzstDipRequestStatusResult requestStatusResult)
	{
		return requestStatusResult.singleTransferResults().stream().anyMatch(
			status -> status.transferNumber().equals(sendingResult.dataTransferNumber())
				&& status.getStatusCodeMeaning().equals(BzstDipSingleTransferResult.StatusCodeMeaning.OK)
		);
	}
}
