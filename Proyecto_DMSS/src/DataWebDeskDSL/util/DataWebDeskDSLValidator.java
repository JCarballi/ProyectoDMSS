/**
 */
package DataWebDeskDSL.util;

import DataWebDeskDSL.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see DataWebDeskDSL.DataWebDeskDSLPackage
 * @generated
 */
public class DataWebDeskDSLValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DataWebDeskDSLValidator INSTANCE = new DataWebDeskDSLValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "DataWebDeskDSL";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataWebDeskDSLValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return DataWebDeskDSLPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case DataWebDeskDSLPackage.DATA_WEB_DESK:
				return validateDataWebDesk((DataWebDesk)value, diagnostics, context);
			case DataWebDeskDSLPackage.PAGINA:
				return validatePagina((Pagina)value, diagnostics, context);
			case DataWebDeskDSLPackage.PAGINAS_NORMALES:
				return validatePaginasNormales((PaginasNormales)value, diagnostics, context);
			case DataWebDeskDSLPackage.PAG_CRUD:
				return validatePagCRUD((PagCRUD)value, diagnostics, context);
			case DataWebDeskDSLPackage.ENTIDAD:
				return validateEntidad((Entidad)value, diagnostics, context);
			case DataWebDeskDSLPackage.CARACTERISTICA_ENTIDAD:
				return validateCaracteristicaEntidad((CaracteristicaEntidad)value, diagnostics, context);
			case DataWebDeskDSLPackage.PAG_CREAR:
				return validatePagCrear((PagCrear)value, diagnostics, context);
			case DataWebDeskDSLPackage.PAG_LEER:
				return validatePagLeer((PagLeer)value, diagnostics, context);
			case DataWebDeskDSLPackage.PAG_BORRAR:
				return validatePagBorrar((PagBorrar)value, diagnostics, context);
			case DataWebDeskDSLPackage.PAG_ACTUALIZAR:
				return validatePagActualizar((PagActualizar)value, diagnostics, context);
			case DataWebDeskDSLPackage.ROL:
				return validateRol((Rol)value, diagnostics, context);
			case DataWebDeskDSLPackage.RED_SOCIAL:
				return validateRedSocial((RedSocial)value, diagnostics, context);
			case DataWebDeskDSLPackage.TWITTER:
				return validateTwitter((Twitter)value, diagnostics, context);
			case DataWebDeskDSLPackage.FACEBOOK:
				return validateFacebook((Facebook)value, diagnostics, context);
			case DataWebDeskDSLPackage.PAG_INDICE:
				return validatePagIndice((PagIndice)value, diagnostics, context);
			case DataWebDeskDSLPackage.CRUD:
				return validateCRUD((CRUD)value, diagnostics, context);
			case DataWebDeskDSLPackage.URL_EXTERNA:
				return validateURLExterna((URLExterna)value, diagnostics, context);
			case DataWebDeskDSLPackage.PAGINA_PRINCIPAL:
				return validatePaginaPrincipal((PaginaPrincipal)value, diagnostics, context);
			case DataWebDeskDSLPackage.RSS:
				return validateRSS((RSS)value, diagnostics, context);
			case DataWebDeskDSLPackage.TIPO_DATO:
				return validateTipoDato((TipoDato)value, diagnostics, context);
			case DataWebDeskDSLPackage.TIPO_CONTENIDO:
				return validatetipoContenido((tipoContenido)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataWebDesk(DataWebDesk dataWebDesk, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataWebDesk, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataWebDesk, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataWebDesk, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataWebDesk, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataWebDesk, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataWebDesk, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataWebDesk, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataWebDesk, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataWebDesk, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataWebDesk_idRedSocialNombre(dataWebDesk, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataWebDesk_idRedSocialID(dataWebDesk, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataWebDesk_idPagina(dataWebDesk, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataWebDesk_idRol(dataWebDesk, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataWebDesk_idURLExterna(dataWebDesk, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataWebDesk_idEntidadID(dataWebDesk, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataWebDesk_idEntidadNombre(dataWebDesk, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataWebDesk_unaPrincipalR1(dataWebDesk, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataWebDesk_algunaRSR5(dataWebDesk, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the idRedSocialNombre constraint of '<em>Data Web Desk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_WEB_DESK__ID_RED_SOCIAL_NOMBRE__EEXPRESSION = "self.redsocial->isUnique(nombre)";

	/**
	 * Validates the idRedSocialNombre constraint of '<em>Data Web Desk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataWebDesk_idRedSocialNombre(DataWebDesk dataWebDesk, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DataWebDeskDSLPackage.Literals.DATA_WEB_DESK,
				 dataWebDesk,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "idRedSocialNombre",
				 DATA_WEB_DESK__ID_RED_SOCIAL_NOMBRE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the idRedSocialID constraint of '<em>Data Web Desk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_WEB_DESK__ID_RED_SOCIAL_ID__EEXPRESSION = "self.redsocial->isUnique(ID_RedSocial)";

	/**
	 * Validates the idRedSocialID constraint of '<em>Data Web Desk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataWebDesk_idRedSocialID(DataWebDesk dataWebDesk, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DataWebDeskDSLPackage.Literals.DATA_WEB_DESK,
				 dataWebDesk,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "idRedSocialID",
				 DATA_WEB_DESK__ID_RED_SOCIAL_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the idPagina constraint of '<em>Data Web Desk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_WEB_DESK__ID_PAGINA__EEXPRESSION = "self.pagina->isUnique(TituloPag)";

	/**
	 * Validates the idPagina constraint of '<em>Data Web Desk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataWebDesk_idPagina(DataWebDesk dataWebDesk, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DataWebDeskDSLPackage.Literals.DATA_WEB_DESK,
				 dataWebDesk,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "idPagina",
				 DATA_WEB_DESK__ID_PAGINA__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the idRol constraint of '<em>Data Web Desk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_WEB_DESK__ID_ROL__EEXPRESSION = "self.rol->isUnique(NombreRol)";

	/**
	 * Validates the idRol constraint of '<em>Data Web Desk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataWebDesk_idRol(DataWebDesk dataWebDesk, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DataWebDeskDSLPackage.Literals.DATA_WEB_DESK,
				 dataWebDesk,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "idRol",
				 DATA_WEB_DESK__ID_ROL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the idURLExterna constraint of '<em>Data Web Desk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_WEB_DESK__ID_URL_EXTERNA__EEXPRESSION = "self.urlexterna->isUnique(Link)";

	/**
	 * Validates the idURLExterna constraint of '<em>Data Web Desk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataWebDesk_idURLExterna(DataWebDesk dataWebDesk, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DataWebDeskDSLPackage.Literals.DATA_WEB_DESK,
				 dataWebDesk,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "idURLExterna",
				 DATA_WEB_DESK__ID_URL_EXTERNA__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the idEntidadID constraint of '<em>Data Web Desk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_WEB_DESK__ID_ENTIDAD_ID__EEXPRESSION = "self.entidad->isUnique(ID_Entidad)";

	/**
	 * Validates the idEntidadID constraint of '<em>Data Web Desk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataWebDesk_idEntidadID(DataWebDesk dataWebDesk, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DataWebDeskDSLPackage.Literals.DATA_WEB_DESK,
				 dataWebDesk,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "idEntidadID",
				 DATA_WEB_DESK__ID_ENTIDAD_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the idEntidadNombre constraint of '<em>Data Web Desk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_WEB_DESK__ID_ENTIDAD_NOMBRE__EEXPRESSION = "self.entidad->isUnique(nombreEntidad)";

	/**
	 * Validates the idEntidadNombre constraint of '<em>Data Web Desk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataWebDesk_idEntidadNombre(DataWebDesk dataWebDesk, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DataWebDeskDSLPackage.Literals.DATA_WEB_DESK,
				 dataWebDesk,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "idEntidadNombre",
				 DATA_WEB_DESK__ID_ENTIDAD_NOMBRE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the unaPrincipalR1 constraint of '<em>Data Web Desk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_WEB_DESK__UNA_PRINCIPAL_R1__EEXPRESSION = "self.pagina->selectByType(PaginaPrincipal)->size()=1";

	/**
	 * Validates the unaPrincipalR1 constraint of '<em>Data Web Desk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataWebDesk_unaPrincipalR1(DataWebDesk dataWebDesk, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DataWebDeskDSLPackage.Literals.DATA_WEB_DESK,
				 dataWebDesk,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "unaPrincipalR1",
				 DATA_WEB_DESK__UNA_PRINCIPAL_R1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the algunaRSR5 constraint of '<em>Data Web Desk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_WEB_DESK__ALGUNA_RSR5__EEXPRESSION = "self.pagina.muestra->size() > 0";

	/**
	 * Validates the algunaRSR5 constraint of '<em>Data Web Desk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataWebDesk_algunaRSR5(DataWebDesk dataWebDesk, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DataWebDeskDSLPackage.Literals.DATA_WEB_DESK,
				 dataWebDesk,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "algunaRSR5",
				 DATA_WEB_DESK__ALGUNA_RSR5__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePagina(Pagina pagina, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pagina, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pagina, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pagina, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pagina, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pagina, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pagina, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pagina, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pagina, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pagina, diagnostics, context);
		if (result || diagnostics != null) result &= validatePagina_noPagAisladaR2(pagina, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the noPagAisladaR2 constraint of '<em>Pagina</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PAGINA__NO_PAG_AISLADA_R2__EEXPRESSION = "self->closure(accede).accedida_por -> size() > 0";

	/**
	 * Validates the noPagAisladaR2 constraint of '<em>Pagina</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePagina_noPagAisladaR2(Pagina pagina, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DataWebDeskDSLPackage.Literals.PAGINA,
				 pagina,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noPagAisladaR2",
				 PAGINA__NO_PAG_AISLADA_R2__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaginasNormales(PaginasNormales paginasNormales, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(paginasNormales, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(paginasNormales, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(paginasNormales, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(paginasNormales, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(paginasNormales, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(paginasNormales, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(paginasNormales, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(paginasNormales, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(paginasNormales, diagnostics, context);
		if (result || diagnostics != null) result &= validatePagina_noPagAisladaR2(paginasNormales, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePagCRUD(PagCRUD pagCRUD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pagCRUD, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pagCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pagCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pagCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pagCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pagCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pagCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pagCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pagCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validatePagina_noPagAisladaR2(pagCRUD, diagnostics, context);
		if (result || diagnostics != null) result &= validatePagCRUD_CRUDNoSuelta(pagCRUD, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the CRUDNoSuelta constraint of '<em>Pag CRUD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PAG_CRUD__CRUD_NO_SUELTA__EEXPRESSION = "self.tiene_asociada->size()>0 or self.accede->selectByType(CRUD)->size()>0";

	/**
	 * Validates the CRUDNoSuelta constraint of '<em>Pag CRUD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePagCRUD_CRUDNoSuelta(PagCRUD pagCRUD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DataWebDeskDSLPackage.Literals.PAG_CRUD,
				 pagCRUD,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "CRUDNoSuelta",
				 PAG_CRUD__CRUD_NO_SUELTA__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntidad(Entidad entidad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entidad, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(entidad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entidad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entidad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(entidad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(entidad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(entidad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(entidad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(entidad, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntidad_idCaracteristica(entidad, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntidad_soloCRUDR3(entidad, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntidad_indiceDetalleR4(entidad, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntidad_detalleIndiceR4(entidad, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntidad_noSelfRefR6(entidad, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntidad_noBidireccionalRefR7(entidad, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the idCaracteristica constraint of '<em>Entidad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTIDAD__ID_CARACTERISTICA__EEXPRESSION = "self.caracteristica->isUnique(nombreCaract)";

	/**
	 * Validates the idCaracteristica constraint of '<em>Entidad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntidad_idCaracteristica(Entidad entidad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DataWebDeskDSLPackage.Literals.ENTIDAD,
				 entidad,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "idCaracteristica",
				 ENTIDAD__ID_CARACTERISTICA__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the soloCRUDR3 constraint of '<em>Entidad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTIDAD__SOLO_CRUDR3__EEXPRESSION = "self.asociada->select(p: PagCRUD | p.oclIsTypeOf(CRUD))->size() > 0 implies self.asociada->size()=1";

	/**
	 * Validates the soloCRUDR3 constraint of '<em>Entidad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntidad_soloCRUDR3(Entidad entidad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DataWebDeskDSLPackage.Literals.ENTIDAD,
				 entidad,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "soloCRUDR3",
				 ENTIDAD__SOLO_CRUDR3__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the indiceDetalleR4 constraint of '<em>Entidad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTIDAD__INDICE_DETALLE_R4__EEXPRESSION = "self.asociada->select(p: PagCRUD | p.oclIsTypeOf(PagIndice)) -> size() > 0 implies self.asociada->select(p: PagCRUD | p.oclIsTypeOf(PagLeer)) -> size() = 1 ";

	/**
	 * Validates the indiceDetalleR4 constraint of '<em>Entidad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntidad_indiceDetalleR4(Entidad entidad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DataWebDeskDSLPackage.Literals.ENTIDAD,
				 entidad,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "indiceDetalleR4",
				 ENTIDAD__INDICE_DETALLE_R4__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the detalleIndiceR4 constraint of '<em>Entidad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTIDAD__DETALLE_INDICE_R4__EEXPRESSION = "self.asociada->select(p: PagCRUD | p.oclIsTypeOf(PagLeer)) -> size() > 0 implies self.asociada->select(p: PagCRUD | p.oclIsTypeOf(PagIndice)) -> size() = 1 ";

	/**
	 * Validates the detalleIndiceR4 constraint of '<em>Entidad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntidad_detalleIndiceR4(Entidad entidad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DataWebDeskDSLPackage.Literals.ENTIDAD,
				 entidad,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "detalleIndiceR4",
				 ENTIDAD__DETALLE_INDICE_R4__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the noSelfRefR6 constraint of '<em>Entidad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTIDAD__NO_SELF_REF_R6__EEXPRESSION = "self.esta_relacionada->excludes(self)";

	/**
	 * Validates the noSelfRefR6 constraint of '<em>Entidad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntidad_noSelfRefR6(Entidad entidad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DataWebDeskDSLPackage.Literals.ENTIDAD,
				 entidad,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noSelfRefR6",
				 ENTIDAD__NO_SELF_REF_R6__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the noBidireccionalRefR7 constraint of '<em>Entidad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTIDAD__NO_BIDIRECCIONAL_REF_R7__EEXPRESSION = " self.relacionada->closure(relacionada)->excludes(self)";

	/**
	 * Validates the noBidireccionalRefR7 constraint of '<em>Entidad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntidad_noBidireccionalRefR7(Entidad entidad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DataWebDeskDSLPackage.Literals.ENTIDAD,
				 entidad,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noBidireccionalRefR7",
				 ENTIDAD__NO_BIDIRECCIONAL_REF_R7__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaracteristicaEntidad(CaracteristicaEntidad caracteristicaEntidad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(caracteristicaEntidad, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePagCrear(PagCrear pagCrear, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pagCrear, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pagCrear, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pagCrear, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pagCrear, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pagCrear, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pagCrear, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pagCrear, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pagCrear, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pagCrear, diagnostics, context);
		if (result || diagnostics != null) result &= validatePagina_noPagAisladaR2(pagCrear, diagnostics, context);
		if (result || diagnostics != null) result &= validatePagCRUD_CRUDNoSuelta(pagCrear, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePagLeer(PagLeer pagLeer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pagLeer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pagLeer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pagLeer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pagLeer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pagLeer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pagLeer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pagLeer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pagLeer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pagLeer, diagnostics, context);
		if (result || diagnostics != null) result &= validatePagina_noPagAisladaR2(pagLeer, diagnostics, context);
		if (result || diagnostics != null) result &= validatePagCRUD_CRUDNoSuelta(pagLeer, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePagBorrar(PagBorrar pagBorrar, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pagBorrar, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pagBorrar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pagBorrar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pagBorrar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pagBorrar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pagBorrar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pagBorrar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pagBorrar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pagBorrar, diagnostics, context);
		if (result || diagnostics != null) result &= validatePagina_noPagAisladaR2(pagBorrar, diagnostics, context);
		if (result || diagnostics != null) result &= validatePagCRUD_CRUDNoSuelta(pagBorrar, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePagActualizar(PagActualizar pagActualizar, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pagActualizar, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pagActualizar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pagActualizar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pagActualizar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pagActualizar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pagActualizar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pagActualizar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pagActualizar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pagActualizar, diagnostics, context);
		if (result || diagnostics != null) result &= validatePagina_noPagAisladaR2(pagActualizar, diagnostics, context);
		if (result || diagnostics != null) result &= validatePagCRUD_CRUDNoSuelta(pagActualizar, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRol(Rol rol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rol, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedSocial(RedSocial redSocial, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(redSocial, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTwitter(Twitter twitter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(twitter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFacebook(Facebook facebook, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(facebook, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePagIndice(PagIndice pagIndice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pagIndice, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pagIndice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pagIndice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pagIndice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pagIndice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pagIndice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pagIndice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pagIndice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pagIndice, diagnostics, context);
		if (result || diagnostics != null) result &= validatePagina_noPagAisladaR2(pagIndice, diagnostics, context);
		if (result || diagnostics != null) result &= validatePagCRUD_CRUDNoSuelta(pagIndice, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCRUD(CRUD crud, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(crud, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(crud, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(crud, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(crud, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(crud, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(crud, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(crud, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(crud, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(crud, diagnostics, context);
		if (result || diagnostics != null) result &= validatePagina_noPagAisladaR2(crud, diagnostics, context);
		if (result || diagnostics != null) result &= validatePagCRUD_CRUDNoSuelta(crud, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURLExterna(URLExterna urlExterna, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(urlExterna, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaginaPrincipal(PaginaPrincipal paginaPrincipal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(paginaPrincipal, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(paginaPrincipal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(paginaPrincipal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(paginaPrincipal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(paginaPrincipal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(paginaPrincipal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(paginaPrincipal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(paginaPrincipal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(paginaPrincipal, diagnostics, context);
		if (result || diagnostics != null) result &= validatePagina_noPagAisladaR2(paginaPrincipal, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRSS(RSS rss, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rss, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTipoDato(TipoDato tipoDato, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatetipoContenido(tipoContenido tipoContenido, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //DataWebDeskDSLValidator
