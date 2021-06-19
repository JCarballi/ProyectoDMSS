/**
 */
package DataWebDeskDSL.impl;

import DataWebDeskDSL.CaracteristicaEntidad;
import DataWebDeskDSL.DataWebDeskDSLPackage;
import DataWebDeskDSL.Entidad;
import DataWebDeskDSL.PagCRUD;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entidad</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DataWebDeskDSL.impl.EntidadImpl#getCaracteristica <em>Caracteristica</em>}</li>
 *   <li>{@link DataWebDeskDSL.impl.EntidadImpl#getAsociada <em>Asociada</em>}</li>
 *   <li>{@link DataWebDeskDSL.impl.EntidadImpl#getID_Entidad <em>ID Entidad</em>}</li>
 *   <li>{@link DataWebDeskDSL.impl.EntidadImpl#getClave_primaria <em>Clave primaria</em>}</li>
 *   <li>{@link DataWebDeskDSL.impl.EntidadImpl#getNombreEntidad <em>Nombre Entidad</em>}</li>
 *   <li>{@link DataWebDeskDSL.impl.EntidadImpl#getRelacionada <em>Relacionada</em>}</li>
 *   <li>{@link DataWebDeskDSL.impl.EntidadImpl#getEsta_relacionada <em>Esta relacionada</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntidadImpl extends EObjectImpl implements Entidad {
	/**
	 * The cached value of the '{@link #getCaracteristica() <em>Caracteristica</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaracteristica()
	 * @generated
	 * @ordered
	 */
	protected EList<CaracteristicaEntidad> caracteristica;

	/**
	 * The cached value of the '{@link #getAsociada() <em>Asociada</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsociada()
	 * @generated
	 * @ordered
	 */
	protected EList<PagCRUD> asociada;

	/**
	 * The default value of the '{@link #getID_Entidad() <em>ID Entidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID_Entidad()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_ENTIDAD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getID_Entidad() <em>ID Entidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID_Entidad()
	 * @generated
	 * @ordered
	 */
	protected int iD_Entidad = ID_ENTIDAD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClave_primaria() <em>Clave primaria</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClave_primaria()
	 * @generated
	 * @ordered
	 */
	protected CaracteristicaEntidad clave_primaria;

	/**
	 * The default value of the '{@link #getNombreEntidad() <em>Nombre Entidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreEntidad()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_ENTIDAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreEntidad() <em>Nombre Entidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreEntidad()
	 * @generated
	 * @ordered
	 */
	protected String nombreEntidad = NOMBRE_ENTIDAD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelacionada() <em>Relacionada</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelacionada()
	 * @generated
	 * @ordered
	 */
	protected EList<Entidad> relacionada;

	/**
	 * The cached value of the '{@link #getEsta_relacionada() <em>Esta relacionada</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEsta_relacionada()
	 * @generated
	 * @ordered
	 */
	protected EList<Entidad> esta_relacionada;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntidadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataWebDeskDSLPackage.Literals.ENTIDAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CaracteristicaEntidad> getCaracteristica() {
		if (caracteristica == null) {
			caracteristica = new EObjectContainmentEList<CaracteristicaEntidad>(CaracteristicaEntidad.class, this, DataWebDeskDSLPackage.ENTIDAD__CARACTERISTICA);
		}
		return caracteristica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PagCRUD> getAsociada() {
		if (asociada == null) {
			asociada = new EObjectWithInverseResolvingEList<PagCRUD>(PagCRUD.class, this, DataWebDeskDSLPackage.ENTIDAD__ASOCIADA, DataWebDeskDSLPackage.PAG_CRUD__TIENE_ASOCIADA);
		}
		return asociada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getID_Entidad() {
		return iD_Entidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID_Entidad(int newID_Entidad) {
		int oldID_Entidad = iD_Entidad;
		iD_Entidad = newID_Entidad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataWebDeskDSLPackage.ENTIDAD__ID_ENTIDAD, oldID_Entidad, iD_Entidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaracteristicaEntidad getClave_primaria() {
		if (clave_primaria != null && clave_primaria.eIsProxy()) {
			InternalEObject oldClave_primaria = (InternalEObject)clave_primaria;
			clave_primaria = (CaracteristicaEntidad)eResolveProxy(oldClave_primaria);
			if (clave_primaria != oldClave_primaria) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataWebDeskDSLPackage.ENTIDAD__CLAVE_PRIMARIA, oldClave_primaria, clave_primaria));
			}
		}
		return clave_primaria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaracteristicaEntidad basicGetClave_primaria() {
		return clave_primaria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClave_primaria(CaracteristicaEntidad newClave_primaria, NotificationChain msgs) {
		CaracteristicaEntidad oldClave_primaria = clave_primaria;
		clave_primaria = newClave_primaria;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataWebDeskDSLPackage.ENTIDAD__CLAVE_PRIMARIA, oldClave_primaria, newClave_primaria);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClave_primaria(CaracteristicaEntidad newClave_primaria) {
		if (newClave_primaria != clave_primaria) {
			NotificationChain msgs = null;
			if (clave_primaria != null)
				msgs = ((InternalEObject)clave_primaria).eInverseRemove(this, DataWebDeskDSLPackage.CARACTERISTICA_ENTIDAD__ESTA_EN, CaracteristicaEntidad.class, msgs);
			if (newClave_primaria != null)
				msgs = ((InternalEObject)newClave_primaria).eInverseAdd(this, DataWebDeskDSLPackage.CARACTERISTICA_ENTIDAD__ESTA_EN, CaracteristicaEntidad.class, msgs);
			msgs = basicSetClave_primaria(newClave_primaria, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataWebDeskDSLPackage.ENTIDAD__CLAVE_PRIMARIA, newClave_primaria, newClave_primaria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombreEntidad() {
		return nombreEntidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreEntidad(String newNombreEntidad) {
		String oldNombreEntidad = nombreEntidad;
		nombreEntidad = newNombreEntidad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataWebDeskDSLPackage.ENTIDAD__NOMBRE_ENTIDAD, oldNombreEntidad, nombreEntidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entidad> getRelacionada() {
		if (relacionada == null) {
			relacionada = new EObjectWithInverseResolvingEList.ManyInverse<Entidad>(Entidad.class, this, DataWebDeskDSLPackage.ENTIDAD__RELACIONADA, DataWebDeskDSLPackage.ENTIDAD__ESTA_RELACIONADA);
		}
		return relacionada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entidad> getEsta_relacionada() {
		if (esta_relacionada == null) {
			esta_relacionada = new EObjectWithInverseResolvingEList.ManyInverse<Entidad>(Entidad.class, this, DataWebDeskDSLPackage.ENTIDAD__ESTA_RELACIONADA, DataWebDeskDSLPackage.ENTIDAD__RELACIONADA);
		}
		return esta_relacionada;
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
			case DataWebDeskDSLPackage.ENTIDAD__ASOCIADA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAsociada()).basicAdd(otherEnd, msgs);
			case DataWebDeskDSLPackage.ENTIDAD__CLAVE_PRIMARIA:
				if (clave_primaria != null)
					msgs = ((InternalEObject)clave_primaria).eInverseRemove(this, DataWebDeskDSLPackage.CARACTERISTICA_ENTIDAD__ESTA_EN, CaracteristicaEntidad.class, msgs);
				return basicSetClave_primaria((CaracteristicaEntidad)otherEnd, msgs);
			case DataWebDeskDSLPackage.ENTIDAD__RELACIONADA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelacionada()).basicAdd(otherEnd, msgs);
			case DataWebDeskDSLPackage.ENTIDAD__ESTA_RELACIONADA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEsta_relacionada()).basicAdd(otherEnd, msgs);
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
			case DataWebDeskDSLPackage.ENTIDAD__CARACTERISTICA:
				return ((InternalEList<?>)getCaracteristica()).basicRemove(otherEnd, msgs);
			case DataWebDeskDSLPackage.ENTIDAD__ASOCIADA:
				return ((InternalEList<?>)getAsociada()).basicRemove(otherEnd, msgs);
			case DataWebDeskDSLPackage.ENTIDAD__CLAVE_PRIMARIA:
				return basicSetClave_primaria(null, msgs);
			case DataWebDeskDSLPackage.ENTIDAD__RELACIONADA:
				return ((InternalEList<?>)getRelacionada()).basicRemove(otherEnd, msgs);
			case DataWebDeskDSLPackage.ENTIDAD__ESTA_RELACIONADA:
				return ((InternalEList<?>)getEsta_relacionada()).basicRemove(otherEnd, msgs);
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
			case DataWebDeskDSLPackage.ENTIDAD__CARACTERISTICA:
				return getCaracteristica();
			case DataWebDeskDSLPackage.ENTIDAD__ASOCIADA:
				return getAsociada();
			case DataWebDeskDSLPackage.ENTIDAD__ID_ENTIDAD:
				return getID_Entidad();
			case DataWebDeskDSLPackage.ENTIDAD__CLAVE_PRIMARIA:
				if (resolve) return getClave_primaria();
				return basicGetClave_primaria();
			case DataWebDeskDSLPackage.ENTIDAD__NOMBRE_ENTIDAD:
				return getNombreEntidad();
			case DataWebDeskDSLPackage.ENTIDAD__RELACIONADA:
				return getRelacionada();
			case DataWebDeskDSLPackage.ENTIDAD__ESTA_RELACIONADA:
				return getEsta_relacionada();
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
			case DataWebDeskDSLPackage.ENTIDAD__CARACTERISTICA:
				getCaracteristica().clear();
				getCaracteristica().addAll((Collection<? extends CaracteristicaEntidad>)newValue);
				return;
			case DataWebDeskDSLPackage.ENTIDAD__ASOCIADA:
				getAsociada().clear();
				getAsociada().addAll((Collection<? extends PagCRUD>)newValue);
				return;
			case DataWebDeskDSLPackage.ENTIDAD__ID_ENTIDAD:
				setID_Entidad((Integer)newValue);
				return;
			case DataWebDeskDSLPackage.ENTIDAD__CLAVE_PRIMARIA:
				setClave_primaria((CaracteristicaEntidad)newValue);
				return;
			case DataWebDeskDSLPackage.ENTIDAD__NOMBRE_ENTIDAD:
				setNombreEntidad((String)newValue);
				return;
			case DataWebDeskDSLPackage.ENTIDAD__RELACIONADA:
				getRelacionada().clear();
				getRelacionada().addAll((Collection<? extends Entidad>)newValue);
				return;
			case DataWebDeskDSLPackage.ENTIDAD__ESTA_RELACIONADA:
				getEsta_relacionada().clear();
				getEsta_relacionada().addAll((Collection<? extends Entidad>)newValue);
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
			case DataWebDeskDSLPackage.ENTIDAD__CARACTERISTICA:
				getCaracteristica().clear();
				return;
			case DataWebDeskDSLPackage.ENTIDAD__ASOCIADA:
				getAsociada().clear();
				return;
			case DataWebDeskDSLPackage.ENTIDAD__ID_ENTIDAD:
				setID_Entidad(ID_ENTIDAD_EDEFAULT);
				return;
			case DataWebDeskDSLPackage.ENTIDAD__CLAVE_PRIMARIA:
				setClave_primaria((CaracteristicaEntidad)null);
				return;
			case DataWebDeskDSLPackage.ENTIDAD__NOMBRE_ENTIDAD:
				setNombreEntidad(NOMBRE_ENTIDAD_EDEFAULT);
				return;
			case DataWebDeskDSLPackage.ENTIDAD__RELACIONADA:
				getRelacionada().clear();
				return;
			case DataWebDeskDSLPackage.ENTIDAD__ESTA_RELACIONADA:
				getEsta_relacionada().clear();
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
			case DataWebDeskDSLPackage.ENTIDAD__CARACTERISTICA:
				return caracteristica != null && !caracteristica.isEmpty();
			case DataWebDeskDSLPackage.ENTIDAD__ASOCIADA:
				return asociada != null && !asociada.isEmpty();
			case DataWebDeskDSLPackage.ENTIDAD__ID_ENTIDAD:
				return iD_Entidad != ID_ENTIDAD_EDEFAULT;
			case DataWebDeskDSLPackage.ENTIDAD__CLAVE_PRIMARIA:
				return clave_primaria != null;
			case DataWebDeskDSLPackage.ENTIDAD__NOMBRE_ENTIDAD:
				return NOMBRE_ENTIDAD_EDEFAULT == null ? nombreEntidad != null : !NOMBRE_ENTIDAD_EDEFAULT.equals(nombreEntidad);
			case DataWebDeskDSLPackage.ENTIDAD__RELACIONADA:
				return relacionada != null && !relacionada.isEmpty();
			case DataWebDeskDSLPackage.ENTIDAD__ESTA_RELACIONADA:
				return esta_relacionada != null && !esta_relacionada.isEmpty();
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
		result.append(" (ID_Entidad: ");
		result.append(iD_Entidad);
		result.append(", nombreEntidad: ");
		result.append(nombreEntidad);
		result.append(')');
		return result.toString();
	}

} //EntidadImpl
