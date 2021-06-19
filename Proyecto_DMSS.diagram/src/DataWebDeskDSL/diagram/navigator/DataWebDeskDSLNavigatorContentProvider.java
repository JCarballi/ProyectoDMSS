/*
* 
*/
package DataWebDeskDSL.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class DataWebDeskDSLNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public DataWebDeskDSLNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem> result = new ArrayList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, DataWebDeskDSL.diagram.edit.parts.DataWebDeskEditPart.MODEL_ID), file,
					false));
			return result.toArray();
		}

		if (parentElement instanceof DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup) {
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup group = (DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem) {
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem navigatorItem = (DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		* Due to plugin.xml restrictions this code will be called only for views representing
		* shortcuts to this diagram elements created on other diagrams. 
		*/
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement).getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getVisualID(view)) {

		case DataWebDeskDSL.diagram.edit.parts.DataWebDeskEditPart.VISUAL_ID: {
			LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup links = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_DataWebDesk_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PagCrearEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PagLeerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PagBorrarEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PagActualizarEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PagIndiceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.CRUDEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PaginasNormalesEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PaginaPrincipalEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.TwitterEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.FacebookEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.RSSEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.RolEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.EntidadEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.URLExternaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PaginaAccedeEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.EntidadAsociadaEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.EntidadClave_primariaEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.EntidadRelacionadaEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.RolTiene_accesoEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.RedSocialMostradaEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.URLExternaPaginaEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case DataWebDeskDSL.diagram.edit.parts.PagCrearEditPart.VISUAL_ID: {
			LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup incominglinks = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_PagCrear_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup outgoinglinks = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_PagCrear_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PaginaAccedeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PaginaAccedeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.EntidadAsociadaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.RolTiene_accesoEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.RedSocialMostradaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.URLExternaPaginaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataWebDeskDSL.diagram.edit.parts.PagLeerEditPart.VISUAL_ID: {
			LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup incominglinks = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_PagLeer_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup outgoinglinks = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_PagLeer_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PaginaAccedeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PaginaAccedeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.EntidadAsociadaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.RolTiene_accesoEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.RedSocialMostradaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.URLExternaPaginaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataWebDeskDSL.diagram.edit.parts.PagBorrarEditPart.VISUAL_ID: {
			LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup incominglinks = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_PagBorrar_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup outgoinglinks = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_PagBorrar_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PaginaAccedeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PaginaAccedeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.EntidadAsociadaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.RolTiene_accesoEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.RedSocialMostradaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.URLExternaPaginaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataWebDeskDSL.diagram.edit.parts.PagActualizarEditPart.VISUAL_ID: {
			LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup incominglinks = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_PagActualizar_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup outgoinglinks = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_PagActualizar_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PaginaAccedeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PaginaAccedeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.EntidadAsociadaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.RolTiene_accesoEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.RedSocialMostradaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.URLExternaPaginaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataWebDeskDSL.diagram.edit.parts.PagIndiceEditPart.VISUAL_ID: {
			LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup incominglinks = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_PagIndice_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup outgoinglinks = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_PagIndice_2005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PaginaAccedeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PaginaAccedeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.EntidadAsociadaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.RolTiene_accesoEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.RedSocialMostradaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.URLExternaPaginaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataWebDeskDSL.diagram.edit.parts.CRUDEditPart.VISUAL_ID: {
			LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup incominglinks = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_CRUD_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup outgoinglinks = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_CRUD_2006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PaginaAccedeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PaginaAccedeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.EntidadAsociadaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.RolTiene_accesoEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.RedSocialMostradaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.URLExternaPaginaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataWebDeskDSL.diagram.edit.parts.PaginasNormalesEditPart.VISUAL_ID: {
			LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup incominglinks = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_PaginasNormales_2007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup outgoinglinks = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_PaginasNormales_2007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PaginaAccedeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PaginaAccedeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.RolTiene_accesoEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.RedSocialMostradaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.URLExternaPaginaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataWebDeskDSL.diagram.edit.parts.PaginaPrincipalEditPart.VISUAL_ID: {
			LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup incominglinks = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_PaginaPrincipal_2008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup outgoinglinks = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_PaginaPrincipal_2008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PaginaAccedeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PaginaAccedeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.RolTiene_accesoEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.RedSocialMostradaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.URLExternaPaginaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataWebDeskDSL.diagram.edit.parts.TwitterEditPart.VISUAL_ID: {
			LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup outgoinglinks = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_Twitter_2009_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.RedSocialMostradaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataWebDeskDSL.diagram.edit.parts.FacebookEditPart.VISUAL_ID: {
			LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup outgoinglinks = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_Facebook_2010_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.RedSocialMostradaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataWebDeskDSL.diagram.edit.parts.RSSEditPart.VISUAL_ID: {
			LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup outgoinglinks = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_RSS_2011_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.RedSocialMostradaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataWebDeskDSL.diagram.edit.parts.RolEditPart.VISUAL_ID: {
			LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup outgoinglinks = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_Rol_2012_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.RolTiene_accesoEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataWebDeskDSL.diagram.edit.parts.EntidadEditPart.VISUAL_ID: {
			LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup outgoinglinks = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_Entidad_2013_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup incominglinks = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_Entidad_2013_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							DataWebDeskDSL.diagram.edit.parts.EntidadEntidadCaracteristicaCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.CaracteristicaEntidadEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.EntidadAsociadaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.EntidadClave_primariaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.EntidadRelacionadaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.EntidadRelacionadaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case DataWebDeskDSL.diagram.edit.parts.URLExternaEditPart.VISUAL_ID: {
			LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup outgoinglinks = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_URLExterna_2014_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.URLExternaPaginaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataWebDeskDSL.diagram.edit.parts.CaracteristicaEntidadEditPart.VISUAL_ID: {
			LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Node sv = (Node) view;
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup incominglinks = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_CaracteristicaEntidad_3001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.EntidadClave_primariaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case DataWebDeskDSL.diagram.edit.parts.PaginaAccedeEditPart.VISUAL_ID: {
			LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup target = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_PaginaAccede_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup source = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_PaginaAccede_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PagCrearEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PagLeerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PagBorrarEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PagActualizarEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PagIndiceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.CRUDEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PaginasNormalesEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PaginaPrincipalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PagCrearEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PagLeerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PagBorrarEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PagActualizarEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PagIndiceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.CRUDEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PaginasNormalesEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PaginaPrincipalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case DataWebDeskDSL.diagram.edit.parts.EntidadAsociadaEditPart.VISUAL_ID: {
			LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup target = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_EntidadAsociada_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup source = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_EntidadAsociada_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PagCrearEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PagLeerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PagBorrarEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PagActualizarEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PagIndiceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.CRUDEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.EntidadEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case DataWebDeskDSL.diagram.edit.parts.EntidadClave_primariaEditPart.VISUAL_ID: {
			LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup target = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_EntidadClave_primaria_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup source = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_EntidadClave_primaria_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.CaracteristicaEntidadEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.EntidadEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case DataWebDeskDSL.diagram.edit.parts.EntidadRelacionadaEditPart.VISUAL_ID: {
			LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup target = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_EntidadRelacionada_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup source = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_EntidadRelacionada_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.EntidadEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.EntidadEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case DataWebDeskDSL.diagram.edit.parts.RolTiene_accesoEditPart.VISUAL_ID: {
			LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup target = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_RolTiene_acceso_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup source = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_RolTiene_acceso_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PagCrearEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PagLeerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PagBorrarEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PagActualizarEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PagIndiceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.CRUDEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PaginasNormalesEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PaginaPrincipalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.RolEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case DataWebDeskDSL.diagram.edit.parts.RedSocialMostradaEditPart.VISUAL_ID: {
			LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup target = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_RedSocialMostrada_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup source = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_RedSocialMostrada_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PagCrearEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PagLeerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PagBorrarEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PagActualizarEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PagIndiceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.CRUDEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PaginasNormalesEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PaginaPrincipalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.TwitterEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.FacebookEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.RSSEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case DataWebDeskDSL.diagram.edit.parts.URLExternaPaginaEditPart.VISUAL_ID: {
			LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup target = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_URLExternaPagina_4007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup source = new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					DataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_URLExternaPagina_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PagCrearEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PagLeerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PagBorrarEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PagActualizarEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PagIndiceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.CRUDEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PaginasNormalesEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.PaginaPrincipalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(DataWebDeskDSL.diagram.edit.parts.URLExternaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return DataWebDeskDSL.diagram.edit.parts.DataWebDeskEditPart.MODEL_ID
				.equals(DataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem> result = new ArrayList<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<DataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem> getForeignShortcuts(
			Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView) && nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem) {
			DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem abstractNavigatorItem = (DataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
