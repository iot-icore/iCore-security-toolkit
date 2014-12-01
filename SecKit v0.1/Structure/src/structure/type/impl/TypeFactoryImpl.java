/**
 */
package structure.type.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import structure.type.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeFactoryImpl extends EFactoryImpl implements TypeFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TypeFactory init() {
        try {
            TypeFactory theTypeFactory = (TypeFactory)EPackage.Registry.INSTANCE.getEFactory(TypePackage.eNS_URI);
            if (theTypeFactory != null) {
                return theTypeFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new TypeFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeFactoryImpl() {
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
            case TypePackage.LOCATION_TYPE: return createLocationType();
            case TypePackage.INTERACTION_POINT_PARTICIPATION_TYPE: return createInteractionPointParticipationType();
            case TypePackage.ACTION_POINT_TYPE: return createActionPointType();
            case TypePackage.INTERACTION_POINT_TYPE: return createInteractionPointType();
            case TypePackage.ENTITY_TYPE_PACKAGE: return createEntityTypePackage();
            case TypePackage.ENTITY_TYPE: return createEntityType();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LocationType createLocationType() {
        LocationTypeImpl locationType = new LocationTypeImpl();
        return locationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionPointParticipationType createInteractionPointParticipationType() {
        InteractionPointParticipationTypeImpl interactionPointParticipationType = new InteractionPointParticipationTypeImpl();
        return interactionPointParticipationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActionPointType createActionPointType() {
        ActionPointTypeImpl actionPointType = new ActionPointTypeImpl();
        return actionPointType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionPointType createInteractionPointType() {
        InteractionPointTypeImpl interactionPointType = new InteractionPointTypeImpl();
        return interactionPointType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityTypePackage createEntityTypePackage() {
        EntityTypePackageImpl entityTypePackage = new EntityTypePackageImpl();
        return entityTypePackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityType createEntityType() {
        EntityTypeImpl entityType = new EntityTypeImpl();
        return entityType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypePackage getTypePackage() {
        return (TypePackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static TypePackage getPackage() {
        return TypePackage.eINSTANCE;
    }

} //TypeFactoryImpl
