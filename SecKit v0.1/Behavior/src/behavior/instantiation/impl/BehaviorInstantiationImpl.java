/**
 */
package behavior.instantiation.impl;

import behavior.instance.Behavior;
import behavior.instance.InstancePackage;

import behavior.instantiation.BehaviorInstantiation;
import behavior.instantiation.FlowPointOfInstantiation;
import behavior.instantiation.InstantiationPackage;
import behavior.instantiation.InteractionContributionOfInstantiation;

import behavior.type.AbstractBehaviorType;
import behavior.type.StructuredBehaviorType;
import behavior.type.TypePackage;

import java.util.Collection;

import models.impl.ElementImpl;

import models.variable.VariableAssignment;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import structure.instantiation.EntityInstantiation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.instantiation.impl.BehaviorInstantiationImpl#getType <em>Type</em>}</li>
 *   <li>{@link behavior.instantiation.impl.BehaviorInstantiationImpl#getContributions <em>Contributions</em>}</li>
 *   <li>{@link behavior.instantiation.impl.BehaviorInstantiationImpl#getContainerType <em>Container Type</em>}</li>
 *   <li>{@link behavior.instantiation.impl.BehaviorInstantiationImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link behavior.instantiation.impl.BehaviorInstantiationImpl#getFlowPoints <em>Flow Points</em>}</li>
 *   <li>{@link behavior.instantiation.impl.BehaviorInstantiationImpl#getVariableAssignments <em>Variable Assignments</em>}</li>
 *   <li>{@link behavior.instantiation.impl.BehaviorInstantiationImpl#getName <em>Name</em>}</li>
 *   <li>{@link behavior.instantiation.impl.BehaviorInstantiationImpl#getEntityInstantiation <em>Entity Instantiation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviorInstantiationImpl extends ElementImpl implements BehaviorInstantiation {
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
     * The cached value of the '{@link #getContributions() <em>Contributions</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContributions()
     * @generated
     * @ordered
     */
    protected EList<InteractionContributionOfInstantiation> contributions;

    /**
     * The cached value of the '{@link #getInstances() <em>Instances</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstances()
     * @generated
     * @ordered
     */
    protected EList<Behavior> instances;

    /**
     * The cached value of the '{@link #getFlowPoints() <em>Flow Points</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlowPoints()
     * @generated
     * @ordered
     */
    protected EList<FlowPointOfInstantiation> flowPoints;

    /**
     * The cached value of the '{@link #getVariableAssignments() <em>Variable Assignments</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariableAssignments()
     * @generated
     * @ordered
     */
    protected EList<VariableAssignment> variableAssignments;

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
     * The cached value of the '{@link #getEntityInstantiation() <em>Entity Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntityInstantiation()
     * @generated
     * @ordered
     */
    protected EntityInstantiation entityInstantiation;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BehaviorInstantiationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstantiationPackage.Literals.BEHAVIOR_INSTANTIATION;
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstantiationPackage.BEHAVIOR_INSTANTIATION__TYPE, oldType, type));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstantiationPackage.BEHAVIOR_INSTANTIATION__TYPE, oldType, newType);
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
                msgs = ((InternalEObject)type).eInverseRemove(this, TypePackage.ABSTRACT_BEHAVIOR_TYPE__INSTANTIATIONS, AbstractBehaviorType.class, msgs);
            if (newType != null)
                msgs = ((InternalEObject)newType).eInverseAdd(this, TypePackage.ABSTRACT_BEHAVIOR_TYPE__INSTANTIATIONS, AbstractBehaviorType.class, msgs);
            msgs = basicSetType(newType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.BEHAVIOR_INSTANTIATION__TYPE, newType, newType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InteractionContributionOfInstantiation> getContributions() {
        if (contributions == null) {
            contributions = new EObjectContainmentWithInverseEList<InteractionContributionOfInstantiation>(InteractionContributionOfInstantiation.class, this, InstantiationPackage.BEHAVIOR_INSTANTIATION__CONTRIBUTIONS, InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__BEHAVIOR_INSTANTIATION);
        }
        return contributions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StructuredBehaviorType getContainerType() {
        if (eContainerFeatureID() != InstantiationPackage.BEHAVIOR_INSTANTIATION__CONTAINER_TYPE) return null;
        return (StructuredBehaviorType)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetContainerType(StructuredBehaviorType newContainerType, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newContainerType, InstantiationPackage.BEHAVIOR_INSTANTIATION__CONTAINER_TYPE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContainerType(StructuredBehaviorType newContainerType) {
        if (newContainerType != eInternalContainer() || (eContainerFeatureID() != InstantiationPackage.BEHAVIOR_INSTANTIATION__CONTAINER_TYPE && newContainerType != null)) {
            if (EcoreUtil.isAncestor(this, newContainerType))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newContainerType != null)
                msgs = ((InternalEObject)newContainerType).eInverseAdd(this, TypePackage.STRUCTURED_BEHAVIOR_TYPE__CONTAINED_INSTANTIATIONS, StructuredBehaviorType.class, msgs);
            msgs = basicSetContainerType(newContainerType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.BEHAVIOR_INSTANTIATION__CONTAINER_TYPE, newContainerType, newContainerType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Behavior> getInstances() {
        if (instances == null) {
            instances = new EObjectWithInverseResolvingEList<Behavior>(Behavior.class, this, InstantiationPackage.BEHAVIOR_INSTANTIATION__INSTANCES, InstancePackage.BEHAVIOR__INSTANTIATION);
        }
        return instances;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FlowPointOfInstantiation> getFlowPoints() {
        if (flowPoints == null) {
            flowPoints = new EObjectContainmentWithInverseEList<FlowPointOfInstantiation>(FlowPointOfInstantiation.class, this, InstantiationPackage.BEHAVIOR_INSTANTIATION__FLOW_POINTS, InstantiationPackage.FLOW_POINT_OF_INSTANTIATION__BEHAVIOR_INSTANTIATION);
        }
        return flowPoints;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<VariableAssignment> getVariableAssignments() {
        if (variableAssignments == null) {
            variableAssignments = new EObjectContainmentEList<VariableAssignment>(VariableAssignment.class, this, InstantiationPackage.BEHAVIOR_INSTANTIATION__VARIABLE_ASSIGNMENTS);
        }
        return variableAssignments;
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
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.BEHAVIOR_INSTANTIATION__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityInstantiation getEntityInstantiation() {
        if (entityInstantiation != null && entityInstantiation.eIsProxy()) {
            InternalEObject oldEntityInstantiation = (InternalEObject)entityInstantiation;
            entityInstantiation = (EntityInstantiation)eResolveProxy(oldEntityInstantiation);
            if (entityInstantiation != oldEntityInstantiation) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstantiationPackage.BEHAVIOR_INSTANTIATION__ENTITY_INSTANTIATION, oldEntityInstantiation, entityInstantiation));
            }
        }
        return entityInstantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityInstantiation basicGetEntityInstantiation() {
        return entityInstantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEntityInstantiation(EntityInstantiation newEntityInstantiation) {
        EntityInstantiation oldEntityInstantiation = entityInstantiation;
        entityInstantiation = newEntityInstantiation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.BEHAVIOR_INSTANTIATION__ENTITY_INSTANTIATION, oldEntityInstantiation, entityInstantiation));
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
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__TYPE:
                if (type != null)
                    msgs = ((InternalEObject)type).eInverseRemove(this, TypePackage.ABSTRACT_BEHAVIOR_TYPE__INSTANTIATIONS, AbstractBehaviorType.class, msgs);
                return basicSetType((AbstractBehaviorType)otherEnd, msgs);
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__CONTRIBUTIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getContributions()).basicAdd(otherEnd, msgs);
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__CONTAINER_TYPE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetContainerType((StructuredBehaviorType)otherEnd, msgs);
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__INSTANCES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstances()).basicAdd(otherEnd, msgs);
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__FLOW_POINTS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getFlowPoints()).basicAdd(otherEnd, msgs);
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
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__TYPE:
                return basicSetType(null, msgs);
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__CONTRIBUTIONS:
                return ((InternalEList<?>)getContributions()).basicRemove(otherEnd, msgs);
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__CONTAINER_TYPE:
                return basicSetContainerType(null, msgs);
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__INSTANCES:
                return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__FLOW_POINTS:
                return ((InternalEList<?>)getFlowPoints()).basicRemove(otherEnd, msgs);
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__VARIABLE_ASSIGNMENTS:
                return ((InternalEList<?>)getVariableAssignments()).basicRemove(otherEnd, msgs);
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
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__CONTAINER_TYPE:
                return eInternalContainer().eInverseRemove(this, TypePackage.STRUCTURED_BEHAVIOR_TYPE__CONTAINED_INSTANTIATIONS, StructuredBehaviorType.class, msgs);
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
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__TYPE:
                if (resolve) return getType();
                return basicGetType();
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__CONTRIBUTIONS:
                return getContributions();
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__CONTAINER_TYPE:
                return getContainerType();
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__INSTANCES:
                return getInstances();
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__FLOW_POINTS:
                return getFlowPoints();
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__VARIABLE_ASSIGNMENTS:
                return getVariableAssignments();
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__NAME:
                return getName();
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__ENTITY_INSTANTIATION:
                if (resolve) return getEntityInstantiation();
                return basicGetEntityInstantiation();
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
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__TYPE:
                setType((AbstractBehaviorType)newValue);
                return;
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__CONTRIBUTIONS:
                getContributions().clear();
                getContributions().addAll((Collection<? extends InteractionContributionOfInstantiation>)newValue);
                return;
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__CONTAINER_TYPE:
                setContainerType((StructuredBehaviorType)newValue);
                return;
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__INSTANCES:
                getInstances().clear();
                getInstances().addAll((Collection<? extends Behavior>)newValue);
                return;
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__FLOW_POINTS:
                getFlowPoints().clear();
                getFlowPoints().addAll((Collection<? extends FlowPointOfInstantiation>)newValue);
                return;
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__VARIABLE_ASSIGNMENTS:
                getVariableAssignments().clear();
                getVariableAssignments().addAll((Collection<? extends VariableAssignment>)newValue);
                return;
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__NAME:
                setName((String)newValue);
                return;
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__ENTITY_INSTANTIATION:
                setEntityInstantiation((EntityInstantiation)newValue);
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
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__TYPE:
                setType((AbstractBehaviorType)null);
                return;
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__CONTRIBUTIONS:
                getContributions().clear();
                return;
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__CONTAINER_TYPE:
                setContainerType((StructuredBehaviorType)null);
                return;
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__INSTANCES:
                getInstances().clear();
                return;
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__FLOW_POINTS:
                getFlowPoints().clear();
                return;
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__VARIABLE_ASSIGNMENTS:
                getVariableAssignments().clear();
                return;
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__NAME:
                setName(NAME_EDEFAULT);
                return;
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__ENTITY_INSTANTIATION:
                setEntityInstantiation((EntityInstantiation)null);
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
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__TYPE:
                return type != null;
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__CONTRIBUTIONS:
                return contributions != null && !contributions.isEmpty();
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__CONTAINER_TYPE:
                return getContainerType() != null;
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__INSTANCES:
                return instances != null && !instances.isEmpty();
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__FLOW_POINTS:
                return flowPoints != null && !flowPoints.isEmpty();
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__VARIABLE_ASSIGNMENTS:
                return variableAssignments != null && !variableAssignments.isEmpty();
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case InstantiationPackage.BEHAVIOR_INSTANTIATION__ENTITY_INSTANTIATION:
                return entityInstantiation != null;
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

} //BehaviorInstantiationImpl
