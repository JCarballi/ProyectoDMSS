/**
 */
package DataWebDeskDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DataWebDeskDSL.Rol#getNombreRol <em>Nombre Rol</em>}</li>
 *   <li>{@link DataWebDeskDSL.Rol#getNumeroPaginasAccesiblesD1 <em>Numero Paginas Accesibles D1</em>}</li>
 *   <li>{@link DataWebDeskDSL.Rol#getNumeroEntidadesAccesiblesD2 <em>Numero Entidades Accesibles D2</em>}</li>
 *   <li>{@link DataWebDeskDSL.Rol#getTiene_acceso <em>Tiene acceso</em>}</li>
 * </ul>
 *
 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getRol()
 * @model annotation="gmf.node label='NombreRol' figure='svg' svg.uri='platform:/plugin/ProyectoDMSS/iconos/rol.svg' label.icon='false' label.placement='external'"
 * @generated
 */
public interface Rol extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Rol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Rol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Rol</em>' attribute.
	 * @see #setNombreRol(String)
	 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getRol_NombreRol()
	 * @model required="true"
	 * @generated
	 */
	String getNombreRol();

	/**
	 * Sets the value of the '{@link DataWebDeskDSL.Rol#getNombreRol <em>Nombre Rol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Rol</em>' attribute.
	 * @see #getNombreRol()
	 * @generated
	 */
	void setNombreRol(String value);

	/**
	 * Returns the value of the '<em><b>Numero Paginas Accesibles D1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * D01
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Numero Paginas Accesibles D1</em>' attribute.
	 * @see #setNumeroPaginasAccesiblesD1(int)
	 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getRol_NumeroPaginasAccesiblesD1()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.tiene_acceso->closure(accede)->size()'"
	 * @generated
	 */
	int getNumeroPaginasAccesiblesD1();

	/**
	 * Sets the value of the '{@link DataWebDeskDSL.Rol#getNumeroPaginasAccesiblesD1 <em>Numero Paginas Accesibles D1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Paginas Accesibles D1</em>' attribute.
	 * @see #getNumeroPaginasAccesiblesD1()
	 * @generated
	 */
	void setNumeroPaginasAccesiblesD1(int value);

	/**
	 * Returns the value of the '<em><b>Numero Entidades Accesibles D2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * D02
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Numero Entidades Accesibles D2</em>' attribute.
	 * @see #setNumeroEntidadesAccesiblesD2(int)
	 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getRol_NumeroEntidadesAccesiblesD2()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='if(self.tiene_acceso->size() = 0) then 0\n\t\t\t\t\telse self.tiene_acceso->selectByType(PagCRUD).tiene_asociada->asSet()->size()\n\t\t\t\t\tendif'"
	 * @generated
	 */
	int getNumeroEntidadesAccesiblesD2();

	/**
	 * Sets the value of the '{@link DataWebDeskDSL.Rol#getNumeroEntidadesAccesiblesD2 <em>Numero Entidades Accesibles D2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Entidades Accesibles D2</em>' attribute.
	 * @see #getNumeroEntidadesAccesiblesD2()
	 * @generated
	 */
	void setNumeroEntidadesAccesiblesD2(int value);

	/**
	 * Returns the value of the '<em><b>Tiene acceso</b></em>' reference list.
	 * The list contents are of type {@link DataWebDeskDSL.Pagina}.
	 * It is bidirectional and its opposite is '{@link DataWebDeskDSL.Pagina#getAccedida_por <em>Accedida por</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tiene acceso</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiene acceso</em>' reference list.
	 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getRol_Tiene_acceso()
	 * @see DataWebDeskDSL.Pagina#getAccedida_por
	 * @model opposite="accedida_por"
	 *        annotation="gmf.link source='accedida_por' target='tiene_acceso' label='tiene_acceso' target.decoration='arrow'"
	 * @generated
	 */
	EList<Pagina> getTiene_acceso();

} // Rol
