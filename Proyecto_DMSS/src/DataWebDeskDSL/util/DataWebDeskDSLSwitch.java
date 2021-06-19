/**
 */
package DataWebDeskDSL.util;

import DataWebDeskDSL.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see DataWebDeskDSL.DataWebDeskDSLPackage
 * @generated
 */
public class DataWebDeskDSLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataWebDeskDSLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataWebDeskDSLSwitch() {
		if (modelPackage == null) {
			modelPackage = DataWebDeskDSLPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DataWebDeskDSLPackage.DATA_WEB_DESK: {
				DataWebDesk dataWebDesk = (DataWebDesk)theEObject;
				T result = caseDataWebDesk(dataWebDesk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataWebDeskDSLPackage.PAGINA: {
				Pagina pagina = (Pagina)theEObject;
				T result = casePagina(pagina);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataWebDeskDSLPackage.PAGINAS_NORMALES: {
				PaginasNormales paginasNormales = (PaginasNormales)theEObject;
				T result = casePaginasNormales(paginasNormales);
				if (result == null) result = casePagina(paginasNormales);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataWebDeskDSLPackage.PAG_CRUD: {
				PagCRUD pagCRUD = (PagCRUD)theEObject;
				T result = casePagCRUD(pagCRUD);
				if (result == null) result = casePagina(pagCRUD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataWebDeskDSLPackage.ENTIDAD: {
				Entidad entidad = (Entidad)theEObject;
				T result = caseEntidad(entidad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataWebDeskDSLPackage.CARACTERISTICA_ENTIDAD: {
				CaracteristicaEntidad caracteristicaEntidad = (CaracteristicaEntidad)theEObject;
				T result = caseCaracteristicaEntidad(caracteristicaEntidad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataWebDeskDSLPackage.PAG_CREAR: {
				PagCrear pagCrear = (PagCrear)theEObject;
				T result = casePagCrear(pagCrear);
				if (result == null) result = casePagCRUD(pagCrear);
				if (result == null) result = casePagina(pagCrear);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataWebDeskDSLPackage.PAG_LEER: {
				PagLeer pagLeer = (PagLeer)theEObject;
				T result = casePagLeer(pagLeer);
				if (result == null) result = casePagCRUD(pagLeer);
				if (result == null) result = casePagina(pagLeer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataWebDeskDSLPackage.PAG_BORRAR: {
				PagBorrar pagBorrar = (PagBorrar)theEObject;
				T result = casePagBorrar(pagBorrar);
				if (result == null) result = casePagCRUD(pagBorrar);
				if (result == null) result = casePagina(pagBorrar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataWebDeskDSLPackage.PAG_ACTUALIZAR: {
				PagActualizar pagActualizar = (PagActualizar)theEObject;
				T result = casePagActualizar(pagActualizar);
				if (result == null) result = casePagCRUD(pagActualizar);
				if (result == null) result = casePagina(pagActualizar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataWebDeskDSLPackage.ROL: {
				Rol rol = (Rol)theEObject;
				T result = caseRol(rol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataWebDeskDSLPackage.RED_SOCIAL: {
				RedSocial redSocial = (RedSocial)theEObject;
				T result = caseRedSocial(redSocial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataWebDeskDSLPackage.TWITTER: {
				Twitter twitter = (Twitter)theEObject;
				T result = caseTwitter(twitter);
				if (result == null) result = caseRedSocial(twitter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataWebDeskDSLPackage.FACEBOOK: {
				Facebook facebook = (Facebook)theEObject;
				T result = caseFacebook(facebook);
				if (result == null) result = caseRedSocial(facebook);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataWebDeskDSLPackage.PAG_INDICE: {
				PagIndice pagIndice = (PagIndice)theEObject;
				T result = casePagIndice(pagIndice);
				if (result == null) result = casePagCRUD(pagIndice);
				if (result == null) result = casePagina(pagIndice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataWebDeskDSLPackage.CRUD: {
				CRUD crud = (CRUD)theEObject;
				T result = caseCRUD(crud);
				if (result == null) result = casePagCRUD(crud);
				if (result == null) result = casePagina(crud);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataWebDeskDSLPackage.URL_EXTERNA: {
				URLExterna urlExterna = (URLExterna)theEObject;
				T result = caseURLExterna(urlExterna);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataWebDeskDSLPackage.PAGINA_PRINCIPAL: {
				PaginaPrincipal paginaPrincipal = (PaginaPrincipal)theEObject;
				T result = casePaginaPrincipal(paginaPrincipal);
				if (result == null) result = casePagina(paginaPrincipal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataWebDeskDSLPackage.RSS: {
				RSS rss = (RSS)theEObject;
				T result = caseRSS(rss);
				if (result == null) result = caseRedSocial(rss);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Web Desk</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Web Desk</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataWebDesk(DataWebDesk object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pagina</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pagina</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePagina(Pagina object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Paginas Normales</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paginas Normales</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaginasNormales(PaginasNormales object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pag CRUD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pag CRUD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePagCRUD(PagCRUD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entidad</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entidad</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntidad(Entidad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Caracteristica Entidad</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Caracteristica Entidad</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaracteristicaEntidad(CaracteristicaEntidad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pag Crear</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pag Crear</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePagCrear(PagCrear object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pag Leer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pag Leer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePagLeer(PagLeer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pag Borrar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pag Borrar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePagBorrar(PagBorrar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pag Actualizar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pag Actualizar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePagActualizar(PagActualizar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRol(Rol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Red Social</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Red Social</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedSocial(RedSocial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Twitter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Twitter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTwitter(Twitter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facebook</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facebook</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacebook(Facebook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pag Indice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pag Indice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePagIndice(PagIndice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CRUD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CRUD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCRUD(CRUD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>URL Externa</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>URL Externa</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseURLExterna(URLExterna object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pagina Principal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pagina Principal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaginaPrincipal(PaginaPrincipal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RSS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RSS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRSS(RSS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DataWebDeskDSLSwitch
