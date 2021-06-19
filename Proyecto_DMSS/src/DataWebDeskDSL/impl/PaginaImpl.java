/**
 */
package DataWebDeskDSL.impl;

import DataWebDeskDSL.DataWebDeskDSLPackage;
import DataWebDeskDSL.Pagina;
import DataWebDeskDSL.RedSocial;
import DataWebDeskDSL.Rol;
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
 * An implementation of the model object '<em><b>Pagina</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DataWebDeskDSL.impl.PaginaImpl#getAccedida <em>Accedida</em>}</li>
 *   <li>{@link DataWebDeskDSL.impl.PaginaImpl#getAccede <em>Accede</em>}</li>
 *   <li>{@link DataWebDeskDSL.impl.PaginaImpl#getTituloPag <em>Titulo Pag</em>}</li>
 *   <li>{@link DataWebDeskDSL.impl.PaginaImpl#getUrlexterna <em>Urlexterna</em>}</li>
 *   <li>{@link DataWebDeskDSL.impl.PaginaImpl#getMuestra <em>Muestra</em>}</li>
 *   <li>{@link DataWebDeskDSL.impl.PaginaImpl#getAccedida_por <em>Accedida por</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PaginaImpl extends EObjectImpl implements Pagina {
	/**
	 * The cached value of the '{@link #getAccedida() <em>Accedida</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccedida()
	 * @generated
	 * @ordered
	 */
	protected EList<Pagina> accedida;

	/**
	 * The cached value of the '{@link #getAccede() <em>Accede</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccede()
	 * @generated
	 * @ordered
	 */
	protected EList<Pagina> accede;

	/**
	 * The default value of the '{@link #getTituloPag() <em>Titulo Pag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTituloPag()
	 * @generated
	 * @ordered
	 */
	protected static final String TITULO_PAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTituloPag() <em>Titulo Pag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTituloPag()
	 * @generated
	 * @ordered
	 */
	protected String tituloPag = TITULO_PAG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUrlexterna() <em>Urlexterna</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlexterna()
	 * @generated
	 * @ordered
	 */
	protected EList<URLExterna> urlexterna;

	/**
	 * The cached value of the '{@link #getMuestra() <em>Muestra</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMuestra()
	 * @generated
	 * @ordered
	 */
	protected EList<RedSocial> muestra;

	/**
	 * The cached value of the '{@link #getAccedida_por() <em>Accedida por</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccedida_por()
	 * @generated
	 * @ordered
	 */
	protected EList<Rol> accedida_por;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaginaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataWebDeskDSLPackage.Literals.PAGINA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pagina> getAccedida() {
		if (accedida == null) {
			accedida = new EObjectWithInverseResolvingEList.ManyInverse<Pagina>(Pagina.class, this, DataWebDeskDSLPackage.PAGINA__ACCEDIDA, DataWebDeskDSLPackage.PAGINA__ACCEDE);
		}
		return accedida;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pagina> getAccede() {
		if (accede == null) {
			accede = new EObjectWithInverseResolvingEList.ManyInverse<Pagina>(Pagina.class, this, DataWebDeskDSLPackage.PAGINA__ACCEDE, DataWebDeskDSLPackage.PAGINA__ACCEDIDA);
		}
		return accede;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTituloPag() {
		return tituloPag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTituloPag(String newTituloPag) {
		String oldTituloPag = tituloPag;
		tituloPag = newTituloPag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataWebDeskDSLPackage.PAGINA__TITULO_PAG, oldTituloPag, tituloPag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<URLExterna> getUrlexterna() {
		if (urlexterna == null) {
			urlexterna = new EObjectWithInverseResolvingEList.ManyInverse<URLExterna>(URLExterna.class, this, DataWebDeskDSLPackage.PAGINA__URLEXTERNA, DataWebDeskDSLPackage.URL_EXTERNA__PAGINA);
		}
		return urlexterna;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RedSocial> getMuestra() {
		if (muestra == null) {
			muestra = new EObjectWithInverseResolvingEList.ManyInverse<RedSocial>(RedSocial.class, this, DataWebDeskDSLPackage.PAGINA__MUESTRA, DataWebDeskDSLPackage.RED_SOCIAL__MOSTRADA);
		}
		return muestra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rol> getAccedida_por() {
		if (accedida_por == null) {
			accedida_por = new EObjectWithInverseResolvingEList.ManyInverse<Rol>(Rol.class, this, DataWebDeskDSLPackage.PAGINA__ACCEDIDA_POR, DataWebDeskDSLPackage.ROL__TIENE_ACCESO);
		}
		return accedida_por;
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
			case DataWebDeskDSLPackage.PAGINA__ACCEDIDA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAccedida()).basicAdd(otherEnd, msgs);
			case DataWebDeskDSLPackage.PAGINA__ACCEDE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAccede()).basicAdd(otherEnd, msgs);
			case DataWebDeskDSLPackage.PAGINA__URLEXTERNA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUrlexterna()).basicAdd(otherEnd, msgs);
			case DataWebDeskDSLPackage.PAGINA__MUESTRA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMuestra()).basicAdd(otherEnd, msgs);
			case DataWebDeskDSLPackage.PAGINA__ACCEDIDA_POR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAccedida_por()).basicAdd(otherEnd, msgs);
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
			case DataWebDeskDSLPackage.PAGINA__ACCEDIDA:
				return ((InternalEList<?>)getAccedida()).basicRemove(otherEnd, msgs);
			case DataWebDeskDSLPackage.PAGINA__ACCEDE:
				return ((InternalEList<?>)getAccede()).basicRemove(otherEnd, msgs);
			case DataWebDeskDSLPackage.PAGINA__URLEXTERNA:
				return ((InternalEList<?>)getUrlexterna()).basicRemove(otherEnd, msgs);
			case DataWebDeskDSLPackage.PAGINA__MUESTRA:
				return ((InternalEList<?>)getMuestra()).basicRemove(otherEnd, msgs);
			case DataWebDeskDSLPackage.PAGINA__ACCEDIDA_POR:
				return ((InternalEList<?>)getAccedida_por()).basicRemove(otherEnd, msgs);
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
			case DataWebDeskDSLPackage.PAGINA__ACCEDIDA:
				return getAccedida();
			case DataWebDeskDSLPackage.PAGINA__ACCEDE:
				return getAccede();
			case DataWebDeskDSLPackage.PAGINA__TITULO_PAG:
				return getTituloPag();
			case DataWebDeskDSLPackage.PAGINA__URLEXTERNA:
				return getUrlexterna();
			case DataWebDeskDSLPackage.PAGINA__MUESTRA:
				return getMuestra();
			case DataWebDeskDSLPackage.PAGINA__ACCEDIDA_POR:
				return getAccedida_por();
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
			case DataWebDeskDSLPackage.PAGINA__ACCEDIDA:
				getAccedida().clear();
				getAccedida().addAll((Collection<? extends Pagina>)newValue);
				return;
			case DataWebDeskDSLPackage.PAGINA__ACCEDE:
				getAccede().clear();
				getAccede().addAll((Collection<? extends Pagina>)newValue);
				return;
			case DataWebDeskDSLPackage.PAGINA__TITULO_PAG:
				setTituloPag((String)newValue);
				return;
			case DataWebDeskDSLPackage.PAGINA__URLEXTERNA:
				getUrlexterna().clear();
				getUrlexterna().addAll((Collection<? extends URLExterna>)newValue);
				return;
			case DataWebDeskDSLPackage.PAGINA__MUESTRA:
				getMuestra().clear();
				getMuestra().addAll((Collection<? extends RedSocial>)newValue);
				return;
			case DataWebDeskDSLPackage.PAGINA__ACCEDIDA_POR:
				getAccedida_por().clear();
				getAccedida_por().addAll((Collection<? extends Rol>)newValue);
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
			case DataWebDeskDSLPackage.PAGINA__ACCEDIDA:
				getAccedida().clear();
				return;
			case DataWebDeskDSLPackage.PAGINA__ACCEDE:
				getAccede().clear();
				return;
			case DataWebDeskDSLPackage.PAGINA__TITULO_PAG:
				setTituloPag(TITULO_PAG_EDEFAULT);
				return;
			case DataWebDeskDSLPackage.PAGINA__URLEXTERNA:
				getUrlexterna().clear();
				return;
			case DataWebDeskDSLPackage.PAGINA__MUESTRA:
				getMuestra().clear();
				return;
			case DataWebDeskDSLPackage.PAGINA__ACCEDIDA_POR:
				getAccedida_por().clear();
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
			case DataWebDeskDSLPackage.PAGINA__ACCEDIDA:
				return accedida != null && !accedida.isEmpty();
			case DataWebDeskDSLPackage.PAGINA__ACCEDE:
				return accede != null && !accede.isEmpty();
			case DataWebDeskDSLPackage.PAGINA__TITULO_PAG:
				return TITULO_PAG_EDEFAULT == null ? tituloPag != null : !TITULO_PAG_EDEFAULT.equals(tituloPag);
			case DataWebDeskDSLPackage.PAGINA__URLEXTERNA:
				return urlexterna != null && !urlexterna.isEmpty();
			case DataWebDeskDSLPackage.PAGINA__MUESTRA:
				return muestra != null && !muestra.isEmpty();
			case DataWebDeskDSLPackage.PAGINA__ACCEDIDA_POR:
				return accedida_por != null && !accedida_por.isEmpty();
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
		result.append(" (TituloPag: ");
		result.append(tituloPag);
		result.append(')');
		return result.toString();
	}

} //PaginaImpl
