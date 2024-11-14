package software.xdev.bzst.dip.client.model.message.cesop;

public enum BzstCesopMSCountryCodeTypeEnum
{
	AT,
	BE,
	BG,
	CY,
	CZ,
	DK,
	EE,
	FI,
	FR,
	DE,
	EL,
	GR,
	HU,
	HR,
	IE,
	IT,
	LV,
	LT,
	LU,
	MT,
	NL,
	PL,
	PT,
	RO,
	SK,
	SI,
	ES,
	SE;
	
	public String value()
	{
		return this.name();
	}
	
	public static BzstCesopMSCountryCodeTypeEnum fromValue(final String v)
	{
		return valueOf(v);
	}
}
