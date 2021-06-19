/**
 */
package DataWebDeskDSL.tests;

import DataWebDeskDSL.DataWebDeskDSLFactory;
import DataWebDeskDSL.PagCrear;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pag Crear</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PagCrearTest extends PagCRUDTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PagCrearTest.class);
	}

	/**
	 * Constructs a new Pag Crear test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PagCrearTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pag Crear test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PagCrear getFixture() {
		return (PagCrear)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataWebDeskDSLFactory.eINSTANCE.createPagCrear());
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

} //PagCrearTest
