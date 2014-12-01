/**
 */
package context.instance.impl;

import context.instance.Context;
import context.instance.ContextSituation;
import context.instance.EntityRole;
import context.instance.InstancePackage;

import context.type.ContextSituationType;

import java.util.Collection;

import models.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import time.TimeInterval;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Situation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link context.instance.impl.ContextSituationImpl#getType <em>Type</em>}</li>
 *   <li>{@link context.instance.impl.ContextSituationImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link context.instance.impl.ContextSituationImpl#getTimeInterval <em>Time Interval</em>}</li>
 *   <li>{@link context.instance.impl.ContextSituationImpl#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextSituationImpl extends ElementImpl implements ContextSituation {
    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected ContextSituationType type;

    /**
     * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRoles()
     * @generated
     * @ordered
     */
    protected EntityRole roles;

    /**
     * The cached value of the '{@link #getTimeInterval() <em>Time Interval</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeInterval()
     * @generated
     * @ordered
     */
    protected TimeInterval timeInterval;

    /**
     * The cached value of the '{@link #getContext() <em>Context</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContext()
     * @generated
     * @ordered
     */
    protected EList<Context> context;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ContextSituationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstancePackage.Literals.CONTEXT_SITUATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextSituationType getType() {
        if (type != null && type.eIsProxy()) {
            InternalEObject oldType = (InternalEObject)type;
            type = (ContextSituationType)eResolveProxy(oldType);
            if (type != oldType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.CONTEXT_SITUATION__TYPE, oldType, type));
            }
        }
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextSituationType basicGetType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(ContextSituationType newType) {
        ContextSituationType oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.CONTEXT_SITUATION__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityRole getRoles() {
        return roles;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRoles(EntityRole newRoles, NotificationChain msgs) {
        EntityRole oldRoles = roles;
        roles = newRoles;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.CONTEXT_SITUATION__ROLES, oldRoles, newRoles);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRoles(EntityRole newRoles) {
        if (newRoles != roles) {
            NotificationChain msgs = null;
            if (roles != null)
                msgs = ((InternalEObject)roles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstancePackage.CONTEXT_SITUATION__ROLES, null, msgs);
            if (newRoles != null)
                msgs = ((InternalEObject)newRoles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstancePackage.CONTEXT_SITUATION__ROLES, null, msgs);
            msgs = basicSetRoles(newRoles, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.CONTEXT_SITUATION__ROLES, newRoles, newRoles));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeInterval getTimeInterval() {
        return timeInterval;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTimeInterval(TimeInterval newTimeInterval, NotificationChain msgs) {
        TimeInterval oldTimeInterval = timeInterval;
        timeInterval = newTimeInterval;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.CONTEXT_SITUATION__TIME_INTERVAL, oldTimeInterval, newTimeInterval);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTimeInterval(TimeInterval newTimeInterval) {
        if (newTimeInterval != timeInterval) {
            NotificationChain msgs = null;
            if (timeInterval != null)
                msgs = ((InternalEObject)timeInterval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstancePackage.CONTEXT_SITUATION__TIME_INTERVAL, null, msgs);
            if (newTimeInterval != null)
                msgs = ((InternalEObject)newTimeInterval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstancePackage.CONTEXT_SITUATION__TIME_INTERVAL, null, msgs);
            msgs = basicSetTimeInterval(newTimeInterval, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.CONTEXT_SITUATION__TIME_INTERVAL, newTimeInterval, newTimeInterval));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Context> getContext() {
        if (context == null) {
            context = new EObjectResolvingEList<Context>(Context.class, this, InstancePackage.CONTEXT_SITUATION__CONTEXT);
        }
        return context;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case InstancePackage.CONTEXT_SITUATION__ROLES:
                return basicSetRoles(null, msgs);
            case InstancePackage.CONTEXT_SITUATION__TIME_INTERVAL:
                return basicSetTimeInterval(null, msgs);
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
            case InstancePackage.CONTEXT_SITUATION__TYPE:
                if (resolve) return getType();
                return basicGetType();
            case InstancePackage.CONTEXT_SITUATION__ROLES:
                return getRoles();
            case InstancePackage.CONTEXT_SITUATION__TIME_INTERVAL:
                return getTimeInterval();
            case InstancePackage.CONTEXT_SITUATION__CONTEXT:
                return getContext();
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
            case InstancePackage.CONTEXT_SITUATION__TYPE:
                setType((ContextSituationType)newValue);
                return;
            case InstancePackage.CONTEXT_SITUATION__ROLES:
                setRoles((EntityRole)newValue);
                return;
            case InstancePackage.CONTEXT_SITUATION__TIME_INTERVAL:
                setTimeInterval((TimeInterval)newValue);
                return;
            case InstancePackage.CONTEXT_SITUATION__CONTEXT:
                getContext().clear();
                getContext().addAll((Collection<? extends Context>)newValue);
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
            case InstancePackage.CONTEXT_SITUATION__TYPE:
                setType((ContextSituationType)null);
                return;
            case InstancePackage.CONTEXT_SITUATION__ROLES:
                setRoles((EntityRole)null);
                return;
            case InstancePackage.CONTEXT_SITUATION__TIME_INTERVAL:
                setTimeInterval((TimeInterval)null);
                return;
            case InstancePackage.CONTEXT_SITUATION__CONTEXT:
                getContext().clear();
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
            case InstancePackage.CONTEXT_SITUATION__TYPE:
                return type != null;
            case InstancePackage.CONTEXT_SITUATION__ROLES:
                return roles != null;
            case InstancePackage.CONTEXT_SITUATION__TIME_INTERVAL:
                return timeInterval != null;
            case InstancePackage.CONTEXT_SITUATION__CONTEXT:
                return context != null && !context.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ContextSituationImpl
