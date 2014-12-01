/**
 */
package structure.instantiation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import structure.instantiation.*;

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
            case InstantiationPackage.ENTITY_INSTANTIATION: return createEntityInstantiation();
            case InstantiationPackage.ACTION_POINT_INSTANTIATION: return createActionPointInstantiation();
            case InstantiationPackage.INTERACTION_POINT_INSTANTIATION: return createInteractionPointInstantiation();
            case InstantiationPackage.ENTITY_INSTANTIATION_HIERARCHY: return createEntityInstantiationHierarchy();
            case InstantiationPackage.ENTITY_INSTANTIATION_REFERENCE: return createEntityInstantiationReference();
            case InstantiationPackage.LOCATION_INSTANTIATION: return createLocationInstantiation();
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION: return createInteractionPointParticipationOfInstantiation();
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_TYPE: return createInteractionPointParticipationOfType();
            case InstantiationPackage.DELEGATED_INTERACTION_POINT_PARTICIPATION: return createDelegatedInteractionPointParticipation();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityInstantiation createEntityInstantiation() {
        EntityInstantiationImpl entityInstantiation = new EntityInstantiationImpl();
        return entityInstantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActionPointInstantiation createActionPointInstantiation() {
        ActionPointInstantiationImpl actionPointInstantiation = new ActionPointInstantiationImpl();
        return actionPointInstantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionPointInstantiation createInteractionPointInstantiation() {
        InteractionPointInstantiationImpl interactionPointInstantiation = new InteractionPointInstantiationImpl();
        return interactionPointInstantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityInstantiationHierarchy createEntityInstantiationHierarchy() {
        EntityInstantiationHierarchyImpl entityInstantiationHierarchy = new EntityInstantiationHierarchyImpl();
        return entityInstantiationHierarchy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityInstantiationReference createEntityInstantiationReference() {
        EntityInstantiationReferenceImpl entityInstantiationReference = new EntityInstantiationReferenceImpl();
        return entityInstantiationReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LocationInstantiation createLocationInstantiation() {
        LocationInstantiationImpl locationInstantiation = new LocationInstantiationImpl();
        return locationInstantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionPointParticipationOfInstantiation createInteractionPointParticipationOfInstantiation() {
        InteractionPointParticipationOfInstantiationImpl interactionPointParticipationOfInstantiation = new InteractionPointParticipationOfInstantiationImpl();
        return interactionPointParticipationOfInstantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionPointParticipationOfType createInteractionPointParticipationOfType() {
        InteractionPointParticipationOfTypeImpl interactionPointParticipationOfType = new InteractionPointParticipationOfTypeImpl();
        return interactionPointParticipationOfType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DelegatedInteractionPointParticipation createDelegatedInteractionPointParticipation() {
        DelegatedInteractionPointParticipationImpl delegatedInteractionPointParticipation = new DelegatedInteractionPointParticipationImpl();
        return delegatedInteractionPointParticipation;
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
