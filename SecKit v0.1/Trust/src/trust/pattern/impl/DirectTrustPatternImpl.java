/**
 */
package trust.pattern.impl;

import org.eclipse.emf.ecore.EClass;

import trust.pattern.DirectTrustPattern;
import trust.pattern.PatternPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Direct Trust Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class DirectTrustPatternImpl extends TrustRelationshipPatternImpl implements DirectTrustPattern {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DirectTrustPatternImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return PatternPackage.Literals.DIRECT_TRUST_PATTERN;
  }

} //DirectTrustPatternImpl
