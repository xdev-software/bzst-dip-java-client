package software.xdev;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.UUID;

import javax.xml.datatype.DatatypeConfigurationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import software.xdev.bzst.dip.client.BzstDipClient;
import software.xdev.bzst.dip.client.exception.HttpStatusCodeNotExceptedException;
import software.xdev.bzst.dip.client.model.configuration.BzstDipConfiguration;
import software.xdev.bzst.dip.client.model.configuration.BzstDipConfigurationBuilder;
import software.xdev.bzst.dip.client.model.configuration.BzstDipOecdDocType;
import software.xdev.bzst.dip.client.model.message.cesop.BzstCesopAccountIdentifier;
import software.xdev.bzst.dip.client.model.message.cesop.BzstCesopAccountIdentifierTypeEnum;
import software.xdev.bzst.dip.client.model.message.cesop.BzstCesopAdress;
import software.xdev.bzst.dip.client.model.message.cesop.BzstCesopAmount;
import software.xdev.bzst.dip.client.model.message.cesop.BzstCesopDocSpec;
import software.xdev.bzst.dip.client.model.message.cesop.BzstCesopDocTypeIndicEnum;
import software.xdev.bzst.dip.client.model.message.cesop.BzstCesopLegalAdressTypeEnum;
import software.xdev.bzst.dip.client.model.message.cesop.BzstCesopMSCountryCodeTypeEnum;
import software.xdev.bzst.dip.client.model.message.cesop.BzstCesopMessageTypeEnum;
import software.xdev.bzst.dip.client.model.message.cesop.BzstCesopMessageTypeIndicEnum;
import software.xdev.bzst.dip.client.model.message.cesop.BzstCesopName;
import software.xdev.bzst.dip.client.model.message.cesop.BzstCesopNameTypeEnum;
import software.xdev.bzst.dip.client.model.message.cesop.BzstCesopPSPIdType;
import software.xdev.bzst.dip.client.model.message.cesop.BzstCesopPSPIdTypeEnum;
import software.xdev.bzst.dip.client.model.message.cesop.BzstCesopPSPRole;
import software.xdev.bzst.dip.client.model.message.cesop.BzstCesopPSPRoleTypeEnum;
import software.xdev.bzst.dip.client.model.message.cesop.BzstCesopPayerMS;
import software.xdev.bzst.dip.client.model.message.cesop.BzstCesopPaymentDataBody;
import software.xdev.bzst.dip.client.model.message.cesop.BzstCesopPaymentMethod;
import software.xdev.bzst.dip.client.model.message.cesop.BzstCesopPaymentMethodEnum;
import software.xdev.bzst.dip.client.model.message.cesop.BzstCesopReportedPayee;
import software.xdev.bzst.dip.client.model.message.cesop.BzstCesopReportedTransaction;
import software.xdev.bzst.dip.client.model.message.cesop.BzstCesopReportingPSP;
import software.xdev.bzst.dip.client.model.message.cesop.BzstCesopTAXIdentification;
import software.xdev.bzst.dip.client.model.message.cesop.BzstCesopTransactionDateType;
import software.xdev.bzst.dip.client.model.message.cesop.BzstCesopTransactionDateTypeEnum;
import software.xdev.bzst.dip.client.model.message.cesop.BzstCesopVatId;
import software.xdev.bzst.dip.client.model.message.dac7.BzstDipAddressFix;
import software.xdev.bzst.dip.client.model.message.dac7.BzstDipCompleteResult;
import software.xdev.bzst.dip.client.model.message.dac7.BzstDipCountryCode;
import software.xdev.bzst.dip.client.model.message.dac7.BzstDipCurrency;


@SuppressWarnings("checkstyle:MagicNumber")
public final class ApplicationWithCesop
{
	private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationWithCesop.class);
	
	public static void main(final String[] args)
		throws InterruptedException, HttpStatusCodeNotExceptedException, IOException, DatatypeConfigurationException
	{
		final BzstDipConfiguration configuration = createConfiguration();
		final BzstDipClient bzstDipClient = new BzstDipClient(configuration);
		final BzstDipCompleteResult bzstDipCompleteResult = bzstDipClient.sendDipAndQueryResult(createMessage());
		LOGGER.info(
			"Sending dip message with transfer number {} {}",
			bzstDipCompleteResult.dataTransferNumber(),
			bzstDipCompleteResult.isSuccessful() ? "was successful." : "has failed!"
		);
	}
	
	public static BzstDipConfiguration createConfiguration()
	{
		return new BzstDipConfigurationBuilder()
			.setApplicationCode(BzstDipConfiguration.SupportedApplicationCode.CESOP)
			.setClientId("abcd1234-ab12-ab12-ab12-abcdef123456")
			.setTaxID("86095742719")
			.setTaxNumber("123")
			.setCertificateKeystoreInputStream(() -> ClassLoader.getSystemClassLoader()
				.getResourceAsStream("DemoKeystore.jks"))
			.setCertificateKeystorePassword("test123")
			.setRealmEnvironmentBaseUrl(BzstDipConfiguration.ENDPOINT_URL_TEST)
			.setMessageTypeIndicCesop(BzstCesopMessageTypeIndicEnum.CESOP_101)
			.setReportingPeriod(LocalDate.now())
			.setDocTypeIndic(BzstDipOecdDocType.OECD_1)
			.setPlatformOperatorOrganizationName("TestOrg")
			.setPlatformOperatorPlatformName("TestApp")
			.setPlatformOperatorAddress(new BzstDipAddressFix("TestCity"))
			.setTransmittingCountry(BzstDipCountryCode.DE)
			.setMessageType(BzstCesopMessageTypeEnum.PMT)
			.setReportingPeriodCesopQuarter(2)
			.setReportingPeriodCesopYear("2024")
			.setMessageRefId(UUID.randomUUID().toString())
			.setTimestamp(ZonedDateTime.parse("2024-05-08T14:02:53Z", DateTimeFormatter.ISO_ZONED_DATE_TIME))
			.buildAndValidate();
	}
	
	public static BzstCesopPaymentDataBody createMessage()
	{
		return new BzstCesopPaymentDataBody(
			new BzstCesopReportingPSP(
				new BzstCesopPSPIdType(BzstCesopPSPIdTypeEnum.BIC, "TRSYDEFFXXX"),
				new BzstCesopName(BzstCesopNameTypeEnum.LEGAL, "360 TREASURY SYSTEMS AG")
			),
			List.of(
				new BzstCesopReportedPayee(
					new BzstCesopName(BzstCesopNameTypeEnum.BUSINESS, "German Company AG"),
					BzstDipCountryCode.DE,
					new BzstCesopAdress(
						BzstCesopLegalAdressTypeEnum.CESOP_303,
						BzstDipCountryCode.DE,
						"Beispielstraße 3, 11712 Berlin"),
					new BzstCesopTAXIdentification(new BzstCesopVatId(
						BzstCesopMSCountryCodeTypeEnum.DE,
						"112233445")),
					new BzstCesopAccountIdentifier(
						BzstDipCountryCode.DE,
						BzstCesopAccountIdentifierTypeEnum.IBAN,
						"DE32503302010298200040"),
					new BzstCesopReportedTransaction(false, "DE-01-0101",
						new BzstCesopTransactionDateType(
							BzstCesopTransactionDateTypeEnum.CESOP_701,
							ZonedDateTime.parse("2024-03-03T11:53:25Z", DateTimeFormatter.ISO_ZONED_DATE_TIME)),
						new BzstCesopAmount(BzstDipCurrency.EUR, new BigDecimal("100")),
						new BzstCesopPaymentMethod(BzstCesopPaymentMethodEnum.BANK_TRANSFER),
						false,
						new BzstCesopPayerMS(
							BzstCesopAccountIdentifierTypeEnum.IBAN,
							BzstCesopMSCountryCodeTypeEnum.FR),
						new BzstCesopPSPRole(BzstCesopPSPRoleTypeEnum.MONEY_TRANSFER_OPERATOR)),
					new BzstCesopDocSpec(BzstCesopDocTypeIndicEnum.CESOP_1, UUID.randomUUID())
				)
			)
		);
	}
	
	private ApplicationWithCesop()
	{
	}
}
