/**
 */
package seckit.refinement.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import seckit.refinement.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see seckit.refinement.RefinementPackage
 * @generated
 */
public class RefinementAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static RefinementPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RefinementAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = RefinementPackage.eINSTANCE;
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
    protected RefinementSwitch<Adapter> modelSwitch =
        new RefinementSwitch<Adapter>() {
            @Override
            public Adapter caseRefinementRelationType(RefinementRelationType object) {
                return createRefinementRelationTypeAdapter();
            }
            @Override
            public Adapter caseActionRefinedIntoActions(ActionRefinedIntoActions object) {
                return createActionRefinedIntoActionsAdapter();
            }
            @Override
            public Adapter caseInterfaceDecomposition(InterfaceDecomposition object) {
                return createInterfaceDecompositionAdapter();
            }
            @Override
            public Adapter caseActionRefinement(ActionRefinement object) {
                return createActionRefinementAdapter();
            }
            @Override
            public Adapter caseInteractionRefinement(InteractionRefinement object) {
                return createInteractionRefinementAdapter();
            }
            @Override
            public Adapter caseActionInsertion(ActionInsertion object) {
                return createActionInsertionAdapter();
            }
            @Override
            public Adapter caseActionRefinedIntoInteraction(ActionRefinedIntoInteraction object) {
                return createActionRefinedIntoInteractionAdapter();
            }
            @Override
            public Adapter caseCausalityRefinement(CausalityRefinement object) {
                return createCausalityRefinementAdapter();
            }
            @Override
            public Adapter caseCausalityOrientedBehaviorRefinement(CausalityOrientedBehaviorRefinement object) {
                return createCausalityOrientedBehaviorRefinementAdapter();
            }
            @Override
            public Adapter caseConstraintOrientedBehaviorRefinement(ConstraintOrientedBehaviorRefinement object) {
                return createConstraintOrientedBehaviorRefinementAdapter();
            }
            @Override
            public Adapter caseNewParticipantIntroduction(NewParticipantIntroduction object) {
                return createNewParticipantIntroductionAdapter();
            }
            @Override
            public Adapter caseBilateralParticipantIntroduction(BilateralParticipantIntroduction object) {
                return createBilateralParticipantIntroductionAdapter();
            }
            @Override
            public Adapter caseActivityRefinement(ActivityRefinement object) {
                return createActivityRefinementAdapter();
            }
            @Override
            public Adapter caseRefinementRelationInstantiation(RefinementRelationInstantiation object) {
                return createRefinementRelationInstantiationAdapter();
            }
            @Override
            public Adapter caseRefinementRelationHierarchy(RefinementRelationHierarchy object) {
                return createRefinementRelationHierarchyAdapter();
            }
            @Override
            public Adapter caseBehaviorRefinementType(BehaviorRefinementType object) {
                return createBehaviorRefinementTypeAdapter();
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
     * Creates a new adapter for an object of class '{@link seckit.refinement.RefinementRelationType <em>Relation Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see seckit.refinement.RefinementRelationType
     * @generated
     */
    public Adapter createRefinementRelationTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link seckit.refinement.ActionRefinedIntoActions <em>Action Refined Into Actions</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see seckit.refinement.ActionRefinedIntoActions
     * @generated
     */
    public Adapter createActionRefinedIntoActionsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link seckit.refinement.InterfaceDecomposition <em>Interface Decomposition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see seckit.refinement.InterfaceDecomposition
     * @generated
     */
    public Adapter createInterfaceDecompositionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link seckit.refinement.ActionRefinement <em>Action Refinement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see seckit.refinement.ActionRefinement
     * @generated
     */
    public Adapter createActionRefinementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link seckit.refinement.InteractionRefinement <em>Interaction Refinement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see seckit.refinement.InteractionRefinement
     * @generated
     */
    public Adapter createInteractionRefinementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link seckit.refinement.ActionInsertion <em>Action Insertion</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see seckit.refinement.ActionInsertion
     * @generated
     */
    public Adapter createActionInsertionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link seckit.refinement.ActionRefinedIntoInteraction <em>Action Refined Into Interaction</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see seckit.refinement.ActionRefinedIntoInteraction
     * @generated
     */
    public Adapter createActionRefinedIntoInteractionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link seckit.refinement.CausalityRefinement <em>Causality Refinement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see seckit.refinement.CausalityRefinement
     * @generated
     */
    public Adapter createCausalityRefinementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link seckit.refinement.CausalityOrientedBehaviorRefinement <em>Causality Oriented Behavior Refinement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see seckit.refinement.CausalityOrientedBehaviorRefinement
     * @generated
     */
    public Adapter createCausalityOrientedBehaviorRefinementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link seckit.refinement.ConstraintOrientedBehaviorRefinement <em>Constraint Oriented Behavior Refinement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see seckit.refinement.ConstraintOrientedBehaviorRefinement
     * @generated
     */
    public Adapter createConstraintOrientedBehaviorRefinementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link seckit.refinement.NewParticipantIntroduction <em>New Participant Introduction</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see seckit.refinement.NewParticipantIntroduction
     * @generated
     */
    public Adapter createNewParticipantIntroductionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link seckit.refinement.BilateralParticipantIntroduction <em>Bilateral Participant Introduction</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see seckit.refinement.BilateralParticipantIntroduction
     * @generated
     */
    public Adapter createBilateralParticipantIntroductionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link seckit.refinement.ActivityRefinement <em>Activity Refinement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see seckit.refinement.ActivityRefinement
     * @generated
     */
    public Adapter createActivityRefinementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link seckit.refinement.RefinementRelationInstantiation <em>Relation Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see seckit.refinement.RefinementRelationInstantiation
     * @generated
     */
    public Adapter createRefinementRelationInstantiationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link seckit.refinement.RefinementRelationHierarchy <em>Relation Hierarchy</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see seckit.refinement.RefinementRelationHierarchy
     * @generated
     */
    public Adapter createRefinementRelationHierarchyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link seckit.refinement.BehaviorRefinementType <em>Behavior Refinement Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see seckit.refinement.BehaviorRefinementType
     * @generated
     */
    public Adapter createBehaviorRefinementTypeAdapter() {
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

} //RefinementAdapterFactory
