/**
 */
package behavior.instantiation.impl;

import behavior.instantiation.FlowPointOfInstantiation;
import behavior.instantiation.FlowPointOfType;
import behavior.instantiation.InstantiationPackage;

import behavior.type.AbstractBehaviorType;
import behavior.type.FlowPointType;
import behavior.type.TypePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Point Of Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.instantiation.impl.FlowPointOfTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link behavior.instantiation.impl.FlowPointOfTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link behavior.instantiation.impl.FlowPointOfTypeImpl#getFlowPointsOfInstantiation <em>Flow Points Of Instantiation</em>}</li>
 *   <li>{@link behavior.instantiation.impl.FlowPointOfTypeImpl#getBehaviorType <em>Behavior Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FlowPointOfTypeImpl extends FlowPointInstantiationImpl implements FlowPointOfType {
    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected FlowPointType type;

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
     * The cached value of the '{@link #getFlowPointsOfInstantiation() <em>Flow Points Of Instantiation</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlowPointsOfInstantiation()
     * @generated
     * @ordered
     */
    protected EList<FlowPointOfInstantiation> flowPointsOfInstantiation;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FlowPointOfTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstantiationPackage.Literals.FLOW_POINT_OF_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FlowPointType getType() {
        if (type != null && type.eIsProxy()) {
            InternalEObject oldType = (InternalEObject)type;
            type = (FlowPointType)eResolveProxy(oldType);
            if (type != oldType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstantiationPackage.FLOW_POINT_OF_TYPE__TYPE, oldType, type));
            }
        }
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FlowPointType basicGetType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetType(FlowPointType newType, NotificationChain msgs) {
        FlowPointType oldType = type;
        type = newType;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstantiationPackage.FLOW_POINT_OF_TYPE__TYPE, oldType, newType);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(FlowPointType newType) {
        if (newType != type) {
            NotificationChain msgs = null;
            if (type != null)
                msgs = ((InternalEObject)type).eInverseRemove(this, TypePackage.FLOW_POINT_TYPE__INSTANTIATIONS, FlowPointType.class, msgs);
            if (newType != null)
                msgs = ((InternalEObject)newType).eInverseAdd(this, TypePackage.FLOW_POINT_TYPE__INSTANTIATIONS, FlowPointType.class, msgs);
            msgs = basicSetType(newType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.FLOW_POINT_OF_TYPE__TYPE, newType, newType));
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
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.FLOW_POINT_OF_TYPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FlowPointOfInstantiation> getFlowPointsOfInstantiation() {
        if (flowPointsOfInstantiation == null) {
            flowPointsOfInstantiation = new EObjectWithInverseResolvingEList<FlowPointOfInstantiation>(FlowPointOfInstantiation.class, this, InstantiationPackage.FLOW_POINT_OF_TYPE__FLOW_POINTS_OF_INSTANTIATION, InstantiationPackage.FLOW_POINT_OF_INSTANTIATION__FLOW_POINT_OF_TYPE);
        }
        return flowPointsOfInstantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractBehaviorType getBehaviorType() {
        if (eContainerFeatureID() != InstantiationPackage.FLOW_POINT_OF_TYPE__BEHAVIOR_TYPE) return null;
        return (AbstractBehaviorType)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBehaviorType(AbstractBehaviorType newBehaviorType, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newBehaviorType, InstantiationPackage.FLOW_POINT_OF_TYPE__BEHAVIOR_TYPE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBehaviorType(AbstractBehaviorType newBehaviorType) {
        if (newBehaviorType != eInternalContainer() || (eContainerFeatureID() != InstantiationPackage.FLOW_POINT_OF_TYPE__BEHAVIOR_TYPE && newBehaviorType != null)) {
            if (EcoreUtil.isAncestor(this, newBehaviorType))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newBehaviorType != null)
                msgs = ((InternalEObject)newBehaviorType).eInverseAdd(this, TypePackage.ABSTRACT_BEHAVIOR_TYPE__FLOW_POINTS, AbstractBehaviorType.class, msgs);
            msgs = basicSetBehaviorType(newBehaviorType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.FLOW_POINT_OF_TYPE__BEHAVIOR_TYPE, newBehaviorType, newBehaviorType));
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
            case InstantiationPackage.FLOW_POINT_OF_TYPE__TYPE:
                if (type != null)
                    msgs = ((InternalEObject)type).eInverseRemove(this, TypePackage.FLOW_POINT_TYPE__INSTANTIATIONS, FlowPointType.class, msgs);
                return basicSetType((FlowPointType)otherEnd, msgs);
            case InstantiationPackage.FLOW_POINT_OF_TYPE__FLOW_POINTS_OF_INSTANTIATION:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getFlowPointsOfInstantiation()).basicAdd(otherEnd, msgs);
            case InstantiationPackage.FLOW_POINT_OF_TYPE__BEHAVIOR_TYPE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetBehaviorType((AbstractBehaviorType)otherEnd, msgs);
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
            case InstantiationPackage.FLOW_POINT_OF_TYPE__TYPE:
                return basicSetType(null, msgs);
            case InstantiationPackage.FLOW_POINT_OF_TYPE__FLOW_POINTS_OF_INSTANTIATION:
                return ((InternalEList<?>)getFlowPointsOfInstantiation()).basicRemove(otherEnd, msgs);
            case InstantiationPackage.FLOW_POINT_OF_TYPE__BEHAVIOR_TYPE:
                return basicSetBehaviorType(null, msgs);
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
            case InstantiationPackage.FLOW_POINT_OF_TYPE__BEHAVIOR_TYPE:
                return eInternalContainer().eInverseRemove(this, TypePackage.ABSTRACT_BEHAVIOR_TYPE__FLOW_POINTS, AbstractBehaviorType.class, msgs);
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
            case InstantiationPackage.FLOW_POINT_OF_TYPE__TYPE:
                if (resolve) return getType();
                return basicGetType();
            case InstantiationPackage.FLOW_POINT_OF_TYPE__NAME:
                return getName();
            case InstantiationPackage.FLOW_POINT_OF_TYPE__FLOW_POINTS_OF_INSTANTIATION:
                return getFlowPointsOfInstantiation();
            case InstantiationPackage.FLOW_POINT_OF_TYPE__BEHAVIOR_TYPE:
                return getBehaviorType();
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
            case InstantiationPackage.FLOW_POINT_OF_TYPE__TYPE:
                setType((FlowPointType)newValue);
                return;
            case InstantiationPackage.FLOW_POINT_OF_TYPE__NAME:
                setName((String)newValue);
                return;
            case InstantiationPackage.FLOW_POINT_OF_TYPE__FLOW_POINTS_OF_INSTANTIATION:
                getFlowPointsOfInstantiation().clear();
                getFlowPointsOfInstantiation().addAll((Collection<? extends FlowPointOfInstantiation>)newValue);
                return;
            case InstantiationPackage.FLOW_POINT_OF_TYPE__BEHAVIOR_TYPE:
                setBehaviorType((AbstractBehaviorType)newValue);
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
            case InstantiationPackage.FLOW_POINT_OF_TYPE__TYPE:
                setType((FlowPointType)null);
                return;
            case InstantiationPackage.FLOW_POINT_OF_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case InstantiationPackage.FLOW_POINT_OF_TYPE__FLOW_POINTS_OF_INSTANTIATION:
                getFlowPointsOfInstantiation().clear();
                return;
            case InstantiationPackage.FLOW_POINT_OF_TYPE__BEHAVIOR_TYPE:
                setBehaviorType((AbstractBehaviorType)null);
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
            case InstantiationPackage.FLOW_POINT_OF_TYPE__TYPE:
                return type != null;
            case InstantiationPackage.FLOW_POINT_OF_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case InstantiationPackage.FLOW_POINT_OF_TYPE__FLOW_POINTS_OF_INSTANTIATION:
                return flowPointsOfInstantiation != null && !flowPointsOfInstantiation.isEmpty();
            case InstantiationPackage.FLOW_POINT_OF_TYPE__BEHAVIOR_TYPE:
                return getBehaviorType() != null;
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

} //FlowPointOfTypeImpl
