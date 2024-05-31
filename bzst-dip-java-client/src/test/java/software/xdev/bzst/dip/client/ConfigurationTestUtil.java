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

import java.time.LocalDate;

import software.xdev.bzst.dip.client.model.configuration.BzstDipConfiguration;
import software.xdev.bzst.dip.client.model.configuration.BzstDipConfigurationBuilder;
import software.xdev.bzst.dip.client.model.configuration.BzstDipDpiMessageType;
import software.xdev.bzst.dip.client.model.configuration.BzstDipOecdDocType;
import software.xdev.bzst.dip.client.model.message.BzstDipAddressFix;
import software.xdev.bzst.dip.client.signing.SigningProviderByJks;
import software.xdev.bzst.dip.client.signing.SigningProviderByPem;


public class ConfigurationTestUtil
{
	private ConfigurationTestUtil()
	{
	}
	
	public static BzstDipConfiguration getConfigurationWithJksSigning()
	{
		return createBuilderWithoutSigning()
			.setSigningProvider(new SigningProviderByJks("DemoKeystore.jks", "test123"))
			.buildAndValidate();
	}
	
	public static BzstDipConfiguration getConfigurationWithPemSigning()
	{
		return createBuilderWithoutSigning()
			.setSigningProvider(new SigningProviderByPem("DemoCert.pem", "DemoKey.pem"))
			.buildAndValidate();
	}
	
	private static BzstDipConfigurationBuilder createBuilderWithoutSigning()
	{
		return new BzstDipConfigurationBuilder()
			.setClientId("TestClient")
			.setTaxID("86095742719")
			.setTaxNumber("123")
			.setSigningProvider(new SigningProviderByPem("DemoKey.pem", "DemoCert.pem"))
			.setRealmEnvironmentBaseUrl(BzstDipConfiguration.ENDPOINT_URL_TEST)
			.setMessageTypeIndic(BzstDipDpiMessageType.DPI_401)
			.setReportingPeriod(LocalDate.now())
			.setDocTypeIndic(BzstDipOecdDocType.OECD_1)
			.setPlatformOperatorOrganizationName("TestOrg")
			.setPlatformOperatorPlatformName("TestApp")
			.setPlatformOperatorAddress(
				new BzstDipAddressFix("TestCity")
			);
	}
}
