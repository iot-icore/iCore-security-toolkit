/**
 */
package behavior.instantiation.impl;

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

import behavior.instantiation.AbstractInteractionContributionOfType;
import behavior.instantiation.ActionInstantiation;
import behavior.instantiation.ActionInstantiationHierarchy;
import behavior.instantiation.ActivityInstantiation;
import behavior.instantiation.BehaviorDeclaration;
import behavior.instantiation.BehaviorInstantiation;
import behavior.instantiation.BehaviorInstantiationHierarchy;
import behavior.instantiation.BehaviorInstantiationReference;
import behavior.instantiation.BehaviorInstantiationStaticReference;
import behavior.instantiation.BehaviorInstantiationVariableReference;
import behavior.instantiation.DelegatedInteractionContribution;
import behavior.instantiation.EntryPointOfInstantiation;
import behavior.instantiation.EntryPointOfType;
import behavior.instantiation.ExitPointOfInstantiation;
import behavior.instantiation.ExitPointOfType;
import behavior.instantiation.FlowPointInstantiation;
import behavior.instantiation.FlowPointOfInstantiation;
import behavior.instantiation.FlowPointOfType;
import behavior.instantiation.InstantiationFactory;
import behavior.instantiation.InstantiationPackage;
import behavior.instantiation.InteractionContributionInstantiation;
import behavior.instantiation.InteractionContributionOfInstantiation;
import behavior.instantiation.InteractionContributionOfType;
import behavior.instantiation.InteractionInstantiation;
import behavior.instantiation.RecursiveBehaviorInstantiation;

import behavior.pattern.PatternPackage;

import behavior.pattern.impl.PatternPackageImpl;

import behavior.quality.QualityPackage;

import behavior.quality.impl.QualityPackageImpl;

import behavior.trust.TrustPackage;

import behavior.trust.impl.TrustPackageImpl;

import behavior.type.TypePackage;

import behavior.type.action.ActionPackage;

import behavior.type.action.impl.ActionPackageImpl;

import behavior.type.impl.TypePackageImpl;

import behavior.variable.VariablePackage;

import behavior.variable.impl.VariablePackageImpl;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class InstantiationPackageImpl extends EPackageImpl implements InstantiationPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass activityInstantiationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass behaviorInstantiationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass recursiveBehaviorInstantiationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass behaviorInstantiationHierarchyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass behaviorInstantiationStaticReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass flowPointOfTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass entryPointOfInstantiationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass exitPointOfInstantiationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass interactionContributionOfInstantiationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass delegatedInteractionContributionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass interactionContributionInstantiationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass actionInstantiationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass interactionContributionOfTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass behaviorInstantiationVariableReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass behaviorInstantiationReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractInteractionContributionOfTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass flowPointOfInstantiationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass flowPointInstantiationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass entryPointOfTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass exitPointOfTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass actionInstantiationHierarchyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass interactionInstantiationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass behaviorDeclarationEClass = null;

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
     * @see behavior.instantiation.InstantiationPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private InstantiationPackageImpl() {
        super(eNS_URI, InstantiationFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link InstantiationPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static InstantiationPackage init() {
        if (isInited) return (InstantiationPackage)EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI);

        // Obtain or create and register package
        InstantiationPackageImpl theInstantiationPackage = (InstantiationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InstantiationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InstantiationPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        StructurePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
        InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
        TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
        ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) : ActionPackage.eINSTANCE);
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
        theInstantiationPackage.createPackageContents();
        theBehaviorPackage.createPackageContents();
        theInstancePackage.createPackageContents();
        theTypePackage.createPackageContents();
        theActionPackage.createPackageContents();
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
        theInstantiationPackage.initializePackageContents();
        theBehaviorPackage.initializePackageContents();
        theInstancePackage.initializePackageContents();
        theTypePackage.initializePackageContents();
        theActionPackage.initializePackageContents();
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
        theInstantiationPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(InstantiationPackage.eNS_URI, theInstantiationPackage);
        return theInstantiationPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getActivityInstantiation() {
        return activityInstantiationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getActivityInstantiation_Name() {
        return (EAttribute)activityInstantiationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getActivityInstantiation_Type() {
        return (EReference)activityInstantiationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getActivityInstantiation_ActivityPointInstantiation() {
        return (EReference)activityInstantiationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBehaviorInstantiation() {
        return behaviorInstantiationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBehaviorInstantiation_Type() {
        return (EReference)behaviorInstantiationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBehaviorInstantiation_Contributions() {
        return (EReference)behaviorInstantiationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBehaviorInstantiation_ContainerType() {
        return (EReference)behaviorInstantiationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBehaviorInstantiation_Instances() {
        return (EReference)behaviorInstantiationEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBehaviorInstantiation_FlowPoints() {
        return (EReference)behaviorInstantiationEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBehaviorInstantiation_VariableAssignments() {
        return (EReference)behaviorInstantiationEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBehaviorInstantiation_Name() {
        return (EAttribute)behaviorInstantiationEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBehaviorInstantiation_EntityInstantiation() {
        return (EReference)behaviorInstantiationEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRecursiveBehaviorInstantiation() {
        return recursiveBehaviorInstantiationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBehaviorInstantiationHierarchy() {
        return behaviorInstantiationHierarchyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBehaviorInstantiationHierarchy_Root() {
        return (EReference)behaviorInstantiationHierarchyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBehaviorInstantiationStaticReference() {
        return behaviorInstantiationStaticReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBehaviorInstantiationStaticReference_Instantiation() {
        return (EReference)behaviorInstantiationStaticReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFlowPointOfType() {
        return flowPointOfTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFlowPointOfType_Type() {
        return (EReference)flowPointOfTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFlowPointOfType_Name() {
        return (EAttribute)flowPointOfTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFlowPointOfType_FlowPointsOfInstantiation() {
        return (EReference)flowPointOfTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFlowPointOfType_BehaviorType() {
        return (EReference)flowPointOfTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEntryPointOfInstantiation() {
        return entryPointOfInstantiationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExitPointOfInstantiation() {
        return exitPointOfInstantiationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInteractionContributionOfInstantiation() {
        return interactionContributionOfInstantiationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInteractionContributionOfInstantiation_BehaviorInstantiation() {
        return (EReference)interactionContributionOfInstantiationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInteractionContributionOfInstantiation_DelegatedFrom() {
        return (EReference)interactionContributionOfInstantiationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInteractionContributionOfInstantiation_Interaction() {
        return (EReference)interactionContributionOfInstantiationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInteractionContributionOfInstantiation_ContributionOfType() {
        return (EReference)interactionContributionOfInstantiationEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDelegatedInteractionContribution() {
        return delegatedInteractionContributionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDelegatedInteractionContribution_Context() {
        return (EReference)delegatedInteractionContributionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDelegatedInteractionContribution_DelegatedTo() {
        return (EReference)delegatedInteractionContributionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInteractionContributionInstantiation() {
        return interactionContributionInstantiationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInteractionContributionInstantiation_Type() {
        return (EReference)interactionContributionInstantiationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getActionInstantiation() {
        return actionInstantiationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getActionInstantiation_Instances() {
        return (EReference)actionInstantiationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getActionInstantiation_BehaviorType() {
        return (EReference)actionInstantiationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInteractionContributionOfType() {
        return interactionContributionOfTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBehaviorInstantiationVariableReference() {
        return behaviorInstantiationVariableReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBehaviorInstantiationReference() {
        return behaviorInstantiationReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBehaviorInstantiationReference_Child() {
        return (EReference)behaviorInstantiationReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbstractInteractionContributionOfType() {
        return abstractInteractionContributionOfTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAbstractInteractionContributionOfType_BehaviorType() {
        return (EReference)abstractInteractionContributionOfTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAbstractInteractionContributionOfType_ContributionOfInstantiations() {
        return (EReference)abstractInteractionContributionOfTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAbstractInteractionContributionOfType_Role() {
        return (EAttribute)abstractInteractionContributionOfTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFlowPointOfInstantiation() {
        return flowPointOfInstantiationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFlowPointOfInstantiation_FlowPointOfType() {
        return (EReference)flowPointOfInstantiationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFlowPointOfInstantiation_BehaviorInstantiation() {
        return (EReference)flowPointOfInstantiationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFlowPointInstantiation() {
        return flowPointInstantiationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEntryPointOfType() {
        return entryPointOfTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExitPointOfType() {
        return exitPointOfTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getActionInstantiationHierarchy() {
        return actionInstantiationHierarchyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getActionInstantiationHierarchy_BehaviorTarget() {
        return (EReference)actionInstantiationHierarchyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getActionInstantiationHierarchy_Activity() {
        return (EReference)actionInstantiationHierarchyEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInteractionInstantiation() {
        return interactionInstantiationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInteractionInstantiation_Contributions() {
        return (EReference)interactionInstantiationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInteractionInstantiation_BehaviorType() {
        return (EReference)interactionInstantiationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBehaviorDeclaration() {
        return behaviorDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InstantiationFactory getInstantiationFactory() {
        return (InstantiationFactory)getEFactoryInstance();
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
        activityInstantiationEClass = createEClass(ACTIVITY_INSTANTIATION);
        createEAttribute(activityInstantiationEClass, ACTIVITY_INSTANTIATION__NAME);
        createEReference(activityInstantiationEClass, ACTIVITY_INSTANTIATION__TYPE);
        createEReference(activityInstantiationEClass, ACTIVITY_INSTANTIATION__ACTIVITY_POINT_INSTANTIATION);

        behaviorInstantiationEClass = createEClass(BEHAVIOR_INSTANTIATION);
        createEReference(behaviorInstantiationEClass, BEHAVIOR_INSTANTIATION__TYPE);
        createEReference(behaviorInstantiationEClass, BEHAVIOR_INSTANTIATION__CONTRIBUTIONS);
        createEReference(behaviorInstantiationEClass, BEHAVIOR_INSTANTIATION__CONTAINER_TYPE);
        createEReference(behaviorInstantiationEClass, BEHAVIOR_INSTANTIATION__INSTANCES);
        createEReference(behaviorInstantiationEClass, BEHAVIOR_INSTANTIATION__FLOW_POINTS);
        createEReference(behaviorInstantiationEClass, BEHAVIOR_INSTANTIATION__VARIABLE_ASSIGNMENTS);
        createEAttribute(behaviorInstantiationEClass, BEHAVIOR_INSTANTIATION__NAME);
        createEReference(behaviorInstantiationEClass, BEHAVIOR_INSTANTIATION__ENTITY_INSTANTIATION);

        recursiveBehaviorInstantiationEClass = createEClass(RECURSIVE_BEHAVIOR_INSTANTIATION);

        behaviorInstantiationHierarchyEClass = createEClass(BEHAVIOR_INSTANTIATION_HIERARCHY);
        createEReference(behaviorInstantiationHierarchyEClass, BEHAVIOR_INSTANTIATION_HIERARCHY__ROOT);

        behaviorInstantiationStaticReferenceEClass = createEClass(BEHAVIOR_INSTANTIATION_STATIC_REFERENCE);
        createEReference(behaviorInstantiationStaticReferenceEClass, BEHAVIOR_INSTANTIATION_STATIC_REFERENCE__INSTANTIATION);

        flowPointOfTypeEClass = createEClass(FLOW_POINT_OF_TYPE);
        createEReference(flowPointOfTypeEClass, FLOW_POINT_OF_TYPE__TYPE);
        createEAttribute(flowPointOfTypeEClass, FLOW_POINT_OF_TYPE__NAME);
        createEReference(flowPointOfTypeEClass, FLOW_POINT_OF_TYPE__FLOW_POINTS_OF_INSTANTIATION);
        createEReference(flowPointOfTypeEClass, FLOW_POINT_OF_TYPE__BEHAVIOR_TYPE);

        entryPointOfInstantiationEClass = createEClass(ENTRY_POINT_OF_INSTANTIATION);

        exitPointOfInstantiationEClass = createEClass(EXIT_POINT_OF_INSTANTIATION);

        interactionContributionOfInstantiationEClass = createEClass(INTERACTION_CONTRIBUTION_OF_INSTANTIATION);
        createEReference(interactionContributionOfInstantiationEClass, INTERACTION_CONTRIBUTION_OF_INSTANTIATION__BEHAVIOR_INSTANTIATION);
        createEReference(interactionContributionOfInstantiationEClass, INTERACTION_CONTRIBUTION_OF_INSTANTIATION__DELEGATED_FROM);
        createEReference(interactionContributionOfInstantiationEClass, INTERACTION_CONTRIBUTION_OF_INSTANTIATION__INTERACTION);
        createEReference(interactionContributionOfInstantiationEClass, INTERACTION_CONTRIBUTION_OF_INSTANTIATION__CONTRIBUTION_OF_TYPE);

        delegatedInteractionContributionEClass = createEClass(DELEGATED_INTERACTION_CONTRIBUTION);
        createEReference(delegatedInteractionContributionEClass, DELEGATED_INTERACTION_CONTRIBUTION__CONTEXT);
        createEReference(delegatedInteractionContributionEClass, DELEGATED_INTERACTION_CONTRIBUTION__DELEGATED_TO);

        interactionContributionInstantiationEClass = createEClass(INTERACTION_CONTRIBUTION_INSTANTIATION);
        createEReference(interactionContributionInstantiationEClass, INTERACTION_CONTRIBUTION_INSTANTIATION__TYPE);

        actionInstantiationEClass = createEClass(ACTION_INSTANTIATION);
        createEReference(actionInstantiationEClass, ACTION_INSTANTIATION__INSTANCES);
        createEReference(actionInstantiationEClass, ACTION_INSTANTIATION__BEHAVIOR_TYPE);

        interactionContributionOfTypeEClass = createEClass(INTERACTION_CONTRIBUTION_OF_TYPE);

        behaviorInstantiationVariableReferenceEClass = createEClass(BEHAVIOR_INSTANTIATION_VARIABLE_REFERENCE);

        behaviorInstantiationReferenceEClass = createEClass(BEHAVIOR_INSTANTIATION_REFERENCE);
        createEReference(behaviorInstantiationReferenceEClass, BEHAVIOR_INSTANTIATION_REFERENCE__CHILD);

        abstractInteractionContributionOfTypeEClass = createEClass(ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE);
        createEReference(abstractInteractionContributionOfTypeEClass, ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__BEHAVIOR_TYPE);
        createEReference(abstractInteractionContributionOfTypeEClass, ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__CONTRIBUTION_OF_INSTANTIATIONS);
        createEAttribute(abstractInteractionContributionOfTypeEClass, ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__ROLE);

        flowPointOfInstantiationEClass = createEClass(FLOW_POINT_OF_INSTANTIATION);
        createEReference(flowPointOfInstantiationEClass, FLOW_POINT_OF_INSTANTIATION__FLOW_POINT_OF_TYPE);
        createEReference(flowPointOfInstantiationEClass, FLOW_POINT_OF_INSTANTIATION__BEHAVIOR_INSTANTIATION);

        flowPointInstantiationEClass = createEClass(FLOW_POINT_INSTANTIATION);

        entryPointOfTypeEClass = createEClass(ENTRY_POINT_OF_TYPE);

        exitPointOfTypeEClass = createEClass(EXIT_POINT_OF_TYPE);

        actionInstantiationHierarchyEClass = createEClass(ACTION_INSTANTIATION_HIERARCHY);
        createEReference(actionInstantiationHierarchyEClass, ACTION_INSTANTIATION_HIERARCHY__BEHAVIOR_TARGET);
        createEReference(actionInstantiationHierarchyEClass, ACTION_INSTANTIATION_HIERARCHY__ACTIVITY);

        interactionInstantiationEClass = createEClass(INTERACTION_INSTANTIATION);
        createEReference(interactionInstantiationEClass, INTERACTION_INSTANTIATION__CONTRIBUTIONS);
        createEReference(interactionInstantiationEClass, INTERACTION_INSTANTIATION__BEHAVIOR_TYPE);

        behaviorDeclarationEClass = createEClass(BEHAVIOR_DECLARATION);
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
        ModelsPackage theModelsPackage = (ModelsPackage)EPackage.Registry.INSTANCE.getEPackage(ModelsPackage.eNS_URI);
        TypePackage theTypePackage = (TypePackage)EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);
        structure.instantiation.InstantiationPackage theInstantiationPackage_1 = (structure.instantiation.InstantiationPackage)EPackage.Registry.INSTANCE.getEPackage(structure.instantiation.InstantiationPackage.eNS_URI);
        InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);
        models.variable.VariablePackage theVariablePackage_1 = (models.variable.VariablePackage)EPackage.Registry.INSTANCE.getEPackage(models.variable.VariablePackage.eNS_URI);
        CausalityPackage theCausalityPackage = (CausalityPackage)EPackage.Registry.INSTANCE.getEPackage(CausalityPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        activityInstantiationEClass.getESuperTypes().add(theModelsPackage.getElement());
        behaviorInstantiationEClass.getESuperTypes().add(theModelsPackage.getElement());
        recursiveBehaviorInstantiationEClass.getESuperTypes().add(this.getBehaviorInstantiation());
        behaviorInstantiationHierarchyEClass.getESuperTypes().add(theModelsPackage.getInstantiationHierarchy());
        behaviorInstantiationStaticReferenceEClass.getESuperTypes().add(this.getBehaviorInstantiationReference());
        flowPointOfTypeEClass.getESuperTypes().add(this.getFlowPointInstantiation());
        entryPointOfInstantiationEClass.getESuperTypes().add(this.getFlowPointOfInstantiation());
        exitPointOfInstantiationEClass.getESuperTypes().add(this.getFlowPointOfInstantiation());
        interactionContributionOfInstantiationEClass.getESuperTypes().add(this.getInteractionContributionInstantiation());
        delegatedInteractionContributionEClass.getESuperTypes().add(this.getAbstractInteractionContributionOfType());
        interactionContributionInstantiationEClass.getESuperTypes().add(theModelsPackage.getElement());
        actionInstantiationEClass.getESuperTypes().add(this.getActivityInstantiation());
        actionInstantiationEClass.getESuperTypes().add(theModelsPackage.getElement());
        actionInstantiationEClass.getESuperTypes().add(theCausalityPackage.getCausalityParameter());
        interactionContributionOfTypeEClass.getESuperTypes().add(this.getAbstractInteractionContributionOfType());
        interactionContributionOfTypeEClass.getESuperTypes().add(theCausalityPackage.getCausalityParameter());
        behaviorInstantiationVariableReferenceEClass.getESuperTypes().add(this.getBehaviorInstantiationReference());
        behaviorInstantiationReferenceEClass.getESuperTypes().add(theModelsPackage.getInstantiationReference());
        abstractInteractionContributionOfTypeEClass.getESuperTypes().add(this.getInteractionContributionInstantiation());
        flowPointOfInstantiationEClass.getESuperTypes().add(this.getFlowPointInstantiation());
        flowPointInstantiationEClass.getESuperTypes().add(theModelsPackage.getElement());
        flowPointInstantiationEClass.getESuperTypes().add(theCausalityPackage.getCausalityParameter());
        entryPointOfTypeEClass.getESuperTypes().add(this.getFlowPointOfType());
        exitPointOfTypeEClass.getESuperTypes().add(this.getFlowPointOfType());
        actionInstantiationHierarchyEClass.getESuperTypes().add(theModelsPackage.getInstantiationHierarchy());
        interactionInstantiationEClass.getESuperTypes().add(this.getActivityInstantiation());
        behaviorDeclarationEClass.getESuperTypes().add(this.getBehaviorInstantiation());

        // Initialize classes, features, and operations; add parameters
        initEClass(activityInstantiationEClass, ActivityInstantiation.class, "ActivityInstantiation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getActivityInstantiation_Name(), ecorePackage.getEString(), "name", null, 0, 1, ActivityInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getActivityInstantiation_Type(), theTypePackage.getActivityType(), theTypePackage.getActivityType_Instantiations(), "type", null, 1, 1, ActivityInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getActivityInstantiation_ActivityPointInstantiation(), theInstantiationPackage_1.getActivityPointInstantiation(), null, "activityPointInstantiation", null, 0, 1, ActivityInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(behaviorInstantiationEClass, BehaviorInstantiation.class, "BehaviorInstantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBehaviorInstantiation_Type(), theTypePackage.getAbstractBehaviorType(), theTypePackage.getAbstractBehaviorType_Instantiations(), "type", null, 1, 1, BehaviorInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBehaviorInstantiation_Contributions(), this.getInteractionContributionOfInstantiation(), this.getInteractionContributionOfInstantiation_BehaviorInstantiation(), "contributions", null, 0, -1, BehaviorInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBehaviorInstantiation_ContainerType(), theTypePackage.getStructuredBehaviorType(), theTypePackage.getStructuredBehaviorType_ContainedInstantiations(), "containerType", null, 0, 1, BehaviorInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBehaviorInstantiation_Instances(), theInstancePackage.getBehavior(), theInstancePackage.getBehavior_Instantiation(), "instances", null, 0, -1, BehaviorInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBehaviorInstantiation_FlowPoints(), this.getFlowPointOfInstantiation(), this.getFlowPointOfInstantiation_BehaviorInstantiation(), "flowPoints", null, 0, -1, BehaviorInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBehaviorInstantiation_VariableAssignments(), theVariablePackage_1.getVariableAssignment(), null, "variableAssignments", null, 0, -1, BehaviorInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBehaviorInstantiation_Name(), ecorePackage.getEString(), "name", null, 0, 1, BehaviorInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBehaviorInstantiation_EntityInstantiation(), theInstantiationPackage_1.getEntityInstantiation(), null, "entityInstantiation", null, 0, 1, BehaviorInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(recursiveBehaviorInstantiationEClass, RecursiveBehaviorInstantiation.class, "RecursiveBehaviorInstantiation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(behaviorInstantiationHierarchyEClass, BehaviorInstantiationHierarchy.class, "BehaviorInstantiationHierarchy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBehaviorInstantiationHierarchy_Root(), this.getBehaviorInstantiationReference(), null, "root", null, 1, 1, BehaviorInstantiationHierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(behaviorInstantiationStaticReferenceEClass, BehaviorInstantiationStaticReference.class, "BehaviorInstantiationStaticReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBehaviorInstantiationStaticReference_Instantiation(), this.getBehaviorInstantiation(), null, "instantiation", null, 1, 1, BehaviorInstantiationStaticReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(flowPointOfTypeEClass, FlowPointOfType.class, "FlowPointOfType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getFlowPointOfType_Type(), theTypePackage.getFlowPointType(), theTypePackage.getFlowPointType_Instantiations(), "type", null, 1, 1, FlowPointOfType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFlowPointOfType_Name(), ecorePackage.getEString(), "name", null, 0, 1, FlowPointOfType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFlowPointOfType_FlowPointsOfInstantiation(), this.getFlowPointOfInstantiation(), this.getFlowPointOfInstantiation_FlowPointOfType(), "flowPointsOfInstantiation", null, 0, -1, FlowPointOfType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFlowPointOfType_BehaviorType(), theTypePackage.getAbstractBehaviorType(), theTypePackage.getAbstractBehaviorType_FlowPoints(), "behaviorType", null, 1, 1, FlowPointOfType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(entryPointOfInstantiationEClass, EntryPointOfInstantiation.class, "EntryPointOfInstantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(exitPointOfInstantiationEClass, ExitPointOfInstantiation.class, "ExitPointOfInstantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(interactionContributionOfInstantiationEClass, InteractionContributionOfInstantiation.class, "InteractionContributionOfInstantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInteractionContributionOfInstantiation_BehaviorInstantiation(), this.getBehaviorInstantiation(), this.getBehaviorInstantiation_Contributions(), "behaviorInstantiation", null, 1, 1, InteractionContributionOfInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInteractionContributionOfInstantiation_DelegatedFrom(), this.getDelegatedInteractionContribution(), this.getDelegatedInteractionContribution_DelegatedTo(), "delegatedFrom", null, 0, 1, InteractionContributionOfInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInteractionContributionOfInstantiation_Interaction(), this.getInteractionInstantiation(), this.getInteractionInstantiation_Contributions(), "interaction", null, 0, 1, InteractionContributionOfInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInteractionContributionOfInstantiation_ContributionOfType(), this.getAbstractInteractionContributionOfType(), this.getAbstractInteractionContributionOfType_ContributionOfInstantiations(), "contributionOfType", null, 0, 1, InteractionContributionOfInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(delegatedInteractionContributionEClass, DelegatedInteractionContribution.class, "DelegatedInteractionContribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDelegatedInteractionContribution_Context(), theTypePackage.getStructuredBehaviorType(), null, "context", null, 0, 1, DelegatedInteractionContribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDelegatedInteractionContribution_DelegatedTo(), this.getInteractionContributionOfInstantiation(), this.getInteractionContributionOfInstantiation_DelegatedFrom(), "delegatedTo", null, 0, -1, DelegatedInteractionContribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(interactionContributionInstantiationEClass, InteractionContributionInstantiation.class, "InteractionContributionInstantiation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInteractionContributionInstantiation_Type(), theTypePackage.getInteractionContributionType(), theTypePackage.getInteractionContributionType_Instantiations(), "type", null, 1, 1, InteractionContributionInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(actionInstantiationEClass, ActionInstantiation.class, "ActionInstantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getActionInstantiation_Instances(), theInstancePackage.getAction(), theInstancePackage.getAction_Instantiation(), "instances", null, 0, -1, ActionInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getActionInstantiation_BehaviorType(), theTypePackage.getMonolithicBehaviorType(), null, "behaviorType", null, 1, 1, ActionInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(interactionContributionOfTypeEClass, InteractionContributionOfType.class, "InteractionContributionOfType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(behaviorInstantiationVariableReferenceEClass, BehaviorInstantiationVariableReference.class, "BehaviorInstantiationVariableReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(behaviorInstantiationReferenceEClass, BehaviorInstantiationReference.class, "BehaviorInstantiationReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBehaviorInstantiationReference_Child(), this.getBehaviorInstantiationReference(), null, "child", null, 0, 1, BehaviorInstantiationReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(abstractInteractionContributionOfTypeEClass, AbstractInteractionContributionOfType.class, "AbstractInteractionContributionOfType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAbstractInteractionContributionOfType_BehaviorType(), theTypePackage.getAbstractBehaviorType(), theTypePackage.getAbstractBehaviorType_Contributions(), "behaviorType", null, 1, 1, AbstractInteractionContributionOfType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAbstractInteractionContributionOfType_ContributionOfInstantiations(), this.getInteractionContributionOfInstantiation(), this.getInteractionContributionOfInstantiation_ContributionOfType(), "contributionOfInstantiations", null, 0, -1, AbstractInteractionContributionOfType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAbstractInteractionContributionOfType_Role(), ecorePackage.getEString(), "role", null, 0, 1, AbstractInteractionContributionOfType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(flowPointOfInstantiationEClass, FlowPointOfInstantiation.class, "FlowPointOfInstantiation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getFlowPointOfInstantiation_FlowPointOfType(), this.getFlowPointOfType(), this.getFlowPointOfType_FlowPointsOfInstantiation(), "flowPointOfType", null, 1, 1, FlowPointOfInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFlowPointOfInstantiation_BehaviorInstantiation(), this.getBehaviorInstantiation(), this.getBehaviorInstantiation_FlowPoints(), "behaviorInstantiation", null, 1, 1, FlowPointOfInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(flowPointInstantiationEClass, FlowPointInstantiation.class, "FlowPointInstantiation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(entryPointOfTypeEClass, EntryPointOfType.class, "EntryPointOfType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(exitPointOfTypeEClass, ExitPointOfType.class, "ExitPointOfType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(actionInstantiationHierarchyEClass, ActionInstantiationHierarchy.class, "ActionInstantiationHierarchy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getActionInstantiationHierarchy_BehaviorTarget(), this.getBehaviorInstantiationHierarchy(), null, "behaviorTarget", null, 1, 1, ActionInstantiationHierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getActionInstantiationHierarchy_Activity(), this.getActivityInstantiation(), null, "activity", null, 1, 1, ActionInstantiationHierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(interactionInstantiationEClass, InteractionInstantiation.class, "InteractionInstantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInteractionInstantiation_Contributions(), this.getInteractionContributionOfInstantiation(), this.getInteractionContributionOfInstantiation_Interaction(), "contributions", null, 2, -1, InteractionInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInteractionInstantiation_BehaviorType(), theTypePackage.getStructuredBehaviorType(), theTypePackage.getStructuredBehaviorType_Interactions(), "behaviorType", null, 1, 1, InteractionInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(behaviorDeclarationEClass, BehaviorDeclaration.class, "BehaviorDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    }

} //InstantiationPackageImpl
