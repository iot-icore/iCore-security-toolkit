/**
 */
package seckit;

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
 * @see seckit.SeckitFactory
 * @model kind="package"
 * @generated
 */
public interface SeckitPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "seckit";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://seckit";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "seckit";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SeckitPackage eINSTANCE = seckit.impl.SeckitPackageImpl.init();

    /**
     * The meta object id for the '{@link seckit.impl.SystemViewpointImpl <em>System Viewpoint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see seckit.impl.SystemViewpointImpl
     * @see seckit.impl.SeckitPackageImpl#getSystemViewpoint()
     * @generated
     */
    int SYSTEM_VIEWPOINT = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_VIEWPOINT__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_VIEWPOINT__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The number of structural features of the '<em>System Viewpoint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_VIEWPOINT_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>System Viewpoint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_VIEWPOINT_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link seckit.impl.SystemDesignViewpointImpl <em>System Design Viewpoint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see seckit.impl.SystemDesignViewpointImpl
     * @see seckit.impl.SeckitPackageImpl#getSystemDesignViewpoint()
     * @generated
     */
    int SYSTEM_DESIGN_VIEWPOINT = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_DESIGN_VIEWPOINT__ID = SYSTEM_VIEWPOINT__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_DESIGN_VIEWPOINT__VISUAL_ELEMENTS = SYSTEM_VIEWPOINT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Structural Design Models</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_DESIGN_VIEWPOINT__STRUCTURAL_DESIGN_MODELS = SYSTEM_VIEWPOINT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Context Design Models</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_DESIGN_VIEWPOINT__CONTEXT_DESIGN_MODELS = SYSTEM_VIEWPOINT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Identity Design Models</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_DESIGN_VIEWPOINT__IDENTITY_DESIGN_MODELS = SYSTEM_VIEWPOINT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Data Design Models</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_DESIGN_VIEWPOINT__DATA_DESIGN_MODELS = SYSTEM_VIEWPOINT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Behavior Design Models</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_DESIGN_VIEWPOINT__BEHAVIOR_DESIGN_MODELS = SYSTEM_VIEWPOINT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Trust Design Models</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_DESIGN_VIEWPOINT__TRUST_DESIGN_MODELS = SYSTEM_VIEWPOINT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Rule Design Models</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_DESIGN_VIEWPOINT__RULE_DESIGN_MODELS = SYSTEM_VIEWPOINT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Role Design Models</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_DESIGN_VIEWPOINT__ROLE_DESIGN_MODELS = SYSTEM_VIEWPOINT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Risk Design Models</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_DESIGN_VIEWPOINT__RISK_DESIGN_MODELS = SYSTEM_VIEWPOINT_FEATURE_COUNT + 8;

    /**
     * The number of structural features of the '<em>System Design Viewpoint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_DESIGN_VIEWPOINT_FEATURE_COUNT = SYSTEM_VIEWPOINT_FEATURE_COUNT + 9;

    /**
     * The number of operations of the '<em>System Design Viewpoint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_DESIGN_VIEWPOINT_OPERATION_COUNT = SYSTEM_VIEWPOINT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link seckit.impl.SystemRuntimeViewpointImpl <em>System Runtime Viewpoint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see seckit.impl.SystemRuntimeViewpointImpl
     * @see seckit.impl.SeckitPackageImpl#getSystemRuntimeViewpoint()
     * @generated
     */
    int SYSTEM_RUNTIME_VIEWPOINT = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_RUNTIME_VIEWPOINT__ID = SYSTEM_VIEWPOINT__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_RUNTIME_VIEWPOINT__VISUAL_ELEMENTS = SYSTEM_VIEWPOINT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Structural Runtime Models</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_RUNTIME_VIEWPOINT__STRUCTURAL_RUNTIME_MODELS = SYSTEM_VIEWPOINT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Trust Runtime Models</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_RUNTIME_VIEWPOINT__TRUST_RUNTIME_MODELS = SYSTEM_VIEWPOINT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Behavior Runtime Models</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_RUNTIME_VIEWPOINT__BEHAVIOR_RUNTIME_MODELS = SYSTEM_VIEWPOINT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Rule Runtime Models</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_RUNTIME_VIEWPOINT__RULE_RUNTIME_MODELS = SYSTEM_VIEWPOINT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Data Runtime Models</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_RUNTIME_VIEWPOINT__DATA_RUNTIME_MODELS = SYSTEM_VIEWPOINT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Identity Runtime Models</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_RUNTIME_VIEWPOINT__IDENTITY_RUNTIME_MODELS = SYSTEM_VIEWPOINT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Role Runtime Models</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_RUNTIME_VIEWPOINT__ROLE_RUNTIME_MODELS = SYSTEM_VIEWPOINT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Context Runtime Models</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_RUNTIME_VIEWPOINT__CONTEXT_RUNTIME_MODELS = SYSTEM_VIEWPOINT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Risk Runtime Models</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_RUNTIME_VIEWPOINT__RISK_RUNTIME_MODELS = SYSTEM_VIEWPOINT_FEATURE_COUNT + 8;

    /**
     * The number of structural features of the '<em>System Runtime Viewpoint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_RUNTIME_VIEWPOINT_FEATURE_COUNT = SYSTEM_VIEWPOINT_FEATURE_COUNT + 9;

    /**
     * The number of operations of the '<em>System Runtime Viewpoint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_RUNTIME_VIEWPOINT_OPERATION_COUNT = SYSTEM_VIEWPOINT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link seckit.impl.SystemViewpointsImpl <em>System Viewpoints</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see seckit.impl.SystemViewpointsImpl
     * @see seckit.impl.SeckitPackageImpl#getSystemViewpoints()
     * @generated
     */
    int SYSTEM_VIEWPOINTS = 3;

    /**
     * The feature id for the '<em><b>Design</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_VIEWPOINTS__DESIGN = 0;

    /**
     * The feature id for the '<em><b>Runtime</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_VIEWPOINTS__RUNTIME = 1;

    /**
     * The number of structural features of the '<em>System Viewpoints</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_VIEWPOINTS_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>System Viewpoints</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_VIEWPOINTS_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link seckit.SystemDesignViewpoint <em>System Design Viewpoint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>System Design Viewpoint</em>'.
     * @see seckit.SystemDesignViewpoint
     * @generated
     */
    EClass getSystemDesignViewpoint();

    /**
     * Returns the meta object for the containment reference list '{@link seckit.SystemDesignViewpoint#getStructuralDesignModels <em>Structural Design Models</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Structural Design Models</em>'.
     * @see seckit.SystemDesignViewpoint#getStructuralDesignModels()
     * @see #getSystemDesignViewpoint()
     * @generated
     */
    EReference getSystemDesignViewpoint_StructuralDesignModels();

    /**
     * Returns the meta object for the containment reference list '{@link seckit.SystemDesignViewpoint#getContextDesignModels <em>Context Design Models</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Context Design Models</em>'.
     * @see seckit.SystemDesignViewpoint#getContextDesignModels()
     * @see #getSystemDesignViewpoint()
     * @generated
     */
    EReference getSystemDesignViewpoint_ContextDesignModels();

    /**
     * Returns the meta object for the containment reference list '{@link seckit.SystemDesignViewpoint#getIdentityDesignModels <em>Identity Design Models</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Identity Design Models</em>'.
     * @see seckit.SystemDesignViewpoint#getIdentityDesignModels()
     * @see #getSystemDesignViewpoint()
     * @generated
     */
    EReference getSystemDesignViewpoint_IdentityDesignModels();

    /**
     * Returns the meta object for the containment reference list '{@link seckit.SystemDesignViewpoint#getDataDesignModels <em>Data Design Models</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Data Design Models</em>'.
     * @see seckit.SystemDesignViewpoint#getDataDesignModels()
     * @see #getSystemDesignViewpoint()
     * @generated
     */
    EReference getSystemDesignViewpoint_DataDesignModels();

    /**
     * Returns the meta object for the containment reference list '{@link seckit.SystemDesignViewpoint#getBehaviorDesignModels <em>Behavior Design Models</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Behavior Design Models</em>'.
     * @see seckit.SystemDesignViewpoint#getBehaviorDesignModels()
     * @see #getSystemDesignViewpoint()
     * @generated
     */
    EReference getSystemDesignViewpoint_BehaviorDesignModels();

    /**
     * Returns the meta object for the containment reference list '{@link seckit.SystemDesignViewpoint#getTrustDesignModels <em>Trust Design Models</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Trust Design Models</em>'.
     * @see seckit.SystemDesignViewpoint#getTrustDesignModels()
     * @see #getSystemDesignViewpoint()
     * @generated
     */
    EReference getSystemDesignViewpoint_TrustDesignModels();

    /**
     * Returns the meta object for the containment reference list '{@link seckit.SystemDesignViewpoint#getRuleDesignModels <em>Rule Design Models</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Rule Design Models</em>'.
     * @see seckit.SystemDesignViewpoint#getRuleDesignModels()
     * @see #getSystemDesignViewpoint()
     * @generated
     */
    EReference getSystemDesignViewpoint_RuleDesignModels();

    /**
     * Returns the meta object for the containment reference list '{@link seckit.SystemDesignViewpoint#getRoleDesignModels <em>Role Design Models</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Role Design Models</em>'.
     * @see seckit.SystemDesignViewpoint#getRoleDesignModels()
     * @see #getSystemDesignViewpoint()
     * @generated
     */
    EReference getSystemDesignViewpoint_RoleDesignModels();

    /**
     * Returns the meta object for the containment reference list '{@link seckit.SystemDesignViewpoint#getRiskDesignModels <em>Risk Design Models</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Risk Design Models</em>'.
     * @see seckit.SystemDesignViewpoint#getRiskDesignModels()
     * @see #getSystemDesignViewpoint()
     * @generated
     */
    EReference getSystemDesignViewpoint_RiskDesignModels();

    /**
     * Returns the meta object for class '{@link seckit.SystemRuntimeViewpoint <em>System Runtime Viewpoint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>System Runtime Viewpoint</em>'.
     * @see seckit.SystemRuntimeViewpoint
     * @generated
     */
    EClass getSystemRuntimeViewpoint();

    /**
     * Returns the meta object for the containment reference list '{@link seckit.SystemRuntimeViewpoint#getStructuralRuntimeModels <em>Structural Runtime Models</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Structural Runtime Models</em>'.
     * @see seckit.SystemRuntimeViewpoint#getStructuralRuntimeModels()
     * @see #getSystemRuntimeViewpoint()
     * @generated
     */
    EReference getSystemRuntimeViewpoint_StructuralRuntimeModels();

    /**
     * Returns the meta object for the containment reference list '{@link seckit.SystemRuntimeViewpoint#getTrustRuntimeModels <em>Trust Runtime Models</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Trust Runtime Models</em>'.
     * @see seckit.SystemRuntimeViewpoint#getTrustRuntimeModels()
     * @see #getSystemRuntimeViewpoint()
     * @generated
     */
    EReference getSystemRuntimeViewpoint_TrustRuntimeModels();

    /**
     * Returns the meta object for the containment reference list '{@link seckit.SystemRuntimeViewpoint#getBehaviorRuntimeModels <em>Behavior Runtime Models</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Behavior Runtime Models</em>'.
     * @see seckit.SystemRuntimeViewpoint#getBehaviorRuntimeModels()
     * @see #getSystemRuntimeViewpoint()
     * @generated
     */
    EReference getSystemRuntimeViewpoint_BehaviorRuntimeModels();

    /**
     * Returns the meta object for the containment reference list '{@link seckit.SystemRuntimeViewpoint#getRuleRuntimeModels <em>Rule Runtime Models</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Rule Runtime Models</em>'.
     * @see seckit.SystemRuntimeViewpoint#getRuleRuntimeModels()
     * @see #getSystemRuntimeViewpoint()
     * @generated
     */
    EReference getSystemRuntimeViewpoint_RuleRuntimeModels();

    /**
     * Returns the meta object for the containment reference list '{@link seckit.SystemRuntimeViewpoint#getDataRuntimeModels <em>Data Runtime Models</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Data Runtime Models</em>'.
     * @see seckit.SystemRuntimeViewpoint#getDataRuntimeModels()
     * @see #getSystemRuntimeViewpoint()
     * @generated
     */
    EReference getSystemRuntimeViewpoint_DataRuntimeModels();

    /**
     * Returns the meta object for the containment reference list '{@link seckit.SystemRuntimeViewpoint#getIdentityRuntimeModels <em>Identity Runtime Models</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Identity Runtime Models</em>'.
     * @see seckit.SystemRuntimeViewpoint#getIdentityRuntimeModels()
     * @see #getSystemRuntimeViewpoint()
     * @generated
     */
    EReference getSystemRuntimeViewpoint_IdentityRuntimeModels();

    /**
     * Returns the meta object for the containment reference list '{@link seckit.SystemRuntimeViewpoint#getRoleRuntimeModels <em>Role Runtime Models</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Role Runtime Models</em>'.
     * @see seckit.SystemRuntimeViewpoint#getRoleRuntimeModels()
     * @see #getSystemRuntimeViewpoint()
     * @generated
     */
    EReference getSystemRuntimeViewpoint_RoleRuntimeModels();

    /**
     * Returns the meta object for the containment reference list '{@link seckit.SystemRuntimeViewpoint#getContextRuntimeModels <em>Context Runtime Models</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Context Runtime Models</em>'.
     * @see seckit.SystemRuntimeViewpoint#getContextRuntimeModels()
     * @see #getSystemRuntimeViewpoint()
     * @generated
     */
    EReference getSystemRuntimeViewpoint_ContextRuntimeModels();

    /**
     * Returns the meta object for the containment reference list '{@link seckit.SystemRuntimeViewpoint#getRiskRuntimeModels <em>Risk Runtime Models</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Risk Runtime Models</em>'.
     * @see seckit.SystemRuntimeViewpoint#getRiskRuntimeModels()
     * @see #getSystemRuntimeViewpoint()
     * @generated
     */
    EReference getSystemRuntimeViewpoint_RiskRuntimeModels();

    /**
     * Returns the meta object for class '{@link seckit.SystemViewpoint <em>System Viewpoint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>System Viewpoint</em>'.
     * @see seckit.SystemViewpoint
     * @generated
     */
    EClass getSystemViewpoint();

    /**
     * Returns the meta object for class '{@link seckit.SystemViewpoints <em>System Viewpoints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>System Viewpoints</em>'.
     * @see seckit.SystemViewpoints
     * @generated
     */
    EClass getSystemViewpoints();

    /**
     * Returns the meta object for the containment reference '{@link seckit.SystemViewpoints#getDesign <em>Design</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Design</em>'.
     * @see seckit.SystemViewpoints#getDesign()
     * @see #getSystemViewpoints()
     * @generated
     */
    EReference getSystemViewpoints_Design();

    /**
     * Returns the meta object for the containment reference '{@link seckit.SystemViewpoints#getRuntime <em>Runtime</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Runtime</em>'.
     * @see seckit.SystemViewpoints#getRuntime()
     * @see #getSystemViewpoints()
     * @generated
     */
    EReference getSystemViewpoints_Runtime();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    SeckitFactory getSeckitFactory();

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
         * The meta object literal for the '{@link seckit.impl.SystemDesignViewpointImpl <em>System Design Viewpoint</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see seckit.impl.SystemDesignViewpointImpl
         * @see seckit.impl.SeckitPackageImpl#getSystemDesignViewpoint()
         * @generated
         */
        EClass SYSTEM_DESIGN_VIEWPOINT = eINSTANCE.getSystemDesignViewpoint();

        /**
         * The meta object literal for the '<em><b>Structural Design Models</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYSTEM_DESIGN_VIEWPOINT__STRUCTURAL_DESIGN_MODELS = eINSTANCE.getSystemDesignViewpoint_StructuralDesignModels();

        /**
         * The meta object literal for the '<em><b>Context Design Models</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYSTEM_DESIGN_VIEWPOINT__CONTEXT_DESIGN_MODELS = eINSTANCE.getSystemDesignViewpoint_ContextDesignModels();

        /**
         * The meta object literal for the '<em><b>Identity Design Models</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYSTEM_DESIGN_VIEWPOINT__IDENTITY_DESIGN_MODELS = eINSTANCE.getSystemDesignViewpoint_IdentityDesignModels();

        /**
         * The meta object literal for the '<em><b>Data Design Models</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYSTEM_DESIGN_VIEWPOINT__DATA_DESIGN_MODELS = eINSTANCE.getSystemDesignViewpoint_DataDesignModels();

        /**
         * The meta object literal for the '<em><b>Behavior Design Models</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYSTEM_DESIGN_VIEWPOINT__BEHAVIOR_DESIGN_MODELS = eINSTANCE.getSystemDesignViewpoint_BehaviorDesignModels();

        /**
         * The meta object literal for the '<em><b>Trust Design Models</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYSTEM_DESIGN_VIEWPOINT__TRUST_DESIGN_MODELS = eINSTANCE.getSystemDesignViewpoint_TrustDesignModels();

        /**
         * The meta object literal for the '<em><b>Rule Design Models</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYSTEM_DESIGN_VIEWPOINT__RULE_DESIGN_MODELS = eINSTANCE.getSystemDesignViewpoint_RuleDesignModels();

        /**
         * The meta object literal for the '<em><b>Role Design Models</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYSTEM_DESIGN_VIEWPOINT__ROLE_DESIGN_MODELS = eINSTANCE.getSystemDesignViewpoint_RoleDesignModels();

        /**
         * The meta object literal for the '<em><b>Risk Design Models</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYSTEM_DESIGN_VIEWPOINT__RISK_DESIGN_MODELS = eINSTANCE.getSystemDesignViewpoint_RiskDesignModels();

        /**
         * The meta object literal for the '{@link seckit.impl.SystemRuntimeViewpointImpl <em>System Runtime Viewpoint</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see seckit.impl.SystemRuntimeViewpointImpl
         * @see seckit.impl.SeckitPackageImpl#getSystemRuntimeViewpoint()
         * @generated
         */
        EClass SYSTEM_RUNTIME_VIEWPOINT = eINSTANCE.getSystemRuntimeViewpoint();

        /**
         * The meta object literal for the '<em><b>Structural Runtime Models</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYSTEM_RUNTIME_VIEWPOINT__STRUCTURAL_RUNTIME_MODELS = eINSTANCE.getSystemRuntimeViewpoint_StructuralRuntimeModels();

        /**
         * The meta object literal for the '<em><b>Trust Runtime Models</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYSTEM_RUNTIME_VIEWPOINT__TRUST_RUNTIME_MODELS = eINSTANCE.getSystemRuntimeViewpoint_TrustRuntimeModels();

        /**
         * The meta object literal for the '<em><b>Behavior Runtime Models</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYSTEM_RUNTIME_VIEWPOINT__BEHAVIOR_RUNTIME_MODELS = eINSTANCE.getSystemRuntimeViewpoint_BehaviorRuntimeModels();

        /**
         * The meta object literal for the '<em><b>Rule Runtime Models</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYSTEM_RUNTIME_VIEWPOINT__RULE_RUNTIME_MODELS = eINSTANCE.getSystemRuntimeViewpoint_RuleRuntimeModels();

        /**
         * The meta object literal for the '<em><b>Data Runtime Models</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYSTEM_RUNTIME_VIEWPOINT__DATA_RUNTIME_MODELS = eINSTANCE.getSystemRuntimeViewpoint_DataRuntimeModels();

        /**
         * The meta object literal for the '<em><b>Identity Runtime Models</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYSTEM_RUNTIME_VIEWPOINT__IDENTITY_RUNTIME_MODELS = eINSTANCE.getSystemRuntimeViewpoint_IdentityRuntimeModels();

        /**
         * The meta object literal for the '<em><b>Role Runtime Models</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYSTEM_RUNTIME_VIEWPOINT__ROLE_RUNTIME_MODELS = eINSTANCE.getSystemRuntimeViewpoint_RoleRuntimeModels();

        /**
         * The meta object literal for the '<em><b>Context Runtime Models</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYSTEM_RUNTIME_VIEWPOINT__CONTEXT_RUNTIME_MODELS = eINSTANCE.getSystemRuntimeViewpoint_ContextRuntimeModels();

        /**
         * The meta object literal for the '<em><b>Risk Runtime Models</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYSTEM_RUNTIME_VIEWPOINT__RISK_RUNTIME_MODELS = eINSTANCE.getSystemRuntimeViewpoint_RiskRuntimeModels();

        /**
         * The meta object literal for the '{@link seckit.impl.SystemViewpointImpl <em>System Viewpoint</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see seckit.impl.SystemViewpointImpl
         * @see seckit.impl.SeckitPackageImpl#getSystemViewpoint()
         * @generated
         */
        EClass SYSTEM_VIEWPOINT = eINSTANCE.getSystemViewpoint();

        /**
         * The meta object literal for the '{@link seckit.impl.SystemViewpointsImpl <em>System Viewpoints</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see seckit.impl.SystemViewpointsImpl
         * @see seckit.impl.SeckitPackageImpl#getSystemViewpoints()
         * @generated
         */
        EClass SYSTEM_VIEWPOINTS = eINSTANCE.getSystemViewpoints();

        /**
         * The meta object literal for the '<em><b>Design</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYSTEM_VIEWPOINTS__DESIGN = eINSTANCE.getSystemViewpoints_Design();

        /**
         * The meta object literal for the '<em><b>Runtime</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYSTEM_VIEWPOINTS__RUNTIME = eINSTANCE.getSystemViewpoints_Runtime();

    }

} //SeckitPackage
