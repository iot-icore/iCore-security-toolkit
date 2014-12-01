/**
 */
package behavior.instantiation.impl;

import behavior.instantiation.BehaviorInstantiation;
import behavior.instantiation.FlowPointOfInstantiation;
import behavior.instantiation.FlowPointOfType;
import behavior.instantiation.InstantiationPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Point Of Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.instantiation.impl.FlowPointOfInstantiationImpl#getFlowPointOfType <em>Flow Point Of Type</em>}</li>
 *   <li>{@link behavior.instantiation.impl.FlowPointOfInstantiationImpl#getBehaviorInstantiation <em>Behavior Instantiation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FlowPointOfInstantiationImpl extends FlowPointInstantiationImpl implements FlowPointOfInstantiation {
    /**
     * The cached value of the '{@link #getFlowPointOfType() <em>Flow Point Of Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlowPointOfType()
     * @generated
     * @ordered
     */
    protected FlowPointOfType flowPointOfType;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FlowPointOfInstantiationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstantiationPackage.Literals.FLOW_POINT_OF_INSTANTIATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FlowPointOfType getFlowPointOfType() {
        if (flowPointOfType != null && flowPointOfType.eIsProxy()) {
            InternalEObject oldFlowPointOfType = (InternalEObject)flowPointOfType;
            flowPointOfType = (FlowPointOfType)eResolveProxy(oldFlowPointOfType);
            if (flowPointOfType != oldFlowPointOfType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstantiationPackage.FLOW_POINT_OF_INSTANTIATION__FLOW_POINT_OF_TYPE, oldFlowPointOfType, flowPointOfType));
            }
        }
        return flowPointOfType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FlowPointOfType basicGetFlowPointOfType() {
        return flowPointOfType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFlowPointOfType(FlowPointOfType newFlowPointOfType, NotificationChain msgs) {
        FlowPointOfType oldFlowPointOfType = flowPointOfType;
        flowPointOfType = newFlowPointOfType;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstantiationPackage.FLOW_POINT_OF_INSTANTIATION__FLOW_POINT_OF_TYPE, oldFlowPointOfType, newFlowPointOfType);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFlowPointOfType(FlowPointOfType newFlowPointOfType) {
        if (newFlowPointOfType != flowPointOfType) {
            NotificationChain msgs = null;
            if (flowPointOfType != null)
                msgs = ((InternalEObject)flowPointOfType).eInverseRemove(this, InstantiationPackage.FLOW_POINT_OF_TYPE__FLOW_POINTS_OF_INSTANTIATION, FlowPointOfType.class, msgs);
            if (newFlowPointOfType != null)
                msgs = ((InternalEObject)newFlowPointOfType).eInverseAdd(this, InstantiationPackage.FLOW_POINT_OF_TYPE__FLOW_POINTS_OF_INSTANTIATION, FlowPointOfType.class, msgs);
            msgs = basicSetFlowPointOfType(newFlowPointOfType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.FLOW_POINT_OF_INSTANTIATION__FLOW_POINT_OF_TYPE, newFlowPointOfType, newFlowPointOfType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorInstantiation getBehaviorInstantiation() {
        if (eContainerFeatureID() != InstantiationPackage.FLOW_POINT_OF_INSTANTIATION__BEHAVIOR_INSTANTIATION) return null;
        return (BehaviorInstantiation)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBehaviorInstantiation(BehaviorInstantiation newBehaviorInstantiation, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newBehaviorInstantiation, InstantiationPackage.FLOW_POINT_OF_INSTANTIATION__BEHAVIOR_INSTANTIATION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBehaviorInstantiation(BehaviorInstantiation newBehaviorInstantiation) {
        if (newBehaviorInstantiation != eInternalContainer() || (eContainerFeatureID() != InstantiationPackage.FLOW_POINT_OF_INSTANTIATION__BEHAVIOR_INSTANTIATION && newBehaviorInstantiation != null)) {
            if (EcoreUtil.isAncestor(this, newBehaviorInstantiation))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newBehaviorInstantiation != null)
                msgs = ((InternalEObject)newBehaviorInstantiation).eInverseAdd(this, InstantiationPackage.BEHAVIOR_INSTANTIATION__FLOW_POINTS, BehaviorInstantiation.class, msgs);
            msgs = basicSetBehaviorInstantiation(newBehaviorInstantiation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.FLOW_POINT_OF_INSTANTIATION__BEHAVIOR_INSTANTIATION, newBehaviorInstantiation, newBehaviorInstantiation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case InstantiationPackage.FLOW_POINT_OF_INSTANTIATION__FLOW_POINT_OF_TYPE:
                if (flowPointOfType != null)
                    msgs = ((InternalEObject)flowPointOfType).eInverseRemove(this, InstantiationPackage.FLOW_POINT_OF_TYPE__FLOW_POINTS_OF_INSTANTIATION, FlowPointOfType.class, msgs);
                return basicSetFlowPointOfType((FlowPointOfType)otherEnd, msgs);
            case InstantiationPackage.FLOW_POINT_OF_INSTANTIATION__BEHAVIOR_INSTANTIATION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetBehaviorInstantiation((BehaviorInstantiation)otherEnd, msgs);
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
            case InstantiationPackage.FLOW_POINT_OF_INSTANTIATION__FLOW_POINT_OF_TYPE:
                return basicSetFlowPointOfType(null, msgs);
            case InstantiationPackage.FLOW_POINT_OF_INSTANTIATION__BEHAVIOR_INSTANTIATION:
                return basicSetBehaviorInstantiation(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case InstantiationPackage.FLOW_POINT_OF_INSTANTIATION__BEHAVIOR_INSTANTIATION:
                return eInternalContainer().eInverseRemove(this, InstantiationPackage.BEHAVIOR_INSTANTIATION__FLOW_POINTS, BehaviorInstantiation.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case InstantiationPackage.FLOW_POINT_OF_INSTANTIATION__FLOW_POINT_OF_TYPE:
                if (resolve) return getFlowPointOfType();
                return basicGetFlowPointOfType();
            case InstantiationPackage.FLOW_POINT_OF_INSTANTIATION__BEHAVIOR_INSTANTIATION:
                return getBehaviorInstantiation();
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
            case InstantiationPackage.FLOW_POINT_OF_INSTANTIATION__FLOW_POINT_OF_TYPE:
                setFlowPointOfType((FlowPointOfType)newValue);
                return;
            case InstantiationPackage.FLOW_POINT_OF_INSTANTIATION__BEHAVIOR_INSTANTIATION:
                setBehaviorInstantiation((BehaviorInstantiation)newValue);
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
            case InstantiationPackage.FLOW_POINT_OF_INSTANTIATION__FLOW_POINT_OF_TYPE:
                setFlowPointOfType((FlowPointOfType)null);
                return;
            case InstantiationPackage.FLOW_POINT_OF_INSTANTIATION__BEHAVIOR_INSTANTIATION:
                setBehaviorInstantiation((BehaviorInstantiation)null);
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
            case InstantiationPackage.FLOW_POINT_OF_INSTANTIATION__FLOW_POINT_OF_TYPE:
                return flowPointOfType != null;
            case InstantiationPackage.FLOW_POINT_OF_INSTANTIATION__BEHAVIOR_INSTANTIATION:
                return getBehaviorInstantiation() != null;
        }
        return super.eIsSet(featureID);
    }

} //FlowPointOfInstantiationImpl
