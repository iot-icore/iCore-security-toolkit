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
import trust.pattern.PersonalScopePattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Personal Scope Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trust.pattern.impl.PersonalScopePatternImpl#getTrustee <em>Trustee</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonalScopePatternImpl extends SituationalScopePatternImpl implements PersonalScopePattern {
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
  protected PersonalScopePatternImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return PatternPackage.Literals.PERSONAL_SCOPE_PATTERN;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternPackage.PERSONAL_SCOPE_PATTERN__TRUSTEE, oldTrustee, newTrustee);
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
        msgs = ((InternalEObject)trustee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternPackage.PERSONAL_SCOPE_PATTERN__TRUSTEE, null, msgs);
      if (newTrustee != null)
        msgs = ((InternalEObject)newTrustee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternPackage.PERSONAL_SCOPE_PATTERN__TRUSTEE, null, msgs);
      msgs = basicSetTrustee(newTrustee, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.PERSONAL_SCOPE_PATTERN__TRUSTEE, newTrustee, newTrustee));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case PatternPackage.PERSONAL_SCOPE_PATTERN__TRUSTEE:
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
      case PatternPackage.PERSONAL_SCOPE_PATTERN__TRUSTEE:
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
      case PatternPackage.PERSONAL_SCOPE_PATTERN__TRUSTEE:
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
      case PatternPackage.PERSONAL_SCOPE_PATTERN__TRUSTEE:
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
      case PatternPackage.PERSONAL_SCOPE_PATTERN__TRUSTEE:
        return trustee != null;
    }
    return super.eIsSet(featureID);
  }

} //PersonalScopePatternImpl
