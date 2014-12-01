/**
 */
package seckit.refinement.impl;

import behavior.BehaviorPackage;

import behavior.causality.CausalityPackage;

import behavior.instantiation.InstantiationPackage;

import behavior.type.TypePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import risk.RiskPackage;

import seckit.SeckitPackage;

import seckit.impl.SeckitPackageImpl;

import seckit.refinement.ActionInsertion;
import seckit.refinement.ActionRefinedIntoActions;
import seckit.refinement.ActionRefinedIntoInteraction;
import seckit.refinement.ActionRefinement;
import seckit.refinement.ActivityRefinement;
import seckit.refinement.BehaviorRefinementType;
import seckit.refinement.BilateralParticipantIntroduction;
import seckit.refinement.CausalityOrientedBehaviorRefinement;
import seckit.refinement.CausalityRefinement;
import seckit.refinement.ConstraintOrientedBehaviorRefinement;
import seckit.refinement.InteractionRefinement;
import seckit.refinement.InterfaceDecomposition;
import seckit.refinement.NewParticipantIntroduction;
import seckit.refinement.RefinementFactory;
import seckit.refinement.RefinementPackage;
import seckit.refinement.RefinementRelationHierarchy;
import seckit.refinement.RefinementRelationInstantiation;
import seckit.refinement.RefinementRelationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RefinementPackageImpl extends EPackageImpl implements RefinementPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass refinementRelationTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass actionRefinedIntoActionsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass interfaceDecompositionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass actionRefinementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass interactionRefinementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass actionInsertionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass actionRefinedIntoInteractionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass causalityRefinementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass causalityOrientedBehaviorRefinementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass constraintOrientedBehaviorRefinementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass newParticipantIntroductionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass bilateralParticipantIntroductionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass activityRefinementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass refinementRelationInstantiationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass refinementRelationHierarchyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass behaviorRefinementTypeEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see seckit.refinement.RefinementPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private RefinementPackageImpl() {
        super(eNS_URI, RefinementFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link RefinementPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static RefinementPackage init() {
        if (isInited) return (RefinementPackage)EPackage.Registry.INSTANCE.getEPackage(RefinementPackage.eNS_URI);

        // Obtain or create and register package
        RefinementPackageImpl theRefinementPackage = (RefinementPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RefinementPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RefinementPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        BehaviorPackage.eINSTANCE.eClass();
        RiskPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        SeckitPackageImpl theSeckitPackage = (SeckitPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SeckitPackage.eNS_URI) instanceof SeckitPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SeckitPackage.eNS_URI) : SeckitPackage.eINSTANCE);

        // Create package meta-data objects
        theRefinementPackage.createPackageContents();
        theSeckitPackage.createPackageContents();

        // Initialize created meta-data
        theRefinementPackage.initializePackageContents();
        theSeckitPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theRefinementPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(RefinementPackage.eNS_URI, theRefinementPackage);
        return theRefinementPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRefinementRelationType() {
        return refinementRelationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getActionRefinedIntoActions() {
        return actionRefinedIntoActionsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getActionRefinedIntoActions_ConcreteInteractions() {
        return (EReference)actionRefinedIntoActionsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getActionRefinedIntoActions_ConcreteActions() {
        return (EReference)actionRefinedIntoActionsEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getActionRefinedIntoActions_ConcreteRelations() {
        return (EReference)actionRefinedIntoActionsEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInterfaceDecomposition() {
        return interfaceDecompositionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInterfaceDecomposition_ConcreteInteractionTypes() {
        return (EReference)interfaceDecompositionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInterfaceDecomposition_AbstractInteractionType() {
        return (EReference)interfaceDecompositionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getActionRefinement() {
        return actionRefinementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getActionRefinement_AbstractAction() {
        return (EReference)actionRefinementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInteractionRefinement() {
        return interactionRefinementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getActionInsertion() {
        return actionInsertionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getActionInsertion_InsertedActions() {
        return (EReference)actionInsertionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getActionRefinedIntoInteraction() {
        return actionRefinedIntoInteractionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCausalityRefinement() {
        return causalityRefinementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCausalityRefinement_AbstractRelation() {
        return (EReference)causalityRefinementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCausalityRefinement_ConcreteRelations() {
        return (EReference)causalityRefinementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCausalityOrientedBehaviorRefinement() {
        return causalityOrientedBehaviorRefinementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConstraintOrientedBehaviorRefinement() {
        return constraintOrientedBehaviorRefinementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConstraintOrientedBehaviorRefinement_AbstractAction() {
        return (EReference)constraintOrientedBehaviorRefinementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConstraintOrientedBehaviorRefinement_ConcreteInteractionTypes() {
        return (EReference)constraintOrientedBehaviorRefinementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNewParticipantIntroduction() {
        return newParticipantIntroductionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBilateralParticipantIntroduction() {
        return bilateralParticipantIntroductionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getActivityRefinement() {
        return activityRefinementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRefinementRelationInstantiation() {
        return refinementRelationInstantiationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRefinementRelationInstantiation_Type() {
        return (EReference)refinementRelationInstantiationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRefinementRelationHierarchy() {
        return refinementRelationHierarchyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRefinementRelationHierarchy_RefinementInstantiationRef() {
        return (EReference)refinementRelationHierarchyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRefinementRelationHierarchy_EReference0() {
        return (EReference)refinementRelationHierarchyEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBehaviorRefinementType() {
        return behaviorRefinementTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RefinementFactory getRefinementFactory() {
        return (RefinementFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        refinementRelationTypeEClass = createEClass(REFINEMENT_RELATION_TYPE);

        actionRefinedIntoActionsEClass = createEClass(ACTION_REFINED_INTO_ACTIONS);
        createEReference(actionRefinedIntoActionsEClass, ACTION_REFINED_INTO_ACTIONS__CONCRETE_INTERACTIONS);
        createEReference(actionRefinedIntoActionsEClass, ACTION_REFINED_INTO_ACTIONS__CONCRETE_ACTIONS);
        createEReference(actionRefinedIntoActionsEClass, ACTION_REFINED_INTO_ACTIONS__CONCRETE_RELATIONS);

        interfaceDecompositionEClass = createEClass(INTERFACE_DECOMPOSITION);
        createEReference(interfaceDecompositionEClass, INTERFACE_DECOMPOSITION__CONCRETE_INTERACTION_TYPES);
        createEReference(interfaceDecompositionEClass, INTERFACE_DECOMPOSITION__ABSTRACT_INTERACTION_TYPE);

        actionRefinementEClass = createEClass(ACTION_REFINEMENT);
        createEReference(actionRefinementEClass, ACTION_REFINEMENT__ABSTRACT_ACTION);

        interactionRefinementEClass = createEClass(INTERACTION_REFINEMENT);

        actionInsertionEClass = createEClass(ACTION_INSERTION);
        createEReference(actionInsertionEClass, ACTION_INSERTION__INSERTED_ACTIONS);

        actionRefinedIntoInteractionEClass = createEClass(ACTION_REFINED_INTO_INTERACTION);

        causalityRefinementEClass = createEClass(CAUSALITY_REFINEMENT);
        createEReference(causalityRefinementEClass, CAUSALITY_REFINEMENT__ABSTRACT_RELATION);
        createEReference(causalityRefinementEClass, CAUSALITY_REFINEMENT__CONCRETE_RELATIONS);

        causalityOrientedBehaviorRefinementEClass = createEClass(CAUSALITY_ORIENTED_BEHAVIOR_REFINEMENT);

        constraintOrientedBehaviorRefinementEClass = createEClass(CONSTRAINT_ORIENTED_BEHAVIOR_REFINEMENT);
        createEReference(constraintOrientedBehaviorRefinementEClass, CONSTRAINT_ORIENTED_BEHAVIOR_REFINEMENT__ABSTRACT_ACTION);
        createEReference(constraintOrientedBehaviorRefinementEClass, CONSTRAINT_ORIENTED_BEHAVIOR_REFINEMENT__CONCRETE_INTERACTION_TYPES);

        newParticipantIntroductionEClass = createEClass(NEW_PARTICIPANT_INTRODUCTION);

        bilateralParticipantIntroductionEClass = createEClass(BILATERAL_PARTICIPANT_INTRODUCTION);

        activityRefinementEClass = createEClass(ACTIVITY_REFINEMENT);

        refinementRelationInstantiationEClass = createEClass(REFINEMENT_RELATION_INSTANTIATION);
        createEReference(refinementRelationInstantiationEClass, REFINEMENT_RELATION_INSTANTIATION__TYPE);

        refinementRelationHierarchyEClass = createEClass(REFINEMENT_RELATION_HIERARCHY);
        createEReference(refinementRelationHierarchyEClass, REFINEMENT_RELATION_HIERARCHY__REFINEMENT_INSTANTIATION_REF);
        createEReference(refinementRelationHierarchyEClass, REFINEMENT_RELATION_HIERARCHY__EREFERENCE0);

        behaviorRefinementTypeEClass = createEClass(BEHAVIOR_REFINEMENT_TYPE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        InstantiationPackage theInstantiationPackage = (InstantiationPackage)EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI);
        CausalityPackage theCausalityPackage = (CausalityPackage)EPackage.Registry.INSTANCE.getEPackage(CausalityPackage.eNS_URI);
        TypePackage theTypePackage = (TypePackage)EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        actionRefinedIntoActionsEClass.getESuperTypes().add(this.getActionRefinement());
        interfaceDecompositionEClass.getESuperTypes().add(this.getInteractionRefinement());
        actionRefinementEClass.getESuperTypes().add(this.getActivityRefinement());
        interactionRefinementEClass.getESuperTypes().add(this.getActivityRefinement());
        actionInsertionEClass.getESuperTypes().add(this.getCausalityRefinement());
        actionRefinedIntoInteractionEClass.getESuperTypes().add(this.getActionRefinement());
        causalityRefinementEClass.getESuperTypes().add(this.getRefinementRelationType());
        causalityOrientedBehaviorRefinementEClass.getESuperTypes().add(this.getCausalityRefinement());
        causalityOrientedBehaviorRefinementEClass.getESuperTypes().add(this.getBehaviorRefinementType());
        constraintOrientedBehaviorRefinementEClass.getESuperTypes().add(this.getBehaviorRefinementType());
        newParticipantIntroductionEClass.getESuperTypes().add(this.getInteractionRefinement());
        bilateralParticipantIntroductionEClass.getESuperTypes().add(this.getInteractionRefinement());
        activityRefinementEClass.getESuperTypes().add(this.getRefinementRelationType());
        behaviorRefinementTypeEClass.getESuperTypes().add(this.getRefinementRelationType());

        // Initialize classes, features, and operations; add parameters
        initEClass(refinementRelationTypeEClass, RefinementRelationType.class, "RefinementRelationType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(actionRefinedIntoActionsEClass, ActionRefinedIntoActions.class, "ActionRefinedIntoActions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getActionRefinedIntoActions_ConcreteInteractions(), theInstantiationPackage.getInteractionContributionInstantiation(), null, "concreteInteractions", null, 2, -1, ActionRefinedIntoActions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getActionRefinedIntoActions_ConcreteActions(), theInstantiationPackage.getActionInstantiation(), null, "concreteActions", null, 2, -1, ActionRefinedIntoActions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getActionRefinedIntoActions_ConcreteRelations(), theCausalityPackage.getCausalityRelation(), null, "concreteRelations", null, 0, -1, ActionRefinedIntoActions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(interfaceDecompositionEClass, InterfaceDecomposition.class, "InterfaceDecomposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInterfaceDecomposition_ConcreteInteractionTypes(), theTypePackage.getInteractionType(), null, "concreteInteractionTypes", null, 2, -1, InterfaceDecomposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInterfaceDecomposition_AbstractInteractionType(), theTypePackage.getInteractionType(), null, "abstractInteractionType", null, 1, 1, InterfaceDecomposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(actionRefinementEClass, ActionRefinement.class, "ActionRefinement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getActionRefinement_AbstractAction(), theInstantiationPackage.getActionInstantiation(), null, "abstractAction", null, 1, 1, ActionRefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(interactionRefinementEClass, InteractionRefinement.class, "InteractionRefinement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(actionInsertionEClass, ActionInsertion.class, "ActionInsertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getActionInsertion_InsertedActions(), theInstantiationPackage.getActionInstantiation(), null, "insertedActions", null, 1, -1, ActionInsertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(actionRefinedIntoInteractionEClass, ActionRefinedIntoInteraction.class, "ActionRefinedIntoInteraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(causalityRefinementEClass, CausalityRefinement.class, "CausalityRefinement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCausalityRefinement_AbstractRelation(), theCausalityPackage.getCausalityRelation(), null, "abstractRelation", null, 1, 1, CausalityRefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCausalityRefinement_ConcreteRelations(), theCausalityPackage.getCausalityRelation(), null, "concreteRelations", null, 0, -1, CausalityRefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(causalityOrientedBehaviorRefinementEClass, CausalityOrientedBehaviorRefinement.class, "CausalityOrientedBehaviorRefinement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(constraintOrientedBehaviorRefinementEClass, ConstraintOrientedBehaviorRefinement.class, "ConstraintOrientedBehaviorRefinement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getConstraintOrientedBehaviorRefinement_AbstractAction(), theInstantiationPackage.getActionInstantiation(), null, "abstractAction", null, 1, 1, ConstraintOrientedBehaviorRefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getConstraintOrientedBehaviorRefinement_ConcreteInteractionTypes(), theTypePackage.getInteractionType(), null, "concreteInteractionTypes", null, 1, -1, ConstraintOrientedBehaviorRefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(newParticipantIntroductionEClass, NewParticipantIntroduction.class, "NewParticipantIntroduction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(bilateralParticipantIntroductionEClass, BilateralParticipantIntroduction.class, "BilateralParticipantIntroduction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(activityRefinementEClass, ActivityRefinement.class, "ActivityRefinement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(refinementRelationInstantiationEClass, RefinementRelationInstantiation.class, "RefinementRelationInstantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRefinementRelationInstantiation_Type(), this.getRefinementRelationType(), null, "type", null, 1, 1, RefinementRelationInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(refinementRelationHierarchyEClass, RefinementRelationHierarchy.class, "RefinementRelationHierarchy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRefinementRelationHierarchy_RefinementInstantiationRef(), this.getRefinementRelationInstantiation(), null, "refinementInstantiationRef", null, 0, 1, RefinementRelationHierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRefinementRelationHierarchy_EReference0(), this.getRefinementRelationHierarchy(), null, "EReference0", null, 0, 1, RefinementRelationHierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(behaviorRefinementTypeEClass, BehaviorRefinementType.class, "BehaviorRefinementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    }

} //RefinementPackageImpl
