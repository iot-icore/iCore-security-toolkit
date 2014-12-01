/**
 */
package context.management.util;

import context.management.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see context.management.ManagementPackage
 * @generated
 */
public class ManagementAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ManagementPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ManagementAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = ManagementPackage.eINSTANCE;
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
    protected ManagementSwitch<Adapter> modelSwitch =
        new ManagementSwitch<Adapter>() {
            @Override
            public Adapter caseContextProviderCharacterization(ContextProviderCharacterization object) {
                return createContextProviderCharacterizationAdapter();
            }
            @Override
            public Adapter caseSituationProviderCharacterization(SituationProviderCharacterization object) {
                return createSituationProviderCharacterizationAdapter();
            }
            @Override
            public Adapter caseContextAwareServiceProvisioningDescription(ContextAwareServiceProvisioningDescription object) {
                return createContextAwareServiceProvisioningDescriptionAdapter();
            }
            @Override
            public Adapter caseContextProvisioningServiceDescription(ContextProvisioningServiceDescription object) {
                return createContextProvisioningServiceDescriptionAdapter();
            }
            @Override
            public Adapter caseContextAwareServiceProviderCharacterization(ContextAwareServiceProviderCharacterization object) {
                return createContextAwareServiceProviderCharacterizationAdapter();
            }
            @Override
            public Adapter caseSituationProvisioningServiceDescription(SituationProvisioningServiceDescription object) {
                return createSituationProvisioningServiceDescriptionAdapter();
            }
            @Override
            public Adapter caseQualityOfContextProvisioning(QualityOfContextProvisioning object) {
                return createQualityOfContextProvisioningAdapter();
            }
            @Override
            public Adapter caseQualityOfSituationProvisioning(QualityOfSituationProvisioning object) {
                return createQualityOfSituationProvisioningAdapter();
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
     * Creates a new adapter for an object of class '{@link context.management.ContextProviderCharacterization <em>Context Provider Characterization</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.management.ContextProviderCharacterization
     * @generated
     */
    public Adapter createContextProviderCharacterizationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link context.management.SituationProviderCharacterization <em>Situation Provider Characterization</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.management.SituationProviderCharacterization
     * @generated
     */
    public Adapter createSituationProviderCharacterizationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link context.management.ContextAwareServiceProvisioningDescription <em>Context Aware Service Provisioning Description</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.management.ContextAwareServiceProvisioningDescription
     * @generated
     */
    public Adapter createContextAwareServiceProvisioningDescriptionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link context.management.ContextProvisioningServiceDescription <em>Context Provisioning Service Description</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.management.ContextProvisioningServiceDescription
     * @generated
     */
    public Adapter createContextProvisioningServiceDescriptionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link context.management.ContextAwareServiceProviderCharacterization <em>Context Aware Service Provider Characterization</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.management.ContextAwareServiceProviderCharacterization
     * @generated
     */
    public Adapter createContextAwareServiceProviderCharacterizationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link context.management.SituationProvisioningServiceDescription <em>Situation Provisioning Service Description</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.management.SituationProvisioningServiceDescription
     * @generated
     */
    public Adapter createSituationProvisioningServiceDescriptionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link context.management.QualityOfContextProvisioning <em>Quality Of Context Provisioning</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.management.QualityOfContextProvisioning
     * @generated
     */
    public Adapter createQualityOfContextProvisioningAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link context.management.QualityOfSituationProvisioning <em>Quality Of Situation Provisioning</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.management.QualityOfSituationProvisioning
     * @generated
     */
    public Adapter createQualityOfSituationProvisioningAdapter() {
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

} //ManagementAdapterFactory
