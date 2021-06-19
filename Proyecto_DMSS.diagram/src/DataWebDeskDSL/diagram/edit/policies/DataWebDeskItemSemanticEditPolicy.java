/*
* 
*/
package DataWebDeskDSL.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class DataWebDeskItemSemanticEditPolicy
		extends DataWebDeskDSL.diagram.edit.policies.DataWebDeskDSLBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DataWebDeskItemSemanticEditPolicy() {
		super(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.DataWebDesk_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagCrear_2001 == req.getElementType()) {
			return getGEFWrapper(new DataWebDeskDSL.diagram.edit.commands.PagCrearCreateCommand(req));
		}
		if (DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagLeer_2002 == req.getElementType()) {
			return getGEFWrapper(new DataWebDeskDSL.diagram.edit.commands.PagLeerCreateCommand(req));
		}
		if (DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagBorrar_2003 == req.getElementType()) {
			return getGEFWrapper(new DataWebDeskDSL.diagram.edit.commands.PagBorrarCreateCommand(req));
		}
		if (DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagActualizar_2004 == req.getElementType()) {
			return getGEFWrapper(new DataWebDeskDSL.diagram.edit.commands.PagActualizarCreateCommand(req));
		}
		if (DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagIndice_2005 == req.getElementType()) {
			return getGEFWrapper(new DataWebDeskDSL.diagram.edit.commands.PagIndiceCreateCommand(req));
		}
		if (DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.CRUD_2006 == req.getElementType()) {
			return getGEFWrapper(new DataWebDeskDSL.diagram.edit.commands.CRUDCreateCommand(req));
		}
		if (DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PaginasNormales_2007 == req.getElementType()) {
			return getGEFWrapper(new DataWebDeskDSL.diagram.edit.commands.PaginasNormalesCreateCommand(req));
		}
		if (DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PaginaPrincipal_2008 == req.getElementType()) {
			return getGEFWrapper(new DataWebDeskDSL.diagram.edit.commands.PaginaPrincipalCreateCommand(req));
		}
		if (DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Twitter_2009 == req.getElementType()) {
			return getGEFWrapper(new DataWebDeskDSL.diagram.edit.commands.TwitterCreateCommand(req));
		}
		if (DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Facebook_2010 == req.getElementType()) {
			return getGEFWrapper(new DataWebDeskDSL.diagram.edit.commands.FacebookCreateCommand(req));
		}
		if (DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RSS_2011 == req.getElementType()) {
			return getGEFWrapper(new DataWebDeskDSL.diagram.edit.commands.RSSCreateCommand(req));
		}
		if (DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Rol_2012 == req.getElementType()) {
			return getGEFWrapper(new DataWebDeskDSL.diagram.edit.commands.RolCreateCommand(req));
		}
		if (DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Entidad_2013 == req.getElementType()) {
			return getGEFWrapper(new DataWebDeskDSL.diagram.edit.commands.EntidadCreateCommand(req));
		}
		if (DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.URLExterna_2014 == req.getElementType()) {
			return getGEFWrapper(new DataWebDeskDSL.diagram.edit.commands.URLExternaCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
