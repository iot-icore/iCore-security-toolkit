/**
 */
package structure.trust.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import structure.trust.ResistanceToTampering;
import structure.trust.TrustPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resistance To Tampering</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link structure.trust.impl.ResistanceToTamperingImpl#isIsTpmEnabled <em>Is Tpm Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResistanceToTamperingImpl extends StructuralQualityImpl implements ResistanceToTampering {
    /**
     * The default value of the '{@link #isIsTpmEnabled() <em>Is Tpm Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsTpmEnabled()
     * @generated
     * @ordered
     */
    protected static final boolean IS_TPM_ENABLED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsTpmEnabled() <em>Is Tpm Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsTpmEnabled()
     * @generated
     * @ordered
     */
    protected boolean isTpmEnabled = IS_TPM_ENABLED_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ResistanceToTamperingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TrustPackage.Literals.RESISTANCE_TO_TAMPERING;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsTpmEnabled() {
        return isTpmEnabled;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsTpmEnabled(boolean newIsTpmEnabled) {
        boolean oldIsTpmEnabled = isTpmEnabled;
        isTpmEnabled = newIsTpmEnabled;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TrustPackage.RESISTANCE_TO_TAMPERING__IS_TPM_ENABLED, oldIsTpmEnabled, isTpmEnabled));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TrustPackage.RESISTANCE_TO_TAMPERING__IS_TPM_ENABLED:
                return isIsTpmEnabled();
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
            case TrustPackage.RESISTANCE_TO_TAMPERING__IS_TPM_ENABLED:
                setIsTpmEnabled((Boolean)newValue);
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
            case TrustPackage.RESISTANCE_TO_TAMPERING__IS_TPM_ENABLED:
                setIsTpmEnabled(IS_TPM_ENABLED_EDEFAULT);
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
            case TrustPackage.RESISTANCE_TO_TAMPERING__IS_TPM_ENABLED:
                return isTpmEnabled != IS_TPM_ENABLED_EDEFAULT;
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
        result.append(" (isTpmEnabled: ");
        result.append(isTpmEnabled);
        result.append(')');
        return result.toString();
    }

} //ResistanceToTamperingImpl
