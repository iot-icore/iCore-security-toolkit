/**
 */
package structure.instantiation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Localizable Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link structure.instantiation.LocalizableInstantiation#getLocationInstantiation <em>Location Instantiation</em>}</li>
 * </ul>
 * </p>
 *
 * @see structure.instantiation.InstantiationPackage#getLocalizableInstantiation()
 * @model abstract="true"
 * @generated
 */
public interface LocalizableInstantiation extends EObject {
    /**
     * Returns the value of the '<em><b>Location Instantiation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Location Instantiation</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Location Instantiation</em>' containment reference.
     * @see #setLocationInstantiation(LocationInstantiation)
     * @see structure.instantiation.InstantiationPackage#getLocalizableInstantiation_LocationInstantiation()
     * @model containment="true"
     * @generated
     */
    LocationInstantiation getLocationInstantiation();

    /**
     * Sets the value of the '{@link structure.instantiation.LocalizableInstantiation#getLocationInstantiation <em>Location Instantiation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Location Instantiation</em>' containment reference.
     * @see #getLocationInstantiation()
     * @generated
     */
    void setLocationInstantiation(LocationInstantiation value);

} // LocalizableInstantiation
