/**
 */
package identity.instance;

import identity.instantiation.IdentityInstantiation;

import identity.type.IdentityType;

import models.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Identity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link identity.instance.AbstractIdentity#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link identity.instance.AbstractIdentity#getType <em>Type</em>}</li>
 *   <li>{@link identity.instance.AbstractIdentity#getInstantiation <em>Instantiation</em>}</li>
 *   <li>{@link identity.instance.AbstractIdentity#getSubject <em>Subject</em>}</li>
 *   <li>{@link identity.instance.AbstractIdentity#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see identity.instance.InstancePackage#getAbstractIdentity()
 * @model abstract="true"
 * @generated
 */
public interface AbstractIdentity extends Element {
    /**
     * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
     * The list contents are of type {@link identity.instance.IdentityAttribute}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attributes</em>' containment reference list.
     * @see identity.instance.InstancePackage#getAbstractIdentity_Attributes()
     * @model containment="true"
     * @generated
     */
    EList<IdentityAttribute> getAttributes();

    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(IdentityType)
     * @see identity.instance.InstancePackage#getAbstractIdentity_Type()
     * @model required="true"
     * @generated
     */
    IdentityType getType();

    /**
     * Sets the value of the '{@link identity.instance.AbstractIdentity#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(IdentityType value);

    /**
     * Returns the value of the '<em><b>Instantiation</b></em>' reference.
     * It is bidirectional and its opposite is '{@link identity.instantiation.IdentityInstantiation#getInstances <em>Instances</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instantiation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instantiation</em>' reference.
     * @see #setInstantiation(IdentityInstantiation)
     * @see identity.instance.InstancePackage#getAbstractIdentity_Instantiation()
     * @see identity.instantiation.IdentityInstantiation#getInstances
     * @model opposite="instances"
     * @generated
     */
    IdentityInstantiation getInstantiation();

    /**
     * Sets the value of the '{@link identity.instance.AbstractIdentity#getInstantiation <em>Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Instantiation</em>' reference.
     * @see #getInstantiation()
     * @generated
     */
    void setInstantiation(IdentityInstantiation value);

    /**
     * Returns the value of the '<em><b>Subject</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Subject</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Subject</em>' attribute.
     * @see #setSubject(String)
     * @see identity.instance.InstancePackage#getAbstractIdentity_Subject()
     * @model
     * @generated
     */
    String getSubject();

    /**
     * Sets the value of the '{@link identity.instance.AbstractIdentity#getSubject <em>Subject</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Subject</em>' attribute.
     * @see #getSubject()
     * @generated
     */
    void setSubject(String value);

    /**
     * Returns the value of the '<em><b>Owner</b></em>' reference.
     * It is bidirectional and its opposite is '{@link identity.instance.IdentityOwner#getIdentities <em>Identities</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owner</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owner</em>' reference.
     * @see #setOwner(IdentityOwner)
     * @see identity.instance.InstancePackage#getAbstractIdentity_Owner()
     * @see identity.instance.IdentityOwner#getIdentities
     * @model opposite="identities" required="true"
     * @generated
     */
    IdentityOwner getOwner();

    /**
     * Sets the value of the '{@link identity.instance.AbstractIdentity#getOwner <em>Owner</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Owner</em>' reference.
     * @see #getOwner()
     * @generated
     */
    void setOwner(IdentityOwner value);

} // AbstractIdentity
