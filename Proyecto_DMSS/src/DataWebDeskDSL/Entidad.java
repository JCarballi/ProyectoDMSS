/**
 */
package DataWebDeskDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entidad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DataWebDeskDSL.Entidad#getCaracteristica <em>Caracteristica</em>}</li>
 *   <li>{@link DataWebDeskDSL.Entidad#getAsociada <em>Asociada</em>}</li>
 *   <li>{@link DataWebDeskDSL.Entidad#getId_Entidad <em>Id Entidad</em>}</li>
 *   <li>{@link DataWebDeskDSL.Entidad#getClave_primaria <em>Clave primaria</em>}</li>
 *   <li>{@link DataWebDeskDSL.Entidad#getNombreEntidad <em>Nombre Entidad</em>}</li>
 *   <li>{@link DataWebDeskDSL.Entidad#getRelacionada <em>Relacionada</em>}</li>
 *   <li>{@link DataWebDeskDSL.Entidad#getEsta_relacionada <em>Esta relacionada</em>}</li>
 * </ul>
 *
 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getEntidad()
 * @model annotation="gmf.node label='nombreEntidad' border.color='0,0,0'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='idCaracteristica soloCRUDR3 indiceDetalleR4 detalleIndiceR4 noSelfRefR6 noBidireccionalRefR7'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot idCaracteristica='self.caracteristica->isUnique(nombreCaract)' soloCRUDR3='self.asociada->select(p: PagCRUD | p.oclIsTypeOf(CRUD))->size() > 0 implies self.asociada->size()=1' indiceDetalleR4='self.asociada->select(p: PagCRUD | p.oclIsTypeOf(PagIndice)) -> size() > 0 implies self.asociada->select(p: PagCRUD | p.oclIsTypeOf(PagLeer)) -> size() = 1 ' detalleIndiceR4='self.asociada->select(p: PagCRUD | p.oclIsTypeOf(PagLeer)) -> size() > 0 implies self.asociada->select(p: PagCRUD | p.oclIsTypeOf(PagIndice)) -> size() = 1 ' noSelfRefR6='self.esta_relacionada->excludes(self)' noBidireccionalRefR7=' self.relacionada->closure(relacionada)->excludes(self)'"
 * @generated
 */
public interface Entidad extends EObject {
	/**
	 * Returns the value of the '<em><b>Caracteristica</b></em>' containment reference list.
	 * The list contents are of type {@link DataWebDeskDSL.CaracteristicaEntidad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caracteristica</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caracteristica</em>' containment reference list.
	 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getEntidad_Caracteristica()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<CaracteristicaEntidad> getCaracteristica();

	/**
	 * Returns the value of the '<em><b>Asociada</b></em>' reference list.
	 * The list contents are of type {@link DataWebDeskDSL.PagCRUD}.
	 * It is bidirectional and its opposite is '{@link DataWebDeskDSL.PagCRUD#getTiene_asociada <em>Tiene asociada</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asociada</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asociada</em>' reference list.
	 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getEntidad_Asociada()
	 * @see DataWebDeskDSL.PagCRUD#getTiene_asociada
	 * @model opposite="tiene_asociada"
	 *        annotation="gmf.link source='tiene_asociada' target='asociada' label='CRUD_asociada' target.decoration='arrow'"
	 * @generated
	 */
	EList<PagCRUD> getAsociada();

	/**
	 * Returns the value of the '<em><b>Id Entidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Entidad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Entidad</em>' attribute.
	 * @see #setId_Entidad(int)
	 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getEntidad_Id_Entidad()
	 * @model required="true"
	 * @generated
	 */
	int getId_Entidad();

	/**
	 * Sets the value of the '{@link DataWebDeskDSL.Entidad#getId_Entidad <em>Id Entidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Entidad</em>' attribute.
	 * @see #getId_Entidad()
	 * @generated
	 */
	void setId_Entidad(int value);

	/**
	 * Returns the value of the '<em><b>Clave primaria</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link DataWebDeskDSL.CaracteristicaEntidad#getEsta_en <em>Esta en</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clave primaria</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clave primaria</em>' reference.
	 * @see #setClave_primaria(CaracteristicaEntidad)
	 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getEntidad_Clave_primaria()
	 * @see DataWebDeskDSL.CaracteristicaEntidad#getEsta_en
	 * @model opposite="esta_en" required="true"
	 *        annotation="gmf.link source='esta_en' target='clave_primaria' label='primary_key' target.decoration='arrow' style='dot'"
	 * @generated
	 */
	CaracteristicaEntidad getClave_primaria();

	/**
	 * Sets the value of the '{@link DataWebDeskDSL.Entidad#getClave_primaria <em>Clave primaria</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clave primaria</em>' reference.
	 * @see #getClave_primaria()
	 * @generated
	 */
	void setClave_primaria(CaracteristicaEntidad value);

	/**
	 * Returns the value of the '<em><b>Nombre Entidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Entidad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Entidad</em>' attribute.
	 * @see #setNombreEntidad(String)
	 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getEntidad_NombreEntidad()
	 * @model required="true"
	 * @generated
	 */
	String getNombreEntidad();

	/**
	 * Sets the value of the '{@link DataWebDeskDSL.Entidad#getNombreEntidad <em>Nombre Entidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Entidad</em>' attribute.
	 * @see #getNombreEntidad()
	 * @generated
	 */
	void setNombreEntidad(String value);

	/**
	 * Returns the value of the '<em><b>Relacionada</b></em>' reference list.
	 * The list contents are of type {@link DataWebDeskDSL.Entidad}.
	 * It is bidirectional and its opposite is '{@link DataWebDeskDSL.Entidad#getEsta_relacionada <em>Esta relacionada</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relacionada</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relacionada</em>' reference list.
	 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getEntidad_Relacionada()
	 * @see DataWebDeskDSL.Entidad#getEsta_relacionada
	 * @model opposite="esta_relacionada"
	 *        annotation="gmf.link source='relacionada' target='esta_relacionada' label='relacionada' target.decoration='arrow'"
	 * @generated
	 */
	EList<Entidad> getRelacionada();

	/**
	 * Returns the value of the '<em><b>Esta relacionada</b></em>' reference list.
	 * The list contents are of type {@link DataWebDeskDSL.Entidad}.
	 * It is bidirectional and its opposite is '{@link DataWebDeskDSL.Entidad#getRelacionada <em>Relacionada</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Esta relacionada</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Esta relacionada</em>' reference list.
	 * @see DataWebDeskDSL.DataWebDeskDSLPackage#getEntidad_Esta_relacionada()
	 * @see DataWebDeskDSL.Entidad#getRelacionada
	 * @model opposite="relacionada"
	 * @generated
	 */
	EList<Entidad> getEsta_relacionada();

} // Entidad
