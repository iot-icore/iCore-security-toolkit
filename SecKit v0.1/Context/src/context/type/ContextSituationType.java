/**
 */
package context.type;

import context.instantiation.ContextSituationRule;

import data.instantiation.DataInstantiation;

import models.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Situation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link context.type.ContextSituationType#getEntityRoleTypes <em>Entity Role Types</em>}</li>
 *   <li>{@link context.type.ContextSituationType#getName <em>Name</em>}</li>
 *   <li>{@link context.type.ContextSituationType#getSituationRule <em>Situation Rule</em>}</li>
 *   <li>{@link context.type.ContextSituationType#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link context.type.ContextSituationType#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see context.type.TypePackage#getContextSituationType()
 * @model
 * @generated
 */
public interface ContextSituationType extends Element {
    /**
     * Returns the value of the '<em><b>Entity Role Types</b></em>' containment reference list.
     * The list contents are of type {@link context.type.EntityRoleType}.
     * It is bidirectional and its opposite is '{@link context.type.EntityRoleType#getContextSituationType <em>Context Situation Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entity Role Types</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entity Role Types</em>' containment reference list.
     * @see context.type.TypePackage#getContextSituationType_EntityRoleTypes()
     * @see context.type.EntityRoleType#getContextSituationType
     * @model opposite="contextSituationType" containment="true"
     * @generated
     */
    EList<EntityRoleType> getEntityRoleTypes();

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
     * @see context.type.TypePackage#getContextSituationType_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link context.type.ContextSituationType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Situation Rule</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Situation Rule</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Situation Rule</em>' containment reference.
     * @see #setSituationRule(ContextSituationRule)
     * @see context.type.TypePackage#getContextSituationType_SituationRule()
     * @model containment="true"
     * @generated
     */
    ContextSituationRule getSituationRule();

    /**
     * Sets the value of the '{@link context.type.ContextSituationType#getSituationRule <em>Situation Rule</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Situation Rule</em>' containment reference.
     * @see #getSituationRule()
     * @generated
     */
    void setSituationRule(ContextSituationRule value);

    /**
     * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
     * The list contents are of type {@link data.instantiation.DataInstantiation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attributes</em>' containment reference list.
     * @see context.type.TypePackage#getContextSituationType_Attributes()
     * @model containment="true"
     * @generated
     */
    EList<DataInstantiation> getAttributes();

    /**
     * Returns the value of the '<em><b>Package</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link context.type.ContextTypePackage#getSituationTypes <em>Situation Types</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Package</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Package</em>' container reference.
     * @see #setPackage(ContextTypePackage)
     * @see context.type.TypePackage#getContextSituationType_Package()
     * @see context.type.ContextTypePackage#getSituationTypes
     * @model opposite="situationTypes" transient="false"
     * @generated
     */
    ContextTypePackage getPackage();

    /**
     * Sets the value of the '{@link context.type.ContextSituationType#getPackage <em>Package</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Package</em>' container reference.
     * @see #getPackage()
     * @generated
     */
    void setPackage(ContextTypePackage value);

} // ContextSituationType
