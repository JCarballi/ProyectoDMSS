/*
* 
*/
package DataWebDeskDSL.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class EntidadEntidadCaracteristicaCompartmentItemSemanticEditPolicy
		extends DataWebDeskDSL.diagram.edit.policies.DataWebDeskDSLBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public EntidadEntidadCaracteristicaCompartmentItemSemanticEditPolicy() {
		super(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Entidad_2013);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.CaracteristicaEntidad_3001 == req
				.getElementType()) {
			return getGEFWrapper(new DataWebDeskDSL.diagram.edit.commands.CaracteristicaEntidadCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
