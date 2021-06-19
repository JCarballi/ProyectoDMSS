/**
 */
package DataWebDeskDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see DataWebDeskDSL.DataWebDeskDSLPackage
 * @generated
 */
public interface DataWebDeskDSLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataWebDeskDSLFactory eINSTANCE = DataWebDeskDSL.impl.DataWebDeskDSLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Data Web Desk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Web Desk</em>'.
	 * @generated
	 */
	DataWebDesk createDataWebDesk();

	/**
	 * Returns a new object of class '<em>Paginas Normales</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Paginas Normales</em>'.
	 * @generated
	 */
	PaginasNormales createPaginasNormales();

	/**
	 * Returns a new object of class '<em>Entidad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entidad</em>'.
	 * @generated
	 */
	Entidad createEntidad();

	/**
	 * Returns a new object of class '<em>Caracteristica Entidad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Caracteristica Entidad</em>'.
	 * @generated
	 */
	CaracteristicaEntidad createCaracteristicaEntidad();

	/**
	 * Returns a new object of class '<em>Pag Crear</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pag Crear</em>'.
	 * @generated
	 */
	PagCrear createPagCrear();

	/**
	 * Returns a new object of class '<em>Pag Leer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pag Leer</em>'.
	 * @generated
	 */
	PagLeer createPagLeer();

	/**
	 * Returns a new object of class '<em>Pag Borrar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pag Borrar</em>'.
	 * @generated
	 */
	PagBorrar createPagBorrar();

	/**
	 * Returns a new object of class '<em>Pag Actualizar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pag Actualizar</em>'.
	 * @generated
	 */
	PagActualizar createPagActualizar();

	/**
	 * Returns a new object of class '<em>Rol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rol</em>'.
	 * @generated
	 */
	Rol createRol();

	/**
	 * Returns a new object of class '<em>Twitter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Twitter</em>'.
	 * @generated
	 */
	Twitter createTwitter();

	/**
	 * Returns a new object of class '<em>Facebook</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facebook</em>'.
	 * @generated
	 */
	Facebook createFacebook();

	/**
	 * Returns a new object of class '<em>Pag Indice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pag Indice</em>'.
	 * @generated
	 */
	PagIndice createPagIndice();

	/**
	 * Returns a new object of class '<em>CRUD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CRUD</em>'.
	 * @generated
	 */
	CRUD createCRUD();

	/**
	 * Returns a new object of class '<em>URL Externa</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>URL Externa</em>'.
	 * @generated
	 */
	URLExterna createURLExterna();

	/**
	 * Returns a new object of class '<em>Pagina Principal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pagina Principal</em>'.
	 * @generated
	 */
	PaginaPrincipal createPaginaPrincipal();

	/**
	 * Returns a new object of class '<em>RSS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RSS</em>'.
	 * @generated
	 */
	RSS createRSS();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataWebDeskDSLPackage getDataWebDeskDSLPackage();

} //DataWebDeskDSLFactory
