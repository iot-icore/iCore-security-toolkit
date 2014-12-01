/**
 */
package behavior.pattern;

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
 * @see behavior.pattern.PatternFactory
 * @model kind="package"
 * @generated
 */
public interface PatternPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "pattern";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://behavior/pattern/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "behavior-pattern";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    PatternPackage eINSTANCE = behavior.pattern.impl.PatternPackageImpl.init();

    /**
     * The meta object id for the '{@link behavior.pattern.impl.BehaviorPatternImpl <em>Behavior Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.pattern.impl.BehaviorPatternImpl
     * @see behavior.pattern.impl.PatternPackageImpl#getBehaviorPattern()
     * @generated
     */
    int BEHAVIOR_PATTERN = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_PATTERN__VISUAL_ELEMENTS = ModelsPackage.PATTERN__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_PATTERN__ID = ModelsPackage.PATTERN__ID;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_PATTERN__TYPE = ModelsPackage.PATTERN_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Instantiation Hierarchy</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_PATTERN__INSTANTIATION_HIERARCHY = ModelsPackage.PATTERN_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Variables</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_PATTERN__VARIABLES = ModelsPackage.PATTERN_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Entity Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_PATTERN__ENTITY_PATTERN = ModelsPackage.PATTERN_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Behavior Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_PATTERN_FEATURE_COUNT = ModelsPackage.PATTERN_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Behavior Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_PATTERN_OPERATION_COUNT = ModelsPackage.PATTERN_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.pattern.impl.ActivityPatternImpl <em>Activity Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.pattern.impl.ActivityPatternImpl
     * @see behavior.pattern.impl.PatternPackageImpl#getActivityPattern()
     * @generated
     */
    int ACTIVITY_PATTERN = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_PATTERN__VISUAL_ELEMENTS = ModelsPackage.PATTERN__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_PATTERN__ID = ModelsPackage.PATTERN__ID;

    /**
     * The feature id for the '<em><b>Container Behavior Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_PATTERN__CONTAINER_BEHAVIOR_PATTERN = ModelsPackage.PATTERN_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_PATTERN__INSTANTIATION = ModelsPackage.PATTERN_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_PATTERN__TYPE = ModelsPackage.PATTERN_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Variables</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_PATTERN__VARIABLES = ModelsPackage.PATTERN_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Data Patterns</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_PATTERN__DATA_PATTERNS = ModelsPackage.PATTERN_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Identity Role Patterns</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_PATTERN__IDENTITY_ROLE_PATTERNS = ModelsPackage.PATTERN_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Identity Patterns</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_PATTERN__IDENTITY_PATTERNS = ModelsPackage.PATTERN_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Activity Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_PATTERN_FEATURE_COUNT = ModelsPackage.PATTERN_FEATURE_COUNT + 7;

    /**
     * The number of operations of the '<em>Activity Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_PATTERN_OPERATION_COUNT = ModelsPackage.PATTERN_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.pattern.impl.ActionPatternImpl <em>Action Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.pattern.impl.ActionPatternImpl
     * @see behavior.pattern.impl.PatternPackageImpl#getActionPattern()
     * @generated
     */
    int ACTION_PATTERN = 2;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_PATTERN__VISUAL_ELEMENTS = ACTIVITY_PATTERN__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_PATTERN__ID = ACTIVITY_PATTERN__ID;

    /**
     * The feature id for the '<em><b>Container Behavior Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_PATTERN__CONTAINER_BEHAVIOR_PATTERN = ACTIVITY_PATTERN__CONTAINER_BEHAVIOR_PATTERN;

    /**
     * The feature id for the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_PATTERN__INSTANTIATION = ACTIVITY_PATTERN__INSTANTIATION;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_PATTERN__TYPE = ACTIVITY_PATTERN__TYPE;

    /**
     * The feature id for the '<em><b>Variables</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_PATTERN__VARIABLES = ACTIVITY_PATTERN__VARIABLES;

    /**
     * The feature id for the '<em><b>Data Patterns</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_PATTERN__DATA_PATTERNS = ACTIVITY_PATTERN__DATA_PATTERNS;

    /**
     * The feature id for the '<em><b>Identity Role Patterns</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_PATTERN__IDENTITY_ROLE_PATTERNS = ACTIVITY_PATTERN__IDENTITY_ROLE_PATTERNS;

    /**
     * The feature id for the '<em><b>Identity Patterns</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_PATTERN__IDENTITY_PATTERNS = ACTIVITY_PATTERN__IDENTITY_PATTERNS;

    /**
     * The number of structural features of the '<em>Action Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_PATTERN_FEATURE_COUNT = ACTIVITY_PATTERN_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Action Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_PATTERN_OPERATION_COUNT = ACTIVITY_PATTERN_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.pattern.impl.InteractionPatternImpl <em>Interaction Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.pattern.impl.InteractionPatternImpl
     * @see behavior.pattern.impl.PatternPackageImpl#getInteractionPattern()
     * @generated
     */
    int INTERACTION_PATTERN = 3;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_PATTERN__VISUAL_ELEMENTS = ACTIVITY_PATTERN__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_PATTERN__ID = ACTIVITY_PATTERN__ID;

    /**
     * The feature id for the '<em><b>Container Behavior Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_PATTERN__CONTAINER_BEHAVIOR_PATTERN = ACTIVITY_PATTERN__CONTAINER_BEHAVIOR_PATTERN;

    /**
     * The feature id for the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_PATTERN__INSTANTIATION = ACTIVITY_PATTERN__INSTANTIATION;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_PATTERN__TYPE = ACTIVITY_PATTERN__TYPE;

    /**
     * The feature id for the '<em><b>Variables</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_PATTERN__VARIABLES = ACTIVITY_PATTERN__VARIABLES;

    /**
     * The feature id for the '<em><b>Data Patterns</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_PATTERN__DATA_PATTERNS = ACTIVITY_PATTERN__DATA_PATTERNS;

    /**
     * The feature id for the '<em><b>Identity Role Patterns</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_PATTERN__IDENTITY_ROLE_PATTERNS = ACTIVITY_PATTERN__IDENTITY_ROLE_PATTERNS;

    /**
     * The feature id for the '<em><b>Identity Patterns</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_PATTERN__IDENTITY_PATTERNS = ACTIVITY_PATTERN__IDENTITY_PATTERNS;

    /**
     * The feature id for the '<em><b>Contribution Patterns</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_PATTERN__CONTRIBUTION_PATTERNS = ACTIVITY_PATTERN_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Interaction Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_PATTERN_FEATURE_COUNT = ACTIVITY_PATTERN_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Interaction Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_PATTERN_OPERATION_COUNT = ACTIVITY_PATTERN_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.pattern.impl.InteractionContributionPatternImpl <em>Interaction Contribution Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.pattern.impl.InteractionContributionPatternImpl
     * @see behavior.pattern.impl.PatternPackageImpl#getInteractionContributionPattern()
     * @generated
     */
    int INTERACTION_CONTRIBUTION_PATTERN = 4;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_PATTERN__VISUAL_ELEMENTS = ModelsPackage.PATTERN__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_PATTERN__ID = ModelsPackage.PATTERN__ID;

    /**
     * The feature id for the '<em><b>Participant Behavior Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_PATTERN__PARTICIPANT_BEHAVIOR_PATTERN = ModelsPackage.PATTERN_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_PATTERN__TYPE = ModelsPackage.PATTERN_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Contribution Of Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_PATTERN__CONTRIBUTION_OF_TYPE = ModelsPackage.PATTERN_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Interaction Contribution Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_PATTERN_FEATURE_COUNT = ModelsPackage.PATTERN_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Interaction Contribution Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_PATTERN_OPERATION_COUNT = ModelsPackage.PATTERN_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link behavior.pattern.BehaviorPattern <em>Behavior Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Behavior Pattern</em>'.
     * @see behavior.pattern.BehaviorPattern
     * @generated
     */
    EClass getBehaviorPattern();

    /**
     * Returns the meta object for the reference '{@link behavior.pattern.BehaviorPattern#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see behavior.pattern.BehaviorPattern#getType()
     * @see #getBehaviorPattern()
     * @generated
     */
    EReference getBehaviorPattern_Type();

    /**
     * Returns the meta object for the containment reference '{@link behavior.pattern.BehaviorPattern#getInstantiationHierarchy <em>Instantiation Hierarchy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Instantiation Hierarchy</em>'.
     * @see behavior.pattern.BehaviorPattern#getInstantiationHierarchy()
     * @see #getBehaviorPattern()
     * @generated
     */
    EReference getBehaviorPattern_InstantiationHierarchy();

    /**
     * Returns the meta object for the reference list '{@link behavior.pattern.BehaviorPattern#getVariables <em>Variables</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Variables</em>'.
     * @see behavior.pattern.BehaviorPattern#getVariables()
     * @see #getBehaviorPattern()
     * @generated
     */
    EReference getBehaviorPattern_Variables();

    /**
     * Returns the meta object for the containment reference '{@link behavior.pattern.BehaviorPattern#getEntityPattern <em>Entity Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Entity Pattern</em>'.
     * @see behavior.pattern.BehaviorPattern#getEntityPattern()
     * @see #getBehaviorPattern()
     * @generated
     */
    EReference getBehaviorPattern_EntityPattern();

    /**
     * Returns the meta object for class '{@link behavior.pattern.ActivityPattern <em>Activity Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Activity Pattern</em>'.
     * @see behavior.pattern.ActivityPattern
     * @generated
     */
    EClass getActivityPattern();

    /**
     * Returns the meta object for the containment reference '{@link behavior.pattern.ActivityPattern#getContainerBehaviorPattern <em>Container Behavior Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Container Behavior Pattern</em>'.
     * @see behavior.pattern.ActivityPattern#getContainerBehaviorPattern()
     * @see #getActivityPattern()
     * @generated
     */
    EReference getActivityPattern_ContainerBehaviorPattern();

    /**
     * Returns the meta object for the reference '{@link behavior.pattern.ActivityPattern#getInstantiation <em>Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Instantiation</em>'.
     * @see behavior.pattern.ActivityPattern#getInstantiation()
     * @see #getActivityPattern()
     * @generated
     */
    EReference getActivityPattern_Instantiation();

    /**
     * Returns the meta object for the reference '{@link behavior.pattern.ActivityPattern#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see behavior.pattern.ActivityPattern#getType()
     * @see #getActivityPattern()
     * @generated
     */
    EReference getActivityPattern_Type();

    /**
     * Returns the meta object for the reference list '{@link behavior.pattern.ActivityPattern#getVariables <em>Variables</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Variables</em>'.
     * @see behavior.pattern.ActivityPattern#getVariables()
     * @see #getActivityPattern()
     * @generated
     */
    EReference getActivityPattern_Variables();

    /**
     * Returns the meta object for the containment reference list '{@link behavior.pattern.ActivityPattern#getDataPatterns <em>Data Patterns</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Data Patterns</em>'.
     * @see behavior.pattern.ActivityPattern#getDataPatterns()
     * @see #getActivityPattern()
     * @generated
     */
    EReference getActivityPattern_DataPatterns();

    /**
     * Returns the meta object for the containment reference list '{@link behavior.pattern.ActivityPattern#getIdentityRolePatterns <em>Identity Role Patterns</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Identity Role Patterns</em>'.
     * @see behavior.pattern.ActivityPattern#getIdentityRolePatterns()
     * @see #getActivityPattern()
     * @generated
     */
    EReference getActivityPattern_IdentityRolePatterns();

    /**
     * Returns the meta object for the containment reference list '{@link behavior.pattern.ActivityPattern#getIdentityPatterns <em>Identity Patterns</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Identity Patterns</em>'.
     * @see behavior.pattern.ActivityPattern#getIdentityPatterns()
     * @see #getActivityPattern()
     * @generated
     */
    EReference getActivityPattern_IdentityPatterns();

    /**
     * Returns the meta object for class '{@link behavior.pattern.ActionPattern <em>Action Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Action Pattern</em>'.
     * @see behavior.pattern.ActionPattern
     * @generated
     */
    EClass getActionPattern();

    /**
     * Returns the meta object for class '{@link behavior.pattern.InteractionPattern <em>Interaction Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interaction Pattern</em>'.
     * @see behavior.pattern.InteractionPattern
     * @generated
     */
    EClass getInteractionPattern();

    /**
     * Returns the meta object for the containment reference list '{@link behavior.pattern.InteractionPattern#getContributionPatterns <em>Contribution Patterns</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Contribution Patterns</em>'.
     * @see behavior.pattern.InteractionPattern#getContributionPatterns()
     * @see #getInteractionPattern()
     * @generated
     */
    EReference getInteractionPattern_ContributionPatterns();

    /**
     * Returns the meta object for class '{@link behavior.pattern.InteractionContributionPattern <em>Interaction Contribution Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interaction Contribution Pattern</em>'.
     * @see behavior.pattern.InteractionContributionPattern
     * @generated
     */
    EClass getInteractionContributionPattern();

    /**
     * Returns the meta object for the containment reference '{@link behavior.pattern.InteractionContributionPattern#getParticipantBehaviorPattern <em>Participant Behavior Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Participant Behavior Pattern</em>'.
     * @see behavior.pattern.InteractionContributionPattern#getParticipantBehaviorPattern()
     * @see #getInteractionContributionPattern()
     * @generated
     */
    EReference getInteractionContributionPattern_ParticipantBehaviorPattern();

    /**
     * Returns the meta object for the reference '{@link behavior.pattern.InteractionContributionPattern#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see behavior.pattern.InteractionContributionPattern#getType()
     * @see #getInteractionContributionPattern()
     * @generated
     */
    EReference getInteractionContributionPattern_Type();

    /**
     * Returns the meta object for the reference '{@link behavior.pattern.InteractionContributionPattern#getContributionOfType <em>Contribution Of Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Contribution Of Type</em>'.
     * @see behavior.pattern.InteractionContributionPattern#getContributionOfType()
     * @see #getInteractionContributionPattern()
     * @generated
     */
    EReference getInteractionContributionPattern_ContributionOfType();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    PatternFactory getPatternFactory();

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
         * The meta object literal for the '{@link behavior.pattern.impl.BehaviorPatternImpl <em>Behavior Pattern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.pattern.impl.BehaviorPatternImpl
         * @see behavior.pattern.impl.PatternPackageImpl#getBehaviorPattern()
         * @generated
         */
        EClass BEHAVIOR_PATTERN = eINSTANCE.getBehaviorPattern();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BEHAVIOR_PATTERN__TYPE = eINSTANCE.getBehaviorPattern_Type();

        /**
         * The meta object literal for the '<em><b>Instantiation Hierarchy</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BEHAVIOR_PATTERN__INSTANTIATION_HIERARCHY = eINSTANCE.getBehaviorPattern_InstantiationHierarchy();

        /**
         * The meta object literal for the '<em><b>Variables</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BEHAVIOR_PATTERN__VARIABLES = eINSTANCE.getBehaviorPattern_Variables();

        /**
         * The meta object literal for the '<em><b>Entity Pattern</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BEHAVIOR_PATTERN__ENTITY_PATTERN = eINSTANCE.getBehaviorPattern_EntityPattern();

        /**
         * The meta object literal for the '{@link behavior.pattern.impl.ActivityPatternImpl <em>Activity Pattern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.pattern.impl.ActivityPatternImpl
         * @see behavior.pattern.impl.PatternPackageImpl#getActivityPattern()
         * @generated
         */
        EClass ACTIVITY_PATTERN = eINSTANCE.getActivityPattern();

        /**
         * The meta object literal for the '<em><b>Container Behavior Pattern</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTIVITY_PATTERN__CONTAINER_BEHAVIOR_PATTERN = eINSTANCE.getActivityPattern_ContainerBehaviorPattern();

        /**
         * The meta object literal for the '<em><b>Instantiation</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTIVITY_PATTERN__INSTANTIATION = eINSTANCE.getActivityPattern_Instantiation();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTIVITY_PATTERN__TYPE = eINSTANCE.getActivityPattern_Type();

        /**
         * The meta object literal for the '<em><b>Variables</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTIVITY_PATTERN__VARIABLES = eINSTANCE.getActivityPattern_Variables();

        /**
         * The meta object literal for the '<em><b>Data Patterns</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTIVITY_PATTERN__DATA_PATTERNS = eINSTANCE.getActivityPattern_DataPatterns();

        /**
         * The meta object literal for the '<em><b>Identity Role Patterns</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTIVITY_PATTERN__IDENTITY_ROLE_PATTERNS = eINSTANCE.getActivityPattern_IdentityRolePatterns();

        /**
         * The meta object literal for the '<em><b>Identity Patterns</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTIVITY_PATTERN__IDENTITY_PATTERNS = eINSTANCE.getActivityPattern_IdentityPatterns();

        /**
         * The meta object literal for the '{@link behavior.pattern.impl.ActionPatternImpl <em>Action Pattern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.pattern.impl.ActionPatternImpl
         * @see behavior.pattern.impl.PatternPackageImpl#getActionPattern()
         * @generated
         */
        EClass ACTION_PATTERN = eINSTANCE.getActionPattern();

        /**
         * The meta object literal for the '{@link behavior.pattern.impl.InteractionPatternImpl <em>Interaction Pattern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.pattern.impl.InteractionPatternImpl
         * @see behavior.pattern.impl.PatternPackageImpl#getInteractionPattern()
         * @generated
         */
        EClass INTERACTION_PATTERN = eINSTANCE.getInteractionPattern();

        /**
         * The meta object literal for the '<em><b>Contribution Patterns</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERACTION_PATTERN__CONTRIBUTION_PATTERNS = eINSTANCE.getInteractionPattern_ContributionPatterns();

        /**
         * The meta object literal for the '{@link behavior.pattern.impl.InteractionContributionPatternImpl <em>Interaction Contribution Pattern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.pattern.impl.InteractionContributionPatternImpl
         * @see behavior.pattern.impl.PatternPackageImpl#getInteractionContributionPattern()
         * @generated
         */
        EClass INTERACTION_CONTRIBUTION_PATTERN = eINSTANCE.getInteractionContributionPattern();

        /**
         * The meta object literal for the '<em><b>Participant Behavior Pattern</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERACTION_CONTRIBUTION_PATTERN__PARTICIPANT_BEHAVIOR_PATTERN = eINSTANCE.getInteractionContributionPattern_ParticipantBehaviorPattern();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERACTION_CONTRIBUTION_PATTERN__TYPE = eINSTANCE.getInteractionContributionPattern_Type();

        /**
         * The meta object literal for the '<em><b>Contribution Of Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERACTION_CONTRIBUTION_PATTERN__CONTRIBUTION_OF_TYPE = eINSTANCE.getInteractionContributionPattern_ContributionOfType();

    }

} //PatternPackage
