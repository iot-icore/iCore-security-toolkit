/**
 */
package structure.type.util;

import models.Element;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import structure.type.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see structure.type.TypePackage
 * @generated
 */
public class TypeAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static TypePackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = TypePackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TypeSwitch<Adapter> modelSwitch =
        new TypeSwitch<Adapter>() {
            @Override
            public Adapter caseLocationType(LocationType object) {
                return createLocationTypeAdapter();
            }
            @Override
            public Adapter caseInteractionPointParticipationType(InteractionPointParticipationType object) {
                return createInteractionPointParticipationTypeAdapter();
            }
            @Override
            public Adapter caseActionPointType(ActionPointType object) {
                return createActionPointTypeAdapter();
            }
            @Override
            public Adapter caseInteractionPointType(InteractionPointType object) {
                return createInteractionPointTypeAdapter();
            }
            @Override
            public Adapter caseEntityTypePackage(EntityTypePackage object) {
                return createEntityTypePackageAdapter();
            }
            @Override
            public Adapter caseEntityType(EntityType object) {
                return createEntityTypeAdapter();
            }
            @Override
            public Adapter caseActivityPointType(ActivityPointType object) {
                return createActivityPointTypeAdapter();
            }
            @Override
            public Adapter caseLocalizableType(LocalizableType object) {
                return createLocalizableTypeAdapter();
            }
            @Override
            public Adapter caseElement(Element object) {
                return createElementAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link structure.type.LocationType <em>Location Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.type.LocationType
     * @generated
     */
    public Adapter createLocationTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.type.InteractionPointParticipationType <em>Interaction Point Participation Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.type.InteractionPointParticipationType
     * @generated
     */
    public Adapter createInteractionPointParticipationTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.type.ActionPointType <em>Action Point Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.type.ActionPointType
     * @generated
     */
    public Adapter createActionPointTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.type.InteractionPointType <em>Interaction Point Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.type.InteractionPointType
     * @generated
     */
    public Adapter createInteractionPointTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.type.EntityTypePackage <em>Entity Type Package</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.type.EntityTypePackage
     * @generated
     */
    public Adapter createEntityTypePackageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.type.EntityType <em>Entity Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.type.EntityType
     * @generated
     */
    public Adapter createEntityTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.type.ActivityPointType <em>Activity Point Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.type.ActivityPointType
     * @generated
     */
    public Adapter createActivityPointTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.type.LocalizableType <em>Localizable Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.type.LocalizableType
     * @generated
     */
    public Adapter createLocalizableTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link models.Element <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.Element
     * @generated
     */
    public Adapter createElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //TypeAdapterFactory
