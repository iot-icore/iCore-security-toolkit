/**
 */
package behavior.trust;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Privacy Protection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.trust.PrivacyProtection#isIsAdministrator <em>Is Administrator</em>}</li>
 *   <li>{@link behavior.trust.PrivacyProtection#isIsPepEnabled <em>Is Pep Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.trust.TrustPackage#getPrivacyProtection()
 * @model
 * @generated
 */
public interface PrivacyProtection extends QualityOfProtection {
    /**
     * Returns the value of the '<em><b>Is Administrator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Administrator</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Administrator</em>' attribute.
     * @see #setIsAdministrator(boolean)
     * @see behavior.trust.TrustPackage#getPrivacyProtection_IsAdministrator()
     * @model
     * @generated
     */
    boolean isIsAdministrator();

    /**
     * Sets the value of the '{@link behavior.trust.PrivacyProtection#isIsAdministrator <em>Is Administrator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Administrator</em>' attribute.
     * @see #isIsAdministrator()
     * @generated
     */
    void setIsAdministrator(boolean value);

    /**
     * Returns the value of the '<em><b>Is Pep Enabled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Pep Enabled</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Pep Enabled</em>' attribute.
     * @see #setIsPepEnabled(boolean)
     * @see behavior.trust.TrustPackage#getPrivacyProtection_IsPepEnabled()
     * @model
     * @generated
     */
    boolean isIsPepEnabled();

    /**
     * Sets the value of the '{@link behavior.trust.PrivacyProtection#isIsPepEnabled <em>Is Pep Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Pep Enabled</em>' attribute.
     * @see #isIsPepEnabled()
     * @generated
     */
    void setIsPepEnabled(boolean value);

} // PrivacyProtection
