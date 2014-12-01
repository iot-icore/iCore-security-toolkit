/**
 */
package time;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete Clock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link time.DiscreteClock#getStart <em>Start</em>}</li>
 *   <li>{@link time.DiscreteClock#getTimeStep <em>Time Step</em>}</li>
 * </ul>
 * </p>
 *
 * @see time.TimePackage#getDiscreteClock()
 * @model
 * @generated
 */
public interface DiscreteClock extends Clock {
    /**
     * Returns the value of the '<em><b>Start</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Start</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Start</em>' containment reference.
     * @see #setStart(Timestamp)
     * @see time.TimePackage#getDiscreteClock_Start()
     * @model containment="true" required="true"
     * @generated
     */
    Timestamp getStart();

    /**
     * Sets the value of the '{@link time.DiscreteClock#getStart <em>Start</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Start</em>' containment reference.
     * @see #getStart()
     * @generated
     */
    void setStart(Timestamp value);

    /**
     * Returns the value of the '<em><b>Time Step</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time Step</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time Step</em>' attribute.
     * @see #setTimeStep(long)
     * @see time.TimePackage#getDiscreteClock_TimeStep()
     * @model
     * @generated
     */
    long getTimeStep();

    /**
     * Sets the value of the '{@link time.DiscreteClock#getTimeStep <em>Time Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time Step</em>' attribute.
     * @see #getTimeStep()
     * @generated
     */
    void setTimeStep(long value);

} // DiscreteClock
