/**
 */
package context.type;

import models.Element;
import models.Multiplicity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Situation Role Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link context.type.SituationRoleType#getContextSituationType <em>Context Situation Type</em>}</li>
 *   <li>{@link context.type.SituationRoleType#getName <em>Name</em>}</li>
 *   <li>{@link context.type.SituationRoleType#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 * </p>
 *
 * @see context.type.TypePackage#getSituationRoleType()
 * @model
 * @generated
 */
public interface SituationRoleType extends Element {
    /**
     * Returns the value of the '<em><b>Context Situation Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context Situation Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context Situation Type</em>' reference.
     * @see #setContextSituationType(ContextSituationType)
     * @see context.type.TypePackage#getSituationRoleType_ContextSituationType()
     * @model required="true"
     * @generated
     */
    ContextSituationType getContextSituationType();

    /**
     * Sets the value of the '{@link context.type.SituationRoleType#getContextSituationType <em>Context Situation Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context Situation Type</em>' reference.
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
     * @see context.type.TypePackage#getSituationRoleType_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link context.type.SituationRoleType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

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
     * @see context.type.TypePackage#getSituationRoleType_Multiplicity()
     * @model containment="true"
     * @generated
     */
    Multiplicity getMultiplicity();

    /**
     * Sets the value of the '{@link context.type.SituationRoleType#getMultiplicity <em>Multiplicity</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Multiplicity</em>' containment reference.
     * @see #getMultiplicity()
     * @generated
     */
    void setMultiplicity(Multiplicity value);

} // SituationRoleType
