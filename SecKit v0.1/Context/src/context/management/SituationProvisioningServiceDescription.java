/**
 */
package context.management;

import context.type.ContextSituationType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Situation Provisioning Service Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link context.management.SituationProvisioningServiceDescription#getSituationType <em>Situation Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see context.management.ManagementPackage#getSituationProvisioningServiceDescription()
 * @model
 * @generated
 */
public interface SituationProvisioningServiceDescription extends EObject {
    /**
     * Returns the value of the '<em><b>Situation Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Situation Type</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Situation Type</em>' containment reference.
     * @see #setSituationType(ContextSituationType)
     * @see context.management.ManagementPackage#getSituationProvisioningServiceDescription_SituationType()
     * @model containment="true" required="true"
     * @generated
     */
    ContextSituationType getSituationType();

    /**
     * Sets the value of the '{@link context.management.SituationProvisioningServiceDescription#getSituationType <em>Situation Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Situation Type</em>' containment reference.
     * @see #getSituationType()
     * @generated
     */
    void setSituationType(ContextSituationType value);

} // SituationProvisioningServiceDescription
