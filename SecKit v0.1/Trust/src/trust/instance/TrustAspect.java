/**
 */
package trust.instance;

import models.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trust Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trust.instance.TrustAspect#getName <em>Name</em>}</li>
 *   <li>{@link trust.instance.TrustAspect#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see trust.instance.InstancePackage#getTrustAspect()
 * @model
 * @generated
 */
public interface TrustAspect extends Element {
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see trust.instance.InstancePackage#getTrustAspect_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link trust.instance.TrustAspect#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see trust.instance.InstancePackage#getTrustAspect_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link trust.instance.TrustAspect#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // TrustAspect
