/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.angriff.eva.core.model.impl;

import java.util.Collection;

import org.angriff.eva.core.model.EvaComponentFactoryMeta;
import org.angriff.eva.core.model.EvaModelPackage;
import org.angriff.eva.core.model.EvaParameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eva Component Factory Meta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.angriff.eva.core.model.impl.EvaComponentFactoryMetaImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.angriff.eva.core.model.impl.EvaComponentFactoryMetaImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.angriff.eva.core.model.impl.EvaComponentFactoryMetaImpl#getInstanceParameters <em>Instance Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EvaComponentFactoryMetaImpl extends EObjectImpl implements EvaComponentFactoryMeta {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInstanceParameters() <em>Instance Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<EvaParameter> instanceParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaComponentFactoryMetaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvaModelPackage.Literals.EVA_COMPONENT_FACTORY_META;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvaModelPackage.EVA_COMPONENT_FACTORY_META__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvaModelPackage.EVA_COMPONENT_FACTORY_META__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvaParameter> getInstanceParameters() {
		if (instanceParameters == null) {
			instanceParameters = new EObjectContainmentEList<EvaParameter>(EvaParameter.class, this, EvaModelPackage.EVA_COMPONENT_FACTORY_META__INSTANCE_PARAMETERS);
		}
		return instanceParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EvaModelPackage.EVA_COMPONENT_FACTORY_META__INSTANCE_PARAMETERS:
				return ((InternalEList<?>)getInstanceParameters()).basicRemove(otherEnd, msgs);
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
			case EvaModelPackage.EVA_COMPONENT_FACTORY_META__NAME:
				return getName();
			case EvaModelPackage.EVA_COMPONENT_FACTORY_META__VERSION:
				return getVersion();
			case EvaModelPackage.EVA_COMPONENT_FACTORY_META__INSTANCE_PARAMETERS:
				return getInstanceParameters();
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
			case EvaModelPackage.EVA_COMPONENT_FACTORY_META__NAME:
				setName((String)newValue);
				return;
			case EvaModelPackage.EVA_COMPONENT_FACTORY_META__VERSION:
				setVersion((String)newValue);
				return;
			case EvaModelPackage.EVA_COMPONENT_FACTORY_META__INSTANCE_PARAMETERS:
				getInstanceParameters().clear();
				getInstanceParameters().addAll((Collection<? extends EvaParameter>)newValue);
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
			case EvaModelPackage.EVA_COMPONENT_FACTORY_META__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EvaModelPackage.EVA_COMPONENT_FACTORY_META__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case EvaModelPackage.EVA_COMPONENT_FACTORY_META__INSTANCE_PARAMETERS:
				getInstanceParameters().clear();
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
			case EvaModelPackage.EVA_COMPONENT_FACTORY_META__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EvaModelPackage.EVA_COMPONENT_FACTORY_META__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case EvaModelPackage.EVA_COMPONENT_FACTORY_META__INSTANCE_PARAMETERS:
				return instanceParameters != null && !instanceParameters.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //EvaComponentFactoryMetaImpl
