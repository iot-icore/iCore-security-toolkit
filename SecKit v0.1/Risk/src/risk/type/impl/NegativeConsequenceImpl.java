/**
 */
package risk.type.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import risk.type.NegativeConsequence;
import risk.type.SeverityLevel;
import risk.type.TypePackage;

import trust.instance.LikelihoodLevel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Negative Consequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link risk.type.impl.NegativeConsequenceImpl#getLikelihood <em>Likelihood</em>}</li>
 *   <li>{@link risk.type.impl.NegativeConsequenceImpl#getSeverity <em>Severity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NegativeConsequenceImpl extends ConsequenceImpl implements NegativeConsequence {
    /**
     * The default value of the '{@link #getLikelihood() <em>Likelihood</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLikelihood()
     * @generated
     * @ordered
     */
    protected static final LikelihoodLevel LIKELIHOOD_EDEFAULT = LikelihoodLevel.RARE;

    /**
     * The cached value of the '{@link #getLikelihood() <em>Likelihood</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLikelihood()
     * @generated
     * @ordered
     */
    protected LikelihoodLevel likelihood = LIKELIHOOD_EDEFAULT;

    /**
     * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeverity()
     * @generated
     * @ordered
     */
    protected static final SeverityLevel SEVERITY_EDEFAULT = SeverityLevel.NEGLIGIBLE;

    /**
     * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeverity()
     * @generated
     * @ordered
     */
    protected SeverityLevel severity = SEVERITY_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NegativeConsequenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.NEGATIVE_CONSEQUENCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LikelihoodLevel getLikelihood() {
        return likelihood;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLikelihood(LikelihoodLevel newLikelihood) {
        LikelihoodLevel oldLikelihood = likelihood;
        likelihood = newLikelihood == null ? LIKELIHOOD_EDEFAULT : newLikelihood;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.NEGATIVE_CONSEQUENCE__LIKELIHOOD, oldLikelihood, likelihood));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SeverityLevel getSeverity() {
        return severity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSeverity(SeverityLevel newSeverity) {
        SeverityLevel oldSeverity = severity;
        severity = newSeverity == null ? SEVERITY_EDEFAULT : newSeverity;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.NEGATIVE_CONSEQUENCE__SEVERITY, oldSeverity, severity));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TypePackage.NEGATIVE_CONSEQUENCE__LIKELIHOOD:
                return getLikelihood();
            case TypePackage.NEGATIVE_CONSEQUENCE__SEVERITY:
                return getSeverity();
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
            case TypePackage.NEGATIVE_CONSEQUENCE__LIKELIHOOD:
                setLikelihood((LikelihoodLevel)newValue);
                return;
            case TypePackage.NEGATIVE_CONSEQUENCE__SEVERITY:
                setSeverity((SeverityLevel)newValue);
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
            case TypePackage.NEGATIVE_CONSEQUENCE__LIKELIHOOD:
                setLikelihood(LIKELIHOOD_EDEFAULT);
                return;
            case TypePackage.NEGATIVE_CONSEQUENCE__SEVERITY:
                setSeverity(SEVERITY_EDEFAULT);
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
            case TypePackage.NEGATIVE_CONSEQUENCE__LIKELIHOOD:
                return likelihood != LIKELIHOOD_EDEFAULT;
            case TypePackage.NEGATIVE_CONSEQUENCE__SEVERITY:
                return severity != SEVERITY_EDEFAULT;
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
        result.append(" (likelihood: ");
        result.append(likelihood);
        result.append(", severity: ");
        result.append(severity);
        result.append(')');
        return result.toString();
    }

} //NegativeConsequenceImpl
