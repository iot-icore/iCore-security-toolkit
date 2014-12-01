/**
 */
package structure.instance.impl;

import models.impl.InstanceHiearchyImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import structure.instance.EntityInstanceHiearchy;
import structure.instance.EntityInstanceReference;
import structure.instance.InstancePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Instance Hiearchy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link structure.instance.impl.EntityInstanceHiearchyImpl#getRoot <em>Root</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityInstanceHiearchyImpl extends InstanceHiearchyImpl implements EntityInstanceHiearchy {
    /**
     * The cached value of the '{@link #getRoot() <em>Root</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRoot()
     * @generated
     * @ordered
     */
    protected EntityInstanceReference root;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EntityInstanceHiearchyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstancePackage.Literals.ENTITY_INSTANCE_HIEARCHY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityInstanceReference getRoot() {
        return root;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRoot(EntityInstanceReference newRoot, NotificationChain msgs) {
        EntityInstanceReference oldRoot = root;
        root = newRoot;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.ENTITY_INSTANCE_HIEARCHY__ROOT, oldRoot, newRoot);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRoot(EntityInstanceReference newRoot) {
        if (newRoot != root) {
            NotificationChain msgs = null;
            if (root != null)
                msgs = ((InternalEObject)root).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstancePackage.ENTITY_INSTANCE_HIEARCHY__ROOT, null, msgs);
            if (newRoot != null)
                msgs = ((InternalEObject)newRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstancePackage.ENTITY_INSTANCE_HIEARCHY__ROOT, null, msgs);
            msgs = basicSetRoot(newRoot, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.ENTITY_INSTANCE_HIEARCHY__ROOT, newRoot, newRoot));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case InstancePackage.ENTITY_INSTANCE_HIEARCHY__ROOT:
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
            case InstancePackage.ENTITY_INSTANCE_HIEARCHY__ROOT:
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
            case InstancePackage.ENTITY_INSTANCE_HIEARCHY__ROOT:
                setRoot((EntityInstanceReference)newValue);
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
            case InstancePackage.ENTITY_INSTANCE_HIEARCHY__ROOT:
                setRoot((EntityInstanceReference)null);
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
            case InstancePackage.ENTITY_INSTANCE_HIEARCHY__ROOT:
                return root != null;
        }
        return super.eIsSet(featureID);
    }

} //EntityInstanceHiearchyImpl
