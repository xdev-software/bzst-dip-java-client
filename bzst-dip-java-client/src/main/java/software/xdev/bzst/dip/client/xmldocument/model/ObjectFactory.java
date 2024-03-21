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

import javax.xml.namespace.QName;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the software.xdev.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddressTypeCountryCode_QNAME = new QName("urn:oecd:ties:dpi:v1", "CountryCode");
    private final static QName _AddressTypeAddressFree_QNAME = new QName("urn:oecd:ties:dpi:v1", "AddressFree");
    private final static QName _AddressTypeAddressFix_QNAME = new QName("urn:oecd:ties:dpi:v1", "AddressFix");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: software.xdev.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReportableSellerType }
     * 
     */
    public ReportableSellerType createReportableSellerType() {
        return new ReportableSellerType();
    }

    /**
     * Create an instance of {@link ReportableSellerType.RelevantActivities }
     * 
     */
    public ReportableSellerType.RelevantActivities createReportableSellerTypeRelevantActivities() {
        return new ReportableSellerType.RelevantActivities();
    }

    /**
     * Create an instance of {@link ReportableSellerType.Identity }
     * 
     */
    public ReportableSellerType.Identity createReportableSellerTypeIdentity() {
        return new ReportableSellerType.Identity();
    }

    /**
     * Create an instance of {@link ReportableSellerType.Identity.IndividualSeller }
     * 
     */
    public ReportableSellerType.Identity.IndividualSeller createReportableSellerTypeIdentityIndividualSeller() {
        return new ReportableSellerType.Identity.IndividualSeller();
    }

    /**
     * Create an instance of {@link ReportableSellerType.Identity.EntitySeller }
     * 
     */
    public ReportableSellerType.Identity.EntitySeller createReportableSellerTypeIdentityEntitySeller() {
        return new ReportableSellerType.Identity.EntitySeller();
    }

    /**
     * Create an instance of {@link BirthPlaceType }
     * 
     */
    public BirthPlaceType createBirthPlaceType() {
        return new BirthPlaceType();
    }

    /**
     * Create an instance of {@link PersonPartyType }
     * 
     */
    public PersonPartyType createPersonPartyType() {
        return new PersonPartyType();
    }

    /**
     * Create an instance of {@link NamePersonType }
     * 
     */
    public NamePersonType createNamePersonType() {
        return new NamePersonType();
    }

    /**
     * Create an instance of {@link DPIOECD }
     * 
     */
    public DPIOECD createDPIOECD() {
        return new DPIOECD();
    }

    /**
     * Create an instance of {@link MessageSpecType }
     * 
     */
    public MessageSpecType createMessageSpecType() {
        return new MessageSpecType();
    }

    /**
     * Create an instance of {@link DPIBodyType }
     * 
     */
    public DPIBodyType createDPIBodyType() {
        return new DPIBodyType();
    }

    /**
     * Create an instance of {@link AddressFixType }
     * 
     */
    public AddressFixType createAddressFixType() {
        return new AddressFixType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link MonAmntType }
     * 
     */
    public MonAmntType createMonAmntType() {
        return new MonAmntType();
    }

    /**
     * Create an instance of {@link NameOrganisationType }
     * 
     */
    public NameOrganisationType createNameOrganisationType() {
        return new NameOrganisationType();
    }

    /**
     * Create an instance of {@link NameReportableSellerType }
     * 
     */
    public NameReportableSellerType createNameReportableSellerType() {
        return new NameReportableSellerType();
    }

    /**
     * Create an instance of {@link TINType }
     * 
     */
    public TINType createTINType() {
        return new TINType();
    }

    /**
     * Create an instance of {@link OrganisationINType }
     * 
     */
    public OrganisationINType createOrganisationINType() {
        return new OrganisationINType();
    }

    /**
     * Create an instance of {@link OrganisationPartyType }
     * 
     */
    public OrganisationPartyType createOrganisationPartyType() {
        return new OrganisationPartyType();
    }

    /**
     * Create an instance of {@link CorrectablePlatformOperatorType }
     * 
     */
    public CorrectablePlatformOperatorType createCorrectablePlatformOperatorType() {
        return new CorrectablePlatformOperatorType();
    }

    /**
     * Create an instance of {@link CorrectableReportableSellerType }
     * 
     */
    public CorrectableReportableSellerType createCorrectableReportableSellerType() {
        return new CorrectableReportableSellerType();
    }

    /**
     * Create an instance of {@link CorrectableAdditionalInfoType }
     * 
     */
    public CorrectableAdditionalInfoType createCorrectableAdditionalInfoType() {
        return new CorrectableAdditionalInfoType();
    }

    /**
     * Create an instance of {@link AccountHolderType }
     * 
     */
    public AccountHolderType createAccountHolderType() {
        return new AccountHolderType();
    }

    /**
     * Create an instance of {@link FinancialIdentifierType }
     * 
     */
    public FinancialIdentifierType createFinancialIdentifierType() {
        return new FinancialIdentifierType();
    }

    /**
     * Create an instance of {@link IdentifierType }
     * 
     */
    public IdentifierType createIdentifierType() {
        return new IdentifierType();
    }

    /**
     * Create an instance of {@link OtherActivitiesType }
     * 
     */
    public OtherActivitiesType createOtherActivitiesType() {
        return new OtherActivitiesType();
    }

    /**
     * Create an instance of {@link NumberOfActivitiesType }
     * 
     */
    public NumberOfActivitiesType createNumberOfActivitiesType() {
        return new NumberOfActivitiesType();
    }

    /**
     * Create an instance of {@link TaxesType }
     * 
     */
    public TaxesType createTaxesType() {
        return new TaxesType();
    }

    /**
     * Create an instance of {@link FeesType }
     * 
     */
    public FeesType createFeesType() {
        return new FeesType();
    }

    /**
     * Create an instance of {@link ConsiderationType }
     * 
     */
    public ConsiderationType createConsiderationType() {
        return new ConsiderationType();
    }

    /**
     * Create an instance of {@link PropertyListingType }
     * 
     */
    public PropertyListingType createPropertyListingType() {
        return new PropertyListingType();
    }

    /**
     * Create an instance of {@link GVSType }
     * 
     */
    public GVSType createGVSType() {
        return new GVSType();
    }

    /**
     * Create an instance of {@link PermanentEstablishmentsType }
     * 
     */
    public PermanentEstablishmentsType createPermanentEstablishmentsType() {
        return new PermanentEstablishmentsType();
    }

    /**
     * Create an instance of {@link OtherPlatformOperatorsType }
     * 
     */
    public OtherPlatformOperatorsType createOtherPlatformOperatorsType() {
        return new OtherPlatformOperatorsType();
    }

    /**
     * Create an instance of {@link OtherRPOType }
     * 
     */
    public OtherRPOType createOtherRPOType() {
        return new OtherRPOType();
    }

    /**
     * Create an instance of {@link CorrectableOtherRPOType }
     * 
     */
    public CorrectableOtherRPOType createCorrectableOtherRPOType() {
        return new CorrectableOtherRPOType();
    }

    /**
     * Create an instance of {@link StringMin1Max4000WithLangType }
     * 
     */
    public StringMin1Max4000WithLangType createStringMin1Max4000WithLangType() {
        return new StringMin1Max4000WithLangType();
    }

    /**
     * Create an instance of {@link DocSpecType }
     * 
     */
    public DocSpecType createDocSpecType() {
        return new DocSpecType();
    }

    /**
     * Create an instance of {@link ReportableSellerType.RelevantActivities.ImmovableProperty }
     * 
     */
    public ReportableSellerType.RelevantActivities.ImmovableProperty createReportableSellerTypeRelevantActivitiesImmovableProperty() {
        return new ReportableSellerType.RelevantActivities.ImmovableProperty();
    }

    /**
     * Create an instance of {@link ReportableSellerType.Identity.IndividualSeller.Standard }
     * 
     */
    public ReportableSellerType.Identity.IndividualSeller.Standard createReportableSellerTypeIdentityIndividualSellerStandard() {
        return new ReportableSellerType.Identity.IndividualSeller.Standard();
    }

    /**
     * Create an instance of {@link ReportableSellerType.Identity.EntitySeller.Standard }
     * 
     */
    public ReportableSellerType.Identity.EntitySeller.Standard createReportableSellerTypeIdentityEntitySellerStandard() {
        return new ReportableSellerType.Identity.EntitySeller.Standard();
    }

    /**
     * Create an instance of {@link BirthPlaceType.CountryInfo }
     * 
     */
    public BirthPlaceType.CountryInfo createBirthPlaceTypeCountryInfo() {
        return new BirthPlaceType.CountryInfo();
    }

    /**
     * Create an instance of {@link PersonPartyType.BirthInfo }
     * 
     */
    public PersonPartyType.BirthInfo createPersonPartyTypeBirthInfo() {
        return new PersonPartyType.BirthInfo();
    }

    /**
     * Create an instance of {@link NamePersonType.FirstName }
     * 
     */
    public NamePersonType.FirstName createNamePersonTypeFirstName() {
        return new NamePersonType.FirstName();
    }

    /**
     * Create an instance of {@link NamePersonType.MiddleName }
     * 
     */
    public NamePersonType.MiddleName createNamePersonTypeMiddleName() {
        return new NamePersonType.MiddleName();
    }

    /**
     * Create an instance of {@link NamePersonType.NamePrefix }
     * 
     */
    public NamePersonType.NamePrefix createNamePersonTypeNamePrefix() {
        return new NamePersonType.NamePrefix();
    }

    /**
     * Create an instance of {@link NamePersonType.LastName }
     * 
     */
    public NamePersonType.LastName createNamePersonTypeLastName() {
        return new NamePersonType.LastName();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CountryCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oecd:ties:dpi:v1", name = "CountryCode", scope = AddressType.class)
    public JAXBElement<CountryCodeType> createAddressTypeCountryCode(final CountryCodeType value) {
        return new JAXBElement<>(_AddressTypeCountryCode_QNAME, CountryCodeType.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oecd:ties:dpi:v1", name = "AddressFree", scope = AddressType.class)
    public JAXBElement<String> createAddressTypeAddressFree(final String value) {
        return new JAXBElement<>(_AddressTypeAddressFree_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressFixType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddressFixType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oecd:ties:dpi:v1", name = "AddressFix", scope = AddressType.class)
    public JAXBElement<AddressFixType> createAddressTypeAddressFix(final AddressFixType value) {
        return new JAXBElement<>(_AddressTypeAddressFix_QNAME, AddressFixType.class, AddressType.class, value);
    }

}
