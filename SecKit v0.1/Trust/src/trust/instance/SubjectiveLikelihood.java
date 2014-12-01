/**
 */
package trust.instance;

import com.dstc.spectrum.opinion.SubjectiveOpinion;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subjective Likelihood</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trust.instance.SubjectiveLikelihood#getOpinion <em>Opinion</em>}</li>
 * </ul>
 * </p>
 *
 * @see trust.instance.InstancePackage#getSubjectiveLikelihood()
 * @model
 * @generated
 */
public interface SubjectiveLikelihood extends LikelihoodMeasurement {
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
   * @see trust.instance.InstancePackage#getSubjectiveLikelihood_Opinion()
   * @model dataType="trust.instance.SubjectiveOpinion"
   * @generated
   */
  SubjectiveOpinion getOpinion();

  /**
   * Sets the value of the '{@link trust.instance.SubjectiveLikelihood#getOpinion <em>Opinion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opinion</em>' attribute.
   * @see #getOpinion()
   * @generated
   */
  void setOpinion(SubjectiveOpinion value);

} // SubjectiveLikelihood
