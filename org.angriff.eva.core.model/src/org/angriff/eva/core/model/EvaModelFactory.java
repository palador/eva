/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.angriff.eva.core.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.angriff.eva.core.model.EvaModelPackage
 * @generated
 */
public interface EvaModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EvaModelFactory eINSTANCE = org.angriff.eva.core.model.impl.EvaModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Eva Component Factory Meta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eva Component Factory Meta</em>'.
	 * @generated
	 */
	EvaComponentFactoryMeta createEvaComponentFactoryMeta();

	/**
	 * Returns a new object of class '<em>Eva Component Meta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eva Component Meta</em>'.
	 * @generated
	 */
	EvaComponentMeta createEvaComponentMeta();

	/**
	 * Returns a new object of class '<em>Eva Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eva Port</em>'.
	 * @generated
	 */
	EvaPort createEvaPort();

	/**
	 * Returns a new object of class '<em>Eva Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eva Pin</em>'.
	 * @generated
	 */
	EvaPin createEvaPin();

	/**
	 * Returns a new object of class '<em>Eva Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eva Parameter</em>'.
	 * @generated
	 */
	EvaParameter createEvaParameter();

	/**
	 * Returns a new object of class '<em>Eva Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eva Argument</em>'.
	 * @generated
	 */
	EvaArgument createEvaArgument();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EvaModelPackage getEvaModelPackage();

} //EvaModelFactory
