/**
 */
package structure.instantiation;

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
 * @see structure.instantiation.InstantiationFactory
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
    String eNS_URI = "http://structure/instantiation/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "structure-instantiation";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    InstantiationPackage eINSTANCE = structure.instantiation.impl.InstantiationPackageImpl.init();

    /**
     * The meta object id for the '{@link structure.instantiation.impl.EntityInstantiationImpl <em>Entity Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.instantiation.impl.EntityInstantiationImpl
     * @see structure.instantiation.impl.InstantiationPackageImpl#getEntityInstantiation()
     * @generated
     */
    int ENTITY_INSTANTIATION = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANTIATION__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANTIATION__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANTIATION__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANTIATION__TYPE = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Interaction Point Participations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANTIATION__INTERACTION_POINT_PARTICIPATIONS = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANTIATION__INSTANCES = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANTIATION__MULTIPLICITY = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Container Type</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANTIATION__CONTAINER_TYPE = ModelsPackage.ELEMENT_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Entity Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANTIATION_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Entity Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANTIATION_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.instantiation.impl.ActivityPointInstantiationImpl <em>Activity Point Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.instantiation.impl.ActivityPointInstantiationImpl
     * @see structure.instantiation.impl.InstantiationPackageImpl#getActivityPointInstantiation()
     * @generated
     */
    int ACTIVITY_POINT_INSTANTIATION = 3;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_POINT_INSTANTIATION__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_POINT_INSTANTIATION__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_POINT_INSTANTIATION__TYPE = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_POINT_INSTANTIATION__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_POINT_INSTANTIATION__INSTANCES = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Entity Type</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_POINT_INSTANTIATION__ENTITY_TYPE = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Activity Point Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_POINT_INSTANTIATION_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Activity Point Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_POINT_INSTANTIATION_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.instantiation.impl.ActionPointInstantiationImpl <em>Action Point Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.instantiation.impl.ActionPointInstantiationImpl
     * @see structure.instantiation.impl.InstantiationPackageImpl#getActionPointInstantiation()
     * @generated
     */
    int ACTION_POINT_INSTANTIATION = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_POINT_INSTANTIATION__VISUAL_ELEMENTS = ACTIVITY_POINT_INSTANTIATION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_POINT_INSTANTIATION__ID = ACTIVITY_POINT_INSTANTIATION__ID;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_POINT_INSTANTIATION__TYPE = ACTIVITY_POINT_INSTANTIATION__TYPE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_POINT_INSTANTIATION__NAME = ACTIVITY_POINT_INSTANTIATION__NAME;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_POINT_INSTANTIATION__INSTANCES = ACTIVITY_POINT_INSTANTIATION__INSTANCES;

    /**
     * The feature id for the '<em><b>Entity Type</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_POINT_INSTANTIATION__ENTITY_TYPE = ACTIVITY_POINT_INSTANTIATION__ENTITY_TYPE;

    /**
     * The feature id for the '<em><b>Location Instantiation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_POINT_INSTANTIATION__LOCATION_INSTANTIATION = ACTIVITY_POINT_INSTANTIATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Action Point Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_POINT_INSTANTIATION_FEATURE_COUNT = ACTIVITY_POINT_INSTANTIATION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Action Point Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_POINT_INSTANTIATION_OPERATION_COUNT = ACTIVITY_POINT_INSTANTIATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.instantiation.impl.InteractionPointInstantiationImpl <em>Interaction Point Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.instantiation.impl.InteractionPointInstantiationImpl
     * @see structure.instantiation.impl.InstantiationPackageImpl#getInteractionPointInstantiation()
     * @generated
     */
    int INTERACTION_POINT_INSTANTIATION = 2;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_INSTANTIATION__VISUAL_ELEMENTS = ACTIVITY_POINT_INSTANTIATION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_INSTANTIATION__ID = ACTIVITY_POINT_INSTANTIATION__ID;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_INSTANTIATION__TYPE = ACTIVITY_POINT_INSTANTIATION__TYPE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_INSTANTIATION__NAME = ACTIVITY_POINT_INSTANTIATION__NAME;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_INSTANTIATION__INSTANCES = ACTIVITY_POINT_INSTANTIATION__INSTANCES;

    /**
     * The feature id for the '<em><b>Entity Type</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_INSTANTIATION__ENTITY_TYPE = ACTIVITY_POINT_INSTANTIATION__ENTITY_TYPE;

    /**
     * The feature id for the '<em><b>Participations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_INSTANTIATION__PARTICIPATIONS = ACTIVITY_POINT_INSTANTIATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Interaction Point Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_INSTANTIATION_FEATURE_COUNT = ACTIVITY_POINT_INSTANTIATION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Interaction Point Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_INSTANTIATION_OPERATION_COUNT = ACTIVITY_POINT_INSTANTIATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.instantiation.impl.InteractionPointParticipationInstantiationImpl <em>Interaction Point Participation Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.instantiation.impl.InteractionPointParticipationInstantiationImpl
     * @see structure.instantiation.impl.InstantiationPackageImpl#getInteractionPointParticipationInstantiation()
     * @generated
     */
    int INTERACTION_POINT_PARTICIPATION_INSTANTIATION = 4;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_INSTANTIATION__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_INSTANTIATION__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_INSTANTIATION__INSTANCES = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_INSTANTIATION__MULTIPLICITY = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Participation Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_INSTANTIATION__PARTICIPATION_TYPE = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Interaction Point Participation Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_INSTANTIATION_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Interaction Point Participation Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_INSTANTIATION_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.instantiation.impl.EntityInstantiationHierarchyImpl <em>Entity Instantiation Hierarchy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.instantiation.impl.EntityInstantiationHierarchyImpl
     * @see structure.instantiation.impl.InstantiationPackageImpl#getEntityInstantiationHierarchy()
     * @generated
     */
    int ENTITY_INSTANTIATION_HIERARCHY = 5;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANTIATION_HIERARCHY__VISUAL_ELEMENTS = ModelsPackage.INSTANTIATION_HIERARCHY__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANTIATION_HIERARCHY__ID = ModelsPackage.INSTANTIATION_HIERARCHY__ID;

    /**
     * The feature id for the '<em><b>Root</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANTIATION_HIERARCHY__ROOT = ModelsPackage.INSTANTIATION_HIERARCHY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Entity Instantiation Hierarchy</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANTIATION_HIERARCHY_FEATURE_COUNT = ModelsPackage.INSTANTIATION_HIERARCHY_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Entity Instantiation Hierarchy</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANTIATION_HIERARCHY_OPERATION_COUNT = ModelsPackage.INSTANTIATION_HIERARCHY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.instantiation.impl.EntityInstantiationReferenceImpl <em>Entity Instantiation Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.instantiation.impl.EntityInstantiationReferenceImpl
     * @see structure.instantiation.impl.InstantiationPackageImpl#getEntityInstantiationReference()
     * @generated
     */
    int ENTITY_INSTANTIATION_REFERENCE = 6;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANTIATION_REFERENCE__VISUAL_ELEMENTS = ModelsPackage.INSTANTIATION_REFERENCE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANTIATION_REFERENCE__ID = ModelsPackage.INSTANTIATION_REFERENCE__ID;

    /**
     * The feature id for the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANTIATION_REFERENCE__INSTANTIATION = ModelsPackage.INSTANTIATION_REFERENCE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Child</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANTIATION_REFERENCE__CHILD = ModelsPackage.INSTANTIATION_REFERENCE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Entity Instantiation Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANTIATION_REFERENCE_FEATURE_COUNT = ModelsPackage.INSTANTIATION_REFERENCE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Entity Instantiation Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANTIATION_REFERENCE_OPERATION_COUNT = ModelsPackage.INSTANTIATION_REFERENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.instantiation.impl.LocationInstantiationImpl <em>Location Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.instantiation.impl.LocationInstantiationImpl
     * @see structure.instantiation.impl.InstantiationPackageImpl#getLocationInstantiation()
     * @generated
     */
    int LOCATION_INSTANTIATION = 7;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCATION_INSTANTIATION__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCATION_INSTANTIATION__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCATION_INSTANTIATION__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCATION_INSTANTIATION__TYPE = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCATION_INSTANTIATION__INSTANCES = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Location Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCATION_INSTANTIATION_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Location Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCATION_INSTANTIATION_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.instantiation.impl.InteractionPointParticipationOfInstantiationImpl <em>Interaction Point Participation Of Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.instantiation.impl.InteractionPointParticipationOfInstantiationImpl
     * @see structure.instantiation.impl.InstantiationPackageImpl#getInteractionPointParticipationOfInstantiation()
     * @generated
     */
    int INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION = 8;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__VISUAL_ELEMENTS = INTERACTION_POINT_PARTICIPATION_INSTANTIATION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__ID = INTERACTION_POINT_PARTICIPATION_INSTANTIATION__ID;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__INSTANCES = INTERACTION_POINT_PARTICIPATION_INSTANTIATION__INSTANCES;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__MULTIPLICITY = INTERACTION_POINT_PARTICIPATION_INSTANTIATION__MULTIPLICITY;

    /**
     * The feature id for the '<em><b>Participation Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__PARTICIPATION_TYPE = INTERACTION_POINT_PARTICIPATION_INSTANTIATION__PARTICIPATION_TYPE;

    /**
     * The feature id for the '<em><b>Location Instantiation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__LOCATION_INSTANTIATION = INTERACTION_POINT_PARTICIPATION_INSTANTIATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Interaction Point Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__INTERACTION_POINT_TYPE = INTERACTION_POINT_PARTICIPATION_INSTANTIATION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Participation Of Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__PARTICIPATION_OF_TYPE = INTERACTION_POINT_PARTICIPATION_INSTANTIATION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Delegated From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__DELEGATED_FROM = INTERACTION_POINT_PARTICIPATION_INSTANTIATION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Entity Instantiation</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__ENTITY_INSTANTIATION = INTERACTION_POINT_PARTICIPATION_INSTANTIATION_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Interaction Point</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__INTERACTION_POINT = INTERACTION_POINT_PARTICIPATION_INSTANTIATION_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Interaction Point Participation Of Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION_FEATURE_COUNT = INTERACTION_POINT_PARTICIPATION_INSTANTIATION_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Interaction Point Participation Of Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION_OPERATION_COUNT = INTERACTION_POINT_PARTICIPATION_INSTANTIATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.instantiation.impl.AbstractInteractionPointParticipationOfTypeImpl <em>Abstract Interaction Point Participation Of Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.instantiation.impl.AbstractInteractionPointParticipationOfTypeImpl
     * @see structure.instantiation.impl.InstantiationPackageImpl#getAbstractInteractionPointParticipationOfType()
     * @generated
     */
    int ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE = 11;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__VISUAL_ELEMENTS = INTERACTION_POINT_PARTICIPATION_INSTANTIATION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__ID = INTERACTION_POINT_PARTICIPATION_INSTANTIATION__ID;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__INSTANCES = INTERACTION_POINT_PARTICIPATION_INSTANTIATION__INSTANCES;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__MULTIPLICITY = INTERACTION_POINT_PARTICIPATION_INSTANTIATION__MULTIPLICITY;

    /**
     * The feature id for the '<em><b>Participation Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__PARTICIPATION_TYPE = INTERACTION_POINT_PARTICIPATION_INSTANTIATION__PARTICIPATION_TYPE;

    /**
     * The feature id for the '<em><b>Participation Of Instantiation</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__PARTICIPATION_OF_INSTANTIATION = INTERACTION_POINT_PARTICIPATION_INSTANTIATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Entity Type</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__ENTITY_TYPE = INTERACTION_POINT_PARTICIPATION_INSTANTIATION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__NAME = INTERACTION_POINT_PARTICIPATION_INSTANTIATION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Abstract Interaction Point Participation Of Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE_FEATURE_COUNT = INTERACTION_POINT_PARTICIPATION_INSTANTIATION_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Abstract Interaction Point Participation Of Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE_OPERATION_COUNT = INTERACTION_POINT_PARTICIPATION_INSTANTIATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.instantiation.impl.InteractionPointParticipationOfTypeImpl <em>Interaction Point Participation Of Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.instantiation.impl.InteractionPointParticipationOfTypeImpl
     * @see structure.instantiation.impl.InstantiationPackageImpl#getInteractionPointParticipationOfType()
     * @generated
     */
    int INTERACTION_POINT_PARTICIPATION_OF_TYPE = 9;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_OF_TYPE__VISUAL_ELEMENTS = ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_OF_TYPE__ID = ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__ID;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_OF_TYPE__INSTANCES = ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__INSTANCES;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_OF_TYPE__MULTIPLICITY = ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__MULTIPLICITY;

    /**
     * The feature id for the '<em><b>Participation Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_OF_TYPE__PARTICIPATION_TYPE = ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__PARTICIPATION_TYPE;

    /**
     * The feature id for the '<em><b>Participation Of Instantiation</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_OF_TYPE__PARTICIPATION_OF_INSTANTIATION = ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__PARTICIPATION_OF_INSTANTIATION;

    /**
     * The feature id for the '<em><b>Entity Type</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_OF_TYPE__ENTITY_TYPE = ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__ENTITY_TYPE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_OF_TYPE__NAME = ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__NAME;

    /**
     * The number of structural features of the '<em>Interaction Point Participation Of Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_OF_TYPE_FEATURE_COUNT = ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Interaction Point Participation Of Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_OF_TYPE_OPERATION_COUNT = ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.instantiation.impl.DelegatedInteractionPointParticipationImpl <em>Delegated Interaction Point Participation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.instantiation.impl.DelegatedInteractionPointParticipationImpl
     * @see structure.instantiation.impl.InstantiationPackageImpl#getDelegatedInteractionPointParticipation()
     * @generated
     */
    int DELEGATED_INTERACTION_POINT_PARTICIPATION = 10;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELEGATED_INTERACTION_POINT_PARTICIPATION__VISUAL_ELEMENTS = ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELEGATED_INTERACTION_POINT_PARTICIPATION__ID = ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__ID;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELEGATED_INTERACTION_POINT_PARTICIPATION__INSTANCES = ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__INSTANCES;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELEGATED_INTERACTION_POINT_PARTICIPATION__MULTIPLICITY = ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__MULTIPLICITY;

    /**
     * The feature id for the '<em><b>Participation Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELEGATED_INTERACTION_POINT_PARTICIPATION__PARTICIPATION_TYPE = ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__PARTICIPATION_TYPE;

    /**
     * The feature id for the '<em><b>Participation Of Instantiation</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELEGATED_INTERACTION_POINT_PARTICIPATION__PARTICIPATION_OF_INSTANTIATION = ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__PARTICIPATION_OF_INSTANTIATION;

    /**
     * The feature id for the '<em><b>Entity Type</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELEGATED_INTERACTION_POINT_PARTICIPATION__ENTITY_TYPE = ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__ENTITY_TYPE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELEGATED_INTERACTION_POINT_PARTICIPATION__NAME = ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Delegated To</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELEGATED_INTERACTION_POINT_PARTICIPATION__DELEGATED_TO = ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Delegated Interaction Point Participation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELEGATED_INTERACTION_POINT_PARTICIPATION_FEATURE_COUNT = ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Delegated Interaction Point Participation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELEGATED_INTERACTION_POINT_PARTICIPATION_OPERATION_COUNT = ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.instantiation.impl.LocalizableInstantiationImpl <em>Localizable Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.instantiation.impl.LocalizableInstantiationImpl
     * @see structure.instantiation.impl.InstantiationPackageImpl#getLocalizableInstantiation()
     * @generated
     */
    int LOCALIZABLE_INSTANTIATION = 12;

    /**
     * The feature id for the '<em><b>Location Instantiation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCALIZABLE_INSTANTIATION__LOCATION_INSTANTIATION = 0;

    /**
     * The number of structural features of the '<em>Localizable Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCALIZABLE_INSTANTIATION_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Localizable Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCALIZABLE_INSTANTIATION_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link structure.instantiation.EntityInstantiation <em>Entity Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Entity Instantiation</em>'.
     * @see structure.instantiation.EntityInstantiation
     * @generated
     */
    EClass getEntityInstantiation();

    /**
     * Returns the meta object for the attribute '{@link structure.instantiation.EntityInstantiation#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see structure.instantiation.EntityInstantiation#getName()
     * @see #getEntityInstantiation()
     * @generated
     */
    EAttribute getEntityInstantiation_Name();

    /**
     * Returns the meta object for the reference '{@link structure.instantiation.EntityInstantiation#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see structure.instantiation.EntityInstantiation#getType()
     * @see #getEntityInstantiation()
     * @generated
     */
    EReference getEntityInstantiation_Type();

    /**
     * Returns the meta object for the containment reference list '{@link structure.instantiation.EntityInstantiation#getInteractionPointParticipations <em>Interaction Point Participations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Interaction Point Participations</em>'.
     * @see structure.instantiation.EntityInstantiation#getInteractionPointParticipations()
     * @see #getEntityInstantiation()
     * @generated
     */
    EReference getEntityInstantiation_InteractionPointParticipations();

    /**
     * Returns the meta object for the reference list '{@link structure.instantiation.EntityInstantiation#getInstances <em>Instances</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Instances</em>'.
     * @see structure.instantiation.EntityInstantiation#getInstances()
     * @see #getEntityInstantiation()
     * @generated
     */
    EReference getEntityInstantiation_Instances();

    /**
     * Returns the meta object for the containment reference '{@link structure.instantiation.EntityInstantiation#getMultiplicity <em>Multiplicity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Multiplicity</em>'.
     * @see structure.instantiation.EntityInstantiation#getMultiplicity()
     * @see #getEntityInstantiation()
     * @generated
     */
    EReference getEntityInstantiation_Multiplicity();

    /**
     * Returns the meta object for the container reference '{@link structure.instantiation.EntityInstantiation#getContainerType <em>Container Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Container Type</em>'.
     * @see structure.instantiation.EntityInstantiation#getContainerType()
     * @see #getEntityInstantiation()
     * @generated
     */
    EReference getEntityInstantiation_ContainerType();

    /**
     * Returns the meta object for class '{@link structure.instantiation.ActionPointInstantiation <em>Action Point Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Action Point Instantiation</em>'.
     * @see structure.instantiation.ActionPointInstantiation
     * @generated
     */
    EClass getActionPointInstantiation();

    /**
     * Returns the meta object for class '{@link structure.instantiation.InteractionPointInstantiation <em>Interaction Point Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interaction Point Instantiation</em>'.
     * @see structure.instantiation.InteractionPointInstantiation
     * @generated
     */
    EClass getInteractionPointInstantiation();

    /**
     * Returns the meta object for the reference list '{@link structure.instantiation.InteractionPointInstantiation#getParticipations <em>Participations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Participations</em>'.
     * @see structure.instantiation.InteractionPointInstantiation#getParticipations()
     * @see #getInteractionPointInstantiation()
     * @generated
     */
    EReference getInteractionPointInstantiation_Participations();

    /**
     * Returns the meta object for class '{@link structure.instantiation.ActivityPointInstantiation <em>Activity Point Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Activity Point Instantiation</em>'.
     * @see structure.instantiation.ActivityPointInstantiation
     * @generated
     */
    EClass getActivityPointInstantiation();

    /**
     * Returns the meta object for the reference '{@link structure.instantiation.ActivityPointInstantiation#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see structure.instantiation.ActivityPointInstantiation#getType()
     * @see #getActivityPointInstantiation()
     * @generated
     */
    EReference getActivityPointInstantiation_Type();

    /**
     * Returns the meta object for the attribute '{@link structure.instantiation.ActivityPointInstantiation#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see structure.instantiation.ActivityPointInstantiation#getName()
     * @see #getActivityPointInstantiation()
     * @generated
     */
    EAttribute getActivityPointInstantiation_Name();

    /**
     * Returns the meta object for the reference list '{@link structure.instantiation.ActivityPointInstantiation#getInstances <em>Instances</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Instances</em>'.
     * @see structure.instantiation.ActivityPointInstantiation#getInstances()
     * @see #getActivityPointInstantiation()
     * @generated
     */
    EReference getActivityPointInstantiation_Instances();

    /**
     * Returns the meta object for the container reference '{@link structure.instantiation.ActivityPointInstantiation#getEntityType <em>Entity Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Entity Type</em>'.
     * @see structure.instantiation.ActivityPointInstantiation#getEntityType()
     * @see #getActivityPointInstantiation()
     * @generated
     */
    EReference getActivityPointInstantiation_EntityType();

    /**
     * Returns the meta object for class '{@link structure.instantiation.InteractionPointParticipationInstantiation <em>Interaction Point Participation Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interaction Point Participation Instantiation</em>'.
     * @see structure.instantiation.InteractionPointParticipationInstantiation
     * @generated
     */
    EClass getInteractionPointParticipationInstantiation();

    /**
     * Returns the meta object for the reference list '{@link structure.instantiation.InteractionPointParticipationInstantiation#getInstances <em>Instances</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Instances</em>'.
     * @see structure.instantiation.InteractionPointParticipationInstantiation#getInstances()
     * @see #getInteractionPointParticipationInstantiation()
     * @generated
     */
    EReference getInteractionPointParticipationInstantiation_Instances();

    /**
     * Returns the meta object for the containment reference '{@link structure.instantiation.InteractionPointParticipationInstantiation#getMultiplicity <em>Multiplicity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Multiplicity</em>'.
     * @see structure.instantiation.InteractionPointParticipationInstantiation#getMultiplicity()
     * @see #getInteractionPointParticipationInstantiation()
     * @generated
     */
    EReference getInteractionPointParticipationInstantiation_Multiplicity();

    /**
     * Returns the meta object for the reference '{@link structure.instantiation.InteractionPointParticipationInstantiation#getParticipationType <em>Participation Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Participation Type</em>'.
     * @see structure.instantiation.InteractionPointParticipationInstantiation#getParticipationType()
     * @see #getInteractionPointParticipationInstantiation()
     * @generated
     */
    EReference getInteractionPointParticipationInstantiation_ParticipationType();

    /**
     * Returns the meta object for class '{@link structure.instantiation.EntityInstantiationHierarchy <em>Entity Instantiation Hierarchy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Entity Instantiation Hierarchy</em>'.
     * @see structure.instantiation.EntityInstantiationHierarchy
     * @generated
     */
    EClass getEntityInstantiationHierarchy();

    /**
     * Returns the meta object for the containment reference '{@link structure.instantiation.EntityInstantiationHierarchy#getRoot <em>Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Root</em>'.
     * @see structure.instantiation.EntityInstantiationHierarchy#getRoot()
     * @see #getEntityInstantiationHierarchy()
     * @generated
     */
    EReference getEntityInstantiationHierarchy_Root();

    /**
     * Returns the meta object for class '{@link structure.instantiation.EntityInstantiationReference <em>Entity Instantiation Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Entity Instantiation Reference</em>'.
     * @see structure.instantiation.EntityInstantiationReference
     * @generated
     */
    EClass getEntityInstantiationReference();

    /**
     * Returns the meta object for the reference '{@link structure.instantiation.EntityInstantiationReference#getInstantiation <em>Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Instantiation</em>'.
     * @see structure.instantiation.EntityInstantiationReference#getInstantiation()
     * @see #getEntityInstantiationReference()
     * @generated
     */
    EReference getEntityInstantiationReference_Instantiation();

    /**
     * Returns the meta object for the containment reference '{@link structure.instantiation.EntityInstantiationReference#getChild <em>Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Child</em>'.
     * @see structure.instantiation.EntityInstantiationReference#getChild()
     * @see #getEntityInstantiationReference()
     * @generated
     */
    EReference getEntityInstantiationReference_Child();

    /**
     * Returns the meta object for class '{@link structure.instantiation.LocationInstantiation <em>Location Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Location Instantiation</em>'.
     * @see structure.instantiation.LocationInstantiation
     * @generated
     */
    EClass getLocationInstantiation();

    /**
     * Returns the meta object for the attribute '{@link structure.instantiation.LocationInstantiation#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see structure.instantiation.LocationInstantiation#getName()
     * @see #getLocationInstantiation()
     * @generated
     */
    EAttribute getLocationInstantiation_Name();

    /**
     * Returns the meta object for the reference '{@link structure.instantiation.LocationInstantiation#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see structure.instantiation.LocationInstantiation#getType()
     * @see #getLocationInstantiation()
     * @generated
     */
    EReference getLocationInstantiation_Type();

    /**
     * Returns the meta object for the reference list '{@link structure.instantiation.LocationInstantiation#getInstances <em>Instances</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Instances</em>'.
     * @see structure.instantiation.LocationInstantiation#getInstances()
     * @see #getLocationInstantiation()
     * @generated
     */
    EReference getLocationInstantiation_Instances();

    /**
     * Returns the meta object for class '{@link structure.instantiation.InteractionPointParticipationOfInstantiation <em>Interaction Point Participation Of Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interaction Point Participation Of Instantiation</em>'.
     * @see structure.instantiation.InteractionPointParticipationOfInstantiation
     * @generated
     */
    EClass getInteractionPointParticipationOfInstantiation();

    /**
     * Returns the meta object for the reference '{@link structure.instantiation.InteractionPointParticipationOfInstantiation#getInteractionPointType <em>Interaction Point Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Interaction Point Type</em>'.
     * @see structure.instantiation.InteractionPointParticipationOfInstantiation#getInteractionPointType()
     * @see #getInteractionPointParticipationOfInstantiation()
     * @generated
     */
    EReference getInteractionPointParticipationOfInstantiation_InteractionPointType();

    /**
     * Returns the meta object for the reference '{@link structure.instantiation.InteractionPointParticipationOfInstantiation#getParticipationOfType <em>Participation Of Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Participation Of Type</em>'.
     * @see structure.instantiation.InteractionPointParticipationOfInstantiation#getParticipationOfType()
     * @see #getInteractionPointParticipationOfInstantiation()
     * @generated
     */
    EReference getInteractionPointParticipationOfInstantiation_ParticipationOfType();

    /**
     * Returns the meta object for the reference '{@link structure.instantiation.InteractionPointParticipationOfInstantiation#getDelegatedFrom <em>Delegated From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Delegated From</em>'.
     * @see structure.instantiation.InteractionPointParticipationOfInstantiation#getDelegatedFrom()
     * @see #getInteractionPointParticipationOfInstantiation()
     * @generated
     */
    EReference getInteractionPointParticipationOfInstantiation_DelegatedFrom();

    /**
     * Returns the meta object for the container reference '{@link structure.instantiation.InteractionPointParticipationOfInstantiation#getEntityInstantiation <em>Entity Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Entity Instantiation</em>'.
     * @see structure.instantiation.InteractionPointParticipationOfInstantiation#getEntityInstantiation()
     * @see #getInteractionPointParticipationOfInstantiation()
     * @generated
     */
    EReference getInteractionPointParticipationOfInstantiation_EntityInstantiation();

    /**
     * Returns the meta object for the reference '{@link structure.instantiation.InteractionPointParticipationOfInstantiation#getInteractionPoint <em>Interaction Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Interaction Point</em>'.
     * @see structure.instantiation.InteractionPointParticipationOfInstantiation#getInteractionPoint()
     * @see #getInteractionPointParticipationOfInstantiation()
     * @generated
     */
    EReference getInteractionPointParticipationOfInstantiation_InteractionPoint();

    /**
     * Returns the meta object for class '{@link structure.instantiation.InteractionPointParticipationOfType <em>Interaction Point Participation Of Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interaction Point Participation Of Type</em>'.
     * @see structure.instantiation.InteractionPointParticipationOfType
     * @generated
     */
    EClass getInteractionPointParticipationOfType();

    /**
     * Returns the meta object for class '{@link structure.instantiation.DelegatedInteractionPointParticipation <em>Delegated Interaction Point Participation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Delegated Interaction Point Participation</em>'.
     * @see structure.instantiation.DelegatedInteractionPointParticipation
     * @generated
     */
    EClass getDelegatedInteractionPointParticipation();

    /**
     * Returns the meta object for the reference list '{@link structure.instantiation.DelegatedInteractionPointParticipation#getDelegatedTo <em>Delegated To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Delegated To</em>'.
     * @see structure.instantiation.DelegatedInteractionPointParticipation#getDelegatedTo()
     * @see #getDelegatedInteractionPointParticipation()
     * @generated
     */
    EReference getDelegatedInteractionPointParticipation_DelegatedTo();

    /**
     * Returns the meta object for class '{@link structure.instantiation.AbstractInteractionPointParticipationOfType <em>Abstract Interaction Point Participation Of Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Interaction Point Participation Of Type</em>'.
     * @see structure.instantiation.AbstractInteractionPointParticipationOfType
     * @generated
     */
    EClass getAbstractInteractionPointParticipationOfType();

    /**
     * Returns the meta object for the reference list '{@link structure.instantiation.AbstractInteractionPointParticipationOfType#getParticipationOfInstantiation <em>Participation Of Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Participation Of Instantiation</em>'.
     * @see structure.instantiation.AbstractInteractionPointParticipationOfType#getParticipationOfInstantiation()
     * @see #getAbstractInteractionPointParticipationOfType()
     * @generated
     */
    EReference getAbstractInteractionPointParticipationOfType_ParticipationOfInstantiation();

    /**
     * Returns the meta object for the container reference '{@link structure.instantiation.AbstractInteractionPointParticipationOfType#getEntityType <em>Entity Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Entity Type</em>'.
     * @see structure.instantiation.AbstractInteractionPointParticipationOfType#getEntityType()
     * @see #getAbstractInteractionPointParticipationOfType()
     * @generated
     */
    EReference getAbstractInteractionPointParticipationOfType_EntityType();

    /**
     * Returns the meta object for the attribute '{@link structure.instantiation.AbstractInteractionPointParticipationOfType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see structure.instantiation.AbstractInteractionPointParticipationOfType#getName()
     * @see #getAbstractInteractionPointParticipationOfType()
     * @generated
     */
    EAttribute getAbstractInteractionPointParticipationOfType_Name();

    /**
     * Returns the meta object for class '{@link structure.instantiation.LocalizableInstantiation <em>Localizable Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Localizable Instantiation</em>'.
     * @see structure.instantiation.LocalizableInstantiation
     * @generated
     */
    EClass getLocalizableInstantiation();

    /**
     * Returns the meta object for the containment reference '{@link structure.instantiation.LocalizableInstantiation#getLocationInstantiation <em>Location Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Location Instantiation</em>'.
     * @see structure.instantiation.LocalizableInstantiation#getLocationInstantiation()
     * @see #getLocalizableInstantiation()
     * @generated
     */
    EReference getLocalizableInstantiation_LocationInstantiation();

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
         * The meta object literal for the '{@link structure.instantiation.impl.EntityInstantiationImpl <em>Entity Instantiation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.instantiation.impl.EntityInstantiationImpl
         * @see structure.instantiation.impl.InstantiationPackageImpl#getEntityInstantiation()
         * @generated
         */
        EClass ENTITY_INSTANTIATION = eINSTANCE.getEntityInstantiation();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ENTITY_INSTANTIATION__NAME = eINSTANCE.getEntityInstantiation_Name();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_INSTANTIATION__TYPE = eINSTANCE.getEntityInstantiation_Type();

        /**
         * The meta object literal for the '<em><b>Interaction Point Participations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_INSTANTIATION__INTERACTION_POINT_PARTICIPATIONS = eINSTANCE.getEntityInstantiation_InteractionPointParticipations();

        /**
         * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_INSTANTIATION__INSTANCES = eINSTANCE.getEntityInstantiation_Instances();

        /**
         * The meta object literal for the '<em><b>Multiplicity</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_INSTANTIATION__MULTIPLICITY = eINSTANCE.getEntityInstantiation_Multiplicity();

        /**
         * The meta object literal for the '<em><b>Container Type</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_INSTANTIATION__CONTAINER_TYPE = eINSTANCE.getEntityInstantiation_ContainerType();

        /**
         * The meta object literal for the '{@link structure.instantiation.impl.ActionPointInstantiationImpl <em>Action Point Instantiation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.instantiation.impl.ActionPointInstantiationImpl
         * @see structure.instantiation.impl.InstantiationPackageImpl#getActionPointInstantiation()
         * @generated
         */
        EClass ACTION_POINT_INSTANTIATION = eINSTANCE.getActionPointInstantiation();

        /**
         * The meta object literal for the '{@link structure.instantiation.impl.InteractionPointInstantiationImpl <em>Interaction Point Instantiation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.instantiation.impl.InteractionPointInstantiationImpl
         * @see structure.instantiation.impl.InstantiationPackageImpl#getInteractionPointInstantiation()
         * @generated
         */
        EClass INTERACTION_POINT_INSTANTIATION = eINSTANCE.getInteractionPointInstantiation();

        /**
         * The meta object literal for the '<em><b>Participations</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERACTION_POINT_INSTANTIATION__PARTICIPATIONS = eINSTANCE.getInteractionPointInstantiation_Participations();

        /**
         * The meta object literal for the '{@link structure.instantiation.impl.ActivityPointInstantiationImpl <em>Activity Point Instantiation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.instantiation.impl.ActivityPointInstantiationImpl
         * @see structure.instantiation.impl.InstantiationPackageImpl#getActivityPointInstantiation()
         * @generated
         */
        EClass ACTIVITY_POINT_INSTANTIATION = eINSTANCE.getActivityPointInstantiation();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTIVITY_POINT_INSTANTIATION__TYPE = eINSTANCE.getActivityPointInstantiation_Type();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ACTIVITY_POINT_INSTANTIATION__NAME = eINSTANCE.getActivityPointInstantiation_Name();

        /**
         * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTIVITY_POINT_INSTANTIATION__INSTANCES = eINSTANCE.getActivityPointInstantiation_Instances();

        /**
         * The meta object literal for the '<em><b>Entity Type</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTIVITY_POINT_INSTANTIATION__ENTITY_TYPE = eINSTANCE.getActivityPointInstantiation_EntityType();

        /**
         * The meta object literal for the '{@link structure.instantiation.impl.InteractionPointParticipationInstantiationImpl <em>Interaction Point Participation Instantiation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.instantiation.impl.InteractionPointParticipationInstantiationImpl
         * @see structure.instantiation.impl.InstantiationPackageImpl#getInteractionPointParticipationInstantiation()
         * @generated
         */
        EClass INTERACTION_POINT_PARTICIPATION_INSTANTIATION = eINSTANCE.getInteractionPointParticipationInstantiation();

        /**
         * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERACTION_POINT_PARTICIPATION_INSTANTIATION__INSTANCES = eINSTANCE.getInteractionPointParticipationInstantiation_Instances();

        /**
         * The meta object literal for the '<em><b>Multiplicity</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERACTION_POINT_PARTICIPATION_INSTANTIATION__MULTIPLICITY = eINSTANCE.getInteractionPointParticipationInstantiation_Multiplicity();

        /**
         * The meta object literal for the '<em><b>Participation Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERACTION_POINT_PARTICIPATION_INSTANTIATION__PARTICIPATION_TYPE = eINSTANCE.getInteractionPointParticipationInstantiation_ParticipationType();

        /**
         * The meta object literal for the '{@link structure.instantiation.impl.EntityInstantiationHierarchyImpl <em>Entity Instantiation Hierarchy</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.instantiation.impl.EntityInstantiationHierarchyImpl
         * @see structure.instantiation.impl.InstantiationPackageImpl#getEntityInstantiationHierarchy()
         * @generated
         */
        EClass ENTITY_INSTANTIATION_HIERARCHY = eINSTANCE.getEntityInstantiationHierarchy();

        /**
         * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_INSTANTIATION_HIERARCHY__ROOT = eINSTANCE.getEntityInstantiationHierarchy_Root();

        /**
         * The meta object literal for the '{@link structure.instantiation.impl.EntityInstantiationReferenceImpl <em>Entity Instantiation Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.instantiation.impl.EntityInstantiationReferenceImpl
         * @see structure.instantiation.impl.InstantiationPackageImpl#getEntityInstantiationReference()
         * @generated
         */
        EClass ENTITY_INSTANTIATION_REFERENCE = eINSTANCE.getEntityInstantiationReference();

        /**
         * The meta object literal for the '<em><b>Instantiation</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_INSTANTIATION_REFERENCE__INSTANTIATION = eINSTANCE.getEntityInstantiationReference_Instantiation();

        /**
         * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_INSTANTIATION_REFERENCE__CHILD = eINSTANCE.getEntityInstantiationReference_Child();

        /**
         * The meta object literal for the '{@link structure.instantiation.impl.LocationInstantiationImpl <em>Location Instantiation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.instantiation.impl.LocationInstantiationImpl
         * @see structure.instantiation.impl.InstantiationPackageImpl#getLocationInstantiation()
         * @generated
         */
        EClass LOCATION_INSTANTIATION = eINSTANCE.getLocationInstantiation();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LOCATION_INSTANTIATION__NAME = eINSTANCE.getLocationInstantiation_Name();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LOCATION_INSTANTIATION__TYPE = eINSTANCE.getLocationInstantiation_Type();

        /**
         * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LOCATION_INSTANTIATION__INSTANCES = eINSTANCE.getLocationInstantiation_Instances();

        /**
         * The meta object literal for the '{@link structure.instantiation.impl.InteractionPointParticipationOfInstantiationImpl <em>Interaction Point Participation Of Instantiation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.instantiation.impl.InteractionPointParticipationOfInstantiationImpl
         * @see structure.instantiation.impl.InstantiationPackageImpl#getInteractionPointParticipationOfInstantiation()
         * @generated
         */
        EClass INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION = eINSTANCE.getInteractionPointParticipationOfInstantiation();

        /**
         * The meta object literal for the '<em><b>Interaction Point Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__INTERACTION_POINT_TYPE = eINSTANCE.getInteractionPointParticipationOfInstantiation_InteractionPointType();

        /**
         * The meta object literal for the '<em><b>Participation Of Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__PARTICIPATION_OF_TYPE = eINSTANCE.getInteractionPointParticipationOfInstantiation_ParticipationOfType();

        /**
         * The meta object literal for the '<em><b>Delegated From</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__DELEGATED_FROM = eINSTANCE.getInteractionPointParticipationOfInstantiation_DelegatedFrom();

        /**
         * The meta object literal for the '<em><b>Entity Instantiation</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__ENTITY_INSTANTIATION = eINSTANCE.getInteractionPointParticipationOfInstantiation_EntityInstantiation();

        /**
         * The meta object literal for the '<em><b>Interaction Point</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__INTERACTION_POINT = eINSTANCE.getInteractionPointParticipationOfInstantiation_InteractionPoint();

        /**
         * The meta object literal for the '{@link structure.instantiation.impl.InteractionPointParticipationOfTypeImpl <em>Interaction Point Participation Of Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.instantiation.impl.InteractionPointParticipationOfTypeImpl
         * @see structure.instantiation.impl.InstantiationPackageImpl#getInteractionPointParticipationOfType()
         * @generated
         */
        EClass INTERACTION_POINT_PARTICIPATION_OF_TYPE = eINSTANCE.getInteractionPointParticipationOfType();

        /**
         * The meta object literal for the '{@link structure.instantiation.impl.DelegatedInteractionPointParticipationImpl <em>Delegated Interaction Point Participation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.instantiation.impl.DelegatedInteractionPointParticipationImpl
         * @see structure.instantiation.impl.InstantiationPackageImpl#getDelegatedInteractionPointParticipation()
         * @generated
         */
        EClass DELEGATED_INTERACTION_POINT_PARTICIPATION = eINSTANCE.getDelegatedInteractionPointParticipation();

        /**
         * The meta object literal for the '<em><b>Delegated To</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DELEGATED_INTERACTION_POINT_PARTICIPATION__DELEGATED_TO = eINSTANCE.getDelegatedInteractionPointParticipation_DelegatedTo();

        /**
         * The meta object literal for the '{@link structure.instantiation.impl.AbstractInteractionPointParticipationOfTypeImpl <em>Abstract Interaction Point Participation Of Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.instantiation.impl.AbstractInteractionPointParticipationOfTypeImpl
         * @see structure.instantiation.impl.InstantiationPackageImpl#getAbstractInteractionPointParticipationOfType()
         * @generated
         */
        EClass ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE = eINSTANCE.getAbstractInteractionPointParticipationOfType();

        /**
         * The meta object literal for the '<em><b>Participation Of Instantiation</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__PARTICIPATION_OF_INSTANTIATION = eINSTANCE.getAbstractInteractionPointParticipationOfType_ParticipationOfInstantiation();

        /**
         * The meta object literal for the '<em><b>Entity Type</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__ENTITY_TYPE = eINSTANCE.getAbstractInteractionPointParticipationOfType_EntityType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__NAME = eINSTANCE.getAbstractInteractionPointParticipationOfType_Name();

        /**
         * The meta object literal for the '{@link structure.instantiation.impl.LocalizableInstantiationImpl <em>Localizable Instantiation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.instantiation.impl.LocalizableInstantiationImpl
         * @see structure.instantiation.impl.InstantiationPackageImpl#getLocalizableInstantiation()
         * @generated
         */
        EClass LOCALIZABLE_INSTANTIATION = eINSTANCE.getLocalizableInstantiation();

        /**
         * The meta object literal for the '<em><b>Location Instantiation</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LOCALIZABLE_INSTANTIATION__LOCATION_INSTANTIATION = eINSTANCE.getLocalizableInstantiation_LocationInstantiation();

    }

} //InstantiationPackage
