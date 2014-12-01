/**
 */
package trust.pattern;

import identity.pattern.IdentityPattern;

import time.TimeInterval;

import trust.instance.TrustAspect;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trust Relationship Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trust.pattern.TrustRelationshipPattern#getAspect <em>Aspect</em>}</li>
 *   <li>{@link trust.pattern.TrustRelationshipPattern#getDegree <em>Degree</em>}</li>
 *   <li>{@link trust.pattern.TrustRelationshipPattern#getTrustor <em>Trustor</em>}</li>
 *   <li>{@link trust.pattern.TrustRelationshipPattern#getTimeInterval <em>Time Interval</em>}</li>
 *   <li>{@link trust.pattern.TrustRelationshipPattern#getTrusteeScope <em>Trustee Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see trust.pattern.PatternPackage#getTrustRelationshipPattern()
 * @model abstract="true"
 * @generated
 */
public interface TrustRelationshipPattern extends TrustPattern {
  /**
   * Returns the value of the '<em><b>Aspect</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aspect</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aspect</em>' reference.
   * @see #setAspect(TrustAspect)
   * @see trust.pattern.PatternPackage#getTrustRelationshipPattern_Aspect()
   * @model
   * @generated
   */
  TrustAspect getAspect();

  /**
   * Sets the value of the '{@link trust.pattern.TrustRelationshipPattern#getAspect <em>Aspect</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aspect</em>' reference.
   * @see #getAspect()
   * @generated
   */
  void setAspect(TrustAspect value);

  /**
   * Returns the value of the '<em><b>Degree</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Degree</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Degree</em>' containment reference.
   * @see #setDegree(TrustDegreePattern)
   * @see trust.pattern.PatternPackage#getTrustRelationshipPattern_Degree()
   * @model containment="true"
   * @generated
   */
  TrustDegreePattern getDegree();

  /**
   * Sets the value of the '{@link trust.pattern.TrustRelationshipPattern#getDegree <em>Degree</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Degree</em>' containment reference.
   * @see #getDegree()
   * @generated
   */
  void setDegree(TrustDegreePattern value);

  /**
   * Returns the value of the '<em><b>Trustor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trustor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trustor</em>' containment reference.
   * @see #setTrustor(IdentityPattern)
   * @see trust.pattern.PatternPackage#getTrustRelationshipPattern_Trustor()
   * @model containment="true"
   * @generated
   */
  IdentityPattern getTrustor();

  /**
   * Sets the value of the '{@link trust.pattern.TrustRelationshipPattern#getTrustor <em>Trustor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trustor</em>' containment reference.
   * @see #getTrustor()
   * @generated
   */
  void setTrustor(IdentityPattern value);

  /**
   * Returns the value of the '<em><b>Time Interval</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Time Interval</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time Interval</em>' containment reference.
   * @see #setTimeInterval(TimeInterval)
   * @see trust.pattern.PatternPackage#getTrustRelationshipPattern_TimeInterval()
   * @model containment="true"
   * @generated
   */
  TimeInterval getTimeInterval();

  /**
   * Sets the value of the '{@link trust.pattern.TrustRelationshipPattern#getTimeInterval <em>Time Interval</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time Interval</em>' containment reference.
   * @see #getTimeInterval()
   * @generated
   */
  void setTimeInterval(TimeInterval value);

  /**
   * Returns the value of the '<em><b>Trustee Scope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trustee Scope</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trustee Scope</em>' containment reference.
   * @see #setTrusteeScope(TrusteeScopePattern)
   * @see trust.pattern.PatternPackage#getTrustRelationshipPattern_TrusteeScope()
   * @model containment="true"
   * @generated
   */
  TrusteeScopePattern getTrusteeScope();

  /**
   * Sets the value of the '{@link trust.pattern.TrustRelationshipPattern#getTrusteeScope <em>Trustee Scope</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trustee Scope</em>' containment reference.
   * @see #getTrusteeScope()
   * @generated
   */
  void setTrusteeScope(TrusteeScopePattern value);

} // TrustRelationshipPattern
