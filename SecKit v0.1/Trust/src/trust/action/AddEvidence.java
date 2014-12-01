/**
 */
package trust.action;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Evidence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trust.action.AddEvidence#getAmount <em>Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @see trust.action.ActionPackage#getAddEvidence()
 * @model abstract="true"
 * @generated
 */
public interface AddEvidence extends TrustManagementAction {
  /**
   * Returns the value of the '<em><b>Amount</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Amount</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Amount</em>' attribute.
   * @see #setAmount(long)
   * @see trust.action.ActionPackage#getAddEvidence_Amount()
   * @model
   * @generated
   */
  long getAmount();

  /**
   * Sets the value of the '{@link trust.action.AddEvidence#getAmount <em>Amount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Amount</em>' attribute.
   * @see #getAmount()
   * @generated
   */
  void setAmount(long value);

} // AddEvidence
