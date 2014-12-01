/**
 */
package identity.action.impl;

import data.DataPackage;

import identity.IdentityPackage;

import identity.action.ActionFactory;
import identity.action.ActionPackage;
import identity.action.ModifyIdentity;

import identity.component.ComponentPackage;

import identity.component.impl.ComponentPackageImpl;

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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionPackageImpl extends EPackageImpl implements ActionPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass modifyIdentityEClass = null;

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
     * @see identity.action.ActionPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ActionPackageImpl() {
        super(eNS_URI, ActionFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link ActionPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ActionPackage init() {
        if (isInited) return (ActionPackage)EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI);

        // Obtain or create and register package
        ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ActionPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        DataPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        IdentityPackageImpl theIdentityPackage = (IdentityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IdentityPackage.eNS_URI) instanceof IdentityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IdentityPackage.eNS_URI) : IdentityPackage.eINSTANCE);
        ComponentPackageImpl theComponentPackage = (ComponentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) instanceof ComponentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI) : ComponentPackage.eINSTANCE);
        TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
        InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
        InstantiationPackageImpl theInstantiationPackage = (InstantiationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) instanceof InstantiationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) : InstantiationPackage.eINSTANCE);
        PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);

        // Create package meta-data objects
        theActionPackage.createPackageContents();
        theIdentityPackage.createPackageContents();
        theComponentPackage.createPackageContents();
        theTypePackage.createPackageContents();
        theInstancePackage.createPackageContents();
        theInstantiationPackage.createPackageContents();
        thePatternPackage.createPackageContents();

        // Initialize created meta-data
        theActionPackage.initializePackageContents();
        theIdentityPackage.initializePackageContents();
        theComponentPackage.initializePackageContents();
        theTypePackage.initializePackageContents();
        theInstancePackage.initializePackageContents();
        theInstantiationPackage.initializePackageContents();
        thePatternPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theActionPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ActionPackage.eNS_URI, theActionPackage);
        return theActionPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getModifyIdentity() {
        return modifyIdentityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModifyIdentity_Target() {
        return (EReference)modifyIdentityEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModifyIdentity_ModifyData() {
        return (EReference)modifyIdentityEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActionFactory getActionFactory() {
        return (ActionFactory)getEFactoryInstance();
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
        modifyIdentityEClass = createEClass(MODIFY_IDENTITY);
        createEReference(modifyIdentityEClass, MODIFY_IDENTITY__TARGET);
        createEReference(modifyIdentityEClass, MODIFY_IDENTITY__MODIFY_DATA);
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
        rule.action.ActionPackage theActionPackage_1 = (rule.action.ActionPackage)EPackage.Registry.INSTANCE.getEPackage(rule.action.ActionPackage.eNS_URI);
        InstantiationPackage theInstantiationPackage = (InstantiationPackage)EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI);
        data.action.ActionPackage theActionPackage_2 = (data.action.ActionPackage)EPackage.Registry.INSTANCE.getEPackage(data.action.ActionPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        modifyIdentityEClass.getESuperTypes().add(theActionPackage_1.getModify());

        // Initialize classes, features, and operations; add parameters
        initEClass(modifyIdentityEClass, ModifyIdentity.class, "ModifyIdentity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getModifyIdentity_Target(), theInstantiationPackage.getIdentityInstantiation(), null, "target", null, 0, 1, ModifyIdentity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getModifyIdentity_ModifyData(), theActionPackage_2.getModifyData(), null, "modifyData", null, 0, -1, ModifyIdentity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    }

} //ActionPackageImpl
