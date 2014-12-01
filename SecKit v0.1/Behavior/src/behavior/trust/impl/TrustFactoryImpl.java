/**
 */
package behavior.trust.impl;

import behavior.trust.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TrustFactoryImpl extends EFactoryImpl implements TrustFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TrustFactory init() {
        try {
            TrustFactory theTrustFactory = (TrustFactory)EPackage.Registry.INSTANCE.getEFactory(TrustPackage.eNS_URI);
            if (theTrustFactory != null) {
                return theTrustFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new TrustFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TrustFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case TrustPackage.PRIVACY_PROTECTION: return createPrivacyProtection();
            case TrustPackage.ADAPT_SERVICE_TO_CONTEXT: return createAdaptServiceToContext();
            case TrustPackage.RESPONSE_TIME: return createResponseTime();
            case TrustPackage.INTERACTION_CONTRIBUTION_TRUST: return createInteractionContributionTrust();
            case TrustPackage.EMPLOYEE_THEFT: return createEmployeeTheft();
            case TrustPackage.COMPLETE_SERVICE_AS_AGREED: return createCompleteServiceAsAgreed();
            case TrustPackage.ECLASS0: return createEClass0();
            case TrustPackage.PROVIDE_SECURE_FIRMWARE: return createProvideSecureFirmware();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PrivacyProtection createPrivacyProtection() {
        PrivacyProtectionImpl privacyProtection = new PrivacyProtectionImpl();
        return privacyProtection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AdaptServiceToContext createAdaptServiceToContext() {
        AdaptServiceToContextImpl adaptServiceToContext = new AdaptServiceToContextImpl();
        return adaptServiceToContext;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResponseTime createResponseTime() {
        ResponseTimeImpl responseTime = new ResponseTimeImpl();
        return responseTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionContributionTrust createInteractionContributionTrust() {
        InteractionContributionTrustImpl interactionContributionTrust = new InteractionContributionTrustImpl();
        return interactionContributionTrust;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EmployeeTheft createEmployeeTheft() {
        EmployeeTheftImpl employeeTheft = new EmployeeTheftImpl();
        return employeeTheft;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CompleteServiceAsAgreed createCompleteServiceAsAgreed() {
        CompleteServiceAsAgreedImpl completeServiceAsAgreed = new CompleteServiceAsAgreedImpl();
        return completeServiceAsAgreed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass0 createEClass0() {
        EClass0Impl eClass0 = new EClass0Impl();
        return eClass0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProvideSecureFirmware createProvideSecureFirmware() {
        ProvideSecureFirmwareImpl provideSecureFirmware = new ProvideSecureFirmwareImpl();
        return provideSecureFirmware;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TrustPackage getTrustPackage() {
        return (TrustPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static TrustPackage getPackage() {
        return TrustPackage.eINSTANCE;
    }

} //TrustFactoryImpl
