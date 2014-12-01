/**
 */
package behavior.instance;

import behavior.instantiation.BehaviorInstantiation;

import behavior.type.AbstractBehaviorType;

import models.Element;

import org.eclipse.emf.common.util.EList;

import structure.instance.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.instance.Behavior#getActivities <em>Activities</em>}</li>
 *   <li>{@link behavior.instance.Behavior#getInstantiation <em>Instantiation</em>}</li>
 *   <li>{@link behavior.instance.Behavior#getFlowPoints <em>Flow Points</em>}</li>
 *   <li>{@link behavior.instance.Behavior#getContainedInstances <em>Contained Instances</em>}</li>
 *   <li>{@link behavior.instance.Behavior#getType <em>Type</em>}</li>
 *   <li>{@link behavior.instance.Behavior#getEntity <em>Entity</em>}</li>
 *   <li>{@link behavior.instance.Behavior#getContributions <em>Contributions</em>}</li>
 *   <li>{@link behavior.instance.Behavior#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.instance.InstancePackage#getBehavior()
 * @model
 * @generated
 */
public interface Behavior extends Element {
    /**
     * Returns the value of the '<em><b>Activities</b></em>' containment reference list.
     * The list contents are of type {@link behavior.instance.Activity}.
     * It is bidirectional and its opposite is '{@link behavior.instance.Activity#getBehavior <em>Behavior</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Activities</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Activities</em>' containment reference list.
     * @see behavior.instance.InstancePackage#getBehavior_Activities()
     * @see behavior.instance.Activity#getBehavior
     * @model opposite="behavior" containment="true"
     * @generated
     */
    EList<Activity> getActivities();

    /**
     * Returns the value of the '<em><b>Instantiation</b></em>' reference.
     * It is bidirectional and its opposite is '{@link behavior.instantiation.BehaviorInstantiation#getInstances <em>Instances</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instantiation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instantiation</em>' reference.
     * @see #setInstantiation(BehaviorInstantiation)
     * @see behavior.instance.InstancePackage#getBehavior_Instantiation()
     * @see behavior.instantiation.BehaviorInstantiation#getInstances
     * @model opposite="instances"
     * @generated
     */
    BehaviorInstantiation getInstantiation();

    /**
     * Sets the value of the '{@link behavior.instance.Behavior#getInstantiation <em>Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Instantiation</em>' reference.
     * @see #getInstantiation()
     * @generated
     */
    void setInstantiation(BehaviorInstantiation value);

    /**
     * Returns the value of the '<em><b>Flow Points</b></em>' containment reference list.
     * The list contents are of type {@link behavior.instance.FlowPoint}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Flow Points</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Flow Points</em>' containment reference list.
     * @see behavior.instance.InstancePackage#getBehavior_FlowPoints()
     * @model containment="true"
     * @generated
     */
    EList<FlowPoint> getFlowPoints();

    /**
     * Returns the value of the '<em><b>Contained Instances</b></em>' containment reference list.
     * The list contents are of type {@link behavior.instance.Behavior}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contained Instances</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contained Instances</em>' containment reference list.
     * @see behavior.instance.InstancePackage#getBehavior_ContainedInstances()
     * @model containment="true"
     * @generated
     */
    EList<Behavior> getContainedInstances();

    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link behavior.type.AbstractBehaviorType#getInstances <em>Instances</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(AbstractBehaviorType)
     * @see behavior.instance.InstancePackage#getBehavior_Type()
     * @see behavior.type.AbstractBehaviorType#getInstances
     * @model opposite="instances" required="true"
     * @generated
     */
    AbstractBehaviorType getType();

    /**
     * Sets the value of the '{@link behavior.instance.Behavior#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(AbstractBehaviorType value);

    /**
     * Returns the value of the '<em><b>Entity</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entity</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entity</em>' reference.
     * @see #setEntity(Entity)
     * @see behavior.instance.InstancePackage#getBehavior_Entity()
     * @model
     * @generated
     */
    Entity getEntity();

    /**
     * Sets the value of the '{@link behavior.instance.Behavior#getEntity <em>Entity</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Entity</em>' reference.
     * @see #getEntity()
     * @generated
     */
    void setEntity(Entity value);

    /**
     * Returns the value of the '<em><b>Contributions</b></em>' containment reference list.
     * The list contents are of type {@link behavior.instance.InteractionContribution}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contributions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contributions</em>' containment reference list.
     * @see behavior.instance.InstancePackage#getBehavior_Contributions()
     * @model containment="true"
     * @generated
     */
    EList<InteractionContribution> getContributions();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see behavior.instance.InstancePackage#getBehavior_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link behavior.instance.Behavior#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // Behavior
