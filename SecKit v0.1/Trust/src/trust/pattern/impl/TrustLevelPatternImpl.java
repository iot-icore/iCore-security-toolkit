/**
 */
package trust.pattern.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import trust.instance.TrustLevel;

import trust.pattern.PatternPackage;
import trust.pattern.TrustLevelPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trust Level Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trust.pattern.impl.TrustLevelPatternImpl#getLevel <em>Level</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrustLevelPatternImpl extends TrustDegreePatternImpl implements TrustLevelPattern {
  /**
   * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel()
   * @generated
   * @ordered
   */
  protected static final TrustLevel LEVEL_EDEFAULT = TrustLevel.UNSPECIFIED;

  /**
   * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel()
   * @generated
   * @ordered
   */
  protected TrustLevel level = LEVEL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TrustLevelPatternImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return PatternPackage.Literals.TRUST_LEVEL_PATTERN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrustLevel getLevel() {
    return level;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLevel(TrustLevel newLevel) {
    TrustLevel oldLevel = level;
    level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.TRUST_LEVEL_PATTERN__LEVEL, oldLevel, level));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case PatternPackage.TRUST_LEVEL_PATTERN__LEVEL:
        return getLevel();
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
      case PatternPackage.TRUST_LEVEL_PATTERN__LEVEL:
        setLevel((TrustLevel)newValue);
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
      case PatternPackage.TRUST_LEVEL_PATTERN__LEVEL:
        setLevel(LEVEL_EDEFAULT);
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
      case PatternPackage.TRUST_LEVEL_PATTERN__LEVEL:
        return level != LEVEL_EDEFAULT;
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
    result.append(" (level: ");
    result.append(level);
    result.append(')');
    return result.toString();
  }

} //TrustLevelPatternImpl
