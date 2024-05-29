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

import java.security.PrivateKey;
import java.time.Duration;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.type.TypeReference;

import io.jsonwebtoken.Jwts;
import software.xdev.bzst.dip.client.generated.api.MdEinreichenProviderApi;
import software.xdev.bzst.dip.client.model.configuration.BzstDipConfiguration;


/**
 * Helps to communicate with the BZST API.
 */
public class BearerTokenRequester
{
	private static final Logger LOGGER = LoggerFactory.getLogger(BearerTokenRequester.class);
	private static final String BEARER_STRING = "Bearer ";
	public static final String MDS_POSTFIX = "/auth/realms/mds";
	
	private final MdEinreichenProviderApi client;
	private final BzstDipConfiguration configuration;
	
	public BearerTokenRequester(
		final BzstDipConfiguration configuration,
		final MdEinreichenProviderApi client
	)
	{
		this.configuration = configuration;
		this.client = client;
	}
	
	/**
	 * For every request an access token is required
	 *
	 * @return Access Token as string
	 */
	public String getAccessToken()
	{
		LOGGER.debug("Getting access token...");
		final String requestToken = this.createRequestToken();
		
		final HashMap<String, Object> parameters = new HashMap<>();
		parameters.put("grant_type", "client_credentials");
		parameters.put("client_assertion_type", "urn:ietf:params:oauth:client-assertion-type:jwt-bearer");
		parameters.put("client_assertion", requestToken);
		
		return this.client.getApiClient().invokeAPI(
			"/auth/realms/mds/protocol/openid-connect/token",
			"POST",
			List.of(),
			List.of(),
			"",
			null,
			Map.of(),
			Map.of(),
			parameters,
			"",
			"application/x-www-form-urlencoded;charset=UTF8",
			new String[]{},
			new TypeReference<AccessTokenHttpResponse>()
			{
			}
		).getAccessToken();
	}
	
	public String getAccessTokenWithBearerPrefix()
	{
		return BEARER_STRING + this.getAccessToken();
	}
	
	private String createRequestToken()
	{
		LOGGER.debug("Creating jwt token...");
		
		final PrivateKey privateKey = this.configuration.getSigningProvider().getPrivateKey();
		final String clientId = this.configuration.getClientId();
		LOGGER.debug("Using client id: {}", clientId);
		
		return Jwts.builder()
			.issuer(clientId)
			.subject(clientId)
			.audience().add(
				this.configuration.getRealmEnvironmentBaseUrl() + MDS_POSTFIX)
			.and()
			.issuedAt(new Date())
			.expiration(new Date(System.currentTimeMillis() + Duration.ofMinutes(5).toMillis()))
			.id(UUID.randomUUID().toString())
			.notBefore(new Date(System.currentTimeMillis() - Duration.ofMinutes(1).toMillis()))
			.signWith(privateKey, Jwts.SIG.RS256)
			.compact();
	}
}
