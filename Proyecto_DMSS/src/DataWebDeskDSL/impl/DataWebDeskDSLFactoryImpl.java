/**
 */
package DataWebDeskDSL.impl;

import DataWebDeskDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataWebDeskDSLFactoryImpl extends EFactoryImpl implements DataWebDeskDSLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataWebDeskDSLFactory init() {
		try {
			DataWebDeskDSLFactory theDataWebDeskDSLFactory = (DataWebDeskDSLFactory)EPackage.Registry.INSTANCE.getEFactory(DataWebDeskDSLPackage.eNS_URI);
			if (theDataWebDeskDSLFactory != null) {
				return theDataWebDeskDSLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataWebDeskDSLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataWebDeskDSLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DataWebDeskDSLPackage.DATA_WEB_DESK: return createDataWebDesk();
			case DataWebDeskDSLPackage.PAGINAS_NORMALES: return createPaginasNormales();
			case DataWebDeskDSLPackage.ENTIDAD: return createEntidad();
			case DataWebDeskDSLPackage.CARACTERISTICA_ENTIDAD: return createCaracteristicaEntidad();
			case DataWebDeskDSLPackage.PAG_CREAR: return createPagCrear();
			case DataWebDeskDSLPackage.PAG_LEER: return createPagLeer();
			case DataWebDeskDSLPackage.PAG_BORRAR: return createPagBorrar();
			case DataWebDeskDSLPackage.PAG_ACTUALIZAR: return createPagActualizar();
			case DataWebDeskDSLPackage.ROL: return createRol();
			case DataWebDeskDSLPackage.TWITTER: return createTwitter();
			case DataWebDeskDSLPackage.FACEBOOK: return createFacebook();
			case DataWebDeskDSLPackage.PAG_INDICE: return createPagIndice();
			case DataWebDeskDSLPackage.CRUD: return createCRUD();
			case DataWebDeskDSLPackage.URL_EXTERNA: return createURLExterna();
			case DataWebDeskDSLPackage.PAGINA_PRINCIPAL: return createPaginaPrincipal();
			case DataWebDeskDSLPackage.RSS: return createRSS();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DataWebDeskDSLPackage.TIPO_DATO:
				return createTipoDatoFromString(eDataType, initialValue);
			case DataWebDeskDSLPackage.TIPO_CONTENIDO:
				return createtipoContenidoFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DataWebDeskDSLPackage.TIPO_DATO:
				return convertTipoDatoToString(eDataType, instanceValue);
			case DataWebDeskDSLPackage.TIPO_CONTENIDO:
				return converttipoContenidoToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataWebDesk createDataWebDesk() {
		DataWebDeskImpl dataWebDesk = new DataWebDeskImpl();
		return dataWebDesk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaginasNormales createPaginasNormales() {
		PaginasNormalesImpl paginasNormales = new PaginasNormalesImpl();
		return paginasNormales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entidad createEntidad() {
		EntidadImpl entidad = new EntidadImpl();
		return entidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaracteristicaEntidad createCaracteristicaEntidad() {
		CaracteristicaEntidadImpl caracteristicaEntidad = new CaracteristicaEntidadImpl();
		return caracteristicaEntidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PagCrear createPagCrear() {
		PagCrearImpl pagCrear = new PagCrearImpl();
		return pagCrear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PagLeer createPagLeer() {
		PagLeerImpl pagLeer = new PagLeerImpl();
		return pagLeer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PagBorrar createPagBorrar() {
		PagBorrarImpl pagBorrar = new PagBorrarImpl();
		return pagBorrar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PagActualizar createPagActualizar() {
		PagActualizarImpl pagActualizar = new PagActualizarImpl();
		return pagActualizar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rol createRol() {
		RolImpl rol = new RolImpl();
		return rol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Twitter createTwitter() {
		TwitterImpl twitter = new TwitterImpl();
		return twitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Facebook createFacebook() {
		FacebookImpl facebook = new FacebookImpl();
		return facebook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PagIndice createPagIndice() {
		PagIndiceImpl pagIndice = new PagIndiceImpl();
		return pagIndice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRUD createCRUD() {
		CRUDImpl crud = new CRUDImpl();
		return crud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URLExterna createURLExterna() {
		URLExternaImpl urlExterna = new URLExternaImpl();
		return urlExterna;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaginaPrincipal createPaginaPrincipal() {
		PaginaPrincipalImpl paginaPrincipal = new PaginaPrincipalImpl();
		return paginaPrincipal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RSS createRSS() {
		RSSImpl rss = new RSSImpl();
		return rss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDato createTipoDatoFromString(EDataType eDataType, String initialValue) {
		TipoDato result = TipoDato.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoDatoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tipoContenido createtipoContenidoFromString(EDataType eDataType, String initialValue) {
		tipoContenido result = tipoContenido.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String converttipoContenidoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataWebDeskDSLPackage getDataWebDeskDSLPackage() {
		return (DataWebDeskDSLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataWebDeskDSLPackage getPackage() {
		return DataWebDeskDSLPackage.eINSTANCE;
	}

} //DataWebDeskDSLFactoryImpl
