/**
 */
package behavior.type;

import behavior.constraint.Constraint;

import behavior.instantiation.InteractionContributionInstantiation;

import models.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Contribution Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.type.InteractionContributionType#getInstantiations <em>Instantiations</em>}</li>
 *   <li>{@link behavior.type.InteractionContributionType#getRole <em>Role</em>}</li>
 *   <li>{@link behavior.type.InteractionContributionType#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link behavior.type.InteractionContributionType#getInteractionType <em>Interaction Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.type.TypePackage#getInteractionContributionType()
 * @model
 * @generated
 */
public interface InteractionContributionType extends Element {
    /**
     * Returns the value of the '<em><b>Instantiations</b></em>' reference list.
     * The list contents are of type {@link behavior.instantiation.InteractionContributionInstantiation}.
     * It is bidirectional and its opposite is '{@link behavior.instantiation.InteractionContributionInstantiation#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instantiations</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instantiations</em>' reference list.
     * @see behavior.type.TypePackage#getInteractionContributionType_Instantiations()
     * @see behavior.instantiation.InteractionContributionInstantiation#getType
     * @model opposite="type"
     * @generated
     */
    EList<InteractionContributionInstantiation> getInstantiations();

    /**
     * Returns the value of the '<em><b>Role</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Role</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Role</em>' attribute.
     * @see #setRole(String)
     * @see behavior.type.TypePackage#getInteractionContributionType_Role()
     * @model
     * @generated
     */
    String getRole();

    /**
     * Sets the value of the '{@link behavior.type.InteractionContributionType#getRole <em>Role</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Role</em>' attribute.
     * @see #getRole()
     * @generated
     */
    void setRole(String value);

    /**
     * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
     * The list contents are of type {@link behavior.constraint.Constraint}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Constraints</em>' containment reference list.
     * @see behavior.type.TypePackage#getInteractionContributionType_Constraints()
     * @model containment="true"
     * @generated
     */
    EList<Constraint> getConstraints();

    /**
     * Returns the value of the '<em><b>Interaction Type</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link behavior.type.InteractionType#getContributionTypes <em>Contribution Types</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interaction Type</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interaction Type</em>' container reference.
     * @see #setInteractionType(InteractionType)
     * @see behavior.type.TypePackage#getInteractionContributionType_InteractionType()
     * @see behavior.type.InteractionType#getContributionTypes
     * @model opposite="contributionTypes" required="true" transient="false"
     * @generated
     */
    InteractionType getInteractionType();

    /**
     * Sets the value of the '{@link behavior.type.InteractionContributionType#getInteractionType <em>Interaction Type</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interaction Type</em>' container reference.
     * @see #getInteractionType()
     * @generated
     */
    void setInteractionType(InteractionType value);

} // InteractionContributionType
