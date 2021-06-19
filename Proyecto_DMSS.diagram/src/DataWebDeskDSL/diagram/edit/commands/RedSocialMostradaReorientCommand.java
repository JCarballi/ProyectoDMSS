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
public class RedSocialMostradaReorientCommand extends EditElementCommand {

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
	public RedSocialMostradaReorientCommand(ReorientReferenceRelationshipRequest request) {
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
		if (false == referenceOwner instanceof DataWebDeskDSL.RedSocial) {
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
		if (!(oldEnd instanceof DataWebDeskDSL.Pagina && newEnd instanceof DataWebDeskDSL.RedSocial)) {
			return false;
		}
		return DataWebDeskDSL.diagram.edit.policies.DataWebDeskDSLBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistRedSocialMostrada_4006(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof DataWebDeskDSL.Pagina && newEnd instanceof DataWebDeskDSL.Pagina)) {
			return false;
		}
		return DataWebDeskDSL.diagram.edit.policies.DataWebDeskDSLBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistRedSocialMostrada_4006(getOldSource(), getNewTarget());
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
		getOldSource().getMostrada().remove(getOldTarget());
		getNewSource().getMostrada().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getMostrada().remove(getOldTarget());
		getOldSource().getMostrada().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected DataWebDeskDSL.RedSocial getOldSource() {
		return (DataWebDeskDSL.RedSocial) referenceOwner;
	}

	/**
	* @generated
	*/
	protected DataWebDeskDSL.RedSocial getNewSource() {
		return (DataWebDeskDSL.RedSocial) newEnd;
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
