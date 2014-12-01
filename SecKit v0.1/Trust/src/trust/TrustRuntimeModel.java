/**
 */
package trust;

import models.Model;

import org.eclipse.emf.common.util.EList;

import trust.instance.Evidence;
import trust.instance.TrustRecommendation;
import trust.instance.TrustRelationship;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trust.TrustRuntimeModel#getTrustRecommendations <em>Trust Recommendations</em>}</li>
 *   <li>{@link trust.TrustRuntimeModel#getTrustRelationships <em>Trust Relationships</em>}</li>
 *   <li>{@link trust.TrustRuntimeModel#getEvidence <em>Evidence</em>}</li>
 * </ul>
 * </p>
 *
 * @see trust.TrustPackage#getTrustRuntimeModel()
 * @model
 * @generated
 */
public interface TrustRuntimeModel extends Model {
  /**
   * Returns the value of the '<em><b>Trust Recommendations</b></em>' containment reference list.
   * The list contents are of type {@link trust.instance.TrustRecommendation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trust Recommendations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trust Recommendations</em>' containment reference list.
   * @see trust.TrustPackage#getTrustRuntimeModel_TrustRecommendations()
   * @model containment="true"
   * @generated
   */
  EList<TrustRecommendation> getTrustRecommendations();

  /**
   * Returns the value of the '<em><b>Trust Relationships</b></em>' containment reference list.
   * The list contents are of type {@link trust.instance.TrustRelationship}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trust Relationships</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trust Relationships</em>' containment reference list.
   * @see trust.TrustPackage#getTrustRuntimeModel_TrustRelationships()
   * @model containment="true"
   * @generated
   */
  EList<TrustRelationship> getTrustRelationships();

  /**
   * Returns the value of the '<em><b>Evidence</b></em>' containment reference list.
   * The list contents are of type {@link trust.instance.Evidence}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Evidence</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Evidence</em>' containment reference list.
   * @see trust.TrustPackage#getTrustRuntimeModel_Evidence()
   * @model containment="true"
   * @generated
   */
  EList<Evidence> getEvidence();

} // TrustRuntimeModel
