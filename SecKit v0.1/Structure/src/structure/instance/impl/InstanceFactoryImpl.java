/**
 */
package structure.instance.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import structure.instance.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstanceFactoryImpl extends EFactoryImpl implements InstanceFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static InstanceFactory init() {
        try {
            InstanceFactory theInstanceFactory = (InstanceFactory)EPackage.Registry.INSTANCE.getEFactory(InstancePackage.eNS_URI);
            if (theInstanceFactory != null) {
                return theInstanceFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new InstanceFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InstanceFactoryImpl() {
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
            case InstancePackage.ENTITY: return createEntity();
            case InstancePackage.LOCATION: return createLocation();
            case InstancePackage.INTERACTION_POINT_PARTICIPATION: return createInteractionPointParticipation();
            case InstancePackage.ACTION_POINT: return createActionPoint();
            case InstancePackage.INTERACTION_POINT: return createInteractionPoint();
            case InstancePackage.ENTITY_INSTANCE_HIEARCHY: return createEntityInstanceHiearchy();
            case InstancePackage.ENTITY_INSTANCE_REFERENCE: return createEntityInstanceReference();
            case InstancePackage.ENTITY_INSTANCE_VARIABLE_REFERENCE: return createEntityInstanceVariableReference();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Entity createEntity() {
        EntityImpl entity = new EntityImpl();
        return entity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Location createLocation() {
        LocationImpl location = new LocationImpl();
        return location;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionPointParticipation createInteractionPointParticipation() {
        InteractionPointParticipationImpl interactionPointParticipation = new InteractionPointParticipationImpl();
        return interactionPointParticipation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActionPoint createActionPoint() {
        ActionPointImpl actionPoint = new ActionPointImpl();
        return actionPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionPoint createInteractionPoint() {
        InteractionPointImpl interactionPoint = new InteractionPointImpl();
        return interactionPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityInstanceHiearchy createEntityInstanceHiearchy() {
        EntityInstanceHiearchyImpl entityInstanceHiearchy = new EntityInstanceHiearchyImpl();
        return entityInstanceHiearchy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityInstanceReference createEntityInstanceReference() {
        EntityInstanceReferenceImpl entityInstanceReference = new EntityInstanceReferenceImpl();
        return entityInstanceReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityInstanceVariableReference createEntityInstanceVariableReference() {
        EntityInstanceVariableReferenceImpl entityInstanceVariableReference = new EntityInstanceVariableReferenceImpl();
        return entityInstanceVariableReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InstancePackage getInstancePackage() {
        return (InstancePackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static InstancePackage getPackage() {
        return InstancePackage.eINSTANCE;
    }

} //InstanceFactoryImpl
