/**
 */
package time.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import time.DiscreteClock;
import time.TimePackage;
import time.Timestamp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete Clock</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link time.impl.DiscreteClockImpl#getStart <em>Start</em>}</li>
 *   <li>{@link time.impl.DiscreteClockImpl#getTimeStep <em>Time Step</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiscreteClockImpl extends ClockImpl implements DiscreteClock {
    /**
     * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStart()
     * @generated
     * @ordered
     */
    protected Timestamp start;

    /**
     * The default value of the '{@link #getTimeStep() <em>Time Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeStep()
     * @generated
     * @ordered
     */
    protected static final long TIME_STEP_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getTimeStep() <em>Time Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeStep()
     * @generated
     * @ordered
     */
    protected long timeStep = TIME_STEP_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DiscreteClockImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TimePackage.Literals.DISCRETE_CLOCK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Timestamp getStart() {
        return start;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStart(Timestamp newStart, NotificationChain msgs) {
        Timestamp oldStart = start;
        start = newStart;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimePackage.DISCRETE_CLOCK__START, oldStart, newStart);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStart(Timestamp newStart) {
        if (newStart != start) {
            NotificationChain msgs = null;
            if (start != null)
                msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TimePackage.DISCRETE_CLOCK__START, null, msgs);
            if (newStart != null)
                msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TimePackage.DISCRETE_CLOCK__START, null, msgs);
            msgs = basicSetStart(newStart, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TimePackage.DISCRETE_CLOCK__START, newStart, newStart));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getTimeStep() {
        return timeStep;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTimeStep(long newTimeStep) {
        long oldTimeStep = timeStep;
        timeStep = newTimeStep;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TimePackage.DISCRETE_CLOCK__TIME_STEP, oldTimeStep, timeStep));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TimePackage.DISCRETE_CLOCK__START:
                return basicSetStart(null, msgs);
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
            case TimePackage.DISCRETE_CLOCK__START:
                return getStart();
            case TimePackage.DISCRETE_CLOCK__TIME_STEP:
                return getTimeStep();
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
            case TimePackage.DISCRETE_CLOCK__START:
                setStart((Timestamp)newValue);
                return;
            case TimePackage.DISCRETE_CLOCK__TIME_STEP:
                setTimeStep((Long)newValue);
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
            case TimePackage.DISCRETE_CLOCK__START:
                setStart((Timestamp)null);
                return;
            case TimePackage.DISCRETE_CLOCK__TIME_STEP:
                setTimeStep(TIME_STEP_EDEFAULT);
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
            case TimePackage.DISCRETE_CLOCK__START:
                return start != null;
            case TimePackage.DISCRETE_CLOCK__TIME_STEP:
                return timeStep != TIME_STEP_EDEFAULT;
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
        result.append(" (timeStep: ");
        result.append(timeStep);
        result.append(')');
        return result.toString();
    }

} //DiscreteClockImpl
