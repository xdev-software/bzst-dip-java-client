package software.xdev.bzst.dip.client.model.message.cesop;

import java.util.GregorianCalendar;

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

// TODO: Das in Methoden auslagern, für bessere Lesbarkeit


/**
 * @param reportingPSP  The reportingPSP element clearly defines the payment service provider that reports the payment
 *                      data to the national tax administration. {@link BzstCesopReportingPSP}
 * @param reportedPayee defines the payee to whom the data transmitted by the payment service provider
 */
public record BzstCesopPaymentDataBody(BzstCesopReportingPSP reportingPSP, BzstCesopReportedPayee reportedPayee)
{
	public PaymentDataBodyType toXmlType() throws DatatypeConfigurationException
	{
		final PaymentDataBodyType paymentDataBodyType = new PaymentDataBodyType();
		
		final PSPType pspType = new PSPType();
		final PSPIdType pspIdType = new PSPIdType();
		final NameType nameType = new NameType();
		
		pspIdType.setPSPIdType(PSPIdTypeType.valueOf(this.reportingPSP.pspIdType().pspIdTypeEnum().value()));
		pspIdType.setValue(this.reportingPSP.pspIdType().value());
		nameType.setNameType(NameTypeEnumType.valueOf(this.reportingPSP.name().nameType().value()));
		nameType.setValue(this.reportingPSP.name().value());
		pspType.setPSPId(pspIdType);
		pspType.getName().add(nameType);
		
		paymentDataBodyType.setReportingPSP(pspType);
		
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
		
		nameTypeReportedPayeeType.setValue(this.reportedPayee.name().value());
		nameTypeReportedPayeeType.setNameType(NameTypeEnumType.fromValue(this.reportedPayee.name().nameType().value()));
		docSpecType.setDocTypeIndic(DocTypeIndicEnumType.fromValue(this.reportedPayee.docSpec()
			.docTypeIndicEnum()
			.value()));
		docSpecType.setDocRefId(this.reportedPayee.docSpec().docRefId().toString());
		accountIdentifierType.setType(AccountIdentifierTypeType.fromValue(this.reportedPayee.accountIdentifier()
			.accountIdentifierType()
			.value()));
		accountIdentifierType.setValue(this.reportedPayee.accountIdentifier().value());
		accountIdentifierType.setCountryCode(CountryCodeType.fromValue(this.reportedPayee.countryCode().name()));
		vatIdType.setValue(this.reportedPayee.taxIdentification().vatId().value());
		vatIdType.setIssuedBy(MSCountryCodeType.fromValue(this.reportedPayee.taxIdentification()
			.vatId()
			.msCountryCodeTypeEnum()
			.value()));
		taxIdentifierType.getVATId().add(vatIdType);
		amountType.setValue(this.reportedPayee.reportedTransaction().amount().amountValue());
		amountType.setCurrency(CurrCodeType.fromValue(this.reportedPayee.reportedTransaction()
			.amount()
			.currency()
			.name()));
		reportedTransactionType.setAmount(amountType);
		reportedTransactionType.setTransactionIdentifier(this.reportedPayee.reportedTransaction()
			.transactionIdentifier());
		paymentMethodType.setPaymentMethodType(PaymentMethodTypeType.valueOf(this.reportedPayee.reportedTransaction()
			.paymentMethod()
			.paymentMethodEnum()
			.value()));
		payerMSType.setPayerMSSource(AccountIdentifierTypeType.valueOf(this.reportedPayee.reportedTransaction()
			.payerMS()
			.accountIdentifierType()
			.value()));
		payerMSType.setValue(MSCountryCodeType.valueOf(this.reportedPayee.reportedTransaction()
			.payerMS()
			.msCountryCodeType()
			.value()));
		pspRoleType.setPSPRoleType(PSPRoleTypeType.valueOf(this.reportedPayee.reportedTransaction()
			.pspRole()
			.pspRoleType()
			.value()));
		reportedTransactionType.setPaymentMethod(paymentMethodType);
		reportedTransactionType.setIsRefund(this.reportedPayee.reportedTransaction().isRefund());
		reportedTransactionType.setPayerMS(payerMSType);
		reportedTransactionType.setPSPRole(pspRoleType);
		reportedTransactionType.setInitiatedAtPhysicalPremisesOfMerchant(this.reportedPayee.reportedTransaction()
			.initiatedAtPhysicalPremisesOfMerchant());
		
		final GregorianCalendar gregorianCalendar =
			GregorianCalendar.from(this.reportedPayee.reportedTransaction().transactionDateType().value());
		final XMLGregorianCalendar xmlGregorianCalendar =
			DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
		
		transactionDateType.setValue(xmlGregorianCalendar);
		transactionDateType.setTransactionDateType(TransactionDateTypeType.valueOf(this.reportedPayee.reportedTransaction()
			.transactionDateType()
			.transactionDateTypeEnum()
			.value()));
		reportedTransactionType.getDateTime().add(transactionDateType);
		
		reportedPayeeType.getName().add(nameTypeReportedPayeeType);
		reportedPayeeType.setCountry(CountryCodeType.fromValue(this.reportedPayee.countryCode().name()));
		reportedPayeeType.setDocSpec(docSpecType);
		reportedPayeeType.setAccountIdentifier(accountIdentifierType);
		reportedPayeeType.setTAXIdentification(taxIdentifierType);
		reportedPayeeType.getReportedTransaction().add(reportedTransactionType);
		
		paymentDataBodyType.getReportedPayee().add(reportedPayeeType);
		
		return paymentDataBodyType;
	}
}
