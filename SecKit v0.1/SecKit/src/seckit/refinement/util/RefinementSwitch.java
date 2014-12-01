/**
 */
package seckit.refinement.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import seckit.refinement.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see seckit.refinement.RefinementPackage
 * @generated
 */
public class RefinementSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static RefinementPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RefinementSwitch() {
        if (modelPackage == null) {
            modelPackage = RefinementPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case RefinementPackage.REFINEMENT_RELATION_TYPE: {
                RefinementRelationType refinementRelationType = (RefinementRelationType)theEObject;
                T result = caseRefinementRelationType(refinementRelationType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RefinementPackage.ACTION_REFINED_INTO_ACTIONS: {
                ActionRefinedIntoActions actionRefinedIntoActions = (ActionRefinedIntoActions)theEObject;
                T result = caseActionRefinedIntoActions(actionRefinedIntoActions);
                if (result == null) result = caseActionRefinement(actionRefinedIntoActions);
                if (result == null) result = caseActivityRefinement(actionRefinedIntoActions);
                if (result == null) result = caseRefinementRelationType(actionRefinedIntoActions);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RefinementPackage.INTERFACE_DECOMPOSITION: {
                InterfaceDecomposition interfaceDecomposition = (InterfaceDecomposition)theEObject;
                T result = caseInterfaceDecomposition(interfaceDecomposition);
                if (result == null) result = caseInteractionRefinement(interfaceDecomposition);
                if (result == null) result = caseActivityRefinement(interfaceDecomposition);
                if (result == null) result = caseRefinementRelationType(interfaceDecomposition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RefinementPackage.ACTION_REFINEMENT: {
                ActionRefinement actionRefinement = (ActionRefinement)theEObject;
                T result = caseActionRefinement(actionRefinement);
                if (result == null) result = caseActivityRefinement(actionRefinement);
                if (result == null) result = caseRefinementRelationType(actionRefinement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RefinementPackage.INTERACTION_REFINEMENT: {
                InteractionRefinement interactionRefinement = (InteractionRefinement)theEObject;
                T result = caseInteractionRefinement(interactionRefinement);
                if (result == null) result = caseActivityRefinement(interactionRefinement);
                if (result == null) result = caseRefinementRelationType(interactionRefinement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RefinementPackage.ACTION_INSERTION: {
                ActionInsertion actionInsertion = (ActionInsertion)theEObject;
                T result = caseActionInsertion(actionInsertion);
                if (result == null) result = caseCausalityRefinement(actionInsertion);
                if (result == null) result = caseRefinementRelationType(actionInsertion);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RefinementPackage.ACTION_REFINED_INTO_INTERACTION: {
                ActionRefinedIntoInteraction actionRefinedIntoInteraction = (ActionRefinedIntoInteraction)theEObject;
                T result = caseActionRefinedIntoInteraction(actionRefinedIntoInteraction);
                if (result == null) result = caseActionRefinement(actionRefinedIntoInteraction);
                if (result == null) result = caseActivityRefinement(actionRefinedIntoInteraction);
                if (result == null) result = caseRefinementRelationType(actionRefinedIntoInteraction);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RefinementPackage.CAUSALITY_REFINEMENT: {
                CausalityRefinement causalityRefinement = (CausalityRefinement)theEObject;
                T result = caseCausalityRefinement(causalityRefinement);
                if (result == null) result = caseRefinementRelationType(causalityRefinement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RefinementPackage.CAUSALITY_ORIENTED_BEHAVIOR_REFINEMENT: {
                CausalityOrientedBehaviorRefinement causalityOrientedBehaviorRefinement = (CausalityOrientedBehaviorRefinement)theEObject;
                T result = caseCausalityOrientedBehaviorRefinement(causalityOrientedBehaviorRefinement);
                if (result == null) result = caseCausalityRefinement(causalityOrientedBehaviorRefinement);
                if (result == null) result = caseBehaviorRefinementType(causalityOrientedBehaviorRefinement);
                if (result == null) result = caseRefinementRelationType(causalityOrientedBehaviorRefinement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RefinementPackage.CONSTRAINT_ORIENTED_BEHAVIOR_REFINEMENT: {
                ConstraintOrientedBehaviorRefinement constraintOrientedBehaviorRefinement = (ConstraintOrientedBehaviorRefinement)theEObject;
                T result = caseConstraintOrientedBehaviorRefinement(constraintOrientedBehaviorRefinement);
                if (result == null) result = caseBehaviorRefinementType(constraintOrientedBehaviorRefinement);
                if (result == null) result = caseRefinementRelationType(constraintOrientedBehaviorRefinement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RefinementPackage.NEW_PARTICIPANT_INTRODUCTION: {
                NewParticipantIntroduction newParticipantIntroduction = (NewParticipantIntroduction)theEObject;
                T result = caseNewParticipantIntroduction(newParticipantIntroduction);
                if (result == null) result = caseInteractionRefinement(newParticipantIntroduction);
                if (result == null) result = caseActivityRefinement(newParticipantIntroduction);
                if (result == null) result = caseRefinementRelationType(newParticipantIntroduction);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RefinementPackage.BILATERAL_PARTICIPANT_INTRODUCTION: {
                BilateralParticipantIntroduction bilateralParticipantIntroduction = (BilateralParticipantIntroduction)theEObject;
                T result = caseBilateralParticipantIntroduction(bilateralParticipantIntroduction);
                if (result == null) result = caseInteractionRefinement(bilateralParticipantIntroduction);
                if (result == null) result = caseActivityRefinement(bilateralParticipantIntroduction);
                if (result == null) result = caseRefinementRelationType(bilateralParticipantIntroduction);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RefinementPackage.ACTIVITY_REFINEMENT: {
                ActivityRefinement activityRefinement = (ActivityRefinement)theEObject;
                T result = caseActivityRefinement(activityRefinement);
                if (result == null) result = caseRefinementRelationType(activityRefinement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RefinementPackage.REFINEMENT_RELATION_INSTANTIATION: {
                RefinementRelationInstantiation refinementRelationInstantiation = (RefinementRelationInstantiation)theEObject;
                T result = caseRefinementRelationInstantiation(refinementRelationInstantiation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RefinementPackage.REFINEMENT_RELATION_HIERARCHY: {
                RefinementRelationHierarchy refinementRelationHierarchy = (RefinementRelationHierarchy)theEObject;
                T result = caseRefinementRelationHierarchy(refinementRelationHierarchy);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RefinementPackage.BEHAVIOR_REFINEMENT_TYPE: {
                BehaviorRefinementType behaviorRefinementType = (BehaviorRefinementType)theEObject;
                T result = caseBehaviorRefinementType(behaviorRefinementType);
                if (result == null) result = caseRefinementRelationType(behaviorRefinementType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Relation Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Relation Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRefinementRelationType(RefinementRelationType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Action Refined Into Actions</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Action Refined Into Actions</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActionRefinedIntoActions(ActionRefinedIntoActions object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interface Decomposition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interface Decomposition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInterfaceDecomposition(InterfaceDecomposition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Action Refinement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Action Refinement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActionRefinement(ActionRefinement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interaction Refinement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interaction Refinement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInteractionRefinement(InteractionRefinement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Action Insertion</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Action Insertion</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActionInsertion(ActionInsertion object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Action Refined Into Interaction</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Action Refined Into Interaction</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActionRefinedIntoInteraction(ActionRefinedIntoInteraction object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Causality Refinement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Causality Refinement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCausalityRefinement(CausalityRefinement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Causality Oriented Behavior Refinement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Causality Oriented Behavior Refinement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCausalityOrientedBehaviorRefinement(CausalityOrientedBehaviorRefinement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Constraint Oriented Behavior Refinement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Constraint Oriented Behavior Refinement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConstraintOrientedBehaviorRefinement(ConstraintOrientedBehaviorRefinement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>New Participant Introduction</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>New Participant Introduction</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNewParticipantIntroduction(NewParticipantIntroduction object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Bilateral Participant Introduction</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Bilateral Participant Introduction</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBilateralParticipantIntroduction(BilateralParticipantIntroduction object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Activity Refinement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Activity Refinement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActivityRefinement(ActivityRefinement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Relation Instantiation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Relation Instantiation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRefinementRelationInstantiation(RefinementRelationInstantiation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Relation Hierarchy</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Relation Hierarchy</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRefinementRelationHierarchy(RefinementRelationHierarchy object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Behavior Refinement Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Behavior Refinement Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBehaviorRefinementType(BehaviorRefinementType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //RefinementSwitch
