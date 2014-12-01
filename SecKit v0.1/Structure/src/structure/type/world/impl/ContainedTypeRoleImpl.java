/**
 */
package structure.type.world.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import structure.instantiation.EntityInstantiation;

import structure.type.world.ContainedTypeRole;
import structure.type.world.WorldPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contained Type Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link structure.type.world.impl.ContainedTypeRoleImpl#getLevels <em>Levels</em>}</li>
 *   <li>{@link structure.type.world.impl.ContainedTypeRoleImpl#getRooms <em>Rooms</em>}</li>
 *   <li>{@link structure.type.world.impl.ContainedTypeRoleImpl#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainedTypeRoleImpl extends MinimalEObjectImpl.Container implements ContainedTypeRole {
    /**
     * The cached value of the '{@link #getLevels() <em>Levels</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLevels()
     * @generated
     * @ordered
     */
    protected EList<EntityInstantiation> levels;

    /**
     * The cached value of the '{@link #getRooms() <em>Rooms</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRooms()
     * @generated
     * @ordered
     */
    protected EList<EntityInstantiation> rooms;

    /**
     * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRole()
     * @generated
     * @ordered
     */
    protected static final String ROLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRole()
     * @generated
     * @ordered
     */
    protected String role = ROLE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ContainedTypeRoleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return WorldPackage.Literals.CONTAINED_TYPE_ROLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EntityInstantiation> getLevels() {
        if (levels == null) {
            levels = new EObjectContainmentEList<EntityInstantiation>(EntityInstantiation.class, this, WorldPackage.CONTAINED_TYPE_ROLE__LEVELS);
        }
        return levels;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EntityInstantiation> getRooms() {
        if (rooms == null) {
            rooms = new EObjectContainmentEList<EntityInstantiation>(EntityInstantiation.class, this, WorldPackage.CONTAINED_TYPE_ROLE__ROOMS);
        }
        return rooms;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getRole() {
        return role;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRole(String newRole) {
        String oldRole = role;
        role = newRole;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WorldPackage.CONTAINED_TYPE_ROLE__ROLE, oldRole, role));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case WorldPackage.CONTAINED_TYPE_ROLE__LEVELS:
                return ((InternalEList<?>)getLevels()).basicRemove(otherEnd, msgs);
            case WorldPackage.CONTAINED_TYPE_ROLE__ROOMS:
                return ((InternalEList<?>)getRooms()).basicRemove(otherEnd, msgs);
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
            case WorldPackage.CONTAINED_TYPE_ROLE__LEVELS:
                return getLevels();
            case WorldPackage.CONTAINED_TYPE_ROLE__ROOMS:
                return getRooms();
            case WorldPackage.CONTAINED_TYPE_ROLE__ROLE:
                return getRole();
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
            case WorldPackage.CONTAINED_TYPE_ROLE__LEVELS:
                getLevels().clear();
                getLevels().addAll((Collection<? extends EntityInstantiation>)newValue);
                return;
            case WorldPackage.CONTAINED_TYPE_ROLE__ROOMS:
                getRooms().clear();
                getRooms().addAll((Collection<? extends EntityInstantiation>)newValue);
                return;
            case WorldPackage.CONTAINED_TYPE_ROLE__ROLE:
                setRole((String)newValue);
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
            case WorldPackage.CONTAINED_TYPE_ROLE__LEVELS:
                getLevels().clear();
                return;
            case WorldPackage.CONTAINED_TYPE_ROLE__ROOMS:
                getRooms().clear();
                return;
            case WorldPackage.CONTAINED_TYPE_ROLE__ROLE:
                setRole(ROLE_EDEFAULT);
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
            case WorldPackage.CONTAINED_TYPE_ROLE__LEVELS:
                return levels != null && !levels.isEmpty();
            case WorldPackage.CONTAINED_TYPE_ROLE__ROOMS:
                return rooms != null && !rooms.isEmpty();
            case WorldPackage.CONTAINED_TYPE_ROLE__ROLE:
                return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
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
        result.append(" (role: ");
        result.append(role);
        result.append(')');
        return result.toString();
    }

} //ContainedTypeRoleImpl
