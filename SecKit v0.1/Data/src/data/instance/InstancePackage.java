/**
 */
package data.instance;

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
 * @see data.instance.InstanceFactory
 * @model kind="package"
 * @generated
 */
public interface InstancePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "instance";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://data/instance/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "data-instance";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    InstancePackage eINSTANCE = data.instance.impl.InstancePackageImpl.init();

    /**
     * The meta object id for the '{@link data.instance.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.instance.impl.BlockImpl
     * @see data.instance.impl.InstancePackageImpl#getBlock()
     * @generated
     */
    int BLOCK = 0;

    /**
     * The number of structural features of the '<em>Block</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Block</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link data.instance.impl.SegmentImpl <em>Segment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.instance.impl.SegmentImpl
     * @see data.instance.impl.InstancePackageImpl#getSegment()
     * @generated
     */
    int SEGMENT = 1;

    /**
     * The number of structural features of the '<em>Segment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Segment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEGMENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link data.instance.impl.RegionImpl <em>Region</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.instance.impl.RegionImpl
     * @see data.instance.impl.InstancePackageImpl#getRegion()
     * @generated
     */
    int REGION = 2;

    /**
     * The feature id for the '<em><b>Start Address</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGION__START_ADDRESS = 0;

    /**
     * The feature id for the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGION__LENGTH = 1;

    /**
     * The feature id for the '<em><b>End Address</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGION__END_ADDRESS = 2;

    /**
     * The number of structural features of the '<em>Region</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGION_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Region</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link data.instance.impl.AbstractDataInstanceImpl <em>Abstract Data Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.instance.impl.AbstractDataInstanceImpl
     * @see data.instance.impl.InstancePackageImpl#getAbstractDataInstance()
     * @generated
     */
    int ABSTRACT_DATA_INSTANCE = 4;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_INSTANCE__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_INSTANCE__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>String Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_INSTANCE__STRING_VALUE = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Abstract Data Instance</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_INSTANCE_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Abstract Data Instance</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_INSTANCE_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.instance.impl.DataImpl <em>Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.instance.impl.DataImpl
     * @see data.instance.impl.InstancePackageImpl#getData()
     * @generated
     */
    int DATA = 3;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA__VISUAL_ELEMENTS = ABSTRACT_DATA_INSTANCE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA__ID = ABSTRACT_DATA_INSTANCE__ID;

    /**
     * The feature id for the '<em><b>String Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA__STRING_VALUE = ABSTRACT_DATA_INSTANCE__STRING_VALUE;

    /**
     * The feature id for the '<em><b>Addresses</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA__ADDRESSES = ABSTRACT_DATA_INSTANCE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>EObject</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA__EOBJECT = ABSTRACT_DATA_INSTANCE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Data Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA__DATA_SET = ABSTRACT_DATA_INSTANCE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Location</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA__LOCATION = ABSTRACT_DATA_INSTANCE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA__INSTANTIATION = ABSTRACT_DATA_INSTANCE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA__TYPE = ABSTRACT_DATA_INSTANCE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Initial Representation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA__INITIAL_REPRESENTATION = ABSTRACT_DATA_INSTANCE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Data Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA__DATA_ID = ABSTRACT_DATA_INSTANCE_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Data</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_FEATURE_COUNT = ABSTRACT_DATA_INSTANCE_FEATURE_COUNT + 8;

    /**
     * The number of operations of the '<em>Data</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OPERATION_COUNT = ABSTRACT_DATA_INSTANCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.instance.impl.StaticDataImpl <em>Static Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.instance.impl.StaticDataImpl
     * @see data.instance.impl.InstancePackageImpl#getStaticData()
     * @generated
     */
    int STATIC_DATA = 5;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_DATA__VISUAL_ELEMENTS = DATA__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_DATA__ID = DATA__ID;

    /**
     * The feature id for the '<em><b>String Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_DATA__STRING_VALUE = DATA__STRING_VALUE;

    /**
     * The feature id for the '<em><b>Addresses</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_DATA__ADDRESSES = DATA__ADDRESSES;

    /**
     * The feature id for the '<em><b>EObject</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_DATA__EOBJECT = DATA__EOBJECT;

    /**
     * The feature id for the '<em><b>Data Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_DATA__DATA_SET = DATA__DATA_SET;

    /**
     * The feature id for the '<em><b>Location</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_DATA__LOCATION = DATA__LOCATION;

    /**
     * The feature id for the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_DATA__INSTANTIATION = DATA__INSTANTIATION;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_DATA__TYPE = DATA__TYPE;

    /**
     * The feature id for the '<em><b>Initial Representation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_DATA__INITIAL_REPRESENTATION = DATA__INITIAL_REPRESENTATION;

    /**
     * The feature id for the '<em><b>Data Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_DATA__DATA_ID = DATA__DATA_ID;

    /**
     * The number of structural features of the '<em>Static Data</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_DATA_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Static Data</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_DATA_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.instance.impl.DynamicDataImpl <em>Dynamic Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.instance.impl.DynamicDataImpl
     * @see data.instance.impl.InstancePackageImpl#getDynamicData()
     * @generated
     */
    int DYNAMIC_DATA = 6;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DYNAMIC_DATA__VISUAL_ELEMENTS = DATA__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DYNAMIC_DATA__ID = DATA__ID;

    /**
     * The feature id for the '<em><b>String Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DYNAMIC_DATA__STRING_VALUE = DATA__STRING_VALUE;

    /**
     * The feature id for the '<em><b>Addresses</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DYNAMIC_DATA__ADDRESSES = DATA__ADDRESSES;

    /**
     * The feature id for the '<em><b>EObject</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DYNAMIC_DATA__EOBJECT = DATA__EOBJECT;

    /**
     * The feature id for the '<em><b>Data Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DYNAMIC_DATA__DATA_SET = DATA__DATA_SET;

    /**
     * The feature id for the '<em><b>Location</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DYNAMIC_DATA__LOCATION = DATA__LOCATION;

    /**
     * The feature id for the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DYNAMIC_DATA__INSTANTIATION = DATA__INSTANTIATION;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DYNAMIC_DATA__TYPE = DATA__TYPE;

    /**
     * The feature id for the '<em><b>Initial Representation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DYNAMIC_DATA__INITIAL_REPRESENTATION = DATA__INITIAL_REPRESENTATION;

    /**
     * The feature id for the '<em><b>Data Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DYNAMIC_DATA__DATA_ID = DATA__DATA_ID;

    /**
     * The number of structural features of the '<em>Dynamic Data</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DYNAMIC_DATA_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Dynamic Data</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DYNAMIC_DATA_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.instance.impl.TaintTagImpl <em>Taint Tag</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.instance.impl.TaintTagImpl
     * @see data.instance.impl.InstancePackageImpl#getTaintTag()
     * @generated
     */
    int TAINT_TAG = 9;

    /**
     * The number of structural features of the '<em>Taint Tag</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAINT_TAG_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Taint Tag</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAINT_TAG_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link data.instance.impl.DataSetImpl <em>Data Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.instance.impl.DataSetImpl
     * @see data.instance.impl.InstancePackageImpl#getDataSet()
     * @generated
     */
    int DATA_SET = 7;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__VISUAL_ELEMENTS = TAINT_TAG_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__ID = TAINT_TAG_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Contained Data</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__CONTAINED_DATA = TAINT_TAG_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__NAME = TAINT_TAG_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Instances</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__INSTANCES = TAINT_TAG_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Data Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET_FEATURE_COUNT = TAINT_TAG_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Data Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET_OPERATION_COUNT = TAINT_TAG_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.instance.impl.DataQuantityImpl <em>Data Quantity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.instance.impl.DataQuantityImpl
     * @see data.instance.impl.InstancePackageImpl#getDataQuantity()
     * @generated
     */
    int DATA_QUANTITY = 8;

    /**
     * The feature id for the '<em><b>Data</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_QUANTITY__DATA = 0;

    /**
     * The feature id for the '<em><b>Data Set</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_QUANTITY__DATA_SET = 1;

    /**
     * The number of structural features of the '<em>Data Quantity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_QUANTITY_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Data Quantity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_QUANTITY_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link data.instance.impl.NumberOfBytesImpl <em>Number Of Bytes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.instance.impl.NumberOfBytesImpl
     * @see data.instance.impl.InstancePackageImpl#getNumberOfBytes()
     * @generated
     */
    int NUMBER_OF_BYTES = 10;

    /**
     * The number of structural features of the '<em>Number Of Bytes</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMBER_OF_BYTES_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Number Of Bytes</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMBER_OF_BYTES_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link data.instance.impl.CompleteDataImpl <em>Complete Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.instance.impl.CompleteDataImpl
     * @see data.instance.impl.InstancePackageImpl#getCompleteData()
     * @generated
     */
    int COMPLETE_DATA = 11;

    /**
     * The feature id for the '<em><b>Data</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLETE_DATA__DATA = DATA_QUANTITY__DATA;

    /**
     * The feature id for the '<em><b>Data Set</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLETE_DATA__DATA_SET = DATA_QUANTITY__DATA_SET;

    /**
     * The number of structural features of the '<em>Complete Data</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLETE_DATA_FEATURE_COUNT = DATA_QUANTITY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Complete Data</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLETE_DATA_OPERATION_COUNT = DATA_QUANTITY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.instance.impl.PartialDataImpl <em>Partial Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.instance.impl.PartialDataImpl
     * @see data.instance.impl.InstancePackageImpl#getPartialData()
     * @generated
     */
    int PARTIAL_DATA = 12;

    /**
     * The feature id for the '<em><b>Data</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTIAL_DATA__DATA = DATA_QUANTITY__DATA;

    /**
     * The feature id for the '<em><b>Data Set</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTIAL_DATA__DATA_SET = DATA_QUANTITY__DATA_SET;

    /**
     * The number of structural features of the '<em>Partial Data</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTIAL_DATA_FEATURE_COUNT = DATA_QUANTITY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Partial Data</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARTIAL_DATA_OPERATION_COUNT = DATA_QUANTITY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.instance.impl.ByteOffSetImpl <em>Byte Off Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.instance.impl.ByteOffSetImpl
     * @see data.instance.impl.InstancePackageImpl#getByteOffSet()
     * @generated
     */
    int BYTE_OFF_SET = 13;

    /**
     * The feature id for the '<em><b>Data</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE_OFF_SET__DATA = PARTIAL_DATA__DATA;

    /**
     * The feature id for the '<em><b>Data Set</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE_OFF_SET__DATA_SET = PARTIAL_DATA__DATA_SET;

    /**
     * The feature id for the '<em><b>Start</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE_OFF_SET__START = PARTIAL_DATA_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>End</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE_OFF_SET__END = PARTIAL_DATA_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Byte Off Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE_OFF_SET_FEATURE_COUNT = PARTIAL_DATA_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Byte Off Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BYTE_OFF_SET_OPERATION_COUNT = PARTIAL_DATA_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.instance.impl.AddressImpl <em>Address</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.instance.impl.AddressImpl
     * @see data.instance.impl.InstancePackageImpl#getAddress()
     * @generated
     */
    int ADDRESS = 14;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Content</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS__CONTENT = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Adress Space</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS__ADRESS_SPACE = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Address</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Address</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.instance.impl.AdressSpaceImpl <em>Adress Space</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.instance.impl.AdressSpaceImpl
     * @see data.instance.impl.InstancePackageImpl#getAdressSpace()
     * @generated
     */
    int ADRESS_SPACE = 15;

    /**
     * The feature id for the '<em><b>Addresses</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADRESS_SPACE__ADDRESSES = 0;

    /**
     * The feature id for the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADRESS_SPACE__INSTANTIATION = 1;

    /**
     * The number of structural features of the '<em>Adress Space</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADRESS_SPACE_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Adress Space</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADRESS_SPACE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link data.instance.impl.AddressableImpl <em>Addressable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.instance.impl.AddressableImpl
     * @see data.instance.impl.InstancePackageImpl#getAddressable()
     * @generated
     */
    int ADDRESSABLE = 16;

    /**
     * The feature id for the '<em><b>Addresses</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESSABLE__ADDRESSES = 0;

    /**
     * The number of structural features of the '<em>Addressable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESSABLE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Addressable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESSABLE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link data.instance.impl.ContentImpl <em>Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.instance.impl.ContentImpl
     * @see data.instance.impl.InstancePackageImpl#getContent()
     * @generated
     */
    int CONTENT = 17;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTENT__VALUE = 0;

    /**
     * The number of structural features of the '<em>Content</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTENT_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Content</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link data.instance.impl.MemoryImpl <em>Memory</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.instance.impl.MemoryImpl
     * @see data.instance.impl.InstancePackageImpl#getMemory()
     * @generated
     */
    int MEMORY = 18;

    /**
     * The feature id for the '<em><b>Contents</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMORY__CONTENTS = 0;

    /**
     * The number of structural features of the '<em>Memory</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMORY_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Memory</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMORY_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link data.instance.Block <em>Block</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Block</em>'.
     * @see data.instance.Block
     * @generated
     */
    EClass getBlock();

    /**
     * Returns the meta object for class '{@link data.instance.Segment <em>Segment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Segment</em>'.
     * @see data.instance.Segment
     * @generated
     */
    EClass getSegment();

    /**
     * Returns the meta object for class '{@link data.instance.Region <em>Region</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Region</em>'.
     * @see data.instance.Region
     * @generated
     */
    EClass getRegion();

    /**
     * Returns the meta object for the containment reference '{@link data.instance.Region#getStartAddress <em>Start Address</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Start Address</em>'.
     * @see data.instance.Region#getStartAddress()
     * @see #getRegion()
     * @generated
     */
    EReference getRegion_StartAddress();

    /**
     * Returns the meta object for the attribute '{@link data.instance.Region#getLength <em>Length</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Length</em>'.
     * @see data.instance.Region#getLength()
     * @see #getRegion()
     * @generated
     */
    EAttribute getRegion_Length();

    /**
     * Returns the meta object for the containment reference '{@link data.instance.Region#getEndAddress <em>End Address</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>End Address</em>'.
     * @see data.instance.Region#getEndAddress()
     * @see #getRegion()
     * @generated
     */
    EReference getRegion_EndAddress();

    /**
     * Returns the meta object for class '{@link data.instance.Data <em>Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data</em>'.
     * @see data.instance.Data
     * @generated
     */
    EClass getData();

    /**
     * Returns the meta object for the reference '{@link data.instance.Data#getEObject <em>EObject</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>EObject</em>'.
     * @see data.instance.Data#getEObject()
     * @see #getData()
     * @generated
     */
    EReference getData_EObject();

    /**
     * Returns the meta object for the containment reference '{@link data.instance.Data#getDataSet <em>Data Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data Set</em>'.
     * @see data.instance.Data#getDataSet()
     * @see #getData()
     * @generated
     */
    EReference getData_DataSet();

    /**
     * Returns the meta object for the containment reference '{@link data.instance.Data#getLocation <em>Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Location</em>'.
     * @see data.instance.Data#getLocation()
     * @see #getData()
     * @generated
     */
    EReference getData_Location();

    /**
     * Returns the meta object for the reference '{@link data.instance.Data#getInstantiation <em>Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Instantiation</em>'.
     * @see data.instance.Data#getInstantiation()
     * @see #getData()
     * @generated
     */
    EReference getData_Instantiation();

    /**
     * Returns the meta object for the reference '{@link data.instance.Data#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see data.instance.Data#getType()
     * @see #getData()
     * @generated
     */
    EReference getData_Type();

    /**
     * Returns the meta object for the reference '{@link data.instance.Data#getInitialRepresentation <em>Initial Representation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Initial Representation</em>'.
     * @see data.instance.Data#getInitialRepresentation()
     * @see #getData()
     * @generated
     */
    EReference getData_InitialRepresentation();

    /**
     * Returns the meta object for the attribute '{@link data.instance.Data#getDataId <em>Data Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Data Id</em>'.
     * @see data.instance.Data#getDataId()
     * @see #getData()
     * @generated
     */
    EAttribute getData_DataId();

    /**
     * Returns the meta object for class '{@link data.instance.AbstractDataInstance <em>Abstract Data Instance</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Data Instance</em>'.
     * @see data.instance.AbstractDataInstance
     * @generated
     */
    EClass getAbstractDataInstance();

    /**
     * Returns the meta object for the attribute '{@link data.instance.AbstractDataInstance#getStringValue <em>String Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>String Value</em>'.
     * @see data.instance.AbstractDataInstance#getStringValue()
     * @see #getAbstractDataInstance()
     * @generated
     */
    EAttribute getAbstractDataInstance_StringValue();

    /**
     * Returns the meta object for class '{@link data.instance.StaticData <em>Static Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Static Data</em>'.
     * @see data.instance.StaticData
     * @generated
     */
    EClass getStaticData();

    /**
     * Returns the meta object for class '{@link data.instance.DynamicData <em>Dynamic Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dynamic Data</em>'.
     * @see data.instance.DynamicData
     * @generated
     */
    EClass getDynamicData();

    /**
     * Returns the meta object for class '{@link data.instance.DataSet <em>Data Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Set</em>'.
     * @see data.instance.DataSet
     * @generated
     */
    EClass getDataSet();

    /**
     * Returns the meta object for the containment reference list '{@link data.instance.DataSet#getContainedData <em>Contained Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Contained Data</em>'.
     * @see data.instance.DataSet#getContainedData()
     * @see #getDataSet()
     * @generated
     */
    EReference getDataSet_ContainedData();

    /**
     * Returns the meta object for the attribute '{@link data.instance.DataSet#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see data.instance.DataSet#getName()
     * @see #getDataSet()
     * @generated
     */
    EAttribute getDataSet_Name();

    /**
     * Returns the meta object for the container reference '{@link data.instance.DataSet#getInstances <em>Instances</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Instances</em>'.
     * @see data.instance.DataSet#getInstances()
     * @see #getDataSet()
     * @generated
     */
    EReference getDataSet_Instances();

    /**
     * Returns the meta object for class '{@link data.instance.DataQuantity <em>Data Quantity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Quantity</em>'.
     * @see data.instance.DataQuantity
     * @generated
     */
    EClass getDataQuantity();

    /**
     * Returns the meta object for the reference '{@link data.instance.DataQuantity#getData <em>Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Data</em>'.
     * @see data.instance.DataQuantity#getData()
     * @see #getDataQuantity()
     * @generated
     */
    EReference getDataQuantity_Data();

    /**
     * Returns the meta object for the container reference '{@link data.instance.DataQuantity#getDataSet <em>Data Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Data Set</em>'.
     * @see data.instance.DataQuantity#getDataSet()
     * @see #getDataQuantity()
     * @generated
     */
    EReference getDataQuantity_DataSet();

    /**
     * Returns the meta object for class '{@link data.instance.TaintTag <em>Taint Tag</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Taint Tag</em>'.
     * @see data.instance.TaintTag
     * @generated
     */
    EClass getTaintTag();

    /**
     * Returns the meta object for class '{@link data.instance.NumberOfBytes <em>Number Of Bytes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Number Of Bytes</em>'.
     * @see data.instance.NumberOfBytes
     * @generated
     */
    EClass getNumberOfBytes();

    /**
     * Returns the meta object for class '{@link data.instance.CompleteData <em>Complete Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Complete Data</em>'.
     * @see data.instance.CompleteData
     * @generated
     */
    EClass getCompleteData();

    /**
     * Returns the meta object for class '{@link data.instance.PartialData <em>Partial Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Partial Data</em>'.
     * @see data.instance.PartialData
     * @generated
     */
    EClass getPartialData();

    /**
     * Returns the meta object for class '{@link data.instance.ByteOffSet <em>Byte Off Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Byte Off Set</em>'.
     * @see data.instance.ByteOffSet
     * @generated
     */
    EClass getByteOffSet();

    /**
     * Returns the meta object for the attribute '{@link data.instance.ByteOffSet#getStart <em>Start</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Start</em>'.
     * @see data.instance.ByteOffSet#getStart()
     * @see #getByteOffSet()
     * @generated
     */
    EAttribute getByteOffSet_Start();

    /**
     * Returns the meta object for the attribute '{@link data.instance.ByteOffSet#getEnd <em>End</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>End</em>'.
     * @see data.instance.ByteOffSet#getEnd()
     * @see #getByteOffSet()
     * @generated
     */
    EAttribute getByteOffSet_End();

    /**
     * Returns the meta object for class '{@link data.instance.Address <em>Address</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Address</em>'.
     * @see data.instance.Address
     * @generated
     */
    EClass getAddress();

    /**
     * Returns the meta object for the reference '{@link data.instance.Address#getContent <em>Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Content</em>'.
     * @see data.instance.Address#getContent()
     * @see #getAddress()
     * @generated
     */
    EReference getAddress_Content();

    /**
     * Returns the meta object for the container reference '{@link data.instance.Address#getAdressSpace <em>Adress Space</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Adress Space</em>'.
     * @see data.instance.Address#getAdressSpace()
     * @see #getAddress()
     * @generated
     */
    EReference getAddress_AdressSpace();

    /**
     * Returns the meta object for class '{@link data.instance.AdressSpace <em>Adress Space</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Adress Space</em>'.
     * @see data.instance.AdressSpace
     * @generated
     */
    EClass getAdressSpace();

    /**
     * Returns the meta object for the containment reference list '{@link data.instance.AdressSpace#getAddresses <em>Addresses</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Addresses</em>'.
     * @see data.instance.AdressSpace#getAddresses()
     * @see #getAdressSpace()
     * @generated
     */
    EReference getAdressSpace_Addresses();

    /**
     * Returns the meta object for the reference '{@link data.instance.AdressSpace#getInstantiation <em>Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Instantiation</em>'.
     * @see data.instance.AdressSpace#getInstantiation()
     * @see #getAdressSpace()
     * @generated
     */
    EReference getAdressSpace_Instantiation();

    /**
     * Returns the meta object for class '{@link data.instance.Addressable <em>Addressable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Addressable</em>'.
     * @see data.instance.Addressable
     * @generated
     */
    EClass getAddressable();

    /**
     * Returns the meta object for the reference list '{@link data.instance.Addressable#getAddresses <em>Addresses</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Addresses</em>'.
     * @see data.instance.Addressable#getAddresses()
     * @see #getAddressable()
     * @generated
     */
    EReference getAddressable_Addresses();

    /**
     * Returns the meta object for class '{@link data.instance.Content <em>Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Content</em>'.
     * @see data.instance.Content
     * @generated
     */
    EClass getContent();

    /**
     * Returns the meta object for the attribute '{@link data.instance.Content#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see data.instance.Content#getValue()
     * @see #getContent()
     * @generated
     */
    EAttribute getContent_Value();

    /**
     * Returns the meta object for class '{@link data.instance.Memory <em>Memory</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Memory</em>'.
     * @see data.instance.Memory
     * @generated
     */
    EClass getMemory();

    /**
     * Returns the meta object for the containment reference '{@link data.instance.Memory#getContents <em>Contents</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Contents</em>'.
     * @see data.instance.Memory#getContents()
     * @see #getMemory()
     * @generated
     */
    EReference getMemory_Contents();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    InstanceFactory getInstanceFactory();

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
         * The meta object literal for the '{@link data.instance.impl.BlockImpl <em>Block</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.instance.impl.BlockImpl
         * @see data.instance.impl.InstancePackageImpl#getBlock()
         * @generated
         */
        EClass BLOCK = eINSTANCE.getBlock();

        /**
         * The meta object literal for the '{@link data.instance.impl.SegmentImpl <em>Segment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.instance.impl.SegmentImpl
         * @see data.instance.impl.InstancePackageImpl#getSegment()
         * @generated
         */
        EClass SEGMENT = eINSTANCE.getSegment();

        /**
         * The meta object literal for the '{@link data.instance.impl.RegionImpl <em>Region</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.instance.impl.RegionImpl
         * @see data.instance.impl.InstancePackageImpl#getRegion()
         * @generated
         */
        EClass REGION = eINSTANCE.getRegion();

        /**
         * The meta object literal for the '<em><b>Start Address</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REGION__START_ADDRESS = eINSTANCE.getRegion_StartAddress();

        /**
         * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REGION__LENGTH = eINSTANCE.getRegion_Length();

        /**
         * The meta object literal for the '<em><b>End Address</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REGION__END_ADDRESS = eINSTANCE.getRegion_EndAddress();

        /**
         * The meta object literal for the '{@link data.instance.impl.DataImpl <em>Data</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.instance.impl.DataImpl
         * @see data.instance.impl.InstancePackageImpl#getData()
         * @generated
         */
        EClass DATA = eINSTANCE.getData();

        /**
         * The meta object literal for the '<em><b>EObject</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA__EOBJECT = eINSTANCE.getData_EObject();

        /**
         * The meta object literal for the '<em><b>Data Set</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA__DATA_SET = eINSTANCE.getData_DataSet();

        /**
         * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA__LOCATION = eINSTANCE.getData_Location();

        /**
         * The meta object literal for the '<em><b>Instantiation</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA__INSTANTIATION = eINSTANCE.getData_Instantiation();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA__TYPE = eINSTANCE.getData_Type();

        /**
         * The meta object literal for the '<em><b>Initial Representation</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA__INITIAL_REPRESENTATION = eINSTANCE.getData_InitialRepresentation();

        /**
         * The meta object literal for the '<em><b>Data Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA__DATA_ID = eINSTANCE.getData_DataId();

        /**
         * The meta object literal for the '{@link data.instance.impl.AbstractDataInstanceImpl <em>Abstract Data Instance</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.instance.impl.AbstractDataInstanceImpl
         * @see data.instance.impl.InstancePackageImpl#getAbstractDataInstance()
         * @generated
         */
        EClass ABSTRACT_DATA_INSTANCE = eINSTANCE.getAbstractDataInstance();

        /**
         * The meta object literal for the '<em><b>String Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_DATA_INSTANCE__STRING_VALUE = eINSTANCE.getAbstractDataInstance_StringValue();

        /**
         * The meta object literal for the '{@link data.instance.impl.StaticDataImpl <em>Static Data</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.instance.impl.StaticDataImpl
         * @see data.instance.impl.InstancePackageImpl#getStaticData()
         * @generated
         */
        EClass STATIC_DATA = eINSTANCE.getStaticData();

        /**
         * The meta object literal for the '{@link data.instance.impl.DynamicDataImpl <em>Dynamic Data</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.instance.impl.DynamicDataImpl
         * @see data.instance.impl.InstancePackageImpl#getDynamicData()
         * @generated
         */
        EClass DYNAMIC_DATA = eINSTANCE.getDynamicData();

        /**
         * The meta object literal for the '{@link data.instance.impl.DataSetImpl <em>Data Set</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.instance.impl.DataSetImpl
         * @see data.instance.impl.InstancePackageImpl#getDataSet()
         * @generated
         */
        EClass DATA_SET = eINSTANCE.getDataSet();

        /**
         * The meta object literal for the '<em><b>Contained Data</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_SET__CONTAINED_DATA = eINSTANCE.getDataSet_ContainedData();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_SET__NAME = eINSTANCE.getDataSet_Name();

        /**
         * The meta object literal for the '<em><b>Instances</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_SET__INSTANCES = eINSTANCE.getDataSet_Instances();

        /**
         * The meta object literal for the '{@link data.instance.impl.DataQuantityImpl <em>Data Quantity</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.instance.impl.DataQuantityImpl
         * @see data.instance.impl.InstancePackageImpl#getDataQuantity()
         * @generated
         */
        EClass DATA_QUANTITY = eINSTANCE.getDataQuantity();

        /**
         * The meta object literal for the '<em><b>Data</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_QUANTITY__DATA = eINSTANCE.getDataQuantity_Data();

        /**
         * The meta object literal for the '<em><b>Data Set</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_QUANTITY__DATA_SET = eINSTANCE.getDataQuantity_DataSet();

        /**
         * The meta object literal for the '{@link data.instance.impl.TaintTagImpl <em>Taint Tag</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.instance.impl.TaintTagImpl
         * @see data.instance.impl.InstancePackageImpl#getTaintTag()
         * @generated
         */
        EClass TAINT_TAG = eINSTANCE.getTaintTag();

        /**
         * The meta object literal for the '{@link data.instance.impl.NumberOfBytesImpl <em>Number Of Bytes</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.instance.impl.NumberOfBytesImpl
         * @see data.instance.impl.InstancePackageImpl#getNumberOfBytes()
         * @generated
         */
        EClass NUMBER_OF_BYTES = eINSTANCE.getNumberOfBytes();

        /**
         * The meta object literal for the '{@link data.instance.impl.CompleteDataImpl <em>Complete Data</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.instance.impl.CompleteDataImpl
         * @see data.instance.impl.InstancePackageImpl#getCompleteData()
         * @generated
         */
        EClass COMPLETE_DATA = eINSTANCE.getCompleteData();

        /**
         * The meta object literal for the '{@link data.instance.impl.PartialDataImpl <em>Partial Data</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.instance.impl.PartialDataImpl
         * @see data.instance.impl.InstancePackageImpl#getPartialData()
         * @generated
         */
        EClass PARTIAL_DATA = eINSTANCE.getPartialData();

        /**
         * The meta object literal for the '{@link data.instance.impl.ByteOffSetImpl <em>Byte Off Set</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.instance.impl.ByteOffSetImpl
         * @see data.instance.impl.InstancePackageImpl#getByteOffSet()
         * @generated
         */
        EClass BYTE_OFF_SET = eINSTANCE.getByteOffSet();

        /**
         * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BYTE_OFF_SET__START = eINSTANCE.getByteOffSet_Start();

        /**
         * The meta object literal for the '<em><b>End</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BYTE_OFF_SET__END = eINSTANCE.getByteOffSet_End();

        /**
         * The meta object literal for the '{@link data.instance.impl.AddressImpl <em>Address</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.instance.impl.AddressImpl
         * @see data.instance.impl.InstancePackageImpl#getAddress()
         * @generated
         */
        EClass ADDRESS = eINSTANCE.getAddress();

        /**
         * The meta object literal for the '<em><b>Content</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ADDRESS__CONTENT = eINSTANCE.getAddress_Content();

        /**
         * The meta object literal for the '<em><b>Adress Space</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ADDRESS__ADRESS_SPACE = eINSTANCE.getAddress_AdressSpace();

        /**
         * The meta object literal for the '{@link data.instance.impl.AdressSpaceImpl <em>Adress Space</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.instance.impl.AdressSpaceImpl
         * @see data.instance.impl.InstancePackageImpl#getAdressSpace()
         * @generated
         */
        EClass ADRESS_SPACE = eINSTANCE.getAdressSpace();

        /**
         * The meta object literal for the '<em><b>Addresses</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ADRESS_SPACE__ADDRESSES = eINSTANCE.getAdressSpace_Addresses();

        /**
         * The meta object literal for the '<em><b>Instantiation</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ADRESS_SPACE__INSTANTIATION = eINSTANCE.getAdressSpace_Instantiation();

        /**
         * The meta object literal for the '{@link data.instance.impl.AddressableImpl <em>Addressable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.instance.impl.AddressableImpl
         * @see data.instance.impl.InstancePackageImpl#getAddressable()
         * @generated
         */
        EClass ADDRESSABLE = eINSTANCE.getAddressable();

        /**
         * The meta object literal for the '<em><b>Addresses</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ADDRESSABLE__ADDRESSES = eINSTANCE.getAddressable_Addresses();

        /**
         * The meta object literal for the '{@link data.instance.impl.ContentImpl <em>Content</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.instance.impl.ContentImpl
         * @see data.instance.impl.InstancePackageImpl#getContent()
         * @generated
         */
        EClass CONTENT = eINSTANCE.getContent();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTENT__VALUE = eINSTANCE.getContent_Value();

        /**
         * The meta object literal for the '{@link data.instance.impl.MemoryImpl <em>Memory</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.instance.impl.MemoryImpl
         * @see data.instance.impl.InstancePackageImpl#getMemory()
         * @generated
         */
        EClass MEMORY = eINSTANCE.getMemory();

        /**
         * The meta object literal for the '<em><b>Contents</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MEMORY__CONTENTS = eINSTANCE.getMemory_Contents();

    }

} //InstancePackage
