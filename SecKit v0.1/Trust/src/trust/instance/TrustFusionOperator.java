/**
 */
package trust.instance;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trust Fusion Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trust.instance.TrustFusionOperator#getOperands <em>Operands</em>}</li>
 * </ul>
 * </p>
 *
 * @see trust.instance.InstancePackage#getTrustFusionOperator()
 * @model abstract="true"
 * @generated
 */
public interface TrustFusionOperator extends TrustOperator {
  /**
   * Returns the value of the '<em><b>Operands</b></em>' containment reference list.
   * The list contents are of type {@link trust.instance.TrustFusionOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operands</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operands</em>' containment reference list.
   * @see trust.instance.InstancePackage#getTrustFusionOperator_Operands()
   * @model containment="true"
   * @generated
   */
  EList<TrustFusionOperator> getOperands();

} // TrustFusionOperator
