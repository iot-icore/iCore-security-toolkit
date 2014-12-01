/**
 */
package structure.variable.util;

import models.Element;

import models.variable.VariableDeclaration;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import structure.variable.*;

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
 * @see structure.variable.VariablePackage
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
            case VariablePackage.ENTITY_TYPE_VARIABLE: {
                EntityTypeVariable entityTypeVariable = (EntityTypeVariable)theEObject;
                T result = caseEntityTypeVariable(entityTypeVariable);
                if (result == null) result = caseEntityVariable(entityTypeVariable);
                if (result == null) result = caseVariableDeclaration(entityTypeVariable);
                if (result == null) result = caseElement(entityTypeVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VariablePackage.ENTITY_INSTANTIATION_VARIABLE: {
                EntityInstantiationVariable entityInstantiationVariable = (EntityInstantiationVariable)theEObject;
                T result = caseEntityInstantiationVariable(entityInstantiationVariable);
                if (result == null) result = caseEntityVariable(entityInstantiationVariable);
                if (result == null) result = caseVariableDeclaration(entityInstantiationVariable);
                if (result == null) result = caseElement(entityInstantiationVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VariablePackage.ENTITY_INSTANCE_VARIABLE: {
                EntityInstanceVariable entityInstanceVariable = (EntityInstanceVariable)theEObject;
                T result = caseEntityInstanceVariable(entityInstanceVariable);
                if (result == null) result = caseEntityVariable(entityInstanceVariable);
                if (result == null) result = caseVariableDeclaration(entityInstanceVariable);
                if (result == null) result = caseElement(entityInstanceVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VariablePackage.ENTITY_VARIABLE: {
                EntityVariable entityVariable = (EntityVariable)theEObject;
                T result = caseEntityVariable(entityVariable);
                if (result == null) result = caseVariableDeclaration(entityVariable);
                if (result == null) result = caseElement(entityVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VariablePackage.ENTITY_INSTANTIATION_HIERARCHY_VARIABLE: {
                EntityInstantiationHierarchyVariable entityInstantiationHierarchyVariable = (EntityInstantiationHierarchyVariable)theEObject;
                T result = caseEntityInstantiationHierarchyVariable(entityInstantiationHierarchyVariable);
                if (result == null) result = caseEntityVariable(entityInstantiationHierarchyVariable);
                if (result == null) result = caseVariableDeclaration(entityInstantiationHierarchyVariable);
                if (result == null) result = caseElement(entityInstantiationHierarchyVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entity Type Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entity Type Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntityTypeVariable(EntityTypeVariable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entity Instantiation Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entity Instantiation Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntityInstantiationVariable(EntityInstantiationVariable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entity Instance Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entity Instance Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntityInstanceVariable(EntityInstanceVariable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entity Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entity Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntityVariable(EntityVariable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entity Instantiation Hierarchy Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entity Instantiation Hierarchy Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntityInstantiationHierarchyVariable(EntityInstantiationHierarchyVariable object) {
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
