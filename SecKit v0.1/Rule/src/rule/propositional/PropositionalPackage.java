/**
 */
package rule.propositional;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import rule.condition.ConditionPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see rule.propositional.PropositionalFactory
 * @model kind="package"
 * @generated
 */
public interface PropositionalPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "propositional";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://rule/propositional/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "rule-propositional";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    PropositionalPackage eINSTANCE = rule.propositional.impl.PropositionalPackageImpl.init();

    /**
     * The meta object id for the '{@link rule.propositional.impl.PropositionalOperatorImpl <em>Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.propositional.impl.PropositionalOperatorImpl
     * @see rule.propositional.impl.PropositionalPackageImpl#getPropositionalOperator()
     * @generated
     */
    int PROPOSITIONAL_OPERATOR = 4;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPOSITIONAL_OPERATOR__VISUAL_ELEMENTS = ConditionPackage.OPERATOR__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPOSITIONAL_OPERATOR__ID = ConditionPackage.OPERATOR__ID;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPOSITIONAL_OPERATOR__VARIABLE_ASSIGNMENTS = ConditionPackage.OPERATOR__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Operator</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPOSITIONAL_OPERATOR__OPERATOR = ConditionPackage.OPERATOR__OPERATOR;

    /**
     * The feature id for the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPOSITIONAL_OPERATOR__TEMPLATE = ConditionPackage.OPERATOR__TEMPLATE;

    /**
     * The feature id for the '<em><b>Operands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPOSITIONAL_OPERATOR__OPERANDS = ConditionPackage.OPERATOR__OPERANDS;

    /**
     * The number of structural features of the '<em>Operator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPOSITIONAL_OPERATOR_FEATURE_COUNT = ConditionPackage.OPERATOR_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Operator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPOSITIONAL_OPERATOR_OPERATION_COUNT = ConditionPackage.OPERATOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.propositional.impl.AndImpl <em>And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.propositional.impl.AndImpl
     * @see rule.propositional.impl.PropositionalPackageImpl#getAnd()
     * @generated
     */
    int AND = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND__VISUAL_ELEMENTS = PROPOSITIONAL_OPERATOR__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND__ID = PROPOSITIONAL_OPERATOR__ID;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND__VARIABLE_ASSIGNMENTS = PROPOSITIONAL_OPERATOR__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Operator</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND__OPERATOR = PROPOSITIONAL_OPERATOR__OPERATOR;

    /**
     * The feature id for the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND__TEMPLATE = PROPOSITIONAL_OPERATOR__TEMPLATE;

    /**
     * The feature id for the '<em><b>Operands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND__OPERANDS = PROPOSITIONAL_OPERATOR__OPERANDS;

    /**
     * The number of structural features of the '<em>And</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_FEATURE_COUNT = PROPOSITIONAL_OPERATOR_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>And</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AND_OPERATION_COUNT = PROPOSITIONAL_OPERATOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.propositional.impl.OrImpl <em>Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.propositional.impl.OrImpl
     * @see rule.propositional.impl.PropositionalPackageImpl#getOr()
     * @generated
     */
    int OR = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OR__VISUAL_ELEMENTS = PROPOSITIONAL_OPERATOR__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OR__ID = PROPOSITIONAL_OPERATOR__ID;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OR__VARIABLE_ASSIGNMENTS = PROPOSITIONAL_OPERATOR__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Operator</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OR__OPERATOR = PROPOSITIONAL_OPERATOR__OPERATOR;

    /**
     * The feature id for the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OR__TEMPLATE = PROPOSITIONAL_OPERATOR__TEMPLATE;

    /**
     * The feature id for the '<em><b>Operands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OR__OPERANDS = PROPOSITIONAL_OPERATOR__OPERANDS;

    /**
     * The number of structural features of the '<em>Or</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OR_FEATURE_COUNT = PROPOSITIONAL_OPERATOR_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Or</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OR_OPERATION_COUNT = PROPOSITIONAL_OPERATOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.propositional.impl.NotImpl <em>Not</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.propositional.impl.NotImpl
     * @see rule.propositional.impl.PropositionalPackageImpl#getNot()
     * @generated
     */
    int NOT = 2;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOT__VISUAL_ELEMENTS = PROPOSITIONAL_OPERATOR__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOT__ID = PROPOSITIONAL_OPERATOR__ID;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOT__VARIABLE_ASSIGNMENTS = PROPOSITIONAL_OPERATOR__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Operator</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOT__OPERATOR = PROPOSITIONAL_OPERATOR__OPERATOR;

    /**
     * The feature id for the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOT__TEMPLATE = PROPOSITIONAL_OPERATOR__TEMPLATE;

    /**
     * The feature id for the '<em><b>Operands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOT__OPERANDS = PROPOSITIONAL_OPERATOR__OPERANDS;

    /**
     * The number of structural features of the '<em>Not</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOT_FEATURE_COUNT = PROPOSITIONAL_OPERATOR_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Not</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOT_OPERATION_COUNT = PROPOSITIONAL_OPERATOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.propositional.impl.ImpliesImpl <em>Implies</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.propositional.impl.ImpliesImpl
     * @see rule.propositional.impl.PropositionalPackageImpl#getImplies()
     * @generated
     */
    int IMPLIES = 3;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLIES__VISUAL_ELEMENTS = PROPOSITIONAL_OPERATOR__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLIES__ID = PROPOSITIONAL_OPERATOR__ID;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLIES__VARIABLE_ASSIGNMENTS = PROPOSITIONAL_OPERATOR__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Operator</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLIES__OPERATOR = PROPOSITIONAL_OPERATOR__OPERATOR;

    /**
     * The feature id for the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLIES__TEMPLATE = PROPOSITIONAL_OPERATOR__TEMPLATE;

    /**
     * The feature id for the '<em><b>Operands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLIES__OPERANDS = PROPOSITIONAL_OPERATOR__OPERANDS;

    /**
     * The number of structural features of the '<em>Implies</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLIES_FEATURE_COUNT = PROPOSITIONAL_OPERATOR_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Implies</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLIES_OPERATION_COUNT = PROPOSITIONAL_OPERATOR_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link rule.propositional.And <em>And</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>And</em>'.
     * @see rule.propositional.And
     * @generated
     */
    EClass getAnd();

    /**
     * Returns the meta object for class '{@link rule.propositional.Or <em>Or</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Or</em>'.
     * @see rule.propositional.Or
     * @generated
     */
    EClass getOr();

    /**
     * Returns the meta object for class '{@link rule.propositional.Not <em>Not</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Not</em>'.
     * @see rule.propositional.Not
     * @generated
     */
    EClass getNot();

    /**
     * Returns the meta object for class '{@link rule.propositional.Implies <em>Implies</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Implies</em>'.
     * @see rule.propositional.Implies
     * @generated
     */
    EClass getImplies();

    /**
     * Returns the meta object for class '{@link rule.propositional.PropositionalOperator <em>Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Operator</em>'.
     * @see rule.propositional.PropositionalOperator
     * @generated
     */
    EClass getPropositionalOperator();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    PropositionalFactory getPropositionalFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link rule.propositional.impl.AndImpl <em>And</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.propositional.impl.AndImpl
         * @see rule.propositional.impl.PropositionalPackageImpl#getAnd()
         * @generated
         */
        EClass AND = eINSTANCE.getAnd();

        /**
         * The meta object literal for the '{@link rule.propositional.impl.OrImpl <em>Or</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.propositional.impl.OrImpl
         * @see rule.propositional.impl.PropositionalPackageImpl#getOr()
         * @generated
         */
        EClass OR = eINSTANCE.getOr();

        /**
         * The meta object literal for the '{@link rule.propositional.impl.NotImpl <em>Not</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.propositional.impl.NotImpl
         * @see rule.propositional.impl.PropositionalPackageImpl#getNot()
         * @generated
         */
        EClass NOT = eINSTANCE.getNot();

        /**
         * The meta object literal for the '{@link rule.propositional.impl.ImpliesImpl <em>Implies</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.propositional.impl.ImpliesImpl
         * @see rule.propositional.impl.PropositionalPackageImpl#getImplies()
         * @generated
         */
        EClass IMPLIES = eINSTANCE.getImplies();

        /**
         * The meta object literal for the '{@link rule.propositional.impl.PropositionalOperatorImpl <em>Operator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.propositional.impl.PropositionalOperatorImpl
         * @see rule.propositional.impl.PropositionalPackageImpl#getPropositionalOperator()
         * @generated
         */
        EClass PROPOSITIONAL_OPERATOR = eINSTANCE.getPropositionalOperator();

    }

} //PropositionalPackage
