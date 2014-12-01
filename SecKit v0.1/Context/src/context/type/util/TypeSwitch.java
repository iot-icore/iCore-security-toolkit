/**
 */
package context.type.util;

import context.type.*;

import data.type.DataType;

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
 * @see context.type.TypePackage
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
            case TypePackage.CONTEXT_SITUATION_TYPE: {
                ContextSituationType contextSituationType = (ContextSituationType)theEObject;
                T result = caseContextSituationType(contextSituationType);
                if (result == null) result = caseElement(contextSituationType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.CONTEXT_INFORMATION_TYPE: {
                ContextInformationType contextInformationType = (ContextInformationType)theEObject;
                T result = caseContextInformationType(contextInformationType);
                if (result == null) result = caseDataType(contextInformationType);
                if (result == null) result = caseElement(contextInformationType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.CONTEXT_TYPE_PACKAGE: {
                ContextTypePackage contextTypePackage = (ContextTypePackage)theEObject;
                T result = caseContextTypePackage(contextTypePackage);
                if (result == null) result = caseElement(contextTypePackage);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.ENTITY_ROLE_TYPE: {
                EntityRoleType entityRoleType = (EntityRoleType)theEObject;
                T result = caseEntityRoleType(entityRoleType);
                if (result == null) result = caseElement(entityRoleType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.COMPOSITE_CONTEXT_SITUATION_TYPE: {
                CompositeContextSituationType compositeContextSituationType = (CompositeContextSituationType)theEObject;
                T result = caseCompositeContextSituationType(compositeContextSituationType);
                if (result == null) result = caseContextSituationType(compositeContextSituationType);
                if (result == null) result = caseElement(compositeContextSituationType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.SITUATION_ROLE_TYPE: {
                SituationRoleType situationRoleType = (SituationRoleType)theEObject;
                T result = caseSituationRoleType(situationRoleType);
                if (result == null) result = caseElement(situationRoleType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Context Situation Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Context Situation Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseContextSituationType(ContextSituationType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Context Information Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Context Information Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseContextInformationType(ContextInformationType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Context Type Package</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Context Type Package</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseContextTypePackage(ContextTypePackage object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entity Role Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entity Role Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntityRoleType(EntityRoleType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Composite Context Situation Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Composite Context Situation Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCompositeContextSituationType(CompositeContextSituationType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Situation Role Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Situation Role Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSituationRoleType(SituationRoleType object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataType(DataType object) {
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
