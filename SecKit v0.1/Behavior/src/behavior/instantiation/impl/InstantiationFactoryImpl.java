/**
 */
package behavior.instantiation.impl;

import behavior.instantiation.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstantiationFactoryImpl extends EFactoryImpl implements InstantiationFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static InstantiationFactory init() {
        try {
            InstantiationFactory theInstantiationFactory = (InstantiationFactory)EPackage.Registry.INSTANCE.getEFactory(InstantiationPackage.eNS_URI);
            if (theInstantiationFactory != null) {
                return theInstantiationFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new InstantiationFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InstantiationFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case InstantiationPackage.BEHAVIOR_INSTANTIATION: return createBehaviorInstantiation();
            case InstantiationPackage.BEHAVIOR_INSTANTIATION_HIERARCHY: return createBehaviorInstantiationHierarchy();
            case InstantiationPackage.BEHAVIOR_INSTANTIATION_STATIC_REFERENCE: return createBehaviorInstantiationStaticReference();
            case InstantiationPackage.ENTRY_POINT_OF_INSTANTIATION: return createEntryPointOfInstantiation();
            case InstantiationPackage.EXIT_POINT_OF_INSTANTIATION: return createExitPointOfInstantiation();
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION: return createInteractionContributionOfInstantiation();
            case InstantiationPackage.DELEGATED_INTERACTION_CONTRIBUTION: return createDelegatedInteractionContribution();
            case InstantiationPackage.ACTION_INSTANTIATION: return createActionInstantiation();
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_TYPE: return createInteractionContributionOfType();
            case InstantiationPackage.BEHAVIOR_INSTANTIATION_VARIABLE_REFERENCE: return createBehaviorInstantiationVariableReference();
            case InstantiationPackage.ENTRY_POINT_OF_TYPE: return createEntryPointOfType();
            case InstantiationPackage.EXIT_POINT_OF_TYPE: return createExitPointOfType();
            case InstantiationPackage.ACTION_INSTANTIATION_HIERARCHY: return createActionInstantiationHierarchy();
            case InstantiationPackage.INTERACTION_INSTANTIATION: return createInteractionInstantiation();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorInstantiation createBehaviorInstantiation() {
        BehaviorInstantiationImpl behaviorInstantiation = new BehaviorInstantiationImpl();
        return behaviorInstantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorInstantiationHierarchy createBehaviorInstantiationHierarchy() {
        BehaviorInstantiationHierarchyImpl behaviorInstantiationHierarchy = new BehaviorInstantiationHierarchyImpl();
        return behaviorInstantiationHierarchy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorInstantiationStaticReference createBehaviorInstantiationStaticReference() {
        BehaviorInstantiationStaticReferenceImpl behaviorInstantiationStaticReference = new BehaviorInstantiationStaticReferenceImpl();
        return behaviorInstantiationStaticReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntryPointOfInstantiation createEntryPointOfInstantiation() {
        EntryPointOfInstantiationImpl entryPointOfInstantiation = new EntryPointOfInstantiationImpl();
        return entryPointOfInstantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExitPointOfInstantiation createExitPointOfInstantiation() {
        ExitPointOfInstantiationImpl exitPointOfInstantiation = new ExitPointOfInstantiationImpl();
        return exitPointOfInstantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionContributionOfInstantiation createInteractionContributionOfInstantiation() {
        InteractionContributionOfInstantiationImpl interactionContributionOfInstantiation = new InteractionContributionOfInstantiationImpl();
        return interactionContributionOfInstantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DelegatedInteractionContribution createDelegatedInteractionContribution() {
        DelegatedInteractionContributionImpl delegatedInteractionContribution = new DelegatedInteractionContributionImpl();
        return delegatedInteractionContribution;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActionInstantiation createActionInstantiation() {
        ActionInstantiationImpl actionInstantiation = new ActionInstantiationImpl();
        return actionInstantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionContributionOfType createInteractionContributionOfType() {
        InteractionContributionOfTypeImpl interactionContributionOfType = new InteractionContributionOfTypeImpl();
        return interactionContributionOfType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorInstantiationVariableReference createBehaviorInstantiationVariableReference() {
        BehaviorInstantiationVariableReferenceImpl behaviorInstantiationVariableReference = new BehaviorInstantiationVariableReferenceImpl();
        return behaviorInstantiationVariableReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntryPointOfType createEntryPointOfType() {
        EntryPointOfTypeImpl entryPointOfType = new EntryPointOfTypeImpl();
        return entryPointOfType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExitPointOfType createExitPointOfType() {
        ExitPointOfTypeImpl exitPointOfType = new ExitPointOfTypeImpl();
        return exitPointOfType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActionInstantiationHierarchy createActionInstantiationHierarchy() {
        ActionInstantiationHierarchyImpl actionInstantiationHierarchy = new ActionInstantiationHierarchyImpl();
        return actionInstantiationHierarchy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionInstantiation createInteractionInstantiation() {
        InteractionInstantiationImpl interactionInstantiation = new InteractionInstantiationImpl();
        return interactionInstantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InstantiationPackage getInstantiationPackage() {
        return (InstantiationPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static InstantiationPackage getPackage() {
        return InstantiationPackage.eINSTANCE;
    }

} //InstantiationFactoryImpl
