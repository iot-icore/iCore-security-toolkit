/**
 */
package identity.instance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identity Owner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link identity.instance.IdentityOwner#getIdentities <em>Identities</em>}</li>
 * </ul>
 * </p>
 *
 * @see identity.instance.InstancePackage#getIdentityOwner()
 * @model
 * @generated
 */
public interface IdentityOwner extends EObject {
    /**
     * Returns the value of the '<em><b>Identities</b></em>' reference list.
     * The list contents are of type {@link identity.instance.AbstractIdentity}.
     * It is bidirectional and its opposite is '{@link identity.instance.AbstractIdentity#getOwner <em>Owner</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Identities</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Identities</em>' reference list.
     * @see identity.instance.InstancePackage#getIdentityOwner_Identities()
     * @see identity.instance.AbstractIdentity#getOwner
     * @model opposite="owner"
     * @generated
     */
    EList<AbstractIdentity> getIdentities();

} // IdentityOwner
