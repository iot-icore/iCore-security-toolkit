/**
 */
package trust.instance;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trust Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trust.instance.TrustRequirement#getTrustBelief <em>Trust Belief</em>}</li>
 * </ul>
 * </p>
 *
 * @see trust.instance.InstancePackage#getTrustRequirement()
 * @model
 * @generated
 */
public interface TrustRequirement extends Requirement {
  /**
   * Returns the value of the '<em><b>Trust Belief</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trust Belief</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trust Belief</em>' containment reference.
   * @see #setTrustBelief(TrustRelationship)
   * @see trust.instance.InstancePackage#getTrustRequirement_TrustBelief()
   * @model containment="true" required="true"
   * @generated
   */
  TrustRelationship getTrustBelief();

  /**
   * Sets the value of the '{@link trust.instance.TrustRequirement#getTrustBelief <em>Trust Belief</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trust Belief</em>' containment reference.
   * @see #getTrustBelief()
   * @generated
   */
  void setTrustBelief(TrustRelationship value);

} // TrustRequirement
