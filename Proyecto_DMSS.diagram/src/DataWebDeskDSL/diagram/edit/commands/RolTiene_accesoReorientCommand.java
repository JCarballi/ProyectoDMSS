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
public class RolTiene_accesoReorientCommand extends EditElementCommand {

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
	public RolTiene_accesoReorientCommand(ReorientReferenceRelationshipRequest request) {
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
		if (false == referenceOwner instanceof DataWebDeskDSL.Rol) {
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
		if (!(oldEnd instanceof DataWebDeskDSL.Pagina && newEnd instanceof DataWebDeskDSL.Rol)) {
			return false;
		}
		return DataWebDeskDSL.diagram.edit.policies.DataWebDeskDSLBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistRolTiene_acceso_4005(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof DataWebDeskDSL.Pagina && newEnd instanceof DataWebDeskDSL.Pagina)) {
			return false;
		}
		return DataWebDeskDSL.diagram.edit.policies.DataWebDeskDSLBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistRolTiene_acceso_4005(getOldSource(), getNewTarget());
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
		getOldSource().getTiene_acceso().remove(getOldTarget());
		getNewSource().getTiene_acceso().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getTiene_acceso().remove(getOldTarget());
		getOldSource().getTiene_acceso().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected DataWebDeskDSL.Rol getOldSource() {
		return (DataWebDeskDSL.Rol) referenceOwner;
	}

	/**
	* @generated
	*/
	protected DataWebDeskDSL.Rol getNewSource() {
		return (DataWebDeskDSL.Rol) newEnd;
	}

	/**
	* @generated
	*/
	protected DataWebDeskDSL.Pagina getOldTarget() {
		return (DataWebDeskDSL.Pagina) oldEnd;
	}

	/**
	* @generated
	*/
	protected DataWebDeskDSL.Pagina getNewTarget() {
		return (DataWebDeskDSL.Pagina) newEnd;
	}
}
