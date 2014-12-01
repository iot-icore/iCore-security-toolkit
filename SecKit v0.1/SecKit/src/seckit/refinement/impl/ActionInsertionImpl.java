/**
 */
package seckit.refinement.impl;

import behavior.instantiation.ActionInstantiation;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import seckit.refinement.ActionInsertion;
import seckit.refinement.RefinementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Insertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link seckit.refinement.impl.ActionInsertionImpl#getInsertedActions <em>Inserted Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionInsertionImpl extends CausalityRefinementImpl implements ActionInsertion {
    /**
     * The cached value of the '{@link #getInsertedActions() <em>Inserted Actions</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInsertedActions()
     * @generated
     * @ordered
     */
    protected EList<ActionInstantiation> insertedActions;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ActionInsertionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RefinementPackage.Literals.ACTION_INSERTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ActionInstantiation> getInsertedActions() {
        if (insertedActions == null) {
            insertedActions = new EObjectContainmentEList<ActionInstantiation>(ActionInstantiation.class, this, RefinementPackage.ACTION_INSERTION__INSERTED_ACTIONS);
        }
        return insertedActions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case RefinementPackage.ACTION_INSERTION__INSERTED_ACTIONS:
                return ((InternalEList<?>)getInsertedActions()).basicRemove(otherEnd, msgs);
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
            case RefinementPackage.ACTION_INSERTION__INSERTED_ACTIONS:
                return getInsertedActions();
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
            case RefinementPackage.ACTION_INSERTION__INSERTED_ACTIONS:
                getInsertedActions().clear();
                getInsertedActions().addAll((Collection<? extends ActionInstantiation>)newValue);
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
            case RefinementPackage.ACTION_INSERTION__INSERTED_ACTIONS:
                getInsertedActions().clear();
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
            case RefinementPackage.ACTION_INSERTION__INSERTED_ACTIONS:
                return insertedActions != null && !insertedActions.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ActionInsertionImpl
