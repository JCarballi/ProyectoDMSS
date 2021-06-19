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
public class RolTiene_accesoItemSemanticEditPolicy
		extends DataWebDeskDSL.diagram.edit.policies.DataWebDeskDSLBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public RolTiene_accesoItemSemanticEditPolicy() {
		super(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RolTiene_acceso_4005);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
