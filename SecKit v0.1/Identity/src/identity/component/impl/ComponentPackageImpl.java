/**
 */
package identity.component.impl;

import data.DataPackage;

import identity.IdentityPackage;

import identity.action.ActionPackage;

import identity.action.impl.ActionPackageImpl;

import identity.component.AuthenticationService;
import identity.component.ComponentFactory;
import identity.component.ComponentPackage;
import identity.component.IdentityProvider;
import identity.component.RelyingParty;

import identity.impl.IdentityPackageImpl;

import identity.instance.InstancePackage;

import identity.instance.impl.InstancePackageImpl;

import identity.instantiation.InstantiationPackage;

import identity.instantiation.impl.InstantiationPackageImpl;

import identity.pattern.PatternPackage;

import identity.pattern.impl.PatternPackageImpl;

import identity.type.TypePackage;

import identity.type.impl.TypePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentPackageImpl extends EPackageImpl implements ComponentPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass authenticationServiceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass relyingPartyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass identityProviderEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see identity.component.ComponentPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ComponentPackageImpl() {
        super(eNS_URI, ComponentFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link ComponentPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ComponentPackage init() {
        if (isInited) return (ComponentPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI);

        // Obtain or create and register package
        ComponentPackageImpl theComponentPackage = (ComponentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ComponentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ComponentPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        DataPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        IdentityPackageImpl theIdentityPackage = (IdentityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IdentityPackage.eNS_URI) instanceof IdentityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IdentityPackage.eNS_URI) : IdentityPackage.eINSTANCE);
        TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
        InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
        InstantiationPackageImpl theInstantiationPackage = (InstantiationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) instanceof InstantiationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) : InstantiationPackage.eINSTANCE);
        PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
        ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) : ActionPackage.eINSTANCE);

        // Create package meta-data objects
        theComponentPackage.createPackageContents();
        theIdentityPackage.createPackageContents();
        theTypePackage.createPackageContents();
        theInstancePackage.createPackageContents();
        theInstantiationPackage.createPackageContents();
        thePatternPackage.createPackageContents();
        theActionPackage.createPackageContents();

        // Initialize created meta-data
        theComponentPackage.initializePackageContents();
        theIdentityPackage.initializePackageContents();
        theTypePackage.initializePackageContents();
        theInstancePackage.initializePackageContents();
        theInstantiationPackage.initializePackageContents();
        thePatternPackage.initializePackageContents();
        theActionPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theComponentPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ComponentPackage.eNS_URI, theComponentPackage);
        return theComponentPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAuthenticationService() {
        return authenticationServiceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getAuthenticationService__Authenticate__Identifier_Password() {
        return authenticationServiceEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRelyingParty() {
        return relyingPartyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIdentityProvider() {
        return identityProviderEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComponentFactory getComponentFactory() {
        return (ComponentFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        authenticationServiceEClass = createEClass(AUTHENTICATION_SERVICE);
        createEOperation(authenticationServiceEClass, AUTHENTICATION_SERVICE___AUTHENTICATE__IDENTIFIER_PASSWORD);

        relyingPartyEClass = createEClass(RELYING_PARTY);

        identityProviderEClass = createEClass(IDENTITY_PROVIDER);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);
        TypePackage theTypePackage = (TypePackage)EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes

        // Initialize classes, features, and operations; add parameters
        initEClass(authenticationServiceEClass, AuthenticationService.class, "AuthenticationService", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        EOperation op = initEOperation(getAuthenticationService__Authenticate__Identifier_Password(), theInstancePackage.getAbstractIdentity(), "authenticate", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theTypePackage.getIdentifier(), "username", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theTypePackage.getPassword(), "password", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(relyingPartyEClass, RelyingParty.class, "RelyingParty", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(identityProviderEClass, IdentityProvider.class, "IdentityProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    }

} //ComponentPackageImpl
