/**
 */
package DataWebDeskDSL.provider;


import DataWebDeskDSL.DataWebDesk;
import DataWebDeskDSL.DataWebDeskDSLFactory;
import DataWebDeskDSL.DataWebDeskDSLPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link DataWebDeskDSL.DataWebDesk} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataWebDeskItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataWebDeskItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNombreAplicacionPropertyDescriptor(object);
			addPaginasMediasAccesiblesD3PropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Nombre Aplicacion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNombreAplicacionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataWebDesk_nombreAplicacion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataWebDesk_nombreAplicacion_feature", "_UI_DataWebDesk_type"),
				 DataWebDeskDSLPackage.Literals.DATA_WEB_DESK__NOMBRE_APLICACION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Paginas Medias Accesibles D3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPaginasMediasAccesiblesD3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataWebDesk_paginasMediasAccesiblesD3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataWebDesk_paginasMediasAccesiblesD3_feature", "_UI_DataWebDesk_type"),
				 DataWebDeskDSLPackage.Literals.DATA_WEB_DESK__PAGINAS_MEDIAS_ACCESIBLES_D3,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DataWebDeskDSLPackage.Literals.DATA_WEB_DESK__PAGINA);
			childrenFeatures.add(DataWebDeskDSLPackage.Literals.DATA_WEB_DESK__ROL);
			childrenFeatures.add(DataWebDeskDSLPackage.Literals.DATA_WEB_DESK__ENTIDAD);
			childrenFeatures.add(DataWebDeskDSLPackage.Literals.DATA_WEB_DESK__REDSOCIAL);
			childrenFeatures.add(DataWebDeskDSLPackage.Literals.DATA_WEB_DESK__URLEXTERNA);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns DataWebDesk.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DataWebDesk"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DataWebDesk)object).getNombreAplicacion();
		return label == null || label.length() == 0 ?
			getString("_UI_DataWebDesk_type") :
			getString("_UI_DataWebDesk_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DataWebDesk.class)) {
			case DataWebDeskDSLPackage.DATA_WEB_DESK__NOMBRE_APLICACION:
			case DataWebDeskDSLPackage.DATA_WEB_DESK__PAGINAS_MEDIAS_ACCESIBLES_D3:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DataWebDeskDSLPackage.DATA_WEB_DESK__PAGINA:
			case DataWebDeskDSLPackage.DATA_WEB_DESK__ROL:
			case DataWebDeskDSLPackage.DATA_WEB_DESK__ENTIDAD:
			case DataWebDeskDSLPackage.DATA_WEB_DESK__REDSOCIAL:
			case DataWebDeskDSLPackage.DATA_WEB_DESK__URLEXTERNA:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DataWebDeskDSLPackage.Literals.DATA_WEB_DESK__PAGINA,
				 DataWebDeskDSLFactory.eINSTANCE.createPaginasNormales()));

		newChildDescriptors.add
			(createChildParameter
				(DataWebDeskDSLPackage.Literals.DATA_WEB_DESK__PAGINA,
				 DataWebDeskDSLFactory.eINSTANCE.createPagCrear()));

		newChildDescriptors.add
			(createChildParameter
				(DataWebDeskDSLPackage.Literals.DATA_WEB_DESK__PAGINA,
				 DataWebDeskDSLFactory.eINSTANCE.createPagLeer()));

		newChildDescriptors.add
			(createChildParameter
				(DataWebDeskDSLPackage.Literals.DATA_WEB_DESK__PAGINA,
				 DataWebDeskDSLFactory.eINSTANCE.createPagBorrar()));

		newChildDescriptors.add
			(createChildParameter
				(DataWebDeskDSLPackage.Literals.DATA_WEB_DESK__PAGINA,
				 DataWebDeskDSLFactory.eINSTANCE.createPagActualizar()));

		newChildDescriptors.add
			(createChildParameter
				(DataWebDeskDSLPackage.Literals.DATA_WEB_DESK__PAGINA,
				 DataWebDeskDSLFactory.eINSTANCE.createPagIndice()));

		newChildDescriptors.add
			(createChildParameter
				(DataWebDeskDSLPackage.Literals.DATA_WEB_DESK__PAGINA,
				 DataWebDeskDSLFactory.eINSTANCE.createCRUD()));

		newChildDescriptors.add
			(createChildParameter
				(DataWebDeskDSLPackage.Literals.DATA_WEB_DESK__PAGINA,
				 DataWebDeskDSLFactory.eINSTANCE.createPaginaPrincipal()));

		newChildDescriptors.add
			(createChildParameter
				(DataWebDeskDSLPackage.Literals.DATA_WEB_DESK__ROL,
				 DataWebDeskDSLFactory.eINSTANCE.createRol()));

		newChildDescriptors.add
			(createChildParameter
				(DataWebDeskDSLPackage.Literals.DATA_WEB_DESK__ENTIDAD,
				 DataWebDeskDSLFactory.eINSTANCE.createEntidad()));

		newChildDescriptors.add
			(createChildParameter
				(DataWebDeskDSLPackage.Literals.DATA_WEB_DESK__REDSOCIAL,
				 DataWebDeskDSLFactory.eINSTANCE.createTwitter()));

		newChildDescriptors.add
			(createChildParameter
				(DataWebDeskDSLPackage.Literals.DATA_WEB_DESK__REDSOCIAL,
				 DataWebDeskDSLFactory.eINSTANCE.createFacebook()));

		newChildDescriptors.add
			(createChildParameter
				(DataWebDeskDSLPackage.Literals.DATA_WEB_DESK__REDSOCIAL,
				 DataWebDeskDSLFactory.eINSTANCE.createRSS()));

		newChildDescriptors.add
			(createChildParameter
				(DataWebDeskDSLPackage.Literals.DATA_WEB_DESK__URLEXTERNA,
				 DataWebDeskDSLFactory.eINSTANCE.createURLExterna()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DataWebDeskDSLEditPlugin.INSTANCE;
	}

}
