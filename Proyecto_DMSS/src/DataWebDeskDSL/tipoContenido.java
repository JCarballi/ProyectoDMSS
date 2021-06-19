/**
 */
package DataWebDeskDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>tipo Contenido</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see DataWebDeskDSL.DataWebDeskDSLPackage#gettipoContenido()
 * @model
 * @generated
 */
public enum tipoContenido implements Enumerator {
	/**
	 * The '<em><b>TEXTO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXTO_VALUE
	 * @generated
	 * @ordered
	 */
	TEXTO(0, "TEXTO", "TEXTO"),

	/**
	 * The '<em><b>MULTIMEDIA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIMEDIA_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIMEDIA(1, "MULTIMEDIA", "MULTIMEDIA");

	/**
	 * The '<em><b>TEXTO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TEXTO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEXTO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEXTO_VALUE = 0;

	/**
	 * The '<em><b>MULTIMEDIA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MULTIMEDIA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTIMEDIA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MULTIMEDIA_VALUE = 1;

	/**
	 * An array of all the '<em><b>tipo Contenido</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final tipoContenido[] VALUES_ARRAY =
		new tipoContenido[] {
			TEXTO,
			MULTIMEDIA,
		};

	/**
	 * A public read-only list of all the '<em><b>tipo Contenido</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<tipoContenido> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>tipo Contenido</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static tipoContenido get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			tipoContenido result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>tipo Contenido</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static tipoContenido getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			tipoContenido result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>tipo Contenido</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static tipoContenido get(int value) {
		switch (value) {
			case TEXTO_VALUE: return TEXTO;
			case MULTIMEDIA_VALUE: return MULTIMEDIA;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private tipoContenido(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //tipoContenido
