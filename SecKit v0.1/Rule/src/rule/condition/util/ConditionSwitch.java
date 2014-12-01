/**
 */
package rule.condition.util;

import models.Element;
import models.Pattern;

import models.variable.StaticAssignment;
import models.variable.VariableAssignment;
import models.variable.VariableDeclaration;
import models.variable.VariableReference;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import rule.condition.*;

import rule.template.Template;

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
 * @see rule.condition.ConditionPackage
 * @generated
 */
public class ConditionSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ConditionPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConditionSwitch() {
        if (modelPackage == null) {
            modelPackage = ConditionPackage.eINSTANCE;
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
            case ConditionPackage.ATOM: {
                Atom atom = (Atom)theEObject;
                T result = caseAtom(atom);
                if (result == null) result = caseElement(atom);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ConditionPackage.OPERATOR: {
                Operator operator = (Operator)theEObject;
                T result = caseOperator(operator);
                if (result == null) result = caseAtom(operator);
                if (result == null) result = caseElement(operator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ConditionPackage.CONSTANT: {
                Constant constant = (Constant)theEObject;
                T result = caseConstant(constant);
                if (result == null) result = caseAtom(constant);
                if (result == null) result = caseNullary(constant);
                if (result == null) result = caseElement(constant);
                if (result == null) result = caseArity(constant);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ConditionPackage.FORMULA_TEMPLATE: {
                FormulaTemplate formulaTemplate = (FormulaTemplate)theEObject;
                T result = caseFormulaTemplate(formulaTemplate);
                if (result == null) result = caseElement(formulaTemplate);
                if (result == null) result = caseTemplate(formulaTemplate);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ConditionPackage.FORMULA_INSTANTIATION: {
                FormulaInstantiation formulaInstantiation = (FormulaInstantiation)theEObject;
                T result = caseFormulaInstantiation(formulaInstantiation);
                if (result == null) result = caseAtom(formulaInstantiation);
                if (result == null) result = caseNullary(formulaInstantiation);
                if (result == null) result = caseElement(formulaInstantiation);
                if (result == null) result = caseArity(formulaInstantiation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ConditionPackage.EVENT_PATTERN: {
                EventPattern eventPattern = (EventPattern)theEObject;
                T result = caseEventPattern(eventPattern);
                if (result == null) result = casePattern(eventPattern);
                if (result == null) result = caseNullary(eventPattern);
                if (result == null) result = caseAtom(eventPattern);
                if (result == null) result = caseElement(eventPattern);
                if (result == null) result = caseArity(eventPattern);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ConditionPackage.TIME_STEP_EVENT_PATTERN: {
                TimeStepEventPattern timeStepEventPattern = (TimeStepEventPattern)theEObject;
                T result = caseTimeStepEventPattern(timeStepEventPattern);
                if (result == null) result = caseEventPattern(timeStepEventPattern);
                if (result == null) result = casePattern(timeStepEventPattern);
                if (result == null) result = caseNullary(timeStepEventPattern);
                if (result == null) result = caseAtom(timeStepEventPattern);
                if (result == null) result = caseElement(timeStepEventPattern);
                if (result == null) result = caseArity(timeStepEventPattern);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ConditionPackage.FORMULA_VARIABLE_REFERENCE: {
                FormulaVariableReference formulaVariableReference = (FormulaVariableReference)theEObject;
                T result = caseFormulaVariableReference(formulaVariableReference);
                if (result == null) result = caseAtom(formulaVariableReference);
                if (result == null) result = caseVariableReference(formulaVariableReference);
                if (result == null) result = caseElement(formulaVariableReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ConditionPackage.FORMULA_ASSIGNMENT: {
                FormulaAssignment formulaAssignment = (FormulaAssignment)theEObject;
                T result = caseFormulaAssignment(formulaAssignment);
                if (result == null) result = caseStaticAssignment(formulaAssignment);
                if (result == null) result = caseVariableAssignment(formulaAssignment);
                if (result == null) result = caseElement(formulaAssignment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ConditionPackage.FORMULA_VARIABLE: {
                FormulaVariable formulaVariable = (FormulaVariable)theEObject;
                T result = caseFormulaVariable(formulaVariable);
                if (result == null) result = caseVariableDeclaration(formulaVariable);
                if (result == null) result = caseElement(formulaVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ConditionPackage.UNARY: {
                Unary unary = (Unary)theEObject;
                T result = caseUnary(unary);
                if (result == null) result = caseArity(unary);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ConditionPackage.BINARY: {
                Binary binary = (Binary)theEObject;
                T result = caseBinary(binary);
                if (result == null) result = caseArity(binary);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ConditionPackage.MULTIARY: {
                Multiary multiary = (Multiary)theEObject;
                T result = caseMultiary(multiary);
                if (result == null) result = caseArity(multiary);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ConditionPackage.NULLARY: {
                Nullary nullary = (Nullary)theEObject;
                T result = caseNullary(nullary);
                if (result == null) result = caseArity(nullary);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ConditionPackage.ARITY: {
                Arity arity = (Arity)theEObject;
                T result = caseArity(arity);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ConditionPackage.PATTERN_OPERATOR: {
                PatternOperator patternOperator = (PatternOperator)theEObject;
                T result = casePatternOperator(patternOperator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Atom</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Atom</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAtom(Atom object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOperator(Operator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConstant(Constant object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Formula Template</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Formula Template</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFormulaTemplate(FormulaTemplate object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Formula Instantiation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Formula Instantiation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFormulaInstantiation(FormulaInstantiation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Event Pattern</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Event Pattern</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEventPattern(EventPattern object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Time Step Event Pattern</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Time Step Event Pattern</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTimeStepEventPattern(TimeStepEventPattern object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Formula Variable Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Formula Variable Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFormulaVariableReference(FormulaVariableReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Formula Assignment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Formula Assignment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFormulaAssignment(FormulaAssignment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Formula Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Formula Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFormulaVariable(FormulaVariable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Unary</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Unary</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnary(Unary object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Binary</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Binary</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBinary(Binary object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Multiary</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Multiary</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMultiary(Multiary object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Nullary</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Nullary</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNullary(Nullary object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Arity</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Arity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseArity(Arity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pattern Operator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pattern Operator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePatternOperator(PatternOperator object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Template</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Template</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTemplate(Template object) {
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

} //ConditionSwitch
