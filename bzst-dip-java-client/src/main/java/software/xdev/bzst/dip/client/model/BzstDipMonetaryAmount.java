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
package software.xdev.bzst.dip.client.model;

import java.math.BigInteger;

import software.xdev.bzst.dip.client.xmldocument.model.MonAmntType;


public class BzstDipMonetaryAmount
{
	
	private final BigInteger amount;
	private final BzstDipCurrency currencyCode;
	
	public BzstDipMonetaryAmount(final BigInteger amount, final BzstDipCurrency currencyCode)
	{
		this.amount = amount;
		this.currencyCode = currencyCode;
	}
	
	public BzstDipMonetaryAmount(final Integer amount, final BzstDipCurrency currencyCode)
	{
		this(BigInteger.valueOf(amount), currencyCode);
	}
	
	public MonAmntType toXmlType()
	{
		final MonAmntType monAmntType = new MonAmntType();
		monAmntType.setValue(this.amount);
		monAmntType.setCurrCode(this.currencyCode.toXmlType());
		return monAmntType;
	}
}
