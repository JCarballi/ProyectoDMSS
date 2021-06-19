/*
 * 
 */
package DataWebDeskDSL.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class DataWebDeskDSLEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getVisualID(view)) {

			case DataWebDeskDSL.diagram.edit.parts.DataWebDeskEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.DataWebDeskEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.PagCrearEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.PagCrearEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.PagCrearTituloPagEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.PagCrearTituloPagEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.PagLeerEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.PagLeerEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.PagLeerTituloPagEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.PagLeerTituloPagEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.PagBorrarEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.PagBorrarEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.PagBorrarTituloPagEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.PagBorrarTituloPagEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.PagActualizarEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.PagActualizarEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.PagActualizarTituloPagEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.PagActualizarTituloPagEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.PagIndiceEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.PagIndiceEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.PagIndiceTituloPagEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.PagIndiceTituloPagEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.CRUDEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.CRUDEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.CRUDTituloPagEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.CRUDTituloPagEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.PaginasNormalesEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.PaginasNormalesEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.PaginasNormalesTituloPagEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.PaginasNormalesTituloPagEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.PaginaPrincipalEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.PaginaPrincipalEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.PaginaPrincipalTituloPagEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.PaginaPrincipalTituloPagEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.TwitterEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.TwitterEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.TwitterNombreEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.TwitterNombreEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.FacebookEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.FacebookEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.FacebookNombreEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.FacebookNombreEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.RSSEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.RSSEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.RSSNombreEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.RSSNombreEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.RolEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.RolEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.RolNombreRolEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.RolNombreRolEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.EntidadEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.EntidadEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.EntidadNombreEntidadEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.EntidadNombreEntidadEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.URLExternaEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.URLExternaEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.URLExternaLinkEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.URLExternaLinkEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.CaracteristicaEntidadEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.CaracteristicaEntidadEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.CaracteristicaEntidadNombreCaractEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.CaracteristicaEntidadNombreCaractEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.EntidadEntidadCaracteristicaCompartmentEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.EntidadEntidadCaracteristicaCompartmentEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.PaginaAccedeEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.PaginaAccedeEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.PaginaAccedeExternalLabelEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.PaginaAccedeExternalLabelEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.EntidadAsociadaEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.EntidadAsociadaEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.EntidadAsociadaExternalLabelEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.EntidadAsociadaExternalLabelEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.EntidadClave_primariaEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.EntidadClave_primariaEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.EntidadClave_primariaExternalLabelEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.EntidadClave_primariaExternalLabelEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.EntidadRelacionadaEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.EntidadRelacionadaEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.EntidadRelacionadaExternalLabelEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.EntidadRelacionadaExternalLabelEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.RolTiene_accesoEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.RolTiene_accesoEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.RolTiene_accesoExternalLabelEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.RolTiene_accesoExternalLabelEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.RedSocialMostradaEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.RedSocialMostradaEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.RedSocialMostradaExternalLabelEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.RedSocialMostradaExternalLabelEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.URLExternaPaginaEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.URLExternaPaginaEditPart(view);

			case DataWebDeskDSL.diagram.edit.parts.URLExternaPaginaExternalLabelEditPart.VISUAL_ID:
				return new DataWebDeskDSL.diagram.edit.parts.URLExternaPaginaExternalLabelEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
