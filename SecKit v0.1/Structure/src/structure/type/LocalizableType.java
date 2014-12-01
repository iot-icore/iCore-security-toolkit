/**
 */
package structure.type;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Localizable Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link structure.type.LocalizableType#getLocationType <em>Location Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see structure.type.TypePackage#getLocalizableType()
 * @model abstract="true"
 * @generated
 */
public interface LocalizableType extends EObject {
    /**
     * Returns the value of the '<em><b>Location Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Location Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Location Type</em>' reference.
     * @see #setLocationType(LocationType)
     * @see structure.type.TypePackage#getLocalizableType_LocationType()
     * @model required="true"
     * @generated
     */
    LocationType getLocationType();

    /**
     * Sets the value of the '{@link structure.type.LocalizableType#getLocationType <em>Location Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Location Type</em>' reference.
     * @see #getLocationType()
     * @generated
     */
    void setLocationType(LocationType value);

} // LocalizableType
