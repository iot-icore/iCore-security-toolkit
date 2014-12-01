/**
 */
package data.instance;

import models.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.instance.Address#getContent <em>Content</em>}</li>
 *   <li>{@link data.instance.Address#getAdressSpace <em>Adress Space</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.instance.InstancePackage#getAddress()
 * @model abstract="true"
 * @generated
 */
public interface Address extends Element {
    /**
     * Returns the value of the '<em><b>Content</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Content</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Content</em>' reference.
     * @see #setContent(Content)
     * @see data.instance.InstancePackage#getAddress_Content()
     * @model
     * @generated
     */
    Content getContent();

    /**
     * Sets the value of the '{@link data.instance.Address#getContent <em>Content</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Content</em>' reference.
     * @see #getContent()
     * @generated
     */
    void setContent(Content value);

    /**
     * Returns the value of the '<em><b>Adress Space</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link data.instance.AdressSpace#getAddresses <em>Addresses</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Adress Space</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Adress Space</em>' container reference.
     * @see #setAdressSpace(AdressSpace)
     * @see data.instance.InstancePackage#getAddress_AdressSpace()
     * @see data.instance.AdressSpace#getAddresses
     * @model opposite="addresses" transient="false"
     * @generated
     */
    AdressSpace getAdressSpace();

    /**
     * Sets the value of the '{@link data.instance.Address#getAdressSpace <em>Adress Space</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Adress Space</em>' container reference.
     * @see #getAdressSpace()
     * @generated
     */
    void setAdressSpace(AdressSpace value);

} // Address
