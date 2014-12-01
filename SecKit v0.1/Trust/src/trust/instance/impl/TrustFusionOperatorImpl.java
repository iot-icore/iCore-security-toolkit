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

import trust.instance.InstancePackage;
import trust.instance.TrustFusionOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trust Fusion Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trust.instance.impl.TrustFusionOperatorImpl#getOperands <em>Operands</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TrustFusionOperatorImpl extends TrustOperatorImpl implements TrustFusionOperator {
  /**
   * The cached value of the '{@link #getOperands() <em>Operands</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperands()
   * @generated
   * @ordered
   */
  protected EList<TrustFusionOperator> operands;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TrustFusionOperatorImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return InstancePackage.Literals.TRUST_FUSION_OPERATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TrustFusionOperator> getOperands() {
    if (operands == null) {
      operands = new EObjectContainmentEList<TrustFusionOperator>(TrustFusionOperator.class, this, InstancePackage.TRUST_FUSION_OPERATOR__OPERANDS);
    }
    return operands;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case InstancePackage.TRUST_FUSION_OPERATOR__OPERANDS:
        return ((InternalEList<?>)getOperands()).basicRemove(otherEnd, msgs);
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
      case InstancePackage.TRUST_FUSION_OPERATOR__OPERANDS:
        return getOperands();
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
      case InstancePackage.TRUST_FUSION_OPERATOR__OPERANDS:
        getOperands().clear();
        getOperands().addAll((Collection<? extends TrustFusionOperator>)newValue);
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
      case InstancePackage.TRUST_FUSION_OPERATOR__OPERANDS:
        getOperands().clear();
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
      case InstancePackage.TRUST_FUSION_OPERATOR__OPERANDS:
        return operands != null && !operands.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TrustFusionOperatorImpl
