/**
 */
package trust.action;

import rule.action.Execute;

import trust.pattern.TrustRelationshipPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trust Management Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trust.action.TrustManagementAction#getTrustPattern <em>Trust Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see trust.action.ActionPackage#getTrustManagementAction()
 * @model abstract="true"
 * @generated
 */
public interface TrustManagementAction extends Execute {
  /**
   * Returns the value of the '<em><b>Trust Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trust Pattern</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trust Pattern</em>' containment reference.
   * @see #setTrustPattern(TrustRelationshipPattern)
   * @see trust.action.ActionPackage#getTrustManagementAction_TrustPattern()
   * @model containment="true"
   * @generated
   */
  TrustRelationshipPattern getTrustPattern();

  /**
   * Sets the value of the '{@link trust.action.TrustManagementAction#getTrustPattern <em>Trust Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trust Pattern</em>' containment reference.
   * @see #getTrustPattern()
   * @generated
   */
  void setTrustPattern(TrustRelationshipPattern value);

} // TrustManagementAction
