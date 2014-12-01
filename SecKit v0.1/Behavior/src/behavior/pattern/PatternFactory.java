/**
 */
package behavior.pattern;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see behavior.pattern.PatternPackage
 * @generated
 */
public interface PatternFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    PatternFactory eINSTANCE = behavior.pattern.impl.PatternFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Behavior Pattern</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Behavior Pattern</em>'.
     * @generated
     */
    BehaviorPattern createBehaviorPattern();

    /**
     * Returns a new object of class '<em>Activity Pattern</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Activity Pattern</em>'.
     * @generated
     */
    ActivityPattern createActivityPattern();

    /**
     * Returns a new object of class '<em>Action Pattern</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Action Pattern</em>'.
     * @generated
     */
    ActionPattern createActionPattern();

    /**
     * Returns a new object of class '<em>Interaction Pattern</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interaction Pattern</em>'.
     * @generated
     */
    InteractionPattern createInteractionPattern();

    /**
     * Returns a new object of class '<em>Interaction Contribution Pattern</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interaction Contribution Pattern</em>'.
     * @generated
     */
    InteractionContributionPattern createInteractionContributionPattern();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    PatternPackage getPatternPackage();

} //PatternFactory
