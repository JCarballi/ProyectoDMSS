/**
 */
package DataWebDeskDSL.tests;

import DataWebDeskDSL.DataWebDeskDSLFactory;
import DataWebDeskDSL.PagLeer;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pag Leer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PagLeerTest extends PagCRUDTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PagLeerTest.class);
	}

	/**
	 * Constructs a new Pag Leer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PagLeerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pag Leer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PagLeer getFixture() {
		return (PagLeer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataWebDeskDSLFactory.eINSTANCE.createPagLeer());
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

} //PagLeerTest
