/**
 */
package seckit.refinement;

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
 * @see seckit.refinement.RefinementFactory
 * @model kind="package"
 * @generated
 */
public interface RefinementPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "refinement";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://seckit/refinement/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "seckit-refinement";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    RefinementPackage eINSTANCE = seckit.refinement.impl.RefinementPackageImpl.init();

    /**
     * The meta object id for the '{@link seckit.refinement.impl.RefinementRelationTypeImpl <em>Relation Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see seckit.refinement.impl.RefinementRelationTypeImpl
     * @see seckit.refinement.impl.RefinementPackageImpl#getRefinementRelationType()
     * @generated
     */
    int REFINEMENT_RELATION_TYPE = 0;

    /**
     * The number of structural features of the '<em>Relation Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFINEMENT_RELATION_TYPE_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Relation Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFINEMENT_RELATION_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link seckit.refinement.impl.ActivityRefinementImpl <em>Activity Refinement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see seckit.refinement.impl.ActivityRefinementImpl
     * @see seckit.refinement.impl.RefinementPackageImpl#getActivityRefinement()
     * @generated
     */
    int ACTIVITY_REFINEMENT = 12;

    /**
     * The number of structural features of the '<em>Activity Refinement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_REFINEMENT_FEATURE_COUNT = REFINEMENT_RELATION_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Activity Refinement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_REFINEMENT_OPERATION_COUNT = REFINEMENT_RELATION_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link seckit.refinement.impl.ActionRefinementImpl <em>Action Refinement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see seckit.refinement.impl.ActionRefinementImpl
     * @see seckit.refinement.impl.RefinementPackageImpl#getActionRefinement()
     * @generated
     */
    int ACTION_REFINEMENT = 3;

    /**
     * The feature id for the '<em><b>Abstract Action</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_REFINEMENT__ABSTRACT_ACTION = ACTIVITY_REFINEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Action Refinement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_REFINEMENT_FEATURE_COUNT = ACTIVITY_REFINEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Action Refinement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_REFINEMENT_OPERATION_COUNT = ACTIVITY_REFINEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link seckit.refinement.impl.ActionRefinedIntoActionsImpl <em>Action Refined Into Actions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see seckit.refinement.impl.ActionRefinedIntoActionsImpl
     * @see seckit.refinement.impl.RefinementPackageImpl#getActionRefinedIntoActions()
     * @generated
     */
    int ACTION_REFINED_INTO_ACTIONS = 1;

    /**
     * The feature id for the '<em><b>Abstract Action</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_REFINED_INTO_ACTIONS__ABSTRACT_ACTION = ACTION_REFINEMENT__ABSTRACT_ACTION;

    /**
     * The feature id for the '<em><b>Concrete Interactions</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_REFINED_INTO_ACTIONS__CONCRETE_INTERACTIONS = ACTION_REFINEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Concrete Actions</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_REFINED_INTO_ACTIONS__CONCRETE_ACTIONS = ACTION_REFINEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Concrete Relations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_REFINED_INTO_ACTIONS__CONCRETE_RELATIONS = ACTION_REFINEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Action Refined Into Actions</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_REFINED_INTO_ACTIONS_FEATURE_COUNT = ACTION_REFINEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Action Refined Into Actions</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_REFINED_INTO_ACTIONS_OPERATION_COUNT = ACTION_REFINEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link seckit.refinement.impl.InteractionRefinementImpl <em>Interaction Refinement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see seckit.refinement.impl.InteractionRefinementImpl
     * @see seckit.refinement.impl.RefinementPackageImpl#getInteractionRefinement()
     * @generated
     */
    int INTERACTION_REFINEMENT = 4;

    /**
     * The number of structural features of the '<em>Interaction Refinement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_REFINEMENT_FEATURE_COUNT = ACTIVITY_REFINEMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Interaction Refinement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_REFINEMENT_OPERATION_COUNT = ACTIVITY_REFINEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link seckit.refinement.impl.InterfaceDecompositionImpl <em>Interface Decomposition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see seckit.refinement.impl.InterfaceDecompositionImpl
     * @see seckit.refinement.impl.RefinementPackageImpl#getInterfaceDecomposition()
     * @generated
     */
    int INTERFACE_DECOMPOSITION = 2;

    /**
     * The feature id for the '<em><b>Concrete Interaction Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_DECOMPOSITION__CONCRETE_INTERACTION_TYPES = INTERACTION_REFINEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Abstract Interaction Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_DECOMPOSITION__ABSTRACT_INTERACTION_TYPE = INTERACTION_REFINEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Interface Decomposition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_DECOMPOSITION_FEATURE_COUNT = INTERACTION_REFINEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Interface Decomposition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERFACE_DECOMPOSITION_OPERATION_COUNT = INTERACTION_REFINEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link seckit.refinement.impl.CausalityRefinementImpl <em>Causality Refinement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see seckit.refinement.impl.CausalityRefinementImpl
     * @see seckit.refinement.impl.RefinementPackageImpl#getCausalityRefinement()
     * @generated
     */
    int CAUSALITY_REFINEMENT = 7;

    /**
     * The feature id for the '<em><b>Abstract Relation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAUSALITY_REFINEMENT__ABSTRACT_RELATION = REFINEMENT_RELATION_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Concrete Relations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAUSALITY_REFINEMENT__CONCRETE_RELATIONS = REFINEMENT_RELATION_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Causality Refinement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAUSALITY_REFINEMENT_FEATURE_COUNT = REFINEMENT_RELATION_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Causality Refinement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAUSALITY_REFINEMENT_OPERATION_COUNT = REFINEMENT_RELATION_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link seckit.refinement.impl.ActionInsertionImpl <em>Action Insertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see seckit.refinement.impl.ActionInsertionImpl
     * @see seckit.refinement.impl.RefinementPackageImpl#getActionInsertion()
     * @generated
     */
    int ACTION_INSERTION = 5;

    /**
     * The feature id for the '<em><b>Abstract Relation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_INSERTION__ABSTRACT_RELATION = CAUSALITY_REFINEMENT__ABSTRACT_RELATION;

    /**
     * The feature id for the '<em><b>Concrete Relations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_INSERTION__CONCRETE_RELATIONS = CAUSALITY_REFINEMENT__CONCRETE_RELATIONS;

    /**
     * The feature id for the '<em><b>Inserted Actions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_INSERTION__INSERTED_ACTIONS = CAUSALITY_REFINEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Action Insertion</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_INSERTION_FEATURE_COUNT = CAUSALITY_REFINEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Action Insertion</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_INSERTION_OPERATION_COUNT = CAUSALITY_REFINEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link seckit.refinement.impl.ActionRefinedIntoInteractionImpl <em>Action Refined Into Interaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see seckit.refinement.impl.ActionRefinedIntoInteractionImpl
     * @see seckit.refinement.impl.RefinementPackageImpl#getActionRefinedIntoInteraction()
     * @generated
     */
    int ACTION_REFINED_INTO_INTERACTION = 6;

    /**
     * The feature id for the '<em><b>Abstract Action</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_REFINED_INTO_INTERACTION__ABSTRACT_ACTION = ACTION_REFINEMENT__ABSTRACT_ACTION;

    /**
     * The number of structural features of the '<em>Action Refined Into Interaction</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_REFINED_INTO_INTERACTION_FEATURE_COUNT = ACTION_REFINEMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Action Refined Into Interaction</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_REFINED_INTO_INTERACTION_OPERATION_COUNT = ACTION_REFINEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link seckit.refinement.impl.CausalityOrientedBehaviorRefinementImpl <em>Causality Oriented Behavior Refinement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see seckit.refinement.impl.CausalityOrientedBehaviorRefinementImpl
     * @see seckit.refinement.impl.RefinementPackageImpl#getCausalityOrientedBehaviorRefinement()
     * @generated
     */
    int CAUSALITY_ORIENTED_BEHAVIOR_REFINEMENT = 8;

    /**
     * The feature id for the '<em><b>Abstract Relation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAUSALITY_ORIENTED_BEHAVIOR_REFINEMENT__ABSTRACT_RELATION = CAUSALITY_REFINEMENT__ABSTRACT_RELATION;

    /**
     * The feature id for the '<em><b>Concrete Relations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAUSALITY_ORIENTED_BEHAVIOR_REFINEMENT__CONCRETE_RELATIONS = CAUSALITY_REFINEMENT__CONCRETE_RELATIONS;

    /**
     * The number of structural features of the '<em>Causality Oriented Behavior Refinement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAUSALITY_ORIENTED_BEHAVIOR_REFINEMENT_FEATURE_COUNT = CAUSALITY_REFINEMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Causality Oriented Behavior Refinement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CAUSALITY_ORIENTED_BEHAVIOR_REFINEMENT_OPERATION_COUNT = CAUSALITY_REFINEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link seckit.refinement.impl.BehaviorRefinementTypeImpl <em>Behavior Refinement Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see seckit.refinement.impl.BehaviorRefinementTypeImpl
     * @see seckit.refinement.impl.RefinementPackageImpl#getBehaviorRefinementType()
     * @generated
     */
    int BEHAVIOR_REFINEMENT_TYPE = 15;

    /**
     * The number of structural features of the '<em>Behavior Refinement Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_REFINEMENT_TYPE_FEATURE_COUNT = REFINEMENT_RELATION_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Behavior Refinement Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_REFINEMENT_TYPE_OPERATION_COUNT = REFINEMENT_RELATION_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link seckit.refinement.impl.ConstraintOrientedBehaviorRefinementImpl <em>Constraint Oriented Behavior Refinement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see seckit.refinement.impl.ConstraintOrientedBehaviorRefinementImpl
     * @see seckit.refinement.impl.RefinementPackageImpl#getConstraintOrientedBehaviorRefinement()
     * @generated
     */
    int CONSTRAINT_ORIENTED_BEHAVIOR_REFINEMENT = 9;

    /**
     * The feature id for the '<em><b>Abstract Action</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRAINT_ORIENTED_BEHAVIOR_REFINEMENT__ABSTRACT_ACTION = BEHAVIOR_REFINEMENT_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Concrete Interaction Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRAINT_ORIENTED_BEHAVIOR_REFINEMENT__CONCRETE_INTERACTION_TYPES = BEHAVIOR_REFINEMENT_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Constraint Oriented Behavior Refinement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRAINT_ORIENTED_BEHAVIOR_REFINEMENT_FEATURE_COUNT = BEHAVIOR_REFINEMENT_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Constraint Oriented Behavior Refinement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRAINT_ORIENTED_BEHAVIOR_REFINEMENT_OPERATION_COUNT = BEHAVIOR_REFINEMENT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link seckit.refinement.impl.NewParticipantIntroductionImpl <em>New Participant Introduction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see seckit.refinement.impl.NewParticipantIntroductionImpl
     * @see seckit.refinement.impl.RefinementPackageImpl#getNewParticipantIntroduction()
     * @generated
     */
    int NEW_PARTICIPANT_INTRODUCTION = 10;

    /**
     * The number of structural features of the '<em>New Participant Introduction</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_PARTICIPANT_INTRODUCTION_FEATURE_COUNT = INTERACTION_REFINEMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>New Participant Introduction</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEW_PARTICIPANT_INTRODUCTION_OPERATION_COUNT = INTERACTION_REFINEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link seckit.refinement.impl.BilateralParticipantIntroductionImpl <em>Bilateral Participant Introduction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see seckit.refinement.impl.BilateralParticipantIntroductionImpl
     * @see seckit.refinement.impl.RefinementPackageImpl#getBilateralParticipantIntroduction()
     * @generated
     */
    int BILATERAL_PARTICIPANT_INTRODUCTION = 11;

    /**
     * The number of structural features of the '<em>Bilateral Participant Introduction</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BILATERAL_PARTICIPANT_INTRODUCTION_FEATURE_COUNT = INTERACTION_REFINEMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Bilateral Participant Introduction</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BILATERAL_PARTICIPANT_INTRODUCTION_OPERATION_COUNT = INTERACTION_REFINEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link seckit.refinement.impl.RefinementRelationInstantiationImpl <em>Relation Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see seckit.refinement.impl.RefinementRelationInstantiationImpl
     * @see seckit.refinement.impl.RefinementPackageImpl#getRefinementRelationInstantiation()
     * @generated
     */
    int REFINEMENT_RELATION_INSTANTIATION = 13;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFINEMENT_RELATION_INSTANTIATION__TYPE = 0;

    /**
     * The number of structural features of the '<em>Relation Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFINEMENT_RELATION_INSTANTIATION_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Relation Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFINEMENT_RELATION_INSTANTIATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link seckit.refinement.impl.RefinementRelationHierarchyImpl <em>Relation Hierarchy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see seckit.refinement.impl.RefinementRelationHierarchyImpl
     * @see seckit.refinement.impl.RefinementPackageImpl#getRefinementRelationHierarchy()
     * @generated
     */
    int REFINEMENT_RELATION_HIERARCHY = 14;

    /**
     * The feature id for the '<em><b>Refinement Instantiation Ref</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFINEMENT_RELATION_HIERARCHY__REFINEMENT_INSTANTIATION_REF = 0;

    /**
     * The feature id for the '<em><b>EReference0</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFINEMENT_RELATION_HIERARCHY__EREFERENCE0 = 1;

    /**
     * The number of structural features of the '<em>Relation Hierarchy</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFINEMENT_RELATION_HIERARCHY_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Relation Hierarchy</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFINEMENT_RELATION_HIERARCHY_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link seckit.refinement.RefinementRelationType <em>Relation Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Relation Type</em>'.
     * @see seckit.refinement.RefinementRelationType
     * @generated
     */
    EClass getRefinementRelationType();

    /**
     * Returns the meta object for class '{@link seckit.refinement.ActionRefinedIntoActions <em>Action Refined Into Actions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Action Refined Into Actions</em>'.
     * @see seckit.refinement.ActionRefinedIntoActions
     * @generated
     */
    EClass getActionRefinedIntoActions();

    /**
     * Returns the meta object for the reference list '{@link seckit.refinement.ActionRefinedIntoActions#getConcreteInteractions <em>Concrete Interactions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Concrete Interactions</em>'.
     * @see seckit.refinement.ActionRefinedIntoActions#getConcreteInteractions()
     * @see #getActionRefinedIntoActions()
     * @generated
     */
    EReference getActionRefinedIntoActions_ConcreteInteractions();

    /**
     * Returns the meta object for the reference list '{@link seckit.refinement.ActionRefinedIntoActions#getConcreteActions <em>Concrete Actions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Concrete Actions</em>'.
     * @see seckit.refinement.ActionRefinedIntoActions#getConcreteActions()
     * @see #getActionRefinedIntoActions()
     * @generated
     */
    EReference getActionRefinedIntoActions_ConcreteActions();

    /**
     * Returns the meta object for the reference list '{@link seckit.refinement.ActionRefinedIntoActions#getConcreteRelations <em>Concrete Relations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Concrete Relations</em>'.
     * @see seckit.refinement.ActionRefinedIntoActions#getConcreteRelations()
     * @see #getActionRefinedIntoActions()
     * @generated
     */
    EReference getActionRefinedIntoActions_ConcreteRelations();

    /**
     * Returns the meta object for class '{@link seckit.refinement.InterfaceDecomposition <em>Interface Decomposition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interface Decomposition</em>'.
     * @see seckit.refinement.InterfaceDecomposition
     * @generated
     */
    EClass getInterfaceDecomposition();

    /**
     * Returns the meta object for the reference list '{@link seckit.refinement.InterfaceDecomposition#getConcreteInteractionTypes <em>Concrete Interaction Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Concrete Interaction Types</em>'.
     * @see seckit.refinement.InterfaceDecomposition#getConcreteInteractionTypes()
     * @see #getInterfaceDecomposition()
     * @generated
     */
    EReference getInterfaceDecomposition_ConcreteInteractionTypes();

    /**
     * Returns the meta object for the reference '{@link seckit.refinement.InterfaceDecomposition#getAbstractInteractionType <em>Abstract Interaction Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Abstract Interaction Type</em>'.
     * @see seckit.refinement.InterfaceDecomposition#getAbstractInteractionType()
     * @see #getInterfaceDecomposition()
     * @generated
     */
    EReference getInterfaceDecomposition_AbstractInteractionType();

    /**
     * Returns the meta object for class '{@link seckit.refinement.ActionRefinement <em>Action Refinement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Action Refinement</em>'.
     * @see seckit.refinement.ActionRefinement
     * @generated
     */
    EClass getActionRefinement();

    /**
     * Returns the meta object for the reference '{@link seckit.refinement.ActionRefinement#getAbstractAction <em>Abstract Action</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Abstract Action</em>'.
     * @see seckit.refinement.ActionRefinement#getAbstractAction()
     * @see #getActionRefinement()
     * @generated
     */
    EReference getActionRefinement_AbstractAction();

    /**
     * Returns the meta object for class '{@link seckit.refinement.InteractionRefinement <em>Interaction Refinement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interaction Refinement</em>'.
     * @see seckit.refinement.InteractionRefinement
     * @generated
     */
    EClass getInteractionRefinement();

    /**
     * Returns the meta object for class '{@link seckit.refinement.ActionInsertion <em>Action Insertion</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Action Insertion</em>'.
     * @see seckit.refinement.ActionInsertion
     * @generated
     */
    EClass getActionInsertion();

    /**
     * Returns the meta object for the containment reference list '{@link seckit.refinement.ActionInsertion#getInsertedActions <em>Inserted Actions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Inserted Actions</em>'.
     * @see seckit.refinement.ActionInsertion#getInsertedActions()
     * @see #getActionInsertion()
     * @generated
     */
    EReference getActionInsertion_InsertedActions();

    /**
     * Returns the meta object for class '{@link seckit.refinement.ActionRefinedIntoInteraction <em>Action Refined Into Interaction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Action Refined Into Interaction</em>'.
     * @see seckit.refinement.ActionRefinedIntoInteraction
     * @generated
     */
    EClass getActionRefinedIntoInteraction();

    /**
     * Returns the meta object for class '{@link seckit.refinement.CausalityRefinement <em>Causality Refinement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Causality Refinement</em>'.
     * @see seckit.refinement.CausalityRefinement
     * @generated
     */
    EClass getCausalityRefinement();

    /**
     * Returns the meta object for the reference '{@link seckit.refinement.CausalityRefinement#getAbstractRelation <em>Abstract Relation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Abstract Relation</em>'.
     * @see seckit.refinement.CausalityRefinement#getAbstractRelation()
     * @see #getCausalityRefinement()
     * @generated
     */
    EReference getCausalityRefinement_AbstractRelation();

    /**
     * Returns the meta object for the containment reference list '{@link seckit.refinement.CausalityRefinement#getConcreteRelations <em>Concrete Relations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Concrete Relations</em>'.
     * @see seckit.refinement.CausalityRefinement#getConcreteRelations()
     * @see #getCausalityRefinement()
     * @generated
     */
    EReference getCausalityRefinement_ConcreteRelations();

    /**
     * Returns the meta object for class '{@link seckit.refinement.CausalityOrientedBehaviorRefinement <em>Causality Oriented Behavior Refinement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Causality Oriented Behavior Refinement</em>'.
     * @see seckit.refinement.CausalityOrientedBehaviorRefinement
     * @generated
     */
    EClass getCausalityOrientedBehaviorRefinement();

    /**
     * Returns the meta object for class '{@link seckit.refinement.ConstraintOrientedBehaviorRefinement <em>Constraint Oriented Behavior Refinement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Constraint Oriented Behavior Refinement</em>'.
     * @see seckit.refinement.ConstraintOrientedBehaviorRefinement
     * @generated
     */
    EClass getConstraintOrientedBehaviorRefinement();

    /**
     * Returns the meta object for the reference '{@link seckit.refinement.ConstraintOrientedBehaviorRefinement#getAbstractAction <em>Abstract Action</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Abstract Action</em>'.
     * @see seckit.refinement.ConstraintOrientedBehaviorRefinement#getAbstractAction()
     * @see #getConstraintOrientedBehaviorRefinement()
     * @generated
     */
    EReference getConstraintOrientedBehaviorRefinement_AbstractAction();

    /**
     * Returns the meta object for the reference list '{@link seckit.refinement.ConstraintOrientedBehaviorRefinement#getConcreteInteractionTypes <em>Concrete Interaction Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Concrete Interaction Types</em>'.
     * @see seckit.refinement.ConstraintOrientedBehaviorRefinement#getConcreteInteractionTypes()
     * @see #getConstraintOrientedBehaviorRefinement()
     * @generated
     */
    EReference getConstraintOrientedBehaviorRefinement_ConcreteInteractionTypes();

    /**
     * Returns the meta object for class '{@link seckit.refinement.NewParticipantIntroduction <em>New Participant Introduction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>New Participant Introduction</em>'.
     * @see seckit.refinement.NewParticipantIntroduction
     * @generated
     */
    EClass getNewParticipantIntroduction();

    /**
     * Returns the meta object for class '{@link seckit.refinement.BilateralParticipantIntroduction <em>Bilateral Participant Introduction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Bilateral Participant Introduction</em>'.
     * @see seckit.refinement.BilateralParticipantIntroduction
     * @generated
     */
    EClass getBilateralParticipantIntroduction();

    /**
     * Returns the meta object for class '{@link seckit.refinement.ActivityRefinement <em>Activity Refinement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Activity Refinement</em>'.
     * @see seckit.refinement.ActivityRefinement
     * @generated
     */
    EClass getActivityRefinement();

    /**
     * Returns the meta object for class '{@link seckit.refinement.RefinementRelationInstantiation <em>Relation Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Relation Instantiation</em>'.
     * @see seckit.refinement.RefinementRelationInstantiation
     * @generated
     */
    EClass getRefinementRelationInstantiation();

    /**
     * Returns the meta object for the reference '{@link seckit.refinement.RefinementRelationInstantiation#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see seckit.refinement.RefinementRelationInstantiation#getType()
     * @see #getRefinementRelationInstantiation()
     * @generated
     */
    EReference getRefinementRelationInstantiation_Type();

    /**
     * Returns the meta object for class '{@link seckit.refinement.RefinementRelationHierarchy <em>Relation Hierarchy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Relation Hierarchy</em>'.
     * @see seckit.refinement.RefinementRelationHierarchy
     * @generated
     */
    EClass getRefinementRelationHierarchy();

    /**
     * Returns the meta object for the containment reference '{@link seckit.refinement.RefinementRelationHierarchy#getRefinementInstantiationRef <em>Refinement Instantiation Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Refinement Instantiation Ref</em>'.
     * @see seckit.refinement.RefinementRelationHierarchy#getRefinementInstantiationRef()
     * @see #getRefinementRelationHierarchy()
     * @generated
     */
    EReference getRefinementRelationHierarchy_RefinementInstantiationRef();

    /**
     * Returns the meta object for the reference '{@link seckit.refinement.RefinementRelationHierarchy#getEReference0 <em>EReference0</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>EReference0</em>'.
     * @see seckit.refinement.RefinementRelationHierarchy#getEReference0()
     * @see #getRefinementRelationHierarchy()
     * @generated
     */
    EReference getRefinementRelationHierarchy_EReference0();

    /**
     * Returns the meta object for class '{@link seckit.refinement.BehaviorRefinementType <em>Behavior Refinement Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Behavior Refinement Type</em>'.
     * @see seckit.refinement.BehaviorRefinementType
     * @generated
     */
    EClass getBehaviorRefinementType();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    RefinementFactory getRefinementFactory();

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
         * The meta object literal for the '{@link seckit.refinement.impl.RefinementRelationTypeImpl <em>Relation Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see seckit.refinement.impl.RefinementRelationTypeImpl
         * @see seckit.refinement.impl.RefinementPackageImpl#getRefinementRelationType()
         * @generated
         */
        EClass REFINEMENT_RELATION_TYPE = eINSTANCE.getRefinementRelationType();

        /**
         * The meta object literal for the '{@link seckit.refinement.impl.ActionRefinedIntoActionsImpl <em>Action Refined Into Actions</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see seckit.refinement.impl.ActionRefinedIntoActionsImpl
         * @see seckit.refinement.impl.RefinementPackageImpl#getActionRefinedIntoActions()
         * @generated
         */
        EClass ACTION_REFINED_INTO_ACTIONS = eINSTANCE.getActionRefinedIntoActions();

        /**
         * The meta object literal for the '<em><b>Concrete Interactions</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTION_REFINED_INTO_ACTIONS__CONCRETE_INTERACTIONS = eINSTANCE.getActionRefinedIntoActions_ConcreteInteractions();

        /**
         * The meta object literal for the '<em><b>Concrete Actions</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTION_REFINED_INTO_ACTIONS__CONCRETE_ACTIONS = eINSTANCE.getActionRefinedIntoActions_ConcreteActions();

        /**
         * The meta object literal for the '<em><b>Concrete Relations</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTION_REFINED_INTO_ACTIONS__CONCRETE_RELATIONS = eINSTANCE.getActionRefinedIntoActions_ConcreteRelations();

        /**
         * The meta object literal for the '{@link seckit.refinement.impl.InterfaceDecompositionImpl <em>Interface Decomposition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see seckit.refinement.impl.InterfaceDecompositionImpl
         * @see seckit.refinement.impl.RefinementPackageImpl#getInterfaceDecomposition()
         * @generated
         */
        EClass INTERFACE_DECOMPOSITION = eINSTANCE.getInterfaceDecomposition();

        /**
         * The meta object literal for the '<em><b>Concrete Interaction Types</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERFACE_DECOMPOSITION__CONCRETE_INTERACTION_TYPES = eINSTANCE.getInterfaceDecomposition_ConcreteInteractionTypes();

        /**
         * The meta object literal for the '<em><b>Abstract Interaction Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERFACE_DECOMPOSITION__ABSTRACT_INTERACTION_TYPE = eINSTANCE.getInterfaceDecomposition_AbstractInteractionType();

        /**
         * The meta object literal for the '{@link seckit.refinement.impl.ActionRefinementImpl <em>Action Refinement</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see seckit.refinement.impl.ActionRefinementImpl
         * @see seckit.refinement.impl.RefinementPackageImpl#getActionRefinement()
         * @generated
         */
        EClass ACTION_REFINEMENT = eINSTANCE.getActionRefinement();

        /**
         * The meta object literal for the '<em><b>Abstract Action</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTION_REFINEMENT__ABSTRACT_ACTION = eINSTANCE.getActionRefinement_AbstractAction();

        /**
         * The meta object literal for the '{@link seckit.refinement.impl.InteractionRefinementImpl <em>Interaction Refinement</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see seckit.refinement.impl.InteractionRefinementImpl
         * @see seckit.refinement.impl.RefinementPackageImpl#getInteractionRefinement()
         * @generated
         */
        EClass INTERACTION_REFINEMENT = eINSTANCE.getInteractionRefinement();

        /**
         * The meta object literal for the '{@link seckit.refinement.impl.ActionInsertionImpl <em>Action Insertion</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see seckit.refinement.impl.ActionInsertionImpl
         * @see seckit.refinement.impl.RefinementPackageImpl#getActionInsertion()
         * @generated
         */
        EClass ACTION_INSERTION = eINSTANCE.getActionInsertion();

        /**
         * The meta object literal for the '<em><b>Inserted Actions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTION_INSERTION__INSERTED_ACTIONS = eINSTANCE.getActionInsertion_InsertedActions();

        /**
         * The meta object literal for the '{@link seckit.refinement.impl.ActionRefinedIntoInteractionImpl <em>Action Refined Into Interaction</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see seckit.refinement.impl.ActionRefinedIntoInteractionImpl
         * @see seckit.refinement.impl.RefinementPackageImpl#getActionRefinedIntoInteraction()
         * @generated
         */
        EClass ACTION_REFINED_INTO_INTERACTION = eINSTANCE.getActionRefinedIntoInteraction();

        /**
         * The meta object literal for the '{@link seckit.refinement.impl.CausalityRefinementImpl <em>Causality Refinement</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see seckit.refinement.impl.CausalityRefinementImpl
         * @see seckit.refinement.impl.RefinementPackageImpl#getCausalityRefinement()
         * @generated
         */
        EClass CAUSALITY_REFINEMENT = eINSTANCE.getCausalityRefinement();

        /**
         * The meta object literal for the '<em><b>Abstract Relation</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAUSALITY_REFINEMENT__ABSTRACT_RELATION = eINSTANCE.getCausalityRefinement_AbstractRelation();

        /**
         * The meta object literal for the '<em><b>Concrete Relations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CAUSALITY_REFINEMENT__CONCRETE_RELATIONS = eINSTANCE.getCausalityRefinement_ConcreteRelations();

        /**
         * The meta object literal for the '{@link seckit.refinement.impl.CausalityOrientedBehaviorRefinementImpl <em>Causality Oriented Behavior Refinement</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see seckit.refinement.impl.CausalityOrientedBehaviorRefinementImpl
         * @see seckit.refinement.impl.RefinementPackageImpl#getCausalityOrientedBehaviorRefinement()
         * @generated
         */
        EClass CAUSALITY_ORIENTED_BEHAVIOR_REFINEMENT = eINSTANCE.getCausalityOrientedBehaviorRefinement();

        /**
         * The meta object literal for the '{@link seckit.refinement.impl.ConstraintOrientedBehaviorRefinementImpl <em>Constraint Oriented Behavior Refinement</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see seckit.refinement.impl.ConstraintOrientedBehaviorRefinementImpl
         * @see seckit.refinement.impl.RefinementPackageImpl#getConstraintOrientedBehaviorRefinement()
         * @generated
         */
        EClass CONSTRAINT_ORIENTED_BEHAVIOR_REFINEMENT = eINSTANCE.getConstraintOrientedBehaviorRefinement();

        /**
         * The meta object literal for the '<em><b>Abstract Action</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONSTRAINT_ORIENTED_BEHAVIOR_REFINEMENT__ABSTRACT_ACTION = eINSTANCE.getConstraintOrientedBehaviorRefinement_AbstractAction();

        /**
         * The meta object literal for the '<em><b>Concrete Interaction Types</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONSTRAINT_ORIENTED_BEHAVIOR_REFINEMENT__CONCRETE_INTERACTION_TYPES = eINSTANCE.getConstraintOrientedBehaviorRefinement_ConcreteInteractionTypes();

        /**
         * The meta object literal for the '{@link seckit.refinement.impl.NewParticipantIntroductionImpl <em>New Participant Introduction</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see seckit.refinement.impl.NewParticipantIntroductionImpl
         * @see seckit.refinement.impl.RefinementPackageImpl#getNewParticipantIntroduction()
         * @generated
         */
        EClass NEW_PARTICIPANT_INTRODUCTION = eINSTANCE.getNewParticipantIntroduction();

        /**
         * The meta object literal for the '{@link seckit.refinement.impl.BilateralParticipantIntroductionImpl <em>Bilateral Participant Introduction</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see seckit.refinement.impl.BilateralParticipantIntroductionImpl
         * @see seckit.refinement.impl.RefinementPackageImpl#getBilateralParticipantIntroduction()
         * @generated
         */
        EClass BILATERAL_PARTICIPANT_INTRODUCTION = eINSTANCE.getBilateralParticipantIntroduction();

        /**
         * The meta object literal for the '{@link seckit.refinement.impl.ActivityRefinementImpl <em>Activity Refinement</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see seckit.refinement.impl.ActivityRefinementImpl
         * @see seckit.refinement.impl.RefinementPackageImpl#getActivityRefinement()
         * @generated
         */
        EClass ACTIVITY_REFINEMENT = eINSTANCE.getActivityRefinement();

        /**
         * The meta object literal for the '{@link seckit.refinement.impl.RefinementRelationInstantiationImpl <em>Relation Instantiation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see seckit.refinement.impl.RefinementRelationInstantiationImpl
         * @see seckit.refinement.impl.RefinementPackageImpl#getRefinementRelationInstantiation()
         * @generated
         */
        EClass REFINEMENT_RELATION_INSTANTIATION = eINSTANCE.getRefinementRelationInstantiation();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REFINEMENT_RELATION_INSTANTIATION__TYPE = eINSTANCE.getRefinementRelationInstantiation_Type();

        /**
         * The meta object literal for the '{@link seckit.refinement.impl.RefinementRelationHierarchyImpl <em>Relation Hierarchy</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see seckit.refinement.impl.RefinementRelationHierarchyImpl
         * @see seckit.refinement.impl.RefinementPackageImpl#getRefinementRelationHierarchy()
         * @generated
         */
        EClass REFINEMENT_RELATION_HIERARCHY = eINSTANCE.getRefinementRelationHierarchy();

        /**
         * The meta object literal for the '<em><b>Refinement Instantiation Ref</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REFINEMENT_RELATION_HIERARCHY__REFINEMENT_INSTANTIATION_REF = eINSTANCE.getRefinementRelationHierarchy_RefinementInstantiationRef();

        /**
         * The meta object literal for the '<em><b>EReference0</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REFINEMENT_RELATION_HIERARCHY__EREFERENCE0 = eINSTANCE.getRefinementRelationHierarchy_EReference0();

        /**
         * The meta object literal for the '{@link seckit.refinement.impl.BehaviorRefinementTypeImpl <em>Behavior Refinement Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see seckit.refinement.impl.BehaviorRefinementTypeImpl
         * @see seckit.refinement.impl.RefinementPackageImpl#getBehaviorRefinementType()
         * @generated
         */
        EClass BEHAVIOR_REFINEMENT_TYPE = eINSTANCE.getBehaviorRefinementType();

    }

} //RefinementPackage
