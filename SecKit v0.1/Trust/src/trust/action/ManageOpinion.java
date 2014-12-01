/**
 */
package trust.action;

import com.dstc.spectrum.opinion.SubjectiveOpinion;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manage Opinion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trust.action.ManageOpinion#getOpinion <em>Opinion</em>}</li>
 * </ul>
 * </p>
 *
 * @see trust.action.ActionPackage#getManageOpinion()
 * @model abstract="true"
 * @generated
 */
public interface ManageOpinion extends TrustManagementAction {
  /**
   * Returns the value of the '<em><b>Opinion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opinion</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opinion</em>' attribute.
   * @see #setOpinion(SubjectiveOpinion)
   * @see trust.action.ActionPackage#getManageOpinion_Opinion()
   * @model dataType="trust.instance.SubjectiveOpinion"
   * @generated
   */
  SubjectiveOpinion getOpinion();

  /**
   * Sets the value of the '{@link trust.action.ManageOpinion#getOpinion <em>Opinion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opinion</em>' attribute.
   * @see #getOpinion()
   * @generated
   */
  void setOpinion(SubjectiveOpinion value);

} // ManageOpinion
