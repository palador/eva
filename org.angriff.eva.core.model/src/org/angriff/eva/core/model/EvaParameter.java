/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.angriff.eva.core.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eva Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.angriff.eva.core.model.EvaParameter#getName <em>Name</em>}</li>
 *   <li>{@link org.angriff.eva.core.model.EvaParameter#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.angriff.eva.core.model.EvaModelPackage#getEvaParameter()
 * @model
 * @generated
 */
public interface EvaParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.angriff.eva.core.model.EvaModelPackage#getEvaParameter_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.angriff.eva.core.model.EvaParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.angriff.eva.core.model.EvaParameterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.angriff.eva.core.model.EvaParameterType
	 * @see #setType(EvaParameterType)
	 * @see org.angriff.eva.core.model.EvaModelPackage#getEvaParameter_Type()
	 * @model required="true"
	 * @generated
	 */
	EvaParameterType getType();

	/**
	 * Sets the value of the '{@link org.angriff.eva.core.model.EvaParameter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.angriff.eva.core.model.EvaParameterType
	 * @see #getType()
	 * @generated
	 */
	void setType(EvaParameterType value);

} // EvaParameter
