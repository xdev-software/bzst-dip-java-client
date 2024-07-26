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

import software.xdev.bzst.dip.client.exception.ConfigurationException;


/**
 * Defines some kind of input where to read properties for the {@link BzstDipConfiguration} for.
 */
@SuppressWarnings({"unused", "UnusedReturnValue"})
public class PropertiesSupplier
{
	public static final String PROPERTY_NAME_CERTIFICATE_KEYSTORE_PASSWORD = "certificate.keystore.password";
	public static final String PROPERTY_NAME_KEYSTORE_PRIVATE_KEY_ALIAS = "certificate.keystore.private.key.alias";
	public static final String PROPERTY_NAME_CERTIFICATE_KEYSTORE_FILE = "certificate.keystore.file";
	public static final String PROPERTY_NAME_CLIENT_ID = "client.id";
	public static final String PROPERTY_NAME_TAX_ID = "tax.id";
	public static final String PROPERTY_NAME_TAX_NUMBER = "tax.number";
	public static final String PROPERTY_NAME_REALM_ENVIRONMENT_BASE_URL = "base.url";
	public static final String PROPERTY_NAME_ENVIRONMENT = "environment";
	public static final String PROPERTY_NAME_MESSAGE_TYPE_INDIC = "message.type";
	public static final String PROPERTY_NAME_REPORTING_PERIOD = "reporting.period";
	public static final String PROPERTY_NAME_DOC_TYPE_INDIC = "doc.type";
	public static final String PROPERTY_NAME_PLATFORM_OPERATOR_DOC_REF_ID = "platform.operator.doc.ref.id";
	public static final String PROPERTY_NAME_PLATFORM_OPERATOR_CORR_DOC_REF_ID = "platform.operator.corr.doc.ref.id";
	public static final String PROPERTY_NAME_DELAY_BEFORE_CHECKING_RESULTS_IN_MS =
		"delay.before.checking.results.in.millis";
	public static final String PROPERTY_NAME_RETRY_QUERY_RESULTS_AMOUNT = "retry.query.results.amount";
	public static final String PROPERTY_NAME_DELAY_IN_BETWEEN_RESULT_CHECKS_IN_MS =
		"delay.in.between.result.checks.in.millis";
	
	public static final String PROPERTY_NAME_PLATFORM_OPERATOR_ORGANIZATION = "platform.operator.organization.name";
	public static final String PROPERTY_NAME_PLATFORM_OPERATOR_PLATFORM = "platform.operator.platform.name";
	public static final String PROPERTY_NAME_PLATFORM_OPERATOR_ADDRESS_STREET = "platform.operator.address.street";
	public static final String PROPERTY_NAME_PLATFORM_OPERATOR_ADDRESS_BUILDING =
		"platform.operator.address.building";
	public static final String PROPERTY_NAME_PLATFORM_OPERATOR_ADDRESS_SUITE =
		"platform.operator.address.suite";
	public static final String PROPERTY_NAME_PLATFORM_OPERATOR_ADDRESS_FLOOR =
		"platform.operator.address.floor";
	public static final String PROPERTY_NAME_PLATFORM_OPERATOR_ADDRESS_DISTRICT_NAME =
		"platform.operator.address.district";
	public static final String PROPERTY_NAME_PLATFORM_OPERATOR_ADDRESS_POST_CODE =
		"platform.operator.address.post.code";
	public static final String PROPERTY_NAME_PLATFORM_OPERATOR_ADDRESS_CITY = "platform.operator.address.city";
	
	private final Properties properties;
	
	public PropertiesSupplier(final Properties properties)
	{
		this.properties = properties;
	}
	
	/**
	 * Reads the given filename as property file.
	 */
	public PropertiesSupplier(final String propertiesFileName)
	{
		try(final FileInputStream fileInputStream = new FileInputStream(propertiesFileName))
		{
			final Properties newProperties = new Properties();
			newProperties.load(fileInputStream);
			this.properties = newProperties;
		}
		catch(final Exception e)
		{
			throw new ConfigurationException("Error while reading properties file %s".formatted(propertiesFileName),
				e);
		}
	}
	
	/**
	 * Reads properties from the given {@link InputStream}.
	 */
	public PropertiesSupplier(final InputStream propertiesInput)
	{
		try
		{
			final Properties newProperties = new Properties();
			newProperties.load(propertiesInput);
			this.properties = newProperties;
		}
		catch(final IOException e)
		{
			throw new ConfigurationException("Error while reading properties from input", e);
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
