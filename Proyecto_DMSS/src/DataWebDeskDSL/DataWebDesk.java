/**
 */
package DataWebDeskDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Web Desk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DataWebDeskDSL.DataWebDesk#getPagina <em>Pagina</em>}</li>
 *   <li>{@link DataWebDeskDSL.DataWebDesk#getRol <em>Rol</em>}</li>
 *   <li>{@link DataWebDeskDSL.DataWebDesk#getEntidad <em>Entidad</em>}</li>
 *   <li>{@link DataWebDeskDSL.DataWebDesk#getNombreAplicacion <em>Nombre Aplicacion</em>}</li>
 *   <li>{@link DataWebDeskDSL.DataWebDesk#getPaginasMediasAccesiblesD3 <em>Paginas Medias Accesibles D3</em>}</li>
 *   <li>{@link DataWebDeskDSL.DataWebDesk#getRedsocial <em>Redsocial</em>}</li>
 *   <li>{@link DataWebDeskDSL.DataWebDesk#getUrlexterna <em>Urlexterna</em>}</li>
 * </ul>
 *
 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getDataWebDesk()
 * @model annotation="gmf.diagram foo='bar' diagram.extension='DMSS'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='idRedSocialNombre idRedSocialID idPagina idRol idURLExterna idEntidadID idEntidadNombre unaPrincipalR1 algunaRSR5'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot idRedSocialNombre='self.redsocial->isUnique(nombre)' idRedSocialID='self.redsocial->isUnique(ID_RedSocial)' idPagina='self.pagina->isUnique(TituloPag)' idRol='self.rol->isUnique(NombreRol)' idURLExterna='self.urlexterna->isUnique(Link)' idEntidadID='self.entidad->isUnique(ID_Entidad)' idEntidadNombre='self.entidad->isUnique(nombreEntidad)' unaPrincipalR1='self.pagina->selectByType(PaginaPrincipal)->size()=1' algunaRSR5='self.pagina.muestra->size() > 0'"
 * @generated
 */
public interface DataWebDesk extends EObject {
	/**
	 * Returns the value of the '<em><b>Pagina</b></em>' containment reference list.
	 * The list contents are of type {@link DataWebDeskDSL.Pagina}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pagina</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pagina</em>' containment reference list.
	 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getDataWebDesk_Pagina()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pagina> getPagina();

	/**
	 * Returns the value of the '<em><b>Rol</b></em>' containment reference list.
	 * The list contents are of type {@link DataWebDeskDSL.Rol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rol</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rol</em>' containment reference list.
	 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getDataWebDesk_Rol()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rol> getRol();

	/**
	 * Returns the value of the '<em><b>Entidad</b></em>' containment reference list.
	 * The list contents are of type {@link DataWebDeskDSL.Entidad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entidad</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entidad</em>' containment reference list.
	 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getDataWebDesk_Entidad()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entidad> getEntidad();

	/**
	 * Returns the value of the '<em><b>Nombre Aplicacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Aplicacion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Aplicacion</em>' attribute.
	 * @see #setNombreAplicacion(String)
	 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getDataWebDesk_NombreAplicacion()
	 * @model required="true"
	 * @generated
	 */
	String getNombreAplicacion();

	/**
	 * Sets the value of the '{@link DataWebDeskDSL.DataWebDesk#getNombreAplicacion <em>Nombre Aplicacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Aplicacion</em>' attribute.
	 * @see #getNombreAplicacion()
	 * @generated
	 */
	void setNombreAplicacion(String value);

	/**
	 * Returns the value of the '<em><b>Paginas Medias Accesibles D3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * D03
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Paginas Medias Accesibles D3</em>' attribute.
	 * @see #setPaginasMediasAccesiblesD3(float)
	 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getDataWebDesk_PaginasMediasAccesiblesD3()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='if(self.rol->size()=0) then 0\n\t\t\telse self.rol.numeroPaginasAccesiblesD1->sum() / self.rol->size()\n\t\t\tendif'"
	 * @generated
	 */
	float getPaginasMediasAccesiblesD3();

	/**
	 * Sets the value of the '{@link DataWebDeskDSL.DataWebDesk#getPaginasMediasAccesiblesD3 <em>Paginas Medias Accesibles D3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paginas Medias Accesibles D3</em>' attribute.
	 * @see #getPaginasMediasAccesiblesD3()
	 * @generated
	 */
	void setPaginasMediasAccesiblesD3(float value);

	/**
	 * Returns the value of the '<em><b>Redsocial</b></em>' containment reference list.
	 * The list contents are of type {@link DataWebDeskDSL.RedSocial}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redsocial</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redsocial</em>' containment reference list.
	 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getDataWebDesk_Redsocial()
	 * @model containment="true"
	 * @generated
	 */
	EList<RedSocial> getRedsocial();

	/**
	 * Returns the value of the '<em><b>Urlexterna</b></em>' containment reference list.
	 * The list contents are of type {@link DataWebDeskDSL.URLExterna}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Urlexterna</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Urlexterna</em>' containment reference list.
	 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getDataWebDesk_Urlexterna()
	 * @model containment="true"
	 * @generated
	 */
	EList<URLExterna> getUrlexterna();

} // DataWebDesk
