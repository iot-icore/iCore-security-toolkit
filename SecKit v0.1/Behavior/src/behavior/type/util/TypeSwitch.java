/**
 */
package behavior.type.util;

import behavior.type.*;

import models.Element;

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
 * @see behavior.type.TypePackage
 * @generated
 */
public class TypeSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static TypePackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeSwitch() {
        if (modelPackage == null) {
            modelPackage = TypePackage.eINSTANCE;
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
            case TypePackage.MONOLITHIC_BEHAVIOR_TYPE: {
                MonolithicBehaviorType monolithicBehaviorType = (MonolithicBehaviorType)theEObject;
                T result = caseMonolithicBehaviorType(monolithicBehaviorType);
                if (result == null) result = caseAbstractBehaviorType(monolithicBehaviorType);
                if (result == null) result = caseAbstractDataProducerType(monolithicBehaviorType);
                if (result == null) result = caseElement(monolithicBehaviorType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.ACTION_TYPE: {
                ActionType actionType = (ActionType)theEObject;
                T result = caseActionType(actionType);
                if (result == null) result = caseActivityType(actionType);
                if (result == null) result = caseDataProducerType(actionType);
                if (result == null) result = caseAbstractDataProducerType(actionType);
                if (result == null) result = caseElement(actionType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.INTERACTION_CONTRIBUTION_TYPE: {
                InteractionContributionType interactionContributionType = (InteractionContributionType)theEObject;
                T result = caseInteractionContributionType(interactionContributionType);
                if (result == null) result = caseElement(interactionContributionType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.ACTIVITY_TYPE: {
                ActivityType activityType = (ActivityType)theEObject;
                T result = caseActivityType(activityType);
                if (result == null) result = caseDataProducerType(activityType);
                if (result == null) result = caseAbstractDataProducerType(activityType);
                if (result == null) result = caseElement(activityType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE: {
                AbstractBehaviorType abstractBehaviorType = (AbstractBehaviorType)theEObject;
                T result = caseAbstractBehaviorType(abstractBehaviorType);
                if (result == null) result = caseAbstractDataProducerType(abstractBehaviorType);
                if (result == null) result = caseElement(abstractBehaviorType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.INTERACTION_TYPE: {
                InteractionType interactionType = (InteractionType)theEObject;
                T result = caseInteractionType(interactionType);
                if (result == null) result = caseActivityType(interactionType);
                if (result == null) result = caseDataProducerType(interactionType);
                if (result == null) result = caseAbstractDataProducerType(interactionType);
                if (result == null) result = caseElement(interactionType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.BEHAVIOR_TYPE_PACKAGE: {
                BehaviorTypePackage behaviorTypePackage = (BehaviorTypePackage)theEObject;
                T result = caseBehaviorTypePackage(behaviorTypePackage);
                if (result == null) result = caseElement(behaviorTypePackage);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.FLOW_POINT_TYPE: {
                FlowPointType flowPointType = (FlowPointType)theEObject;
                T result = caseFlowPointType(flowPointType);
                if (result == null) result = caseDataProducerType(flowPointType);
                if (result == null) result = caseAbstractDataProducerType(flowPointType);
                if (result == null) result = caseElement(flowPointType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.ENTRY_POINT_TYPE: {
                EntryPointType entryPointType = (EntryPointType)theEObject;
                T result = caseEntryPointType(entryPointType);
                if (result == null) result = caseFlowPointType(entryPointType);
                if (result == null) result = caseDataProducerType(entryPointType);
                if (result == null) result = caseAbstractDataProducerType(entryPointType);
                if (result == null) result = caseElement(entryPointType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.EXIT_POINT_TYPE: {
                ExitPointType exitPointType = (ExitPointType)theEObject;
                T result = caseExitPointType(exitPointType);
                if (result == null) result = caseFlowPointType(exitPointType);
                if (result == null) result = caseDataProducerType(exitPointType);
                if (result == null) result = caseAbstractDataProducerType(exitPointType);
                if (result == null) result = caseElement(exitPointType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.BEHAVIOR_TYPE: {
                BehaviorType behaviorType = (BehaviorType)theEObject;
                T result = caseBehaviorType(behaviorType);
                if (result == null) result = caseStructuredBehaviorType(behaviorType);
                if (result == null) result = caseMonolithicBehaviorType(behaviorType);
                if (result == null) result = caseAbstractBehaviorType(behaviorType);
                if (result == null) result = caseAbstractDataProducerType(behaviorType);
                if (result == null) result = caseElement(behaviorType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.STRUCTURED_BEHAVIOR_TYPE: {
                StructuredBehaviorType structuredBehaviorType = (StructuredBehaviorType)theEObject;
                T result = caseStructuredBehaviorType(structuredBehaviorType);
                if (result == null) result = caseAbstractBehaviorType(structuredBehaviorType);
                if (result == null) result = caseAbstractDataProducerType(structuredBehaviorType);
                if (result == null) result = caseElement(structuredBehaviorType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.DATA_PRODUCER_TYPE: {
                DataProducerType dataProducerType = (DataProducerType)theEObject;
                T result = caseDataProducerType(dataProducerType);
                if (result == null) result = caseAbstractDataProducerType(dataProducerType);
                if (result == null) result = caseElement(dataProducerType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.DATA_PRODUCER_CHARACTERIZATION: {
                DataProducerCharacterization dataProducerCharacterization = (DataProducerCharacterization)theEObject;
                T result = caseDataProducerCharacterization(dataProducerCharacterization);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.ABSTRACT_DATA_PRODUCER_TYPE: {
                AbstractDataProducerType abstractDataProducerType = (AbstractDataProducerType)theEObject;
                T result = caseAbstractDataProducerType(abstractDataProducerType);
                if (result == null) result = caseElement(abstractDataProducerType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Monolithic Behavior Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Monolithic Behavior Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMonolithicBehaviorType(MonolithicBehaviorType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Action Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Action Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActionType(ActionType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interaction Contribution Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interaction Contribution Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInteractionContributionType(InteractionContributionType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Activity Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Activity Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActivityType(ActivityType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Behavior Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Behavior Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractBehaviorType(AbstractBehaviorType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interaction Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interaction Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInteractionType(InteractionType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Behavior Type Package</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Behavior Type Package</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBehaviorTypePackage(BehaviorTypePackage object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Flow Point Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Flow Point Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFlowPointType(FlowPointType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entry Point Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entry Point Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntryPointType(EntryPointType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exit Point Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exit Point Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExitPointType(ExitPointType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Behavior Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Behavior Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBehaviorType(BehaviorType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Structured Behavior Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Structured Behavior Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStructuredBehaviorType(StructuredBehaviorType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Producer Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Producer Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataProducerType(DataProducerType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Producer Characterization</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Producer Characterization</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataProducerCharacterization(DataProducerCharacterization object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Data Producer Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Data Producer Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractDataProducerType(AbstractDataProducerType object) {
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

} //TypeSwitch
