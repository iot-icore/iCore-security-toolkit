/**
 */
package data.type.impl;

import data.type.LeadUnit;
import data.type.TrailUnit;
import data.type.TypePackage;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lead Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.type.impl.LeadUnitImpl#getValue <em>Value</em>}</li>
 *   <li>{@link data.type.impl.LeadUnitImpl#getTrailUnits <em>Trail Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LeadUnitImpl extends MinimalEObjectImpl.Container implements LeadUnit {
    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final byte[] VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected byte[] value = VALUE_EDEFAULT;

    /**
     * The cached value of the '{@link #getTrailUnits() <em>Trail Units</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrailUnits()
     * @generated
     * @ordered
     */
    protected EList<TrailUnit> trailUnits;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LeadUnitImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.LEAD_UNIT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public byte[] getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValue(byte[] newValue) {
        byte[] oldValue = value;
        value = newValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.LEAD_UNIT__VALUE, oldValue, value));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TrailUnit> getTrailUnits() {
        if (trailUnits == null) {
            trailUnits = new EObjectContainmentEList<TrailUnit>(TrailUnit.class, this, TypePackage.LEAD_UNIT__TRAIL_UNITS);
        }
        return trailUnits;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TypePackage.LEAD_UNIT__TRAIL_UNITS:
                return ((InternalEList<?>)getTrailUnits()).basicRemove(otherEnd, msgs);
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
            case TypePackage.LEAD_UNIT__VALUE:
                return getValue();
            case TypePackage.LEAD_UNIT__TRAIL_UNITS:
                return getTrailUnits();
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
            case TypePackage.LEAD_UNIT__VALUE:
                setValue((byte[])newValue);
                return;
            case TypePackage.LEAD_UNIT__TRAIL_UNITS:
                getTrailUnits().clear();
                getTrailUnits().addAll((Collection<? extends TrailUnit>)newValue);
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
            case TypePackage.LEAD_UNIT__VALUE:
                setValue(VALUE_EDEFAULT);
                return;
            case TypePackage.LEAD_UNIT__TRAIL_UNITS:
                getTrailUnits().clear();
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
            case TypePackage.LEAD_UNIT__VALUE:
                return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
            case TypePackage.LEAD_UNIT__TRAIL_UNITS:
                return trailUnits != null && !trailUnits.isEmpty();
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

} //LeadUnitImpl
