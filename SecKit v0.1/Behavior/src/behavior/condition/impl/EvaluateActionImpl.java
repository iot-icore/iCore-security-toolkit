/**
 */
package behavior.condition.impl;

import behavior.condition.ConditionPackage;
import behavior.condition.EvaluateAction;

import behavior.instantiation.ActionInstantiation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rule.condition.impl.AtomImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluate Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.condition.impl.EvaluateActionImpl#getActionInstantiation <em>Action Instantiation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EvaluateActionImpl extends AtomImpl implements EvaluateAction {
    /**
     * The cached value of the '{@link #getActionInstantiation() <em>Action Instantiation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActionInstantiation()
     * @generated
     * @ordered
     */
    protected ActionInstantiation actionInstantiation;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EvaluateActionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ConditionPackage.Literals.EVALUATE_ACTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActionInstantiation getActionInstantiation() {
        return actionInstantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetActionInstantiation(ActionInstantiation newActionInstantiation, NotificationChain msgs) {
        ActionInstantiation oldActionInstantiation = actionInstantiation;
        actionInstantiation = newActionInstantiation;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConditionPackage.EVALUATE_ACTION__ACTION_INSTANTIATION, oldActionInstantiation, newActionInstantiation);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setActionInstantiation(ActionInstantiation newActionInstantiation) {
        if (newActionInstantiation != actionInstantiation) {
            NotificationChain msgs = null;
            if (actionInstantiation != null)
                msgs = ((InternalEObject)actionInstantiation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConditionPackage.EVALUATE_ACTION__ACTION_INSTANTIATION, null, msgs);
            if (newActionInstantiation != null)
                msgs = ((InternalEObject)newActionInstantiation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConditionPackage.EVALUATE_ACTION__ACTION_INSTANTIATION, null, msgs);
            msgs = basicSetActionInstantiation(newActionInstantiation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConditionPackage.EVALUATE_ACTION__ACTION_INSTANTIATION, newActionInstantiation, newActionInstantiation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ConditionPackage.EVALUATE_ACTION__ACTION_INSTANTIATION:
                return basicSetActionInstantiation(null, msgs);
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
            case ConditionPackage.EVALUATE_ACTION__ACTION_INSTANTIATION:
                return getActionInstantiation();
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
            case ConditionPackage.EVALUATE_ACTION__ACTION_INSTANTIATION:
                setActionInstantiation((ActionInstantiation)newValue);
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
            case ConditionPackage.EVALUATE_ACTION__ACTION_INSTANTIATION:
                setActionInstantiation((ActionInstantiation)null);
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
            case ConditionPackage.EVALUATE_ACTION__ACTION_INSTANTIATION:
                return actionInstantiation != null;
        }
        return super.eIsSet(featureID);
    }

} //EvaluateActionImpl
