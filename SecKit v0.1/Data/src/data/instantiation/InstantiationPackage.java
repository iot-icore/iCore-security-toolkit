/**
 */
package data.instantiation;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see data.instantiation.InstantiationFactory
 * @model kind="package"
 * @generated
 */
public interface InstantiationPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "instantiation";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://data/instantiation/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "data-instantiation";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    InstantiationPackage eINSTANCE = data.instantiation.impl.InstantiationPackageImpl.init();

    /**
     * The meta object id for the '{@link data.instantiation.impl.AddressInstantiationImpl <em>Address Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.instantiation.impl.AddressInstantiationImpl
     * @see data.instantiation.impl.InstantiationPackageImpl#getAddressInstantiation()
     * @generated
     */
    int ADDRESS_INSTANTIATION = 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS_INSTANTIATION__TYPE = 0;

    /**
     * The number of structural features of the '<em>Address Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS_INSTANTIATION_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Address Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS_INSTANTIATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link data.instantiation.impl.AbstractDataInstantiationImpl <em>Abstract Data Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.instantiation.impl.AbstractDataInstantiationImpl
     * @see data.instantiation.impl.InstantiationPackageImpl#getAbstractDataInstantiation()
     * @generated
     */
    int ABSTRACT_DATA_INSTANTIATION = 2;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_INSTANTIATION__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_INSTANTIATION__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Contained Data Set</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_INSTANTIATION__CONTAINED_DATA_SET = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_INSTANTIATION__TYPE = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Abstract Data Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_INSTANTIATION_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Abstract Data Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_INSTANTIATION_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.instantiation.impl.DataInstantiationImpl <em>Data Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.instantiation.impl.DataInstantiationImpl
     * @see data.instantiation.impl.InstantiationPackageImpl#getDataInstantiation()
     * @generated
     */
    int DATA_INSTANTIATION = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANTIATION__VISUAL_ELEMENTS = ABSTRACT_DATA_INSTANTIATION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANTIATION__ID = ABSTRACT_DATA_INSTANTIATION__ID;

    /**
     * The feature id for the '<em><b>Contained Data Set</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANTIATION__CONTAINED_DATA_SET = ABSTRACT_DATA_INSTANTIATION__CONTAINED_DATA_SET;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANTIATION__TYPE = ABSTRACT_DATA_INSTANTIATION__TYPE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANTIATION__NAME = ABSTRACT_DATA_INSTANTIATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANTIATION__INSTANCES = ABSTRACT_DATA_INSTANTIATION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Array</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANTIATION__ARRAY = ABSTRACT_DATA_INSTANTIATION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANTIATION__DESCRIPTION = ABSTRACT_DATA_INSTANTIATION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Patterns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANTIATION__PATTERNS = ABSTRACT_DATA_INSTANTIATION_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Data Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANTIATION_FEATURE_COUNT = ABSTRACT_DATA_INSTANTIATION_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Data Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANTIATION_OPERATION_COUNT = ABSTRACT_DATA_INSTANTIATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.instantiation.impl.DataInstantiationHierarchyImpl <em>Data Instantiation Hierarchy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.instantiation.impl.DataInstantiationHierarchyImpl
     * @see data.instantiation.impl.InstantiationPackageImpl#getDataInstantiationHierarchy()
     * @generated
     */
    int DATA_INSTANTIATION_HIERARCHY = 3;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANTIATION_HIERARCHY__VISUAL_ELEMENTS = ModelsPackage.INSTANTIATION_HIERARCHY__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANTIATION_HIERARCHY__ID = ModelsPackage.INSTANTIATION_HIERARCHY__ID;

    /**
     * The feature id for the '<em><b>Root</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANTIATION_HIERARCHY__ROOT = ModelsPackage.INSTANTIATION_HIERARCHY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Data Instantiation Hierarchy</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANTIATION_HIERARCHY_FEATURE_COUNT = ModelsPackage.INSTANTIATION_HIERARCHY_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Data Instantiation Hierarchy</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANTIATION_HIERARCHY_OPERATION_COUNT = ModelsPackage.INSTANTIATION_HIERARCHY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.instantiation.impl.DataInstantiationReferenceImpl <em>Data Instantiation Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.instantiation.impl.DataInstantiationReferenceImpl
     * @see data.instantiation.impl.InstantiationPackageImpl#getDataInstantiationReference()
     * @generated
     */
    int DATA_INSTANTIATION_REFERENCE = 4;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANTIATION_REFERENCE__VISUAL_ELEMENTS = ModelsPackage.INSTANTIATION_REFERENCE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANTIATION_REFERENCE__ID = ModelsPackage.INSTANTIATION_REFERENCE__ID;

    /**
     * The feature id for the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANTIATION_REFERENCE__INSTANTIATION = ModelsPackage.INSTANTIATION_REFERENCE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Child</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANTIATION_REFERENCE__CHILD = ModelsPackage.INSTANTIATION_REFERENCE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Data Instantiation Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANTIATION_REFERENCE_FEATURE_COUNT = ModelsPackage.INSTANTIATION_REFERENCE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Data Instantiation Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANTIATION_REFERENCE_OPERATION_COUNT = ModelsPackage.INSTANTIATION_REFERENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.instantiation.impl.AddressSpaceInstantiationImpl <em>Address Space Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.instantiation.impl.AddressSpaceInstantiationImpl
     * @see data.instantiation.impl.InstantiationPackageImpl#getAddressSpaceInstantiation()
     * @generated
     */
    int ADDRESS_SPACE_INSTANTIATION = 5;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS_SPACE_INSTANTIATION__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS_SPACE_INSTANTIATION__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS_SPACE_INSTANTIATION__TYPE = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS_SPACE_INSTANTIATION__INSTANCES = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS_SPACE_INSTANTIATION__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Address Space Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS_SPACE_INSTANTIATION_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Address Space Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS_SPACE_INSTANTIATION_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link data.instantiation.AddressInstantiation <em>Address Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Address Instantiation</em>'.
     * @see data.instantiation.AddressInstantiation
     * @generated
     */
    EClass getAddressInstantiation();

    /**
     * Returns the meta object for the reference '{@link data.instantiation.AddressInstantiation#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see data.instantiation.AddressInstantiation#getType()
     * @see #getAddressInstantiation()
     * @generated
     */
    EReference getAddressInstantiation_Type();

    /**
     * Returns the meta object for class '{@link data.instantiation.DataInstantiation <em>Data Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Instantiation</em>'.
     * @see data.instantiation.DataInstantiation
     * @generated
     */
    EClass getDataInstantiation();

    /**
     * Returns the meta object for the attribute '{@link data.instantiation.DataInstantiation#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see data.instantiation.DataInstantiation#getName()
     * @see #getDataInstantiation()
     * @generated
     */
    EAttribute getDataInstantiation_Name();

    /**
     * Returns the meta object for the reference list '{@link data.instantiation.DataInstantiation#getInstances <em>Instances</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Instances</em>'.
     * @see data.instantiation.DataInstantiation#getInstances()
     * @see #getDataInstantiation()
     * @generated
     */
    EReference getDataInstantiation_Instances();

    /**
     * Returns the meta object for the attribute '{@link data.instantiation.DataInstantiation#isArray <em>Array</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Array</em>'.
     * @see data.instantiation.DataInstantiation#isArray()
     * @see #getDataInstantiation()
     * @generated
     */
    EAttribute getDataInstantiation_Array();

    /**
     * Returns the meta object for the attribute '{@link data.instantiation.DataInstantiation#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see data.instantiation.DataInstantiation#getDescription()
     * @see #getDataInstantiation()
     * @generated
     */
    EAttribute getDataInstantiation_Description();

    /**
     * Returns the meta object for the reference list '{@link data.instantiation.DataInstantiation#getPatterns <em>Patterns</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Patterns</em>'.
     * @see data.instantiation.DataInstantiation#getPatterns()
     * @see #getDataInstantiation()
     * @generated
     */
    EReference getDataInstantiation_Patterns();

    /**
     * Returns the meta object for class '{@link data.instantiation.AbstractDataInstantiation <em>Abstract Data Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Data Instantiation</em>'.
     * @see data.instantiation.AbstractDataInstantiation
     * @generated
     */
    EClass getAbstractDataInstantiation();

    /**
     * Returns the meta object for the reference '{@link data.instantiation.AbstractDataInstantiation#getContainedDataSet <em>Contained Data Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Contained Data Set</em>'.
     * @see data.instantiation.AbstractDataInstantiation#getContainedDataSet()
     * @see #getAbstractDataInstantiation()
     * @generated
     */
    EReference getAbstractDataInstantiation_ContainedDataSet();

    /**
     * Returns the meta object for the reference '{@link data.instantiation.AbstractDataInstantiation#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see data.instantiation.AbstractDataInstantiation#getType()
     * @see #getAbstractDataInstantiation()
     * @generated
     */
    EReference getAbstractDataInstantiation_Type();

    /**
     * Returns the meta object for class '{@link data.instantiation.DataInstantiationHierarchy <em>Data Instantiation Hierarchy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Instantiation Hierarchy</em>'.
     * @see data.instantiation.DataInstantiationHierarchy
     * @generated
     */
    EClass getDataInstantiationHierarchy();

    /**
     * Returns the meta object for the containment reference '{@link data.instantiation.DataInstantiationHierarchy#getRoot <em>Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Root</em>'.
     * @see data.instantiation.DataInstantiationHierarchy#getRoot()
     * @see #getDataInstantiationHierarchy()
     * @generated
     */
    EReference getDataInstantiationHierarchy_Root();

    /**
     * Returns the meta object for class '{@link data.instantiation.DataInstantiationReference <em>Data Instantiation Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Instantiation Reference</em>'.
     * @see data.instantiation.DataInstantiationReference
     * @generated
     */
    EClass getDataInstantiationReference();

    /**
     * Returns the meta object for the reference '{@link data.instantiation.DataInstantiationReference#getInstantiation <em>Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Instantiation</em>'.
     * @see data.instantiation.DataInstantiationReference#getInstantiation()
     * @see #getDataInstantiationReference()
     * @generated
     */
    EReference getDataInstantiationReference_Instantiation();

    /**
     * Returns the meta object for the containment reference '{@link data.instantiation.DataInstantiationReference#getChild <em>Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Child</em>'.
     * @see data.instantiation.DataInstantiationReference#getChild()
     * @see #getDataInstantiationReference()
     * @generated
     */
    EReference getDataInstantiationReference_Child();

    /**
     * Returns the meta object for class '{@link data.instantiation.AddressSpaceInstantiation <em>Address Space Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Address Space Instantiation</em>'.
     * @see data.instantiation.AddressSpaceInstantiation
     * @generated
     */
    EClass getAddressSpaceInstantiation();

    /**
     * Returns the meta object for the reference '{@link data.instantiation.AddressSpaceInstantiation#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see data.instantiation.AddressSpaceInstantiation#getType()
     * @see #getAddressSpaceInstantiation()
     * @generated
     */
    EReference getAddressSpaceInstantiation_Type();

    /**
     * Returns the meta object for the reference list '{@link data.instantiation.AddressSpaceInstantiation#getInstances <em>Instances</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Instances</em>'.
     * @see data.instantiation.AddressSpaceInstantiation#getInstances()
     * @see #getAddressSpaceInstantiation()
     * @generated
     */
    EReference getAddressSpaceInstantiation_Instances();

    /**
     * Returns the meta object for the attribute '{@link data.instantiation.AddressSpaceInstantiation#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see data.instantiation.AddressSpaceInstantiation#getName()
     * @see #getAddressSpaceInstantiation()
     * @generated
     */
    EAttribute getAddressSpaceInstantiation_Name();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    InstantiationFactory getInstantiationFactory();

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
         * The meta object literal for the '{@link data.instantiation.impl.AddressInstantiationImpl <em>Address Instantiation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.instantiation.impl.AddressInstantiationImpl
         * @see data.instantiation.impl.InstantiationPackageImpl#getAddressInstantiation()
         * @generated
         */
        EClass ADDRESS_INSTANTIATION = eINSTANCE.getAddressInstantiation();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ADDRESS_INSTANTIATION__TYPE = eINSTANCE.getAddressInstantiation_Type();

        /**
         * The meta object literal for the '{@link data.instantiation.impl.DataInstantiationImpl <em>Data Instantiation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.instantiation.impl.DataInstantiationImpl
         * @see data.instantiation.impl.InstantiationPackageImpl#getDataInstantiation()
         * @generated
         */
        EClass DATA_INSTANTIATION = eINSTANCE.getDataInstantiation();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_INSTANTIATION__NAME = eINSTANCE.getDataInstantiation_Name();

        /**
         * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_INSTANTIATION__INSTANCES = eINSTANCE.getDataInstantiation_Instances();

        /**
         * The meta object literal for the '<em><b>Array</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_INSTANTIATION__ARRAY = eINSTANCE.getDataInstantiation_Array();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_INSTANTIATION__DESCRIPTION = eINSTANCE.getDataInstantiation_Description();

        /**
         * The meta object literal for the '<em><b>Patterns</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_INSTANTIATION__PATTERNS = eINSTANCE.getDataInstantiation_Patterns();

        /**
         * The meta object literal for the '{@link data.instantiation.impl.AbstractDataInstantiationImpl <em>Abstract Data Instantiation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.instantiation.impl.AbstractDataInstantiationImpl
         * @see data.instantiation.impl.InstantiationPackageImpl#getAbstractDataInstantiation()
         * @generated
         */
        EClass ABSTRACT_DATA_INSTANTIATION = eINSTANCE.getAbstractDataInstantiation();

        /**
         * The meta object literal for the '<em><b>Contained Data Set</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_DATA_INSTANTIATION__CONTAINED_DATA_SET = eINSTANCE.getAbstractDataInstantiation_ContainedDataSet();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_DATA_INSTANTIATION__TYPE = eINSTANCE.getAbstractDataInstantiation_Type();

        /**
         * The meta object literal for the '{@link data.instantiation.impl.DataInstantiationHierarchyImpl <em>Data Instantiation Hierarchy</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.instantiation.impl.DataInstantiationHierarchyImpl
         * @see data.instantiation.impl.InstantiationPackageImpl#getDataInstantiationHierarchy()
         * @generated
         */
        EClass DATA_INSTANTIATION_HIERARCHY = eINSTANCE.getDataInstantiationHierarchy();

        /**
         * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_INSTANTIATION_HIERARCHY__ROOT = eINSTANCE.getDataInstantiationHierarchy_Root();

        /**
         * The meta object literal for the '{@link data.instantiation.impl.DataInstantiationReferenceImpl <em>Data Instantiation Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.instantiation.impl.DataInstantiationReferenceImpl
         * @see data.instantiation.impl.InstantiationPackageImpl#getDataInstantiationReference()
         * @generated
         */
        EClass DATA_INSTANTIATION_REFERENCE = eINSTANCE.getDataInstantiationReference();

        /**
         * The meta object literal for the '<em><b>Instantiation</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_INSTANTIATION_REFERENCE__INSTANTIATION = eINSTANCE.getDataInstantiationReference_Instantiation();

        /**
         * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_INSTANTIATION_REFERENCE__CHILD = eINSTANCE.getDataInstantiationReference_Child();

        /**
         * The meta object literal for the '{@link data.instantiation.impl.AddressSpaceInstantiationImpl <em>Address Space Instantiation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.instantiation.impl.AddressSpaceInstantiationImpl
         * @see data.instantiation.impl.InstantiationPackageImpl#getAddressSpaceInstantiation()
         * @generated
         */
        EClass ADDRESS_SPACE_INSTANTIATION = eINSTANCE.getAddressSpaceInstantiation();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ADDRESS_SPACE_INSTANTIATION__TYPE = eINSTANCE.getAddressSpaceInstantiation_Type();

        /**
         * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ADDRESS_SPACE_INSTANTIATION__INSTANCES = eINSTANCE.getAddressSpaceInstantiation_Instances();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ADDRESS_SPACE_INSTANTIATION__NAME = eINSTANCE.getAddressSpaceInstantiation_Name();

    }

} //InstantiationPackage
