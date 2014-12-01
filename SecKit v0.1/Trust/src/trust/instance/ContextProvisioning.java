/**
 */
package trust.instance;

import context.pattern.ContextInformationPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Provisioning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trust.instance.ContextProvisioning#getContextInformationPattern <em>Context Information Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see trust.instance.InstancePackage#getContextProvisioning()
 * @model
 * @generated
 */
public interface ContextProvisioning extends DataQuality {
  /**
   * Returns the value of the '<em><b>Context Information Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Context Information Pattern</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Context Information Pattern</em>' containment reference.
   * @see #setContextInformationPattern(ContextInformationPattern)
   * @see trust.instance.InstancePackage#getContextProvisioning_ContextInformationPattern()
   * @model containment="true"
   * @generated
   */
  ContextInformationPattern getContextInformationPattern();

  /**
   * Sets the value of the '{@link trust.instance.ContextProvisioning#getContextInformationPattern <em>Context Information Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Context Information Pattern</em>' containment reference.
   * @see #getContextInformationPattern()
   * @generated
   */
  void setContextInformationPattern(ContextInformationPattern value);

} // ContextProvisioning
