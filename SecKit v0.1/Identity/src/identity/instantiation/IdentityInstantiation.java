/**
 */
package identity.instantiation;

import identity.instance.AbstractIdentity;

import identity.type.IdentityType;

import models.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identity Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link identity.instantiation.IdentityInstantiation#getType <em>Type</em>}</li>
 *   <li>{@link identity.instantiation.IdentityInstantiation#getInstances <em>Instances</em>}</li>
 *   <li>{@link identity.instantiation.IdentityInstantiation#getName <em>Name</em>}</li>
 *   <li>{@link identity.instantiation.IdentityInstantiation#isArray <em>Array</em>}</li>
 * </ul>
 * </p>
 *
 * @see identity.instantiation.InstantiationPackage#getIdentityInstantiation()
 * @model
 * @generated
 */
public interface IdentityInstantiation extends Element {
    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link identity.type.IdentityType#getInstantiations <em>Instantiations</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(IdentityType)
     * @see identity.instantiation.InstantiationPackage#getIdentityInstantiation_Type()
     * @see identity.type.IdentityType#getInstantiations
     * @model opposite="instantiations" required="true"
     * @generated
     */
    IdentityType getType();

    /**
     * Sets the value of the '{@link identity.instantiation.IdentityInstantiation#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(IdentityType value);

    /**
     * Returns the value of the '<em><b>Instances</b></em>' reference list.
     * The list contents are of type {@link identity.instance.AbstractIdentity}.
     * It is bidirectional and its opposite is '{@link identity.instance.AbstractIdentity#getInstantiation <em>Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instances</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instances</em>' reference list.
     * @see identity.instantiation.InstantiationPackage#getIdentityInstantiation_Instances()
     * @see identity.instance.AbstractIdentity#getInstantiation
     * @model opposite="instantiation"
     * @generated
     */
    EList<AbstractIdentity> getInstances();

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
     * @see identity.instantiation.InstantiationPackage#getIdentityInstantiation_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link identity.instantiation.IdentityInstantiation#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Array</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Array</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Array</em>' attribute.
     * @see #setArray(boolean)
     * @see identity.instantiation.InstantiationPackage#getIdentityInstantiation_Array()
     * @model
     * @generated
     */
    boolean isArray();

    /**
     * Sets the value of the '{@link identity.instantiation.IdentityInstantiation#isArray <em>Array</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Array</em>' attribute.
     * @see #isArray()
     * @generated
     */
    void setArray(boolean value);

} // IdentityInstantiation
