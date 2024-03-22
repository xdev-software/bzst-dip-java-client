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

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


@SuppressWarnings({"unused", "UnusedReturnValue"})
public class PropertiesSupplier
{
	public static final String PROPERTY_NAME_CERTIFICATE_KEYSTORE_PASSWORD = "CertificateKeystorePassword";
	public static final String PROPERTY_NAME_CLIENT_ID = "ClientId";
	public static final String PROPERTY_NAME_TAX_ID = "TaxID";
	public static final String PROPERTY_NAME_TAX_NUMBER = "TaxNumber";
	public static final String PROPERTY_NAME_REALM_ENVIRONMENT_BASE_URL = "RealmEnvironmentBaseUrl";
	public static final String PROPERTY_NAME_ENVIRONMENT = "Environment";
	public static final String PROPERTY_NAME_MESSAGE_TYPE_INDIC = "MessageTypeIndic";
	public static final String PROPERTY_NAME_REPORTING_PERIOD = "ReportingPeriod";
	public static final String PROPERTY_NAME_DOC_TYPE_INDIC = "DocTypeIndic";
	public static final String PROPERTY_NAME_PLATFORM_OPERATOR_DOC_REF_ID = "PlatformOperator_DocRefId";
	public static final String PROPERTY_NAME_PLATFORM_OPERATOR_CORR_DOC_REF_ID = "PlatformOperator_CorrDocRefId";
	public static final String PROPERTY_NAME_CERTIFICATE_KEYSTORE_FILE = "CertificateKeystoreFile";
	public static final String PROPERTY_NAME_DELAY_BEFORE_CHECKING_RESULTS_IN_MS =
		"delayBeforeCheckingResultsInMillis";
	public static final String PROPERTY_NAME_RETRY_QUERY_RESULTS_AMOUNT = "retryQueryResultsAmount";
	public static final String PROPERTY_NAME_DELAY_IN_BETWEEN_RESULT_CHECKS_IN_MS =
		"delayInBetweenResultChecksInMillis";
	
	public static final String PROPERTY_NAME_PLATFORM_OPERATOR_ORGANIZATION = "PlatformOperatorOrganizationName";
	public static final String PROPERTY_NAME_PLATFORM_OPERATOR_PLATFORM = "PlatformOperatorPlatformName";
	public static final String PROPERTY_NAME_PLATFORM_OPERATOR_ADDRESS_STREET = "PlatformOperatorAddressStreet";
	public static final String PROPERTY_NAME_PLATFORM_OPERATOR_ADDRESS_BUILDING =
		"PlatformOperatorAddressBuildingIdentifier";
	public static final String PROPERTY_NAME_PLATFORM_OPERATOR_ADDRESS_SUITE =
		"PlatformOperatorAddressSuiteIdentifier";
	public static final String PROPERTY_NAME_PLATFORM_OPERATOR_ADDRESS_FLOOR =
		"PlatformOperatorAddressFloorIdentifier";
	public static final String PROPERTY_NAME_PLATFORM_OPERATOR_ADDRESS_DISTRICT_NAME =
		"PlatformOperatorAddressDistrictName";
	public static final String PROPERTY_NAME_PLATFORM_OPERATOR_ADDRESS_POST_CODE = "PlatformOperatorAddressPostCode";
	public static final String PROPERTY_NAME_PLATFORM_OPERATOR_ADDRESS_CITY = "PlatformOperatorAddressCity";
	
	private final Properties properties;
	
	public PropertiesSupplier(final Properties properties)
	{
		this.properties = properties;
	}
	
	public PropertiesSupplier(final String propertiesFileName)
	{
		try(final FileInputStream fileInputStream = new FileInputStream(propertiesFileName))
		{
			final Properties properties = new Properties();
			properties.load(fileInputStream);
			this.properties = properties;
		}
		catch(final Exception e)
		{
			throw new RuntimeException(e);
		}
	}
	
	public PropertiesSupplier(final InputStream propertiesInput)
	{
		try
		{
			final Properties properties = new Properties();
			properties.load(propertiesInput);
			this.properties = properties;
		}
		catch(final IOException e)
		{
			throw new RuntimeException(e);
		}
	}
	
	public PropertiesSupplier()
	{
		this(new Properties());
	}
	
	public String getPropertyFromConfig(final String propertyName)
	{
		return this.properties.getProperty(propertyName);
	}
}
