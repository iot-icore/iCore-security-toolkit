/**
 */
package behavior.instantiation.impl;

import behavior.instantiation.BehaviorInstantiationReference;
import behavior.instantiation.InstantiationPackage;

import models.impl.InstantiationReferenceImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Instantiation Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.instantiation.impl.BehaviorInstantiationReferenceImpl#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BehaviorInstantiationReferenceImpl extends InstantiationReferenceImpl implements BehaviorInstantiationReference {
    /**
     * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChild()
     * @generated
     * @ordered
     */
    protected BehaviorInstantiationReference child;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BehaviorInstantiationReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstantiationPackage.Literals.BEHAVIOR_INSTANTIATION_REFERENCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorInstantiationReference getChild() {
        return child;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetChild(BehaviorInstantiationReference newChild, NotificationChain msgs) {
        BehaviorInstantiationReference oldChild = child;
        child = newChild;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstantiationPackage.BEHAVIOR_INSTANTIATION_REFERENCE__CHILD, oldChild, newChild);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setChild(BehaviorInstantiationReference newChild) {
        if (newChild != child) {
            NotificationChain msgs = null;
            if (child != null)
                msgs = ((InternalEObject)child).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstantiationPackage.BEHAVIOR_INSTANTIATION_REFERENCE__CHILD, null, msgs);
            if (newChild != null)
                msgs = ((InternalEObject)newChild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstantiationPackage.BEHAVIOR_INSTANTIATION_REFERENCE__CHILD, null, msgs);
            msgs = basicSetChild(newChild, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.BEHAVIOR_INSTANTIATION_REFERENCE__CHILD, newChild, newChild));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case InstantiationPackage.BEHAVIOR_INSTANTIATION_REFERENCE__CHILD:
                return basicSetChild(null, msgs);
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
            case InstantiationPackage.BEHAVIOR_INSTANTIATION_REFERENCE__CHILD:
                return getChild();
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
            case InstantiationPackage.BEHAVIOR_INSTANTIATION_REFERENCE__CHILD:
                setChild((BehaviorInstantiationReference)newValue);
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
            case InstantiationPackage.BEHAVIOR_INSTANTIATION_REFERENCE__CHILD:
                setChild((BehaviorInstantiationReference)null);
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
            case InstantiationPackage.BEHAVIOR_INSTANTIATION_REFERENCE__CHILD:
                return child != null;
        }
        return super.eIsSet(featureID);
    }

} //BehaviorInstantiationReferenceImpl
