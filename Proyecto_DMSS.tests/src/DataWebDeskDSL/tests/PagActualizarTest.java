/**
 */
package DataWebDeskDSL.tests;

import DataWebDeskDSL.DataWebDeskDSLFactory;
import DataWebDeskDSL.PagActualizar;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pag Actualizar</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PagActualizarTest extends PagCRUDTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PagActualizarTest.class);
	}

	/**
	 * Constructs a new Pag Actualizar test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PagActualizarTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pag Actualizar test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PagActualizar getFixture() {
		return (PagActualizar)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataWebDeskDSLFactory.eINSTANCE.createPagActualizar());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PagActualizarTest
