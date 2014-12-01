/**
 */
package trust.pattern.impl;

import identity.pattern.IdentityPattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import time.TimeInterval;

import trust.instance.TrustAspect;

import trust.pattern.PatternPackage;
import trust.pattern.TrustDegreePattern;
import trust.pattern.TrustRelationshipPattern;
import trust.pattern.TrusteeScopePattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trust Relationship Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trust.pattern.impl.TrustRelationshipPatternImpl#getAspect <em>Aspect</em>}</li>
 *   <li>{@link trust.pattern.impl.TrustRelationshipPatternImpl#getDegree <em>Degree</em>}</li>
 *   <li>{@link trust.pattern.impl.TrustRelationshipPatternImpl#getTrustor <em>Trustor</em>}</li>
 *   <li>{@link trust.pattern.impl.TrustRelationshipPatternImpl#getTimeInterval <em>Time Interval</em>}</li>
 *   <li>{@link trust.pattern.impl.TrustRelationshipPatternImpl#getTrusteeScope <em>Trustee Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TrustRelationshipPatternImpl extends TrustPatternImpl implements TrustRelationshipPattern {
  /**
   * The cached value of the '{@link #getAspect() <em>Aspect</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAspect()
   * @generated
   * @ordered
   */
  protected TrustAspect aspect;

  /**
   * The cached value of the '{@link #getDegree() <em>Degree</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDegree()
   * @generated
   * @ordered
   */
  protected TrustDegreePattern degree;

  /**
   * The cached value of the '{@link #getTrustor() <em>Trustor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrustor()
   * @generated
   * @ordered
   */
  protected IdentityPattern trustor;

  /**
   * The cached value of the '{@link #getTimeInterval() <em>Time Interval</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeInterval()
   * @generated
   * @ordered
   */
  protected TimeInterval timeInterval;

  /**
   * The cached value of the '{@link #getTrusteeScope() <em>Trustee Scope</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrusteeScope()
   * @generated
   * @ordered
   */
  protected TrusteeScopePattern trusteeScope;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TrustRelationshipPatternImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return PatternPackage.Literals.TRUST_RELATIONSHIP_PATTERN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrustAspect getAspect() {
    if (aspect != null && aspect.eIsProxy()) {
      InternalEObject oldAspect = (InternalEObject)aspect;
      aspect = (TrustAspect)eResolveProxy(oldAspect);
      if (aspect != oldAspect) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.TRUST_RELATIONSHIP_PATTERN__ASPECT, oldAspect, aspect));
      }
    }
    return aspect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrustAspect basicGetAspect() {
    return aspect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAspect(TrustAspect newAspect) {
    TrustAspect oldAspect = aspect;
    aspect = newAspect;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.TRUST_RELATIONSHIP_PATTERN__ASPECT, oldAspect, aspect));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrustDegreePattern getDegree() {
    return degree;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDegree(TrustDegreePattern newDegree, NotificationChain msgs) {
    TrustDegreePattern oldDegree = degree;
    degree = newDegree;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternPackage.TRUST_RELATIONSHIP_PATTERN__DEGREE, oldDegree, newDegree);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDegree(TrustDegreePattern newDegree) {
    if (newDegree != degree) {
      NotificationChain msgs = null;
      if (degree != null)
        msgs = ((InternalEObject)degree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternPackage.TRUST_RELATIONSHIP_PATTERN__DEGREE, null, msgs);
      if (newDegree != null)
        msgs = ((InternalEObject)newDegree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternPackage.TRUST_RELATIONSHIP_PATTERN__DEGREE, null, msgs);
      msgs = basicSetDegree(newDegree, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.TRUST_RELATIONSHIP_PATTERN__DEGREE, newDegree, newDegree));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdentityPattern getTrustor() {
    return trustor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTrustor(IdentityPattern newTrustor, NotificationChain msgs) {
    IdentityPattern oldTrustor = trustor;
    trustor = newTrustor;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternPackage.TRUST_RELATIONSHIP_PATTERN__TRUSTOR, oldTrustor, newTrustor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrustor(IdentityPattern newTrustor) {
    if (newTrustor != trustor) {
      NotificationChain msgs = null;
      if (trustor != null)
        msgs = ((InternalEObject)trustor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternPackage.TRUST_RELATIONSHIP_PATTERN__TRUSTOR, null, msgs);
      if (newTrustor != null)
        msgs = ((InternalEObject)newTrustor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternPackage.TRUST_RELATIONSHIP_PATTERN__TRUSTOR, null, msgs);
      msgs = basicSetTrustor(newTrustor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.TRUST_RELATIONSHIP_PATTERN__TRUSTOR, newTrustor, newTrustor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeInterval getTimeInterval() {
    return timeInterval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTimeInterval(TimeInterval newTimeInterval, NotificationChain msgs) {
    TimeInterval oldTimeInterval = timeInterval;
    timeInterval = newTimeInterval;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternPackage.TRUST_RELATIONSHIP_PATTERN__TIME_INTERVAL, oldTimeInterval, newTimeInterval);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTimeInterval(TimeInterval newTimeInterval) {
    if (newTimeInterval != timeInterval) {
      NotificationChain msgs = null;
      if (timeInterval != null)
        msgs = ((InternalEObject)timeInterval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternPackage.TRUST_RELATIONSHIP_PATTERN__TIME_INTERVAL, null, msgs);
      if (newTimeInterval != null)
        msgs = ((InternalEObject)newTimeInterval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternPackage.TRUST_RELATIONSHIP_PATTERN__TIME_INTERVAL, null, msgs);
      msgs = basicSetTimeInterval(newTimeInterval, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.TRUST_RELATIONSHIP_PATTERN__TIME_INTERVAL, newTimeInterval, newTimeInterval));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrusteeScopePattern getTrusteeScope() {
    return trusteeScope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTrusteeScope(TrusteeScopePattern newTrusteeScope, NotificationChain msgs) {
    TrusteeScopePattern oldTrusteeScope = trusteeScope;
    trusteeScope = newTrusteeScope;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternPackage.TRUST_RELATIONSHIP_PATTERN__TRUSTEE_SCOPE, oldTrusteeScope, newTrusteeScope);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrusteeScope(TrusteeScopePattern newTrusteeScope) {
    if (newTrusteeScope != trusteeScope) {
      NotificationChain msgs = null;
      if (trusteeScope != null)
        msgs = ((InternalEObject)trusteeScope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternPackage.TRUST_RELATIONSHIP_PATTERN__TRUSTEE_SCOPE, null, msgs);
      if (newTrusteeScope != null)
        msgs = ((InternalEObject)newTrusteeScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternPackage.TRUST_RELATIONSHIP_PATTERN__TRUSTEE_SCOPE, null, msgs);
      msgs = basicSetTrusteeScope(newTrusteeScope, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.TRUST_RELATIONSHIP_PATTERN__TRUSTEE_SCOPE, newTrusteeScope, newTrusteeScope));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case PatternPackage.TRUST_RELATIONSHIP_PATTERN__DEGREE:
        return basicSetDegree(null, msgs);
      case PatternPackage.TRUST_RELATIONSHIP_PATTERN__TRUSTOR:
        return basicSetTrustor(null, msgs);
      case PatternPackage.TRUST_RELATIONSHIP_PATTERN__TIME_INTERVAL:
        return basicSetTimeInterval(null, msgs);
      case PatternPackage.TRUST_RELATIONSHIP_PATTERN__TRUSTEE_SCOPE:
        return basicSetTrusteeScope(null, msgs);
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
      case PatternPackage.TRUST_RELATIONSHIP_PATTERN__ASPECT:
        if (resolve) return getAspect();
        return basicGetAspect();
      case PatternPackage.TRUST_RELATIONSHIP_PATTERN__DEGREE:
        return getDegree();
      case PatternPackage.TRUST_RELATIONSHIP_PATTERN__TRUSTOR:
        return getTrustor();
      case PatternPackage.TRUST_RELATIONSHIP_PATTERN__TIME_INTERVAL:
        return getTimeInterval();
      case PatternPackage.TRUST_RELATIONSHIP_PATTERN__TRUSTEE_SCOPE:
        return getTrusteeScope();
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
      case PatternPackage.TRUST_RELATIONSHIP_PATTERN__ASPECT:
        setAspect((TrustAspect)newValue);
        return;
      case PatternPackage.TRUST_RELATIONSHIP_PATTERN__DEGREE:
        setDegree((TrustDegreePattern)newValue);
        return;
      case PatternPackage.TRUST_RELATIONSHIP_PATTERN__TRUSTOR:
        setTrustor((IdentityPattern)newValue);
        return;
      case PatternPackage.TRUST_RELATIONSHIP_PATTERN__TIME_INTERVAL:
        setTimeInterval((TimeInterval)newValue);
        return;
      case PatternPackage.TRUST_RELATIONSHIP_PATTERN__TRUSTEE_SCOPE:
        setTrusteeScope((TrusteeScopePattern)newValue);
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
      case PatternPackage.TRUST_RELATIONSHIP_PATTERN__ASPECT:
        setAspect((TrustAspect)null);
        return;
      case PatternPackage.TRUST_RELATIONSHIP_PATTERN__DEGREE:
        setDegree((TrustDegreePattern)null);
        return;
      case PatternPackage.TRUST_RELATIONSHIP_PATTERN__TRUSTOR:
        setTrustor((IdentityPattern)null);
        return;
      case PatternPackage.TRUST_RELATIONSHIP_PATTERN__TIME_INTERVAL:
        setTimeInterval((TimeInterval)null);
        return;
      case PatternPackage.TRUST_RELATIONSHIP_PATTERN__TRUSTEE_SCOPE:
        setTrusteeScope((TrusteeScopePattern)null);
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
      case PatternPackage.TRUST_RELATIONSHIP_PATTERN__ASPECT:
        return aspect != null;
      case PatternPackage.TRUST_RELATIONSHIP_PATTERN__DEGREE:
        return degree != null;
      case PatternPackage.TRUST_RELATIONSHIP_PATTERN__TRUSTOR:
        return trustor != null;
      case PatternPackage.TRUST_RELATIONSHIP_PATTERN__TIME_INTERVAL:
        return timeInterval != null;
      case PatternPackage.TRUST_RELATIONSHIP_PATTERN__TRUSTEE_SCOPE:
        return trusteeScope != null;
    }
    return super.eIsSet(featureID);
  }

} //TrustRelationshipPatternImpl
