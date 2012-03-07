/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.angriff.eva.core.model.util;

import org.angriff.eva.core.model.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.angriff.eva.core.model.EvaModelPackage
 * @generated
 */
public class EvaModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EvaModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaModelSwitch() {
		if (modelPackage == null) {
			modelPackage = EvaModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EvaModelPackage.EVA_COMPONENT_FACTORY_META: {
				EvaComponentFactoryMeta evaComponentFactoryMeta = (EvaComponentFactoryMeta)theEObject;
				T result = caseEvaComponentFactoryMeta(evaComponentFactoryMeta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvaModelPackage.EVA_COMPONENT_META: {
				EvaComponentMeta evaComponentMeta = (EvaComponentMeta)theEObject;
				T result = caseEvaComponentMeta(evaComponentMeta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvaModelPackage.EVA_PORT: {
				EvaPort evaPort = (EvaPort)theEObject;
				T result = caseEvaPort(evaPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvaModelPackage.EVA_PIN: {
				EvaPin evaPin = (EvaPin)theEObject;
				T result = caseEvaPin(evaPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvaModelPackage.EVA_PARAMETER: {
				EvaParameter evaParameter = (EvaParameter)theEObject;
				T result = caseEvaParameter(evaParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvaModelPackage.EVA_ARGUMENT: {
				EvaArgument evaArgument = (EvaArgument)theEObject;
				T result = caseEvaArgument(evaArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eva Component Factory Meta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eva Component Factory Meta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaComponentFactoryMeta(EvaComponentFactoryMeta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eva Component Meta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eva Component Meta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaComponentMeta(EvaComponentMeta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eva Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eva Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaPort(EvaPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eva Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eva Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaPin(EvaPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eva Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eva Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaParameter(EvaParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eva Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eva Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaArgument(EvaArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EvaModelSwitch
