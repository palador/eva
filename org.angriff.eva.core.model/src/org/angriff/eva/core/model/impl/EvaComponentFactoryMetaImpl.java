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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eva Component Factory Meta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.angriff.eva.core.model.impl.EvaComponentFactoryMetaImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.angriff.eva.core.model.impl.EvaComponentFactoryMetaImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.angriff.eva.core.model.impl.EvaComponentFactoryMetaImpl#getInstanceParameters <em>Instance Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EvaComponentFactoryMetaImpl extends EObjectImpl implements EvaComponentFactoryMeta {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	 * The cached value of the '{@link #getInstanceParameters() <em>Instance Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceParameters()
	 * @generated
	 * @ordered
	 */
	protected EList instanceParameters;

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
	protected EClass eStaticClass() {
		return EvaModelPackage.Literals.EVA_COMPONENT_FACTORY_META;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvaModelPackage.EVA_COMPONENT_FACTORY_META__ID, oldId, id));
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
	public EList getInstanceParameters() {
		if (instanceParameters == null) {
			instanceParameters = new EObjectResolvingEList(EvaParameter.class, this, EvaModelPackage.EVA_COMPONENT_FACTORY_META__INSTANCE_PARAMETERS);
		}
		return instanceParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvaModelPackage.EVA_COMPONENT_FACTORY_META__ID:
				return getId();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EvaModelPackage.EVA_COMPONENT_FACTORY_META__ID:
				setId((String)newValue);
				return;
			case EvaModelPackage.EVA_COMPONENT_FACTORY_META__VERSION:
				setVersion((String)newValue);
				return;
			case EvaModelPackage.EVA_COMPONENT_FACTORY_META__INSTANCE_PARAMETERS:
				getInstanceParameters().clear();
				getInstanceParameters().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case EvaModelPackage.EVA_COMPONENT_FACTORY_META__ID:
				setId(ID_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EvaModelPackage.EVA_COMPONENT_FACTORY_META__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //EvaComponentFactoryMetaImpl
