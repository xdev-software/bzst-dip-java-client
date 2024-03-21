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

import software.xdev.bzst.dip.client.xmldocument.model.CurrCodeType;


public enum BzstDipCurrency
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
	
	public CurrCodeType toXmlType()
	{
		return switch(this)
		{
			case AED -> CurrCodeType.AED;
			case AFN -> CurrCodeType.AFN;
			case ALL -> CurrCodeType.ALL;
			case AMD -> CurrCodeType.AMD;
			case ANG -> CurrCodeType.ANG;
			case AOA -> CurrCodeType.AOA;
			case ARS -> CurrCodeType.ARS;
			case AUD -> CurrCodeType.AUD;
			case AWG -> CurrCodeType.AWG;
			case AZN -> CurrCodeType.AZN;
			case BAM -> CurrCodeType.BAM;
			case BBD -> CurrCodeType.BBD;
			case BDT -> CurrCodeType.BDT;
			case BGN -> CurrCodeType.BGN;
			case BHD -> CurrCodeType.BHD;
			case BIF -> CurrCodeType.BIF;
			case BMD -> CurrCodeType.BMD;
			case BND -> CurrCodeType.BND;
			case BOB -> CurrCodeType.BOB;
			case BOV -> CurrCodeType.BOV;
			case BRL -> CurrCodeType.BRL;
			case BSD -> CurrCodeType.BSD;
			case BTN -> CurrCodeType.BTN;
			case BWP -> CurrCodeType.BWP;
			case BYN -> CurrCodeType.BYN;
			case BYR -> CurrCodeType.BYR;
			case BZD -> CurrCodeType.BZD;
			case CAD -> CurrCodeType.CAD;
			case CDF -> CurrCodeType.CDF;
			case CHE -> CurrCodeType.CHE;
			case CHF -> CurrCodeType.CHF;
			case CHW -> CurrCodeType.CHW;
			case CLF -> CurrCodeType.CLF;
			case CLP -> CurrCodeType.CLP;
			case CNY -> CurrCodeType.CNY;
			case COP -> CurrCodeType.COP;
			case COU -> CurrCodeType.COU;
			case CRC -> CurrCodeType.CRC;
			case CUC -> CurrCodeType.CUC;
			case CUP -> CurrCodeType.CUP;
			case CVE -> CurrCodeType.CVE;
			case CZK -> CurrCodeType.CZK;
			case DJF -> CurrCodeType.DJF;
			case DKK -> CurrCodeType.DKK;
			case DOP -> CurrCodeType.DOP;
			case DZD -> CurrCodeType.DZD;
			case EGP -> CurrCodeType.EGP;
			case ERN -> CurrCodeType.ERN;
			case ETB -> CurrCodeType.ETB;
			case EUR -> CurrCodeType.EUR;
			case FJD -> CurrCodeType.FJD;
			case FKP -> CurrCodeType.FKP;
			case GBP -> CurrCodeType.GBP;
			case GEL -> CurrCodeType.GEL;
			case GHS -> CurrCodeType.GHS;
			case GIP -> CurrCodeType.GIP;
			case GMD -> CurrCodeType.GMD;
			case GNF -> CurrCodeType.GNF;
			case GTQ -> CurrCodeType.GTQ;
			case GYD -> CurrCodeType.GYD;
			case HKD -> CurrCodeType.HKD;
			case HNL -> CurrCodeType.HNL;
			case HRK -> CurrCodeType.HRK;
			case HTG -> CurrCodeType.HTG;
			case HUF -> CurrCodeType.HUF;
			case IDR -> CurrCodeType.IDR;
			case ILS -> CurrCodeType.ILS;
			case INR -> CurrCodeType.INR;
			case IQD -> CurrCodeType.IQD;
			case IRR -> CurrCodeType.IRR;
			case ISK -> CurrCodeType.ISK;
			case JMD -> CurrCodeType.JMD;
			case JOD -> CurrCodeType.JOD;
			case JPY -> CurrCodeType.JPY;
			case KES -> CurrCodeType.KES;
			case KGS -> CurrCodeType.KGS;
			case KHR -> CurrCodeType.KHR;
			case KMF -> CurrCodeType.KMF;
			case KPW -> CurrCodeType.KPW;
			case KRW -> CurrCodeType.KRW;
			case KWD -> CurrCodeType.KWD;
			case KYD -> CurrCodeType.KYD;
			case KZT -> CurrCodeType.KZT;
			case LAK -> CurrCodeType.LAK;
			case LBP -> CurrCodeType.LBP;
			case LKR -> CurrCodeType.LKR;
			case LRD -> CurrCodeType.LRD;
			case LSL -> CurrCodeType.LSL;
			case LTL -> CurrCodeType.LTL;
			case LVL -> CurrCodeType.LVL;
			case LYD -> CurrCodeType.LYD;
			case MAD -> CurrCodeType.MAD;
			case MDL -> CurrCodeType.MDL;
			case MGA -> CurrCodeType.MGA;
			case MKD -> CurrCodeType.MKD;
			case MMK -> CurrCodeType.MMK;
			case MNT -> CurrCodeType.MNT;
			case MOP -> CurrCodeType.MOP;
			case MRO -> CurrCodeType.MRO;
			case MRU -> CurrCodeType.MRU;
			case MUR -> CurrCodeType.MUR;
			case MVR -> CurrCodeType.MVR;
			case MWK -> CurrCodeType.MWK;
			case MXN -> CurrCodeType.MXN;
			case MXV -> CurrCodeType.MXV;
			case MYR -> CurrCodeType.MYR;
			case MZN -> CurrCodeType.MZN;
			case NAD -> CurrCodeType.NAD;
			case NGN -> CurrCodeType.NGN;
			case NIO -> CurrCodeType.NIO;
			case NOK -> CurrCodeType.NOK;
			case NPR -> CurrCodeType.NPR;
			case NZD -> CurrCodeType.NZD;
			case OMR -> CurrCodeType.OMR;
			case PAB -> CurrCodeType.PAB;
			case PEN -> CurrCodeType.PEN;
			case PGK -> CurrCodeType.PGK;
			case PHP -> CurrCodeType.PHP;
			case PKR -> CurrCodeType.PKR;
			case PLN -> CurrCodeType.PLN;
			case PYG -> CurrCodeType.PYG;
			case QAR -> CurrCodeType.QAR;
			case RON -> CurrCodeType.RON;
			case RSD -> CurrCodeType.RSD;
			case RUB -> CurrCodeType.RUB;
			case RWF -> CurrCodeType.RWF;
			case SAR -> CurrCodeType.SAR;
			case SBD -> CurrCodeType.SBD;
			case SCR -> CurrCodeType.SCR;
			case SDG -> CurrCodeType.SDG;
			case SEK -> CurrCodeType.SEK;
			case SGD -> CurrCodeType.SGD;
			case SHP -> CurrCodeType.SHP;
			case SLL -> CurrCodeType.SLL;
			case SOS -> CurrCodeType.SOS;
			case SRD -> CurrCodeType.SRD;
			case SSP -> CurrCodeType.SSP;
			case STD -> CurrCodeType.STD;
			case STN -> CurrCodeType.STN;
			case SVC -> CurrCodeType.SVC;
			case SYP -> CurrCodeType.SYP;
			case SZL -> CurrCodeType.SZL;
			case THB -> CurrCodeType.THB;
			case TJS -> CurrCodeType.TJS;
			case TMT -> CurrCodeType.TMT;
			case TND -> CurrCodeType.TND;
			case TOP -> CurrCodeType.TOP;
			case TRY -> CurrCodeType.TRY;
			case TTD -> CurrCodeType.TTD;
			case TWD -> CurrCodeType.TWD;
			case TZS -> CurrCodeType.TZS;
			case UAH -> CurrCodeType.UAH;
			case UGX -> CurrCodeType.UGX;
			case USD -> CurrCodeType.USD;
			case USN -> CurrCodeType.USN;
			case USS -> CurrCodeType.USS;
			case UYI -> CurrCodeType.UYI;
			case UYU -> CurrCodeType.UYU;
			case UYW -> CurrCodeType.UYW;
			case UZS -> CurrCodeType.UZS;
			case VEF -> CurrCodeType.VEF;
			case VES -> CurrCodeType.VES;
			case VND -> CurrCodeType.VND;
			case VUV -> CurrCodeType.VUV;
			case WST -> CurrCodeType.WST;
			case XAF -> CurrCodeType.XAF;
			case XAG -> CurrCodeType.XAG;
			case XAU -> CurrCodeType.XAU;
			case XBA -> CurrCodeType.XBA;
			case XBB -> CurrCodeType.XBB;
			case XBC -> CurrCodeType.XBC;
			case XBD -> CurrCodeType.XBD;
			case XCD -> CurrCodeType.XCD;
			case XDR -> CurrCodeType.XDR;
			case XFU -> CurrCodeType.XFU;
			case XOF -> CurrCodeType.XOF;
			case XPD -> CurrCodeType.XPD;
			case XPF -> CurrCodeType.XPF;
			case XPT -> CurrCodeType.XPT;
			case XSU -> CurrCodeType.XSU;
			case XUA -> CurrCodeType.XUA;
			case XXX -> CurrCodeType.XXX;
			case YER -> CurrCodeType.YER;
			case ZAR -> CurrCodeType.ZAR;
			case ZMW -> CurrCodeType.ZMW;
			case ZWL -> CurrCodeType.ZWL;
		};
	}
}
