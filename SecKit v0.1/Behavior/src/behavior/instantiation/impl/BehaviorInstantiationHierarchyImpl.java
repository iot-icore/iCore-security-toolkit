/**
 */
package behavior.instantiation.impl;

import behavior.instantiation.BehaviorInstantiationHierarchy;
import behavior.instantiation.BehaviorInstantiationReference;
import behavior.instantiation.InstantiationPackage;

import models.impl.InstantiationHierarchyImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Instantiation Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.instantiation.impl.BehaviorInstantiationHierarchyImpl#getRoot <em>Root</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviorInstantiationHierarchyImpl extends InstantiationHierarchyImpl implements BehaviorInstantiationHierarchy {
    /**
     * The cached value of the '{@link #getRoot() <em>Root</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRoot()
     * @generated
     * @ordered
     */
    protected BehaviorInstantiationReference root;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BehaviorInstantiationHierarchyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstantiationPackage.Literals.BEHAVIOR_INSTANTIATION_HIERARCHY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorInstantiationReference getRoot() {
        return root;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRoot(BehaviorInstantiationReference newRoot, NotificationChain msgs) {
        BehaviorInstantiationReference oldRoot = root;
        root = newRoot;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstantiationPackage.BEHAVIOR_INSTANTIATION_HIERARCHY__ROOT, oldRoot, newRoot);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRoot(BehaviorInstantiationReference newRoot) {
        if (newRoot != root) {
            NotificationChain msgs = null;
            if (root != null)
                msgs = ((InternalEObject)root).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstantiationPackage.BEHAVIOR_INSTANTIATION_HIERARCHY__ROOT, null, msgs);
            if (newRoot != null)
                msgs = ((InternalEObject)newRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstantiationPackage.BEHAVIOR_INSTANTIATION_HIERARCHY__ROOT, null, msgs);
            msgs = basicSetRoot(newRoot, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.BEHAVIOR_INSTANTIATION_HIERARCHY__ROOT, newRoot, newRoot));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case InstantiationPackage.BEHAVIOR_INSTANTIATION_HIERARCHY__ROOT:
                return basicSetRoot(null, msgs);
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
            case InstantiationPackage.BEHAVIOR_INSTANTIATION_HIERARCHY__ROOT:
                return getRoot();
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
            case InstantiationPackage.BEHAVIOR_INSTANTIATION_HIERARCHY__ROOT:
                setRoot((BehaviorInstantiationReference)newValue);
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
            case InstantiationPackage.BEHAVIOR_INSTANTIATION_HIERARCHY__ROOT:
                setRoot((BehaviorInstantiationReference)null);
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
            case InstantiationPackage.BEHAVIOR_INSTANTIATION_HIERARCHY__ROOT:
                return root != null;
        }
        return super.eIsSet(featureID);
    }

} //BehaviorInstantiationHierarchyImpl
