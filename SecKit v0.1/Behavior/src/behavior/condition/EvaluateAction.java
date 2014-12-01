/**
 */
package behavior.condition;

import behavior.instantiation.ActionInstantiation;

import rule.condition.Atom;
import rule.condition.Nullary;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluate Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.condition.EvaluateAction#getActionInstantiation <em>Action Instantiation</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.condition.ConditionPackage#getEvaluateAction()
 * @model
 * @generated
 */
public interface EvaluateAction extends Atom, Nullary {
    /**
     * Returns the value of the '<em><b>Action Instantiation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Action Instantiation</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Action Instantiation</em>' containment reference.
     * @see #setActionInstantiation(ActionInstantiation)
     * @see behavior.condition.ConditionPackage#getEvaluateAction_ActionInstantiation()
     * @model containment="true" required="true"
     * @generated
     */
    ActionInstantiation getActionInstantiation();

    /**
     * Sets the value of the '{@link behavior.condition.EvaluateAction#getActionInstantiation <em>Action Instantiation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Action Instantiation</em>' containment reference.
     * @see #getActionInstantiation()
     * @generated
     */
    void setActionInstantiation(ActionInstantiation value);

} // EvaluateAction
