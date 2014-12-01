/**
 */
package behavior.instantiation;

import models.InstantiationHierarchy;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Instantiation Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.instantiation.ActionInstantiationHierarchy#getBehaviorTarget <em>Behavior Target</em>}</li>
 *   <li>{@link behavior.instantiation.ActionInstantiationHierarchy#getActivity <em>Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.instantiation.InstantiationPackage#getActionInstantiationHierarchy()
 * @model
 * @generated
 */
public interface ActionInstantiationHierarchy extends InstantiationHierarchy {
    /**
     * Returns the value of the '<em><b>Behavior Target</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Behavior Target</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Behavior Target</em>' containment reference.
     * @see #setBehaviorTarget(BehaviorInstantiationHierarchy)
     * @see behavior.instantiation.InstantiationPackage#getActionInstantiationHierarchy_BehaviorTarget()
     * @model containment="true" required="true"
     * @generated
     */
    BehaviorInstantiationHierarchy getBehaviorTarget();

    /**
     * Sets the value of the '{@link behavior.instantiation.ActionInstantiationHierarchy#getBehaviorTarget <em>Behavior Target</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Behavior Target</em>' containment reference.
     * @see #getBehaviorTarget()
     * @generated
     */
    void setBehaviorTarget(BehaviorInstantiationHierarchy value);

    /**
     * Returns the value of the '<em><b>Activity</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Activity</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Activity</em>' reference.
     * @see #setActivity(ActivityInstantiation)
     * @see behavior.instantiation.InstantiationPackage#getActionInstantiationHierarchy_Activity()
     * @model required="true"
     * @generated
     */
    ActivityInstantiation getActivity();

    /**
     * Sets the value of the '{@link behavior.instantiation.ActionInstantiationHierarchy#getActivity <em>Activity</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Activity</em>' reference.
     * @see #getActivity()
     * @generated
     */
    void setActivity(ActivityInstantiation value);

} // ActionInstantiationHierarchy
