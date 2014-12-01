/**
 */
package context.instance.impl;

import context.instance.EntityRole;
import context.instance.InstancePackage;

import context.type.EntityRoleType;

import identity.instance.AbstractIdentity;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link context.instance.impl.EntityRoleImpl#getRoleType <em>Role Type</em>}</li>
 *   <li>{@link context.instance.impl.EntityRoleImpl#getIdentities <em>Identities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityRoleImpl extends MinimalEObjectImpl.Container implements EntityRole {
    /**
     * The cached value of the '{@link #getRoleType() <em>Role Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRoleType()
     * @generated
     * @ordered
     */
    protected EntityRoleType roleType;

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
    protected EntityRoleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstancePackage.Literals.ENTITY_ROLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityRoleType getRoleType() {
        if (roleType != null && roleType.eIsProxy()) {
            InternalEObject oldRoleType = (InternalEObject)roleType;
            roleType = (EntityRoleType)eResolveProxy(oldRoleType);
            if (roleType != oldRoleType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.ENTITY_ROLE__ROLE_TYPE, oldRoleType, roleType));
            }
        }
        return roleType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityRoleType basicGetRoleType() {
        return roleType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRoleType(EntityRoleType newRoleType) {
        EntityRoleType oldRoleType = roleType;
        roleType = newRoleType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.ENTITY_ROLE__ROLE_TYPE, oldRoleType, roleType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AbstractIdentity> getIdentities() {
        if (identities == null) {
            identities = new EObjectResolvingEList<AbstractIdentity>(AbstractIdentity.class, this, InstancePackage.ENTITY_ROLE__IDENTITIES);
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
            case InstancePackage.ENTITY_ROLE__ROLE_TYPE:
                if (resolve) return getRoleType();
                return basicGetRoleType();
            case InstancePackage.ENTITY_ROLE__IDENTITIES:
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
            case InstancePackage.ENTITY_ROLE__ROLE_TYPE:
                setRoleType((EntityRoleType)newValue);
                return;
            case InstancePackage.ENTITY_ROLE__IDENTITIES:
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
            case InstancePackage.ENTITY_ROLE__ROLE_TYPE:
                setRoleType((EntityRoleType)null);
                return;
            case InstancePackage.ENTITY_ROLE__IDENTITIES:
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
            case InstancePackage.ENTITY_ROLE__ROLE_TYPE:
                return roleType != null;
            case InstancePackage.ENTITY_ROLE__IDENTITIES:
                return identities != null && !identities.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //EntityRoleImpl
