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
 *   <li>{@link org.angriff.eva.core.model.EvaComponentMeta#getInputPorts <em>Input Ports</em>}</li>
 *   <li>{@link org.angriff.eva.core.model.EvaComponentMeta#getOutputPorts <em>Output Ports</em>}</li>
 *   <li>{@link org.angriff.eva.core.model.EvaComponentMeta#isStateless <em>Stateless</em>}</li>
 *   <li>{@link org.angriff.eva.core.model.EvaComponentMeta#isSynchronous <em>Synchronous</em>}</li>
 *   <li>{@link org.angriff.eva.core.model.EvaComponentMeta#isSerializable <em>Serializable</em>}</li>
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
	 * Returns the value of the '<em><b>Factory Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link org.angriff.eva.core.model.EvaArgument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factory Arguments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factory Arguments</em>' containment reference list.
	 * @see org.angriff.eva.core.model.EvaModelPackage#getEvaComponentMeta_FactoryArguments()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<EvaArgument> getFactoryArguments();

	/**
	 * Returns the value of the '<em><b>Input Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.angriff.eva.core.model.EvaPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Ports</em>' containment reference list.
	 * @see org.angriff.eva.core.model.EvaModelPackage#getEvaComponentMeta_InputPorts()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<EvaPort> getInputPorts();

	/**
	 * Returns the value of the '<em><b>Output Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.angriff.eva.core.model.EvaPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Ports</em>' containment reference list.
	 * @see org.angriff.eva.core.model.EvaModelPackage#getEvaComponentMeta_OutputPorts()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<EvaPort> getOutputPorts();

	/**
	 * Returns the value of the '<em><b>Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronous</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronous</em>' attribute.
	 * @see #setSynchronous(boolean)
	 * @see org.angriff.eva.core.model.EvaModelPackage#getEvaComponentMeta_Synchronous()
	 * @model required="true"
	 * @generated
	 */
	boolean isSynchronous();

	/**
	 * Sets the value of the '{@link org.angriff.eva.core.model.EvaComponentMeta#isSynchronous <em>Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronous</em>' attribute.
	 * @see #isSynchronous()
	 * @generated
	 */
	void setSynchronous(boolean value);

	/**
	 * Returns the value of the '<em><b>Serializable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serializable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serializable</em>' attribute.
	 * @see #setSerializable(boolean)
	 * @see org.angriff.eva.core.model.EvaModelPackage#getEvaComponentMeta_Serializable()
	 * @model required="true"
	 * @generated
	 */
	boolean isSerializable();

	/**
	 * Sets the value of the '{@link org.angriff.eva.core.model.EvaComponentMeta#isSerializable <em>Serializable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serializable</em>' attribute.
	 * @see #isSerializable()
	 * @generated
	 */
	void setSerializable(boolean value);

	/**
	 * Returns the value of the '<em><b>Stateless</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stateless</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stateless</em>' attribute.
	 * @see #setStateless(boolean)
	 * @see org.angriff.eva.core.model.EvaModelPackage#getEvaComponentMeta_Stateless()
	 * @model required="true"
	 * @generated
	 */
	boolean isStateless();

	/**
	 * Sets the value of the '{@link org.angriff.eva.core.model.EvaComponentMeta#isStateless <em>Stateless</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stateless</em>' attribute.
	 * @see #isStateless()
	 * @generated
	 */
	void setStateless(boolean value);

} // EvaComponentMeta
