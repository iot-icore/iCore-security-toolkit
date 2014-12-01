/**
 */
package data.instantiation.impl;

import data.instantiation.*;

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
            case InstantiationPackage.ADDRESS_INSTANTIATION: return createAddressInstantiation();
            case InstantiationPackage.DATA_INSTANTIATION: return createDataInstantiation();
            case InstantiationPackage.DATA_INSTANTIATION_HIERARCHY: return createDataInstantiationHierarchy();
            case InstantiationPackage.DATA_INSTANTIATION_REFERENCE: return createDataInstantiationReference();
            case InstantiationPackage.ADDRESS_SPACE_INSTANTIATION: return createAddressSpaceInstantiation();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AddressInstantiation createAddressInstantiation() {
        AddressInstantiationImpl addressInstantiation = new AddressInstantiationImpl();
        return addressInstantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataInstantiation createDataInstantiation() {
        DataInstantiationImpl dataInstantiation = new DataInstantiationImpl();
        return dataInstantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataInstantiationHierarchy createDataInstantiationHierarchy() {
        DataInstantiationHierarchyImpl dataInstantiationHierarchy = new DataInstantiationHierarchyImpl();
        return dataInstantiationHierarchy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataInstantiationReference createDataInstantiationReference() {
        DataInstantiationReferenceImpl dataInstantiationReference = new DataInstantiationReferenceImpl();
        return dataInstantiationReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AddressSpaceInstantiation createAddressSpaceInstantiation() {
        AddressSpaceInstantiationImpl addressSpaceInstantiation = new AddressSpaceInstantiationImpl();
        return addressSpaceInstantiation;
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
