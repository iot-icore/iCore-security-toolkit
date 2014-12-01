/**
 */
package rule.action.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import rule.action.ActionPackage;
import rule.action.Authorization;
import rule.action.Constraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rule.action.impl.ConstraintImpl#getAuthorization <em>Authorization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConstraintImpl extends ActionBehaviorImpl implements Constraint {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConstraintImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ActionPackage.Literals.CONSTRAINT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Authorization getAuthorization() {
        if (eContainerFeatureID() != ActionPackage.CONSTRAINT__AUTHORIZATION) return null;
        return (Authorization)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAuthorization(Authorization newAuthorization, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newAuthorization, ActionPackage.CONSTRAINT__AUTHORIZATION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAuthorization(Authorization newAuthorization) {
        if (newAuthorization != eInternalContainer() || (eContainerFeatureID() != ActionPackage.CONSTRAINT__AUTHORIZATION && newAuthorization != null)) {
            if (EcoreUtil.isAncestor(this, newAuthorization))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newAuthorization != null)
                msgs = ((InternalEObject)newAuthorization).eInverseAdd(this, ActionPackage.AUTHORIZATION__CONSTRAINTS, Authorization.class, msgs);
            msgs = basicSetAuthorization(newAuthorization, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ActionPackage.CONSTRAINT__AUTHORIZATION, newAuthorization, newAuthorization));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ActionPackage.CONSTRAINT__AUTHORIZATION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetAuthorization((Authorization)otherEnd, msgs);
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
            case ActionPackage.CONSTRAINT__AUTHORIZATION:
                return basicSetAuthorization(null, msgs);
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
            case ActionPackage.CONSTRAINT__AUTHORIZATION:
                return eInternalContainer().eInverseRemove(this, ActionPackage.AUTHORIZATION__CONSTRAINTS, Authorization.class, msgs);
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
            case ActionPackage.CONSTRAINT__AUTHORIZATION:
                return getAuthorization();
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
            case ActionPackage.CONSTRAINT__AUTHORIZATION:
                setAuthorization((Authorization)newValue);
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
            case ActionPackage.CONSTRAINT__AUTHORIZATION:
                setAuthorization((Authorization)null);
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
            case ActionPackage.CONSTRAINT__AUTHORIZATION:
                return getAuthorization() != null;
        }
        return super.eIsSet(featureID);
    }

} //ConstraintImpl
