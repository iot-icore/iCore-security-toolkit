/**
 */
package identity.instance.util;

import data.instance.AbstractDataInstance;
import data.instance.Addressable;
import data.instance.Data;

import identity.instance.*;

import models.Element;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see identity.instance.InstancePackage
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
            public Adapter caseAbstractIdentity(AbstractIdentity object) {
                return createAbstractIdentityAdapter();
            }
            @Override
            public Adapter caseDigitalIdentity(DigitalIdentity object) {
                return createDigitalIdentityAdapter();
            }
            @Override
            public Adapter caseIdentityAttribute(IdentityAttribute object) {
                return createIdentityAttributeAdapter();
            }
            @Override
            public Adapter caseIdentityRealm(IdentityRealm object) {
                return createIdentityRealmAdapter();
            }
            @Override
            public Adapter caseSelfSignedIdentity(SelfSignedIdentity object) {
                return createSelfSignedIdentityAdapter();
            }
            @Override
            public Adapter caseIdentityFederation(IdentityFederation object) {
                return createIdentityFederationAdapter();
            }
            @Override
            public Adapter caseIdentityOwner(IdentityOwner object) {
                return createIdentityOwnerAdapter();
            }
            @Override
            public Adapter caseElement(Element object) {
                return createElementAdapter();
            }
            @Override
            public Adapter caseAbstractDataInstance(AbstractDataInstance object) {
                return createAbstractDataInstanceAdapter();
            }
            @Override
            public Adapter caseAddressable(Addressable object) {
                return createAddressableAdapter();
            }
            @Override
            public Adapter caseData(Data object) {
                return createDataAdapter();
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
     * Creates a new adapter for an object of class '{@link identity.instance.AbstractIdentity <em>Abstract Identity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.instance.AbstractIdentity
     * @generated
     */
    public Adapter createAbstractIdentityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.instance.DigitalIdentity <em>Digital Identity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.instance.DigitalIdentity
     * @generated
     */
    public Adapter createDigitalIdentityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.instance.IdentityAttribute <em>Identity Attribute</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.instance.IdentityAttribute
     * @generated
     */
    public Adapter createIdentityAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.instance.IdentityRealm <em>Identity Realm</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.instance.IdentityRealm
     * @generated
     */
    public Adapter createIdentityRealmAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.instance.SelfSignedIdentity <em>Self Signed Identity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.instance.SelfSignedIdentity
     * @generated
     */
    public Adapter createSelfSignedIdentityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link identity.instance.IdentityFederation <em>Identity Federation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see identity.instance.IdentityFederation
     * @generated
     */
    public Adapter createIdentityFederationAdapter() {
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
     * Creates a new adapter for an object of class '{@link data.instance.AbstractDataInstance <em>Abstract Data Instance</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.instance.AbstractDataInstance
     * @generated
     */
    public Adapter createAbstractDataInstanceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.instance.Addressable <em>Addressable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.instance.Addressable
     * @generated
     */
    public Adapter createAddressableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.instance.Data <em>Data</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.instance.Data
     * @generated
     */
    public Adapter createDataAdapter() {
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
