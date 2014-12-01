/**
 */
package data.type;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lead Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.type.LeadUnit#getValue <em>Value</em>}</li>
 *   <li>{@link data.type.LeadUnit#getTrailUnits <em>Trail Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.type.TypePackage#getLeadUnit()
 * @model
 * @generated
 */
public interface LeadUnit extends EObject {
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
     * @see data.type.TypePackage#getLeadUnit_Value()
     * @model
     * @generated
     */
    byte[] getValue();

    /**
     * Sets the value of the '{@link data.type.LeadUnit#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(byte[] value);

    /**
     * Returns the value of the '<em><b>Trail Units</b></em>' containment reference list.
     * The list contents are of type {@link data.type.TrailUnit}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Trail Units</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Trail Units</em>' containment reference list.
     * @see data.type.TypePackage#getLeadUnit_TrailUnits()
     * @model containment="true"
     * @generated
     */
    EList<TrailUnit> getTrailUnits();

} // LeadUnit
