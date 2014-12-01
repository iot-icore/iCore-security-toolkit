/**
 */
package behavior.event.impl;

import behavior.event.ActivityEvent;
import behavior.event.ActivityLifecycle;
import behavior.event.EventPackage;
import identity.instance.AbstractIdentity;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.event.impl.ActivityEventImpl#getLifecycle <em>Lifecycle</em>}</li>
 *   <li>{@link behavior.event.impl.ActivityEventImpl#getIdentities <em>Identities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActivityEventImpl extends AbstractBehaviorEventImpl implements ActivityEvent {
    /**
     * The default value of the '{@link #getLifecycle() <em>Lifecycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLifecycle()
     * @generated
     * @ordered
     */
    protected static final ActivityLifecycle LIFECYCLE_EDEFAULT = ActivityLifecycle.STARTED;

    /**
     * The cached value of the '{@link #getLifecycle() <em>Lifecycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLifecycle()
     * @generated
     * @ordered
     */
    protected ActivityLifecycle lifecycle = LIFECYCLE_EDEFAULT;

    /**
     * The cached value of the '{@link #getIdentities() <em>Identities</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdentities()
     * @generated
     * @ordered
     */
    protected EList<AbstractIdentity> identities;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ActivityEventImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EventPackage.Literals.ACTIVITY_EVENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityLifecycle getLifecycle() {
        return lifecycle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLifecycle(ActivityLifecycle newLifecycle) {
        ActivityLifecycle oldLifecycle = lifecycle;
        lifecycle = newLifecycle == null ? LIFECYCLE_EDEFAULT : newLifecycle;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.ACTIVITY_EVENT__LIFECYCLE, oldLifecycle, lifecycle));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AbstractIdentity> getIdentities() {
        if (identities == null) {
            identities = new EObjectContainmentEList<AbstractIdentity>(AbstractIdentity.class, this, EventPackage.ACTIVITY_EVENT__IDENTITIES);
        }
        return identities;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EventPackage.ACTIVITY_EVENT__IDENTITIES:
                return ((InternalEList<?>)getIdentities()).basicRemove(otherEnd, msgs);
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
            case EventPackage.ACTIVITY_EVENT__LIFECYCLE:
                return getLifecycle();
            case EventPackage.ACTIVITY_EVENT__IDENTITIES:
                return getIdentities();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case EventPackage.ACTIVITY_EVENT__LIFECYCLE:
                setLifecycle((ActivityLifecycle)newValue);
                return;
            case EventPackage.ACTIVITY_EVENT__IDENTITIES:
                getIdentities().clear();
                getIdentities().addAll((Collection<? extends AbstractIdentity>)newValue);
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
            case EventPackage.ACTIVITY_EVENT__LIFECYCLE:
                setLifecycle(LIFECYCLE_EDEFAULT);
                return;
            case EventPackage.ACTIVITY_EVENT__IDENTITIES:
                getIdentities().clear();
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
            case EventPackage.ACTIVITY_EVENT__LIFECYCLE:
                return lifecycle != LIFECYCLE_EDEFAULT;
            case EventPackage.ACTIVITY_EVENT__IDENTITIES:
                return identities != null && !identities.isEmpty();
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
        result.append(" (lifecycle: ");
        result.append(lifecycle);
        result.append(')');
        return result.toString();
    }

} //ActivityEventImpl
