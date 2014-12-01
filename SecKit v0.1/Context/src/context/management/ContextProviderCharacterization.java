/**
 */
package context.management;

import identity.instance.AbstractIdentity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Provider Characterization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link context.management.ContextProviderCharacterization#getContextOwners <em>Context Owners</em>}</li>
 *   <li>{@link context.management.ContextProviderCharacterization#getOwnerContextAttributeRef <em>Owner Context Attribute Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see context.management.ManagementPackage#getContextProviderCharacterization()
 * @model
 * @generated
 */
public interface ContextProviderCharacterization extends EObject {
    /**
     * Returns the value of the '<em><b>Context Owners</b></em>' reference list.
     * The list contents are of type {@link identity.instance.AbstractIdentity}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context Owners</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context Owners</em>' reference list.
     * @see context.management.ManagementPackage#getContextProviderCharacterization_ContextOwners()
     * @model
     * @generated
     */
    EList<AbstractIdentity> getContextOwners();

    /**
     * Returns the value of the '<em><b>Owner Context Attribute Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owner Context Attribute Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owner Context Attribute Ref</em>' attribute.
     * @see #setOwnerContextAttributeRef(String)
     * @see context.management.ManagementPackage#getContextProviderCharacterization_OwnerContextAttributeRef()
     * @model
     * @generated
     */
    String getOwnerContextAttributeRef();

    /**
     * Sets the value of the '{@link context.management.ContextProviderCharacterization#getOwnerContextAttributeRef <em>Owner Context Attribute Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Owner Context Attribute Ref</em>' attribute.
     * @see #getOwnerContextAttributeRef()
     * @generated
     */
    void setOwnerContextAttributeRef(String value);

} // ContextProviderCharacterization
