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
public class DataWebDeskDSLModelingAssistantProviderOfPaginasNormalesEditPart
		extends DataWebDeskDSL.diagram.providers.DataWebDeskDSLModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((DataWebDeskDSL.diagram.edit.parts.PaginasNormalesEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(DataWebDeskDSL.diagram.edit.parts.PaginasNormalesEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PaginaAccede_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(DataWebDeskDSL.diagram.edit.parts.PaginasNormalesEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			DataWebDeskDSL.diagram.edit.parts.PaginasNormalesEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof DataWebDeskDSL.diagram.edit.parts.PagCrearEditPart) {
			types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PaginaAccede_4001);
		}
		if (targetEditPart instanceof DataWebDeskDSL.diagram.edit.parts.PagLeerEditPart) {
			types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PaginaAccede_4001);
		}
		if (targetEditPart instanceof DataWebDeskDSL.diagram.edit.parts.PagBorrarEditPart) {
			types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PaginaAccede_4001);
		}
		if (targetEditPart instanceof DataWebDeskDSL.diagram.edit.parts.PagActualizarEditPart) {
			types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PaginaAccede_4001);
		}
		if (targetEditPart instanceof DataWebDeskDSL.diagram.edit.parts.PagIndiceEditPart) {
			types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PaginaAccede_4001);
		}
		if (targetEditPart instanceof DataWebDeskDSL.diagram.edit.parts.CRUDEditPart) {
			types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PaginaAccede_4001);
		}
		if (targetEditPart instanceof DataWebDeskDSL.diagram.edit.parts.PaginasNormalesEditPart) {
			types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PaginaAccede_4001);
		}
		if (targetEditPart instanceof DataWebDeskDSL.diagram.edit.parts.PaginaPrincipalEditPart) {
			types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PaginaAccede_4001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((DataWebDeskDSL.diagram.edit.parts.PaginasNormalesEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(DataWebDeskDSL.diagram.edit.parts.PaginasNormalesEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PaginaAccede_4001) {
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

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((DataWebDeskDSL.diagram.edit.parts.PaginasNormalesEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(DataWebDeskDSL.diagram.edit.parts.PaginasNormalesEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PaginaAccede_4001);
		types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RolTiene_acceso_4005);
		types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RedSocialMostrada_4006);
		types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.URLExternaPagina_4007);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((DataWebDeskDSL.diagram.edit.parts.PaginasNormalesEditPart) targetEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(DataWebDeskDSL.diagram.edit.parts.PaginasNormalesEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PaginaAccede_4001) {
			types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagCrear_2001);
			types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagLeer_2002);
			types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagBorrar_2003);
			types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagActualizar_2004);
			types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagIndice_2005);
			types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.CRUD_2006);
			types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PaginasNormales_2007);
			types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PaginaPrincipal_2008);
		} else if (relationshipType == DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RolTiene_acceso_4005) {
			types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Rol_2012);
		} else if (relationshipType == DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RedSocialMostrada_4006) {
			types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Twitter_2009);
			types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Facebook_2010);
			types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RSS_2011);
		} else if (relationshipType == DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.URLExternaPagina_4007) {
			types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.URLExterna_2014);
		}
		return types;
	}

}
