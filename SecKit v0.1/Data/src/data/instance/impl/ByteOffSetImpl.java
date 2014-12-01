/**
 */
package data.instance.impl;

import data.instance.ByteOffSet;
import data.instance.InstancePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Byte Off Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.instance.impl.ByteOffSetImpl#getStart <em>Start</em>}</li>
 *   <li>{@link data.instance.impl.ByteOffSetImpl#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ByteOffSetImpl extends PartialDataImpl implements ByteOffSet {
    /**
     * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStart()
     * @generated
     * @ordered
     */
    protected static final long START_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStart()
     * @generated
     * @ordered
     */
    protected long start = START_EDEFAULT;

    /**
     * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnd()
     * @generated
     * @ordered
     */
    protected static final long END_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnd()
     * @generated
     * @ordered
     */
    protected long end = END_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ByteOffSetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstancePackage.Literals.BYTE_OFF_SET;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getStart() {
        return start;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStart(long newStart) {
        long oldStart = start;
        start = newStart;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.BYTE_OFF_SET__START, oldStart, start));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getEnd() {
        return end;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEnd(long newEnd) {
        long oldEnd = end;
        end = newEnd;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.BYTE_OFF_SET__END, oldEnd, end));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case InstancePackage.BYTE_OFF_SET__START:
                return getStart();
            case InstancePackage.BYTE_OFF_SET__END:
                return getEnd();
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
            case InstancePackage.BYTE_OFF_SET__START:
                setStart((Long)newValue);
                return;
            case InstancePackage.BYTE_OFF_SET__END:
                setEnd((Long)newValue);
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
            case InstancePackage.BYTE_OFF_SET__START:
                setStart(START_EDEFAULT);
                return;
            case InstancePackage.BYTE_OFF_SET__END:
                setEnd(END_EDEFAULT);
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
            case InstancePackage.BYTE_OFF_SET__START:
                return start != START_EDEFAULT;
            case InstancePackage.BYTE_OFF_SET__END:
                return end != END_EDEFAULT;
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
        result.append(" (start: ");
        result.append(start);
        result.append(", end: ");
        result.append(end);
        result.append(')');
        return result.toString();
    }

} //ByteOffSetImpl
