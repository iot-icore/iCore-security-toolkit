/**
 */
package trust.instance;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identity Quality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trust.instance.IdentityQuality#getLoa <em>Loa</em>}</li>
 * </ul>
 * </p>
 *
 * @see trust.instance.InstancePackage#getIdentityQuality()
 * @model
 * @generated
 */
public interface IdentityQuality extends DataQuality {
  /**
   * Returns the value of the '<em><b>Loa</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Loa</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loa</em>' containment reference.
   * @see #setLoa(LevelOfAssurance)
   * @see trust.instance.InstancePackage#getIdentityQuality_Loa()
   * @model containment="true"
   * @generated
   */
  LevelOfAssurance getLoa();

  /**
   * Sets the value of the '{@link trust.instance.IdentityQuality#getLoa <em>Loa</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Loa</em>' containment reference.
   * @see #getLoa()
   * @generated
   */
  void setLoa(LevelOfAssurance value);

} // IdentityQuality
