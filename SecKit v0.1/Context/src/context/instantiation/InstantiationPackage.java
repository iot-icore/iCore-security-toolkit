/**
 */
package context.instantiation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see context.instantiation.InstantiationFactory
 * @model kind="package"
 * @generated
 */
public interface InstantiationPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "instantiation";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://context/instantiation/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "context-instantiation";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    InstantiationPackage eINSTANCE = context.instantiation.impl.InstantiationPackageImpl.init();

    /**
     * The meta object id for the '{@link context.instantiation.impl.ContextSituationRuleImpl <em>Context Situation Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.instantiation.impl.ContextSituationRuleImpl
     * @see context.instantiation.impl.InstantiationPackageImpl#getContextSituationRule()
     * @generated
     */
    int CONTEXT_SITUATION_RULE = 0;

    /**
     * The number of structural features of the '<em>Context Situation Rule</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_RULE_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Context Situation Rule</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_RULE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link context.instantiation.impl.ContextInformationInstantiationImpl <em>Context Information Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.instantiation.impl.ContextInformationInstantiationImpl
     * @see context.instantiation.impl.InstantiationPackageImpl#getContextInformationInstantiation()
     * @generated
     */
    int CONTEXT_INFORMATION_INSTANTIATION = 1;

    /**
     * The number of structural features of the '<em>Context Information Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_INSTANTIATION_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Context Information Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_INSTANTIATION_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link context.instantiation.ContextSituationRule <em>Context Situation Rule</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Context Situation Rule</em>'.
     * @see context.instantiation.ContextSituationRule
     * @generated
     */
    EClass getContextSituationRule();

    /**
     * Returns the meta object for class '{@link context.instantiation.ContextInformationInstantiation <em>Context Information Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Context Information Instantiation</em>'.
     * @see context.instantiation.ContextInformationInstantiation
     * @generated
     */
    EClass getContextInformationInstantiation();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    InstantiationFactory getInstantiationFactory();

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
         * The meta object literal for the '{@link context.instantiation.impl.ContextSituationRuleImpl <em>Context Situation Rule</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.instantiation.impl.ContextSituationRuleImpl
         * @see context.instantiation.impl.InstantiationPackageImpl#getContextSituationRule()
         * @generated
         */
        EClass CONTEXT_SITUATION_RULE = eINSTANCE.getContextSituationRule();

        /**
         * The meta object literal for the '{@link context.instantiation.impl.ContextInformationInstantiationImpl <em>Context Information Instantiation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.instantiation.impl.ContextInformationInstantiationImpl
         * @see context.instantiation.impl.InstantiationPackageImpl#getContextInformationInstantiation()
         * @generated
         */
        EClass CONTEXT_INFORMATION_INSTANTIATION = eINSTANCE.getContextInformationInstantiation();

    }

} //InstantiationPackage
