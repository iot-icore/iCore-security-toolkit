/**
 */
package behavior.instantiation;

import behavior.type.AbstractBehaviorType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Interaction Contribution Of Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.instantiation.AbstractInteractionContributionOfType#getBehaviorType <em>Behavior Type</em>}</li>
 *   <li>{@link behavior.instantiation.AbstractInteractionContributionOfType#getContributionOfInstantiations <em>Contribution Of Instantiations</em>}</li>
 *   <li>{@link behavior.instantiation.AbstractInteractionContributionOfType#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.instantiation.InstantiationPackage#getAbstractInteractionContributionOfType()
 * @model abstract="true"
 * @generated
 */
public interface AbstractInteractionContributionOfType extends InteractionContributionInstantiation {
    /**
     * Returns the value of the '<em><b>Behavior Type</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link behavior.type.AbstractBehaviorType#getContributions <em>Contributions</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Behavior Type</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Behavior Type</em>' container reference.
     * @see #setBehaviorType(AbstractBehaviorType)
     * @see behavior.instantiation.InstantiationPackage#getAbstractInteractionContributionOfType_BehaviorType()
     * @see behavior.type.AbstractBehaviorType#getContributions
     * @model opposite="contributions" required="true" transient="false"
     * @generated
     */
    AbstractBehaviorType getBehaviorType();

    /**
     * Sets the value of the '{@link behavior.instantiation.AbstractInteractionContributionOfType#getBehaviorType <em>Behavior Type</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Behavior Type</em>' container reference.
     * @see #getBehaviorType()
     * @generated
     */
    void setBehaviorType(AbstractBehaviorType value);

    /**
     * Returns the value of the '<em><b>Contribution Of Instantiations</b></em>' reference list.
     * The list contents are of type {@link behavior.instantiation.InteractionContributionOfInstantiation}.
     * It is bidirectional and its opposite is '{@link behavior.instantiation.InteractionContributionOfInstantiation#getContributionOfType <em>Contribution Of Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contribution Of Instantiations</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contribution Of Instantiations</em>' reference list.
     * @see behavior.instantiation.InstantiationPackage#getAbstractInteractionContributionOfType_ContributionOfInstantiations()
     * @see behavior.instantiation.InteractionContributionOfInstantiation#getContributionOfType
     * @model opposite="contributionOfType"
     * @generated
     */
    EList<InteractionContributionOfInstantiation> getContributionOfInstantiations();

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
     * @see behavior.instantiation.InstantiationPackage#getAbstractInteractionContributionOfType_Role()
     * @model
     * @generated
     */
    String getRole();

    /**
     * Sets the value of the '{@link behavior.instantiation.AbstractInteractionContributionOfType#getRole <em>Role</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Role</em>' attribute.
     * @see #getRole()
     * @generated
     */
    void setRole(String value);

} // AbstractInteractionContributionOfType
