/**
 */
package context.instance.tmp.impl;

import context.ContextPackage;

import context.event.EventPackage;

import context.event.impl.EventPackageImpl;

import context.impl.ContextPackageImpl;

import context.instance.InstancePackage;

import context.instance.impl.InstancePackageImpl;

import context.instance.tmp.AvailableDevices;
import context.instance.tmp.CombinedSituation;
import context.instance.tmp.EventPrecision;
import context.instance.tmp.Fever;
import context.instance.tmp.FormalRelationContext;
import context.instance.tmp.FormalRelationSituation;
import context.instance.tmp.Friendship;
import context.instance.tmp.IntrinsicContext;
import context.instance.tmp.IntrinsicSituations;
import context.instance.tmp.MaterialRelationContext;
import context.instance.tmp.NearbyMeasurement;
import context.instance.tmp.RecurrentFever;
import context.instance.tmp.RelationalSituation;
import context.instance.tmp.SituationOfSituations;
import context.instance.tmp.TemperatureMeasurement;
import context.instance.tmp.TmpFactory;
import context.instance.tmp.TmpPackage;

import context.instantiation.InstantiationPackage;

import context.instantiation.impl.InstantiationPackageImpl;

import context.management.ManagementPackage;

import context.management.impl.ManagementPackageImpl;

import context.pattern.PatternPackage;

import context.pattern.impl.PatternPackageImpl;

import context.type.TypePackage;

import context.type.impl.TypePackageImpl;

import identity.IdentityPackage;

import org.eclipse.emf.ecore.EAttribute;
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
public class TmpPackageImpl extends EPackageImpl implements TmpPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass temperatureMeasurementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nearbyMeasurementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eventPrecisionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass materialRelationContextEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass intrinsicSituationsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass relationalSituationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass friendshipEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass formalRelationSituationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass situationOfSituationsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass recurrentFeverEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass combinedSituationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass intrinsicContextEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass feverEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass availableDevicesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass formalRelationContextEClass = null;

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
     * @see context.instance.tmp.TmpPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private TmpPackageImpl() {
        super(eNS_URI, TmpFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link TmpPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static TmpPackage init() {
        if (isInited) return (TmpPackage)EPackage.Registry.INSTANCE.getEPackage(TmpPackage.eNS_URI);

        // Obtain or create and register package
        TmpPackageImpl theTmpPackage = (TmpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TmpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TmpPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        IdentityPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        ContextPackageImpl theContextPackage = (ContextPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI) instanceof ContextPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI) : ContextPackage.eINSTANCE);
        ManagementPackageImpl theManagementPackage = (ManagementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ManagementPackage.eNS_URI) instanceof ManagementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ManagementPackage.eNS_URI) : ManagementPackage.eINSTANCE);
        InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
        TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
        InstantiationPackageImpl theInstantiationPackage = (InstantiationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) instanceof InstantiationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstantiationPackage.eNS_URI) : InstantiationPackage.eINSTANCE);
        PatternPackageImpl thePatternPackage = (PatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) instanceof PatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternPackage.eNS_URI) : PatternPackage.eINSTANCE);
        EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);

        // Create package meta-data objects
        theTmpPackage.createPackageContents();
        theContextPackage.createPackageContents();
        theManagementPackage.createPackageContents();
        theInstancePackage.createPackageContents();
        theTypePackage.createPackageContents();
        theInstantiationPackage.createPackageContents();
        thePatternPackage.createPackageContents();
        theEventPackage.createPackageContents();

        // Initialize created meta-data
        theTmpPackage.initializePackageContents();
        theContextPackage.initializePackageContents();
        theManagementPackage.initializePackageContents();
        theInstancePackage.initializePackageContents();
        theTypePackage.initializePackageContents();
        theInstantiationPackage.initializePackageContents();
        thePatternPackage.initializePackageContents();
        theEventPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theTmpPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(TmpPackage.eNS_URI, theTmpPackage);
        return theTmpPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTemperatureMeasurement() {
        return temperatureMeasurementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTemperatureMeasurement_Value() {
        return (EAttribute)temperatureMeasurementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTemperatureMeasurement_Scale() {
        return (EAttribute)temperatureMeasurementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNearbyMeasurement() {
        return nearbyMeasurementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getNearbyMeasurement_EntityA() {
        return (EReference)nearbyMeasurementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getNearbyMeasurement_EntityB() {
        return (EReference)nearbyMeasurementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEventPrecision() {
        return eventPrecisionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMaterialRelationContext() {
        return materialRelationContextEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIntrinsicSituations() {
        return intrinsicSituationsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRelationalSituation() {
        return relationalSituationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFriendship() {
        return friendshipEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFormalRelationSituation() {
        return formalRelationSituationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSituationOfSituations() {
        return situationOfSituationsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRecurrentFever() {
        return recurrentFeverEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCombinedSituation() {
        return combinedSituationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIntrinsicContext() {
        return intrinsicContextEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFever() {
        return feverEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAvailableDevices() {
        return availableDevicesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFormalRelationContext() {
        return formalRelationContextEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TmpFactory getTmpFactory() {
        return (TmpFactory)getEFactoryInstance();
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
        temperatureMeasurementEClass = createEClass(TEMPERATURE_MEASUREMENT);
        createEAttribute(temperatureMeasurementEClass, TEMPERATURE_MEASUREMENT__VALUE);
        createEAttribute(temperatureMeasurementEClass, TEMPERATURE_MEASUREMENT__SCALE);

        nearbyMeasurementEClass = createEClass(NEARBY_MEASUREMENT);
        createEReference(nearbyMeasurementEClass, NEARBY_MEASUREMENT__ENTITY_A);
        createEReference(nearbyMeasurementEClass, NEARBY_MEASUREMENT__ENTITY_B);

        eventPrecisionEClass = createEClass(EVENT_PRECISION);

        materialRelationContextEClass = createEClass(MATERIAL_RELATION_CONTEXT);

        intrinsicSituationsEClass = createEClass(INTRINSIC_SITUATIONS);

        relationalSituationEClass = createEClass(RELATIONAL_SITUATION);

        friendshipEClass = createEClass(FRIENDSHIP);

        formalRelationSituationEClass = createEClass(FORMAL_RELATION_SITUATION);

        situationOfSituationsEClass = createEClass(SITUATION_OF_SITUATIONS);

        recurrentFeverEClass = createEClass(RECURRENT_FEVER);

        combinedSituationEClass = createEClass(COMBINED_SITUATION);

        intrinsicContextEClass = createEClass(INTRINSIC_CONTEXT);

        feverEClass = createEClass(FEVER);

        availableDevicesEClass = createEClass(AVAILABLE_DEVICES);

        formalRelationContextEClass = createEClass(FORMAL_RELATION_CONTEXT);
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
        identity.instance.InstancePackage theInstancePackage_1 = (identity.instance.InstancePackage)EPackage.Registry.INSTANCE.getEPackage(identity.instance.InstancePackage.eNS_URI);
        TypePackage theTypePackage = (TypePackage)EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        temperatureMeasurementEClass.getESuperTypes().add(theInstancePackage.getContext());
        nearbyMeasurementEClass.getESuperTypes().add(theInstancePackage.getContextSituation());
        materialRelationContextEClass.getESuperTypes().add(theTypePackage.getContextInformationType());
        intrinsicSituationsEClass.getESuperTypes().add(theTypePackage.getContextSituationType());
        relationalSituationEClass.getESuperTypes().add(this.getMaterialRelationContext());
        friendshipEClass.getESuperTypes().add(this.getRelationalSituation());
        formalRelationSituationEClass.getESuperTypes().add(theTypePackage.getContextSituationType());
        situationOfSituationsEClass.getESuperTypes().add(theTypePackage.getContextSituationType());
        recurrentFeverEClass.getESuperTypes().add(this.getSituationOfSituations());
        intrinsicContextEClass.getESuperTypes().add(theTypePackage.getContextInformationType());
        feverEClass.getESuperTypes().add(this.getIntrinsicSituations());
        availableDevicesEClass.getESuperTypes().add(this.getMaterialRelationContext());

        // Initialize classes, features, and operations; add parameters
        initEClass(temperatureMeasurementEClass, TemperatureMeasurement.class, "TemperatureMeasurement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTemperatureMeasurement_Value(), ecorePackage.getEBigDecimal(), "value", null, 0, 1, TemperatureMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTemperatureMeasurement_Scale(), ecorePackage.getEString(), "scale", null, 0, 1, TemperatureMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(nearbyMeasurementEClass, NearbyMeasurement.class, "NearbyMeasurement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getNearbyMeasurement_EntityA(), theInstancePackage_1.getAbstractIdentity(), null, "entityA", null, 0, 1, NearbyMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getNearbyMeasurement_EntityB(), theInstancePackage_1.getAbstractIdentity(), null, "entityB", null, 0, 1, NearbyMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eventPrecisionEClass, EventPrecision.class, "EventPrecision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(materialRelationContextEClass, MaterialRelationContext.class, "MaterialRelationContext", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(intrinsicSituationsEClass, IntrinsicSituations.class, "IntrinsicSituations", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(relationalSituationEClass, RelationalSituation.class, "RelationalSituation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(friendshipEClass, Friendship.class, "Friendship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(formalRelationSituationEClass, FormalRelationSituation.class, "FormalRelationSituation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(situationOfSituationsEClass, SituationOfSituations.class, "SituationOfSituations", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(recurrentFeverEClass, RecurrentFever.class, "RecurrentFever", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(combinedSituationEClass, CombinedSituation.class, "CombinedSituation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(intrinsicContextEClass, IntrinsicContext.class, "IntrinsicContext", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(feverEClass, Fever.class, "Fever", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(availableDevicesEClass, AvailableDevices.class, "AvailableDevices", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(formalRelationContextEClass, FormalRelationContext.class, "FormalRelationContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    }

} //TmpPackageImpl
