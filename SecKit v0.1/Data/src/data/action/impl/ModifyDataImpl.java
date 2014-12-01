/**
 */
package data.action.impl;

import data.action.ActionPackage;
import data.action.ModifyData;

import data.instantiation.DataInstantiationHierarchy;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rule.action.impl.ModifyImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modify Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.action.impl.ModifyDataImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link data.action.impl.ModifyDataImpl#getNewValue <em>New Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModifyDataImpl extends ModifyImpl implements ModifyData {
    /**
     * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTarget()
     * @generated
     * @ordered
     */
    protected DataInstantiationHierarchy target;

    /**
     * The default value of the '{@link #getNewValue() <em>New Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNewValue()
     * @generated
     * @ordered
     */
    protected static final String NEW_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNewValue() <em>New Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNewValue()
     * @generated
     * @ordered
     */
    protected String newValue = NEW_VALUE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModifyDataImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ActionPackage.Literals.MODIFY_DATA;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataInstantiationHierarchy getTarget() {
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTarget(DataInstantiationHierarchy newTarget, NotificationChain msgs) {
        DataInstantiationHierarchy oldTarget = target;
        target = newTarget;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActionPackage.MODIFY_DATA__TARGET, oldTarget, newTarget);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTarget(DataInstantiationHierarchy newTarget) {
        if (newTarget != target) {
            NotificationChain msgs = null;
            if (target != null)
                msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActionPackage.MODIFY_DATA__TARGET, null, msgs);
            if (newTarget != null)
                msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActionPackage.MODIFY_DATA__TARGET, null, msgs);
            msgs = basicSetTarget(newTarget, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ActionPackage.MODIFY_DATA__TARGET, newTarget, newTarget));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getNewValue() {
        return newValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNewValue(String newNewValue) {
        String oldNewValue = newValue;
        newValue = newNewValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ActionPackage.MODIFY_DATA__NEW_VALUE, oldNewValue, newValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ActionPackage.MODIFY_DATA__TARGET:
                return basicSetTarget(null, msgs);
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
            case ActionPackage.MODIFY_DATA__TARGET:
                return getTarget();
            case ActionPackage.MODIFY_DATA__NEW_VALUE:
                return getNewValue();
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
            case ActionPackage.MODIFY_DATA__TARGET:
                setTarget((DataInstantiationHierarchy)newValue);
                return;
            case ActionPackage.MODIFY_DATA__NEW_VALUE:
                setNewValue((String)newValue);
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
            case ActionPackage.MODIFY_DATA__TARGET:
                setTarget((DataInstantiationHierarchy)null);
                return;
            case ActionPackage.MODIFY_DATA__NEW_VALUE:
                setNewValue(NEW_VALUE_EDEFAULT);
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
            case ActionPackage.MODIFY_DATA__TARGET:
                return target != null;
            case ActionPackage.MODIFY_DATA__NEW_VALUE:
                return NEW_VALUE_EDEFAULT == null ? newValue != null : !NEW_VALUE_EDEFAULT.equals(newValue);
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
        result.append(" (newValue: ");
        result.append(newValue);
        result.append(')');
        return result.toString();
    }

} //ModifyDataImpl
