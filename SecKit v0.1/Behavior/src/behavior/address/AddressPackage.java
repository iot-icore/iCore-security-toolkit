/**
 */
package behavior.address;

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
 * @see behavior.address.AddressFactory
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
    String eNS_URI = "http://behavior/address/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "behavior-address";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    AddressPackage eINSTANCE = behavior.address.impl.AddressPackageImpl.init();

    /**
     * The meta object id for the '{@link behavior.address.impl.BehaviorAddressTypeImpl <em>Behavior Address Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.address.impl.BehaviorAddressTypeImpl
     * @see behavior.address.impl.AddressPackageImpl#getBehaviorAddressType()
     * @generated
     */
    int BEHAVIOR_ADDRESS_TYPE = 0;

    /**
     * The number of structural features of the '<em>Behavior Address Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_ADDRESS_TYPE_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Behavior Address Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_ADDRESS_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link behavior.address.impl.ProcessIdentifierImpl <em>Process Identifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.address.impl.ProcessIdentifierImpl
     * @see behavior.address.impl.AddressPackageImpl#getProcessIdentifier()
     * @generated
     */
    int PROCESS_IDENTIFIER = 1;

    /**
     * The number of structural features of the '<em>Process Identifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_IDENTIFIER_FEATURE_COUNT = BEHAVIOR_ADDRESS_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Process Identifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_IDENTIFIER_OPERATION_COUNT = BEHAVIOR_ADDRESS_TYPE_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link behavior.address.BehaviorAddressType <em>Behavior Address Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Behavior Address Type</em>'.
     * @see behavior.address.BehaviorAddressType
     * @generated
     */
    EClass getBehaviorAddressType();

    /**
     * Returns the meta object for class '{@link behavior.address.ProcessIdentifier <em>Process Identifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Process Identifier</em>'.
     * @see behavior.address.ProcessIdentifier
     * @generated
     */
    EClass getProcessIdentifier();

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
         * The meta object literal for the '{@link behavior.address.impl.BehaviorAddressTypeImpl <em>Behavior Address Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.address.impl.BehaviorAddressTypeImpl
         * @see behavior.address.impl.AddressPackageImpl#getBehaviorAddressType()
         * @generated
         */
        EClass BEHAVIOR_ADDRESS_TYPE = eINSTANCE.getBehaviorAddressType();

        /**
         * The meta object literal for the '{@link behavior.address.impl.ProcessIdentifierImpl <em>Process Identifier</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.address.impl.ProcessIdentifierImpl
         * @see behavior.address.impl.AddressPackageImpl#getProcessIdentifier()
         * @generated
         */
        EClass PROCESS_IDENTIFIER = eINSTANCE.getProcessIdentifier();

    }

} //AddressPackage
