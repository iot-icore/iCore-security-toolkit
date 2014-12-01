/**
 */
package behavior.condition;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see behavior.condition.ConditionFactory
 * @model kind="package"
 * @generated
 */
public interface ConditionPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "condition";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://behavior/condition/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "behavior-condition";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ConditionPackage eINSTANCE = behavior.condition.impl.ConditionPackageImpl.init();

    /**
     * The meta object id for the '{@link behavior.condition.impl.EvaluateActionImpl <em>Evaluate Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.condition.impl.EvaluateActionImpl
     * @see behavior.condition.impl.ConditionPackageImpl#getEvaluateAction()
     * @generated
     */
    int EVALUATE_ACTION = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVALUATE_ACTION__VISUAL_ELEMENTS = rule.condition.ConditionPackage.ATOM__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVALUATE_ACTION__ID = rule.condition.ConditionPackage.ATOM__ID;

    /**
     * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVALUATE_ACTION__VARIABLE_ASSIGNMENTS = rule.condition.ConditionPackage.ATOM__VARIABLE_ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Operator</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVALUATE_ACTION__OPERATOR = rule.condition.ConditionPackage.ATOM__OPERATOR;

    /**
     * The feature id for the '<em><b>Template</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVALUATE_ACTION__TEMPLATE = rule.condition.ConditionPackage.ATOM__TEMPLATE;

    /**
     * The feature id for the '<em><b>Action Instantiation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVALUATE_ACTION__ACTION_INSTANTIATION = rule.condition.ConditionPackage.ATOM_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Evaluate Action</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVALUATE_ACTION_FEATURE_COUNT = rule.condition.ConditionPackage.ATOM_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Evaluate Action</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVALUATE_ACTION_OPERATION_COUNT = rule.condition.ConditionPackage.ATOM_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link behavior.condition.EvaluateAction <em>Evaluate Action</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Evaluate Action</em>'.
     * @see behavior.condition.EvaluateAction
     * @generated
     */
    EClass getEvaluateAction();

    /**
     * Returns the meta object for the containment reference '{@link behavior.condition.EvaluateAction#getActionInstantiation <em>Action Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Action Instantiation</em>'.
     * @see behavior.condition.EvaluateAction#getActionInstantiation()
     * @see #getEvaluateAction()
     * @generated
     */
    EReference getEvaluateAction_ActionInstantiation();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ConditionFactory getConditionFactory();

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
         * The meta object literal for the '{@link behavior.condition.impl.EvaluateActionImpl <em>Evaluate Action</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.condition.impl.EvaluateActionImpl
         * @see behavior.condition.impl.ConditionPackageImpl#getEvaluateAction()
         * @generated
         */
        EClass EVALUATE_ACTION = eINSTANCE.getEvaluateAction();

        /**
         * The meta object literal for the '<em><b>Action Instantiation</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EVALUATE_ACTION__ACTION_INSTANTIATION = eINSTANCE.getEvaluateAction_ActionInstantiation();

    }

} //ConditionPackage
