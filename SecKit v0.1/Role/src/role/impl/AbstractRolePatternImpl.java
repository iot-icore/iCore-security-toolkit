/**
 */
package role.impl;

import models.impl.PatternImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import role.AbstractRolePattern;
import role.RolePackage;
import role.RoleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Role Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link role.impl.AbstractRolePatternImpl#getRoleType <em>Role Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractRolePatternImpl extends PatternImpl implements AbstractRolePattern {
    /**
     * The cached value of the '{@link #getRoleType() <em>Role Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRoleType()
     * @generated
     * @ordered
     */
    protected RoleType roleType;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AbstractRolePatternImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RolePackage.Literals.ABSTRACT_ROLE_PATTERN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RoleType getRoleType() {
        if (roleType != null && roleType.eIsProxy()) {
            InternalEObject oldRoleType = (InternalEObject)roleType;
            roleType = (RoleType)eResolveProxy(oldRoleType);
            if (roleType != oldRoleType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, RolePackage.ABSTRACT_ROLE_PATTERN__ROLE_TYPE, oldRoleType, roleType));
            }
        }
        return roleType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RoleType basicGetRoleType() {
        return roleType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRoleType(RoleType newRoleType) {
        RoleType oldRoleType = roleType;
        roleType = newRoleType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RolePackage.ABSTRACT_ROLE_PATTERN__ROLE_TYPE, oldRoleType, roleType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case RolePackage.ABSTRACT_ROLE_PATTERN__ROLE_TYPE:
                if (resolve) return getRoleType();
                return basicGetRoleType();
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
            case RolePackage.ABSTRACT_ROLE_PATTERN__ROLE_TYPE:
                setRoleType((RoleType)newValue);
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
            case RolePackage.ABSTRACT_ROLE_PATTERN__ROLE_TYPE:
                setRoleType((RoleType)null);
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
            case RolePackage.ABSTRACT_ROLE_PATTERN__ROLE_TYPE:
                return roleType != null;
        }
        return super.eIsSet(featureID);
    }

} //AbstractRolePatternImpl
