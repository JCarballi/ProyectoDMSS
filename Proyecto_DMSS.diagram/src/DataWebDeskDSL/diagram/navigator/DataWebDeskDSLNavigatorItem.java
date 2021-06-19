/*
* 
*/
package DataWebDeskDSL.diagram.navigator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class DataWebDeskDSLNavigatorItem extends DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem {

	/**
	* @generated
	*/
	static {
		final Class[] supportedTypes = new Class[] { View.class, EObject.class };
		Platform.getAdapterManager().registerAdapters(new IAdapterFactory() {

			public Object getAdapter(Object adaptableObject, Class adapterType) {
				if (adaptableObject instanceof DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem
						&& (adapterType == View.class || adapterType == EObject.class)) {
					return ((DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem) adaptableObject).getView();
				}
				return null;
			}

			public Class[] getAdapterList() {
				return supportedTypes;
			}
		}, DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem.class);
	}

	/**
	* @generated
	*/
	private View myView;

	/**
	* @generated
	*/
	private boolean myLeaf = false;

	/**
	* @generated
	*/
	public DataWebDeskDSLNavigatorItem(View view, Object parent, boolean isLeaf) {
		super(parent);
		myView = view;
		myLeaf = isLeaf;
	}

	/**
	* @generated
	*/
	public View getView() {
		return myView;
	}

	/**
	* @generated
	*/
	public boolean isLeaf() {
		return myLeaf;
	}

	/**
	* @generated
	*/
	public boolean equals(Object obj) {
		if (obj instanceof DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem) {
			return EcoreUtil.getURI(getView()).equals(
					EcoreUtil.getURI(((DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem) obj).getView()));
		}
		return super.equals(obj);
	}

	/**
	* @generated
	*/
	public int hashCode() {
		return EcoreUtil.getURI(getView()).hashCode();
	}

}
