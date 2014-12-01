/**
 */
package models;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link models.Multiplicity#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link models.Multiplicity#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see models.ModelsPackage#getMultiplicity()
 * @model
 * @generated
 */
public interface Multiplicity extends EObject {
    /**
     * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lower Bound</em>' attribute.
     * @see #setLowerBound(int)
     * @see models.ModelsPackage#getMultiplicity_LowerBound()
     * @model
     * @generated
     */
    int getLowerBound();

    /**
     * Sets the value of the '{@link models.Multiplicity#getLowerBound <em>Lower Bound</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lower Bound</em>' attribute.
     * @see #getLowerBound()
     * @generated
     */
    void setLowerBound(int value);

    /**
     * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Upper Bound</em>' attribute.
     * @see #setUpperBound(int)
     * @see models.ModelsPackage#getMultiplicity_UpperBound()
     * @model
     * @generated
     */
    int getUpperBound();

    /**
     * Sets the value of the '{@link models.Multiplicity#getUpperBound <em>Upper Bound</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Upper Bound</em>' attribute.
     * @see #getUpperBound()
     * @generated
     */
    void setUpperBound(int value);

} // Multiplicity
