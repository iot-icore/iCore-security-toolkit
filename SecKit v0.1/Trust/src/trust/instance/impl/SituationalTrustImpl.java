/**
 */
package trust.instance.impl;

import context.pattern.ContextSituationPattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import trust.instance.InstancePackage;
import trust.instance.SituationalTrust;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Situational Trust</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trust.instance.impl.SituationalTrustImpl#getContextSituation <em>Context Situation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SituationalTrustImpl extends TrusteeScopeImpl implements SituationalTrust {
  /**
   * The cached value of the '{@link #getContextSituation() <em>Context Situation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContextSituation()
   * @generated
   * @ordered
   */
  protected ContextSituationPattern contextSituation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SituationalTrustImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return InstancePackage.Literals.SITUATIONAL_TRUST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextSituationPattern getContextSituation() {
    return contextSituation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContextSituation(ContextSituationPattern newContextSituation, NotificationChain msgs) {
    ContextSituationPattern oldContextSituation = contextSituation;
    contextSituation = newContextSituation;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.SITUATIONAL_TRUST__CONTEXT_SITUATION, oldContextSituation, newContextSituation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContextSituation(ContextSituationPattern newContextSituation) {
    if (newContextSituation != contextSituation) {
      NotificationChain msgs = null;
      if (contextSituation != null)
        msgs = ((InternalEObject)contextSituation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstancePackage.SITUATIONAL_TRUST__CONTEXT_SITUATION, null, msgs);
      if (newContextSituation != null)
        msgs = ((InternalEObject)newContextSituation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstancePackage.SITUATIONAL_TRUST__CONTEXT_SITUATION, null, msgs);
      msgs = basicSetContextSituation(newContextSituation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.SITUATIONAL_TRUST__CONTEXT_SITUATION, newContextSituation, newContextSituation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case InstancePackage.SITUATIONAL_TRUST__CONTEXT_SITUATION:
        return basicSetContextSituation(null, msgs);
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
      case InstancePackage.SITUATIONAL_TRUST__CONTEXT_SITUATION:
        return getContextSituation();
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
      case InstancePackage.SITUATIONAL_TRUST__CONTEXT_SITUATION:
        setContextSituation((ContextSituationPattern)newValue);
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
      case InstancePackage.SITUATIONAL_TRUST__CONTEXT_SITUATION:
        setContextSituation((ContextSituationPattern)null);
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
      case InstancePackage.SITUATIONAL_TRUST__CONTEXT_SITUATION:
        return contextSituation != null;
    }
    return super.eIsSet(featureID);
  }

} //SituationalTrustImpl
