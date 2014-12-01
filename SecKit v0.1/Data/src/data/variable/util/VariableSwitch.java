/**
 */
package data.variable.util;

import data.variable.*;

import models.Element;

import models.variable.StaticAssignment;
import models.variable.VariableAssignment;
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
 * @see data.variable.VariablePackage
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
            case VariablePackage.DATA_TYPE_VARIABLE: {
                DataTypeVariable dataTypeVariable = (DataTypeVariable)theEObject;
                T result = caseDataTypeVariable(dataTypeVariable);
                if (result == null) result = caseDataVariable(dataTypeVariable);
                if (result == null) result = caseVariableDeclaration(dataTypeVariable);
                if (result == null) result = caseElement(dataTypeVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VariablePackage.DATA_INSTANTIATION_VARIABLE: {
                DataInstantiationVariable dataInstantiationVariable = (DataInstantiationVariable)theEObject;
                T result = caseDataInstantiationVariable(dataInstantiationVariable);
                if (result == null) result = caseDataVariable(dataInstantiationVariable);
                if (result == null) result = caseVariableDeclaration(dataInstantiationVariable);
                if (result == null) result = caseElement(dataInstantiationVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VariablePackage.DATA_INSTANCE_VARIABLE: {
                DataInstanceVariable dataInstanceVariable = (DataInstanceVariable)theEObject;
                T result = caseDataInstanceVariable(dataInstanceVariable);
                if (result == null) result = caseDataVariable(dataInstanceVariable);
                if (result == null) result = caseVariableDeclaration(dataInstanceVariable);
                if (result == null) result = caseElement(dataInstanceVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VariablePackage.DATA_INSTANCE_ASSIGNMENT: {
                DataInstanceAssignment dataInstanceAssignment = (DataInstanceAssignment)theEObject;
                T result = caseDataInstanceAssignment(dataInstanceAssignment);
                if (result == null) result = caseStaticAssignment(dataInstanceAssignment);
                if (result == null) result = caseVariableAssignment(dataInstanceAssignment);
                if (result == null) result = caseElement(dataInstanceAssignment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VariablePackage.DATA_INSTANTIATION_ASSIGNMENT: {
                DataInstantiationAssignment dataInstantiationAssignment = (DataInstantiationAssignment)theEObject;
                T result = caseDataInstantiationAssignment(dataInstantiationAssignment);
                if (result == null) result = caseStaticAssignment(dataInstantiationAssignment);
                if (result == null) result = caseVariableAssignment(dataInstantiationAssignment);
                if (result == null) result = caseElement(dataInstantiationAssignment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VariablePackage.DATA_TYPE_ASSIGNMENT: {
                DataTypeAssignment dataTypeAssignment = (DataTypeAssignment)theEObject;
                T result = caseDataTypeAssignment(dataTypeAssignment);
                if (result == null) result = caseStaticAssignment(dataTypeAssignment);
                if (result == null) result = caseVariableAssignment(dataTypeAssignment);
                if (result == null) result = caseElement(dataTypeAssignment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VariablePackage.DATA_VARIABLE: {
                DataVariable dataVariable = (DataVariable)theEObject;
                T result = caseDataVariable(dataVariable);
                if (result == null) result = caseVariableDeclaration(dataVariable);
                if (result == null) result = caseElement(dataVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Type Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Type Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataTypeVariable(DataTypeVariable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Instantiation Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Instantiation Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataInstantiationVariable(DataInstantiationVariable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Instance Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Instance Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataInstanceVariable(DataInstanceVariable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Instance Assignment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Instance Assignment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataInstanceAssignment(DataInstanceAssignment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Instantiation Assignment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Instantiation Assignment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataInstantiationAssignment(DataInstantiationAssignment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Type Assignment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Type Assignment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataTypeAssignment(DataTypeAssignment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataVariable(DataVariable object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVariableAssignment(VariableAssignment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Static Assignment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Static Assignment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStaticAssignment(StaticAssignment object) {
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
