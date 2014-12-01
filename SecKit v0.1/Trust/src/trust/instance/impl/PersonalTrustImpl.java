/**
 */
package trust.instance.impl;

import identity.pattern.IdentityPattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import trust.instance.InstancePackage;
import trust.instance.PersonalTrust;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Personal Trust</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trust.instance.impl.PersonalTrustImpl#getTrustee <em>Trustee</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonalTrustImpl extends SituationalTrustImpl implements PersonalTrust {
  /**
   * The cached value of the '{@link #getTrustee() <em>Trustee</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrustee()
   * @generated
   * @ordered
   */
  protected IdentityPattern trustee;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PersonalTrustImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return InstancePackage.Literals.PERSONAL_TRUST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdentityPattern getTrustee() {
    return trustee;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTrustee(IdentityPattern newTrustee, NotificationChain msgs) {
    IdentityPattern oldTrustee = trustee;
    trustee = newTrustee;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.PERSONAL_TRUST__TRUSTEE, oldTrustee, newTrustee);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrustee(IdentityPattern newTrustee) {
    if (newTrustee != trustee) {
      NotificationChain msgs = null;
      if (trustee != null)
        msgs = ((InternalEObject)trustee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstancePackage.PERSONAL_TRUST__TRUSTEE, null, msgs);
      if (newTrustee != null)
        msgs = ((InternalEObject)newTrustee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstancePackage.PERSONAL_TRUST__TRUSTEE, null, msgs);
      msgs = basicSetTrustee(newTrustee, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.PERSONAL_TRUST__TRUSTEE, newTrustee, newTrustee));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case InstancePackage.PERSONAL_TRUST__TRUSTEE:
        return basicSetTrustee(null, msgs);
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
      case InstancePackage.PERSONAL_TRUST__TRUSTEE:
        return getTrustee();
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
      case InstancePackage.PERSONAL_TRUST__TRUSTEE:
        setTrustee((IdentityPattern)newValue);
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
      case InstancePackage.PERSONAL_TRUST__TRUSTEE:
        setTrustee((IdentityPattern)null);
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
      case InstancePackage.PERSONAL_TRUST__TRUSTEE:
        return trustee != null;
    }
    return super.eIsSet(featureID);
  }

} //PersonalTrustImpl
