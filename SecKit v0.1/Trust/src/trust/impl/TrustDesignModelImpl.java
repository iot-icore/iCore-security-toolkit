/**
 */
package trust.impl;

import java.util.Collection;

import models.impl.ModelImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import trust.TrustDesignModel;
import trust.TrustPackage;

import trust.instance.TrustAspect;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Design Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trust.impl.TrustDesignModelImpl#getTrustAspects <em>Trust Aspects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrustDesignModelImpl extends ModelImpl implements TrustDesignModel {
  /**
   * The cached value of the '{@link #getTrustAspects() <em>Trust Aspects</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrustAspects()
   * @generated
   * @ordered
   */
  protected EList<TrustAspect> trustAspects;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TrustDesignModelImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return TrustPackage.Literals.TRUST_DESIGN_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TrustAspect> getTrustAspects() {
    if (trustAspects == null) {
      trustAspects = new EObjectContainmentEList<TrustAspect>(TrustAspect.class, this, TrustPackage.TRUST_DESIGN_MODEL__TRUST_ASPECTS);
    }
    return trustAspects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case TrustPackage.TRUST_DESIGN_MODEL__TRUST_ASPECTS:
        return ((InternalEList<?>)getTrustAspects()).basicRemove(otherEnd, msgs);
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
      case TrustPackage.TRUST_DESIGN_MODEL__TRUST_ASPECTS:
        return getTrustAspects();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case TrustPackage.TRUST_DESIGN_MODEL__TRUST_ASPECTS:
        getTrustAspects().clear();
        getTrustAspects().addAll((Collection<? extends TrustAspect>)newValue);
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
      case TrustPackage.TRUST_DESIGN_MODEL__TRUST_ASPECTS:
        getTrustAspects().clear();
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
      case TrustPackage.TRUST_DESIGN_MODEL__TRUST_ASPECTS:
        return trustAspects != null && !trustAspects.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TrustDesignModelImpl
