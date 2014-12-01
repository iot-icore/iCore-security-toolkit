/**
 */
package models;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see models.ModelsFactory
 * @model kind="package"
 * @generated
 */
public interface ModelsPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "models";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://models/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "models";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ModelsPackage eINSTANCE = models.impl.ModelsPackageImpl.init();

    /**
     * The meta object id for the '{@link models.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see models.impl.MultiplicityImpl
     * @see models.impl.ModelsPackageImpl#getMultiplicity()
     * @generated
     */
    int MULTIPLICITY = 0;

    /**
     * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICITY__LOWER_BOUND = 0;

    /**
     * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICITY__UPPER_BOUND = 1;

    /**
     * The number of structural features of the '<em>Multiplicity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICITY_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Multiplicity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICITY_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link models.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see models.impl.ElementImpl
     * @see models.impl.ModelsPackageImpl#getElement()
     * @generated
     */
    int ELEMENT = 4;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__ID = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__VISUAL_ELEMENTS = 1;

    /**
     * The number of structural features of the '<em>Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link models.impl.HiearchyImpl <em>Hiearchy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see models.impl.HiearchyImpl
     * @see models.impl.ModelsPackageImpl#getHiearchy()
     * @generated
     */
    int HIEARCHY = 6;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIEARCHY__ID = ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIEARCHY__VISUAL_ELEMENTS = ELEMENT__VISUAL_ELEMENTS;

    /**
     * The number of structural features of the '<em>Hiearchy</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIEARCHY_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Hiearchy</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIEARCHY_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link models.impl.InstantiationHierarchyImpl <em>Instantiation Hierarchy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see models.impl.InstantiationHierarchyImpl
     * @see models.impl.ModelsPackageImpl#getInstantiationHierarchy()
     * @generated
     */
    int INSTANTIATION_HIERARCHY = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION_HIERARCHY__ID = HIEARCHY__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION_HIERARCHY__VISUAL_ELEMENTS = HIEARCHY__VISUAL_ELEMENTS;

    /**
     * The number of structural features of the '<em>Instantiation Hierarchy</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION_HIERARCHY_FEATURE_COUNT = HIEARCHY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Instantiation Hierarchy</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION_HIERARCHY_OPERATION_COUNT = HIEARCHY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link models.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see models.impl.ModelImpl
     * @see models.impl.ModelsPackageImpl#getModel()
     * @generated
     */
    int MODEL = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__ID = ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__VISUAL_ELEMENTS = ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__DESCRIPTION = ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__FILENAME = ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__URI = ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link models.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see models.impl.ReferenceImpl
     * @see models.impl.ModelsPackageImpl#getReference()
     * @generated
     */
    int REFERENCE = 7;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE__ID = ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE__VISUAL_ELEMENTS = ELEMENT__VISUAL_ELEMENTS;

    /**
     * The number of structural features of the '<em>Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link models.impl.InstantiationReferenceImpl <em>Instantiation Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see models.impl.InstantiationReferenceImpl
     * @see models.impl.ModelsPackageImpl#getInstantiationReference()
     * @generated
     */
    int INSTANTIATION_REFERENCE = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION_REFERENCE__ID = REFERENCE__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION_REFERENCE__VISUAL_ELEMENTS = REFERENCE__VISUAL_ELEMENTS;

    /**
     * The number of structural features of the '<em>Instantiation Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION_REFERENCE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Instantiation Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANTIATION_REFERENCE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link models.impl.InstanceHiearchyImpl <em>Instance Hiearchy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see models.impl.InstanceHiearchyImpl
     * @see models.impl.ModelsPackageImpl#getInstanceHiearchy()
     * @generated
     */
    int INSTANCE_HIEARCHY = 5;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_HIEARCHY__ID = HIEARCHY__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_HIEARCHY__VISUAL_ELEMENTS = HIEARCHY__VISUAL_ELEMENTS;

    /**
     * The number of structural features of the '<em>Instance Hiearchy</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_HIEARCHY_FEATURE_COUNT = HIEARCHY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Instance Hiearchy</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INSTANCE_HIEARCHY_OPERATION_COUNT = HIEARCHY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link models.impl.MonetaryAmountImpl <em>Monetary Amount</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see models.impl.MonetaryAmountImpl
     * @see models.impl.ModelsPackageImpl#getMonetaryAmount()
     * @generated
     */
    int MONETARY_AMOUNT = 8;

    /**
     * The feature id for the '<em><b>Amount</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MONETARY_AMOUNT__AMOUNT = 0;

    /**
     * The feature id for the '<em><b>Currency</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MONETARY_AMOUNT__CURRENCY = 1;

    /**
     * The number of structural features of the '<em>Monetary Amount</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MONETARY_AMOUNT_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Monetary Amount</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MONETARY_AMOUNT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link models.impl.CurrencyImpl <em>Currency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see models.impl.CurrencyImpl
     * @see models.impl.ModelsPackageImpl#getCurrency()
     * @generated
     */
    int CURRENCY = 9;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CURRENCY__NAME = 0;

    /**
     * The feature id for the '<em><b>Acronym</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CURRENCY__ACRONYM = 1;

    /**
     * The feature id for the '<em><b>Symbol</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CURRENCY__SYMBOL = 2;

    /**
     * The number of structural features of the '<em>Currency</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CURRENCY_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Currency</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CURRENCY_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link models.impl.QualityImpl <em>Quality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see models.impl.QualityImpl
     * @see models.impl.ModelsPackageImpl#getQuality()
     * @generated
     */
    int QUALITY = 10;

    /**
     * The number of structural features of the '<em>Quality</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Quality</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link models.impl.PatternImpl <em>Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see models.impl.PatternImpl
     * @see models.impl.ModelsPackageImpl#getPattern()
     * @generated
     */
    int PATTERN = 11;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN__ID = ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN__VISUAL_ELEMENTS = ELEMENT__VISUAL_ELEMENTS;

    /**
     * The number of structural features of the '<em>Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link models.impl.VisualElementImpl <em>Visual Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see models.impl.VisualElementImpl
     * @see models.impl.ModelsPackageImpl#getVisualElement()
     * @generated
     */
    int VISUAL_ELEMENT = 14;

    /**
     * The feature id for the '<em><b>Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VISUAL_ELEMENT__ELEMENT = 0;

    /**
     * The number of structural features of the '<em>Visual Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VISUAL_ELEMENT_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Visual Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VISUAL_ELEMENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link models.impl.ShapeImpl <em>Shape</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see models.impl.ShapeImpl
     * @see models.impl.ModelsPackageImpl#getShape()
     * @generated
     */
    int SHAPE = 12;

    /**
     * The feature id for the '<em><b>Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHAPE__ELEMENT = VISUAL_ELEMENT__ELEMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHAPE__LABEL = VISUAL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Width</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHAPE__WIDTH = VISUAL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Height</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHAPE__HEIGHT = VISUAL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHAPE__X = VISUAL_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHAPE__Y = VISUAL_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Contained Shapes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHAPE__CONTAINED_SHAPES = VISUAL_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Color</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHAPE__COLOR = VISUAL_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Container Shape</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHAPE__CONTAINER_SHAPE = VISUAL_ELEMENT_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Shape</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHAPE_FEATURE_COUNT = VISUAL_ELEMENT_FEATURE_COUNT + 8;

    /**
     * The number of operations of the '<em>Shape</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHAPE_OPERATION_COUNT = VISUAL_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link models.impl.DiagramImpl <em>Diagram</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see models.impl.DiagramImpl
     * @see models.impl.ModelsPackageImpl#getDiagram()
     * @generated
     */
    int DIAGRAM = 13;

    /**
     * The feature id for the '<em><b>Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM__ELEMENT = VISUAL_ELEMENT__ELEMENT;

    /**
     * The feature id for the '<em><b>Shapes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM__SHAPES = VISUAL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Diagram</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_FEATURE_COUNT = VISUAL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Diagram</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_OPERATION_COUNT = VISUAL_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link models.impl.TreeNodeImpl <em>Tree Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see models.impl.TreeNodeImpl
     * @see models.impl.ModelsPackageImpl#getTreeNode()
     * @generated
     */
    int TREE_NODE = 15;

    /**
     * The feature id for the '<em><b>Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREE_NODE__ELEMENT = VISUAL_ELEMENT__ELEMENT;

    /**
     * The number of structural features of the '<em>Tree Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREE_NODE_FEATURE_COUNT = VISUAL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Tree Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREE_NODE_OPERATION_COUNT = VISUAL_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '<em>Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Object
     * @see models.impl.ModelsPackageImpl#getObject()
     * @generated
     */
    int OBJECT = 16;


    /**
     * Returns the meta object for class '{@link models.Multiplicity <em>Multiplicity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Multiplicity</em>'.
     * @see models.Multiplicity
     * @generated
     */
    EClass getMultiplicity();

    /**
     * Returns the meta object for the attribute '{@link models.Multiplicity#getLowerBound <em>Lower Bound</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lower Bound</em>'.
     * @see models.Multiplicity#getLowerBound()
     * @see #getMultiplicity()
     * @generated
     */
    EAttribute getMultiplicity_LowerBound();

    /**
     * Returns the meta object for the attribute '{@link models.Multiplicity#getUpperBound <em>Upper Bound</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Upper Bound</em>'.
     * @see models.Multiplicity#getUpperBound()
     * @see #getMultiplicity()
     * @generated
     */
    EAttribute getMultiplicity_UpperBound();

    /**
     * Returns the meta object for class '{@link models.InstantiationHierarchy <em>Instantiation Hierarchy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Instantiation Hierarchy</em>'.
     * @see models.InstantiationHierarchy
     * @generated
     */
    EClass getInstantiationHierarchy();

    /**
     * Returns the meta object for class '{@link models.Model <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Model</em>'.
     * @see models.Model
     * @generated
     */
    EClass getModel();

    /**
     * Returns the meta object for the attribute '{@link models.Model#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see models.Model#getDescription()
     * @see #getModel()
     * @generated
     */
    EAttribute getModel_Description();

    /**
     * Returns the meta object for the attribute '{@link models.Model#getFilename <em>Filename</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Filename</em>'.
     * @see models.Model#getFilename()
     * @see #getModel()
     * @generated
     */
    EAttribute getModel_Filename();

    /**
     * Returns the meta object for the attribute '{@link models.Model#getUri <em>Uri</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Uri</em>'.
     * @see models.Model#getUri()
     * @see #getModel()
     * @generated
     */
    EAttribute getModel_Uri();

    /**
     * Returns the meta object for class '{@link models.InstantiationReference <em>Instantiation Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Instantiation Reference</em>'.
     * @see models.InstantiationReference
     * @generated
     */
    EClass getInstantiationReference();

    /**
     * Returns the meta object for class '{@link models.Element <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Element</em>'.
     * @see models.Element
     * @generated
     */
    EClass getElement();

    /**
     * Returns the meta object for the attribute '{@link models.Element#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see models.Element#getId()
     * @see #getElement()
     * @generated
     */
    EAttribute getElement_Id();

    /**
     * Returns the meta object for the reference list '{@link models.Element#getVisualElements <em>Visual Elements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Visual Elements</em>'.
     * @see models.Element#getVisualElements()
     * @see #getElement()
     * @generated
     */
    EReference getElement_VisualElements();

    /**
     * Returns the meta object for class '{@link models.InstanceHiearchy <em>Instance Hiearchy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Instance Hiearchy</em>'.
     * @see models.InstanceHiearchy
     * @generated
     */
    EClass getInstanceHiearchy();

    /**
     * Returns the meta object for class '{@link models.Hiearchy <em>Hiearchy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hiearchy</em>'.
     * @see models.Hiearchy
     * @generated
     */
    EClass getHiearchy();

    /**
     * Returns the meta object for class '{@link models.Reference <em>Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Reference</em>'.
     * @see models.Reference
     * @generated
     */
    EClass getReference();

    /**
     * Returns the meta object for class '{@link models.MonetaryAmount <em>Monetary Amount</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Monetary Amount</em>'.
     * @see models.MonetaryAmount
     * @generated
     */
    EClass getMonetaryAmount();

    /**
     * Returns the meta object for the attribute '{@link models.MonetaryAmount#getAmount <em>Amount</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Amount</em>'.
     * @see models.MonetaryAmount#getAmount()
     * @see #getMonetaryAmount()
     * @generated
     */
    EAttribute getMonetaryAmount_Amount();

    /**
     * Returns the meta object for the containment reference '{@link models.MonetaryAmount#getCurrency <em>Currency</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Currency</em>'.
     * @see models.MonetaryAmount#getCurrency()
     * @see #getMonetaryAmount()
     * @generated
     */
    EReference getMonetaryAmount_Currency();

    /**
     * Returns the meta object for class '{@link models.Currency <em>Currency</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Currency</em>'.
     * @see models.Currency
     * @generated
     */
    EClass getCurrency();

    /**
     * Returns the meta object for the attribute '{@link models.Currency#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see models.Currency#getName()
     * @see #getCurrency()
     * @generated
     */
    EAttribute getCurrency_Name();

    /**
     * Returns the meta object for the attribute '{@link models.Currency#getAcronym <em>Acronym</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Acronym</em>'.
     * @see models.Currency#getAcronym()
     * @see #getCurrency()
     * @generated
     */
    EAttribute getCurrency_Acronym();

    /**
     * Returns the meta object for the attribute '{@link models.Currency#getSymbol <em>Symbol</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Symbol</em>'.
     * @see models.Currency#getSymbol()
     * @see #getCurrency()
     * @generated
     */
    EAttribute getCurrency_Symbol();

    /**
     * Returns the meta object for class '{@link models.Quality <em>Quality</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Quality</em>'.
     * @see models.Quality
     * @generated
     */
    EClass getQuality();

    /**
     * Returns the meta object for class '{@link models.Pattern <em>Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Pattern</em>'.
     * @see models.Pattern
     * @generated
     */
    EClass getPattern();

    /**
     * Returns the meta object for class '{@link models.Shape <em>Shape</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Shape</em>'.
     * @see models.Shape
     * @generated
     */
    EClass getShape();

    /**
     * Returns the meta object for the attribute '{@link models.Shape#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see models.Shape#getLabel()
     * @see #getShape()
     * @generated
     */
    EAttribute getShape_Label();

    /**
     * Returns the meta object for the attribute '{@link models.Shape#getWidth <em>Width</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Width</em>'.
     * @see models.Shape#getWidth()
     * @see #getShape()
     * @generated
     */
    EAttribute getShape_Width();

    /**
     * Returns the meta object for the attribute '{@link models.Shape#getHeight <em>Height</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Height</em>'.
     * @see models.Shape#getHeight()
     * @see #getShape()
     * @generated
     */
    EAttribute getShape_Height();

    /**
     * Returns the meta object for the attribute '{@link models.Shape#getX <em>X</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>X</em>'.
     * @see models.Shape#getX()
     * @see #getShape()
     * @generated
     */
    EAttribute getShape_X();

    /**
     * Returns the meta object for the attribute '{@link models.Shape#getY <em>Y</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Y</em>'.
     * @see models.Shape#getY()
     * @see #getShape()
     * @generated
     */
    EAttribute getShape_Y();

    /**
     * Returns the meta object for the containment reference list '{@link models.Shape#getContainedShapes <em>Contained Shapes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Contained Shapes</em>'.
     * @see models.Shape#getContainedShapes()
     * @see #getShape()
     * @generated
     */
    EReference getShape_ContainedShapes();

    /**
     * Returns the meta object for the attribute '{@link models.Shape#getColor <em>Color</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Color</em>'.
     * @see models.Shape#getColor()
     * @see #getShape()
     * @generated
     */
    EAttribute getShape_Color();

    /**
     * Returns the meta object for the container reference '{@link models.Shape#getContainerShape <em>Container Shape</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Container Shape</em>'.
     * @see models.Shape#getContainerShape()
     * @see #getShape()
     * @generated
     */
    EReference getShape_ContainerShape();

    /**
     * Returns the meta object for class '{@link models.Diagram <em>Diagram</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Diagram</em>'.
     * @see models.Diagram
     * @generated
     */
    EClass getDiagram();

    /**
     * Returns the meta object for the containment reference list '{@link models.Diagram#getShapes <em>Shapes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Shapes</em>'.
     * @see models.Diagram#getShapes()
     * @see #getDiagram()
     * @generated
     */
    EReference getDiagram_Shapes();

    /**
     * Returns the meta object for class '{@link models.VisualElement <em>Visual Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Visual Element</em>'.
     * @see models.VisualElement
     * @generated
     */
    EClass getVisualElement();

    /**
     * Returns the meta object for the reference '{@link models.VisualElement#getElement <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Element</em>'.
     * @see models.VisualElement#getElement()
     * @see #getVisualElement()
     * @generated
     */
    EReference getVisualElement_Element();

    /**
     * Returns the meta object for class '{@link models.TreeNode <em>Tree Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Tree Node</em>'.
     * @see models.TreeNode
     * @generated
     */
    EClass getTreeNode();

    /**
     * Returns the meta object for data type '{@link java.lang.Object <em>Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Object</em>'.
     * @see java.lang.Object
     * @model instanceClass="java.lang.Object"
     * @generated
     */
    EDataType getObject();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ModelsFactory getModelsFactory();

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
         * The meta object literal for the '{@link models.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see models.impl.MultiplicityImpl
         * @see models.impl.ModelsPackageImpl#getMultiplicity()
         * @generated
         */
        EClass MULTIPLICITY = eINSTANCE.getMultiplicity();

        /**
         * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MULTIPLICITY__LOWER_BOUND = eINSTANCE.getMultiplicity_LowerBound();

        /**
         * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MULTIPLICITY__UPPER_BOUND = eINSTANCE.getMultiplicity_UpperBound();

        /**
         * The meta object literal for the '{@link models.impl.InstantiationHierarchyImpl <em>Instantiation Hierarchy</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see models.impl.InstantiationHierarchyImpl
         * @see models.impl.ModelsPackageImpl#getInstantiationHierarchy()
         * @generated
         */
        EClass INSTANTIATION_HIERARCHY = eINSTANCE.getInstantiationHierarchy();

        /**
         * The meta object literal for the '{@link models.impl.ModelImpl <em>Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see models.impl.ModelImpl
         * @see models.impl.ModelsPackageImpl#getModel()
         * @generated
         */
        EClass MODEL = eINSTANCE.getModel();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL__DESCRIPTION = eINSTANCE.getModel_Description();

        /**
         * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL__FILENAME = eINSTANCE.getModel_Filename();

        /**
         * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL__URI = eINSTANCE.getModel_Uri();

        /**
         * The meta object literal for the '{@link models.impl.InstantiationReferenceImpl <em>Instantiation Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see models.impl.InstantiationReferenceImpl
         * @see models.impl.ModelsPackageImpl#getInstantiationReference()
         * @generated
         */
        EClass INSTANTIATION_REFERENCE = eINSTANCE.getInstantiationReference();

        /**
         * The meta object literal for the '{@link models.impl.ElementImpl <em>Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see models.impl.ElementImpl
         * @see models.impl.ModelsPackageImpl#getElement()
         * @generated
         */
        EClass ELEMENT = eINSTANCE.getElement();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT__ID = eINSTANCE.getElement_Id();

        /**
         * The meta object literal for the '<em><b>Visual Elements</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELEMENT__VISUAL_ELEMENTS = eINSTANCE.getElement_VisualElements();

        /**
         * The meta object literal for the '{@link models.impl.InstanceHiearchyImpl <em>Instance Hiearchy</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see models.impl.InstanceHiearchyImpl
         * @see models.impl.ModelsPackageImpl#getInstanceHiearchy()
         * @generated
         */
        EClass INSTANCE_HIEARCHY = eINSTANCE.getInstanceHiearchy();

        /**
         * The meta object literal for the '{@link models.impl.HiearchyImpl <em>Hiearchy</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see models.impl.HiearchyImpl
         * @see models.impl.ModelsPackageImpl#getHiearchy()
         * @generated
         */
        EClass HIEARCHY = eINSTANCE.getHiearchy();

        /**
         * The meta object literal for the '{@link models.impl.ReferenceImpl <em>Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see models.impl.ReferenceImpl
         * @see models.impl.ModelsPackageImpl#getReference()
         * @generated
         */
        EClass REFERENCE = eINSTANCE.getReference();

        /**
         * The meta object literal for the '{@link models.impl.MonetaryAmountImpl <em>Monetary Amount</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see models.impl.MonetaryAmountImpl
         * @see models.impl.ModelsPackageImpl#getMonetaryAmount()
         * @generated
         */
        EClass MONETARY_AMOUNT = eINSTANCE.getMonetaryAmount();

        /**
         * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MONETARY_AMOUNT__AMOUNT = eINSTANCE.getMonetaryAmount_Amount();

        /**
         * The meta object literal for the '<em><b>Currency</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MONETARY_AMOUNT__CURRENCY = eINSTANCE.getMonetaryAmount_Currency();

        /**
         * The meta object literal for the '{@link models.impl.CurrencyImpl <em>Currency</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see models.impl.CurrencyImpl
         * @see models.impl.ModelsPackageImpl#getCurrency()
         * @generated
         */
        EClass CURRENCY = eINSTANCE.getCurrency();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CURRENCY__NAME = eINSTANCE.getCurrency_Name();

        /**
         * The meta object literal for the '<em><b>Acronym</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CURRENCY__ACRONYM = eINSTANCE.getCurrency_Acronym();

        /**
         * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CURRENCY__SYMBOL = eINSTANCE.getCurrency_Symbol();

        /**
         * The meta object literal for the '{@link models.impl.QualityImpl <em>Quality</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see models.impl.QualityImpl
         * @see models.impl.ModelsPackageImpl#getQuality()
         * @generated
         */
        EClass QUALITY = eINSTANCE.getQuality();

        /**
         * The meta object literal for the '{@link models.impl.PatternImpl <em>Pattern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see models.impl.PatternImpl
         * @see models.impl.ModelsPackageImpl#getPattern()
         * @generated
         */
        EClass PATTERN = eINSTANCE.getPattern();

        /**
         * The meta object literal for the '{@link models.impl.ShapeImpl <em>Shape</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see models.impl.ShapeImpl
         * @see models.impl.ModelsPackageImpl#getShape()
         * @generated
         */
        EClass SHAPE = eINSTANCE.getShape();

        /**
         * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SHAPE__LABEL = eINSTANCE.getShape_Label();

        /**
         * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SHAPE__WIDTH = eINSTANCE.getShape_Width();

        /**
         * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SHAPE__HEIGHT = eINSTANCE.getShape_Height();

        /**
         * The meta object literal for the '<em><b>X</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SHAPE__X = eINSTANCE.getShape_X();

        /**
         * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SHAPE__Y = eINSTANCE.getShape_Y();

        /**
         * The meta object literal for the '<em><b>Contained Shapes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SHAPE__CONTAINED_SHAPES = eINSTANCE.getShape_ContainedShapes();

        /**
         * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SHAPE__COLOR = eINSTANCE.getShape_Color();

        /**
         * The meta object literal for the '<em><b>Container Shape</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SHAPE__CONTAINER_SHAPE = eINSTANCE.getShape_ContainerShape();

        /**
         * The meta object literal for the '{@link models.impl.DiagramImpl <em>Diagram</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see models.impl.DiagramImpl
         * @see models.impl.ModelsPackageImpl#getDiagram()
         * @generated
         */
        EClass DIAGRAM = eINSTANCE.getDiagram();

        /**
         * The meta object literal for the '<em><b>Shapes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DIAGRAM__SHAPES = eINSTANCE.getDiagram_Shapes();

        /**
         * The meta object literal for the '{@link models.impl.VisualElementImpl <em>Visual Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see models.impl.VisualElementImpl
         * @see models.impl.ModelsPackageImpl#getVisualElement()
         * @generated
         */
        EClass VISUAL_ELEMENT = eINSTANCE.getVisualElement();

        /**
         * The meta object literal for the '<em><b>Element</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VISUAL_ELEMENT__ELEMENT = eINSTANCE.getVisualElement_Element();

        /**
         * The meta object literal for the '{@link models.impl.TreeNodeImpl <em>Tree Node</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see models.impl.TreeNodeImpl
         * @see models.impl.ModelsPackageImpl#getTreeNode()
         * @generated
         */
        EClass TREE_NODE = eINSTANCE.getTreeNode();

        /**
         * The meta object literal for the '<em>Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Object
         * @see models.impl.ModelsPackageImpl#getObject()
         * @generated
         */
        EDataType OBJECT = eINSTANCE.getObject();

    }

} //ModelsPackage
