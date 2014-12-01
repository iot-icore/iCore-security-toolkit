/**
 */
package behavior.pattern;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.pattern.InteractionPattern#getContributionPatterns <em>Contribution Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.pattern.PatternPackage#getInteractionPattern()
 * @model
 * @generated
 */
public interface InteractionPattern extends ActivityPattern {
    /**
     * Returns the value of the '<em><b>Contribution Patterns</b></em>' containment reference list.
     * The list contents are of type {@link behavior.pattern.InteractionContributionPattern}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contribution Patterns</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contribution Patterns</em>' containment reference list.
     * @see behavior.pattern.PatternPackage#getInteractionPattern_ContributionPatterns()
     * @model containment="true"
     * @generated
     */
    EList<InteractionContributionPattern> getContributionPatterns();

} // InteractionPattern
