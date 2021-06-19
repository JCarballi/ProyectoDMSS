/*
 * 
 */
package DataWebDeskDSL.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class DataWebDeskDSLParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser pagCrearTituloPag_5001Parser;

	/**
	* @generated
	*/
	private IParser getPagCrearTituloPag_5001Parser() {
		if (pagCrearTituloPag_5001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPagina_TituloPag() };
			DataWebDeskDSL.diagram.parsers.MessageFormatParser parser = new DataWebDeskDSL.diagram.parsers.MessageFormatParser(
					features);
			pagCrearTituloPag_5001Parser = parser;
		}
		return pagCrearTituloPag_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser pagLeerTituloPag_5002Parser;

	/**
	* @generated
	*/
	private IParser getPagLeerTituloPag_5002Parser() {
		if (pagLeerTituloPag_5002Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPagina_TituloPag() };
			DataWebDeskDSL.diagram.parsers.MessageFormatParser parser = new DataWebDeskDSL.diagram.parsers.MessageFormatParser(
					features);
			pagLeerTituloPag_5002Parser = parser;
		}
		return pagLeerTituloPag_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser pagBorrarTituloPag_5003Parser;

	/**
	* @generated
	*/
	private IParser getPagBorrarTituloPag_5003Parser() {
		if (pagBorrarTituloPag_5003Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPagina_TituloPag() };
			DataWebDeskDSL.diagram.parsers.MessageFormatParser parser = new DataWebDeskDSL.diagram.parsers.MessageFormatParser(
					features);
			pagBorrarTituloPag_5003Parser = parser;
		}
		return pagBorrarTituloPag_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser pagActualizarTituloPag_5004Parser;

	/**
	* @generated
	*/
	private IParser getPagActualizarTituloPag_5004Parser() {
		if (pagActualizarTituloPag_5004Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPagina_TituloPag() };
			DataWebDeskDSL.diagram.parsers.MessageFormatParser parser = new DataWebDeskDSL.diagram.parsers.MessageFormatParser(
					features);
			pagActualizarTituloPag_5004Parser = parser;
		}
		return pagActualizarTituloPag_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser pagIndiceTituloPag_5005Parser;

	/**
	* @generated
	*/
	private IParser getPagIndiceTituloPag_5005Parser() {
		if (pagIndiceTituloPag_5005Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPagina_TituloPag() };
			DataWebDeskDSL.diagram.parsers.MessageFormatParser parser = new DataWebDeskDSL.diagram.parsers.MessageFormatParser(
					features);
			pagIndiceTituloPag_5005Parser = parser;
		}
		return pagIndiceTituloPag_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser cRUDTituloPag_5006Parser;

	/**
	* @generated
	*/
	private IParser getCRUDTituloPag_5006Parser() {
		if (cRUDTituloPag_5006Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPagina_TituloPag() };
			DataWebDeskDSL.diagram.parsers.MessageFormatParser parser = new DataWebDeskDSL.diagram.parsers.MessageFormatParser(
					features);
			cRUDTituloPag_5006Parser = parser;
		}
		return cRUDTituloPag_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser paginasNormalesTituloPag_5007Parser;

	/**
	* @generated
	*/
	private IParser getPaginasNormalesTituloPag_5007Parser() {
		if (paginasNormalesTituloPag_5007Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPagina_TituloPag() };
			DataWebDeskDSL.diagram.parsers.MessageFormatParser parser = new DataWebDeskDSL.diagram.parsers.MessageFormatParser(
					features);
			paginasNormalesTituloPag_5007Parser = parser;
		}
		return paginasNormalesTituloPag_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser paginaPrincipalTituloPag_5008Parser;

	/**
	* @generated
	*/
	private IParser getPaginaPrincipalTituloPag_5008Parser() {
		if (paginaPrincipalTituloPag_5008Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPagina_TituloPag() };
			DataWebDeskDSL.diagram.parsers.MessageFormatParser parser = new DataWebDeskDSL.diagram.parsers.MessageFormatParser(
					features);
			paginaPrincipalTituloPag_5008Parser = parser;
		}
		return paginaPrincipalTituloPag_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser twitterNombre_5009Parser;

	/**
	* @generated
	*/
	private IParser getTwitterNombre_5009Parser() {
		if (twitterNombre_5009Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getRedSocial_Nombre() };
			DataWebDeskDSL.diagram.parsers.MessageFormatParser parser = new DataWebDeskDSL.diagram.parsers.MessageFormatParser(
					features);
			twitterNombre_5009Parser = parser;
		}
		return twitterNombre_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser facebookNombre_5010Parser;

	/**
	* @generated
	*/
	private IParser getFacebookNombre_5010Parser() {
		if (facebookNombre_5010Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getRedSocial_Nombre() };
			DataWebDeskDSL.diagram.parsers.MessageFormatParser parser = new DataWebDeskDSL.diagram.parsers.MessageFormatParser(
					features);
			facebookNombre_5010Parser = parser;
		}
		return facebookNombre_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser rSSNombre_5011Parser;

	/**
	* @generated
	*/
	private IParser getRSSNombre_5011Parser() {
		if (rSSNombre_5011Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getRedSocial_Nombre() };
			DataWebDeskDSL.diagram.parsers.MessageFormatParser parser = new DataWebDeskDSL.diagram.parsers.MessageFormatParser(
					features);
			rSSNombre_5011Parser = parser;
		}
		return rSSNombre_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser rolNombreRol_5012Parser;

	/**
	* @generated
	*/
	private IParser getRolNombreRol_5012Parser() {
		if (rolNombreRol_5012Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getRol_NombreRol() };
			DataWebDeskDSL.diagram.parsers.MessageFormatParser parser = new DataWebDeskDSL.diagram.parsers.MessageFormatParser(
					features);
			rolNombreRol_5012Parser = parser;
		}
		return rolNombreRol_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser entidadNombreEntidad_5014Parser;

	/**
	* @generated
	*/
	private IParser getEntidadNombreEntidad_5014Parser() {
		if (entidadNombreEntidad_5014Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getEntidad_NombreEntidad() };
			DataWebDeskDSL.diagram.parsers.MessageFormatParser parser = new DataWebDeskDSL.diagram.parsers.MessageFormatParser(
					features);
			entidadNombreEntidad_5014Parser = parser;
		}
		return entidadNombreEntidad_5014Parser;
	}

	/**
	* @generated
	*/
	private IParser uRLExternaLink_5015Parser;

	/**
	* @generated
	*/
	private IParser getURLExternaLink_5015Parser() {
		if (uRLExternaLink_5015Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getURLExterna_Link() };
			DataWebDeskDSL.diagram.parsers.MessageFormatParser parser = new DataWebDeskDSL.diagram.parsers.MessageFormatParser(
					features);
			uRLExternaLink_5015Parser = parser;
		}
		return uRLExternaLink_5015Parser;
	}

	/**
	* @generated
	*/
	private IParser caracteristicaEntidadNombreCaract_5013Parser;

	/**
	* @generated
	*/
	private IParser getCaracteristicaEntidadNombreCaract_5013Parser() {
		if (caracteristicaEntidadNombreCaract_5013Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getCaracteristicaEntidad_NombreCaract() };
			DataWebDeskDSL.diagram.parsers.MessageFormatParser parser = new DataWebDeskDSL.diagram.parsers.MessageFormatParser(
					features);
			caracteristicaEntidadNombreCaract_5013Parser = parser;
		}
		return caracteristicaEntidadNombreCaract_5013Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case DataWebDeskDSL.diagram.edit.parts.PagCrearTituloPagEditPart.VISUAL_ID:
			return getPagCrearTituloPag_5001Parser();
		case DataWebDeskDSL.diagram.edit.parts.PagLeerTituloPagEditPart.VISUAL_ID:
			return getPagLeerTituloPag_5002Parser();
		case DataWebDeskDSL.diagram.edit.parts.PagBorrarTituloPagEditPart.VISUAL_ID:
			return getPagBorrarTituloPag_5003Parser();
		case DataWebDeskDSL.diagram.edit.parts.PagActualizarTituloPagEditPart.VISUAL_ID:
			return getPagActualizarTituloPag_5004Parser();
		case DataWebDeskDSL.diagram.edit.parts.PagIndiceTituloPagEditPart.VISUAL_ID:
			return getPagIndiceTituloPag_5005Parser();
		case DataWebDeskDSL.diagram.edit.parts.CRUDTituloPagEditPart.VISUAL_ID:
			return getCRUDTituloPag_5006Parser();
		case DataWebDeskDSL.diagram.edit.parts.PaginasNormalesTituloPagEditPart.VISUAL_ID:
			return getPaginasNormalesTituloPag_5007Parser();
		case DataWebDeskDSL.diagram.edit.parts.PaginaPrincipalTituloPagEditPart.VISUAL_ID:
			return getPaginaPrincipalTituloPag_5008Parser();
		case DataWebDeskDSL.diagram.edit.parts.TwitterNombreEditPart.VISUAL_ID:
			return getTwitterNombre_5009Parser();
		case DataWebDeskDSL.diagram.edit.parts.FacebookNombreEditPart.VISUAL_ID:
			return getFacebookNombre_5010Parser();
		case DataWebDeskDSL.diagram.edit.parts.RSSNombreEditPart.VISUAL_ID:
			return getRSSNombre_5011Parser();
		case DataWebDeskDSL.diagram.edit.parts.RolNombreRolEditPart.VISUAL_ID:
			return getRolNombreRol_5012Parser();
		case DataWebDeskDSL.diagram.edit.parts.EntidadNombreEntidadEditPart.VISUAL_ID:
			return getEntidadNombreEntidad_5014Parser();
		case DataWebDeskDSL.diagram.edit.parts.URLExternaLinkEditPart.VISUAL_ID:
			return getURLExternaLink_5015Parser();
		case DataWebDeskDSL.diagram.edit.parts.CaracteristicaEntidadNombreCaractEditPart.VISUAL_ID:
			return getCaracteristicaEntidadNombreCaract_5013Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
