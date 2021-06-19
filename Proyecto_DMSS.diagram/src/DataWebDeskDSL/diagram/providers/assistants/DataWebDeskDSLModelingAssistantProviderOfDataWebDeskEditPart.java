/*
 * 
 */
package DataWebDeskDSL.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class DataWebDeskDSLModelingAssistantProviderOfDataWebDeskEditPart
		extends DataWebDeskDSL.diagram.providers.DataWebDeskDSLModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(14);
		types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagCrear_2001);
		types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagLeer_2002);
		types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagBorrar_2003);
		types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagActualizar_2004);
		types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagIndice_2005);
		types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.CRUD_2006);
		types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PaginasNormales_2007);
		types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PaginaPrincipal_2008);
		types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Twitter_2009);
		types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Facebook_2010);
		types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RSS_2011);
		types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Rol_2012);
		types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Entidad_2013);
		types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.URLExterna_2014);
		return types;
	}

}
