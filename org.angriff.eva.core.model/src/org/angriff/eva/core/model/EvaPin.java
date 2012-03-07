/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.angriff.eva.core.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eva Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.angriff.eva.core.model.EvaPin#getName <em>Name</em>}</li>
 *   <li>{@link org.angriff.eva.core.model.EvaPin#getPort <em>Port</em>}</li>
 *   <li>{@link org.angriff.eva.core.model.EvaPin#getType <em>Type</em>}</li>
 *   <li>{@link org.angriff.eva.core.model.EvaPin#getValidatorClass <em>Validator Class</em>}</li>
 *   <li>{@link org.angriff.eva.core.model.EvaPin#getValidatorDetail <em>Validator Detail</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.angriff.eva.core.model.EvaModelPackage#getEvaPin()
 * @model
 * @generated
 */
public interface EvaPin extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.angriff.eva.core.model.EvaModelPackage#getEvaPin_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.angriff.eva.core.model.EvaPin#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.angriff.eva.core.model.EvaPort#getPins <em>Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' container reference.
	 * @see #setPort(EvaPort)
	 * @see org.angriff.eva.core.model.EvaModelPackage#getEvaPin_Port()
	 * @see org.angriff.eva.core.model.EvaPort#getPins
	 * @model opposite="pins" required="true" transient="false"
	 * @generated
	 */
	EvaPort getPort();

	/**
	 * Sets the value of the '{@link org.angriff.eva.core.model.EvaPin#getPort <em>Port</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' container reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(EvaPort value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.angriff.eva.core.model.EvaModelPackage#getEvaPin_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.angriff.eva.core.model.EvaPin#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Validator Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validator Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validator Class</em>' attribute.
	 * @see #setValidatorClass(String)
	 * @see org.angriff.eva.core.model.EvaModelPackage#getEvaPin_ValidatorClass()
	 * @model required="true"
	 * @generated
	 */
	String getValidatorClass();

	/**
	 * Sets the value of the '{@link org.angriff.eva.core.model.EvaPin#getValidatorClass <em>Validator Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validator Class</em>' attribute.
	 * @see #getValidatorClass()
	 * @generated
	 */
	void setValidatorClass(String value);

	/**
	 * Returns the value of the '<em><b>Validator Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validator Detail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validator Detail</em>' attribute.
	 * @see #isSetValidatorDetail()
	 * @see #unsetValidatorDetail()
	 * @see #setValidatorDetail(String)
	 * @see org.angriff.eva.core.model.EvaModelPackage#getEvaPin_ValidatorDetail()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	String getValidatorDetail();

	/**
	 * Sets the value of the '{@link org.angriff.eva.core.model.EvaPin#getValidatorDetail <em>Validator Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validator Detail</em>' attribute.
	 * @see #isSetValidatorDetail()
	 * @see #unsetValidatorDetail()
	 * @see #getValidatorDetail()
	 * @generated
	 */
	void setValidatorDetail(String value);

	/**
	 * Unsets the value of the '{@link org.angriff.eva.core.model.EvaPin#getValidatorDetail <em>Validator Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValidatorDetail()
	 * @see #getValidatorDetail()
	 * @see #setValidatorDetail(String)
	 * @generated
	 */
	void unsetValidatorDetail();

	/**
	 * Returns whether the value of the '{@link org.angriff.eva.core.model.EvaPin#getValidatorDetail <em>Validator Detail</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Validator Detail</em>' attribute is set.
	 * @see #unsetValidatorDetail()
	 * @see #getValidatorDetail()
	 * @see #setValidatorDetail(String)
	 * @generated
	 */
	boolean isSetValidatorDetail();

} // EvaPin
