/**
 */
package structure.instantiation;

import models.InstantiationReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Instantiation Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link structure.instantiation.EntityInstantiationReference#getInstantiation <em>Instantiation</em>}</li>
 *   <li>{@link structure.instantiation.EntityInstantiationReference#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @see structure.instantiation.InstantiationPackage#getEntityInstantiationReference()
 * @model
 * @generated
 */
public interface EntityInstantiationReference extends InstantiationReference {
    /**
     * Returns the value of the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instantiation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instantiation</em>' reference.
     * @see #setInstantiation(EntityInstantiation)
     * @see structure.instantiation.InstantiationPackage#getEntityInstantiationReference_Instantiation()
     * @model required="true"
     * @generated
     */
    EntityInstantiation getInstantiation();

    /**
     * Sets the value of the '{@link structure.instantiation.EntityInstantiationReference#getInstantiation <em>Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Instantiation</em>' reference.
     * @see #getInstantiation()
     * @generated
     */
    void setInstantiation(EntityInstantiation value);

    /**
     * Returns the value of the '<em><b>Child</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Child</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Child</em>' containment reference.
     * @see #setChild(EntityInstantiationReference)
     * @see structure.instantiation.InstantiationPackage#getEntityInstantiationReference_Child()
     * @model containment="true"
     * @generated
     */
    EntityInstantiationReference getChild();

    /**
     * Sets the value of the '{@link structure.instantiation.EntityInstantiationReference#getChild <em>Child</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Child</em>' containment reference.
     * @see #getChild()
     * @generated
     */
    void setChild(EntityInstantiationReference value);

} // EntityInstantiationReference
