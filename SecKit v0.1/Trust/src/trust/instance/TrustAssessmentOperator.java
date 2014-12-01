/**
 */
package trust.instance;

import rule.condition.Operator;
import trust.pattern.TrustDegreePattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trust Assessment Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trust.instance.TrustAssessmentOperator#getTrustFusionOperator <em>Trust Fusion Operator</em>}</li>
 *   <li>{@link trust.instance.TrustAssessmentOperator#getDegree <em>Degree</em>}</li>
 * </ul>
 * </p>
 *
 * @see trust.instance.InstancePackage#getTrustAssessmentOperator()
 * @model
 * @generated
 */
public interface TrustAssessmentOperator extends TrustOperator, Operator {
  /**
   * Returns the value of the '<em><b>Trust Fusion Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trust Fusion Operator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trust Fusion Operator</em>' containment reference.
   * @see #setTrustFusionOperator(TrustFusionOperator)
   * @see trust.instance.InstancePackage#getTrustAssessmentOperator_TrustFusionOperator()
   * @model containment="true"
   * @generated
   */
  TrustFusionOperator getTrustFusionOperator();

  /**
   * Sets the value of the '{@link trust.instance.TrustAssessmentOperator#getTrustFusionOperator <em>Trust Fusion Operator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trust Fusion Operator</em>' containment reference.
   * @see #getTrustFusionOperator()
   * @generated
   */
  void setTrustFusionOperator(TrustFusionOperator value);

  /**
   * Returns the value of the '<em><b>Degree</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Degree</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Degree</em>' containment reference.
   * @see #setDegree(TrustDegreePattern)
   * @see trust.instance.InstancePackage#getTrustAssessmentOperator_Degree()
   * @model containment="true"
   * @generated
   */
  TrustDegreePattern getDegree();

  /**
   * Sets the value of the '{@link trust.instance.TrustAssessmentOperator#getDegree <em>Degree</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Degree</em>' containment reference.
   * @see #getDegree()
   * @generated
   */
  void setDegree(TrustDegreePattern value);

} // TrustAssessmentOperator
