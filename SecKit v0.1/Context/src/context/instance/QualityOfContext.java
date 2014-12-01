/**
 */
package context.instance;

import models.Element;

import time.TimeDuration;
import time.TimestampPrecision;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Of Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link context.instance.QualityOfContext#getDeclaredPrecision <em>Declared Precision</em>}</li>
 *   <li>{@link context.instance.QualityOfContext#getImplicitPrecision <em>Implicit Precision</em>}</li>
 *   <li>{@link context.instance.QualityOfContext#getTimestampPrecision <em>Timestamp Precision</em>}</li>
 *   <li>{@link context.instance.QualityOfContext#getRefreshRate <em>Refresh Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @see context.instance.InstancePackage#getQualityOfContext()
 * @model
 * @generated
 */
public interface QualityOfContext extends Element {
    /**
     * Returns the value of the '<em><b>Declared Precision</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Declared Precision</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Declared Precision</em>' containment reference.
     * @see #setDeclaredPrecision(Precision)
     * @see context.instance.InstancePackage#getQualityOfContext_DeclaredPrecision()
     * @model containment="true"
     * @generated
     */
    Precision getDeclaredPrecision();

    /**
     * Sets the value of the '{@link context.instance.QualityOfContext#getDeclaredPrecision <em>Declared Precision</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Declared Precision</em>' containment reference.
     * @see #getDeclaredPrecision()
     * @generated
     */
    void setDeclaredPrecision(Precision value);

    /**
     * Returns the value of the '<em><b>Implicit Precision</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Implicit Precision</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Implicit Precision</em>' containment reference.
     * @see #setImplicitPrecision(Precision)
     * @see context.instance.InstancePackage#getQualityOfContext_ImplicitPrecision()
     * @model containment="true"
     * @generated
     */
    Precision getImplicitPrecision();

    /**
     * Sets the value of the '{@link context.instance.QualityOfContext#getImplicitPrecision <em>Implicit Precision</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Implicit Precision</em>' containment reference.
     * @see #getImplicitPrecision()
     * @generated
     */
    void setImplicitPrecision(Precision value);

    /**
     * Returns the value of the '<em><b>Timestamp Precision</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Timestamp Precision</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Timestamp Precision</em>' containment reference.
     * @see #setTimestampPrecision(TimestampPrecision)
     * @see context.instance.InstancePackage#getQualityOfContext_TimestampPrecision()
     * @model containment="true"
     * @generated
     */
    TimestampPrecision getTimestampPrecision();

    /**
     * Sets the value of the '{@link context.instance.QualityOfContext#getTimestampPrecision <em>Timestamp Precision</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Timestamp Precision</em>' containment reference.
     * @see #getTimestampPrecision()
     * @generated
     */
    void setTimestampPrecision(TimestampPrecision value);

    /**
     * Returns the value of the '<em><b>Refresh Rate</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Refresh Rate</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refresh Rate</em>' containment reference.
     * @see #setRefreshRate(TimeDuration)
     * @see context.instance.InstancePackage#getQualityOfContext_RefreshRate()
     * @model containment="true"
     * @generated
     */
    TimeDuration getRefreshRate();

    /**
     * Sets the value of the '{@link context.instance.QualityOfContext#getRefreshRate <em>Refresh Rate</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refresh Rate</em>' containment reference.
     * @see #getRefreshRate()
     * @generated
     */
    void setRefreshRate(TimeDuration value);

} // QualityOfContext
