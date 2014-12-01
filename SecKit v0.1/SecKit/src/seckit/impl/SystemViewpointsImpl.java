/**
 */
package seckit.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import seckit.SeckitPackage;
import seckit.SystemDesignViewpoint;
import seckit.SystemRuntimeViewpoint;
import seckit.SystemViewpoints;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Viewpoints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link seckit.impl.SystemViewpointsImpl#getDesign <em>Design</em>}</li>
 *   <li>{@link seckit.impl.SystemViewpointsImpl#getRuntime <em>Runtime</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemViewpointsImpl extends MinimalEObjectImpl.Container implements SystemViewpoints {
    /**
     * The cached value of the '{@link #getDesign() <em>Design</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDesign()
     * @generated
     * @ordered
     */
    protected SystemDesignViewpoint design;

    /**
     * The cached value of the '{@link #getRuntime() <em>Runtime</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRuntime()
     * @generated
     * @ordered
     */
    protected SystemRuntimeViewpoint runtime;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SystemViewpointsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SeckitPackage.Literals.SYSTEM_VIEWPOINTS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SystemDesignViewpoint getDesign() {
        return design;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDesign(SystemDesignViewpoint newDesign, NotificationChain msgs) {
        SystemDesignViewpoint oldDesign = design;
        design = newDesign;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SeckitPackage.SYSTEM_VIEWPOINTS__DESIGN, oldDesign, newDesign);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDesign(SystemDesignViewpoint newDesign) {
        if (newDesign != design) {
            NotificationChain msgs = null;
            if (design != null)
                msgs = ((InternalEObject)design).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SeckitPackage.SYSTEM_VIEWPOINTS__DESIGN, null, msgs);
            if (newDesign != null)
                msgs = ((InternalEObject)newDesign).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SeckitPackage.SYSTEM_VIEWPOINTS__DESIGN, null, msgs);
            msgs = basicSetDesign(newDesign, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SeckitPackage.SYSTEM_VIEWPOINTS__DESIGN, newDesign, newDesign));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SystemRuntimeViewpoint getRuntime() {
        return runtime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRuntime(SystemRuntimeViewpoint newRuntime, NotificationChain msgs) {
        SystemRuntimeViewpoint oldRuntime = runtime;
        runtime = newRuntime;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SeckitPackage.SYSTEM_VIEWPOINTS__RUNTIME, oldRuntime, newRuntime);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRuntime(SystemRuntimeViewpoint newRuntime) {
        if (newRuntime != runtime) {
            NotificationChain msgs = null;
            if (runtime != null)
                msgs = ((InternalEObject)runtime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SeckitPackage.SYSTEM_VIEWPOINTS__RUNTIME, null, msgs);
            if (newRuntime != null)
                msgs = ((InternalEObject)newRuntime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SeckitPackage.SYSTEM_VIEWPOINTS__RUNTIME, null, msgs);
            msgs = basicSetRuntime(newRuntime, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SeckitPackage.SYSTEM_VIEWPOINTS__RUNTIME, newRuntime, newRuntime));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SeckitPackage.SYSTEM_VIEWPOINTS__DESIGN:
                return basicSetDesign(null, msgs);
            case SeckitPackage.SYSTEM_VIEWPOINTS__RUNTIME:
                return basicSetRuntime(null, msgs);
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
            case SeckitPackage.SYSTEM_VIEWPOINTS__DESIGN:
                return getDesign();
            case SeckitPackage.SYSTEM_VIEWPOINTS__RUNTIME:
                return getRuntime();
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
            case SeckitPackage.SYSTEM_VIEWPOINTS__DESIGN:
                setDesign((SystemDesignViewpoint)newValue);
                return;
            case SeckitPackage.SYSTEM_VIEWPOINTS__RUNTIME:
                setRuntime((SystemRuntimeViewpoint)newValue);
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
            case SeckitPackage.SYSTEM_VIEWPOINTS__DESIGN:
                setDesign((SystemDesignViewpoint)null);
                return;
            case SeckitPackage.SYSTEM_VIEWPOINTS__RUNTIME:
                setRuntime((SystemRuntimeViewpoint)null);
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
            case SeckitPackage.SYSTEM_VIEWPOINTS__DESIGN:
                return design != null;
            case SeckitPackage.SYSTEM_VIEWPOINTS__RUNTIME:
                return runtime != null;
        }
        return super.eIsSet(featureID);
    }

} //SystemViewpointsImpl
