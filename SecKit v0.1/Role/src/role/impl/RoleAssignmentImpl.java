/**
 */
package role.impl;

import identity.instance.AbstractIdentity;

import java.util.Collection;

import models.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import role.RoleAssignment;
import role.RolePackage;
import role.RoleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link role.impl.RoleAssignmentImpl#getRoleType <em>Role Type</em>}</li>
 *   <li>{@link role.impl.RoleAssignmentImpl#getIdentities <em>Identities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleAssignmentImpl extends ElementImpl implements RoleAssignment {
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
     * The cached value of the '{@link #getIdentities() <em>Identities</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdentities()
     * @generated
     * @ordered
     */
    protected EList<AbstractIdentity> identities;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RoleAssignmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RolePackage.Literals.ROLE_ASSIGNMENT;
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, RolePackage.ROLE_ASSIGNMENT__ROLE_TYPE, oldRoleType, roleType));
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
            eNotify(new ENotificationImpl(this, Notification.SET, RolePackage.ROLE_ASSIGNMENT__ROLE_TYPE, oldRoleType, roleType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AbstractIdentity> getIdentities() {
        if (identities == null) {
            identities = new EObjectResolvingEList<AbstractIdentity>(AbstractIdentity.class, this, RolePackage.ROLE_ASSIGNMENT__IDENTITIES);
        }
        return identities;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case RolePackage.ROLE_ASSIGNMENT__ROLE_TYPE:
                if (resolve) return getRoleType();
                return basicGetRoleType();
            case RolePackage.ROLE_ASSIGNMENT__IDENTITIES:
                return getIdentities();
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
            case RolePackage.ROLE_ASSIGNMENT__ROLE_TYPE:
                setRoleType((RoleType)newValue);
                return;
            case RolePackage.ROLE_ASSIGNMENT__IDENTITIES:
                getIdentities().clear();
                getIdentities().addAll((Collection<? extends AbstractIdentity>)newValue);
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
            case RolePackage.ROLE_ASSIGNMENT__ROLE_TYPE:
                setRoleType((RoleType)null);
                return;
            case RolePackage.ROLE_ASSIGNMENT__IDENTITIES:
                getIdentities().clear();
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
            case RolePackage.ROLE_ASSIGNMENT__ROLE_TYPE:
                return roleType != null;
            case RolePackage.ROLE_ASSIGNMENT__IDENTITIES:
                return identities != null && !identities.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //RoleAssignmentImpl
