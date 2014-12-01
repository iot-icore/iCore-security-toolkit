/**
 */
package behavior.variable.util;

import behavior.variable.*;

import models.Element;

import models.variable.VariableDeclaration;

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
 * @see behavior.variable.VariablePackage
 * @generated
 */
public class VariableSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static VariablePackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VariableSwitch() {
        if (modelPackage == null) {
            modelPackage = VariablePackage.eINSTANCE;
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
            case VariablePackage.ACTIVITY_VARIABLE: {
                ActivityVariable activityVariable = (ActivityVariable)theEObject;
                T result = caseActivityVariable(activityVariable);
                if (result == null) result = caseVariableDeclaration(activityVariable);
                if (result == null) result = caseElement(activityVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VariablePackage.ACTIVITY_TYPE_VARIABLE: {
                ActivityTypeVariable activityTypeVariable = (ActivityTypeVariable)theEObject;
                T result = caseActivityTypeVariable(activityTypeVariable);
                if (result == null) result = caseActivityVariable(activityTypeVariable);
                if (result == null) result = caseVariableDeclaration(activityTypeVariable);
                if (result == null) result = caseElement(activityTypeVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VariablePackage.ACTIVITY_INSTANTIATION_VARIABLE: {
                ActivityInstantiationVariable activityInstantiationVariable = (ActivityInstantiationVariable)theEObject;
                T result = caseActivityInstantiationVariable(activityInstantiationVariable);
                if (result == null) result = caseActivityVariable(activityInstantiationVariable);
                if (result == null) result = caseVariableDeclaration(activityInstantiationVariable);
                if (result == null) result = caseElement(activityInstantiationVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VariablePackage.ACTIVITY_INSTANCE_VARIABLE: {
                ActivityInstanceVariable activityInstanceVariable = (ActivityInstanceVariable)theEObject;
                T result = caseActivityInstanceVariable(activityInstanceVariable);
                if (result == null) result = caseActivityVariable(activityInstanceVariable);
                if (result == null) result = caseVariableDeclaration(activityInstanceVariable);
                if (result == null) result = caseElement(activityInstanceVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VariablePackage.FLOW_POINT_VARIABLE: {
                FlowPointVariable flowPointVariable = (FlowPointVariable)theEObject;
                T result = caseFlowPointVariable(flowPointVariable);
                if (result == null) result = caseVariableDeclaration(flowPointVariable);
                if (result == null) result = caseElement(flowPointVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VariablePackage.BEHAVIOR_VARIABLE: {
                BehaviorVariable behaviorVariable = (BehaviorVariable)theEObject;
                T result = caseBehaviorVariable(behaviorVariable);
                if (result == null) result = caseVariableDeclaration(behaviorVariable);
                if (result == null) result = caseElement(behaviorVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VariablePackage.BEHAVIOR_TYPE_VARIABLE: {
                BehaviorTypeVariable behaviorTypeVariable = (BehaviorTypeVariable)theEObject;
                T result = caseBehaviorTypeVariable(behaviorTypeVariable);
                if (result == null) result = caseBehaviorVariable(behaviorTypeVariable);
                if (result == null) result = caseVariableDeclaration(behaviorTypeVariable);
                if (result == null) result = caseElement(behaviorTypeVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VariablePackage.BEHAVIOR_INSTANTIATION_VARIABLE: {
                BehaviorInstantiationVariable behaviorInstantiationVariable = (BehaviorInstantiationVariable)theEObject;
                T result = caseBehaviorInstantiationVariable(behaviorInstantiationVariable);
                if (result == null) result = caseBehaviorVariable(behaviorInstantiationVariable);
                if (result == null) result = caseVariableDeclaration(behaviorInstantiationVariable);
                if (result == null) result = caseElement(behaviorInstantiationVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VariablePackage.BEHAVIOR_INSTANCE_VARIABLE: {
                BehaviorInstanceVariable behaviorInstanceVariable = (BehaviorInstanceVariable)theEObject;
                T result = caseBehaviorInstanceVariable(behaviorInstanceVariable);
                if (result == null) result = caseBehaviorVariable(behaviorInstanceVariable);
                if (result == null) result = caseVariableDeclaration(behaviorInstanceVariable);
                if (result == null) result = caseElement(behaviorInstanceVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VariablePackage.FLOW_POINT_TYPE_VARIABLE: {
                FlowPointTypeVariable flowPointTypeVariable = (FlowPointTypeVariable)theEObject;
                T result = caseFlowPointTypeVariable(flowPointTypeVariable);
                if (result == null) result = caseFlowPointVariable(flowPointTypeVariable);
                if (result == null) result = caseVariableDeclaration(flowPointTypeVariable);
                if (result == null) result = caseElement(flowPointTypeVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VariablePackage.FLOW_POINT_INSTANCE_VARIABLE: {
                FlowPointInstanceVariable flowPointInstanceVariable = (FlowPointInstanceVariable)theEObject;
                T result = caseFlowPointInstanceVariable(flowPointInstanceVariable);
                if (result == null) result = caseFlowPointVariable(flowPointInstanceVariable);
                if (result == null) result = caseVariableDeclaration(flowPointInstanceVariable);
                if (result == null) result = caseElement(flowPointInstanceVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VariablePackage.FLOW_POINT_INSTANTIATION_VARIABLE: {
                FlowPointInstantiationVariable flowPointInstantiationVariable = (FlowPointInstantiationVariable)theEObject;
                T result = caseFlowPointInstantiationVariable(flowPointInstantiationVariable);
                if (result == null) result = caseFlowPointVariable(flowPointInstantiationVariable);
                if (result == null) result = caseVariableDeclaration(flowPointInstantiationVariable);
                if (result == null) result = caseElement(flowPointInstantiationVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Activity Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Activity Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActivityVariable(ActivityVariable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Activity Type Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Activity Type Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActivityTypeVariable(ActivityTypeVariable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Activity Instantiation Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Activity Instantiation Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActivityInstantiationVariable(ActivityInstantiationVariable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Activity Instance Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Activity Instance Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActivityInstanceVariable(ActivityInstanceVariable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Flow Point Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Flow Point Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFlowPointVariable(FlowPointVariable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Behavior Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Behavior Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBehaviorVariable(BehaviorVariable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Behavior Type Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Behavior Type Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBehaviorTypeVariable(BehaviorTypeVariable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Behavior Instantiation Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Behavior Instantiation Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBehaviorInstantiationVariable(BehaviorInstantiationVariable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Behavior Instance Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Behavior Instance Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBehaviorInstanceVariable(BehaviorInstanceVariable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Flow Point Type Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Flow Point Type Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFlowPointTypeVariable(FlowPointTypeVariable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Flow Point Instance Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Flow Point Instance Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFlowPointInstanceVariable(FlowPointInstanceVariable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Flow Point Instantiation Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Flow Point Instantiation Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFlowPointInstantiationVariable(FlowPointInstantiationVariable object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVariableDeclaration(VariableDeclaration object) {
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

} //VariableSwitch
