
/*
 * 
 */
package DataWebDeskDSL.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class DataWebDeskDSLPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(DataWebDeskDSL.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createCRUD1CreationTool());
		paletteContainer.add(createCaracteristicaEntidad2CreationTool());
		paletteContainer.add(createEntidad3CreationTool());
		paletteContainer.add(createFacebook4CreationTool());
		paletteContainer.add(createPagActualizar5CreationTool());
		paletteContainer.add(createPagBorrar6CreationTool());
		paletteContainer.add(createPagCrear7CreationTool());
		paletteContainer.add(createPagIndice8CreationTool());
		paletteContainer.add(createPagLeer9CreationTool());
		paletteContainer.add(createPaginaPrincipal10CreationTool());
		paletteContainer.add(createPaginasNormales11CreationTool());
		paletteContainer.add(createRSS12CreationTool());
		paletteContainer.add(createRol13CreationTool());
		paletteContainer.add(createTwitter14CreationTool());
		paletteContainer.add(createURLExterna15CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				DataWebDeskDSL.diagram.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createAccede1CreationTool());
		paletteContainer.add(createAsociada2CreationTool());
		paletteContainer.add(createClave_primaria3CreationTool());
		paletteContainer.add(createMostrada4CreationTool());
		paletteContainer.add(createPagina5CreationTool());
		paletteContainer.add(createRelacionada6CreationTool());
		paletteContainer.add(createTiene_acceso7CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createCRUD1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataWebDeskDSL.diagram.part.Messages.CRUD1CreationTool_title,
				DataWebDeskDSL.diagram.part.Messages.CRUD1CreationTool_desc,
				Collections.singletonList(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.CRUD_2006));
		entry.setId("createCRUD1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.CRUD_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCaracteristicaEntidad2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataWebDeskDSL.diagram.part.Messages.CaracteristicaEntidad2CreationTool_title,
				DataWebDeskDSL.diagram.part.Messages.CaracteristicaEntidad2CreationTool_desc, Collections.singletonList(
						DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.CaracteristicaEntidad_3001));
		entry.setId("createCaracteristicaEntidad2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.getImageDescriptor(
				DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.CaracteristicaEntidad_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEntidad3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataWebDeskDSL.diagram.part.Messages.Entidad3CreationTool_title,
				DataWebDeskDSL.diagram.part.Messages.Entidad3CreationTool_desc,
				Collections.singletonList(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Entidad_2013));
		entry.setId("createEntidad3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Entidad_2013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFacebook4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataWebDeskDSL.diagram.part.Messages.Facebook4CreationTool_title,
				DataWebDeskDSL.diagram.part.Messages.Facebook4CreationTool_desc,
				Collections.singletonList(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Facebook_2010));
		entry.setId("createFacebook4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Facebook_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPagActualizar5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataWebDeskDSL.diagram.part.Messages.PagActualizar5CreationTool_title,
				DataWebDeskDSL.diagram.part.Messages.PagActualizar5CreationTool_desc, Collections
						.singletonList(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagActualizar_2004));
		entry.setId("createPagActualizar5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagActualizar_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPagBorrar6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataWebDeskDSL.diagram.part.Messages.PagBorrar6CreationTool_title,
				DataWebDeskDSL.diagram.part.Messages.PagBorrar6CreationTool_desc,
				Collections.singletonList(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagBorrar_2003));
		entry.setId("createPagBorrar6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagBorrar_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPagCrear7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataWebDeskDSL.diagram.part.Messages.PagCrear7CreationTool_title,
				DataWebDeskDSL.diagram.part.Messages.PagCrear7CreationTool_desc,
				Collections.singletonList(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagCrear_2001));
		entry.setId("createPagCrear7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagCrear_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPagIndice8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataWebDeskDSL.diagram.part.Messages.PagIndice8CreationTool_title,
				DataWebDeskDSL.diagram.part.Messages.PagIndice8CreationTool_desc,
				Collections.singletonList(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagIndice_2005));
		entry.setId("createPagIndice8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagIndice_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPagLeer9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataWebDeskDSL.diagram.part.Messages.PagLeer9CreationTool_title,
				DataWebDeskDSL.diagram.part.Messages.PagLeer9CreationTool_desc,
				Collections.singletonList(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagLeer_2002));
		entry.setId("createPagLeer9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagLeer_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPaginaPrincipal10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataWebDeskDSL.diagram.part.Messages.PaginaPrincipal10CreationTool_title,
				DataWebDeskDSL.diagram.part.Messages.PaginaPrincipal10CreationTool_desc, Collections.singletonList(
						DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PaginaPrincipal_2008));
		entry.setId("createPaginaPrincipal10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PaginaPrincipal_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPaginasNormales11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataWebDeskDSL.diagram.part.Messages.PaginasNormales11CreationTool_title,
				DataWebDeskDSL.diagram.part.Messages.PaginasNormales11CreationTool_desc, Collections.singletonList(
						DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PaginasNormales_2007));
		entry.setId("createPaginasNormales11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PaginasNormales_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRSS12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataWebDeskDSL.diagram.part.Messages.RSS12CreationTool_title,
				DataWebDeskDSL.diagram.part.Messages.RSS12CreationTool_desc,
				Collections.singletonList(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RSS_2011));
		entry.setId("createRSS12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RSS_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRol13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataWebDeskDSL.diagram.part.Messages.Rol13CreationTool_title,
				DataWebDeskDSL.diagram.part.Messages.Rol13CreationTool_desc,
				Collections.singletonList(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Rol_2012));
		entry.setId("createRol13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Rol_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTwitter14CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataWebDeskDSL.diagram.part.Messages.Twitter14CreationTool_title,
				DataWebDeskDSL.diagram.part.Messages.Twitter14CreationTool_desc,
				Collections.singletonList(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Twitter_2009));
		entry.setId("createTwitter14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Twitter_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createURLExterna15CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				DataWebDeskDSL.diagram.part.Messages.URLExterna15CreationTool_title,
				DataWebDeskDSL.diagram.part.Messages.URLExterna15CreationTool_desc,
				Collections.singletonList(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.URLExterna_2014));
		entry.setId("createURLExterna15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.URLExterna_2014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAccede1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				DataWebDeskDSL.diagram.part.Messages.Accede1CreationTool_title,
				DataWebDeskDSL.diagram.part.Messages.Accede1CreationTool_desc, Collections
						.singletonList(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PaginaAccede_4001));
		entry.setId("createAccede1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PaginaAccede_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAsociada2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				DataWebDeskDSL.diagram.part.Messages.Asociada2CreationTool_title,
				DataWebDeskDSL.diagram.part.Messages.Asociada2CreationTool_desc, Collections.singletonList(
						DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntidadAsociada_4002));
		entry.setId("createAsociada2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntidadAsociada_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createClave_primaria3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				DataWebDeskDSL.diagram.part.Messages.Clave_primaria3CreationTool_title,
				DataWebDeskDSL.diagram.part.Messages.Clave_primaria3CreationTool_desc, Collections.singletonList(
						DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntidadClave_primaria_4003));
		entry.setId("createClave_primaria3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.getImageDescriptor(
				DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntidadClave_primaria_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMostrada4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				DataWebDeskDSL.diagram.part.Messages.Mostrada4CreationTool_title,
				DataWebDeskDSL.diagram.part.Messages.Mostrada4CreationTool_desc, Collections.singletonList(
						DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RedSocialMostrada_4006));
		entry.setId("createMostrada4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.getImageDescriptor(
				DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RedSocialMostrada_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPagina5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				DataWebDeskDSL.diagram.part.Messages.Pagina5CreationTool_title,
				DataWebDeskDSL.diagram.part.Messages.Pagina5CreationTool_desc, Collections.singletonList(
						DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.URLExternaPagina_4007));
		entry.setId("createPagina5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.URLExternaPagina_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRelacionada6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				DataWebDeskDSL.diagram.part.Messages.Relacionada6CreationTool_title,
				DataWebDeskDSL.diagram.part.Messages.Relacionada6CreationTool_desc, Collections.singletonList(
						DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntidadRelacionada_4004));
		entry.setId("createRelacionada6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.getImageDescriptor(
				DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntidadRelacionada_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTiene_acceso7CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				DataWebDeskDSL.diagram.part.Messages.Tiene_acceso7CreationTool_title,
				DataWebDeskDSL.diagram.part.Messages.Tiene_acceso7CreationTool_desc, Collections.singletonList(
						DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RolTiene_acceso_4005));
		entry.setId("createTiene_acceso7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(DataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RolTiene_acceso_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
