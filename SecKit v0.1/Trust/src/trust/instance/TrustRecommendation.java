/**
 */
package trust.instance;

import identity.instance.AbstractIdentity;

import models.Element;

import time.Timestamp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trust Recommendation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trust.instance.TrustRecommendation#getTrustRelationship <em>Trust Relationship</em>}</li>
 *   <li>{@link trust.instance.TrustRecommendation#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link trust.instance.TrustRecommendation#getRecommender <em>Recommender</em>}</li>
 * </ul>
 * </p>
 *
 * @see trust.instance.InstancePackage#getTrustRecommendation()
 * @model
 * @generated
 */
public interface TrustRecommendation extends Element {
  /**
   * Returns the value of the '<em><b>Trust Relationship</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trust Relationship</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trust Relationship</em>' containment reference.
   * @see #setTrustRelationship(TrustRelationship)
   * @see trust.instance.InstancePackage#getTrustRecommendation_TrustRelationship()
   * @model containment="true" required="true"
   * @generated
   */
  TrustRelationship getTrustRelationship();

  /**
   * Sets the value of the '{@link trust.instance.TrustRecommendation#getTrustRelationship <em>Trust Relationship</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trust Relationship</em>' containment reference.
   * @see #getTrustRelationship()
   * @generated
   */
  void setTrustRelationship(TrustRelationship value);

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
   * @see trust.instance.InstancePackage#getTrustRecommendation_Timestamp()
   * @model containment="true"
   * @generated
   */
  Timestamp getTimestamp();

  /**
   * Sets the value of the '{@link trust.instance.TrustRecommendation#getTimestamp <em>Timestamp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Timestamp</em>' containment reference.
   * @see #getTimestamp()
   * @generated
   */
  void setTimestamp(Timestamp value);

  /**
   * Returns the value of the '<em><b>Recommender</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recommender</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recommender</em>' containment reference.
   * @see #setRecommender(AbstractIdentity)
   * @see trust.instance.InstancePackage#getTrustRecommendation_Recommender()
   * @model containment="true" required="true"
   * @generated
   */
  AbstractIdentity getRecommender();

  /**
   * Sets the value of the '{@link trust.instance.TrustRecommendation#getRecommender <em>Recommender</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Recommender</em>' containment reference.
   * @see #getRecommender()
   * @generated
   */
  void setRecommender(AbstractIdentity value);

} // TrustRecommendation
