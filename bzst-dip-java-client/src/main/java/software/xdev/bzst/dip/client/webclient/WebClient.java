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

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import software.xdev.bzst.dip.client.exception.HttpStatusCodeNotExceptedException;
import software.xdev.bzst.dip.client.model.configuration.BzstDipConfiguration;
import software.xdev.bzst.dip.client.model.message.BzstDipRequestStatusResult;
import software.xdev.bzst.dip.client.model.message.BzstDipSingleTransferResult;
import software.xdev.bzst.dip.client.util.WebClientUtil;


public class WebClient implements AutoCloseable
{
	private static final Logger LOGGER = LogManager.getLogger(WebClient.class);
	private static final String AUTHORIZATION_STRING = "Authorization";
	private static final String BEARER_STRING = "Bearer ";
	public static final String DIP_MD = "/dip/md/";
	public static final String PATCH = "PATCH";
	public static final int OK_HTTP_STATUS_CODE = 200;
	
	private final HttpClient httpClient = HttpClient.newHttpClient();
	private final BzstDipConfiguration configuration;
	
	public WebClient(final BzstDipConfiguration configuration)
	{
		this.configuration = configuration;
	}
	
	private HttpResponse<String> executeRequest(final HttpRequest httpRequest, final int expectedHttpStatusCode)
		throws HttpStatusCodeNotExceptedException
	{
		final HttpResponse<String> httpResponse = this.executeRequest(httpRequest);
		if(httpResponse.statusCode() != expectedHttpStatusCode)
		{
			throw new HttpStatusCodeNotExceptedException(httpResponse);
		}
		return httpResponse;
	}
	
	private HttpResponse<String> executeRequest(final HttpRequest httpRequest)
	{
		try
		{
			final HttpResponse<String> httpResponse = this.httpClient.send(
				httpRequest,
				HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
			return httpResponse;
		}
		catch(final IOException | InterruptedException e)
		{
			throw new RuntimeException("An error occurred while getting the access token.", e);
		}
	}
	
	private HttpRequest createGetAccessTokenRequest()
	{
		final String requestToken = WebClientUtil.createRequestToken(this.configuration);
		
		final HashMap<String, String> parameters = new HashMap<>();
		parameters.put("grant_type", "client_credentials");
		parameters.put("client_assertion_type", "urn:ietf:params:oauth:client-assertion-type:jwt-bearer");
		parameters.put("client_assertion", requestToken);
		
		return HttpRequest.newBuilder()
			.POST(HttpRequest.BodyPublishers.ofString(createFormForParameters(parameters)))
			.uri(URI.create(
				this.configuration.getRealmEnvironmentBaseUrl() + "/auth/realms/mds/protocol/openid-connect/token"))
			.header("Content-Type", "application/x-www-form-urlencoded")
			.build();
	}
	
	/**
	 * For every request an access token is required
	 *
	 * @return Access Token as string
	 */
	public String getAccessToken()
	{
		LOGGER.debug("Getting access token...");
		try
		{
			final HttpRequest httpRequest = this.createGetAccessTokenRequest();
			final HttpResponse<String> httpResponse = this.executeRequest(httpRequest, OK_HTTP_STATUS_CODE);
			
			final ObjectMapper objectMapper = new ObjectMapper();
			final AccessTokenHttpResponse accessTokenHttpResponse =
				objectMapper.readValue(httpResponse.body(), AccessTokenHttpResponse.class);
			
			return accessTokenHttpResponse.getAccessToken();
		}
		catch(final IOException e)
		{
			throw new RuntimeException("An error occurred while getting the access token.", e);
		}
		catch(final HttpStatusCodeNotExceptedException e)
		{
			throw new RuntimeException(e);
		}
	}
	
	private HttpRequest createGetDataTransferNumberRequest()
	{
		return HttpRequest.newBuilder()
			.POST(HttpRequest.BodyPublishers.noBody())
			.uri(URI.create(this.configuration.getRealmEnvironmentBaseUrl() + "/dip/start/DAC7"))
			.header(AUTHORIZATION_STRING, BEARER_STRING + this.getAccessToken())
			.build();
	}
	
	/**
	 * @return XML as string with data transfer numbers
	 */
	public String getDataTransferNumber() throws HttpStatusCodeNotExceptedException
	{
		LOGGER.debug("Getting data transfer number...");
		final HttpResponse<String> httpResponse = this.executeRequest(this.createGetDataTransferNumberRequest(), 201);
		
		return httpResponse.body();
	}
	
	private HttpRequest createUploadMassDataRequest(final String dataTransferNumber, final String xmlString)
	{
		return HttpRequest.newBuilder()
			.PUT(HttpRequest.BodyPublishers.ofString(xmlString))
			.uri(URI.create(this.configuration.getRealmEnvironmentBaseUrl() + DIP_MD + dataTransferNumber + "/xml"))
			.header(AUTHORIZATION_STRING, BEARER_STRING + this.getAccessToken())
			.build();
	}
	
	/*
	 * Upload mass data
	 */
	public String uploadMassData(final String dataTransferNumber, final String xmlString)
		throws HttpStatusCodeNotExceptedException
	{
		LOGGER.debug("Uploading the xml data...");
		
		final HttpResponse<String> httpResponse = this.executeRequest(
			this.createUploadMassDataRequest(dataTransferNumber, xmlString), OK_HTTP_STATUS_CODE);
		
		LOGGER.debug("Uploaded data successfully!");
		return httpResponse.body();
	}
	
	private HttpRequest createCloseSubmissionRequest(final String dataTransferNumber)
	{
		return HttpRequest.newBuilder()
			.uri(URI.create(this.configuration.getRealmEnvironmentBaseUrl() + DIP_MD + dataTransferNumber + "/finish"))
			.method(PATCH, HttpRequest.BodyPublishers.noBody())
			.header(AUTHORIZATION_STRING, BEARER_STRING + this.getAccessToken())
			.build();
	}
	
	/*
	 * Close the submission
	 */
	public String closeSubmission(final String dataTransferNumber) throws HttpStatusCodeNotExceptedException
	{
		LOGGER.debug("Closing submission...");
		final HttpResponse<String> httpResponse = this.executeRequest(
			this.createCloseSubmissionRequest(dataTransferNumber), OK_HTTP_STATUS_CODE);
		LOGGER.debug("Closed submission successfully!");
		
		return httpResponse.body();
	}
	
	private HttpRequest createGetResultLogsRequest()
	{
		return HttpRequest.newBuilder()
			.uri(URI.create(this.configuration.getRealmEnvironmentBaseUrl() + DIP_MD + "protocolnumbers"))
			.GET()
			.header(AUTHORIZATION_STRING, BEARER_STRING + this.getAccessToken())
			.build();
	}
	
	/**
	 * Retrieval of the results log
	 *
	 * @return String list with data transfer numbers
	 */
	public List<String> requestResultLogs() throws HttpStatusCodeNotExceptedException, IOException
	{
		final String responseBody = this.executeRequest(this.createGetResultLogsRequest(), OK_HTTP_STATUS_CODE).body();
		LOGGER.debug("ResponseBody from data transfer number request:\n{}", responseBody);
		
		return WebClientUtil.extractTransferNumberFromXml(responseBody);
	}
	
	public HttpRequest createGetResultProtocolRequest(final String dataTransferNumber)
	{
		return HttpRequest.newBuilder()
			.uri(
				URI.create(this.configuration.getRealmEnvironmentBaseUrl() + DIP_MD + dataTransferNumber + "/protocol")
			)
			.GET()
			.header(AUTHORIZATION_STRING, BEARER_STRING + this.getAccessToken())
			.build();
	}
	
	/*
	 * Get the result protocol
	 *
	 * @return Returns complete HttpResponse
	 */
	public BzstDipSingleTransferResult requestTransferResult(final String dataTransferNumber)
	{
		final HttpResponse<String> httpResponse =
			this.executeRequest(this.createGetResultProtocolRequest(dataTransferNumber));
		return new BzstDipSingleTransferResult(dataTransferNumber, httpResponse.statusCode());
	}
	
	private HttpRequest createConfirmResultProtocolRequest(final String transferNumber)
	{
		return HttpRequest.newBuilder()
			.uri(URI.create(this.configuration.getRealmEnvironmentBaseUrl() + DIP_MD + transferNumber + "/protocol"))
			.method(PATCH, HttpRequest.BodyPublishers.noBody())
			.header(AUTHORIZATION_STRING, BEARER_STRING + this.getAccessToken())
			.build();
	}
	
	/*
	 * Confirm the result protocol
	 */
	public BzstDipSingleTransferResult confirmTransfer(final String transferNumber)
		throws HttpStatusCodeNotExceptedException
	{
		final HttpResponse<String> httpResponse =
			this.executeRequest(this.createConfirmResultProtocolRequest(transferNumber), OK_HTTP_STATUS_CODE);
		return new BzstDipSingleTransferResult(transferNumber, httpResponse.statusCode());
	}
	
	public HttpRequest createAbortSubmissionRequest(final String dataTransferNumber)
	{
		return HttpRequest.newBuilder()
			.uri(URI.create(this.configuration.getRealmEnvironmentBaseUrl() + DIP_MD + dataTransferNumber + "/abort"))
			.method(PATCH, HttpRequest.BodyPublishers.noBody())
			.header(AUTHORIZATION_STRING, BEARER_STRING + this.getAccessToken())
			.build();
	}
	
	/*
	 * Abort submission
	 */
	public String abortSubmission(final String dataTransferNumber) throws HttpStatusCodeNotExceptedException
	{
		LOGGER.error("Aborting submission...");
		final HttpResponse<String> httpResponse = this.executeRequest(
			this.createAbortSubmissionRequest(dataTransferNumber), OK_HTTP_STATUS_CODE);
		LOGGER.debug("Aborted successfully.");
		
		return httpResponse.body();
	}
	
	/**
	 * Gets all data transfer numbers. Get the result protocol from a transfer number and confirm them if possible.
	 *
	 * @return returns true if the method should be called later again because the result is not yet available
	 */
	public BzstDipRequestStatusResult readAndConfirmDataTransferNumbers()
		throws HttpStatusCodeNotExceptedException, IOException
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
		throws HttpStatusCodeNotExceptedException
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
	
	private static String createFormForParameters(final HashMap<String, String> parameters)
	{
		// Creating form with all parameters
		return parameters.keySet().stream()
			.map(key -> key + "=" + URLEncoder.encode(parameters.get(key), StandardCharsets.UTF_8))
			.collect(Collectors.joining("&"));
	}
	
	@Override
	public void close()
	{
		// For Java 21
		// this.httpClient.close();
	}
}
