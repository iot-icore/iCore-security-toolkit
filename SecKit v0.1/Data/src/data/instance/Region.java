/**
 */
package data.instance;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.instance.Region#getStartAddress <em>Start Address</em>}</li>
 *   <li>{@link data.instance.Region#getLength <em>Length</em>}</li>
 *   <li>{@link data.instance.Region#getEndAddress <em>End Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.instance.InstancePackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends EObject {
    /**
     * Returns the value of the '<em><b>Start Address</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Start Address</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Start Address</em>' containment reference.
     * @see #setStartAddress(Address)
     * @see data.instance.InstancePackage#getRegion_StartAddress()
     * @model containment="true" required="true"
     * @generated
     */
    Address getStartAddress();

    /**
     * Sets the value of the '{@link data.instance.Region#getStartAddress <em>Start Address</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Start Address</em>' containment reference.
     * @see #getStartAddress()
     * @generated
     */
    void setStartAddress(Address value);

    /**
     * Returns the value of the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Length</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Length</em>' attribute.
     * @see #setLength(long)
     * @see data.instance.InstancePackage#getRegion_Length()
     * @model
     * @generated
     */
    long getLength();

    /**
     * Sets the value of the '{@link data.instance.Region#getLength <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Length</em>' attribute.
     * @see #getLength()
     * @generated
     */
    void setLength(long value);

    /**
     * Returns the value of the '<em><b>End Address</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Address</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Address</em>' containment reference.
     * @see #setEndAddress(Address)
     * @see data.instance.InstancePackage#getRegion_EndAddress()
     * @model containment="true"
     * @generated
     */
    Address getEndAddress();

    /**
     * Sets the value of the '{@link data.instance.Region#getEndAddress <em>End Address</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End Address</em>' containment reference.
     * @see #getEndAddress()
     * @generated
     */
    void setEndAddress(Address value);

} // Region
