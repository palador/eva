/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.angriff.eva.core.model.impl;

import java.util.Collection;

import org.angriff.eva.core.model.EvaArgument;
import org.angriff.eva.core.model.EvaComponentMeta;
import org.angriff.eva.core.model.EvaModelPackage;

import org.angriff.eva.core.model.EvaPort;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eva Component Meta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.angriff.eva.core.model.impl.EvaComponentMetaImpl#getFactory <em>Factory</em>}</li>
 *   <li>{@link org.angriff.eva.core.model.impl.EvaComponentMetaImpl#getFactoryArguments <em>Factory Arguments</em>}</li>
 *   <li>{@link org.angriff.eva.core.model.impl.EvaComponentMetaImpl#getInputPorts <em>Input Ports</em>}</li>
 *   <li>{@link org.angriff.eva.core.model.impl.EvaComponentMetaImpl#getOutputPorts <em>Output Ports</em>}</li>
 *   <li>{@link org.angriff.eva.core.model.impl.EvaComponentMetaImpl#isStateless <em>Stateless</em>}</li>
 *   <li>{@link org.angriff.eva.core.model.impl.EvaComponentMetaImpl#isSynchronous <em>Synchronous</em>}</li>
 *   <li>{@link org.angriff.eva.core.model.impl.EvaComponentMetaImpl#isSerializable <em>Serializable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EvaComponentMetaImpl extends EObjectImpl implements EvaComponentMeta {
	/**
	 * The cached value of the '{@link #getFactory() <em>Factory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactory()
	 * @generated
	 * @ordered
	 */
	protected EvaComponentMeta factory;

	/**
	 * The cached value of the '{@link #getFactoryArguments() <em>Factory Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactoryArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<EvaArgument> factoryArguments;

	/**
	 * The cached value of the '{@link #getInputPorts() <em>Input Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<EvaPort> inputPorts;

	/**
	 * The cached value of the '{@link #getOutputPorts() <em>Output Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<EvaPort> outputPorts;

	/**
	 * The default value of the '{@link #isStateless() <em>Stateless</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStateless()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATELESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStateless() <em>Stateless</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStateless()
	 * @generated
	 * @ordered
	 */
	protected boolean stateless = STATELESS_EDEFAULT;

	/**
	 * The default value of the '{@link #isSynchronous() <em>Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynchronous()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYNCHRONOUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSynchronous() <em>Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynchronous()
	 * @generated
	 * @ordered
	 */
	protected boolean synchronous = SYNCHRONOUS_EDEFAULT;

	/**
	 * The default value of the '{@link #isSerializable() <em>Serializable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSerializable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SERIALIZABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSerializable() <em>Serializable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSerializable()
	 * @generated
	 * @ordered
	 */
	protected boolean serializable = SERIALIZABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaComponentMetaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvaModelPackage.Literals.EVA_COMPONENT_META;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaComponentMeta getFactory() {
		if (factory != null && factory.eIsProxy()) {
			InternalEObject oldFactory = (InternalEObject)factory;
			factory = (EvaComponentMeta)eResolveProxy(oldFactory);
			if (factory != oldFactory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvaModelPackage.EVA_COMPONENT_META__FACTORY, oldFactory, factory));
			}
		}
		return factory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaComponentMeta basicGetFactory() {
		return factory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactory(EvaComponentMeta newFactory) {
		EvaComponentMeta oldFactory = factory;
		factory = newFactory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvaModelPackage.EVA_COMPONENT_META__FACTORY, oldFactory, factory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvaArgument> getFactoryArguments() {
		if (factoryArguments == null) {
			factoryArguments = new EObjectContainmentEList<EvaArgument>(EvaArgument.class, this, EvaModelPackage.EVA_COMPONENT_META__FACTORY_ARGUMENTS);
		}
		return factoryArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvaPort> getInputPorts() {
		if (inputPorts == null) {
			inputPorts = new EObjectContainmentEList<EvaPort>(EvaPort.class, this, EvaModelPackage.EVA_COMPONENT_META__INPUT_PORTS);
		}
		return inputPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvaPort> getOutputPorts() {
		if (outputPorts == null) {
			outputPorts = new EObjectContainmentEList<EvaPort>(EvaPort.class, this, EvaModelPackage.EVA_COMPONENT_META__OUTPUT_PORTS);
		}
		return outputPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSynchronous() {
		return synchronous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchronous(boolean newSynchronous) {
		boolean oldSynchronous = synchronous;
		synchronous = newSynchronous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvaModelPackage.EVA_COMPONENT_META__SYNCHRONOUS, oldSynchronous, synchronous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSerializable() {
		return serializable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSerializable(boolean newSerializable) {
		boolean oldSerializable = serializable;
		serializable = newSerializable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvaModelPackage.EVA_COMPONENT_META__SERIALIZABLE, oldSerializable, serializable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStateless() {
		return stateless;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateless(boolean newStateless) {
		boolean oldStateless = stateless;
		stateless = newStateless;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvaModelPackage.EVA_COMPONENT_META__STATELESS, oldStateless, stateless));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EvaModelPackage.EVA_COMPONENT_META__FACTORY_ARGUMENTS:
				return ((InternalEList<?>)getFactoryArguments()).basicRemove(otherEnd, msgs);
			case EvaModelPackage.EVA_COMPONENT_META__INPUT_PORTS:
				return ((InternalEList<?>)getInputPorts()).basicRemove(otherEnd, msgs);
			case EvaModelPackage.EVA_COMPONENT_META__OUTPUT_PORTS:
				return ((InternalEList<?>)getOutputPorts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvaModelPackage.EVA_COMPONENT_META__FACTORY:
				if (resolve) return getFactory();
				return basicGetFactory();
			case EvaModelPackage.EVA_COMPONENT_META__FACTORY_ARGUMENTS:
				return getFactoryArguments();
			case EvaModelPackage.EVA_COMPONENT_META__INPUT_PORTS:
				return getInputPorts();
			case EvaModelPackage.EVA_COMPONENT_META__OUTPUT_PORTS:
				return getOutputPorts();
			case EvaModelPackage.EVA_COMPONENT_META__STATELESS:
				return isStateless();
			case EvaModelPackage.EVA_COMPONENT_META__SYNCHRONOUS:
				return isSynchronous();
			case EvaModelPackage.EVA_COMPONENT_META__SERIALIZABLE:
				return isSerializable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EvaModelPackage.EVA_COMPONENT_META__FACTORY:
				setFactory((EvaComponentMeta)newValue);
				return;
			case EvaModelPackage.EVA_COMPONENT_META__FACTORY_ARGUMENTS:
				getFactoryArguments().clear();
				getFactoryArguments().addAll((Collection<? extends EvaArgument>)newValue);
				return;
			case EvaModelPackage.EVA_COMPONENT_META__INPUT_PORTS:
				getInputPorts().clear();
				getInputPorts().addAll((Collection<? extends EvaPort>)newValue);
				return;
			case EvaModelPackage.EVA_COMPONENT_META__OUTPUT_PORTS:
				getOutputPorts().clear();
				getOutputPorts().addAll((Collection<? extends EvaPort>)newValue);
				return;
			case EvaModelPackage.EVA_COMPONENT_META__STATELESS:
				setStateless((Boolean)newValue);
				return;
			case EvaModelPackage.EVA_COMPONENT_META__SYNCHRONOUS:
				setSynchronous((Boolean)newValue);
				return;
			case EvaModelPackage.EVA_COMPONENT_META__SERIALIZABLE:
				setSerializable((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EvaModelPackage.EVA_COMPONENT_META__FACTORY:
				setFactory((EvaComponentMeta)null);
				return;
			case EvaModelPackage.EVA_COMPONENT_META__FACTORY_ARGUMENTS:
				getFactoryArguments().clear();
				return;
			case EvaModelPackage.EVA_COMPONENT_META__INPUT_PORTS:
				getInputPorts().clear();
				return;
			case EvaModelPackage.EVA_COMPONENT_META__OUTPUT_PORTS:
				getOutputPorts().clear();
				return;
			case EvaModelPackage.EVA_COMPONENT_META__STATELESS:
				setStateless(STATELESS_EDEFAULT);
				return;
			case EvaModelPackage.EVA_COMPONENT_META__SYNCHRONOUS:
				setSynchronous(SYNCHRONOUS_EDEFAULT);
				return;
			case EvaModelPackage.EVA_COMPONENT_META__SERIALIZABLE:
				setSerializable(SERIALIZABLE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EvaModelPackage.EVA_COMPONENT_META__FACTORY:
				return factory != null;
			case EvaModelPackage.EVA_COMPONENT_META__FACTORY_ARGUMENTS:
				return factoryArguments != null && !factoryArguments.isEmpty();
			case EvaModelPackage.EVA_COMPONENT_META__INPUT_PORTS:
				return inputPorts != null && !inputPorts.isEmpty();
			case EvaModelPackage.EVA_COMPONENT_META__OUTPUT_PORTS:
				return outputPorts != null && !outputPorts.isEmpty();
			case EvaModelPackage.EVA_COMPONENT_META__STATELESS:
				return stateless != STATELESS_EDEFAULT;
			case EvaModelPackage.EVA_COMPONENT_META__SYNCHRONOUS:
				return synchronous != SYNCHRONOUS_EDEFAULT;
			case EvaModelPackage.EVA_COMPONENT_META__SERIALIZABLE:
				return serializable != SERIALIZABLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (stateless: ");
		result.append(stateless);
		result.append(", synchronous: ");
		result.append(synchronous);
		result.append(", serializable: ");
		result.append(serializable);
		result.append(')');
		return result.toString();
	}

} //EvaComponentMetaImpl
