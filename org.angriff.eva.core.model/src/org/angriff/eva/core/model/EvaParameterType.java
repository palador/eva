/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.angriff.eva.core.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Eva Parameter Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.angriff.eva.core.model.EvaModelPackage#getEvaParameterType()
 * @model
 * @generated
 */
public final class EvaParameterType extends AbstractEnumerator {
	/**
	 * The '<em><b>STRING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STRING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRING_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING = 0;

	/**
	 * The '<em><b>INTEGER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTEGER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTEGER_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER = 1;

	/**
	 * The '<em><b>DOUBLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DOUBLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE = 2;

	/**
	 * The '<em><b>FLAG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FLAG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLAG_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLAG = 3;

	/**
	 * The '<em><b>CLASS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLASS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLASS_LITERAL
	 * @model literal=""
	 * @generated
	 * @ordered
	 */
	public static final int CLASS = 4;

	/**
	 * The '<em><b>SELECTABLE ONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SELECTABLE ONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SELECTABLE_ONE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SELECTABLE_ONE = 5;

	/**
	 * The '<em><b>SELECTABLE MANY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SELECTABLE MANY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SELECTABLE_MANY_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SELECTABLE_MANY = 6;

	/**
	 * The '<em><b>STRING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING
	 * @generated
	 * @ordered
	 */
	public static final EvaParameterType STRING_LITERAL = new EvaParameterType(STRING, "STRING", "STRING");

	/**
	 * The '<em><b>INTEGER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER
	 * @generated
	 * @ordered
	 */
	public static final EvaParameterType INTEGER_LITERAL = new EvaParameterType(INTEGER, "INTEGER", "INTEGER");

	/**
	 * The '<em><b>DOUBLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE
	 * @generated
	 * @ordered
	 */
	public static final EvaParameterType DOUBLE_LITERAL = new EvaParameterType(DOUBLE, "DOUBLE", "DOUBLE");

	/**
	 * The '<em><b>FLAG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLAG
	 * @generated
	 * @ordered
	 */
	public static final EvaParameterType FLAG_LITERAL = new EvaParameterType(FLAG, "FLAG", "FLAG");

	/**
	 * The '<em><b>CLASS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASS
	 * @generated
	 * @ordered
	 */
	public static final EvaParameterType CLASS_LITERAL = new EvaParameterType(CLASS, "CLASS", "");

	/**
	 * The '<em><b>SELECTABLE ONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECTABLE_ONE
	 * @generated
	 * @ordered
	 */
	public static final EvaParameterType SELECTABLE_ONE_LITERAL = new EvaParameterType(SELECTABLE_ONE, "SELECTABLE_ONE", "SELECTABLE_ONE");

	/**
	 * The '<em><b>SELECTABLE MANY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECTABLE_MANY
	 * @generated
	 * @ordered
	 */
	public static final EvaParameterType SELECTABLE_MANY_LITERAL = new EvaParameterType(SELECTABLE_MANY, "SELECTABLE_MANY", "SELECTABLE_MANY");

	/**
	 * An array of all the '<em><b>Eva Parameter Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EvaParameterType[] VALUES_ARRAY =
		new EvaParameterType[] {
			STRING_LITERAL,
			INTEGER_LITERAL,
			DOUBLE_LITERAL,
			FLAG_LITERAL,
			CLASS_LITERAL,
			SELECTABLE_ONE_LITERAL,
			SELECTABLE_MANY_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Eva Parameter Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Eva Parameter Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EvaParameterType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EvaParameterType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Eva Parameter Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EvaParameterType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EvaParameterType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Eva Parameter Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EvaParameterType get(int value) {
		switch (value) {
			case STRING: return STRING_LITERAL;
			case INTEGER: return INTEGER_LITERAL;
			case DOUBLE: return DOUBLE_LITERAL;
			case FLAG: return FLAG_LITERAL;
			case CLASS: return CLASS_LITERAL;
			case SELECTABLE_ONE: return SELECTABLE_ONE_LITERAL;
			case SELECTABLE_MANY: return SELECTABLE_MANY_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EvaParameterType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //EvaParameterType
