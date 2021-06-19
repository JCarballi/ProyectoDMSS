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
public class URLExternaPaginaReorientCommand extends EditElementCommand {

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
	public URLExternaPaginaReorientCommand(ReorientReferenceRelationshipRequest request) {
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
		if (false == referenceOwner instanceof DataWebDeskDSL.URLExterna) {
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
		if (!(oldEnd instanceof DataWebDeskDSL.Pagina && newEnd instanceof DataWebDeskDSL.URLExterna)) {
			return false;
		}
		return DataWebDeskDSL.diagram.edit.policies.DataWebDeskDSLBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistURLExternaPagina_4007(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof DataWebDeskDSL.Pagina && newEnd instanceof DataWebDeskDSL.Pagina)) {
			return false;
		}
		return DataWebDeskDSL.diagram.edit.policies.DataWebDeskDSLBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistURLExternaPagina_4007(getOldSource(), getNewTarget());
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
		getOldSource().getPagina().remove(getOldTarget());
		getNewSource().getPagina().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getPagina().remove(getOldTarget());
		getOldSource().getPagina().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected DataWebDeskDSL.URLExterna getOldSource() {
		return (DataWebDeskDSL.URLExterna) referenceOwner;
	}

	/**
	* @generated
	*/
	protected DataWebDeskDSL.URLExterna getNewSource() {
		return (DataWebDeskDSL.URLExterna) newEnd;
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
