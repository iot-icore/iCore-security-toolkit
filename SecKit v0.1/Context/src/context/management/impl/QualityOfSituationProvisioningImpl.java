/**
 */
package context.management.impl;

import context.management.ManagementPackage;
import context.management.QualityOfSituationProvisioning;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import time.TimeDuration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality Of Situation Provisioning</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link context.management.impl.QualityOfSituationProvisioningImpl#isDetectSituations <em>Detect Situations</em>}</li>
 *   <li>{@link context.management.impl.QualityOfSituationProvisioningImpl#isReportSituations <em>Report Situations</em>}</li>
 *   <li>{@link context.management.impl.QualityOfSituationProvisioningImpl#isReportSituationOnTime <em>Report Situation On Time</em>}</li>
 *   <li>{@link context.management.impl.QualityOfSituationProvisioningImpl#getMaxDelay <em>Max Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QualityOfSituationProvisioningImpl extends MinimalEObjectImpl.Container implements QualityOfSituationProvisioning {
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
     * The default value of the '{@link #isReportSituationOnTime() <em>Report Situation On Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isReportSituationOnTime()
     * @generated
     * @ordered
     */
    protected static final boolean REPORT_SITUATION_ON_TIME_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isReportSituationOnTime() <em>Report Situation On Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isReportSituationOnTime()
     * @generated
     * @ordered
     */
    protected boolean reportSituationOnTime = REPORT_SITUATION_ON_TIME_EDEFAULT;

    /**
     * The cached value of the '{@link #getMaxDelay() <em>Max Delay</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxDelay()
     * @generated
     * @ordered
     */
    protected TimeDuration maxDelay;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected QualityOfSituationProvisioningImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ManagementPackage.Literals.QUALITY_OF_SITUATION_PROVISIONING;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ManagementPackage.QUALITY_OF_SITUATION_PROVISIONING__DETECT_SITUATIONS, oldDetectSituations, detectSituations));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ManagementPackage.QUALITY_OF_SITUATION_PROVISIONING__REPORT_SITUATIONS, oldReportSituations, reportSituations));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isReportSituationOnTime() {
        return reportSituationOnTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReportSituationOnTime(boolean newReportSituationOnTime) {
        boolean oldReportSituationOnTime = reportSituationOnTime;
        reportSituationOnTime = newReportSituationOnTime;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ManagementPackage.QUALITY_OF_SITUATION_PROVISIONING__REPORT_SITUATION_ON_TIME, oldReportSituationOnTime, reportSituationOnTime));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeDuration getMaxDelay() {
        return maxDelay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMaxDelay(TimeDuration newMaxDelay, NotificationChain msgs) {
        TimeDuration oldMaxDelay = maxDelay;
        maxDelay = newMaxDelay;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ManagementPackage.QUALITY_OF_SITUATION_PROVISIONING__MAX_DELAY, oldMaxDelay, newMaxDelay);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaxDelay(TimeDuration newMaxDelay) {
        if (newMaxDelay != maxDelay) {
            NotificationChain msgs = null;
            if (maxDelay != null)
                msgs = ((InternalEObject)maxDelay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ManagementPackage.QUALITY_OF_SITUATION_PROVISIONING__MAX_DELAY, null, msgs);
            if (newMaxDelay != null)
                msgs = ((InternalEObject)newMaxDelay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ManagementPackage.QUALITY_OF_SITUATION_PROVISIONING__MAX_DELAY, null, msgs);
            msgs = basicSetMaxDelay(newMaxDelay, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ManagementPackage.QUALITY_OF_SITUATION_PROVISIONING__MAX_DELAY, newMaxDelay, newMaxDelay));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ManagementPackage.QUALITY_OF_SITUATION_PROVISIONING__MAX_DELAY:
                return basicSetMaxDelay(null, msgs);
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
            case ManagementPackage.QUALITY_OF_SITUATION_PROVISIONING__DETECT_SITUATIONS:
                return isDetectSituations();
            case ManagementPackage.QUALITY_OF_SITUATION_PROVISIONING__REPORT_SITUATIONS:
                return isReportSituations();
            case ManagementPackage.QUALITY_OF_SITUATION_PROVISIONING__REPORT_SITUATION_ON_TIME:
                return isReportSituationOnTime();
            case ManagementPackage.QUALITY_OF_SITUATION_PROVISIONING__MAX_DELAY:
                return getMaxDelay();
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
            case ManagementPackage.QUALITY_OF_SITUATION_PROVISIONING__DETECT_SITUATIONS:
                setDetectSituations((Boolean)newValue);
                return;
            case ManagementPackage.QUALITY_OF_SITUATION_PROVISIONING__REPORT_SITUATIONS:
                setReportSituations((Boolean)newValue);
                return;
            case ManagementPackage.QUALITY_OF_SITUATION_PROVISIONING__REPORT_SITUATION_ON_TIME:
                setReportSituationOnTime((Boolean)newValue);
                return;
            case ManagementPackage.QUALITY_OF_SITUATION_PROVISIONING__MAX_DELAY:
                setMaxDelay((TimeDuration)newValue);
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
            case ManagementPackage.QUALITY_OF_SITUATION_PROVISIONING__DETECT_SITUATIONS:
                setDetectSituations(DETECT_SITUATIONS_EDEFAULT);
                return;
            case ManagementPackage.QUALITY_OF_SITUATION_PROVISIONING__REPORT_SITUATIONS:
                setReportSituations(REPORT_SITUATIONS_EDEFAULT);
                return;
            case ManagementPackage.QUALITY_OF_SITUATION_PROVISIONING__REPORT_SITUATION_ON_TIME:
                setReportSituationOnTime(REPORT_SITUATION_ON_TIME_EDEFAULT);
                return;
            case ManagementPackage.QUALITY_OF_SITUATION_PROVISIONING__MAX_DELAY:
                setMaxDelay((TimeDuration)null);
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
            case ManagementPackage.QUALITY_OF_SITUATION_PROVISIONING__DETECT_SITUATIONS:
                return detectSituations != DETECT_SITUATIONS_EDEFAULT;
            case ManagementPackage.QUALITY_OF_SITUATION_PROVISIONING__REPORT_SITUATIONS:
                return reportSituations != REPORT_SITUATIONS_EDEFAULT;
            case ManagementPackage.QUALITY_OF_SITUATION_PROVISIONING__REPORT_SITUATION_ON_TIME:
                return reportSituationOnTime != REPORT_SITUATION_ON_TIME_EDEFAULT;
            case ManagementPackage.QUALITY_OF_SITUATION_PROVISIONING__MAX_DELAY:
                return maxDelay != null;
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
        result.append(", reportSituationOnTime: ");
        result.append(reportSituationOnTime);
        result.append(')');
        return result.toString();
    }

} //QualityOfSituationProvisioningImpl
