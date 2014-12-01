/**
 */
package data.pattern.util;

import data.pattern.*;

import models.Element;
import models.Pattern;

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
 * @see data.pattern.PatternPackage
 * @generated
 */
public class PatternSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static PatternPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PatternSwitch() {
        if (modelPackage == null) {
            modelPackage = PatternPackage.eINSTANCE;
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
            case PatternPackage.DATA_PATTERN: {
                DataPattern dataPattern = (DataPattern)theEObject;
                T result = caseDataPattern(dataPattern);
                if (result == null) result = casePattern(dataPattern);
                if (result == null) result = caseElement(dataPattern);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PatternPackage.REG_EXP_PATTERN: {
                RegExpPattern regExpPattern = (RegExpPattern)theEObject;
                T result = caseRegExpPattern(regExpPattern);
                if (result == null) result = caseDataPattern(regExpPattern);
                if (result == null) result = casePattern(regExpPattern);
                if (result == null) result = caseElement(regExpPattern);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PatternPackage.XPATH_PATTERN: {
                XPathPattern xPathPattern = (XPathPattern)theEObject;
                T result = caseXPathPattern(xPathPattern);
                if (result == null) result = caseDataPattern(xPathPattern);
                if (result == null) result = casePattern(xPathPattern);
                if (result == null) result = caseElement(xPathPattern);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PatternPackage.LITERAL_PATTERN: {
                LiteralPattern literalPattern = (LiteralPattern)theEObject;
                T result = caseLiteralPattern(literalPattern);
                if (result == null) result = caseDataPattern(literalPattern);
                if (result == null) result = casePattern(literalPattern);
                if (result == null) result = caseElement(literalPattern);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Pattern</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Pattern</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataPattern(DataPattern object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Reg Exp Pattern</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Reg Exp Pattern</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRegExpPattern(RegExpPattern object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>XPath Pattern</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>XPath Pattern</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseXPathPattern(XPathPattern object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Literal Pattern</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Literal Pattern</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLiteralPattern(LiteralPattern object) {
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

} //PatternSwitch
