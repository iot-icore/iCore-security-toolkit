/**
 */
package behavior.instantiation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Contribution Of Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.instantiation.InteractionContributionOfInstantiation#getBehaviorInstantiation <em>Behavior Instantiation</em>}</li>
 *   <li>{@link behavior.instantiation.InteractionContributionOfInstantiation#getDelegatedFrom <em>Delegated From</em>}</li>
 *   <li>{@link behavior.instantiation.InteractionContributionOfInstantiation#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link behavior.instantiation.InteractionContributionOfInstantiation#getContributionOfType <em>Contribution Of Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.instantiation.InstantiationPackage#getInteractionContributionOfInstantiation()
 * @model
 * @generated
 */
public interface InteractionContributionOfInstantiation extends InteractionContributionInstantiation {
    /**
     * Returns the value of the '<em><b>Behavior Instantiation</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link behavior.instantiation.BehaviorInstantiation#getContributions <em>Contributions</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Behavior Instantiation</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Behavior Instantiation</em>' container reference.
     * @see #setBehaviorInstantiation(BehaviorInstantiation)
     * @see behavior.instantiation.InstantiationPackage#getInteractionContributionOfInstantiation_BehaviorInstantiation()
     * @see behavior.instantiation.BehaviorInstantiation#getContributions
     * @model opposite="contributions" required="true" transient="false"
     * @generated
     */
    BehaviorInstantiation getBehaviorInstantiation();

    /**
     * Sets the value of the '{@link behavior.instantiation.InteractionContributionOfInstantiation#getBehaviorInstantiation <em>Behavior Instantiation</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Behavior Instantiation</em>' container reference.
     * @see #getBehaviorInstantiation()
     * @generated
     */
    void setBehaviorInstantiation(BehaviorInstantiation value);

    /**
     * Returns the value of the '<em><b>Delegated From</b></em>' reference.
     * It is bidirectional and its opposite is '{@link behavior.instantiation.DelegatedInteractionContribution#getDelegatedTo <em>Delegated To</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delegated From</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Delegated From</em>' reference.
     * @see #setDelegatedFrom(DelegatedInteractionContribution)
     * @see behavior.instantiation.InstantiationPackage#getInteractionContributionOfInstantiation_DelegatedFrom()
     * @see behavior.instantiation.DelegatedInteractionContribution#getDelegatedTo
     * @model opposite="delegatedTo"
     * @generated
     */
    DelegatedInteractionContribution getDelegatedFrom();

    /**
     * Sets the value of the '{@link behavior.instantiation.InteractionContributionOfInstantiation#getDelegatedFrom <em>Delegated From</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delegated From</em>' reference.
     * @see #getDelegatedFrom()
     * @generated
     */
    void setDelegatedFrom(DelegatedInteractionContribution value);

    /**
     * Returns the value of the '<em><b>Interaction</b></em>' reference.
     * It is bidirectional and its opposite is '{@link behavior.instantiation.InteractionInstantiation#getContributions <em>Contributions</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interaction</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interaction</em>' reference.
     * @see #setInteraction(InteractionInstantiation)
     * @see behavior.instantiation.InstantiationPackage#getInteractionContributionOfInstantiation_Interaction()
     * @see behavior.instantiation.InteractionInstantiation#getContributions
     * @model opposite="contributions"
     * @generated
     */
    InteractionInstantiation getInteraction();

    /**
     * Sets the value of the '{@link behavior.instantiation.InteractionContributionOfInstantiation#getInteraction <em>Interaction</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interaction</em>' reference.
     * @see #getInteraction()
     * @generated
     */
    void setInteraction(InteractionInstantiation value);

    /**
     * Returns the value of the '<em><b>Contribution Of Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link behavior.instantiation.AbstractInteractionContributionOfType#getContributionOfInstantiations <em>Contribution Of Instantiations</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contribution Of Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contribution Of Type</em>' reference.
     * @see #setContributionOfType(AbstractInteractionContributionOfType)
     * @see behavior.instantiation.InstantiationPackage#getInteractionContributionOfInstantiation_ContributionOfType()
     * @see behavior.instantiation.AbstractInteractionContributionOfType#getContributionOfInstantiations
     * @model opposite="contributionOfInstantiations"
     * @generated
     */
    AbstractInteractionContributionOfType getContributionOfType();

    /**
     * Sets the value of the '{@link behavior.instantiation.InteractionContributionOfInstantiation#getContributionOfType <em>Contribution Of Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Contribution Of Type</em>' reference.
     * @see #getContributionOfType()
     * @generated
     */
    void setContributionOfType(AbstractInteractionContributionOfType value);

} // InteractionContributionOfInstantiation
