/*
* 
*/
package DataWebDeskDSL.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class RedSocialMostradaItemSemanticEditPolicy
		extends DataWebDeskDSL.diagram.edit.policies.DataWebDeskDSLBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public RedSocialMostradaItemSemanticEditPolicy() {
		super(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RedSocialMostrada_4006);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
