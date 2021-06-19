/**
 */
package DataWebDeskDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Caracteristica Entidad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DataWebDeskDSL.CaracteristicaEntidad#getNombreCaract <em>Nombre Caract</em>}</li>
 *   <li>{@link DataWebDeskDSL.CaracteristicaEntidad#getTDato <em>TDato</em>}</li>
 *   <li>{@link DataWebDeskDSL.CaracteristicaEntidad#getEsta_en <em>Esta en</em>}</li>
 * </ul>
 *
 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getCaracteristicaEntidad()
 * @model annotation="gmf.node label='nombreCaract' figure='rectangle' label.icon='true'"
 * @generated
 */
public interface CaracteristicaEntidad extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Caract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Caract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Caract</em>' attribute.
	 * @see #setNombreCaract(String)
	 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getCaracteristicaEntidad_NombreCaract()
	 * @model required="true"
	 * @generated
	 */
	String getNombreCaract();

	/**
	 * Sets the value of the '{@link DataWebDeskDSL.CaracteristicaEntidad#getNombreCaract <em>Nombre Caract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Caract</em>' attribute.
	 * @see #getNombreCaract()
	 * @generated
	 */
	void setNombreCaract(String value);

	/**
	 * Returns the value of the '<em><b>TDato</b></em>' attribute.
	 * The literals are from the enumeration {@link DataWebDeskDSL.TipoDato}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TDato</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TDato</em>' attribute.
	 * @see DataWebDeskDSL.TipoDato
	 * @see #setTDato(TipoDato)
	 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getCaracteristicaEntidad_TDato()
	 * @model
	 * @generated
	 */
	TipoDato getTDato();

	/**
	 * Sets the value of the '{@link DataWebDeskDSL.CaracteristicaEntidad#getTDato <em>TDato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TDato</em>' attribute.
	 * @see DataWebDeskDSL.TipoDato
	 * @see #getTDato()
	 * @generated
	 */
	void setTDato(TipoDato value);

	/**
	 * Returns the value of the '<em><b>Esta en</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link DataWebDeskDSL.Entidad#getClave_primaria <em>Clave primaria</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Esta en</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Esta en</em>' reference.
	 * @see #setEsta_en(Entidad)
	 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getCaracteristicaEntidad_Esta_en()
	 * @see DataWebDeskDSL.Entidad#getClave_primaria
	 * @model opposite="clave_primaria"
	 * @generated
	 */
	Entidad getEsta_en();

	/**
	 * Sets the value of the '{@link DataWebDeskDSL.CaracteristicaEntidad#getEsta_en <em>Esta en</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Esta en</em>' reference.
	 * @see #getEsta_en()
	 * @generated
	 */
	void setEsta_en(Entidad value);

} // CaracteristicaEntidad
