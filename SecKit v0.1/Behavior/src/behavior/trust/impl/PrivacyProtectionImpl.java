/**
 */
package behavior.trust.impl;

import behavior.trust.PrivacyProtection;
import behavior.trust.TrustPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Privacy Protection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.trust.impl.PrivacyProtectionImpl#isIsAdministrator <em>Is Administrator</em>}</li>
 *   <li>{@link behavior.trust.impl.PrivacyProtectionImpl#isIsPepEnabled <em>Is Pep Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrivacyProtectionImpl extends QualityOfProtectionImpl implements PrivacyProtection {
    /**
     * The default value of the '{@link #isIsAdministrator() <em>Is Administrator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsAdministrator()
     * @generated
     * @ordered
     */
    protected static final boolean IS_ADMINISTRATOR_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsAdministrator() <em>Is Administrator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsAdministrator()
     * @generated
     * @ordered
     */
    protected boolean isAdministrator = IS_ADMINISTRATOR_EDEFAULT;

    /**
     * The default value of the '{@link #isIsPepEnabled() <em>Is Pep Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsPepEnabled()
     * @generated
     * @ordered
     */
    protected static final boolean IS_PEP_ENABLED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsPepEnabled() <em>Is Pep Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsPepEnabled()
     * @generated
     * @ordered
     */
    protected boolean isPepEnabled = IS_PEP_ENABLED_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PrivacyProtectionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TrustPackage.Literals.PRIVACY_PROTECTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsAdministrator() {
        return isAdministrator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsAdministrator(boolean newIsAdministrator) {
        boolean oldIsAdministrator = isAdministrator;
        isAdministrator = newIsAdministrator;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TrustPackage.PRIVACY_PROTECTION__IS_ADMINISTRATOR, oldIsAdministrator, isAdministrator));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsPepEnabled() {
        return isPepEnabled;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsPepEnabled(boolean newIsPepEnabled) {
        boolean oldIsPepEnabled = isPepEnabled;
        isPepEnabled = newIsPepEnabled;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TrustPackage.PRIVACY_PROTECTION__IS_PEP_ENABLED, oldIsPepEnabled, isPepEnabled));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TrustPackage.PRIVACY_PROTECTION__IS_ADMINISTRATOR:
                return isIsAdministrator();
            case TrustPackage.PRIVACY_PROTECTION__IS_PEP_ENABLED:
                return isIsPepEnabled();
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
            case TrustPackage.PRIVACY_PROTECTION__IS_ADMINISTRATOR:
                setIsAdministrator((Boolean)newValue);
                return;
            case TrustPackage.PRIVACY_PROTECTION__IS_PEP_ENABLED:
                setIsPepEnabled((Boolean)newValue);
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
            case TrustPackage.PRIVACY_PROTECTION__IS_ADMINISTRATOR:
                setIsAdministrator(IS_ADMINISTRATOR_EDEFAULT);
                return;
            case TrustPackage.PRIVACY_PROTECTION__IS_PEP_ENABLED:
                setIsPepEnabled(IS_PEP_ENABLED_EDEFAULT);
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
            case TrustPackage.PRIVACY_PROTECTION__IS_ADMINISTRATOR:
                return isAdministrator != IS_ADMINISTRATOR_EDEFAULT;
            case TrustPackage.PRIVACY_PROTECTION__IS_PEP_ENABLED:
                return isPepEnabled != IS_PEP_ENABLED_EDEFAULT;
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
        result.append(" (isAdministrator: ");
        result.append(isAdministrator);
        result.append(", isPepEnabled: ");
        result.append(isPepEnabled);
        result.append(')');
        return result.toString();
    }

} //PrivacyProtectionImpl
