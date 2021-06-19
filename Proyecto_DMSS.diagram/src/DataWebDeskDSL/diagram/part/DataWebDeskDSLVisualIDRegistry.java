/*
* 
*/
package DataWebDeskDSL.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class DataWebDeskDSLVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "Proyecto_DMSS.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (DataWebDeskDSL.diagram.edit.parts.DataWebDeskEditPart.MODEL_ID.equals(view.getType())) {
				return DataWebDeskDSL.diagram.edit.parts.DataWebDeskEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				DataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getDataWebDesk().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((DataWebDeskDSL.DataWebDesk) domainElement)) {
			return DataWebDeskDSL.diagram.edit.parts.DataWebDeskEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getModelID(containerView);
		if (!DataWebDeskDSL.diagram.edit.parts.DataWebDeskEditPart.MODEL_ID.equals(containerModelID)
				&& !"DataWebDeskDSL".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (DataWebDeskDSL.diagram.edit.parts.DataWebDeskEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DataWebDeskDSL.diagram.edit.parts.DataWebDeskEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case DataWebDeskDSL.diagram.edit.parts.DataWebDeskEditPart.VISUAL_ID:
			if (DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPagCrear().isSuperTypeOf(domainElement.eClass())) {
				return DataWebDeskDSL.diagram.edit.parts.PagCrearEditPart.VISUAL_ID;
			}
			if (DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPagLeer().isSuperTypeOf(domainElement.eClass())) {
				return DataWebDeskDSL.diagram.edit.parts.PagLeerEditPart.VISUAL_ID;
			}
			if (DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPagBorrar().isSuperTypeOf(domainElement.eClass())) {
				return DataWebDeskDSL.diagram.edit.parts.PagBorrarEditPart.VISUAL_ID;
			}
			if (DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPagActualizar()
					.isSuperTypeOf(domainElement.eClass())) {
				return DataWebDeskDSL.diagram.edit.parts.PagActualizarEditPart.VISUAL_ID;
			}
			if (DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPagIndice().isSuperTypeOf(domainElement.eClass())) {
				return DataWebDeskDSL.diagram.edit.parts.PagIndiceEditPart.VISUAL_ID;
			}
			if (DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getCRUD().isSuperTypeOf(domainElement.eClass())) {
				return DataWebDeskDSL.diagram.edit.parts.CRUDEditPart.VISUAL_ID;
			}
			if (DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPaginasNormales()
					.isSuperTypeOf(domainElement.eClass())) {
				return DataWebDeskDSL.diagram.edit.parts.PaginasNormalesEditPart.VISUAL_ID;
			}
			if (DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPaginaPrincipal()
					.isSuperTypeOf(domainElement.eClass())) {
				return DataWebDeskDSL.diagram.edit.parts.PaginaPrincipalEditPart.VISUAL_ID;
			}
			if (DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getTwitter().isSuperTypeOf(domainElement.eClass())) {
				return DataWebDeskDSL.diagram.edit.parts.TwitterEditPart.VISUAL_ID;
			}
			if (DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getFacebook().isSuperTypeOf(domainElement.eClass())) {
				return DataWebDeskDSL.diagram.edit.parts.FacebookEditPart.VISUAL_ID;
			}
			if (DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getRSS().isSuperTypeOf(domainElement.eClass())) {
				return DataWebDeskDSL.diagram.edit.parts.RSSEditPart.VISUAL_ID;
			}
			if (DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getRol().isSuperTypeOf(domainElement.eClass())) {
				return DataWebDeskDSL.diagram.edit.parts.RolEditPart.VISUAL_ID;
			}
			if (DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getEntidad().isSuperTypeOf(domainElement.eClass())) {
				return DataWebDeskDSL.diagram.edit.parts.EntidadEditPart.VISUAL_ID;
			}
			if (DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getURLExterna().isSuperTypeOf(domainElement.eClass())) {
				return DataWebDeskDSL.diagram.edit.parts.URLExternaEditPart.VISUAL_ID;
			}
			break;
		case DataWebDeskDSL.diagram.edit.parts.EntidadEntidadCaracteristicaCompartmentEditPart.VISUAL_ID:
			if (DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getCaracteristicaEntidad()
					.isSuperTypeOf(domainElement.eClass())) {
				return DataWebDeskDSL.diagram.edit.parts.CaracteristicaEntidadEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getModelID(containerView);
		if (!DataWebDeskDSL.diagram.edit.parts.DataWebDeskEditPart.MODEL_ID.equals(containerModelID)
				&& !"DataWebDeskDSL".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (DataWebDeskDSL.diagram.edit.parts.DataWebDeskEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DataWebDeskDSL.diagram.edit.parts.DataWebDeskEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case DataWebDeskDSL.diagram.edit.parts.DataWebDeskEditPart.VISUAL_ID:
			if (DataWebDeskDSL.diagram.edit.parts.PagCrearEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataWebDeskDSL.diagram.edit.parts.PagLeerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataWebDeskDSL.diagram.edit.parts.PagBorrarEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataWebDeskDSL.diagram.edit.parts.PagActualizarEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataWebDeskDSL.diagram.edit.parts.PagIndiceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataWebDeskDSL.diagram.edit.parts.CRUDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataWebDeskDSL.diagram.edit.parts.PaginasNormalesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataWebDeskDSL.diagram.edit.parts.PaginaPrincipalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataWebDeskDSL.diagram.edit.parts.TwitterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataWebDeskDSL.diagram.edit.parts.FacebookEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataWebDeskDSL.diagram.edit.parts.RSSEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataWebDeskDSL.diagram.edit.parts.RolEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataWebDeskDSL.diagram.edit.parts.EntidadEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataWebDeskDSL.diagram.edit.parts.URLExternaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWebDeskDSL.diagram.edit.parts.PagCrearEditPart.VISUAL_ID:
			if (DataWebDeskDSL.diagram.edit.parts.PagCrearTituloPagEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWebDeskDSL.diagram.edit.parts.PagLeerEditPart.VISUAL_ID:
			if (DataWebDeskDSL.diagram.edit.parts.PagLeerTituloPagEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWebDeskDSL.diagram.edit.parts.PagBorrarEditPart.VISUAL_ID:
			if (DataWebDeskDSL.diagram.edit.parts.PagBorrarTituloPagEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWebDeskDSL.diagram.edit.parts.PagActualizarEditPart.VISUAL_ID:
			if (DataWebDeskDSL.diagram.edit.parts.PagActualizarTituloPagEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWebDeskDSL.diagram.edit.parts.PagIndiceEditPart.VISUAL_ID:
			if (DataWebDeskDSL.diagram.edit.parts.PagIndiceTituloPagEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWebDeskDSL.diagram.edit.parts.CRUDEditPart.VISUAL_ID:
			if (DataWebDeskDSL.diagram.edit.parts.CRUDTituloPagEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWebDeskDSL.diagram.edit.parts.PaginasNormalesEditPart.VISUAL_ID:
			if (DataWebDeskDSL.diagram.edit.parts.PaginasNormalesTituloPagEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWebDeskDSL.diagram.edit.parts.PaginaPrincipalEditPart.VISUAL_ID:
			if (DataWebDeskDSL.diagram.edit.parts.PaginaPrincipalTituloPagEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWebDeskDSL.diagram.edit.parts.TwitterEditPart.VISUAL_ID:
			if (DataWebDeskDSL.diagram.edit.parts.TwitterNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWebDeskDSL.diagram.edit.parts.FacebookEditPart.VISUAL_ID:
			if (DataWebDeskDSL.diagram.edit.parts.FacebookNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWebDeskDSL.diagram.edit.parts.RSSEditPart.VISUAL_ID:
			if (DataWebDeskDSL.diagram.edit.parts.RSSNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWebDeskDSL.diagram.edit.parts.RolEditPart.VISUAL_ID:
			if (DataWebDeskDSL.diagram.edit.parts.RolNombreRolEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWebDeskDSL.diagram.edit.parts.EntidadEditPart.VISUAL_ID:
			if (DataWebDeskDSL.diagram.edit.parts.EntidadNombreEntidadEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataWebDeskDSL.diagram.edit.parts.EntidadEntidadCaracteristicaCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWebDeskDSL.diagram.edit.parts.URLExternaEditPart.VISUAL_ID:
			if (DataWebDeskDSL.diagram.edit.parts.URLExternaLinkEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWebDeskDSL.diagram.edit.parts.CaracteristicaEntidadEditPart.VISUAL_ID:
			if (DataWebDeskDSL.diagram.edit.parts.CaracteristicaEntidadNombreCaractEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWebDeskDSL.diagram.edit.parts.EntidadEntidadCaracteristicaCompartmentEditPart.VISUAL_ID:
			if (DataWebDeskDSL.diagram.edit.parts.CaracteristicaEntidadEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWebDeskDSL.diagram.edit.parts.PaginaAccedeEditPart.VISUAL_ID:
			if (DataWebDeskDSL.diagram.edit.parts.PaginaAccedeExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWebDeskDSL.diagram.edit.parts.EntidadAsociadaEditPart.VISUAL_ID:
			if (DataWebDeskDSL.diagram.edit.parts.EntidadAsociadaExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWebDeskDSL.diagram.edit.parts.EntidadClave_primariaEditPart.VISUAL_ID:
			if (DataWebDeskDSL.diagram.edit.parts.EntidadClave_primariaExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWebDeskDSL.diagram.edit.parts.EntidadRelacionadaEditPart.VISUAL_ID:
			if (DataWebDeskDSL.diagram.edit.parts.EntidadRelacionadaExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWebDeskDSL.diagram.edit.parts.RolTiene_accesoEditPart.VISUAL_ID:
			if (DataWebDeskDSL.diagram.edit.parts.RolTiene_accesoExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWebDeskDSL.diagram.edit.parts.RedSocialMostradaEditPart.VISUAL_ID:
			if (DataWebDeskDSL.diagram.edit.parts.RedSocialMostradaExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataWebDeskDSL.diagram.edit.parts.URLExternaPaginaEditPart.VISUAL_ID:
			if (DataWebDeskDSL.diagram.edit.parts.URLExternaPaginaExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(DataWebDeskDSL.DataWebDesk element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case DataWebDeskDSL.diagram.edit.parts.EntidadEntidadCaracteristicaCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case DataWebDeskDSL.diagram.edit.parts.DataWebDeskEditPart.VISUAL_ID:
			return false;
		case DataWebDeskDSL.diagram.edit.parts.PagCrearEditPart.VISUAL_ID:
		case DataWebDeskDSL.diagram.edit.parts.PagLeerEditPart.VISUAL_ID:
		case DataWebDeskDSL.diagram.edit.parts.PagBorrarEditPart.VISUAL_ID:
		case DataWebDeskDSL.diagram.edit.parts.PagActualizarEditPart.VISUAL_ID:
		case DataWebDeskDSL.diagram.edit.parts.PagIndiceEditPart.VISUAL_ID:
		case DataWebDeskDSL.diagram.edit.parts.CRUDEditPart.VISUAL_ID:
		case DataWebDeskDSL.diagram.edit.parts.PaginasNormalesEditPart.VISUAL_ID:
		case DataWebDeskDSL.diagram.edit.parts.PaginaPrincipalEditPart.VISUAL_ID:
		case DataWebDeskDSL.diagram.edit.parts.TwitterEditPart.VISUAL_ID:
		case DataWebDeskDSL.diagram.edit.parts.FacebookEditPart.VISUAL_ID:
		case DataWebDeskDSL.diagram.edit.parts.RSSEditPart.VISUAL_ID:
		case DataWebDeskDSL.diagram.edit.parts.RolEditPart.VISUAL_ID:
		case DataWebDeskDSL.diagram.edit.parts.URLExternaEditPart.VISUAL_ID:
		case DataWebDeskDSL.diagram.edit.parts.CaracteristicaEntidadEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
