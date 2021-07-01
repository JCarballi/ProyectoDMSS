/**
 */
package DataWebDeskDSL.impl;

import DataWebDeskDSL.DataWebDeskDSLPackage;
import DataWebDeskDSL.Pagina;
import DataWebDeskDSL.Rol;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DataWebDeskDSL.impl.RolImpl#getNombreRol <em>Nombre Rol</em>}</li>
 *   <li>{@link DataWebDeskDSL.impl.RolImpl#getNumeroPaginasAccesiblesD1 <em>Numero Paginas Accesibles D1</em>}</li>
 *   <li>{@link DataWebDeskDSL.impl.RolImpl#getNumeroEntidadesAccesiblesD2 <em>Numero Entidades Accesibles D2</em>}</li>
 *   <li>{@link DataWebDeskDSL.impl.RolImpl#getTiene_acceso <em>Tiene acceso</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RolImpl extends EObjectImpl implements Rol {
	/**
	 * The default value of the '{@link #getNombreRol() <em>Nombre Rol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreRol()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_ROL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreRol() <em>Nombre Rol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreRol()
	 * @generated
	 * @ordered
	 */
	protected String nombreRol = NOMBRE_ROL_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getNumeroPaginasAccesiblesD1() <em>Numero Paginas Accesibles D1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroPaginasAccesiblesD1()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NUMERO_PAGINAS_ACCESIBLES_D1__ESETTING_DELEGATE = ((EStructuralFeature.Internal)DataWebDeskDSLPackage.Literals.ROL__NUMERO_PAGINAS_ACCESIBLES_D1).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getNumeroEntidadesAccesiblesD2() <em>Numero Entidades Accesibles D2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroEntidadesAccesiblesD2()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NUMERO_ENTIDADES_ACCESIBLES_D2__ESETTING_DELEGATE = ((EStructuralFeature.Internal)DataWebDeskDSLPackage.Literals.ROL__NUMERO_ENTIDADES_ACCESIBLES_D2).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getTiene_acceso() <em>Tiene acceso</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiene_acceso()
	 * @generated
	 * @ordered
	 */
	protected EList<Pagina> tiene_acceso;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataWebDeskDSLPackage.Literals.ROL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombreRol() {
		return nombreRol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreRol(String newNombreRol) {
		String oldNombreRol = nombreRol;
		nombreRol = newNombreRol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataWebDeskDSLPackage.ROL__NOMBRE_ROL, oldNombreRol, nombreRol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumeroPaginasAccesiblesD1() {
		return (Integer)NUMERO_PAGINAS_ACCESIBLES_D1__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroPaginasAccesiblesD1(int newNumeroPaginasAccesiblesD1) {
		NUMERO_PAGINAS_ACCESIBLES_D1__ESETTING_DELEGATE.dynamicSet(this, null, 0, newNumeroPaginasAccesiblesD1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumeroEntidadesAccesiblesD2() {
		return (Integer)NUMERO_ENTIDADES_ACCESIBLES_D2__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroEntidadesAccesiblesD2(int newNumeroEntidadesAccesiblesD2) {
		NUMERO_ENTIDADES_ACCESIBLES_D2__ESETTING_DELEGATE.dynamicSet(this, null, 0, newNumeroEntidadesAccesiblesD2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pagina> getTiene_acceso() {
		if (tiene_acceso == null) {
			tiene_acceso = new EObjectWithInverseResolvingEList.ManyInverse<Pagina>(Pagina.class, this, DataWebDeskDSLPackage.ROL__TIENE_ACCESO, DataWebDeskDSLPackage.PAGINA__ACCEDIDA_POR);
		}
		return tiene_acceso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataWebDeskDSLPackage.ROL__TIENE_ACCESO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTiene_acceso()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataWebDeskDSLPackage.ROL__TIENE_ACCESO:
				return ((InternalEList<?>)getTiene_acceso()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataWebDeskDSLPackage.ROL__NOMBRE_ROL:
				return getNombreRol();
			case DataWebDeskDSLPackage.ROL__NUMERO_PAGINAS_ACCESIBLES_D1:
				return getNumeroPaginasAccesiblesD1();
			case DataWebDeskDSLPackage.ROL__NUMERO_ENTIDADES_ACCESIBLES_D2:
				return getNumeroEntidadesAccesiblesD2();
			case DataWebDeskDSLPackage.ROL__TIENE_ACCESO:
				return getTiene_acceso();
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
			case DataWebDeskDSLPackage.ROL__NOMBRE_ROL:
				setNombreRol((String)newValue);
				return;
			case DataWebDeskDSLPackage.ROL__NUMERO_PAGINAS_ACCESIBLES_D1:
				setNumeroPaginasAccesiblesD1((Integer)newValue);
				return;
			case DataWebDeskDSLPackage.ROL__NUMERO_ENTIDADES_ACCESIBLES_D2:
				setNumeroEntidadesAccesiblesD2((Integer)newValue);
				return;
			case DataWebDeskDSLPackage.ROL__TIENE_ACCESO:
				getTiene_acceso().clear();
				getTiene_acceso().addAll((Collection<? extends Pagina>)newValue);
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
			case DataWebDeskDSLPackage.ROL__NOMBRE_ROL:
				setNombreRol(NOMBRE_ROL_EDEFAULT);
				return;
			case DataWebDeskDSLPackage.ROL__NUMERO_PAGINAS_ACCESIBLES_D1:
				NUMERO_PAGINAS_ACCESIBLES_D1__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case DataWebDeskDSLPackage.ROL__NUMERO_ENTIDADES_ACCESIBLES_D2:
				NUMERO_ENTIDADES_ACCESIBLES_D2__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case DataWebDeskDSLPackage.ROL__TIENE_ACCESO:
				getTiene_acceso().clear();
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
			case DataWebDeskDSLPackage.ROL__NOMBRE_ROL:
				return NOMBRE_ROL_EDEFAULT == null ? nombreRol != null : !NOMBRE_ROL_EDEFAULT.equals(nombreRol);
			case DataWebDeskDSLPackage.ROL__NUMERO_PAGINAS_ACCESIBLES_D1:
				return NUMERO_PAGINAS_ACCESIBLES_D1__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case DataWebDeskDSLPackage.ROL__NUMERO_ENTIDADES_ACCESIBLES_D2:
				return NUMERO_ENTIDADES_ACCESIBLES_D2__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case DataWebDeskDSLPackage.ROL__TIENE_ACCESO:
				return tiene_acceso != null && !tiene_acceso.isEmpty();
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
		result.append(" (nombreRol: ");
		result.append(nombreRol);
		result.append(')');
		return result.toString();
	}

} //RolImpl
