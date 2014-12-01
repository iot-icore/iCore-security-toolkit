/**
 */
package trust.instance;

import models.Element;
import trust.pattern.TrustPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trust Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trust.instance.TrustOperator#getTrustPattern <em>Trust Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see trust.instance.InstancePackage#getTrustOperator()
 * @model
 * @generated
 */
public interface TrustOperator extends Element {
  /**
   * Returns the value of the '<em><b>Trust Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trust Pattern</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trust Pattern</em>' containment reference.
   * @see #setTrustPattern(TrustPattern)
   * @see trust.instance.InstancePackage#getTrustOperator_TrustPattern()
   * @model containment="true" required="true"
   * @generated
   */
  TrustPattern getTrustPattern();

  /**
   * Sets the value of the '{@link trust.instance.TrustOperator#getTrustPattern <em>Trust Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trust Pattern</em>' containment reference.
   * @see #getTrustPattern()
   * @generated
   */
  void setTrustPattern(TrustPattern value);

} // TrustOperator
