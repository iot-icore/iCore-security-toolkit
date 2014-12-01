/**
 */
package behavior.instance;

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
 * @see behavior.instance.InstanceFactory
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
    String eNS_URI = "http://behavior/instance/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "behavior-instance";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    InstancePackage eINSTANCE = behavior.instance.impl.InstancePackageImpl.init();

    /**
     * The meta object id for the '{@link behavior.instance.impl.BehaviorImpl <em>Behavior</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.instance.impl.BehaviorImpl
     * @see behavior.instance.impl.InstancePackageImpl#getBehavior()
     * @generated
     */
    int BEHAVIOR = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Activities</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR__ACTIVITIES = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR__INSTANTIATION = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Flow Points</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR__FLOW_POINTS = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Contained Instances</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR__CONTAINED_INSTANCES = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR__TYPE = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Entity</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR__ENTITY = ModelsPackage.ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Contributions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR__CONTRIBUTIONS = ModelsPackage.ELEMENT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Behavior</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 8;

    /**
     * The number of operations of the '<em>Behavior</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.instance.impl.ActivityImpl <em>Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.instance.impl.ActivityImpl
     * @see behavior.instance.impl.InstancePackageImpl#getActivity()
     * @generated
     */
    int ACTIVITY = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Data</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__DATA = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Identities</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__IDENTITIES = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Behavior</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY__BEHAVIOR = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Activity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Activity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVITY_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.instance.impl.FlowPointImpl <em>Flow Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.instance.impl.FlowPointImpl
     * @see behavior.instance.impl.InstancePackageImpl#getFlowPoint()
     * @generated
     */
    int FLOW_POINT = 2;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Data</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT__DATA = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Identities</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT__IDENTITIES = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT__INSTANTIATION = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Flow Point</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Flow Point</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOW_POINT_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.instance.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.instance.impl.ActionImpl
     * @see behavior.instance.impl.InstancePackageImpl#getAction()
     * @generated
     */
    int ACTION = 3;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__VISUAL_ELEMENTS = ACTIVITY__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__ID = ACTIVITY__ID;

    /**
     * The feature id for the '<em><b>Data</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__DATA = ACTIVITY__DATA;

    /**
     * The feature id for the '<em><b>Identities</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__IDENTITIES = ACTIVITY__IDENTITIES;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__NAME = ACTIVITY__NAME;

    /**
     * The feature id for the '<em><b>Behavior</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__BEHAVIOR = ACTIVITY__BEHAVIOR;

    /**
     * The feature id for the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__INSTANTIATION = ACTIVITY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__TYPE = ACTIVITY_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Action</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Action</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.instance.impl.InteractionImpl <em>Interaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.instance.impl.InteractionImpl
     * @see behavior.instance.impl.InstancePackageImpl#getInteraction()
     * @generated
     */
    int INTERACTION = 4;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION__VISUAL_ELEMENTS = ACTIVITY__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION__ID = ACTIVITY__ID;

    /**
     * The feature id for the '<em><b>Data</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION__DATA = ACTIVITY__DATA;

    /**
     * The feature id for the '<em><b>Identities</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION__IDENTITIES = ACTIVITY__IDENTITIES;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION__NAME = ACTIVITY__NAME;

    /**
     * The feature id for the '<em><b>Behavior</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION__BEHAVIOR = ACTIVITY__BEHAVIOR;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION__TYPE = ACTIVITY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Contributions</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION__CONTRIBUTIONS = ACTIVITY_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Interaction</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Interaction</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.instance.impl.InteractionContributionImpl <em>Interaction Contribution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.instance.impl.InteractionContributionImpl
     * @see behavior.instance.impl.InstancePackageImpl#getInteractionContribution()
     * @generated
     */
    int INTERACTION_CONTRIBUTION = 5;

    /**
     * The number of structural features of the '<em>Interaction Contribution</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Interaction Contribution</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERACTION_CONTRIBUTION_OPERATION_COUNT = 0;


    /**
     * The meta object id for the '{@link behavior.instance.impl.DataProducerInstanceImpl <em>Data Producer Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.instance.impl.DataProducerInstanceImpl
     * @see behavior.instance.impl.InstancePackageImpl#getDataProducerInstance()
     * @generated
     */
    int DATA_PRODUCER_INSTANCE = 6;

    /**
     * The feature id for the '<em><b>Data</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_PRODUCER_INSTANCE__DATA = 0;

    /**
     * The feature id for the '<em><b>Identities</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_PRODUCER_INSTANCE__IDENTITIES = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_PRODUCER_INSTANCE__NAME = 2;

    /**
     * The number of structural features of the '<em>Data Producer Instance</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_PRODUCER_INSTANCE_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Data Producer Instance</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_PRODUCER_INSTANCE_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link behavior.instance.Behavior <em>Behavior</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Behavior</em>'.
     * @see behavior.instance.Behavior
     * @generated
     */
    EClass getBehavior();

    /**
     * Returns the meta object for the containment reference list '{@link behavior.instance.Behavior#getActivities <em>Activities</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Activities</em>'.
     * @see behavior.instance.Behavior#getActivities()
     * @see #getBehavior()
     * @generated
     */
    EReference getBehavior_Activities();

    /**
     * Returns the meta object for the reference '{@link behavior.instance.Behavior#getInstantiation <em>Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Instantiation</em>'.
     * @see behavior.instance.Behavior#getInstantiation()
     * @see #getBehavior()
     * @generated
     */
    EReference getBehavior_Instantiation();

    /**
     * Returns the meta object for the containment reference list '{@link behavior.instance.Behavior#getFlowPoints <em>Flow Points</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Flow Points</em>'.
     * @see behavior.instance.Behavior#getFlowPoints()
     * @see #getBehavior()
     * @generated
     */
    EReference getBehavior_FlowPoints();

    /**
     * Returns the meta object for the containment reference list '{@link behavior.instance.Behavior#getContainedInstances <em>Contained Instances</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Contained Instances</em>'.
     * @see behavior.instance.Behavior#getContainedInstances()
     * @see #getBehavior()
     * @generated
     */
    EReference getBehavior_ContainedInstances();

    /**
     * Returns the meta object for the reference '{@link behavior.instance.Behavior#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see behavior.instance.Behavior#getType()
     * @see #getBehavior()
     * @generated
     */
    EReference getBehavior_Type();

    /**
     * Returns the meta object for the reference '{@link behavior.instance.Behavior#getEntity <em>Entity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Entity</em>'.
     * @see behavior.instance.Behavior#getEntity()
     * @see #getBehavior()
     * @generated
     */
    EReference getBehavior_Entity();

    /**
     * Returns the meta object for the containment reference list '{@link behavior.instance.Behavior#getContributions <em>Contributions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Contributions</em>'.
     * @see behavior.instance.Behavior#getContributions()
     * @see #getBehavior()
     * @generated
     */
    EReference getBehavior_Contributions();

    /**
     * Returns the meta object for the attribute '{@link behavior.instance.Behavior#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see behavior.instance.Behavior#getName()
     * @see #getBehavior()
     * @generated
     */
    EAttribute getBehavior_Name();

    /**
     * Returns the meta object for class '{@link behavior.instance.Activity <em>Activity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Activity</em>'.
     * @see behavior.instance.Activity
     * @generated
     */
    EClass getActivity();

    /**
     * Returns the meta object for the container reference '{@link behavior.instance.Activity#getBehavior <em>Behavior</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Behavior</em>'.
     * @see behavior.instance.Activity#getBehavior()
     * @see #getActivity()
     * @generated
     */
    EReference getActivity_Behavior();

    /**
     * Returns the meta object for class '{@link behavior.instance.FlowPoint <em>Flow Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Flow Point</em>'.
     * @see behavior.instance.FlowPoint
     * @generated
     */
    EClass getFlowPoint();

    /**
     * Returns the meta object for the reference '{@link behavior.instance.FlowPoint#getInstantiation <em>Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Instantiation</em>'.
     * @see behavior.instance.FlowPoint#getInstantiation()
     * @see #getFlowPoint()
     * @generated
     */
    EReference getFlowPoint_Instantiation();

    /**
     * Returns the meta object for class '{@link behavior.instance.Action <em>Action</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Action</em>'.
     * @see behavior.instance.Action
     * @generated
     */
    EClass getAction();

    /**
     * Returns the meta object for the reference '{@link behavior.instance.Action#getInstantiation <em>Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Instantiation</em>'.
     * @see behavior.instance.Action#getInstantiation()
     * @see #getAction()
     * @generated
     */
    EReference getAction_Instantiation();

    /**
     * Returns the meta object for the reference '{@link behavior.instance.Action#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see behavior.instance.Action#getType()
     * @see #getAction()
     * @generated
     */
    EReference getAction_Type();

    /**
     * Returns the meta object for class '{@link behavior.instance.Interaction <em>Interaction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interaction</em>'.
     * @see behavior.instance.Interaction
     * @generated
     */
    EClass getInteraction();

    /**
     * Returns the meta object for the reference '{@link behavior.instance.Interaction#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see behavior.instance.Interaction#getType()
     * @see #getInteraction()
     * @generated
     */
    EReference getInteraction_Type();

    /**
     * Returns the meta object for the reference list '{@link behavior.instance.Interaction#getContributions <em>Contributions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Contributions</em>'.
     * @see behavior.instance.Interaction#getContributions()
     * @see #getInteraction()
     * @generated
     */
    EReference getInteraction_Contributions();

    /**
     * Returns the meta object for class '{@link behavior.instance.InteractionContribution <em>Interaction Contribution</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interaction Contribution</em>'.
     * @see behavior.instance.InteractionContribution
     * @generated
     */
    EClass getInteractionContribution();

    /**
     * Returns the meta object for class '{@link behavior.instance.DataProducerInstance <em>Data Producer Instance</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Producer Instance</em>'.
     * @see behavior.instance.DataProducerInstance
     * @generated
     */
    EClass getDataProducerInstance();

    /**
     * Returns the meta object for the reference list '{@link behavior.instance.DataProducerInstance#getData <em>Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Data</em>'.
     * @see behavior.instance.DataProducerInstance#getData()
     * @see #getDataProducerInstance()
     * @generated
     */
    EReference getDataProducerInstance_Data();

    /**
     * Returns the meta object for the reference list '{@link behavior.instance.DataProducerInstance#getIdentities <em>Identities</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Identities</em>'.
     * @see behavior.instance.DataProducerInstance#getIdentities()
     * @see #getDataProducerInstance()
     * @generated
     */
    EReference getDataProducerInstance_Identities();

    /**
     * Returns the meta object for the attribute '{@link behavior.instance.DataProducerInstance#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see behavior.instance.DataProducerInstance#getName()
     * @see #getDataProducerInstance()
     * @generated
     */
    EAttribute getDataProducerInstance_Name();

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
         * The meta object literal for the '{@link behavior.instance.impl.BehaviorImpl <em>Behavior</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.instance.impl.BehaviorImpl
         * @see behavior.instance.impl.InstancePackageImpl#getBehavior()
         * @generated
         */
        EClass BEHAVIOR = eINSTANCE.getBehavior();

        /**
         * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BEHAVIOR__ACTIVITIES = eINSTANCE.getBehavior_Activities();

        /**
         * The meta object literal for the '<em><b>Instantiation</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BEHAVIOR__INSTANTIATION = eINSTANCE.getBehavior_Instantiation();

        /**
         * The meta object literal for the '<em><b>Flow Points</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BEHAVIOR__FLOW_POINTS = eINSTANCE.getBehavior_FlowPoints();

        /**
         * The meta object literal for the '<em><b>Contained Instances</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BEHAVIOR__CONTAINED_INSTANCES = eINSTANCE.getBehavior_ContainedInstances();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BEHAVIOR__TYPE = eINSTANCE.getBehavior_Type();

        /**
         * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BEHAVIOR__ENTITY = eINSTANCE.getBehavior_Entity();

        /**
         * The meta object literal for the '<em><b>Contributions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BEHAVIOR__CONTRIBUTIONS = eINSTANCE.getBehavior_Contributions();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BEHAVIOR__NAME = eINSTANCE.getBehavior_Name();

        /**
         * The meta object literal for the '{@link behavior.instance.impl.ActivityImpl <em>Activity</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.instance.impl.ActivityImpl
         * @see behavior.instance.impl.InstancePackageImpl#getActivity()
         * @generated
         */
        EClass ACTIVITY = eINSTANCE.getActivity();

        /**
         * The meta object literal for the '<em><b>Behavior</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTIVITY__BEHAVIOR = eINSTANCE.getActivity_Behavior();

        /**
         * The meta object literal for the '{@link behavior.instance.impl.FlowPointImpl <em>Flow Point</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.instance.impl.FlowPointImpl
         * @see behavior.instance.impl.InstancePackageImpl#getFlowPoint()
         * @generated
         */
        EClass FLOW_POINT = eINSTANCE.getFlowPoint();

        /**
         * The meta object literal for the '<em><b>Instantiation</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FLOW_POINT__INSTANTIATION = eINSTANCE.getFlowPoint_Instantiation();

        /**
         * The meta object literal for the '{@link behavior.instance.impl.ActionImpl <em>Action</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.instance.impl.ActionImpl
         * @see behavior.instance.impl.InstancePackageImpl#getAction()
         * @generated
         */
        EClass ACTION = eINSTANCE.getAction();

        /**
         * The meta object literal for the '<em><b>Instantiation</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTION__INSTANTIATION = eINSTANCE.getAction_Instantiation();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTION__TYPE = eINSTANCE.getAction_Type();

        /**
         * The meta object literal for the '{@link behavior.instance.impl.InteractionImpl <em>Interaction</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.instance.impl.InteractionImpl
         * @see behavior.instance.impl.InstancePackageImpl#getInteraction()
         * @generated
         */
        EClass INTERACTION = eINSTANCE.getInteraction();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERACTION__TYPE = eINSTANCE.getInteraction_Type();

        /**
         * The meta object literal for the '<em><b>Contributions</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INTERACTION__CONTRIBUTIONS = eINSTANCE.getInteraction_Contributions();

        /**
         * The meta object literal for the '{@link behavior.instance.impl.InteractionContributionImpl <em>Interaction Contribution</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.instance.impl.InteractionContributionImpl
         * @see behavior.instance.impl.InstancePackageImpl#getInteractionContribution()
         * @generated
         */
        EClass INTERACTION_CONTRIBUTION = eINSTANCE.getInteractionContribution();

        /**
         * The meta object literal for the '{@link behavior.instance.impl.DataProducerInstanceImpl <em>Data Producer Instance</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.instance.impl.DataProducerInstanceImpl
         * @see behavior.instance.impl.InstancePackageImpl#getDataProducerInstance()
         * @generated
         */
        EClass DATA_PRODUCER_INSTANCE = eINSTANCE.getDataProducerInstance();

        /**
         * The meta object literal for the '<em><b>Data</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_PRODUCER_INSTANCE__DATA = eINSTANCE.getDataProducerInstance_Data();

        /**
         * The meta object literal for the '<em><b>Identities</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_PRODUCER_INSTANCE__IDENTITIES = eINSTANCE.getDataProducerInstance_Identities();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_PRODUCER_INSTANCE__NAME = eINSTANCE.getDataProducerInstance_Name();

    }

} //InstancePackage
