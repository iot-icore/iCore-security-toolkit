/**
 */
package behavior.type.action;

import behavior.type.TypePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see behavior.type.action.ActionFactory
 * @model kind="package"
 * @generated
 */
public interface ActionPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "action";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://behavior/type/action/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "behavior-type-action";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ActionPackage eINSTANCE = behavior.type.action.impl.ActionPackageImpl.init();

    /**
     * The meta object id for the '{@link behavior.type.action.impl.PersistenceStorageActionTypeImpl <em>Persistence Storage Action Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.type.action.impl.PersistenceStorageActionTypeImpl
     * @see behavior.type.action.impl.ActionPackageImpl#getPersistenceStorageActionType()
     * @generated
     */
    int PERSISTENCE_STORAGE_ACTION_TYPE = 4;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSISTENCE_STORAGE_ACTION_TYPE__VISUAL_ELEMENTS = TypePackage.ACTION_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSISTENCE_STORAGE_ACTION_TYPE__ID = TypePackage.ACTION_TYPE__ID;

    /**
     * The feature id for the '<em><b>Data Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSISTENCE_STORAGE_ACTION_TYPE__DATA_INSTANTIATIONS = TypePackage.ACTION_TYPE__DATA_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Identity Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSISTENCE_STORAGE_ACTION_TYPE__IDENTITY_INSTANTIATIONS = TypePackage.ACTION_TYPE__IDENTITY_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSISTENCE_STORAGE_ACTION_TYPE__CONSTRAINTS = TypePackage.ACTION_TYPE__CONSTRAINTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSISTENCE_STORAGE_ACTION_TYPE__NAME = TypePackage.ACTION_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSISTENCE_STORAGE_ACTION_TYPE__PACKAGE = TypePackage.ACTION_TYPE__PACKAGE;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSISTENCE_STORAGE_ACTION_TYPE__INSTANTIATIONS = TypePackage.ACTION_TYPE__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Sub Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSISTENCE_STORAGE_ACTION_TYPE__SUB_TYPES = TypePackage.ACTION_TYPE__SUB_TYPES;

    /**
     * The feature id for the '<em><b>Super Types</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSISTENCE_STORAGE_ACTION_TYPE__SUPER_TYPES = TypePackage.ACTION_TYPE__SUPER_TYPES;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSISTENCE_STORAGE_ACTION_TYPE__INSTANCES = TypePackage.ACTION_TYPE__INSTANCES;

    /**
     * The number of structural features of the '<em>Persistence Storage Action Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSISTENCE_STORAGE_ACTION_TYPE_FEATURE_COUNT = TypePackage.ACTION_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Persistence Storage Action Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSISTENCE_STORAGE_ACTION_TYPE_OPERATION_COUNT = TypePackage.ACTION_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.type.action.impl.CreateImpl <em>Create</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.type.action.impl.CreateImpl
     * @see behavior.type.action.impl.ActionPackageImpl#getCreate()
     * @generated
     */
    int CREATE = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREATE__VISUAL_ELEMENTS = PERSISTENCE_STORAGE_ACTION_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREATE__ID = PERSISTENCE_STORAGE_ACTION_TYPE__ID;

    /**
     * The feature id for the '<em><b>Data Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREATE__DATA_INSTANTIATIONS = PERSISTENCE_STORAGE_ACTION_TYPE__DATA_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Identity Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREATE__IDENTITY_INSTANTIATIONS = PERSISTENCE_STORAGE_ACTION_TYPE__IDENTITY_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREATE__CONSTRAINTS = PERSISTENCE_STORAGE_ACTION_TYPE__CONSTRAINTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREATE__NAME = PERSISTENCE_STORAGE_ACTION_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREATE__PACKAGE = PERSISTENCE_STORAGE_ACTION_TYPE__PACKAGE;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREATE__INSTANTIATIONS = PERSISTENCE_STORAGE_ACTION_TYPE__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Sub Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREATE__SUB_TYPES = PERSISTENCE_STORAGE_ACTION_TYPE__SUB_TYPES;

    /**
     * The feature id for the '<em><b>Super Types</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREATE__SUPER_TYPES = PERSISTENCE_STORAGE_ACTION_TYPE__SUPER_TYPES;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREATE__INSTANCES = PERSISTENCE_STORAGE_ACTION_TYPE__INSTANCES;

    /**
     * The number of structural features of the '<em>Create</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREATE_FEATURE_COUNT = PERSISTENCE_STORAGE_ACTION_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Create</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREATE_OPERATION_COUNT = PERSISTENCE_STORAGE_ACTION_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.type.action.impl.ReadImpl <em>Read</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.type.action.impl.ReadImpl
     * @see behavior.type.action.impl.ActionPackageImpl#getRead()
     * @generated
     */
    int READ = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int READ__VISUAL_ELEMENTS = PERSISTENCE_STORAGE_ACTION_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int READ__ID = PERSISTENCE_STORAGE_ACTION_TYPE__ID;

    /**
     * The feature id for the '<em><b>Data Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int READ__DATA_INSTANTIATIONS = PERSISTENCE_STORAGE_ACTION_TYPE__DATA_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Identity Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int READ__IDENTITY_INSTANTIATIONS = PERSISTENCE_STORAGE_ACTION_TYPE__IDENTITY_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int READ__CONSTRAINTS = PERSISTENCE_STORAGE_ACTION_TYPE__CONSTRAINTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int READ__NAME = PERSISTENCE_STORAGE_ACTION_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int READ__PACKAGE = PERSISTENCE_STORAGE_ACTION_TYPE__PACKAGE;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int READ__INSTANTIATIONS = PERSISTENCE_STORAGE_ACTION_TYPE__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Sub Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int READ__SUB_TYPES = PERSISTENCE_STORAGE_ACTION_TYPE__SUB_TYPES;

    /**
     * The feature id for the '<em><b>Super Types</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int READ__SUPER_TYPES = PERSISTENCE_STORAGE_ACTION_TYPE__SUPER_TYPES;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int READ__INSTANCES = PERSISTENCE_STORAGE_ACTION_TYPE__INSTANCES;

    /**
     * The number of structural features of the '<em>Read</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int READ_FEATURE_COUNT = PERSISTENCE_STORAGE_ACTION_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Read</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int READ_OPERATION_COUNT = PERSISTENCE_STORAGE_ACTION_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.type.action.impl.UpdateImpl <em>Update</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.type.action.impl.UpdateImpl
     * @see behavior.type.action.impl.ActionPackageImpl#getUpdate()
     * @generated
     */
    int UPDATE = 2;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UPDATE__VISUAL_ELEMENTS = PERSISTENCE_STORAGE_ACTION_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UPDATE__ID = PERSISTENCE_STORAGE_ACTION_TYPE__ID;

    /**
     * The feature id for the '<em><b>Data Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UPDATE__DATA_INSTANTIATIONS = PERSISTENCE_STORAGE_ACTION_TYPE__DATA_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Identity Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UPDATE__IDENTITY_INSTANTIATIONS = PERSISTENCE_STORAGE_ACTION_TYPE__IDENTITY_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UPDATE__CONSTRAINTS = PERSISTENCE_STORAGE_ACTION_TYPE__CONSTRAINTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UPDATE__NAME = PERSISTENCE_STORAGE_ACTION_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UPDATE__PACKAGE = PERSISTENCE_STORAGE_ACTION_TYPE__PACKAGE;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UPDATE__INSTANTIATIONS = PERSISTENCE_STORAGE_ACTION_TYPE__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Sub Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UPDATE__SUB_TYPES = PERSISTENCE_STORAGE_ACTION_TYPE__SUB_TYPES;

    /**
     * The feature id for the '<em><b>Super Types</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UPDATE__SUPER_TYPES = PERSISTENCE_STORAGE_ACTION_TYPE__SUPER_TYPES;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UPDATE__INSTANCES = PERSISTENCE_STORAGE_ACTION_TYPE__INSTANCES;

    /**
     * The number of structural features of the '<em>Update</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UPDATE_FEATURE_COUNT = PERSISTENCE_STORAGE_ACTION_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Update</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UPDATE_OPERATION_COUNT = PERSISTENCE_STORAGE_ACTION_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.type.action.impl.DeleteImpl <em>Delete</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.type.action.impl.DeleteImpl
     * @see behavior.type.action.impl.ActionPackageImpl#getDelete()
     * @generated
     */
    int DELETE = 3;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELETE__VISUAL_ELEMENTS = PERSISTENCE_STORAGE_ACTION_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELETE__ID = PERSISTENCE_STORAGE_ACTION_TYPE__ID;

    /**
     * The feature id for the '<em><b>Data Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELETE__DATA_INSTANTIATIONS = PERSISTENCE_STORAGE_ACTION_TYPE__DATA_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Identity Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELETE__IDENTITY_INSTANTIATIONS = PERSISTENCE_STORAGE_ACTION_TYPE__IDENTITY_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELETE__CONSTRAINTS = PERSISTENCE_STORAGE_ACTION_TYPE__CONSTRAINTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELETE__NAME = PERSISTENCE_STORAGE_ACTION_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELETE__PACKAGE = PERSISTENCE_STORAGE_ACTION_TYPE__PACKAGE;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELETE__INSTANTIATIONS = PERSISTENCE_STORAGE_ACTION_TYPE__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Sub Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELETE__SUB_TYPES = PERSISTENCE_STORAGE_ACTION_TYPE__SUB_TYPES;

    /**
     * The feature id for the '<em><b>Super Types</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELETE__SUPER_TYPES = PERSISTENCE_STORAGE_ACTION_TYPE__SUPER_TYPES;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELETE__INSTANCES = PERSISTENCE_STORAGE_ACTION_TYPE__INSTANCES;

    /**
     * The number of structural features of the '<em>Delete</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELETE_FEATURE_COUNT = PERSISTENCE_STORAGE_ACTION_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Delete</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELETE_OPERATION_COUNT = PERSISTENCE_STORAGE_ACTION_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.type.action.impl.HumanActionImpl <em>Human Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.type.action.impl.HumanActionImpl
     * @see behavior.type.action.impl.ActionPackageImpl#getHumanAction()
     * @generated
     */
    int HUMAN_ACTION = 5;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_ACTION__VISUAL_ELEMENTS = TypePackage.ACTION_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_ACTION__ID = TypePackage.ACTION_TYPE__ID;

    /**
     * The feature id for the '<em><b>Data Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_ACTION__DATA_INSTANTIATIONS = TypePackage.ACTION_TYPE__DATA_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Identity Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_ACTION__IDENTITY_INSTANTIATIONS = TypePackage.ACTION_TYPE__IDENTITY_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_ACTION__CONSTRAINTS = TypePackage.ACTION_TYPE__CONSTRAINTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_ACTION__NAME = TypePackage.ACTION_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_ACTION__PACKAGE = TypePackage.ACTION_TYPE__PACKAGE;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_ACTION__INSTANTIATIONS = TypePackage.ACTION_TYPE__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Sub Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_ACTION__SUB_TYPES = TypePackage.ACTION_TYPE__SUB_TYPES;

    /**
     * The feature id for the '<em><b>Super Types</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_ACTION__SUPER_TYPES = TypePackage.ACTION_TYPE__SUPER_TYPES;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_ACTION__INSTANCES = TypePackage.ACTION_TYPE__INSTANCES;

    /**
     * The number of structural features of the '<em>Human Action</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_ACTION_FEATURE_COUNT = TypePackage.ACTION_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Human Action</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HUMAN_ACTION_OPERATION_COUNT = TypePackage.ACTION_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.type.action.impl.DiscoverEntityImpl <em>Discover Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.type.action.impl.DiscoverEntityImpl
     * @see behavior.type.action.impl.ActionPackageImpl#getDiscoverEntity()
     * @generated
     */
    int DISCOVER_ENTITY = 6;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCOVER_ENTITY__VISUAL_ELEMENTS = TypePackage.ACTION_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCOVER_ENTITY__ID = TypePackage.ACTION_TYPE__ID;

    /**
     * The feature id for the '<em><b>Data Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCOVER_ENTITY__DATA_INSTANTIATIONS = TypePackage.ACTION_TYPE__DATA_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Identity Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCOVER_ENTITY__IDENTITY_INSTANTIATIONS = TypePackage.ACTION_TYPE__IDENTITY_INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCOVER_ENTITY__CONSTRAINTS = TypePackage.ACTION_TYPE__CONSTRAINTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCOVER_ENTITY__NAME = TypePackage.ACTION_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCOVER_ENTITY__PACKAGE = TypePackage.ACTION_TYPE__PACKAGE;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCOVER_ENTITY__INSTANTIATIONS = TypePackage.ACTION_TYPE__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Sub Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCOVER_ENTITY__SUB_TYPES = TypePackage.ACTION_TYPE__SUB_TYPES;

    /**
     * The feature id for the '<em><b>Super Types</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCOVER_ENTITY__SUPER_TYPES = TypePackage.ACTION_TYPE__SUPER_TYPES;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCOVER_ENTITY__INSTANCES = TypePackage.ACTION_TYPE__INSTANCES;

    /**
     * The number of structural features of the '<em>Discover Entity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCOVER_ENTITY_FEATURE_COUNT = TypePackage.ACTION_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Discover Entity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISCOVER_ENTITY_OPERATION_COUNT = TypePackage.ACTION_TYPE_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link behavior.type.action.Create <em>Create</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Create</em>'.
     * @see behavior.type.action.Create
     * @generated
     */
    EClass getCreate();

    /**
     * Returns the meta object for class '{@link behavior.type.action.Read <em>Read</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Read</em>'.
     * @see behavior.type.action.Read
     * @generated
     */
    EClass getRead();

    /**
     * Returns the meta object for class '{@link behavior.type.action.Update <em>Update</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Update</em>'.
     * @see behavior.type.action.Update
     * @generated
     */
    EClass getUpdate();

    /**
     * Returns the meta object for class '{@link behavior.type.action.Delete <em>Delete</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Delete</em>'.
     * @see behavior.type.action.Delete
     * @generated
     */
    EClass getDelete();

    /**
     * Returns the meta object for class '{@link behavior.type.action.PersistenceStorageActionType <em>Persistence Storage Action Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Persistence Storage Action Type</em>'.
     * @see behavior.type.action.PersistenceStorageActionType
     * @generated
     */
    EClass getPersistenceStorageActionType();

    /**
     * Returns the meta object for class '{@link behavior.type.action.HumanAction <em>Human Action</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Human Action</em>'.
     * @see behavior.type.action.HumanAction
     * @generated
     */
    EClass getHumanAction();

    /**
     * Returns the meta object for class '{@link behavior.type.action.DiscoverEntity <em>Discover Entity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Discover Entity</em>'.
     * @see behavior.type.action.DiscoverEntity
     * @generated
     */
    EClass getDiscoverEntity();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ActionFactory getActionFactory();

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
         * The meta object literal for the '{@link behavior.type.action.impl.CreateImpl <em>Create</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.type.action.impl.CreateImpl
         * @see behavior.type.action.impl.ActionPackageImpl#getCreate()
         * @generated
         */
        EClass CREATE = eINSTANCE.getCreate();

        /**
         * The meta object literal for the '{@link behavior.type.action.impl.ReadImpl <em>Read</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.type.action.impl.ReadImpl
         * @see behavior.type.action.impl.ActionPackageImpl#getRead()
         * @generated
         */
        EClass READ = eINSTANCE.getRead();

        /**
         * The meta object literal for the '{@link behavior.type.action.impl.UpdateImpl <em>Update</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.type.action.impl.UpdateImpl
         * @see behavior.type.action.impl.ActionPackageImpl#getUpdate()
         * @generated
         */
        EClass UPDATE = eINSTANCE.getUpdate();

        /**
         * The meta object literal for the '{@link behavior.type.action.impl.DeleteImpl <em>Delete</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.type.action.impl.DeleteImpl
         * @see behavior.type.action.impl.ActionPackageImpl#getDelete()
         * @generated
         */
        EClass DELETE = eINSTANCE.getDelete();

        /**
         * The meta object literal for the '{@link behavior.type.action.impl.PersistenceStorageActionTypeImpl <em>Persistence Storage Action Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.type.action.impl.PersistenceStorageActionTypeImpl
         * @see behavior.type.action.impl.ActionPackageImpl#getPersistenceStorageActionType()
         * @generated
         */
        EClass PERSISTENCE_STORAGE_ACTION_TYPE = eINSTANCE.getPersistenceStorageActionType();

        /**
         * The meta object literal for the '{@link behavior.type.action.impl.HumanActionImpl <em>Human Action</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.type.action.impl.HumanActionImpl
         * @see behavior.type.action.impl.ActionPackageImpl#getHumanAction()
         * @generated
         */
        EClass HUMAN_ACTION = eINSTANCE.getHumanAction();

        /**
         * The meta object literal for the '{@link behavior.type.action.impl.DiscoverEntityImpl <em>Discover Entity</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.type.action.impl.DiscoverEntityImpl
         * @see behavior.type.action.impl.ActionPackageImpl#getDiscoverEntity()
         * @generated
         */
        EClass DISCOVER_ENTITY = eINSTANCE.getDiscoverEntity();

    }

} //ActionPackage
