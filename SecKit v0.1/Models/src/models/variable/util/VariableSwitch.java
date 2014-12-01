/**
 */
package models.variable.util;

import models.Element;

import models.variable.*;

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
 * @see models.variable.VariablePackage
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
            case VariablePackage.VARIABLE_ASSIGNMENT: {
                VariableAssignment variableAssignment = (VariableAssignment)theEObject;
                T result = caseVariableAssignment(variableAssignment);
                if (result == null) result = caseElement(variableAssignment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VariablePackage.VARIABLE_INSTANCE: {
                VariableInstance variableInstance = (VariableInstance)theEObject;
                T result = caseVariableInstance(variableInstance);
                if (result == null) result = caseElement(variableInstance);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VariablePackage.REFERENCE_VARIABLE_ASSIGNMENT: {
                ReferenceVariableAssignment referenceVariableAssignment = (ReferenceVariableAssignment)theEObject;
                T result = caseReferenceVariableAssignment(referenceVariableAssignment);
                if (result == null) result = caseVariableAssignment(referenceVariableAssignment);
                if (result == null) result = caseElement(referenceVariableAssignment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VariablePackage.STATIC_ASSIGNMENT: {
                StaticAssignment staticAssignment = (StaticAssignment)theEObject;
                T result = caseStaticAssignment(staticAssignment);
                if (result == null) result = caseVariableAssignment(staticAssignment);
                if (result == null) result = caseElement(staticAssignment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VariablePackage.VARIABLE_DECLARATION: {
                VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
                T result = caseVariableDeclaration(variableDeclaration);
                if (result == null) result = caseElement(variableDeclaration);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VariablePackage.VARIABLE_REFERENCE: {
                VariableReference variableReference = (VariableReference)theEObject;
                T result = caseVariableReference(variableReference);
                if (result == null) result = caseElement(variableReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VariablePackage.XPATH_VARIABLE_ASSIGNMENT: {
                XPathVariableAssignment xPathVariableAssignment = (XPathVariableAssignment)theEObject;
                T result = caseXPathVariableAssignment(xPathVariableAssignment);
                if (result == null) result = caseVariableAssignment(xPathVariableAssignment);
                if (result == null) result = caseElement(xPathVariableAssignment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VariablePackage.STRING_ASSIGNMENT: {
                StringAssignment stringAssignment = (StringAssignment)theEObject;
                T result = caseStringAssignment(stringAssignment);
                if (result == null) result = caseStaticAssignment(stringAssignment);
                if (result == null) result = caseVariableAssignment(stringAssignment);
                if (result == null) result = caseElement(stringAssignment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VariablePackage.REG_EXP_VARIABLE_ASSIGNMENT: {
                RegExpVariableAssignment regExpVariableAssignment = (RegExpVariableAssignment)theEObject;
                T result = caseRegExpVariableAssignment(regExpVariableAssignment);
                if (result == null) result = caseReferenceVariableAssignment(regExpVariableAssignment);
                if (result == null) result = caseVariableAssignment(regExpVariableAssignment);
                if (result == null) result = caseElement(regExpVariableAssignment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
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
     * Returns the result of interpreting the object as an instance of '<em>Instance</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Instance</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVariableInstance(VariableInstance object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Reference Variable Assignment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Reference Variable Assignment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReferenceVariableAssignment(ReferenceVariableAssignment object) {
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
    public T caseVariableReference(VariableReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>XPath Variable Assignment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>XPath Variable Assignment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseXPathVariableAssignment(XPathVariableAssignment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>String Assignment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>String Assignment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStringAssignment(StringAssignment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Reg Exp Variable Assignment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Reg Exp Variable Assignment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRegExpVariableAssignment(RegExpVariableAssignment object) {
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

} //VariableSwitch
