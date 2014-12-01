/**
 */
package behavior.quality.impl;

import behavior.BehaviorPackage;

import behavior.address.AddressPackage;

import behavior.address.impl.AddressPackageImpl;

import behavior.causality.CausalityPackage;

import behavior.causality.impl.CausalityPackageImpl;

import behavior.condition.ConditionPackage;

import behavior.condition.impl.ConditionPackageImpl;

import behavior.constraint.ConstraintPackage;

import behavior.constraint.impl.ConstraintPackageImpl;

import behavior.event.EventPackage;

import behavior.event.impl.EventPackageImpl;

import behavior.impl.BehaviorPackageImpl;

import behavior.instance.InstancePackage;

import behavior.instance.impl.InstancePackageImpl;

import behavior.instantiation.InstantiationPackage;

import behavior.instantiation.impl.InstantiationPackageImpl;

import behavior.pattern.PatternPackage;

import behavior.pattern.impl.PatternPackageImpl;

import behavior.quality.Availability;
import behavior.quality.Cost;
import behavior.quality.Latency;
import behavior.quality.Price;
import behavior.quality.Qualitative;
import behavior.quality.QualityFactory;
import behavior.quality.QualityOfDataProvisioning;
import behavior.quality.QualityOfEventSignalling;
import behavior.quality.QualityPackage;
import behavior.quality.QualityProperty;
import behavior.quality.Quantitative;
import behavior.quality.ResponseTime;
import behavior.quality.ServiceProviderLoad;
import behavior.quality.Throughput;
import behavior.quality.Value;

import behavior.trust.TrustPackage;

import behavior.trust.impl.TrustPackageImpl;

import behavior.type.TypePackage;

import behavior.type.action.ActionPackage;

import behavior.type.action.impl.ActionPackageImpl;

import behavior.type.impl.TypePackageImpl;

import behavior.variable.VariablePackage;

import behavior.variable.impl.VariablePackageImpl;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import structure.StructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QualityPackageImpl extends EPackageImpl implements QualityPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass qualityPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass responseTimeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass serviceProviderLoadEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass latencyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass throughputEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass qualityOfDataProvisioningEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass qualityOfEventSignallingEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass costEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass priceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass availabilityEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass quantitativeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass qualitativeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass valueEClass = null;

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
     * @see behavior.quality.QualityPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private QualityPackageImpl() {
        super(eNS_URI, QualityFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link QualityPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static QualityPackage init() {
        if (isInited) return (QualityPackage)EPackage.Registry.INSTANCE.getEPackage(QualityPackage.eNS_URI);

        // Obtain or create and register package
        QualityPackageImpl theQualityPackage = (QualityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QualityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QualityPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        StructurePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
        InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
        TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
        ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) : ActionPackage.eINSTANCE);
        InstantiationPackageImpl theInstantiationPackage = (InstantiationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) instanceof InstantiationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) : InstantiationPackage.eINSTANCE);
        CausalityPackageImpl theCausalityPackage = (CausalityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CausalityPackage.eNS_URI) instanceof CausalityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CausalityPackage.eNS_URI) : CausalityPackage.eINSTANCE);
        ConstraintPackageImpl theConstraintPackage = (ConstraintPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) instanceof ConstraintPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) : ConstraintPackage.eINSTANCE);
        VariablePackageImpl theVariablePackage = (VariablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI) instanceof VariablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI) : VariablePackage.eINSTANCE);
        PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
        AddressPackageImpl theAddressPackage = (AddressPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AddressPackage.eNS_URI) instanceof AddressPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AddressPackage.eNS_URI) : AddressPackage.eINSTANCE);
        EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);
        ConditionPackageImpl theConditionPackage = (ConditionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConditionPackage.eNS_URI) instanceof ConditionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConditionPackage.eNS_URI) : ConditionPackage.eINSTANCE);
        behavior.action.impl.ActionPackageImpl theActionPackage_1 = (behavior.action.impl.ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(behavior.action.ActionPackage.eNS_URI) instanceof behavior.action.impl.ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(behavior.action.ActionPackage.eNS_URI) : behavior.action.ActionPackage.eINSTANCE);
        TrustPackageImpl theTrustPackage = (TrustPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TrustPackage.eNS_URI) instanceof TrustPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TrustPackage.eNS_URI) : TrustPackage.eINSTANCE);

        // Create package meta-data objects
        theQualityPackage.createPackageContents();
        theBehaviorPackage.createPackageContents();
        theInstancePackage.createPackageContents();
        theTypePackage.createPackageContents();
        theActionPackage.createPackageContents();
        theInstantiationPackage.createPackageContents();
        theCausalityPackage.createPackageContents();
        theConstraintPackage.createPackageContents();
        theVariablePackage.createPackageContents();
        thePatternPackage.createPackageContents();
        theAddressPackage.createPackageContents();
        theEventPackage.createPackageContents();
        theConditionPackage.createPackageContents();
        theActionPackage_1.createPackageContents();
        theTrustPackage.createPackageContents();

        // Initialize created meta-data
        theQualityPackage.initializePackageContents();
        theBehaviorPackage.initializePackageContents();
        theInstancePackage.initializePackageContents();
        theTypePackage.initializePackageContents();
        theActionPackage.initializePackageContents();
        theInstantiationPackage.initializePackageContents();
        theCausalityPackage.initializePackageContents();
        theConstraintPackage.initializePackageContents();
        theVariablePackage.initializePackageContents();
        thePatternPackage.initializePackageContents();
        theAddressPackage.initializePackageContents();
        theEventPackage.initializePackageContents();
        theConditionPackage.initializePackageContents();
        theActionPackage_1.initializePackageContents();
        theTrustPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theQualityPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(QualityPackage.eNS_URI, theQualityPackage);
        return theQualityPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getQualityProperty() {
        return qualityPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getResponseTime() {
        return responseTimeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getServiceProviderLoad() {
        return serviceProviderLoadEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLatency() {
        return latencyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getThroughput() {
        return throughputEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getQualityOfDataProvisioning() {
        return qualityOfDataProvisioningEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getQualityOfDataProvisioning_TimestampPrecision() {
        return (EAttribute)qualityOfDataProvisioningEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getQualityOfDataProvisioning_MaxPrecision() {
        return (EAttribute)qualityOfDataProvisioningEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getQualityOfDataProvisioning_RefreshRate() {
        return (EAttribute)qualityOfDataProvisioningEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getQualityOfEventSignalling() {
        return qualityOfEventSignallingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCost() {
        return costEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPrice() {
        return priceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPrice_Amount() {
        return (EReference)priceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAvailability() {
        return availabilityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getQuantitative() {
        return quantitativeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getQualitative() {
        return qualitativeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getValue() {
        return valueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QualityFactory getQualityFactory() {
        return (QualityFactory)getEFactoryInstance();
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
        qualityPropertyEClass = createEClass(QUALITY_PROPERTY);

        responseTimeEClass = createEClass(RESPONSE_TIME);

        serviceProviderLoadEClass = createEClass(SERVICE_PROVIDER_LOAD);

        latencyEClass = createEClass(LATENCY);

        throughputEClass = createEClass(THROUGHPUT);

        qualityOfDataProvisioningEClass = createEClass(QUALITY_OF_DATA_PROVISIONING);
        createEAttribute(qualityOfDataProvisioningEClass, QUALITY_OF_DATA_PROVISIONING__TIMESTAMP_PRECISION);
        createEAttribute(qualityOfDataProvisioningEClass, QUALITY_OF_DATA_PROVISIONING__MAX_PRECISION);
        createEAttribute(qualityOfDataProvisioningEClass, QUALITY_OF_DATA_PROVISIONING__REFRESH_RATE);

        qualityOfEventSignallingEClass = createEClass(QUALITY_OF_EVENT_SIGNALLING);

        costEClass = createEClass(COST);

        priceEClass = createEClass(PRICE);
        createEReference(priceEClass, PRICE__AMOUNT);

        availabilityEClass = createEClass(AVAILABILITY);

        quantitativeEClass = createEClass(QUANTITATIVE);

        qualitativeEClass = createEClass(QUALITATIVE);

        valueEClass = createEClass(VALUE);
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
        ModelsPackage theModelsPackage = (ModelsPackage)EPackage.Registry.INSTANCE.getEPackage(ModelsPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        qualityPropertyEClass.getESuperTypes().add(theModelsPackage.getElement());
        responseTimeEClass.getESuperTypes().add(this.getQuantitative());
        serviceProviderLoadEClass.getESuperTypes().add(this.getQuantitative());
        latencyEClass.getESuperTypes().add(this.getQuantitative());
        throughputEClass.getESuperTypes().add(this.getQuantitative());
        qualityOfDataProvisioningEClass.getESuperTypes().add(this.getQuantitative());
        qualityOfEventSignallingEClass.getESuperTypes().add(this.getQuantitative());
        priceEClass.getESuperTypes().add(this.getQuantitative());
        availabilityEClass.getESuperTypes().add(this.getQuantitative());
        quantitativeEClass.getESuperTypes().add(this.getQualityProperty());
        qualitativeEClass.getESuperTypes().add(this.getQualityProperty());

        // Initialize classes, features, and operations; add parameters
        initEClass(qualityPropertyEClass, QualityProperty.class, "QualityProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(responseTimeEClass, ResponseTime.class, "ResponseTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(serviceProviderLoadEClass, ServiceProviderLoad.class, "ServiceProviderLoad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(latencyEClass, Latency.class, "Latency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(throughputEClass, Throughput.class, "Throughput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(qualityOfDataProvisioningEClass, QualityOfDataProvisioning.class, "QualityOfDataProvisioning", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getQualityOfDataProvisioning_TimestampPrecision(), ecorePackage.getEString(), "timestampPrecision", null, 0, 1, QualityOfDataProvisioning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getQualityOfDataProvisioning_MaxPrecision(), ecorePackage.getEString(), "maxPrecision", null, 0, 1, QualityOfDataProvisioning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getQualityOfDataProvisioning_RefreshRate(), ecorePackage.getEString(), "refreshRate", null, 0, 1, QualityOfDataProvisioning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(qualityOfEventSignallingEClass, QualityOfEventSignalling.class, "QualityOfEventSignalling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(costEClass, Cost.class, "Cost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(priceEClass, Price.class, "Price", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPrice_Amount(), theModelsPackage.getMonetaryAmount(), null, "amount", null, 1, 1, Price.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(availabilityEClass, Availability.class, "Availability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(quantitativeEClass, Quantitative.class, "Quantitative", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(qualitativeEClass, Qualitative.class, "Qualitative", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    }

} //QualityPackageImpl
