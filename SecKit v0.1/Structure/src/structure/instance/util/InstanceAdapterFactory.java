/**
 */
package structure.instance.util;

import identity.instance.IdentityOwner;
import models.Element;
import models.Hiearchy;
import models.InstanceHiearchy;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import structure.instance.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see structure.instance.InstancePackage
 * @generated
 */
public class InstanceAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static InstancePackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InstanceAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = InstancePackage.eINSTANCE;
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
    protected InstanceSwitch<Adapter> modelSwitch =
        new InstanceSwitch<Adapter>() {
            @Override
            public Adapter caseEntity(Entity object) {
                return createEntityAdapter();
            }
            @Override
            public Adapter caseLocation(Location object) {
                return createLocationAdapter();
            }
            @Override
            public Adapter caseInteractionPointParticipation(InteractionPointParticipation object) {
                return createInteractionPointParticipationAdapter();
            }
            @Override
            public Adapter caseActivityPoint(ActivityPoint object) {
                return createActivityPointAdapter();
            }
            @Override
            public Adapter caseActionPoint(ActionPoint object) {
                return createActionPointAdapter();
            }
            @Override
            public Adapter caseInteractionPoint(InteractionPoint object) {
                return createInteractionPointAdapter();
            }
            @Override
            public Adapter caseEntityInstanceHiearchy(EntityInstanceHiearchy object) {
                return createEntityInstanceHiearchyAdapter();
            }
            @Override
            public Adapter caseEntityInstanceReference(EntityInstanceReference object) {
                return createEntityInstanceReferenceAdapter();
            }
            @Override
            public Adapter caseEntityInstanceStaticReference(EntityInstanceStaticReference object) {
                return createEntityInstanceStaticReferenceAdapter();
            }
            @Override
            public Adapter caseEntityInstanceVariableReference(EntityInstanceVariableReference object) {
                return createEntityInstanceVariableReferenceAdapter();
            }
            @Override
            public Adapter caseLocalizableInstance(LocalizableInstance object) {
                return createLocalizableInstanceAdapter();
            }
            @Override
            public Adapter caseElement(Element object) {
                return createElementAdapter();
            }
            @Override
            public Adapter caseIdentityOwner(IdentityOwner object) {
                return createIdentityOwnerAdapter();
            }
            @Override
            public Adapter caseHiearchy(Hiearchy object) {
                return createHiearchyAdapter();
            }
            @Override
            public Adapter caseInstanceHiearchy(InstanceHiearchy object) {
                return createInstanceHiearchyAdapter();
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
     * Creates a new adapter for an object of class '{@link structure.instance.Entity <em>Entity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.instance.Entity
     * @generated
     */
    public Adapter createEntityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.instance.Location <em>Location</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.instance.Location
     * @generated
     */
    public Adapter createLocationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.instance.InteractionPointParticipation <em>Interaction Point Participation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.instance.InteractionPointParticipation
     * @generated
     */
    public Adapter createInteractionPointParticipationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.instance.ActivityPoint <em>Activity Point</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.instance.ActivityPoint
     * @generated
     */
    public Adapter createActivityPointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.instance.ActionPoint <em>Action Point</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.instance.ActionPoint
     * @generated
     */
    public Adapter createActionPointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.instance.InteractionPoint <em>Interaction Point</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.instance.InteractionPoint
     * @generated
     */
    public Adapter createInteractionPointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.instance.EntityInstanceHiearchy <em>Entity Instance Hiearchy</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.instance.EntityInstanceHiearchy
     * @generated
     */
    public Adapter createEntityInstanceHiearchyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.instance.EntityInstanceReference <em>Entity Instance Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.instance.EntityInstanceReference
     * @generated
     */
    public Adapter createEntityInstanceReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.instance.EntityInstanceStaticReference <em>Entity Instance Static Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.instance.EntityInstanceStaticReference
     * @generated
     */
    public Adapter createEntityInstanceStaticReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.instance.EntityInstanceVariableReference <em>Entity Instance Variable Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.instance.EntityInstanceVariableReference
     * @generated
     */
    public Adapter createEntityInstanceVariableReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.instance.LocalizableInstance <em>Localizable Instance</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.instance.LocalizableInstance
     * @generated
     */
    public Adapter createLocalizableInstanceAdapter() {
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
     * Creates a new adapter for an object of class '{@link identity.instance.IdentityOwner <em>Identity Owner</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.instance.IdentityOwner
     * @generated
     */
    public Adapter createIdentityOwnerAdapter() {
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
     * Creates a new adapter for an object of class '{@link models.InstanceHiearchy <em>Instance Hiearchy</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.InstanceHiearchy
     * @generated
     */
    public Adapter createInstanceHiearchyAdapter() {
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

} //InstanceAdapterFactory
