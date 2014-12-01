/**
 */
package trust.instance.impl;

import models.impl.ElementImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import trust.instance.InstancePackage;
import trust.instance.TrustOperator;
import trust.pattern.TrustPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trust Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trust.instance.impl.TrustOperatorImpl#getTrustPattern <em>Trust Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrustOperatorImpl extends ElementImpl implements TrustOperator {
  /**
   * The cached value of the '{@link #getTrustPattern() <em>Trust Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrustPattern()
   * @generated
   * @ordered
   */
  protected TrustPattern trustPattern;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TrustOperatorImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return InstancePackage.Literals.TRUST_OPERATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrustPattern getTrustPattern() {
    return trustPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTrustPattern(TrustPattern newTrustPattern, NotificationChain msgs) {
    TrustPattern oldTrustPattern = trustPattern;
    trustPattern = newTrustPattern;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.TRUST_OPERATOR__TRUST_PATTERN, oldTrustPattern, newTrustPattern);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrustPattern(TrustPattern newTrustPattern) {
    if (newTrustPattern != trustPattern) {
      NotificationChain msgs = null;
      if (trustPattern != null)
        msgs = ((InternalEObject)trustPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstancePackage.TRUST_OPERATOR__TRUST_PATTERN, null, msgs);
      if (newTrustPattern != null)
        msgs = ((InternalEObject)newTrustPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstancePackage.TRUST_OPERATOR__TRUST_PATTERN, null, msgs);
      msgs = basicSetTrustPattern(newTrustPattern, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.TRUST_OPERATOR__TRUST_PATTERN, newTrustPattern, newTrustPattern));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case InstancePackage.TRUST_OPERATOR__TRUST_PATTERN:
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
      case InstancePackage.TRUST_OPERATOR__TRUST_PATTERN:
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
      case InstancePackage.TRUST_OPERATOR__TRUST_PATTERN:
        setTrustPattern((TrustPattern)newValue);
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
      case InstancePackage.TRUST_OPERATOR__TRUST_PATTERN:
        setTrustPattern((TrustPattern)null);
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
      case InstancePackage.TRUST_OPERATOR__TRUST_PATTERN:
        return trustPattern != null;
    }
    return super.eIsSet(featureID);
  }

} //TrustOperatorImpl
