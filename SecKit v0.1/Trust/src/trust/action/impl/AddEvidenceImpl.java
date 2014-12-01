/**
 */
package trust.action.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import trust.action.ActionPackage;
import trust.action.AddEvidence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Evidence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trust.action.impl.AddEvidenceImpl#getAmount <em>Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AddEvidenceImpl extends TrustManagementActionImpl implements AddEvidence {
  /**
   * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAmount()
   * @generated
   * @ordered
   */
  protected static final long AMOUNT_EDEFAULT = 0L;

  /**
   * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAmount()
   * @generated
   * @ordered
   */
  protected long amount = AMOUNT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AddEvidenceImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return ActionPackage.Literals.ADD_EVIDENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public long getAmount() {
    return amount;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAmount(long newAmount) {
    long oldAmount = amount;
    amount = newAmount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ActionPackage.ADD_EVIDENCE__AMOUNT, oldAmount, amount));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case ActionPackage.ADD_EVIDENCE__AMOUNT:
        return getAmount();
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
      case ActionPackage.ADD_EVIDENCE__AMOUNT:
        setAmount((Long)newValue);
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
      case ActionPackage.ADD_EVIDENCE__AMOUNT:
        setAmount(AMOUNT_EDEFAULT);
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
      case ActionPackage.ADD_EVIDENCE__AMOUNT:
        return amount != AMOUNT_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (amount: ");
    result.append(amount);
    result.append(')');
    return result.toString();
  }

} //AddEvidenceImpl
