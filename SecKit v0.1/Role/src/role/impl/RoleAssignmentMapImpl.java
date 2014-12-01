/**
 */
package role.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import role.RoleAssignment;
import role.RolePackage;
import role.RoleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link role.impl.RoleAssignmentMapImpl#getTypedKey <em>Key</em>}</li>
 *   <li>{@link role.impl.RoleAssignmentMapImpl#getTypedValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleAssignmentMapImpl extends MinimalEObjectImpl.Container implements BasicEMap.Entry<RoleType,RoleAssignment> {
    /**
     * The cached value of the '{@link #getTypedKey() <em>Key</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTypedKey()
     * @generated
     * @ordered
     */
    protected RoleType key;

    /**
     * The cached value of the '{@link #getTypedValue() <em>Value</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTypedValue()
     * @generated
     * @ordered
     */
    protected RoleAssignment value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RoleAssignmentMapImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RolePackage.Literals.ROLE_ASSIGNMENT_MAP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RoleType getTypedKey() {
        if (key != null && key.eIsProxy()) {
            InternalEObject oldKey = (InternalEObject)key;
            key = (RoleType)eResolveProxy(oldKey);
            if (key != oldKey) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, RolePackage.ROLE_ASSIGNMENT_MAP__KEY, oldKey, key));
            }
        }
        return key;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RoleType basicGetTypedKey() {
        return key;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTypedKey(RoleType newKey) {
        RoleType oldKey = key;
        key = newKey;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RolePackage.ROLE_ASSIGNMENT_MAP__KEY, oldKey, key));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RoleAssignment getTypedValue() {
        if (value != null && value.eIsProxy()) {
            InternalEObject oldValue = (InternalEObject)value;
            value = (RoleAssignment)eResolveProxy(oldValue);
            if (value != oldValue) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, RolePackage.ROLE_ASSIGNMENT_MAP__VALUE, oldValue, value));
            }
        }
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RoleAssignment basicGetTypedValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTypedValue(RoleAssignment newValue) {
        RoleAssignment oldValue = value;
        value = newValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RolePackage.ROLE_ASSIGNMENT_MAP__VALUE, oldValue, value));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case RolePackage.ROLE_ASSIGNMENT_MAP__KEY:
                if (resolve) return getTypedKey();
                return basicGetTypedKey();
            case RolePackage.ROLE_ASSIGNMENT_MAP__VALUE:
                if (resolve) return getTypedValue();
                return basicGetTypedValue();
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
            case RolePackage.ROLE_ASSIGNMENT_MAP__KEY:
                setTypedKey((RoleType)newValue);
                return;
            case RolePackage.ROLE_ASSIGNMENT_MAP__VALUE:
                setTypedValue((RoleAssignment)newValue);
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
            case RolePackage.ROLE_ASSIGNMENT_MAP__KEY:
                setTypedKey((RoleType)null);
                return;
            case RolePackage.ROLE_ASSIGNMENT_MAP__VALUE:
                setTypedValue((RoleAssignment)null);
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
            case RolePackage.ROLE_ASSIGNMENT_MAP__KEY:
                return key != null;
            case RolePackage.ROLE_ASSIGNMENT_MAP__VALUE:
                return value != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected int hash = -1;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getHash() {
        if (hash == -1) {
            Object theKey = getKey();
            hash = (theKey == null ? 0 : theKey.hashCode());
        }
        return hash;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHash(int hash) {
        this.hash = hash;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RoleType getKey() {
        return getTypedKey();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKey(RoleType key) {
        setTypedKey(key);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RoleAssignment getValue() {
        return getTypedValue();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RoleAssignment setValue(RoleAssignment value) {
        RoleAssignment oldValue = getValue();
        setTypedValue(value);
        return oldValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EMap<RoleType, RoleAssignment> getEMap() {
        EObject container = eContainer();
        return container == null ? null : (EMap<RoleType, RoleAssignment>)container.eGet(eContainmentFeature());
    }

} //RoleAssignmentMapImpl
