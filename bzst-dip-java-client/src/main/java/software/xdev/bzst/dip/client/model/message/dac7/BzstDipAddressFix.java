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
package software.xdev.bzst.dip.client.model.message.dac7;

import software.xdev.bzst.dip.client.xmldocument.model.AddressFixType;


public class BzstDipAddressFix
{
	private final String street;
	private final String buildingIdentifier;
	private final String suiteIdentifier;
	private final String floorIdentifier;
	private final String districtName;
	/**
	 * Post office box number
	 */
	private final String pob;
	private final String postCode;
	private final String city;
	private final String countrySubentity;
	
	public BzstDipAddressFix(
		final String street,
		final String buildingIdentifier,
		final String suiteIdentifier,
		final String floorIdentifier,
		final String districtName,
		final String pob,
		final String postCode,
		final String city,
		final String countrySubentity)
	{
		this.street = street;
		this.buildingIdentifier = buildingIdentifier;
		this.suiteIdentifier = suiteIdentifier;
		this.floorIdentifier = floorIdentifier;
		this.districtName = districtName;
		this.pob = pob;
		this.postCode = postCode;
		this.city = city;
		this.countrySubentity = countrySubentity;
	}
	
	public BzstDipAddressFix(final String city)
	{
		this(
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			city,
			null
		);
	}
	
	public AddressFixType toXmlType()
	{
		final AddressFixType addressFixType = new AddressFixType();
		addressFixType.setStreet(this.street);
		addressFixType.setBuildingIdentifier(this.buildingIdentifier);
		addressFixType.setSuiteIdentifier(this.suiteIdentifier);
		addressFixType.setFloorIdentifier(this.floorIdentifier);
		addressFixType.setDistrictName(this.districtName);
		addressFixType.setPOB(this.pob);
		addressFixType.setPostCode(this.postCode);
		addressFixType.setCity(this.city);
		addressFixType.setCountrySubentity(this.countrySubentity);
		
		return addressFixType;
	}
}
