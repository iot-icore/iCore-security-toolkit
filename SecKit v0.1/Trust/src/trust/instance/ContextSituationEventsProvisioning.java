/**
 */
package trust.instance;

import context.pattern.ContextSituationPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Situation Events Provisioning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trust.instance.ContextSituationEventsProvisioning#isDetectSituations <em>Detect Situations</em>}</li>
 *   <li>{@link trust.instance.ContextSituationEventsProvisioning#isReportSituations <em>Report Situations</em>}</li>
 *   <li>{@link trust.instance.ContextSituationEventsProvisioning#getContextSituationPattern <em>Context Situation Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see trust.instance.InstancePackage#getContextSituationEventsProvisioning()
 * @model
 * @generated
 */
public interface ContextSituationEventsProvisioning extends DataQuality {
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
   * @see trust.instance.InstancePackage#getContextSituationEventsProvisioning_DetectSituations()
   * @model
   * @generated
   */
  boolean isDetectSituations();

  /**
   * Sets the value of the '{@link trust.instance.ContextSituationEventsProvisioning#isDetectSituations <em>Detect Situations</em>}' attribute.
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
   * @see trust.instance.InstancePackage#getContextSituationEventsProvisioning_ReportSituations()
   * @model
   * @generated
   */
  boolean isReportSituations();

  /**
   * Sets the value of the '{@link trust.instance.ContextSituationEventsProvisioning#isReportSituations <em>Report Situations</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Report Situations</em>' attribute.
   * @see #isReportSituations()
   * @generated
   */
  void setReportSituations(boolean value);

  /**
   * Returns the value of the '<em><b>Context Situation Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Context Situation Pattern</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Context Situation Pattern</em>' containment reference.
   * @see #setContextSituationPattern(ContextSituationPattern)
   * @see trust.instance.InstancePackage#getContextSituationEventsProvisioning_ContextSituationPattern()
   * @model containment="true"
   * @generated
   */
  ContextSituationPattern getContextSituationPattern();

  /**
   * Sets the value of the '{@link trust.instance.ContextSituationEventsProvisioning#getContextSituationPattern <em>Context Situation Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Context Situation Pattern</em>' containment reference.
   * @see #getContextSituationPattern()
   * @generated
   */
  void setContextSituationPattern(ContextSituationPattern value);

} // ContextSituationEventsProvisioning
