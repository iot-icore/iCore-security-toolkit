/**
 */
package data.instance.impl;

import data.instance.AbstractDataInstance;
import data.instance.InstancePackage;

import models.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Data Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.instance.impl.AbstractDataInstanceImpl#getStringValue <em>String Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractDataInstanceImpl extends ElementImpl implements AbstractDataInstance {
    /**
     * The default value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStringValue()
     * @generated
     * @ordered
     */
    protected static final String STRING_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStringValue()
     * @generated
     * @ordered
     */
    protected String stringValue = STRING_VALUE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AbstractDataInstanceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstancePackage.Literals.ABSTRACT_DATA_INSTANCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getStringValue() {
        return stringValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStringValue(String newStringValue) {
        String oldStringValue = stringValue;
        stringValue = newStringValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.ABSTRACT_DATA_INSTANCE__STRING_VALUE, oldStringValue, stringValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case InstancePackage.ABSTRACT_DATA_INSTANCE__STRING_VALUE:
                return getStringValue();
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
            case InstancePackage.ABSTRACT_DATA_INSTANCE__STRING_VALUE:
                setStringValue((String)newValue);
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
            case InstancePackage.ABSTRACT_DATA_INSTANCE__STRING_VALUE:
                setStringValue(STRING_VALUE_EDEFAULT);
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
            case InstancePackage.ABSTRACT_DATA_INSTANCE__STRING_VALUE:
                return STRING_VALUE_EDEFAULT == null ? stringValue != null : !STRING_VALUE_EDEFAULT.equals(stringValue);
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
        result.append(" (stringValue: ");
        result.append(stringValue);
        result.append(')');
        return result.toString();
    }

} //AbstractDataInstanceImpl
