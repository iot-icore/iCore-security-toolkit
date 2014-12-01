/**
 */
package rule.condition;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see rule.condition.ConditionPackage
 * @generated
 */
public interface ConditionFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ConditionFactory eINSTANCE = rule.condition.impl.ConditionFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Constant</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Constant</em>'.
     * @generated
     */
    Constant createConstant();

    /**
     * Returns a new object of class '<em>Formula Template</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Formula Template</em>'.
     * @generated
     */
    FormulaTemplate createFormulaTemplate();

    /**
     * Returns a new object of class '<em>Formula Instantiation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Formula Instantiation</em>'.
     * @generated
     */
    FormulaInstantiation createFormulaInstantiation();

    /**
     * Returns a new object of class '<em>Event Pattern</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Event Pattern</em>'.
     * @generated
     */
    EventPattern createEventPattern();

    /**
     * Returns a new object of class '<em>Time Step Event Pattern</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Time Step Event Pattern</em>'.
     * @generated
     */
    TimeStepEventPattern createTimeStepEventPattern();

    /**
     * Returns a new object of class '<em>Formula Variable Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Formula Variable Reference</em>'.
     * @generated
     */
    FormulaVariableReference createFormulaVariableReference();

    /**
     * Returns a new object of class '<em>Formula Assignment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Formula Assignment</em>'.
     * @generated
     */
    FormulaAssignment createFormulaAssignment();

    /**
     * Returns a new object of class '<em>Formula Variable</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Formula Variable</em>'.
     * @generated
     */
    FormulaVariable createFormulaVariable();

    /**
     * Returns a new object of class '<em>Pattern Operator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pattern Operator</em>'.
     * @generated
     */
    PatternOperator createPatternOperator();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ConditionPackage getConditionPackage();

} //ConditionFactory
