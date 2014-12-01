/**
 */
package identity.util;

import identity.*;

import models.Element;
import models.Model;

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
 * @see identity.IdentityPackage
 * @generated
 */
public class IdentitySwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static IdentityPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentitySwitch() {
        if (modelPackage == null) {
            modelPackage = IdentityPackage.eINSTANCE;
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
            case IdentityPackage.IDENTITY_DESIGN_MODEL: {
                IdentityDesignModel identityDesignModel = (IdentityDesignModel)theEObject;
                T result = caseIdentityDesignModel(identityDesignModel);
                if (result == null) result = caseModel(identityDesignModel);
                if (result == null) result = caseElement(identityDesignModel);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case IdentityPackage.IDENTITY_RUNTIME_MODEL: {
                IdentityRuntimeModel identityRuntimeModel = (IdentityRuntimeModel)theEObject;
                T result = caseIdentityRuntimeModel(identityRuntimeModel);
                if (result == null) result = caseModel(identityRuntimeModel);
                if (result == null) result = caseElement(identityRuntimeModel);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case IdentityPackage.IDENTITY_VARIABLE: {
                IdentityVariable identityVariable = (IdentityVariable)theEObject;
                T result = caseIdentityVariable(identityVariable);
                if (result == null) result = caseVariableDeclaration(identityVariable);
                if (result == null) result = caseElement(identityVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case IdentityPackage.IDENTITY_INSTANCE_VARIABLE: {
                IdentityInstanceVariable identityInstanceVariable = (IdentityInstanceVariable)theEObject;
                T result = caseIdentityInstanceVariable(identityInstanceVariable);
                if (result == null) result = caseIdentityVariable(identityInstanceVariable);
                if (result == null) result = caseVariableDeclaration(identityInstanceVariable);
                if (result == null) result = caseElement(identityInstanceVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case IdentityPackage.IDENTITY_ATTRIBUTE_VARIABLE: {
                IdentityAttributeVariable identityAttributeVariable = (IdentityAttributeVariable)theEObject;
                T result = caseIdentityAttributeVariable(identityAttributeVariable);
                if (result == null) result = caseIdentityVariable(identityAttributeVariable);
                if (result == null) result = caseVariableDeclaration(identityAttributeVariable);
                if (result == null) result = caseElement(identityAttributeVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Design Model</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Design Model</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentityDesignModel(IdentityDesignModel object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Runtime Model</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Runtime Model</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentityRuntimeModel(IdentityRuntimeModel object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentityVariable(IdentityVariable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Instance Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Instance Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentityInstanceVariable(IdentityInstanceVariable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentityAttributeVariable(IdentityAttributeVariable object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Model</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModel(Model object) {
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

} //IdentitySwitch
