/**
 */
package trust.pattern.impl;

import identity.pattern.IdentityPattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import trust.pattern.PatternPackage;
import trust.pattern.TrustRecommendationPattern;
import trust.pattern.TrustRelationshipPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trust Recommendation Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trust.pattern.impl.TrustRecommendationPatternImpl#getRecommender <em>Recommender</em>}</li>
 *   <li>{@link trust.pattern.impl.TrustRecommendationPatternImpl#getTrustRelationship <em>Trust Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrustRecommendationPatternImpl extends TrustPatternImpl implements TrustRecommendationPattern {
  /**
   * The cached value of the '{@link #getRecommender() <em>Recommender</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecommender()
   * @generated
   * @ordered
   */
  protected IdentityPattern recommender;

  /**
   * The cached value of the '{@link #getTrustRelationship() <em>Trust Relationship</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrustRelationship()
   * @generated
   * @ordered
   */
  protected TrustRelationshipPattern trustRelationship;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TrustRecommendationPatternImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return PatternPackage.Literals.TRUST_RECOMMENDATION_PATTERN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdentityPattern getRecommender() {
    return recommender;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRecommender(IdentityPattern newRecommender, NotificationChain msgs) {
    IdentityPattern oldRecommender = recommender;
    recommender = newRecommender;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternPackage.TRUST_RECOMMENDATION_PATTERN__RECOMMENDER, oldRecommender, newRecommender);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecommender(IdentityPattern newRecommender) {
    if (newRecommender != recommender) {
      NotificationChain msgs = null;
      if (recommender != null)
        msgs = ((InternalEObject)recommender).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternPackage.TRUST_RECOMMENDATION_PATTERN__RECOMMENDER, null, msgs);
      if (newRecommender != null)
        msgs = ((InternalEObject)newRecommender).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternPackage.TRUST_RECOMMENDATION_PATTERN__RECOMMENDER, null, msgs);
      msgs = basicSetRecommender(newRecommender, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.TRUST_RECOMMENDATION_PATTERN__RECOMMENDER, newRecommender, newRecommender));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrustRelationshipPattern getTrustRelationship() {
    return trustRelationship;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTrustRelationship(TrustRelationshipPattern newTrustRelationship, NotificationChain msgs) {
    TrustRelationshipPattern oldTrustRelationship = trustRelationship;
    trustRelationship = newTrustRelationship;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternPackage.TRUST_RECOMMENDATION_PATTERN__TRUST_RELATIONSHIP, oldTrustRelationship, newTrustRelationship);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrustRelationship(TrustRelationshipPattern newTrustRelationship) {
    if (newTrustRelationship != trustRelationship) {
      NotificationChain msgs = null;
      if (trustRelationship != null)
        msgs = ((InternalEObject)trustRelationship).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternPackage.TRUST_RECOMMENDATION_PATTERN__TRUST_RELATIONSHIP, null, msgs);
      if (newTrustRelationship != null)
        msgs = ((InternalEObject)newTrustRelationship).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternPackage.TRUST_RECOMMENDATION_PATTERN__TRUST_RELATIONSHIP, null, msgs);
      msgs = basicSetTrustRelationship(newTrustRelationship, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.TRUST_RECOMMENDATION_PATTERN__TRUST_RELATIONSHIP, newTrustRelationship, newTrustRelationship));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case PatternPackage.TRUST_RECOMMENDATION_PATTERN__RECOMMENDER:
        return basicSetRecommender(null, msgs);
      case PatternPackage.TRUST_RECOMMENDATION_PATTERN__TRUST_RELATIONSHIP:
        return basicSetTrustRelationship(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case PatternPackage.TRUST_RECOMMENDATION_PATTERN__RECOMMENDER:
        return getRecommender();
      case PatternPackage.TRUST_RECOMMENDATION_PATTERN__TRUST_RELATIONSHIP:
        return getTrustRelationship();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case PatternPackage.TRUST_RECOMMENDATION_PATTERN__RECOMMENDER:
        setRecommender((IdentityPattern)newValue);
        return;
      case PatternPackage.TRUST_RECOMMENDATION_PATTERN__TRUST_RELATIONSHIP:
        setTrustRelationship((TrustRelationshipPattern)newValue);
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
      case PatternPackage.TRUST_RECOMMENDATION_PATTERN__RECOMMENDER:
        setRecommender((IdentityPattern)null);
        return;
      case PatternPackage.TRUST_RECOMMENDATION_PATTERN__TRUST_RELATIONSHIP:
        setTrustRelationship((TrustRelationshipPattern)null);
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
      case PatternPackage.TRUST_RECOMMENDATION_PATTERN__RECOMMENDER:
        return recommender != null;
      case PatternPackage.TRUST_RECOMMENDATION_PATTERN__TRUST_RELATIONSHIP:
        return trustRelationship != null;
    }
    return super.eIsSet(featureID);
  }

} //TrustRecommendationPatternImpl
