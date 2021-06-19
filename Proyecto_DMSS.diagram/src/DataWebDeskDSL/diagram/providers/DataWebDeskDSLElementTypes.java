/*
 * 
 */
package DataWebDeskDSL.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class DataWebDeskDSLElementTypes {

	/**
	* @generated
	*/
	private DataWebDeskDSLElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			DataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType DataWebDesk_1000 = getElementType("Proyecto_DMSS.diagram.DataWebDesk_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PagCrear_2001 = getElementType("Proyecto_DMSS.diagram.PagCrear_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PagLeer_2002 = getElementType("Proyecto_DMSS.diagram.PagLeer_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PagBorrar_2003 = getElementType("Proyecto_DMSS.diagram.PagBorrar_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PagActualizar_2004 = getElementType("Proyecto_DMSS.diagram.PagActualizar_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PagIndice_2005 = getElementType("Proyecto_DMSS.diagram.PagIndice_2005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CRUD_2006 = getElementType("Proyecto_DMSS.diagram.CRUD_2006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PaginasNormales_2007 = getElementType(
			"Proyecto_DMSS.diagram.PaginasNormales_2007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PaginaPrincipal_2008 = getElementType(
			"Proyecto_DMSS.diagram.PaginaPrincipal_2008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Twitter_2009 = getElementType("Proyecto_DMSS.diagram.Twitter_2009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Facebook_2010 = getElementType("Proyecto_DMSS.diagram.Facebook_2010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RSS_2011 = getElementType("Proyecto_DMSS.diagram.RSS_2011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Rol_2012 = getElementType("Proyecto_DMSS.diagram.Rol_2012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Entidad_2013 = getElementType("Proyecto_DMSS.diagram.Entidad_2013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType URLExterna_2014 = getElementType("Proyecto_DMSS.diagram.URLExterna_2014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CaracteristicaEntidad_3001 = getElementType(
			"Proyecto_DMSS.diagram.CaracteristicaEntidad_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PaginaAccede_4001 = getElementType("Proyecto_DMSS.diagram.PaginaAccede_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType EntidadAsociada_4002 = getElementType(
			"Proyecto_DMSS.diagram.EntidadAsociada_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType EntidadClave_primaria_4003 = getElementType(
			"Proyecto_DMSS.diagram.EntidadClave_primaria_4003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType EntidadRelacionada_4004 = getElementType(
			"Proyecto_DMSS.diagram.EntidadRelacionada_4004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RolTiene_acceso_4005 = getElementType(
			"Proyecto_DMSS.diagram.RolTiene_acceso_4005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RedSocialMostrada_4006 = getElementType(
			"Proyecto_DMSS.diagram.RedSocialMostrada_4006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType URLExternaPagina_4007 = getElementType(
			"Proyecto_DMSS.diagram.URLExternaPagina_4007"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(DataWebDesk_1000, DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getDataWebDesk());

			elements.put(PagCrear_2001, DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPagCrear());

			elements.put(PagLeer_2002, DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPagLeer());

			elements.put(PagBorrar_2003, DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPagBorrar());

			elements.put(PagActualizar_2004, DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPagActualizar());

			elements.put(PagIndice_2005, DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPagIndice());

			elements.put(CRUD_2006, DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getCRUD());

			elements.put(PaginasNormales_2007, DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPaginasNormales());

			elements.put(PaginaPrincipal_2008, DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPaginaPrincipal());

			elements.put(Twitter_2009, DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getTwitter());

			elements.put(Facebook_2010, DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getFacebook());

			elements.put(RSS_2011, DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getRSS());

			elements.put(Rol_2012, DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getRol());

			elements.put(Entidad_2013, DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getEntidad());

			elements.put(URLExterna_2014, DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getURLExterna());

			elements.put(CaracteristicaEntidad_3001,
					DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getCaracteristicaEntidad());

			elements.put(PaginaAccede_4001, DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPagina_Accede());

			elements.put(EntidadAsociada_4002, DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getEntidad_Asociada());

			elements.put(EntidadClave_primaria_4003,
					DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getEntidad_Clave_primaria());

			elements.put(EntidadRelacionada_4004,
					DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getEntidad_Relacionada());

			elements.put(RolTiene_acceso_4005, DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getRol_Tiene_acceso());

			elements.put(RedSocialMostrada_4006,
					DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getRedSocial_Mostrada());

			elements.put(URLExternaPagina_4007, DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getURLExterna_Pagina());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(DataWebDesk_1000);
			KNOWN_ELEMENT_TYPES.add(PagCrear_2001);
			KNOWN_ELEMENT_TYPES.add(PagLeer_2002);
			KNOWN_ELEMENT_TYPES.add(PagBorrar_2003);
			KNOWN_ELEMENT_TYPES.add(PagActualizar_2004);
			KNOWN_ELEMENT_TYPES.add(PagIndice_2005);
			KNOWN_ELEMENT_TYPES.add(CRUD_2006);
			KNOWN_ELEMENT_TYPES.add(PaginasNormales_2007);
			KNOWN_ELEMENT_TYPES.add(PaginaPrincipal_2008);
			KNOWN_ELEMENT_TYPES.add(Twitter_2009);
			KNOWN_ELEMENT_TYPES.add(Facebook_2010);
			KNOWN_ELEMENT_TYPES.add(RSS_2011);
			KNOWN_ELEMENT_TYPES.add(Rol_2012);
			KNOWN_ELEMENT_TYPES.add(Entidad_2013);
			KNOWN_ELEMENT_TYPES.add(URLExterna_2014);
			KNOWN_ELEMENT_TYPES.add(CaracteristicaEntidad_3001);
			KNOWN_ELEMENT_TYPES.add(PaginaAccede_4001);
			KNOWN_ELEMENT_TYPES.add(EntidadAsociada_4002);
			KNOWN_ELEMENT_TYPES.add(EntidadClave_primaria_4003);
			KNOWN_ELEMENT_TYPES.add(EntidadRelacionada_4004);
			KNOWN_ELEMENT_TYPES.add(RolTiene_acceso_4005);
			KNOWN_ELEMENT_TYPES.add(RedSocialMostrada_4006);
			KNOWN_ELEMENT_TYPES.add(URLExternaPagina_4007);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case DataWebDeskDSL.diagram.edit.parts.DataWebDeskEditPart.VISUAL_ID:
			return DataWebDesk_1000;
		case DataWebDeskDSL.diagram.edit.parts.PagCrearEditPart.VISUAL_ID:
			return PagCrear_2001;
		case DataWebDeskDSL.diagram.edit.parts.PagLeerEditPart.VISUAL_ID:
			return PagLeer_2002;
		case DataWebDeskDSL.diagram.edit.parts.PagBorrarEditPart.VISUAL_ID:
			return PagBorrar_2003;
		case DataWebDeskDSL.diagram.edit.parts.PagActualizarEditPart.VISUAL_ID:
			return PagActualizar_2004;
		case DataWebDeskDSL.diagram.edit.parts.PagIndiceEditPart.VISUAL_ID:
			return PagIndice_2005;
		case DataWebDeskDSL.diagram.edit.parts.CRUDEditPart.VISUAL_ID:
			return CRUD_2006;
		case DataWebDeskDSL.diagram.edit.parts.PaginasNormalesEditPart.VISUAL_ID:
			return PaginasNormales_2007;
		case DataWebDeskDSL.diagram.edit.parts.PaginaPrincipalEditPart.VISUAL_ID:
			return PaginaPrincipal_2008;
		case DataWebDeskDSL.diagram.edit.parts.TwitterEditPart.VISUAL_ID:
			return Twitter_2009;
		case DataWebDeskDSL.diagram.edit.parts.FacebookEditPart.VISUAL_ID:
			return Facebook_2010;
		case DataWebDeskDSL.diagram.edit.parts.RSSEditPart.VISUAL_ID:
			return RSS_2011;
		case DataWebDeskDSL.diagram.edit.parts.RolEditPart.VISUAL_ID:
			return Rol_2012;
		case DataWebDeskDSL.diagram.edit.parts.EntidadEditPart.VISUAL_ID:
			return Entidad_2013;
		case DataWebDeskDSL.diagram.edit.parts.URLExternaEditPart.VISUAL_ID:
			return URLExterna_2014;
		case DataWebDeskDSL.diagram.edit.parts.CaracteristicaEntidadEditPart.VISUAL_ID:
			return CaracteristicaEntidad_3001;
		case DataWebDeskDSL.diagram.edit.parts.PaginaAccedeEditPart.VISUAL_ID:
			return PaginaAccede_4001;
		case DataWebDeskDSL.diagram.edit.parts.EntidadAsociadaEditPart.VISUAL_ID:
			return EntidadAsociada_4002;
		case DataWebDeskDSL.diagram.edit.parts.EntidadClave_primariaEditPart.VISUAL_ID:
			return EntidadClave_primaria_4003;
		case DataWebDeskDSL.diagram.edit.parts.EntidadRelacionadaEditPart.VISUAL_ID:
			return EntidadRelacionada_4004;
		case DataWebDeskDSL.diagram.edit.parts.RolTiene_accesoEditPart.VISUAL_ID:
			return RolTiene_acceso_4005;
		case DataWebDeskDSL.diagram.edit.parts.RedSocialMostradaEditPart.VISUAL_ID:
			return RedSocialMostrada_4006;
		case DataWebDeskDSL.diagram.edit.parts.URLExternaPaginaEditPart.VISUAL_ID:
			return URLExternaPagina_4007;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.getElement(elementTypeAdapter);
		}
	};

}
