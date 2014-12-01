/**
 */
package trust.instance.impl;

import models.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import time.Timestamp;

import trust.instance.Evidence;
import trust.instance.InstancePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evidence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trust.instance.impl.EvidenceImpl#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EvidenceImpl extends ElementImpl implements Evidence {
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EvidenceImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return InstancePackage.Literals.EVIDENCE;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.EVIDENCE__TIMESTAMP, oldTimestamp, newTimestamp);
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
        msgs = ((InternalEObject)timestamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstancePackage.EVIDENCE__TIMESTAMP, null, msgs);
      if (newTimestamp != null)
        msgs = ((InternalEObject)newTimestamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstancePackage.EVIDENCE__TIMESTAMP, null, msgs);
      msgs = basicSetTimestamp(newTimestamp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.EVIDENCE__TIMESTAMP, newTimestamp, newTimestamp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case InstancePackage.EVIDENCE__TIMESTAMP:
        return basicSetTimestamp(null, msgs);
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
      case InstancePackage.EVIDENCE__TIMESTAMP:
        return getTimestamp();
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
      case InstancePackage.EVIDENCE__TIMESTAMP:
        setTimestamp((Timestamp)newValue);
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
      case InstancePackage.EVIDENCE__TIMESTAMP:
        setTimestamp((Timestamp)null);
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
      case InstancePackage.EVIDENCE__TIMESTAMP:
        return timestamp != null;
    }
    return super.eIsSet(featureID);
  }

} //EvidenceImpl
