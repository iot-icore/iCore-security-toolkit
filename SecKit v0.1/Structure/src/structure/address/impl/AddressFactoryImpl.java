/**
 */
package structure.address.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import structure.address.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AddressFactoryImpl extends EFactoryImpl implements AddressFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static AddressFactory init() {
        try {
            AddressFactory theAddressFactory = (AddressFactory)EPackage.Registry.INSTANCE.getEFactory(AddressPackage.eNS_URI);
            if (theAddressFactory != null) {
                return theAddressFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new AddressFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AddressFactoryImpl() {
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
            case AddressPackage.IP_ADDRESS: return createIpAddress();
            case AddressPackage.ADDRESS_TYPE: return createAddressType();
            case AddressPackage.ADDRESS_INSTANCE: return createAddressInstance();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IpAddress createIpAddress() {
        IpAddressImpl ipAddress = new IpAddressImpl();
        return ipAddress;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AddressType createAddressType() {
        AddressTypeImpl addressType = new AddressTypeImpl();
        return addressType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AddressInstance createAddressInstance() {
        AddressInstanceImpl addressInstance = new AddressInstanceImpl();
        return addressInstance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AddressPackage getAddressPackage() {
        return (AddressPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static AddressPackage getPackage() {
        return AddressPackage.eINSTANCE;
    }

} //AddressFactoryImpl
