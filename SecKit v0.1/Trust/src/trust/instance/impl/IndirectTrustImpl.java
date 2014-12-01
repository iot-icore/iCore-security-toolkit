/**
 */
package trust.instance.impl;

import org.eclipse.emf.ecore.EClass;

import trust.instance.IndirectTrust;
import trust.instance.InstancePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Indirect Trust</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class IndirectTrustImpl extends TrustRelationshipImpl implements IndirectTrust {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IndirectTrustImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return InstancePackage.Literals.INDIRECT_TRUST;
  }

} //IndirectTrustImpl
