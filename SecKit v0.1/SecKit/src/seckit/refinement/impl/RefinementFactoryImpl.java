/**
 */
package seckit.refinement.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import seckit.refinement.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RefinementFactoryImpl extends EFactoryImpl implements RefinementFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static RefinementFactory init() {
        try {
            RefinementFactory theRefinementFactory = (RefinementFactory)EPackage.Registry.INSTANCE.getEFactory(RefinementPackage.eNS_URI);
            if (theRefinementFactory != null) {
                return theRefinementFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new RefinementFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RefinementFactoryImpl() {
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
            case RefinementPackage.ACTION_REFINED_INTO_ACTIONS: return createActionRefinedIntoActions();
            case RefinementPackage.INTERFACE_DECOMPOSITION: return createInterfaceDecomposition();
            case RefinementPackage.ACTION_INSERTION: return createActionInsertion();
            case RefinementPackage.ACTION_REFINED_INTO_INTERACTION: return createActionRefinedIntoInteraction();
            case RefinementPackage.ACTIVITY_REFINEMENT: return createActivityRefinement();
            case RefinementPackage.REFINEMENT_RELATION_INSTANTIATION: return createRefinementRelationInstantiation();
            case RefinementPackage.REFINEMENT_RELATION_HIERARCHY: return createRefinementRelationHierarchy();
            case RefinementPackage.BEHAVIOR_REFINEMENT_TYPE: return createBehaviorRefinementType();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActionRefinedIntoActions createActionRefinedIntoActions() {
        ActionRefinedIntoActionsImpl actionRefinedIntoActions = new ActionRefinedIntoActionsImpl();
        return actionRefinedIntoActions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InterfaceDecomposition createInterfaceDecomposition() {
        InterfaceDecompositionImpl interfaceDecomposition = new InterfaceDecompositionImpl();
        return interfaceDecomposition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActionInsertion createActionInsertion() {
        ActionInsertionImpl actionInsertion = new ActionInsertionImpl();
        return actionInsertion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActionRefinedIntoInteraction createActionRefinedIntoInteraction() {
        ActionRefinedIntoInteractionImpl actionRefinedIntoInteraction = new ActionRefinedIntoInteractionImpl();
        return actionRefinedIntoInteraction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityRefinement createActivityRefinement() {
        ActivityRefinementImpl activityRefinement = new ActivityRefinementImpl();
        return activityRefinement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RefinementRelationInstantiation createRefinementRelationInstantiation() {
        RefinementRelationInstantiationImpl refinementRelationInstantiation = new RefinementRelationInstantiationImpl();
        return refinementRelationInstantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RefinementRelationHierarchy createRefinementRelationHierarchy() {
        RefinementRelationHierarchyImpl refinementRelationHierarchy = new RefinementRelationHierarchyImpl();
        return refinementRelationHierarchy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorRefinementType createBehaviorRefinementType() {
        BehaviorRefinementTypeImpl behaviorRefinementType = new BehaviorRefinementTypeImpl();
        return behaviorRefinementType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RefinementPackage getRefinementPackage() {
        return (RefinementPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static RefinementPackage getPackage() {
        return RefinementPackage.eINSTANCE;
    }

} //RefinementFactoryImpl
