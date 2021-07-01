/**
 */
package DataWebDeskDSL.impl;

import DataWebDeskDSL.DataWebDeskDSLPackage;
import DataWebDeskDSL.Pagina;
import DataWebDeskDSL.URLExterna;

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
 * An implementation of the model object '<em><b>URL Externa</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DataWebDeskDSL.impl.URLExternaImpl#getPagina <em>Pagina</em>}</li>
 *   <li>{@link DataWebDeskDSL.impl.URLExternaImpl#getLink <em>Link</em>}</li>
 *   <li>{@link DataWebDeskDSL.impl.URLExternaImpl#getNombreWeb <em>Nombre Web</em>}</li>
 * </ul>
 *
 * @generated
 */
public class URLExternaImpl extends EObjectImpl implements URLExterna {
	/**
	 * The cached value of the '{@link #getPagina() <em>Pagina</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPagina()
	 * @generated
	 * @ordered
	 */
	protected EList<Pagina> pagina;

	/**
	 * The default value of the '{@link #getLink() <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected String link = LINK_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombreWeb() <em>Nombre Web</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreWeb()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_WEB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreWeb() <em>Nombre Web</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreWeb()
	 * @generated
	 * @ordered
	 */
	protected String nombreWeb = NOMBRE_WEB_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected URLExternaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataWebDeskDSLPackage.Literals.URL_EXTERNA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pagina> getPagina() {
		if (pagina == null) {
			pagina = new EObjectWithInverseResolvingEList.ManyInverse<Pagina>(Pagina.class, this, DataWebDeskDSLPackage.URL_EXTERNA__PAGINA, DataWebDeskDSLPackage.PAGINA__URLEXTERNA);
		}
		return pagina;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLink() {
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink(String newLink) {
		String oldLink = link;
		link = newLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataWebDeskDSLPackage.URL_EXTERNA__LINK, oldLink, link));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombreWeb() {
		return nombreWeb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreWeb(String newNombreWeb) {
		String oldNombreWeb = nombreWeb;
		nombreWeb = newNombreWeb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataWebDeskDSLPackage.URL_EXTERNA__NOMBRE_WEB, oldNombreWeb, nombreWeb));
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
			case DataWebDeskDSLPackage.URL_EXTERNA__PAGINA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPagina()).basicAdd(otherEnd, msgs);
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
			case DataWebDeskDSLPackage.URL_EXTERNA__PAGINA:
				return ((InternalEList<?>)getPagina()).basicRemove(otherEnd, msgs);
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
			case DataWebDeskDSLPackage.URL_EXTERNA__PAGINA:
				return getPagina();
			case DataWebDeskDSLPackage.URL_EXTERNA__LINK:
				return getLink();
			case DataWebDeskDSLPackage.URL_EXTERNA__NOMBRE_WEB:
				return getNombreWeb();
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
			case DataWebDeskDSLPackage.URL_EXTERNA__PAGINA:
				getPagina().clear();
				getPagina().addAll((Collection<? extends Pagina>)newValue);
				return;
			case DataWebDeskDSLPackage.URL_EXTERNA__LINK:
				setLink((String)newValue);
				return;
			case DataWebDeskDSLPackage.URL_EXTERNA__NOMBRE_WEB:
				setNombreWeb((String)newValue);
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
			case DataWebDeskDSLPackage.URL_EXTERNA__PAGINA:
				getPagina().clear();
				return;
			case DataWebDeskDSLPackage.URL_EXTERNA__LINK:
				setLink(LINK_EDEFAULT);
				return;
			case DataWebDeskDSLPackage.URL_EXTERNA__NOMBRE_WEB:
				setNombreWeb(NOMBRE_WEB_EDEFAULT);
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
			case DataWebDeskDSLPackage.URL_EXTERNA__PAGINA:
				return pagina != null && !pagina.isEmpty();
			case DataWebDeskDSLPackage.URL_EXTERNA__LINK:
				return LINK_EDEFAULT == null ? link != null : !LINK_EDEFAULT.equals(link);
			case DataWebDeskDSLPackage.URL_EXTERNA__NOMBRE_WEB:
				return NOMBRE_WEB_EDEFAULT == null ? nombreWeb != null : !NOMBRE_WEB_EDEFAULT.equals(nombreWeb);
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
		result.append(" (link: ");
		result.append(link);
		result.append(", nombreWeb: ");
		result.append(nombreWeb);
		result.append(')');
		return result.toString();
	}

} //URLExternaImpl
