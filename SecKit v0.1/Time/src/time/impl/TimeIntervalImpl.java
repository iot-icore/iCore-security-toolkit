/**
 */
package time.impl;

import models.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import time.TimeDuration;
import time.TimeInterval;
import time.TimePackage;
import time.Timestamp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link time.impl.TimeIntervalImpl#getBegin <em>Begin</em>}</li>
 *   <li>{@link time.impl.TimeIntervalImpl#getEnd <em>End</em>}</li>
 *   <li>{@link time.impl.TimeIntervalImpl#getDuration <em>Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeIntervalImpl extends ElementImpl implements TimeInterval {
    /**
     * The cached value of the '{@link #getBegin() <em>Begin</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBegin()
     * @generated
     * @ordered
     */
    protected Timestamp begin;

    /**
     * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnd()
     * @generated
     * @ordered
     */
    protected Timestamp end;

    /**
     * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDuration()
     * @generated
     * @ordered
     */
    protected TimeDuration duration;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TimeIntervalImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TimePackage.Literals.TIME_INTERVAL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Timestamp getBegin() {
        return begin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBegin(Timestamp newBegin, NotificationChain msgs) {
        Timestamp oldBegin = begin;
        begin = newBegin;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimePackage.TIME_INTERVAL__BEGIN, oldBegin, newBegin);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBegin(Timestamp newBegin) {
        if (newBegin != begin) {
            NotificationChain msgs = null;
            if (begin != null)
                msgs = ((InternalEObject)begin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TimePackage.TIME_INTERVAL__BEGIN, null, msgs);
            if (newBegin != null)
                msgs = ((InternalEObject)newBegin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TimePackage.TIME_INTERVAL__BEGIN, null, msgs);
            msgs = basicSetBegin(newBegin, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TimePackage.TIME_INTERVAL__BEGIN, newBegin, newBegin));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Timestamp getEnd() {
        return end;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEnd(Timestamp newEnd, NotificationChain msgs) {
        Timestamp oldEnd = end;
        end = newEnd;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimePackage.TIME_INTERVAL__END, oldEnd, newEnd);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEnd(Timestamp newEnd) {
        if (newEnd != end) {
            NotificationChain msgs = null;
            if (end != null)
                msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TimePackage.TIME_INTERVAL__END, null, msgs);
            if (newEnd != null)
                msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TimePackage.TIME_INTERVAL__END, null, msgs);
            msgs = basicSetEnd(newEnd, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TimePackage.TIME_INTERVAL__END, newEnd, newEnd));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeDuration getDuration() {
        return duration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDuration(TimeDuration newDuration, NotificationChain msgs) {
        TimeDuration oldDuration = duration;
        duration = newDuration;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimePackage.TIME_INTERVAL__DURATION, oldDuration, newDuration);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDuration(TimeDuration newDuration) {
        if (newDuration != duration) {
            NotificationChain msgs = null;
            if (duration != null)
                msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TimePackage.TIME_INTERVAL__DURATION, null, msgs);
            if (newDuration != null)
                msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TimePackage.TIME_INTERVAL__DURATION, null, msgs);
            msgs = basicSetDuration(newDuration, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TimePackage.TIME_INTERVAL__DURATION, newDuration, newDuration));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TimePackage.TIME_INTERVAL__BEGIN:
                return basicSetBegin(null, msgs);
            case TimePackage.TIME_INTERVAL__END:
                return basicSetEnd(null, msgs);
            case TimePackage.TIME_INTERVAL__DURATION:
                return basicSetDuration(null, msgs);
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
            case TimePackage.TIME_INTERVAL__BEGIN:
                return getBegin();
            case TimePackage.TIME_INTERVAL__END:
                return getEnd();
            case TimePackage.TIME_INTERVAL__DURATION:
                return getDuration();
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
            case TimePackage.TIME_INTERVAL__BEGIN:
                setBegin((Timestamp)newValue);
                return;
            case TimePackage.TIME_INTERVAL__END:
                setEnd((Timestamp)newValue);
                return;
            case TimePackage.TIME_INTERVAL__DURATION:
                setDuration((TimeDuration)newValue);
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
            case TimePackage.TIME_INTERVAL__BEGIN:
                setBegin((Timestamp)null);
                return;
            case TimePackage.TIME_INTERVAL__END:
                setEnd((Timestamp)null);
                return;
            case TimePackage.TIME_INTERVAL__DURATION:
                setDuration((TimeDuration)null);
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
            case TimePackage.TIME_INTERVAL__BEGIN:
                return begin != null;
            case TimePackage.TIME_INTERVAL__END:
                return end != null;
            case TimePackage.TIME_INTERVAL__DURATION:
                return duration != null;
        }
        return super.eIsSet(featureID);
    }

} //TimeIntervalImpl
