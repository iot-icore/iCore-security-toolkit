/**
 */
package structure.instantiation.impl;

import java.util.Collection;

import models.Multiplicity;

import models.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import structure.instance.Entity;
import structure.instance.InstancePackage;

import structure.instantiation.EntityInstantiation;
import structure.instantiation.InstantiationPackage;
import structure.instantiation.InteractionPointParticipationOfInstantiation;

import structure.type.EntityType;
import structure.type.TypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link structure.instantiation.impl.EntityInstantiationImpl#getName <em>Name</em>}</li>
 *   <li>{@link structure.instantiation.impl.EntityInstantiationImpl#getType <em>Type</em>}</li>
 *   <li>{@link structure.instantiation.impl.EntityInstantiationImpl#getInteractionPointParticipations <em>Interaction Point Participations</em>}</li>
 *   <li>{@link structure.instantiation.impl.EntityInstantiationImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link structure.instantiation.impl.EntityInstantiationImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link structure.instantiation.impl.EntityInstantiationImpl#getContainerType <em>Container Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityInstantiationImpl extends ElementImpl implements EntityInstantiation {
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
     * The cached value of the '{@link #getType() <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected EntityType type;

    /**
     * The cached value of the '{@link #getInteractionPointParticipations() <em>Interaction Point Participations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInteractionPointParticipations()
     * @generated
     * @ordered
     */
    protected EList<InteractionPointParticipationOfInstantiation> interactionPointParticipations;

    /**
     * The cached value of the '{@link #getInstances() <em>Instances</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstances()
     * @generated
     * @ordered
     */
    protected EList<Entity> instances;

    /**
     * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMultiplicity()
     * @generated
     * @ordered
     */
    protected Multiplicity multiplicity;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EntityInstantiationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstantiationPackage.Literals.ENTITY_INSTANTIATION;
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
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.ENTITY_INSTANTIATION__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityType getType() {
        if (type != null && type.eIsProxy()) {
            InternalEObject oldType = (InternalEObject)type;
            type = (EntityType)eResolveProxy(oldType);
            if (type != oldType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstantiationPackage.ENTITY_INSTANTIATION__TYPE, oldType, type));
            }
        }
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityType basicGetType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetType(EntityType newType, NotificationChain msgs) {
        EntityType oldType = type;
        type = newType;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstantiationPackage.ENTITY_INSTANTIATION__TYPE, oldType, newType);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(EntityType newType) {
        if (newType != type) {
            NotificationChain msgs = null;
            if (type != null)
                msgs = ((InternalEObject)type).eInverseRemove(this, TypePackage.ENTITY_TYPE__INSTANTIATIONS, EntityType.class, msgs);
            if (newType != null)
                msgs = ((InternalEObject)newType).eInverseAdd(this, TypePackage.ENTITY_TYPE__INSTANTIATIONS, EntityType.class, msgs);
            msgs = basicSetType(newType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.ENTITY_INSTANTIATION__TYPE, newType, newType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InteractionPointParticipationOfInstantiation> getInteractionPointParticipations() {
        if (interactionPointParticipations == null) {
            interactionPointParticipations = new EObjectContainmentWithInverseEList<InteractionPointParticipationOfInstantiation>(InteractionPointParticipationOfInstantiation.class, this, InstantiationPackage.ENTITY_INSTANTIATION__INTERACTION_POINT_PARTICIPATIONS, InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__ENTITY_INSTANTIATION);
        }
        return interactionPointParticipations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Entity> getInstances() {
        if (instances == null) {
            instances = new EObjectWithInverseResolvingEList<Entity>(Entity.class, this, InstantiationPackage.ENTITY_INSTANTIATION__INSTANCES, InstancePackage.ENTITY__INSTANTIATION);
        }
        return instances;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Multiplicity getMultiplicity() {
        return multiplicity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMultiplicity(Multiplicity newMultiplicity, NotificationChain msgs) {
        Multiplicity oldMultiplicity = multiplicity;
        multiplicity = newMultiplicity;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstantiationPackage.ENTITY_INSTANTIATION__MULTIPLICITY, oldMultiplicity, newMultiplicity);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMultiplicity(Multiplicity newMultiplicity) {
        if (newMultiplicity != multiplicity) {
            NotificationChain msgs = null;
            if (multiplicity != null)
                msgs = ((InternalEObject)multiplicity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstantiationPackage.ENTITY_INSTANTIATION__MULTIPLICITY, null, msgs);
            if (newMultiplicity != null)
                msgs = ((InternalEObject)newMultiplicity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstantiationPackage.ENTITY_INSTANTIATION__MULTIPLICITY, null, msgs);
            msgs = basicSetMultiplicity(newMultiplicity, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.ENTITY_INSTANTIATION__MULTIPLICITY, newMultiplicity, newMultiplicity));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityType getContainerType() {
        if (eContainerFeatureID() != InstantiationPackage.ENTITY_INSTANTIATION__CONTAINER_TYPE) return null;
        return (EntityType)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetContainerType(EntityType newContainerType, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newContainerType, InstantiationPackage.ENTITY_INSTANTIATION__CONTAINER_TYPE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContainerType(EntityType newContainerType) {
        if (newContainerType != eInternalContainer() || (eContainerFeatureID() != InstantiationPackage.ENTITY_INSTANTIATION__CONTAINER_TYPE && newContainerType != null)) {
            if (EcoreUtil.isAncestor(this, newContainerType))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newContainerType != null)
                msgs = ((InternalEObject)newContainerType).eInverseAdd(this, TypePackage.ENTITY_TYPE__CONTAINED_INSTANTIATIONS, EntityType.class, msgs);
            msgs = basicSetContainerType(newContainerType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.ENTITY_INSTANTIATION__CONTAINER_TYPE, newContainerType, newContainerType));
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
            case InstantiationPackage.ENTITY_INSTANTIATION__TYPE:
                if (type != null)
                    msgs = ((InternalEObject)type).eInverseRemove(this, TypePackage.ENTITY_TYPE__INSTANTIATIONS, EntityType.class, msgs);
                return basicSetType((EntityType)otherEnd, msgs);
            case InstantiationPackage.ENTITY_INSTANTIATION__INTERACTION_POINT_PARTICIPATIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInteractionPointParticipations()).basicAdd(otherEnd, msgs);
            case InstantiationPackage.ENTITY_INSTANTIATION__INSTANCES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstances()).basicAdd(otherEnd, msgs);
            case InstantiationPackage.ENTITY_INSTANTIATION__CONTAINER_TYPE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetContainerType((EntityType)otherEnd, msgs);
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
            case InstantiationPackage.ENTITY_INSTANTIATION__TYPE:
                return basicSetType(null, msgs);
            case InstantiationPackage.ENTITY_INSTANTIATION__INTERACTION_POINT_PARTICIPATIONS:
                return ((InternalEList<?>)getInteractionPointParticipations()).basicRemove(otherEnd, msgs);
            case InstantiationPackage.ENTITY_INSTANTIATION__INSTANCES:
                return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
            case InstantiationPackage.ENTITY_INSTANTIATION__MULTIPLICITY:
                return basicSetMultiplicity(null, msgs);
            case InstantiationPackage.ENTITY_INSTANTIATION__CONTAINER_TYPE:
                return basicSetContainerType(null, msgs);
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
            case InstantiationPackage.ENTITY_INSTANTIATION__CONTAINER_TYPE:
                return eInternalContainer().eInverseRemove(this, TypePackage.ENTITY_TYPE__CONTAINED_INSTANTIATIONS, EntityType.class, msgs);
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
            case InstantiationPackage.ENTITY_INSTANTIATION__NAME:
                return getName();
            case InstantiationPackage.ENTITY_INSTANTIATION__TYPE:
                if (resolve) return getType();
                return basicGetType();
            case InstantiationPackage.ENTITY_INSTANTIATION__INTERACTION_POINT_PARTICIPATIONS:
                return getInteractionPointParticipations();
            case InstantiationPackage.ENTITY_INSTANTIATION__INSTANCES:
                return getInstances();
            case InstantiationPackage.ENTITY_INSTANTIATION__MULTIPLICITY:
                return getMultiplicity();
            case InstantiationPackage.ENTITY_INSTANTIATION__CONTAINER_TYPE:
                return getContainerType();
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
            case InstantiationPackage.ENTITY_INSTANTIATION__NAME:
                setName((String)newValue);
                return;
            case InstantiationPackage.ENTITY_INSTANTIATION__TYPE:
                setType((EntityType)newValue);
                return;
            case InstantiationPackage.ENTITY_INSTANTIATION__INTERACTION_POINT_PARTICIPATIONS:
                getInteractionPointParticipations().clear();
                getInteractionPointParticipations().addAll((Collection<? extends InteractionPointParticipationOfInstantiation>)newValue);
                return;
            case InstantiationPackage.ENTITY_INSTANTIATION__INSTANCES:
                getInstances().clear();
                getInstances().addAll((Collection<? extends Entity>)newValue);
                return;
            case InstantiationPackage.ENTITY_INSTANTIATION__MULTIPLICITY:
                setMultiplicity((Multiplicity)newValue);
                return;
            case InstantiationPackage.ENTITY_INSTANTIATION__CONTAINER_TYPE:
                setContainerType((EntityType)newValue);
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
            case InstantiationPackage.ENTITY_INSTANTIATION__NAME:
                setName(NAME_EDEFAULT);
                return;
            case InstantiationPackage.ENTITY_INSTANTIATION__TYPE:
                setType((EntityType)null);
                return;
            case InstantiationPackage.ENTITY_INSTANTIATION__INTERACTION_POINT_PARTICIPATIONS:
                getInteractionPointParticipations().clear();
                return;
            case InstantiationPackage.ENTITY_INSTANTIATION__INSTANCES:
                getInstances().clear();
                return;
            case InstantiationPackage.ENTITY_INSTANTIATION__MULTIPLICITY:
                setMultiplicity((Multiplicity)null);
                return;
            case InstantiationPackage.ENTITY_INSTANTIATION__CONTAINER_TYPE:
                setContainerType((EntityType)null);
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
            case InstantiationPackage.ENTITY_INSTANTIATION__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case InstantiationPackage.ENTITY_INSTANTIATION__TYPE:
                return type != null;
            case InstantiationPackage.ENTITY_INSTANTIATION__INTERACTION_POINT_PARTICIPATIONS:
                return interactionPointParticipations != null && !interactionPointParticipations.isEmpty();
            case InstantiationPackage.ENTITY_INSTANTIATION__INSTANCES:
                return instances != null && !instances.isEmpty();
            case InstantiationPackage.ENTITY_INSTANTIATION__MULTIPLICITY:
                return multiplicity != null;
            case InstantiationPackage.ENTITY_INSTANTIATION__CONTAINER_TYPE:
                return getContainerType() != null;
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

} //EntityInstantiationImpl
