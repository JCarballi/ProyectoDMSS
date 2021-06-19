/**
 */
package DataWebDeskDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>URL Externa</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DataWebDeskDSL.URLExterna#getPagina <em>Pagina</em>}</li>
 *   <li>{@link DataWebDeskDSL.URLExterna#getLink <em>Link</em>}</li>
 *   <li>{@link DataWebDeskDSL.URLExterna#getNombreWeb <em>Nombre Web</em>}</li>
 * </ul>
 *
 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getURLExterna()
 * @model annotation="gmf.node label='Link' figure='svg' svg.uri='platform:/plugin/ProyectoDMSS/iconos/link.svg' label.icon='false' label.placement='external'"
 * @generated
 */
public interface URLExterna extends EObject {
	/**
	 * Returns the value of the '<em><b>Pagina</b></em>' reference list.
	 * The list contents are of type {@link DataWebDeskDSL.Pagina}.
	 * It is bidirectional and its opposite is '{@link DataWebDeskDSL.Pagina#getUrlexterna <em>Urlexterna</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pagina</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pagina</em>' reference list.
	 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getURLExterna_Pagina()
	 * @see DataWebDeskDSL.Pagina#getUrlexterna
	 * @model opposite="urlexterna"
	 *        annotation="gmf.link source='urlexterna' target='pagina' label='enlazada_en' target.decoration='arrow'"
	 * @generated
	 */
	EList<Pagina> getPagina();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' attribute.
	 * @see #setLink(String)
	 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getURLExterna_Link()
	 * @model required="true"
	 * @generated
	 */
	String getLink();

	/**
	 * Sets the value of the '{@link DataWebDeskDSL.URLExterna#getLink <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' attribute.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(String value);

	/**
	 * Returns the value of the '<em><b>Nombre Web</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Web</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Web</em>' attribute.
	 * @see #setNombreWeb(String)
	 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getURLExterna_NombreWeb()
	 * @model required="true"
	 * @generated
	 */
	String getNombreWeb();

	/**
	 * Sets the value of the '{@link DataWebDeskDSL.URLExterna#getNombreWeb <em>Nombre Web</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Web</em>' attribute.
	 * @see #getNombreWeb()
	 * @generated
	 */
	void setNombreWeb(String value);

} // URLExterna
