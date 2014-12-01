/**
 */
package data.pattern.impl;

import data.instantiation.DataInstantiation;
import data.instantiation.InstantiationPackage;

import data.pattern.DataPattern;
import data.pattern.PatternPackage;

import data.type.DataType;

import data.variable.DataVariable;

import java.util.Collection;

import models.impl.PatternImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.pattern.impl.DataPatternImpl#getType <em>Type</em>}</li>
 *   <li>{@link data.pattern.impl.DataPatternImpl#getInstantiation <em>Instantiation</em>}</li>
 *   <li>{@link data.pattern.impl.DataPatternImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link data.pattern.impl.DataPatternImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataPatternImpl extends PatternImpl implements DataPattern {
    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected DataType type;

    /**
     * The cached value of the '{@link #getInstantiation() <em>Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstantiation()
     * @generated
     * @ordered
     */
    protected DataInstantiation instantiation;

    /**
     * The cached value of the '{@link #getVariables() <em>Variables</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariables()
     * @generated
     * @ordered
     */
    protected EList<DataVariable> variables;

    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final String VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected String value = VALUE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataPatternImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PatternPackage.Literals.DATA_PATTERN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataType getType() {
        if (type != null && type.eIsProxy()) {
            InternalEObject oldType = (InternalEObject)type;
            type = (DataType)eResolveProxy(oldType);
            if (type != oldType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.DATA_PATTERN__TYPE, oldType, type));
            }
        }
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataType basicGetType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(DataType newType) {
        DataType oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.DATA_PATTERN__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataInstantiation getInstantiation() {
        if (instantiation != null && instantiation.eIsProxy()) {
            InternalEObject oldInstantiation = (InternalEObject)instantiation;
            instantiation = (DataInstantiation)eResolveProxy(oldInstantiation);
            if (instantiation != oldInstantiation) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.DATA_PATTERN__INSTANTIATION, oldInstantiation, instantiation));
            }
        }
        return instantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataInstantiation basicGetInstantiation() {
        return instantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInstantiation(DataInstantiation newInstantiation, NotificationChain msgs) {
        DataInstantiation oldInstantiation = instantiation;
        instantiation = newInstantiation;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternPackage.DATA_PATTERN__INSTANTIATION, oldInstantiation, newInstantiation);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInstantiation(DataInstantiation newInstantiation) {
        if (newInstantiation != instantiation) {
            NotificationChain msgs = null;
            if (instantiation != null)
                msgs = ((InternalEObject)instantiation).eInverseRemove(this, InstantiationPackage.DATA_INSTANTIATION__PATTERNS, DataInstantiation.class, msgs);
            if (newInstantiation != null)
                msgs = ((InternalEObject)newInstantiation).eInverseAdd(this, InstantiationPackage.DATA_INSTANTIATION__PATTERNS, DataInstantiation.class, msgs);
            msgs = basicSetInstantiation(newInstantiation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.DATA_PATTERN__INSTANTIATION, newInstantiation, newInstantiation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DataVariable> getVariables() {
        if (variables == null) {
            variables = new EObjectResolvingEList<DataVariable>(DataVariable.class, this, PatternPackage.DATA_PATTERN__VARIABLES);
        }
        return variables;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValue(String newValue) {
        String oldValue = value;
        value = newValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.DATA_PATTERN__VALUE, oldValue, value));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PatternPackage.DATA_PATTERN__INSTANTIATION:
                if (instantiation != null)
                    msgs = ((InternalEObject)instantiation).eInverseRemove(this, InstantiationPackage.DATA_INSTANTIATION__PATTERNS, DataInstantiation.class, msgs);
                return basicSetInstantiation((DataInstantiation)otherEnd, msgs);
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
            case PatternPackage.DATA_PATTERN__INSTANTIATION:
                return basicSetInstantiation(null, msgs);
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
            case PatternPackage.DATA_PATTERN__TYPE:
                if (resolve) return getType();
                return basicGetType();
            case PatternPackage.DATA_PATTERN__INSTANTIATION:
                if (resolve) return getInstantiation();
                return basicGetInstantiation();
            case PatternPackage.DATA_PATTERN__VARIABLES:
                return getVariables();
            case PatternPackage.DATA_PATTERN__VALUE:
                return getValue();
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
            case PatternPackage.DATA_PATTERN__TYPE:
                setType((DataType)newValue);
                return;
            case PatternPackage.DATA_PATTERN__INSTANTIATION:
                setInstantiation((DataInstantiation)newValue);
                return;
            case PatternPackage.DATA_PATTERN__VARIABLES:
                getVariables().clear();
                getVariables().addAll((Collection<? extends DataVariable>)newValue);
                return;
            case PatternPackage.DATA_PATTERN__VALUE:
                setValue((String)newValue);
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
            case PatternPackage.DATA_PATTERN__TYPE:
                setType((DataType)null);
                return;
            case PatternPackage.DATA_PATTERN__INSTANTIATION:
                setInstantiation((DataInstantiation)null);
                return;
            case PatternPackage.DATA_PATTERN__VARIABLES:
                getVariables().clear();
                return;
            case PatternPackage.DATA_PATTERN__VALUE:
                setValue(VALUE_EDEFAULT);
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
            case PatternPackage.DATA_PATTERN__TYPE:
                return type != null;
            case PatternPackage.DATA_PATTERN__INSTANTIATION:
                return instantiation != null;
            case PatternPackage.DATA_PATTERN__VARIABLES:
                return variables != null && !variables.isEmpty();
            case PatternPackage.DATA_PATTERN__VALUE:
                return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
        result.append(" (value: ");
        result.append(value);
        result.append(')');
        return result.toString();
    }

} //DataPatternImpl
