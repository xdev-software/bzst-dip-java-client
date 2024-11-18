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
// CPD-OFF
package software.xdev.bzst.dip.client.xmldocument.model.cesop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CountryCode_Type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
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
 *     &lt;enumeration value="EL"/&gt;
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
 *     &lt;enumeration value="XX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CountryCode_Type", namespace = "urn:eu:taxud:isotypes:v1")
@XmlEnum
public enum CountryCodeType {


    /**
     * AFGHANISTAN
     * 
     */
    AF,

    /**
     * ALAND ISLANDS
     * 
     */
    AX,

    /**
     * ALBANIA
     * 
     */
    AL,

    /**
     * ALGERIA
     * 
     */
    DZ,

    /**
     * AMERICAN SAMOA
     * 
     */
    AS,

    /**
     * ANDORRA
     * 
     */
    AD,

    /**
     * ANGOLA
     * 
     */
    AO,

    /**
     * ANGUILLA
     * 
     */
    AI,

    /**
     * ANTARCTICA
     * 
     */
    AQ,

    /**
     * ANTIGUA AND BARBUDA
     * 
     */
    AG,

    /**
     * ARGENTINA
     * 
     */
    AR,

    /**
     * ARMENIA
     * 
     */
    AM,

    /**
     * ARUBA
     * 
     */
    AW,

    /**
     * AUSTRALIA
     * 
     */
    AU,

    /**
     * AUSTRIA
     * 
     */
    AT,

    /**
     * AZERBAIJAN
     * 
     */
    AZ,

    /**
     * BAHAMAS
     * 
     */
    BS,

    /**
     * BAHRAIN
     * 
     */
    BH,

    /**
     * BANGLADESH
     * 
     */
    BD,

    /**
     * BARBADOS
     * 
     */
    BB,

    /**
     * BELARUS
     * 
     */
    BY,

    /**
     * BELGIUM
     * 
     */
    BE,

    /**
     * BELIZE
     * 
     */
    BZ,

    /**
     * BENIN
     * 
     */
    BJ,

    /**
     * BERMUDA
     * 
     */
    BM,

    /**
     * BHUTAN
     * 
     */
    BT,

    /**
     * BOLIVIA, PLURINATIONAL STATE OF
     * 
     */
    BO,

    /**
     * BONAIRE, SINT EUSTATIUS AND SABA
     * 
     */
    BQ,

    /**
     * BOSNIA AND HERZEGOVINA
     * 
     */
    BA,

    /**
     * BOTSWANA
     * 
     */
    BW,

    /**
     * BOUVET ISLAND
     * 
     */
    BV,

    /**
     * BRAZIL
     * 
     */
    BR,

    /**
     * BRITISH INDIAN OCEAN TERRITORY
     * 
     */
    IO,

    /**
     * BRUNEI DARUSSALAM
     * 
     */
    BN,

    /**
     * BULGARIA
     * 
     */
    BG,

    /**
     * BURKINA FASO
     * 
     */
    BF,

    /**
     * BURUNDI
     * 
     */
    BI,

    /**
     * CAMBODIA
     * 
     */
    KH,

    /**
     * CAMEROON
     * 
     */
    CM,

    /**
     * CANADA
     * 
     */
    CA,

    /**
     * CABO VERDE
     * 
     */
    CV,

    /**
     * CAYMAN ISLANDS
     * 
     */
    KY,

    /**
     * CENTRAL AFRICAN REPUBLIC
     * 
     */
    CF,

    /**
     * CHAD
     * 
     */
    TD,

    /**
     * CHILE
     * 
     */
    CL,

    /**
     * CHINA
     * 
     */
    CN,

    /**
     * CHRISTMAS ISLAND
     * 
     */
    CX,

    /**
     * COCOS (KEELING) ISLANDS
     * 
     */
    CC,

    /**
     * COLOMBIA
     * 
     */
    CO,

    /**
     * COMOROS
     * 
     */
    KM,

    /**
     * CONGO
     * 
     */
    CG,

    /**
     * CONGO, THE DEMOCRATIC REPUBLIC OF THE
     * 
     */
    CD,

    /**
     * COOK ISLANDS
     * 
     */
    CK,

    /**
     * COSTA RICA
     * 
     */
    CR,

    /**
     * COTE D'IVOIRE
     * 
     */
    CI,

    /**
     * CROATIA
     * 
     */
    HR,

    /**
     * CUBA
     * 
     */
    CU,

    /**
     * CURACAO
     * 
     */
    CW,

    /**
     * CYPRUS
     * 
     */
    CY,

    /**
     * CZECHIA
     * 
     */
    CZ,

    /**
     * DENMARK
     * 
     */
    DK,

    /**
     * DJIBOUTI
     * 
     */
    DJ,

    /**
     * DOMINICA
     * 
     */
    DM,

    /**
     * DOMINICAN REPUBLIC
     * 
     */
    DO,

    /**
     * ECUADOR
     * 
     */
    EC,

    /**
     * EGYPT
     * 
     */
    EG,

    /**
     * EL SALVADOR
     * 
     */
    SV,

    /**
     * EQUATORIAL GUINEA
     * 
     */
    GQ,

    /**
     * ERITREA
     * 
     */
    ER,

    /**
     * ESTONIA
     * 
     */
    EE,

    /**
     * GREECE
     * 
     */
    EL,

    /**
     * ETHIOPIA
     * 
     */
    ET,

    /**
     * FALKLAND ISLANDS (MALVINAS)
     * 
     */
    FK,

    /**
     * FAROE ISLANDS
     * 
     */
    FO,

    /**
     * FIJI
     * 
     */
    FJ,

    /**
     * FINLAND
     * 
     */
    FI,

    /**
     * FRANCE
     * 
     */
    FR,

    /**
     * FRENCH GUIANA
     * 
     */
    GF,

    /**
     * FRENCH POLYNESIA
     * 
     */
    PF,

    /**
     * FRENCH SOUTHERN TERRITORIES
     * 
     */
    TF,

    /**
     * GABON
     * 
     */
    GA,

    /**
     * GAMBIA
     * 
     */
    GM,

    /**
     * GEORGIA
     * 
     */
    GE,

    /**
     * GERMANY
     * 
     */
    DE,

    /**
     * GHANA
     * 
     */
    GH,

    /**
     * GIBRALTAR
     * 
     */
    GI,

    /**
     * GREECE
     * 
     */
    GR,

    /**
     * GREENLAND
     * 
     */
    GL,

    /**
     * GRENADA
     * 
     */
    GD,

    /**
     * GUADELOUPE
     * 
     */
    GP,

    /**
     * GUAM
     * 
     */
    GU,

    /**
     * GUATEMALA
     * 
     */
    GT,

    /**
     * GUERNSEY
     * 
     */
    GG,

    /**
     * GUINEA
     * 
     */
    GN,

    /**
     * GUINEA-BISSAU
     * 
     */
    GW,

    /**
     * GUYANA
     * 
     */
    GY,

    /**
     * HAITI
     * 
     */
    HT,

    /**
     * HEARD ISLAND AND MCDONALD ISLANDS
     * 
     */
    HM,

    /**
     * HOLY SEE
     * 
     */
    VA,

    /**
     * HONDURAS
     * 
     */
    HN,

    /**
     * HONG KONG
     * 
     */
    HK,

    /**
     * HUNGARY
     * 
     */
    HU,

    /**
     * ICELAND
     * 
     */
    IS,

    /**
     * INDIA
     * 
     */
    IN,

    /**
     * INDONESIA
     * 
     */
    ID,

    /**
     * IRAN, ISLAMIC REPUBLIC OF
     * 
     */
    IR,

    /**
     * IRAQ
     * 
     */
    IQ,

    /**
     * IRELAND
     * 
     */
    IE,

    /**
     * ISLE OF MAN
     * 
     */
    IM,

    /**
     * ISRAEL
     * 
     */
    IL,

    /**
     * ITALY
     * 
     */
    IT,

    /**
     * JAMAICA
     * 
     */
    JM,

    /**
     * JAPAN
     * 
     */
    JP,

    /**
     * JERSEY
     * 
     */
    JE,

    /**
     * JORDAN
     * 
     */
    JO,

    /**
     * KAZAKHSTAN
     * 
     */
    KZ,

    /**
     * KENYA
     * 
     */
    KE,

    /**
     * KIRIBATI
     * 
     */
    KI,

    /**
     * KOREA, DEMOCRATIC PEOPLE'S REPUBLIC OF
     * 
     */
    KP,

    /**
     * KOREA, REPUBLIC OF
     * 
     */
    KR,

    /**
     * KUWAIT
     * 
     */
    KW,

    /**
     * KYRGYZSTAN
     * 
     */
    KG,

    /**
     * LAO PEOPLE'S DEMOCRATIC REPUBLIC
     * 
     */
    LA,

    /**
     * LATVIA
     * 
     */
    LV,

    /**
     * LEBANON
     * 
     */
    LB,

    /**
     * LESOTHO
     * 
     */
    LS,

    /**
     * LIBERIA
     * 
     */
    LR,

    /**
     * LIBYA
     * 
     */
    LY,

    /**
     * LIECHTENSTEIN
     * 
     */
    LI,

    /**
     * LITHUANIA
     * 
     */
    LT,

    /**
     * LUXEMBOURG
     * 
     */
    LU,

    /**
     * MACAO
     * 
     */
    MO,

    /**
     * MACEDONIA, THE FORMER YUGOSLAV REPUBLIC OF
     * 
     */
    MK,

    /**
     * MADAGASCAR
     * 
     */
    MG,

    /**
     * MALAWI
     * 
     */
    MW,

    /**
     * MALAYSIA
     * 
     */
    MY,

    /**
     * MALDIVES
     * 
     */
    MV,

    /**
     * MALI
     * 
     */
    ML,

    /**
     * MALTA
     * 
     */
    MT,

    /**
     * MARSHALL ISLANDS
     * 
     */
    MH,

    /**
     * MARTINIQUE
     * 
     */
    MQ,

    /**
     * MAURITANIA
     * 
     */
    MR,

    /**
     * MAURITIUS
     * 
     */
    MU,

    /**
     * MAYOTTE
     * 
     */
    YT,

    /**
     * MEXICO
     * 
     */
    MX,

    /**
     * MICRONESIA, FEDERATED STATES OF
     * 
     */
    FM,

    /**
     * MOLDOVA, REPUBLIC OF
     * 
     */
    MD,

    /**
     * MONACO
     * 
     */
    MC,

    /**
     * MONGOLIA
     * 
     */
    MN,

    /**
     * MONTENEGRO
     * 
     */
    ME,

    /**
     * MONTSERRAT
     * 
     */
    MS,

    /**
     * MOROCCO
     * 
     */
    MA,

    /**
     * MOZAMBIQUE
     * 
     */
    MZ,

    /**
     * MYANMAR
     * 
     */
    MM,

    /**
     * NAMIBIA
     * 
     */
    NA,

    /**
     * NAURU
     * 
     */
    NR,

    /**
     * NEPAL
     * 
     */
    NP,

    /**
     * NETHERLANDS
     * 
     */
    NL,

    /**
     * NEW CALEDONIA
     * 
     */
    NC,

    /**
     * NEW ZEALAND
     * 
     */
    NZ,

    /**
     * NICARAGUA
     * 
     */
    NI,

    /**
     * NIGER
     * 
     */
    NE,

    /**
     * NIGERIA
     * 
     */
    NG,

    /**
     * NIUE
     * 
     */
    NU,

    /**
     * NORFOLK ISLAND
     * 
     */
    NF,

    /**
     * NORTHERN MARIANA ISLANDS
     * 
     */
    MP,

    /**
     * NORWAY
     * 
     */
    NO,

    /**
     * OMAN
     * 
     */
    OM,

    /**
     * PAKISTAN
     * 
     */
    PK,

    /**
     * PALAU
     * 
     */
    PW,

    /**
     * PALESTINE, STATE OF
     * 
     */
    PS,

    /**
     * PANAMA
     * 
     */
    PA,

    /**
     * PAPUA NEW GUINEA
     * 
     */
    PG,

    /**
     * PARAGUAY
     * 
     */
    PY,

    /**
     * PERU
     * 
     */
    PE,

    /**
     * PHILIPPINES
     * 
     */
    PH,

    /**
     * PITCAIRN
     * 
     */
    PN,

    /**
     * POLAND
     * 
     */
    PL,

    /**
     * PORTUGAL
     * 
     */
    PT,

    /**
     * PUERTO RICO
     * 
     */
    PR,

    /**
     * QATAR
     * 
     */
    QA,

    /**
     * REUNION
     * 
     */
    RE,

    /**
     * ROMANIA
     * 
     */
    RO,

    /**
     * RUSSIAN FEDERATION
     * 
     */
    RU,

    /**
     * RWANDA
     * 
     */
    RW,

    /**
     * SAINT BARTHELEMY
     * 
     */
    BL,

    /**
     * SAINT HELENA, ASCENSION AND TRISTAN DA CUNHA
     * 
     */
    SH,

    /**
     * SAINT KITTS AND NEVIS
     * 
     */
    KN,

    /**
     * SAINT LUCIA
     * 
     */
    LC,

    /**
     * SAINT MARTIN (FRENCH PART)
     * 
     */
    MF,

    /**
     * SAINT PIERRE AND MIQUELON
     * 
     */
    PM,

    /**
     * SAINT VINCENT AND THE GRENADINES
     * 
     */
    VC,

    /**
     * SAMOA
     * 
     */
    WS,

    /**
     * SAN MARINO
     * 
     */
    SM,

    /**
     * SAO TOME AND PRINCIPE
     * 
     */
    ST,

    /**
     * SAUDI ARABIA
     * 
     */
    SA,

    /**
     * SENEGAL
     * 
     */
    SN,

    /**
     * SERBIA
     * 
     */
    RS,

    /**
     * SEYCHELLES
     * 
     */
    SC,

    /**
     * SIERRA LEONE
     * 
     */
    SL,

    /**
     * SINGAPORE
     * 
     */
    SG,

    /**
     * SINT MAARTEN (DUTCH PART)
     * 
     */
    SX,

    /**
     * SLOVAKIA
     * 
     */
    SK,

    /**
     * SLOVENIA
     * 
     */
    SI,

    /**
     * SOLOMON ISLANDS
     * 
     */
    SB,

    /**
     * SOMALIA
     * 
     */
    SO,

    /**
     * SOUTH AFRICA
     * 
     */
    ZA,

    /**
     * SOUTH GEORGIA AND THE SOUTH SANDWICH ISLANDS
     * 
     */
    GS,

    /**
     * SOUTH SUDAN
     * 
     */
    SS,

    /**
     * SPAIN
     * 
     */
    ES,

    /**
     * SRI LANKA
     * 
     */
    LK,

    /**
     * SUDAN
     * 
     */
    SD,

    /**
     * SURINAME
     * 
     */
    SR,

    /**
     * SVALBARD AND JAN MAYEN
     * 
     */
    SJ,

    /**
     * ESWATINI
     * 
     */
    SZ,

    /**
     * SWEDEN
     * 
     */
    SE,

    /**
     * SWITZERLAND
     * 
     */
    CH,

    /**
     * SYRIAN ARAB REPUBLIC
     * 
     */
    SY,

    /**
     * TAIWAN, PROVINCE OF CHINA
     * 
     */
    TW,

    /**
     * TAJIKISTAN
     * 
     */
    TJ,

    /**
     * TANZANIA, UNITED REPUBLIC OF
     * 
     */
    TZ,

    /**
     * THAILAND
     * 
     */
    TH,

    /**
     * TIMOR-LESTE
     * 
     */
    TL,

    /**
     * TOGO
     * 
     */
    TG,

    /**
     * TOKELAU
     * 
     */
    TK,

    /**
     * TONGA
     * 
     */
    TO,

    /**
     * TRINIDAD AND TOBAGO
     * 
     */
    TT,

    /**
     * TUNISIA
     * 
     */
    TN,

    /**
     * TURKEY
     * 
     */
    TR,

    /**
     * TURKMENISTAN
     * 
     */
    TM,

    /**
     * TURKS AND CAICOS ISLANDS
     * 
     */
    TC,

    /**
     * TUVALU
     * 
     */
    TV,

    /**
     * UGANDA
     * 
     */
    UG,

    /**
     * UKRAINE
     * 
     */
    UA,

    /**
     * UNITED ARAB EMIRATES
     * 
     */
    AE,

    /**
     * UNITED KINGDOM OF GREAT BRITAIN AND NORTHERN IRELAND
     * 
     */
    GB,

    /**
     * UNITED STATES
     * 
     */
    US,

    /**
     * UNITED STATES MINOR OUTLYING ISLANDS
     * 
     */
    UM,

    /**
     * URUGUAY
     * 
     */
    UY,

    /**
     * UZBEKISTAN
     * 
     */
    UZ,

    /**
     * VANUATU
     * 
     */
    VU,

    /**
     * VENEZUELA, BOLIVARIAN REPUBLIC OF
     * 
     */
    VE,

    /**
     * VIET NAM
     * 
     */
    VN,

    /**
     * VIRGIN ISLANDS, BRITISH
     * 
     */
    VG,

    /**
     * VIRGIN ISLANDS, U.S.
     * 
     */
    VI,

    /**
     * WALLIS AND FUTUNA
     * 
     */
    WF,

    /**
     * WESTERN SAHARA
     * 
     */
    EH,

    /**
     * YEMEN
     * 
     */
    YE,

    /**
     * ZAMBIA
     * 
     */
    ZM,

    /**
     * ZIMBABWE
     * 
     */
    ZW,

    /**
     * KOSOVO
     * 
     */
    XK,

    /**
     * OTHER COUNTRY
     * 
     */
    XX;

    public String value() {
        return this.name();
    }
    
    public static CountryCodeType fromValue(final String v)
    {
        return valueOf(v);
    }

}
