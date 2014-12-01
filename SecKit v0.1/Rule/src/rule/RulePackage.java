/**
 */
package rule;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see rule.RuleFactory
 * @model kind="package"
 * @generated
 */
public interface RulePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "rule";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://rule/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "rule";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    RulePackage eINSTANCE = rule.impl.RulePackageImpl.init();

    /**
     * The meta object id for the '{@link rule.impl.RuleDesignModelImpl <em>Design Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.impl.RuleDesignModelImpl
     * @see rule.impl.RulePackageImpl#getRuleDesignModel()
     * @generated
     */
    int RULE_DESIGN_MODEL = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_DESIGN_MODEL__VISUAL_ELEMENTS = ModelsPackage.MODEL__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_DESIGN_MODEL__ID = ModelsPackage.MODEL__ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_DESIGN_MODEL__DESCRIPTION = ModelsPackage.MODEL__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_DESIGN_MODEL__FILENAME = ModelsPackage.MODEL__FILENAME;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_DESIGN_MODEL__URI = ModelsPackage.MODEL__URI;

    /**
     * The feature id for the '<em><b>Packages</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_DESIGN_MODEL__PACKAGES = ModelsPackage.MODEL_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Time Step Sizes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_DESIGN_MODEL__TIME_STEP_SIZES = ModelsPackage.MODEL_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Design Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_DESIGN_MODEL_FEATURE_COUNT = ModelsPackage.MODEL_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Design Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_DESIGN_MODEL_OPERATION_COUNT = ModelsPackage.MODEL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link rule.impl.RuleRuntimeModelImpl <em>Runtime Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rule.impl.RuleRuntimeModelImpl
     * @see rule.impl.RulePackageImpl#getRuleRuntimeModel()
     * @generated
     */
    int RULE_RUNTIME_MODEL = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_RUNTIME_MODEL__VISUAL_ELEMENTS = ModelsPackage.MODEL__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_RUNTIME_MODEL__ID = ModelsPackage.MODEL__ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_RUNTIME_MODEL__DESCRIPTION = ModelsPackage.MODEL__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_RUNTIME_MODEL__FILENAME = ModelsPackage.MODEL__FILENAME;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_RUNTIME_MODEL__URI = ModelsPackage.MODEL__URI;

    /**
     * The feature id for the '<em><b>Rules</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_RUNTIME_MODEL__RULES = ModelsPackage.MODEL_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Event Traces</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_RUNTIME_MODEL__EVENT_TRACES = ModelsPackage.MODEL_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Rule Sets</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_RUNTIME_MODEL__RULE_SETS = ModelsPackage.MODEL_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Running</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_RUNTIME_MODEL__RUNNING = ModelsPackage.MODEL_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Event Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_RUNTIME_MODEL__EVENT_SET = ModelsPackage.MODEL_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Runtime Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_RUNTIME_MODEL_FEATURE_COUNT = ModelsPackage.MODEL_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Runtime Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_RUNTIME_MODEL_OPERATION_COUNT = ModelsPackage.MODEL_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link rule.RuleDesignModel <em>Design Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Design Model</em>'.
     * @see rule.RuleDesignModel
     * @generated
     */
    EClass getRuleDesignModel();

    /**
     * Returns the meta object for the containment reference list '{@link rule.RuleDesignModel#getPackages <em>Packages</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Packages</em>'.
     * @see rule.RuleDesignModel#getPackages()
     * @see #getRuleDesignModel()
     * @generated
     */
    EReference getRuleDesignModel_Packages();

    /**
     * Returns the meta object for the containment reference list '{@link rule.RuleDesignModel#getTimeStepSizes <em>Time Step Sizes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Time Step Sizes</em>'.
     * @see rule.RuleDesignModel#getTimeStepSizes()
     * @see #getRuleDesignModel()
     * @generated
     */
    EReference getRuleDesignModel_TimeStepSizes();

    /**
     * Returns the meta object for class '{@link rule.RuleRuntimeModel <em>Runtime Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Runtime Model</em>'.
     * @see rule.RuleRuntimeModel
     * @generated
     */
    EClass getRuleRuntimeModel();

    /**
     * Returns the meta object for the containment reference list '{@link rule.RuleRuntimeModel#getRules <em>Rules</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Rules</em>'.
     * @see rule.RuleRuntimeModel#getRules()
     * @see #getRuleRuntimeModel()
     * @generated
     */
    EReference getRuleRuntimeModel_Rules();

    /**
     * Returns the meta object for the containment reference list '{@link rule.RuleRuntimeModel#getEventTraces <em>Event Traces</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Event Traces</em>'.
     * @see rule.RuleRuntimeModel#getEventTraces()
     * @see #getRuleRuntimeModel()
     * @generated
     */
    EReference getRuleRuntimeModel_EventTraces();

    /**
     * Returns the meta object for the containment reference list '{@link rule.RuleRuntimeModel#getRuleSets <em>Rule Sets</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Rule Sets</em>'.
     * @see rule.RuleRuntimeModel#getRuleSets()
     * @see #getRuleRuntimeModel()
     * @generated
     */
    EReference getRuleRuntimeModel_RuleSets();

    /**
     * Returns the meta object for the attribute '{@link rule.RuleRuntimeModel#isRunning <em>Running</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Running</em>'.
     * @see rule.RuleRuntimeModel#isRunning()
     * @see #getRuleRuntimeModel()
     * @generated
     */
    EAttribute getRuleRuntimeModel_Running();

    /**
     * Returns the meta object for the containment reference '{@link rule.RuleRuntimeModel#getEventSet <em>Event Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Event Set</em>'.
     * @see rule.RuleRuntimeModel#getEventSet()
     * @see #getRuleRuntimeModel()
     * @generated
     */
    EReference getRuleRuntimeModel_EventSet();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    RuleFactory getRuleFactory();

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
         * The meta object literal for the '{@link rule.impl.RuleDesignModelImpl <em>Design Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.impl.RuleDesignModelImpl
         * @see rule.impl.RulePackageImpl#getRuleDesignModel()
         * @generated
         */
        EClass RULE_DESIGN_MODEL = eINSTANCE.getRuleDesignModel();

        /**
         * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_DESIGN_MODEL__PACKAGES = eINSTANCE.getRuleDesignModel_Packages();

        /**
         * The meta object literal for the '<em><b>Time Step Sizes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_DESIGN_MODEL__TIME_STEP_SIZES = eINSTANCE.getRuleDesignModel_TimeStepSizes();

        /**
         * The meta object literal for the '{@link rule.impl.RuleRuntimeModelImpl <em>Runtime Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rule.impl.RuleRuntimeModelImpl
         * @see rule.impl.RulePackageImpl#getRuleRuntimeModel()
         * @generated
         */
        EClass RULE_RUNTIME_MODEL = eINSTANCE.getRuleRuntimeModel();

        /**
         * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_RUNTIME_MODEL__RULES = eINSTANCE.getRuleRuntimeModel_Rules();

        /**
         * The meta object literal for the '<em><b>Event Traces</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_RUNTIME_MODEL__EVENT_TRACES = eINSTANCE.getRuleRuntimeModel_EventTraces();

        /**
         * The meta object literal for the '<em><b>Rule Sets</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_RUNTIME_MODEL__RULE_SETS = eINSTANCE.getRuleRuntimeModel_RuleSets();

        /**
         * The meta object literal for the '<em><b>Running</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RULE_RUNTIME_MODEL__RUNNING = eINSTANCE.getRuleRuntimeModel_Running();

        /**
         * The meta object literal for the '<em><b>Event Set</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE_RUNTIME_MODEL__EVENT_SET = eINSTANCE.getRuleRuntimeModel_EventSet();

    }

} //RulePackage
