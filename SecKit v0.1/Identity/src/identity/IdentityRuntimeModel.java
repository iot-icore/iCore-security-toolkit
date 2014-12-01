/**
 */
package identity;

import identity.instance.AbstractIdentity;
import identity.instance.IdentityRealm;

import identity.type.AttributeVerificationMethod;

import models.Model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link identity.IdentityRuntimeModel#getIdentityRealms <em>Identity Realms</em>}</li>
 *   <li>{@link identity.IdentityRuntimeModel#getVerificationMethods <em>Verification Methods</em>}</li>
 *   <li>{@link identity.IdentityRuntimeModel#getIdentities <em>Identities</em>}</li>
 * </ul>
 * </p>
 *
 * @see identity.IdentityPackage#getIdentityRuntimeModel()
 * @model
 * @generated
 */
public interface IdentityRuntimeModel extends Model {
    /**
     * Returns the value of the '<em><b>Identity Realms</b></em>' containment reference list.
     * The list contents are of type {@link identity.instance.IdentityRealm}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Identity Realms</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Identity Realms</em>' containment reference list.
     * @see identity.IdentityPackage#getIdentityRuntimeModel_IdentityRealms()
     * @model containment="true"
     * @generated
     */
    EList<IdentityRealm> getIdentityRealms();

    /**
     * Returns the value of the '<em><b>Verification Methods</b></em>' containment reference list.
     * The list contents are of type {@link identity.type.AttributeVerificationMethod}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Verification Methods</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Verification Methods</em>' containment reference list.
     * @see identity.IdentityPackage#getIdentityRuntimeModel_VerificationMethods()
     * @model containment="true"
     * @generated
     */
    EList<AttributeVerificationMethod> getVerificationMethods();

    /**
     * Returns the value of the '<em><b>Identities</b></em>' containment reference list.
     * The list contents are of type {@link identity.instance.AbstractIdentity}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Identities</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Identities</em>' containment reference list.
     * @see identity.IdentityPackage#getIdentityRuntimeModel_Identities()
     * @model containment="true"
     * @generated
     */
    EList<AbstractIdentity> getIdentities();

} // IdentityRuntimeModel
