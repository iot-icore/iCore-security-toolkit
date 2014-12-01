/**
 */
package behavior.instantiation;

import behavior.causality.CausalityParameter;

import behavior.instance.Action;

import behavior.type.MonolithicBehaviorType;

import models.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.instantiation.ActionInstantiation#getInstances <em>Instances</em>}</li>
 *   <li>{@link behavior.instantiation.ActionInstantiation#getBehaviorType <em>Behavior Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.instantiation.InstantiationPackage#getActionInstantiation()
 * @model
 * @generated
 */
public interface ActionInstantiation extends ActivityInstantiation, Element, CausalityParameter {
    /**
     * Returns the value of the '<em><b>Instances</b></em>' reference list.
     * The list contents are of type {@link behavior.instance.Action}.
     * It is bidirectional and its opposite is '{@link behavior.instance.Action#getInstantiation <em>Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instances</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instances</em>' reference list.
     * @see behavior.instantiation.InstantiationPackage#getActionInstantiation_Instances()
     * @see behavior.instance.Action#getInstantiation
     * @model opposite="instantiation"
     * @generated
     */
    EList<Action> getInstances();

    /**
     * Returns the value of the '<em><b>Behavior Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Behavior Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Behavior Type</em>' reference.
     * @see #setBehaviorType(MonolithicBehaviorType)
     * @see behavior.instantiation.InstantiationPackage#getActionInstantiation_BehaviorType()
     * @model required="true"
     * @generated
     */
    MonolithicBehaviorType getBehaviorType();

    /**
     * Sets the value of the '{@link behavior.instantiation.ActionInstantiation#getBehaviorType <em>Behavior Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Behavior Type</em>' reference.
     * @see #getBehaviorType()
     * @generated
     */
    void setBehaviorType(MonolithicBehaviorType value);

} // ActionInstantiation
