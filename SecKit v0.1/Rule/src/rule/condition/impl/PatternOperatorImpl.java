/**
 */
package rule.condition.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rule.condition.ConditionPackage;
import rule.condition.PatternOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rule.condition.impl.PatternOperatorImpl#getOperands <em>Operands</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatternOperatorImpl extends MinimalEObjectImpl.Container implements PatternOperator {
    /**
     * The cached value of the '{@link #getOperands() <em>Operands</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperands()
     * @generated
     * @ordered
     */
    protected PatternOperator operands;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PatternOperatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ConditionPackage.Literals.PATTERN_OPERATOR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PatternOperator getOperands() {
        if (operands != null && operands.eIsProxy()) {
            InternalEObject oldOperands = (InternalEObject)operands;
            operands = (PatternOperator)eResolveProxy(oldOperands);
            if (operands != oldOperands) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConditionPackage.PATTERN_OPERATOR__OPERANDS, oldOperands, operands));
            }
        }
        return operands;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PatternOperator basicGetOperands() {
        return operands;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOperands(PatternOperator newOperands) {
        PatternOperator oldOperands = operands;
        operands = newOperands;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConditionPackage.PATTERN_OPERATOR__OPERANDS, oldOperands, operands));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ConditionPackage.PATTERN_OPERATOR__OPERANDS:
                if (resolve) return getOperands();
                return basicGetOperands();
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
            case ConditionPackage.PATTERN_OPERATOR__OPERANDS:
                setOperands((PatternOperator)newValue);
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
            case ConditionPackage.PATTERN_OPERATOR__OPERANDS:
                setOperands((PatternOperator)null);
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
            case ConditionPackage.PATTERN_OPERATOR__OPERANDS:
                return operands != null;
        }
        return super.eIsSet(featureID);
    }

} //PatternOperatorImpl
