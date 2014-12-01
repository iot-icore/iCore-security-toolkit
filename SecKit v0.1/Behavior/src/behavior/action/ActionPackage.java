/**
 */
package behavior.action;

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
 * @see behavior.action.ActionFactory
 * @model kind="package"
 * @generated
 */
public interface ActionPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "action";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://behavior/action/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "behavior-action";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ActionPackage eINSTANCE = behavior.action.impl.ActionPackageImpl.init();

    /**
     * The meta object id for the '{@link behavior.action.impl.BehaviorExecutionImpl <em>Behavior Execution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.action.impl.BehaviorExecutionImpl
     * @see behavior.action.impl.ActionPackageImpl#getBehaviorExecution()
     * @generated
     */
    int BEHAVIOR_EXECUTION = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_EXECUTION__VISUAL_ELEMENTS = rule.action.ActionPackage.EXECUTE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_EXECUTION__ID = rule.action.ActionPackage.EXECUTE__ID;

    /**
     * The feature id for the '<em><b>Template</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_EXECUTION__TEMPLATE = rule.action.ActionPackage.EXECUTE__TEMPLATE;

    /**
     * The feature id for the '<em><b>Behavior Instantiation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_EXECUTION__BEHAVIOR_INSTANTIATION = rule.action.ActionPackage.EXECUTE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Target Entity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_EXECUTION__TARGET_ENTITY = rule.action.ActionPackage.EXECUTE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Behavior Execution</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_EXECUTION_FEATURE_COUNT = rule.action.ActionPackage.EXECUTE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Behavior Execution</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_EXECUTION_OPERATION_COUNT = rule.action.ActionPackage.EXECUTE_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link behavior.action.BehaviorExecution <em>Behavior Execution</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Behavior Execution</em>'.
     * @see behavior.action.BehaviorExecution
     * @generated
     */
    EClass getBehaviorExecution();

    /**
     * Returns the meta object for the containment reference '{@link behavior.action.BehaviorExecution#getBehaviorInstantiation <em>Behavior Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Behavior Instantiation</em>'.
     * @see behavior.action.BehaviorExecution#getBehaviorInstantiation()
     * @see #getBehaviorExecution()
     * @generated
     */
    EReference getBehaviorExecution_BehaviorInstantiation();

    /**
     * Returns the meta object for the containment reference '{@link behavior.action.BehaviorExecution#getTargetEntity <em>Target Entity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Target Entity</em>'.
     * @see behavior.action.BehaviorExecution#getTargetEntity()
     * @see #getBehaviorExecution()
     * @generated
     */
    EReference getBehaviorExecution_TargetEntity();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ActionFactory getActionFactory();

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
         * The meta object literal for the '{@link behavior.action.impl.BehaviorExecutionImpl <em>Behavior Execution</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.action.impl.BehaviorExecutionImpl
         * @see behavior.action.impl.ActionPackageImpl#getBehaviorExecution()
         * @generated
         */
        EClass BEHAVIOR_EXECUTION = eINSTANCE.getBehaviorExecution();

        /**
         * The meta object literal for the '<em><b>Behavior Instantiation</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BEHAVIOR_EXECUTION__BEHAVIOR_INSTANTIATION = eINSTANCE.getBehaviorExecution_BehaviorInstantiation();

        /**
         * The meta object literal for the '<em><b>Target Entity</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BEHAVIOR_EXECUTION__TARGET_ENTITY = eINSTANCE.getBehaviorExecution_TargetEntity();

    }

} //ActionPackage
