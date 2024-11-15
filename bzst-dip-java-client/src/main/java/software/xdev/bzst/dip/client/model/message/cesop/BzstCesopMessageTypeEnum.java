package software.xdev.bzst.dip.client.model.message.cesop;

public enum BzstCesopMessageTypeEnum
{
	/**
	 * The message type is 'Payment data' (or 'No Payment data').
	 */
	PMT,
	
	/**
	 * The message type is 'Validation result message'.
	 */
	VLD;
	
	public String value()
	{
		return this.name();
	}
}
