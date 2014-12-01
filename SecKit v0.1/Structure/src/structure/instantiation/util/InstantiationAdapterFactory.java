/**
 */
package structure.instantiation.util;

import models.Element;
import models.Hiearchy;
import models.InstantiationHierarchy;
import models.InstantiationReference;
import models.Reference;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import structure.instantiation.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see structure.instantiation.InstantiationPackage
 * @generated
 */
public class InstantiationAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static InstantiationPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InstantiationAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = InstantiationPackage.eINSTANCE;
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
    protected InstantiationSwitch<Adapter> modelSwitch =
        new InstantiationSwitch<Adapter>() {
            @Override
            public Adapter caseEntityInstantiation(EntityInstantiation object) {
                return createEntityInstantiationAdapter();
            }
            @Override
            public Adapter caseActionPointInstantiation(ActionPointInstantiation object) {
                return createActionPointInstantiationAdapter();
            }
            @Override
            public Adapter caseInteractionPointInstantiation(InteractionPointInstantiation object) {
                return createInteractionPointInstantiationAdapter();
            }
            @Override
            public Adapter caseActivityPointInstantiation(ActivityPointInstantiation object) {
                return createActivityPointInstantiationAdapter();
            }
            @Override
            public Adapter caseInteractionPointParticipationInstantiation(InteractionPointParticipationInstantiation object) {
                return createInteractionPointParticipationInstantiationAdapter();
            }
            @Override
            public Adapter caseEntityInstantiationHierarchy(EntityInstantiationHierarchy object) {
                return createEntityInstantiationHierarchyAdapter();
            }
            @Override
            public Adapter caseEntityInstantiationReference(EntityInstantiationReference object) {
                return createEntityInstantiationReferenceAdapter();
            }
            @Override
            public Adapter caseLocationInstantiation(LocationInstantiation object) {
                return createLocationInstantiationAdapter();
            }
            @Override
            public Adapter caseInteractionPointParticipationOfInstantiation(InteractionPointParticipationOfInstantiation object) {
                return createInteractionPointParticipationOfInstantiationAdapter();
            }
            @Override
            public Adapter caseInteractionPointParticipationOfType(InteractionPointParticipationOfType object) {
                return createInteractionPointParticipationOfTypeAdapter();
            }
            @Override
            public Adapter caseDelegatedInteractionPointParticipation(DelegatedInteractionPointParticipation object) {
                return createDelegatedInteractionPointParticipationAdapter();
            }
            @Override
            public Adapter caseAbstractInteractionPointParticipationOfType(AbstractInteractionPointParticipationOfType object) {
                return createAbstractInteractionPointParticipationOfTypeAdapter();
            }
            @Override
            public Adapter caseLocalizableInstantiation(LocalizableInstantiation object) {
                return createLocalizableInstantiationAdapter();
            }
            @Override
            public Adapter caseElement(Element object) {
                return createElementAdapter();
            }
            @Override
            public Adapter caseHiearchy(Hiearchy object) {
                return createHiearchyAdapter();
            }
            @Override
            public Adapter caseInstantiationHierarchy(InstantiationHierarchy object) {
                return createInstantiationHierarchyAdapter();
            }
            @Override
            public Adapter caseReference(Reference object) {
                return createReferenceAdapter();
            }
            @Override
            public Adapter caseInstantiationReference(InstantiationReference object) {
                return createInstantiationReferenceAdapter();
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
     * Creates a new adapter for an object of class '{@link structure.instantiation.EntityInstantiation <em>Entity Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.instantiation.EntityInstantiation
     * @generated
     */
    public Adapter createEntityInstantiationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.instantiation.ActionPointInstantiation <em>Action Point Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.instantiation.ActionPointInstantiation
     * @generated
     */
    public Adapter createActionPointInstantiationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.instantiation.InteractionPointInstantiation <em>Interaction Point Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.instantiation.InteractionPointInstantiation
     * @generated
     */
    public Adapter createInteractionPointInstantiationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.instantiation.ActivityPointInstantiation <em>Activity Point Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.instantiation.ActivityPointInstantiation
     * @generated
     */
    public Adapter createActivityPointInstantiationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.instantiation.InteractionPointParticipationInstantiation <em>Interaction Point Participation Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.instantiation.InteractionPointParticipationInstantiation
     * @generated
     */
    public Adapter createInteractionPointParticipationInstantiationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.instantiation.EntityInstantiationHierarchy <em>Entity Instantiation Hierarchy</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.instantiation.EntityInstantiationHierarchy
     * @generated
     */
    public Adapter createEntityInstantiationHierarchyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.instantiation.EntityInstantiationReference <em>Entity Instantiation Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.instantiation.EntityInstantiationReference
     * @generated
     */
    public Adapter createEntityInstantiationReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.instantiation.LocationInstantiation <em>Location Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.instantiation.LocationInstantiation
     * @generated
     */
    public Adapter createLocationInstantiationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.instantiation.InteractionPointParticipationOfInstantiation <em>Interaction Point Participation Of Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.instantiation.InteractionPointParticipationOfInstantiation
     * @generated
     */
    public Adapter createInteractionPointParticipationOfInstantiationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.instantiation.InteractionPointParticipationOfType <em>Interaction Point Participation Of Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.instantiation.InteractionPointParticipationOfType
     * @generated
     */
    public Adapter createInteractionPointParticipationOfTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.instantiation.DelegatedInteractionPointParticipation <em>Delegated Interaction Point Participation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.instantiation.DelegatedInteractionPointParticipation
     * @generated
     */
    public Adapter createDelegatedInteractionPointParticipationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.instantiation.AbstractInteractionPointParticipationOfType <em>Abstract Interaction Point Participation Of Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.instantiation.AbstractInteractionPointParticipationOfType
     * @generated
     */
    public Adapter createAbstractInteractionPointParticipationOfTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.instantiation.LocalizableInstantiation <em>Localizable Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.instantiation.LocalizableInstantiation
     * @generated
     */
    public Adapter createLocalizableInstantiationAdapter() {
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
     * Creates a new adapter for an object of class '{@link models.Hiearchy <em>Hiearchy</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.Hiearchy
     * @generated
     */
    public Adapter createHiearchyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link models.InstantiationHierarchy <em>Instantiation Hierarchy</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.InstantiationHierarchy
     * @generated
     */
    public Adapter createInstantiationHierarchyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link models.Reference <em>Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.Reference
     * @generated
     */
    public Adapter createReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link models.InstantiationReference <em>Instantiation Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.InstantiationReference
     * @generated
     */
    public Adapter createInstantiationReferenceAdapter() {
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

} //InstantiationAdapterFactory
