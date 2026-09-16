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

public enum BzstCesopPSPRoleTypeEnum
{
	/**
	 * The market category of the Payment Service Provider is Three party card scheme.
	 */
	THREE_PARTY_CARD_SCHEME("Three party card scheme"),
	
	/**
	 * The market category of the Payment Service Provider is Four party card scheme.
	 */
	FOUR_PARTY_CARD_SCHEME("Four party card scheme"),
	
	/**
	 * The market category of the Payment Service Provider is E-money provider.
	 */
	E_MONEY_PROVIDER("E-money provider"),
	
	/**
	 * The market category of the Payment Service Provider is Acquirer.
	 */
	ACQUIRER("Acquirer"),
	
	/**
	 * The market category of the Payment Service Provider is e-Wallet provider.
	 */
	E_WALLET_PROVIDER("e-Wallet provider"),
	
	/**
	 * The market category of the Payment Service Provider is Money Transfer operator.
	 */
	MONEY_TRANSFER_OPERATOR("Money Transfer operator"),
	
	/**
	 * The market category of the Payment Service Provider is Issuer of payment instruments.
	 */
	ISSUER_OF_PAYMENT_INSTRUMENTS("Issuer of payment instruments"),
	
	/**
	 * The market category of the Payment Service Provider is Payment Processor.
	 */
	PAYMENT_PROCESSOR("Payment Processor"),
	
	/**
	 * The market category of the Payment Service Provider is E-payment.
	 */
	E_PAYMENT("E-payment"),
	
	/**
	 * The market category of the Payment Service Provider is Payment collector.
	 */
	PAYMENT_COLLECTOR("Payment collector"),
	
	/**
	 * Other category of Payment Service Provider.
	 */
	OTHER("Other");
	private final String value;
	
	BzstCesopPSPRoleTypeEnum(final String v)
	{
		this.value = v;
	}
	
	public String value()
	{
		return this.value;
	}
}
