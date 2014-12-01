/**
 */
package behavior.causality.impl;

import behavior.causality.CausalityCondition;
import behavior.causality.CausalityPackage;
import behavior.causality.Uncertainty;

import models.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.causality.impl.CausalityConditionImpl#getUncertainty <em>Uncertainty</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CausalityConditionImpl extends ElementImpl implements CausalityCondition {
    /**
     * The default value of the '{@link #getUncertainty() <em>Uncertainty</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUncertainty()
     * @generated
     * @ordered
     */
    protected static final Uncertainty UNCERTAINTY_EDEFAULT = Uncertainty.MAY;

    /**
     * The cached value of the '{@link #getUncertainty() <em>Uncertainty</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUncertainty()
     * @generated
     * @ordered
     */
    protected Uncertainty uncertainty = UNCERTAINTY_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CausalityConditionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CausalityPackage.Literals.CAUSALITY_CONDITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Uncertainty getUncertainty() {
        return uncertainty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUncertainty(Uncertainty newUncertainty) {
        Uncertainty oldUncertainty = uncertainty;
        uncertainty = newUncertainty == null ? UNCERTAINTY_EDEFAULT : newUncertainty;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CausalityPackage.CAUSALITY_CONDITION__UNCERTAINTY, oldUncertainty, uncertainty));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CausalityPackage.CAUSALITY_CONDITION__UNCERTAINTY:
                return getUncertainty();
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
            case CausalityPackage.CAUSALITY_CONDITION__UNCERTAINTY:
                setUncertainty((Uncertainty)newValue);
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
            case CausalityPackage.CAUSALITY_CONDITION__UNCERTAINTY:
                setUncertainty(UNCERTAINTY_EDEFAULT);
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
            case CausalityPackage.CAUSALITY_CONDITION__UNCERTAINTY:
                return uncertainty != UNCERTAINTY_EDEFAULT;
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
        result.append(" (uncertainty: ");
        result.append(uncertainty);
        result.append(')');
        return result.toString();
    }

} //CausalityConditionImpl
