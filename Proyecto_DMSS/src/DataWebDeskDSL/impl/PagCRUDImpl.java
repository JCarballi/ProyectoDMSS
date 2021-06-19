/**
 */
package DataWebDeskDSL.impl;

import DataWebDeskDSL.DataWebDeskDSLPackage;
import DataWebDeskDSL.Entidad;
import DataWebDeskDSL.PagCRUD;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pag CRUD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DataWebDeskDSL.impl.PagCRUDImpl#getTiene_asociada <em>Tiene asociada</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PagCRUDImpl extends PaginaImpl implements PagCRUD {
	/**
	 * The cached value of the '{@link #getTiene_asociada() <em>Tiene asociada</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiene_asociada()
	 * @generated
	 * @ordered
	 */
	protected Entidad tiene_asociada;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PagCRUDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataWebDeskDSLPackage.Literals.PAG_CRUD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entidad getTiene_asociada() {
		if (tiene_asociada != null && tiene_asociada.eIsProxy()) {
			InternalEObject oldTiene_asociada = (InternalEObject)tiene_asociada;
			tiene_asociada = (Entidad)eResolveProxy(oldTiene_asociada);
			if (tiene_asociada != oldTiene_asociada) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataWebDeskDSLPackage.PAG_CRUD__TIENE_ASOCIADA, oldTiene_asociada, tiene_asociada));
			}
		}
		return tiene_asociada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entidad basicGetTiene_asociada() {
		return tiene_asociada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTiene_asociada(Entidad newTiene_asociada, NotificationChain msgs) {
		Entidad oldTiene_asociada = tiene_asociada;
		tiene_asociada = newTiene_asociada;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataWebDeskDSLPackage.PAG_CRUD__TIENE_ASOCIADA, oldTiene_asociada, newTiene_asociada);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTiene_asociada(Entidad newTiene_asociada) {
		if (newTiene_asociada != tiene_asociada) {
			NotificationChain msgs = null;
			if (tiene_asociada != null)
				msgs = ((InternalEObject)tiene_asociada).eInverseRemove(this, DataWebDeskDSLPackage.ENTIDAD__ASOCIADA, Entidad.class, msgs);
			if (newTiene_asociada != null)
				msgs = ((InternalEObject)newTiene_asociada).eInverseAdd(this, DataWebDeskDSLPackage.ENTIDAD__ASOCIADA, Entidad.class, msgs);
			msgs = basicSetTiene_asociada(newTiene_asociada, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataWebDeskDSLPackage.PAG_CRUD__TIENE_ASOCIADA, newTiene_asociada, newTiene_asociada));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataWebDeskDSLPackage.PAG_CRUD__TIENE_ASOCIADA:
				if (tiene_asociada != null)
					msgs = ((InternalEObject)tiene_asociada).eInverseRemove(this, DataWebDeskDSLPackage.ENTIDAD__ASOCIADA, Entidad.class, msgs);
				return basicSetTiene_asociada((Entidad)otherEnd, msgs);
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
			case DataWebDeskDSLPackage.PAG_CRUD__TIENE_ASOCIADA:
				return basicSetTiene_asociada(null, msgs);
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
			case DataWebDeskDSLPackage.PAG_CRUD__TIENE_ASOCIADA:
				if (resolve) return getTiene_asociada();
				return basicGetTiene_asociada();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataWebDeskDSLPackage.PAG_CRUD__TIENE_ASOCIADA:
				setTiene_asociada((Entidad)newValue);
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
			case DataWebDeskDSLPackage.PAG_CRUD__TIENE_ASOCIADA:
				setTiene_asociada((Entidad)null);
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
			case DataWebDeskDSLPackage.PAG_CRUD__TIENE_ASOCIADA:
				return tiene_asociada != null;
		}
		return super.eIsSet(featureID);
	}

} //PagCRUDImpl
