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

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccessTokenHttpResponse
{
    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("not-before-policy")
    private String notBeforePolicy;

    @JsonProperty("scope")
    private String scope;

    @JsonProperty("expires_in")
    private String expiresIn;

    @JsonProperty("refresh_expires_in")
    private String refreshExpiresIn;

    @JsonProperty("token_type")
    private String tokenType;

    @JsonProperty("id_token")
    private String idToken;

    public String getAccessToken()
    {
        return this.accessToken;
    }

    public void setAccessToken(final String accessToken)
    {
        this.accessToken = accessToken;
    }
}
