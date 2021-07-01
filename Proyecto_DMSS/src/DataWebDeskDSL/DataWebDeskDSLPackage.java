/**
 */
package DataWebDeskDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see DataWebDeskDSL.DataWebDeskDSLFactory
 * @model kind="package"
 *        annotation="gmf foo='bar'"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface DataWebDeskDSLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DataWebDeskDSL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://DataWebDeskDSL.com";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "DataWebDeskDSL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataWebDeskDSLPackage eINSTANCE = DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl.init();

	/**
	 * The meta object id for the '{@link DataWebDeskDSL.impl.DataWebDeskImpl <em>Data Web Desk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataWebDeskDSL.impl.DataWebDeskImpl
	 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getDataWebDesk()
	 * @generated
	 */
	int DATA_WEB_DESK = 0;

	/**
	 * The feature id for the '<em><b>Pagina</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WEB_DESK__PAGINA = 0;

	/**
	 * The feature id for the '<em><b>Rol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WEB_DESK__ROL = 1;

	/**
	 * The feature id for the '<em><b>Entidad</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WEB_DESK__ENTIDAD = 2;

	/**
	 * The feature id for the '<em><b>Nombre Aplicacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WEB_DESK__NOMBRE_APLICACION = 3;

	/**
	 * The feature id for the '<em><b>Paginas Medias Accesibles D3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WEB_DESK__PAGINAS_MEDIAS_ACCESIBLES_D3 = 4;

	/**
	 * The feature id for the '<em><b>Redsocial</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WEB_DESK__REDSOCIAL = 5;

	/**
	 * The feature id for the '<em><b>Urlexterna</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WEB_DESK__URLEXTERNA = 6;

	/**
	 * The number of structural features of the '<em>Data Web Desk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_WEB_DESK_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link DataWebDeskDSL.impl.PaginaImpl <em>Pagina</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataWebDeskDSL.impl.PaginaImpl
	 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getPagina()
	 * @generated
	 */
	int PAGINA = 1;

	/**
	 * The feature id for the '<em><b>Accedida</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA__ACCEDIDA = 0;

	/**
	 * The feature id for the '<em><b>Accede</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA__ACCEDE = 1;

	/**
	 * The feature id for the '<em><b>Titulo Pag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA__TITULO_PAG = 2;

	/**
	 * The feature id for the '<em><b>Urlexterna</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA__URLEXTERNA = 3;

	/**
	 * The feature id for the '<em><b>Muestra</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA__MUESTRA = 4;

	/**
	 * The feature id for the '<em><b>Accedida por</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA__ACCEDIDA_POR = 5;

	/**
	 * The number of structural features of the '<em>Pagina</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link DataWebDeskDSL.impl.PaginasNormalesImpl <em>Paginas Normales</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataWebDeskDSL.impl.PaginasNormalesImpl
	 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getPaginasNormales()
	 * @generated
	 */
	int PAGINAS_NORMALES = 2;

	/**
	 * The feature id for the '<em><b>Accedida</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINAS_NORMALES__ACCEDIDA = PAGINA__ACCEDIDA;

	/**
	 * The feature id for the '<em><b>Accede</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINAS_NORMALES__ACCEDE = PAGINA__ACCEDE;

	/**
	 * The feature id for the '<em><b>Titulo Pag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINAS_NORMALES__TITULO_PAG = PAGINA__TITULO_PAG;

	/**
	 * The feature id for the '<em><b>Urlexterna</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINAS_NORMALES__URLEXTERNA = PAGINA__URLEXTERNA;

	/**
	 * The feature id for the '<em><b>Muestra</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINAS_NORMALES__MUESTRA = PAGINA__MUESTRA;

	/**
	 * The feature id for the '<em><b>Accedida por</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINAS_NORMALES__ACCEDIDA_POR = PAGINA__ACCEDIDA_POR;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINAS_NORMALES__TEXTO = PAGINA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multimedia</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINAS_NORMALES__MULTIMEDIA = PAGINA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Paginas Normales</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINAS_NORMALES_FEATURE_COUNT = PAGINA_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link DataWebDeskDSL.impl.PagCRUDImpl <em>Pag CRUD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataWebDeskDSL.impl.PagCRUDImpl
	 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getPagCRUD()
	 * @generated
	 */
	int PAG_CRUD = 3;

	/**
	 * The feature id for the '<em><b>Accedida</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_CRUD__ACCEDIDA = PAGINA__ACCEDIDA;

	/**
	 * The feature id for the '<em><b>Accede</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_CRUD__ACCEDE = PAGINA__ACCEDE;

	/**
	 * The feature id for the '<em><b>Titulo Pag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_CRUD__TITULO_PAG = PAGINA__TITULO_PAG;

	/**
	 * The feature id for the '<em><b>Urlexterna</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_CRUD__URLEXTERNA = PAGINA__URLEXTERNA;

	/**
	 * The feature id for the '<em><b>Muestra</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_CRUD__MUESTRA = PAGINA__MUESTRA;

	/**
	 * The feature id for the '<em><b>Accedida por</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_CRUD__ACCEDIDA_POR = PAGINA__ACCEDIDA_POR;

	/**
	 * The feature id for the '<em><b>Tiene asociada</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_CRUD__TIENE_ASOCIADA = PAGINA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pag CRUD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_CRUD_FEATURE_COUNT = PAGINA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link DataWebDeskDSL.impl.EntidadImpl <em>Entidad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataWebDeskDSL.impl.EntidadImpl
	 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getEntidad()
	 * @generated
	 */
	int ENTIDAD = 4;

	/**
	 * The feature id for the '<em><b>Caracteristica</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD__CARACTERISTICA = 0;

	/**
	 * The feature id for the '<em><b>Asociada</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD__ASOCIADA = 1;

	/**
	 * The feature id for the '<em><b>Id Entidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD__ID_ENTIDAD = 2;

	/**
	 * The feature id for the '<em><b>Clave primaria</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD__CLAVE_PRIMARIA = 3;

	/**
	 * The feature id for the '<em><b>Nombre Entidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD__NOMBRE_ENTIDAD = 4;

	/**
	 * The feature id for the '<em><b>Relacionada</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD__RELACIONADA = 5;

	/**
	 * The feature id for the '<em><b>Esta relacionada</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD__ESTA_RELACIONADA = 6;

	/**
	 * The number of structural features of the '<em>Entidad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link DataWebDeskDSL.impl.CaracteristicaEntidadImpl <em>Caracteristica Entidad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataWebDeskDSL.impl.CaracteristicaEntidadImpl
	 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getCaracteristicaEntidad()
	 * @generated
	 */
	int CARACTERISTICA_ENTIDAD = 5;

	/**
	 * The feature id for the '<em><b>Nombre Caract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARACTERISTICA_ENTIDAD__NOMBRE_CARACT = 0;

	/**
	 * The feature id for the '<em><b>Tipo Dato</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARACTERISTICA_ENTIDAD__TIPO_DATO = 1;

	/**
	 * The feature id for the '<em><b>Esta en</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARACTERISTICA_ENTIDAD__ESTA_EN = 2;

	/**
	 * The number of structural features of the '<em>Caracteristica Entidad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARACTERISTICA_ENTIDAD_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link DataWebDeskDSL.impl.PagCrearImpl <em>Pag Crear</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataWebDeskDSL.impl.PagCrearImpl
	 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getPagCrear()
	 * @generated
	 */
	int PAG_CREAR = 6;

	/**
	 * The feature id for the '<em><b>Accedida</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_CREAR__ACCEDIDA = PAG_CRUD__ACCEDIDA;

	/**
	 * The feature id for the '<em><b>Accede</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_CREAR__ACCEDE = PAG_CRUD__ACCEDE;

	/**
	 * The feature id for the '<em><b>Titulo Pag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_CREAR__TITULO_PAG = PAG_CRUD__TITULO_PAG;

	/**
	 * The feature id for the '<em><b>Urlexterna</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_CREAR__URLEXTERNA = PAG_CRUD__URLEXTERNA;

	/**
	 * The feature id for the '<em><b>Muestra</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_CREAR__MUESTRA = PAG_CRUD__MUESTRA;

	/**
	 * The feature id for the '<em><b>Accedida por</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_CREAR__ACCEDIDA_POR = PAG_CRUD__ACCEDIDA_POR;

	/**
	 * The feature id for the '<em><b>Tiene asociada</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_CREAR__TIENE_ASOCIADA = PAG_CRUD__TIENE_ASOCIADA;

	/**
	 * The number of structural features of the '<em>Pag Crear</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_CREAR_FEATURE_COUNT = PAG_CRUD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataWebDeskDSL.impl.PagLeerImpl <em>Pag Leer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataWebDeskDSL.impl.PagLeerImpl
	 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getPagLeer()
	 * @generated
	 */
	int PAG_LEER = 7;

	/**
	 * The feature id for the '<em><b>Accedida</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_LEER__ACCEDIDA = PAG_CRUD__ACCEDIDA;

	/**
	 * The feature id for the '<em><b>Accede</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_LEER__ACCEDE = PAG_CRUD__ACCEDE;

	/**
	 * The feature id for the '<em><b>Titulo Pag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_LEER__TITULO_PAG = PAG_CRUD__TITULO_PAG;

	/**
	 * The feature id for the '<em><b>Urlexterna</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_LEER__URLEXTERNA = PAG_CRUD__URLEXTERNA;

	/**
	 * The feature id for the '<em><b>Muestra</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_LEER__MUESTRA = PAG_CRUD__MUESTRA;

	/**
	 * The feature id for the '<em><b>Accedida por</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_LEER__ACCEDIDA_POR = PAG_CRUD__ACCEDIDA_POR;

	/**
	 * The feature id for the '<em><b>Tiene asociada</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_LEER__TIENE_ASOCIADA = PAG_CRUD__TIENE_ASOCIADA;

	/**
	 * The number of structural features of the '<em>Pag Leer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_LEER_FEATURE_COUNT = PAG_CRUD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataWebDeskDSL.impl.PagBorrarImpl <em>Pag Borrar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataWebDeskDSL.impl.PagBorrarImpl
	 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getPagBorrar()
	 * @generated
	 */
	int PAG_BORRAR = 8;

	/**
	 * The feature id for the '<em><b>Accedida</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_BORRAR__ACCEDIDA = PAG_CRUD__ACCEDIDA;

	/**
	 * The feature id for the '<em><b>Accede</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_BORRAR__ACCEDE = PAG_CRUD__ACCEDE;

	/**
	 * The feature id for the '<em><b>Titulo Pag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_BORRAR__TITULO_PAG = PAG_CRUD__TITULO_PAG;

	/**
	 * The feature id for the '<em><b>Urlexterna</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_BORRAR__URLEXTERNA = PAG_CRUD__URLEXTERNA;

	/**
	 * The feature id for the '<em><b>Muestra</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_BORRAR__MUESTRA = PAG_CRUD__MUESTRA;

	/**
	 * The feature id for the '<em><b>Accedida por</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_BORRAR__ACCEDIDA_POR = PAG_CRUD__ACCEDIDA_POR;

	/**
	 * The feature id for the '<em><b>Tiene asociada</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_BORRAR__TIENE_ASOCIADA = PAG_CRUD__TIENE_ASOCIADA;

	/**
	 * The number of structural features of the '<em>Pag Borrar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_BORRAR_FEATURE_COUNT = PAG_CRUD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataWebDeskDSL.impl.PagActualizarImpl <em>Pag Actualizar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataWebDeskDSL.impl.PagActualizarImpl
	 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getPagActualizar()
	 * @generated
	 */
	int PAG_ACTUALIZAR = 9;

	/**
	 * The feature id for the '<em><b>Accedida</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_ACTUALIZAR__ACCEDIDA = PAG_CRUD__ACCEDIDA;

	/**
	 * The feature id for the '<em><b>Accede</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_ACTUALIZAR__ACCEDE = PAG_CRUD__ACCEDE;

	/**
	 * The feature id for the '<em><b>Titulo Pag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_ACTUALIZAR__TITULO_PAG = PAG_CRUD__TITULO_PAG;

	/**
	 * The feature id for the '<em><b>Urlexterna</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_ACTUALIZAR__URLEXTERNA = PAG_CRUD__URLEXTERNA;

	/**
	 * The feature id for the '<em><b>Muestra</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_ACTUALIZAR__MUESTRA = PAG_CRUD__MUESTRA;

	/**
	 * The feature id for the '<em><b>Accedida por</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_ACTUALIZAR__ACCEDIDA_POR = PAG_CRUD__ACCEDIDA_POR;

	/**
	 * The feature id for the '<em><b>Tiene asociada</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_ACTUALIZAR__TIENE_ASOCIADA = PAG_CRUD__TIENE_ASOCIADA;

	/**
	 * The number of structural features of the '<em>Pag Actualizar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_ACTUALIZAR_FEATURE_COUNT = PAG_CRUD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataWebDeskDSL.impl.RolImpl <em>Rol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataWebDeskDSL.impl.RolImpl
	 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getRol()
	 * @generated
	 */
	int ROL = 10;

	/**
	 * The feature id for the '<em><b>Nombre Rol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__NOMBRE_ROL = 0;

	/**
	 * The feature id for the '<em><b>Numero Paginas Accesibles D1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__NUMERO_PAGINAS_ACCESIBLES_D1 = 1;

	/**
	 * The feature id for the '<em><b>Numero Entidades Accesibles D2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__NUMERO_ENTIDADES_ACCESIBLES_D2 = 2;

	/**
	 * The feature id for the '<em><b>Tiene acceso</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__TIENE_ACCESO = 3;

	/**
	 * The number of structural features of the '<em>Rol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link DataWebDeskDSL.impl.RedSocialImpl <em>Red Social</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataWebDeskDSL.impl.RedSocialImpl
	 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getRedSocial()
	 * @generated
	 */
	int RED_SOCIAL = 11;

	/**
	 * The feature id for the '<em><b>Tipo Cont</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RED_SOCIAL__TIPO_CONT = 0;

	/**
	 * The feature id for the '<em><b>Id Red Social</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RED_SOCIAL__ID_RED_SOCIAL = 1;

	/**
	 * The feature id for the '<em><b>Mostrada</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RED_SOCIAL__MOSTRADA = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RED_SOCIAL__NOMBRE = 3;

	/**
	 * The number of structural features of the '<em>Red Social</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RED_SOCIAL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link DataWebDeskDSL.impl.TwitterImpl <em>Twitter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataWebDeskDSL.impl.TwitterImpl
	 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getTwitter()
	 * @generated
	 */
	int TWITTER = 12;

	/**
	 * The feature id for the '<em><b>Tipo Cont</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER__TIPO_CONT = RED_SOCIAL__TIPO_CONT;

	/**
	 * The feature id for the '<em><b>Id Red Social</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER__ID_RED_SOCIAL = RED_SOCIAL__ID_RED_SOCIAL;

	/**
	 * The feature id for the '<em><b>Mostrada</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER__MOSTRADA = RED_SOCIAL__MOSTRADA;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER__NOMBRE = RED_SOCIAL__NOMBRE;

	/**
	 * The number of structural features of the '<em>Twitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_FEATURE_COUNT = RED_SOCIAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataWebDeskDSL.impl.FacebookImpl <em>Facebook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataWebDeskDSL.impl.FacebookImpl
	 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getFacebook()
	 * @generated
	 */
	int FACEBOOK = 13;

	/**
	 * The feature id for the '<em><b>Tipo Cont</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK__TIPO_CONT = RED_SOCIAL__TIPO_CONT;

	/**
	 * The feature id for the '<em><b>Id Red Social</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK__ID_RED_SOCIAL = RED_SOCIAL__ID_RED_SOCIAL;

	/**
	 * The feature id for the '<em><b>Mostrada</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK__MOSTRADA = RED_SOCIAL__MOSTRADA;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK__NOMBRE = RED_SOCIAL__NOMBRE;

	/**
	 * The number of structural features of the '<em>Facebook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK_FEATURE_COUNT = RED_SOCIAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataWebDeskDSL.impl.PagIndiceImpl <em>Pag Indice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataWebDeskDSL.impl.PagIndiceImpl
	 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getPagIndice()
	 * @generated
	 */
	int PAG_INDICE = 14;

	/**
	 * The feature id for the '<em><b>Accedida</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_INDICE__ACCEDIDA = PAG_CRUD__ACCEDIDA;

	/**
	 * The feature id for the '<em><b>Accede</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_INDICE__ACCEDE = PAG_CRUD__ACCEDE;

	/**
	 * The feature id for the '<em><b>Titulo Pag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_INDICE__TITULO_PAG = PAG_CRUD__TITULO_PAG;

	/**
	 * The feature id for the '<em><b>Urlexterna</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_INDICE__URLEXTERNA = PAG_CRUD__URLEXTERNA;

	/**
	 * The feature id for the '<em><b>Muestra</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_INDICE__MUESTRA = PAG_CRUD__MUESTRA;

	/**
	 * The feature id for the '<em><b>Accedida por</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_INDICE__ACCEDIDA_POR = PAG_CRUD__ACCEDIDA_POR;

	/**
	 * The feature id for the '<em><b>Tiene asociada</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_INDICE__TIENE_ASOCIADA = PAG_CRUD__TIENE_ASOCIADA;

	/**
	 * The number of structural features of the '<em>Pag Indice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAG_INDICE_FEATURE_COUNT = PAG_CRUD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataWebDeskDSL.impl.CRUDImpl <em>CRUD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataWebDeskDSL.impl.CRUDImpl
	 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getCRUD()
	 * @generated
	 */
	int CRUD = 15;

	/**
	 * The feature id for the '<em><b>Accedida</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD__ACCEDIDA = PAG_CRUD__ACCEDIDA;

	/**
	 * The feature id for the '<em><b>Accede</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD__ACCEDE = PAG_CRUD__ACCEDE;

	/**
	 * The feature id for the '<em><b>Titulo Pag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD__TITULO_PAG = PAG_CRUD__TITULO_PAG;

	/**
	 * The feature id for the '<em><b>Urlexterna</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD__URLEXTERNA = PAG_CRUD__URLEXTERNA;

	/**
	 * The feature id for the '<em><b>Muestra</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD__MUESTRA = PAG_CRUD__MUESTRA;

	/**
	 * The feature id for the '<em><b>Accedida por</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD__ACCEDIDA_POR = PAG_CRUD__ACCEDIDA_POR;

	/**
	 * The feature id for the '<em><b>Tiene asociada</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD__TIENE_ASOCIADA = PAG_CRUD__TIENE_ASOCIADA;

	/**
	 * The number of structural features of the '<em>CRUD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_FEATURE_COUNT = PAG_CRUD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataWebDeskDSL.impl.URLExternaImpl <em>URL Externa</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataWebDeskDSL.impl.URLExternaImpl
	 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getURLExterna()
	 * @generated
	 */
	int URL_EXTERNA = 16;

	/**
	 * The feature id for the '<em><b>Pagina</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_EXTERNA__PAGINA = 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_EXTERNA__LINK = 1;

	/**
	 * The feature id for the '<em><b>Nombre Web</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_EXTERNA__NOMBRE_WEB = 2;

	/**
	 * The number of structural features of the '<em>URL Externa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_EXTERNA_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link DataWebDeskDSL.impl.PaginaPrincipalImpl <em>Pagina Principal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataWebDeskDSL.impl.PaginaPrincipalImpl
	 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getPaginaPrincipal()
	 * @generated
	 */
	int PAGINA_PRINCIPAL = 17;

	/**
	 * The feature id for the '<em><b>Accedida</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA_PRINCIPAL__ACCEDIDA = PAGINA__ACCEDIDA;

	/**
	 * The feature id for the '<em><b>Accede</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA_PRINCIPAL__ACCEDE = PAGINA__ACCEDE;

	/**
	 * The feature id for the '<em><b>Titulo Pag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA_PRINCIPAL__TITULO_PAG = PAGINA__TITULO_PAG;

	/**
	 * The feature id for the '<em><b>Urlexterna</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA_PRINCIPAL__URLEXTERNA = PAGINA__URLEXTERNA;

	/**
	 * The feature id for the '<em><b>Muestra</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA_PRINCIPAL__MUESTRA = PAGINA__MUESTRA;

	/**
	 * The feature id for the '<em><b>Accedida por</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA_PRINCIPAL__ACCEDIDA_POR = PAGINA__ACCEDIDA_POR;

	/**
	 * The number of structural features of the '<em>Pagina Principal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA_PRINCIPAL_FEATURE_COUNT = PAGINA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataWebDeskDSL.impl.RSSImpl <em>RSS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataWebDeskDSL.impl.RSSImpl
	 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getRSS()
	 * @generated
	 */
	int RSS = 18;

	/**
	 * The feature id for the '<em><b>Tipo Cont</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSS__TIPO_CONT = RED_SOCIAL__TIPO_CONT;

	/**
	 * The feature id for the '<em><b>Id Red Social</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSS__ID_RED_SOCIAL = RED_SOCIAL__ID_RED_SOCIAL;

	/**
	 * The feature id for the '<em><b>Mostrada</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSS__MOSTRADA = RED_SOCIAL__MOSTRADA;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSS__NOMBRE = RED_SOCIAL__NOMBRE;

	/**
	 * The number of structural features of the '<em>RSS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSS_FEATURE_COUNT = RED_SOCIAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DataWebDeskDSL.TipoDato <em>Tipo Dato</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataWebDeskDSL.TipoDato
	 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getTipoDato()
	 * @generated
	 */
	int TIPO_DATO = 19;

	/**
	 * The meta object id for the '{@link DataWebDeskDSL.tipoContenido <em>tipo Contenido</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DataWebDeskDSL.tipoContenido
	 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#gettipoContenido()
	 * @generated
	 */
	int TIPO_CONTENIDO = 20;


	/**
	 * Returns the meta object for class '{@link DataWebDeskDSL.DataWebDesk <em>Data Web Desk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Web Desk</em>'.
	 * @see DataWebDeskDSL.DataWebDesk
	 * @generated
	 */
	EClass getDataWebDesk();

	/**
	 * Returns the meta object for the containment reference list '{@link DataWebDeskDSL.DataWebDesk#getPagina <em>Pagina</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pagina</em>'.
	 * @see DataWebDeskDSL.DataWebDesk#getPagina()
	 * @see #getDataWebDesk()
	 * @generated
	 */
	EReference getDataWebDesk_Pagina();

	/**
	 * Returns the meta object for the containment reference list '{@link DataWebDeskDSL.DataWebDesk#getRol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rol</em>'.
	 * @see DataWebDeskDSL.DataWebDesk#getRol()
	 * @see #getDataWebDesk()
	 * @generated
	 */
	EReference getDataWebDesk_Rol();

	/**
	 * Returns the meta object for the containment reference list '{@link DataWebDeskDSL.DataWebDesk#getEntidad <em>Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entidad</em>'.
	 * @see DataWebDeskDSL.DataWebDesk#getEntidad()
	 * @see #getDataWebDesk()
	 * @generated
	 */
	EReference getDataWebDesk_Entidad();

	/**
	 * Returns the meta object for the attribute '{@link DataWebDeskDSL.DataWebDesk#getNombreAplicacion <em>Nombre Aplicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Aplicacion</em>'.
	 * @see DataWebDeskDSL.DataWebDesk#getNombreAplicacion()
	 * @see #getDataWebDesk()
	 * @generated
	 */
	EAttribute getDataWebDesk_NombreAplicacion();

	/**
	 * Returns the meta object for the attribute '{@link DataWebDeskDSL.DataWebDesk#getPaginasMediasAccesiblesD3 <em>Paginas Medias Accesibles D3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paginas Medias Accesibles D3</em>'.
	 * @see DataWebDeskDSL.DataWebDesk#getPaginasMediasAccesiblesD3()
	 * @see #getDataWebDesk()
	 * @generated
	 */
	EAttribute getDataWebDesk_PaginasMediasAccesiblesD3();

	/**
	 * Returns the meta object for the containment reference list '{@link DataWebDeskDSL.DataWebDesk#getRedsocial <em>Redsocial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Redsocial</em>'.
	 * @see DataWebDeskDSL.DataWebDesk#getRedsocial()
	 * @see #getDataWebDesk()
	 * @generated
	 */
	EReference getDataWebDesk_Redsocial();

	/**
	 * Returns the meta object for the containment reference list '{@link DataWebDeskDSL.DataWebDesk#getUrlexterna <em>Urlexterna</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Urlexterna</em>'.
	 * @see DataWebDeskDSL.DataWebDesk#getUrlexterna()
	 * @see #getDataWebDesk()
	 * @generated
	 */
	EReference getDataWebDesk_Urlexterna();

	/**
	 * Returns the meta object for class '{@link DataWebDeskDSL.Pagina <em>Pagina</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pagina</em>'.
	 * @see DataWebDeskDSL.Pagina
	 * @generated
	 */
	EClass getPagina();

	/**
	 * Returns the meta object for the reference list '{@link DataWebDeskDSL.Pagina#getAccedida <em>Accedida</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accedida</em>'.
	 * @see DataWebDeskDSL.Pagina#getAccedida()
	 * @see #getPagina()
	 * @generated
	 */
	EReference getPagina_Accedida();

	/**
	 * Returns the meta object for the reference list '{@link DataWebDeskDSL.Pagina#getAccede <em>Accede</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accede</em>'.
	 * @see DataWebDeskDSL.Pagina#getAccede()
	 * @see #getPagina()
	 * @generated
	 */
	EReference getPagina_Accede();

	/**
	 * Returns the meta object for the attribute '{@link DataWebDeskDSL.Pagina#getTituloPag <em>Titulo Pag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titulo Pag</em>'.
	 * @see DataWebDeskDSL.Pagina#getTituloPag()
	 * @see #getPagina()
	 * @generated
	 */
	EAttribute getPagina_TituloPag();

	/**
	 * Returns the meta object for the reference list '{@link DataWebDeskDSL.Pagina#getUrlexterna <em>Urlexterna</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Urlexterna</em>'.
	 * @see DataWebDeskDSL.Pagina#getUrlexterna()
	 * @see #getPagina()
	 * @generated
	 */
	EReference getPagina_Urlexterna();

	/**
	 * Returns the meta object for the reference list '{@link DataWebDeskDSL.Pagina#getMuestra <em>Muestra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Muestra</em>'.
	 * @see DataWebDeskDSL.Pagina#getMuestra()
	 * @see #getPagina()
	 * @generated
	 */
	EReference getPagina_Muestra();

	/**
	 * Returns the meta object for the reference list '{@link DataWebDeskDSL.Pagina#getAccedida_por <em>Accedida por</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accedida por</em>'.
	 * @see DataWebDeskDSL.Pagina#getAccedida_por()
	 * @see #getPagina()
	 * @generated
	 */
	EReference getPagina_Accedida_por();

	/**
	 * Returns the meta object for class '{@link DataWebDeskDSL.PaginasNormales <em>Paginas Normales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paginas Normales</em>'.
	 * @see DataWebDeskDSL.PaginasNormales
	 * @generated
	 */
	EClass getPaginasNormales();

	/**
	 * Returns the meta object for the attribute list '{@link DataWebDeskDSL.PaginasNormales#getTexto <em>Texto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Texto</em>'.
	 * @see DataWebDeskDSL.PaginasNormales#getTexto()
	 * @see #getPaginasNormales()
	 * @generated
	 */
	EAttribute getPaginasNormales_Texto();

	/**
	 * Returns the meta object for the attribute list '{@link DataWebDeskDSL.PaginasNormales#getMultimedia <em>Multimedia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Multimedia</em>'.
	 * @see DataWebDeskDSL.PaginasNormales#getMultimedia()
	 * @see #getPaginasNormales()
	 * @generated
	 */
	EAttribute getPaginasNormales_Multimedia();

	/**
	 * Returns the meta object for class '{@link DataWebDeskDSL.PagCRUD <em>Pag CRUD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pag CRUD</em>'.
	 * @see DataWebDeskDSL.PagCRUD
	 * @generated
	 */
	EClass getPagCRUD();

	/**
	 * Returns the meta object for the reference '{@link DataWebDeskDSL.PagCRUD#getTiene_asociada <em>Tiene asociada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tiene asociada</em>'.
	 * @see DataWebDeskDSL.PagCRUD#getTiene_asociada()
	 * @see #getPagCRUD()
	 * @generated
	 */
	EReference getPagCRUD_Tiene_asociada();

	/**
	 * Returns the meta object for class '{@link DataWebDeskDSL.Entidad <em>Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entidad</em>'.
	 * @see DataWebDeskDSL.Entidad
	 * @generated
	 */
	EClass getEntidad();

	/**
	 * Returns the meta object for the containment reference list '{@link DataWebDeskDSL.Entidad#getCaracteristica <em>Caracteristica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Caracteristica</em>'.
	 * @see DataWebDeskDSL.Entidad#getCaracteristica()
	 * @see #getEntidad()
	 * @generated
	 */
	EReference getEntidad_Caracteristica();

	/**
	 * Returns the meta object for the reference list '{@link DataWebDeskDSL.Entidad#getAsociada <em>Asociada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Asociada</em>'.
	 * @see DataWebDeskDSL.Entidad#getAsociada()
	 * @see #getEntidad()
	 * @generated
	 */
	EReference getEntidad_Asociada();

	/**
	 * Returns the meta object for the attribute '{@link DataWebDeskDSL.Entidad#getId_Entidad <em>Id Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Entidad</em>'.
	 * @see DataWebDeskDSL.Entidad#getId_Entidad()
	 * @see #getEntidad()
	 * @generated
	 */
	EAttribute getEntidad_Id_Entidad();

	/**
	 * Returns the meta object for the reference '{@link DataWebDeskDSL.Entidad#getClave_primaria <em>Clave primaria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clave primaria</em>'.
	 * @see DataWebDeskDSL.Entidad#getClave_primaria()
	 * @see #getEntidad()
	 * @generated
	 */
	EReference getEntidad_Clave_primaria();

	/**
	 * Returns the meta object for the attribute '{@link DataWebDeskDSL.Entidad#getNombreEntidad <em>Nombre Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Entidad</em>'.
	 * @see DataWebDeskDSL.Entidad#getNombreEntidad()
	 * @see #getEntidad()
	 * @generated
	 */
	EAttribute getEntidad_NombreEntidad();

	/**
	 * Returns the meta object for the reference list '{@link DataWebDeskDSL.Entidad#getRelacionada <em>Relacionada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relacionada</em>'.
	 * @see DataWebDeskDSL.Entidad#getRelacionada()
	 * @see #getEntidad()
	 * @generated
	 */
	EReference getEntidad_Relacionada();

	/**
	 * Returns the meta object for the reference list '{@link DataWebDeskDSL.Entidad#getEsta_relacionada <em>Esta relacionada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Esta relacionada</em>'.
	 * @see DataWebDeskDSL.Entidad#getEsta_relacionada()
	 * @see #getEntidad()
	 * @generated
	 */
	EReference getEntidad_Esta_relacionada();

	/**
	 * Returns the meta object for class '{@link DataWebDeskDSL.CaracteristicaEntidad <em>Caracteristica Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Caracteristica Entidad</em>'.
	 * @see DataWebDeskDSL.CaracteristicaEntidad
	 * @generated
	 */
	EClass getCaracteristicaEntidad();

	/**
	 * Returns the meta object for the attribute '{@link DataWebDeskDSL.CaracteristicaEntidad#getNombreCaract <em>Nombre Caract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Caract</em>'.
	 * @see DataWebDeskDSL.CaracteristicaEntidad#getNombreCaract()
	 * @see #getCaracteristicaEntidad()
	 * @generated
	 */
	EAttribute getCaracteristicaEntidad_NombreCaract();

	/**
	 * Returns the meta object for the attribute '{@link DataWebDeskDSL.CaracteristicaEntidad#getTipoDato <em>Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Dato</em>'.
	 * @see DataWebDeskDSL.CaracteristicaEntidad#getTipoDato()
	 * @see #getCaracteristicaEntidad()
	 * @generated
	 */
	EAttribute getCaracteristicaEntidad_TipoDato();

	/**
	 * Returns the meta object for the reference '{@link DataWebDeskDSL.CaracteristicaEntidad#getEsta_en <em>Esta en</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Esta en</em>'.
	 * @see DataWebDeskDSL.CaracteristicaEntidad#getEsta_en()
	 * @see #getCaracteristicaEntidad()
	 * @generated
	 */
	EReference getCaracteristicaEntidad_Esta_en();

	/**
	 * Returns the meta object for class '{@link DataWebDeskDSL.PagCrear <em>Pag Crear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pag Crear</em>'.
	 * @see DataWebDeskDSL.PagCrear
	 * @generated
	 */
	EClass getPagCrear();

	/**
	 * Returns the meta object for class '{@link DataWebDeskDSL.PagLeer <em>Pag Leer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pag Leer</em>'.
	 * @see DataWebDeskDSL.PagLeer
	 * @generated
	 */
	EClass getPagLeer();

	/**
	 * Returns the meta object for class '{@link DataWebDeskDSL.PagBorrar <em>Pag Borrar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pag Borrar</em>'.
	 * @see DataWebDeskDSL.PagBorrar
	 * @generated
	 */
	EClass getPagBorrar();

	/**
	 * Returns the meta object for class '{@link DataWebDeskDSL.PagActualizar <em>Pag Actualizar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pag Actualizar</em>'.
	 * @see DataWebDeskDSL.PagActualizar
	 * @generated
	 */
	EClass getPagActualizar();

	/**
	 * Returns the meta object for class '{@link DataWebDeskDSL.Rol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rol</em>'.
	 * @see DataWebDeskDSL.Rol
	 * @generated
	 */
	EClass getRol();

	/**
	 * Returns the meta object for the attribute '{@link DataWebDeskDSL.Rol#getNombreRol <em>Nombre Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Rol</em>'.
	 * @see DataWebDeskDSL.Rol#getNombreRol()
	 * @see #getRol()
	 * @generated
	 */
	EAttribute getRol_NombreRol();

	/**
	 * Returns the meta object for the attribute '{@link DataWebDeskDSL.Rol#getNumeroPaginasAccesiblesD1 <em>Numero Paginas Accesibles D1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Paginas Accesibles D1</em>'.
	 * @see DataWebDeskDSL.Rol#getNumeroPaginasAccesiblesD1()
	 * @see #getRol()
	 * @generated
	 */
	EAttribute getRol_NumeroPaginasAccesiblesD1();

	/**
	 * Returns the meta object for the attribute '{@link DataWebDeskDSL.Rol#getNumeroEntidadesAccesiblesD2 <em>Numero Entidades Accesibles D2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Entidades Accesibles D2</em>'.
	 * @see DataWebDeskDSL.Rol#getNumeroEntidadesAccesiblesD2()
	 * @see #getRol()
	 * @generated
	 */
	EAttribute getRol_NumeroEntidadesAccesiblesD2();

	/**
	 * Returns the meta object for the reference list '{@link DataWebDeskDSL.Rol#getTiene_acceso <em>Tiene acceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tiene acceso</em>'.
	 * @see DataWebDeskDSL.Rol#getTiene_acceso()
	 * @see #getRol()
	 * @generated
	 */
	EReference getRol_Tiene_acceso();

	/**
	 * Returns the meta object for class '{@link DataWebDeskDSL.RedSocial <em>Red Social</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Red Social</em>'.
	 * @see DataWebDeskDSL.RedSocial
	 * @generated
	 */
	EClass getRedSocial();

	/**
	 * Returns the meta object for the attribute '{@link DataWebDeskDSL.RedSocial#getTipoCont <em>Tipo Cont</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Cont</em>'.
	 * @see DataWebDeskDSL.RedSocial#getTipoCont()
	 * @see #getRedSocial()
	 * @generated
	 */
	EAttribute getRedSocial_TipoCont();

	/**
	 * Returns the meta object for the attribute '{@link DataWebDeskDSL.RedSocial#getId_RedSocial <em>Id Red Social</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Red Social</em>'.
	 * @see DataWebDeskDSL.RedSocial#getId_RedSocial()
	 * @see #getRedSocial()
	 * @generated
	 */
	EAttribute getRedSocial_Id_RedSocial();

	/**
	 * Returns the meta object for the reference list '{@link DataWebDeskDSL.RedSocial#getMostrada <em>Mostrada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mostrada</em>'.
	 * @see DataWebDeskDSL.RedSocial#getMostrada()
	 * @see #getRedSocial()
	 * @generated
	 */
	EReference getRedSocial_Mostrada();

	/**
	 * Returns the meta object for the attribute '{@link DataWebDeskDSL.RedSocial#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see DataWebDeskDSL.RedSocial#getNombre()
	 * @see #getRedSocial()
	 * @generated
	 */
	EAttribute getRedSocial_Nombre();

	/**
	 * Returns the meta object for class '{@link DataWebDeskDSL.Twitter <em>Twitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Twitter</em>'.
	 * @see DataWebDeskDSL.Twitter
	 * @generated
	 */
	EClass getTwitter();

	/**
	 * Returns the meta object for class '{@link DataWebDeskDSL.Facebook <em>Facebook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facebook</em>'.
	 * @see DataWebDeskDSL.Facebook
	 * @generated
	 */
	EClass getFacebook();

	/**
	 * Returns the meta object for class '{@link DataWebDeskDSL.PagIndice <em>Pag Indice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pag Indice</em>'.
	 * @see DataWebDeskDSL.PagIndice
	 * @generated
	 */
	EClass getPagIndice();

	/**
	 * Returns the meta object for class '{@link DataWebDeskDSL.CRUD <em>CRUD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CRUD</em>'.
	 * @see DataWebDeskDSL.CRUD
	 * @generated
	 */
	EClass getCRUD();

	/**
	 * Returns the meta object for class '{@link DataWebDeskDSL.URLExterna <em>URL Externa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URL Externa</em>'.
	 * @see DataWebDeskDSL.URLExterna
	 * @generated
	 */
	EClass getURLExterna();

	/**
	 * Returns the meta object for the reference list '{@link DataWebDeskDSL.URLExterna#getPagina <em>Pagina</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pagina</em>'.
	 * @see DataWebDeskDSL.URLExterna#getPagina()
	 * @see #getURLExterna()
	 * @generated
	 */
	EReference getURLExterna_Pagina();

	/**
	 * Returns the meta object for the attribute '{@link DataWebDeskDSL.URLExterna#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link</em>'.
	 * @see DataWebDeskDSL.URLExterna#getLink()
	 * @see #getURLExterna()
	 * @generated
	 */
	EAttribute getURLExterna_Link();

	/**
	 * Returns the meta object for the attribute '{@link DataWebDeskDSL.URLExterna#getNombreWeb <em>Nombre Web</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Web</em>'.
	 * @see DataWebDeskDSL.URLExterna#getNombreWeb()
	 * @see #getURLExterna()
	 * @generated
	 */
	EAttribute getURLExterna_NombreWeb();

	/**
	 * Returns the meta object for class '{@link DataWebDeskDSL.PaginaPrincipal <em>Pagina Principal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pagina Principal</em>'.
	 * @see DataWebDeskDSL.PaginaPrincipal
	 * @generated
	 */
	EClass getPaginaPrincipal();

	/**
	 * Returns the meta object for class '{@link DataWebDeskDSL.RSS <em>RSS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RSS</em>'.
	 * @see DataWebDeskDSL.RSS
	 * @generated
	 */
	EClass getRSS();

	/**
	 * Returns the meta object for enum '{@link DataWebDeskDSL.TipoDato <em>Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Dato</em>'.
	 * @see DataWebDeskDSL.TipoDato
	 * @generated
	 */
	EEnum getTipoDato();

	/**
	 * Returns the meta object for enum '{@link DataWebDeskDSL.tipoContenido <em>tipo Contenido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>tipo Contenido</em>'.
	 * @see DataWebDeskDSL.tipoContenido
	 * @generated
	 */
	EEnum gettipoContenido();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataWebDeskDSLFactory getDataWebDeskDSLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link DataWebDeskDSL.impl.DataWebDeskImpl <em>Data Web Desk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataWebDeskDSL.impl.DataWebDeskImpl
		 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getDataWebDesk()
		 * @generated
		 */
		EClass DATA_WEB_DESK = eINSTANCE.getDataWebDesk();

		/**
		 * The meta object literal for the '<em><b>Pagina</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_WEB_DESK__PAGINA = eINSTANCE.getDataWebDesk_Pagina();

		/**
		 * The meta object literal for the '<em><b>Rol</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_WEB_DESK__ROL = eINSTANCE.getDataWebDesk_Rol();

		/**
		 * The meta object literal for the '<em><b>Entidad</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_WEB_DESK__ENTIDAD = eINSTANCE.getDataWebDesk_Entidad();

		/**
		 * The meta object literal for the '<em><b>Nombre Aplicacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_WEB_DESK__NOMBRE_APLICACION = eINSTANCE.getDataWebDesk_NombreAplicacion();

		/**
		 * The meta object literal for the '<em><b>Paginas Medias Accesibles D3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_WEB_DESK__PAGINAS_MEDIAS_ACCESIBLES_D3 = eINSTANCE.getDataWebDesk_PaginasMediasAccesiblesD3();

		/**
		 * The meta object literal for the '<em><b>Redsocial</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_WEB_DESK__REDSOCIAL = eINSTANCE.getDataWebDesk_Redsocial();

		/**
		 * The meta object literal for the '<em><b>Urlexterna</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_WEB_DESK__URLEXTERNA = eINSTANCE.getDataWebDesk_Urlexterna();

		/**
		 * The meta object literal for the '{@link DataWebDeskDSL.impl.PaginaImpl <em>Pagina</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataWebDeskDSL.impl.PaginaImpl
		 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getPagina()
		 * @generated
		 */
		EClass PAGINA = eINSTANCE.getPagina();

		/**
		 * The meta object literal for the '<em><b>Accedida</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGINA__ACCEDIDA = eINSTANCE.getPagina_Accedida();

		/**
		 * The meta object literal for the '<em><b>Accede</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGINA__ACCEDE = eINSTANCE.getPagina_Accede();

		/**
		 * The meta object literal for the '<em><b>Titulo Pag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGINA__TITULO_PAG = eINSTANCE.getPagina_TituloPag();

		/**
		 * The meta object literal for the '<em><b>Urlexterna</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGINA__URLEXTERNA = eINSTANCE.getPagina_Urlexterna();

		/**
		 * The meta object literal for the '<em><b>Muestra</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGINA__MUESTRA = eINSTANCE.getPagina_Muestra();

		/**
		 * The meta object literal for the '<em><b>Accedida por</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGINA__ACCEDIDA_POR = eINSTANCE.getPagina_Accedida_por();

		/**
		 * The meta object literal for the '{@link DataWebDeskDSL.impl.PaginasNormalesImpl <em>Paginas Normales</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataWebDeskDSL.impl.PaginasNormalesImpl
		 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getPaginasNormales()
		 * @generated
		 */
		EClass PAGINAS_NORMALES = eINSTANCE.getPaginasNormales();

		/**
		 * The meta object literal for the '<em><b>Texto</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGINAS_NORMALES__TEXTO = eINSTANCE.getPaginasNormales_Texto();

		/**
		 * The meta object literal for the '<em><b>Multimedia</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGINAS_NORMALES__MULTIMEDIA = eINSTANCE.getPaginasNormales_Multimedia();

		/**
		 * The meta object literal for the '{@link DataWebDeskDSL.impl.PagCRUDImpl <em>Pag CRUD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataWebDeskDSL.impl.PagCRUDImpl
		 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getPagCRUD()
		 * @generated
		 */
		EClass PAG_CRUD = eINSTANCE.getPagCRUD();

		/**
		 * The meta object literal for the '<em><b>Tiene asociada</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAG_CRUD__TIENE_ASOCIADA = eINSTANCE.getPagCRUD_Tiene_asociada();

		/**
		 * The meta object literal for the '{@link DataWebDeskDSL.impl.EntidadImpl <em>Entidad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataWebDeskDSL.impl.EntidadImpl
		 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getEntidad()
		 * @generated
		 */
		EClass ENTIDAD = eINSTANCE.getEntidad();

		/**
		 * The meta object literal for the '<em><b>Caracteristica</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTIDAD__CARACTERISTICA = eINSTANCE.getEntidad_Caracteristica();

		/**
		 * The meta object literal for the '<em><b>Asociada</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTIDAD__ASOCIADA = eINSTANCE.getEntidad_Asociada();

		/**
		 * The meta object literal for the '<em><b>Id Entidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTIDAD__ID_ENTIDAD = eINSTANCE.getEntidad_Id_Entidad();

		/**
		 * The meta object literal for the '<em><b>Clave primaria</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTIDAD__CLAVE_PRIMARIA = eINSTANCE.getEntidad_Clave_primaria();

		/**
		 * The meta object literal for the '<em><b>Nombre Entidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTIDAD__NOMBRE_ENTIDAD = eINSTANCE.getEntidad_NombreEntidad();

		/**
		 * The meta object literal for the '<em><b>Relacionada</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTIDAD__RELACIONADA = eINSTANCE.getEntidad_Relacionada();

		/**
		 * The meta object literal for the '<em><b>Esta relacionada</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTIDAD__ESTA_RELACIONADA = eINSTANCE.getEntidad_Esta_relacionada();

		/**
		 * The meta object literal for the '{@link DataWebDeskDSL.impl.CaracteristicaEntidadImpl <em>Caracteristica Entidad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataWebDeskDSL.impl.CaracteristicaEntidadImpl
		 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getCaracteristicaEntidad()
		 * @generated
		 */
		EClass CARACTERISTICA_ENTIDAD = eINSTANCE.getCaracteristicaEntidad();

		/**
		 * The meta object literal for the '<em><b>Nombre Caract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARACTERISTICA_ENTIDAD__NOMBRE_CARACT = eINSTANCE.getCaracteristicaEntidad_NombreCaract();

		/**
		 * The meta object literal for the '<em><b>Tipo Dato</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARACTERISTICA_ENTIDAD__TIPO_DATO = eINSTANCE.getCaracteristicaEntidad_TipoDato();

		/**
		 * The meta object literal for the '<em><b>Esta en</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARACTERISTICA_ENTIDAD__ESTA_EN = eINSTANCE.getCaracteristicaEntidad_Esta_en();

		/**
		 * The meta object literal for the '{@link DataWebDeskDSL.impl.PagCrearImpl <em>Pag Crear</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataWebDeskDSL.impl.PagCrearImpl
		 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getPagCrear()
		 * @generated
		 */
		EClass PAG_CREAR = eINSTANCE.getPagCrear();

		/**
		 * The meta object literal for the '{@link DataWebDeskDSL.impl.PagLeerImpl <em>Pag Leer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataWebDeskDSL.impl.PagLeerImpl
		 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getPagLeer()
		 * @generated
		 */
		EClass PAG_LEER = eINSTANCE.getPagLeer();

		/**
		 * The meta object literal for the '{@link DataWebDeskDSL.impl.PagBorrarImpl <em>Pag Borrar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataWebDeskDSL.impl.PagBorrarImpl
		 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getPagBorrar()
		 * @generated
		 */
		EClass PAG_BORRAR = eINSTANCE.getPagBorrar();

		/**
		 * The meta object literal for the '{@link DataWebDeskDSL.impl.PagActualizarImpl <em>Pag Actualizar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataWebDeskDSL.impl.PagActualizarImpl
		 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getPagActualizar()
		 * @generated
		 */
		EClass PAG_ACTUALIZAR = eINSTANCE.getPagActualizar();

		/**
		 * The meta object literal for the '{@link DataWebDeskDSL.impl.RolImpl <em>Rol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataWebDeskDSL.impl.RolImpl
		 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getRol()
		 * @generated
		 */
		EClass ROL = eINSTANCE.getRol();

		/**
		 * The meta object literal for the '<em><b>Nombre Rol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROL__NOMBRE_ROL = eINSTANCE.getRol_NombreRol();

		/**
		 * The meta object literal for the '<em><b>Numero Paginas Accesibles D1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROL__NUMERO_PAGINAS_ACCESIBLES_D1 = eINSTANCE.getRol_NumeroPaginasAccesiblesD1();

		/**
		 * The meta object literal for the '<em><b>Numero Entidades Accesibles D2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROL__NUMERO_ENTIDADES_ACCESIBLES_D2 = eINSTANCE.getRol_NumeroEntidadesAccesiblesD2();

		/**
		 * The meta object literal for the '<em><b>Tiene acceso</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROL__TIENE_ACCESO = eINSTANCE.getRol_Tiene_acceso();

		/**
		 * The meta object literal for the '{@link DataWebDeskDSL.impl.RedSocialImpl <em>Red Social</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataWebDeskDSL.impl.RedSocialImpl
		 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getRedSocial()
		 * @generated
		 */
		EClass RED_SOCIAL = eINSTANCE.getRedSocial();

		/**
		 * The meta object literal for the '<em><b>Tipo Cont</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RED_SOCIAL__TIPO_CONT = eINSTANCE.getRedSocial_TipoCont();

		/**
		 * The meta object literal for the '<em><b>Id Red Social</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RED_SOCIAL__ID_RED_SOCIAL = eINSTANCE.getRedSocial_Id_RedSocial();

		/**
		 * The meta object literal for the '<em><b>Mostrada</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RED_SOCIAL__MOSTRADA = eINSTANCE.getRedSocial_Mostrada();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RED_SOCIAL__NOMBRE = eINSTANCE.getRedSocial_Nombre();

		/**
		 * The meta object literal for the '{@link DataWebDeskDSL.impl.TwitterImpl <em>Twitter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataWebDeskDSL.impl.TwitterImpl
		 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getTwitter()
		 * @generated
		 */
		EClass TWITTER = eINSTANCE.getTwitter();

		/**
		 * The meta object literal for the '{@link DataWebDeskDSL.impl.FacebookImpl <em>Facebook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataWebDeskDSL.impl.FacebookImpl
		 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getFacebook()
		 * @generated
		 */
		EClass FACEBOOK = eINSTANCE.getFacebook();

		/**
		 * The meta object literal for the '{@link DataWebDeskDSL.impl.PagIndiceImpl <em>Pag Indice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataWebDeskDSL.impl.PagIndiceImpl
		 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getPagIndice()
		 * @generated
		 */
		EClass PAG_INDICE = eINSTANCE.getPagIndice();

		/**
		 * The meta object literal for the '{@link DataWebDeskDSL.impl.CRUDImpl <em>CRUD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataWebDeskDSL.impl.CRUDImpl
		 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getCRUD()
		 * @generated
		 */
		EClass CRUD = eINSTANCE.getCRUD();

		/**
		 * The meta object literal for the '{@link DataWebDeskDSL.impl.URLExternaImpl <em>URL Externa</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataWebDeskDSL.impl.URLExternaImpl
		 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getURLExterna()
		 * @generated
		 */
		EClass URL_EXTERNA = eINSTANCE.getURLExterna();

		/**
		 * The meta object literal for the '<em><b>Pagina</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference URL_EXTERNA__PAGINA = eINSTANCE.getURLExterna_Pagina();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_EXTERNA__LINK = eINSTANCE.getURLExterna_Link();

		/**
		 * The meta object literal for the '<em><b>Nombre Web</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_EXTERNA__NOMBRE_WEB = eINSTANCE.getURLExterna_NombreWeb();

		/**
		 * The meta object literal for the '{@link DataWebDeskDSL.impl.PaginaPrincipalImpl <em>Pagina Principal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataWebDeskDSL.impl.PaginaPrincipalImpl
		 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getPaginaPrincipal()
		 * @generated
		 */
		EClass PAGINA_PRINCIPAL = eINSTANCE.getPaginaPrincipal();

		/**
		 * The meta object literal for the '{@link DataWebDeskDSL.impl.RSSImpl <em>RSS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataWebDeskDSL.impl.RSSImpl
		 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getRSS()
		 * @generated
		 */
		EClass RSS = eINSTANCE.getRSS();

		/**
		 * The meta object literal for the '{@link DataWebDeskDSL.TipoDato <em>Tipo Dato</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataWebDeskDSL.TipoDato
		 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#getTipoDato()
		 * @generated
		 */
		EEnum TIPO_DATO = eINSTANCE.getTipoDato();

		/**
		 * The meta object literal for the '{@link DataWebDeskDSL.tipoContenido <em>tipo Contenido</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DataWebDeskDSL.tipoContenido
		 * @see DataWebDeskDSL.impl.DataWebDeskDSLPackageImpl#gettipoContenido()
		 * @generated
		 */
		EEnum TIPO_CONTENIDO = eINSTANCE.gettipoContenido();

	}

} //DataWebDeskDSLPackage
