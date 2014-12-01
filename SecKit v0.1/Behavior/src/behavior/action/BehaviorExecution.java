/**
 */
package behavior.action;

import behavior.instantiation.BehaviorInstantiation;

import rule.action.Execute;

import structure.instance.EntityInstanceHiearchy;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.action.BehaviorExecution#getBehaviorInstantiation <em>Behavior Instantiation</em>}</li>
 *   <li>{@link behavior.action.BehaviorExecution#getTargetEntity <em>Target Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.action.ActionPackage#getBehaviorExecution()
 * @model
 * @generated
 */
public interface BehaviorExecution extends Execute {
    /**
     * Returns the value of the '<em><b>Behavior Instantiation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Behavior Instantiation</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Behavior Instantiation</em>' containment reference.
     * @see #setBehaviorInstantiation(BehaviorInstantiation)
     * @see behavior.action.ActionPackage#getBehaviorExecution_BehaviorInstantiation()
     * @model containment="true"
     * @generated
     */
    BehaviorInstantiation getBehaviorInstantiation();

    /**
     * Sets the value of the '{@link behavior.action.BehaviorExecution#getBehaviorInstantiation <em>Behavior Instantiation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Behavior Instantiation</em>' containment reference.
     * @see #getBehaviorInstantiation()
     * @generated
     */
    void setBehaviorInstantiation(BehaviorInstantiation value);

    /**
     * Returns the value of the '<em><b>Target Entity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target Entity</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target Entity</em>' containment reference.
     * @see #setTargetEntity(EntityInstanceHiearchy)
     * @see behavior.action.ActionPackage#getBehaviorExecution_TargetEntity()
     * @model containment="true"
     * @generated
     */
    EntityInstanceHiearchy getTargetEntity();

    /**
     * Sets the value of the '{@link behavior.action.BehaviorExecution#getTargetEntity <em>Target Entity</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Entity</em>' containment reference.
     * @see #getTargetEntity()
     * @generated
     */
    void setTargetEntity(EntityInstanceHiearchy value);

} // BehaviorExecution
