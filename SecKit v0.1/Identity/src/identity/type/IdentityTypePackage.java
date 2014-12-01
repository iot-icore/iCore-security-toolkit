/**
 */
package identity.type;

import identity.IdentityDesignModel;

import models.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identity Type Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link identity.type.IdentityTypePackage#getIdentityTypes <em>Identity Types</em>}</li>
 *   <li>{@link identity.type.IdentityTypePackage#getName <em>Name</em>}</li>
 *   <li>{@link identity.type.IdentityTypePackage#getModel <em>Model</em>}</li>
 *   <li>{@link identity.type.IdentityTypePackage#getAttributeTypes <em>Attribute Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see identity.type.TypePackage#getIdentityTypePackage()
 * @model
 * @generated
 */
public interface IdentityTypePackage extends Element {
    /**
     * Returns the value of the '<em><b>Identity Types</b></em>' containment reference list.
     * The list contents are of type {@link identity.type.IdentityType}.
     * It is bidirectional and its opposite is '{@link identity.type.IdentityType#getPackage <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Identity Types</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Identity Types</em>' containment reference list.
     * @see identity.type.TypePackage#getIdentityTypePackage_IdentityTypes()
     * @see identity.type.IdentityType#getPackage
     * @model opposite="package" containment="true"
     * @generated
     */
    EList<IdentityType> getIdentityTypes();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see identity.type.TypePackage#getIdentityTypePackage_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link identity.type.IdentityTypePackage#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Model</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link identity.IdentityDesignModel#getPackages <em>Packages</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model</em>' container reference.
     * @see #setModel(IdentityDesignModel)
     * @see identity.type.TypePackage#getIdentityTypePackage_Model()
     * @see identity.IdentityDesignModel#getPackages
     * @model opposite="packages" transient="false"
     * @generated
     */
    IdentityDesignModel getModel();

    /**
     * Sets the value of the '{@link identity.type.IdentityTypePackage#getModel <em>Model</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model</em>' container reference.
     * @see #getModel()
     * @generated
     */
    void setModel(IdentityDesignModel value);

    /**
     * Returns the value of the '<em><b>Attribute Types</b></em>' containment reference list.
     * The list contents are of type {@link identity.type.IdentityAttributeType}.
     * It is bidirectional and its opposite is '{@link identity.type.IdentityAttributeType#getPackage <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attribute Types</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attribute Types</em>' containment reference list.
     * @see identity.type.TypePackage#getIdentityTypePackage_AttributeTypes()
     * @see identity.type.IdentityAttributeType#getPackage
     * @model opposite="package" containment="true"
     * @generated
     */
    EList<IdentityAttributeType> getAttributeTypes();

} // IdentityTypePackage
