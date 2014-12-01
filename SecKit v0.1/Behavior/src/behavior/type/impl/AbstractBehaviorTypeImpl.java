/**
 */
package behavior.type.impl;

import behavior.causality.CausalityPackage;
import behavior.causality.CausalityRelation;

import behavior.instance.Behavior;
import behavior.instance.InstancePackage;

import behavior.instantiation.AbstractInteractionContributionOfType;
import behavior.instantiation.BehaviorInstantiation;
import behavior.instantiation.FlowPointOfType;
import behavior.instantiation.InstantiationPackage;

import behavior.type.AbstractBehaviorType;
import behavior.type.BehaviorTypePackage;
import behavior.type.TypePackage;

import java.util.Collection;

import models.variable.VariableDeclaration;

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

import structure.type.EntityType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Behavior Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.type.impl.AbstractBehaviorTypeImpl#getFlowPoints <em>Flow Points</em>}</li>
 *   <li>{@link behavior.type.impl.AbstractBehaviorTypeImpl#getCausalityRelations <em>Causality Relations</em>}</li>
 *   <li>{@link behavior.type.impl.AbstractBehaviorTypeImpl#getInstantiations <em>Instantiations</em>}</li>
 *   <li>{@link behavior.type.impl.AbstractBehaviorTypeImpl#getVariableDeclarations <em>Variable Declarations</em>}</li>
 *   <li>{@link behavior.type.impl.AbstractBehaviorTypeImpl#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link behavior.type.impl.AbstractBehaviorTypeImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link behavior.type.impl.AbstractBehaviorTypeImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link behavior.type.impl.AbstractBehaviorTypeImpl#getEntityType <em>Entity Type</em>}</li>
 *   <li>{@link behavior.type.impl.AbstractBehaviorTypeImpl#getSubTypes <em>Sub Types</em>}</li>
 *   <li>{@link behavior.type.impl.AbstractBehaviorTypeImpl#getContributions <em>Contributions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractBehaviorTypeImpl extends AbstractDataProducerTypeImpl implements AbstractBehaviorType {
    /**
     * The cached value of the '{@link #getFlowPoints() <em>Flow Points</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlowPoints()
     * @generated
     * @ordered
     */
    protected EList<FlowPointOfType> flowPoints;

    /**
     * The cached value of the '{@link #getCausalityRelations() <em>Causality Relations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCausalityRelations()
     * @generated
     * @ordered
     */
    protected EList<CausalityRelation> causalityRelations;

    /**
     * The cached value of the '{@link #getInstantiations() <em>Instantiations</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstantiations()
     * @generated
     * @ordered
     */
    protected EList<BehaviorInstantiation> instantiations;

    /**
     * The cached value of the '{@link #getVariableDeclarations() <em>Variable Declarations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariableDeclarations()
     * @generated
     * @ordered
     */
    protected EList<VariableDeclaration> variableDeclarations;

    /**
     * The cached value of the '{@link #getSuperTypes() <em>Super Types</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSuperTypes()
     * @generated
     * @ordered
     */
    protected EList<AbstractBehaviorType> superTypes;

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
     * The cached value of the '{@link #getEntityType() <em>Entity Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntityType()
     * @generated
     * @ordered
     */
    protected EntityType entityType;

    /**
     * The cached value of the '{@link #getSubTypes() <em>Sub Types</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubTypes()
     * @generated
     * @ordered
     */
    protected AbstractBehaviorType subTypes;

    /**
     * The cached value of the '{@link #getContributions() <em>Contributions</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContributions()
     * @generated
     * @ordered
     */
    protected EList<AbstractInteractionContributionOfType> contributions;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AbstractBehaviorTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.ABSTRACT_BEHAVIOR_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FlowPointOfType> getFlowPoints() {
        if (flowPoints == null) {
            flowPoints = new EObjectContainmentWithInverseEList<FlowPointOfType>(FlowPointOfType.class, this, TypePackage.ABSTRACT_BEHAVIOR_TYPE__FLOW_POINTS, InstantiationPackage.FLOW_POINT_OF_TYPE__BEHAVIOR_TYPE);
        }
        return flowPoints;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CausalityRelation> getCausalityRelations() {
        if (causalityRelations == null) {
            causalityRelations = new EObjectContainmentWithInverseEList<CausalityRelation>(CausalityRelation.class, this, TypePackage.ABSTRACT_BEHAVIOR_TYPE__CAUSALITY_RELATIONS, CausalityPackage.CAUSALITY_RELATION__CONTEXT);
        }
        return causalityRelations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<BehaviorInstantiation> getInstantiations() {
        if (instantiations == null) {
            instantiations = new EObjectWithInverseResolvingEList<BehaviorInstantiation>(BehaviorInstantiation.class, this, TypePackage.ABSTRACT_BEHAVIOR_TYPE__INSTANTIATIONS, InstantiationPackage.BEHAVIOR_INSTANTIATION__TYPE);
        }
        return instantiations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<VariableDeclaration> getVariableDeclarations() {
        if (variableDeclarations == null) {
            variableDeclarations = new EObjectContainmentEList<VariableDeclaration>(VariableDeclaration.class, this, TypePackage.ABSTRACT_BEHAVIOR_TYPE__VARIABLE_DECLARATIONS);
        }
        return variableDeclarations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AbstractBehaviorType> getSuperTypes() {
        if (superTypes == null) {
            superTypes = new EObjectWithInverseResolvingEList<AbstractBehaviorType>(AbstractBehaviorType.class, this, TypePackage.ABSTRACT_BEHAVIOR_TYPE__SUPER_TYPES, TypePackage.ABSTRACT_BEHAVIOR_TYPE__SUB_TYPES);
        }
        return superTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Behavior> getInstances() {
        if (instances == null) {
            instances = new EObjectWithInverseResolvingEList<Behavior>(Behavior.class, this, TypePackage.ABSTRACT_BEHAVIOR_TYPE__INSTANCES, InstancePackage.BEHAVIOR__TYPE);
        }
        return instances;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorTypePackage getPackage() {
        if (eContainerFeatureID() != TypePackage.ABSTRACT_BEHAVIOR_TYPE__PACKAGE) return null;
        return (BehaviorTypePackage)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPackage(BehaviorTypePackage newPackage, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newPackage, TypePackage.ABSTRACT_BEHAVIOR_TYPE__PACKAGE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPackage(BehaviorTypePackage newPackage) {
        if (newPackage != eInternalContainer() || (eContainerFeatureID() != TypePackage.ABSTRACT_BEHAVIOR_TYPE__PACKAGE && newPackage != null)) {
            if (EcoreUtil.isAncestor(this, newPackage))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newPackage != null)
                msgs = ((InternalEObject)newPackage).eInverseAdd(this, TypePackage.BEHAVIOR_TYPE_PACKAGE__BEHAVIOR_TYPES, BehaviorTypePackage.class, msgs);
            msgs = basicSetPackage(newPackage, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ABSTRACT_BEHAVIOR_TYPE__PACKAGE, newPackage, newPackage));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityType getEntityType() {
        if (entityType != null && entityType.eIsProxy()) {
            InternalEObject oldEntityType = (InternalEObject)entityType;
            entityType = (EntityType)eResolveProxy(oldEntityType);
            if (entityType != oldEntityType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypePackage.ABSTRACT_BEHAVIOR_TYPE__ENTITY_TYPE, oldEntityType, entityType));
            }
        }
        return entityType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityType basicGetEntityType() {
        return entityType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEntityType(EntityType newEntityType) {
        EntityType oldEntityType = entityType;
        entityType = newEntityType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ABSTRACT_BEHAVIOR_TYPE__ENTITY_TYPE, oldEntityType, entityType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractBehaviorType getSubTypes() {
        if (subTypes != null && subTypes.eIsProxy()) {
            InternalEObject oldSubTypes = (InternalEObject)subTypes;
            subTypes = (AbstractBehaviorType)eResolveProxy(oldSubTypes);
            if (subTypes != oldSubTypes) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypePackage.ABSTRACT_BEHAVIOR_TYPE__SUB_TYPES, oldSubTypes, subTypes));
            }
        }
        return subTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractBehaviorType basicGetSubTypes() {
        return subTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSubTypes(AbstractBehaviorType newSubTypes, NotificationChain msgs) {
        AbstractBehaviorType oldSubTypes = subTypes;
        subTypes = newSubTypes;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypePackage.ABSTRACT_BEHAVIOR_TYPE__SUB_TYPES, oldSubTypes, newSubTypes);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSubTypes(AbstractBehaviorType newSubTypes) {
        if (newSubTypes != subTypes) {
            NotificationChain msgs = null;
            if (subTypes != null)
                msgs = ((InternalEObject)subTypes).eInverseRemove(this, TypePackage.ABSTRACT_BEHAVIOR_TYPE__SUPER_TYPES, AbstractBehaviorType.class, msgs);
            if (newSubTypes != null)
                msgs = ((InternalEObject)newSubTypes).eInverseAdd(this, TypePackage.ABSTRACT_BEHAVIOR_TYPE__SUPER_TYPES, AbstractBehaviorType.class, msgs);
            msgs = basicSetSubTypes(newSubTypes, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ABSTRACT_BEHAVIOR_TYPE__SUB_TYPES, newSubTypes, newSubTypes));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AbstractInteractionContributionOfType> getContributions() {
        if (contributions == null) {
            contributions = new EObjectContainmentWithInverseEList<AbstractInteractionContributionOfType>(AbstractInteractionContributionOfType.class, this, TypePackage.ABSTRACT_BEHAVIOR_TYPE__CONTRIBUTIONS, InstantiationPackage.ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__BEHAVIOR_TYPE);
        }
        return contributions;
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
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__FLOW_POINTS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getFlowPoints()).basicAdd(otherEnd, msgs);
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__CAUSALITY_RELATIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getCausalityRelations()).basicAdd(otherEnd, msgs);
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__INSTANTIATIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstantiations()).basicAdd(otherEnd, msgs);
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__SUPER_TYPES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuperTypes()).basicAdd(otherEnd, msgs);
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__INSTANCES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstances()).basicAdd(otherEnd, msgs);
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__PACKAGE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetPackage((BehaviorTypePackage)otherEnd, msgs);
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__SUB_TYPES:
                if (subTypes != null)
                    msgs = ((InternalEObject)subTypes).eInverseRemove(this, TypePackage.ABSTRACT_BEHAVIOR_TYPE__SUPER_TYPES, AbstractBehaviorType.class, msgs);
                return basicSetSubTypes((AbstractBehaviorType)otherEnd, msgs);
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__CONTRIBUTIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getContributions()).basicAdd(otherEnd, msgs);
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
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__FLOW_POINTS:
                return ((InternalEList<?>)getFlowPoints()).basicRemove(otherEnd, msgs);
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__CAUSALITY_RELATIONS:
                return ((InternalEList<?>)getCausalityRelations()).basicRemove(otherEnd, msgs);
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__INSTANTIATIONS:
                return ((InternalEList<?>)getInstantiations()).basicRemove(otherEnd, msgs);
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__VARIABLE_DECLARATIONS:
                return ((InternalEList<?>)getVariableDeclarations()).basicRemove(otherEnd, msgs);
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__SUPER_TYPES:
                return ((InternalEList<?>)getSuperTypes()).basicRemove(otherEnd, msgs);
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__INSTANCES:
                return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__PACKAGE:
                return basicSetPackage(null, msgs);
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__SUB_TYPES:
                return basicSetSubTypes(null, msgs);
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__CONTRIBUTIONS:
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
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__PACKAGE:
                return eInternalContainer().eInverseRemove(this, TypePackage.BEHAVIOR_TYPE_PACKAGE__BEHAVIOR_TYPES, BehaviorTypePackage.class, msgs);
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
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__FLOW_POINTS:
                return getFlowPoints();
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__CAUSALITY_RELATIONS:
                return getCausalityRelations();
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__INSTANTIATIONS:
                return getInstantiations();
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__VARIABLE_DECLARATIONS:
                return getVariableDeclarations();
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__SUPER_TYPES:
                return getSuperTypes();
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__INSTANCES:
                return getInstances();
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__PACKAGE:
                return getPackage();
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__ENTITY_TYPE:
                if (resolve) return getEntityType();
                return basicGetEntityType();
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__SUB_TYPES:
                if (resolve) return getSubTypes();
                return basicGetSubTypes();
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__CONTRIBUTIONS:
                return getContributions();
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
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__FLOW_POINTS:
                getFlowPoints().clear();
                getFlowPoints().addAll((Collection<? extends FlowPointOfType>)newValue);
                return;
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__CAUSALITY_RELATIONS:
                getCausalityRelations().clear();
                getCausalityRelations().addAll((Collection<? extends CausalityRelation>)newValue);
                return;
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__INSTANTIATIONS:
                getInstantiations().clear();
                getInstantiations().addAll((Collection<? extends BehaviorInstantiation>)newValue);
                return;
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__VARIABLE_DECLARATIONS:
                getVariableDeclarations().clear();
                getVariableDeclarations().addAll((Collection<? extends VariableDeclaration>)newValue);
                return;
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__SUPER_TYPES:
                getSuperTypes().clear();
                getSuperTypes().addAll((Collection<? extends AbstractBehaviorType>)newValue);
                return;
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__INSTANCES:
                getInstances().clear();
                getInstances().addAll((Collection<? extends Behavior>)newValue);
                return;
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__PACKAGE:
                setPackage((BehaviorTypePackage)newValue);
                return;
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__ENTITY_TYPE:
                setEntityType((EntityType)newValue);
                return;
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__SUB_TYPES:
                setSubTypes((AbstractBehaviorType)newValue);
                return;
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__CONTRIBUTIONS:
                getContributions().clear();
                getContributions().addAll((Collection<? extends AbstractInteractionContributionOfType>)newValue);
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
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__FLOW_POINTS:
                getFlowPoints().clear();
                return;
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__CAUSALITY_RELATIONS:
                getCausalityRelations().clear();
                return;
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__INSTANTIATIONS:
                getInstantiations().clear();
                return;
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__VARIABLE_DECLARATIONS:
                getVariableDeclarations().clear();
                return;
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__SUPER_TYPES:
                getSuperTypes().clear();
                return;
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__INSTANCES:
                getInstances().clear();
                return;
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__PACKAGE:
                setPackage((BehaviorTypePackage)null);
                return;
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__ENTITY_TYPE:
                setEntityType((EntityType)null);
                return;
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__SUB_TYPES:
                setSubTypes((AbstractBehaviorType)null);
                return;
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__CONTRIBUTIONS:
                getContributions().clear();
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
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__FLOW_POINTS:
                return flowPoints != null && !flowPoints.isEmpty();
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__CAUSALITY_RELATIONS:
                return causalityRelations != null && !causalityRelations.isEmpty();
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__INSTANTIATIONS:
                return instantiations != null && !instantiations.isEmpty();
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__VARIABLE_DECLARATIONS:
                return variableDeclarations != null && !variableDeclarations.isEmpty();
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__SUPER_TYPES:
                return superTypes != null && !superTypes.isEmpty();
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__INSTANCES:
                return instances != null && !instances.isEmpty();
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__PACKAGE:
                return getPackage() != null;
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__ENTITY_TYPE:
                return entityType != null;
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__SUB_TYPES:
                return subTypes != null;
            case TypePackage.ABSTRACT_BEHAVIOR_TYPE__CONTRIBUTIONS:
                return contributions != null && !contributions.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //AbstractBehaviorTypeImpl
