/**
 */
package DataWebDeskDSL.impl;

import DataWebDeskDSL.CaracteristicaEntidad;
import DataWebDeskDSL.DataWebDesk;
import DataWebDeskDSL.DataWebDeskDSLFactory;
import DataWebDeskDSL.DataWebDeskDSLPackage;
import DataWebDeskDSL.Entidad;
import DataWebDeskDSL.Facebook;
import DataWebDeskDSL.PagActualizar;
import DataWebDeskDSL.PagBorrar;
import DataWebDeskDSL.PagCRUD;
import DataWebDeskDSL.PagCrear;
import DataWebDeskDSL.PagIndice;
import DataWebDeskDSL.PagLeer;
import DataWebDeskDSL.Pagina;
import DataWebDeskDSL.PaginaPrincipal;
import DataWebDeskDSL.PaginasNormales;
import DataWebDeskDSL.RedSocial;
import DataWebDeskDSL.Rol;
import DataWebDeskDSL.TipoDato;
import DataWebDeskDSL.Twitter;
import DataWebDeskDSL.URLExterna;
import DataWebDeskDSL.tipoContenido;

import DataWebDeskDSL.util.DataWebDeskDSLValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataWebDeskDSLPackageImpl extends EPackageImpl implements DataWebDeskDSLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataWebDeskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paginaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paginasNormalesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pagCRUDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entidadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caracteristicaEntidadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pagCrearEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pagLeerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pagBorrarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pagActualizarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redSocialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass twitterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facebookEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pagIndiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crudEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urlExternaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paginaPrincipalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rssEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoDatoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoContenidoEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see DataWebDeskDSL.DataWebDeskDSLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataWebDeskDSLPackageImpl() {
		super(eNS_URI, DataWebDeskDSLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DataWebDeskDSLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataWebDeskDSLPackage init() {
		if (isInited) return (DataWebDeskDSLPackage)EPackage.Registry.INSTANCE.getEPackage(DataWebDeskDSLPackage.eNS_URI);

		// Obtain or create and register package
		DataWebDeskDSLPackageImpl theDataWebDeskDSLPackage = (DataWebDeskDSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DataWebDeskDSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DataWebDeskDSLPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDataWebDeskDSLPackage.createPackageContents();

		// Initialize created meta-data
		theDataWebDeskDSLPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theDataWebDeskDSLPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return DataWebDeskDSLValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theDataWebDeskDSLPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataWebDeskDSLPackage.eNS_URI, theDataWebDeskDSLPackage);
		return theDataWebDeskDSLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataWebDesk() {
		return dataWebDeskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataWebDesk_Pagina() {
		return (EReference)dataWebDeskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataWebDesk_Rol() {
		return (EReference)dataWebDeskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataWebDesk_Entidad() {
		return (EReference)dataWebDeskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataWebDesk_NombreAplicacion() {
		return (EAttribute)dataWebDeskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataWebDesk_PaginasMediasAccesiblesD3() {
		return (EAttribute)dataWebDeskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataWebDesk_Redsocial() {
		return (EReference)dataWebDeskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataWebDesk_Urlexterna() {
		return (EReference)dataWebDeskEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPagina() {
		return paginaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPagina_Accedida() {
		return (EReference)paginaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPagina_Accede() {
		return (EReference)paginaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPagina_TituloPag() {
		return (EAttribute)paginaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPagina_Urlexterna() {
		return (EReference)paginaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPagina_Muestra() {
		return (EReference)paginaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPagina_Accedida_por() {
		return (EReference)paginaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaginasNormales() {
		return paginasNormalesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaginasNormales_Texto() {
		return (EAttribute)paginasNormalesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaginasNormales_Multimedia() {
		return (EAttribute)paginasNormalesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPagCRUD() {
		return pagCRUDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPagCRUD_Tiene_asociada() {
		return (EReference)pagCRUDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntidad() {
		return entidadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntidad_Caracteristica() {
		return (EReference)entidadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntidad_Asociada() {
		return (EReference)entidadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntidad_ID_Entidad() {
		return (EAttribute)entidadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntidad_Clave_primaria() {
		return (EReference)entidadEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntidad_NombreEntidad() {
		return (EAttribute)entidadEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntidad_Relacionada() {
		return (EReference)entidadEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntidad_Esta_relacionada() {
		return (EReference)entidadEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCaracteristicaEntidad() {
		return caracteristicaEntidadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaracteristicaEntidad_NombreCaract() {
		return (EAttribute)caracteristicaEntidadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaracteristicaEntidad_TDato() {
		return (EAttribute)caracteristicaEntidadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaracteristicaEntidad_Esta_en() {
		return (EReference)caracteristicaEntidadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPagCrear() {
		return pagCrearEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPagLeer() {
		return pagLeerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPagBorrar() {
		return pagBorrarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPagActualizar() {
		return pagActualizarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRol() {
		return rolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRol_NombreRol() {
		return (EAttribute)rolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRol_NumeroPaginasAccesiblesD1() {
		return (EAttribute)rolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRol_NumeroEntidadesAccesiblesD2() {
		return (EAttribute)rolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRol_Tiene_acceso() {
		return (EReference)rolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRedSocial() {
		return redSocialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRedSocial_TipoCont() {
		return (EAttribute)redSocialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRedSocial_ID_RedSocial() {
		return (EAttribute)redSocialEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRedSocial_Mostrada() {
		return (EReference)redSocialEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRedSocial_Nombre() {
		return (EAttribute)redSocialEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTwitter() {
		return twitterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFacebook() {
		return facebookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPagIndice() {
		return pagIndiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCRUD() {
		return crudEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getURLExterna() {
		return urlExternaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getURLExterna_Pagina() {
		return (EReference)urlExternaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURLExterna_Link() {
		return (EAttribute)urlExternaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURLExterna_NombreWeb() {
		return (EAttribute)urlExternaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaginaPrincipal() {
		return paginaPrincipalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRSS() {
		return rssEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoDato() {
		return tipoDatoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum gettipoContenido() {
		return tipoContenidoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataWebDeskDSLFactory getDataWebDeskDSLFactory() {
		return (DataWebDeskDSLFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dataWebDeskEClass = createEClass(DATA_WEB_DESK);
		createEReference(dataWebDeskEClass, DATA_WEB_DESK__PAGINA);
		createEReference(dataWebDeskEClass, DATA_WEB_DESK__ROL);
		createEReference(dataWebDeskEClass, DATA_WEB_DESK__ENTIDAD);
		createEAttribute(dataWebDeskEClass, DATA_WEB_DESK__NOMBRE_APLICACION);
		createEAttribute(dataWebDeskEClass, DATA_WEB_DESK__PAGINAS_MEDIAS_ACCESIBLES_D3);
		createEReference(dataWebDeskEClass, DATA_WEB_DESK__REDSOCIAL);
		createEReference(dataWebDeskEClass, DATA_WEB_DESK__URLEXTERNA);

		paginaEClass = createEClass(PAGINA);
		createEReference(paginaEClass, PAGINA__ACCEDIDA);
		createEReference(paginaEClass, PAGINA__ACCEDE);
		createEAttribute(paginaEClass, PAGINA__TITULO_PAG);
		createEReference(paginaEClass, PAGINA__URLEXTERNA);
		createEReference(paginaEClass, PAGINA__MUESTRA);
		createEReference(paginaEClass, PAGINA__ACCEDIDA_POR);

		paginasNormalesEClass = createEClass(PAGINAS_NORMALES);
		createEAttribute(paginasNormalesEClass, PAGINAS_NORMALES__TEXTO);
		createEAttribute(paginasNormalesEClass, PAGINAS_NORMALES__MULTIMEDIA);

		pagCRUDEClass = createEClass(PAG_CRUD);
		createEReference(pagCRUDEClass, PAG_CRUD__TIENE_ASOCIADA);

		entidadEClass = createEClass(ENTIDAD);
		createEReference(entidadEClass, ENTIDAD__CARACTERISTICA);
		createEReference(entidadEClass, ENTIDAD__ASOCIADA);
		createEAttribute(entidadEClass, ENTIDAD__ID_ENTIDAD);
		createEReference(entidadEClass, ENTIDAD__CLAVE_PRIMARIA);
		createEAttribute(entidadEClass, ENTIDAD__NOMBRE_ENTIDAD);
		createEReference(entidadEClass, ENTIDAD__RELACIONADA);
		createEReference(entidadEClass, ENTIDAD__ESTA_RELACIONADA);

		caracteristicaEntidadEClass = createEClass(CARACTERISTICA_ENTIDAD);
		createEAttribute(caracteristicaEntidadEClass, CARACTERISTICA_ENTIDAD__NOMBRE_CARACT);
		createEAttribute(caracteristicaEntidadEClass, CARACTERISTICA_ENTIDAD__TDATO);
		createEReference(caracteristicaEntidadEClass, CARACTERISTICA_ENTIDAD__ESTA_EN);

		pagCrearEClass = createEClass(PAG_CREAR);

		pagLeerEClass = createEClass(PAG_LEER);

		pagBorrarEClass = createEClass(PAG_BORRAR);

		pagActualizarEClass = createEClass(PAG_ACTUALIZAR);

		rolEClass = createEClass(ROL);
		createEAttribute(rolEClass, ROL__NOMBRE_ROL);
		createEAttribute(rolEClass, ROL__NUMERO_PAGINAS_ACCESIBLES_D1);
		createEAttribute(rolEClass, ROL__NUMERO_ENTIDADES_ACCESIBLES_D2);
		createEReference(rolEClass, ROL__TIENE_ACCESO);

		redSocialEClass = createEClass(RED_SOCIAL);
		createEAttribute(redSocialEClass, RED_SOCIAL__TIPO_CONT);
		createEAttribute(redSocialEClass, RED_SOCIAL__ID_RED_SOCIAL);
		createEReference(redSocialEClass, RED_SOCIAL__MOSTRADA);
		createEAttribute(redSocialEClass, RED_SOCIAL__NOMBRE);

		twitterEClass = createEClass(TWITTER);

		facebookEClass = createEClass(FACEBOOK);

		pagIndiceEClass = createEClass(PAG_INDICE);

		crudEClass = createEClass(CRUD);

		urlExternaEClass = createEClass(URL_EXTERNA);
		createEReference(urlExternaEClass, URL_EXTERNA__PAGINA);
		createEAttribute(urlExternaEClass, URL_EXTERNA__LINK);
		createEAttribute(urlExternaEClass, URL_EXTERNA__NOMBRE_WEB);

		paginaPrincipalEClass = createEClass(PAGINA_PRINCIPAL);

		rssEClass = createEClass(RSS);

		// Create enums
		tipoDatoEEnum = createEEnum(TIPO_DATO);
		tipoContenidoEEnum = createEEnum(TIPO_CONTENIDO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		paginasNormalesEClass.getESuperTypes().add(this.getPagina());
		pagCRUDEClass.getESuperTypes().add(this.getPagina());
		pagCrearEClass.getESuperTypes().add(this.getPagCRUD());
		pagLeerEClass.getESuperTypes().add(this.getPagCRUD());
		pagBorrarEClass.getESuperTypes().add(this.getPagCRUD());
		pagActualizarEClass.getESuperTypes().add(this.getPagCRUD());
		twitterEClass.getESuperTypes().add(this.getRedSocial());
		facebookEClass.getESuperTypes().add(this.getRedSocial());
		pagIndiceEClass.getESuperTypes().add(this.getPagCRUD());
		crudEClass.getESuperTypes().add(this.getPagCRUD());
		paginaPrincipalEClass.getESuperTypes().add(this.getPagina());
		rssEClass.getESuperTypes().add(this.getRedSocial());

		// Initialize classes and features; add operations and parameters
		initEClass(dataWebDeskEClass, DataWebDesk.class, "DataWebDesk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataWebDesk_Pagina(), this.getPagina(), null, "pagina", null, 0, -1, DataWebDesk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataWebDesk_Rol(), this.getRol(), null, "rol", null, 0, -1, DataWebDesk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataWebDesk_Entidad(), this.getEntidad(), null, "entidad", null, 0, -1, DataWebDesk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataWebDesk_NombreAplicacion(), ecorePackage.getEString(), "nombreAplicacion", null, 1, 1, DataWebDesk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataWebDesk_PaginasMediasAccesiblesD3(), ecorePackage.getEFloat(), "paginasMediasAccesiblesD3", null, 1, 1, DataWebDesk.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDataWebDesk_Redsocial(), this.getRedSocial(), null, "redsocial", null, 0, -1, DataWebDesk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataWebDesk_Urlexterna(), this.getURLExterna(), null, "urlexterna", null, 0, -1, DataWebDesk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paginaEClass, Pagina.class, "Pagina", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPagina_Accedida(), this.getPagina(), this.getPagina_Accede(), "accedida", null, 0, -1, Pagina.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPagina_Accede(), this.getPagina(), this.getPagina_Accedida(), "accede", null, 0, -1, Pagina.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPagina_TituloPag(), ecorePackage.getEString(), "TituloPag", null, 1, 1, Pagina.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPagina_Urlexterna(), this.getURLExterna(), this.getURLExterna_Pagina(), "urlexterna", null, 0, -1, Pagina.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPagina_Muestra(), this.getRedSocial(), this.getRedSocial_Mostrada(), "muestra", null, 0, -1, Pagina.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPagina_Accedida_por(), this.getRol(), this.getRol_Tiene_acceso(), "accedida_por", null, 0, -1, Pagina.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paginasNormalesEClass, PaginasNormales.class, "PaginasNormales", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaginasNormales_Texto(), ecorePackage.getEString(), "Texto", null, 1, -1, PaginasNormales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaginasNormales_Multimedia(), ecorePackage.getEString(), "Multimedia", null, 0, -1, PaginasNormales.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pagCRUDEClass, PagCRUD.class, "PagCRUD", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPagCRUD_Tiene_asociada(), this.getEntidad(), this.getEntidad_Asociada(), "tiene_asociada", null, 0, 1, PagCRUD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entidadEClass, Entidad.class, "Entidad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntidad_Caracteristica(), this.getCaracteristicaEntidad(), null, "caracteristica", null, 0, -1, Entidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntidad_Asociada(), this.getPagCRUD(), this.getPagCRUD_Tiene_asociada(), "asociada", null, 0, -1, Entidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntidad_ID_Entidad(), ecorePackage.getEInt(), "ID_Entidad", null, 1, 1, Entidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntidad_Clave_primaria(), this.getCaracteristicaEntidad(), this.getCaracteristicaEntidad_Esta_en(), "clave_primaria", null, 1, 1, Entidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntidad_NombreEntidad(), ecorePackage.getEString(), "nombreEntidad", null, 1, 1, Entidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntidad_Relacionada(), this.getEntidad(), this.getEntidad_Esta_relacionada(), "relacionada", null, 0, -1, Entidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntidad_Esta_relacionada(), this.getEntidad(), this.getEntidad_Relacionada(), "esta_relacionada", null, 0, -1, Entidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caracteristicaEntidadEClass, CaracteristicaEntidad.class, "CaracteristicaEntidad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCaracteristicaEntidad_NombreCaract(), ecorePackage.getEString(), "nombreCaract", null, 1, 1, CaracteristicaEntidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCaracteristicaEntidad_TDato(), this.getTipoDato(), "TDato", null, 0, 1, CaracteristicaEntidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCaracteristicaEntidad_Esta_en(), this.getEntidad(), this.getEntidad_Clave_primaria(), "esta_en", null, 0, 1, CaracteristicaEntidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pagCrearEClass, PagCrear.class, "PagCrear", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pagLeerEClass, PagLeer.class, "PagLeer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pagBorrarEClass, PagBorrar.class, "PagBorrar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pagActualizarEClass, PagActualizar.class, "PagActualizar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rolEClass, Rol.class, "Rol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRol_NombreRol(), ecorePackage.getEString(), "NombreRol", null, 1, 1, Rol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRol_NumeroPaginasAccesiblesD1(), ecorePackage.getEInt(), "numeroPaginasAccesiblesD1", null, 1, 1, Rol.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRol_NumeroEntidadesAccesiblesD2(), ecorePackage.getEInt(), "numeroEntidadesAccesiblesD2", null, 1, 1, Rol.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRol_Tiene_acceso(), this.getPagina(), this.getPagina_Accedida_por(), "tiene_acceso", null, 0, -1, Rol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(redSocialEClass, RedSocial.class, "RedSocial", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRedSocial_TipoCont(), this.gettipoContenido(), "TipoCont", null, 0, 1, RedSocial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRedSocial_ID_RedSocial(), ecorePackage.getEInt(), "ID_RedSocial", null, 1, 1, RedSocial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRedSocial_Mostrada(), this.getPagina(), this.getPagina_Muestra(), "mostrada", null, 0, -1, RedSocial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRedSocial_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, RedSocial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(twitterEClass, Twitter.class, "Twitter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(facebookEClass, Facebook.class, "Facebook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pagIndiceEClass, PagIndice.class, "PagIndice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(crudEClass, DataWebDeskDSL.CRUD.class, "CRUD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(urlExternaEClass, URLExterna.class, "URLExterna", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getURLExterna_Pagina(), this.getPagina(), this.getPagina_Urlexterna(), "pagina", null, 0, -1, URLExterna.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getURLExterna_Link(), ecorePackage.getEString(), "Link", null, 1, 1, URLExterna.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getURLExterna_NombreWeb(), ecorePackage.getEString(), "nombreWeb", null, 1, 1, URLExterna.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paginaPrincipalEClass, PaginaPrincipal.class, "PaginaPrincipal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rssEClass, DataWebDeskDSL.RSS.class, "RSS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(tipoDatoEEnum, TipoDato.class, "TipoDato");
		addEEnumLiteral(tipoDatoEEnum, TipoDato.INTEGER);
		addEEnumLiteral(tipoDatoEEnum, TipoDato.BOOLEAN);
		addEEnumLiteral(tipoDatoEEnum, TipoDato.STRING);

		initEEnum(tipoContenidoEEnum, tipoContenido.class, "tipoContenido");
		addEEnumLiteral(tipoContenidoEEnum, tipoContenido.TEXTO);
		addEEnumLiteral(tipoContenidoEEnum, tipoContenido.MULTIMEDIA);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.link
		createGmf_3Annotations();
		// gmf.compartment
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (dataWebDeskEClass, 
		   source, 
		   new String[] {
			 "constraints", "idRedSocialNombre idRedSocialID idPagina idRol idURLExterna idEntidadID idEntidadNombre unaPrincipalR1 algunaRSR5"
		   });	
		addAnnotation
		  (paginaEClass, 
		   source, 
		   new String[] {
			 "constraints", "noPagAisladaR2"
		   });	
		addAnnotation
		  (pagCRUDEClass, 
		   source, 
		   new String[] {
			 "constraints", "CRUDNoSuelta"
		   });	
		addAnnotation
		  (entidadEClass, 
		   source, 
		   new String[] {
			 "constraints", "idCaracteristica soloCRUDR3 indiceDetalleR4 detalleIndiceR4 noSelfRefR6 noBidireccionalRefR7"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (dataWebDeskEClass, 
		   source, 
		   new String[] {
			 "foo", "bar",
			 "diagram.extension", "DMSS"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (dataWebDeskEClass, 
		   source, 
		   new String[] {
			 "idRedSocialNombre", "self.redsocial->isUnique(nombre)",
			 "idRedSocialID", "self.redsocial->isUnique(ID_RedSocial)",
			 "idPagina", "self.pagina->isUnique(TituloPag)",
			 "idRol", "self.rol->isUnique(NombreRol)",
			 "idURLExterna", "self.urlexterna->isUnique(Link)",
			 "idEntidadID", "self.entidad->isUnique(ID_Entidad)",
			 "idEntidadNombre", "self.entidad->isUnique(nombreEntidad)",
			 "unaPrincipalR1", "self.pagina->selectByType(PaginaPrincipal)->size()=1",
			 "algunaRSR5", "self.pagina.muestra->size() > 0"
		   });	
		addAnnotation
		  (getDataWebDesk_PaginasMediasAccesiblesD3(), 
		   source, 
		   new String[] {
			 "derivation", "if(self.rol->size()=0) then 0\n\t\t\telse self.rol.numeroPaginasAccesiblesD1->sum() / self.rol->size()\n\t\t\tendif"
		   });	
		addAnnotation
		  (paginaEClass, 
		   source, 
		   new String[] {
			 "noPagAisladaR2", "self->closure(accede).accedida_por -> size() > 0"
		   });	
		addAnnotation
		  (pagCRUDEClass, 
		   source, 
		   new String[] {
			 "CRUDNoSuelta", "self.tiene_asociada->size()>0 or self.accede->selectByType(CRUD)->size()>0"
		   });	
		addAnnotation
		  (entidadEClass, 
		   source, 
		   new String[] {
			 "idCaracteristica", "self.caracteristica->isUnique(nombreCaract)",
			 "soloCRUDR3", "self.asociada->select(p: PagCRUD | p.oclIsTypeOf(CRUD))->size() > 0 implies self.asociada->size()=1",
			 "indiceDetalleR4", "self.asociada->select(p: PagCRUD | p.oclIsTypeOf(PagIndice)) -> size() > 0 implies self.asociada->select(p: PagCRUD | p.oclIsTypeOf(PagLeer)) -> size() = 1 ",
			 "detalleIndiceR4", "self.asociada->select(p: PagCRUD | p.oclIsTypeOf(PagLeer)) -> size() > 0 implies self.asociada->select(p: PagCRUD | p.oclIsTypeOf(PagIndice)) -> size() = 1 ",
			 "noSelfRefR6", "self.esta_relacionada->excludes(self)",
			 "noBidireccionalRefR7", " self.relacionada->closure(relacionada)->excludes(self)"
		   });	
		addAnnotation
		  (getRol_NumeroPaginasAccesiblesD1(), 
		   source, 
		   new String[] {
			 "derivation", "self.tiene_acceso->closure(accede)->size()"
		   });	
		addAnnotation
		  (getRol_NumeroEntidadesAccesiblesD2(), 
		   source, 
		   new String[] {
			 "derivation", "if(self.tiene_acceso->size() = 0) then 0\n\t\t\t\t\telse self.tiene_acceso->selectByType(PagCRUD).tiene_asociada->asSet()->size()\n\t\t\t\t\tendif"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (paginaEClass, 
		   source, 
		   new String[] {
			 "label", "TituloPag",
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/ProyectoDMSS/iconos/pagina.svg",
			 "label.icon", "false",
			 "label.placement", "external"
		   });	
		addAnnotation
		  (pagCRUDEClass, 
		   source, 
		   new String[] {
			 "label", "TituloPag",
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/ProyectoDMSS/iconos/paginaCRUD.svg",
			 "label.icon", "false",
			 "label.placement", "external"
		   });	
		addAnnotation
		  (entidadEClass, 
		   source, 
		   new String[] {
			 "label", "nombreEntidad",
			 "border.color", "0,0,0"
		   });	
		addAnnotation
		  (caracteristicaEntidadEClass, 
		   source, 
		   new String[] {
			 "label", "nombreCaract",
			 "figure", "rectangle",
			 "label.icon", "true"
		   });	
		addAnnotation
		  (rolEClass, 
		   source, 
		   new String[] {
			 "label", "NombreRol",
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/ProyectoDMSS/iconos/rol.svg",
			 "label.icon", "false",
			 "label.placement", "external"
		   });	
		addAnnotation
		  (redSocialEClass, 
		   source, 
		   new String[] {
			 "label", "nombre",
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/ProyectoDMSS/iconos/socialMedia.svg",
			 "label.icon", "false",
			 "label.placement", "external"
		   });	
		addAnnotation
		  (urlExternaEClass, 
		   source, 
		   new String[] {
			 "label", "Link",
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/ProyectoDMSS/iconos/link.svg",
			 "label.icon", "false",
			 "label.placement", "external"
		   });	
		addAnnotation
		  (paginaPrincipalEClass, 
		   source, 
		   new String[] {
			 "label", "TituloPag",
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/ProyectoDMSS/iconos/home.svg",
			 "label.icon", "false",
			 "label.placement", "external"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (getPagina_Accede(), 
		   source, 
		   new String[] {
			 "source", "accede",
			 "target", "accedida",
			 "label", "accede",
			 "target.decoration", "arrow"
		   });	
		addAnnotation
		  (getEntidad_Asociada(), 
		   source, 
		   new String[] {
			 "source", "tiene_asociada",
			 "target", "asociada",
			 "label", "CRUD asociada",
			 "target.decoration", "arrow"
		   });	
		addAnnotation
		  (getEntidad_Clave_primaria(), 
		   source, 
		   new String[] {
			 "source", "esta_en",
			 "target", "clave_primaria",
			 "label", "clave_primaria",
			 "target.decoration", "arrow"
		   });	
		addAnnotation
		  (getEntidad_Relacionada(), 
		   source, 
		   new String[] {
			 "source", "relacionada",
			 "target", "esta_relacionada",
			 "label", "relacionada",
			 "target.decoration", "arrow"
		   });	
		addAnnotation
		  (getRol_Tiene_acceso(), 
		   source, 
		   new String[] {
			 "source", "accedida_por",
			 "target", "tiene_acceso",
			 "label", "tiene_acceso",
			 "target.decoration", "arrow"
		   });	
		addAnnotation
		  (getRedSocial_Mostrada(), 
		   source, 
		   new String[] {
			 "source", "muestra",
			 "target", "mostrada",
			 "label", "mostrada_en",
			 "target.decoration", "arrow"
		   });	
		addAnnotation
		  (getURLExterna_Pagina(), 
		   source, 
		   new String[] {
			 "source", "urlexterna",
			 "target", "pagina",
			 "label", "enlazada_en",
			 "target.decoration", "arrow"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getEntidad_Caracteristica(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });
	}

} //DataWebDeskDSLPackageImpl
