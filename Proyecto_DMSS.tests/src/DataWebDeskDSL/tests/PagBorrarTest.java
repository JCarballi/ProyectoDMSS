/**
 */
package DataWebDeskDSL.tests;

import DataWebDeskDSL.DataWebDeskDSLFactory;
import DataWebDeskDSL.PagBorrar;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pag Borrar</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PagBorrarTest extends PagCRUDTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PagBorrarTest.class);
	}

	/**
	 * Constructs a new Pag Borrar test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PagBorrarTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pag Borrar test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PagBorrar getFixture() {
		return (PagBorrar)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataWebDeskDSLFactory.eINSTANCE.createPagBorrar());
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

} //PagBorrarTest
