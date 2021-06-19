/*
 * 
 */
package DataWebDeskDSL.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	* @generated
	*/
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		DataWebDeskDSL.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		DataWebDeskDSL.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		DataWebDeskDSL.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		DataWebDeskDSL.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		DataWebDeskDSL.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return DataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
