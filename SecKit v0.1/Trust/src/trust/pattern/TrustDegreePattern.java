/**
 */
package trust.pattern;

import models.Pattern;

import trust.instance.LikelihoodMeasurement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trust Degree Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trust.pattern.TrustDegreePattern#getDegree <em>Degree</em>}</li>
 * </ul>
 * </p>
 *
 * @see trust.pattern.PatternPackage#getTrustDegreePattern()
 * @model abstract="true"
 * @generated
 */
public interface TrustDegreePattern extends Pattern {
  /**
   * Returns the value of the '<em><b>Degree</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Degree</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Degree</em>' containment reference.
   * @see #setDegree(LikelihoodMeasurement)
   * @see trust.pattern.PatternPackage#getTrustDegreePattern_Degree()
   * @model containment="true"
   * @generated
   */
  LikelihoodMeasurement getDegree();

  /**
   * Sets the value of the '{@link trust.pattern.TrustDegreePattern#getDegree <em>Degree</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Degree</em>' containment reference.
   * @see #getDegree()
   * @generated
   */
  void setDegree(LikelihoodMeasurement value);

} // TrustDegreePattern
