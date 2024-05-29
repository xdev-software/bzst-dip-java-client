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

import software.xdev.bzst.dip.client.exception.SigningException;


class SigningProviderByJksTest
{
	
	public static final String CERTIFICATE_KEYSTORE_PASSWORD = "test123";
	public static final String CERTIFICATE_KEYSTORE_PATH = "DemoKeystore.jks";
	
	@Test
	void getCertificate()
	{
		final SigningProviderByJks signingProviderByJks = new SigningProviderByJks(
			CERTIFICATE_KEYSTORE_PATH,
			CERTIFICATE_KEYSTORE_PASSWORD
		);
		Assertions.assertNotNull(signingProviderByJks.getCertificate());
	}
	
	@Test
	void getPrivateKey()
	{
		final SigningProviderByJks signingProviderByJks = new SigningProviderByJks(
			CERTIFICATE_KEYSTORE_PATH,
			CERTIFICATE_KEYSTORE_PASSWORD
		);
		Assertions.assertNotNull(signingProviderByJks.getPrivateKey());
	}
	
	@Test
	void getPrivateKey_wrongPassword()
	{
		final SigningProviderByJks signingProviderByJks = new SigningProviderByJks(
			CERTIFICATE_KEYSTORE_PATH,
			"wrongPwd"
		);
		Assertions.assertThrows(
			SigningException.class,
			() -> signingProviderByJks.getPrivateKey()
		);
	}
	
	@Test
	void getCertificate_wrongPassword()
	{
		final SigningProviderByJks signingProviderByJks = new SigningProviderByJks(
			CERTIFICATE_KEYSTORE_PATH,
			"wrongPwd"
		);
		Assertions.assertThrows(
			SigningException.class,
			() -> signingProviderByJks.getCertificate()
		);
	}
}
