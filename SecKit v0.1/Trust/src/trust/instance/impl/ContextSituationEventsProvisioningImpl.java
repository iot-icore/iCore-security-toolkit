/**
 */
package trust.instance.impl;

import context.pattern.ContextSituationPattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import trust.instance.ContextSituationEventsProvisioning;
import trust.instance.InstancePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Situation Events Provisioning</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trust.instance.impl.ContextSituationEventsProvisioningImpl#isDetectSituations <em>Detect Situations</em>}</li>
 *   <li>{@link trust.instance.impl.ContextSituationEventsProvisioningImpl#isReportSituations <em>Report Situations</em>}</li>
 *   <li>{@link trust.instance.impl.ContextSituationEventsProvisioningImpl#getContextSituationPattern <em>Context Situation Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextSituationEventsProvisioningImpl extends DataQualityImpl implements ContextSituationEventsProvisioning {
  /**
   * The default value of the '{@link #isDetectSituations() <em>Detect Situations</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDetectSituations()
   * @generated
   * @ordered
   */
  protected static final boolean DETECT_SITUATIONS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDetectSituations() <em>Detect Situations</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDetectSituations()
   * @generated
   * @ordered
   */
  protected boolean detectSituations = DETECT_SITUATIONS_EDEFAULT;

  /**
   * The default value of the '{@link #isReportSituations() <em>Report Situations</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReportSituations()
   * @generated
   * @ordered
   */
  protected static final boolean REPORT_SITUATIONS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isReportSituations() <em>Report Situations</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReportSituations()
   * @generated
   * @ordered
   */
  protected boolean reportSituations = REPORT_SITUATIONS_EDEFAULT;

  /**
   * The cached value of the '{@link #getContextSituationPattern() <em>Context Situation Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContextSituationPattern()
   * @generated
   * @ordered
   */
  protected ContextSituationPattern contextSituationPattern;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContextSituationEventsProvisioningImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return InstancePackage.Literals.CONTEXT_SITUATION_EVENTS_PROVISIONING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDetectSituations() {
    return detectSituations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDetectSituations(boolean newDetectSituations) {
    boolean oldDetectSituations = detectSituations;
    detectSituations = newDetectSituations;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.CONTEXT_SITUATION_EVENTS_PROVISIONING__DETECT_SITUATIONS, oldDetectSituations, detectSituations));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isReportSituations() {
    return reportSituations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReportSituations(boolean newReportSituations) {
    boolean oldReportSituations = reportSituations;
    reportSituations = newReportSituations;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.CONTEXT_SITUATION_EVENTS_PROVISIONING__REPORT_SITUATIONS, oldReportSituations, reportSituations));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextSituationPattern getContextSituationPattern() {
    return contextSituationPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContextSituationPattern(ContextSituationPattern newContextSituationPattern, NotificationChain msgs) {
    ContextSituationPattern oldContextSituationPattern = contextSituationPattern;
    contextSituationPattern = newContextSituationPattern;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.CONTEXT_SITUATION_EVENTS_PROVISIONING__CONTEXT_SITUATION_PATTERN, oldContextSituationPattern, newContextSituationPattern);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContextSituationPattern(ContextSituationPattern newContextSituationPattern) {
    if (newContextSituationPattern != contextSituationPattern) {
      NotificationChain msgs = null;
      if (contextSituationPattern != null)
        msgs = ((InternalEObject)contextSituationPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstancePackage.CONTEXT_SITUATION_EVENTS_PROVISIONING__CONTEXT_SITUATION_PATTERN, null, msgs);
      if (newContextSituationPattern != null)
        msgs = ((InternalEObject)newContextSituationPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstancePackage.CONTEXT_SITUATION_EVENTS_PROVISIONING__CONTEXT_SITUATION_PATTERN, null, msgs);
      msgs = basicSetContextSituationPattern(newContextSituationPattern, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.CONTEXT_SITUATION_EVENTS_PROVISIONING__CONTEXT_SITUATION_PATTERN, newContextSituationPattern, newContextSituationPattern));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case InstancePackage.CONTEXT_SITUATION_EVENTS_PROVISIONING__CONTEXT_SITUATION_PATTERN:
        return basicSetContextSituationPattern(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case InstancePackage.CONTEXT_SITUATION_EVENTS_PROVISIONING__DETECT_SITUATIONS:
        return isDetectSituations();
      case InstancePackage.CONTEXT_SITUATION_EVENTS_PROVISIONING__REPORT_SITUATIONS:
        return isReportSituations();
      case InstancePackage.CONTEXT_SITUATION_EVENTS_PROVISIONING__CONTEXT_SITUATION_PATTERN:
        return getContextSituationPattern();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case InstancePackage.CONTEXT_SITUATION_EVENTS_PROVISIONING__DETECT_SITUATIONS:
        setDetectSituations((Boolean)newValue);
        return;
      case InstancePackage.CONTEXT_SITUATION_EVENTS_PROVISIONING__REPORT_SITUATIONS:
        setReportSituations((Boolean)newValue);
        return;
      case InstancePackage.CONTEXT_SITUATION_EVENTS_PROVISIONING__CONTEXT_SITUATION_PATTERN:
        setContextSituationPattern((ContextSituationPattern)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case InstancePackage.CONTEXT_SITUATION_EVENTS_PROVISIONING__DETECT_SITUATIONS:
        setDetectSituations(DETECT_SITUATIONS_EDEFAULT);
        return;
      case InstancePackage.CONTEXT_SITUATION_EVENTS_PROVISIONING__REPORT_SITUATIONS:
        setReportSituations(REPORT_SITUATIONS_EDEFAULT);
        return;
      case InstancePackage.CONTEXT_SITUATION_EVENTS_PROVISIONING__CONTEXT_SITUATION_PATTERN:
        setContextSituationPattern((ContextSituationPattern)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case InstancePackage.CONTEXT_SITUATION_EVENTS_PROVISIONING__DETECT_SITUATIONS:
        return detectSituations != DETECT_SITUATIONS_EDEFAULT;
      case InstancePackage.CONTEXT_SITUATION_EVENTS_PROVISIONING__REPORT_SITUATIONS:
        return reportSituations != REPORT_SITUATIONS_EDEFAULT;
      case InstancePackage.CONTEXT_SITUATION_EVENTS_PROVISIONING__CONTEXT_SITUATION_PATTERN:
        return contextSituationPattern != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (detectSituations: ");
    result.append(detectSituations);
    result.append(", reportSituations: ");
    result.append(reportSituations);
    result.append(')');
    return result.toString();
  }

} //ContextSituationEventsProvisioningImpl
