/**
 */
package trust.pattern;

import trust.instance.TrustLevel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trust Level Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trust.pattern.TrustLevelPattern#getLevel <em>Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see trust.pattern.PatternPackage#getTrustLevelPattern()
 * @model
 * @generated
 */
public interface TrustLevelPattern extends TrustDegreePattern {
  /**
   * Returns the value of the '<em><b>Level</b></em>' attribute.
   * The default value is <code>"Unspecified"</code>.
   * The literals are from the enumeration {@link trust.instance.TrustLevel}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Level</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Level</em>' attribute.
   * @see trust.instance.TrustLevel
   * @see #setLevel(TrustLevel)
   * @see trust.pattern.PatternPackage#getTrustLevelPattern_Level()
   * @model default="Unspecified"
   * @generated
   */
  TrustLevel getLevel();

  /**
   * Sets the value of the '{@link trust.pattern.TrustLevelPattern#getLevel <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Level</em>' attribute.
   * @see trust.instance.TrustLevel
   * @see #getLevel()
   * @generated
   */
  void setLevel(TrustLevel value);

} // TrustLevelPattern
