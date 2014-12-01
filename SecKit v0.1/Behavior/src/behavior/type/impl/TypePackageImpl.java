/**
 */
package behavior.type.impl;

import behavior.BehaviorPackage;

import behavior.address.AddressPackage;

import behavior.address.impl.AddressPackageImpl;

import behavior.causality.CausalityPackage;

import behavior.causality.impl.CausalityPackageImpl;

import behavior.condition.ConditionPackage;

import behavior.condition.impl.ConditionPackageImpl;

import behavior.constraint.ConstraintPackage;

import behavior.constraint.impl.ConstraintPackageImpl;

import behavior.event.EventPackage;

import behavior.event.impl.EventPackageImpl;

import behavior.impl.BehaviorPackageImpl;

import behavior.instance.InstancePackage;

import behavior.instance.impl.InstancePackageImpl;

import behavior.instantiation.InstantiationPackage;

import behavior.instantiation.impl.InstantiationPackageImpl;

import behavior.pattern.PatternPackage;

import behavior.pattern.impl.PatternPackageImpl;

import behavior.quality.QualityPackage;

import behavior.quality.impl.QualityPackageImpl;

import behavior.trust.TrustPackage;

import behavior.trust.impl.TrustPackageImpl;

import behavior.type.AbstractBehaviorType;
import behavior.type.AbstractDataProducerType;
import behavior.type.ActionType;
import behavior.type.ActivityType;
import behavior.type.BehaviorType;
import behavior.type.BehaviorTypePackage;
import behavior.type.DataProducerCharacterization;
import behavior.type.DataProducerType;
import behavior.type.EntryPointType;
import behavior.type.ExitPointType;
import behavior.type.FlowPointType;
import behavior.type.InteractionContributionType;
import behavior.type.InteractionPatternType;
import behavior.type.InteractionType;
import behavior.type.MonolithicBehaviorType;
import behavior.type.StructuredBehaviorType;
import behavior.type.TypeFactory;
import behavior.type.TypePackage;

import behavior.type.action.ActionPackage;

import behavior.type.action.impl.ActionPackageImpl;

import behavior.variable.VariablePackage;

import behavior.variable.impl.VariablePackageImpl;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import structure.StructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypePackageImpl extends EPackageImpl implements TypePackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass monolithicBehaviorTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass actionTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass interactionContributionTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass activityTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractBehaviorTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass interactionTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass behaviorTypePackageEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass flowPointTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass entryPointTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass exitPointTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass behaviorTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass structuredBehaviorTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataProducerTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataProducerCharacterizationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractDataProducerTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum interactionPatternTypeEEnum = null;

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
     * @see behavior.type.TypePackage#eNS_URI
     * @see #init()
     * @generated
     */
    private TypePackageImpl() {
        super(eNS_URI, TypeFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link TypePackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static TypePackage init() {
        if (isInited) return (TypePackage)EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);

        // Obtain or create and register package
        TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TypePackageImpl());

        isInited = true;

        // Initialize simple dependencies
        StructurePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
        InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
        ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) : ActionPackage.eINSTANCE);
        InstantiationPackageImpl theInstantiationPackage = (InstantiationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) instanceof InstantiationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) : InstantiationPackage.eINSTANCE);
        CausalityPackageImpl theCausalityPackage = (CausalityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CausalityPackage.eNS_URI) instanceof CausalityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CausalityPackage.eNS_URI) : CausalityPackage.eINSTANCE);
        ConstraintPackageImpl theConstraintPackage = (ConstraintPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) instanceof ConstraintPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) : ConstraintPackage.eINSTANCE);
        VariablePackageImpl theVariablePackage = (VariablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI) instanceof VariablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI) : VariablePackage.eINSTANCE);
        QualityPackageImpl theQualityPackage = (QualityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QualityPackage.eNS_URI) instanceof QualityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QualityPackage.eNS_URI) : QualityPackage.eINSTANCE);
        PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
        AddressPackageImpl theAddressPackage = (AddressPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AddressPackage.eNS_URI) instanceof AddressPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AddressPackage.eNS_URI) : AddressPackage.eINSTANCE);
        EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);
        ConditionPackageImpl theConditionPackage = (ConditionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConditionPackage.eNS_URI) instanceof ConditionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConditionPackage.eNS_URI) : ConditionPackage.eINSTANCE);
        behavior.action.impl.ActionPackageImpl theActionPackage_1 = (behavior.action.impl.ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(behavior.action.ActionPackage.eNS_URI) instanceof behavior.action.impl.ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(behavior.action.ActionPackage.eNS_URI) : behavior.action.ActionPackage.eINSTANCE);
        TrustPackageImpl theTrustPackage = (TrustPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TrustPackage.eNS_URI) instanceof TrustPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TrustPackage.eNS_URI) : TrustPackage.eINSTANCE);

        // Create package meta-data objects
        theTypePackage.createPackageContents();
        theBehaviorPackage.createPackageContents();
        theInstancePackage.createPackageContents();
        theActionPackage.createPackageContents();
        theInstantiationPackage.createPackageContents();
        theCausalityPackage.createPackageContents();
        theConstraintPackage.createPackageContents();
        theVariablePackage.createPackageContents();
        theQualityPackage.createPackageContents();
        thePatternPackage.createPackageContents();
        theAddressPackage.createPackageContents();
        theEventPackage.createPackageContents();
        theConditionPackage.createPackageContents();
        theActionPackage_1.createPackageContents();
        theTrustPackage.createPackageContents();

        // Initialize created meta-data
        theTypePackage.initializePackageContents();
        theBehaviorPackage.initializePackageContents();
        theInstancePackage.initializePackageContents();
        theActionPackage.initializePackageContents();
        theInstantiationPackage.initializePackageContents();
        theCausalityPackage.initializePackageContents();
        theConstraintPackage.initializePackageContents();
        theVariablePackage.initializePackageContents();
        theQualityPackage.initializePackageContents();
        thePatternPackage.initializePackageContents();
        theAddressPackage.initializePackageContents();
        theEventPackage.initializePackageContents();
        theConditionPackage.initializePackageContents();
        theActionPackage_1.initializePackageContents();
        theTrustPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theTypePackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(TypePackage.eNS_URI, theTypePackage);
        return theTypePackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMonolithicBehaviorType() {
        return monolithicBehaviorTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMonolithicBehaviorType_Actions() {
        return (EReference)monolithicBehaviorTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getActionType() {
        return actionTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getActionType_Instances() {
        return (EReference)actionTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInteractionContributionType() {
        return interactionContributionTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInteractionContributionType_Instantiations() {
        return (EReference)interactionContributionTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInteractionContributionType_Role() {
        return (EAttribute)interactionContributionTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInteractionContributionType_Constraints() {
        return (EReference)interactionContributionTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInteractionContributionType_InteractionType() {
        return (EReference)interactionContributionTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getActivityType() {
        return activityTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getActivityType_Instantiations() {
        return (EReference)activityTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getActivityType_SubTypes() {
        return (EReference)activityTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getActivityType_SuperTypes() {
        return (EReference)activityTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbstractBehaviorType() {
        return abstractBehaviorTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAbstractBehaviorType_FlowPoints() {
        return (EReference)abstractBehaviorTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAbstractBehaviorType_CausalityRelations() {
        return (EReference)abstractBehaviorTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAbstractBehaviorType_Instantiations() {
        return (EReference)abstractBehaviorTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAbstractBehaviorType_VariableDeclarations() {
        return (EReference)abstractBehaviorTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAbstractBehaviorType_SuperTypes() {
        return (EReference)abstractBehaviorTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAbstractBehaviorType_Instances() {
        return (EReference)abstractBehaviorTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAbstractBehaviorType_Package() {
        return (EReference)abstractBehaviorTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAbstractBehaviorType_EntityType() {
        return (EReference)abstractBehaviorTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAbstractBehaviorType_SubTypes() {
        return (EReference)abstractBehaviorTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAbstractBehaviorType_Contributions() {
        return (EReference)abstractBehaviorTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInteractionType() {
        return interactionTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInteractionType_Instances() {
        return (EReference)interactionTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInteractionType_InteractionPattern() {
        return (EAttribute)interactionTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInteractionType_ContributionTypes() {
        return (EReference)interactionTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBehaviorTypePackage() {
        return behaviorTypePackageEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBehaviorTypePackage_BehaviorTypes() {
        return (EReference)behaviorTypePackageEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBehaviorTypePackage_SubPackages() {
        return (EReference)behaviorTypePackageEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBehaviorTypePackage_DataProducerTypes() {
        return (EReference)behaviorTypePackageEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBehaviorTypePackage_Name() {
        return (EAttribute)behaviorTypePackageEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBehaviorTypePackage_SuperPackage() {
        return (EReference)behaviorTypePackageEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBehaviorTypePackage_Model() {
        return (EReference)behaviorTypePackageEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFlowPointType() {
        return flowPointTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFlowPointType_Instantiations() {
        return (EReference)flowPointTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEntryPointType() {
        return entryPointTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExitPointType() {
        return exitPointTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBehaviorType() {
        return behaviorTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStructuredBehaviorType() {
        return structuredBehaviorTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getStructuredBehaviorType_ContainedInstantiations() {
        return (EReference)structuredBehaviorTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getStructuredBehaviorType_Interactions() {
        return (EReference)structuredBehaviorTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataProducerType() {
        return dataProducerTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataProducerType_Package() {
        return (EReference)dataProducerTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataProducerCharacterization() {
        return dataProducerCharacterizationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbstractDataProducerType() {
        return abstractDataProducerTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAbstractDataProducerType_DataInstantiations() {
        return (EReference)abstractDataProducerTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAbstractDataProducerType_IdentityInstantiations() {
        return (EReference)abstractDataProducerTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAbstractDataProducerType_Constraints() {
        return (EReference)abstractDataProducerTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAbstractDataProducerType_Name() {
        return (EAttribute)abstractDataProducerTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getInteractionPatternType() {
        return interactionPatternTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeFactory getTypeFactory() {
        return (TypeFactory)getEFactoryInstance();
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
        monolithicBehaviorTypeEClass = createEClass(MONOLITHIC_BEHAVIOR_TYPE);
        createEReference(monolithicBehaviorTypeEClass, MONOLITHIC_BEHAVIOR_TYPE__ACTIONS);

        actionTypeEClass = createEClass(ACTION_TYPE);
        createEReference(actionTypeEClass, ACTION_TYPE__INSTANCES);

        interactionContributionTypeEClass = createEClass(INTERACTION_CONTRIBUTION_TYPE);
        createEReference(interactionContributionTypeEClass, INTERACTION_CONTRIBUTION_TYPE__INSTANTIATIONS);
        createEAttribute(interactionContributionTypeEClass, INTERACTION_CONTRIBUTION_TYPE__ROLE);
        createEReference(interactionContributionTypeEClass, INTERACTION_CONTRIBUTION_TYPE__CONSTRAINTS);
        createEReference(interactionContributionTypeEClass, INTERACTION_CONTRIBUTION_TYPE__INTERACTION_TYPE);

        activityTypeEClass = createEClass(ACTIVITY_TYPE);
        createEReference(activityTypeEClass, ACTIVITY_TYPE__INSTANTIATIONS);
        createEReference(activityTypeEClass, ACTIVITY_TYPE__SUB_TYPES);
        createEReference(activityTypeEClass, ACTIVITY_TYPE__SUPER_TYPES);

        abstractBehaviorTypeEClass = createEClass(ABSTRACT_BEHAVIOR_TYPE);
        createEReference(abstractBehaviorTypeEClass, ABSTRACT_BEHAVIOR_TYPE__FLOW_POINTS);
        createEReference(abstractBehaviorTypeEClass, ABSTRACT_BEHAVIOR_TYPE__CAUSALITY_RELATIONS);
        createEReference(abstractBehaviorTypeEClass, ABSTRACT_BEHAVIOR_TYPE__INSTANTIATIONS);
        createEReference(abstractBehaviorTypeEClass, ABSTRACT_BEHAVIOR_TYPE__VARIABLE_DECLARATIONS);
        createEReference(abstractBehaviorTypeEClass, ABSTRACT_BEHAVIOR_TYPE__SUPER_TYPES);
        createEReference(abstractBehaviorTypeEClass, ABSTRACT_BEHAVIOR_TYPE__INSTANCES);
        createEReference(abstractBehaviorTypeEClass, ABSTRACT_BEHAVIOR_TYPE__PACKAGE);
        createEReference(abstractBehaviorTypeEClass, ABSTRACT_BEHAVIOR_TYPE__ENTITY_TYPE);
        createEReference(abstractBehaviorTypeEClass, ABSTRACT_BEHAVIOR_TYPE__SUB_TYPES);
        createEReference(abstractBehaviorTypeEClass, ABSTRACT_BEHAVIOR_TYPE__CONTRIBUTIONS);

        interactionTypeEClass = createEClass(INTERACTION_TYPE);
        createEReference(interactionTypeEClass, INTERACTION_TYPE__INSTANCES);
        createEAttribute(interactionTypeEClass, INTERACTION_TYPE__INTERACTION_PATTERN);
        createEReference(interactionTypeEClass, INTERACTION_TYPE__CONTRIBUTION_TYPES);

        behaviorTypePackageEClass = createEClass(BEHAVIOR_TYPE_PACKAGE);
        createEReference(behaviorTypePackageEClass, BEHAVIOR_TYPE_PACKAGE__BEHAVIOR_TYPES);
        createEReference(behaviorTypePackageEClass, BEHAVIOR_TYPE_PACKAGE__SUB_PACKAGES);
        createEReference(behaviorTypePackageEClass, BEHAVIOR_TYPE_PACKAGE__DATA_PRODUCER_TYPES);
        createEAttribute(behaviorTypePackageEClass, BEHAVIOR_TYPE_PACKAGE__NAME);
        createEReference(behaviorTypePackageEClass, BEHAVIOR_TYPE_PACKAGE__SUPER_PACKAGE);
        createEReference(behaviorTypePackageEClass, BEHAVIOR_TYPE_PACKAGE__MODEL);

        flowPointTypeEClass = createEClass(FLOW_POINT_TYPE);
        createEReference(flowPointTypeEClass, FLOW_POINT_TYPE__INSTANTIATIONS);

        entryPointTypeEClass = createEClass(ENTRY_POINT_TYPE);

        exitPointTypeEClass = createEClass(EXIT_POINT_TYPE);

        behaviorTypeEClass = createEClass(BEHAVIOR_TYPE);

        structuredBehaviorTypeEClass = createEClass(STRUCTURED_BEHAVIOR_TYPE);
        createEReference(structuredBehaviorTypeEClass, STRUCTURED_BEHAVIOR_TYPE__CONTAINED_INSTANTIATIONS);
        createEReference(structuredBehaviorTypeEClass, STRUCTURED_BEHAVIOR_TYPE__INTERACTIONS);

        dataProducerTypeEClass = createEClass(DATA_PRODUCER_TYPE);
        createEReference(dataProducerTypeEClass, DATA_PRODUCER_TYPE__PACKAGE);

        dataProducerCharacterizationEClass = createEClass(DATA_PRODUCER_CHARACTERIZATION);

        abstractDataProducerTypeEClass = createEClass(ABSTRACT_DATA_PRODUCER_TYPE);
        createEReference(abstractDataProducerTypeEClass, ABSTRACT_DATA_PRODUCER_TYPE__DATA_INSTANTIATIONS);
        createEReference(abstractDataProducerTypeEClass, ABSTRACT_DATA_PRODUCER_TYPE__IDENTITY_INSTANTIATIONS);
        createEReference(abstractDataProducerTypeEClass, ABSTRACT_DATA_PRODUCER_TYPE__CONSTRAINTS);
        createEAttribute(abstractDataProducerTypeEClass, ABSTRACT_DATA_PRODUCER_TYPE__NAME);

        // Create enums
        interactionPatternTypeEEnum = createEEnum(INTERACTION_PATTERN_TYPE);
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
        ActionPackage theActionPackage = (ActionPackage)EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI);
        InstantiationPackage theInstantiationPackage = (InstantiationPackage)EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI);
        InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);
        ModelsPackage theModelsPackage = (ModelsPackage)EPackage.Registry.INSTANCE.getEPackage(ModelsPackage.eNS_URI);
        ConstraintPackage theConstraintPackage = (ConstraintPackage)EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI);
        CausalityPackage theCausalityPackage = (CausalityPackage)EPackage.Registry.INSTANCE.getEPackage(CausalityPackage.eNS_URI);
        models.variable.VariablePackage theVariablePackage_1 = (models.variable.VariablePackage)EPackage.Registry.INSTANCE.getEPackage(models.variable.VariablePackage.eNS_URI);
        structure.type.TypePackage theTypePackage_1 = (structure.type.TypePackage)EPackage.Registry.INSTANCE.getEPackage(structure.type.TypePackage.eNS_URI);
        BehaviorPackage theBehaviorPackage = (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);
        data.instantiation.InstantiationPackage theInstantiationPackage_1 = (data.instantiation.InstantiationPackage)EPackage.Registry.INSTANCE.getEPackage(data.instantiation.InstantiationPackage.eNS_URI);
        identity.instantiation.InstantiationPackage theInstantiationPackage_2 = (identity.instantiation.InstantiationPackage)EPackage.Registry.INSTANCE.getEPackage(identity.instantiation.InstantiationPackage.eNS_URI);

        // Add subpackages
        getESubpackages().add(theActionPackage);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        monolithicBehaviorTypeEClass.getESuperTypes().add(this.getAbstractBehaviorType());
        actionTypeEClass.getESuperTypes().add(this.getActivityType());
        interactionContributionTypeEClass.getESuperTypes().add(theModelsPackage.getElement());
        activityTypeEClass.getESuperTypes().add(this.getDataProducerType());
        abstractBehaviorTypeEClass.getESuperTypes().add(this.getAbstractDataProducerType());
        interactionTypeEClass.getESuperTypes().add(this.getActivityType());
        behaviorTypePackageEClass.getESuperTypes().add(theModelsPackage.getElement());
        flowPointTypeEClass.getESuperTypes().add(this.getDataProducerType());
        entryPointTypeEClass.getESuperTypes().add(this.getFlowPointType());
        exitPointTypeEClass.getESuperTypes().add(this.getFlowPointType());
        behaviorTypeEClass.getESuperTypes().add(this.getStructuredBehaviorType());
        behaviorTypeEClass.getESuperTypes().add(this.getMonolithicBehaviorType());
        structuredBehaviorTypeEClass.getESuperTypes().add(this.getAbstractBehaviorType());
        dataProducerTypeEClass.getESuperTypes().add(this.getAbstractDataProducerType());
        abstractDataProducerTypeEClass.getESuperTypes().add(theModelsPackage.getElement());

        // Initialize classes, features, and operations; add parameters
        initEClass(monolithicBehaviorTypeEClass, MonolithicBehaviorType.class, "MonolithicBehaviorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMonolithicBehaviorType_Actions(), theInstantiationPackage.getActionInstantiation(), null, "actions", null, 0, -1, MonolithicBehaviorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(actionTypeEClass, ActionType.class, "ActionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getActionType_Instances(), theInstancePackage.getAction(), theInstancePackage.getAction_Type(), "instances", null, 0, -1, ActionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(interactionContributionTypeEClass, InteractionContributionType.class, "InteractionContributionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInteractionContributionType_Instantiations(), theInstantiationPackage.getInteractionContributionInstantiation(), theInstantiationPackage.getInteractionContributionInstantiation_Type(), "instantiations", null, 0, -1, InteractionContributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInteractionContributionType_Role(), ecorePackage.getEString(), "role", null, 0, 1, InteractionContributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInteractionContributionType_Constraints(), theConstraintPackage.getConstraint(), null, "constraints", null, 0, -1, InteractionContributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInteractionContributionType_InteractionType(), this.getInteractionType(), this.getInteractionType_ContributionTypes(), "interactionType", null, 1, 1, InteractionContributionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(activityTypeEClass, ActivityType.class, "ActivityType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getActivityType_Instantiations(), theInstantiationPackage.getActivityInstantiation(), theInstantiationPackage.getActivityInstantiation_Type(), "instantiations", null, 0, -1, ActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getActivityType_SubTypes(), this.getActivityType(), this.getActivityType_SuperTypes(), "subTypes", null, 0, -1, ActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getActivityType_SuperTypes(), this.getActivityType(), this.getActivityType_SubTypes(), "superTypes", null, 0, 1, ActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(abstractBehaviorTypeEClass, AbstractBehaviorType.class, "AbstractBehaviorType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAbstractBehaviorType_FlowPoints(), theInstantiationPackage.getFlowPointOfType(), theInstantiationPackage.getFlowPointOfType_BehaviorType(), "flowPoints", null, 0, -1, AbstractBehaviorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAbstractBehaviorType_CausalityRelations(), theCausalityPackage.getCausalityRelation(), theCausalityPackage.getCausalityRelation_Context(), "causalityRelations", null, 0, -1, AbstractBehaviorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAbstractBehaviorType_Instantiations(), theInstantiationPackage.getBehaviorInstantiation(), theInstantiationPackage.getBehaviorInstantiation_Type(), "instantiations", null, 0, -1, AbstractBehaviorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAbstractBehaviorType_VariableDeclarations(), theVariablePackage_1.getVariableDeclaration(), null, "variableDeclarations", null, 0, -1, AbstractBehaviorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAbstractBehaviorType_SuperTypes(), this.getAbstractBehaviorType(), this.getAbstractBehaviorType_SubTypes(), "superTypes", null, 0, -1, AbstractBehaviorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAbstractBehaviorType_Instances(), theInstancePackage.getBehavior(), theInstancePackage.getBehavior_Type(), "instances", null, 0, -1, AbstractBehaviorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAbstractBehaviorType_Package(), this.getBehaviorTypePackage(), this.getBehaviorTypePackage_BehaviorTypes(), "package", null, 1, 1, AbstractBehaviorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAbstractBehaviorType_EntityType(), theTypePackage_1.getEntityType(), null, "entityType", null, 0, 1, AbstractBehaviorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAbstractBehaviorType_SubTypes(), this.getAbstractBehaviorType(), this.getAbstractBehaviorType_SuperTypes(), "subTypes", null, 0, 1, AbstractBehaviorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAbstractBehaviorType_Contributions(), theInstantiationPackage.getAbstractInteractionContributionOfType(), theInstantiationPackage.getAbstractInteractionContributionOfType_BehaviorType(), "contributions", null, 0, -1, AbstractBehaviorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(interactionTypeEClass, InteractionType.class, "InteractionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInteractionType_Instances(), theInstancePackage.getInteraction(), theInstancePackage.getInteraction_Type(), "instances", null, 0, -1, InteractionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInteractionType_InteractionPattern(), this.getInteractionPatternType(), "interactionPattern", null, 0, 1, InteractionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInteractionType_ContributionTypes(), this.getInteractionContributionType(), this.getInteractionContributionType_InteractionType(), "contributionTypes", null, 2, -1, InteractionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(behaviorTypePackageEClass, BehaviorTypePackage.class, "BehaviorTypePackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBehaviorTypePackage_BehaviorTypes(), this.getAbstractBehaviorType(), this.getAbstractBehaviorType_Package(), "behaviorTypes", null, 0, -1, BehaviorTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBehaviorTypePackage_SubPackages(), this.getBehaviorTypePackage(), this.getBehaviorTypePackage_SuperPackage(), "subPackages", null, 0, -1, BehaviorTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBehaviorTypePackage_DataProducerTypes(), this.getDataProducerType(), this.getDataProducerType_Package(), "dataProducerTypes", null, 0, -1, BehaviorTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBehaviorTypePackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, BehaviorTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBehaviorTypePackage_SuperPackage(), this.getBehaviorTypePackage(), this.getBehaviorTypePackage_SubPackages(), "superPackage", null, 0, 1, BehaviorTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBehaviorTypePackage_Model(), theBehaviorPackage.getBehaviorDesignModel(), theBehaviorPackage.getBehaviorDesignModel_Packages(), "model", null, 0, 1, BehaviorTypePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(flowPointTypeEClass, FlowPointType.class, "FlowPointType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getFlowPointType_Instantiations(), theInstantiationPackage.getFlowPointOfType(), theInstantiationPackage.getFlowPointOfType_Type(), "instantiations", null, 0, -1, FlowPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(entryPointTypeEClass, EntryPointType.class, "EntryPointType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(exitPointTypeEClass, ExitPointType.class, "ExitPointType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(behaviorTypeEClass, BehaviorType.class, "BehaviorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(structuredBehaviorTypeEClass, StructuredBehaviorType.class, "StructuredBehaviorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getStructuredBehaviorType_ContainedInstantiations(), theInstantiationPackage.getBehaviorInstantiation(), theInstantiationPackage.getBehaviorInstantiation_ContainerType(), "containedInstantiations", null, 0, -1, StructuredBehaviorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getStructuredBehaviorType_Interactions(), theInstantiationPackage.getInteractionInstantiation(), theInstantiationPackage.getInteractionInstantiation_BehaviorType(), "interactions", null, 0, -1, StructuredBehaviorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dataProducerTypeEClass, DataProducerType.class, "DataProducerType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDataProducerType_Package(), this.getBehaviorTypePackage(), this.getBehaviorTypePackage_DataProducerTypes(), "package", null, 1, 1, DataProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dataProducerCharacterizationEClass, DataProducerCharacterization.class, "DataProducerCharacterization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(abstractDataProducerTypeEClass, AbstractDataProducerType.class, "AbstractDataProducerType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAbstractDataProducerType_DataInstantiations(), theInstantiationPackage_1.getDataInstantiation(), null, "dataInstantiations", null, 0, -1, AbstractDataProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAbstractDataProducerType_IdentityInstantiations(), theInstantiationPackage_2.getIdentityInstantiation(), null, "identityInstantiations", null, 0, -1, AbstractDataProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAbstractDataProducerType_Constraints(), theConstraintPackage.getConstraint(), null, "constraints", null, 0, -1, AbstractDataProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAbstractDataProducerType_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractDataProducerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(interactionPatternTypeEEnum, InteractionPatternType.class, "InteractionPatternType");
        addEEnumLiteral(interactionPatternTypeEEnum, InteractionPatternType.MESSAGE_PASSING);
        addEEnumLiteral(interactionPatternTypeEEnum, InteractionPatternType.REQUEST_RESPONSE);
        addEEnumLiteral(interactionPatternTypeEEnum, InteractionPatternType.SUBSCRIBE_NOTIFY);
        addEEnumLiteral(interactionPatternTypeEEnum, InteractionPatternType.PUBLISH_SUBSCRIBE);
        addEEnumLiteral(interactionPatternTypeEEnum, InteractionPatternType.SOLICIT_RESPONSE);
        addEEnumLiteral(interactionPatternTypeEEnum, InteractionPatternType.ONE_WAY);
        addEEnumLiteral(interactionPatternTypeEEnum, InteractionPatternType.NOTIFICATION);
    }

} //TypePackageImpl
