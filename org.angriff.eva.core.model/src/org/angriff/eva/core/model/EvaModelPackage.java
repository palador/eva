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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVA_COMPONENT_FACTORY_META__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVA_COMPONENT_FACTORY_META__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Instance Parameters</b></em>' containment reference list.
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
	 * The feature id for the '<em><b>Factory Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVA_COMPONENT_META__FACTORY_ARGUMENTS = 1;

	/**
	 * The feature id for the '<em><b>Input Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVA_COMPONENT_META__INPUT_PORTS = 2;

	/**
	 * The feature id for the '<em><b>Output Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVA_COMPONENT_META__OUTPUT_PORTS = 3;

	/**
	 * The feature id for the '<em><b>Stateless</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVA_COMPONENT_META__STATELESS = 4;

	/**
	 * The feature id for the '<em><b>Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVA_COMPONENT_META__SYNCHRONOUS = 5;

	/**
	 * The feature id for the '<em><b>Serializable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVA_COMPONENT_META__SERIALIZABLE = 6;

	/**
	 * The number of structural features of the '<em>Eva Component Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVA_COMPONENT_META_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.angriff.eva.core.model.impl.EvaPortImpl <em>Eva Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.angriff.eva.core.model.impl.EvaPortImpl
	 * @see org.angriff.eva.core.model.impl.EvaModelPackageImpl#getEvaPort()
	 * @generated
	 */
	int EVA_PORT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVA_PORT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVA_PORT__PINS = 1;

	/**
	 * The number of structural features of the '<em>Eva Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVA_PORT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.angriff.eva.core.model.impl.EvaPinImpl <em>Eva Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.angriff.eva.core.model.impl.EvaPinImpl
	 * @see org.angriff.eva.core.model.impl.EvaModelPackageImpl#getEvaPin()
	 * @generated
	 */
	int EVA_PIN = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVA_PIN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVA_PIN__PORT = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVA_PIN__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Validator Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVA_PIN__VALIDATOR_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Validator Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVA_PIN__VALIDATOR_DETAIL = 4;

	/**
	 * The number of structural features of the '<em>Eva Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVA_PIN_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.angriff.eva.core.model.impl.EvaParameterImpl <em>Eva Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.angriff.eva.core.model.impl.EvaParameterImpl
	 * @see org.angriff.eva.core.model.impl.EvaModelPackageImpl#getEvaParameter()
	 * @generated
	 */
	int EVA_PARAMETER = 4;

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
	int EVA_ARGUMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVA_ARGUMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVA_ARGUMENT__PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVA_ARGUMENT__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Eva Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVA_ARGUMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.angriff.eva.core.model.EvaComponentType <em>Eva Component Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.angriff.eva.core.model.EvaComponentType
	 * @see org.angriff.eva.core.model.impl.EvaModelPackageImpl#getEvaComponentType()
	 * @generated
	 */
	int EVA_COMPONENT_TYPE = 6;

	/**
	 * The meta object id for the '{@link org.angriff.eva.core.model.EvaParameterType <em>Eva Parameter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.angriff.eva.core.model.EvaParameterType
	 * @see org.angriff.eva.core.model.impl.EvaModelPackageImpl#getEvaParameterType()
	 * @generated
	 */
	int EVA_PARAMETER_TYPE = 7;


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
	 * Returns the meta object for the attribute '{@link org.angriff.eva.core.model.EvaComponentFactoryMeta#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.angriff.eva.core.model.EvaComponentFactoryMeta#getName()
	 * @see #getEvaComponentFactoryMeta()
	 * @generated
	 */
	EAttribute getEvaComponentFactoryMeta_Name();

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
	 * Returns the meta object for the containment reference list '{@link org.angriff.eva.core.model.EvaComponentFactoryMeta#getInstanceParameters <em>Instance Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance Parameters</em>'.
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
	 * Returns the meta object for the containment reference list '{@link org.angriff.eva.core.model.EvaComponentMeta#getFactoryArguments <em>Factory Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Factory Arguments</em>'.
	 * @see org.angriff.eva.core.model.EvaComponentMeta#getFactoryArguments()
	 * @see #getEvaComponentMeta()
	 * @generated
	 */
	EReference getEvaComponentMeta_FactoryArguments();

	/**
	 * Returns the meta object for the containment reference list '{@link org.angriff.eva.core.model.EvaComponentMeta#getInputPorts <em>Input Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Ports</em>'.
	 * @see org.angriff.eva.core.model.EvaComponentMeta#getInputPorts()
	 * @see #getEvaComponentMeta()
	 * @generated
	 */
	EReference getEvaComponentMeta_InputPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.angriff.eva.core.model.EvaComponentMeta#getOutputPorts <em>Output Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Ports</em>'.
	 * @see org.angriff.eva.core.model.EvaComponentMeta#getOutputPorts()
	 * @see #getEvaComponentMeta()
	 * @generated
	 */
	EReference getEvaComponentMeta_OutputPorts();

	/**
	 * Returns the meta object for the attribute '{@link org.angriff.eva.core.model.EvaComponentMeta#isSynchronous <em>Synchronous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synchronous</em>'.
	 * @see org.angriff.eva.core.model.EvaComponentMeta#isSynchronous()
	 * @see #getEvaComponentMeta()
	 * @generated
	 */
	EAttribute getEvaComponentMeta_Synchronous();

	/**
	 * Returns the meta object for the attribute '{@link org.angriff.eva.core.model.EvaComponentMeta#isSerializable <em>Serializable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serializable</em>'.
	 * @see org.angriff.eva.core.model.EvaComponentMeta#isSerializable()
	 * @see #getEvaComponentMeta()
	 * @generated
	 */
	EAttribute getEvaComponentMeta_Serializable();

	/**
	 * Returns the meta object for the attribute '{@link org.angriff.eva.core.model.EvaComponentMeta#isStateless <em>Stateless</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stateless</em>'.
	 * @see org.angriff.eva.core.model.EvaComponentMeta#isStateless()
	 * @see #getEvaComponentMeta()
	 * @generated
	 */
	EAttribute getEvaComponentMeta_Stateless();

	/**
	 * Returns the meta object for class '{@link org.angriff.eva.core.model.EvaPort <em>Eva Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eva Port</em>'.
	 * @see org.angriff.eva.core.model.EvaPort
	 * @generated
	 */
	EClass getEvaPort();

	/**
	 * Returns the meta object for the attribute '{@link org.angriff.eva.core.model.EvaPort#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.angriff.eva.core.model.EvaPort#getName()
	 * @see #getEvaPort()
	 * @generated
	 */
	EAttribute getEvaPort_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.angriff.eva.core.model.EvaPort#getPins <em>Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pins</em>'.
	 * @see org.angriff.eva.core.model.EvaPort#getPins()
	 * @see #getEvaPort()
	 * @generated
	 */
	EReference getEvaPort_Pins();

	/**
	 * Returns the meta object for class '{@link org.angriff.eva.core.model.EvaPin <em>Eva Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eva Pin</em>'.
	 * @see org.angriff.eva.core.model.EvaPin
	 * @generated
	 */
	EClass getEvaPin();

	/**
	 * Returns the meta object for the attribute '{@link org.angriff.eva.core.model.EvaPin#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.angriff.eva.core.model.EvaPin#getName()
	 * @see #getEvaPin()
	 * @generated
	 */
	EAttribute getEvaPin_Name();

	/**
	 * Returns the meta object for the container reference '{@link org.angriff.eva.core.model.EvaPin#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Port</em>'.
	 * @see org.angriff.eva.core.model.EvaPin#getPort()
	 * @see #getEvaPin()
	 * @generated
	 */
	EReference getEvaPin_Port();

	/**
	 * Returns the meta object for the attribute '{@link org.angriff.eva.core.model.EvaPin#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.angriff.eva.core.model.EvaPin#getType()
	 * @see #getEvaPin()
	 * @generated
	 */
	EAttribute getEvaPin_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.angriff.eva.core.model.EvaPin#getValidatorClass <em>Validator Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validator Class</em>'.
	 * @see org.angriff.eva.core.model.EvaPin#getValidatorClass()
	 * @see #getEvaPin()
	 * @generated
	 */
	EAttribute getEvaPin_ValidatorClass();

	/**
	 * Returns the meta object for the attribute '{@link org.angriff.eva.core.model.EvaPin#getValidatorDetail <em>Validator Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validator Detail</em>'.
	 * @see org.angriff.eva.core.model.EvaPin#getValidatorDetail()
	 * @see #getEvaPin()
	 * @generated
	 */
	EAttribute getEvaPin_ValidatorDetail();

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
	 * Returns the meta object for the attribute '{@link org.angriff.eva.core.model.EvaArgument#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.angriff.eva.core.model.EvaArgument#getName()
	 * @see #getEvaArgument()
	 * @generated
	 */
	EAttribute getEvaArgument_Name();

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
	 * Returns the meta object for enum '{@link org.angriff.eva.core.model.EvaComponentType <em>Eva Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Eva Component Type</em>'.
	 * @see org.angriff.eva.core.model.EvaComponentType
	 * @generated
	 */
	EEnum getEvaComponentType();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVA_COMPONENT_FACTORY_META__NAME = eINSTANCE.getEvaComponentFactoryMeta_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVA_COMPONENT_FACTORY_META__VERSION = eINSTANCE.getEvaComponentFactoryMeta_Version();

		/**
		 * The meta object literal for the '<em><b>Instance Parameters</b></em>' containment reference list feature.
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
		 * The meta object literal for the '<em><b>Factory Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVA_COMPONENT_META__FACTORY_ARGUMENTS = eINSTANCE.getEvaComponentMeta_FactoryArguments();

		/**
		 * The meta object literal for the '<em><b>Input Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVA_COMPONENT_META__INPUT_PORTS = eINSTANCE.getEvaComponentMeta_InputPorts();

		/**
		 * The meta object literal for the '<em><b>Output Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVA_COMPONENT_META__OUTPUT_PORTS = eINSTANCE.getEvaComponentMeta_OutputPorts();

		/**
		 * The meta object literal for the '<em><b>Synchronous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVA_COMPONENT_META__SYNCHRONOUS = eINSTANCE.getEvaComponentMeta_Synchronous();

		/**
		 * The meta object literal for the '<em><b>Serializable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVA_COMPONENT_META__SERIALIZABLE = eINSTANCE.getEvaComponentMeta_Serializable();

		/**
		 * The meta object literal for the '<em><b>Stateless</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVA_COMPONENT_META__STATELESS = eINSTANCE.getEvaComponentMeta_Stateless();

		/**
		 * The meta object literal for the '{@link org.angriff.eva.core.model.impl.EvaPortImpl <em>Eva Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.angriff.eva.core.model.impl.EvaPortImpl
		 * @see org.angriff.eva.core.model.impl.EvaModelPackageImpl#getEvaPort()
		 * @generated
		 */
		EClass EVA_PORT = eINSTANCE.getEvaPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVA_PORT__NAME = eINSTANCE.getEvaPort_Name();

		/**
		 * The meta object literal for the '<em><b>Pins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVA_PORT__PINS = eINSTANCE.getEvaPort_Pins();

		/**
		 * The meta object literal for the '{@link org.angriff.eva.core.model.impl.EvaPinImpl <em>Eva Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.angriff.eva.core.model.impl.EvaPinImpl
		 * @see org.angriff.eva.core.model.impl.EvaModelPackageImpl#getEvaPin()
		 * @generated
		 */
		EClass EVA_PIN = eINSTANCE.getEvaPin();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVA_PIN__NAME = eINSTANCE.getEvaPin_Name();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVA_PIN__PORT = eINSTANCE.getEvaPin_Port();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVA_PIN__TYPE = eINSTANCE.getEvaPin_Type();

		/**
		 * The meta object literal for the '<em><b>Validator Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVA_PIN__VALIDATOR_CLASS = eINSTANCE.getEvaPin_ValidatorClass();

		/**
		 * The meta object literal for the '<em><b>Validator Detail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVA_PIN__VALIDATOR_DETAIL = eINSTANCE.getEvaPin_ValidatorDetail();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVA_ARGUMENT__NAME = eINSTANCE.getEvaArgument_Name();

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
		 * The meta object literal for the '{@link org.angriff.eva.core.model.EvaComponentType <em>Eva Component Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.angriff.eva.core.model.EvaComponentType
		 * @see org.angriff.eva.core.model.impl.EvaModelPackageImpl#getEvaComponentType()
		 * @generated
		 */
		EEnum EVA_COMPONENT_TYPE = eINSTANCE.getEvaComponentType();

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
