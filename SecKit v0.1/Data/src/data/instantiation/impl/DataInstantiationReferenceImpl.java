/**
 */
package data.instantiation.impl;

import data.instantiation.DataInstantiation;
import data.instantiation.DataInstantiationReference;
import data.instantiation.InstantiationPackage;

import models.impl.InstantiationReferenceImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Instantiation Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.instantiation.impl.DataInstantiationReferenceImpl#getInstantiation <em>Instantiation</em>}</li>
 *   <li>{@link data.instantiation.impl.DataInstantiationReferenceImpl#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataInstantiationReferenceImpl extends InstantiationReferenceImpl implements DataInstantiationReference {
    /**
     * The cached value of the '{@link #getInstantiation() <em>Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstantiation()
     * @generated
     * @ordered
     */
    protected DataInstantiation instantiation;

    /**
     * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChild()
     * @generated
     * @ordered
     */
    protected DataInstantiationReference child;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataInstantiationReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstantiationPackage.Literals.DATA_INSTANTIATION_REFERENCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataInstantiation getInstantiation() {
        if (instantiation != null && instantiation.eIsProxy()) {
            InternalEObject oldInstantiation = (InternalEObject)instantiation;
            instantiation = (DataInstantiation)eResolveProxy(oldInstantiation);
            if (instantiation != oldInstantiation) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstantiationPackage.DATA_INSTANTIATION_REFERENCE__INSTANTIATION, oldInstantiation, instantiation));
            }
        }
        return instantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataInstantiation basicGetInstantiation() {
        return instantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInstantiation(DataInstantiation newInstantiation) {
        DataInstantiation oldInstantiation = instantiation;
        instantiation = newInstantiation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.DATA_INSTANTIATION_REFERENCE__INSTANTIATION, oldInstantiation, instantiation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataInstantiationReference getChild() {
        return child;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetChild(DataInstantiationReference newChild, NotificationChain msgs) {
        DataInstantiationReference oldChild = child;
        child = newChild;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstantiationPackage.DATA_INSTANTIATION_REFERENCE__CHILD, oldChild, newChild);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setChild(DataInstantiationReference newChild) {
        if (newChild != child) {
            NotificationChain msgs = null;
            if (child != null)
                msgs = ((InternalEObject)child).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstantiationPackage.DATA_INSTANTIATION_REFERENCE__CHILD, null, msgs);
            if (newChild != null)
                msgs = ((InternalEObject)newChild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstantiationPackage.DATA_INSTANTIATION_REFERENCE__CHILD, null, msgs);
            msgs = basicSetChild(newChild, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.DATA_INSTANTIATION_REFERENCE__CHILD, newChild, newChild));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case InstantiationPackage.DATA_INSTANTIATION_REFERENCE__CHILD:
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
            case InstantiationPackage.DATA_INSTANTIATION_REFERENCE__INSTANTIATION:
                if (resolve) return getInstantiation();
                return basicGetInstantiation();
            case InstantiationPackage.DATA_INSTANTIATION_REFERENCE__CHILD:
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
            case InstantiationPackage.DATA_INSTANTIATION_REFERENCE__INSTANTIATION:
                setInstantiation((DataInstantiation)newValue);
                return;
            case InstantiationPackage.DATA_INSTANTIATION_REFERENCE__CHILD:
                setChild((DataInstantiationReference)newValue);
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
            case InstantiationPackage.DATA_INSTANTIATION_REFERENCE__INSTANTIATION:
                setInstantiation((DataInstantiation)null);
                return;
            case InstantiationPackage.DATA_INSTANTIATION_REFERENCE__CHILD:
                setChild((DataInstantiationReference)null);
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
            case InstantiationPackage.DATA_INSTANTIATION_REFERENCE__INSTANTIATION:
                return instantiation != null;
            case InstantiationPackage.DATA_INSTANTIATION_REFERENCE__CHILD:
                return child != null;
        }
        return super.eIsSet(featureID);
    }

} //DataInstantiationReferenceImpl
