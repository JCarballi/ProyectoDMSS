/*
* 
*/
package DataWebDeskDSL.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class DataWebDeskDSLDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> getSemanticChildren(View view) {
		switch (DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getVisualID(view)) {
		case DataWebDeskDSL.diagram.edit.parts.DataWebDeskEditPart.VISUAL_ID:
			return getDataWebDesk_1000SemanticChildren(view);
		case DataWebDeskDSL.diagram.edit.parts.EntidadEntidadCaracteristicaCompartmentEditPart.VISUAL_ID:
			return getEntidadEntidadCaracteristicaCompartment_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> getDataWebDesk_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		DataWebDeskDSL.DataWebDesk modelElement = (DataWebDeskDSL.DataWebDesk) view.getElement();
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPagina().iterator(); it.hasNext();) {
			DataWebDeskDSL.Pagina childElement = (DataWebDeskDSL.Pagina) it.next();
			int visualID = DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DataWebDeskDSL.diagram.edit.parts.PagCrearEditPart.VISUAL_ID) {
				result.add(new DataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataWebDeskDSL.diagram.edit.parts.PagLeerEditPart.VISUAL_ID) {
				result.add(new DataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataWebDeskDSL.diagram.edit.parts.PagBorrarEditPart.VISUAL_ID) {
				result.add(new DataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataWebDeskDSL.diagram.edit.parts.PagActualizarEditPart.VISUAL_ID) {
				result.add(new DataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataWebDeskDSL.diagram.edit.parts.PagIndiceEditPart.VISUAL_ID) {
				result.add(new DataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataWebDeskDSL.diagram.edit.parts.CRUDEditPart.VISUAL_ID) {
				result.add(new DataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataWebDeskDSL.diagram.edit.parts.PaginasNormalesEditPart.VISUAL_ID) {
				result.add(new DataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataWebDeskDSL.diagram.edit.parts.PaginaPrincipalEditPart.VISUAL_ID) {
				result.add(new DataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRedsocial().iterator(); it.hasNext();) {
			DataWebDeskDSL.RedSocial childElement = (DataWebDeskDSL.RedSocial) it.next();
			int visualID = DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DataWebDeskDSL.diagram.edit.parts.TwitterEditPart.VISUAL_ID) {
				result.add(new DataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataWebDeskDSL.diagram.edit.parts.FacebookEditPart.VISUAL_ID) {
				result.add(new DataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataWebDeskDSL.diagram.edit.parts.RSSEditPart.VISUAL_ID) {
				result.add(new DataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRol().iterator(); it.hasNext();) {
			DataWebDeskDSL.Rol childElement = (DataWebDeskDSL.Rol) it.next();
			int visualID = DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DataWebDeskDSL.diagram.edit.parts.RolEditPart.VISUAL_ID) {
				result.add(new DataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getEntidad().iterator(); it.hasNext();) {
			DataWebDeskDSL.Entidad childElement = (DataWebDeskDSL.Entidad) it.next();
			int visualID = DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DataWebDeskDSL.diagram.edit.parts.EntidadEditPart.VISUAL_ID) {
				result.add(new DataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getUrlexterna().iterator(); it.hasNext();) {
			DataWebDeskDSL.URLExterna childElement = (DataWebDeskDSL.URLExterna) it.next();
			int visualID = DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DataWebDeskDSL.diagram.edit.parts.URLExternaEditPart.VISUAL_ID) {
				result.add(new DataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> getEntidadEntidadCaracteristicaCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		DataWebDeskDSL.Entidad modelElement = (DataWebDeskDSL.Entidad) containerView.getElement();
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCaracteristica().iterator(); it.hasNext();) {
			DataWebDeskDSL.CaracteristicaEntidad childElement = (DataWebDeskDSL.CaracteristicaEntidad) it.next();
			int visualID = DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DataWebDeskDSL.diagram.edit.parts.CaracteristicaEntidadEditPart.VISUAL_ID) {
				result.add(new DataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getContainedLinks(View view) {
		switch (DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getVisualID(view)) {
		case DataWebDeskDSL.diagram.edit.parts.DataWebDeskEditPart.VISUAL_ID:
			return getDataWebDesk_1000ContainedLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.PagCrearEditPart.VISUAL_ID:
			return getPagCrear_2001ContainedLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.PagLeerEditPart.VISUAL_ID:
			return getPagLeer_2002ContainedLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.PagBorrarEditPart.VISUAL_ID:
			return getPagBorrar_2003ContainedLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.PagActualizarEditPart.VISUAL_ID:
			return getPagActualizar_2004ContainedLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.PagIndiceEditPart.VISUAL_ID:
			return getPagIndice_2005ContainedLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.CRUDEditPart.VISUAL_ID:
			return getCRUD_2006ContainedLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.PaginasNormalesEditPart.VISUAL_ID:
			return getPaginasNormales_2007ContainedLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.PaginaPrincipalEditPart.VISUAL_ID:
			return getPaginaPrincipal_2008ContainedLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.TwitterEditPart.VISUAL_ID:
			return getTwitter_2009ContainedLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.FacebookEditPart.VISUAL_ID:
			return getFacebook_2010ContainedLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.RSSEditPart.VISUAL_ID:
			return getRSS_2011ContainedLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.RolEditPart.VISUAL_ID:
			return getRol_2012ContainedLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.EntidadEditPart.VISUAL_ID:
			return getEntidad_2013ContainedLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.URLExternaEditPart.VISUAL_ID:
			return getURLExterna_2014ContainedLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.CaracteristicaEntidadEditPart.VISUAL_ID:
			return getCaracteristicaEntidad_3001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getIncomingLinks(View view) {
		switch (DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getVisualID(view)) {
		case DataWebDeskDSL.diagram.edit.parts.PagCrearEditPart.VISUAL_ID:
			return getPagCrear_2001IncomingLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.PagLeerEditPart.VISUAL_ID:
			return getPagLeer_2002IncomingLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.PagBorrarEditPart.VISUAL_ID:
			return getPagBorrar_2003IncomingLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.PagActualizarEditPart.VISUAL_ID:
			return getPagActualizar_2004IncomingLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.PagIndiceEditPart.VISUAL_ID:
			return getPagIndice_2005IncomingLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.CRUDEditPart.VISUAL_ID:
			return getCRUD_2006IncomingLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.PaginasNormalesEditPart.VISUAL_ID:
			return getPaginasNormales_2007IncomingLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.PaginaPrincipalEditPart.VISUAL_ID:
			return getPaginaPrincipal_2008IncomingLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.TwitterEditPart.VISUAL_ID:
			return getTwitter_2009IncomingLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.FacebookEditPart.VISUAL_ID:
			return getFacebook_2010IncomingLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.RSSEditPart.VISUAL_ID:
			return getRSS_2011IncomingLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.RolEditPart.VISUAL_ID:
			return getRol_2012IncomingLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.EntidadEditPart.VISUAL_ID:
			return getEntidad_2013IncomingLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.URLExternaEditPart.VISUAL_ID:
			return getURLExterna_2014IncomingLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.CaracteristicaEntidadEditPart.VISUAL_ID:
			return getCaracteristicaEntidad_3001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getOutgoingLinks(View view) {
		switch (DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getVisualID(view)) {
		case DataWebDeskDSL.diagram.edit.parts.PagCrearEditPart.VISUAL_ID:
			return getPagCrear_2001OutgoingLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.PagLeerEditPart.VISUAL_ID:
			return getPagLeer_2002OutgoingLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.PagBorrarEditPart.VISUAL_ID:
			return getPagBorrar_2003OutgoingLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.PagActualizarEditPart.VISUAL_ID:
			return getPagActualizar_2004OutgoingLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.PagIndiceEditPart.VISUAL_ID:
			return getPagIndice_2005OutgoingLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.CRUDEditPart.VISUAL_ID:
			return getCRUD_2006OutgoingLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.PaginasNormalesEditPart.VISUAL_ID:
			return getPaginasNormales_2007OutgoingLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.PaginaPrincipalEditPart.VISUAL_ID:
			return getPaginaPrincipal_2008OutgoingLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.TwitterEditPart.VISUAL_ID:
			return getTwitter_2009OutgoingLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.FacebookEditPart.VISUAL_ID:
			return getFacebook_2010OutgoingLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.RSSEditPart.VISUAL_ID:
			return getRSS_2011OutgoingLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.RolEditPart.VISUAL_ID:
			return getRol_2012OutgoingLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.EntidadEditPart.VISUAL_ID:
			return getEntidad_2013OutgoingLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.URLExternaEditPart.VISUAL_ID:
			return getURLExterna_2014OutgoingLinks(view);
		case DataWebDeskDSL.diagram.edit.parts.CaracteristicaEntidadEditPart.VISUAL_ID:
			return getCaracteristicaEntidad_3001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getDataWebDesk_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getPagCrear_2001ContainedLinks(
			View view) {
		DataWebDeskDSL.PagCrear modelElement = (DataWebDeskDSL.PagCrear) view.getElement();
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_Accede_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getPagLeer_2002ContainedLinks(
			View view) {
		DataWebDeskDSL.PagLeer modelElement = (DataWebDeskDSL.PagLeer) view.getElement();
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_Accede_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getPagBorrar_2003ContainedLinks(
			View view) {
		DataWebDeskDSL.PagBorrar modelElement = (DataWebDeskDSL.PagBorrar) view.getElement();
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_Accede_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getPagActualizar_2004ContainedLinks(
			View view) {
		DataWebDeskDSL.PagActualizar modelElement = (DataWebDeskDSL.PagActualizar) view.getElement();
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_Accede_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getPagIndice_2005ContainedLinks(
			View view) {
		DataWebDeskDSL.PagIndice modelElement = (DataWebDeskDSL.PagIndice) view.getElement();
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_Accede_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getCRUD_2006ContainedLinks(View view) {
		DataWebDeskDSL.CRUD modelElement = (DataWebDeskDSL.CRUD) view.getElement();
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_Accede_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getPaginasNormales_2007ContainedLinks(
			View view) {
		DataWebDeskDSL.PaginasNormales modelElement = (DataWebDeskDSL.PaginasNormales) view.getElement();
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_Accede_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getPaginaPrincipal_2008ContainedLinks(
			View view) {
		DataWebDeskDSL.PaginaPrincipal modelElement = (DataWebDeskDSL.PaginaPrincipal) view.getElement();
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_Accede_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getTwitter_2009ContainedLinks(
			View view) {
		DataWebDeskDSL.Twitter modelElement = (DataWebDeskDSL.Twitter) view.getElement();
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_RedSocial_Mostrada_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getFacebook_2010ContainedLinks(
			View view) {
		DataWebDeskDSL.Facebook modelElement = (DataWebDeskDSL.Facebook) view.getElement();
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_RedSocial_Mostrada_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getRSS_2011ContainedLinks(View view) {
		DataWebDeskDSL.RSS modelElement = (DataWebDeskDSL.RSS) view.getElement();
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_RedSocial_Mostrada_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getRol_2012ContainedLinks(View view) {
		DataWebDeskDSL.Rol modelElement = (DataWebDeskDSL.Rol) view.getElement();
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Rol_Tiene_acceso_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getEntidad_2013ContainedLinks(
			View view) {
		DataWebDeskDSL.Entidad modelElement = (DataWebDeskDSL.Entidad) view.getElement();
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Entidad_Asociada_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Entidad_Clave_primaria_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Entidad_Relacionada_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getURLExterna_2014ContainedLinks(
			View view) {
		DataWebDeskDSL.URLExterna modelElement = (DataWebDeskDSL.URLExterna) view.getElement();
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_URLExterna_Pagina_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getCaracteristicaEntidad_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getPagCrear_2001IncomingLinks(
			View view) {
		DataWebDeskDSL.PagCrear modelElement = (DataWebDeskDSL.PagCrear) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Pagina_Accede_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Entidad_Asociada_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_Tiene_acceso_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_RedSocial_Mostrada_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_URLExterna_Pagina_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getPagLeer_2002IncomingLinks(
			View view) {
		DataWebDeskDSL.PagLeer modelElement = (DataWebDeskDSL.PagLeer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Pagina_Accede_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Entidad_Asociada_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_Tiene_acceso_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_RedSocial_Mostrada_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_URLExterna_Pagina_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getPagBorrar_2003IncomingLinks(
			View view) {
		DataWebDeskDSL.PagBorrar modelElement = (DataWebDeskDSL.PagBorrar) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Pagina_Accede_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Entidad_Asociada_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_Tiene_acceso_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_RedSocial_Mostrada_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_URLExterna_Pagina_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getPagActualizar_2004IncomingLinks(
			View view) {
		DataWebDeskDSL.PagActualizar modelElement = (DataWebDeskDSL.PagActualizar) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Pagina_Accede_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Entidad_Asociada_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_Tiene_acceso_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_RedSocial_Mostrada_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_URLExterna_Pagina_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getPagIndice_2005IncomingLinks(
			View view) {
		DataWebDeskDSL.PagIndice modelElement = (DataWebDeskDSL.PagIndice) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Pagina_Accede_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Entidad_Asociada_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_Tiene_acceso_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_RedSocial_Mostrada_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_URLExterna_Pagina_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getCRUD_2006IncomingLinks(View view) {
		DataWebDeskDSL.CRUD modelElement = (DataWebDeskDSL.CRUD) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Pagina_Accede_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Entidad_Asociada_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_Tiene_acceso_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_RedSocial_Mostrada_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_URLExterna_Pagina_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getPaginasNormales_2007IncomingLinks(
			View view) {
		DataWebDeskDSL.PaginasNormales modelElement = (DataWebDeskDSL.PaginasNormales) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Pagina_Accede_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_Tiene_acceso_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_RedSocial_Mostrada_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_URLExterna_Pagina_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getPaginaPrincipal_2008IncomingLinks(
			View view) {
		DataWebDeskDSL.PaginaPrincipal modelElement = (DataWebDeskDSL.PaginaPrincipal) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Pagina_Accede_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_Tiene_acceso_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_RedSocial_Mostrada_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_URLExterna_Pagina_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getTwitter_2009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getFacebook_2010IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getRSS_2011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getRol_2012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getEntidad_2013IncomingLinks(
			View view) {
		DataWebDeskDSL.Entidad modelElement = (DataWebDeskDSL.Entidad) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Entidad_Relacionada_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getURLExterna_2014IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getCaracteristicaEntidad_3001IncomingLinks(
			View view) {
		DataWebDeskDSL.CaracteristicaEntidad modelElement = (DataWebDeskDSL.CaracteristicaEntidad) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Entidad_Clave_primaria_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getPagCrear_2001OutgoingLinks(
			View view) {
		DataWebDeskDSL.PagCrear modelElement = (DataWebDeskDSL.PagCrear) view.getElement();
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_Accede_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getPagLeer_2002OutgoingLinks(
			View view) {
		DataWebDeskDSL.PagLeer modelElement = (DataWebDeskDSL.PagLeer) view.getElement();
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_Accede_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getPagBorrar_2003OutgoingLinks(
			View view) {
		DataWebDeskDSL.PagBorrar modelElement = (DataWebDeskDSL.PagBorrar) view.getElement();
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_Accede_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getPagActualizar_2004OutgoingLinks(
			View view) {
		DataWebDeskDSL.PagActualizar modelElement = (DataWebDeskDSL.PagActualizar) view.getElement();
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_Accede_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getPagIndice_2005OutgoingLinks(
			View view) {
		DataWebDeskDSL.PagIndice modelElement = (DataWebDeskDSL.PagIndice) view.getElement();
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_Accede_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getCRUD_2006OutgoingLinks(View view) {
		DataWebDeskDSL.CRUD modelElement = (DataWebDeskDSL.CRUD) view.getElement();
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_Accede_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getPaginasNormales_2007OutgoingLinks(
			View view) {
		DataWebDeskDSL.PaginasNormales modelElement = (DataWebDeskDSL.PaginasNormales) view.getElement();
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_Accede_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getPaginaPrincipal_2008OutgoingLinks(
			View view) {
		DataWebDeskDSL.PaginaPrincipal modelElement = (DataWebDeskDSL.PaginaPrincipal) view.getElement();
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pagina_Accede_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getTwitter_2009OutgoingLinks(
			View view) {
		DataWebDeskDSL.Twitter modelElement = (DataWebDeskDSL.Twitter) view.getElement();
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_RedSocial_Mostrada_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getFacebook_2010OutgoingLinks(
			View view) {
		DataWebDeskDSL.Facebook modelElement = (DataWebDeskDSL.Facebook) view.getElement();
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_RedSocial_Mostrada_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getRSS_2011OutgoingLinks(View view) {
		DataWebDeskDSL.RSS modelElement = (DataWebDeskDSL.RSS) view.getElement();
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_RedSocial_Mostrada_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getRol_2012OutgoingLinks(View view) {
		DataWebDeskDSL.Rol modelElement = (DataWebDeskDSL.Rol) view.getElement();
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Rol_Tiene_acceso_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getEntidad_2013OutgoingLinks(
			View view) {
		DataWebDeskDSL.Entidad modelElement = (DataWebDeskDSL.Entidad) view.getElement();
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Entidad_Asociada_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Entidad_Clave_primaria_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Entidad_Relacionada_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getURLExterna_2014OutgoingLinks(
			View view) {
		DataWebDeskDSL.URLExterna modelElement = (DataWebDeskDSL.URLExterna) view.getElement();
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_URLExterna_Pagina_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getCaracteristicaEntidad_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getIncomingFeatureModelFacetLinks_Pagina_Accede_4001(
			DataWebDeskDSL.Pagina target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPagina_Accede()) {
				result.add(new DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor(setting.getEObject(), target,
						DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PaginaAccede_4001,
						DataWebDeskDSL.diagram.edit.parts.PaginaAccedeEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getIncomingFeatureModelFacetLinks_Entidad_Asociada_4002(
			DataWebDeskDSL.PagCRUD target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE
					.getEntidad_Asociada()) {
				result.add(new DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor(setting.getEObject(), target,
						DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntidadAsociada_4002,
						DataWebDeskDSL.diagram.edit.parts.EntidadAsociadaEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getIncomingFeatureModelFacetLinks_Entidad_Clave_primaria_4003(
			DataWebDeskDSL.CaracteristicaEntidad target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE
					.getEntidad_Clave_primaria()) {
				result.add(new DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor(setting.getEObject(), target,
						DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntidadClave_primaria_4003,
						DataWebDeskDSL.diagram.edit.parts.EntidadClave_primariaEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getIncomingFeatureModelFacetLinks_Entidad_Relacionada_4004(
			DataWebDeskDSL.Entidad target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE
					.getEntidad_Relacionada()) {
				result.add(new DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor(setting.getEObject(), target,
						DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntidadRelacionada_4004,
						DataWebDeskDSL.diagram.edit.parts.EntidadRelacionadaEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getIncomingFeatureModelFacetLinks_Rol_Tiene_acceso_4005(
			DataWebDeskDSL.Pagina target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE
					.getRol_Tiene_acceso()) {
				result.add(new DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor(setting.getEObject(), target,
						DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RolTiene_acceso_4005,
						DataWebDeskDSL.diagram.edit.parts.RolTiene_accesoEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getIncomingFeatureModelFacetLinks_RedSocial_Mostrada_4006(
			DataWebDeskDSL.Pagina target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE
					.getRedSocial_Mostrada()) {
				result.add(new DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor(setting.getEObject(), target,
						DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RedSocialMostrada_4006,
						DataWebDeskDSL.diagram.edit.parts.RedSocialMostradaEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getIncomingFeatureModelFacetLinks_URLExterna_Pagina_4007(
			DataWebDeskDSL.Pagina target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE
					.getURLExterna_Pagina()) {
				result.add(new DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor(setting.getEObject(), target,
						DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.URLExternaPagina_4007,
						DataWebDeskDSL.diagram.edit.parts.URLExternaPaginaEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getOutgoingFeatureModelFacetLinks_Pagina_Accede_4001(
			DataWebDeskDSL.Pagina source) {
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		for (Iterator<?> destinations = source.getAccede().iterator(); destinations.hasNext();) {
			DataWebDeskDSL.Pagina destination = (DataWebDeskDSL.Pagina) destinations.next();
			result.add(new DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor(source, destination,
					DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PaginaAccede_4001,
					DataWebDeskDSL.diagram.edit.parts.PaginaAccedeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getOutgoingFeatureModelFacetLinks_Entidad_Asociada_4002(
			DataWebDeskDSL.Entidad source) {
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		for (Iterator<?> destinations = source.getAsociada().iterator(); destinations.hasNext();) {
			DataWebDeskDSL.PagCRUD destination = (DataWebDeskDSL.PagCRUD) destinations.next();
			result.add(new DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor(source, destination,
					DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntidadAsociada_4002,
					DataWebDeskDSL.diagram.edit.parts.EntidadAsociadaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getOutgoingFeatureModelFacetLinks_Entidad_Clave_primaria_4003(
			DataWebDeskDSL.Entidad source) {
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		DataWebDeskDSL.CaracteristicaEntidad destination = source.getClave_primaria();
		if (destination == null) {
			return result;
		}
		result.add(new DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor(source, destination,
				DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntidadClave_primaria_4003,
				DataWebDeskDSL.diagram.edit.parts.EntidadClave_primariaEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getOutgoingFeatureModelFacetLinks_Entidad_Relacionada_4004(
			DataWebDeskDSL.Entidad source) {
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		for (Iterator<?> destinations = source.getRelacionada().iterator(); destinations.hasNext();) {
			DataWebDeskDSL.Entidad destination = (DataWebDeskDSL.Entidad) destinations.next();
			result.add(new DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor(source, destination,
					DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntidadRelacionada_4004,
					DataWebDeskDSL.diagram.edit.parts.EntidadRelacionadaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getOutgoingFeatureModelFacetLinks_Rol_Tiene_acceso_4005(
			DataWebDeskDSL.Rol source) {
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		for (Iterator<?> destinations = source.getTiene_acceso().iterator(); destinations.hasNext();) {
			DataWebDeskDSL.Pagina destination = (DataWebDeskDSL.Pagina) destinations.next();
			result.add(new DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor(source, destination,
					DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RolTiene_acceso_4005,
					DataWebDeskDSL.diagram.edit.parts.RolTiene_accesoEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getOutgoingFeatureModelFacetLinks_RedSocial_Mostrada_4006(
			DataWebDeskDSL.RedSocial source) {
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		for (Iterator<?> destinations = source.getMostrada().iterator(); destinations.hasNext();) {
			DataWebDeskDSL.Pagina destination = (DataWebDeskDSL.Pagina) destinations.next();
			result.add(new DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor(source, destination,
					DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RedSocialMostrada_4006,
					DataWebDeskDSL.diagram.edit.parts.RedSocialMostradaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getOutgoingFeatureModelFacetLinks_URLExterna_Pagina_4007(
			DataWebDeskDSL.URLExterna source) {
		LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		for (Iterator<?> destinations = source.getPagina().iterator(); destinations.hasNext();) {
			DataWebDeskDSL.Pagina destination = (DataWebDeskDSL.Pagina) destinations.next();
			result.add(new DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor(source, destination,
					DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.URLExternaPagina_4007,
					DataWebDeskDSL.diagram.edit.parts.URLExternaPaginaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<DataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> getSemanticChildren(View view) {
			return DataWebDeskDSLDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getContainedLinks(View view) {
			return DataWebDeskDSLDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getIncomingLinks(View view) {
			return DataWebDeskDSLDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<DataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getOutgoingLinks(View view) {
			return DataWebDeskDSLDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
