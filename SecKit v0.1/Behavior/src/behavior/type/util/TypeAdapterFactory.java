/**
 */
package behavior.type.util;

import behavior.type.*;

import models.Element;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see behavior.type.TypePackage
 * @generated
 */
public class TypeAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static TypePackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = TypePackage.eINSTANCE;
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
    protected TypeSwitch<Adapter> modelSwitch =
        new TypeSwitch<Adapter>() {
            @Override
            public Adapter caseMonolithicBehaviorType(MonolithicBehaviorType object) {
                return createMonolithicBehaviorTypeAdapter();
            }
            @Override
            public Adapter caseActionType(ActionType object) {
                return createActionTypeAdapter();
            }
            @Override
            public Adapter caseInteractionContributionType(InteractionContributionType object) {
                return createInteractionContributionTypeAdapter();
            }
            @Override
            public Adapter caseActivityType(ActivityType object) {
                return createActivityTypeAdapter();
            }
            @Override
            public Adapter caseAbstractBehaviorType(AbstractBehaviorType object) {
                return createAbstractBehaviorTypeAdapter();
            }
            @Override
            public Adapter caseInteractionType(InteractionType object) {
                return createInteractionTypeAdapter();
            }
            @Override
            public Adapter caseBehaviorTypePackage(BehaviorTypePackage object) {
                return createBehaviorTypePackageAdapter();
            }
            @Override
            public Adapter caseFlowPointType(FlowPointType object) {
                return createFlowPointTypeAdapter();
            }
            @Override
            public Adapter caseEntryPointType(EntryPointType object) {
                return createEntryPointTypeAdapter();
            }
            @Override
            public Adapter caseExitPointType(ExitPointType object) {
                return createExitPointTypeAdapter();
            }
            @Override
            public Adapter caseBehaviorType(BehaviorType object) {
                return createBehaviorTypeAdapter();
            }
            @Override
            public Adapter caseStructuredBehaviorType(StructuredBehaviorType object) {
                return createStructuredBehaviorTypeAdapter();
            }
            @Override
            public Adapter caseDataProducerType(DataProducerType object) {
                return createDataProducerTypeAdapter();
            }
            @Override
            public Adapter caseDataProducerCharacterization(DataProducerCharacterization object) {
                return createDataProducerCharacterizationAdapter();
            }
            @Override
            public Adapter caseAbstractDataProducerType(AbstractDataProducerType object) {
                return createAbstractDataProducerTypeAdapter();
            }
            @Override
            public Adapter caseElement(Element object) {
                return createElementAdapter();
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
     * Creates a new adapter for an object of class '{@link behavior.type.MonolithicBehaviorType <em>Monolithic Behavior Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.type.MonolithicBehaviorType
     * @generated
     */
    public Adapter createMonolithicBehaviorTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.type.ActionType <em>Action Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.type.ActionType
     * @generated
     */
    public Adapter createActionTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.type.InteractionContributionType <em>Interaction Contribution Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.type.InteractionContributionType
     * @generated
     */
    public Adapter createInteractionContributionTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.type.ActivityType <em>Activity Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.type.ActivityType
     * @generated
     */
    public Adapter createActivityTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.type.AbstractBehaviorType <em>Abstract Behavior Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.type.AbstractBehaviorType
     * @generated
     */
    public Adapter createAbstractBehaviorTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.type.InteractionType <em>Interaction Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.type.InteractionType
     * @generated
     */
    public Adapter createInteractionTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.type.BehaviorTypePackage <em>Behavior Type Package</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.type.BehaviorTypePackage
     * @generated
     */
    public Adapter createBehaviorTypePackageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.type.FlowPointType <em>Flow Point Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.type.FlowPointType
     * @generated
     */
    public Adapter createFlowPointTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.type.EntryPointType <em>Entry Point Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.type.EntryPointType
     * @generated
     */
    public Adapter createEntryPointTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.type.ExitPointType <em>Exit Point Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.type.ExitPointType
     * @generated
     */
    public Adapter createExitPointTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.type.BehaviorType <em>Behavior Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.type.BehaviorType
     * @generated
     */
    public Adapter createBehaviorTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.type.StructuredBehaviorType <em>Structured Behavior Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.type.StructuredBehaviorType
     * @generated
     */
    public Adapter createStructuredBehaviorTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.type.DataProducerType <em>Data Producer Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.type.DataProducerType
     * @generated
     */
    public Adapter createDataProducerTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.type.DataProducerCharacterization <em>Data Producer Characterization</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.type.DataProducerCharacterization
     * @generated
     */
    public Adapter createDataProducerCharacterizationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.type.AbstractDataProducerType <em>Abstract Data Producer Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.type.AbstractDataProducerType
     * @generated
     */
    public Adapter createAbstractDataProducerTypeAdapter() {
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

} //TypeAdapterFactory
