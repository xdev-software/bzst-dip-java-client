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

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import software.xdev.bzst.dip.client.exception.TaxNumberException;


class TaxNumberValidatorTest
{
	/**
	 * Valid numbers from <a
	 * href="https://download.elster.de/download/schnittstellen/Pruefung_der_Steuer_und_Steueridentifikatsnummer
	 * .pdf">Elster</a>.
	 */
	@ParameterizedTest
	@ValueSource(strings = {
		"86095742719",
		"47036892816",
		"65929970489",
		"57549285017",
		"25768131411"
	})
	void validateTaxNumber_validNumbers(final String validTaxNumber)
	{
		Assertions.assertDoesNotThrow(() -> TaxNumberValidator.validateTaxNumber(validTaxNumber));
	}
	
	@ParameterizedTest
	@NullSource
	@ValueSource(strings = {
		"86095742711",
		"02476291358",
		"12345678901",
		"01234567890",
		"1234567890",
		"00000000000",
		"1",
		"0",
		"12",
		"000000000000",
		"01234567890123456789",
		"",
	})
	void validateTaxNumber_invalidNumbers(final String invalidTaxNumber)
	{
		Assertions.assertThrows(
			TaxNumberException.class,
			() -> TaxNumberValidator.validateTaxNumber(invalidTaxNumber));
	}
}
