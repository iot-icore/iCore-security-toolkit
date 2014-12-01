/**
 */
package role;

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
 * @see role.RoleFactory
 * @model kind="package"
 * @generated
 */
public interface RolePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "role";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://role/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "role";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    RolePackage eINSTANCE = role.impl.RolePackageImpl.init();

    /**
     * The meta object id for the '{@link role.impl.RoleTypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see role.impl.RoleTypeImpl
     * @see role.impl.RolePackageImpl#getRoleType()
     * @generated
     */
    int ROLE_TYPE = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_TYPE__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_TYPE__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Sub Roles</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_TYPE__SUB_ROLES = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Super Roles</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_TYPE__SUPER_ROLES = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_TYPE__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_TYPE_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_TYPE_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link role.impl.RoleDesignModelImpl <em>Design Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see role.impl.RoleDesignModelImpl
     * @see role.impl.RolePackageImpl#getRoleDesignModel()
     * @generated
     */
    int ROLE_DESIGN_MODEL = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_DESIGN_MODEL__ID = ModelsPackage.MODEL__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_DESIGN_MODEL__VISUAL_ELEMENTS = ModelsPackage.MODEL__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_DESIGN_MODEL__DESCRIPTION = ModelsPackage.MODEL__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_DESIGN_MODEL__FILENAME = ModelsPackage.MODEL__FILENAME;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_DESIGN_MODEL__URI = ModelsPackage.MODEL__URI;

    /**
     * The feature id for the '<em><b>Packages</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_DESIGN_MODEL__PACKAGES = ModelsPackage.MODEL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Design Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_DESIGN_MODEL_FEATURE_COUNT = ModelsPackage.MODEL_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Design Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_DESIGN_MODEL_OPERATION_COUNT = ModelsPackage.MODEL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link role.impl.RoleTypePackageImpl <em>Type Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see role.impl.RoleTypePackageImpl
     * @see role.impl.RolePackageImpl#getRoleTypePackage()
     * @generated
     */
    int ROLE_TYPE_PACKAGE = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_TYPE_PACKAGE__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_TYPE_PACKAGE__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Role Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_TYPE_PACKAGE__ROLE_TYPES = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_TYPE_PACKAGE__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Sub Packages</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_TYPE_PACKAGE__SUB_PACKAGES = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Super Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_TYPE_PACKAGE__SUPER_PACKAGE = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_TYPE_PACKAGE__MODEL = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Type Package</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_TYPE_PACKAGE_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Type Package</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_TYPE_PACKAGE_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link role.impl.RoleRuntimeModelImpl <em>Runtime Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see role.impl.RoleRuntimeModelImpl
     * @see role.impl.RolePackageImpl#getRoleRuntimeModel()
     * @generated
     */
    int ROLE_RUNTIME_MODEL = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_RUNTIME_MODEL__ID = ModelsPackage.MODEL__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_RUNTIME_MODEL__VISUAL_ELEMENTS = ModelsPackage.MODEL__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_RUNTIME_MODEL__DESCRIPTION = ModelsPackage.MODEL__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_RUNTIME_MODEL__FILENAME = ModelsPackage.MODEL__FILENAME;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_RUNTIME_MODEL__URI = ModelsPackage.MODEL__URI;

    /**
     * The feature id for the '<em><b>Role Map</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_RUNTIME_MODEL__ROLE_MAP = ModelsPackage.MODEL_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_RUNTIME_MODEL__ASSIGNMENTS = ModelsPackage.MODEL_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Runtime Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_RUNTIME_MODEL_FEATURE_COUNT = ModelsPackage.MODEL_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Runtime Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_RUNTIME_MODEL_OPERATION_COUNT = ModelsPackage.MODEL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link role.impl.RoleAssignmentMapImpl <em>Assignment Map</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see role.impl.RoleAssignmentMapImpl
     * @see role.impl.RolePackageImpl#getRoleAssignmentMap()
     * @generated
     */
    int ROLE_ASSIGNMENT_MAP = 4;

    /**
     * The feature id for the '<em><b>Key</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_ASSIGNMENT_MAP__KEY = 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_ASSIGNMENT_MAP__VALUE = 1;

    /**
     * The number of structural features of the '<em>Assignment Map</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_ASSIGNMENT_MAP_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Assignment Map</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_ASSIGNMENT_MAP_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link role.impl.RoleAssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see role.impl.RoleAssignmentImpl
     * @see role.impl.RolePackageImpl#getRoleAssignment()
     * @generated
     */
    int ROLE_ASSIGNMENT = 5;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_ASSIGNMENT__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_ASSIGNMENT__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Role Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_ASSIGNMENT__ROLE_TYPE = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Identities</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_ASSIGNMENT__IDENTITIES = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_ASSIGNMENT_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_ASSIGNMENT_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link role.impl.AbstractRolePatternImpl <em>Abstract Role Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see role.impl.AbstractRolePatternImpl
     * @see role.impl.RolePackageImpl#getAbstractRolePattern()
     * @generated
     */
    int ABSTRACT_ROLE_PATTERN = 8;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_ROLE_PATTERN__ID = ModelsPackage.PATTERN__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_ROLE_PATTERN__VISUAL_ELEMENTS = ModelsPackage.PATTERN__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Role Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_ROLE_PATTERN__ROLE_TYPE = ModelsPackage.PATTERN_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Abstract Role Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_ROLE_PATTERN_FEATURE_COUNT = ModelsPackage.PATTERN_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Abstract Role Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_ROLE_PATTERN_OPERATION_COUNT = ModelsPackage.PATTERN_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link role.impl.RolePatternImpl <em>Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see role.impl.RolePatternImpl
     * @see role.impl.RolePackageImpl#getRolePattern()
     * @generated
     */
    int ROLE_PATTERN = 6;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_PATTERN__ID = ABSTRACT_ROLE_PATTERN__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_PATTERN__VISUAL_ELEMENTS = ABSTRACT_ROLE_PATTERN__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Role Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_PATTERN__ROLE_TYPE = ABSTRACT_ROLE_PATTERN__ROLE_TYPE;

    /**
     * The number of structural features of the '<em>Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_PATTERN_FEATURE_COUNT = ABSTRACT_ROLE_PATTERN_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROLE_PATTERN_OPERATION_COUNT = ABSTRACT_ROLE_PATTERN_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link role.impl.IdentityRolePatternImpl <em>Identity Role Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see role.impl.IdentityRolePatternImpl
     * @see role.impl.RolePackageImpl#getIdentityRolePattern()
     * @generated
     */
    int IDENTITY_ROLE_PATTERN = 7;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ROLE_PATTERN__ID = ABSTRACT_ROLE_PATTERN__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ROLE_PATTERN__VISUAL_ELEMENTS = ABSTRACT_ROLE_PATTERN__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Role Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ROLE_PATTERN__ROLE_TYPE = ABSTRACT_ROLE_PATTERN__ROLE_TYPE;

    /**
     * The feature id for the '<em><b>Identity Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ROLE_PATTERN__IDENTITY_PATTERN = ABSTRACT_ROLE_PATTERN_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Identity Role Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ROLE_PATTERN_FEATURE_COUNT = ABSTRACT_ROLE_PATTERN_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Identity Role Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ROLE_PATTERN_OPERATION_COUNT = ABSTRACT_ROLE_PATTERN_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link role.RoleType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Type</em>'.
     * @see role.RoleType
     * @generated
     */
    EClass getRoleType();

    /**
     * Returns the meta object for the reference list '{@link role.RoleType#getSubRoles <em>Sub Roles</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Sub Roles</em>'.
     * @see role.RoleType#getSubRoles()
     * @see #getRoleType()
     * @generated
     */
    EReference getRoleType_SubRoles();

    /**
     * Returns the meta object for the reference list '{@link role.RoleType#getSuperRoles <em>Super Roles</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Super Roles</em>'.
     * @see role.RoleType#getSuperRoles()
     * @see #getRoleType()
     * @generated
     */
    EReference getRoleType_SuperRoles();

    /**
     * Returns the meta object for the attribute '{@link role.RoleType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see role.RoleType#getName()
     * @see #getRoleType()
     * @generated
     */
    EAttribute getRoleType_Name();

    /**
     * Returns the meta object for class '{@link role.RoleDesignModel <em>Design Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Design Model</em>'.
     * @see role.RoleDesignModel
     * @generated
     */
    EClass getRoleDesignModel();

    /**
     * Returns the meta object for the containment reference list '{@link role.RoleDesignModel#getPackages <em>Packages</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Packages</em>'.
     * @see role.RoleDesignModel#getPackages()
     * @see #getRoleDesignModel()
     * @generated
     */
    EReference getRoleDesignModel_Packages();

    /**
     * Returns the meta object for class '{@link role.RoleTypePackage <em>Type Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Type Package</em>'.
     * @see role.RoleTypePackage
     * @generated
     */
    EClass getRoleTypePackage();

    /**
     * Returns the meta object for the containment reference list '{@link role.RoleTypePackage#getRoleTypes <em>Role Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Role Types</em>'.
     * @see role.RoleTypePackage#getRoleTypes()
     * @see #getRoleTypePackage()
     * @generated
     */
    EReference getRoleTypePackage_RoleTypes();

    /**
     * Returns the meta object for the attribute '{@link role.RoleTypePackage#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see role.RoleTypePackage#getName()
     * @see #getRoleTypePackage()
     * @generated
     */
    EAttribute getRoleTypePackage_Name();

    /**
     * Returns the meta object for the containment reference list '{@link role.RoleTypePackage#getSubPackages <em>Sub Packages</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sub Packages</em>'.
     * @see role.RoleTypePackage#getSubPackages()
     * @see #getRoleTypePackage()
     * @generated
     */
    EReference getRoleTypePackage_SubPackages();

    /**
     * Returns the meta object for the container reference '{@link role.RoleTypePackage#getSuperPackage <em>Super Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Super Package</em>'.
     * @see role.RoleTypePackage#getSuperPackage()
     * @see #getRoleTypePackage()
     * @generated
     */
    EReference getRoleTypePackage_SuperPackage();

    /**
     * Returns the meta object for the container reference '{@link role.RoleTypePackage#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Model</em>'.
     * @see role.RoleTypePackage#getModel()
     * @see #getRoleTypePackage()
     * @generated
     */
    EReference getRoleTypePackage_Model();

    /**
     * Returns the meta object for class '{@link role.RoleRuntimeModel <em>Runtime Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Runtime Model</em>'.
     * @see role.RoleRuntimeModel
     * @generated
     */
    EClass getRoleRuntimeModel();

    /**
     * Returns the meta object for the map '{@link role.RoleRuntimeModel#getRoleMap <em>Role Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>Role Map</em>'.
     * @see role.RoleRuntimeModel#getRoleMap()
     * @see #getRoleRuntimeModel()
     * @generated
     */
    EReference getRoleRuntimeModel_RoleMap();

    /**
     * Returns the meta object for the containment reference list '{@link role.RoleRuntimeModel#getAssignments <em>Assignments</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Assignments</em>'.
     * @see role.RoleRuntimeModel#getAssignments()
     * @see #getRoleRuntimeModel()
     * @generated
     */
    EReference getRoleRuntimeModel_Assignments();

    /**
     * Returns the meta object for class '{@link java.util.Map.Entry <em>Assignment Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Assignment Map</em>'.
     * @see java.util.Map.Entry
     * @model keyType="role.RoleType" keyRequired="true"
     *        valueType="role.RoleAssignment" valueRequired="true"
     * @generated
     */
    EClass getRoleAssignmentMap();

    /**
     * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Key</em>'.
     * @see java.util.Map.Entry
     * @see #getRoleAssignmentMap()
     * @generated
     */
    EReference getRoleAssignmentMap_Key();

    /**
     * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Value</em>'.
     * @see java.util.Map.Entry
     * @see #getRoleAssignmentMap()
     * @generated
     */
    EReference getRoleAssignmentMap_Value();

    /**
     * Returns the meta object for class '{@link role.RoleAssignment <em>Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Assignment</em>'.
     * @see role.RoleAssignment
     * @generated
     */
    EClass getRoleAssignment();

    /**
     * Returns the meta object for the reference '{@link role.RoleAssignment#getRoleType <em>Role Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Role Type</em>'.
     * @see role.RoleAssignment#getRoleType()
     * @see #getRoleAssignment()
     * @generated
     */
    EReference getRoleAssignment_RoleType();

    /**
     * Returns the meta object for the reference list '{@link role.RoleAssignment#getIdentities <em>Identities</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Identities</em>'.
     * @see role.RoleAssignment#getIdentities()
     * @see #getRoleAssignment()
     * @generated
     */
    EReference getRoleAssignment_Identities();

    /**
     * Returns the meta object for class '{@link role.RolePattern <em>Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Pattern</em>'.
     * @see role.RolePattern
     * @generated
     */
    EClass getRolePattern();

    /**
     * Returns the meta object for class '{@link role.IdentityRolePattern <em>Identity Role Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Identity Role Pattern</em>'.
     * @see role.IdentityRolePattern
     * @generated
     */
    EClass getIdentityRolePattern();

    /**
     * Returns the meta object for the containment reference '{@link role.IdentityRolePattern#getIdentityPattern <em>Identity Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Identity Pattern</em>'.
     * @see role.IdentityRolePattern#getIdentityPattern()
     * @see #getIdentityRolePattern()
     * @generated
     */
    EReference getIdentityRolePattern_IdentityPattern();

    /**
     * Returns the meta object for class '{@link role.AbstractRolePattern <em>Abstract Role Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Role Pattern</em>'.
     * @see role.AbstractRolePattern
     * @generated
     */
    EClass getAbstractRolePattern();

    /**
     * Returns the meta object for the reference '{@link role.AbstractRolePattern#getRoleType <em>Role Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Role Type</em>'.
     * @see role.AbstractRolePattern#getRoleType()
     * @see #getAbstractRolePattern()
     * @generated
     */
    EReference getAbstractRolePattern_RoleType();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    RoleFactory getRoleFactory();

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
         * The meta object literal for the '{@link role.impl.RoleTypeImpl <em>Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see role.impl.RoleTypeImpl
         * @see role.impl.RolePackageImpl#getRoleType()
         * @generated
         */
        EClass ROLE_TYPE = eINSTANCE.getRoleType();

        /**
         * The meta object literal for the '<em><b>Sub Roles</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROLE_TYPE__SUB_ROLES = eINSTANCE.getRoleType_SubRoles();

        /**
         * The meta object literal for the '<em><b>Super Roles</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROLE_TYPE__SUPER_ROLES = eINSTANCE.getRoleType_SuperRoles();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ROLE_TYPE__NAME = eINSTANCE.getRoleType_Name();

        /**
         * The meta object literal for the '{@link role.impl.RoleDesignModelImpl <em>Design Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see role.impl.RoleDesignModelImpl
         * @see role.impl.RolePackageImpl#getRoleDesignModel()
         * @generated
         */
        EClass ROLE_DESIGN_MODEL = eINSTANCE.getRoleDesignModel();

        /**
         * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROLE_DESIGN_MODEL__PACKAGES = eINSTANCE.getRoleDesignModel_Packages();

        /**
         * The meta object literal for the '{@link role.impl.RoleTypePackageImpl <em>Type Package</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see role.impl.RoleTypePackageImpl
         * @see role.impl.RolePackageImpl#getRoleTypePackage()
         * @generated
         */
        EClass ROLE_TYPE_PACKAGE = eINSTANCE.getRoleTypePackage();

        /**
         * The meta object literal for the '<em><b>Role Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROLE_TYPE_PACKAGE__ROLE_TYPES = eINSTANCE.getRoleTypePackage_RoleTypes();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ROLE_TYPE_PACKAGE__NAME = eINSTANCE.getRoleTypePackage_Name();

        /**
         * The meta object literal for the '<em><b>Sub Packages</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROLE_TYPE_PACKAGE__SUB_PACKAGES = eINSTANCE.getRoleTypePackage_SubPackages();

        /**
         * The meta object literal for the '<em><b>Super Package</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROLE_TYPE_PACKAGE__SUPER_PACKAGE = eINSTANCE.getRoleTypePackage_SuperPackage();

        /**
         * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROLE_TYPE_PACKAGE__MODEL = eINSTANCE.getRoleTypePackage_Model();

        /**
         * The meta object literal for the '{@link role.impl.RoleRuntimeModelImpl <em>Runtime Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see role.impl.RoleRuntimeModelImpl
         * @see role.impl.RolePackageImpl#getRoleRuntimeModel()
         * @generated
         */
        EClass ROLE_RUNTIME_MODEL = eINSTANCE.getRoleRuntimeModel();

        /**
         * The meta object literal for the '<em><b>Role Map</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROLE_RUNTIME_MODEL__ROLE_MAP = eINSTANCE.getRoleRuntimeModel_RoleMap();

        /**
         * The meta object literal for the '<em><b>Assignments</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROLE_RUNTIME_MODEL__ASSIGNMENTS = eINSTANCE.getRoleRuntimeModel_Assignments();

        /**
         * The meta object literal for the '{@link role.impl.RoleAssignmentMapImpl <em>Assignment Map</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see role.impl.RoleAssignmentMapImpl
         * @see role.impl.RolePackageImpl#getRoleAssignmentMap()
         * @generated
         */
        EClass ROLE_ASSIGNMENT_MAP = eINSTANCE.getRoleAssignmentMap();

        /**
         * The meta object literal for the '<em><b>Key</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROLE_ASSIGNMENT_MAP__KEY = eINSTANCE.getRoleAssignmentMap_Key();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROLE_ASSIGNMENT_MAP__VALUE = eINSTANCE.getRoleAssignmentMap_Value();

        /**
         * The meta object literal for the '{@link role.impl.RoleAssignmentImpl <em>Assignment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see role.impl.RoleAssignmentImpl
         * @see role.impl.RolePackageImpl#getRoleAssignment()
         * @generated
         */
        EClass ROLE_ASSIGNMENT = eINSTANCE.getRoleAssignment();

        /**
         * The meta object literal for the '<em><b>Role Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROLE_ASSIGNMENT__ROLE_TYPE = eINSTANCE.getRoleAssignment_RoleType();

        /**
         * The meta object literal for the '<em><b>Identities</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROLE_ASSIGNMENT__IDENTITIES = eINSTANCE.getRoleAssignment_Identities();

        /**
         * The meta object literal for the '{@link role.impl.RolePatternImpl <em>Pattern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see role.impl.RolePatternImpl
         * @see role.impl.RolePackageImpl#getRolePattern()
         * @generated
         */
        EClass ROLE_PATTERN = eINSTANCE.getRolePattern();

        /**
         * The meta object literal for the '{@link role.impl.IdentityRolePatternImpl <em>Identity Role Pattern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see role.impl.IdentityRolePatternImpl
         * @see role.impl.RolePackageImpl#getIdentityRolePattern()
         * @generated
         */
        EClass IDENTITY_ROLE_PATTERN = eINSTANCE.getIdentityRolePattern();

        /**
         * The meta object literal for the '<em><b>Identity Pattern</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IDENTITY_ROLE_PATTERN__IDENTITY_PATTERN = eINSTANCE.getIdentityRolePattern_IdentityPattern();

        /**
         * The meta object literal for the '{@link role.impl.AbstractRolePatternImpl <em>Abstract Role Pattern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see role.impl.AbstractRolePatternImpl
         * @see role.impl.RolePackageImpl#getAbstractRolePattern()
         * @generated
         */
        EClass ABSTRACT_ROLE_PATTERN = eINSTANCE.getAbstractRolePattern();

        /**
         * The meta object literal for the '<em><b>Role Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_ROLE_PATTERN__ROLE_TYPE = eINSTANCE.getAbstractRolePattern_RoleType();

    }

} //RolePackage
