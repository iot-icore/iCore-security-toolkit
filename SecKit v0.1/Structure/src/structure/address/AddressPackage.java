/**
 */
package structure.address;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see structure.address.AddressFactory
 * @model kind="package"
 * @generated
 */
public interface AddressPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "address";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://structure/address/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "structure-address";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    AddressPackage eINSTANCE = structure.address.impl.AddressPackageImpl.init();

    /**
     * The meta object id for the '{@link structure.address.impl.AddressTypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.address.impl.AddressTypeImpl
     * @see structure.address.impl.AddressPackageImpl#getAddressType()
     * @generated
     */
    int ADDRESS_TYPE = 1;

    /**
     * The number of structural features of the '<em>Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS_TYPE_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link structure.address.impl.IpAddressImpl <em>Ip Address</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.address.impl.IpAddressImpl
     * @see structure.address.impl.AddressPackageImpl#getIpAddress()
     * @generated
     */
    int IP_ADDRESS = 0;

    /**
     * The number of structural features of the '<em>Ip Address</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IP_ADDRESS_FEATURE_COUNT = ADDRESS_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Ip Address</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IP_ADDRESS_OPERATION_COUNT = ADDRESS_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.address.impl.AddressInstanceImpl <em>Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.address.impl.AddressInstanceImpl
     * @see structure.address.impl.AddressPackageImpl#getAddressInstance()
     * @generated
     */
    int ADDRESS_INSTANCE = 2;

    /**
     * The number of structural features of the '<em>Instance</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS_INSTANCE_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Instance</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS_INSTANCE_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link structure.address.IpAddress <em>Ip Address</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ip Address</em>'.
     * @see structure.address.IpAddress
     * @generated
     */
    EClass getIpAddress();

    /**
     * Returns the meta object for class '{@link structure.address.AddressType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Type</em>'.
     * @see structure.address.AddressType
     * @generated
     */
    EClass getAddressType();

    /**
     * Returns the meta object for class '{@link structure.address.AddressInstance <em>Instance</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Instance</em>'.
     * @see structure.address.AddressInstance
     * @generated
     */
    EClass getAddressInstance();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    AddressFactory getAddressFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link structure.address.impl.IpAddressImpl <em>Ip Address</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.address.impl.IpAddressImpl
         * @see structure.address.impl.AddressPackageImpl#getIpAddress()
         * @generated
         */
        EClass IP_ADDRESS = eINSTANCE.getIpAddress();

        /**
         * The meta object literal for the '{@link structure.address.impl.AddressTypeImpl <em>Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.address.impl.AddressTypeImpl
         * @see structure.address.impl.AddressPackageImpl#getAddressType()
         * @generated
         */
        EClass ADDRESS_TYPE = eINSTANCE.getAddressType();

        /**
         * The meta object literal for the '{@link structure.address.impl.AddressInstanceImpl <em>Instance</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.address.impl.AddressInstanceImpl
         * @see structure.address.impl.AddressPackageImpl#getAddressInstance()
         * @generated
         */
        EClass ADDRESS_INSTANCE = eINSTANCE.getAddressInstance();

    }

} //AddressPackage
