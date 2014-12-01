/**
 */
package structure.instance;

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
 * @see structure.instance.InstanceFactory
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
    String eNS_URI = "http://structure/instance/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "structure-instance";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    InstancePackage eINSTANCE = structure.instance.impl.InstancePackageImpl.init();

    /**
     * The meta object id for the '{@link structure.instance.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.instance.impl.EntityImpl
     * @see structure.instance.impl.InstancePackageImpl#getEntity()
     * @generated
     */
    int ENTITY = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Identities</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__IDENTITIES = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Container Entity</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__CONTAINER_ENTITY = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Contained Entities</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__CONTAINED_ENTITIES = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__INSTANTIATION = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Activity Points</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__ACTIVITY_POINTS = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Interaction Point Participations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__INTERACTION_POINT_PARTICIPATIONS = ModelsPackage.ELEMENT_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Entity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Entity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.instance.impl.LocationImpl <em>Location</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.instance.impl.LocationImpl
     * @see structure.instance.impl.InstancePackageImpl#getLocation()
     * @generated
     */
    int LOCATION = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCATION__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCATION__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCATION__INSTANTIATION = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCATION__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Location</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCATION_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Location</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCATION_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.instance.impl.InteractionPointParticipationImpl <em>Interaction Point Participation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.instance.impl.InteractionPointParticipationImpl
     * @see structure.instance.impl.InstancePackageImpl#getInteractionPointParticipation()
     * @generated
     */
    int INTERACTION_POINT_PARTICIPATION = 2;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Location Instance</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION__LOCATION_INSTANCE = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION__INSTANTIATION = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Interaction Point Participation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Interaction Point Participation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_PARTICIPATION_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.instance.impl.ActivityPointImpl <em>Activity Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.instance.impl.ActivityPointImpl
     * @see structure.instance.impl.InstancePackageImpl#getActivityPoint()
     * @generated
     */
    int ACTIVITY_POINT = 3;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_POINT__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_POINT__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_POINT__INSTANTIATION = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_POINT__TYPE = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_POINT__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Activity Point</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_POINT_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Activity Point</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_POINT_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.instance.impl.ActionPointImpl <em>Action Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.instance.impl.ActionPointImpl
     * @see structure.instance.impl.InstancePackageImpl#getActionPoint()
     * @generated
     */
    int ACTION_POINT = 4;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_POINT__VISUAL_ELEMENTS = ACTIVITY_POINT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_POINT__ID = ACTIVITY_POINT__ID;

    /**
     * The feature id for the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_POINT__INSTANTIATION = ACTIVITY_POINT__INSTANTIATION;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_POINT__TYPE = ACTIVITY_POINT__TYPE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_POINT__NAME = ACTIVITY_POINT__NAME;

    /**
     * The feature id for the '<em><b>Location Instance</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_POINT__LOCATION_INSTANCE = ACTIVITY_POINT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Action Point</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_POINT_FEATURE_COUNT = ACTIVITY_POINT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Action Point</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_POINT_OPERATION_COUNT = ACTIVITY_POINT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.instance.impl.InteractionPointImpl <em>Interaction Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.instance.impl.InteractionPointImpl
     * @see structure.instance.impl.InstancePackageImpl#getInteractionPoint()
     * @generated
     */
    int INTERACTION_POINT = 5;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT__VISUAL_ELEMENTS = ACTIVITY_POINT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT__ID = ACTIVITY_POINT__ID;

    /**
     * The feature id for the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT__INSTANTIATION = ACTIVITY_POINT__INSTANTIATION;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT__TYPE = ACTIVITY_POINT__TYPE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT__NAME = ACTIVITY_POINT__NAME;

    /**
     * The feature id for the '<em><b>Participations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT__PARTICIPATIONS = ACTIVITY_POINT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Interaction Point</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_FEATURE_COUNT = ACTIVITY_POINT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Interaction Point</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_POINT_OPERATION_COUNT = ACTIVITY_POINT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.instance.impl.EntityInstanceHiearchyImpl <em>Entity Instance Hiearchy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.instance.impl.EntityInstanceHiearchyImpl
     * @see structure.instance.impl.InstancePackageImpl#getEntityInstanceHiearchy()
     * @generated
     */
    int ENTITY_INSTANCE_HIEARCHY = 6;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANCE_HIEARCHY__VISUAL_ELEMENTS = ModelsPackage.INSTANCE_HIEARCHY__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANCE_HIEARCHY__ID = ModelsPackage.INSTANCE_HIEARCHY__ID;

    /**
     * The feature id for the '<em><b>Root</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANCE_HIEARCHY__ROOT = ModelsPackage.INSTANCE_HIEARCHY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Entity Instance Hiearchy</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANCE_HIEARCHY_FEATURE_COUNT = ModelsPackage.INSTANCE_HIEARCHY_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Entity Instance Hiearchy</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANCE_HIEARCHY_OPERATION_COUNT = ModelsPackage.INSTANCE_HIEARCHY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.instance.impl.EntityInstanceReferenceImpl <em>Entity Instance Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.instance.impl.EntityInstanceReferenceImpl
     * @see structure.instance.impl.InstancePackageImpl#getEntityInstanceReference()
     * @generated
     */
    int ENTITY_INSTANCE_REFERENCE = 7;

    /**
     * The feature id for the '<em><b>Child</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANCE_REFERENCE__CHILD = 0;

    /**
     * The number of structural features of the '<em>Entity Instance Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANCE_REFERENCE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Entity Instance Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANCE_REFERENCE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link structure.instance.impl.EntityInstanceStaticReferenceImpl <em>Entity Instance Static Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.instance.impl.EntityInstanceStaticReferenceImpl
     * @see structure.instance.impl.InstancePackageImpl#getEntityInstanceStaticReference()
     * @generated
     */
    int ENTITY_INSTANCE_STATIC_REFERENCE = 8;

    /**
     * The feature id for the '<em><b>Child</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANCE_STATIC_REFERENCE__CHILD = ENTITY_INSTANCE_REFERENCE__CHILD;

    /**
     * The number of structural features of the '<em>Entity Instance Static Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANCE_STATIC_REFERENCE_FEATURE_COUNT = ENTITY_INSTANCE_REFERENCE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Entity Instance Static Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANCE_STATIC_REFERENCE_OPERATION_COUNT = ENTITY_INSTANCE_REFERENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.instance.impl.EntityInstanceVariableReferenceImpl <em>Entity Instance Variable Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.instance.impl.EntityInstanceVariableReferenceImpl
     * @see structure.instance.impl.InstancePackageImpl#getEntityInstanceVariableReference()
     * @generated
     */
    int ENTITY_INSTANCE_VARIABLE_REFERENCE = 9;

    /**
     * The feature id for the '<em><b>Child</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANCE_VARIABLE_REFERENCE__CHILD = ENTITY_INSTANCE_REFERENCE__CHILD;

    /**
     * The number of structural features of the '<em>Entity Instance Variable Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANCE_VARIABLE_REFERENCE_FEATURE_COUNT = ENTITY_INSTANCE_REFERENCE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Entity Instance Variable Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANCE_VARIABLE_REFERENCE_OPERATION_COUNT = ENTITY_INSTANCE_REFERENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.instance.impl.LocalizableInstanceImpl <em>Localizable Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.instance.impl.LocalizableInstanceImpl
     * @see structure.instance.impl.InstancePackageImpl#getLocalizableInstance()
     * @generated
     */
    int LOCALIZABLE_INSTANCE = 10;

    /**
     * The feature id for the '<em><b>Location Instance</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCALIZABLE_INSTANCE__LOCATION_INSTANCE = 0;

    /**
     * The number of structural features of the '<em>Localizable Instance</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCALIZABLE_INSTANCE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Localizable Instance</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCALIZABLE_INSTANCE_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link structure.instance.Entity <em>Entity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Entity</em>'.
     * @see structure.instance.Entity
     * @generated
     */
    EClass getEntity();

    /**
     * Returns the meta object for the container reference '{@link structure.instance.Entity#getContainerEntity <em>Container Entity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Container Entity</em>'.
     * @see structure.instance.Entity#getContainerEntity()
     * @see #getEntity()
     * @generated
     */
    EReference getEntity_ContainerEntity();

    /**
     * Returns the meta object for the containment reference list '{@link structure.instance.Entity#getContainedEntities <em>Contained Entities</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Contained Entities</em>'.
     * @see structure.instance.Entity#getContainedEntities()
     * @see #getEntity()
     * @generated
     */
    EReference getEntity_ContainedEntities();

    /**
     * Returns the meta object for the reference '{@link structure.instance.Entity#getInstantiation <em>Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Instantiation</em>'.
     * @see structure.instance.Entity#getInstantiation()
     * @see #getEntity()
     * @generated
     */
    EReference getEntity_Instantiation();

    /**
     * Returns the meta object for the containment reference list '{@link structure.instance.Entity#getActivityPoints <em>Activity Points</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Activity Points</em>'.
     * @see structure.instance.Entity#getActivityPoints()
     * @see #getEntity()
     * @generated
     */
    EReference getEntity_ActivityPoints();

    /**
     * Returns the meta object for the containment reference list '{@link structure.instance.Entity#getInteractionPointParticipations <em>Interaction Point Participations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Interaction Point Participations</em>'.
     * @see structure.instance.Entity#getInteractionPointParticipations()
     * @see #getEntity()
     * @generated
     */
    EReference getEntity_InteractionPointParticipations();

    /**
     * Returns the meta object for class '{@link structure.instance.Location <em>Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Location</em>'.
     * @see structure.instance.Location
     * @generated
     */
    EClass getLocation();

    /**
     * Returns the meta object for the reference '{@link structure.instance.Location#getInstantiation <em>Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Instantiation</em>'.
     * @see structure.instance.Location#getInstantiation()
     * @see #getLocation()
     * @generated
     */
    EReference getLocation_Instantiation();

    /**
     * Returns the meta object for the attribute '{@link structure.instance.Location#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see structure.instance.Location#getName()
     * @see #getLocation()
     * @generated
     */
    EAttribute getLocation_Name();

    /**
     * Returns the meta object for class '{@link structure.instance.InteractionPointParticipation <em>Interaction Point Participation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interaction Point Participation</em>'.
     * @see structure.instance.InteractionPointParticipation
     * @generated
     */
    EClass getInteractionPointParticipation();

    /**
     * Returns the meta object for the reference '{@link structure.instance.InteractionPointParticipation#getInstantiation <em>Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Instantiation</em>'.
     * @see structure.instance.InteractionPointParticipation#getInstantiation()
     * @see #getInteractionPointParticipation()
     * @generated
     */
    EReference getInteractionPointParticipation_Instantiation();

    /**
     * Returns the meta object for class '{@link structure.instance.ActivityPoint <em>Activity Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Activity Point</em>'.
     * @see structure.instance.ActivityPoint
     * @generated
     */
    EClass getActivityPoint();

    /**
     * Returns the meta object for the reference '{@link structure.instance.ActivityPoint#getInstantiation <em>Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Instantiation</em>'.
     * @see structure.instance.ActivityPoint#getInstantiation()
     * @see #getActivityPoint()
     * @generated
     */
    EReference getActivityPoint_Instantiation();

    /**
     * Returns the meta object for the reference '{@link structure.instance.ActivityPoint#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see structure.instance.ActivityPoint#getType()
     * @see #getActivityPoint()
     * @generated
     */
    EReference getActivityPoint_Type();

    /**
     * Returns the meta object for the attribute '{@link structure.instance.ActivityPoint#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see structure.instance.ActivityPoint#getName()
     * @see #getActivityPoint()
     * @generated
     */
    EAttribute getActivityPoint_Name();

    /**
     * Returns the meta object for class '{@link structure.instance.ActionPoint <em>Action Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Action Point</em>'.
     * @see structure.instance.ActionPoint
     * @generated
     */
    EClass getActionPoint();

    /**
     * Returns the meta object for class '{@link structure.instance.InteractionPoint <em>Interaction Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interaction Point</em>'.
     * @see structure.instance.InteractionPoint
     * @generated
     */
    EClass getInteractionPoint();

    /**
     * Returns the meta object for the reference list '{@link structure.instance.InteractionPoint#getParticipations <em>Participations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Participations</em>'.
     * @see structure.instance.InteractionPoint#getParticipations()
     * @see #getInteractionPoint()
     * @generated
     */
    EReference getInteractionPoint_Participations();

    /**
     * Returns the meta object for class '{@link structure.instance.EntityInstanceHiearchy <em>Entity Instance Hiearchy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Entity Instance Hiearchy</em>'.
     * @see structure.instance.EntityInstanceHiearchy
     * @generated
     */
    EClass getEntityInstanceHiearchy();

    /**
     * Returns the meta object for the containment reference '{@link structure.instance.EntityInstanceHiearchy#getRoot <em>Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Root</em>'.
     * @see structure.instance.EntityInstanceHiearchy#getRoot()
     * @see #getEntityInstanceHiearchy()
     * @generated
     */
    EReference getEntityInstanceHiearchy_Root();

    /**
     * Returns the meta object for class '{@link structure.instance.EntityInstanceReference <em>Entity Instance Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Entity Instance Reference</em>'.
     * @see structure.instance.EntityInstanceReference
     * @generated
     */
    EClass getEntityInstanceReference();

    /**
     * Returns the meta object for the containment reference '{@link structure.instance.EntityInstanceReference#getChild <em>Child</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Child</em>'.
     * @see structure.instance.EntityInstanceReference#getChild()
     * @see #getEntityInstanceReference()
     * @generated
     */
    EReference getEntityInstanceReference_Child();

    /**
     * Returns the meta object for class '{@link structure.instance.EntityInstanceStaticReference <em>Entity Instance Static Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Entity Instance Static Reference</em>'.
     * @see structure.instance.EntityInstanceStaticReference
     * @generated
     */
    EClass getEntityInstanceStaticReference();

    /**
     * Returns the meta object for class '{@link structure.instance.EntityInstanceVariableReference <em>Entity Instance Variable Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Entity Instance Variable Reference</em>'.
     * @see structure.instance.EntityInstanceVariableReference
     * @generated
     */
    EClass getEntityInstanceVariableReference();

    /**
     * Returns the meta object for class '{@link structure.instance.LocalizableInstance <em>Localizable Instance</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Localizable Instance</em>'.
     * @see structure.instance.LocalizableInstance
     * @generated
     */
    EClass getLocalizableInstance();

    /**
     * Returns the meta object for the containment reference '{@link structure.instance.LocalizableInstance#getLocationInstance <em>Location Instance</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Location Instance</em>'.
     * @see structure.instance.LocalizableInstance#getLocationInstance()
     * @see #getLocalizableInstance()
     * @generated
     */
    EReference getLocalizableInstance_LocationInstance();

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
         * The meta object literal for the '{@link structure.instance.impl.EntityImpl <em>Entity</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.instance.impl.EntityImpl
         * @see structure.instance.impl.InstancePackageImpl#getEntity()
         * @generated
         */
        EClass ENTITY = eINSTANCE.getEntity();

        /**
         * The meta object literal for the '<em><b>Container Entity</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY__CONTAINER_ENTITY = eINSTANCE.getEntity_ContainerEntity();

        /**
         * The meta object literal for the '<em><b>Contained Entities</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY__CONTAINED_ENTITIES = eINSTANCE.getEntity_ContainedEntities();

        /**
         * The meta object literal for the '<em><b>Instantiation</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY__INSTANTIATION = eINSTANCE.getEntity_Instantiation();

        /**
         * The meta object literal for the '<em><b>Activity Points</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY__ACTIVITY_POINTS = eINSTANCE.getEntity_ActivityPoints();

        /**
         * The meta object literal for the '<em><b>Interaction Point Participations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY__INTERACTION_POINT_PARTICIPATIONS = eINSTANCE.getEntity_InteractionPointParticipations();

        /**
         * The meta object literal for the '{@link structure.instance.impl.LocationImpl <em>Location</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.instance.impl.LocationImpl
         * @see structure.instance.impl.InstancePackageImpl#getLocation()
         * @generated
         */
        EClass LOCATION = eINSTANCE.getLocation();

        /**
         * The meta object literal for the '<em><b>Instantiation</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LOCATION__INSTANTIATION = eINSTANCE.getLocation_Instantiation();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LOCATION__NAME = eINSTANCE.getLocation_Name();

        /**
         * The meta object literal for the '{@link structure.instance.impl.InteractionPointParticipationImpl <em>Interaction Point Participation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.instance.impl.InteractionPointParticipationImpl
         * @see structure.instance.impl.InstancePackageImpl#getInteractionPointParticipation()
         * @generated
         */
        EClass INTERACTION_POINT_PARTICIPATION = eINSTANCE.getInteractionPointParticipation();

        /**
         * The meta object literal for the '<em><b>Instantiation</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERACTION_POINT_PARTICIPATION__INSTANTIATION = eINSTANCE.getInteractionPointParticipation_Instantiation();

        /**
         * The meta object literal for the '{@link structure.instance.impl.ActivityPointImpl <em>Activity Point</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.instance.impl.ActivityPointImpl
         * @see structure.instance.impl.InstancePackageImpl#getActivityPoint()
         * @generated
         */
        EClass ACTIVITY_POINT = eINSTANCE.getActivityPoint();

        /**
         * The meta object literal for the '<em><b>Instantiation</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTIVITY_POINT__INSTANTIATION = eINSTANCE.getActivityPoint_Instantiation();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTIVITY_POINT__TYPE = eINSTANCE.getActivityPoint_Type();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ACTIVITY_POINT__NAME = eINSTANCE.getActivityPoint_Name();

        /**
         * The meta object literal for the '{@link structure.instance.impl.ActionPointImpl <em>Action Point</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.instance.impl.ActionPointImpl
         * @see structure.instance.impl.InstancePackageImpl#getActionPoint()
         * @generated
         */
        EClass ACTION_POINT = eINSTANCE.getActionPoint();

        /**
         * The meta object literal for the '{@link structure.instance.impl.InteractionPointImpl <em>Interaction Point</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.instance.impl.InteractionPointImpl
         * @see structure.instance.impl.InstancePackageImpl#getInteractionPoint()
         * @generated
         */
        EClass INTERACTION_POINT = eINSTANCE.getInteractionPoint();

        /**
         * The meta object literal for the '<em><b>Participations</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERACTION_POINT__PARTICIPATIONS = eINSTANCE.getInteractionPoint_Participations();

        /**
         * The meta object literal for the '{@link structure.instance.impl.EntityInstanceHiearchyImpl <em>Entity Instance Hiearchy</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.instance.impl.EntityInstanceHiearchyImpl
         * @see structure.instance.impl.InstancePackageImpl#getEntityInstanceHiearchy()
         * @generated
         */
        EClass ENTITY_INSTANCE_HIEARCHY = eINSTANCE.getEntityInstanceHiearchy();

        /**
         * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_INSTANCE_HIEARCHY__ROOT = eINSTANCE.getEntityInstanceHiearchy_Root();

        /**
         * The meta object literal for the '{@link structure.instance.impl.EntityInstanceReferenceImpl <em>Entity Instance Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.instance.impl.EntityInstanceReferenceImpl
         * @see structure.instance.impl.InstancePackageImpl#getEntityInstanceReference()
         * @generated
         */
        EClass ENTITY_INSTANCE_REFERENCE = eINSTANCE.getEntityInstanceReference();

        /**
         * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_INSTANCE_REFERENCE__CHILD = eINSTANCE.getEntityInstanceReference_Child();

        /**
         * The meta object literal for the '{@link structure.instance.impl.EntityInstanceStaticReferenceImpl <em>Entity Instance Static Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.instance.impl.EntityInstanceStaticReferenceImpl
         * @see structure.instance.impl.InstancePackageImpl#getEntityInstanceStaticReference()
         * @generated
         */
        EClass ENTITY_INSTANCE_STATIC_REFERENCE = eINSTANCE.getEntityInstanceStaticReference();

        /**
         * The meta object literal for the '{@link structure.instance.impl.EntityInstanceVariableReferenceImpl <em>Entity Instance Variable Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.instance.impl.EntityInstanceVariableReferenceImpl
         * @see structure.instance.impl.InstancePackageImpl#getEntityInstanceVariableReference()
         * @generated
         */
        EClass ENTITY_INSTANCE_VARIABLE_REFERENCE = eINSTANCE.getEntityInstanceVariableReference();

        /**
         * The meta object literal for the '{@link structure.instance.impl.LocalizableInstanceImpl <em>Localizable Instance</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.instance.impl.LocalizableInstanceImpl
         * @see structure.instance.impl.InstancePackageImpl#getLocalizableInstance()
         * @generated
         */
        EClass LOCALIZABLE_INSTANCE = eINSTANCE.getLocalizableInstance();

        /**
         * The meta object literal for the '<em><b>Location Instance</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LOCALIZABLE_INSTANCE__LOCATION_INSTANCE = eINSTANCE.getLocalizableInstance_LocationInstance();

    }

} //InstancePackage
