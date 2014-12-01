/**
 */
package role.impl;

import java.util.Collection;

import models.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import role.RolePackage;
import role.RoleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link role.impl.RoleTypeImpl#getSubRoles <em>Sub Roles</em>}</li>
 *   <li>{@link role.impl.RoleTypeImpl#getSuperRoles <em>Super Roles</em>}</li>
 *   <li>{@link role.impl.RoleTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleTypeImpl extends ElementImpl implements RoleType {
    /**
     * The cached value of the '{@link #getSubRoles() <em>Sub Roles</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubRoles()
     * @generated
     * @ordered
     */
    protected EList<RoleType> subRoles;

    /**
     * The cached value of the '{@link #getSuperRoles() <em>Super Roles</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSuperRoles()
     * @generated
     * @ordered
     */
    protected EList<RoleType> superRoles;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RoleTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RolePackage.Literals.ROLE_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RoleType> getSubRoles() {
        if (subRoles == null) {
            subRoles = new EObjectWithInverseResolvingEList.ManyInverse<RoleType>(RoleType.class, this, RolePackage.ROLE_TYPE__SUB_ROLES, RolePackage.ROLE_TYPE__SUPER_ROLES);
        }
        return subRoles;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RoleType> getSuperRoles() {
        if (superRoles == null) {
            superRoles = new EObjectWithInverseResolvingEList.ManyInverse<RoleType>(RoleType.class, this, RolePackage.ROLE_TYPE__SUPER_ROLES, RolePackage.ROLE_TYPE__SUB_ROLES);
        }
        return superRoles;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RolePackage.ROLE_TYPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case RolePackage.ROLE_TYPE__SUB_ROLES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubRoles()).basicAdd(otherEnd, msgs);
            case RolePackage.ROLE_TYPE__SUPER_ROLES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuperRoles()).basicAdd(otherEnd, msgs);
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
            case RolePackage.ROLE_TYPE__SUB_ROLES:
                return ((InternalEList<?>)getSubRoles()).basicRemove(otherEnd, msgs);
            case RolePackage.ROLE_TYPE__SUPER_ROLES:
                return ((InternalEList<?>)getSuperRoles()).basicRemove(otherEnd, msgs);
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
            case RolePackage.ROLE_TYPE__SUB_ROLES:
                return getSubRoles();
            case RolePackage.ROLE_TYPE__SUPER_ROLES:
                return getSuperRoles();
            case RolePackage.ROLE_TYPE__NAME:
                return getName();
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
            case RolePackage.ROLE_TYPE__SUB_ROLES:
                getSubRoles().clear();
                getSubRoles().addAll((Collection<? extends RoleType>)newValue);
                return;
            case RolePackage.ROLE_TYPE__SUPER_ROLES:
                getSuperRoles().clear();
                getSuperRoles().addAll((Collection<? extends RoleType>)newValue);
                return;
            case RolePackage.ROLE_TYPE__NAME:
                setName((String)newValue);
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
            case RolePackage.ROLE_TYPE__SUB_ROLES:
                getSubRoles().clear();
                return;
            case RolePackage.ROLE_TYPE__SUPER_ROLES:
                getSuperRoles().clear();
                return;
            case RolePackage.ROLE_TYPE__NAME:
                setName(NAME_EDEFAULT);
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
            case RolePackage.ROLE_TYPE__SUB_ROLES:
                return subRoles != null && !subRoles.isEmpty();
            case RolePackage.ROLE_TYPE__SUPER_ROLES:
                return superRoles != null && !superRoles.isEmpty();
            case RolePackage.ROLE_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
        result.append(" (name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //RoleTypeImpl
