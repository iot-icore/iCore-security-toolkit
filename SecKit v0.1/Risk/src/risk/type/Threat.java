/**
 */
package risk.type;

import models.Element;

import structure.instantiation.EntityInstantiationReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Threat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link risk.type.Threat#getDescription <em>Description</em>}</li>
 *   <li>{@link risk.type.Threat#getEntityInstantiation <em>Entity Instantiation</em>}</li>
 * </ul>
 * </p>
 *
 * @see risk.type.TypePackage#getThreat()
 * @model
 * @generated
 */
public interface Threat extends Element {
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
     * @see risk.type.TypePackage#getThreat_Description()
     * @model
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link risk.type.Threat#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

    /**
     * Returns the value of the '<em><b>Entity Instantiation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entity Instantiation</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entity Instantiation</em>' containment reference.
     * @see #setEntityInstantiation(EntityInstantiationReference)
     * @see risk.type.TypePackage#getThreat_EntityInstantiation()
     * @model containment="true"
     * @generated
     */
    EntityInstantiationReference getEntityInstantiation();

    /**
     * Sets the value of the '{@link risk.type.Threat#getEntityInstantiation <em>Entity Instantiation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Entity Instantiation</em>' containment reference.
     * @see #getEntityInstantiation()
     * @generated
     */
    void setEntityInstantiation(EntityInstantiationReference value);

} // Threat
