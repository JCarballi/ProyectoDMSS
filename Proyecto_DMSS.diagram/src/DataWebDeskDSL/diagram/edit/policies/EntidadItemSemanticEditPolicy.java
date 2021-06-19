/*
* 
*/
package DataWebDeskDSL.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class EntidadItemSemanticEditPolicy
		extends DataWebDeskDSL.diagram.edit.policies.DataWebDeskDSLBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public EntidadItemSemanticEditPolicy() {
		super(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Entidad_2013);
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
			if (DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getVisualID(
					incomingLink) == DataWebDeskDSL.diagram.edit.parts.EntidadRelacionadaEditPart.VISUAL_ID) {
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
					.getVisualID(outgoingLink) == DataWebDeskDSL.diagram.edit.parts.EntidadAsociadaEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getVisualID(
					outgoingLink) == DataWebDeskDSL.diagram.edit.parts.EntidadClave_primariaEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getVisualID(
					outgoingLink) == DataWebDeskDSL.diagram.edit.parts.EntidadRelacionadaEditPart.VISUAL_ID) {
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
			addDestroyChildNodesCommand(cmd);
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
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getVisualID(node)) {
			case DataWebDeskDSL.diagram.edit.parts.EntidadEntidadCaracteristicaCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getVisualID(cnode)) {
					case DataWebDeskDSL.diagram.edit.parts.CaracteristicaEntidadEditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							if (DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getVisualID(
									incomingLink) == DataWebDeskDSL.diagram.edit.parts.EntidadClave_primariaEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										incomingLink.getSource().getElement(), null,
										incomingLink.getTarget().getElement(), false);
								cmd.add(new DestroyReferenceCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
								continue;
							}
						}
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
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
		if (DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntidadAsociada_4002 == req.getElementType()) {
			return getGEFWrapper(new DataWebDeskDSL.diagram.edit.commands.EntidadAsociadaCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntidadClave_primaria_4003 == req
				.getElementType()) {
			return getGEFWrapper(new DataWebDeskDSL.diagram.edit.commands.EntidadClave_primariaCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntidadRelacionada_4004 == req
				.getElementType()) {
			return getGEFWrapper(new DataWebDeskDSL.diagram.edit.commands.EntidadRelacionadaCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntidadAsociada_4002 == req.getElementType()) {
			return null;
		}
		if (DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntidadClave_primaria_4003 == req
				.getElementType()) {
			return null;
		}
		if (DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntidadRelacionada_4004 == req
				.getElementType()) {
			return getGEFWrapper(new DataWebDeskDSL.diagram.edit.commands.EntidadRelacionadaCreateCommand(req,
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
		case DataWebDeskDSL.diagram.edit.parts.EntidadAsociadaEditPart.VISUAL_ID:
			return getGEFWrapper(new DataWebDeskDSL.diagram.edit.commands.EntidadAsociadaReorientCommand(req));
		case DataWebDeskDSL.diagram.edit.parts.EntidadClave_primariaEditPart.VISUAL_ID:
			return getGEFWrapper(new DataWebDeskDSL.diagram.edit.commands.EntidadClave_primariaReorientCommand(req));
		case DataWebDeskDSL.diagram.edit.parts.EntidadRelacionadaEditPart.VISUAL_ID:
			return getGEFWrapper(new DataWebDeskDSL.diagram.edit.commands.EntidadRelacionadaReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
