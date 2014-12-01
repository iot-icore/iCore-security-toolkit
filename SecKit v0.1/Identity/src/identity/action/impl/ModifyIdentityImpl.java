/**
 */
package identity.action.impl;

import data.action.ModifyData;

import identity.action.ActionPackage;
import identity.action.ModifyIdentity;

import identity.instantiation.IdentityInstantiation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rule.action.impl.ModifyImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modify Identity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link identity.action.impl.ModifyIdentityImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link identity.action.impl.ModifyIdentityImpl#getModifyData <em>Modify Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModifyIdentityImpl extends ModifyImpl implements ModifyIdentity {
    /**
     * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTarget()
     * @generated
     * @ordered
     */
    protected IdentityInstantiation target;

    /**
     * The cached value of the '{@link #getModifyData() <em>Modify Data</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModifyData()
     * @generated
     * @ordered
     */
    protected EList<ModifyData> modifyData;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModifyIdentityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ActionPackage.Literals.MODIFY_IDENTITY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityInstantiation getTarget() {
        if (target != null && target.eIsProxy()) {
            InternalEObject oldTarget = (InternalEObject)target;
            target = (IdentityInstantiation)eResolveProxy(oldTarget);
            if (target != oldTarget) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActionPackage.MODIFY_IDENTITY__TARGET, oldTarget, target));
            }
        }
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityInstantiation basicGetTarget() {
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTarget(IdentityInstantiation newTarget) {
        IdentityInstantiation oldTarget = target;
        target = newTarget;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ActionPackage.MODIFY_IDENTITY__TARGET, oldTarget, target));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ModifyData> getModifyData() {
        if (modifyData == null) {
            modifyData = new EObjectContainmentEList<ModifyData>(ModifyData.class, this, ActionPackage.MODIFY_IDENTITY__MODIFY_DATA);
        }
        return modifyData;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ActionPackage.MODIFY_IDENTITY__MODIFY_DATA:
                return ((InternalEList<?>)getModifyData()).basicRemove(otherEnd, msgs);
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
            case ActionPackage.MODIFY_IDENTITY__TARGET:
                if (resolve) return getTarget();
                return basicGetTarget();
            case ActionPackage.MODIFY_IDENTITY__MODIFY_DATA:
                return getModifyData();
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
            case ActionPackage.MODIFY_IDENTITY__TARGET:
                setTarget((IdentityInstantiation)newValue);
                return;
            case ActionPackage.MODIFY_IDENTITY__MODIFY_DATA:
                getModifyData().clear();
                getModifyData().addAll((Collection<? extends ModifyData>)newValue);
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
            case ActionPackage.MODIFY_IDENTITY__TARGET:
                setTarget((IdentityInstantiation)null);
                return;
            case ActionPackage.MODIFY_IDENTITY__MODIFY_DATA:
                getModifyData().clear();
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
            case ActionPackage.MODIFY_IDENTITY__TARGET:
                return target != null;
            case ActionPackage.MODIFY_IDENTITY__MODIFY_DATA:
                return modifyData != null && !modifyData.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ModifyIdentityImpl
