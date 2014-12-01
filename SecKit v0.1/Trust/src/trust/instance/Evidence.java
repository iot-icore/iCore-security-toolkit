/**
 */
package trust.instance;

import models.Element;

import time.Timestamp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evidence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trust.instance.Evidence#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 * </p>
 *
 * @see trust.instance.InstancePackage#getEvidence()
 * @model abstract="true"
 * @generated
 */
public interface Evidence extends Element {
  /**
   * Returns the value of the '<em><b>Timestamp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Timestamp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Timestamp</em>' containment reference.
   * @see #setTimestamp(Timestamp)
   * @see trust.instance.InstancePackage#getEvidence_Timestamp()
   * @model containment="true"
   * @generated
   */
  Timestamp getTimestamp();

  /**
   * Sets the value of the '{@link trust.instance.Evidence#getTimestamp <em>Timestamp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Timestamp</em>' containment reference.
   * @see #getTimestamp()
   * @generated
   */
  void setTimestamp(Timestamp value);

} // Evidence
