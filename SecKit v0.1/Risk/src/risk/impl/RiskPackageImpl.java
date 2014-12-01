/**
 */
package risk.impl;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import risk.RiskDesignModel;
import risk.RiskFactory;
import risk.RiskPackage;
import risk.RiskRuntimeModel;

import risk.type.TypePackage;

import risk.type.impl.TypePackageImpl;

import structure.StructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RiskPackageImpl extends EPackageImpl implements RiskPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass riskDesignModelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass riskRuntimeModelEClass = null;

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
     * @see risk.RiskPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private RiskPackageImpl() {
        super(eNS_URI, RiskFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link RiskPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static RiskPackage init() {
        if (isInited) return (RiskPackage)EPackage.Registry.INSTANCE.getEPackage(RiskPackage.eNS_URI);

        // Obtain or create and register package
        RiskPackageImpl theRiskPackage = (RiskPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RiskPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RiskPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        StructurePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);

        // Create package meta-data objects
        theRiskPackage.createPackageContents();
        theTypePackage.createPackageContents();

        // Initialize created meta-data
        theRiskPackage.initializePackageContents();
        theTypePackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theRiskPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(RiskPackage.eNS_URI, theRiskPackage);
        return theRiskPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRiskDesignModel() {
        return riskDesignModelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRiskDesignModel_Packages() {
        return (EReference)riskDesignModelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRiskRuntimeModel() {
        return riskRuntimeModelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RiskFactory getRiskFactory() {
        return (RiskFactory)getEFactoryInstance();
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
        riskDesignModelEClass = createEClass(RISK_DESIGN_MODEL);
        createEReference(riskDesignModelEClass, RISK_DESIGN_MODEL__PACKAGES);

        riskRuntimeModelEClass = createEClass(RISK_RUNTIME_MODEL);
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
        TypePackage theTypePackage = (TypePackage)EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);
        ModelsPackage theModelsPackage = (ModelsPackage)EPackage.Registry.INSTANCE.getEPackage(ModelsPackage.eNS_URI);

        // Add subpackages
        getESubpackages().add(theTypePackage);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        riskDesignModelEClass.getESuperTypes().add(theModelsPackage.getModel());
        riskRuntimeModelEClass.getESuperTypes().add(theModelsPackage.getModel());

        // Initialize classes, features, and operations; add parameters
        initEClass(riskDesignModelEClass, RiskDesignModel.class, "RiskDesignModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRiskDesignModel_Packages(), theTypePackage.getRiskTypePackage(), theTypePackage.getRiskTypePackage_Model(), "packages", null, 0, -1, RiskDesignModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(riskRuntimeModelEClass, RiskRuntimeModel.class, "RiskRuntimeModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //RiskPackageImpl
