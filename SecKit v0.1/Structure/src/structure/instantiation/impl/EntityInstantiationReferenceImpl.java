/**
 */
package structure.instantiation.impl;

import models.impl.InstantiationReferenceImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import structure.instantiation.EntityInstantiation;
import structure.instantiation.EntityInstantiationReference;
import structure.instantiation.InstantiationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Instantiation Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link structure.instantiation.impl.EntityInstantiationReferenceImpl#getInstantiation <em>Instantiation</em>}</li>
 *   <li>{@link structure.instantiation.impl.EntityInstantiationReferenceImpl#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityInstantiationReferenceImpl extends InstantiationReferenceImpl implements EntityInstantiationReference {
    /**
     * The cached value of the '{@link #getInstantiation() <em>Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstantiation()
     * @generated
     * @ordered
     */
    protected EntityInstantiation instantiation;

    /**
     * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChild()
     * @generated
     * @ordered
     */
    protected EntityInstantiationReference child;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EntityInstantiationReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstantiationPackage.Literals.ENTITY_INSTANTIATION_REFERENCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityInstantiation getInstantiation() {
        if (instantiation != null && instantiation.eIsProxy()) {
            InternalEObject oldInstantiation = (InternalEObject)instantiation;
            instantiation = (EntityInstantiation)eResolveProxy(oldInstantiation);
            if (instantiation != oldInstantiation) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstantiationPackage.ENTITY_INSTANTIATION_REFERENCE__INSTANTIATION, oldInstantiation, instantiation));
            }
        }
        return instantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityInstantiation basicGetInstantiation() {
        return instantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInstantiation(EntityInstantiation newInstantiation) {
        EntityInstantiation oldInstantiation = instantiation;
        instantiation = newInstantiation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.ENTITY_INSTANTIATION_REFERENCE__INSTANTIATION, oldInstantiation, instantiation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityInstantiationReference getChild() {
        return child;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetChild(EntityInstantiationReference newChild, NotificationChain msgs) {
        EntityInstantiationReference oldChild = child;
        child = newChild;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstantiationPackage.ENTITY_INSTANTIATION_REFERENCE__CHILD, oldChild, newChild);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setChild(EntityInstantiationReference newChild) {
        if (newChild != child) {
            NotificationChain msgs = null;
            if (child != null)
                msgs = ((InternalEObject)child).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstantiationPackage.ENTITY_INSTANTIATION_REFERENCE__CHILD, null, msgs);
            if (newChild != null)
                msgs = ((InternalEObject)newChild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstantiationPackage.ENTITY_INSTANTIATION_REFERENCE__CHILD, null, msgs);
            msgs = basicSetChild(newChild, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.ENTITY_INSTANTIATION_REFERENCE__CHILD, newChild, newChild));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case InstantiationPackage.ENTITY_INSTANTIATION_REFERENCE__CHILD:
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
            case InstantiationPackage.ENTITY_INSTANTIATION_REFERENCE__INSTANTIATION:
                if (resolve) return getInstantiation();
                return basicGetInstantiation();
            case InstantiationPackage.ENTITY_INSTANTIATION_REFERENCE__CHILD:
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
            case InstantiationPackage.ENTITY_INSTANTIATION_REFERENCE__INSTANTIATION:
                setInstantiation((EntityInstantiation)newValue);
                return;
            case InstantiationPackage.ENTITY_INSTANTIATION_REFERENCE__CHILD:
                setChild((EntityInstantiationReference)newValue);
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
            case InstantiationPackage.ENTITY_INSTANTIATION_REFERENCE__INSTANTIATION:
                setInstantiation((EntityInstantiation)null);
                return;
            case InstantiationPackage.ENTITY_INSTANTIATION_REFERENCE__CHILD:
                setChild((EntityInstantiationReference)null);
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
            case InstantiationPackage.ENTITY_INSTANTIATION_REFERENCE__INSTANTIATION:
                return instantiation != null;
            case InstantiationPackage.ENTITY_INSTANTIATION_REFERENCE__CHILD:
                return child != null;
        }
        return super.eIsSet(featureID);
    }

} //EntityInstantiationReferenceImpl
