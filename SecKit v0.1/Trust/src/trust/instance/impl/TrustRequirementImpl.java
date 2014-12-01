/**
 */
package trust.instance.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import trust.instance.InstancePackage;
import trust.instance.TrustRelationship;
import trust.instance.TrustRequirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trust Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trust.instance.impl.TrustRequirementImpl#getTrustBelief <em>Trust Belief</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrustRequirementImpl extends RequirementImpl implements TrustRequirement {
  /**
   * The cached value of the '{@link #getTrustBelief() <em>Trust Belief</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrustBelief()
   * @generated
   * @ordered
   */
  protected TrustRelationship trustBelief;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TrustRequirementImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return InstancePackage.Literals.TRUST_REQUIREMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrustRelationship getTrustBelief() {
    return trustBelief;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTrustBelief(TrustRelationship newTrustBelief, NotificationChain msgs) {
    TrustRelationship oldTrustBelief = trustBelief;
    trustBelief = newTrustBelief;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.TRUST_REQUIREMENT__TRUST_BELIEF, oldTrustBelief, newTrustBelief);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrustBelief(TrustRelationship newTrustBelief) {
    if (newTrustBelief != trustBelief) {
      NotificationChain msgs = null;
      if (trustBelief != null)
        msgs = ((InternalEObject)trustBelief).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstancePackage.TRUST_REQUIREMENT__TRUST_BELIEF, null, msgs);
      if (newTrustBelief != null)
        msgs = ((InternalEObject)newTrustBelief).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstancePackage.TRUST_REQUIREMENT__TRUST_BELIEF, null, msgs);
      msgs = basicSetTrustBelief(newTrustBelief, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.TRUST_REQUIREMENT__TRUST_BELIEF, newTrustBelief, newTrustBelief));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case InstancePackage.TRUST_REQUIREMENT__TRUST_BELIEF:
        return basicSetTrustBelief(null, msgs);
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
      case InstancePackage.TRUST_REQUIREMENT__TRUST_BELIEF:
        return getTrustBelief();
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
      case InstancePackage.TRUST_REQUIREMENT__TRUST_BELIEF:
        setTrustBelief((TrustRelationship)newValue);
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
      case InstancePackage.TRUST_REQUIREMENT__TRUST_BELIEF:
        setTrustBelief((TrustRelationship)null);
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
      case InstancePackage.TRUST_REQUIREMENT__TRUST_BELIEF:
        return trustBelief != null;
    }
    return super.eIsSet(featureID);
  }

} //TrustRequirementImpl
