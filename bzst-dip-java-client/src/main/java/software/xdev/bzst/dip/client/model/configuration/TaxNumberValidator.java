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

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.regex.Pattern;

import software.xdev.bzst.dip.client.exception.TaxNumberException;


/**
 * Checks if a taxNumber is valid.
 */
public final class TaxNumberValidator
{
	/**
	 * Absolute length of the entire IdNr.
	 */
	public static final int IDNR_LENGTH = TaxNumberValidator.IDNR_NUMBER_LENGTH
		+ TaxNumberValidator.IDNR_CHECKSUM_LENGTH;
	
	/**
	 * Length of the "number" part of the IdNr. (without check digit)
	 */
	public static final int IDNR_NUMBER_LENGTH = 10;
	
	/**
	 * Length of the checksum
	 */
	public static final int IDNR_CHECKSUM_LENGTH = 1;
	
	private static final Pattern PATTERN_3_DIGITS_SEQUENCE = Pattern.compile("(.)\\1\\1");
	public static final int SIZE_FOR_TRIPLETS_ALLOWED = 8;
	public static final int SIZE_FOR_DOUBLET_ALLOWED = 9;
	public static final int SIZE_NOT_ALLOWED = 10;
	
	private TaxNumberValidator()
	{
	}
	
	/**
	 * Throws an {@link software.xdev.bzst.dip.client.exception.TaxNumberException} if the taxNumber is not valid
	 * according to the <a
	 * href="https://download.elster.de/download/schnittstellen/Pruefung_der_Steuer_und_Steueridentifikatsnummer.pdf">
	 * Elster - Prüfung der Steuer- und Steueridentifikationsnummer sowie der Ordnungskriterien bei der Grundsteuer</a>
	 */
	public static void validateTaxNumber(final String taxNumber)
	{
		if(taxNumber == null)
		{
			throw new TaxNumberException(taxNumber);
		}
		
		// 11-digits
		if(taxNumber.length() != IDNR_LENGTH)
		{
			throw new TaxNumberException(taxNumber);
		}
		
		// digits only, no leading zero
		if(!taxNumber.matches("^[1-9][0-9]{10}$"))
		{
			throw new TaxNumberException(taxNumber);
		}
		
		final String idnrNumber = taxNumber.substring(0, IDNR_NUMBER_LENGTH);
		final String idnrChecksum = taxNumber.substring(IDNR_NUMBER_LENGTH, 11);
		
		if(!doValidateIdNr(idnrNumber))
		{
			throw new TaxNumberException(taxNumber);
		}
		
		if(!isValidIdNrChecksum(idnrNumber, Integer.valueOf(idnrChecksum).intValue()))
		{
			throw new TaxNumberException(taxNumber);
		}
	}
	
	/**
	 * Validates the "number" part of the IdNr (digits 1 to 10). Returns
	 * all validation errors found.
	 */
	private static boolean doValidateIdNr(final String taxNumber)
	{
		
		Objects.requireNonNull(taxNumber);
		
		// 10-digits, no leading zero.
		if(!taxNumber.matches("^[1-9][0-9]{9}$"))
		{
			return false;
		}
		
		// No triple digit sequence.
		if(PATTERN_3_DIGITS_SEQUENCE.matcher(taxNumber).find())
		{
			return false;
		}
		
		// Count occurences of each digit.
		final Map<Integer, Integer> digits = new HashMap<>();
		
		taxNumber
			.codePoints()
			.map(codePoint -> codePoint - '0')
			.forEach(digit -> digits.put(digit, Optional.ofNullable(digits.get(digit)).orElse(0) + 1));
		
		switch(digits.size())
		{
			case SIZE_FOR_TRIPLETS_ALLOWED:
				// only one triple allowed, causing lack of two other digits
				if(digits.values().stream().filter(d -> d == 3).count() != 1)
				{
					return false;
				}
				break;
			case SIZE_FOR_DOUBLET_ALLOWED:
				// only one double allowed, causing lack of one other digits
				if(digits.values().stream().filter(d -> d == 2).count() != 1)
				{
					return false;
				}
				break;
			case SIZE_NOT_ALLOWED:
				// no double or triple, not okay
				return false;
			default:
				// too many occurences (3+) of same digit
				return false;
		}
		return true;
	}
	
	/**
	 * Computes the check digit of the given "number" part of the IdNr and
	 * compares it to the given one.
	 */
	private static boolean isValidIdNrChecksum(final String idnrNumber, final int idnrCheckDigit)
	{
		Objects.requireNonNull(idnrNumber);
		
		final int p = idnrNumber
			.codePoints()
			.map(codePoint -> codePoint - '0')
			.reduce(IDNR_NUMBER_LENGTH, (product, digit) -> {
				
				int sum = (digit + product) % IDNR_NUMBER_LENGTH;
				if(sum == 0)
				{
					sum = IDNR_NUMBER_LENGTH;
				}
				product = (2 * sum) % IDNR_LENGTH;
				
				return product;
			});
		
		final int computedChecksum = (IDNR_LENGTH - p) % SIZE_NOT_ALLOWED;
		
		return computedChecksum == idnrCheckDigit;
	}
}
