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
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountryCode_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CountryCode_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AF"/&gt;
 *     &lt;enumeration value="AX"/&gt;
 *     &lt;enumeration value="AL"/&gt;
 *     &lt;enumeration value="DZ"/&gt;
 *     &lt;enumeration value="AS"/&gt;
 *     &lt;enumeration value="AD"/&gt;
 *     &lt;enumeration value="AO"/&gt;
 *     &lt;enumeration value="AI"/&gt;
 *     &lt;enumeration value="AQ"/&gt;
 *     &lt;enumeration value="AG"/&gt;
 *     &lt;enumeration value="AR"/&gt;
 *     &lt;enumeration value="AM"/&gt;
 *     &lt;enumeration value="AW"/&gt;
 *     &lt;enumeration value="AU"/&gt;
 *     &lt;enumeration value="AT"/&gt;
 *     &lt;enumeration value="AZ"/&gt;
 *     &lt;enumeration value="BS"/&gt;
 *     &lt;enumeration value="BH"/&gt;
 *     &lt;enumeration value="BD"/&gt;
 *     &lt;enumeration value="BB"/&gt;
 *     &lt;enumeration value="BY"/&gt;
 *     &lt;enumeration value="BE"/&gt;
 *     &lt;enumeration value="BZ"/&gt;
 *     &lt;enumeration value="BJ"/&gt;
 *     &lt;enumeration value="BM"/&gt;
 *     &lt;enumeration value="BT"/&gt;
 *     &lt;enumeration value="BO"/&gt;
 *     &lt;enumeration value="BQ"/&gt;
 *     &lt;enumeration value="BA"/&gt;
 *     &lt;enumeration value="BW"/&gt;
 *     &lt;enumeration value="BV"/&gt;
 *     &lt;enumeration value="BR"/&gt;
 *     &lt;enumeration value="IO"/&gt;
 *     &lt;enumeration value="BN"/&gt;
 *     &lt;enumeration value="BG"/&gt;
 *     &lt;enumeration value="BF"/&gt;
 *     &lt;enumeration value="BI"/&gt;
 *     &lt;enumeration value="KH"/&gt;
 *     &lt;enumeration value="CM"/&gt;
 *     &lt;enumeration value="CA"/&gt;
 *     &lt;enumeration value="CV"/&gt;
 *     &lt;enumeration value="KY"/&gt;
 *     &lt;enumeration value="CF"/&gt;
 *     &lt;enumeration value="TD"/&gt;
 *     &lt;enumeration value="CL"/&gt;
 *     &lt;enumeration value="CN"/&gt;
 *     &lt;enumeration value="CX"/&gt;
 *     &lt;enumeration value="CC"/&gt;
 *     &lt;enumeration value="CO"/&gt;
 *     &lt;enumeration value="KM"/&gt;
 *     &lt;enumeration value="CG"/&gt;
 *     &lt;enumeration value="CD"/&gt;
 *     &lt;enumeration value="CK"/&gt;
 *     &lt;enumeration value="CR"/&gt;
 *     &lt;enumeration value="CI"/&gt;
 *     &lt;enumeration value="HR"/&gt;
 *     &lt;enumeration value="CU"/&gt;
 *     &lt;enumeration value="CW"/&gt;
 *     &lt;enumeration value="CY"/&gt;
 *     &lt;enumeration value="CZ"/&gt;
 *     &lt;enumeration value="DK"/&gt;
 *     &lt;enumeration value="DJ"/&gt;
 *     &lt;enumeration value="DM"/&gt;
 *     &lt;enumeration value="DO"/&gt;
 *     &lt;enumeration value="EC"/&gt;
 *     &lt;enumeration value="EG"/&gt;
 *     &lt;enumeration value="SV"/&gt;
 *     &lt;enumeration value="GQ"/&gt;
 *     &lt;enumeration value="ER"/&gt;
 *     &lt;enumeration value="EE"/&gt;
 *     &lt;enumeration value="ET"/&gt;
 *     &lt;enumeration value="FK"/&gt;
 *     &lt;enumeration value="FO"/&gt;
 *     &lt;enumeration value="FJ"/&gt;
 *     &lt;enumeration value="FI"/&gt;
 *     &lt;enumeration value="FR"/&gt;
 *     &lt;enumeration value="GF"/&gt;
 *     &lt;enumeration value="PF"/&gt;
 *     &lt;enumeration value="TF"/&gt;
 *     &lt;enumeration value="GA"/&gt;
 *     &lt;enumeration value="GM"/&gt;
 *     &lt;enumeration value="GE"/&gt;
 *     &lt;enumeration value="DE"/&gt;
 *     &lt;enumeration value="GH"/&gt;
 *     &lt;enumeration value="GI"/&gt;
 *     &lt;enumeration value="GR"/&gt;
 *     &lt;enumeration value="GL"/&gt;
 *     &lt;enumeration value="GD"/&gt;
 *     &lt;enumeration value="GP"/&gt;
 *     &lt;enumeration value="GU"/&gt;
 *     &lt;enumeration value="GT"/&gt;
 *     &lt;enumeration value="GG"/&gt;
 *     &lt;enumeration value="GN"/&gt;
 *     &lt;enumeration value="GW"/&gt;
 *     &lt;enumeration value="GY"/&gt;
 *     &lt;enumeration value="HT"/&gt;
 *     &lt;enumeration value="HM"/&gt;
 *     &lt;enumeration value="VA"/&gt;
 *     &lt;enumeration value="HN"/&gt;
 *     &lt;enumeration value="HK"/&gt;
 *     &lt;enumeration value="HU"/&gt;
 *     &lt;enumeration value="IS"/&gt;
 *     &lt;enumeration value="IN"/&gt;
 *     &lt;enumeration value="ID"/&gt;
 *     &lt;enumeration value="IR"/&gt;
 *     &lt;enumeration value="IQ"/&gt;
 *     &lt;enumeration value="IE"/&gt;
 *     &lt;enumeration value="IM"/&gt;
 *     &lt;enumeration value="IL"/&gt;
 *     &lt;enumeration value="IT"/&gt;
 *     &lt;enumeration value="JM"/&gt;
 *     &lt;enumeration value="JP"/&gt;
 *     &lt;enumeration value="JE"/&gt;
 *     &lt;enumeration value="JO"/&gt;
 *     &lt;enumeration value="KZ"/&gt;
 *     &lt;enumeration value="KE"/&gt;
 *     &lt;enumeration value="KI"/&gt;
 *     &lt;enumeration value="KP"/&gt;
 *     &lt;enumeration value="KR"/&gt;
 *     &lt;enumeration value="KW"/&gt;
 *     &lt;enumeration value="KG"/&gt;
 *     &lt;enumeration value="LA"/&gt;
 *     &lt;enumeration value="LV"/&gt;
 *     &lt;enumeration value="LB"/&gt;
 *     &lt;enumeration value="LS"/&gt;
 *     &lt;enumeration value="LR"/&gt;
 *     &lt;enumeration value="LY"/&gt;
 *     &lt;enumeration value="LI"/&gt;
 *     &lt;enumeration value="LT"/&gt;
 *     &lt;enumeration value="LU"/&gt;
 *     &lt;enumeration value="MO"/&gt;
 *     &lt;enumeration value="MK"/&gt;
 *     &lt;enumeration value="MG"/&gt;
 *     &lt;enumeration value="MW"/&gt;
 *     &lt;enumeration value="MY"/&gt;
 *     &lt;enumeration value="MV"/&gt;
 *     &lt;enumeration value="ML"/&gt;
 *     &lt;enumeration value="MT"/&gt;
 *     &lt;enumeration value="MH"/&gt;
 *     &lt;enumeration value="MQ"/&gt;
 *     &lt;enumeration value="MR"/&gt;
 *     &lt;enumeration value="MU"/&gt;
 *     &lt;enumeration value="YT"/&gt;
 *     &lt;enumeration value="MX"/&gt;
 *     &lt;enumeration value="FM"/&gt;
 *     &lt;enumeration value="MD"/&gt;
 *     &lt;enumeration value="MC"/&gt;
 *     &lt;enumeration value="MN"/&gt;
 *     &lt;enumeration value="ME"/&gt;
 *     &lt;enumeration value="MS"/&gt;
 *     &lt;enumeration value="MA"/&gt;
 *     &lt;enumeration value="MZ"/&gt;
 *     &lt;enumeration value="MM"/&gt;
 *     &lt;enumeration value="NA"/&gt;
 *     &lt;enumeration value="NR"/&gt;
 *     &lt;enumeration value="NP"/&gt;
 *     &lt;enumeration value="NL"/&gt;
 *     &lt;enumeration value="NC"/&gt;
 *     &lt;enumeration value="NZ"/&gt;
 *     &lt;enumeration value="NI"/&gt;
 *     &lt;enumeration value="NE"/&gt;
 *     &lt;enumeration value="NG"/&gt;
 *     &lt;enumeration value="NU"/&gt;
 *     &lt;enumeration value="NF"/&gt;
 *     &lt;enumeration value="MP"/&gt;
 *     &lt;enumeration value="NO"/&gt;
 *     &lt;enumeration value="OM"/&gt;
 *     &lt;enumeration value="PK"/&gt;
 *     &lt;enumeration value="PW"/&gt;
 *     &lt;enumeration value="PS"/&gt;
 *     &lt;enumeration value="PA"/&gt;
 *     &lt;enumeration value="PG"/&gt;
 *     &lt;enumeration value="PY"/&gt;
 *     &lt;enumeration value="PE"/&gt;
 *     &lt;enumeration value="PH"/&gt;
 *     &lt;enumeration value="PN"/&gt;
 *     &lt;enumeration value="PL"/&gt;
 *     &lt;enumeration value="PT"/&gt;
 *     &lt;enumeration value="PR"/&gt;
 *     &lt;enumeration value="QA"/&gt;
 *     &lt;enumeration value="RE"/&gt;
 *     &lt;enumeration value="RO"/&gt;
 *     &lt;enumeration value="RU"/&gt;
 *     &lt;enumeration value="RW"/&gt;
 *     &lt;enumeration value="BL"/&gt;
 *     &lt;enumeration value="SH"/&gt;
 *     &lt;enumeration value="KN"/&gt;
 *     &lt;enumeration value="LC"/&gt;
 *     &lt;enumeration value="MF"/&gt;
 *     &lt;enumeration value="PM"/&gt;
 *     &lt;enumeration value="VC"/&gt;
 *     &lt;enumeration value="WS"/&gt;
 *     &lt;enumeration value="SM"/&gt;
 *     &lt;enumeration value="ST"/&gt;
 *     &lt;enumeration value="SA"/&gt;
 *     &lt;enumeration value="SN"/&gt;
 *     &lt;enumeration value="RS"/&gt;
 *     &lt;enumeration value="SC"/&gt;
 *     &lt;enumeration value="SL"/&gt;
 *     &lt;enumeration value="SG"/&gt;
 *     &lt;enumeration value="SX"/&gt;
 *     &lt;enumeration value="SK"/&gt;
 *     &lt;enumeration value="SI"/&gt;
 *     &lt;enumeration value="SB"/&gt;
 *     &lt;enumeration value="SO"/&gt;
 *     &lt;enumeration value="ZA"/&gt;
 *     &lt;enumeration value="GS"/&gt;
 *     &lt;enumeration value="SS"/&gt;
 *     &lt;enumeration value="ES"/&gt;
 *     &lt;enumeration value="LK"/&gt;
 *     &lt;enumeration value="SD"/&gt;
 *     &lt;enumeration value="SR"/&gt;
 *     &lt;enumeration value="SJ"/&gt;
 *     &lt;enumeration value="SZ"/&gt;
 *     &lt;enumeration value="SE"/&gt;
 *     &lt;enumeration value="CH"/&gt;
 *     &lt;enumeration value="SY"/&gt;
 *     &lt;enumeration value="TW"/&gt;
 *     &lt;enumeration value="TJ"/&gt;
 *     &lt;enumeration value="TZ"/&gt;
 *     &lt;enumeration value="TH"/&gt;
 *     &lt;enumeration value="TL"/&gt;
 *     &lt;enumeration value="TG"/&gt;
 *     &lt;enumeration value="TK"/&gt;
 *     &lt;enumeration value="TO"/&gt;
 *     &lt;enumeration value="TT"/&gt;
 *     &lt;enumeration value="TN"/&gt;
 *     &lt;enumeration value="TR"/&gt;
 *     &lt;enumeration value="TM"/&gt;
 *     &lt;enumeration value="TC"/&gt;
 *     &lt;enumeration value="TV"/&gt;
 *     &lt;enumeration value="UG"/&gt;
 *     &lt;enumeration value="UA"/&gt;
 *     &lt;enumeration value="AE"/&gt;
 *     &lt;enumeration value="GB"/&gt;
 *     &lt;enumeration value="US"/&gt;
 *     &lt;enumeration value="UM"/&gt;
 *     &lt;enumeration value="UY"/&gt;
 *     &lt;enumeration value="UZ"/&gt;
 *     &lt;enumeration value="VU"/&gt;
 *     &lt;enumeration value="VE"/&gt;
 *     &lt;enumeration value="VN"/&gt;
 *     &lt;enumeration value="VG"/&gt;
 *     &lt;enumeration value="VI"/&gt;
 *     &lt;enumeration value="WF"/&gt;
 *     &lt;enumeration value="EH"/&gt;
 *     &lt;enumeration value="YE"/&gt;
 *     &lt;enumeration value="ZM"/&gt;
 *     &lt;enumeration value="ZW"/&gt;
 *     &lt;enumeration value="XK"/&gt;
 *     &lt;enumeration value="X5"/&gt;
 *     &lt;enumeration value="XX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CountryCode_Type", namespace = "urn:oecd:ties:isodpitypes:v1")
@XmlEnum
public enum CountryCodeType {


    /**
     * AFGHANISTAN
     * 
     */
    AF("AF"),

    /**
     * ALAND ISLANDS
     * 
     */
    AX("AX"),

    /**
     * ALBANIA
     * 
     */
    AL("AL"),

    /**
     * ALGERIA
     * 
     */
    DZ("DZ"),

    /**
     * AMERICAN SAMOA
     * 
     */
    AS("AS"),

    /**
     * ANDORRA
     * 
     */
    AD("AD"),

    /**
     * ANGOLA
     * 
     */
    AO("AO"),

    /**
     * ANGUILLA
     * 
     */
    AI("AI"),

    /**
     * ANTARCTICA
     * 
     */
    AQ("AQ"),

    /**
     * ANTIGUA AND BARBUDA
     * 
     */
    AG("AG"),

    /**
     * ARGENTINA
     * 
     */
    AR("AR"),

    /**
     * ARMENIA
     * 
     */
    AM("AM"),

    /**
     * ARUBA
     * 
     */
    AW("AW"),

    /**
     * AUSTRALIA
     * 
     */
    AU("AU"),

    /**
     * AUSTRIA
     * 
     */
    AT("AT"),

    /**
     * AZERBAIJAN
     * 
     */
    AZ("AZ"),

    /**
     * BAHAMAS
     * 
     */
    BS("BS"),

    /**
     * BAHRAIN
     * 
     */
    BH("BH"),

    /**
     * BANGLADESH
     * 
     */
    BD("BD"),

    /**
     * BARBADOS
     * 
     */
    BB("BB"),

    /**
     * BELARUS
     * 
     */
    BY("BY"),

    /**
     * BELGIUM
     * 
     */
    BE("BE"),

    /**
     * BELIZE
     * 
     */
    BZ("BZ"),

    /**
     * BENIN
     * 
     */
    BJ("BJ"),

    /**
     * BERMUDA
     * 
     */
    BM("BM"),

    /**
     * BHUTAN
     * 
     */
    BT("BT"),

    /**
     * BOLIVIA, PLURINATIONAL STATE OF
     * 
     */
    BO("BO"),

    /**
     * BONAIRE, SINT EUSTATIUS AND SABA
     * 
     */
    BQ("BQ"),

    /**
     * BOSNIA AND HERZEGOVINA
     * 
     */
    BA("BA"),

    /**
     * BOTSWANA
     * 
     */
    BW("BW"),

    /**
     * BOUVET ISLAND
     * 
     */
    BV("BV"),

    /**
     * BRAZIL
     * 
     */
    BR("BR"),

    /**
     * BRITISH INDIAN OCEAN TERRITORY
     * 
     */
    IO("IO"),

    /**
     * BRUNEI DARUSSALAM
     * 
     */
    BN("BN"),

    /**
     * BULGARIA
     * 
     */
    BG("BG"),

    /**
     * BURKINA FASO
     * 
     */
    BF("BF"),

    /**
     * BURUNDI
     * 
     */
    BI("BI"),

    /**
     * CAMBODIA
     * 
     */
    KH("KH"),

    /**
     * CAMEROON
     * 
     */
    CM("CM"),

    /**
     * CANADA
     * 
     */
    CA("CA"),

    /**
     * CABO VERDE
     * 
     */
    CV("CV"),

    /**
     * CAYMAN ISLANDS
     * 
     */
    KY("KY"),

    /**
     * CENTRAL AFRICAN REPUBLIC
     * 
     */
    CF("CF"),

    /**
     * CHAD
     * 
     */
    TD("TD"),

    /**
     * CHILE
     * 
     */
    CL("CL"),

    /**
     * CHINA
     * 
     */
    CN("CN"),

    /**
     * CHRISTMAS ISLAND
     * 
     */
    CX("CX"),

    /**
     * COCOS (KEELING) ISLANDS
     * 
     */
    CC("CC"),

    /**
     * COLOMBIA
     * 
     */
    CO("CO"),

    /**
     * COMOROS
     * 
     */
    KM("KM"),

    /**
     * CONGO
     * 
     */
    CG("CG"),

    /**
     * CONGO, THE DEMOCRATIC REPUBLIC OF THE
     * 
     */
    CD("CD"),

    /**
     * COOK ISLANDS
     * 
     */
    CK("CK"),

    /**
     * COSTA RICA
     * 
     */
    CR("CR"),

    /**
     * COTE D'IVOIRE
     * 
     */
    CI("CI"),

    /**
     * CROATIA
     * 
     */
    HR("HR"),

    /**
     * CUBA
     * 
     */
    CU("CU"),

    /**
     * CURACAO
     * 
     */
    CW("CW"),

    /**
     * CYPRUS
     * 
     */
    CY("CY"),

    /**
     * CZECHIA
     * 
     */
    CZ("CZ"),

    /**
     * DENMARK
     * 
     */
    DK("DK"),

    /**
     * DJIBOUTI
     * 
     */
    DJ("DJ"),

    /**
     * DOMINICA
     * 
     */
    DM("DM"),

    /**
     * DOMINICAN REPUBLIC
     * 
     */
    DO("DO"),

    /**
     * ECUADOR
     * 
     */
    EC("EC"),

    /**
     * EGYPT
     * 
     */
    EG("EG"),

    /**
     * EL SALVADOR
     * 
     */
    SV("SV"),

    /**
     * EQUATORIAL GUINEA
     * 
     */
    GQ("GQ"),

    /**
     * ERITREA
     * 
     */
    ER("ER"),

    /**
     * ESTONIA
     * 
     */
    EE("EE"),

    /**
     * ETHIOPIA
     * 
     */
    ET("ET"),

    /**
     * FALKLAND ISLANDS (MALVINAS)
     * 
     */
    FK("FK"),

    /**
     * FAROE ISLANDS
     * 
     */
    FO("FO"),

    /**
     * FIJI
     * 
     */
    FJ("FJ"),

    /**
     * FINLAND
     * 
     */
    FI("FI"),

    /**
     * FRANCE
     * 
     */
    FR("FR"),

    /**
     * FRENCH GUIANA
     * 
     */
    GF("GF"),

    /**
     * FRENCH POLYNESIA
     * 
     */
    PF("PF"),

    /**
     * FRENCH SOUTHERN TERRITORIES
     * 
     */
    TF("TF"),

    /**
     * GABON
     * 
     */
    GA("GA"),

    /**
     * GAMBIA
     * 
     */
    GM("GM"),

    /**
     * GEORGIA
     * 
     */
    GE("GE"),

    /**
     * GERMANY
     * 
     */
    DE("DE"),

    /**
     * GHANA
     * 
     */
    GH("GH"),

    /**
     * GIBRALTAR
     * 
     */
    GI("GI"),

    /**
     * GREECE
     * 
     */
    GR("GR"),

    /**
     * GREENLAND
     * 
     */
    GL("GL"),

    /**
     * GRENADA
     * 
     */
    GD("GD"),

    /**
     * GUADELOUPE
     * 
     */
    GP("GP"),

    /**
     * GUAM
     * 
     */
    GU("GU"),

    /**
     * GUATEMALA
     * 
     */
    GT("GT"),

    /**
     * GUERNSEY
     * 
     */
    GG("GG"),

    /**
     * GUINEA
     * 
     */
    GN("GN"),

    /**
     * GUINEA-BISSAU
     * 
     */
    GW("GW"),

    /**
     * GUYANA
     * 
     */
    GY("GY"),

    /**
     * HAITI
     * 
     */
    HT("HT"),

    /**
     * HEARD ISLAND AND MCDONALD ISLANDS
     * 
     */
    HM("HM"),

    /**
     * HOLY SEE (VATICAN CITY STATE)
     * 
     */
    VA("VA"),

    /**
     * HONDURAS
     * 
     */
    HN("HN"),

    /**
     * HONG KONG
     * 
     */
    HK("HK"),

    /**
     * HUNGARY
     * 
     */
    HU("HU"),

    /**
     * ICELAND
     * 
     */
    IS("IS"),

    /**
     * INDIA
     * 
     */
    IN("IN"),

    /**
     * INDONESIA
     * 
     */
    ID("ID"),

    /**
     * IRAN, ISLAMIC REPUBLIC OF
     * 
     */
    IR("IR"),

    /**
     * IRAQ
     * 
     */
    IQ("IQ"),

    /**
     * IRELAND
     * 
     */
    IE("IE"),

    /**
     * ISLE OF MAN
     * 
     */
    IM("IM"),

    /**
     * ISRAEL
     * 
     */
    IL("IL"),

    /**
     * ITALY
     * 
     */
    IT("IT"),

    /**
     * JAMAICA
     * 
     */
    JM("JM"),

    /**
     * JAPAN
     * 
     */
    JP("JP"),

    /**
     * JERSEY
     * 
     */
    JE("JE"),

    /**
     * JORDAN
     * 
     */
    JO("JO"),

    /**
     * KAZAKHSTAN
     * 
     */
    KZ("KZ"),

    /**
     * KENYA
     * 
     */
    KE("KE"),

    /**
     * KIRIBATI
     * 
     */
    KI("KI"),

    /**
     * KOREA, DEMOCRATIC PEOPLE'S REPUBLIC OF
     * 
     */
    KP("KP"),

    /**
     * KOREA, REPUBLIC OF
     * 
     */
    KR("KR"),

    /**
     * KUWAIT
     * 
     */
    KW("KW"),

    /**
     * KYRGYZSTAN
     * 
     */
    KG("KG"),

    /**
     * LAO PEOPLE'S DEMOCRATIC REPUBLIC
     * 
     */
    LA("LA"),

    /**
     * LATVIA
     * 
     */
    LV("LV"),

    /**
     * LEBANON
     * 
     */
    LB("LB"),

    /**
     * LESOTHO
     * 
     */
    LS("LS"),

    /**
     * LIBERIA
     * 
     */
    LR("LR"),

    /**
     * LIBYA
     * 
     */
    LY("LY"),

    /**
     * LIECHTENSTEIN
     * 
     */
    LI("LI"),

    /**
     * LITHUANIA
     * 
     */
    LT("LT"),

    /**
     * LUXEMBOURG
     * 
     */
    LU("LU"),

    /**
     * MACAO
     * 
     */
    MO("MO"),

    /**
     * NORTH MACEDONIA
     * 
     */
    MK("MK"),

    /**
     * MADAGASCAR
     * 
     */
    MG("MG"),

    /**
     * MALAWI
     * 
     */
    MW("MW"),

    /**
     * MALAYSIA
     * 
     */
    MY("MY"),

    /**
     * MALDIVES
     * 
     */
    MV("MV"),

    /**
     * MALI
     * 
     */
    ML("ML"),

    /**
     * MALTA
     * 
     */
    MT("MT"),

    /**
     * MARSHALL ISLANDS
     * 
     */
    MH("MH"),

    /**
     * MARTINIQUE
     * 
     */
    MQ("MQ"),

    /**
     * MAURITANIA
     * 
     */
    MR("MR"),

    /**
     * MAURITIUS
     * 
     */
    MU("MU"),

    /**
     * MAYOTTE
     * 
     */
    YT("YT"),

    /**
     * MEXICO
     * 
     */
    MX("MX"),

    /**
     * MICRONESIA, FEDERATED STATES OF
     * 
     */
    FM("FM"),

    /**
     * MOLDOVA, REPUBLIC OF
     * 
     */
    MD("MD"),

    /**
     * MONACO
     * 
     */
    MC("MC"),

    /**
     * MONGOLIA
     * 
     */
    MN("MN"),

    /**
     * MONTENEGRO
     * 
     */
    ME("ME"),

    /**
     * MONTSERRAT
     * 
     */
    MS("MS"),

    /**
     * MOROCCO
     * 
     */
    MA("MA"),

    /**
     * MOZAMBIQUE
     * 
     */
    MZ("MZ"),

    /**
     * MYANMAR
     * 
     */
    MM("MM"),

    /**
     * NAMIBIA
     * 
     */
    NA("NA"),

    /**
     * NAURU
     * 
     */
    NR("NR"),

    /**
     * NEPAL
     * 
     */
    NP("NP"),

    /**
     * NETHERLANDS
     * 
     */
    NL("NL"),

    /**
     * NEW CALEDONIA
     * 
     */
    NC("NC"),

    /**
     * NEW ZEALAND
     * 
     */
    NZ("NZ"),

    /**
     * NICARAGUA
     * 
     */
    NI("NI"),

    /**
     * NIGER
     * 
     */
    NE("NE"),

    /**
     * NIGERIA
     * 
     */
    NG("NG"),

    /**
     * NIUE
     * 
     */
    NU("NU"),

    /**
     * NORFOLK ISLAND
     * 
     */
    NF("NF"),

    /**
     * NORTHERN MARIANA ISLANDS
     * 
     */
    MP("MP"),

    /**
     * NORWAY
     * 
     */
    NO("NO"),

    /**
     * OMAN
     * 
     */
    OM("OM"),

    /**
     * PAKISTAN
     * 
     */
    PK("PK"),

    /**
     * PALAU
     * 
     */
    PW("PW"),

    /**
     * PALESTINE, STATE OF
     * 
     */
    PS("PS"),

    /**
     * PANAMA
     * 
     */
    PA("PA"),

    /**
     * PAPUA NEW GUINEA
     * 
     */
    PG("PG"),

    /**
     * PARAGUAY
     * 
     */
    PY("PY"),

    /**
     * PERU
     * 
     */
    PE("PE"),

    /**
     * PHILIPPINES
     * 
     */
    PH("PH"),

    /**
     * PITCAIRN
     * 
     */
    PN("PN"),

    /**
     * POLAND
     * 
     */
    PL("PL"),

    /**
     * PORTUGAL
     * 
     */
    PT("PT"),

    /**
     * PUERTO RICO
     * 
     */
    PR("PR"),

    /**
     * QATAR
     * 
     */
    QA("QA"),

    /**
     * REUNION
     * 
     */
    RE("RE"),

    /**
     * ROMANIA
     * 
     */
    RO("RO"),

    /**
     * RUSSIAN FEDERATION
     * 
     */
    RU("RU"),

    /**
     * RWANDA
     * 
     */
    RW("RW"),

    /**
     * SAINT BARTHELEMY
     * 
     */
    BL("BL"),

    /**
     * SAINT HELENA, ASCENSION AND TRISTAN DA CUNHA
     * 
     */
    SH("SH"),

    /**
     * SAINT KITTS AND NEVIS
     * 
     */
    KN("KN"),

    /**
     * SAINT LUCIA
     * 
     */
    LC("LC"),

    /**
     * SAINT MARTIN (FRENCH PART)
     * 
     */
    MF("MF"),

    /**
     * SAINT PIERRE AND MIQUELON
     * 
     */
    PM("PM"),

    /**
     * SAINT VINCENT AND THE GRENADINES
     * 
     */
    VC("VC"),

    /**
     * SAMOA
     * 
     */
    WS("WS"),

    /**
     * SAN MARINO
     * 
     */
    SM("SM"),

    /**
     * SAO TOME AND PRINCIPE
     * 
     */
    ST("ST"),

    /**
     * SAUDI ARABIA
     * 
     */
    SA("SA"),

    /**
     * SENEGAL
     * 
     */
    SN("SN"),

    /**
     * SERBIA
     * 
     */
    RS("RS"),

    /**
     * SEYCHELLES
     * 
     */
    SC("SC"),

    /**
     * SIERRA LEONE
     * 
     */
    SL("SL"),

    /**
     * SINGAPORE
     * 
     */
    SG("SG"),

    /**
     * SINT MAARTEN (DUTCH PART)
     * 
     */
    SX("SX"),

    /**
     * SLOVAKIA
     * 
     */
    SK("SK"),

    /**
     * SLOVENIA
     * 
     */
    SI("SI"),

    /**
     * SOLOMON ISLANDS
     * 
     */
    SB("SB"),

    /**
     * SOMALIA
     * 
     */
    SO("SO"),

    /**
     * SOUTH AFRICA
     * 
     */
    ZA("ZA"),

    /**
     * SOUTH GEORGIA AND THE SOUTH SANDWICH ISLANDS
     * 
     */
    GS("GS"),

    /**
     * SOUTH SUDAN
     * 
     */
    SS("SS"),

    /**
     * SPAIN
     * 
     */
    ES("ES"),

    /**
     * SRI LANKA
     * 
     */
    LK("LK"),

    /**
     * SUDAN
     * 
     */
    SD("SD"),

    /**
     * SURINAME
     * 
     */
    SR("SR"),

    /**
     * SVALBARD AND JAN MAYEN
     * 
     */
    SJ("SJ"),

    /**
     * ESWATINI
     * 
     */
    SZ("SZ"),

    /**
     * SWEDEN
     * 
     */
    SE("SE"),

    /**
     * SWITZERLAND
     * 
     */
    CH("CH"),

    /**
     * SYRIAN ARAB REPUBLIC
     * 
     */
    SY("SY"),

    /**
     * TAIWAN, PROVINCE OF CHINA
     * 
     */
    TW("TW"),

    /**
     * TAJIKISTAN
     * 
     */
    TJ("TJ"),

    /**
     * TANZANIA, UNITED REPUBLIC OF
     * 
     */
    TZ("TZ"),

    /**
     * THAILAND
     * 
     */
    TH("TH"),

    /**
     * TIMOR-LESTE
     * 
     */
    TL("TL"),

    /**
     * TOGO
     * 
     */
    TG("TG"),

    /**
     * TOKELAU
     * 
     */
    TK("TK"),

    /**
     * TONGA
     * 
     */
    TO("TO"),

    /**
     * TRINIDAD AND TOBAGO
     * 
     */
    TT("TT"),

    /**
     * TUNISIA
     * 
     */
    TN("TN"),

    /**
     * TURKEY
     * 
     */
    TR("TR"),

    /**
     * TURKMENISTAN
     * 
     */
    TM("TM"),

    /**
     * TURKS AND CAICOS ISLANDS
     * 
     */
    TC("TC"),

    /**
     * TUVALU
     * 
     */
    TV("TV"),

    /**
     * UGANDA
     * 
     */
    UG("UG"),

    /**
     * UKRAINE
     * 
     */
    UA("UA"),

    /**
     * UNITED ARAB EMIRATES
     * 
     */
    AE("AE"),

    /**
     * UNITED KINGDOM OF GREAT BRITAIN AND NORTHERN IRELAND
     * 
     */
    GB("GB"),

    /**
     * UNITED STATES
     * 
     */
    US("US"),

    /**
     * UNITED STATES MINOR OUTLYING ISLANDS
     * 
     */
    UM("UM"),

    /**
     * URUGUAY
     * 
     */
    UY("UY"),

    /**
     * UZBEKISTAN
     * 
     */
    UZ("UZ"),

    /**
     * VANUATU
     * 
     */
    VU("VU"),

    /**
     * VENEZUELA, BOLIVARIAN REPUBLIC OF
     * 
     */
    VE("VE"),

    /**
     * VIET NAM
     * 
     */
    VN("VN"),

    /**
     * VIRGIN ISLANDS, BRITISH
     * 
     */
    VG("VG"),

    /**
     * VIRGIN ISLANDS, U.S.
     * 
     */
    VI("VI"),

    /**
     * WALLIS AND FUTUNA
     * 
     */
    WF("WF"),

    /**
     * WESTERN SAHARA
     * 
     */
    EH("EH"),

    /**
     * YEMEN
     * 
     */
    YE("YE"),

    /**
     * ZAMBIA
     * 
     */
    ZM("ZM"),

    /**
     * ZIMBABWE
     * 
     */
    ZW("ZW"),

    /**
     * KOSOVO
     * 
     */
    XK("XK"),

    /**
     * STATELESS
     * 
     */
    @XmlEnumValue("X5")
    X_5("X5"),

    /**
     * OTHER COUNTRY
     * 
     */
    XX("XX");
    private final String value;

    CountryCodeType(final String v) {
		this.value = v;
    }

    public String value() {
        return this.value;
    }

    public static CountryCodeType fromValue(final String v) {
        for (final CountryCodeType c: CountryCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
