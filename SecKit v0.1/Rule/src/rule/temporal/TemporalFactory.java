/**
 */
package rule.temporal;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see rule.temporal.TemporalPackage
 * @generated
 */
public interface TemporalFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TemporalFactory eINSTANCE = rule.temporal.impl.TemporalFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Always</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Always</em>'.
     * @generated
     */
    Always createAlways();

    /**
     * Returns a new object of class '<em>Since</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Since</em>'.
     * @generated
     */
    Since createSince();

    /**
     * Returns a new object of class '<em>Before</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Before</em>'.
     * @generated
     */
    Before createBefore();

    /**
     * Returns a new object of class '<em>Within</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Within</em>'.
     * @generated
     */
    Within createWithin();

    /**
     * Returns a new object of class '<em>During</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>During</em>'.
     * @generated
     */
    During createDuring();

    /**
     * Returns a new object of class '<em>Eventually</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Eventually</em>'.
     * @generated
     */
    Eventually createEventually();

    /**
     * Returns a new object of class '<em>Repeat Limit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Repeat Limit</em>'.
     * @generated
     */
    RepeatLimit createRepeatLimit();

    /**
     * Returns a new object of class '<em>Repeat Since</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Repeat Since</em>'.
     * @generated
     */
    RepeatSince createRepeatSince();

    /**
     * Returns a new object of class '<em>Repeat Maximum</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Repeat Maximum</em>'.
     * @generated
     */
    RepeatMaximum createRepeatMaximum();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    TemporalPackage getTemporalPackage();

} //TemporalFactory
