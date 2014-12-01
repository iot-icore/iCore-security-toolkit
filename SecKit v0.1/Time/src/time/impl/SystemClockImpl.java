/**
 */
package time.impl;

import org.eclipse.emf.ecore.EClass;

import time.SystemClock;
import time.TimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Clock</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class SystemClockImpl extends ClockImpl implements SystemClock {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SystemClockImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TimePackage.Literals.SYSTEM_CLOCK;
    }

} //SystemClockImpl
