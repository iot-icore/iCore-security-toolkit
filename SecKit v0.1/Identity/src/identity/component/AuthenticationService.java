/**
 */
package identity.component;

import identity.instance.AbstractIdentity;

import identity.type.Identifier;
import identity.type.Password;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authentication Service</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see identity.component.ComponentPackage#getAuthenticationService()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AuthenticationService extends EObject {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    AbstractIdentity authenticate(Identifier username, Password password);

} // AuthenticationService
