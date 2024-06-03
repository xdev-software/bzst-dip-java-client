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
 * Is used for exceptions that occur during configuration with the
 * {@link software.xdev.bzst.dip.client.model.configuration.BzstDipConfigurationBuilder} or something similar.
 */
public class ConfigurationException extends RuntimeException
{
	public ConfigurationException(final String property, final String error)
	{
		this(String.format("Error while configuring in property \"%s\": %s", property, error));
	}
	
	public ConfigurationException(final String message, final Throwable cause)
	{
		super(message, cause);
	}
	
	public ConfigurationException(final String message)
	{
		super(message);
	}
}
