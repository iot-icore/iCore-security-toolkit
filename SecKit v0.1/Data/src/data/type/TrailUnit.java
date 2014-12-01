/**
 */
package data.type;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trail Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.type.TrailUnit#getValue <em>Value</em>}</li>
 *   <li>{@link data.type.TrailUnit#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.type.TypePackage#getTrailUnit()
 * @model
 * @generated
 */
public interface TrailUnit extends EObject {
    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(byte[])
     * @see data.type.TypePackage#getTrailUnit_Value()
     * @model
     * @generated
     */
    byte[] getValue();

    /**
     * Sets the value of the '{@link data.type.TrailUnit#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(byte[] value);

    /**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' attribute.
     * @see #setDescription(String)
     * @see data.type.TypePackage#getTrailUnit_Description()
     * @model
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link data.type.TrailUnit#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

} // TrailUnit
