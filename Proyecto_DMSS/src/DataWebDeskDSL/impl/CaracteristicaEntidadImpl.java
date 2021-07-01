/**
 */
package DataWebDeskDSL.impl;

import DataWebDeskDSL.CaracteristicaEntidad;
import DataWebDeskDSL.DataWebDeskDSLPackage;
import DataWebDeskDSL.Entidad;
import DataWebDeskDSL.TipoDato;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Caracteristica Entidad</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DataWebDeskDSL.impl.CaracteristicaEntidadImpl#getNombreCaract <em>Nombre Caract</em>}</li>
 *   <li>{@link DataWebDeskDSL.impl.CaracteristicaEntidadImpl#getTipoDato <em>Tipo Dato</em>}</li>
 *   <li>{@link DataWebDeskDSL.impl.CaracteristicaEntidadImpl#getEsta_en <em>Esta en</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CaracteristicaEntidadImpl extends EObjectImpl implements CaracteristicaEntidad {
	/**
	 * The default value of the '{@link #getNombreCaract() <em>Nombre Caract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreCaract()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_CARACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreCaract() <em>Nombre Caract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreCaract()
	 * @generated
	 * @ordered
	 */
	protected String nombreCaract = NOMBRE_CARACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipoDato() <em>Tipo Dato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoDato()
	 * @generated
	 * @ordered
	 */
	protected static final TipoDato TIPO_DATO_EDEFAULT = TipoDato.INTEGER;

	/**
	 * The cached value of the '{@link #getTipoDato() <em>Tipo Dato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoDato()
	 * @generated
	 * @ordered
	 */
	protected TipoDato tipoDato = TIPO_DATO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEsta_en() <em>Esta en</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEsta_en()
	 * @generated
	 * @ordered
	 */
	protected Entidad esta_en;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaracteristicaEntidadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataWebDeskDSLPackage.Literals.CARACTERISTICA_ENTIDAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombreCaract() {
		return nombreCaract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreCaract(String newNombreCaract) {
		String oldNombreCaract = nombreCaract;
		nombreCaract = newNombreCaract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataWebDeskDSLPackage.CARACTERISTICA_ENTIDAD__NOMBRE_CARACT, oldNombreCaract, nombreCaract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDato getTipoDato() {
		return tipoDato;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoDato(TipoDato newTipoDato) {
		TipoDato oldTipoDato = tipoDato;
		tipoDato = newTipoDato == null ? TIPO_DATO_EDEFAULT : newTipoDato;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataWebDeskDSLPackage.CARACTERISTICA_ENTIDAD__TIPO_DATO, oldTipoDato, tipoDato));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entidad getEsta_en() {
		if (esta_en != null && esta_en.eIsProxy()) {
			InternalEObject oldEsta_en = (InternalEObject)esta_en;
			esta_en = (Entidad)eResolveProxy(oldEsta_en);
			if (esta_en != oldEsta_en) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataWebDeskDSLPackage.CARACTERISTICA_ENTIDAD__ESTA_EN, oldEsta_en, esta_en));
			}
		}
		return esta_en;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entidad basicGetEsta_en() {
		return esta_en;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEsta_en(Entidad newEsta_en, NotificationChain msgs) {
		Entidad oldEsta_en = esta_en;
		esta_en = newEsta_en;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataWebDeskDSLPackage.CARACTERISTICA_ENTIDAD__ESTA_EN, oldEsta_en, newEsta_en);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEsta_en(Entidad newEsta_en) {
		if (newEsta_en != esta_en) {
			NotificationChain msgs = null;
			if (esta_en != null)
				msgs = ((InternalEObject)esta_en).eInverseRemove(this, DataWebDeskDSLPackage.ENTIDAD__CLAVE_PRIMARIA, Entidad.class, msgs);
			if (newEsta_en != null)
				msgs = ((InternalEObject)newEsta_en).eInverseAdd(this, DataWebDeskDSLPackage.ENTIDAD__CLAVE_PRIMARIA, Entidad.class, msgs);
			msgs = basicSetEsta_en(newEsta_en, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataWebDeskDSLPackage.CARACTERISTICA_ENTIDAD__ESTA_EN, newEsta_en, newEsta_en));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataWebDeskDSLPackage.CARACTERISTICA_ENTIDAD__ESTA_EN:
				if (esta_en != null)
					msgs = ((InternalEObject)esta_en).eInverseRemove(this, DataWebDeskDSLPackage.ENTIDAD__CLAVE_PRIMARIA, Entidad.class, msgs);
				return basicSetEsta_en((Entidad)otherEnd, msgs);
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
			case DataWebDeskDSLPackage.CARACTERISTICA_ENTIDAD__ESTA_EN:
				return basicSetEsta_en(null, msgs);
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
			case DataWebDeskDSLPackage.CARACTERISTICA_ENTIDAD__NOMBRE_CARACT:
				return getNombreCaract();
			case DataWebDeskDSLPackage.CARACTERISTICA_ENTIDAD__TIPO_DATO:
				return getTipoDato();
			case DataWebDeskDSLPackage.CARACTERISTICA_ENTIDAD__ESTA_EN:
				if (resolve) return getEsta_en();
				return basicGetEsta_en();
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
			case DataWebDeskDSLPackage.CARACTERISTICA_ENTIDAD__NOMBRE_CARACT:
				setNombreCaract((String)newValue);
				return;
			case DataWebDeskDSLPackage.CARACTERISTICA_ENTIDAD__TIPO_DATO:
				setTipoDato((TipoDato)newValue);
				return;
			case DataWebDeskDSLPackage.CARACTERISTICA_ENTIDAD__ESTA_EN:
				setEsta_en((Entidad)newValue);
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
			case DataWebDeskDSLPackage.CARACTERISTICA_ENTIDAD__NOMBRE_CARACT:
				setNombreCaract(NOMBRE_CARACT_EDEFAULT);
				return;
			case DataWebDeskDSLPackage.CARACTERISTICA_ENTIDAD__TIPO_DATO:
				setTipoDato(TIPO_DATO_EDEFAULT);
				return;
			case DataWebDeskDSLPackage.CARACTERISTICA_ENTIDAD__ESTA_EN:
				setEsta_en((Entidad)null);
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
			case DataWebDeskDSLPackage.CARACTERISTICA_ENTIDAD__NOMBRE_CARACT:
				return NOMBRE_CARACT_EDEFAULT == null ? nombreCaract != null : !NOMBRE_CARACT_EDEFAULT.equals(nombreCaract);
			case DataWebDeskDSLPackage.CARACTERISTICA_ENTIDAD__TIPO_DATO:
				return tipoDato != TIPO_DATO_EDEFAULT;
			case DataWebDeskDSLPackage.CARACTERISTICA_ENTIDAD__ESTA_EN:
				return esta_en != null;
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
		result.append(" (nombreCaract: ");
		result.append(nombreCaract);
		result.append(", tipoDato: ");
		result.append(tipoDato);
		result.append(')');
		return result.toString();
	}

} //CaracteristicaEntidadImpl
