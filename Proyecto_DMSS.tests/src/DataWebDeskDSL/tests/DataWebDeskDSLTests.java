/**
 */
package DataWebDeskDSL.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>DataWebDeskDSL</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataWebDeskDSLTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new DataWebDeskDSLTests("DataWebDeskDSL Tests");
		suite.addTestSuite(DataWebDeskTest.class);
		suite.addTestSuite(RolTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataWebDeskDSLTests(String name) {
		super(name);
	}

} //DataWebDeskDSLTests
