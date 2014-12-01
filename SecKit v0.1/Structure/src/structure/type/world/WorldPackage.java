/**
 */
package structure.type.world;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import structure.type.TypePackage;

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
 * @see structure.type.world.WorldFactory
 * @model kind="package"
 * @generated
 */
public interface WorldPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "world";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://structure/world/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "world-structure";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    WorldPackage eINSTANCE = structure.type.world.impl.WorldPackageImpl.init();

    /**
     * The meta object id for the '{@link structure.type.world.impl.IntangibleEntityImpl <em>Intangible Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.type.world.impl.IntangibleEntityImpl
     * @see structure.type.world.impl.WorldPackageImpl#getIntangibleEntity()
     * @generated
     */
    int INTANGIBLE_ENTITY = 5;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTANGIBLE_ENTITY__VISUAL_ELEMENTS = TypePackage.ENTITY_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTANGIBLE_ENTITY__ID = TypePackage.ENTITY_TYPE__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTANGIBLE_ENTITY__NAME = TypePackage.ENTITY_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Interaction Point Participations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTANGIBLE_ENTITY__INTERACTION_POINT_PARTICIPATIONS = TypePackage.ENTITY_TYPE__INTERACTION_POINT_PARTICIPATIONS;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTANGIBLE_ENTITY__INSTANTIATIONS = TypePackage.ENTITY_TYPE__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Contained Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTANGIBLE_ENTITY__CONTAINED_INSTANTIATIONS = TypePackage.ENTITY_TYPE__CONTAINED_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Super Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTANGIBLE_ENTITY__SUPER_TYPES = TypePackage.ENTITY_TYPE__SUPER_TYPES;

    /**
     * The feature id for the '<em><b>Sub Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTANGIBLE_ENTITY__SUB_TYPES = TypePackage.ENTITY_TYPE__SUB_TYPES;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTANGIBLE_ENTITY__PACKAGE = TypePackage.ENTITY_TYPE__PACKAGE;

    /**
     * The feature id for the '<em><b>Activity Points</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTANGIBLE_ENTITY__ACTIVITY_POINTS = TypePackage.ENTITY_TYPE__ACTIVITY_POINTS;

    /**
     * The number of structural features of the '<em>Intangible Entity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTANGIBLE_ENTITY_FEATURE_COUNT = TypePackage.ENTITY_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Intangible Entity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTANGIBLE_ENTITY_OPERATION_COUNT = TypePackage.ENTITY_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.type.world.impl.SoftwareEntityImpl <em>Software Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.type.world.impl.SoftwareEntityImpl
     * @see structure.type.world.impl.WorldPackageImpl#getSoftwareEntity()
     * @generated
     */
    int SOFTWARE_ENTITY = 4;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_ENTITY__VISUAL_ELEMENTS = INTANGIBLE_ENTITY__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_ENTITY__ID = INTANGIBLE_ENTITY__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_ENTITY__NAME = INTANGIBLE_ENTITY__NAME;

    /**
     * The feature id for the '<em><b>Interaction Point Participations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_ENTITY__INTERACTION_POINT_PARTICIPATIONS = INTANGIBLE_ENTITY__INTERACTION_POINT_PARTICIPATIONS;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_ENTITY__INSTANTIATIONS = INTANGIBLE_ENTITY__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Contained Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_ENTITY__CONTAINED_INSTANTIATIONS = INTANGIBLE_ENTITY__CONTAINED_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Super Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_ENTITY__SUPER_TYPES = INTANGIBLE_ENTITY__SUPER_TYPES;

    /**
     * The feature id for the '<em><b>Sub Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_ENTITY__SUB_TYPES = INTANGIBLE_ENTITY__SUB_TYPES;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_ENTITY__PACKAGE = INTANGIBLE_ENTITY__PACKAGE;

    /**
     * The feature id for the '<em><b>Activity Points</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_ENTITY__ACTIVITY_POINTS = INTANGIBLE_ENTITY__ACTIVITY_POINTS;

    /**
     * The number of structural features of the '<em>Software Entity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_ENTITY_FEATURE_COUNT = INTANGIBLE_ENTITY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Software Entity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOFTWARE_ENTITY_OPERATION_COUNT = INTANGIBLE_ENTITY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.type.world.impl.ServiceAssemblyImpl <em>Service Assembly</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.type.world.impl.ServiceAssemblyImpl
     * @see structure.type.world.impl.WorldPackageImpl#getServiceAssembly()
     * @generated
     */
    int SERVICE_ASSEMBLY = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_ASSEMBLY__VISUAL_ELEMENTS = SOFTWARE_ENTITY__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_ASSEMBLY__ID = SOFTWARE_ENTITY__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_ASSEMBLY__NAME = SOFTWARE_ENTITY__NAME;

    /**
     * The feature id for the '<em><b>Interaction Point Participations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_ASSEMBLY__INTERACTION_POINT_PARTICIPATIONS = SOFTWARE_ENTITY__INTERACTION_POINT_PARTICIPATIONS;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_ASSEMBLY__INSTANTIATIONS = SOFTWARE_ENTITY__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Contained Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_ASSEMBLY__CONTAINED_INSTANTIATIONS = SOFTWARE_ENTITY__CONTAINED_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Super Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_ASSEMBLY__SUPER_TYPES = SOFTWARE_ENTITY__SUPER_TYPES;

    /**
     * The feature id for the '<em><b>Sub Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_ASSEMBLY__SUB_TYPES = SOFTWARE_ENTITY__SUB_TYPES;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_ASSEMBLY__PACKAGE = SOFTWARE_ENTITY__PACKAGE;

    /**
     * The feature id for the '<em><b>Activity Points</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_ASSEMBLY__ACTIVITY_POINTS = SOFTWARE_ENTITY__ACTIVITY_POINTS;

    /**
     * The number of structural features of the '<em>Service Assembly</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_ASSEMBLY_FEATURE_COUNT = SOFTWARE_ENTITY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Service Assembly</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_ASSEMBLY_OPERATION_COUNT = SOFTWARE_ENTITY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.type.world.impl.TangibleEntityImpl <em>Tangible Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.type.world.impl.TangibleEntityImpl
     * @see structure.type.world.impl.WorldPackageImpl#getTangibleEntity()
     * @generated
     */
    int TANGIBLE_ENTITY = 6;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TANGIBLE_ENTITY__VISUAL_ELEMENTS = TypePackage.ENTITY_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TANGIBLE_ENTITY__ID = TypePackage.ENTITY_TYPE__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TANGIBLE_ENTITY__NAME = TypePackage.ENTITY_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Interaction Point Participations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TANGIBLE_ENTITY__INTERACTION_POINT_PARTICIPATIONS = TypePackage.ENTITY_TYPE__INTERACTION_POINT_PARTICIPATIONS;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TANGIBLE_ENTITY__INSTANTIATIONS = TypePackage.ENTITY_TYPE__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Contained Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TANGIBLE_ENTITY__CONTAINED_INSTANTIATIONS = TypePackage.ENTITY_TYPE__CONTAINED_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Super Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TANGIBLE_ENTITY__SUPER_TYPES = TypePackage.ENTITY_TYPE__SUPER_TYPES;

    /**
     * The feature id for the '<em><b>Sub Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TANGIBLE_ENTITY__SUB_TYPES = TypePackage.ENTITY_TYPE__SUB_TYPES;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TANGIBLE_ENTITY__PACKAGE = TypePackage.ENTITY_TYPE__PACKAGE;

    /**
     * The feature id for the '<em><b>Activity Points</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TANGIBLE_ENTITY__ACTIVITY_POINTS = TypePackage.ENTITY_TYPE__ACTIVITY_POINTS;

    /**
     * The number of structural features of the '<em>Tangible Entity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TANGIBLE_ENTITY_FEATURE_COUNT = TypePackage.ENTITY_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Tangible Entity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TANGIBLE_ENTITY_OPERATION_COUNT = TypePackage.ENTITY_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.type.world.impl.PointEntityImpl <em>Point Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.type.world.impl.PointEntityImpl
     * @see structure.type.world.impl.WorldPackageImpl#getPointEntity()
     * @generated
     */
    int POINT_ENTITY = 7;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POINT_ENTITY__VISUAL_ELEMENTS = TANGIBLE_ENTITY__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POINT_ENTITY__ID = TANGIBLE_ENTITY__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POINT_ENTITY__NAME = TANGIBLE_ENTITY__NAME;

    /**
     * The feature id for the '<em><b>Interaction Point Participations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POINT_ENTITY__INTERACTION_POINT_PARTICIPATIONS = TANGIBLE_ENTITY__INTERACTION_POINT_PARTICIPATIONS;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POINT_ENTITY__INSTANTIATIONS = TANGIBLE_ENTITY__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Contained Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POINT_ENTITY__CONTAINED_INSTANTIATIONS = TANGIBLE_ENTITY__CONTAINED_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Super Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POINT_ENTITY__SUPER_TYPES = TANGIBLE_ENTITY__SUPER_TYPES;

    /**
     * The feature id for the '<em><b>Sub Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POINT_ENTITY__SUB_TYPES = TANGIBLE_ENTITY__SUB_TYPES;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POINT_ENTITY__PACKAGE = TANGIBLE_ENTITY__PACKAGE;

    /**
     * The feature id for the '<em><b>Activity Points</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POINT_ENTITY__ACTIVITY_POINTS = TANGIBLE_ENTITY__ACTIVITY_POINTS;

    /**
     * The number of structural features of the '<em>Point Entity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POINT_ENTITY_FEATURE_COUNT = TANGIBLE_ENTITY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Point Entity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POINT_ENTITY_OPERATION_COUNT = TANGIBLE_ENTITY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.type.world.impl.PersonImpl <em>Person</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.type.world.impl.PersonImpl
     * @see structure.type.world.impl.WorldPackageImpl#getPerson()
     * @generated
     */
    int PERSON = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__VISUAL_ELEMENTS = POINT_ENTITY__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__ID = POINT_ENTITY__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__NAME = POINT_ENTITY__NAME;

    /**
     * The feature id for the '<em><b>Interaction Point Participations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__INTERACTION_POINT_PARTICIPATIONS = POINT_ENTITY__INTERACTION_POINT_PARTICIPATIONS;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__INSTANTIATIONS = POINT_ENTITY__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Contained Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__CONTAINED_INSTANTIATIONS = POINT_ENTITY__CONTAINED_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Super Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__SUPER_TYPES = POINT_ENTITY__SUPER_TYPES;

    /**
     * The feature id for the '<em><b>Sub Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__SUB_TYPES = POINT_ENTITY__SUB_TYPES;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__PACKAGE = POINT_ENTITY__PACKAGE;

    /**
     * The feature id for the '<em><b>Activity Points</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__ACTIVITY_POINTS = POINT_ENTITY__ACTIVITY_POINTS;

    /**
     * The number of structural features of the '<em>Person</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON_FEATURE_COUNT = POINT_ENTITY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Person</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON_OPERATION_COUNT = POINT_ENTITY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.type.world.impl.PhysicalContainerEntityImpl <em>Physical Container Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.type.world.impl.PhysicalContainerEntityImpl
     * @see structure.type.world.impl.WorldPackageImpl#getPhysicalContainerEntity()
     * @generated
     */
    int PHYSICAL_CONTAINER_ENTITY = 8;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_CONTAINER_ENTITY__VISUAL_ELEMENTS = TANGIBLE_ENTITY__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_CONTAINER_ENTITY__ID = TANGIBLE_ENTITY__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_CONTAINER_ENTITY__NAME = TANGIBLE_ENTITY__NAME;

    /**
     * The feature id for the '<em><b>Interaction Point Participations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_CONTAINER_ENTITY__INTERACTION_POINT_PARTICIPATIONS = TANGIBLE_ENTITY__INTERACTION_POINT_PARTICIPATIONS;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_CONTAINER_ENTITY__INSTANTIATIONS = TANGIBLE_ENTITY__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Contained Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_CONTAINER_ENTITY__CONTAINED_INSTANTIATIONS = TANGIBLE_ENTITY__CONTAINED_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Super Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_CONTAINER_ENTITY__SUPER_TYPES = TANGIBLE_ENTITY__SUPER_TYPES;

    /**
     * The feature id for the '<em><b>Sub Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_CONTAINER_ENTITY__SUB_TYPES = TANGIBLE_ENTITY__SUB_TYPES;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_CONTAINER_ENTITY__PACKAGE = TANGIBLE_ENTITY__PACKAGE;

    /**
     * The feature id for the '<em><b>Activity Points</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_CONTAINER_ENTITY__ACTIVITY_POINTS = TANGIBLE_ENTITY__ACTIVITY_POINTS;

    /**
     * The number of structural features of the '<em>Physical Container Entity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_CONTAINER_ENTITY_FEATURE_COUNT = TANGIBLE_ENTITY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Physical Container Entity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_CONTAINER_ENTITY_OPERATION_COUNT = TANGIBLE_ENTITY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.type.world.impl.BuildingImpl <em>Building</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.type.world.impl.BuildingImpl
     * @see structure.type.world.impl.WorldPackageImpl#getBuilding()
     * @generated
     */
    int BUILDING = 2;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUILDING__VISUAL_ELEMENTS = PHYSICAL_CONTAINER_ENTITY__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUILDING__ID = PHYSICAL_CONTAINER_ENTITY__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUILDING__NAME = PHYSICAL_CONTAINER_ENTITY__NAME;

    /**
     * The feature id for the '<em><b>Interaction Point Participations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUILDING__INTERACTION_POINT_PARTICIPATIONS = PHYSICAL_CONTAINER_ENTITY__INTERACTION_POINT_PARTICIPATIONS;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUILDING__INSTANTIATIONS = PHYSICAL_CONTAINER_ENTITY__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Contained Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUILDING__CONTAINED_INSTANTIATIONS = PHYSICAL_CONTAINER_ENTITY__CONTAINED_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Super Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUILDING__SUPER_TYPES = PHYSICAL_CONTAINER_ENTITY__SUPER_TYPES;

    /**
     * The feature id for the '<em><b>Sub Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUILDING__SUB_TYPES = PHYSICAL_CONTAINER_ENTITY__SUB_TYPES;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUILDING__PACKAGE = PHYSICAL_CONTAINER_ENTITY__PACKAGE;

    /**
     * The feature id for the '<em><b>Activity Points</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUILDING__ACTIVITY_POINTS = PHYSICAL_CONTAINER_ENTITY__ACTIVITY_POINTS;

    /**
     * The number of structural features of the '<em>Building</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUILDING_FEATURE_COUNT = PHYSICAL_CONTAINER_ENTITY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Building</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUILDING_OPERATION_COUNT = PHYSICAL_CONTAINER_ENTITY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.type.world.impl.RoomImpl <em>Room</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.type.world.impl.RoomImpl
     * @see structure.type.world.impl.WorldPackageImpl#getRoom()
     * @generated
     */
    int ROOM = 3;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOM__VISUAL_ELEMENTS = PHYSICAL_CONTAINER_ENTITY__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOM__ID = PHYSICAL_CONTAINER_ENTITY__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOM__NAME = PHYSICAL_CONTAINER_ENTITY__NAME;

    /**
     * The feature id for the '<em><b>Interaction Point Participations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOM__INTERACTION_POINT_PARTICIPATIONS = PHYSICAL_CONTAINER_ENTITY__INTERACTION_POINT_PARTICIPATIONS;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOM__INSTANTIATIONS = PHYSICAL_CONTAINER_ENTITY__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Contained Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOM__CONTAINED_INSTANTIATIONS = PHYSICAL_CONTAINER_ENTITY__CONTAINED_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Super Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOM__SUPER_TYPES = PHYSICAL_CONTAINER_ENTITY__SUPER_TYPES;

    /**
     * The feature id for the '<em><b>Sub Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOM__SUB_TYPES = PHYSICAL_CONTAINER_ENTITY__SUB_TYPES;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOM__PACKAGE = PHYSICAL_CONTAINER_ENTITY__PACKAGE;

    /**
     * The feature id for the '<em><b>Activity Points</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOM__ACTIVITY_POINTS = PHYSICAL_CONTAINER_ENTITY__ACTIVITY_POINTS;

    /**
     * The number of structural features of the '<em>Room</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOM_FEATURE_COUNT = PHYSICAL_CONTAINER_ENTITY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Room</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOM_OPERATION_COUNT = PHYSICAL_CONTAINER_ENTITY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.type.world.impl.LevelImpl <em>Level</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.type.world.impl.LevelImpl
     * @see structure.type.world.impl.WorldPackageImpl#getLevel()
     * @generated
     */
    int LEVEL = 9;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEVEL__VISUAL_ELEMENTS = PHYSICAL_CONTAINER_ENTITY__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEVEL__ID = PHYSICAL_CONTAINER_ENTITY__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEVEL__NAME = PHYSICAL_CONTAINER_ENTITY__NAME;

    /**
     * The feature id for the '<em><b>Interaction Point Participations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEVEL__INTERACTION_POINT_PARTICIPATIONS = PHYSICAL_CONTAINER_ENTITY__INTERACTION_POINT_PARTICIPATIONS;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEVEL__INSTANTIATIONS = PHYSICAL_CONTAINER_ENTITY__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Contained Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEVEL__CONTAINED_INSTANTIATIONS = PHYSICAL_CONTAINER_ENTITY__CONTAINED_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Super Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEVEL__SUPER_TYPES = PHYSICAL_CONTAINER_ENTITY__SUPER_TYPES;

    /**
     * The feature id for the '<em><b>Sub Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEVEL__SUB_TYPES = PHYSICAL_CONTAINER_ENTITY__SUB_TYPES;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEVEL__PACKAGE = PHYSICAL_CONTAINER_ENTITY__PACKAGE;

    /**
     * The feature id for the '<em><b>Activity Points</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEVEL__ACTIVITY_POINTS = PHYSICAL_CONTAINER_ENTITY__ACTIVITY_POINTS;

    /**
     * The number of structural features of the '<em>Level</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEVEL_FEATURE_COUNT = PHYSICAL_CONTAINER_ENTITY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Level</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEVEL_OPERATION_COUNT = PHYSICAL_CONTAINER_ENTITY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.type.world.impl.DeviceTypeImpl <em>Device Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.type.world.impl.DeviceTypeImpl
     * @see structure.type.world.impl.WorldPackageImpl#getDeviceType()
     * @generated
     */
    int DEVICE_TYPE = 10;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_TYPE__VISUAL_ELEMENTS = POINT_ENTITY__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_TYPE__ID = POINT_ENTITY__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_TYPE__NAME = POINT_ENTITY__NAME;

    /**
     * The feature id for the '<em><b>Interaction Point Participations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_TYPE__INTERACTION_POINT_PARTICIPATIONS = POINT_ENTITY__INTERACTION_POINT_PARTICIPATIONS;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_TYPE__INSTANTIATIONS = POINT_ENTITY__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Contained Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_TYPE__CONTAINED_INSTANTIATIONS = POINT_ENTITY__CONTAINED_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Super Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_TYPE__SUPER_TYPES = POINT_ENTITY__SUPER_TYPES;

    /**
     * The feature id for the '<em><b>Sub Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_TYPE__SUB_TYPES = POINT_ENTITY__SUB_TYPES;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_TYPE__PACKAGE = POINT_ENTITY__PACKAGE;

    /**
     * The feature id for the '<em><b>Activity Points</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_TYPE__ACTIVITY_POINTS = POINT_ENTITY__ACTIVITY_POINTS;

    /**
     * The number of structural features of the '<em>Device Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_TYPE_FEATURE_COUNT = POINT_ENTITY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Device Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEVICE_TYPE_OPERATION_COUNT = POINT_ENTITY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.type.world.impl.InformationSystemImpl <em>Information System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.type.world.impl.InformationSystemImpl
     * @see structure.type.world.impl.WorldPackageImpl#getInformationSystem()
     * @generated
     */
    int INFORMATION_SYSTEM = 11;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION_SYSTEM__VISUAL_ELEMENTS = INTANGIBLE_ENTITY__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION_SYSTEM__ID = INTANGIBLE_ENTITY__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION_SYSTEM__NAME = INTANGIBLE_ENTITY__NAME;

    /**
     * The feature id for the '<em><b>Interaction Point Participations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION_SYSTEM__INTERACTION_POINT_PARTICIPATIONS = INTANGIBLE_ENTITY__INTERACTION_POINT_PARTICIPATIONS;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION_SYSTEM__INSTANTIATIONS = INTANGIBLE_ENTITY__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Contained Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION_SYSTEM__CONTAINED_INSTANTIATIONS = INTANGIBLE_ENTITY__CONTAINED_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Super Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION_SYSTEM__SUPER_TYPES = INTANGIBLE_ENTITY__SUPER_TYPES;

    /**
     * The feature id for the '<em><b>Sub Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION_SYSTEM__SUB_TYPES = INTANGIBLE_ENTITY__SUB_TYPES;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION_SYSTEM__PACKAGE = INTANGIBLE_ENTITY__PACKAGE;

    /**
     * The feature id for the '<em><b>Activity Points</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION_SYSTEM__ACTIVITY_POINTS = INTANGIBLE_ENTITY__ACTIVITY_POINTS;

    /**
     * The number of structural features of the '<em>Information System</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION_SYSTEM_FEATURE_COUNT = INTANGIBLE_ENTITY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Information System</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFORMATION_SYSTEM_OPERATION_COUNT = INTANGIBLE_ENTITY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.type.world.impl.AdministratorImpl <em>Administrator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.type.world.impl.AdministratorImpl
     * @see structure.type.world.impl.WorldPackageImpl#getAdministrator()
     * @generated
     */
    int ADMINISTRATOR = 12;

    /**
     * The number of structural features of the '<em>Administrator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADMINISTRATOR_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Administrator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADMINISTRATOR_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link structure.type.world.impl.StakeholderImpl <em>Stakeholder</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.type.world.impl.StakeholderImpl
     * @see structure.type.world.impl.WorldPackageImpl#getStakeholder()
     * @generated
     */
    int STAKEHOLDER = 13;

    /**
     * The number of structural features of the '<em>Stakeholder</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STAKEHOLDER_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Stakeholder</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STAKEHOLDER_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link structure.type.world.impl.OwnerImpl <em>Owner</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.type.world.impl.OwnerImpl
     * @see structure.type.world.impl.WorldPackageImpl#getOwner()
     * @generated
     */
    int OWNER = 14;

    /**
     * The number of structural features of the '<em>Owner</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNER_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Owner</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNER_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link structure.type.world.impl.ContainedTypeRoleImpl <em>Contained Type Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.type.world.impl.ContainedTypeRoleImpl
     * @see structure.type.world.impl.WorldPackageImpl#getContainedTypeRole()
     * @generated
     */
    int CONTAINED_TYPE_ROLE = 15;

    /**
     * The feature id for the '<em><b>Levels</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINED_TYPE_ROLE__LEVELS = 0;

    /**
     * The feature id for the '<em><b>Rooms</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINED_TYPE_ROLE__ROOMS = 1;

    /**
     * The feature id for the '<em><b>Role</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINED_TYPE_ROLE__ROLE = 2;

    /**
     * The number of structural features of the '<em>Contained Type Role</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINED_TYPE_ROLE_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Contained Type Role</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINED_TYPE_ROLE_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link structure.type.world.ServiceAssembly <em>Service Assembly</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service Assembly</em>'.
     * @see structure.type.world.ServiceAssembly
     * @generated
     */
    EClass getServiceAssembly();

    /**
     * Returns the meta object for class '{@link structure.type.world.Person <em>Person</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Person</em>'.
     * @see structure.type.world.Person
     * @generated
     */
    EClass getPerson();

    /**
     * Returns the meta object for class '{@link structure.type.world.Building <em>Building</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Building</em>'.
     * @see structure.type.world.Building
     * @generated
     */
    EClass getBuilding();

    /**
     * Returns the meta object for class '{@link structure.type.world.Room <em>Room</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Room</em>'.
     * @see structure.type.world.Room
     * @generated
     */
    EClass getRoom();

    /**
     * Returns the meta object for class '{@link structure.type.world.SoftwareEntity <em>Software Entity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Software Entity</em>'.
     * @see structure.type.world.SoftwareEntity
     * @generated
     */
    EClass getSoftwareEntity();

    /**
     * Returns the meta object for class '{@link structure.type.world.IntangibleEntity <em>Intangible Entity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Intangible Entity</em>'.
     * @see structure.type.world.IntangibleEntity
     * @generated
     */
    EClass getIntangibleEntity();

    /**
     * Returns the meta object for class '{@link structure.type.world.TangibleEntity <em>Tangible Entity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Tangible Entity</em>'.
     * @see structure.type.world.TangibleEntity
     * @generated
     */
    EClass getTangibleEntity();

    /**
     * Returns the meta object for class '{@link structure.type.world.PointEntity <em>Point Entity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Point Entity</em>'.
     * @see structure.type.world.PointEntity
     * @generated
     */
    EClass getPointEntity();

    /**
     * Returns the meta object for class '{@link structure.type.world.PhysicalContainerEntity <em>Physical Container Entity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Physical Container Entity</em>'.
     * @see structure.type.world.PhysicalContainerEntity
     * @generated
     */
    EClass getPhysicalContainerEntity();

    /**
     * Returns the meta object for class '{@link structure.type.world.Level <em>Level</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Level</em>'.
     * @see structure.type.world.Level
     * @generated
     */
    EClass getLevel();

    /**
     * Returns the meta object for class '{@link structure.type.world.DeviceType <em>Device Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Device Type</em>'.
     * @see structure.type.world.DeviceType
     * @generated
     */
    EClass getDeviceType();

    /**
     * Returns the meta object for class '{@link structure.type.world.InformationSystem <em>Information System</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Information System</em>'.
     * @see structure.type.world.InformationSystem
     * @generated
     */
    EClass getInformationSystem();

    /**
     * Returns the meta object for class '{@link structure.type.world.Administrator <em>Administrator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Administrator</em>'.
     * @see structure.type.world.Administrator
     * @generated
     */
    EClass getAdministrator();

    /**
     * Returns the meta object for class '{@link structure.type.world.Stakeholder <em>Stakeholder</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Stakeholder</em>'.
     * @see structure.type.world.Stakeholder
     * @generated
     */
    EClass getStakeholder();

    /**
     * Returns the meta object for class '{@link structure.type.world.Owner <em>Owner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Owner</em>'.
     * @see structure.type.world.Owner
     * @generated
     */
    EClass getOwner();

    /**
     * Returns the meta object for class '{@link structure.type.world.ContainedTypeRole <em>Contained Type Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Contained Type Role</em>'.
     * @see structure.type.world.ContainedTypeRole
     * @generated
     */
    EClass getContainedTypeRole();

    /**
     * Returns the meta object for the containment reference list '{@link structure.type.world.ContainedTypeRole#getLevels <em>Levels</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Levels</em>'.
     * @see structure.type.world.ContainedTypeRole#getLevels()
     * @see #getContainedTypeRole()
     * @generated
     */
    EReference getContainedTypeRole_Levels();

    /**
     * Returns the meta object for the containment reference list '{@link structure.type.world.ContainedTypeRole#getRooms <em>Rooms</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Rooms</em>'.
     * @see structure.type.world.ContainedTypeRole#getRooms()
     * @see #getContainedTypeRole()
     * @generated
     */
    EReference getContainedTypeRole_Rooms();

    /**
     * Returns the meta object for the attribute '{@link structure.type.world.ContainedTypeRole#getRole <em>Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Role</em>'.
     * @see structure.type.world.ContainedTypeRole#getRole()
     * @see #getContainedTypeRole()
     * @generated
     */
    EAttribute getContainedTypeRole_Role();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    WorldFactory getWorldFactory();

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
         * The meta object literal for the '{@link structure.type.world.impl.ServiceAssemblyImpl <em>Service Assembly</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.type.world.impl.ServiceAssemblyImpl
         * @see structure.type.world.impl.WorldPackageImpl#getServiceAssembly()
         * @generated
         */
        EClass SERVICE_ASSEMBLY = eINSTANCE.getServiceAssembly();

        /**
         * The meta object literal for the '{@link structure.type.world.impl.PersonImpl <em>Person</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.type.world.impl.PersonImpl
         * @see structure.type.world.impl.WorldPackageImpl#getPerson()
         * @generated
         */
        EClass PERSON = eINSTANCE.getPerson();

        /**
         * The meta object literal for the '{@link structure.type.world.impl.BuildingImpl <em>Building</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.type.world.impl.BuildingImpl
         * @see structure.type.world.impl.WorldPackageImpl#getBuilding()
         * @generated
         */
        EClass BUILDING = eINSTANCE.getBuilding();

        /**
         * The meta object literal for the '{@link structure.type.world.impl.RoomImpl <em>Room</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.type.world.impl.RoomImpl
         * @see structure.type.world.impl.WorldPackageImpl#getRoom()
         * @generated
         */
        EClass ROOM = eINSTANCE.getRoom();

        /**
         * The meta object literal for the '{@link structure.type.world.impl.SoftwareEntityImpl <em>Software Entity</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.type.world.impl.SoftwareEntityImpl
         * @see structure.type.world.impl.WorldPackageImpl#getSoftwareEntity()
         * @generated
         */
        EClass SOFTWARE_ENTITY = eINSTANCE.getSoftwareEntity();

        /**
         * The meta object literal for the '{@link structure.type.world.impl.IntangibleEntityImpl <em>Intangible Entity</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.type.world.impl.IntangibleEntityImpl
         * @see structure.type.world.impl.WorldPackageImpl#getIntangibleEntity()
         * @generated
         */
        EClass INTANGIBLE_ENTITY = eINSTANCE.getIntangibleEntity();

        /**
         * The meta object literal for the '{@link structure.type.world.impl.TangibleEntityImpl <em>Tangible Entity</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.type.world.impl.TangibleEntityImpl
         * @see structure.type.world.impl.WorldPackageImpl#getTangibleEntity()
         * @generated
         */
        EClass TANGIBLE_ENTITY = eINSTANCE.getTangibleEntity();

        /**
         * The meta object literal for the '{@link structure.type.world.impl.PointEntityImpl <em>Point Entity</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.type.world.impl.PointEntityImpl
         * @see structure.type.world.impl.WorldPackageImpl#getPointEntity()
         * @generated
         */
        EClass POINT_ENTITY = eINSTANCE.getPointEntity();

        /**
         * The meta object literal for the '{@link structure.type.world.impl.PhysicalContainerEntityImpl <em>Physical Container Entity</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.type.world.impl.PhysicalContainerEntityImpl
         * @see structure.type.world.impl.WorldPackageImpl#getPhysicalContainerEntity()
         * @generated
         */
        EClass PHYSICAL_CONTAINER_ENTITY = eINSTANCE.getPhysicalContainerEntity();

        /**
         * The meta object literal for the '{@link structure.type.world.impl.LevelImpl <em>Level</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.type.world.impl.LevelImpl
         * @see structure.type.world.impl.WorldPackageImpl#getLevel()
         * @generated
         */
        EClass LEVEL = eINSTANCE.getLevel();

        /**
         * The meta object literal for the '{@link structure.type.world.impl.DeviceTypeImpl <em>Device Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.type.world.impl.DeviceTypeImpl
         * @see structure.type.world.impl.WorldPackageImpl#getDeviceType()
         * @generated
         */
        EClass DEVICE_TYPE = eINSTANCE.getDeviceType();

        /**
         * The meta object literal for the '{@link structure.type.world.impl.InformationSystemImpl <em>Information System</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.type.world.impl.InformationSystemImpl
         * @see structure.type.world.impl.WorldPackageImpl#getInformationSystem()
         * @generated
         */
        EClass INFORMATION_SYSTEM = eINSTANCE.getInformationSystem();

        /**
         * The meta object literal for the '{@link structure.type.world.impl.AdministratorImpl <em>Administrator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.type.world.impl.AdministratorImpl
         * @see structure.type.world.impl.WorldPackageImpl#getAdministrator()
         * @generated
         */
        EClass ADMINISTRATOR = eINSTANCE.getAdministrator();

        /**
         * The meta object literal for the '{@link structure.type.world.impl.StakeholderImpl <em>Stakeholder</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.type.world.impl.StakeholderImpl
         * @see structure.type.world.impl.WorldPackageImpl#getStakeholder()
         * @generated
         */
        EClass STAKEHOLDER = eINSTANCE.getStakeholder();

        /**
         * The meta object literal for the '{@link structure.type.world.impl.OwnerImpl <em>Owner</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.type.world.impl.OwnerImpl
         * @see structure.type.world.impl.WorldPackageImpl#getOwner()
         * @generated
         */
        EClass OWNER = eINSTANCE.getOwner();

        /**
         * The meta object literal for the '{@link structure.type.world.impl.ContainedTypeRoleImpl <em>Contained Type Role</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.type.world.impl.ContainedTypeRoleImpl
         * @see structure.type.world.impl.WorldPackageImpl#getContainedTypeRole()
         * @generated
         */
        EClass CONTAINED_TYPE_ROLE = eINSTANCE.getContainedTypeRole();

        /**
         * The meta object literal for the '<em><b>Levels</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTAINED_TYPE_ROLE__LEVELS = eINSTANCE.getContainedTypeRole_Levels();

        /**
         * The meta object literal for the '<em><b>Rooms</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTAINED_TYPE_ROLE__ROOMS = eINSTANCE.getContainedTypeRole_Rooms();

        /**
         * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTAINED_TYPE_ROLE__ROLE = eINSTANCE.getContainedTypeRole_Role();

    }

} //WorldPackage
