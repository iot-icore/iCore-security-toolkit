/**
 */
package identity.type;

import identity.instantiation.IdentityInstantiation;

import models.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link identity.type.IdentityType#getPackage <em>Package</em>}</li>
 *   <li>{@link identity.type.IdentityType#getName <em>Name</em>}</li>
 *   <li>{@link identity.type.IdentityType#getInstantiations <em>Instantiations</em>}</li>
 *   <li>{@link identity.type.IdentityType#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see identity.type.TypePackage#getIdentityType()
 * @model abstract="true"
 * @generated
 */
public interface IdentityType extends Element {
    /**
     * Returns the value of the '<em><b>Package</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link identity.type.IdentityTypePackage#getIdentityTypes <em>Identity Types</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Package</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Package</em>' container reference.
     * @see #setPackage(IdentityTypePackage)
     * @see identity.type.TypePackage#getIdentityType_Package()
     * @see identity.type.IdentityTypePackage#getIdentityTypes
     * @model opposite="identityTypes" transient="false"
     * @generated
     */
    IdentityTypePackage getPackage();

    /**
     * Sets the value of the '{@link identity.type.IdentityType#getPackage <em>Package</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Package</em>' container reference.
     * @see #getPackage()
     * @generated
     */
    void setPackage(IdentityTypePackage value);

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
     * @see identity.type.TypePackage#getIdentityType_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link identity.type.IdentityType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Instantiations</b></em>' reference list.
     * The list contents are of type {@link identity.instantiation.IdentityInstantiation}.
     * It is bidirectional and its opposite is '{@link identity.instantiation.IdentityInstantiation#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instantiations</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instantiations</em>' reference list.
     * @see identity.type.TypePackage#getIdentityType_Instantiations()
     * @see identity.instantiation.IdentityInstantiation#getType
     * @model opposite="type"
     * @generated
     */
    EList<IdentityInstantiation> getInstantiations();

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
     * @see identity.type.TypePackage#getIdentityType_Description()
     * @model
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link identity.type.IdentityType#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

} // IdentityType
