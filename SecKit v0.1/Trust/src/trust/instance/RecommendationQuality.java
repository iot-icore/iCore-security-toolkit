/**
 */
package trust.instance;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recommendation Quality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trust.instance.RecommendationQuality#getAspectsToRecommend <em>Aspects To Recommend</em>}</li>
 * </ul>
 * </p>
 *
 * @see trust.instance.InstancePackage#getRecommendationQuality()
 * @model
 * @generated
 */
public interface RecommendationQuality extends TrustAspect {
  /**
   * Returns the value of the '<em><b>Aspects To Recommend</b></em>' reference list.
   * The list contents are of type {@link trust.instance.TrustAspect}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aspects To Recommend</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aspects To Recommend</em>' reference list.
   * @see trust.instance.InstancePackage#getRecommendationQuality_AspectsToRecommend()
   * @model
   * @generated
   */
  EList<TrustAspect> getAspectsToRecommend();

} // RecommendationQuality
