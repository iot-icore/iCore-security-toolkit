/**
 */
package identity.component;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see identity.component.ComponentFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "component";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://identity/component/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "identity-component";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ComponentPackage eINSTANCE = identity.component.impl.ComponentPackageImpl.init();

    /**
     * The meta object id for the '{@link identity.component.AuthenticationService <em>Authentication Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.component.AuthenticationService
     * @see identity.component.impl.ComponentPackageImpl#getAuthenticationService()
     * @generated
     */
    int AUTHENTICATION_SERVICE = 0;

    /**
     * The number of structural features of the '<em>Authentication Service</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHENTICATION_SERVICE_FEATURE_COUNT = 0;

    /**
     * The operation id for the '<em>Authenticate</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHENTICATION_SERVICE___AUTHENTICATE__IDENTIFIER_PASSWORD = 0;

    /**
     * The number of operations of the '<em>Authentication Service</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHENTICATION_SERVICE_OPERATION_COUNT = 1;

    /**
     * The meta object id for the '{@link identity.component.RelyingParty <em>Relying Party</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.component.RelyingParty
     * @see identity.component.impl.ComponentPackageImpl#getRelyingParty()
     * @generated
     */
    int RELYING_PARTY = 1;

    /**
     * The number of structural features of the '<em>Relying Party</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELYING_PARTY_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Relying Party</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELYING_PARTY_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link identity.component.IdentityProvider <em>Identity Provider</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.component.IdentityProvider
     * @see identity.component.impl.ComponentPackageImpl#getIdentityProvider()
     * @generated
     */
    int IDENTITY_PROVIDER = 2;

    /**
     * The number of structural features of the '<em>Identity Provider</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_PROVIDER_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Identity Provider</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_PROVIDER_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link identity.component.AuthenticationService <em>Authentication Service</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Authentication Service</em>'.
     * @see identity.component.AuthenticationService
     * @generated
     */
    EClass getAuthenticationService();

    /**
     * Returns the meta object for the '{@link identity.component.AuthenticationService#authenticate(identity.type.Identifier, identity.type.Password) <em>Authenticate</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Authenticate</em>' operation.
     * @see identity.component.AuthenticationService#authenticate(identity.type.Identifier, identity.type.Password)
     * @generated
     */
    EOperation getAuthenticationService__Authenticate__Identifier_Password();

    /**
     * Returns the meta object for class '{@link identity.component.RelyingParty <em>Relying Party</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Relying Party</em>'.
     * @see identity.component.RelyingParty
     * @generated
     */
    EClass getRelyingParty();

    /**
     * Returns the meta object for class '{@link identity.component.IdentityProvider <em>Identity Provider</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Identity Provider</em>'.
     * @see identity.component.IdentityProvider
     * @generated
     */
    EClass getIdentityProvider();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ComponentFactory getComponentFactory();

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
         * The meta object literal for the '{@link identity.component.AuthenticationService <em>Authentication Service</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.component.AuthenticationService
         * @see identity.component.impl.ComponentPackageImpl#getAuthenticationService()
         * @generated
         */
        EClass AUTHENTICATION_SERVICE = eINSTANCE.getAuthenticationService();

        /**
         * The meta object literal for the '<em><b>Authenticate</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation AUTHENTICATION_SERVICE___AUTHENTICATE__IDENTIFIER_PASSWORD = eINSTANCE.getAuthenticationService__Authenticate__Identifier_Password();

        /**
         * The meta object literal for the '{@link identity.component.RelyingParty <em>Relying Party</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.component.RelyingParty
         * @see identity.component.impl.ComponentPackageImpl#getRelyingParty()
         * @generated
         */
        EClass RELYING_PARTY = eINSTANCE.getRelyingParty();

        /**
         * The meta object literal for the '{@link identity.component.IdentityProvider <em>Identity Provider</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.component.IdentityProvider
         * @see identity.component.impl.ComponentPackageImpl#getIdentityProvider()
         * @generated
         */
        EClass IDENTITY_PROVIDER = eINSTANCE.getIdentityProvider();

    }

} //ComponentPackage
