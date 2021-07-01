/**
 */
package DataWebDeskDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pagina</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DataWebDeskDSL.Pagina#getAccedida <em>Accedida</em>}</li>
 *   <li>{@link DataWebDeskDSL.Pagina#getAccede <em>Accede</em>}</li>
 *   <li>{@link DataWebDeskDSL.Pagina#getTituloPag <em>Titulo Pag</em>}</li>
 *   <li>{@link DataWebDeskDSL.Pagina#getUrlexterna <em>Urlexterna</em>}</li>
 *   <li>{@link DataWebDeskDSL.Pagina#getMuestra <em>Muestra</em>}</li>
 *   <li>{@link DataWebDeskDSL.Pagina#getAccedida_por <em>Accedida por</em>}</li>
 * </ul>
 *
 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getPagina()
 * @model abstract="true"
 *        annotation="gmf.node label='tituloPag' figure='svg' svg.uri='platform:/plugin/Proyecto_DMSS/iconos/pagina.svg' label.icon='false' label.placement='external'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noPagAisladaR2'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot noPagAisladaR2='self->closure(accedida).accedida_por -> size() > 0'"
 * @generated
 */
public interface Pagina extends EObject {
	/**
	 * Returns the value of the '<em><b>Accedida</b></em>' reference list.
	 * The list contents are of type {@link DataWebDeskDSL.Pagina}.
	 * It is bidirectional and its opposite is '{@link DataWebDeskDSL.Pagina#getAccede <em>Accede</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accedida</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accedida</em>' reference list.
	 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getPagina_Accedida()
	 * @see DataWebDeskDSL.Pagina#getAccede
	 * @model opposite="accede"
	 * @generated
	 */
	EList<Pagina> getAccedida();

	/**
	 * Returns the value of the '<em><b>Accede</b></em>' reference list.
	 * The list contents are of type {@link DataWebDeskDSL.Pagina}.
	 * It is bidirectional and its opposite is '{@link DataWebDeskDSL.Pagina#getAccedida <em>Accedida</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accede</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accede</em>' reference list.
	 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getPagina_Accede()
	 * @see DataWebDeskDSL.Pagina#getAccedida
	 * @model opposite="accedida"
	 *        annotation="gmf.link source='accede' target='accedida' label='accede' target.decoration='arrow'"
	 * @generated
	 */
	EList<Pagina> getAccede();

	/**
	 * Returns the value of the '<em><b>Titulo Pag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Titulo Pag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titulo Pag</em>' attribute.
	 * @see #setTituloPag(String)
	 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getPagina_TituloPag()
	 * @model required="true"
	 * @generated
	 */
	String getTituloPag();

	/**
	 * Sets the value of the '{@link DataWebDeskDSL.Pagina#getTituloPag <em>Titulo Pag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titulo Pag</em>' attribute.
	 * @see #getTituloPag()
	 * @generated
	 */
	void setTituloPag(String value);

	/**
	 * Returns the value of the '<em><b>Urlexterna</b></em>' reference list.
	 * The list contents are of type {@link DataWebDeskDSL.URLExterna}.
	 * It is bidirectional and its opposite is '{@link DataWebDeskDSL.URLExterna#getPagina <em>Pagina</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Urlexterna</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Urlexterna</em>' reference list.
	 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getPagina_Urlexterna()
	 * @see DataWebDeskDSL.URLExterna#getPagina
	 * @model opposite="pagina"
	 * @generated
	 */
	EList<URLExterna> getUrlexterna();

	/**
	 * Returns the value of the '<em><b>Muestra</b></em>' reference list.
	 * The list contents are of type {@link DataWebDeskDSL.RedSocial}.
	 * It is bidirectional and its opposite is '{@link DataWebDeskDSL.RedSocial#getMostrada <em>Mostrada</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Muestra</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Muestra</em>' reference list.
	 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getPagina_Muestra()
	 * @see DataWebDeskDSL.RedSocial#getMostrada
	 * @model opposite="mostrada"
	 * @generated
	 */
	EList<RedSocial> getMuestra();

	/**
	 * Returns the value of the '<em><b>Accedida por</b></em>' reference list.
	 * The list contents are of type {@link DataWebDeskDSL.Rol}.
	 * It is bidirectional and its opposite is '{@link DataWebDeskDSL.Rol#getTiene_acceso <em>Tiene acceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accedida por</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accedida por</em>' reference list.
	 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getPagina_Accedida_por()
	 * @see DataWebDeskDSL.Rol#getTiene_acceso
	 * @model opposite="tiene_acceso"
	 * @generated
	 */
	EList<Rol> getAccedida_por();

} // Pagina
