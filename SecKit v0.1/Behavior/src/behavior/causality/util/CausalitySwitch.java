/**
 */
package behavior.causality.util;

import behavior.causality.*;

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
 * @see behavior.causality.CausalityPackage
 * @generated
 */
public class CausalitySwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static CausalityPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CausalitySwitch() {
        if (modelPackage == null) {
            modelPackage = CausalityPackage.eINSTANCE;
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
            case CausalityPackage.POINT_CONDITION: {
                PointCondition pointCondition = (PointCondition)theEObject;
                T result = casePointCondition(pointCondition);
                if (result == null) result = caseBasicCausalityCondition(pointCondition);
                if (result == null) result = caseCausalityCondition(pointCondition);
                if (result == null) result = caseElement(pointCondition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CausalityPackage.EXIT_POINT_CONDITION: {
                ExitPointCondition exitPointCondition = (ExitPointCondition)theEObject;
                T result = caseExitPointCondition(exitPointCondition);
                if (result == null) result = casePointCondition(exitPointCondition);
                if (result == null) result = caseBasicCausalityCondition(exitPointCondition);
                if (result == null) result = caseCausalityCondition(exitPointCondition);
                if (result == null) result = caseElement(exitPointCondition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CausalityPackage.ENTRY_POINT_CONDITION: {
                EntryPointCondition entryPointCondition = (EntryPointCondition)theEObject;
                T result = caseEntryPointCondition(entryPointCondition);
                if (result == null) result = casePointCondition(entryPointCondition);
                if (result == null) result = caseBasicCausalityCondition(entryPointCondition);
                if (result == null) result = caseCausalityCondition(entryPointCondition);
                if (result == null) result = caseElement(entryPointCondition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CausalityPackage.BINARY_CAUSALITY_CONDITION: {
                BinaryCausalityCondition binaryCausalityCondition = (BinaryCausalityCondition)theEObject;
                T result = caseBinaryCausalityCondition(binaryCausalityCondition);
                if (result == null) result = caseBasicCausalityCondition(binaryCausalityCondition);
                if (result == null) result = caseCausalityCondition(binaryCausalityCondition);
                if (result == null) result = caseElement(binaryCausalityCondition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CausalityPackage.OR_CONDITION: {
                OrCondition orCondition = (OrCondition)theEObject;
                T result = caseOrCondition(orCondition);
                if (result == null) result = caseCausalityCondition(orCondition);
                if (result == null) result = caseElement(orCondition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CausalityPackage.AND_CONDITION: {
                AndCondition andCondition = (AndCondition)theEObject;
                T result = caseAndCondition(andCondition);
                if (result == null) result = caseCausalityCondition(andCondition);
                if (result == null) result = caseElement(andCondition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CausalityPackage.CAUSALITY_PARAMETER: {
                CausalityParameter causalityParameter = (CausalityParameter)theEObject;
                T result = caseCausalityParameter(causalityParameter);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CausalityPackage.CAUSALITY_CONDITION: {
                CausalityCondition causalityCondition = (CausalityCondition)theEObject;
                T result = caseCausalityCondition(causalityCondition);
                if (result == null) result = caseElement(causalityCondition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CausalityPackage.CAUSALITY_RELATION: {
                CausalityRelation causalityRelation = (CausalityRelation)theEObject;
                T result = caseCausalityRelation(causalityRelation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CausalityPackage.CAUSALITY_CONSTRAINT: {
                CausalityConstraint causalityConstraint = (CausalityConstraint)theEObject;
                T result = caseCausalityConstraint(causalityConstraint);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CausalityPackage.BASIC_CAUSALITY_CONDITION: {
                BasicCausalityCondition basicCausalityCondition = (BasicCausalityCondition)theEObject;
                T result = caseBasicCausalityCondition(basicCausalityCondition);
                if (result == null) result = caseCausalityCondition(basicCausalityCondition);
                if (result == null) result = caseElement(basicCausalityCondition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CausalityPackage.START_CONDITION: {
                StartCondition startCondition = (StartCondition)theEObject;
                T result = caseStartCondition(startCondition);
                if (result == null) result = caseBasicCausalityCondition(startCondition);
                if (result == null) result = caseCausalityCondition(startCondition);
                if (result == null) result = caseElement(startCondition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CausalityPackage.DISABLING_CONDITION: {
                DisablingCondition disablingCondition = (DisablingCondition)theEObject;
                T result = caseDisablingCondition(disablingCondition);
                if (result == null) result = caseBinaryCausalityCondition(disablingCondition);
                if (result == null) result = caseBasicCausalityCondition(disablingCondition);
                if (result == null) result = caseCausalityCondition(disablingCondition);
                if (result == null) result = caseElement(disablingCondition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CausalityPackage.ENABLING_CONDITION: {
                EnablingCondition enablingCondition = (EnablingCondition)theEObject;
                T result = caseEnablingCondition(enablingCondition);
                if (result == null) result = caseBinaryCausalityCondition(enablingCondition);
                if (result == null) result = caseBasicCausalityCondition(enablingCondition);
                if (result == null) result = caseCausalityCondition(enablingCondition);
                if (result == null) result = caseElement(enablingCondition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case CausalityPackage.SYNCHRONIZATION_CONDITION: {
                SynchronizationCondition synchronizationCondition = (SynchronizationCondition)theEObject;
                T result = caseSynchronizationCondition(synchronizationCondition);
                if (result == null) result = caseBinaryCausalityCondition(synchronizationCondition);
                if (result == null) result = caseBasicCausalityCondition(synchronizationCondition);
                if (result == null) result = caseCausalityCondition(synchronizationCondition);
                if (result == null) result = caseElement(synchronizationCondition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Point Condition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Point Condition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePointCondition(PointCondition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exit Point Condition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exit Point Condition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExitPointCondition(ExitPointCondition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entry Point Condition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entry Point Condition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntryPointCondition(EntryPointCondition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Binary Causality Condition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Binary Causality Condition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBinaryCausalityCondition(BinaryCausalityCondition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Or Condition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Or Condition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOrCondition(OrCondition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>And Condition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>And Condition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAndCondition(AndCondition object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCausalityCondition(CausalityCondition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCausalityRelation(CausalityRelation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCausalityConstraint(CausalityConstraint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Basic Causality Condition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Basic Causality Condition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBasicCausalityCondition(BasicCausalityCondition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Start Condition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Start Condition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStartCondition(StartCondition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Disabling Condition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Disabling Condition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDisablingCondition(DisablingCondition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Enabling Condition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Enabling Condition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEnablingCondition(EnablingCondition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Synchronization Condition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Synchronization Condition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSynchronizationCondition(SynchronizationCondition object) {
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

} //CausalitySwitch
