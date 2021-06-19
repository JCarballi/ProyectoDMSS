/**
 */
package DataWebDeskDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paginas Normales</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DataWebDeskDSL.PaginasNormales#getTexto <em>Texto</em>}</li>
 *   <li>{@link DataWebDeskDSL.PaginasNormales#getMultimedia <em>Multimedia</em>}</li>
 * </ul>
 *
 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getPaginasNormales()
 * @model
 * @generated
 */
public interface PaginasNormales extends Pagina {
	/**
	 * Returns the value of the '<em><b>Texto</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texto</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texto</em>' attribute list.
	 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getPaginasNormales_Texto()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getTexto();

	/**
	 * Returns the value of the '<em><b>Multimedia</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multimedia</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multimedia</em>' attribute list.
	 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getPaginasNormales_Multimedia()
	 * @model
	 * @generated
	 */
	EList<String> getMultimedia();

} // PaginasNormales
