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

import trust.TrustPackage;
import trust.TrustRuntimeModel;

import trust.instance.Evidence;
import trust.instance.TrustRecommendation;
import trust.instance.TrustRelationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runtime Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trust.impl.TrustRuntimeModelImpl#getTrustRecommendations <em>Trust Recommendations</em>}</li>
 *   <li>{@link trust.impl.TrustRuntimeModelImpl#getTrustRelationships <em>Trust Relationships</em>}</li>
 *   <li>{@link trust.impl.TrustRuntimeModelImpl#getEvidence <em>Evidence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrustRuntimeModelImpl extends ModelImpl implements TrustRuntimeModel {
  /**
   * The cached value of the '{@link #getTrustRecommendations() <em>Trust Recommendations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrustRecommendations()
   * @generated
   * @ordered
   */
  protected EList<TrustRecommendation> trustRecommendations;

  /**
   * The cached value of the '{@link #getTrustRelationships() <em>Trust Relationships</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrustRelationships()
   * @generated
   * @ordered
   */
  protected EList<TrustRelationship> trustRelationships;

  /**
   * The cached value of the '{@link #getEvidence() <em>Evidence</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvidence()
   * @generated
   * @ordered
   */
  protected EList<Evidence> evidence;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TrustRuntimeModelImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return TrustPackage.Literals.TRUST_RUNTIME_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TrustRecommendation> getTrustRecommendations() {
    if (trustRecommendations == null) {
      trustRecommendations = new EObjectContainmentEList<TrustRecommendation>(TrustRecommendation.class, this, TrustPackage.TRUST_RUNTIME_MODEL__TRUST_RECOMMENDATIONS);
    }
    return trustRecommendations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TrustRelationship> getTrustRelationships() {
    if (trustRelationships == null) {
      trustRelationships = new EObjectContainmentEList<TrustRelationship>(TrustRelationship.class, this, TrustPackage.TRUST_RUNTIME_MODEL__TRUST_RELATIONSHIPS);
    }
    return trustRelationships;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Evidence> getEvidence() {
    if (evidence == null) {
      evidence = new EObjectContainmentEList<Evidence>(Evidence.class, this, TrustPackage.TRUST_RUNTIME_MODEL__EVIDENCE);
    }
    return evidence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case TrustPackage.TRUST_RUNTIME_MODEL__TRUST_RECOMMENDATIONS:
        return ((InternalEList<?>)getTrustRecommendations()).basicRemove(otherEnd, msgs);
      case TrustPackage.TRUST_RUNTIME_MODEL__TRUST_RELATIONSHIPS:
        return ((InternalEList<?>)getTrustRelationships()).basicRemove(otherEnd, msgs);
      case TrustPackage.TRUST_RUNTIME_MODEL__EVIDENCE:
        return ((InternalEList<?>)getEvidence()).basicRemove(otherEnd, msgs);
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
      case TrustPackage.TRUST_RUNTIME_MODEL__TRUST_RECOMMENDATIONS:
        return getTrustRecommendations();
      case TrustPackage.TRUST_RUNTIME_MODEL__TRUST_RELATIONSHIPS:
        return getTrustRelationships();
      case TrustPackage.TRUST_RUNTIME_MODEL__EVIDENCE:
        return getEvidence();
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
      case TrustPackage.TRUST_RUNTIME_MODEL__TRUST_RECOMMENDATIONS:
        getTrustRecommendations().clear();
        getTrustRecommendations().addAll((Collection<? extends TrustRecommendation>)newValue);
        return;
      case TrustPackage.TRUST_RUNTIME_MODEL__TRUST_RELATIONSHIPS:
        getTrustRelationships().clear();
        getTrustRelationships().addAll((Collection<? extends TrustRelationship>)newValue);
        return;
      case TrustPackage.TRUST_RUNTIME_MODEL__EVIDENCE:
        getEvidence().clear();
        getEvidence().addAll((Collection<? extends Evidence>)newValue);
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
      case TrustPackage.TRUST_RUNTIME_MODEL__TRUST_RECOMMENDATIONS:
        getTrustRecommendations().clear();
        return;
      case TrustPackage.TRUST_RUNTIME_MODEL__TRUST_RELATIONSHIPS:
        getTrustRelationships().clear();
        return;
      case TrustPackage.TRUST_RUNTIME_MODEL__EVIDENCE:
        getEvidence().clear();
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
      case TrustPackage.TRUST_RUNTIME_MODEL__TRUST_RECOMMENDATIONS:
        return trustRecommendations != null && !trustRecommendations.isEmpty();
      case TrustPackage.TRUST_RUNTIME_MODEL__TRUST_RELATIONSHIPS:
        return trustRelationships != null && !trustRelationships.isEmpty();
      case TrustPackage.TRUST_RUNTIME_MODEL__EVIDENCE:
        return evidence != null && !evidence.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TrustRuntimeModelImpl
