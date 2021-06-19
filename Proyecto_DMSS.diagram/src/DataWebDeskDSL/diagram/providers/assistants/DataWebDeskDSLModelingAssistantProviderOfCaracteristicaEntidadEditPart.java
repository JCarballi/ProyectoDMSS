/*
 * 
 */
package DataWebDeskDSL.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class DataWebDeskDSLModelingAssistantProviderOfCaracteristicaEntidadEditPart
		extends DataWebDeskDSL.diagram.providers.DataWebDeskDSLModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((DataWebDeskDSL.diagram.edit.parts.CaracteristicaEntidadEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(
			DataWebDeskDSL.diagram.edit.parts.CaracteristicaEntidadEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntidadClave_primaria_4003);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((DataWebDeskDSL.diagram.edit.parts.CaracteristicaEntidadEditPart) targetEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(
			DataWebDeskDSL.diagram.edit.parts.CaracteristicaEntidadEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntidadClave_primaria_4003) {
			types.add(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Entidad_2013);
		}
		return types;
	}

}
