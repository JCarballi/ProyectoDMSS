/*
 * 
 */
package DataWebDeskDSL.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class DataWebDeskDSLModelingAssistantProviderOfFacebookEditPart
		extends DataWebDeskDSL.diagram.providers.DataWebDeskDSLModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((DataWebDeskDSL.diagram.edit.parts.FacebookEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(DataWebDeskDSL.diagram.edit.parts.FacebookEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RedSocialMostrada_4006);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((DataWebDeskDSL.diagram.edit.parts.FacebookEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(DataWebDeskDSL.diagram.edit.parts.FacebookEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof DataWebDeskDSL.diagram.edit.parts.PagCrearEditPart) {
			types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RedSocialMostrada_4006);
		}
		if (targetEditPart instanceof DataWebDeskDSL.diagram.edit.parts.PagLeerEditPart) {
			types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RedSocialMostrada_4006);
		}
		if (targetEditPart instanceof DataWebDeskDSL.diagram.edit.parts.PagBorrarEditPart) {
			types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RedSocialMostrada_4006);
		}
		if (targetEditPart instanceof DataWebDeskDSL.diagram.edit.parts.PagActualizarEditPart) {
			types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RedSocialMostrada_4006);
		}
		if (targetEditPart instanceof DataWebDeskDSL.diagram.edit.parts.PagIndiceEditPart) {
			types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RedSocialMostrada_4006);
		}
		if (targetEditPart instanceof DataWebDeskDSL.diagram.edit.parts.CRUDEditPart) {
			types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RedSocialMostrada_4006);
		}
		if (targetEditPart instanceof DataWebDeskDSL.diagram.edit.parts.PaginasNormalesEditPart) {
			types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RedSocialMostrada_4006);
		}
		if (targetEditPart instanceof DataWebDeskDSL.diagram.edit.parts.PaginaPrincipalEditPart) {
			types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RedSocialMostrada_4006);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((DataWebDeskDSL.diagram.edit.parts.FacebookEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(DataWebDeskDSL.diagram.edit.parts.FacebookEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RedSocialMostrada_4006) {
			types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagCrear_2001);
			types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagLeer_2002);
			types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagBorrar_2003);
			types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagActualizar_2004);
			types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagIndice_2005);
			types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.CRUD_2006);
			types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PaginasNormales_2007);
			types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PaginaPrincipal_2008);
		}
		return types;
	}

}
