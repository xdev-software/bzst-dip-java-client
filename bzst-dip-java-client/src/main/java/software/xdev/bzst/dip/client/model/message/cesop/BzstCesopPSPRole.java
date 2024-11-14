package software.xdev.bzst.dip.client.model.message.cesop;

/**
 * @param pspRoleType The designation of the role of te payment service provider with a term from the catalog of
 *                    possible payment methods {@link BzstCesopPSPRoleTypeEnum}
 */
public record BzstCesopPSPRole(BzstCesopPSPRoleTypeEnum pspRoleType)
{
}
