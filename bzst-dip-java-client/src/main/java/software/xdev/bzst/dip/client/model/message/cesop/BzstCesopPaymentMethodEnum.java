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
package software.xdev.bzst.dip.client.model.message.cesop;

public enum BzstCesopPaymentMethodEnum
{
	/**
	 * The credit card as a means of payment.
	 */
	CARD_PAYMENT("Card payment"),
	
	/**
	 * The bank transfer as a means of payment.
	 */
	BANK_TRANSFER("Bank transfer"),
	
	/**
	 * The direct debit as a means of payment.
	 */
	DIRECT_DEBIT("Direct debit"),
	
	/**
	 * The e-Money as a means of payment.
	 */
	E_MONEY("E-money"),
	
	/**
	 * The money remittance as a means of payment.
	 */
	MONEY_REMITTANCE("Money Remittance"),
	
	/**
	 * The marketplace as a means of payment.
	 */
	MARKETPLACE("Marketplace"),
	
	/**
	 * The intermediary as a means of payment.
	 */
	INTERMEDIARY("Intermediary"),
	
	/**
	 * Other mean of payment. Please specify it in the element PaymentMethodOther.
	 */
	OTHER("Other");
	private final String value;
	
	BzstCesopPaymentMethodEnum(final String v)
	{
		this.value = v;
	}
	
	public String value()
	{
		return this.value;
	}
}
