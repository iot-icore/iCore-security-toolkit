/**
 */
package rule.action;

import models.ModelsPackage;

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
 * @see rule.action.ActionFactory
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
    String eNS_URI = "http://rule/action/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "rule-action";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ActionPackage eINSTANCE = rule.action.impl.ActionPackageImpl.init();

    /**
     * The meta object id for the '{@link rule.action.impl.ActionBehaviorImpl <em>Behavior</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.action.impl.ActionBehaviorImpl
     * @see rule.action.impl.ActionPackageImpl#getActionBehavior()
     * @generated
     */
    int ACTION_BEHAVIOR = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_BEHAVIOR__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_BEHAVIOR__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The number of structural features of the '<em>Behavior</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_BEHAVIOR_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Behavior</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_BEHAVIOR_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.action.impl.AuthorizationImpl <em>Authorization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.action.impl.AuthorizationImpl
     * @see rule.action.impl.ActionPackageImpl#getAuthorization()
     * @generated
     */
    int AUTHORIZATION = 5;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHORIZATION__VISUAL_ELEMENTS = ACTION_BEHAVIOR__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHORIZATION__ID = ACTION_BEHAVIOR__ID;

    /**
     * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHORIZATION__CONSTRAINTS = ACTION_BEHAVIOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Template</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHORIZATION__TEMPLATE = ACTION_BEHAVIOR_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Authorization</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHORIZATION_FEATURE_COUNT = ACTION_BEHAVIOR_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Authorization</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHORIZATION_OPERATION_COUNT = ACTION_BEHAVIOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.action.impl.AllowImpl <em>Allow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.action.impl.AllowImpl
     * @see rule.action.impl.ActionPackageImpl#getAllow()
     * @generated
     */
    int ALLOW = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOW__VISUAL_ELEMENTS = AUTHORIZATION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOW__ID = AUTHORIZATION__ID;

    /**
     * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOW__CONSTRAINTS = AUTHORIZATION__CONSTRAINTS;

    /**
     * The feature id for the '<em><b>Template</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOW__TEMPLATE = AUTHORIZATION__TEMPLATE;

    /**
     * The number of structural features of the '<em>Allow</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOW_FEATURE_COUNT = AUTHORIZATION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Allow</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOW_OPERATION_COUNT = AUTHORIZATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.action.impl.DenyImpl <em>Deny</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.action.impl.DenyImpl
     * @see rule.action.impl.ActionPackageImpl#getDeny()
     * @generated
     */
    int DENY = 2;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DENY__VISUAL_ELEMENTS = AUTHORIZATION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DENY__ID = AUTHORIZATION__ID;

    /**
     * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DENY__CONSTRAINTS = AUTHORIZATION__CONSTRAINTS;

    /**
     * The feature id for the '<em><b>Template</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DENY__TEMPLATE = AUTHORIZATION__TEMPLATE;

    /**
     * The number of structural features of the '<em>Deny</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DENY_FEATURE_COUNT = AUTHORIZATION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Deny</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DENY_OPERATION_COUNT = AUTHORIZATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.action.impl.ConstraintImpl <em>Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.action.impl.ConstraintImpl
     * @see rule.action.impl.ActionPackageImpl#getConstraint()
     * @generated
     */
    int CONSTRAINT = 6;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRAINT__VISUAL_ELEMENTS = ACTION_BEHAVIOR__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRAINT__ID = ACTION_BEHAVIOR__ID;

    /**
     * The feature id for the '<em><b>Authorization</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRAINT__AUTHORIZATION = ACTION_BEHAVIOR_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRAINT_FEATURE_COUNT = ACTION_BEHAVIOR_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRAINT_OPERATION_COUNT = ACTION_BEHAVIOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.action.impl.ModifyImpl <em>Modify</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.action.impl.ModifyImpl
     * @see rule.action.impl.ActionPackageImpl#getModify()
     * @generated
     */
    int MODIFY = 3;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODIFY__VISUAL_ELEMENTS = CONSTRAINT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODIFY__ID = CONSTRAINT__ID;

    /**
     * The feature id for the '<em><b>Authorization</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODIFY__AUTHORIZATION = CONSTRAINT__AUTHORIZATION;

    /**
     * The number of structural features of the '<em>Modify</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODIFY_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Modify</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODIFY_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.action.impl.DelayImpl <em>Delay</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.action.impl.DelayImpl
     * @see rule.action.impl.ActionPackageImpl#getDelay()
     * @generated
     */
    int DELAY = 4;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELAY__VISUAL_ELEMENTS = CONSTRAINT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELAY__ID = CONSTRAINT__ID;

    /**
     * The feature id for the '<em><b>Authorization</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELAY__AUTHORIZATION = CONSTRAINT__AUTHORIZATION;

    /**
     * The number of structural features of the '<em>Delay</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELAY_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Delay</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELAY_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.action.impl.ExecuteImpl <em>Execute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.action.impl.ExecuteImpl
     * @see rule.action.impl.ActionPackageImpl#getExecute()
     * @generated
     */
    int EXECUTE = 7;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTE__VISUAL_ELEMENTS = ACTION_BEHAVIOR__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTE__ID = ACTION_BEHAVIOR__ID;

    /**
     * The feature id for the '<em><b>Template</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTE__TEMPLATE = ACTION_BEHAVIOR_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Execute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTE_FEATURE_COUNT = ACTION_BEHAVIOR_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Execute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTE_OPERATION_COUNT = ACTION_BEHAVIOR_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link rule.action.ActionBehavior <em>Behavior</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Behavior</em>'.
     * @see rule.action.ActionBehavior
     * @generated
     */
    EClass getActionBehavior();

    /**
     * Returns the meta object for class '{@link rule.action.Allow <em>Allow</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Allow</em>'.
     * @see rule.action.Allow
     * @generated
     */
    EClass getAllow();

    /**
     * Returns the meta object for class '{@link rule.action.Deny <em>Deny</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Deny</em>'.
     * @see rule.action.Deny
     * @generated
     */
    EClass getDeny();

    /**
     * Returns the meta object for class '{@link rule.action.Modify <em>Modify</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Modify</em>'.
     * @see rule.action.Modify
     * @generated
     */
    EClass getModify();

    /**
     * Returns the meta object for class '{@link rule.action.Delay <em>Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Delay</em>'.
     * @see rule.action.Delay
     * @generated
     */
    EClass getDelay();

    /**
     * Returns the meta object for class '{@link rule.action.Authorization <em>Authorization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Authorization</em>'.
     * @see rule.action.Authorization
     * @generated
     */
    EClass getAuthorization();

    /**
     * Returns the meta object for the containment reference list '{@link rule.action.Authorization#getConstraints <em>Constraints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Constraints</em>'.
     * @see rule.action.Authorization#getConstraints()
     * @see #getAuthorization()
     * @generated
     */
    EReference getAuthorization_Constraints();

    /**
     * Returns the meta object for the container reference '{@link rule.action.Authorization#getTemplate <em>Template</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Template</em>'.
     * @see rule.action.Authorization#getTemplate()
     * @see #getAuthorization()
     * @generated
     */
    EReference getAuthorization_Template();

    /**
     * Returns the meta object for class '{@link rule.action.Constraint <em>Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Constraint</em>'.
     * @see rule.action.Constraint
     * @generated
     */
    EClass getConstraint();

    /**
     * Returns the meta object for the container reference '{@link rule.action.Constraint#getAuthorization <em>Authorization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Authorization</em>'.
     * @see rule.action.Constraint#getAuthorization()
     * @see #getConstraint()
     * @generated
     */
    EReference getConstraint_Authorization();

    /**
     * Returns the meta object for class '{@link rule.action.Execute <em>Execute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Execute</em>'.
     * @see rule.action.Execute
     * @generated
     */
    EClass getExecute();

    /**
     * Returns the meta object for the container reference '{@link rule.action.Execute#getTemplate <em>Template</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Template</em>'.
     * @see rule.action.Execute#getTemplate()
     * @see #getExecute()
     * @generated
     */
    EReference getExecute_Template();

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
         * The meta object literal for the '{@link rule.action.impl.ActionBehaviorImpl <em>Behavior</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.action.impl.ActionBehaviorImpl
         * @see rule.action.impl.ActionPackageImpl#getActionBehavior()
         * @generated
         */
        EClass ACTION_BEHAVIOR = eINSTANCE.getActionBehavior();

        /**
         * The meta object literal for the '{@link rule.action.impl.AllowImpl <em>Allow</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.action.impl.AllowImpl
         * @see rule.action.impl.ActionPackageImpl#getAllow()
         * @generated
         */
        EClass ALLOW = eINSTANCE.getAllow();

        /**
         * The meta object literal for the '{@link rule.action.impl.DenyImpl <em>Deny</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.action.impl.DenyImpl
         * @see rule.action.impl.ActionPackageImpl#getDeny()
         * @generated
         */
        EClass DENY = eINSTANCE.getDeny();

        /**
         * The meta object literal for the '{@link rule.action.impl.ModifyImpl <em>Modify</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.action.impl.ModifyImpl
         * @see rule.action.impl.ActionPackageImpl#getModify()
         * @generated
         */
        EClass MODIFY = eINSTANCE.getModify();

        /**
         * The meta object literal for the '{@link rule.action.impl.DelayImpl <em>Delay</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.action.impl.DelayImpl
         * @see rule.action.impl.ActionPackageImpl#getDelay()
         * @generated
         */
        EClass DELAY = eINSTANCE.getDelay();

        /**
         * The meta object literal for the '{@link rule.action.impl.AuthorizationImpl <em>Authorization</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.action.impl.AuthorizationImpl
         * @see rule.action.impl.ActionPackageImpl#getAuthorization()
         * @generated
         */
        EClass AUTHORIZATION = eINSTANCE.getAuthorization();

        /**
         * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference AUTHORIZATION__CONSTRAINTS = eINSTANCE.getAuthorization_Constraints();

        /**
         * The meta object literal for the '<em><b>Template</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference AUTHORIZATION__TEMPLATE = eINSTANCE.getAuthorization_Template();

        /**
         * The meta object literal for the '{@link rule.action.impl.ConstraintImpl <em>Constraint</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.action.impl.ConstraintImpl
         * @see rule.action.impl.ActionPackageImpl#getConstraint()
         * @generated
         */
        EClass CONSTRAINT = eINSTANCE.getConstraint();

        /**
         * The meta object literal for the '<em><b>Authorization</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONSTRAINT__AUTHORIZATION = eINSTANCE.getConstraint_Authorization();

        /**
         * The meta object literal for the '{@link rule.action.impl.ExecuteImpl <em>Execute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.action.impl.ExecuteImpl
         * @see rule.action.impl.ActionPackageImpl#getExecute()
         * @generated
         */
        EClass EXECUTE = eINSTANCE.getExecute();

        /**
         * The meta object literal for the '<em><b>Template</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXECUTE__TEMPLATE = eINSTANCE.getExecute_Template();

    }

} //ActionPackage
