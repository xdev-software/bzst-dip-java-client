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
package software.xdev.bzst.dip.client.exception;

/**
 * Is used if a property that must be set, is not set in the
 * {@link software.xdev.bzst.dip.client.model.configuration.BzstDipConfigurationBuilder}.
 */
public class PropertyNotSetException extends ConfigurationException
{
	public PropertyNotSetException(final String propertyName)
	{
		super(String.format(
			"Property \"%s\" must be defined but is not set in a properties file AND not set in the configuration "
				+ "object!",
			propertyName));
	}
}
