/**
 */
package structure.instance;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Localizable Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link structure.instance.LocalizableInstance#getLocationInstance <em>Location Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see structure.instance.InstancePackage#getLocalizableInstance()
 * @model abstract="true"
 * @generated
 */
public interface LocalizableInstance extends EObject {
    /**
     * Returns the value of the '<em><b>Location Instance</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Location Instance</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Location Instance</em>' containment reference.
     * @see #setLocationInstance(Location)
     * @see structure.instance.InstancePackage#getLocalizableInstance_LocationInstance()
     * @model containment="true"
     * @generated
     */
    Location getLocationInstance();

    /**
     * Sets the value of the '{@link structure.instance.LocalizableInstance#getLocationInstance <em>Location Instance</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Location Instance</em>' containment reference.
     * @see #getLocationInstance()
     * @generated
     */
    void setLocationInstance(Location value);

} // LocalizableInstance
