/**
 */
package trust.instance.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import trust.instance.Evidence;
import trust.instance.ExperienceTrust;
import trust.instance.InstancePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Experience Trust</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trust.instance.impl.ExperienceTrustImpl#getEvidence <em>Evidence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExperienceTrustImpl extends DirectTrustImpl implements ExperienceTrust {
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
  protected ExperienceTrustImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return InstancePackage.Literals.EXPERIENCE_TRUST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Evidence> getEvidence() {
    if (evidence == null) {
      evidence = new EObjectContainmentEList<Evidence>(Evidence.class, this, InstancePackage.EXPERIENCE_TRUST__EVIDENCE);
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
      case InstancePackage.EXPERIENCE_TRUST__EVIDENCE:
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
      case InstancePackage.EXPERIENCE_TRUST__EVIDENCE:
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
      case InstancePackage.EXPERIENCE_TRUST__EVIDENCE:
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
      case InstancePackage.EXPERIENCE_TRUST__EVIDENCE:
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
      case InstancePackage.EXPERIENCE_TRUST__EVIDENCE:
        return evidence != null && !evidence.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExperienceTrustImpl
