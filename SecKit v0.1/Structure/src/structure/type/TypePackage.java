/**
 */
package structure.type;

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
 * @see structure.type.TypeFactory
 * @model kind="package"
 * @generated
 */
public interface TypePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "type";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://structure/type/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "structure-type";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TypePackage eINSTANCE = structure.type.impl.TypePackageImpl.init();

    /**
     * The meta object id for the '{@link structure.type.impl.LocationTypeImpl <em>Location Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.type.impl.LocationTypeImpl
     * @see structure.type.impl.TypePackageImpl#getLocationType()
     * @generated
     */
    int LOCATION_TYPE = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCATION_TYPE__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCATION_TYPE__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCATION_TYPE__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCATION_TYPE__INSTANTIATIONS = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCATION_TYPE__PACKAGE = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Location Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCATION_TYPE_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Location Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCATION_TYPE_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.type.impl.InteractionPointParticipationTypeImpl <em>Interaction Point Participation Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.type.impl.InteractionPointParticipationTypeImpl
     * @see structure.type.impl.TypePackageImpl#getInteractionPointParticipationType()
     * @generated
     */
    int INTERACTION_POINT_PARTICIPATION_TYPE = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_TYPE__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_TYPE__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Location Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_TYPE__LOCATION_TYPE = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_TYPE__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_TYPE__INSTANTIATIONS = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_TYPE__PACKAGE = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Interaction Point Participation Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_TYPE_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Interaction Point Participation Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_TYPE_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.type.impl.ActivityPointTypeImpl <em>Activity Point Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.type.impl.ActivityPointTypeImpl
     * @see structure.type.impl.TypePackageImpl#getActivityPointType()
     * @generated
     */
    int ACTIVITY_POINT_TYPE = 6;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_POINT_TYPE__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_POINT_TYPE__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_POINT_TYPE__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_POINT_TYPE__INSTANTIATIONS = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_POINT_TYPE__INSTANCES = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_POINT_TYPE__PACKAGE = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Sub Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_POINT_TYPE__SUB_TYPES = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Super Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_POINT_TYPE__SUPER_TYPE = ModelsPackage.ELEMENT_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Activity Point Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_POINT_TYPE_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Activity Point Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_POINT_TYPE_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.type.impl.ActionPointTypeImpl <em>Action Point Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.type.impl.ActionPointTypeImpl
     * @see structure.type.impl.TypePackageImpl#getActionPointType()
     * @generated
     */
    int ACTION_POINT_TYPE = 2;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_POINT_TYPE__VISUAL_ELEMENTS = ACTIVITY_POINT_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_POINT_TYPE__ID = ACTIVITY_POINT_TYPE__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_POINT_TYPE__NAME = ACTIVITY_POINT_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_POINT_TYPE__INSTANTIATIONS = ACTIVITY_POINT_TYPE__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_POINT_TYPE__INSTANCES = ACTIVITY_POINT_TYPE__INSTANCES;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_POINT_TYPE__PACKAGE = ACTIVITY_POINT_TYPE__PACKAGE;

    /**
     * The feature id for the '<em><b>Sub Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_POINT_TYPE__SUB_TYPES = ACTIVITY_POINT_TYPE__SUB_TYPES;

    /**
     * The feature id for the '<em><b>Super Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_POINT_TYPE__SUPER_TYPE = ACTIVITY_POINT_TYPE__SUPER_TYPE;

    /**
     * The feature id for the '<em><b>Location Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_POINT_TYPE__LOCATION_TYPE = ACTIVITY_POINT_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Action Point Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_POINT_TYPE_FEATURE_COUNT = ACTIVITY_POINT_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Action Point Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_POINT_TYPE_OPERATION_COUNT = ACTIVITY_POINT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.type.impl.InteractionPointTypeImpl <em>Interaction Point Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.type.impl.InteractionPointTypeImpl
     * @see structure.type.impl.TypePackageImpl#getInteractionPointType()
     * @generated
     */
    int INTERACTION_POINT_TYPE = 3;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_TYPE__VISUAL_ELEMENTS = ACTIVITY_POINT_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_TYPE__ID = ACTIVITY_POINT_TYPE__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_TYPE__NAME = ACTIVITY_POINT_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_TYPE__INSTANTIATIONS = ACTIVITY_POINT_TYPE__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_TYPE__INSTANCES = ACTIVITY_POINT_TYPE__INSTANCES;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_TYPE__PACKAGE = ACTIVITY_POINT_TYPE__PACKAGE;

    /**
     * The feature id for the '<em><b>Sub Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_TYPE__SUB_TYPES = ACTIVITY_POINT_TYPE__SUB_TYPES;

    /**
     * The feature id for the '<em><b>Super Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_TYPE__SUPER_TYPE = ACTIVITY_POINT_TYPE__SUPER_TYPE;

    /**
     * The feature id for the '<em><b>Participations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_TYPE__PARTICIPATIONS = ACTIVITY_POINT_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Participation Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_TYPE__PARTICIPATION_TYPE = ACTIVITY_POINT_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Interaction Point Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_TYPE_FEATURE_COUNT = ACTIVITY_POINT_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Interaction Point Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_TYPE_OPERATION_COUNT = ACTIVITY_POINT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.type.impl.EntityTypePackageImpl <em>Entity Type Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.type.impl.EntityTypePackageImpl
     * @see structure.type.impl.TypePackageImpl#getEntityTypePackage()
     * @generated
     */
    int ENTITY_TYPE_PACKAGE = 4;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE_PACKAGE__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE_PACKAGE__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Sub Packages</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE_PACKAGE__SUB_PACKAGES = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Entity Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE_PACKAGE__ENTITY_TYPES = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE_PACKAGE__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Location Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE_PACKAGE__LOCATION_TYPES = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Participation Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE_PACKAGE__PARTICIPATION_TYPES = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Activity Point Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE_PACKAGE__ACTIVITY_POINT_TYPES = ModelsPackage.ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Super Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE_PACKAGE__SUPER_PACKAGE = ModelsPackage.ELEMENT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE_PACKAGE__MODEL = ModelsPackage.ELEMENT_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Entity Type Package</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE_PACKAGE_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 8;

    /**
     * The number of operations of the '<em>Entity Type Package</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE_PACKAGE_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.type.impl.EntityTypeImpl <em>Entity Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.type.impl.EntityTypeImpl
     * @see structure.type.impl.TypePackageImpl#getEntityType()
     * @generated
     */
    int ENTITY_TYPE = 5;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Interaction Point Participations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE__INTERACTION_POINT_PARTICIPATIONS = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE__INSTANTIATIONS = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Contained Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE__CONTAINED_INSTANTIATIONS = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Super Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE__SUPER_TYPES = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Sub Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE__SUB_TYPES = ModelsPackage.ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE__PACKAGE = ModelsPackage.ELEMENT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Activity Points</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE__ACTIVITY_POINTS = ModelsPackage.ELEMENT_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Entity Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 8;

    /**
     * The number of operations of the '<em>Entity Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.type.impl.LocalizableTypeImpl <em>Localizable Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.type.impl.LocalizableTypeImpl
     * @see structure.type.impl.TypePackageImpl#getLocalizableType()
     * @generated
     */
    int LOCALIZABLE_TYPE = 7;

    /**
     * The feature id for the '<em><b>Location Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCALIZABLE_TYPE__LOCATION_TYPE = 0;

    /**
     * The number of structural features of the '<em>Localizable Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCALIZABLE_TYPE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Localizable Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCALIZABLE_TYPE_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link structure.type.LocationType <em>Location Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Location Type</em>'.
     * @see structure.type.LocationType
     * @generated
     */
    EClass getLocationType();

    /**
     * Returns the meta object for the attribute '{@link structure.type.LocationType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see structure.type.LocationType#getName()
     * @see #getLocationType()
     * @generated
     */
    EAttribute getLocationType_Name();

    /**
     * Returns the meta object for the reference list '{@link structure.type.LocationType#getInstantiations <em>Instantiations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Instantiations</em>'.
     * @see structure.type.LocationType#getInstantiations()
     * @see #getLocationType()
     * @generated
     */
    EReference getLocationType_Instantiations();

    /**
     * Returns the meta object for the container reference '{@link structure.type.LocationType#getPackage <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Package</em>'.
     * @see structure.type.LocationType#getPackage()
     * @see #getLocationType()
     * @generated
     */
    EReference getLocationType_Package();

    /**
     * Returns the meta object for class '{@link structure.type.InteractionPointParticipationType <em>Interaction Point Participation Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interaction Point Participation Type</em>'.
     * @see structure.type.InteractionPointParticipationType
     * @generated
     */
    EClass getInteractionPointParticipationType();

    /**
     * Returns the meta object for the attribute '{@link structure.type.InteractionPointParticipationType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see structure.type.InteractionPointParticipationType#getName()
     * @see #getInteractionPointParticipationType()
     * @generated
     */
    EAttribute getInteractionPointParticipationType_Name();

    /**
     * Returns the meta object for the reference list '{@link structure.type.InteractionPointParticipationType#getInstantiations <em>Instantiations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Instantiations</em>'.
     * @see structure.type.InteractionPointParticipationType#getInstantiations()
     * @see #getInteractionPointParticipationType()
     * @generated
     */
    EReference getInteractionPointParticipationType_Instantiations();

    /**
     * Returns the meta object for the container reference '{@link structure.type.InteractionPointParticipationType#getPackage <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Package</em>'.
     * @see structure.type.InteractionPointParticipationType#getPackage()
     * @see #getInteractionPointParticipationType()
     * @generated
     */
    EReference getInteractionPointParticipationType_Package();

    /**
     * Returns the meta object for class '{@link structure.type.ActionPointType <em>Action Point Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Action Point Type</em>'.
     * @see structure.type.ActionPointType
     * @generated
     */
    EClass getActionPointType();

    /**
     * Returns the meta object for class '{@link structure.type.InteractionPointType <em>Interaction Point Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interaction Point Type</em>'.
     * @see structure.type.InteractionPointType
     * @generated
     */
    EClass getInteractionPointType();

    /**
     * Returns the meta object for the reference list '{@link structure.type.InteractionPointType#getParticipations <em>Participations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Participations</em>'.
     * @see structure.type.InteractionPointType#getParticipations()
     * @see #getInteractionPointType()
     * @generated
     */
    EReference getInteractionPointType_Participations();

    /**
     * Returns the meta object for the reference '{@link structure.type.InteractionPointType#getParticipationType <em>Participation Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Participation Type</em>'.
     * @see structure.type.InteractionPointType#getParticipationType()
     * @see #getInteractionPointType()
     * @generated
     */
    EReference getInteractionPointType_ParticipationType();

    /**
     * Returns the meta object for class '{@link structure.type.EntityTypePackage <em>Entity Type Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Entity Type Package</em>'.
     * @see structure.type.EntityTypePackage
     * @generated
     */
    EClass getEntityTypePackage();

    /**
     * Returns the meta object for the containment reference list '{@link structure.type.EntityTypePackage#getSubPackages <em>Sub Packages</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sub Packages</em>'.
     * @see structure.type.EntityTypePackage#getSubPackages()
     * @see #getEntityTypePackage()
     * @generated
     */
    EReference getEntityTypePackage_SubPackages();

    /**
     * Returns the meta object for the containment reference list '{@link structure.type.EntityTypePackage#getEntityTypes <em>Entity Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Entity Types</em>'.
     * @see structure.type.EntityTypePackage#getEntityTypes()
     * @see #getEntityTypePackage()
     * @generated
     */
    EReference getEntityTypePackage_EntityTypes();

    /**
     * Returns the meta object for the attribute '{@link structure.type.EntityTypePackage#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see structure.type.EntityTypePackage#getName()
     * @see #getEntityTypePackage()
     * @generated
     */
    EAttribute getEntityTypePackage_Name();

    /**
     * Returns the meta object for the containment reference list '{@link structure.type.EntityTypePackage#getLocationTypes <em>Location Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Location Types</em>'.
     * @see structure.type.EntityTypePackage#getLocationTypes()
     * @see #getEntityTypePackage()
     * @generated
     */
    EReference getEntityTypePackage_LocationTypes();

    /**
     * Returns the meta object for the containment reference list '{@link structure.type.EntityTypePackage#getParticipationTypes <em>Participation Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Participation Types</em>'.
     * @see structure.type.EntityTypePackage#getParticipationTypes()
     * @see #getEntityTypePackage()
     * @generated
     */
    EReference getEntityTypePackage_ParticipationTypes();

    /**
     * Returns the meta object for the containment reference list '{@link structure.type.EntityTypePackage#getActivityPointTypes <em>Activity Point Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Activity Point Types</em>'.
     * @see structure.type.EntityTypePackage#getActivityPointTypes()
     * @see #getEntityTypePackage()
     * @generated
     */
    EReference getEntityTypePackage_ActivityPointTypes();

    /**
     * Returns the meta object for the container reference '{@link structure.type.EntityTypePackage#getSuperPackage <em>Super Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Super Package</em>'.
     * @see structure.type.EntityTypePackage#getSuperPackage()
     * @see #getEntityTypePackage()
     * @generated
     */
    EReference getEntityTypePackage_SuperPackage();

    /**
     * Returns the meta object for the container reference '{@link structure.type.EntityTypePackage#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Model</em>'.
     * @see structure.type.EntityTypePackage#getModel()
     * @see #getEntityTypePackage()
     * @generated
     */
    EReference getEntityTypePackage_Model();

    /**
     * Returns the meta object for class '{@link structure.type.EntityType <em>Entity Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Entity Type</em>'.
     * @see structure.type.EntityType
     * @generated
     */
    EClass getEntityType();

    /**
     * Returns the meta object for the attribute '{@link structure.type.EntityType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see structure.type.EntityType#getName()
     * @see #getEntityType()
     * @generated
     */
    EAttribute getEntityType_Name();

    /**
     * Returns the meta object for the containment reference list '{@link structure.type.EntityType#getInteractionPointParticipations <em>Interaction Point Participations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Interaction Point Participations</em>'.
     * @see structure.type.EntityType#getInteractionPointParticipations()
     * @see #getEntityType()
     * @generated
     */
    EReference getEntityType_InteractionPointParticipations();

    /**
     * Returns the meta object for the reference list '{@link structure.type.EntityType#getInstantiations <em>Instantiations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Instantiations</em>'.
     * @see structure.type.EntityType#getInstantiations()
     * @see #getEntityType()
     * @generated
     */
    EReference getEntityType_Instantiations();

    /**
     * Returns the meta object for the containment reference list '{@link structure.type.EntityType#getContainedInstantiations <em>Contained Instantiations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Contained Instantiations</em>'.
     * @see structure.type.EntityType#getContainedInstantiations()
     * @see #getEntityType()
     * @generated
     */
    EReference getEntityType_ContainedInstantiations();

    /**
     * Returns the meta object for the reference list '{@link structure.type.EntityType#getSuperTypes <em>Super Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Super Types</em>'.
     * @see structure.type.EntityType#getSuperTypes()
     * @see #getEntityType()
     * @generated
     */
    EReference getEntityType_SuperTypes();

    /**
     * Returns the meta object for the reference list '{@link structure.type.EntityType#getSubTypes <em>Sub Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Sub Types</em>'.
     * @see structure.type.EntityType#getSubTypes()
     * @see #getEntityType()
     * @generated
     */
    EReference getEntityType_SubTypes();

    /**
     * Returns the meta object for the container reference '{@link structure.type.EntityType#getPackage <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Package</em>'.
     * @see structure.type.EntityType#getPackage()
     * @see #getEntityType()
     * @generated
     */
    EReference getEntityType_Package();

    /**
     * Returns the meta object for the containment reference list '{@link structure.type.EntityType#getActivityPoints <em>Activity Points</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Activity Points</em>'.
     * @see structure.type.EntityType#getActivityPoints()
     * @see #getEntityType()
     * @generated
     */
    EReference getEntityType_ActivityPoints();

    /**
     * Returns the meta object for class '{@link structure.type.ActivityPointType <em>Activity Point Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Activity Point Type</em>'.
     * @see structure.type.ActivityPointType
     * @generated
     */
    EClass getActivityPointType();

    /**
     * Returns the meta object for the attribute '{@link structure.type.ActivityPointType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see structure.type.ActivityPointType#getName()
     * @see #getActivityPointType()
     * @generated
     */
    EAttribute getActivityPointType_Name();

    /**
     * Returns the meta object for the reference list '{@link structure.type.ActivityPointType#getInstantiations <em>Instantiations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Instantiations</em>'.
     * @see structure.type.ActivityPointType#getInstantiations()
     * @see #getActivityPointType()
     * @generated
     */
    EReference getActivityPointType_Instantiations();

    /**
     * Returns the meta object for the reference list '{@link structure.type.ActivityPointType#getInstances <em>Instances</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Instances</em>'.
     * @see structure.type.ActivityPointType#getInstances()
     * @see #getActivityPointType()
     * @generated
     */
    EReference getActivityPointType_Instances();

    /**
     * Returns the meta object for the container reference '{@link structure.type.ActivityPointType#getPackage <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Package</em>'.
     * @see structure.type.ActivityPointType#getPackage()
     * @see #getActivityPointType()
     * @generated
     */
    EReference getActivityPointType_Package();

    /**
     * Returns the meta object for the reference list '{@link structure.type.ActivityPointType#getSubTypes <em>Sub Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Sub Types</em>'.
     * @see structure.type.ActivityPointType#getSubTypes()
     * @see #getActivityPointType()
     * @generated
     */
    EReference getActivityPointType_SubTypes();

    /**
     * Returns the meta object for the reference '{@link structure.type.ActivityPointType#getSuperType <em>Super Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Super Type</em>'.
     * @see structure.type.ActivityPointType#getSuperType()
     * @see #getActivityPointType()
     * @generated
     */
    EReference getActivityPointType_SuperType();

    /**
     * Returns the meta object for class '{@link structure.type.LocalizableType <em>Localizable Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Localizable Type</em>'.
     * @see structure.type.LocalizableType
     * @generated
     */
    EClass getLocalizableType();

    /**
     * Returns the meta object for the reference '{@link structure.type.LocalizableType#getLocationType <em>Location Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Location Type</em>'.
     * @see structure.type.LocalizableType#getLocationType()
     * @see #getLocalizableType()
     * @generated
     */
    EReference getLocalizableType_LocationType();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    TypeFactory getTypeFactory();

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
         * The meta object literal for the '{@link structure.type.impl.LocationTypeImpl <em>Location Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.type.impl.LocationTypeImpl
         * @see structure.type.impl.TypePackageImpl#getLocationType()
         * @generated
         */
        EClass LOCATION_TYPE = eINSTANCE.getLocationType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LOCATION_TYPE__NAME = eINSTANCE.getLocationType_Name();

        /**
         * The meta object literal for the '<em><b>Instantiations</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LOCATION_TYPE__INSTANTIATIONS = eINSTANCE.getLocationType_Instantiations();

        /**
         * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LOCATION_TYPE__PACKAGE = eINSTANCE.getLocationType_Package();

        /**
         * The meta object literal for the '{@link structure.type.impl.InteractionPointParticipationTypeImpl <em>Interaction Point Participation Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.type.impl.InteractionPointParticipationTypeImpl
         * @see structure.type.impl.TypePackageImpl#getInteractionPointParticipationType()
         * @generated
         */
        EClass INTERACTION_POINT_PARTICIPATION_TYPE = eINSTANCE.getInteractionPointParticipationType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INTERACTION_POINT_PARTICIPATION_TYPE__NAME = eINSTANCE.getInteractionPointParticipationType_Name();

        /**
         * The meta object literal for the '<em><b>Instantiations</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERACTION_POINT_PARTICIPATION_TYPE__INSTANTIATIONS = eINSTANCE.getInteractionPointParticipationType_Instantiations();

        /**
         * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERACTION_POINT_PARTICIPATION_TYPE__PACKAGE = eINSTANCE.getInteractionPointParticipationType_Package();

        /**
         * The meta object literal for the '{@link structure.type.impl.ActionPointTypeImpl <em>Action Point Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.type.impl.ActionPointTypeImpl
         * @see structure.type.impl.TypePackageImpl#getActionPointType()
         * @generated
         */
        EClass ACTION_POINT_TYPE = eINSTANCE.getActionPointType();

        /**
         * The meta object literal for the '{@link structure.type.impl.InteractionPointTypeImpl <em>Interaction Point Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.type.impl.InteractionPointTypeImpl
         * @see structure.type.impl.TypePackageImpl#getInteractionPointType()
         * @generated
         */
        EClass INTERACTION_POINT_TYPE = eINSTANCE.getInteractionPointType();

        /**
         * The meta object literal for the '<em><b>Participations</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERACTION_POINT_TYPE__PARTICIPATIONS = eINSTANCE.getInteractionPointType_Participations();

        /**
         * The meta object literal for the '<em><b>Participation Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERACTION_POINT_TYPE__PARTICIPATION_TYPE = eINSTANCE.getInteractionPointType_ParticipationType();

        /**
         * The meta object literal for the '{@link structure.type.impl.EntityTypePackageImpl <em>Entity Type Package</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.type.impl.EntityTypePackageImpl
         * @see structure.type.impl.TypePackageImpl#getEntityTypePackage()
         * @generated
         */
        EClass ENTITY_TYPE_PACKAGE = eINSTANCE.getEntityTypePackage();

        /**
         * The meta object literal for the '<em><b>Sub Packages</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_TYPE_PACKAGE__SUB_PACKAGES = eINSTANCE.getEntityTypePackage_SubPackages();

        /**
         * The meta object literal for the '<em><b>Entity Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_TYPE_PACKAGE__ENTITY_TYPES = eINSTANCE.getEntityTypePackage_EntityTypes();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ENTITY_TYPE_PACKAGE__NAME = eINSTANCE.getEntityTypePackage_Name();

        /**
         * The meta object literal for the '<em><b>Location Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_TYPE_PACKAGE__LOCATION_TYPES = eINSTANCE.getEntityTypePackage_LocationTypes();

        /**
         * The meta object literal for the '<em><b>Participation Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_TYPE_PACKAGE__PARTICIPATION_TYPES = eINSTANCE.getEntityTypePackage_ParticipationTypes();

        /**
         * The meta object literal for the '<em><b>Activity Point Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_TYPE_PACKAGE__ACTIVITY_POINT_TYPES = eINSTANCE.getEntityTypePackage_ActivityPointTypes();

        /**
         * The meta object literal for the '<em><b>Super Package</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_TYPE_PACKAGE__SUPER_PACKAGE = eINSTANCE.getEntityTypePackage_SuperPackage();

        /**
         * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_TYPE_PACKAGE__MODEL = eINSTANCE.getEntityTypePackage_Model();

        /**
         * The meta object literal for the '{@link structure.type.impl.EntityTypeImpl <em>Entity Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.type.impl.EntityTypeImpl
         * @see structure.type.impl.TypePackageImpl#getEntityType()
         * @generated
         */
        EClass ENTITY_TYPE = eINSTANCE.getEntityType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ENTITY_TYPE__NAME = eINSTANCE.getEntityType_Name();

        /**
         * The meta object literal for the '<em><b>Interaction Point Participations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_TYPE__INTERACTION_POINT_PARTICIPATIONS = eINSTANCE.getEntityType_InteractionPointParticipations();

        /**
         * The meta object literal for the '<em><b>Instantiations</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_TYPE__INSTANTIATIONS = eINSTANCE.getEntityType_Instantiations();

        /**
         * The meta object literal for the '<em><b>Contained Instantiations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_TYPE__CONTAINED_INSTANTIATIONS = eINSTANCE.getEntityType_ContainedInstantiations();

        /**
         * The meta object literal for the '<em><b>Super Types</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_TYPE__SUPER_TYPES = eINSTANCE.getEntityType_SuperTypes();

        /**
         * The meta object literal for the '<em><b>Sub Types</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_TYPE__SUB_TYPES = eINSTANCE.getEntityType_SubTypes();

        /**
         * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_TYPE__PACKAGE = eINSTANCE.getEntityType_Package();

        /**
         * The meta object literal for the '<em><b>Activity Points</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_TYPE__ACTIVITY_POINTS = eINSTANCE.getEntityType_ActivityPoints();

        /**
         * The meta object literal for the '{@link structure.type.impl.ActivityPointTypeImpl <em>Activity Point Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.type.impl.ActivityPointTypeImpl
         * @see structure.type.impl.TypePackageImpl#getActivityPointType()
         * @generated
         */
        EClass ACTIVITY_POINT_TYPE = eINSTANCE.getActivityPointType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ACTIVITY_POINT_TYPE__NAME = eINSTANCE.getActivityPointType_Name();

        /**
         * The meta object literal for the '<em><b>Instantiations</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTIVITY_POINT_TYPE__INSTANTIATIONS = eINSTANCE.getActivityPointType_Instantiations();

        /**
         * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTIVITY_POINT_TYPE__INSTANCES = eINSTANCE.getActivityPointType_Instances();

        /**
         * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTIVITY_POINT_TYPE__PACKAGE = eINSTANCE.getActivityPointType_Package();

        /**
         * The meta object literal for the '<em><b>Sub Types</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTIVITY_POINT_TYPE__SUB_TYPES = eINSTANCE.getActivityPointType_SubTypes();

        /**
         * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTIVITY_POINT_TYPE__SUPER_TYPE = eINSTANCE.getActivityPointType_SuperType();

        /**
         * The meta object literal for the '{@link structure.type.impl.LocalizableTypeImpl <em>Localizable Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.type.impl.LocalizableTypeImpl
         * @see structure.type.impl.TypePackageImpl#getLocalizableType()
         * @generated
         */
        EClass LOCALIZABLE_TYPE = eINSTANCE.getLocalizableType();

        /**
         * The meta object literal for the '<em><b>Location Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LOCALIZABLE_TYPE__LOCATION_TYPE = eINSTANCE.getLocalizableType_LocationType();

    }

} //TypePackage
