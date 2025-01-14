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
package software.xdev.bzst.dip.client.xmldocument.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import software.xdev.bzst.dip.client.xmldocument.model.cesop.CESOP;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "data")
public class DataType
{
	@XmlElement(name = "DPI_OECD", namespace = "urn:oecd:ties:dpi:v1")
	protected DPIOECD dpioecd;
	
	@XmlElement(name = "CESOP", namespace = "urn:ec.europa.eu:taxud:fiscalis:cesop:v1")
	protected CESOP cesop;
	
	public DPIOECD getDpioecd()
	{
		return this.dpioecd;
	}
	
	public void setDpioecd(final DPIOECD dpioecd)
	{
		this.dpioecd = dpioecd;
	}
	
	public CESOP getCesop()
	{
		return cesop;
	}
	
	public void setCesop(final CESOP cesop)
	{
		this.cesop = cesop;
	}
}
