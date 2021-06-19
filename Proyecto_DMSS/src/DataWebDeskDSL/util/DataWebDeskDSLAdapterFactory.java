/**
 */
package DataWebDeskDSL.util;

import DataWebDeskDSL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see DataWebDeskDSL.DataWebDeskDSLPackage
 * @generated
 */
public class DataWebDeskDSLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataWebDeskDSLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataWebDeskDSLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DataWebDeskDSLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataWebDeskDSLSwitch<Adapter> modelSwitch =
		new DataWebDeskDSLSwitch<Adapter>() {
			@Override
			public Adapter caseDataWebDesk(DataWebDesk object) {
				return createDataWebDeskAdapter();
			}
			@Override
			public Adapter casePagina(Pagina object) {
				return createPaginaAdapter();
			}
			@Override
			public Adapter casePaginasNormales(PaginasNormales object) {
				return createPaginasNormalesAdapter();
			}
			@Override
			public Adapter casePagCRUD(PagCRUD object) {
				return createPagCRUDAdapter();
			}
			@Override
			public Adapter caseEntidad(Entidad object) {
				return createEntidadAdapter();
			}
			@Override
			public Adapter caseCaracteristicaEntidad(CaracteristicaEntidad object) {
				return createCaracteristicaEntidadAdapter();
			}
			@Override
			public Adapter casePagCrear(PagCrear object) {
				return createPagCrearAdapter();
			}
			@Override
			public Adapter casePagLeer(PagLeer object) {
				return createPagLeerAdapter();
			}
			@Override
			public Adapter casePagBorrar(PagBorrar object) {
				return createPagBorrarAdapter();
			}
			@Override
			public Adapter casePagActualizar(PagActualizar object) {
				return createPagActualizarAdapter();
			}
			@Override
			public Adapter caseRol(Rol object) {
				return createRolAdapter();
			}
			@Override
			public Adapter caseRedSocial(RedSocial object) {
				return createRedSocialAdapter();
			}
			@Override
			public Adapter caseTwitter(Twitter object) {
				return createTwitterAdapter();
			}
			@Override
			public Adapter caseFacebook(Facebook object) {
				return createFacebookAdapter();
			}
			@Override
			public Adapter casePagIndice(PagIndice object) {
				return createPagIndiceAdapter();
			}
			@Override
			public Adapter caseCRUD(CRUD object) {
				return createCRUDAdapter();
			}
			@Override
			public Adapter caseURLExterna(URLExterna object) {
				return createURLExternaAdapter();
			}
			@Override
			public Adapter casePaginaPrincipal(PaginaPrincipal object) {
				return createPaginaPrincipalAdapter();
			}
			@Override
			public Adapter caseRSS(RSS object) {
				return createRSSAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link DataWebDeskDSL.DataWebDesk <em>Data Web Desk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataWebDeskDSL.DataWebDesk
	 * @generated
	 */
	public Adapter createDataWebDeskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataWebDeskDSL.Pagina <em>Pagina</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataWebDeskDSL.Pagina
	 * @generated
	 */
	public Adapter createPaginaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataWebDeskDSL.PaginasNormales <em>Paginas Normales</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataWebDeskDSL.PaginasNormales
	 * @generated
	 */
	public Adapter createPaginasNormalesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataWebDeskDSL.PagCRUD <em>Pag CRUD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataWebDeskDSL.PagCRUD
	 * @generated
	 */
	public Adapter createPagCRUDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataWebDeskDSL.Entidad <em>Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataWebDeskDSL.Entidad
	 * @generated
	 */
	public Adapter createEntidadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataWebDeskDSL.CaracteristicaEntidad <em>Caracteristica Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataWebDeskDSL.CaracteristicaEntidad
	 * @generated
	 */
	public Adapter createCaracteristicaEntidadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataWebDeskDSL.PagCrear <em>Pag Crear</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataWebDeskDSL.PagCrear
	 * @generated
	 */
	public Adapter createPagCrearAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataWebDeskDSL.PagLeer <em>Pag Leer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataWebDeskDSL.PagLeer
	 * @generated
	 */
	public Adapter createPagLeerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataWebDeskDSL.PagBorrar <em>Pag Borrar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataWebDeskDSL.PagBorrar
	 * @generated
	 */
	public Adapter createPagBorrarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataWebDeskDSL.PagActualizar <em>Pag Actualizar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataWebDeskDSL.PagActualizar
	 * @generated
	 */
	public Adapter createPagActualizarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataWebDeskDSL.Rol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataWebDeskDSL.Rol
	 * @generated
	 */
	public Adapter createRolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataWebDeskDSL.RedSocial <em>Red Social</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataWebDeskDSL.RedSocial
	 * @generated
	 */
	public Adapter createRedSocialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataWebDeskDSL.Twitter <em>Twitter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataWebDeskDSL.Twitter
	 * @generated
	 */
	public Adapter createTwitterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataWebDeskDSL.Facebook <em>Facebook</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataWebDeskDSL.Facebook
	 * @generated
	 */
	public Adapter createFacebookAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataWebDeskDSL.PagIndice <em>Pag Indice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataWebDeskDSL.PagIndice
	 * @generated
	 */
	public Adapter createPagIndiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataWebDeskDSL.CRUD <em>CRUD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataWebDeskDSL.CRUD
	 * @generated
	 */
	public Adapter createCRUDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataWebDeskDSL.URLExterna <em>URL Externa</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataWebDeskDSL.URLExterna
	 * @generated
	 */
	public Adapter createURLExternaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataWebDeskDSL.PaginaPrincipal <em>Pagina Principal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataWebDeskDSL.PaginaPrincipal
	 * @generated
	 */
	public Adapter createPaginaPrincipalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataWebDeskDSL.RSS <em>RSS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataWebDeskDSL.RSS
	 * @generated
	 */
	public Adapter createRSSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DataWebDeskDSLAdapterFactory
