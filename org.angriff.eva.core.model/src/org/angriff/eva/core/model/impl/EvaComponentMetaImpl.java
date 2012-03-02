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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eva Component Meta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.angriff.eva.core.model.impl.EvaComponentMetaImpl#getFactory <em>Factory</em>}</li>
 *   <li>{@link org.angriff.eva.core.model.impl.EvaComponentMetaImpl#getFactoryArguments <em>Factory Arguments</em>}</li>
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
	 * The cached value of the '{@link #getFactoryArguments() <em>Factory Arguments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactoryArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<EvaArgument> factoryArguments;

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
			factoryArguments = new EObjectResolvingEList<EvaArgument>(EvaArgument.class, this, EvaModelPackage.EVA_COMPONENT_META__FACTORY_ARGUMENTS);
		}
		return factoryArguments;
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
		}
		return super.eIsSet(featureID);
	}

} //EvaComponentMetaImpl
