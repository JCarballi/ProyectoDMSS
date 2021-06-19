/**
 */
package DataWebDeskDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Red Social</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DataWebDeskDSL.RedSocial#getTipoCont <em>Tipo Cont</em>}</li>
 *   <li>{@link DataWebDeskDSL.RedSocial#getID_RedSocial <em>ID Red Social</em>}</li>
 *   <li>{@link DataWebDeskDSL.RedSocial#getMostrada <em>Mostrada</em>}</li>
 *   <li>{@link DataWebDeskDSL.RedSocial#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getRedSocial()
 * @model abstract="true"
 *        annotation="gmf.node label='nombre' figure='svg' svg.uri='platform:/plugin/ProyectoDMSS/iconos/socialMedia.svg' label.icon='false' label.placement='external'"
 * @generated
 */
public interface RedSocial extends EObject {
	/**
	 * Returns the value of the '<em><b>Tipo Cont</b></em>' attribute.
	 * The literals are from the enumeration {@link DataWebDeskDSL.tipoContenido}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Cont</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Cont</em>' attribute.
	 * @see DataWebDeskDSL.tipoContenido
	 * @see #setTipoCont(tipoContenido)
	 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getRedSocial_TipoCont()
	 * @model
	 * @generated
	 */
	tipoContenido getTipoCont();

	/**
	 * Sets the value of the '{@link DataWebDeskDSL.RedSocial#getTipoCont <em>Tipo Cont</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Cont</em>' attribute.
	 * @see DataWebDeskDSL.tipoContenido
	 * @see #getTipoCont()
	 * @generated
	 */
	void setTipoCont(tipoContenido value);

	/**
	 * Returns the value of the '<em><b>ID Red Social</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID Red Social</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID Red Social</em>' attribute.
	 * @see #setID_RedSocial(int)
	 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getRedSocial_ID_RedSocial()
	 * @model required="true"
	 * @generated
	 */
	int getID_RedSocial();

	/**
	 * Sets the value of the '{@link DataWebDeskDSL.RedSocial#getID_RedSocial <em>ID Red Social</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Red Social</em>' attribute.
	 * @see #getID_RedSocial()
	 * @generated
	 */
	void setID_RedSocial(int value);

	/**
	 * Returns the value of the '<em><b>Mostrada</b></em>' reference list.
	 * The list contents are of type {@link DataWebDeskDSL.Pagina}.
	 * It is bidirectional and its opposite is '{@link DataWebDeskDSL.Pagina#getMuestra <em>Muestra</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mostrada</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mostrada</em>' reference list.
	 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getRedSocial_Mostrada()
	 * @see DataWebDeskDSL.Pagina#getMuestra
	 * @model opposite="muestra"
	 *        annotation="gmf.link source='muestra' target='mostrada' label='mostrada_en' target.decoration='arrow'"
	 * @generated
	 */
	EList<Pagina> getMostrada();

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getRedSocial_Nombre()
	 * @model required="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link DataWebDeskDSL.RedSocial#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

} // RedSocial
