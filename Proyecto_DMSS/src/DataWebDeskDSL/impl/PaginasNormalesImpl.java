/**
 */
package DataWebDeskDSL.impl;

import DataWebDeskDSL.DataWebDeskDSLPackage;
import DataWebDeskDSL.PaginasNormales;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Paginas Normales</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DataWebDeskDSL.impl.PaginasNormalesImpl#getTexto <em>Texto</em>}</li>
 *   <li>{@link DataWebDeskDSL.impl.PaginasNormalesImpl#getMultimedia <em>Multimedia</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaginasNormalesImpl extends PaginaImpl implements PaginasNormales {
	/**
	 * The cached value of the '{@link #getTexto() <em>Texto</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexto()
	 * @generated
	 * @ordered
	 */
	protected EList<String> texto;

	/**
	 * The cached value of the '{@link #getMultimedia() <em>Multimedia</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultimedia()
	 * @generated
	 * @ordered
	 */
	protected EList<String> multimedia;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaginasNormalesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataWebDeskDSLPackage.Literals.PAGINAS_NORMALES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTexto() {
		if (texto == null) {
			texto = new EDataTypeUniqueEList<String>(String.class, this, DataWebDeskDSLPackage.PAGINAS_NORMALES__TEXTO);
		}
		return texto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMultimedia() {
		if (multimedia == null) {
			multimedia = new EDataTypeUniqueEList<String>(String.class, this, DataWebDeskDSLPackage.PAGINAS_NORMALES__MULTIMEDIA);
		}
		return multimedia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataWebDeskDSLPackage.PAGINAS_NORMALES__TEXTO:
				return getTexto();
			case DataWebDeskDSLPackage.PAGINAS_NORMALES__MULTIMEDIA:
				return getMultimedia();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataWebDeskDSLPackage.PAGINAS_NORMALES__TEXTO:
				getTexto().clear();
				getTexto().addAll((Collection<? extends String>)newValue);
				return;
			case DataWebDeskDSLPackage.PAGINAS_NORMALES__MULTIMEDIA:
				getMultimedia().clear();
				getMultimedia().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DataWebDeskDSLPackage.PAGINAS_NORMALES__TEXTO:
				getTexto().clear();
				return;
			case DataWebDeskDSLPackage.PAGINAS_NORMALES__MULTIMEDIA:
				getMultimedia().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DataWebDeskDSLPackage.PAGINAS_NORMALES__TEXTO:
				return texto != null && !texto.isEmpty();
			case DataWebDeskDSLPackage.PAGINAS_NORMALES__MULTIMEDIA:
				return multimedia != null && !multimedia.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (texto: ");
		result.append(texto);
		result.append(", multimedia: ");
		result.append(multimedia);
		result.append(')');
		return result.toString();
	}

} //PaginasNormalesImpl
