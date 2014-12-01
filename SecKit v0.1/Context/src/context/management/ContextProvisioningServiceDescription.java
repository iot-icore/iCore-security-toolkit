/**
 */
package context.management;

import context.type.ContextInformationType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Provisioning Service Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link context.management.ContextProvisioningServiceDescription#getContextType <em>Context Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see context.management.ManagementPackage#getContextProvisioningServiceDescription()
 * @model
 * @generated
 */
public interface ContextProvisioningServiceDescription extends EObject {
    /**
     * Returns the value of the '<em><b>Context Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context Type</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context Type</em>' containment reference.
     * @see #setContextType(ContextInformationType)
     * @see context.management.ManagementPackage#getContextProvisioningServiceDescription_ContextType()
     * @model containment="true" required="true"
     * @generated
     */
    ContextInformationType getContextType();

    /**
     * Sets the value of the '{@link context.management.ContextProvisioningServiceDescription#getContextType <em>Context Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context Type</em>' containment reference.
     * @see #getContextType()
     * @generated
     */
    void setContextType(ContextInformationType value);

} // ContextProvisioningServiceDescription
