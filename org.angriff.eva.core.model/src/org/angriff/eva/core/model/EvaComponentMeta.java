/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.angriff.eva.core.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eva Component Meta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.angriff.eva.core.model.EvaComponentMeta#getFactory <em>Factory</em>}</li>
 *   <li>{@link org.angriff.eva.core.model.EvaComponentMeta#getFactoryArguments <em>Factory Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.angriff.eva.core.model.EvaModelPackage#getEvaComponentMeta()
 * @model
 * @generated
 */
public interface EvaComponentMeta extends EObject {
	/**
	 * Returns the value of the '<em><b>Factory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factory</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factory</em>' reference.
	 * @see #setFactory(EvaComponentMeta)
	 * @see org.angriff.eva.core.model.EvaModelPackage#getEvaComponentMeta_Factory()
	 * @model required="true"
	 * @generated
	 */
	EvaComponentMeta getFactory();

	/**
	 * Sets the value of the '{@link org.angriff.eva.core.model.EvaComponentMeta#getFactory <em>Factory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory</em>' reference.
	 * @see #getFactory()
	 * @generated
	 */
	void setFactory(EvaComponentMeta value);

	/**
	 * Returns the value of the '<em><b>Factory Arguments</b></em>' reference list.
	 * The list contents are of type {@link org.angriff.eva.core.model.EvaArgument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factory Arguments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factory Arguments</em>' reference list.
	 * @see org.angriff.eva.core.model.EvaModelPackage#getEvaComponentMeta_FactoryArguments()
	 * @model
	 * @generated
	 */
	EList<EvaArgument> getFactoryArguments();

} // EvaComponentMeta
