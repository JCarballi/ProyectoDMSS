/*
 * 
 */
package DataWebDeskDSL.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class EntidadClave_primariaReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject referenceOwner;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public EntidadClave_primariaReorientCommand(ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == referenceOwner instanceof DataWebDeskDSL.Entidad) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof DataWebDeskDSL.CaracteristicaEntidad && newEnd instanceof DataWebDeskDSL.Entidad)) {
			return false;
		}
		return DataWebDeskDSL.diagram.edit.policies.DataWebDeskDSLBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistEntidadClave_primaria_4003(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof DataWebDeskDSL.CaracteristicaEntidad
				&& newEnd instanceof DataWebDeskDSL.CaracteristicaEntidad)) {
			return false;
		}
		return DataWebDeskDSL.diagram.edit.policies.DataWebDeskDSLBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistEntidadClave_primaria_4003(getOldSource(), getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().setClave_primaria(null);
		getNewSource().setClave_primaria(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().setClave_primaria(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected DataWebDeskDSL.Entidad getOldSource() {
		return (DataWebDeskDSL.Entidad) referenceOwner;
	}

	/**
	* @generated
	*/
	protected DataWebDeskDSL.Entidad getNewSource() {
		return (DataWebDeskDSL.Entidad) newEnd;
	}

	/**
	* @generated
	*/
	protected DataWebDeskDSL.CaracteristicaEntidad getOldTarget() {
		return (DataWebDeskDSL.CaracteristicaEntidad) oldEnd;
	}

	/**
	* @generated
	*/
	protected DataWebDeskDSL.CaracteristicaEntidad getNewTarget() {
		return (DataWebDeskDSL.CaracteristicaEntidad) newEnd;
	}
}
