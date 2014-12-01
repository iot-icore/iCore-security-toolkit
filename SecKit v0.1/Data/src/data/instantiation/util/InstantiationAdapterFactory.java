/**
 */
package data.instantiation.util;

import data.instantiation.*;

import models.Element;
import models.Hiearchy;
import models.InstantiationHierarchy;
import models.InstantiationReference;
import models.Reference;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see data.instantiation.InstantiationPackage
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
            public Adapter caseAddressInstantiation(AddressInstantiation object) {
                return createAddressInstantiationAdapter();
            }
            @Override
            public Adapter caseDataInstantiation(DataInstantiation object) {
                return createDataInstantiationAdapter();
            }
            @Override
            public Adapter caseAbstractDataInstantiation(AbstractDataInstantiation object) {
                return createAbstractDataInstantiationAdapter();
            }
            @Override
            public Adapter caseDataInstantiationHierarchy(DataInstantiationHierarchy object) {
                return createDataInstantiationHierarchyAdapter();
            }
            @Override
            public Adapter caseDataInstantiationReference(DataInstantiationReference object) {
                return createDataInstantiationReferenceAdapter();
            }
            @Override
            public Adapter caseAddressSpaceInstantiation(AddressSpaceInstantiation object) {
                return createAddressSpaceInstantiationAdapter();
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
     * Creates a new adapter for an object of class '{@link data.instantiation.AddressInstantiation <em>Address Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.instantiation.AddressInstantiation
     * @generated
     */
    public Adapter createAddressInstantiationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.instantiation.DataInstantiation <em>Data Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.instantiation.DataInstantiation
     * @generated
     */
    public Adapter createDataInstantiationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.instantiation.AbstractDataInstantiation <em>Abstract Data Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.instantiation.AbstractDataInstantiation
     * @generated
     */
    public Adapter createAbstractDataInstantiationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.instantiation.DataInstantiationHierarchy <em>Data Instantiation Hierarchy</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.instantiation.DataInstantiationHierarchy
     * @generated
     */
    public Adapter createDataInstantiationHierarchyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.instantiation.DataInstantiationReference <em>Data Instantiation Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.instantiation.DataInstantiationReference
     * @generated
     */
    public Adapter createDataInstantiationReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.instantiation.AddressSpaceInstantiation <em>Address Space Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.instantiation.AddressSpaceInstantiation
     * @generated
     */
    public Adapter createAddressSpaceInstantiationAdapter() {
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
