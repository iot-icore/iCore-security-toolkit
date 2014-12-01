/**
 */
package trust.pattern;

import identity.pattern.IdentityPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trust Recommendation Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trust.pattern.TrustRecommendationPattern#getRecommender <em>Recommender</em>}</li>
 *   <li>{@link trust.pattern.TrustRecommendationPattern#getTrustRelationship <em>Trust Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @see trust.pattern.PatternPackage#getTrustRecommendationPattern()
 * @model
 * @generated
 */
public interface TrustRecommendationPattern extends TrustPattern {
  /**
   * Returns the value of the '<em><b>Recommender</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recommender</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recommender</em>' containment reference.
   * @see #setRecommender(IdentityPattern)
   * @see trust.pattern.PatternPackage#getTrustRecommendationPattern_Recommender()
   * @model containment="true"
   * @generated
   */
  IdentityPattern getRecommender();

  /**
   * Sets the value of the '{@link trust.pattern.TrustRecommendationPattern#getRecommender <em>Recommender</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Recommender</em>' containment reference.
   * @see #getRecommender()
   * @generated
   */
  void setRecommender(IdentityPattern value);

  /**
   * Returns the value of the '<em><b>Trust Relationship</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trust Relationship</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trust Relationship</em>' containment reference.
   * @see #setTrustRelationship(TrustRelationshipPattern)
   * @see trust.pattern.PatternPackage#getTrustRecommendationPattern_TrustRelationship()
   * @model containment="true"
   * @generated
   */
  TrustRelationshipPattern getTrustRelationship();

  /**
   * Sets the value of the '{@link trust.pattern.TrustRecommendationPattern#getTrustRelationship <em>Trust Relationship</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trust Relationship</em>' containment reference.
   * @see #getTrustRelationship()
   * @generated
   */
  void setTrustRelationship(TrustRelationshipPattern value);

} // TrustRecommendationPattern
