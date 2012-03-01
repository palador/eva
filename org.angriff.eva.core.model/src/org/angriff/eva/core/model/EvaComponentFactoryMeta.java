/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.angriff.eva.core.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eva Component Factory Meta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.angriff.eva.core.model.EvaComponentFactoryMeta#getId <em>Id</em>}</li>
 *   <li>{@link org.angriff.eva.core.model.EvaComponentFactoryMeta#getVersion <em>Version</em>}</li>
 *   <li>{@link org.angriff.eva.core.model.EvaComponentFactoryMeta#getInstanceParameters <em>Instance Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.angriff.eva.core.model.EvaModelPackage#getEvaComponentFactoryMeta()
 * @model
 * @generated
 */
public interface EvaComponentFactoryMeta extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.angriff.eva.core.model.EvaModelPackage#getEvaComponentFactoryMeta_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.angriff.eva.core.model.EvaComponentFactoryMeta#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.angriff.eva.core.model.EvaModelPackage#getEvaComponentFactoryMeta_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.angriff.eva.core.model.EvaComponentFactoryMeta#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Instance Parameters</b></em>' reference list.
	 * The list contents are of type {@link org.angriff.eva.core.model.EvaParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Parameters</em>' reference list.
	 * @see org.angriff.eva.core.model.EvaModelPackage#getEvaComponentFactoryMeta_InstanceParameters()
	 * @model type="org.angriff.eva.core.model.EvaParameter"
	 * @generated
	 */
	EList getInstanceParameters();

} // EvaComponentFactoryMeta
