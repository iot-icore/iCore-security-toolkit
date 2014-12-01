/**
 */
package structure.instance;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Instance Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link structure.instance.EntityInstanceReference#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @see structure.instance.InstancePackage#getEntityInstanceReference()
 * @model
 * @generated
 */
public interface EntityInstanceReference extends EObject {
    /**
     * Returns the value of the '<em><b>Child</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Child</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Child</em>' containment reference.
     * @see #setChild(EntityInstanceReference)
     * @see structure.instance.InstancePackage#getEntityInstanceReference_Child()
     * @model containment="true"
     * @generated
     */
    EntityInstanceReference getChild();

    /**
     * Sets the value of the '{@link structure.instance.EntityInstanceReference#getChild <em>Child</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Child</em>' containment reference.
     * @see #getChild()
     * @generated
     */
    void setChild(EntityInstanceReference value);

} // EntityInstanceReference
