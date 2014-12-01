/**
 */
package structure.pattern;

import identity.pattern.IdentityPattern;

import models.Pattern;

import org.eclipse.emf.common.util.EList;

import role.RolePattern;

import structure.instantiation.EntityInstantiationHierarchy;

import structure.type.EntityType;

import structure.variable.EntityVariable;
import trust.pattern.TrustPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link structure.pattern.EntityPattern#getType <em>Type</em>}</li>
 *   <li>{@link structure.pattern.EntityPattern#getInstantiationHierarchy <em>Instantiation Hierarchy</em>}</li>
 *   <li>{@link structure.pattern.EntityPattern#getVariables <em>Variables</em>}</li>
 *   <li>{@link structure.pattern.EntityPattern#getIdentityPattern <em>Identity Pattern</em>}</li>
 *   <li>{@link structure.pattern.EntityPattern#getRolePattern <em>Role Pattern</em>}</li>
 *   <li>{@link structure.pattern.EntityPattern#getContainerEntityPattern <em>Container Entity Pattern</em>}</li>
 *   <li>{@link structure.pattern.EntityPattern#getTrustPattern <em>Trust Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see structure.pattern.PatternPackage#getEntityPattern()
 * @model
 * @generated
 */
public interface EntityPattern extends Pattern {
    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(EntityType)
     * @see structure.pattern.PatternPackage#getEntityPattern_Type()
     * @model
     * @generated
     */
    EntityType getType();

    /**
     * Sets the value of the '{@link structure.pattern.EntityPattern#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(EntityType value);

    /**
     * Returns the value of the '<em><b>Instantiation Hierarchy</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instantiation Hierarchy</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instantiation Hierarchy</em>' reference.
     * @see #setInstantiationHierarchy(EntityInstantiationHierarchy)
     * @see structure.pattern.PatternPackage#getEntityPattern_InstantiationHierarchy()
     * @model
     * @generated
     */
    EntityInstantiationHierarchy getInstantiationHierarchy();

    /**
     * Sets the value of the '{@link structure.pattern.EntityPattern#getInstantiationHierarchy <em>Instantiation Hierarchy</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Instantiation Hierarchy</em>' reference.
     * @see #getInstantiationHierarchy()
     * @generated
     */
    void setInstantiationHierarchy(EntityInstantiationHierarchy value);

    /**
     * Returns the value of the '<em><b>Variables</b></em>' reference list.
     * The list contents are of type {@link structure.variable.EntityVariable}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Variables</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Variables</em>' reference list.
     * @see structure.pattern.PatternPackage#getEntityPattern_Variables()
     * @model
     * @generated
     */
    EList<EntityVariable> getVariables();

    /**
     * Returns the value of the '<em><b>Identity Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Identity Pattern</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Identity Pattern</em>' containment reference.
     * @see #setIdentityPattern(IdentityPattern)
     * @see structure.pattern.PatternPackage#getEntityPattern_IdentityPattern()
     * @model containment="true"
     * @generated
     */
    IdentityPattern getIdentityPattern();

    /**
     * Sets the value of the '{@link structure.pattern.EntityPattern#getIdentityPattern <em>Identity Pattern</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Identity Pattern</em>' containment reference.
     * @see #getIdentityPattern()
     * @generated
     */
    void setIdentityPattern(IdentityPattern value);

    /**
     * Returns the value of the '<em><b>Role Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Role Pattern</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Role Pattern</em>' containment reference.
     * @see #setRolePattern(RolePattern)
     * @see structure.pattern.PatternPackage#getEntityPattern_RolePattern()
     * @model containment="true"
     * @generated
     */
    RolePattern getRolePattern();

    /**
     * Sets the value of the '{@link structure.pattern.EntityPattern#getRolePattern <em>Role Pattern</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Role Pattern</em>' containment reference.
     * @see #getRolePattern()
     * @generated
     */
    void setRolePattern(RolePattern value);

    /**
     * Returns the value of the '<em><b>Container Entity Pattern</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Container Entity Pattern</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Container Entity Pattern</em>' reference.
     * @see #setContainerEntityPattern(EntityPattern)
     * @see structure.pattern.PatternPackage#getEntityPattern_ContainerEntityPattern()
     * @model
     * @generated
     */
    EntityPattern getContainerEntityPattern();

    /**
     * Sets the value of the '{@link structure.pattern.EntityPattern#getContainerEntityPattern <em>Container Entity Pattern</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Container Entity Pattern</em>' reference.
     * @see #getContainerEntityPattern()
     * @generated
     */
    void setContainerEntityPattern(EntityPattern value);

    /**
     * Returns the value of the '<em><b>Trust Pattern</b></em>' containment reference list.
     * The list contents are of type {@link trust.pattern.TrustPattern}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Trust Pattern</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Trust Pattern</em>' containment reference list.
     * @see structure.pattern.PatternPackage#getEntityPattern_TrustPattern()
     * @model containment="true"
     * @generated
     */
    EList<TrustPattern> getTrustPattern();

} // EntityPattern
