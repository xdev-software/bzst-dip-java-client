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
package software.xdev.bzst.dip.client.model.message.cesop;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import software.xdev.bzst.dip.client.xmldocument.model.cesop.AccountIdentifierType;
import software.xdev.bzst.dip.client.xmldocument.model.cesop.AccountIdentifierTypeType;
import software.xdev.bzst.dip.client.xmldocument.model.cesop.AmountType;
import software.xdev.bzst.dip.client.xmldocument.model.cesop.CountryCodeType;
import software.xdev.bzst.dip.client.xmldocument.model.cesop.CurrCodeType;
import software.xdev.bzst.dip.client.xmldocument.model.cesop.DocSpecType;
import software.xdev.bzst.dip.client.xmldocument.model.cesop.DocTypeIndicEnumType;
import software.xdev.bzst.dip.client.xmldocument.model.cesop.MSCountryCodeType;
import software.xdev.bzst.dip.client.xmldocument.model.cesop.NameType;
import software.xdev.bzst.dip.client.xmldocument.model.cesop.NameTypeEnumType;
import software.xdev.bzst.dip.client.xmldocument.model.cesop.PSPIdType;
import software.xdev.bzst.dip.client.xmldocument.model.cesop.PSPIdTypeType;
import software.xdev.bzst.dip.client.xmldocument.model.cesop.PSPRoleType;
import software.xdev.bzst.dip.client.xmldocument.model.cesop.PSPRoleTypeType;
import software.xdev.bzst.dip.client.xmldocument.model.cesop.PSPType;
import software.xdev.bzst.dip.client.xmldocument.model.cesop.PayerMSType;
import software.xdev.bzst.dip.client.xmldocument.model.cesop.PaymentDataBodyType;
import software.xdev.bzst.dip.client.xmldocument.model.cesop.PaymentMethodType;
import software.xdev.bzst.dip.client.xmldocument.model.cesop.PaymentMethodTypeType;
import software.xdev.bzst.dip.client.xmldocument.model.cesop.ReportedPayeeType;
import software.xdev.bzst.dip.client.xmldocument.model.cesop.ReportedTransactionType;
import software.xdev.bzst.dip.client.xmldocument.model.cesop.TAXIdentifierType;
import software.xdev.bzst.dip.client.xmldocument.model.cesop.TransactionDateType;
import software.xdev.bzst.dip.client.xmldocument.model.cesop.TransactionDateTypeType;
import software.xdev.bzst.dip.client.xmldocument.model.cesop.VATIdType;


/**
 * @param reportingPSP  The reportingPSP element clearly defines the payment service provider that reports the payment
 *                      data to the national tax administration. {@link BzstCesopReportingPSP}
 * @param reportedPayees defines the payees to whom the data transmitted by the payment service provider
 */
public record BzstCesopPaymentDataBody(BzstCesopReportingPSP reportingPSP, List<BzstCesopReportedPayee> reportedPayees)
{
	public PaymentDataBodyType toXmlType() throws DatatypeConfigurationException
	{
		final PaymentDataBodyType paymentDataBodyType = new PaymentDataBodyType();
		
		paymentDataBodyType.setReportingPSP(this.convertToPSPType());
		
		this.convertToReportedPayeesType();
		for(final ReportedPayeeType reportedPayeeType : this.convertToReportedPayeesType())
		{
			paymentDataBodyType.getReportedPayee().add(reportedPayeeType);
		}
		
		return paymentDataBodyType;
	}
	
	private List<ReportedPayeeType> convertToReportedPayeesType() throws DatatypeConfigurationException
	{
		final List<ReportedPayeeType> reportedPayeeTypes = new ArrayList<>();
		for(final BzstCesopReportedPayee reportedPayee : this.reportedPayees)
		{
			final ReportedPayeeType reportedPayeeType = new ReportedPayeeType();
			
			final NameType nameTypeReportedPayeeType = new NameType();
			final DocSpecType docSpecType = new DocSpecType();
			final AccountIdentifierType accountIdentifierType = new AccountIdentifierType();
			final TAXIdentifierType taxIdentifierType = new TAXIdentifierType();
			final VATIdType vatIdType = new VATIdType();
			final ReportedTransactionType reportedTransactionType = new ReportedTransactionType();
			final AmountType amountType = new AmountType();
			final PaymentMethodType paymentMethodType = new PaymentMethodType();
			final PayerMSType payerMSType = new PayerMSType();
			final PSPRoleType pspRoleType = new PSPRoleType();
			final TransactionDateType transactionDateType = new TransactionDateType();
			
			nameTypeReportedPayeeType.setValue(reportedPayee.name().value());
			nameTypeReportedPayeeType.setNameType(NameTypeEnumType.fromValue(reportedPayee.name()
				.nameType()
				.value()));
			docSpecType.setDocTypeIndic(DocTypeIndicEnumType.fromValue(reportedPayee.docSpec()
				.docTypeIndicEnum()
				.value()));
			docSpecType.setDocRefId(reportedPayee.docSpec().docRefId().toString());
			accountIdentifierType.setType(AccountIdentifierTypeType.fromValue(reportedPayee.accountIdentifier()
				.accountIdentifierType()
				.value()));
			accountIdentifierType.setValue(reportedPayee.accountIdentifier().value());
			accountIdentifierType.setCountryCode(CountryCodeType.fromValue(reportedPayee.countryCode().name()));
			vatIdType.setValue(reportedPayee.taxIdentification().vatId().value());
			vatIdType.setIssuedBy(MSCountryCodeType.fromValue(reportedPayee.taxIdentification()
				.vatId()
				.msCountryCodeTypeEnum()
				.value()));
			taxIdentifierType.getVATId().add(vatIdType);
			amountType.setValue(reportedPayee.reportedTransaction().amount().amountValue());
			amountType.setCurrency(CurrCodeType.fromValue(reportedPayee.reportedTransaction()
				.amount()
				.currency()
				.name()));
			reportedTransactionType.setAmount(amountType);
			reportedTransactionType.setTransactionIdentifier(reportedPayee.reportedTransaction()
				.transactionIdentifier());
			paymentMethodType.setPaymentMethodType(PaymentMethodTypeType.fromValue(reportedPayee.reportedTransaction()
				.paymentMethod()
				.paymentMethodEnum()
				.value()));
			payerMSType.setPayerMSSource(AccountIdentifierTypeType.fromValue(reportedPayee.reportedTransaction()
				.payerMS()
				.accountIdentifierType()
				.value()));
			payerMSType.setValue(MSCountryCodeType.fromValue(reportedPayee.reportedTransaction()
				.payerMS()
				.msCountryCodeType()
				.value()));
			pspRoleType.setPSPRoleType(PSPRoleTypeType.fromValue(reportedPayee.reportedTransaction()
				.pspRole()
				.pspRoleType()
				.value()));
			reportedTransactionType.setPaymentMethod(paymentMethodType);
			reportedTransactionType.setIsRefund(reportedPayee.reportedTransaction().isRefund());
			reportedTransactionType.setPayerMS(payerMSType);
			reportedTransactionType.setPSPRole(pspRoleType);
			reportedTransactionType.setInitiatedAtPhysicalPremisesOfMerchant(reportedPayee.reportedTransaction()
				.initiatedAtPhysicalPremisesOfMerchant());
			
			final GregorianCalendar gregorianCalendar =
				GregorianCalendar.from(reportedPayee.reportedTransaction().transactionDateType().value());
			final XMLGregorianCalendar xmlGregorianCalendar =
				DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
			
			transactionDateType.setValue(xmlGregorianCalendar);
			transactionDateType.setTransactionDateType(
				TransactionDateTypeType.fromValue(reportedPayee.reportedTransaction()
				.transactionDateType()
				.transactionDateTypeEnum()
				.value()));
			reportedTransactionType.getDateTime().add(transactionDateType);
			
			reportedPayeeType.getName().add(nameTypeReportedPayeeType);
			reportedPayeeType.setCountry(CountryCodeType.fromValue(reportedPayee.countryCode().name()));
			reportedPayeeType.setDocSpec(docSpecType);
			reportedPayeeType.setAccountIdentifier(accountIdentifierType);
			reportedPayeeType.setTAXIdentification(taxIdentifierType);
			reportedPayeeType.getReportedTransaction().add(reportedTransactionType);
			reportedPayeeTypes.add(reportedPayeeType);
		}
		return reportedPayeeTypes;
	}
	
	private PSPType convertToPSPType()
	{
		final PSPType pspType = new PSPType();
		final PSPIdType pspIdType = new PSPIdType();
		final NameType nameType = new NameType();
		
		pspIdType.setPSPIdType(PSPIdTypeType.valueOf(this.reportingPSP.pspIdType().pspIdTypeEnum().value()));
		pspIdType.setValue(this.reportingPSP.pspIdType().value());
		nameType.setNameType(NameTypeEnumType.valueOf(this.reportingPSP.name().nameType().value()));
		nameType.setValue(this.reportingPSP.name().value());
		pspType.setPSPId(pspIdType);
		pspType.getName().add(nameType);
		return pspType;
	}
}
