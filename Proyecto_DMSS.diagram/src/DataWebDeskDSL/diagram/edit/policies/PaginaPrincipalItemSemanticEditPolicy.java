/*
* 
*/
package DataWebDeskDSL.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class PaginaPrincipalItemSemanticEditPolicy
		extends DataWebDeskDSL.diagram.edit.policies.DataWebDeskDSLBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PaginaPrincipalItemSemanticEditPolicy() {
		super(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PaginaPrincipal_2008);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
					.getVisualID(incomingLink) == DataWebDeskDSL.diagram.edit.parts.PaginaAccedeEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
					.getVisualID(incomingLink) == DataWebDeskDSL.diagram.edit.parts.RolTiene_accesoEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getVisualID(
					incomingLink) == DataWebDeskDSL.diagram.edit.parts.RedSocialMostradaEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getVisualID(
					incomingLink) == DataWebDeskDSL.diagram.edit.parts.URLExternaPaginaEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
					.getVisualID(outgoingLink) == DataWebDeskDSL.diagram.edit.parts.PaginaAccedeEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PaginaAccede_4001 == req.getElementType()) {
			return getGEFWrapper(new DataWebDeskDSL.diagram.edit.commands.PaginaAccedeCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RolTiene_acceso_4005 == req.getElementType()) {
			return null;
		}
		if (DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RedSocialMostrada_4006 == req
				.getElementType()) {
			return null;
		}
		if (DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.URLExternaPagina_4007 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PaginaAccede_4001 == req.getElementType()) {
			return getGEFWrapper(new DataWebDeskDSL.diagram.edit.commands.PaginaAccedeCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RolTiene_acceso_4005 == req.getElementType()) {
			return getGEFWrapper(new DataWebDeskDSL.diagram.edit.commands.RolTiene_accesoCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RedSocialMostrada_4006 == req
				.getElementType()) {
			return getGEFWrapper(new DataWebDeskDSL.diagram.edit.commands.RedSocialMostradaCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.URLExternaPagina_4007 == req.getElementType()) {
			return getGEFWrapper(new DataWebDeskDSL.diagram.edit.commands.URLExternaPaginaCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case DataWebDeskDSL.diagram.edit.parts.PaginaAccedeEditPart.VISUAL_ID:
			return getGEFWrapper(new DataWebDeskDSL.diagram.edit.commands.PaginaAccedeReorientCommand(req));
		case DataWebDeskDSL.diagram.edit.parts.RolTiene_accesoEditPart.VISUAL_ID:
			return getGEFWrapper(new DataWebDeskDSL.diagram.edit.commands.RolTiene_accesoReorientCommand(req));
		case DataWebDeskDSL.diagram.edit.parts.RedSocialMostradaEditPart.VISUAL_ID:
			return getGEFWrapper(new DataWebDeskDSL.diagram.edit.commands.RedSocialMostradaReorientCommand(req));
		case DataWebDeskDSL.diagram.edit.parts.URLExternaPaginaEditPart.VISUAL_ID:
			return getGEFWrapper(new DataWebDeskDSL.diagram.edit.commands.URLExternaPaginaReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
