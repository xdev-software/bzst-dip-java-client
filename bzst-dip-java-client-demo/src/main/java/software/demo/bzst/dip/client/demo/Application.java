package software.demo.bzst.dip.client.demo;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import software.xdev.bzst.dip.client.BzstDipClient;
import software.xdev.bzst.dip.client.BzstDipConfiguration;
import software.xdev.bzst.dip.client.BzstDipConfigurationBuilder;
import software.xdev.bzst.dip.client.exception.HttpStatusCodeNotExceptedException;
import software.xdev.bzst.dip.client.model.BzstDipAddressFix;
import software.xdev.bzst.dip.client.model.BzstDipConsiderations;
import software.xdev.bzst.dip.client.model.BzstDipCorrectableReportableSellerType;
import software.xdev.bzst.dip.client.model.BzstDipCountryCode;
import software.xdev.bzst.dip.client.model.BzstDipCurrency;
import software.xdev.bzst.dip.client.model.BzstDipFees;
import software.xdev.bzst.dip.client.model.BzstDipMessage;
import software.xdev.bzst.dip.client.model.BzstDipMonetaryAmount;
import software.xdev.bzst.dip.client.model.BzstDipNumberOfActivities;
import software.xdev.bzst.dip.client.model.BzstDipOecdLegalAddressType;
import software.xdev.bzst.dip.client.model.BzstDipTaxes;
import software.xdev.bzst.dip.client.model.BzstDipTin;


public final class Application
{
	public static void main(final String[] args) throws InterruptedException, HttpStatusCodeNotExceptedException
	{
		final BzstDipConfiguration configuration = new BzstDipConfigurationBuilder()
			.setClientId("TestClient")
			.build();
		final BzstDipClient bzstDipClient = new BzstDipClient(configuration);
		bzstDipClient.sendDipAndQueryResult(createMessage());
	}
	
	private static BzstDipMessage createMessage()
	{
		return new BzstDipMessage(
			List.of(
				new BzstDipCorrectableReportableSellerType(
					BzstDipCountryCode.DE,
					new BzstDipTin(
						"123-456-789",
						BzstDipCountryCode.DE,
						null
					),
					"123-456-789",
					"123-456-789",
					"Mick",
					"Fleetwood",
					LocalDate.of(1947,6,24),
					BzstDipOecdLegalAddressType.OECD_301,
					new BzstDipAddressFix(
						"Weiden"
					),
					new BzstDipNumberOfActivities(1,2,3,4),
					new BzstDipConsiderations(
						new BzstDipMonetaryAmount(1, BzstDipCurrency.EUR),
						new BzstDipMonetaryAmount(1, BzstDipCurrency.EUR),
						new BzstDipMonetaryAmount(1, BzstDipCurrency.EUR),
						new BzstDipMonetaryAmount(1, BzstDipCurrency.EUR)
					),
					new BzstDipFees(
						new BzstDipMonetaryAmount(1, BzstDipCurrency.EUR),
						new BzstDipMonetaryAmount(1, BzstDipCurrency.EUR),
						new BzstDipMonetaryAmount(1, BzstDipCurrency.EUR),
						new BzstDipMonetaryAmount(1, BzstDipCurrency.EUR)
					),
					new BzstDipTaxes(
						new BzstDipMonetaryAmount(1, BzstDipCurrency.EUR),
						new BzstDipMonetaryAmount(1, BzstDipCurrency.EUR),
						new BzstDipMonetaryAmount(1, BzstDipCurrency.EUR),
						new BzstDipMonetaryAmount(1, BzstDipCurrency.EUR)
					),
					"DE,AT,NL",
					UUID.randomUUID().toString()
				)
			)
		);
	}
	
	private Application()
	{
	}
}
