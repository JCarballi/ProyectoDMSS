/*
* 
*/
package DataWebDeskDSL.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class DataWebDeskDSLNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		DataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		DataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem
				&& !isOwnView(((DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup) {
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup group = (DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup) element;
			return DataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem) {
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem navigatorItem = (DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getVisualID(view)) {
		case DataWebDeskDSL.diagram.edit.parts.DataWebDeskEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://DataWebDeskDSL.com?DataWebDesk", //$NON-NLS-1$
					DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.DataWebDesk_1000);
		case DataWebDeskDSL.diagram.edit.parts.PagCrearEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://DataWebDeskDSL.com?PagCrear", //$NON-NLS-1$
					DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagCrear_2001);
		case DataWebDeskDSL.diagram.edit.parts.PagLeerEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://DataWebDeskDSL.com?PagLeer", //$NON-NLS-1$
					DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagLeer_2002);
		case DataWebDeskDSL.diagram.edit.parts.PagBorrarEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://DataWebDeskDSL.com?PagBorrar", //$NON-NLS-1$
					DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagBorrar_2003);
		case DataWebDeskDSL.diagram.edit.parts.PagActualizarEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://DataWebDeskDSL.com?PagActualizar", //$NON-NLS-1$
					DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagActualizar_2004);
		case DataWebDeskDSL.diagram.edit.parts.PagIndiceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://DataWebDeskDSL.com?PagIndice", //$NON-NLS-1$
					DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagIndice_2005);
		case DataWebDeskDSL.diagram.edit.parts.CRUDEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://DataWebDeskDSL.com?CRUD", //$NON-NLS-1$
					DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.CRUD_2006);
		case DataWebDeskDSL.diagram.edit.parts.PaginasNormalesEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://DataWebDeskDSL.com?PaginasNormales", //$NON-NLS-1$
					DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PaginasNormales_2007);
		case DataWebDeskDSL.diagram.edit.parts.PaginaPrincipalEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://DataWebDeskDSL.com?PaginaPrincipal", //$NON-NLS-1$
					DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PaginaPrincipal_2008);
		case DataWebDeskDSL.diagram.edit.parts.TwitterEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://DataWebDeskDSL.com?Twitter", //$NON-NLS-1$
					DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Twitter_2009);
		case DataWebDeskDSL.diagram.edit.parts.FacebookEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://DataWebDeskDSL.com?Facebook", //$NON-NLS-1$
					DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Facebook_2010);
		case DataWebDeskDSL.diagram.edit.parts.RSSEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://DataWebDeskDSL.com?RSS", //$NON-NLS-1$
					DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RSS_2011);
		case DataWebDeskDSL.diagram.edit.parts.RolEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://DataWebDeskDSL.com?Rol", //$NON-NLS-1$
					DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Rol_2012);
		case DataWebDeskDSL.diagram.edit.parts.EntidadEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://DataWebDeskDSL.com?Entidad", //$NON-NLS-1$
					DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Entidad_2013);
		case DataWebDeskDSL.diagram.edit.parts.URLExternaEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://DataWebDeskDSL.com?URLExterna", //$NON-NLS-1$
					DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.URLExterna_2014);
		case DataWebDeskDSL.diagram.edit.parts.CaracteristicaEntidadEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://DataWebDeskDSL.com?CaracteristicaEntidad", //$NON-NLS-1$
					DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.CaracteristicaEntidad_3001);
		case DataWebDeskDSL.diagram.edit.parts.PaginaAccedeEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://DataWebDeskDSL.com?Pagina?accede", //$NON-NLS-1$
					DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PaginaAccede_4001);
		case DataWebDeskDSL.diagram.edit.parts.EntidadAsociadaEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://DataWebDeskDSL.com?Entidad?asociada", //$NON-NLS-1$
					DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntidadAsociada_4002);
		case DataWebDeskDSL.diagram.edit.parts.EntidadClave_primariaEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://DataWebDeskDSL.com?Entidad?clave_primaria", //$NON-NLS-1$
					DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntidadClave_primaria_4003);
		case DataWebDeskDSL.diagram.edit.parts.EntidadRelacionadaEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://DataWebDeskDSL.com?Entidad?relacionada", //$NON-NLS-1$
					DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntidadRelacionada_4004);
		case DataWebDeskDSL.diagram.edit.parts.RolTiene_accesoEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://DataWebDeskDSL.com?Rol?tiene_acceso", //$NON-NLS-1$
					DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RolTiene_acceso_4005);
		case DataWebDeskDSL.diagram.edit.parts.RedSocialMostradaEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://DataWebDeskDSL.com?RedSocial?mostrada", //$NON-NLS-1$
					DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RedSocialMostrada_4006);
		case DataWebDeskDSL.diagram.edit.parts.URLExternaPaginaEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://DataWebDeskDSL.com?URLExterna?pagina", //$NON-NLS-1$
					DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.URLExternaPagina_4007);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = DataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.isKnownElementType(elementType)) {
			image = DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup) {
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup group = (DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem) {
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem navigatorItem = (DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getVisualID(view)) {
		case DataWebDeskDSL.diagram.edit.parts.DataWebDeskEditPart.VISUAL_ID:
			return getDataWebDesk_1000Text(view);
		case DataWebDeskDSL.diagram.edit.parts.PagCrearEditPart.VISUAL_ID:
			return getPagCrear_2001Text(view);
		case DataWebDeskDSL.diagram.edit.parts.PagLeerEditPart.VISUAL_ID:
			return getPagLeer_2002Text(view);
		case DataWebDeskDSL.diagram.edit.parts.PagBorrarEditPart.VISUAL_ID:
			return getPagBorrar_2003Text(view);
		case DataWebDeskDSL.diagram.edit.parts.PagActualizarEditPart.VISUAL_ID:
			return getPagActualizar_2004Text(view);
		case DataWebDeskDSL.diagram.edit.parts.PagIndiceEditPart.VISUAL_ID:
			return getPagIndice_2005Text(view);
		case DataWebDeskDSL.diagram.edit.parts.CRUDEditPart.VISUAL_ID:
			return getCRUD_2006Text(view);
		case DataWebDeskDSL.diagram.edit.parts.PaginasNormalesEditPart.VISUAL_ID:
			return getPaginasNormales_2007Text(view);
		case DataWebDeskDSL.diagram.edit.parts.PaginaPrincipalEditPart.VISUAL_ID:
			return getPaginaPrincipal_2008Text(view);
		case DataWebDeskDSL.diagram.edit.parts.TwitterEditPart.VISUAL_ID:
			return getTwitter_2009Text(view);
		case DataWebDeskDSL.diagram.edit.parts.FacebookEditPart.VISUAL_ID:
			return getFacebook_2010Text(view);
		case DataWebDeskDSL.diagram.edit.parts.RSSEditPart.VISUAL_ID:
			return getRSS_2011Text(view);
		case DataWebDeskDSL.diagram.edit.parts.RolEditPart.VISUAL_ID:
			return getRol_2012Text(view);
		case DataWebDeskDSL.diagram.edit.parts.EntidadEditPart.VISUAL_ID:
			return getEntidad_2013Text(view);
		case DataWebDeskDSL.diagram.edit.parts.URLExternaEditPart.VISUAL_ID:
			return getURLExterna_2014Text(view);
		case DataWebDeskDSL.diagram.edit.parts.CaracteristicaEntidadEditPart.VISUAL_ID:
			return getCaracteristicaEntidad_3001Text(view);
		case DataWebDeskDSL.diagram.edit.parts.PaginaAccedeEditPart.VISUAL_ID:
			return getPaginaAccede_4001Text(view);
		case DataWebDeskDSL.diagram.edit.parts.EntidadAsociadaEditPart.VISUAL_ID:
			return getEntidadAsociada_4002Text(view);
		case DataWebDeskDSL.diagram.edit.parts.EntidadClave_primariaEditPart.VISUAL_ID:
			return getEntidadClave_primaria_4003Text(view);
		case DataWebDeskDSL.diagram.edit.parts.EntidadRelacionadaEditPart.VISUAL_ID:
			return getEntidadRelacionada_4004Text(view);
		case DataWebDeskDSL.diagram.edit.parts.RolTiene_accesoEditPart.VISUAL_ID:
			return getRolTiene_acceso_4005Text(view);
		case DataWebDeskDSL.diagram.edit.parts.RedSocialMostradaEditPart.VISUAL_ID:
			return getRedSocialMostrada_4006Text(view);
		case DataWebDeskDSL.diagram.edit.parts.URLExternaPaginaEditPart.VISUAL_ID:
			return getURLExternaPagina_4007Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getDataWebDesk_1000Text(View view) {
		DataWebDeskDSL.DataWebDesk domainModelElement = (DataWebDeskDSL.DataWebDesk) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNombreAplicacion();
		} else {
			DataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPagCrear_2001Text(View view) {
		IParser parser = DataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagCrear_2001,
				view.getElement() != null ? view.getElement() : view,
				DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
						.getType(DataWebDeskDSL.diagram.edit.parts.PagCrearTituloPagEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPagLeer_2002Text(View view) {
		IParser parser = DataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagLeer_2002,
				view.getElement() != null ? view.getElement() : view,
				DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
						.getType(DataWebDeskDSL.diagram.edit.parts.PagLeerTituloPagEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPagBorrar_2003Text(View view) {
		IParser parser = DataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagBorrar_2003,
				view.getElement() != null ? view.getElement() : view,
				DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
						.getType(DataWebDeskDSL.diagram.edit.parts.PagBorrarTituloPagEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPagActualizar_2004Text(View view) {
		IParser parser = DataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagActualizar_2004,
				view.getElement() != null ? view.getElement() : view,
				DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
						.getType(DataWebDeskDSL.diagram.edit.parts.PagActualizarTituloPagEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPagIndice_2005Text(View view) {
		IParser parser = DataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagIndice_2005,
				view.getElement() != null ? view.getElement() : view,
				DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
						.getType(DataWebDeskDSL.diagram.edit.parts.PagIndiceTituloPagEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCRUD_2006Text(View view) {
		IParser parser = DataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.CRUD_2006,
				view.getElement() != null ? view.getElement() : view,
				DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
						.getType(DataWebDeskDSL.diagram.edit.parts.CRUDTituloPagEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPaginasNormales_2007Text(View view) {
		IParser parser = DataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PaginasNormales_2007,
				view.getElement() != null ? view.getElement() : view,
				DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
						.getType(DataWebDeskDSL.diagram.edit.parts.PaginasNormalesTituloPagEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPaginaPrincipal_2008Text(View view) {
		IParser parser = DataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PaginaPrincipal_2008,
				view.getElement() != null ? view.getElement() : view,
				DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
						.getType(DataWebDeskDSL.diagram.edit.parts.PaginaPrincipalTituloPagEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTwitter_2009Text(View view) {
		IParser parser = DataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Twitter_2009,
				view.getElement() != null ? view.getElement() : view,
				DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
						.getType(DataWebDeskDSL.diagram.edit.parts.TwitterNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFacebook_2010Text(View view) {
		IParser parser = DataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Facebook_2010,
				view.getElement() != null ? view.getElement() : view,
				DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
						.getType(DataWebDeskDSL.diagram.edit.parts.FacebookNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRSS_2011Text(View view) {
		IParser parser = DataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RSS_2011,
				view.getElement() != null ? view.getElement() : view,
				DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
						.getType(DataWebDeskDSL.diagram.edit.parts.RSSNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRol_2012Text(View view) {
		IParser parser = DataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Rol_2012,
				view.getElement() != null ? view.getElement() : view,
				DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
						.getType(DataWebDeskDSL.diagram.edit.parts.RolNombreRolEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEntidad_2013Text(View view) {
		IParser parser = DataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Entidad_2013,
				view.getElement() != null ? view.getElement() : view,
				DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
						.getType(DataWebDeskDSL.diagram.edit.parts.EntidadNombreEntidadEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getURLExterna_2014Text(View view) {
		IParser parser = DataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.URLExterna_2014,
				view.getElement() != null ? view.getElement() : view,
				DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
						.getType(DataWebDeskDSL.diagram.edit.parts.URLExternaNombreWebEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCaracteristicaEntidad_3001Text(View view) {
		IParser parser = DataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.CaracteristicaEntidad_3001,
				view.getElement() != null ? view.getElement() : view,
				DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
						DataWebDeskDSL.diagram.edit.parts.CaracteristicaEntidadNombreCaractEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPaginaAccede_4001Text(View view) {
		IParser parser = DataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PaginaAccede_4001,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEntidadAsociada_4002Text(View view) {
		IParser parser = DataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntidadAsociada_4002,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEntidadClave_primaria_4003Text(View view) {
		IParser parser = DataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntidadClave_primaria_4003,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEntidadRelacionada_4004Text(View view) {
		IParser parser = DataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntidadRelacionada_4004,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRolTiene_acceso_4005Text(View view) {
		IParser parser = DataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RolTiene_acceso_4005,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRedSocialMostrada_4006Text(View view) {
		IParser parser = DataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RedSocialMostrada_4006,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getURLExternaPagina_4007Text(View view) {
		IParser parser = DataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.URLExternaPagina_4007,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return DataWebDeskDSL.diagram.edit.parts.DataWebDeskEditPart.MODEL_ID
				.equals(DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getModelID(view));
	}

}
