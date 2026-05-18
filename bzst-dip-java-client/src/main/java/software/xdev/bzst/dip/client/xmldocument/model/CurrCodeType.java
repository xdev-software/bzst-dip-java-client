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

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;

// CPD-OFF - Will be refactored in #14
/**
 * <p>Java class for currCode_Type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="currCode_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AED"/&gt;
 *     &lt;enumeration value="AFN"/&gt;
 *     &lt;enumeration value="ALL"/&gt;
 *     &lt;enumeration value="AMD"/&gt;
 *     &lt;enumeration value="ANG"/&gt;
 *     &lt;enumeration value="AOA"/&gt;
 *     &lt;enumeration value="ARS"/&gt;
 *     &lt;enumeration value="AUD"/&gt;
 *     &lt;enumeration value="AWG"/&gt;
 *     &lt;enumeration value="AZN"/&gt;
 *     &lt;enumeration value="BAM"/&gt;
 *     &lt;enumeration value="BBD"/&gt;
 *     &lt;enumeration value="BDT"/&gt;
 *     &lt;enumeration value="BGN"/&gt;
 *     &lt;enumeration value="BHD"/&gt;
 *     &lt;enumeration value="BIF"/&gt;
 *     &lt;enumeration value="BMD"/&gt;
 *     &lt;enumeration value="BND"/&gt;
 *     &lt;enumeration value="BOB"/&gt;
 *     &lt;enumeration value="BOV"/&gt;
 *     &lt;enumeration value="BRL"/&gt;
 *     &lt;enumeration value="BSD"/&gt;
 *     &lt;enumeration value="BTN"/&gt;
 *     &lt;enumeration value="BWP"/&gt;
 *     &lt;enumeration value="BYN"/&gt;
 *     &lt;enumeration value="BYR"/&gt;
 *     &lt;enumeration value="BZD"/&gt;
 *     &lt;enumeration value="CAD"/&gt;
 *     &lt;enumeration value="CDF"/&gt;
 *     &lt;enumeration value="CHE"/&gt;
 *     &lt;enumeration value="CHF"/&gt;
 *     &lt;enumeration value="CHW"/&gt;
 *     &lt;enumeration value="CLF"/&gt;
 *     &lt;enumeration value="CLP"/&gt;
 *     &lt;enumeration value="CNY"/&gt;
 *     &lt;enumeration value="COP"/&gt;
 *     &lt;enumeration value="COU"/&gt;
 *     &lt;enumeration value="CRC"/&gt;
 *     &lt;enumeration value="CUC"/&gt;
 *     &lt;enumeration value="CUP"/&gt;
 *     &lt;enumeration value="CVE"/&gt;
 *     &lt;enumeration value="CZK"/&gt;
 *     &lt;enumeration value="DJF"/&gt;
 *     &lt;enumeration value="DKK"/&gt;
 *     &lt;enumeration value="DOP"/&gt;
 *     &lt;enumeration value="DZD"/&gt;
 *     &lt;enumeration value="EGP"/&gt;
 *     &lt;enumeration value="ERN"/&gt;
 *     &lt;enumeration value="ETB"/&gt;
 *     &lt;enumeration value="EUR"/&gt;
 *     &lt;enumeration value="FJD"/&gt;
 *     &lt;enumeration value="FKP"/&gt;
 *     &lt;enumeration value="GBP"/&gt;
 *     &lt;enumeration value="GEL"/&gt;
 *     &lt;enumeration value="GHS"/&gt;
 *     &lt;enumeration value="GIP"/&gt;
 *     &lt;enumeration value="GMD"/&gt;
 *     &lt;enumeration value="GNF"/&gt;
 *     &lt;enumeration value="GTQ"/&gt;
 *     &lt;enumeration value="GYD"/&gt;
 *     &lt;enumeration value="HKD"/&gt;
 *     &lt;enumeration value="HNL"/&gt;
 *     &lt;enumeration value="HRK"/&gt;
 *     &lt;enumeration value="HTG"/&gt;
 *     &lt;enumeration value="HUF"/&gt;
 *     &lt;enumeration value="IDR"/&gt;
 *     &lt;enumeration value="ILS"/&gt;
 *     &lt;enumeration value="INR"/&gt;
 *     &lt;enumeration value="IQD"/&gt;
 *     &lt;enumeration value="IRR"/&gt;
 *     &lt;enumeration value="ISK"/&gt;
 *     &lt;enumeration value="JMD"/&gt;
 *     &lt;enumeration value="JOD"/&gt;
 *     &lt;enumeration value="JPY"/&gt;
 *     &lt;enumeration value="KES"/&gt;
 *     &lt;enumeration value="KGS"/&gt;
 *     &lt;enumeration value="KHR"/&gt;
 *     &lt;enumeration value="KMF"/&gt;
 *     &lt;enumeration value="KPW"/&gt;
 *     &lt;enumeration value="KRW"/&gt;
 *     &lt;enumeration value="KWD"/&gt;
 *     &lt;enumeration value="KYD"/&gt;
 *     &lt;enumeration value="KZT"/&gt;
 *     &lt;enumeration value="LAK"/&gt;
 *     &lt;enumeration value="LBP"/&gt;
 *     &lt;enumeration value="LKR"/&gt;
 *     &lt;enumeration value="LRD"/&gt;
 *     &lt;enumeration value="LSL"/&gt;
 *     &lt;enumeration value="LTL"/&gt;
 *     &lt;enumeration value="LVL"/&gt;
 *     &lt;enumeration value="LYD"/&gt;
 *     &lt;enumeration value="MAD"/&gt;
 *     &lt;enumeration value="MDL"/&gt;
 *     &lt;enumeration value="MGA"/&gt;
 *     &lt;enumeration value="MKD"/&gt;
 *     &lt;enumeration value="MMK"/&gt;
 *     &lt;enumeration value="MNT"/&gt;
 *     &lt;enumeration value="MOP"/&gt;
 *     &lt;enumeration value="MRO"/&gt;
 *     &lt;enumeration value="MRU"/&gt;
 *     &lt;enumeration value="MUR"/&gt;
 *     &lt;enumeration value="MVR"/&gt;
 *     &lt;enumeration value="MWK"/&gt;
 *     &lt;enumeration value="MXN"/&gt;
 *     &lt;enumeration value="MXV"/&gt;
 *     &lt;enumeration value="MYR"/&gt;
 *     &lt;enumeration value="MZN"/&gt;
 *     &lt;enumeration value="NAD"/&gt;
 *     &lt;enumeration value="NGN"/&gt;
 *     &lt;enumeration value="NIO"/&gt;
 *     &lt;enumeration value="NOK"/&gt;
 *     &lt;enumeration value="NPR"/&gt;
 *     &lt;enumeration value="NZD"/&gt;
 *     &lt;enumeration value="OMR"/&gt;
 *     &lt;enumeration value="PAB"/&gt;
 *     &lt;enumeration value="PEN"/&gt;
 *     &lt;enumeration value="PGK"/&gt;
 *     &lt;enumeration value="PHP"/&gt;
 *     &lt;enumeration value="PKR"/&gt;
 *     &lt;enumeration value="PLN"/&gt;
 *     &lt;enumeration value="PYG"/&gt;
 *     &lt;enumeration value="QAR"/&gt;
 *     &lt;enumeration value="RON"/&gt;
 *     &lt;enumeration value="RSD"/&gt;
 *     &lt;enumeration value="RUB"/&gt;
 *     &lt;enumeration value="RWF"/&gt;
 *     &lt;enumeration value="SAR"/&gt;
 *     &lt;enumeration value="SBD"/&gt;
 *     &lt;enumeration value="SCR"/&gt;
 *     &lt;enumeration value="SDG"/&gt;
 *     &lt;enumeration value="SEK"/&gt;
 *     &lt;enumeration value="SGD"/&gt;
 *     &lt;enumeration value="SHP"/&gt;
 *     &lt;enumeration value="SLL"/&gt;
 *     &lt;enumeration value="SOS"/&gt;
 *     &lt;enumeration value="SRD"/&gt;
 *     &lt;enumeration value="SSP"/&gt;
 *     &lt;enumeration value="STD"/&gt;
 *     &lt;enumeration value="STN"/&gt;
 *     &lt;enumeration value="SVC"/&gt;
 *     &lt;enumeration value="SYP"/&gt;
 *     &lt;enumeration value="SZL"/&gt;
 *     &lt;enumeration value="THB"/&gt;
 *     &lt;enumeration value="TJS"/&gt;
 *     &lt;enumeration value="TMT"/&gt;
 *     &lt;enumeration value="TND"/&gt;
 *     &lt;enumeration value="TOP"/&gt;
 *     &lt;enumeration value="TRY"/&gt;
 *     &lt;enumeration value="TTD"/&gt;
 *     &lt;enumeration value="TWD"/&gt;
 *     &lt;enumeration value="TZS"/&gt;
 *     &lt;enumeration value="UAH"/&gt;
 *     &lt;enumeration value="UGX"/&gt;
 *     &lt;enumeration value="USD"/&gt;
 *     &lt;enumeration value="USN"/&gt;
 *     &lt;enumeration value="USS"/&gt;
 *     &lt;enumeration value="UYI"/&gt;
 *     &lt;enumeration value="UYU"/&gt;
 *     &lt;enumeration value="UYW"/&gt;
 *     &lt;enumeration value="UZS"/&gt;
 *     &lt;enumeration value="VEF"/&gt;
 *     &lt;enumeration value="VES"/&gt;
 *     &lt;enumeration value="VND"/&gt;
 *     &lt;enumeration value="VUV"/&gt;
 *     &lt;enumeration value="WST"/&gt;
 *     &lt;enumeration value="XAF"/&gt;
 *     &lt;enumeration value="XAG"/&gt;
 *     &lt;enumeration value="XAU"/&gt;
 *     &lt;enumeration value="XBA"/&gt;
 *     &lt;enumeration value="XBB"/&gt;
 *     &lt;enumeration value="XBC"/&gt;
 *     &lt;enumeration value="XBD"/&gt;
 *     &lt;enumeration value="XCD"/&gt;
 *     &lt;enumeration value="XDR"/&gt;
 *     &lt;enumeration value="XFU"/&gt;
 *     &lt;enumeration value="XOF"/&gt;
 *     &lt;enumeration value="XPD"/&gt;
 *     &lt;enumeration value="XPF"/&gt;
 *     &lt;enumeration value="XPT"/&gt;
 *     &lt;enumeration value="XSU"/&gt;
 *     &lt;enumeration value="XUA"/&gt;
 *     &lt;enumeration value="XXX"/&gt;
 *     &lt;enumeration value="YER"/&gt;
 *     &lt;enumeration value="ZAR"/&gt;
 *     &lt;enumeration value="ZMW"/&gt;
 *     &lt;enumeration value="ZWL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "currCode_Type", namespace = "urn:oecd:ties:isodpitypes:v1")
@XmlEnum
public enum CurrCodeType
{
	
	/**
	 * UAE Dirham: UNITED ARAB EMIRATES
	 */
	AED,
	
	/**
	 * Afghani: AFGHANISTAN
	 */
	AFN,
	
	/**
	 * Lek: ALBANIA
	 */
	ALL,
	
	/**
	 * Armenian Dram: ARMENIA
	 */
	AMD,
	
	/**
	 * Netherlands Antillean Guilder: CURACAO; SINT MAARTEN (DUTCH PART)
	 */
	ANG,
	
	/**
	 * Kwanza: ANGOLA
	 */
	AOA,
	
	/**
	 * Argentine Peso: ARGENTINA
	 */
	ARS,
	
	/**
	 * Australian Dollar: AUSTRALIA; CHRISTMAS ISLAND; COCOS (KEELING) ISLANDS; HEARD ISLAND AND McDONALD ISLANDS;
	 * KIRIBATI; NAURU; NORFOLK ISLAND; TUVALU
	 */
	AUD,
	
	/**
	 * Aruban Florin: ARUBA
	 */
	AWG,
	
	/**
	 * Azerbaijan Manat: AZERBAIJAN
	 */
	AZN,
	
	/**
	 * Convertible Mark: BOSNIA AND HERZEGOVINA
	 */
	BAM,
	
	/**
	 * Barbados Dollar: BARBADOS
	 */
	BBD,
	
	/**
	 * Taka: BANGLADESH
	 */
	BDT,
	
	/**
	 * Bulgarian Lev: BULGARIA
	 */
	BGN,
	
	/**
	 * Bahraini Dinar: BAHRAIN
	 */
	BHD,
	
	/**
	 * Burundi Franc: BURUNDI
	 */
	BIF,
	
	/**
	 * Bermudian Dollar: BERMUDA
	 */
	BMD,
	
	/**
	 * Brunei Dollar: BRUNEI DARUSSALAM
	 */
	BND,
	
	/**
	 * Boliviano: BOLIVIA, PLURINATIONAL STATE OF
	 */
	BOB,
	
	/**
	 * Mvdol: BOLIVIA, PLURINATIONAL STATE OF
	 */
	BOV,
	
	/**
	 * Brazilian Real: BRAZIL
	 */
	BRL,
	
	/**
	 * Bahamian Dollar: BAHAMAS
	 */
	BSD,
	
	/**
	 * Ngultrum: BHUTAN
	 */
	BTN,
	
	/**
	 * Pula: BOTSWANA
	 */
	BWP,
	
	/**
	 * Belarusian Ruble: BELARUS
	 */
	BYN,
	
	/**
	 * Historic use: Belarussian Ruble: BELARUS
	 */
	BYR,
	
	/**
	 * Belize Dollar: BELIZE
	 */
	BZD,
	
	/**
	 * Canadian Dollar: CANADA
	 */
	CAD,
	
	/**
	 * Congolese Franc: CONGO, THE DEMOCRATIC REPUBLIC OF
	 */
	CDF,
	
	/**
	 * WIR Euro: SWITZERLAND
	 */
	CHE,
	
	/**
	 * Swiss Franc: LIECHTENSTEIN; SWITZERLAND
	 */
	CHF,
	
	/**
	 * WIR Franc: SWITZERLAND
	 */
	CHW,
	
	/**
	 * Unidad de Fomento: CHILE
	 */
	CLF,
	
	/**
	 * Chilean Peso: CHILE
	 */
	CLP,
	
	/**
	 * Yuan Renminbi: CHINA
	 */
	CNY,
	
	/**
	 * Colombian Peso: COLOMBIA
	 */
	COP,
	
	/**
	 * Unidad de Valor Real: COLOMBIA
	 */
	COU,
	
	/**
	 * Costa Rican Colon: COSTA RICA
	 */
	CRC,
	
	/**
	 * Peso Convertible: CUBA
	 */
	CUC,
	
	/**
	 * Cuban Peso: CUBA
	 */
	CUP,
	
	/**
	 * Cabo Verde Escudo: CABO VERDE
	 */
	CVE,
	
	/**
	 * Czech Koruna: CZECHIA
	 */
	CZK,
	
	/**
	 * Djibouti Franc: DJIBOUTI
	 */
	DJF,
	
	/**
	 * Danish Krone: DENMARK; FAROE ISLANDS; GREENLAND
	 */
	DKK,
	
	/**
	 * Dominican Peso: DOMINICAN REPUBLIC
	 */
	DOP,
	
	/**
	 * Algerian Dinar: ALGERIA
	 */
	DZD,
	
	/**
	 * Egyptian Pound: EGYPT
	 */
	EGP,
	
	/**
	 * Nakfa: ERITREA
	 */
	ERN,
	
	/**
	 * Ethiopian Birr: ETHIOPIA
	 */
	ETB,
	
	/**
	 * Euro: ALAND ISLANDS; ANDORRA; AUSTRIA; BELGIUM; CYPRUS; ESTONIA; EUROPEAN UNION; FINLAND; FRANCE; FRENCH GUIANA;
	 * FRENCH SOUTHERN TERRITORIES; GERMANY; GREECE; GUADELOUPE; HOLY SEE (VATICAN CITY STATE); IRELAND; ITALY; LATVIA;
	 * LITHUANIA; LUXEMBOURG; MALTA; MARTINIQUE; MAYOTTE; MONACO; MONTENEGRO; NETHERLANDS; PORTUGAL; REUNION; SAINT
	 * BARTHELEMY; SAINT MARTIN (FRENCH PART); SAINT PIERRE AND MIQUELON; SAN MARINO; SLOVAKIA; SLOVENIA; SPAIN;
	 * Vatican
	 * City State (HOLY SEE)
	 */
	EUR,
	
	/**
	 * Fiji Dollar: FIJI
	 */
	FJD,
	
	/**
	 * Falkland Islands Pound: FALKLAND ISLANDS (MALVINAS)
	 */
	FKP,
	
	/**
	 * Pound Sterling: GUERNSEY; ISLE OF MAN; JERSEY; UNITED KINGDOM OF GREAT BRITAIN AND NORTHERN IRELAND
	 */
	GBP,
	
	/**
	 * Lari: GEORGIA
	 */
	GEL,
	
	/**
	 * Ghana Cedi: GHANA
	 */
	GHS,
	
	/**
	 * Gibraltar Pound: GIBRALTAR
	 */
	GIP,
	
	/**
	 * Dalasi: GAMBIA
	 */
	GMD,
	
	/**
	 * Guinean Franc: GUINEA
	 */
	GNF,
	
	/**
	 * Quetzal: GUATEMALA
	 */
	GTQ,
	
	/**
	 * Guyana Dollar: GUYANA
	 */
	GYD,
	
	/**
	 * Hong Kong Dollar: HONG KONG
	 */
	HKD,
	
	/**
	 * Lempira: HONDURAS
	 */
	HNL,
	
	/**
	 * Kuna: CROATIA
	 */
	HRK,
	
	/**
	 * Gourde: HAITI
	 */
	HTG,
	
	/**
	 * Forint: HUNGARY
	 */
	HUF,
	
	/**
	 * Rupiah: INDONESIA
	 */
	IDR,
	
	/**
	 * New Israeli Sheqel: ISRAEL
	 */
	ILS,
	
	/**
	 * Indian Rupee: BHUTAN; INDIA
	 */
	INR,
	
	/**
	 * Iraqi Dinar: IRAQ
	 */
	IQD,
	
	/**
	 * Iranian Rial: IRAN, ISLAMIC REPUBLIC OF
	 */
	IRR,
	
	/**
	 * Iceland Krona: ICELAND
	 */
	ISK,
	
	/**
	 * Jamaican Dollar: JAMAICA
	 */
	JMD,
	
	/**
	 * Jordanian Dinar: JORDAN
	 */
	JOD,
	
	/**
	 * Yen: JAPAN
	 */
	JPY,
	
	/**
	 * Kenyan Shilling: KENYA
	 */
	KES,
	
	/**
	 * Som: KYRGYZSTAN
	 */
	KGS,
	
	/**
	 * Riel: CAMBODIA
	 */
	KHR,
	
	/**
	 * Comorian Franc : COMOROS
	 */
	KMF,
	
	/**
	 * North Korean Won: KOREA, DEMOCRATIC PEOPLE’S REPUBLIC OF
	 */
	KPW,
	
	/**
	 * Won: KOREA, REPUBLIC OF
	 */
	KRW,
	
	/**
	 * Kuwaiti Dinar: KUWAIT
	 */
	KWD,
	
	/**
	 * Cayman Islands Dollar: CAYMAN ISLANDS
	 */
	KYD,
	
	/**
	 * Tenge: KAZAKHSTAN
	 */
	KZT,
	
	/**
	 * Lao Kip: LAO PEOPLE’S DEMOCRATIC REPUBLIC
	 */
	LAK,
	
	/**
	 * Lebanese Pound: LEBANON
	 */
	LBP,
	
	/**
	 * Sri Lanka Rupee: SRI LANKA
	 */
	LKR,
	
	/**
	 * Liberian Dollar: LIBERIA
	 */
	LRD,
	
	/**
	 * Loti: LESOTHO
	 */
	LSL,
	
	/**
	 * Historic use: Lithuanian Litas: LITHUANIA
	 */
	LTL,
	
	/**
	 * Historic use: Latvian Lats: LATVIA
	 */
	LVL,
	
	/**
	 * Libyan Dinar: LIBYA
	 */
	LYD,
	
	/**
	 * Moroccan Dirham: MOROCCO; WESTERN SAHARA
	 */
	MAD,
	
	/**
	 * Moldovan Leu: MOLDOVA, REPUBLIC OF
	 */
	MDL,
	
	/**
	 * Malagasy Ariary: MADAGASCAR
	 */
	MGA,
	
	/**
	 * Denar: MACEDONIA, THE FORMER YUGOSLAV REPUBLIC OF
	 */
	MKD,
	
	/**
	 * Kyat: MYANMAR
	 */
	MMK,
	
	/**
	 * Tugrik: MONGOLIA
	 */
	MNT,
	
	/**
	 * Pataca: MACAO
	 */
	MOP,
	
	/**
	 * Historic use: Ouguiya: MAURITANIA
	 */
	MRO,
	
	/**
	 * Ouguiya: MAURITANIA
	 */
	MRU,
	
	/**
	 * Mauritius Rupee: MAURITIUS
	 */
	MUR,
	
	/**
	 * Rufiyaa: MALDIVES
	 */
	MVR,
	
	/**
	 * Malawi Kwacha: MALAWI
	 */
	MWK,
	
	/**
	 * Mexican Peso: MEXICO
	 */
	MXN,
	
	/**
	 * Mexican Unidad de Inversion (UDI): MEXICO
	 */
	MXV,
	
	/**
	 * Malaysian Ringgit: MALAYSIA
	 */
	MYR,
	
	/**
	 * Mozambique Metical: MOZAMBIQUE
	 */
	MZN,
	
	/**
	 * Namibia Dollar: NAMIBIA
	 */
	NAD,
	
	/**
	 * Naira: NIGERIA
	 */
	NGN,
	
	/**
	 * Cordoba Oro: NICARAGUA
	 */
	NIO,
	
	/**
	 * Norwegian Krone: BOUVET ISLAND; NORWAY; SVALBARD AND JAN MAYEN
	 */
	NOK,
	
	/**
	 * Nepalese Rupee: NEPAL
	 */
	NPR,
	
	/**
	 * New Zealand Dollar: COOK ISLANDS; NEW ZEALAND; NIUE; PITCAIRN; TOKELAU
	 */
	NZD,
	
	/**
	 * Rial Omani: OMAN
	 */
	OMR,
	
	/**
	 * Balboa: PANAMA
	 */
	PAB,
	
	/**
	 * Sol: PERU
	 */
	PEN,
	
	/**
	 * Kina: PAPUA NEW GUINEA
	 */
	PGK,
	
	/**
	 * Philippine Peso: PHILIPPINES
	 */
	PHP,
	
	/**
	 * Pakistan Rupee: PAKISTAN
	 */
	PKR,
	
	/**
	 * Zloty: POLAND
	 */
	PLN,
	
	/**
	 * Guarani: PARAGUAY
	 */
	PYG,
	
	/**
	 * Qatari Rial: QATAR
	 */
	QAR,
	
	/**
	 * Romanian Leu: ROMANIA
	 */
	RON,
	
	/**
	 * Serbian Dinar: SERBIA
	 */
	RSD,
	
	/**
	 * Russian Ruble: RUSSIAN FEDERATION
	 */
	RUB,
	
	/**
	 * Rwanda Franc: RWANDA
	 */
	RWF,
	
	/**
	 * Saudi Riyal: SAUDI ARABIA
	 */
	SAR,
	
	/**
	 * Solomon Islands Dollar: SOLOMON ISLANDS
	 */
	SBD,
	
	/**
	 * Seychelles Rupee: SEYCHELLES
	 */
	SCR,
	
	/**
	 * Sudanese Pound: SUDAN
	 */
	SDG,
	
	/**
	 * Swedish Krona: SWEDEN
	 */
	SEK,
	
	/**
	 * Singapore Dollar: SINGAPORE
	 */
	SGD,
	
	/**
	 * Saint Helena Pound: SAINT HELENA, ASCENSION AND TRISTAN DA CUNHA
	 */
	SHP,
	
	/**
	 * Leone: SIERRA LEONE
	 */
	SLL,
	
	/**
	 * Somali Shilling: SOMALIA
	 */
	SOS,
	
	/**
	 * Surinam Dollar: SURINAME
	 */
	SRD,
	
	/**
	 * South Sudanese Pound: SOUTH SUDAN
	 */
	SSP,
	
	/**
	 * Historic use: Dobra: SAO TOME AND PRINCIPE
	 */
	STD,
	
	/**
	 * Dobra: SAO TOME AND PRINCIPE
	 */
	STN,
	
	/**
	 * El Salvador Colon: EL SALVADOR
	 */
	SVC,
	
	/**
	 * Syrian Pound: SYRIAN ARAB REPUBLIC
	 */
	SYP,
	
	/**
	 * Lilangeni: ESWATINI
	 */
	SZL,
	
	/**
	 * Baht: THAILAND
	 */
	THB,
	
	/**
	 * Somoni: TAJIKISTAN
	 */
	TJS,
	
	/**
	 * Turkmenistan New Manat: TURKMENISTAN
	 */
	TMT,
	
	/**
	 * Tunisian Dinar: TUNISIA
	 */
	TND,
	
	/**
	 * Pa’anga: TONGA
	 */
	TOP,
	
	/**
	 * Turkish Lira: TURKEY
	 */
	TRY,
	
	/**
	 * Trinidad and Tobago Dollar: TRINIDAD AND TOBAGO
	 */
	TTD,
	
	/**
	 * New Taiwan Dollar: TAIWAN, PROVINCE OF CHINA
	 */
	TWD,
	
	/**
	 * Tanzanian Shilling: TANZANIA, UNITED REPUBLIC OF
	 */
	TZS,
	
	/**
	 * Hryvnia: UKRAINE
	 */
	UAH,
	
	/**
	 * Uganda Shilling: UGANDA
	 */
	UGX,
	
	/**
	 * US Dollar: AMERICAN SAMOA; BONAIRE; SINT EUSTATIUS AND SABA; BRITISH INDIAN OCEAN TERRITORY; ECUADOR; EL
	 * SALVADOR; GUAM; HAITI; MARSHALL ISLANDS; MICRONESIA, FEDERATED STATES OF; NORTHERN MARIANA ISLANDS; PALAU;
	 * PANAMA; PUERTO RICO; TIMOR-LESTE; TURKS AND CAICOS ISLANDS; UNITED STATES; UNITED STATES MINOR OUTLYING ISLANDS;
	 * VIRGIN ISLANDS (BRITISH); VIRGIN ISLANDS (US)
	 */
	USD,
	
	/**
	 * US Dollar (Next day): UNITED STATES
	 */
	USN,
	
	/**
	 * Historic use: US Dollar (Same day): UNITED STATES
	 */
	USS,
	
	/**
	 * Uruguay Peso en Unidades Indexadas (UI): URUGUAY
	 */
	UYI,
	
	/**
	 * Peso Uruguayo: URUGUAY
	 */
	UYU,
	
	/**
	 * Unidad Previsional: URUGUAY
	 */
	UYW,
	
	/**
	 * Uzbekistan Sum: UZBEKISTAN
	 */
	UZS,
	
	/**
	 * Historic use: Bolivar: VENEZUELA, BOLIVARIAN REPUBLIC OF
	 */
	VEF,
	
	/**
	 * Bolívar Soberano: VENEZUELA, BOLIVARIAN REPUBLIC OF
	 */
	VES,
	
	/**
	 * Dong: VIET NAM
	 */
	VND,
	
	/**
	 * Vatu: VANUATU
	 */
	VUV,
	
	/**
	 * Tala: SAMOA
	 */
	WST,
	
	/**
	 * CFA Franc BEAC: CAMEROON; CENTRAL AFRICAN REPUBLIC; CHAD; CONGO; EQUATORIAL GUINEA; GABON
	 */
	XAF,
	
	/**
	 * Silver: ZZ11_Silver
	 */
	XAG,
	
	/**
	 * Gold: ZZ08_Gold
	 */
	XAU,
	
	/**
	 * Bond Markets Unit European Composite Unit (EURCO):  ZZ01_Bond Markets Unit European_EURCO
	 */
	XBA,
	
	/**
	 * Bond Markets Unit European Monetary Unit (E.M.U.-6): ZZ02_Bond Markets Unit European_EMU-6
	 */
	XBB,
	
	/**
	 * Bond Markets Unit European Unit of Account 9 (E.U.A.-9): ZZ03_Bond Markets Unit European_EUA-9
	 */
	XBC,
	
	/**
	 * Bond Markets Unit European Unit of Account 17 (E.U.A.-17): ZZ04_Bond Markets Unit European_EUA-17
	 */
	XBD,
	
	/**
	 * East Caribbean Dollar: ANGUILLA; ANTIGUA AND BARBUDA; DOMINICA; GRENADA; MONTSERRAT; SAINT KITTS AND NEVIS;
	 * SAINT
	 * LUCIA; SAINT VINCENT AND THE GRENADINES
	 */
	XCD,
	
	/**
	 * SDR (Special Drawing Right): INTERNATIONAL MONETARY FUND (IMF)
	 */
	XDR,
	
	/**
	 * Historic use: UIC-Franc: ZZ05_UIC-Franc
	 */
	XFU,
	
	/**
	 * CFA Franc BCEAO: BENIN; BURKINA FASO; COTE D'IVOIRE; GUINEA-BISSAU; MALI; NIGER; SENEGAL; TOGO
	 */
	XOF,
	
	/**
	 * Palladium: ZZ09_Palladium
	 */
	XPD,
	
	/**
	 * CFP Franc: FRENCH POLYNESIA; NEW CALEDONIA; WALLIS AND FUTUNA
	 */
	XPF,
	
	/**
	 * Platinum: ZZ10_Platinum
	 */
	XPT,
	
	/**
	 * Sucre: SISTEMA UNITARIO DE COMPENSACION REGIONAL DE PAGOS "SUCRE"
	 */
	XSU,
	
	/**
	 * ADB Unit of Account: MEMBER COUNTRIES OF THE AFRICAN DEVELOPMENT BANK GROUP
	 */
	XUA,
	
	/**
	 * The codes assigned for transactions where no currency is involved: ZZ07_No_Currency
	 */
	XXX,
	
	/**
	 * Yemeni Rial: YEMEN
	 */
	YER,
	
	/**
	 * Rand: LESOTHO; NAMIBIA; SOUTH AFRICA
	 */
	ZAR,
	
	/**
	 * Zambian Kwacha: ZAMBIA
	 */
	ZMW,
	
	/**
	 * Zimbabwe Dollar: ZIMBABWE
	 */
	ZWL;
	
	public String value()
	{
		return this.name();
	}
	
	public static CurrCodeType fromValue(final String v)
	{
		return valueOf(v);
	}
}
