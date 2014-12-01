/**
 */
package data.instantiation;

import models.InstantiationReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Instantiation Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.instantiation.DataInstantiationReference#getInstantiation <em>Instantiation</em>}</li>
 *   <li>{@link data.instantiation.DataInstantiationReference#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.instantiation.InstantiationPackage#getDataInstantiationReference()
 * @model
 * @generated
 */
public interface DataInstantiationReference extends InstantiationReference {
    /**
     * Returns the value of the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instantiation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instantiation</em>' reference.
     * @see #setInstantiation(DataInstantiation)
     * @see data.instantiation.InstantiationPackage#getDataInstantiationReference_Instantiation()
     * @model
     * @generated
     */
    DataInstantiation getInstantiation();

    /**
     * Sets the value of the '{@link data.instantiation.DataInstantiationReference#getInstantiation <em>Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Instantiation</em>' reference.
     * @see #getInstantiation()
     * @generated
     */
    void setInstantiation(DataInstantiation value);

    /**
     * Returns the value of the '<em><b>Child</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Child</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Child</em>' containment reference.
     * @see #setChild(DataInstantiationReference)
     * @see data.instantiation.InstantiationPackage#getDataInstantiationReference_Child()
     * @model containment="true"
     * @generated
     */
    DataInstantiationReference getChild();

    /**
     * Sets the value of the '{@link data.instantiation.DataInstantiationReference#getChild <em>Child</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Child</em>' containment reference.
     * @see #getChild()
     * @generated
     */
    void setChild(DataInstantiationReference value);

} // DataInstantiationReference
