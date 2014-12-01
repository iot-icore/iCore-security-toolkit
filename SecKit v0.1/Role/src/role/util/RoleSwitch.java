/**
 */
package role.util;

import java.util.Map;

import models.Element;
import models.Model;
import models.Pattern;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import role.*;

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
 * @see role.RolePackage
 * @generated
 */
public class RoleSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static RolePackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RoleSwitch() {
        if (modelPackage == null) {
            modelPackage = RolePackage.eINSTANCE;
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
            case RolePackage.ROLE_TYPE: {
                RoleType roleType = (RoleType)theEObject;
                T result = caseRoleType(roleType);
                if (result == null) result = caseElement(roleType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RolePackage.ROLE_DESIGN_MODEL: {
                RoleDesignModel roleDesignModel = (RoleDesignModel)theEObject;
                T result = caseRoleDesignModel(roleDesignModel);
                if (result == null) result = caseModel(roleDesignModel);
                if (result == null) result = caseElement(roleDesignModel);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RolePackage.ROLE_TYPE_PACKAGE: {
                RoleTypePackage roleTypePackage = (RoleTypePackage)theEObject;
                T result = caseRoleTypePackage(roleTypePackage);
                if (result == null) result = caseElement(roleTypePackage);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RolePackage.ROLE_RUNTIME_MODEL: {
                RoleRuntimeModel roleRuntimeModel = (RoleRuntimeModel)theEObject;
                T result = caseRoleRuntimeModel(roleRuntimeModel);
                if (result == null) result = caseModel(roleRuntimeModel);
                if (result == null) result = caseElement(roleRuntimeModel);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RolePackage.ROLE_ASSIGNMENT_MAP: {
                @SuppressWarnings("unchecked") Map.Entry<RoleType, RoleAssignment> roleAssignmentMap = (Map.Entry<RoleType, RoleAssignment>)theEObject;
                T result = caseRoleAssignmentMap(roleAssignmentMap);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RolePackage.ROLE_ASSIGNMENT: {
                RoleAssignment roleAssignment = (RoleAssignment)theEObject;
                T result = caseRoleAssignment(roleAssignment);
                if (result == null) result = caseElement(roleAssignment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RolePackage.ROLE_PATTERN: {
                RolePattern rolePattern = (RolePattern)theEObject;
                T result = caseRolePattern(rolePattern);
                if (result == null) result = caseAbstractRolePattern(rolePattern);
                if (result == null) result = casePattern(rolePattern);
                if (result == null) result = caseElement(rolePattern);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RolePackage.IDENTITY_ROLE_PATTERN: {
                IdentityRolePattern identityRolePattern = (IdentityRolePattern)theEObject;
                T result = caseIdentityRolePattern(identityRolePattern);
                if (result == null) result = caseAbstractRolePattern(identityRolePattern);
                if (result == null) result = casePattern(identityRolePattern);
                if (result == null) result = caseElement(identityRolePattern);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RolePackage.ABSTRACT_ROLE_PATTERN: {
                AbstractRolePattern abstractRolePattern = (AbstractRolePattern)theEObject;
                T result = caseAbstractRolePattern(abstractRolePattern);
                if (result == null) result = casePattern(abstractRolePattern);
                if (result == null) result = caseElement(abstractRolePattern);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRoleType(RoleType object) {
        return null;
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
    public T caseRoleDesignModel(RoleDesignModel object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Type Package</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Type Package</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRoleTypePackage(RoleTypePackage object) {
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
    public T caseRoleRuntimeModel(RoleRuntimeModel object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Assignment Map</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Assignment Map</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRoleAssignmentMap(Map.Entry<RoleType, RoleAssignment> object) {
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
    public T caseRoleAssignment(RoleAssignment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pattern</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pattern</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRolePattern(RolePattern object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identity Role Pattern</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identity Role Pattern</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentityRolePattern(IdentityRolePattern object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Role Pattern</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Role Pattern</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractRolePattern(AbstractRolePattern object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Pattern</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pattern</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePattern(Pattern object) {
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

} //RoleSwitch
