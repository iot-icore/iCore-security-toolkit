/**
 */
package models.impl;

import models.Currency;
import models.Diagram;
import models.Element;
import models.Hiearchy;
import models.InstanceHiearchy;
import models.InstantiationHierarchy;
import models.InstantiationReference;
import models.Model;
import models.ModelsFactory;
import models.ModelsPackage;
import models.MonetaryAmount;
import models.Multiplicity;
import models.Pattern;
import models.Quality;
import models.Reference;

import models.Shape;
import models.TreeNode;
import models.VisualElement;
import models.variable.VariablePackage;

import models.variable.impl.VariablePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelsPackageImpl extends EPackageImpl implements ModelsPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass multiplicityEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass instantiationHierarchyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass modelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass instantiationReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass elementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass instanceHiearchyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hiearchyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass referenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass monetaryAmountEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass currencyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass qualityEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass patternEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass shapeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass diagramEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass visualElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass treeNodeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType objectEDataType = null;

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
     * @see models.ModelsPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ModelsPackageImpl() {
        super(eNS_URI, ModelsFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link ModelsPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ModelsPackage init() {
        if (isInited) return (ModelsPackage)EPackage.Registry.INSTANCE.getEPackage(ModelsPackage.eNS_URI);

        // Obtain or create and register package
        ModelsPackageImpl theModelsPackage = (ModelsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelsPackageImpl());

        isInited = true;

        // Obtain or create and register interdependencies
        VariablePackageImpl theVariablePackage = (VariablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI) instanceof VariablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI) : VariablePackage.eINSTANCE);

        // Create package meta-data objects
        theModelsPackage.createPackageContents();
        theVariablePackage.createPackageContents();

        // Initialize created meta-data
        theModelsPackage.initializePackageContents();
        theVariablePackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theModelsPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ModelsPackage.eNS_URI, theModelsPackage);
        return theModelsPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMultiplicity() {
        return multiplicityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMultiplicity_LowerBound() {
        return (EAttribute)multiplicityEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMultiplicity_UpperBound() {
        return (EAttribute)multiplicityEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInstantiationHierarchy() {
        return instantiationHierarchyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getModel() {
        return modelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getModel_Description() {
        return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getModel_Filename() {
        return (EAttribute)modelEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getModel_Uri() {
        return (EAttribute)modelEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInstantiationReference() {
        return instantiationReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getElement() {
        return elementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getElement_Id() {
        return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getElement_VisualElements() {
        return (EReference)elementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInstanceHiearchy() {
        return instanceHiearchyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHiearchy() {
        return hiearchyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getReference() {
        return referenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMonetaryAmount() {
        return monetaryAmountEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMonetaryAmount_Amount() {
        return (EAttribute)monetaryAmountEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMonetaryAmount_Currency() {
        return (EReference)monetaryAmountEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCurrency() {
        return currencyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCurrency_Name() {
        return (EAttribute)currencyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCurrency_Acronym() {
        return (EAttribute)currencyEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCurrency_Symbol() {
        return (EAttribute)currencyEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getQuality() {
        return qualityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPattern() {
        return patternEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getShape() {
        return shapeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getShape_Label() {
        return (EAttribute)shapeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getShape_Width() {
        return (EAttribute)shapeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getShape_Height() {
        return (EAttribute)shapeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getShape_X() {
        return (EAttribute)shapeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getShape_Y() {
        return (EAttribute)shapeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getShape_ContainedShapes() {
        return (EReference)shapeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getShape_Color() {
        return (EAttribute)shapeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getShape_ContainerShape() {
        return (EReference)shapeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDiagram() {
        return diagramEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDiagram_Shapes() {
        return (EReference)diagramEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getVisualElement() {
        return visualElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getVisualElement_Element() {
        return (EReference)visualElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTreeNode() {
        return treeNodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getObject() {
        return objectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelsFactory getModelsFactory() {
        return (ModelsFactory)getEFactoryInstance();
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
        multiplicityEClass = createEClass(MULTIPLICITY);
        createEAttribute(multiplicityEClass, MULTIPLICITY__LOWER_BOUND);
        createEAttribute(multiplicityEClass, MULTIPLICITY__UPPER_BOUND);

        instantiationHierarchyEClass = createEClass(INSTANTIATION_HIERARCHY);

        modelEClass = createEClass(MODEL);
        createEAttribute(modelEClass, MODEL__DESCRIPTION);
        createEAttribute(modelEClass, MODEL__FILENAME);
        createEAttribute(modelEClass, MODEL__URI);

        instantiationReferenceEClass = createEClass(INSTANTIATION_REFERENCE);

        elementEClass = createEClass(ELEMENT);
        createEAttribute(elementEClass, ELEMENT__ID);
        createEReference(elementEClass, ELEMENT__VISUAL_ELEMENTS);

        instanceHiearchyEClass = createEClass(INSTANCE_HIEARCHY);

        hiearchyEClass = createEClass(HIEARCHY);

        referenceEClass = createEClass(REFERENCE);

        monetaryAmountEClass = createEClass(MONETARY_AMOUNT);
        createEAttribute(monetaryAmountEClass, MONETARY_AMOUNT__AMOUNT);
        createEReference(monetaryAmountEClass, MONETARY_AMOUNT__CURRENCY);

        currencyEClass = createEClass(CURRENCY);
        createEAttribute(currencyEClass, CURRENCY__NAME);
        createEAttribute(currencyEClass, CURRENCY__ACRONYM);
        createEAttribute(currencyEClass, CURRENCY__SYMBOL);

        qualityEClass = createEClass(QUALITY);

        patternEClass = createEClass(PATTERN);

        shapeEClass = createEClass(SHAPE);
        createEAttribute(shapeEClass, SHAPE__LABEL);
        createEAttribute(shapeEClass, SHAPE__WIDTH);
        createEAttribute(shapeEClass, SHAPE__HEIGHT);
        createEAttribute(shapeEClass, SHAPE__X);
        createEAttribute(shapeEClass, SHAPE__Y);
        createEReference(shapeEClass, SHAPE__CONTAINED_SHAPES);
        createEAttribute(shapeEClass, SHAPE__COLOR);
        createEReference(shapeEClass, SHAPE__CONTAINER_SHAPE);

        diagramEClass = createEClass(DIAGRAM);
        createEReference(diagramEClass, DIAGRAM__SHAPES);

        visualElementEClass = createEClass(VISUAL_ELEMENT);
        createEReference(visualElementEClass, VISUAL_ELEMENT__ELEMENT);

        treeNodeEClass = createEClass(TREE_NODE);

        // Create data types
        objectEDataType = createEDataType(OBJECT);
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
        VariablePackage theVariablePackage = (VariablePackage)EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI);

        // Add subpackages
        getESubpackages().add(theVariablePackage);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        instantiationHierarchyEClass.getESuperTypes().add(this.getHiearchy());
        modelEClass.getESuperTypes().add(this.getElement());
        instantiationReferenceEClass.getESuperTypes().add(this.getReference());
        instanceHiearchyEClass.getESuperTypes().add(this.getHiearchy());
        hiearchyEClass.getESuperTypes().add(this.getElement());
        referenceEClass.getESuperTypes().add(this.getElement());
        patternEClass.getESuperTypes().add(this.getElement());
        shapeEClass.getESuperTypes().add(this.getVisualElement());
        diagramEClass.getESuperTypes().add(this.getVisualElement());
        treeNodeEClass.getESuperTypes().add(this.getVisualElement());

        // Initialize classes, features, and operations; add parameters
        initEClass(multiplicityEClass, Multiplicity.class, "Multiplicity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMultiplicity_LowerBound(), ecorePackage.getEInt(), "lowerBound", null, 0, 1, Multiplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMultiplicity_UpperBound(), ecorePackage.getEInt(), "upperBound", null, 0, 1, Multiplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(instantiationHierarchyEClass, InstantiationHierarchy.class, "InstantiationHierarchy", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(modelEClass, Model.class, "Model", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getModel_Filename(), ecorePackage.getEString(), "filename", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getModel_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(instantiationReferenceEClass, InstantiationReference.class, "InstantiationReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getElement_VisualElements(), this.getVisualElement(), this.getVisualElement_Element(), "visualElements", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(instanceHiearchyEClass, InstanceHiearchy.class, "InstanceHiearchy", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(hiearchyEClass, Hiearchy.class, "Hiearchy", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(referenceEClass, Reference.class, "Reference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(monetaryAmountEClass, MonetaryAmount.class, "MonetaryAmount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMonetaryAmount_Amount(), ecorePackage.getEDouble(), "amount", null, 0, 1, MonetaryAmount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMonetaryAmount_Currency(), this.getCurrency(), null, "currency", null, 1, 1, MonetaryAmount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(currencyEClass, Currency.class, "Currency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCurrency_Name(), ecorePackage.getEString(), "name", null, 0, 1, Currency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCurrency_Acronym(), ecorePackage.getEString(), "acronym", null, 0, 1, Currency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCurrency_Symbol(), ecorePackage.getEString(), "symbol", null, 0, 1, Currency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(qualityEClass, Quality.class, "Quality", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(patternEClass, Pattern.class, "Pattern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(shapeEClass, Shape.class, "Shape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getShape_Label(), ecorePackage.getEString(), "label", null, 0, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getShape_Width(), ecorePackage.getELong(), "width", null, 0, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getShape_Height(), ecorePackage.getELong(), "height", null, 0, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getShape_X(), ecorePackage.getELong(), "x", null, 0, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getShape_Y(), ecorePackage.getELong(), "y", null, 0, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getShape_ContainedShapes(), this.getShape(), this.getShape_ContainerShape(), "containedShapes", null, 0, -1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getShape_Color(), ecorePackage.getEString(), "color", null, 0, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getShape_ContainerShape(), this.getShape(), this.getShape_ContainedShapes(), "containerShape", null, 0, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(diagramEClass, Diagram.class, "Diagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDiagram_Shapes(), this.getShape(), null, "shapes", null, 0, -1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(visualElementEClass, VisualElement.class, "VisualElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getVisualElement_Element(), this.getElement(), this.getElement_VisualElements(), "element", null, 0, 1, VisualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(treeNodeEClass, TreeNode.class, "TreeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Initialize data types
        initEDataType(objectEDataType, Object.class, "Object", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //ModelsPackageImpl
