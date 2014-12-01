/**
 */
package trust.action.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rule.action.impl.ExecuteImpl;

import trust.action.ActionPackage;
import trust.action.TrustManagementAction;

import trust.pattern.TrustRelationshipPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trust Management Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trust.action.impl.TrustManagementActionImpl#getTrustPattern <em>Trust Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TrustManagementActionImpl extends ExecuteImpl implements TrustManagementAction {
  /**
   * The cached value of the '{@link #getTrustPattern() <em>Trust Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrustPattern()
   * @generated
   * @ordered
   */
  protected TrustRelationshipPattern trustPattern;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TrustManagementActionImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return ActionPackage.Literals.TRUST_MANAGEMENT_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrustRelationshipPattern getTrustPattern() {
    return trustPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTrustPattern(TrustRelationshipPattern newTrustPattern, NotificationChain msgs) {
    TrustRelationshipPattern oldTrustPattern = trustPattern;
    trustPattern = newTrustPattern;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActionPackage.TRUST_MANAGEMENT_ACTION__TRUST_PATTERN, oldTrustPattern, newTrustPattern);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrustPattern(TrustRelationshipPattern newTrustPattern) {
    if (newTrustPattern != trustPattern) {
      NotificationChain msgs = null;
      if (trustPattern != null)
        msgs = ((InternalEObject)trustPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActionPackage.TRUST_MANAGEMENT_ACTION__TRUST_PATTERN, null, msgs);
      if (newTrustPattern != null)
        msgs = ((InternalEObject)newTrustPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActionPackage.TRUST_MANAGEMENT_ACTION__TRUST_PATTERN, null, msgs);
      msgs = basicSetTrustPattern(newTrustPattern, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ActionPackage.TRUST_MANAGEMENT_ACTION__TRUST_PATTERN, newTrustPattern, newTrustPattern));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case ActionPackage.TRUST_MANAGEMENT_ACTION__TRUST_PATTERN:
        return basicSetTrustPattern(null, msgs);
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
      case ActionPackage.TRUST_MANAGEMENT_ACTION__TRUST_PATTERN:
        return getTrustPattern();
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
      case ActionPackage.TRUST_MANAGEMENT_ACTION__TRUST_PATTERN:
        setTrustPattern((TrustRelationshipPattern)newValue);
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
      case ActionPackage.TRUST_MANAGEMENT_ACTION__TRUST_PATTERN:
        setTrustPattern((TrustRelationshipPattern)null);
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
      case ActionPackage.TRUST_MANAGEMENT_ACTION__TRUST_PATTERN:
        return trustPattern != null;
    }
    return super.eIsSet(featureID);
  }

} //TrustManagementActionImpl
