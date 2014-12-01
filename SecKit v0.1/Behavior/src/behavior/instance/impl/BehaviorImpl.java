/**
 */
package behavior.instance.impl;

import behavior.instance.Activity;
import behavior.instance.Behavior;
import behavior.instance.FlowPoint;
import behavior.instance.InstancePackage;
import behavior.instance.InteractionContribution;

import behavior.instantiation.BehaviorInstantiation;
import behavior.instantiation.InstantiationPackage;

import behavior.type.AbstractBehaviorType;
import behavior.type.TypePackage;

import java.util.Collection;

import models.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import structure.instance.Entity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.instance.impl.BehaviorImpl#getActivities <em>Activities</em>}</li>
 *   <li>{@link behavior.instance.impl.BehaviorImpl#getInstantiation <em>Instantiation</em>}</li>
 *   <li>{@link behavior.instance.impl.BehaviorImpl#getFlowPoints <em>Flow Points</em>}</li>
 *   <li>{@link behavior.instance.impl.BehaviorImpl#getContainedInstances <em>Contained Instances</em>}</li>
 *   <li>{@link behavior.instance.impl.BehaviorImpl#getType <em>Type</em>}</li>
 *   <li>{@link behavior.instance.impl.BehaviorImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link behavior.instance.impl.BehaviorImpl#getContributions <em>Contributions</em>}</li>
 *   <li>{@link behavior.instance.impl.BehaviorImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviorImpl extends ElementImpl implements Behavior {
    /**
     * The cached value of the '{@link #getActivities() <em>Activities</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActivities()
     * @generated
     * @ordered
     */
    protected EList<Activity> activities;

    /**
     * The cached value of the '{@link #getInstantiation() <em>Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstantiation()
     * @generated
     * @ordered
     */
    protected BehaviorInstantiation instantiation;

    /**
     * The cached value of the '{@link #getFlowPoints() <em>Flow Points</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlowPoints()
     * @generated
     * @ordered
     */
    protected EList<FlowPoint> flowPoints;

    /**
     * The cached value of the '{@link #getContainedInstances() <em>Contained Instances</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContainedInstances()
     * @generated
     * @ordered
     */
    protected EList<Behavior> containedInstances;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected AbstractBehaviorType type;

    /**
     * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntity()
     * @generated
     * @ordered
     */
    protected Entity entity;

    /**
     * The cached value of the '{@link #getContributions() <em>Contributions</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContributions()
     * @generated
     * @ordered
     */
    protected EList<InteractionContribution> contributions;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BehaviorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstancePackage.Literals.BEHAVIOR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Activity> getActivities() {
        if (activities == null) {
            activities = new EObjectContainmentWithInverseEList<Activity>(Activity.class, this, InstancePackage.BEHAVIOR__ACTIVITIES, InstancePackage.ACTIVITY__BEHAVIOR);
        }
        return activities;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorInstantiation getInstantiation() {
        if (instantiation != null && instantiation.eIsProxy()) {
            InternalEObject oldInstantiation = (InternalEObject)instantiation;
            instantiation = (BehaviorInstantiation)eResolveProxy(oldInstantiation);
            if (instantiation != oldInstantiation) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.BEHAVIOR__INSTANTIATION, oldInstantiation, instantiation));
            }
        }
        return instantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorInstantiation basicGetInstantiation() {
        return instantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInstantiation(BehaviorInstantiation newInstantiation, NotificationChain msgs) {
        BehaviorInstantiation oldInstantiation = instantiation;
        instantiation = newInstantiation;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.BEHAVIOR__INSTANTIATION, oldInstantiation, newInstantiation);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInstantiation(BehaviorInstantiation newInstantiation) {
        if (newInstantiation != instantiation) {
            NotificationChain msgs = null;
            if (instantiation != null)
                msgs = ((InternalEObject)instantiation).eInverseRemove(this, InstantiationPackage.BEHAVIOR_INSTANTIATION__INSTANCES, BehaviorInstantiation.class, msgs);
            if (newInstantiation != null)
                msgs = ((InternalEObject)newInstantiation).eInverseAdd(this, InstantiationPackage.BEHAVIOR_INSTANTIATION__INSTANCES, BehaviorInstantiation.class, msgs);
            msgs = basicSetInstantiation(newInstantiation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.BEHAVIOR__INSTANTIATION, newInstantiation, newInstantiation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FlowPoint> getFlowPoints() {
        if (flowPoints == null) {
            flowPoints = new EObjectContainmentEList<FlowPoint>(FlowPoint.class, this, InstancePackage.BEHAVIOR__FLOW_POINTS);
        }
        return flowPoints;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Behavior> getContainedInstances() {
        if (containedInstances == null) {
            containedInstances = new EObjectContainmentEList<Behavior>(Behavior.class, this, InstancePackage.BEHAVIOR__CONTAINED_INSTANCES);
        }
        return containedInstances;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractBehaviorType getType() {
        if (type != null && type.eIsProxy()) {
            InternalEObject oldType = (InternalEObject)type;
            type = (AbstractBehaviorType)eResolveProxy(oldType);
            if (type != oldType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.BEHAVIOR__TYPE, oldType, type));
            }
        }
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractBehaviorType basicGetType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetType(AbstractBehaviorType newType, NotificationChain msgs) {
        AbstractBehaviorType oldType = type;
        type = newType;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.BEHAVIOR__TYPE, oldType, newType);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(AbstractBehaviorType newType) {
        if (newType != type) {
            NotificationChain msgs = null;
            if (type != null)
                msgs = ((InternalEObject)type).eInverseRemove(this, TypePackage.ABSTRACT_BEHAVIOR_TYPE__INSTANCES, AbstractBehaviorType.class, msgs);
            if (newType != null)
                msgs = ((InternalEObject)newType).eInverseAdd(this, TypePackage.ABSTRACT_BEHAVIOR_TYPE__INSTANCES, AbstractBehaviorType.class, msgs);
            msgs = basicSetType(newType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.BEHAVIOR__TYPE, newType, newType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Entity getEntity() {
        if (entity != null && entity.eIsProxy()) {
            InternalEObject oldEntity = (InternalEObject)entity;
            entity = (Entity)eResolveProxy(oldEntity);
            if (entity != oldEntity) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.BEHAVIOR__ENTITY, oldEntity, entity));
            }
        }
        return entity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Entity basicGetEntity() {
        return entity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEntity(Entity newEntity) {
        Entity oldEntity = entity;
        entity = newEntity;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.BEHAVIOR__ENTITY, oldEntity, entity));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InteractionContribution> getContributions() {
        if (contributions == null) {
            contributions = new EObjectContainmentEList<InteractionContribution>(InteractionContribution.class, this, InstancePackage.BEHAVIOR__CONTRIBUTIONS);
        }
        return contributions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.BEHAVIOR__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case InstancePackage.BEHAVIOR__ACTIVITIES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivities()).basicAdd(otherEnd, msgs);
            case InstancePackage.BEHAVIOR__INSTANTIATION:
                if (instantiation != null)
                    msgs = ((InternalEObject)instantiation).eInverseRemove(this, InstantiationPackage.BEHAVIOR_INSTANTIATION__INSTANCES, BehaviorInstantiation.class, msgs);
                return basicSetInstantiation((BehaviorInstantiation)otherEnd, msgs);
            case InstancePackage.BEHAVIOR__TYPE:
                if (type != null)
                    msgs = ((InternalEObject)type).eInverseRemove(this, TypePackage.ABSTRACT_BEHAVIOR_TYPE__INSTANCES, AbstractBehaviorType.class, msgs);
                return basicSetType((AbstractBehaviorType)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case InstancePackage.BEHAVIOR__ACTIVITIES:
                return ((InternalEList<?>)getActivities()).basicRemove(otherEnd, msgs);
            case InstancePackage.BEHAVIOR__INSTANTIATION:
                return basicSetInstantiation(null, msgs);
            case InstancePackage.BEHAVIOR__FLOW_POINTS:
                return ((InternalEList<?>)getFlowPoints()).basicRemove(otherEnd, msgs);
            case InstancePackage.BEHAVIOR__CONTAINED_INSTANCES:
                return ((InternalEList<?>)getContainedInstances()).basicRemove(otherEnd, msgs);
            case InstancePackage.BEHAVIOR__TYPE:
                return basicSetType(null, msgs);
            case InstancePackage.BEHAVIOR__CONTRIBUTIONS:
                return ((InternalEList<?>)getContributions()).basicRemove(otherEnd, msgs);
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
            case InstancePackage.BEHAVIOR__ACTIVITIES:
                return getActivities();
            case InstancePackage.BEHAVIOR__INSTANTIATION:
                if (resolve) return getInstantiation();
                return basicGetInstantiation();
            case InstancePackage.BEHAVIOR__FLOW_POINTS:
                return getFlowPoints();
            case InstancePackage.BEHAVIOR__CONTAINED_INSTANCES:
                return getContainedInstances();
            case InstancePackage.BEHAVIOR__TYPE:
                if (resolve) return getType();
                return basicGetType();
            case InstancePackage.BEHAVIOR__ENTITY:
                if (resolve) return getEntity();
                return basicGetEntity();
            case InstancePackage.BEHAVIOR__CONTRIBUTIONS:
                return getContributions();
            case InstancePackage.BEHAVIOR__NAME:
                return getName();
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
            case InstancePackage.BEHAVIOR__ACTIVITIES:
                getActivities().clear();
                getActivities().addAll((Collection<? extends Activity>)newValue);
                return;
            case InstancePackage.BEHAVIOR__INSTANTIATION:
                setInstantiation((BehaviorInstantiation)newValue);
                return;
            case InstancePackage.BEHAVIOR__FLOW_POINTS:
                getFlowPoints().clear();
                getFlowPoints().addAll((Collection<? extends FlowPoint>)newValue);
                return;
            case InstancePackage.BEHAVIOR__CONTAINED_INSTANCES:
                getContainedInstances().clear();
                getContainedInstances().addAll((Collection<? extends Behavior>)newValue);
                return;
            case InstancePackage.BEHAVIOR__TYPE:
                setType((AbstractBehaviorType)newValue);
                return;
            case InstancePackage.BEHAVIOR__ENTITY:
                setEntity((Entity)newValue);
                return;
            case InstancePackage.BEHAVIOR__CONTRIBUTIONS:
                getContributions().clear();
                getContributions().addAll((Collection<? extends InteractionContribution>)newValue);
                return;
            case InstancePackage.BEHAVIOR__NAME:
                setName((String)newValue);
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
            case InstancePackage.BEHAVIOR__ACTIVITIES:
                getActivities().clear();
                return;
            case InstancePackage.BEHAVIOR__INSTANTIATION:
                setInstantiation((BehaviorInstantiation)null);
                return;
            case InstancePackage.BEHAVIOR__FLOW_POINTS:
                getFlowPoints().clear();
                return;
            case InstancePackage.BEHAVIOR__CONTAINED_INSTANCES:
                getContainedInstances().clear();
                return;
            case InstancePackage.BEHAVIOR__TYPE:
                setType((AbstractBehaviorType)null);
                return;
            case InstancePackage.BEHAVIOR__ENTITY:
                setEntity((Entity)null);
                return;
            case InstancePackage.BEHAVIOR__CONTRIBUTIONS:
                getContributions().clear();
                return;
            case InstancePackage.BEHAVIOR__NAME:
                setName(NAME_EDEFAULT);
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
            case InstancePackage.BEHAVIOR__ACTIVITIES:
                return activities != null && !activities.isEmpty();
            case InstancePackage.BEHAVIOR__INSTANTIATION:
                return instantiation != null;
            case InstancePackage.BEHAVIOR__FLOW_POINTS:
                return flowPoints != null && !flowPoints.isEmpty();
            case InstancePackage.BEHAVIOR__CONTAINED_INSTANCES:
                return containedInstances != null && !containedInstances.isEmpty();
            case InstancePackage.BEHAVIOR__TYPE:
                return type != null;
            case InstancePackage.BEHAVIOR__ENTITY:
                return entity != null;
            case InstancePackage.BEHAVIOR__CONTRIBUTIONS:
                return contributions != null && !contributions.isEmpty();
            case InstancePackage.BEHAVIOR__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
        result.append(" (name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //BehaviorImpl
