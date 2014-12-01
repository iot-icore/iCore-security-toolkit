/**
 */
package data.instance;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.instance.Memory#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.instance.InstancePackage#getMemory()
 * @model
 * @generated
 */
public interface Memory extends EObject {
    /**
     * Returns the value of the '<em><b>Contents</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contents</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contents</em>' containment reference.
     * @see #setContents(Content)
     * @see data.instance.InstancePackage#getMemory_Contents()
     * @model containment="true"
     * @generated
     */
    Content getContents();

    /**
     * Sets the value of the '{@link data.instance.Memory#getContents <em>Contents</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Contents</em>' containment reference.
     * @see #getContents()
     * @generated
     */
    void setContents(Content value);

} // Memory
