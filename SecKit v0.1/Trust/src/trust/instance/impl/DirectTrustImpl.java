/**
 */
package trust.instance.impl;

import org.eclipse.emf.ecore.EClass;

import trust.instance.DirectTrust;
import trust.instance.InstancePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Direct Trust</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class DirectTrustImpl extends TrustRelationshipImpl implements DirectTrust {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DirectTrustImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return InstancePackage.Literals.DIRECT_TRUST;
  }

} //DirectTrustImpl
