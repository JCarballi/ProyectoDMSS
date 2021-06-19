/**
 */
package DataWebDeskDSL.impl;

import DataWebDeskDSL.DataWebDesk;
import DataWebDeskDSL.DataWebDeskDSLPackage;
import DataWebDeskDSL.Entidad;
import DataWebDeskDSL.Pagina;
import DataWebDeskDSL.RedSocial;
import DataWebDeskDSL.Rol;
import DataWebDeskDSL.URLExterna;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Web Desk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DataWebDeskDSL.impl.DataWebDeskImpl#getPagina <em>Pagina</em>}</li>
 *   <li>{@link DataWebDeskDSL.impl.DataWebDeskImpl#getRol <em>Rol</em>}</li>
 *   <li>{@link DataWebDeskDSL.impl.DataWebDeskImpl#getEntidad <em>Entidad</em>}</li>
 *   <li>{@link DataWebDeskDSL.impl.DataWebDeskImpl#getNombreAplicacion <em>Nombre Aplicacion</em>}</li>
 *   <li>{@link DataWebDeskDSL.impl.DataWebDeskImpl#getPaginasMediasAccesiblesD3 <em>Paginas Medias Accesibles D3</em>}</li>
 *   <li>{@link DataWebDeskDSL.impl.DataWebDeskImpl#getRedsocial <em>Redsocial</em>}</li>
 *   <li>{@link DataWebDeskDSL.impl.DataWebDeskImpl#getUrlexterna <em>Urlexterna</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataWebDeskImpl extends EObjectImpl implements DataWebDesk {
	/**
	 * The cached value of the '{@link #getPagina() <em>Pagina</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPagina()
	 * @generated
	 * @ordered
	 */
	protected EList<Pagina> pagina;

	/**
	 * The cached value of the '{@link #getRol() <em>Rol</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRol()
	 * @generated
	 * @ordered
	 */
	protected EList<Rol> rol;

	/**
	 * The cached value of the '{@link #getEntidad() <em>Entidad</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntidad()
	 * @generated
	 * @ordered
	 */
	protected EList<Entidad> entidad;

	/**
	 * The default value of the '{@link #getNombreAplicacion() <em>Nombre Aplicacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreAplicacion()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_APLICACION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreAplicacion() <em>Nombre Aplicacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreAplicacion()
	 * @generated
	 * @ordered
	 */
	protected String nombreAplicacion = NOMBRE_APLICACION_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getPaginasMediasAccesiblesD3() <em>Paginas Medias Accesibles D3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaginasMediasAccesiblesD3()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PAGINAS_MEDIAS_ACCESIBLES_D3__ESETTING_DELEGATE = ((EStructuralFeature.Internal)DataWebDeskDSLPackage.Literals.DATA_WEB_DESK__PAGINAS_MEDIAS_ACCESIBLES_D3).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getRedsocial() <em>Redsocial</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedsocial()
	 * @generated
	 * @ordered
	 */
	protected EList<RedSocial> redsocial;

	/**
	 * The cached value of the '{@link #getUrlexterna() <em>Urlexterna</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlexterna()
	 * @generated
	 * @ordered
	 */
	protected EList<URLExterna> urlexterna;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataWebDeskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataWebDeskDSLPackage.Literals.DATA_WEB_DESK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pagina> getPagina() {
		if (pagina == null) {
			pagina = new EObjectContainmentEList<Pagina>(Pagina.class, this, DataWebDeskDSLPackage.DATA_WEB_DESK__PAGINA);
		}
		return pagina;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rol> getRol() {
		if (rol == null) {
			rol = new EObjectContainmentEList<Rol>(Rol.class, this, DataWebDeskDSLPackage.DATA_WEB_DESK__ROL);
		}
		return rol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entidad> getEntidad() {
		if (entidad == null) {
			entidad = new EObjectContainmentEList<Entidad>(Entidad.class, this, DataWebDeskDSLPackage.DATA_WEB_DESK__ENTIDAD);
		}
		return entidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombreAplicacion() {
		return nombreAplicacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreAplicacion(String newNombreAplicacion) {
		String oldNombreAplicacion = nombreAplicacion;
		nombreAplicacion = newNombreAplicacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataWebDeskDSLPackage.DATA_WEB_DESK__NOMBRE_APLICACION, oldNombreAplicacion, nombreAplicacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPaginasMediasAccesiblesD3() {
		return (Float)PAGINAS_MEDIAS_ACCESIBLES_D3__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaginasMediasAccesiblesD3(float newPaginasMediasAccesiblesD3) {
		PAGINAS_MEDIAS_ACCESIBLES_D3__ESETTING_DELEGATE.dynamicSet(this, null, 0, newPaginasMediasAccesiblesD3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RedSocial> getRedsocial() {
		if (redsocial == null) {
			redsocial = new EObjectContainmentEList<RedSocial>(RedSocial.class, this, DataWebDeskDSLPackage.DATA_WEB_DESK__REDSOCIAL);
		}
		return redsocial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<URLExterna> getUrlexterna() {
		if (urlexterna == null) {
			urlexterna = new EObjectContainmentEList<URLExterna>(URLExterna.class, this, DataWebDeskDSLPackage.DATA_WEB_DESK__URLEXTERNA);
		}
		return urlexterna;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataWebDeskDSLPackage.DATA_WEB_DESK__PAGINA:
				return ((InternalEList<?>)getPagina()).basicRemove(otherEnd, msgs);
			case DataWebDeskDSLPackage.DATA_WEB_DESK__ROL:
				return ((InternalEList<?>)getRol()).basicRemove(otherEnd, msgs);
			case DataWebDeskDSLPackage.DATA_WEB_DESK__ENTIDAD:
				return ((InternalEList<?>)getEntidad()).basicRemove(otherEnd, msgs);
			case DataWebDeskDSLPackage.DATA_WEB_DESK__REDSOCIAL:
				return ((InternalEList<?>)getRedsocial()).basicRemove(otherEnd, msgs);
			case DataWebDeskDSLPackage.DATA_WEB_DESK__URLEXTERNA:
				return ((InternalEList<?>)getUrlexterna()).basicRemove(otherEnd, msgs);
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
			case DataWebDeskDSLPackage.DATA_WEB_DESK__PAGINA:
				return getPagina();
			case DataWebDeskDSLPackage.DATA_WEB_DESK__ROL:
				return getRol();
			case DataWebDeskDSLPackage.DATA_WEB_DESK__ENTIDAD:
				return getEntidad();
			case DataWebDeskDSLPackage.DATA_WEB_DESK__NOMBRE_APLICACION:
				return getNombreAplicacion();
			case DataWebDeskDSLPackage.DATA_WEB_DESK__PAGINAS_MEDIAS_ACCESIBLES_D3:
				return getPaginasMediasAccesiblesD3();
			case DataWebDeskDSLPackage.DATA_WEB_DESK__REDSOCIAL:
				return getRedsocial();
			case DataWebDeskDSLPackage.DATA_WEB_DESK__URLEXTERNA:
				return getUrlexterna();
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
			case DataWebDeskDSLPackage.DATA_WEB_DESK__PAGINA:
				getPagina().clear();
				getPagina().addAll((Collection<? extends Pagina>)newValue);
				return;
			case DataWebDeskDSLPackage.DATA_WEB_DESK__ROL:
				getRol().clear();
				getRol().addAll((Collection<? extends Rol>)newValue);
				return;
			case DataWebDeskDSLPackage.DATA_WEB_DESK__ENTIDAD:
				getEntidad().clear();
				getEntidad().addAll((Collection<? extends Entidad>)newValue);
				return;
			case DataWebDeskDSLPackage.DATA_WEB_DESK__NOMBRE_APLICACION:
				setNombreAplicacion((String)newValue);
				return;
			case DataWebDeskDSLPackage.DATA_WEB_DESK__PAGINAS_MEDIAS_ACCESIBLES_D3:
				setPaginasMediasAccesiblesD3((Float)newValue);
				return;
			case DataWebDeskDSLPackage.DATA_WEB_DESK__REDSOCIAL:
				getRedsocial().clear();
				getRedsocial().addAll((Collection<? extends RedSocial>)newValue);
				return;
			case DataWebDeskDSLPackage.DATA_WEB_DESK__URLEXTERNA:
				getUrlexterna().clear();
				getUrlexterna().addAll((Collection<? extends URLExterna>)newValue);
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
			case DataWebDeskDSLPackage.DATA_WEB_DESK__PAGINA:
				getPagina().clear();
				return;
			case DataWebDeskDSLPackage.DATA_WEB_DESK__ROL:
				getRol().clear();
				return;
			case DataWebDeskDSLPackage.DATA_WEB_DESK__ENTIDAD:
				getEntidad().clear();
				return;
			case DataWebDeskDSLPackage.DATA_WEB_DESK__NOMBRE_APLICACION:
				setNombreAplicacion(NOMBRE_APLICACION_EDEFAULT);
				return;
			case DataWebDeskDSLPackage.DATA_WEB_DESK__PAGINAS_MEDIAS_ACCESIBLES_D3:
				PAGINAS_MEDIAS_ACCESIBLES_D3__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case DataWebDeskDSLPackage.DATA_WEB_DESK__REDSOCIAL:
				getRedsocial().clear();
				return;
			case DataWebDeskDSLPackage.DATA_WEB_DESK__URLEXTERNA:
				getUrlexterna().clear();
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
			case DataWebDeskDSLPackage.DATA_WEB_DESK__PAGINA:
				return pagina != null && !pagina.isEmpty();
			case DataWebDeskDSLPackage.DATA_WEB_DESK__ROL:
				return rol != null && !rol.isEmpty();
			case DataWebDeskDSLPackage.DATA_WEB_DESK__ENTIDAD:
				return entidad != null && !entidad.isEmpty();
			case DataWebDeskDSLPackage.DATA_WEB_DESK__NOMBRE_APLICACION:
				return NOMBRE_APLICACION_EDEFAULT == null ? nombreAplicacion != null : !NOMBRE_APLICACION_EDEFAULT.equals(nombreAplicacion);
			case DataWebDeskDSLPackage.DATA_WEB_DESK__PAGINAS_MEDIAS_ACCESIBLES_D3:
				return PAGINAS_MEDIAS_ACCESIBLES_D3__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case DataWebDeskDSLPackage.DATA_WEB_DESK__REDSOCIAL:
				return redsocial != null && !redsocial.isEmpty();
			case DataWebDeskDSLPackage.DATA_WEB_DESK__URLEXTERNA:
				return urlexterna != null && !urlexterna.isEmpty();
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
		result.append(" (nombreAplicacion: ");
		result.append(nombreAplicacion);
		result.append(')');
		return result.toString();
	}

} //DataWebDeskImpl
