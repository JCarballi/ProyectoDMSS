/*
* 
*/
package DataWebDeskDSL.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class DataWebDeskDSLNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7003;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7002;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem) {
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem item = (DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
