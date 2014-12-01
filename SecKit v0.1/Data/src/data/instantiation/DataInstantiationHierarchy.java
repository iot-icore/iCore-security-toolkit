/**
 */
package data.instantiation;

import models.InstantiationHierarchy;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Instantiation Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.instantiation.DataInstantiationHierarchy#getRoot <em>Root</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.instantiation.InstantiationPackage#getDataInstantiationHierarchy()
 * @model
 * @generated
 */
public interface DataInstantiationHierarchy extends InstantiationHierarchy {
    /**
     * Returns the value of the '<em><b>Root</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Root</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Root</em>' containment reference.
     * @see #setRoot(DataInstantiationReference)
     * @see data.instantiation.InstantiationPackage#getDataInstantiationHierarchy_Root()
     * @model containment="true" required="true"
     * @generated
     */
    DataInstantiationReference getRoot();

    /**
     * Sets the value of the '{@link data.instantiation.DataInstantiationHierarchy#getRoot <em>Root</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Root</em>' containment reference.
     * @see #getRoot()
     * @generated
     */
    void setRoot(DataInstantiationReference value);

} // DataInstantiationHierarchy
