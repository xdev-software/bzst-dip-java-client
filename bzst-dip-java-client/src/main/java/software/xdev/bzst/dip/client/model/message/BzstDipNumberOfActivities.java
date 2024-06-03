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
package software.xdev.bzst.dip.client.model.message;

import java.math.BigInteger;

import software.xdev.bzst.dip.client.xmldocument.model.NumberOfActivitiesType;


/**
 * From <a
 * href="https://www.oecd.org/tax/exchange-of-tax-information/model-rules-for-reporting-by-digital-platform-operators
 * -xml-schema-user-guide-for-tax-administrations.pdf" >Model Rules for Reporting by Digital Platform
 * Operators</a>:<br>
 * <p>
 * The number of activities element specified the number of relevant activities that a Reportable Seller has provided.
 */
public class BzstDipNumberOfActivities
{
	private final BigInteger numberQuarter1;
	private final BigInteger numberQuarter2;
	private final BigInteger numberQuarter3;
	private final BigInteger numberQuarter4;
	
	public BzstDipNumberOfActivities(
		final BigInteger numberQuarter1,
		final BigInteger numberQuarter2,
		final BigInteger numberQuarter3,
		final BigInteger numberQuarter4)
	{
		this.numberQuarter1 = numberQuarter1;
		this.numberQuarter2 = numberQuarter2;
		this.numberQuarter3 = numberQuarter3;
		this.numberQuarter4 = numberQuarter4;
	}
	
	public BzstDipNumberOfActivities(
		final Integer numberQuarter1,
		final Integer numberQuarter2,
		final Integer numberQuarter3,
		final Integer numberQuarter4)
	{
		this(
			BigInteger.valueOf(numberQuarter1),
			BigInteger.valueOf(numberQuarter2),
			BigInteger.valueOf(numberQuarter3),
			BigInteger.valueOf(numberQuarter4)
		);
	}
	
	public NumberOfActivitiesType toXmlType()
	{
		final NumberOfActivitiesType numberOfActivitiesType = new NumberOfActivitiesType();
		numberOfActivitiesType.setNumbQ1(this.numberQuarter1);
		numberOfActivitiesType.setNumbQ2(this.numberQuarter2);
		numberOfActivitiesType.setNumbQ3(this.numberQuarter3);
		numberOfActivitiesType.setNumbQ4(this.numberQuarter4);
		return numberOfActivitiesType;
	}
}
