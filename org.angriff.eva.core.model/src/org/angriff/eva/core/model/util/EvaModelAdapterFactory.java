/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.angriff.eva.core.model.util;

import org.angriff.eva.core.model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.angriff.eva.core.model.EvaModelPackage
 * @generated
 */
public class EvaModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EvaModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EvaModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaModelSwitch<Adapter> modelSwitch =
		new EvaModelSwitch<Adapter>() {
			@Override
			public Adapter caseEvaComponentFactoryMeta(EvaComponentFactoryMeta object) {
				return createEvaComponentFactoryMetaAdapter();
			}
			@Override
			public Adapter caseEvaComponentMeta(EvaComponentMeta object) {
				return createEvaComponentMetaAdapter();
			}
			@Override
			public Adapter caseEvaParameter(EvaParameter object) {
				return createEvaParameterAdapter();
			}
			@Override
			public Adapter caseEvaArgument(EvaArgument object) {
				return createEvaArgumentAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.angriff.eva.core.model.EvaComponentFactoryMeta <em>Eva Component Factory Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.angriff.eva.core.model.EvaComponentFactoryMeta
	 * @generated
	 */
	public Adapter createEvaComponentFactoryMetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.angriff.eva.core.model.EvaComponentMeta <em>Eva Component Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.angriff.eva.core.model.EvaComponentMeta
	 * @generated
	 */
	public Adapter createEvaComponentMetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.angriff.eva.core.model.EvaParameter <em>Eva Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.angriff.eva.core.model.EvaParameter
	 * @generated
	 */
	public Adapter createEvaParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.angriff.eva.core.model.EvaArgument <em>Eva Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.angriff.eva.core.model.EvaArgument
	 * @generated
	 */
	public Adapter createEvaArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EvaModelAdapterFactory
