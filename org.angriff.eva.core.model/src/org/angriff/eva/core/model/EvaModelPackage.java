/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.angriff.eva.core.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.angriff.eva.core.model.EvaModelFactory
 * @model kind="package"
 * @generated
 */
public interface EvaModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://projektangriff.de/eva/core/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eva";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EvaModelPackage eINSTANCE = org.angriff.eva.core.model.impl.EvaModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.angriff.eva.core.model.impl.EvaComponentFactoryMetaImpl <em>Eva Component Factory Meta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.angriff.eva.core.model.impl.EvaComponentFactoryMetaImpl
	 * @see org.angriff.eva.core.model.impl.EvaModelPackageImpl#getEvaComponentFactoryMeta()
	 * @generated
	 */
	int EVA_COMPONENT_FACTORY_META = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVA_COMPONENT_FACTORY_META__ID = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVA_COMPONENT_FACTORY_META__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Instance Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVA_COMPONENT_FACTORY_META__INSTANCE_PARAMETERS = 2;

	/**
	 * The number of structural features of the '<em>Eva Component Factory Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVA_COMPONENT_FACTORY_META_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.angriff.eva.core.model.impl.EvaComponentMetaImpl <em>Eva Component Meta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.angriff.eva.core.model.impl.EvaComponentMetaImpl
	 * @see org.angriff.eva.core.model.impl.EvaModelPackageImpl#getEvaComponentMeta()
	 * @generated
	 */
	int EVA_COMPONENT_META = 1;

	/**
	 * The feature id for the '<em><b>Factory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVA_COMPONENT_META__FACTORY = 0;

	/**
	 * The feature id for the '<em><b>Factory Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVA_COMPONENT_META__FACTORY_ARGUMENTS = 1;

	/**
	 * The number of structural features of the '<em>Eva Component Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVA_COMPONENT_META_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.angriff.eva.core.model.impl.EvaParameterImpl <em>Eva Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.angriff.eva.core.model.impl.EvaParameterImpl
	 * @see org.angriff.eva.core.model.impl.EvaModelPackageImpl#getEvaParameter()
	 * @generated
	 */
	int EVA_PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVA_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVA_PARAMETER__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Eva Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVA_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.angriff.eva.core.model.impl.EvaArgumentImpl <em>Eva Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.angriff.eva.core.model.impl.EvaArgumentImpl
	 * @see org.angriff.eva.core.model.impl.EvaModelPackageImpl#getEvaArgument()
	 * @generated
	 */
	int EVA_ARGUMENT = 3;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVA_ARGUMENT__PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVA_ARGUMENT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Eva Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVA_ARGUMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.angriff.eva.core.model.EvaParameterType <em>Eva Parameter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.angriff.eva.core.model.EvaParameterType
	 * @see org.angriff.eva.core.model.impl.EvaModelPackageImpl#getEvaParameterType()
	 * @generated
	 */
	int EVA_PARAMETER_TYPE = 4;


	/**
	 * Returns the meta object for class '{@link org.angriff.eva.core.model.EvaComponentFactoryMeta <em>Eva Component Factory Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eva Component Factory Meta</em>'.
	 * @see org.angriff.eva.core.model.EvaComponentFactoryMeta
	 * @generated
	 */
	EClass getEvaComponentFactoryMeta();

	/**
	 * Returns the meta object for the attribute '{@link org.angriff.eva.core.model.EvaComponentFactoryMeta#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.angriff.eva.core.model.EvaComponentFactoryMeta#getId()
	 * @see #getEvaComponentFactoryMeta()
	 * @generated
	 */
	EAttribute getEvaComponentFactoryMeta_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.angriff.eva.core.model.EvaComponentFactoryMeta#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.angriff.eva.core.model.EvaComponentFactoryMeta#getVersion()
	 * @see #getEvaComponentFactoryMeta()
	 * @generated
	 */
	EAttribute getEvaComponentFactoryMeta_Version();

	/**
	 * Returns the meta object for the reference list '{@link org.angriff.eva.core.model.EvaComponentFactoryMeta#getInstanceParameters <em>Instance Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instance Parameters</em>'.
	 * @see org.angriff.eva.core.model.EvaComponentFactoryMeta#getInstanceParameters()
	 * @see #getEvaComponentFactoryMeta()
	 * @generated
	 */
	EReference getEvaComponentFactoryMeta_InstanceParameters();

	/**
	 * Returns the meta object for class '{@link org.angriff.eva.core.model.EvaComponentMeta <em>Eva Component Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eva Component Meta</em>'.
	 * @see org.angriff.eva.core.model.EvaComponentMeta
	 * @generated
	 */
	EClass getEvaComponentMeta();

	/**
	 * Returns the meta object for the reference '{@link org.angriff.eva.core.model.EvaComponentMeta#getFactory <em>Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Factory</em>'.
	 * @see org.angriff.eva.core.model.EvaComponentMeta#getFactory()
	 * @see #getEvaComponentMeta()
	 * @generated
	 */
	EReference getEvaComponentMeta_Factory();

	/**
	 * Returns the meta object for the reference list '{@link org.angriff.eva.core.model.EvaComponentMeta#getFactoryArguments <em>Factory Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Factory Arguments</em>'.
	 * @see org.angriff.eva.core.model.EvaComponentMeta#getFactoryArguments()
	 * @see #getEvaComponentMeta()
	 * @generated
	 */
	EReference getEvaComponentMeta_FactoryArguments();

	/**
	 * Returns the meta object for class '{@link org.angriff.eva.core.model.EvaParameter <em>Eva Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eva Parameter</em>'.
	 * @see org.angriff.eva.core.model.EvaParameter
	 * @generated
	 */
	EClass getEvaParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.angriff.eva.core.model.EvaParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.angriff.eva.core.model.EvaParameter#getName()
	 * @see #getEvaParameter()
	 * @generated
	 */
	EAttribute getEvaParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.angriff.eva.core.model.EvaParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.angriff.eva.core.model.EvaParameter#getType()
	 * @see #getEvaParameter()
	 * @generated
	 */
	EAttribute getEvaParameter_Type();

	/**
	 * Returns the meta object for class '{@link org.angriff.eva.core.model.EvaArgument <em>Eva Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eva Argument</em>'.
	 * @see org.angriff.eva.core.model.EvaArgument
	 * @generated
	 */
	EClass getEvaArgument();

	/**
	 * Returns the meta object for the reference '{@link org.angriff.eva.core.model.EvaArgument#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see org.angriff.eva.core.model.EvaArgument#getParameter()
	 * @see #getEvaArgument()
	 * @generated
	 */
	EReference getEvaArgument_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link org.angriff.eva.core.model.EvaArgument#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.angriff.eva.core.model.EvaArgument#getValue()
	 * @see #getEvaArgument()
	 * @generated
	 */
	EAttribute getEvaArgument_Value();

	/**
	 * Returns the meta object for enum '{@link org.angriff.eva.core.model.EvaParameterType <em>Eva Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Eva Parameter Type</em>'.
	 * @see org.angriff.eva.core.model.EvaParameterType
	 * @generated
	 */
	EEnum getEvaParameterType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EvaModelFactory getEvaModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.angriff.eva.core.model.impl.EvaComponentFactoryMetaImpl <em>Eva Component Factory Meta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.angriff.eva.core.model.impl.EvaComponentFactoryMetaImpl
		 * @see org.angriff.eva.core.model.impl.EvaModelPackageImpl#getEvaComponentFactoryMeta()
		 * @generated
		 */
		EClass EVA_COMPONENT_FACTORY_META = eINSTANCE.getEvaComponentFactoryMeta();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVA_COMPONENT_FACTORY_META__ID = eINSTANCE.getEvaComponentFactoryMeta_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVA_COMPONENT_FACTORY_META__VERSION = eINSTANCE.getEvaComponentFactoryMeta_Version();

		/**
		 * The meta object literal for the '<em><b>Instance Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVA_COMPONENT_FACTORY_META__INSTANCE_PARAMETERS = eINSTANCE.getEvaComponentFactoryMeta_InstanceParameters();

		/**
		 * The meta object literal for the '{@link org.angriff.eva.core.model.impl.EvaComponentMetaImpl <em>Eva Component Meta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.angriff.eva.core.model.impl.EvaComponentMetaImpl
		 * @see org.angriff.eva.core.model.impl.EvaModelPackageImpl#getEvaComponentMeta()
		 * @generated
		 */
		EClass EVA_COMPONENT_META = eINSTANCE.getEvaComponentMeta();

		/**
		 * The meta object literal for the '<em><b>Factory</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVA_COMPONENT_META__FACTORY = eINSTANCE.getEvaComponentMeta_Factory();

		/**
		 * The meta object literal for the '<em><b>Factory Arguments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVA_COMPONENT_META__FACTORY_ARGUMENTS = eINSTANCE.getEvaComponentMeta_FactoryArguments();

		/**
		 * The meta object literal for the '{@link org.angriff.eva.core.model.impl.EvaParameterImpl <em>Eva Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.angriff.eva.core.model.impl.EvaParameterImpl
		 * @see org.angriff.eva.core.model.impl.EvaModelPackageImpl#getEvaParameter()
		 * @generated
		 */
		EClass EVA_PARAMETER = eINSTANCE.getEvaParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVA_PARAMETER__NAME = eINSTANCE.getEvaParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVA_PARAMETER__TYPE = eINSTANCE.getEvaParameter_Type();

		/**
		 * The meta object literal for the '{@link org.angriff.eva.core.model.impl.EvaArgumentImpl <em>Eva Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.angriff.eva.core.model.impl.EvaArgumentImpl
		 * @see org.angriff.eva.core.model.impl.EvaModelPackageImpl#getEvaArgument()
		 * @generated
		 */
		EClass EVA_ARGUMENT = eINSTANCE.getEvaArgument();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVA_ARGUMENT__PARAMETER = eINSTANCE.getEvaArgument_Parameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVA_ARGUMENT__VALUE = eINSTANCE.getEvaArgument_Value();

		/**
		 * The meta object literal for the '{@link org.angriff.eva.core.model.EvaParameterType <em>Eva Parameter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.angriff.eva.core.model.EvaParameterType
		 * @see org.angriff.eva.core.model.impl.EvaModelPackageImpl#getEvaParameterType()
		 * @generated
		 */
		EEnum EVA_PARAMETER_TYPE = eINSTANCE.getEvaParameterType();

	}

} //EvaModelPackage
