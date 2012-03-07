/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.angriff.eva.core.model.impl;

import org.angriff.eva.core.model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EvaModelFactoryImpl extends EFactoryImpl implements EvaModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EvaModelFactory init() {
		try {
			EvaModelFactory theEvaModelFactory = (EvaModelFactory)EPackage.Registry.INSTANCE.getEFactory("http://projektangriff.de/eva/core/model"); 
			if (theEvaModelFactory != null) {
				return theEvaModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EvaModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EvaModelPackage.EVA_COMPONENT_FACTORY_META: return createEvaComponentFactoryMeta();
			case EvaModelPackage.EVA_COMPONENT_META: return createEvaComponentMeta();
			case EvaModelPackage.EVA_PORT: return createEvaPort();
			case EvaModelPackage.EVA_PIN: return createEvaPin();
			case EvaModelPackage.EVA_PARAMETER: return createEvaParameter();
			case EvaModelPackage.EVA_ARGUMENT: return createEvaArgument();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EvaModelPackage.EVA_COMPONENT_TYPE:
				return createEvaComponentTypeFromString(eDataType, initialValue);
			case EvaModelPackage.EVA_PARAMETER_TYPE:
				return createEvaParameterTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EvaModelPackage.EVA_COMPONENT_TYPE:
				return convertEvaComponentTypeToString(eDataType, instanceValue);
			case EvaModelPackage.EVA_PARAMETER_TYPE:
				return convertEvaParameterTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaComponentFactoryMeta createEvaComponentFactoryMeta() {
		EvaComponentFactoryMetaImpl evaComponentFactoryMeta = new EvaComponentFactoryMetaImpl();
		return evaComponentFactoryMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaComponentMeta createEvaComponentMeta() {
		EvaComponentMetaImpl evaComponentMeta = new EvaComponentMetaImpl();
		return evaComponentMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaPort createEvaPort() {
		EvaPortImpl evaPort = new EvaPortImpl();
		return evaPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaPin createEvaPin() {
		EvaPinImpl evaPin = new EvaPinImpl();
		return evaPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaParameter createEvaParameter() {
		EvaParameterImpl evaParameter = new EvaParameterImpl();
		return evaParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaArgument createEvaArgument() {
		EvaArgumentImpl evaArgument = new EvaArgumentImpl();
		return evaArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaComponentType createEvaComponentTypeFromString(EDataType eDataType, String initialValue) {
		EvaComponentType result = EvaComponentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEvaComponentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaParameterType createEvaParameterTypeFromString(EDataType eDataType, String initialValue) {
		EvaParameterType result = EvaParameterType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEvaParameterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaModelPackage getEvaModelPackage() {
		return (EvaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EvaModelPackage getPackage() {
		return EvaModelPackage.eINSTANCE;
	}

} //EvaModelFactoryImpl
