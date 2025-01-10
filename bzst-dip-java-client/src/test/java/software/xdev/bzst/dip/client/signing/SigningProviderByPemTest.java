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
package software.xdev.bzst.dip.client.signing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SigningProviderByPemTest
{
	
	public static final String DEMO_CERT_PEM = "DemoCert.pem";
	public static final String DEMO_KEY_PEM = "DemoKey.pem";
	
	@Test
	void getCertificate()
	{
		final SigningProviderByPem signingProviderByPem = new SigningProviderByPem(
			DEMO_CERT_PEM,
			DEMO_KEY_PEM
		);
		Assertions.assertNotNull(signingProviderByPem.getCertificate());
	}
	
	@Test
	void getPrivateKey()
	{
		final SigningProviderByPem signingProviderByPem = new SigningProviderByPem(
			DEMO_CERT_PEM,
			DEMO_KEY_PEM
		);
		Assertions.assertNotNull(signingProviderByPem.getPrivateKey());
	}
}
