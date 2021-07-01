/**
 */
package DataWebDeskDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pag CRUD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DataWebDeskDSL.PagCRUD#getTiene_asociada <em>Tiene asociada</em>}</li>
 * </ul>
 *
 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getPagCRUD()
 * @model abstract="true"
 *        annotation="gmf.node label='tituloPag' figure='svg' svg.uri='platform:/plugin/Proyecto_DMSS/iconos/paginaCRUD.svg' label.icon='false' label.placement='external'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CRUDNoSuelta'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot CRUDNoSuelta='self.tiene_asociada->size()>0 or self.accede->selectByType(CRUD)->size()>0'"
 * @generated
 */
public interface PagCRUD extends Pagina {
	/**
	 * Returns the value of the '<em><b>Tiene asociada</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link DataWebDeskDSL.Entidad#getAsociada <em>Asociada</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tiene asociada</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiene asociada</em>' reference.
	 * @see #setTiene_asociada(Entidad)
	 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getPagCRUD_Tiene_asociada()
	 * @see DataWebDeskDSL.Entidad#getAsociada
	 * @model opposite="asociada"
	 * @generated
	 */
	Entidad getTiene_asociada();

	/**
	 * Sets the value of the '{@link DataWebDeskDSL.PagCRUD#getTiene_asociada <em>Tiene asociada</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tiene asociada</em>' reference.
	 * @see #getTiene_asociada()
	 * @generated
	 */
	void setTiene_asociada(Entidad value);

} // PagCRUD
