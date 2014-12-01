/**
 */
package behavior.instantiation.util;

import behavior.causality.CausalityParameter;

import behavior.instantiation.*;

import models.Element;
import models.Hiearchy;
import models.InstantiationHierarchy;
import models.InstantiationReference;
import models.Reference;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see behavior.instantiation.InstantiationPackage
 * @generated
 */
public class InstantiationAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static InstantiationPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InstantiationAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = InstantiationPackage.eINSTANCE;
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
    protected InstantiationSwitch<Adapter> modelSwitch =
        new InstantiationSwitch<Adapter>() {
            @Override
            public Adapter caseActivityInstantiation(ActivityInstantiation object) {
                return createActivityInstantiationAdapter();
            }
            @Override
            public Adapter caseBehaviorInstantiation(BehaviorInstantiation object) {
                return createBehaviorInstantiationAdapter();
            }
            @Override
            public Adapter caseRecursiveBehaviorInstantiation(RecursiveBehaviorInstantiation object) {
                return createRecursiveBehaviorInstantiationAdapter();
            }
            @Override
            public Adapter caseBehaviorInstantiationHierarchy(BehaviorInstantiationHierarchy object) {
                return createBehaviorInstantiationHierarchyAdapter();
            }
            @Override
            public Adapter caseBehaviorInstantiationStaticReference(BehaviorInstantiationStaticReference object) {
                return createBehaviorInstantiationStaticReferenceAdapter();
            }
            @Override
            public Adapter caseFlowPointOfType(FlowPointOfType object) {
                return createFlowPointOfTypeAdapter();
            }
            @Override
            public Adapter caseEntryPointOfInstantiation(EntryPointOfInstantiation object) {
                return createEntryPointOfInstantiationAdapter();
            }
            @Override
            public Adapter caseExitPointOfInstantiation(ExitPointOfInstantiation object) {
                return createExitPointOfInstantiationAdapter();
            }
            @Override
            public Adapter caseInteractionContributionOfInstantiation(InteractionContributionOfInstantiation object) {
                return createInteractionContributionOfInstantiationAdapter();
            }
            @Override
            public Adapter caseDelegatedInteractionContribution(DelegatedInteractionContribution object) {
                return createDelegatedInteractionContributionAdapter();
            }
            @Override
            public Adapter caseInteractionContributionInstantiation(InteractionContributionInstantiation object) {
                return createInteractionContributionInstantiationAdapter();
            }
            @Override
            public Adapter caseActionInstantiation(ActionInstantiation object) {
                return createActionInstantiationAdapter();
            }
            @Override
            public Adapter caseInteractionContributionOfType(InteractionContributionOfType object) {
                return createInteractionContributionOfTypeAdapter();
            }
            @Override
            public Adapter caseBehaviorInstantiationVariableReference(BehaviorInstantiationVariableReference object) {
                return createBehaviorInstantiationVariableReferenceAdapter();
            }
            @Override
            public Adapter caseBehaviorInstantiationReference(BehaviorInstantiationReference object) {
                return createBehaviorInstantiationReferenceAdapter();
            }
            @Override
            public Adapter caseAbstractInteractionContributionOfType(AbstractInteractionContributionOfType object) {
                return createAbstractInteractionContributionOfTypeAdapter();
            }
            @Override
            public Adapter caseFlowPointOfInstantiation(FlowPointOfInstantiation object) {
                return createFlowPointOfInstantiationAdapter();
            }
            @Override
            public Adapter caseFlowPointInstantiation(FlowPointInstantiation object) {
                return createFlowPointInstantiationAdapter();
            }
            @Override
            public Adapter caseEntryPointOfType(EntryPointOfType object) {
                return createEntryPointOfTypeAdapter();
            }
            @Override
            public Adapter caseExitPointOfType(ExitPointOfType object) {
                return createExitPointOfTypeAdapter();
            }
            @Override
            public Adapter caseActionInstantiationHierarchy(ActionInstantiationHierarchy object) {
                return createActionInstantiationHierarchyAdapter();
            }
            @Override
            public Adapter caseInteractionInstantiation(InteractionInstantiation object) {
                return createInteractionInstantiationAdapter();
            }
            @Override
            public Adapter caseBehaviorDeclaration(BehaviorDeclaration object) {
                return createBehaviorDeclarationAdapter();
            }
            @Override
            public Adapter caseElement(Element object) {
                return createElementAdapter();
            }
            @Override
            public Adapter caseHiearchy(Hiearchy object) {
                return createHiearchyAdapter();
            }
            @Override
            public Adapter caseInstantiationHierarchy(InstantiationHierarchy object) {
                return createInstantiationHierarchyAdapter();
            }
            @Override
            public Adapter caseReference(Reference object) {
                return createReferenceAdapter();
            }
            @Override
            public Adapter caseInstantiationReference(InstantiationReference object) {
                return createInstantiationReferenceAdapter();
            }
            @Override
            public Adapter caseCausalityParameter(CausalityParameter object) {
                return createCausalityParameterAdapter();
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
     * Creates a new adapter for an object of class '{@link behavior.instantiation.ActivityInstantiation <em>Activity Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.instantiation.ActivityInstantiation
     * @generated
     */
    public Adapter createActivityInstantiationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.instantiation.BehaviorInstantiation <em>Behavior Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.instantiation.BehaviorInstantiation
     * @generated
     */
    public Adapter createBehaviorInstantiationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.instantiation.RecursiveBehaviorInstantiation <em>Recursive Behavior Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.instantiation.RecursiveBehaviorInstantiation
     * @generated
     */
    public Adapter createRecursiveBehaviorInstantiationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.instantiation.BehaviorInstantiationHierarchy <em>Behavior Instantiation Hierarchy</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.instantiation.BehaviorInstantiationHierarchy
     * @generated
     */
    public Adapter createBehaviorInstantiationHierarchyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.instantiation.BehaviorInstantiationStaticReference <em>Behavior Instantiation Static Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.instantiation.BehaviorInstantiationStaticReference
     * @generated
     */
    public Adapter createBehaviorInstantiationStaticReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.instantiation.FlowPointOfType <em>Flow Point Of Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.instantiation.FlowPointOfType
     * @generated
     */
    public Adapter createFlowPointOfTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.instantiation.EntryPointOfInstantiation <em>Entry Point Of Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.instantiation.EntryPointOfInstantiation
     * @generated
     */
    public Adapter createEntryPointOfInstantiationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.instantiation.ExitPointOfInstantiation <em>Exit Point Of Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.instantiation.ExitPointOfInstantiation
     * @generated
     */
    public Adapter createExitPointOfInstantiationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.instantiation.InteractionContributionOfInstantiation <em>Interaction Contribution Of Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.instantiation.InteractionContributionOfInstantiation
     * @generated
     */
    public Adapter createInteractionContributionOfInstantiationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.instantiation.DelegatedInteractionContribution <em>Delegated Interaction Contribution</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.instantiation.DelegatedInteractionContribution
     * @generated
     */
    public Adapter createDelegatedInteractionContributionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.instantiation.InteractionContributionInstantiation <em>Interaction Contribution Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.instantiation.InteractionContributionInstantiation
     * @generated
     */
    public Adapter createInteractionContributionInstantiationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.instantiation.ActionInstantiation <em>Action Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.instantiation.ActionInstantiation
     * @generated
     */
    public Adapter createActionInstantiationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.instantiation.InteractionContributionOfType <em>Interaction Contribution Of Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.instantiation.InteractionContributionOfType
     * @generated
     */
    public Adapter createInteractionContributionOfTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.instantiation.BehaviorInstantiationVariableReference <em>Behavior Instantiation Variable Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.instantiation.BehaviorInstantiationVariableReference
     * @generated
     */
    public Adapter createBehaviorInstantiationVariableReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.instantiation.BehaviorInstantiationReference <em>Behavior Instantiation Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.instantiation.BehaviorInstantiationReference
     * @generated
     */
    public Adapter createBehaviorInstantiationReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.instantiation.AbstractInteractionContributionOfType <em>Abstract Interaction Contribution Of Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.instantiation.AbstractInteractionContributionOfType
     * @generated
     */
    public Adapter createAbstractInteractionContributionOfTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.instantiation.FlowPointOfInstantiation <em>Flow Point Of Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.instantiation.FlowPointOfInstantiation
     * @generated
     */
    public Adapter createFlowPointOfInstantiationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.instantiation.FlowPointInstantiation <em>Flow Point Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.instantiation.FlowPointInstantiation
     * @generated
     */
    public Adapter createFlowPointInstantiationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.instantiation.EntryPointOfType <em>Entry Point Of Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.instantiation.EntryPointOfType
     * @generated
     */
    public Adapter createEntryPointOfTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.instantiation.ExitPointOfType <em>Exit Point Of Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.instantiation.ExitPointOfType
     * @generated
     */
    public Adapter createExitPointOfTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.instantiation.ActionInstantiationHierarchy <em>Action Instantiation Hierarchy</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.instantiation.ActionInstantiationHierarchy
     * @generated
     */
    public Adapter createActionInstantiationHierarchyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.instantiation.InteractionInstantiation <em>Interaction Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.instantiation.InteractionInstantiation
     * @generated
     */
    public Adapter createInteractionInstantiationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.instantiation.BehaviorDeclaration <em>Behavior Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.instantiation.BehaviorDeclaration
     * @generated
     */
    public Adapter createBehaviorDeclarationAdapter() {
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
     * Creates a new adapter for an object of class '{@link models.Hiearchy <em>Hiearchy</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.Hiearchy
     * @generated
     */
    public Adapter createHiearchyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link models.InstantiationHierarchy <em>Instantiation Hierarchy</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.InstantiationHierarchy
     * @generated
     */
    public Adapter createInstantiationHierarchyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link models.Reference <em>Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.Reference
     * @generated
     */
    public Adapter createReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link models.InstantiationReference <em>Instantiation Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.InstantiationReference
     * @generated
     */
    public Adapter createInstantiationReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.causality.CausalityParameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.causality.CausalityParameter
     * @generated
     */
    public Adapter createCausalityParameterAdapter() {
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

} //InstantiationAdapterFactory
