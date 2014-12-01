/**
 */
package trust.instance.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import trust.instance.InstancePackage;
import trust.instance.RecommendationQuality;
import trust.instance.TrustAspect;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recommendation Quality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trust.instance.impl.RecommendationQualityImpl#getAspectsToRecommend <em>Aspects To Recommend</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecommendationQualityImpl extends TrustAspectImpl implements RecommendationQuality {
  /**
   * The cached value of the '{@link #getAspectsToRecommend() <em>Aspects To Recommend</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAspectsToRecommend()
   * @generated
   * @ordered
   */
  protected EList<TrustAspect> aspectsToRecommend;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RecommendationQualityImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return InstancePackage.Literals.RECOMMENDATION_QUALITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TrustAspect> getAspectsToRecommend() {
    if (aspectsToRecommend == null) {
      aspectsToRecommend = new EObjectResolvingEList<TrustAspect>(TrustAspect.class, this, InstancePackage.RECOMMENDATION_QUALITY__ASPECTS_TO_RECOMMEND);
    }
    return aspectsToRecommend;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case InstancePackage.RECOMMENDATION_QUALITY__ASPECTS_TO_RECOMMEND:
        return getAspectsToRecommend();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case InstancePackage.RECOMMENDATION_QUALITY__ASPECTS_TO_RECOMMEND:
        getAspectsToRecommend().clear();
        getAspectsToRecommend().addAll((Collection<? extends TrustAspect>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case InstancePackage.RECOMMENDATION_QUALITY__ASPECTS_TO_RECOMMEND:
        getAspectsToRecommend().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case InstancePackage.RECOMMENDATION_QUALITY__ASPECTS_TO_RECOMMEND:
        return aspectsToRecommend != null && !aspectsToRecommend.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RecommendationQualityImpl
