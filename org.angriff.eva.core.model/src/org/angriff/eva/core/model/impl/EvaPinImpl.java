/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.angriff.eva.core.model.impl;

import org.angriff.eva.core.model.EvaModelPackage;
import org.angriff.eva.core.model.EvaPin;
import org.angriff.eva.core.model.EvaPort;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eva Pin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.angriff.eva.core.model.impl.EvaPinImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.angriff.eva.core.model.impl.EvaPinImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.angriff.eva.core.model.impl.EvaPinImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.angriff.eva.core.model.impl.EvaPinImpl#getValidatorClass <em>Validator Class</em>}</li>
 *   <li>{@link org.angriff.eva.core.model.impl.EvaPinImpl#getValidatorDetail <em>Validator Detail</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EvaPinImpl extends EObjectImpl implements EvaPin {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidatorClass() <em>Validator Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidatorClass()
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATOR_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidatorClass() <em>Validator Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidatorClass()
	 * @generated
	 * @ordered
	 */
	protected String validatorClass = VALIDATOR_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidatorDetail() <em>Validator Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidatorDetail()
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATOR_DETAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidatorDetail() <em>Validator Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidatorDetail()
	 * @generated
	 * @ordered
	 */
	protected String validatorDetail = VALIDATOR_DETAIL_EDEFAULT;

	/**
	 * This is true if the Validator Detail attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean validatorDetailESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaPinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvaModelPackage.Literals.EVA_PIN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EvaModelPackage.EVA_PIN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaPort getPort() {
		if (eContainerFeatureID() != EvaModelPackage.EVA_PIN__PORT) return null;
		return (EvaPort)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPort(EvaPort newPort, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPort, EvaModelPackage.EVA_PIN__PORT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(EvaPort newPort) {
		if (newPort != eInternalContainer() || (eContainerFeatureID() != EvaModelPackage.EVA_PIN__PORT && newPort != null)) {
			if (EcoreUtil.isAncestor(this, newPort))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPort != null)
				msgs = ((InternalEObject)newPort).eInverseAdd(this, EvaModelPackage.EVA_PORT__PINS, EvaPort.class, msgs);
			msgs = basicSetPort(newPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvaModelPackage.EVA_PIN__PORT, newPort, newPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvaModelPackage.EVA_PIN__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValidatorClass() {
		return validatorClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidatorClass(String newValidatorClass) {
		String oldValidatorClass = validatorClass;
		validatorClass = newValidatorClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvaModelPackage.EVA_PIN__VALIDATOR_CLASS, oldValidatorClass, validatorClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValidatorDetail() {
		return validatorDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidatorDetail(String newValidatorDetail) {
		String oldValidatorDetail = validatorDetail;
		validatorDetail = newValidatorDetail;
		boolean oldValidatorDetailESet = validatorDetailESet;
		validatorDetailESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvaModelPackage.EVA_PIN__VALIDATOR_DETAIL, oldValidatorDetail, validatorDetail, !oldValidatorDetailESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValidatorDetail() {
		String oldValidatorDetail = validatorDetail;
		boolean oldValidatorDetailESet = validatorDetailESet;
		validatorDetail = VALIDATOR_DETAIL_EDEFAULT;
		validatorDetailESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EvaModelPackage.EVA_PIN__VALIDATOR_DETAIL, oldValidatorDetail, VALIDATOR_DETAIL_EDEFAULT, oldValidatorDetailESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValidatorDetail() {
		return validatorDetailESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EvaModelPackage.EVA_PIN__PORT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPort((EvaPort)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EvaModelPackage.EVA_PIN__PORT:
				return basicSetPort(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case EvaModelPackage.EVA_PIN__PORT:
				return eInternalContainer().eInverseRemove(this, EvaModelPackage.EVA_PORT__PINS, EvaPort.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvaModelPackage.EVA_PIN__NAME:
				return getName();
			case EvaModelPackage.EVA_PIN__PORT:
				return getPort();
			case EvaModelPackage.EVA_PIN__TYPE:
				return getType();
			case EvaModelPackage.EVA_PIN__VALIDATOR_CLASS:
				return getValidatorClass();
			case EvaModelPackage.EVA_PIN__VALIDATOR_DETAIL:
				return getValidatorDetail();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EvaModelPackage.EVA_PIN__NAME:
				setName((String)newValue);
				return;
			case EvaModelPackage.EVA_PIN__PORT:
				setPort((EvaPort)newValue);
				return;
			case EvaModelPackage.EVA_PIN__TYPE:
				setType((String)newValue);
				return;
			case EvaModelPackage.EVA_PIN__VALIDATOR_CLASS:
				setValidatorClass((String)newValue);
				return;
			case EvaModelPackage.EVA_PIN__VALIDATOR_DETAIL:
				setValidatorDetail((String)newValue);
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
			case EvaModelPackage.EVA_PIN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EvaModelPackage.EVA_PIN__PORT:
				setPort((EvaPort)null);
				return;
			case EvaModelPackage.EVA_PIN__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case EvaModelPackage.EVA_PIN__VALIDATOR_CLASS:
				setValidatorClass(VALIDATOR_CLASS_EDEFAULT);
				return;
			case EvaModelPackage.EVA_PIN__VALIDATOR_DETAIL:
				unsetValidatorDetail();
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
			case EvaModelPackage.EVA_PIN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EvaModelPackage.EVA_PIN__PORT:
				return getPort() != null;
			case EvaModelPackage.EVA_PIN__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case EvaModelPackage.EVA_PIN__VALIDATOR_CLASS:
				return VALIDATOR_CLASS_EDEFAULT == null ? validatorClass != null : !VALIDATOR_CLASS_EDEFAULT.equals(validatorClass);
			case EvaModelPackage.EVA_PIN__VALIDATOR_DETAIL:
				return isSetValidatorDetail();
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
		result.append(", type: ");
		result.append(type);
		result.append(", validatorClass: ");
		result.append(validatorClass);
		result.append(", validatorDetail: ");
		if (validatorDetailESet) result.append(validatorDetail); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EvaPinImpl
