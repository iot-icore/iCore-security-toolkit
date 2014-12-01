/**
 */
package structure.instantiation;

import models.InstantiationHierarchy;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Instantiation Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link structure.instantiation.EntityInstantiationHierarchy#getRoot <em>Root</em>}</li>
 * </ul>
 * </p>
 *
 * @see structure.instantiation.InstantiationPackage#getEntityInstantiationHierarchy()
 * @model
 * @generated
 */
public interface EntityInstantiationHierarchy extends InstantiationHierarchy {
    /**
     * Returns the value of the '<em><b>Root</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Root</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Root</em>' containment reference.
     * @see #setRoot(EntityInstantiationReference)
     * @see structure.instantiation.InstantiationPackage#getEntityInstantiationHierarchy_Root()
     * @model containment="true" required="true"
     * @generated
     */
    EntityInstantiationReference getRoot();

    /**
     * Sets the value of the '{@link structure.instantiation.EntityInstantiationHierarchy#getRoot <em>Root</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Root</em>' containment reference.
     * @see #getRoot()
     * @generated
     */
    void setRoot(EntityInstantiationReference value);

} // EntityInstantiationHierarchy
