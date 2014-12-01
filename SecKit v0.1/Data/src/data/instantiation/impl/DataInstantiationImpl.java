/**
 */
package data.instantiation.impl;

import data.instance.Data;
import data.instance.InstancePackage;

import data.instantiation.DataInstantiation;
import data.instantiation.InstantiationPackage;

import data.pattern.DataPattern;
import data.pattern.PatternPackage;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Data Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.instantiation.impl.DataInstantiationImpl#getName <em>Name</em>}</li>
 *   <li>{@link data.instantiation.impl.DataInstantiationImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link data.instantiation.impl.DataInstantiationImpl#isArray <em>Array</em>}</li>
 *   <li>{@link data.instantiation.impl.DataInstantiationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link data.instantiation.impl.DataInstantiationImpl#getPatterns <em>Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataInstantiationImpl extends AbstractDataInstantiationImpl implements DataInstantiation {
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
     * The cached value of the '{@link #getInstances() <em>Instances</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstances()
     * @generated
     * @ordered
     */
    protected EList<Data> instances;

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
     * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected static final String DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected String description = DESCRIPTION_EDEFAULT;

    /**
     * The cached value of the '{@link #getPatterns() <em>Patterns</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPatterns()
     * @generated
     * @ordered
     */
    protected EList<DataPattern> patterns;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataInstantiationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstantiationPackage.Literals.DATA_INSTANTIATION;
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
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.DATA_INSTANTIATION__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Data> getInstances() {
        if (instances == null) {
            instances = new EObjectWithInverseResolvingEList<Data>(Data.class, this, InstantiationPackage.DATA_INSTANTIATION__INSTANCES, InstancePackage.DATA__INSTANTIATION);
        }
        return instances;
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
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.DATA_INSTANTIATION__ARRAY, oldArray, array));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDescription(String newDescription) {
        String oldDescription = description;
        description = newDescription;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.DATA_INSTANTIATION__DESCRIPTION, oldDescription, description));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DataPattern> getPatterns() {
        if (patterns == null) {
            patterns = new EObjectWithInverseResolvingEList<DataPattern>(DataPattern.class, this, InstantiationPackage.DATA_INSTANTIATION__PATTERNS, PatternPackage.DATA_PATTERN__INSTANTIATION);
        }
        return patterns;
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
            case InstantiationPackage.DATA_INSTANTIATION__INSTANCES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstances()).basicAdd(otherEnd, msgs);
            case InstantiationPackage.DATA_INSTANTIATION__PATTERNS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getPatterns()).basicAdd(otherEnd, msgs);
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
            case InstantiationPackage.DATA_INSTANTIATION__INSTANCES:
                return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
            case InstantiationPackage.DATA_INSTANTIATION__PATTERNS:
                return ((InternalEList<?>)getPatterns()).basicRemove(otherEnd, msgs);
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
            case InstantiationPackage.DATA_INSTANTIATION__NAME:
                return getName();
            case InstantiationPackage.DATA_INSTANTIATION__INSTANCES:
                return getInstances();
            case InstantiationPackage.DATA_INSTANTIATION__ARRAY:
                return isArray();
            case InstantiationPackage.DATA_INSTANTIATION__DESCRIPTION:
                return getDescription();
            case InstantiationPackage.DATA_INSTANTIATION__PATTERNS:
                return getPatterns();
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
            case InstantiationPackage.DATA_INSTANTIATION__NAME:
                setName((String)newValue);
                return;
            case InstantiationPackage.DATA_INSTANTIATION__INSTANCES:
                getInstances().clear();
                getInstances().addAll((Collection<? extends Data>)newValue);
                return;
            case InstantiationPackage.DATA_INSTANTIATION__ARRAY:
                setArray((Boolean)newValue);
                return;
            case InstantiationPackage.DATA_INSTANTIATION__DESCRIPTION:
                setDescription((String)newValue);
                return;
            case InstantiationPackage.DATA_INSTANTIATION__PATTERNS:
                getPatterns().clear();
                getPatterns().addAll((Collection<? extends DataPattern>)newValue);
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
            case InstantiationPackage.DATA_INSTANTIATION__NAME:
                setName(NAME_EDEFAULT);
                return;
            case InstantiationPackage.DATA_INSTANTIATION__INSTANCES:
                getInstances().clear();
                return;
            case InstantiationPackage.DATA_INSTANTIATION__ARRAY:
                setArray(ARRAY_EDEFAULT);
                return;
            case InstantiationPackage.DATA_INSTANTIATION__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
                return;
            case InstantiationPackage.DATA_INSTANTIATION__PATTERNS:
                getPatterns().clear();
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
            case InstantiationPackage.DATA_INSTANTIATION__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case InstantiationPackage.DATA_INSTANTIATION__INSTANCES:
                return instances != null && !instances.isEmpty();
            case InstantiationPackage.DATA_INSTANTIATION__ARRAY:
                return array != ARRAY_EDEFAULT;
            case InstantiationPackage.DATA_INSTANTIATION__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
            case InstantiationPackage.DATA_INSTANTIATION__PATTERNS:
                return patterns != null && !patterns.isEmpty();
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
        result.append(", description: ");
        result.append(description);
        result.append(')');
        return result.toString();
    }

} //DataInstantiationImpl
