/**
 */
package trust.instance;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experience Trust</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trust.instance.ExperienceTrust#getEvidence <em>Evidence</em>}</li>
 * </ul>
 * </p>
 *
 * @see trust.instance.InstancePackage#getExperienceTrust()
 * @model
 * @generated
 */
public interface ExperienceTrust extends DirectTrust {
  /**
   * Returns the value of the '<em><b>Evidence</b></em>' containment reference list.
   * The list contents are of type {@link trust.instance.Evidence}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Evidence</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Evidence</em>' containment reference list.
   * @see trust.instance.InstancePackage#getExperienceTrust_Evidence()
   * @model containment="true"
   * @generated
   */
  EList<Evidence> getEvidence();

} // ExperienceTrust
