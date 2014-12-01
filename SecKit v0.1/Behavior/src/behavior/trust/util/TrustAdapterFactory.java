/**
 */
package behavior.trust.util;

import behavior.trust.*;

import models.Element;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import trust.instance.TrustAspect;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see behavior.trust.TrustPackage
 * @generated
 */
public class TrustAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static TrustPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TrustAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = TrustPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TrustSwitch<Adapter> modelSwitch =
        new TrustSwitch<Adapter>() {
            @Override
            public Adapter casePrivacyProtection(PrivacyProtection object) {
                return createPrivacyProtectionAdapter();
            }
            @Override
            public Adapter caseBehaviorQuality(BehaviorQuality object) {
                return createBehaviorQualityAdapter();
            }
            @Override
            public Adapter caseAdaptServiceToContext(AdaptServiceToContext object) {
                return createAdaptServiceToContextAdapter();
            }
            @Override
            public Adapter caseResponseTime(ResponseTime object) {
                return createResponseTimeAdapter();
            }
            @Override
            public Adapter caseQualityOfService(QualityOfService object) {
                return createQualityOfServiceAdapter();
            }
            @Override
            public Adapter caseQualityOfExperience(QualityOfExperience object) {
                return createQualityOfExperienceAdapter();
            }
            @Override
            public Adapter caseInteractionContributionTrust(InteractionContributionTrust object) {
                return createInteractionContributionTrustAdapter();
            }
            @Override
            public Adapter caseQualityOfProtection(QualityOfProtection object) {
                return createQualityOfProtectionAdapter();
            }
            @Override
            public Adapter caseEmployeeTheft(EmployeeTheft object) {
                return createEmployeeTheftAdapter();
            }
            @Override
            public Adapter caseCompleteServiceAsAgreed(CompleteServiceAsAgreed object) {
                return createCompleteServiceAsAgreedAdapter();
            }
            @Override
            public Adapter caseEClass0(EClass0 object) {
                return createEClass0Adapter();
            }
            @Override
            public Adapter caseProvideSecureFirmware(ProvideSecureFirmware object) {
                return createProvideSecureFirmwareAdapter();
            }
            @Override
            public Adapter caseElement(Element object) {
                return createElementAdapter();
            }
            @Override
            public Adapter caseTrustAspect(TrustAspect object) {
                return createTrustAspectAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link behavior.trust.PrivacyProtection <em>Privacy Protection</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.trust.PrivacyProtection
     * @generated
     */
    public Adapter createPrivacyProtectionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.trust.BehaviorQuality <em>Behavior Quality</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.trust.BehaviorQuality
     * @generated
     */
    public Adapter createBehaviorQualityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.trust.AdaptServiceToContext <em>Adapt Service To Context</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.trust.AdaptServiceToContext
     * @generated
     */
    public Adapter createAdaptServiceToContextAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.trust.ResponseTime <em>Response Time</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.trust.ResponseTime
     * @generated
     */
    public Adapter createResponseTimeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.trust.QualityOfService <em>Quality Of Service</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.trust.QualityOfService
     * @generated
     */
    public Adapter createQualityOfServiceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.trust.QualityOfExperience <em>Quality Of Experience</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.trust.QualityOfExperience
     * @generated
     */
    public Adapter createQualityOfExperienceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.trust.InteractionContributionTrust <em>Interaction Contribution Trust</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.trust.InteractionContributionTrust
     * @generated
     */
    public Adapter createInteractionContributionTrustAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.trust.QualityOfProtection <em>Quality Of Protection</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.trust.QualityOfProtection
     * @generated
     */
    public Adapter createQualityOfProtectionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.trust.EmployeeTheft <em>Employee Theft</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.trust.EmployeeTheft
     * @generated
     */
    public Adapter createEmployeeTheftAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.trust.CompleteServiceAsAgreed <em>Complete Service As Agreed</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.trust.CompleteServiceAsAgreed
     * @generated
     */
    public Adapter createCompleteServiceAsAgreedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.trust.EClass0 <em>EClass0</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.trust.EClass0
     * @generated
     */
    public Adapter createEClass0Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.trust.ProvideSecureFirmware <em>Provide Secure Firmware</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.trust.ProvideSecureFirmware
     * @generated
     */
    public Adapter createProvideSecureFirmwareAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link models.Element <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.Element
     * @generated
     */
    public Adapter createElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link trust.instance.TrustAspect <em>Trust Aspect</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see trust.instance.TrustAspect
     * @generated
     */
    public Adapter createTrustAspectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //TrustAdapterFactory
