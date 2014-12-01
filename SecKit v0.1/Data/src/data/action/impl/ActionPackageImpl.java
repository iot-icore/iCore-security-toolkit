/**
 */
package data.action.impl;

import data.DataPackage;

import data.action.ActionFactory;
import data.action.ActionPackage;
import data.action.ModifyData;

import data.event.EventPackage;

import data.event.impl.EventPackageImpl;

import data.impl.DataPackageImpl;

import data.instance.InstancePackage;

import data.instance.impl.InstancePackageImpl;

import data.instantiation.InstantiationPackage;

import data.instantiation.impl.InstantiationPackageImpl;

import data.pattern.PatternPackage;

import data.pattern.impl.PatternPackageImpl;

import data.type.TypePackage;

import data.type.impl.TypePackageImpl;

import data.variable.VariablePackage;

import data.variable.impl.VariablePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import rule.RulePackage;

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
    private EClass modifyDataEClass = null;

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
     * @see data.action.ActionPackage#eNS_URI
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
        RulePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
        TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
        InstantiationPackageImpl theInstantiationPackage = (InstantiationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) instanceof InstantiationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) : InstantiationPackage.eINSTANCE);
        InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
        VariablePackageImpl theVariablePackage = (VariablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI) instanceof VariablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI) : VariablePackage.eINSTANCE);
        PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
        EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);

        // Create package meta-data objects
        theActionPackage.createPackageContents();
        theDataPackage.createPackageContents();
        theTypePackage.createPackageContents();
        theInstantiationPackage.createPackageContents();
        theInstancePackage.createPackageContents();
        theVariablePackage.createPackageContents();
        thePatternPackage.createPackageContents();
        theEventPackage.createPackageContents();

        // Initialize created meta-data
        theActionPackage.initializePackageContents();
        theDataPackage.initializePackageContents();
        theTypePackage.initializePackageContents();
        theInstantiationPackage.initializePackageContents();
        theInstancePackage.initializePackageContents();
        theVariablePackage.initializePackageContents();
        thePatternPackage.initializePackageContents();
        theEventPackage.initializePackageContents();

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
    public EClass getModifyData() {
        return modifyDataEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModifyData_Target() {
        return (EReference)modifyDataEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getModifyData_NewValue() {
        return (EAttribute)modifyDataEClass.getEStructuralFeatures().get(1);
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
        modifyDataEClass = createEClass(MODIFY_DATA);
        createEReference(modifyDataEClass, MODIFY_DATA__TARGET);
        createEAttribute(modifyDataEClass, MODIFY_DATA__NEW_VALUE);
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

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        modifyDataEClass.getESuperTypes().add(theActionPackage_1.getModify());

        // Initialize classes, features, and operations; add parameters
        initEClass(modifyDataEClass, ModifyData.class, "ModifyData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getModifyData_Target(), theInstantiationPackage.getDataInstantiationHierarchy(), null, "target", null, 0, 1, ModifyData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getModifyData_NewValue(), ecorePackage.getEString(), "newValue", null, 0, 1, ModifyData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    }

} //ActionPackageImpl
