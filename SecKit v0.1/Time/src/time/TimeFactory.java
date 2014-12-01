/**
 */
package time;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see time.TimePackage
 * @generated
 */
public interface TimeFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TimeFactory eINSTANCE = time.impl.TimeFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Timestamp</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Timestamp</em>'.
     * @generated
     */
    Timestamp createTimestamp();

    /**
     * Returns a new object of class '<em>Timestamp Precision</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Timestamp Precision</em>'.
     * @generated
     */
    TimestampPrecision createTimestampPrecision();

    /**
     * Returns a new object of class '<em>Interval</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interval</em>'.
     * @generated
     */
    TimeInterval createTimeInterval();

    /**
     * Returns a new object of class '<em>Duration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Duration</em>'.
     * @generated
     */
    TimeDuration createTimeDuration();

    /**
     * Returns a new object of class '<em>Discrete Clock</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Discrete Clock</em>'.
     * @generated
     */
    DiscreteClock createDiscreteClock();

    /**
     * Returns a new object of class '<em>Timestamp Pattern</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Timestamp Pattern</em>'.
     * @generated
     */
    TimestampPattern createTimestampPattern();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    TimePackage getTimePackage();

} //TimeFactory
