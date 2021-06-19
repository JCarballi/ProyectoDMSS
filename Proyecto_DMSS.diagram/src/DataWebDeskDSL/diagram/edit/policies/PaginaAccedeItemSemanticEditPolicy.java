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
public class PaginaAccedeItemSemanticEditPolicy
		extends DataWebDeskDSL.diagram.edit.policies.DataWebDeskDSLBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PaginaAccedeItemSemanticEditPolicy() {
		super(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PaginaAccede_4001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
