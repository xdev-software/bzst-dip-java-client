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

package software.xdev.bzst.dip.client.xmldocument.model.cesop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LanguageCode_Type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="LanguageCode_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AA"/&gt;
 *     &lt;enumeration value="AB"/&gt;
 *     &lt;enumeration value="AF"/&gt;
 *     &lt;enumeration value="AK"/&gt;
 *     &lt;enumeration value="SQ"/&gt;
 *     &lt;enumeration value="AM"/&gt;
 *     &lt;enumeration value="AR"/&gt;
 *     &lt;enumeration value="AN"/&gt;
 *     &lt;enumeration value="HY"/&gt;
 *     &lt;enumeration value="AS"/&gt;
 *     &lt;enumeration value="AV"/&gt;
 *     &lt;enumeration value="AE"/&gt;
 *     &lt;enumeration value="AY"/&gt;
 *     &lt;enumeration value="AZ"/&gt;
 *     &lt;enumeration value="BA"/&gt;
 *     &lt;enumeration value="BM"/&gt;
 *     &lt;enumeration value="EU"/&gt;
 *     &lt;enumeration value="BE"/&gt;
 *     &lt;enumeration value="BN"/&gt;
 *     &lt;enumeration value="BH"/&gt;
 *     &lt;enumeration value="BI"/&gt;
 *     &lt;enumeration value="BS"/&gt;
 *     &lt;enumeration value="BR"/&gt;
 *     &lt;enumeration value="BG"/&gt;
 *     &lt;enumeration value="MY"/&gt;
 *     &lt;enumeration value="CA"/&gt;
 *     &lt;enumeration value="CH"/&gt;
 *     &lt;enumeration value="CE"/&gt;
 *     &lt;enumeration value="ZH"/&gt;
 *     &lt;enumeration value="CU"/&gt;
 *     &lt;enumeration value="CV"/&gt;
 *     &lt;enumeration value="KW"/&gt;
 *     &lt;enumeration value="CO"/&gt;
 *     &lt;enumeration value="CR"/&gt;
 *     &lt;enumeration value="CS"/&gt;
 *     &lt;enumeration value="DA"/&gt;
 *     &lt;enumeration value="DV"/&gt;
 *     &lt;enumeration value="NL"/&gt;
 *     &lt;enumeration value="DZ"/&gt;
 *     &lt;enumeration value="EN"/&gt;
 *     &lt;enumeration value="EO"/&gt;
 *     &lt;enumeration value="ET"/&gt;
 *     &lt;enumeration value="EE"/&gt;
 *     &lt;enumeration value="FO"/&gt;
 *     &lt;enumeration value="FJ"/&gt;
 *     &lt;enumeration value="FI"/&gt;
 *     &lt;enumeration value="FR"/&gt;
 *     &lt;enumeration value="FY"/&gt;
 *     &lt;enumeration value="FF"/&gt;
 *     &lt;enumeration value="KA"/&gt;
 *     &lt;enumeration value="DE"/&gt;
 *     &lt;enumeration value="GD"/&gt;
 *     &lt;enumeration value="GA"/&gt;
 *     &lt;enumeration value="GL"/&gt;
 *     &lt;enumeration value="GV"/&gt;
 *     &lt;enumeration value="EL"/&gt;
 *     &lt;enumeration value="GN"/&gt;
 *     &lt;enumeration value="GU"/&gt;
 *     &lt;enumeration value="HT"/&gt;
 *     &lt;enumeration value="HA"/&gt;
 *     &lt;enumeration value="HE"/&gt;
 *     &lt;enumeration value="HZ"/&gt;
 *     &lt;enumeration value="HI"/&gt;
 *     &lt;enumeration value="HO"/&gt;
 *     &lt;enumeration value="HR"/&gt;
 *     &lt;enumeration value="HU"/&gt;
 *     &lt;enumeration value="IG"/&gt;
 *     &lt;enumeration value="IS"/&gt;
 *     &lt;enumeration value="IO"/&gt;
 *     &lt;enumeration value="II"/&gt;
 *     &lt;enumeration value="IU"/&gt;
 *     &lt;enumeration value="IE"/&gt;
 *     &lt;enumeration value="IA"/&gt;
 *     &lt;enumeration value="ID"/&gt;
 *     &lt;enumeration value="IK"/&gt;
 *     &lt;enumeration value="IT"/&gt;
 *     &lt;enumeration value="JV"/&gt;
 *     &lt;enumeration value="JA"/&gt;
 *     &lt;enumeration value="KL"/&gt;
 *     &lt;enumeration value="KN"/&gt;
 *     &lt;enumeration value="KS"/&gt;
 *     &lt;enumeration value="KR"/&gt;
 *     &lt;enumeration value="KK"/&gt;
 *     &lt;enumeration value="KM"/&gt;
 *     &lt;enumeration value="KI"/&gt;
 *     &lt;enumeration value="RW"/&gt;
 *     &lt;enumeration value="KY"/&gt;
 *     &lt;enumeration value="KV"/&gt;
 *     &lt;enumeration value="KG"/&gt;
 *     &lt;enumeration value="KO"/&gt;
 *     &lt;enumeration value="KJ"/&gt;
 *     &lt;enumeration value="KU"/&gt;
 *     &lt;enumeration value="LO"/&gt;
 *     &lt;enumeration value="LA"/&gt;
 *     &lt;enumeration value="LV"/&gt;
 *     &lt;enumeration value="LI"/&gt;
 *     &lt;enumeration value="LN"/&gt;
 *     &lt;enumeration value="LT"/&gt;
 *     &lt;enumeration value="LB"/&gt;
 *     &lt;enumeration value="LU"/&gt;
 *     &lt;enumeration value="LG"/&gt;
 *     &lt;enumeration value="MK"/&gt;
 *     &lt;enumeration value="MH"/&gt;
 *     &lt;enumeration value="ML"/&gt;
 *     &lt;enumeration value="MI"/&gt;
 *     &lt;enumeration value="MR"/&gt;
 *     &lt;enumeration value="MS"/&gt;
 *     &lt;enumeration value="MG"/&gt;
 *     &lt;enumeration value="MT"/&gt;
 *     &lt;enumeration value="MN"/&gt;
 *     &lt;enumeration value="NA"/&gt;
 *     &lt;enumeration value="NV"/&gt;
 *     &lt;enumeration value="NR"/&gt;
 *     &lt;enumeration value="ND"/&gt;
 *     &lt;enumeration value="NG"/&gt;
 *     &lt;enumeration value="NE"/&gt;
 *     &lt;enumeration value="NN"/&gt;
 *     &lt;enumeration value="NB"/&gt;
 *     &lt;enumeration value="NO"/&gt;
 *     &lt;enumeration value="NY"/&gt;
 *     &lt;enumeration value="OC"/&gt;
 *     &lt;enumeration value="OJ"/&gt;
 *     &lt;enumeration value="OR"/&gt;
 *     &lt;enumeration value="OM"/&gt;
 *     &lt;enumeration value="OS"/&gt;
 *     &lt;enumeration value="PA"/&gt;
 *     &lt;enumeration value="FA"/&gt;
 *     &lt;enumeration value="PI"/&gt;
 *     &lt;enumeration value="PL"/&gt;
 *     &lt;enumeration value="PT"/&gt;
 *     &lt;enumeration value="PS"/&gt;
 *     &lt;enumeration value="QU"/&gt;
 *     &lt;enumeration value="RM"/&gt;
 *     &lt;enumeration value="RO"/&gt;
 *     &lt;enumeration value="RN"/&gt;
 *     &lt;enumeration value="RU"/&gt;
 *     &lt;enumeration value="SG"/&gt;
 *     &lt;enumeration value="SA"/&gt;
 *     &lt;enumeration value="SI"/&gt;
 *     &lt;enumeration value="SK"/&gt;
 *     &lt;enumeration value="SL"/&gt;
 *     &lt;enumeration value="SE"/&gt;
 *     &lt;enumeration value="SM"/&gt;
 *     &lt;enumeration value="SN"/&gt;
 *     &lt;enumeration value="SD"/&gt;
 *     &lt;enumeration value="SO"/&gt;
 *     &lt;enumeration value="ST"/&gt;
 *     &lt;enumeration value="ES"/&gt;
 *     &lt;enumeration value="SC"/&gt;
 *     &lt;enumeration value="SR"/&gt;
 *     &lt;enumeration value="SS"/&gt;
 *     &lt;enumeration value="SU"/&gt;
 *     &lt;enumeration value="SW"/&gt;
 *     &lt;enumeration value="SV"/&gt;
 *     &lt;enumeration value="TY"/&gt;
 *     &lt;enumeration value="TA"/&gt;
 *     &lt;enumeration value="TT"/&gt;
 *     &lt;enumeration value="TE"/&gt;
 *     &lt;enumeration value="TG"/&gt;
 *     &lt;enumeration value="TL"/&gt;
 *     &lt;enumeration value="TH"/&gt;
 *     &lt;enumeration value="BO"/&gt;
 *     &lt;enumeration value="TI"/&gt;
 *     &lt;enumeration value="TO"/&gt;
 *     &lt;enumeration value="TN"/&gt;
 *     &lt;enumeration value="TS"/&gt;
 *     &lt;enumeration value="TK"/&gt;
 *     &lt;enumeration value="TR"/&gt;
 *     &lt;enumeration value="TW"/&gt;
 *     &lt;enumeration value="UG"/&gt;
 *     &lt;enumeration value="UK"/&gt;
 *     &lt;enumeration value="UR"/&gt;
 *     &lt;enumeration value="UZ"/&gt;
 *     &lt;enumeration value="VE"/&gt;
 *     &lt;enumeration value="VI"/&gt;
 *     &lt;enumeration value="VO"/&gt;
 *     &lt;enumeration value="CY"/&gt;
 *     &lt;enumeration value="WA"/&gt;
 *     &lt;enumeration value="WO"/&gt;
 *     &lt;enumeration value="XH"/&gt;
 *     &lt;enumeration value="YI"/&gt;
 *     &lt;enumeration value="YO"/&gt;
 *     &lt;enumeration value="ZA"/&gt;
 *     &lt;enumeration value="ZU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LanguageCode_Type", namespace = "urn:eu:taxud:isotypes:v1")
@XmlEnum
public enum LanguageCodeType {


    /**
     * Afar
     * 
     */
    AA,

    /**
     * Abkhazian
     * 
     */
    AB,

    /**
     * Afrikaans
     * 
     */
    AF,

    /**
     * Akan
     * 
     */
    AK,

    /**
     * Albanian
     * 
     */
    SQ,

    /**
     * Amharic
     * 
     */
    AM,

    /**
     * Arabic
     * 
     */
    AR,

    /**
     * Aragonese
     * 
     */
    AN,

    /**
     * Armenian
     * 
     */
    HY,

    /**
     * Assamese
     * 
     */
    AS,

    /**
     * Avaric
     * 
     */
    AV,

    /**
     * Avestan
     * 
     */
    AE,

    /**
     * Aymara
     * 
     */
    AY,

    /**
     * Azerbaijani
     * 
     */
    AZ,

    /**
     * Bashkir
     * 
     */
    BA,

    /**
     * Bambara
     * 
     */
    BM,

    /**
     * Basque
     * 
     */
    EU,

    /**
     * Belarusian
     * 
     */
    BE,

    /**
     * Bengali
     * 
     */
    BN,

    /**
     * Bihari languages
     * 
     */
    BH,

    /**
     * Bislama
     * 
     */
    BI,

    /**
     * Bosnian
     * 
     */
    BS,

    /**
     * Breton
     * 
     */
    BR,

    /**
     * Bulgarian
     * 
     */
    BG,

    /**
     * Burmese
     * 
     */
    MY,

    /**
     * Catalan; Valencian
     * 
     */
    CA,

    /**
     * Chamorro
     * 
     */
    CH,

    /**
     * Chechen
     * 
     */
    CE,

    /**
     * Chinese
     * 
     */
    ZH,

    /**
     * Church Slavic; Old Slavonic; Church Slavonic; Old Bulgarian; Old Church Slavonic
     * 
     */
    CU,

    /**
     * Chuvash
     * 
     */
    CV,

    /**
     * Cornish
     * 
     */
    KW,

    /**
     * Corsican
     * 
     */
    CO,

    /**
     * Cree
     * 
     */
    CR,

    /**
     * Czech
     * 
     */
    CS,

    /**
     * Danish
     * 
     */
    DA,

    /**
     * Divehi; Dhivehi; Maldivian
     * 
     */
    DV,

    /**
     * Dutch; Flemish
     * 
     */
    NL,

    /**
     * Dzongkha
     * 
     */
    DZ,

    /**
     * English
     * 
     */
    EN,

    /**
     * Esperanto
     * 
     */
    EO,

    /**
     * Estonian
     * 
     */
    ET,

    /**
     * Ewe
     * 
     */
    EE,

    /**
     * Faroese
     * 
     */
    FO,

    /**
     * Fijian
     * 
     */
    FJ,

    /**
     * Finnish
     * 
     */
    FI,

    /**
     * French
     * 
     */
    FR,

    /**
     * Western Frisian
     * 
     */
    FY,

    /**
     * Fulah
     * 
     */
    FF,

    /**
     * Georgian
     * 
     */
    KA,

    /**
     * German
     * 
     */
    DE,

    /**
     * Gaelic; Scottish Gaelic
     * 
     */
    GD,

    /**
     * Irish
     * 
     */
    GA,

    /**
     * Galician
     * 
     */
    GL,

    /**
     * Manx
     * 
     */
    GV,

    /**
     * Greek
     * 
     */
    EL,

    /**
     * Guarani
     * 
     */
    GN,

    /**
     * Gujarati
     * 
     */
    GU,

    /**
     * Haitian; Haitian Creole
     * 
     */
    HT,

    /**
     * Hausa
     * 
     */
    HA,

    /**
     * Hebrew
     * 
     */
    HE,

    /**
     * Herero
     * 
     */
    HZ,

    /**
     * Hindi
     * 
     */
    HI,

    /**
     * Hiri Motu
     * 
     */
    HO,

    /**
     * Croatian
     * 
     */
    HR,

    /**
     * Hungarian
     * 
     */
    HU,

    /**
     * Igbo
     * 
     */
    IG,

    /**
     * Icelandic
     * 
     */
    IS,

    /**
     * Ido
     * 
     */
    IO,

    /**
     * Sichuan Yi; Nuosu
     * 
     */
    II,

    /**
     * Inuktitut
     * 
     */
    IU,

    /**
     * Interlingue; Occidental
     * 
     */
    IE,

    /**
     * Interlingua (International Auxiliary Language Association)
     * 
     */
    IA,

    /**
     * Indonesian
     * 
     */
    ID,

    /**
     * Inupiaq
     * 
     */
    IK,

    /**
     * Italian
     * 
     */
    IT,

    /**
     * Javanese
     * 
     */
    JV,

    /**
     * Japanese
     * 
     */
    JA,

    /**
     * Kalaallisut; Greenlandic
     * 
     */
    KL,

    /**
     * Kannada
     * 
     */
    KN,

    /**
     * Kashmiri
     * 
     */
    KS,

    /**
     * Kanuri
     * 
     */
    KR,

    /**
     * Kazakh
     * 
     */
    KK,

    /**
     * Central Khmer
     * 
     */
    KM,

    /**
     * Kikuyu; Gikuyu
     * 
     */
    KI,

    /**
     * Kinyarwanda
     * 
     */
    RW,

    /**
     * Kirghiz; Kyrgyz
     * 
     */
    KY,

    /**
     * Komi
     * 
     */
    KV,

    /**
     * Kongo
     * 
     */
    KG,

    /**
     * Korean
     * 
     */
    KO,

    /**
     * Kuanyama; Kwanyama
     * 
     */
    KJ,

    /**
     * Kurdish
     * 
     */
    KU,

    /**
     * Lao
     * 
     */
    LO,

    /**
     * Latin
     * 
     */
    LA,

    /**
     * Latvian
     * 
     */
    LV,

    /**
     * Limburgan; Limburger; Limburgish
     * 
     */
    LI,

    /**
     * Lingala
     * 
     */
    LN,

    /**
     * Lithuanian
     * 
     */
    LT,

    /**
     * Luxembourgish; Letzeburgesch
     * 
     */
    LB,

    /**
     * Luba-Katanga
     * 
     */
    LU,

    /**
     * Ganda
     * 
     */
    LG,

    /**
     * Macedonian
     * 
     */
    MK,

    /**
     * Marshallese
     * 
     */
    MH,

    /**
     * Malayalam
     * 
     */
    ML,

    /**
     * Maori
     * 
     */
    MI,

    /**
     * Marathi
     * 
     */
    MR,

    /**
     * Malay
     * 
     */
    MS,

    /**
     * Malagasy
     * 
     */
    MG,

    /**
     * Maltese
     * 
     */
    MT,

    /**
     * Mongolian
     * 
     */
    MN,

    /**
     * Nauru
     * 
     */
    NA,

    /**
     * Navajo; Navaho
     * 
     */
    NV,

    /**
     * Ndebele, South; South Ndebele
     * 
     */
    NR,

    /**
     * Ndebele, North; North Ndebele
     * 
     */
    ND,

    /**
     * Ndonga
     * 
     */
    NG,

    /**
     * Nepali
     * 
     */
    NE,

    /**
     * Norwegian Nynorsk; Nynorsk, Norwegian
     * 
     */
    NN,

    /**
     * Bokmål, Norwegian; Norwegian Bokmål
     * 
     */
    NB,

    /**
     * Norwegian
     * 
     */
    NO,

    /**
     * Chichewa; Chewa; Nyanja
     * 
     */
    NY,

    /**
     * Occitan; Provençal
     * 
     */
    OC,

    /**
     * Ojibwa
     * 
     */
    OJ,

    /**
     * Oriya
     * 
     */
    OR,

    /**
     * Oromo
     * 
     */
    OM,

    /**
     * Ossetian; Ossetic
     * 
     */
    OS,

    /**
     * Panjabi; Punjabi
     * 
     */
    PA,

    /**
     * Persian
     * 
     */
    FA,

    /**
     * Pali
     * 
     */
    PI,

    /**
     * Polish
     * 
     */
    PL,

    /**
     * Portuguese
     * 
     */
    PT,

    /**
     * Pushto; Pashto
     * 
     */
    PS,

    /**
     * Quechua
     * 
     */
    QU,

    /**
     * Romansh
     * 
     */
    RM,

    /**
     * Romanian; Moldavian; Moldovan
     * 
     */
    RO,

    /**
     * Rundi
     * 
     */
    RN,

    /**
     * Russian
     * 
     */
    RU,

    /**
     * Sango
     * 
     */
    SG,

    /**
     * Sanskrit
     * 
     */
    SA,

    /**
     * Sinhala; Sinhalese
     * 
     */
    SI,

    /**
     * Slovak
     * 
     */
    SK,

    /**
     * Slovenian
     * 
     */
    SL,

    /**
     * Northern Sami
     * 
     */
    SE,

    /**
     * Samoan
     * 
     */
    SM,

    /**
     * Shona
     * 
     */
    SN,

    /**
     * Sindhi
     * 
     */
    SD,

    /**
     * Somali
     * 
     */
    SO,

    /**
     * Sotho, Southern
     * 
     */
    ST,

    /**
     * Spanish; Castilian
     * 
     */
    ES,

    /**
     * Sardinian
     * 
     */
    SC,

    /**
     * Serbian
     * 
     */
    SR,

    /**
     * Swati
     * 
     */
    SS,

    /**
     * Sundanese
     * 
     */
    SU,

    /**
     * Swahili
     * 
     */
    SW,

    /**
     * Swedish
     * 
     */
    SV,

    /**
     * Tahitian
     * 
     */
    TY,

    /**
     * Tamil
     * 
     */
    TA,

    /**
     * Tatar
     * 
     */
    TT,

    /**
     * Telugu
     * 
     */
    TE,

    /**
     * Tajik
     * 
     */
    TG,

    /**
     * Tagalog
     * 
     */
    TL,

    /**
     * Thai
     * 
     */
    TH,

    /**
     * Tibetan
     * 
     */
    BO,

    /**
     * Tigrinya
     * 
     */
    TI,

    /**
     * Tonga (Tonga Islands)
     * 
     */
    TO,

    /**
     * Tswana
     * 
     */
    TN,

    /**
     * Tsonga
     * 
     */
    TS,

    /**
     * Turkmen
     * 
     */
    TK,

    /**
     * Turkish
     * 
     */
    TR,

    /**
     * Twi
     * 
     */
    TW,

    /**
     * Uighur; Uyghur
     * 
     */
    UG,

    /**
     * Ukrainian
     * 
     */
    UK,

    /**
     * Urdu
     * 
     */
    UR,

    /**
     * Uzbek
     * 
     */
    UZ,

    /**
     * Venda
     * 
     */
    VE,

    /**
     * Vietnamese
     * 
     */
    VI,

    /**
     * Volapük
     * 
     */
    VO,

    /**
     * Welsh
     * 
     */
    CY,

    /**
     * Walloon
     * 
     */
    WA,

    /**
     * Wolof
     * 
     */
    WO,

    /**
     * Xhosa
     * 
     */
    XH,

    /**
     * Yiddish
     * 
     */
    YI,

    /**
     * Yoruba
     * 
     */
    YO,

    /**
     * Zhuang; Chuang
     * 
     */
    ZA,

    /**
     * Zulu
     * 
     */
    ZU;

    public String value() {
        return this.name();
    }
    
    public static LanguageCodeType fromValue(final String v)
    {
        return valueOf(v);
    }

}
