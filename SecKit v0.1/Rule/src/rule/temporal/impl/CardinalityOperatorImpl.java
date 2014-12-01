/**
 */
package rule.temporal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rule.temporal.CardinalityOperator;
import rule.temporal.TemporalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cardinality Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rule.temporal.impl.CardinalityOperatorImpl#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CardinalityOperatorImpl extends PastTemporalOperatorImpl implements CardinalityOperator {
    /**
     * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpperBound()
     * @generated
     * @ordered
     */
    protected static final long UPPER_BOUND_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpperBound()
     * @generated
     * @ordered
     */
    protected long upperBound = UPPER_BOUND_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CardinalityOperatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TemporalPackage.Literals.CARDINALITY_OPERATOR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getUpperBound() {
        return upperBound;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUpperBound(long newUpperBound) {
        long oldUpperBound = upperBound;
        upperBound = newUpperBound;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TemporalPackage.CARDINALITY_OPERATOR__UPPER_BOUND, oldUpperBound, upperBound));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TemporalPackage.CARDINALITY_OPERATOR__UPPER_BOUND:
                return getUpperBound();
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
            case TemporalPackage.CARDINALITY_OPERATOR__UPPER_BOUND:
                setUpperBound((Long)newValue);
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
            case TemporalPackage.CARDINALITY_OPERATOR__UPPER_BOUND:
                setUpperBound(UPPER_BOUND_EDEFAULT);
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
            case TemporalPackage.CARDINALITY_OPERATOR__UPPER_BOUND:
                return upperBound != UPPER_BOUND_EDEFAULT;
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
        result.append(" (upperBound: ");
        result.append(upperBound);
        result.append(')');
        return result.toString();
    }

} //CardinalityOperatorImpl
