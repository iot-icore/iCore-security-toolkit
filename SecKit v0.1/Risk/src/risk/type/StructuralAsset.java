/**
 */
package risk.type;

import structure.instantiation.EntityInstantiation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link risk.type.StructuralAsset#getEntityInstantiation <em>Entity Instantiation</em>}</li>
 * </ul>
 * </p>
 *
 * @see risk.type.TypePackage#getStructuralAsset()
 * @model
 * @generated
 */
public interface StructuralAsset extends Asset {
    /**
     * Returns the value of the '<em><b>Entity Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entity Instantiation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entity Instantiation</em>' reference.
     * @see #setEntityInstantiation(EntityInstantiation)
     * @see risk.type.TypePackage#getStructuralAsset_EntityInstantiation()
     * @model required="true"
     * @generated
     */
    EntityInstantiation getEntityInstantiation();

    /**
     * Sets the value of the '{@link risk.type.StructuralAsset#getEntityInstantiation <em>Entity Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Entity Instantiation</em>' reference.
     * @see #getEntityInstantiation()
     * @generated
     */
    void setEntityInstantiation(EntityInstantiation value);

} // StructuralAsset
