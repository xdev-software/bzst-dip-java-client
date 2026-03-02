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

import software.xdev.bzst.dip.client.model.message.dac7.BzstDipCountryCode;


/**
 * @param countryCode           see {@link software.xdev.bzst.dip.client.model.message.dac7.BzstDipCurrency}
 * @param accountIdentifierType see {@link BzstCesopAccountIdentifierTypeEnum}
 * @param value                 describes the IBAN (e.g. DE32503302010298200040)
 */
public record BzstCesopAccountIdentifier(BzstDipCountryCode countryCode,
										 BzstCesopAccountIdentifierTypeEnum accountIdentifierType, String value)
{
}
