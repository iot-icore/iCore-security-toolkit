/**
 */
package identity.instantiation.impl;

import identity.instance.AbstractIdentity;
import identity.instance.InstancePackage;

import identity.instantiation.IdentityInstantiation;
import identity.instantiation.InstantiationPackage;

import identity.type.IdentityType;
import identity.type.TypePackage;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identity Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link identity.instantiation.impl.IdentityInstantiationImpl#getType <em>Type</em>}</li>
 *   <li>{@link identity.instantiation.impl.IdentityInstantiationImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link identity.instantiation.impl.IdentityInstantiationImpl#getName <em>Name</em>}</li>
 *   <li>{@link identity.instantiation.impl.IdentityInstantiationImpl#isArray <em>Array</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdentityInstantiationImpl extends ElementImpl implements IdentityInstantiation {
    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected IdentityType type;

    /**
     * The cached value of the '{@link #getInstances() <em>Instances</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstances()
     * @generated
     * @ordered
     */
    protected EList<AbstractIdentity> instances;

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
     * The default value of the '{@link #isArray() <em>Array</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isArray()
     * @generated
     * @ordered
     */
    protected static final boolean ARRAY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isArray() <em>Array</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isArray()
     * @generated
     * @ordered
     */
    protected boolean array = ARRAY_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IdentityInstantiationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstantiationPackage.Literals.IDENTITY_INSTANTIATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityType getType() {
        if (type != null && type.eIsProxy()) {
            InternalEObject oldType = (InternalEObject)type;
            type = (IdentityType)eResolveProxy(oldType);
            if (type != oldType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstantiationPackage.IDENTITY_INSTANTIATION__TYPE, oldType, type));
            }
        }
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityType basicGetType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetType(IdentityType newType, NotificationChain msgs) {
        IdentityType oldType = type;
        type = newType;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstantiationPackage.IDENTITY_INSTANTIATION__TYPE, oldType, newType);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(IdentityType newType) {
        if (newType != type) {
            NotificationChain msgs = null;
            if (type != null)
                msgs = ((InternalEObject)type).eInverseRemove(this, TypePackage.IDENTITY_TYPE__INSTANTIATIONS, IdentityType.class, msgs);
            if (newType != null)
                msgs = ((InternalEObject)newType).eInverseAdd(this, TypePackage.IDENTITY_TYPE__INSTANTIATIONS, IdentityType.class, msgs);
            msgs = basicSetType(newType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.IDENTITY_INSTANTIATION__TYPE, newType, newType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AbstractIdentity> getInstances() {
        if (instances == null) {
            instances = new EObjectWithInverseResolvingEList<AbstractIdentity>(AbstractIdentity.class, this, InstantiationPackage.IDENTITY_INSTANTIATION__INSTANCES, InstancePackage.ABSTRACT_IDENTITY__INSTANTIATION);
        }
        return instances;
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
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.IDENTITY_INSTANTIATION__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isArray() {
        return array;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setArray(boolean newArray) {
        boolean oldArray = array;
        array = newArray;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.IDENTITY_INSTANTIATION__ARRAY, oldArray, array));
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
            case InstantiationPackage.IDENTITY_INSTANTIATION__TYPE:
                if (type != null)
                    msgs = ((InternalEObject)type).eInverseRemove(this, TypePackage.IDENTITY_TYPE__INSTANTIATIONS, IdentityType.class, msgs);
                return basicSetType((IdentityType)otherEnd, msgs);
            case InstantiationPackage.IDENTITY_INSTANTIATION__INSTANCES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstances()).basicAdd(otherEnd, msgs);
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
            case InstantiationPackage.IDENTITY_INSTANTIATION__TYPE:
                return basicSetType(null, msgs);
            case InstantiationPackage.IDENTITY_INSTANTIATION__INSTANCES:
                return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
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
            case InstantiationPackage.IDENTITY_INSTANTIATION__TYPE:
                if (resolve) return getType();
                return basicGetType();
            case InstantiationPackage.IDENTITY_INSTANTIATION__INSTANCES:
                return getInstances();
            case InstantiationPackage.IDENTITY_INSTANTIATION__NAME:
                return getName();
            case InstantiationPackage.IDENTITY_INSTANTIATION__ARRAY:
                return isArray();
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
            case InstantiationPackage.IDENTITY_INSTANTIATION__TYPE:
                setType((IdentityType)newValue);
                return;
            case InstantiationPackage.IDENTITY_INSTANTIATION__INSTANCES:
                getInstances().clear();
                getInstances().addAll((Collection<? extends AbstractIdentity>)newValue);
                return;
            case InstantiationPackage.IDENTITY_INSTANTIATION__NAME:
                setName((String)newValue);
                return;
            case InstantiationPackage.IDENTITY_INSTANTIATION__ARRAY:
                setArray((Boolean)newValue);
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
            case InstantiationPackage.IDENTITY_INSTANTIATION__TYPE:
                setType((IdentityType)null);
                return;
            case InstantiationPackage.IDENTITY_INSTANTIATION__INSTANCES:
                getInstances().clear();
                return;
            case InstantiationPackage.IDENTITY_INSTANTIATION__NAME:
                setName(NAME_EDEFAULT);
                return;
            case InstantiationPackage.IDENTITY_INSTANTIATION__ARRAY:
                setArray(ARRAY_EDEFAULT);
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
            case InstantiationPackage.IDENTITY_INSTANTIATION__TYPE:
                return type != null;
            case InstantiationPackage.IDENTITY_INSTANTIATION__INSTANCES:
                return instances != null && !instances.isEmpty();
            case InstantiationPackage.IDENTITY_INSTANTIATION__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case InstantiationPackage.IDENTITY_INSTANTIATION__ARRAY:
                return array != ARRAY_EDEFAULT;
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
        result.append(", array: ");
        result.append(array);
        result.append(')');
        return result.toString();
    }

} //IdentityInstantiationImpl
