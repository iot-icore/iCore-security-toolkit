/**
 */
package trust.pattern;

import identity.pattern.IdentityPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Personal Scope Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trust.pattern.PersonalScopePattern#getTrustee <em>Trustee</em>}</li>
 * </ul>
 * </p>
 *
 * @see trust.pattern.PatternPackage#getPersonalScopePattern()
 * @model
 * @generated
 */
public interface PersonalScopePattern extends SituationalScopePattern {
  /**
   * Returns the value of the '<em><b>Trustee</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trustee</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trustee</em>' containment reference.
   * @see #setTrustee(IdentityPattern)
   * @see trust.pattern.PatternPackage#getPersonalScopePattern_Trustee()
   * @model containment="true"
   * @generated
   */
  IdentityPattern getTrustee();

  /**
   * Sets the value of the '{@link trust.pattern.PersonalScopePattern#getTrustee <em>Trustee</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trustee</em>' containment reference.
   * @see #getTrustee()
   * @generated
   */
  void setTrustee(IdentityPattern value);

} // PersonalScopePattern
