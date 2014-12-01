/**
 */
package behavior.trust;

import behavior.type.ActivityType;
import behavior.type.InteractionContributionType;

import trust.instance.TrustAspect;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Quality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.trust.BehaviorQuality#getActivityType <em>Activity Type</em>}</li>
 *   <li>{@link behavior.trust.BehaviorQuality#getContributionType <em>Contribution Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.trust.TrustPackage#getBehaviorQuality()
 * @model abstract="true"
 * @generated
 */
public interface BehaviorQuality extends TrustAspect {
    /**
     * Returns the value of the '<em><b>Activity Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Activity Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Activity Type</em>' reference.
     * @see #setActivityType(ActivityType)
     * @see behavior.trust.TrustPackage#getBehaviorQuality_ActivityType()
     * @model
     * @generated
     */
    ActivityType getActivityType();

    /**
     * Sets the value of the '{@link behavior.trust.BehaviorQuality#getActivityType <em>Activity Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Activity Type</em>' reference.
     * @see #getActivityType()
     * @generated
     */
    void setActivityType(ActivityType value);

    /**
     * Returns the value of the '<em><b>Contribution Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contribution Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contribution Type</em>' reference.
     * @see #setContributionType(InteractionContributionType)
     * @see behavior.trust.TrustPackage#getBehaviorQuality_ContributionType()
     * @model
     * @generated
     */
    InteractionContributionType getContributionType();

    /**
     * Sets the value of the '{@link behavior.trust.BehaviorQuality#getContributionType <em>Contribution Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Contribution Type</em>' reference.
     * @see #getContributionType()
     * @generated
     */
    void setContributionType(InteractionContributionType value);

} // BehaviorQuality
