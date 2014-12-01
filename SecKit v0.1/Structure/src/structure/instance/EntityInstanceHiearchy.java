/**
 */
package structure.instance;

import models.InstanceHiearchy;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Instance Hiearchy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link structure.instance.EntityInstanceHiearchy#getRoot <em>Root</em>}</li>
 * </ul>
 * </p>
 *
 * @see structure.instance.InstancePackage#getEntityInstanceHiearchy()
 * @model
 * @generated
 */
public interface EntityInstanceHiearchy extends InstanceHiearchy {
    /**
     * Returns the value of the '<em><b>Root</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Root</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Root</em>' containment reference.
     * @see #setRoot(EntityInstanceReference)
     * @see structure.instance.InstancePackage#getEntityInstanceHiearchy_Root()
     * @model containment="true" required="true"
     * @generated
     */
    EntityInstanceReference getRoot();

    /**
     * Sets the value of the '{@link structure.instance.EntityInstanceHiearchy#getRoot <em>Root</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Root</em>' containment reference.
     * @see #getRoot()
     * @generated
     */
    void setRoot(EntityInstanceReference value);

} // EntityInstanceHiearchy
