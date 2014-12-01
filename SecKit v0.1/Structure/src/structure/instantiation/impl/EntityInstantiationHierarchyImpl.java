/**
 */
package structure.instantiation.impl;

import models.impl.InstantiationHierarchyImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import structure.instantiation.EntityInstantiationHierarchy;
import structure.instantiation.EntityInstantiationReference;
import structure.instantiation.InstantiationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Instantiation Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link structure.instantiation.impl.EntityInstantiationHierarchyImpl#getRoot <em>Root</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityInstantiationHierarchyImpl extends InstantiationHierarchyImpl implements EntityInstantiationHierarchy {
    /**
     * The cached value of the '{@link #getRoot() <em>Root</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRoot()
     * @generated
     * @ordered
     */
    protected EntityInstantiationReference root;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EntityInstantiationHierarchyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstantiationPackage.Literals.ENTITY_INSTANTIATION_HIERARCHY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityInstantiationReference getRoot() {
        return root;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRoot(EntityInstantiationReference newRoot, NotificationChain msgs) {
        EntityInstantiationReference oldRoot = root;
        root = newRoot;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstantiationPackage.ENTITY_INSTANTIATION_HIERARCHY__ROOT, oldRoot, newRoot);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRoot(EntityInstantiationReference newRoot) {
        if (newRoot != root) {
            NotificationChain msgs = null;
            if (root != null)
                msgs = ((InternalEObject)root).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstantiationPackage.ENTITY_INSTANTIATION_HIERARCHY__ROOT, null, msgs);
            if (newRoot != null)
                msgs = ((InternalEObject)newRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstantiationPackage.ENTITY_INSTANTIATION_HIERARCHY__ROOT, null, msgs);
            msgs = basicSetRoot(newRoot, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.ENTITY_INSTANTIATION_HIERARCHY__ROOT, newRoot, newRoot));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case InstantiationPackage.ENTITY_INSTANTIATION_HIERARCHY__ROOT:
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
            case InstantiationPackage.ENTITY_INSTANTIATION_HIERARCHY__ROOT:
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
            case InstantiationPackage.ENTITY_INSTANTIATION_HIERARCHY__ROOT:
                setRoot((EntityInstantiationReference)newValue);
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
            case InstantiationPackage.ENTITY_INSTANTIATION_HIERARCHY__ROOT:
                setRoot((EntityInstantiationReference)null);
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
            case InstantiationPackage.ENTITY_INSTANTIATION_HIERARCHY__ROOT:
                return root != null;
        }
        return super.eIsSet(featureID);
    }

} //EntityInstantiationHierarchyImpl
