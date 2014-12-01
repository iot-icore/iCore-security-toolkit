/**
 */
package behavior.constraint;

import identity.instantiation.IdentityInstantiation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Identity Establishment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.constraint.ReferenceIdentityEstablishment#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.constraint.ConstraintPackage#getReferenceIdentityEstablishment()
 * @model
 * @generated
 */
public interface ReferenceIdentityEstablishment extends IdentityEstablishment {
    /**
     * Returns the value of the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source</em>' reference.
     * @see #setSource(IdentityInstantiation)
     * @see behavior.constraint.ConstraintPackage#getReferenceIdentityEstablishment_Source()
     * @model required="true"
     * @generated
     */
    IdentityInstantiation getSource();

    /**
     * Sets the value of the '{@link behavior.constraint.ReferenceIdentityEstablishment#getSource <em>Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' reference.
     * @see #getSource()
     * @generated
     */
    void setSource(IdentityInstantiation value);

} // ReferenceIdentityEstablishment
