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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see behavior.instantiation.InstantiationPackage
 * @generated
 */
public class InstantiationSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static InstantiationPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InstantiationSwitch() {
        if (modelPackage == null) {
            modelPackage = InstantiationPackage.eINSTANCE;
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
            case InstantiationPackage.ACTIVITY_INSTANTIATION: {
                ActivityInstantiation activityInstantiation = (ActivityInstantiation)theEObject;
                T result = caseActivityInstantiation(activityInstantiation);
                if (result == null) result = caseElement(activityInstantiation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.BEHAVIOR_INSTANTIATION: {
                BehaviorInstantiation behaviorInstantiation = (BehaviorInstantiation)theEObject;
                T result = caseBehaviorInstantiation(behaviorInstantiation);
                if (result == null) result = caseElement(behaviorInstantiation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.RECURSIVE_BEHAVIOR_INSTANTIATION: {
                RecursiveBehaviorInstantiation recursiveBehaviorInstantiation = (RecursiveBehaviorInstantiation)theEObject;
                T result = caseRecursiveBehaviorInstantiation(recursiveBehaviorInstantiation);
                if (result == null) result = caseBehaviorInstantiation(recursiveBehaviorInstantiation);
                if (result == null) result = caseElement(recursiveBehaviorInstantiation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.BEHAVIOR_INSTANTIATION_HIERARCHY: {
                BehaviorInstantiationHierarchy behaviorInstantiationHierarchy = (BehaviorInstantiationHierarchy)theEObject;
                T result = caseBehaviorInstantiationHierarchy(behaviorInstantiationHierarchy);
                if (result == null) result = caseInstantiationHierarchy(behaviorInstantiationHierarchy);
                if (result == null) result = caseHiearchy(behaviorInstantiationHierarchy);
                if (result == null) result = caseElement(behaviorInstantiationHierarchy);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.BEHAVIOR_INSTANTIATION_STATIC_REFERENCE: {
                BehaviorInstantiationStaticReference behaviorInstantiationStaticReference = (BehaviorInstantiationStaticReference)theEObject;
                T result = caseBehaviorInstantiationStaticReference(behaviorInstantiationStaticReference);
                if (result == null) result = caseBehaviorInstantiationReference(behaviorInstantiationStaticReference);
                if (result == null) result = caseInstantiationReference(behaviorInstantiationStaticReference);
                if (result == null) result = caseReference(behaviorInstantiationStaticReference);
                if (result == null) result = caseElement(behaviorInstantiationStaticReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.FLOW_POINT_OF_TYPE: {
                FlowPointOfType flowPointOfType = (FlowPointOfType)theEObject;
                T result = caseFlowPointOfType(flowPointOfType);
                if (result == null) result = caseFlowPointInstantiation(flowPointOfType);
                if (result == null) result = caseElement(flowPointOfType);
                if (result == null) result = caseCausalityParameter(flowPointOfType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.ENTRY_POINT_OF_INSTANTIATION: {
                EntryPointOfInstantiation entryPointOfInstantiation = (EntryPointOfInstantiation)theEObject;
                T result = caseEntryPointOfInstantiation(entryPointOfInstantiation);
                if (result == null) result = caseFlowPointOfInstantiation(entryPointOfInstantiation);
                if (result == null) result = caseFlowPointInstantiation(entryPointOfInstantiation);
                if (result == null) result = caseElement(entryPointOfInstantiation);
                if (result == null) result = caseCausalityParameter(entryPointOfInstantiation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.EXIT_POINT_OF_INSTANTIATION: {
                ExitPointOfInstantiation exitPointOfInstantiation = (ExitPointOfInstantiation)theEObject;
                T result = caseExitPointOfInstantiation(exitPointOfInstantiation);
                if (result == null) result = caseFlowPointOfInstantiation(exitPointOfInstantiation);
                if (result == null) result = caseFlowPointInstantiation(exitPointOfInstantiation);
                if (result == null) result = caseElement(exitPointOfInstantiation);
                if (result == null) result = caseCausalityParameter(exitPointOfInstantiation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION: {
                InteractionContributionOfInstantiation interactionContributionOfInstantiation = (InteractionContributionOfInstantiation)theEObject;
                T result = caseInteractionContributionOfInstantiation(interactionContributionOfInstantiation);
                if (result == null) result = caseInteractionContributionInstantiation(interactionContributionOfInstantiation);
                if (result == null) result = caseElement(interactionContributionOfInstantiation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.DELEGATED_INTERACTION_CONTRIBUTION: {
                DelegatedInteractionContribution delegatedInteractionContribution = (DelegatedInteractionContribution)theEObject;
                T result = caseDelegatedInteractionContribution(delegatedInteractionContribution);
                if (result == null) result = caseAbstractInteractionContributionOfType(delegatedInteractionContribution);
                if (result == null) result = caseInteractionContributionInstantiation(delegatedInteractionContribution);
                if (result == null) result = caseElement(delegatedInteractionContribution);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.INTERACTION_CONTRIBUTION_INSTANTIATION: {
                InteractionContributionInstantiation interactionContributionInstantiation = (InteractionContributionInstantiation)theEObject;
                T result = caseInteractionContributionInstantiation(interactionContributionInstantiation);
                if (result == null) result = caseElement(interactionContributionInstantiation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.ACTION_INSTANTIATION: {
                ActionInstantiation actionInstantiation = (ActionInstantiation)theEObject;
                T result = caseActionInstantiation(actionInstantiation);
                if (result == null) result = caseActivityInstantiation(actionInstantiation);
                if (result == null) result = caseCausalityParameter(actionInstantiation);
                if (result == null) result = caseElement(actionInstantiation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_TYPE: {
                InteractionContributionOfType interactionContributionOfType = (InteractionContributionOfType)theEObject;
                T result = caseInteractionContributionOfType(interactionContributionOfType);
                if (result == null) result = caseAbstractInteractionContributionOfType(interactionContributionOfType);
                if (result == null) result = caseCausalityParameter(interactionContributionOfType);
                if (result == null) result = caseInteractionContributionInstantiation(interactionContributionOfType);
                if (result == null) result = caseElement(interactionContributionOfType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.BEHAVIOR_INSTANTIATION_VARIABLE_REFERENCE: {
                BehaviorInstantiationVariableReference behaviorInstantiationVariableReference = (BehaviorInstantiationVariableReference)theEObject;
                T result = caseBehaviorInstantiationVariableReference(behaviorInstantiationVariableReference);
                if (result == null) result = caseBehaviorInstantiationReference(behaviorInstantiationVariableReference);
                if (result == null) result = caseInstantiationReference(behaviorInstantiationVariableReference);
                if (result == null) result = caseReference(behaviorInstantiationVariableReference);
                if (result == null) result = caseElement(behaviorInstantiationVariableReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.BEHAVIOR_INSTANTIATION_REFERENCE: {
                BehaviorInstantiationReference behaviorInstantiationReference = (BehaviorInstantiationReference)theEObject;
                T result = caseBehaviorInstantiationReference(behaviorInstantiationReference);
                if (result == null) result = caseInstantiationReference(behaviorInstantiationReference);
                if (result == null) result = caseReference(behaviorInstantiationReference);
                if (result == null) result = caseElement(behaviorInstantiationReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE: {
                AbstractInteractionContributionOfType abstractInteractionContributionOfType = (AbstractInteractionContributionOfType)theEObject;
                T result = caseAbstractInteractionContributionOfType(abstractInteractionContributionOfType);
                if (result == null) result = caseInteractionContributionInstantiation(abstractInteractionContributionOfType);
                if (result == null) result = caseElement(abstractInteractionContributionOfType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.FLOW_POINT_OF_INSTANTIATION: {
                FlowPointOfInstantiation flowPointOfInstantiation = (FlowPointOfInstantiation)theEObject;
                T result = caseFlowPointOfInstantiation(flowPointOfInstantiation);
                if (result == null) result = caseFlowPointInstantiation(flowPointOfInstantiation);
                if (result == null) result = caseElement(flowPointOfInstantiation);
                if (result == null) result = caseCausalityParameter(flowPointOfInstantiation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.FLOW_POINT_INSTANTIATION: {
                FlowPointInstantiation flowPointInstantiation = (FlowPointInstantiation)theEObject;
                T result = caseFlowPointInstantiation(flowPointInstantiation);
                if (result == null) result = caseElement(flowPointInstantiation);
                if (result == null) result = caseCausalityParameter(flowPointInstantiation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.ENTRY_POINT_OF_TYPE: {
                EntryPointOfType entryPointOfType = (EntryPointOfType)theEObject;
                T result = caseEntryPointOfType(entryPointOfType);
                if (result == null) result = caseFlowPointOfType(entryPointOfType);
                if (result == null) result = caseFlowPointInstantiation(entryPointOfType);
                if (result == null) result = caseElement(entryPointOfType);
                if (result == null) result = caseCausalityParameter(entryPointOfType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.EXIT_POINT_OF_TYPE: {
                ExitPointOfType exitPointOfType = (ExitPointOfType)theEObject;
                T result = caseExitPointOfType(exitPointOfType);
                if (result == null) result = caseFlowPointOfType(exitPointOfType);
                if (result == null) result = caseFlowPointInstantiation(exitPointOfType);
                if (result == null) result = caseElement(exitPointOfType);
                if (result == null) result = caseCausalityParameter(exitPointOfType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.ACTION_INSTANTIATION_HIERARCHY: {
                ActionInstantiationHierarchy actionInstantiationHierarchy = (ActionInstantiationHierarchy)theEObject;
                T result = caseActionInstantiationHierarchy(actionInstantiationHierarchy);
                if (result == null) result = caseInstantiationHierarchy(actionInstantiationHierarchy);
                if (result == null) result = caseHiearchy(actionInstantiationHierarchy);
                if (result == null) result = caseElement(actionInstantiationHierarchy);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.INTERACTION_INSTANTIATION: {
                InteractionInstantiation interactionInstantiation = (InteractionInstantiation)theEObject;
                T result = caseInteractionInstantiation(interactionInstantiation);
                if (result == null) result = caseActivityInstantiation(interactionInstantiation);
                if (result == null) result = caseElement(interactionInstantiation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.BEHAVIOR_DECLARATION: {
                BehaviorDeclaration behaviorDeclaration = (BehaviorDeclaration)theEObject;
                T result = caseBehaviorDeclaration(behaviorDeclaration);
                if (result == null) result = caseBehaviorInstantiation(behaviorDeclaration);
                if (result == null) result = caseElement(behaviorDeclaration);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Activity Instantiation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Activity Instantiation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActivityInstantiation(ActivityInstantiation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Behavior Instantiation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Behavior Instantiation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBehaviorInstantiation(BehaviorInstantiation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Recursive Behavior Instantiation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Recursive Behavior Instantiation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRecursiveBehaviorInstantiation(RecursiveBehaviorInstantiation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Behavior Instantiation Hierarchy</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Behavior Instantiation Hierarchy</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBehaviorInstantiationHierarchy(BehaviorInstantiationHierarchy object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Behavior Instantiation Static Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Behavior Instantiation Static Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBehaviorInstantiationStaticReference(BehaviorInstantiationStaticReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Flow Point Of Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Flow Point Of Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFlowPointOfType(FlowPointOfType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entry Point Of Instantiation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entry Point Of Instantiation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntryPointOfInstantiation(EntryPointOfInstantiation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exit Point Of Instantiation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exit Point Of Instantiation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExitPointOfInstantiation(ExitPointOfInstantiation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interaction Contribution Of Instantiation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interaction Contribution Of Instantiation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInteractionContributionOfInstantiation(InteractionContributionOfInstantiation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Delegated Interaction Contribution</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Delegated Interaction Contribution</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDelegatedInteractionContribution(DelegatedInteractionContribution object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interaction Contribution Instantiation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interaction Contribution Instantiation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInteractionContributionInstantiation(InteractionContributionInstantiation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Action Instantiation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Action Instantiation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActionInstantiation(ActionInstantiation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interaction Contribution Of Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interaction Contribution Of Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInteractionContributionOfType(InteractionContributionOfType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Behavior Instantiation Variable Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Behavior Instantiation Variable Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBehaviorInstantiationVariableReference(BehaviorInstantiationVariableReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Behavior Instantiation Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Behavior Instantiation Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBehaviorInstantiationReference(BehaviorInstantiationReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Interaction Contribution Of Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Interaction Contribution Of Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractInteractionContributionOfType(AbstractInteractionContributionOfType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Flow Point Of Instantiation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Flow Point Of Instantiation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFlowPointOfInstantiation(FlowPointOfInstantiation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Flow Point Instantiation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Flow Point Instantiation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFlowPointInstantiation(FlowPointInstantiation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entry Point Of Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entry Point Of Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntryPointOfType(EntryPointOfType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exit Point Of Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exit Point Of Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExitPointOfType(ExitPointOfType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Action Instantiation Hierarchy</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Action Instantiation Hierarchy</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActionInstantiationHierarchy(ActionInstantiationHierarchy object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interaction Instantiation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interaction Instantiation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInteractionInstantiation(InteractionInstantiation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Behavior Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Behavior Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBehaviorDeclaration(BehaviorDeclaration object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseElement(Element object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Hiearchy</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Hiearchy</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHiearchy(Hiearchy object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Instantiation Hierarchy</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Instantiation Hierarchy</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInstantiationHierarchy(InstantiationHierarchy object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReference(Reference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Instantiation Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Instantiation Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInstantiationReference(InstantiationReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCausalityParameter(CausalityParameter object) {
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

} //InstantiationSwitch
