/**
 */
package trust.instance;

import context.pattern.ContextSituationPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Situational Trust</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trust.instance.SituationalTrust#getContextSituation <em>Context Situation</em>}</li>
 * </ul>
 * </p>
 *
 * @see trust.instance.InstancePackage#getSituationalTrust()
 * @model
 * @generated
 */
public interface SituationalTrust extends TrusteeScope {
  /**
   * Returns the value of the '<em><b>Context Situation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Context Situation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Context Situation</em>' containment reference.
   * @see #setContextSituation(ContextSituationPattern)
   * @see trust.instance.InstancePackage#getSituationalTrust_ContextSituation()
   * @model containment="true"
   * @generated
   */
  ContextSituationPattern getContextSituation();

  /**
   * Sets the value of the '{@link trust.instance.SituationalTrust#getContextSituation <em>Context Situation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Context Situation</em>' containment reference.
   * @see #getContextSituation()
   * @generated
   */
  void setContextSituation(ContextSituationPattern value);

} // SituationalTrust
