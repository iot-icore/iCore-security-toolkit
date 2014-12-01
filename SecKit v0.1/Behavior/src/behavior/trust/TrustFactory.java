/**
 */
package behavior.trust;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see behavior.trust.TrustPackage
 * @generated
 */
public interface TrustFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TrustFactory eINSTANCE = behavior.trust.impl.TrustFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Privacy Protection</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Privacy Protection</em>'.
     * @generated
     */
    PrivacyProtection createPrivacyProtection();

    /**
     * Returns a new object of class '<em>Adapt Service To Context</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Adapt Service To Context</em>'.
     * @generated
     */
    AdaptServiceToContext createAdaptServiceToContext();

    /**
     * Returns a new object of class '<em>Response Time</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Response Time</em>'.
     * @generated
     */
    ResponseTime createResponseTime();

    /**
     * Returns a new object of class '<em>Interaction Contribution Trust</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interaction Contribution Trust</em>'.
     * @generated
     */
    InteractionContributionTrust createInteractionContributionTrust();

    /**
     * Returns a new object of class '<em>Employee Theft</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Employee Theft</em>'.
     * @generated
     */
    EmployeeTheft createEmployeeTheft();

    /**
     * Returns a new object of class '<em>Complete Service As Agreed</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Complete Service As Agreed</em>'.
     * @generated
     */
    CompleteServiceAsAgreed createCompleteServiceAsAgreed();

    /**
     * Returns a new object of class '<em>EClass0</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EClass0</em>'.
     * @generated
     */
    EClass0 createEClass0();

    /**
     * Returns a new object of class '<em>Provide Secure Firmware</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Provide Secure Firmware</em>'.
     * @generated
     */
    ProvideSecureFirmware createProvideSecureFirmware();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    TrustPackage getTrustPackage();

} //TrustFactory
