/*
 * 
 */
package DataWebDeskDSL.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = DataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			DataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
