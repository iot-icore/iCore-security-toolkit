/**
 */
package behavior.constraint.impl;

import behavior.constraint.ConstraintPackage;
import behavior.constraint.RangeOfValues;

import data.instance.Data;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range Of Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.constraint.impl.RangeOfValuesImpl#getLowerBoundInclusive <em>Lower Bound Inclusive</em>}</li>
 *   <li>{@link behavior.constraint.impl.RangeOfValuesImpl#getUpperBoundInclusive <em>Upper Bound Inclusive</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RangeOfValuesImpl extends ValueCheckingConstraintImpl implements RangeOfValues {
    /**
     * The cached value of the '{@link #getLowerBoundInclusive() <em>Lower Bound Inclusive</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLowerBoundInclusive()
     * @generated
     * @ordered
     */
    protected Data lowerBoundInclusive;

    /**
     * The cached value of the '{@link #getUpperBoundInclusive() <em>Upper Bound Inclusive</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpperBoundInclusive()
     * @generated
     * @ordered
     */
    protected Data upperBoundInclusive;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RangeOfValuesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ConstraintPackage.Literals.RANGE_OF_VALUES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Data getLowerBoundInclusive() {
        return lowerBoundInclusive;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLowerBoundInclusive(Data newLowerBoundInclusive, NotificationChain msgs) {
        Data oldLowerBoundInclusive = lowerBoundInclusive;
        lowerBoundInclusive = newLowerBoundInclusive;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConstraintPackage.RANGE_OF_VALUES__LOWER_BOUND_INCLUSIVE, oldLowerBoundInclusive, newLowerBoundInclusive);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLowerBoundInclusive(Data newLowerBoundInclusive) {
        if (newLowerBoundInclusive != lowerBoundInclusive) {
            NotificationChain msgs = null;
            if (lowerBoundInclusive != null)
                msgs = ((InternalEObject)lowerBoundInclusive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConstraintPackage.RANGE_OF_VALUES__LOWER_BOUND_INCLUSIVE, null, msgs);
            if (newLowerBoundInclusive != null)
                msgs = ((InternalEObject)newLowerBoundInclusive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConstraintPackage.RANGE_OF_VALUES__LOWER_BOUND_INCLUSIVE, null, msgs);
            msgs = basicSetLowerBoundInclusive(newLowerBoundInclusive, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.RANGE_OF_VALUES__LOWER_BOUND_INCLUSIVE, newLowerBoundInclusive, newLowerBoundInclusive));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Data getUpperBoundInclusive() {
        return upperBoundInclusive;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetUpperBoundInclusive(Data newUpperBoundInclusive, NotificationChain msgs) {
        Data oldUpperBoundInclusive = upperBoundInclusive;
        upperBoundInclusive = newUpperBoundInclusive;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConstraintPackage.RANGE_OF_VALUES__UPPER_BOUND_INCLUSIVE, oldUpperBoundInclusive, newUpperBoundInclusive);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUpperBoundInclusive(Data newUpperBoundInclusive) {
        if (newUpperBoundInclusive != upperBoundInclusive) {
            NotificationChain msgs = null;
            if (upperBoundInclusive != null)
                msgs = ((InternalEObject)upperBoundInclusive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConstraintPackage.RANGE_OF_VALUES__UPPER_BOUND_INCLUSIVE, null, msgs);
            if (newUpperBoundInclusive != null)
                msgs = ((InternalEObject)newUpperBoundInclusive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConstraintPackage.RANGE_OF_VALUES__UPPER_BOUND_INCLUSIVE, null, msgs);
            msgs = basicSetUpperBoundInclusive(newUpperBoundInclusive, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.RANGE_OF_VALUES__UPPER_BOUND_INCLUSIVE, newUpperBoundInclusive, newUpperBoundInclusive));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ConstraintPackage.RANGE_OF_VALUES__LOWER_BOUND_INCLUSIVE:
                return basicSetLowerBoundInclusive(null, msgs);
            case ConstraintPackage.RANGE_OF_VALUES__UPPER_BOUND_INCLUSIVE:
                return basicSetUpperBoundInclusive(null, msgs);
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
            case ConstraintPackage.RANGE_OF_VALUES__LOWER_BOUND_INCLUSIVE:
                return getLowerBoundInclusive();
            case ConstraintPackage.RANGE_OF_VALUES__UPPER_BOUND_INCLUSIVE:
                return getUpperBoundInclusive();
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
            case ConstraintPackage.RANGE_OF_VALUES__LOWER_BOUND_INCLUSIVE:
                setLowerBoundInclusive((Data)newValue);
                return;
            case ConstraintPackage.RANGE_OF_VALUES__UPPER_BOUND_INCLUSIVE:
                setUpperBoundInclusive((Data)newValue);
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
            case ConstraintPackage.RANGE_OF_VALUES__LOWER_BOUND_INCLUSIVE:
                setLowerBoundInclusive((Data)null);
                return;
            case ConstraintPackage.RANGE_OF_VALUES__UPPER_BOUND_INCLUSIVE:
                setUpperBoundInclusive((Data)null);
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
            case ConstraintPackage.RANGE_OF_VALUES__LOWER_BOUND_INCLUSIVE:
                return lowerBoundInclusive != null;
            case ConstraintPackage.RANGE_OF_VALUES__UPPER_BOUND_INCLUSIVE:
                return upperBoundInclusive != null;
        }
        return super.eIsSet(featureID);
    }

} //RangeOfValuesImpl
