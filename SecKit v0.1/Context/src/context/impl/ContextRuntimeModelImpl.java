/**
 */
package context.impl;

import context.ContextPackage;
import context.ContextRuntimeModel;

import context.instance.Context;
import context.instance.ContextSituation;

import java.util.Collection;

import models.impl.ModelImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runtime Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link context.impl.ContextRuntimeModelImpl#getSituations <em>Situations</em>}</li>
 *   <li>{@link context.impl.ContextRuntimeModelImpl#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextRuntimeModelImpl extends ModelImpl implements ContextRuntimeModel {
    /**
     * The cached value of the '{@link #getSituations() <em>Situations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSituations()
     * @generated
     * @ordered
     */
    protected EList<ContextSituation> situations;

    /**
     * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContext()
     * @generated
     * @ordered
     */
    protected EList<Context> context;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ContextRuntimeModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ContextPackage.Literals.CONTEXT_RUNTIME_MODEL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ContextSituation> getSituations() {
        if (situations == null) {
            situations = new EObjectContainmentEList<ContextSituation>(ContextSituation.class, this, ContextPackage.CONTEXT_RUNTIME_MODEL__SITUATIONS);
        }
        return situations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Context> getContext() {
        if (context == null) {
            context = new EObjectContainmentEList<Context>(Context.class, this, ContextPackage.CONTEXT_RUNTIME_MODEL__CONTEXT);
        }
        return context;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ContextPackage.CONTEXT_RUNTIME_MODEL__SITUATIONS:
                return ((InternalEList<?>)getSituations()).basicRemove(otherEnd, msgs);
            case ContextPackage.CONTEXT_RUNTIME_MODEL__CONTEXT:
                return ((InternalEList<?>)getContext()).basicRemove(otherEnd, msgs);
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
            case ContextPackage.CONTEXT_RUNTIME_MODEL__SITUATIONS:
                return getSituations();
            case ContextPackage.CONTEXT_RUNTIME_MODEL__CONTEXT:
                return getContext();
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
            case ContextPackage.CONTEXT_RUNTIME_MODEL__SITUATIONS:
                getSituations().clear();
                getSituations().addAll((Collection<? extends ContextSituation>)newValue);
                return;
            case ContextPackage.CONTEXT_RUNTIME_MODEL__CONTEXT:
                getContext().clear();
                getContext().addAll((Collection<? extends Context>)newValue);
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
            case ContextPackage.CONTEXT_RUNTIME_MODEL__SITUATIONS:
                getSituations().clear();
                return;
            case ContextPackage.CONTEXT_RUNTIME_MODEL__CONTEXT:
                getContext().clear();
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
            case ContextPackage.CONTEXT_RUNTIME_MODEL__SITUATIONS:
                return situations != null && !situations.isEmpty();
            case ContextPackage.CONTEXT_RUNTIME_MODEL__CONTEXT:
                return context != null && !context.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ContextRuntimeModelImpl
