/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.angriff.eva.core.model.impl;

import org.angriff.eva.core.model.EvaArgument;
import org.angriff.eva.core.model.EvaComponentFactoryMeta;
import org.angriff.eva.core.model.EvaComponentMeta;
import org.angriff.eva.core.model.EvaComponentType;
import org.angriff.eva.core.model.EvaModelFactory;
import org.angriff.eva.core.model.EvaModelPackage;
import org.angriff.eva.core.model.EvaParameter;
import org.angriff.eva.core.model.EvaParameterType;

import org.angriff.eva.core.model.EvaPin;
import org.angriff.eva.core.model.EvaPort;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EvaModelPackageImpl extends EPackageImpl implements EvaModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaComponentFactoryMetaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaComponentMetaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum evaComponentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum evaParameterTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.angriff.eva.core.model.EvaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EvaModelPackageImpl() {
		super(eNS_URI, EvaModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EvaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EvaModelPackage init() {
		if (isInited) return (EvaModelPackage)EPackage.Registry.INSTANCE.getEPackage(EvaModelPackage.eNS_URI);

		// Obtain or create and register package
		EvaModelPackageImpl theEvaModelPackage = (EvaModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EvaModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EvaModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEvaModelPackage.createPackageContents();

		// Initialize created meta-data
		theEvaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEvaModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EvaModelPackage.eNS_URI, theEvaModelPackage);
		return theEvaModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaComponentFactoryMeta() {
		return evaComponentFactoryMetaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaComponentFactoryMeta_Name() {
		return (EAttribute)evaComponentFactoryMetaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaComponentFactoryMeta_Version() {
		return (EAttribute)evaComponentFactoryMetaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaComponentFactoryMeta_InstanceParameters() {
		return (EReference)evaComponentFactoryMetaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaComponentMeta() {
		return evaComponentMetaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaComponentMeta_Factory() {
		return (EReference)evaComponentMetaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaComponentMeta_FactoryArguments() {
		return (EReference)evaComponentMetaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaComponentMeta_InputPorts() {
		return (EReference)evaComponentMetaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaComponentMeta_OutputPorts() {
		return (EReference)evaComponentMetaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaComponentMeta_Synchronous() {
		return (EAttribute)evaComponentMetaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaComponentMeta_Serializable() {
		return (EAttribute)evaComponentMetaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaComponentMeta_Stateless() {
		return (EAttribute)evaComponentMetaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaPort() {
		return evaPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaPort_Name() {
		return (EAttribute)evaPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaPort_Pins() {
		return (EReference)evaPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaPin() {
		return evaPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaPin_Name() {
		return (EAttribute)evaPinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaPin_Port() {
		return (EReference)evaPinEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaPin_Type() {
		return (EAttribute)evaPinEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaPin_ValidatorClass() {
		return (EAttribute)evaPinEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaPin_ValidatorDetail() {
		return (EAttribute)evaPinEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaParameter() {
		return evaParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaParameter_Name() {
		return (EAttribute)evaParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaParameter_Type() {
		return (EAttribute)evaParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaArgument() {
		return evaArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaArgument_Name() {
		return (EAttribute)evaArgumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaArgument_Parameter() {
		return (EReference)evaArgumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaArgument_Value() {
		return (EAttribute)evaArgumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEvaComponentType() {
		return evaComponentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEvaParameterType() {
		return evaParameterTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaModelFactory getEvaModelFactory() {
		return (EvaModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		evaComponentFactoryMetaEClass = createEClass(EVA_COMPONENT_FACTORY_META);
		createEAttribute(evaComponentFactoryMetaEClass, EVA_COMPONENT_FACTORY_META__NAME);
		createEAttribute(evaComponentFactoryMetaEClass, EVA_COMPONENT_FACTORY_META__VERSION);
		createEReference(evaComponentFactoryMetaEClass, EVA_COMPONENT_FACTORY_META__INSTANCE_PARAMETERS);

		evaComponentMetaEClass = createEClass(EVA_COMPONENT_META);
		createEReference(evaComponentMetaEClass, EVA_COMPONENT_META__FACTORY);
		createEReference(evaComponentMetaEClass, EVA_COMPONENT_META__FACTORY_ARGUMENTS);
		createEReference(evaComponentMetaEClass, EVA_COMPONENT_META__INPUT_PORTS);
		createEReference(evaComponentMetaEClass, EVA_COMPONENT_META__OUTPUT_PORTS);
		createEAttribute(evaComponentMetaEClass, EVA_COMPONENT_META__STATELESS);
		createEAttribute(evaComponentMetaEClass, EVA_COMPONENT_META__SYNCHRONOUS);
		createEAttribute(evaComponentMetaEClass, EVA_COMPONENT_META__SERIALIZABLE);

		evaPortEClass = createEClass(EVA_PORT);
		createEAttribute(evaPortEClass, EVA_PORT__NAME);
		createEReference(evaPortEClass, EVA_PORT__PINS);

		evaPinEClass = createEClass(EVA_PIN);
		createEAttribute(evaPinEClass, EVA_PIN__NAME);
		createEReference(evaPinEClass, EVA_PIN__PORT);
		createEAttribute(evaPinEClass, EVA_PIN__TYPE);
		createEAttribute(evaPinEClass, EVA_PIN__VALIDATOR_CLASS);
		createEAttribute(evaPinEClass, EVA_PIN__VALIDATOR_DETAIL);

		evaParameterEClass = createEClass(EVA_PARAMETER);
		createEAttribute(evaParameterEClass, EVA_PARAMETER__NAME);
		createEAttribute(evaParameterEClass, EVA_PARAMETER__TYPE);

		evaArgumentEClass = createEClass(EVA_ARGUMENT);
		createEAttribute(evaArgumentEClass, EVA_ARGUMENT__NAME);
		createEReference(evaArgumentEClass, EVA_ARGUMENT__PARAMETER);
		createEAttribute(evaArgumentEClass, EVA_ARGUMENT__VALUE);

		// Create enums
		evaComponentTypeEEnum = createEEnum(EVA_COMPONENT_TYPE);
		evaParameterTypeEEnum = createEEnum(EVA_PARAMETER_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(evaComponentFactoryMetaEClass, EvaComponentFactoryMeta.class, "EvaComponentFactoryMeta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvaComponentFactoryMeta_Name(), ecorePackage.getEString(), "name", null, 1, 1, EvaComponentFactoryMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaComponentFactoryMeta_Version(), ecorePackage.getEString(), "version", null, 1, 1, EvaComponentFactoryMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaComponentFactoryMeta_InstanceParameters(), this.getEvaParameter(), null, "instanceParameters", null, 0, -1, EvaComponentFactoryMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getEvaComponentFactoryMeta_InstanceParameters().getEKeys().add(this.getEvaParameter_Name());

		initEClass(evaComponentMetaEClass, EvaComponentMeta.class, "EvaComponentMeta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvaComponentMeta_Factory(), this.getEvaComponentMeta(), null, "factory", null, 1, 1, EvaComponentMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaComponentMeta_FactoryArguments(), this.getEvaArgument(), null, "factoryArguments", null, 0, -1, EvaComponentMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getEvaComponentMeta_FactoryArguments().getEKeys().add(this.getEvaArgument_Name());
		initEReference(getEvaComponentMeta_InputPorts(), this.getEvaPort(), null, "inputPorts", null, 0, -1, EvaComponentMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getEvaComponentMeta_InputPorts().getEKeys().add(this.getEvaPort_Name());
		initEReference(getEvaComponentMeta_OutputPorts(), this.getEvaPort(), null, "outputPorts", null, 0, -1, EvaComponentMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getEvaComponentMeta_OutputPorts().getEKeys().add(this.getEvaPort_Name());
		initEAttribute(getEvaComponentMeta_Stateless(), ecorePackage.getEBoolean(), "stateless", null, 1, 1, EvaComponentMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaComponentMeta_Synchronous(), ecorePackage.getEBoolean(), "synchronous", null, 1, 1, EvaComponentMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaComponentMeta_Serializable(), ecorePackage.getEBoolean(), "serializable", null, 1, 1, EvaComponentMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evaPortEClass, EvaPort.class, "EvaPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvaPort_Name(), ecorePackage.getEString(), "name", null, 1, 1, EvaPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaPort_Pins(), this.getEvaPin(), this.getEvaPin_Port(), "pins", null, 1, -1, EvaPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getEvaPort_Pins().getEKeys().add(this.getEvaPin_Name());

		initEClass(evaPinEClass, EvaPin.class, "EvaPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvaPin_Name(), ecorePackage.getEString(), "name", null, 1, 1, EvaPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaPin_Port(), this.getEvaPort(), this.getEvaPort_Pins(), "port", null, 1, 1, EvaPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaPin_Type(), ecorePackage.getEString(), "type", null, 1, 1, EvaPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaPin_ValidatorClass(), ecorePackage.getEString(), "validatorClass", null, 1, 1, EvaPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaPin_ValidatorDetail(), ecorePackage.getEString(), "validatorDetail", null, 1, 1, EvaPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evaParameterEClass, EvaParameter.class, "EvaParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvaParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1, EvaParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaParameter_Type(), this.getEvaParameterType(), "type", null, 1, 1, EvaParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evaArgumentEClass, EvaArgument.class, "EvaArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvaArgument_Name(), ecorePackage.getEString(), "name", null, 1, 1, EvaArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaArgument_Parameter(), this.getEvaParameter(), null, "parameter", null, 1, 1, EvaArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaArgument_Value(), ecorePackage.getEString(), "value", null, 1, 1, EvaArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(evaComponentTypeEEnum, EvaComponentType.class, "EvaComponentType");
		addEEnumLiteral(evaComponentTypeEEnum, EvaComponentType.CONSTANT);
		addEEnumLiteral(evaComponentTypeEEnum, EvaComponentType.PRINTER);
		addEEnumLiteral(evaComponentTypeEEnum, EvaComponentType.FUNCTION);
		addEEnumLiteral(evaComponentTypeEEnum, EvaComponentType.SWITCH);
		addEEnumLiteral(evaComponentTypeEEnum, EvaComponentType.GENERATOR);
		addEEnumLiteral(evaComponentTypeEEnum, EvaComponentType.STORAGE);
		addEEnumLiteral(evaComponentTypeEEnum, EvaComponentType.AGGREGATOR);

		initEEnum(evaParameterTypeEEnum, EvaParameterType.class, "EvaParameterType");
		addEEnumLiteral(evaParameterTypeEEnum, EvaParameterType.STRING);
		addEEnumLiteral(evaParameterTypeEEnum, EvaParameterType.INTEGER);
		addEEnumLiteral(evaParameterTypeEEnum, EvaParameterType.DOUBLE);
		addEEnumLiteral(evaParameterTypeEEnum, EvaParameterType.FLAG);
		addEEnumLiteral(evaParameterTypeEEnum, EvaParameterType.CLASS);
		addEEnumLiteral(evaParameterTypeEEnum, EvaParameterType.SELECTABLE_ONE);
		addEEnumLiteral(evaParameterTypeEEnum, EvaParameterType.SELECTABLE_MANY);

		// Create resource
		createResource(eNS_URI);
	}

} //EvaModelPackageImpl
