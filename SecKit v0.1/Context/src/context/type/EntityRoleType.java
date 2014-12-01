/**
 */
package context.type;

import models.Element;
import models.Multiplicity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Role Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link context.type.EntityRoleType#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link context.type.EntityRoleType#getContextInformationTypes <em>Context Information Types</em>}</li>
 *   <li>{@link context.type.EntityRoleType#getContextSituationType <em>Context Situation Type</em>}</li>
 *   <li>{@link context.type.EntityRoleType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see context.type.TypePackage#getEntityRoleType()
 * @model
 * @generated
 */
public interface EntityRoleType extends Element {
    /**
     * Returns the value of the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Multiplicity</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Multiplicity</em>' containment reference.
     * @see #setMultiplicity(Multiplicity)
     * @see context.type.TypePackage#getEntityRoleType_Multiplicity()
     * @model containment="true"
     * @generated
     */
    Multiplicity getMultiplicity();

    /**
     * Sets the value of the '{@link context.type.EntityRoleType#getMultiplicity <em>Multiplicity</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Multiplicity</em>' containment reference.
     * @see #getMultiplicity()
     * @generated
     */
    void setMultiplicity(Multiplicity value);

    /**
     * Returns the value of the '<em><b>Context Information Types</b></em>' reference list.
     * The list contents are of type {@link context.type.ContextInformationType}.
     * It is bidirectional and its opposite is '{@link context.type.ContextInformationType#getSituationRoleTypes <em>Situation Role Types</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context Information Types</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context Information Types</em>' reference list.
     * @see context.type.TypePackage#getEntityRoleType_ContextInformationTypes()
     * @see context.type.ContextInformationType#getSituationRoleTypes
     * @model opposite="situationRoleTypes"
     * @generated
     */
    EList<ContextInformationType> getContextInformationTypes();

    /**
     * Returns the value of the '<em><b>Context Situation Type</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link context.type.ContextSituationType#getEntityRoleTypes <em>Entity Role Types</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context Situation Type</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context Situation Type</em>' container reference.
     * @see #setContextSituationType(ContextSituationType)
     * @see context.type.TypePackage#getEntityRoleType_ContextSituationType()
     * @see context.type.ContextSituationType#getEntityRoleTypes
     * @model opposite="entityRoleTypes" transient="false"
     * @generated
     */
    ContextSituationType getContextSituationType();

    /**
     * Sets the value of the '{@link context.type.EntityRoleType#getContextSituationType <em>Context Situation Type</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context Situation Type</em>' container reference.
     * @see #getContextSituationType()
     * @generated
     */
    void setContextSituationType(ContextSituationType value);

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
     * @see context.type.TypePackage#getEntityRoleType_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link context.type.EntityRoleType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // EntityRoleType
