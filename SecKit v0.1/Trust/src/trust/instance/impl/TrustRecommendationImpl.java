/**
 */
package trust.instance.impl;

import identity.instance.AbstractIdentity;

import models.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import time.Timestamp;

import trust.instance.InstancePackage;
import trust.instance.TrustRecommendation;
import trust.instance.TrustRelationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trust Recommendation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trust.instance.impl.TrustRecommendationImpl#getTrustRelationship <em>Trust Relationship</em>}</li>
 *   <li>{@link trust.instance.impl.TrustRecommendationImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link trust.instance.impl.TrustRecommendationImpl#getRecommender <em>Recommender</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrustRecommendationImpl extends ElementImpl implements TrustRecommendation {
  /**
   * The cached value of the '{@link #getTrustRelationship() <em>Trust Relationship</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrustRelationship()
   * @generated
   * @ordered
   */
  protected TrustRelationship trustRelationship;

  /**
   * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimestamp()
   * @generated
   * @ordered
   */
  protected Timestamp timestamp;

  /**
   * The cached value of the '{@link #getRecommender() <em>Recommender</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecommender()
   * @generated
   * @ordered
   */
  protected AbstractIdentity recommender;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TrustRecommendationImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return InstancePackage.Literals.TRUST_RECOMMENDATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrustRelationship getTrustRelationship() {
    return trustRelationship;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTrustRelationship(TrustRelationship newTrustRelationship, NotificationChain msgs) {
    TrustRelationship oldTrustRelationship = trustRelationship;
    trustRelationship = newTrustRelationship;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.TRUST_RECOMMENDATION__TRUST_RELATIONSHIP, oldTrustRelationship, newTrustRelationship);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrustRelationship(TrustRelationship newTrustRelationship) {
    if (newTrustRelationship != trustRelationship) {
      NotificationChain msgs = null;
      if (trustRelationship != null)
        msgs = ((InternalEObject)trustRelationship).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstancePackage.TRUST_RECOMMENDATION__TRUST_RELATIONSHIP, null, msgs);
      if (newTrustRelationship != null)
        msgs = ((InternalEObject)newTrustRelationship).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstancePackage.TRUST_RECOMMENDATION__TRUST_RELATIONSHIP, null, msgs);
      msgs = basicSetTrustRelationship(newTrustRelationship, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.TRUST_RECOMMENDATION__TRUST_RELATIONSHIP, newTrustRelationship, newTrustRelationship));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Timestamp getTimestamp() {
    return timestamp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTimestamp(Timestamp newTimestamp, NotificationChain msgs) {
    Timestamp oldTimestamp = timestamp;
    timestamp = newTimestamp;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.TRUST_RECOMMENDATION__TIMESTAMP, oldTimestamp, newTimestamp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTimestamp(Timestamp newTimestamp) {
    if (newTimestamp != timestamp) {
      NotificationChain msgs = null;
      if (timestamp != null)
        msgs = ((InternalEObject)timestamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstancePackage.TRUST_RECOMMENDATION__TIMESTAMP, null, msgs);
      if (newTimestamp != null)
        msgs = ((InternalEObject)newTimestamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstancePackage.TRUST_RECOMMENDATION__TIMESTAMP, null, msgs);
      msgs = basicSetTimestamp(newTimestamp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.TRUST_RECOMMENDATION__TIMESTAMP, newTimestamp, newTimestamp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractIdentity getRecommender() {
    return recommender;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRecommender(AbstractIdentity newRecommender, NotificationChain msgs) {
    AbstractIdentity oldRecommender = recommender;
    recommender = newRecommender;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.TRUST_RECOMMENDATION__RECOMMENDER, oldRecommender, newRecommender);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecommender(AbstractIdentity newRecommender) {
    if (newRecommender != recommender) {
      NotificationChain msgs = null;
      if (recommender != null)
        msgs = ((InternalEObject)recommender).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstancePackage.TRUST_RECOMMENDATION__RECOMMENDER, null, msgs);
      if (newRecommender != null)
        msgs = ((InternalEObject)newRecommender).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstancePackage.TRUST_RECOMMENDATION__RECOMMENDER, null, msgs);
      msgs = basicSetRecommender(newRecommender, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.TRUST_RECOMMENDATION__RECOMMENDER, newRecommender, newRecommender));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case InstancePackage.TRUST_RECOMMENDATION__TRUST_RELATIONSHIP:
        return basicSetTrustRelationship(null, msgs);
      case InstancePackage.TRUST_RECOMMENDATION__TIMESTAMP:
        return basicSetTimestamp(null, msgs);
      case InstancePackage.TRUST_RECOMMENDATION__RECOMMENDER:
        return basicSetRecommender(null, msgs);
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
      case InstancePackage.TRUST_RECOMMENDATION__TRUST_RELATIONSHIP:
        return getTrustRelationship();
      case InstancePackage.TRUST_RECOMMENDATION__TIMESTAMP:
        return getTimestamp();
      case InstancePackage.TRUST_RECOMMENDATION__RECOMMENDER:
        return getRecommender();
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
      case InstancePackage.TRUST_RECOMMENDATION__TRUST_RELATIONSHIP:
        setTrustRelationship((TrustRelationship)newValue);
        return;
      case InstancePackage.TRUST_RECOMMENDATION__TIMESTAMP:
        setTimestamp((Timestamp)newValue);
        return;
      case InstancePackage.TRUST_RECOMMENDATION__RECOMMENDER:
        setRecommender((AbstractIdentity)newValue);
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
      case InstancePackage.TRUST_RECOMMENDATION__TRUST_RELATIONSHIP:
        setTrustRelationship((TrustRelationship)null);
        return;
      case InstancePackage.TRUST_RECOMMENDATION__TIMESTAMP:
        setTimestamp((Timestamp)null);
        return;
      case InstancePackage.TRUST_RECOMMENDATION__RECOMMENDER:
        setRecommender((AbstractIdentity)null);
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
      case InstancePackage.TRUST_RECOMMENDATION__TRUST_RELATIONSHIP:
        return trustRelationship != null;
      case InstancePackage.TRUST_RECOMMENDATION__TIMESTAMP:
        return timestamp != null;
      case InstancePackage.TRUST_RECOMMENDATION__RECOMMENDER:
        return recommender != null;
    }
    return super.eIsSet(featureID);
  }

} //TrustRecommendationImpl
