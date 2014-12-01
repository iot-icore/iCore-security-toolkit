/**
 */
package context.management;

import org.eclipse.emf.ecore.EObject;

import time.TimeDuration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Of Situation Provisioning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link context.management.QualityOfSituationProvisioning#isDetectSituations <em>Detect Situations</em>}</li>
 *   <li>{@link context.management.QualityOfSituationProvisioning#isReportSituations <em>Report Situations</em>}</li>
 *   <li>{@link context.management.QualityOfSituationProvisioning#isReportSituationOnTime <em>Report Situation On Time</em>}</li>
 *   <li>{@link context.management.QualityOfSituationProvisioning#getMaxDelay <em>Max Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @see context.management.ManagementPackage#getQualityOfSituationProvisioning()
 * @model
 * @generated
 */
public interface QualityOfSituationProvisioning extends EObject {
    /**
     * Returns the value of the '<em><b>Detect Situations</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Detect Situations</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Detect Situations</em>' attribute.
     * @see #setDetectSituations(boolean)
     * @see context.management.ManagementPackage#getQualityOfSituationProvisioning_DetectSituations()
     * @model
     * @generated
     */
    boolean isDetectSituations();

    /**
     * Sets the value of the '{@link context.management.QualityOfSituationProvisioning#isDetectSituations <em>Detect Situations</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Detect Situations</em>' attribute.
     * @see #isDetectSituations()
     * @generated
     */
    void setDetectSituations(boolean value);

    /**
     * Returns the value of the '<em><b>Report Situations</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Report Situations</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Report Situations</em>' attribute.
     * @see #setReportSituations(boolean)
     * @see context.management.ManagementPackage#getQualityOfSituationProvisioning_ReportSituations()
     * @model
     * @generated
     */
    boolean isReportSituations();

    /**
     * Sets the value of the '{@link context.management.QualityOfSituationProvisioning#isReportSituations <em>Report Situations</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Report Situations</em>' attribute.
     * @see #isReportSituations()
     * @generated
     */
    void setReportSituations(boolean value);

    /**
     * Returns the value of the '<em><b>Report Situation On Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Report Situation On Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Report Situation On Time</em>' attribute.
     * @see #setReportSituationOnTime(boolean)
     * @see context.management.ManagementPackage#getQualityOfSituationProvisioning_ReportSituationOnTime()
     * @model
     * @generated
     */
    boolean isReportSituationOnTime();

    /**
     * Sets the value of the '{@link context.management.QualityOfSituationProvisioning#isReportSituationOnTime <em>Report Situation On Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Report Situation On Time</em>' attribute.
     * @see #isReportSituationOnTime()
     * @generated
     */
    void setReportSituationOnTime(boolean value);

    /**
     * Returns the value of the '<em><b>Max Delay</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Delay</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Delay</em>' containment reference.
     * @see #setMaxDelay(TimeDuration)
     * @see context.management.ManagementPackage#getQualityOfSituationProvisioning_MaxDelay()
     * @model containment="true"
     * @generated
     */
    TimeDuration getMaxDelay();

    /**
     * Sets the value of the '{@link context.management.QualityOfSituationProvisioning#getMaxDelay <em>Max Delay</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Delay</em>' containment reference.
     * @see #getMaxDelay()
     * @generated
     */
    void setMaxDelay(TimeDuration value);

} // QualityOfSituationProvisioning
