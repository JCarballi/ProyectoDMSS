/**
 */
package DataWebDeskDSL.impl;

import DataWebDeskDSL.DataWebDeskDSLPackage;
import DataWebDeskDSL.Pagina;
import DataWebDeskDSL.RedSocial;
import DataWebDeskDSL.tipoContenido;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Red Social</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DataWebDeskDSL.impl.RedSocialImpl#getTipoCont <em>Tipo Cont</em>}</li>
 *   <li>{@link DataWebDeskDSL.impl.RedSocialImpl#getID_RedSocial <em>ID Red Social</em>}</li>
 *   <li>{@link DataWebDeskDSL.impl.RedSocialImpl#getMostrada <em>Mostrada</em>}</li>
 *   <li>{@link DataWebDeskDSL.impl.RedSocialImpl#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RedSocialImpl extends EObjectImpl implements RedSocial {
	/**
	 * The default value of the '{@link #getTipoCont() <em>Tipo Cont</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoCont()
	 * @generated
	 * @ordered
	 */
	protected static final tipoContenido TIPO_CONT_EDEFAULT = tipoContenido.TEXTO;

	/**
	 * The cached value of the '{@link #getTipoCont() <em>Tipo Cont</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoCont()
	 * @generated
	 * @ordered
	 */
	protected tipoContenido tipoCont = TIPO_CONT_EDEFAULT;

	/**
	 * The default value of the '{@link #getID_RedSocial() <em>ID Red Social</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID_RedSocial()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_RED_SOCIAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getID_RedSocial() <em>ID Red Social</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID_RedSocial()
	 * @generated
	 * @ordered
	 */
	protected int iD_RedSocial = ID_RED_SOCIAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMostrada() <em>Mostrada</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMostrada()
	 * @generated
	 * @ordered
	 */
	protected EList<Pagina> mostrada;

	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RedSocialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataWebDeskDSLPackage.Literals.RED_SOCIAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tipoContenido getTipoCont() {
		return tipoCont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoCont(tipoContenido newTipoCont) {
		tipoContenido oldTipoCont = tipoCont;
		tipoCont = newTipoCont == null ? TIPO_CONT_EDEFAULT : newTipoCont;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataWebDeskDSLPackage.RED_SOCIAL__TIPO_CONT, oldTipoCont, tipoCont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getID_RedSocial() {
		return iD_RedSocial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID_RedSocial(int newID_RedSocial) {
		int oldID_RedSocial = iD_RedSocial;
		iD_RedSocial = newID_RedSocial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataWebDeskDSLPackage.RED_SOCIAL__ID_RED_SOCIAL, oldID_RedSocial, iD_RedSocial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pagina> getMostrada() {
		if (mostrada == null) {
			mostrada = new EObjectWithInverseResolvingEList.ManyInverse<Pagina>(Pagina.class, this, DataWebDeskDSLPackage.RED_SOCIAL__MOSTRADA, DataWebDeskDSLPackage.PAGINA__MUESTRA);
		}
		return mostrada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataWebDeskDSLPackage.RED_SOCIAL__NOMBRE, oldNombre, nombre));
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
			case DataWebDeskDSLPackage.RED_SOCIAL__MOSTRADA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMostrada()).basicAdd(otherEnd, msgs);
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
			case DataWebDeskDSLPackage.RED_SOCIAL__MOSTRADA:
				return ((InternalEList<?>)getMostrada()).basicRemove(otherEnd, msgs);
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
			case DataWebDeskDSLPackage.RED_SOCIAL__TIPO_CONT:
				return getTipoCont();
			case DataWebDeskDSLPackage.RED_SOCIAL__ID_RED_SOCIAL:
				return getID_RedSocial();
			case DataWebDeskDSLPackage.RED_SOCIAL__MOSTRADA:
				return getMostrada();
			case DataWebDeskDSLPackage.RED_SOCIAL__NOMBRE:
				return getNombre();
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
			case DataWebDeskDSLPackage.RED_SOCIAL__TIPO_CONT:
				setTipoCont((tipoContenido)newValue);
				return;
			case DataWebDeskDSLPackage.RED_SOCIAL__ID_RED_SOCIAL:
				setID_RedSocial((Integer)newValue);
				return;
			case DataWebDeskDSLPackage.RED_SOCIAL__MOSTRADA:
				getMostrada().clear();
				getMostrada().addAll((Collection<? extends Pagina>)newValue);
				return;
			case DataWebDeskDSLPackage.RED_SOCIAL__NOMBRE:
				setNombre((String)newValue);
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
			case DataWebDeskDSLPackage.RED_SOCIAL__TIPO_CONT:
				setTipoCont(TIPO_CONT_EDEFAULT);
				return;
			case DataWebDeskDSLPackage.RED_SOCIAL__ID_RED_SOCIAL:
				setID_RedSocial(ID_RED_SOCIAL_EDEFAULT);
				return;
			case DataWebDeskDSLPackage.RED_SOCIAL__MOSTRADA:
				getMostrada().clear();
				return;
			case DataWebDeskDSLPackage.RED_SOCIAL__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
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
			case DataWebDeskDSLPackage.RED_SOCIAL__TIPO_CONT:
				return tipoCont != TIPO_CONT_EDEFAULT;
			case DataWebDeskDSLPackage.RED_SOCIAL__ID_RED_SOCIAL:
				return iD_RedSocial != ID_RED_SOCIAL_EDEFAULT;
			case DataWebDeskDSLPackage.RED_SOCIAL__MOSTRADA:
				return mostrada != null && !mostrada.isEmpty();
			case DataWebDeskDSLPackage.RED_SOCIAL__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
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
		result.append(" (TipoCont: ");
		result.append(tipoCont);
		result.append(", ID_RedSocial: ");
		result.append(iD_RedSocial);
		result.append(", nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //RedSocialImpl
