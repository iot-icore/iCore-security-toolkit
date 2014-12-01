/**
 */
package structure.instance.impl;

import identity.instance.AbstractIdentity;
import identity.instance.IdentityOwner;
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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import structure.instance.ActivityPoint;
import structure.instance.Entity;
import structure.instance.InstancePackage;
import structure.instance.InteractionPointParticipation;
import structure.instantiation.EntityInstantiation;
import structure.instantiation.InstantiationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link structure.instance.impl.EntityImpl#getIdentities <em>Identities</em>}</li>
 *   <li>{@link structure.instance.impl.EntityImpl#getContainerEntity <em>Container Entity</em>}</li>
 *   <li>{@link structure.instance.impl.EntityImpl#getContainedEntities <em>Contained Entities</em>}</li>
 *   <li>{@link structure.instance.impl.EntityImpl#getInstantiation <em>Instantiation</em>}</li>
 *   <li>{@link structure.instance.impl.EntityImpl#getActivityPoints <em>Activity Points</em>}</li>
 *   <li>{@link structure.instance.impl.EntityImpl#getInteractionPointParticipations <em>Interaction Point Participations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityImpl extends ElementImpl implements Entity {
    /**
     * The cached value of the '{@link #getIdentities() <em>Identities</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdentities()
     * @generated
     * @ordered
     */
    protected EList<AbstractIdentity> identities;

    /**
     * The cached value of the '{@link #getContainedEntities() <em>Contained Entities</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContainedEntities()
     * @generated
     * @ordered
     */
    protected EList<Entity> containedEntities;

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
     * The cached value of the '{@link #getActivityPoints() <em>Activity Points</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActivityPoints()
     * @generated
     * @ordered
     */
    protected EList<ActivityPoint> activityPoints;

    /**
     * The cached value of the '{@link #getInteractionPointParticipations() <em>Interaction Point Participations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInteractionPointParticipations()
     * @generated
     * @ordered
     */
    protected EList<InteractionPointParticipation> interactionPointParticipations;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EntityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstancePackage.Literals.ENTITY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Entity getContainerEntity() {
        if (eContainerFeatureID() != InstancePackage.ENTITY__CONTAINER_ENTITY) return null;
        return (Entity)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetContainerEntity(Entity newContainerEntity, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newContainerEntity, InstancePackage.ENTITY__CONTAINER_ENTITY, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContainerEntity(Entity newContainerEntity) {
        if (newContainerEntity != eInternalContainer() || (eContainerFeatureID() != InstancePackage.ENTITY__CONTAINER_ENTITY && newContainerEntity != null)) {
            if (EcoreUtil.isAncestor(this, newContainerEntity))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newContainerEntity != null)
                msgs = ((InternalEObject)newContainerEntity).eInverseAdd(this, InstancePackage.ENTITY__CONTAINED_ENTITIES, Entity.class, msgs);
            msgs = basicSetContainerEntity(newContainerEntity, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.ENTITY__CONTAINER_ENTITY, newContainerEntity, newContainerEntity));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Entity> getContainedEntities() {
        if (containedEntities == null) {
            containedEntities = new EObjectContainmentWithInverseEList<Entity>(Entity.class, this, InstancePackage.ENTITY__CONTAINED_ENTITIES, InstancePackage.ENTITY__CONTAINER_ENTITY);
        }
        return containedEntities;
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.ENTITY__INSTANTIATION, oldInstantiation, instantiation));
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
    public NotificationChain basicSetInstantiation(EntityInstantiation newInstantiation, NotificationChain msgs) {
        EntityInstantiation oldInstantiation = instantiation;
        instantiation = newInstantiation;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.ENTITY__INSTANTIATION, oldInstantiation, newInstantiation);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInstantiation(EntityInstantiation newInstantiation) {
        if (newInstantiation != instantiation) {
            NotificationChain msgs = null;
            if (instantiation != null)
                msgs = ((InternalEObject)instantiation).eInverseRemove(this, InstantiationPackage.ENTITY_INSTANTIATION__INSTANCES, EntityInstantiation.class, msgs);
            if (newInstantiation != null)
                msgs = ((InternalEObject)newInstantiation).eInverseAdd(this, InstantiationPackage.ENTITY_INSTANTIATION__INSTANCES, EntityInstantiation.class, msgs);
            msgs = basicSetInstantiation(newInstantiation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.ENTITY__INSTANTIATION, newInstantiation, newInstantiation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ActivityPoint> getActivityPoints() {
        if (activityPoints == null) {
            activityPoints = new EObjectContainmentEList<ActivityPoint>(ActivityPoint.class, this, InstancePackage.ENTITY__ACTIVITY_POINTS);
        }
        return activityPoints;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InteractionPointParticipation> getInteractionPointParticipations() {
        if (interactionPointParticipations == null) {
            interactionPointParticipations = new EObjectContainmentEList<InteractionPointParticipation>(InteractionPointParticipation.class, this, InstancePackage.ENTITY__INTERACTION_POINT_PARTICIPATIONS);
        }
        return interactionPointParticipations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AbstractIdentity> getIdentities() {
        if (identities == null) {
            identities = new EObjectWithInverseResolvingEList<AbstractIdentity>(AbstractIdentity.class, this, InstancePackage.ENTITY__IDENTITIES, identity.instance.InstancePackage.ABSTRACT_IDENTITY__OWNER);
        }
        return identities;
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
            case InstancePackage.ENTITY__IDENTITIES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getIdentities()).basicAdd(otherEnd, msgs);
            case InstancePackage.ENTITY__CONTAINER_ENTITY:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetContainerEntity((Entity)otherEnd, msgs);
            case InstancePackage.ENTITY__CONTAINED_ENTITIES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainedEntities()).basicAdd(otherEnd, msgs);
            case InstancePackage.ENTITY__INSTANTIATION:
                if (instantiation != null)
                    msgs = ((InternalEObject)instantiation).eInverseRemove(this, InstantiationPackage.ENTITY_INSTANTIATION__INSTANCES, EntityInstantiation.class, msgs);
                return basicSetInstantiation((EntityInstantiation)otherEnd, msgs);
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
            case InstancePackage.ENTITY__IDENTITIES:
                return ((InternalEList<?>)getIdentities()).basicRemove(otherEnd, msgs);
            case InstancePackage.ENTITY__CONTAINER_ENTITY:
                return basicSetContainerEntity(null, msgs);
            case InstancePackage.ENTITY__CONTAINED_ENTITIES:
                return ((InternalEList<?>)getContainedEntities()).basicRemove(otherEnd, msgs);
            case InstancePackage.ENTITY__INSTANTIATION:
                return basicSetInstantiation(null, msgs);
            case InstancePackage.ENTITY__ACTIVITY_POINTS:
                return ((InternalEList<?>)getActivityPoints()).basicRemove(otherEnd, msgs);
            case InstancePackage.ENTITY__INTERACTION_POINT_PARTICIPATIONS:
                return ((InternalEList<?>)getInteractionPointParticipations()).basicRemove(otherEnd, msgs);
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
            case InstancePackage.ENTITY__CONTAINER_ENTITY:
                return eInternalContainer().eInverseRemove(this, InstancePackage.ENTITY__CONTAINED_ENTITIES, Entity.class, msgs);
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
            case InstancePackage.ENTITY__IDENTITIES:
                return getIdentities();
            case InstancePackage.ENTITY__CONTAINER_ENTITY:
                return getContainerEntity();
            case InstancePackage.ENTITY__CONTAINED_ENTITIES:
                return getContainedEntities();
            case InstancePackage.ENTITY__INSTANTIATION:
                if (resolve) return getInstantiation();
                return basicGetInstantiation();
            case InstancePackage.ENTITY__ACTIVITY_POINTS:
                return getActivityPoints();
            case InstancePackage.ENTITY__INTERACTION_POINT_PARTICIPATIONS:
                return getInteractionPointParticipations();
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
            case InstancePackage.ENTITY__IDENTITIES:
                getIdentities().clear();
                getIdentities().addAll((Collection<? extends AbstractIdentity>)newValue);
                return;
            case InstancePackage.ENTITY__CONTAINER_ENTITY:
                setContainerEntity((Entity)newValue);
                return;
            case InstancePackage.ENTITY__CONTAINED_ENTITIES:
                getContainedEntities().clear();
                getContainedEntities().addAll((Collection<? extends Entity>)newValue);
                return;
            case InstancePackage.ENTITY__INSTANTIATION:
                setInstantiation((EntityInstantiation)newValue);
                return;
            case InstancePackage.ENTITY__ACTIVITY_POINTS:
                getActivityPoints().clear();
                getActivityPoints().addAll((Collection<? extends ActivityPoint>)newValue);
                return;
            case InstancePackage.ENTITY__INTERACTION_POINT_PARTICIPATIONS:
                getInteractionPointParticipations().clear();
                getInteractionPointParticipations().addAll((Collection<? extends InteractionPointParticipation>)newValue);
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
            case InstancePackage.ENTITY__IDENTITIES:
                getIdentities().clear();
                return;
            case InstancePackage.ENTITY__CONTAINER_ENTITY:
                setContainerEntity((Entity)null);
                return;
            case InstancePackage.ENTITY__CONTAINED_ENTITIES:
                getContainedEntities().clear();
                return;
            case InstancePackage.ENTITY__INSTANTIATION:
                setInstantiation((EntityInstantiation)null);
                return;
            case InstancePackage.ENTITY__ACTIVITY_POINTS:
                getActivityPoints().clear();
                return;
            case InstancePackage.ENTITY__INTERACTION_POINT_PARTICIPATIONS:
                getInteractionPointParticipations().clear();
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
            case InstancePackage.ENTITY__IDENTITIES:
                return identities != null && !identities.isEmpty();
            case InstancePackage.ENTITY__CONTAINER_ENTITY:
                return getContainerEntity() != null;
            case InstancePackage.ENTITY__CONTAINED_ENTITIES:
                return containedEntities != null && !containedEntities.isEmpty();
            case InstancePackage.ENTITY__INSTANTIATION:
                return instantiation != null;
            case InstancePackage.ENTITY__ACTIVITY_POINTS:
                return activityPoints != null && !activityPoints.isEmpty();
            case InstancePackage.ENTITY__INTERACTION_POINT_PARTICIPATIONS:
                return interactionPointParticipations != null && !interactionPointParticipations.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == IdentityOwner.class) {
            switch (derivedFeatureID) {
                case InstancePackage.ENTITY__IDENTITIES: return identity.instance.InstancePackage.IDENTITY_OWNER__IDENTITIES;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == IdentityOwner.class) {
            switch (baseFeatureID) {
                case identity.instance.InstancePackage.IDENTITY_OWNER__IDENTITIES: return InstancePackage.ENTITY__IDENTITIES;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //EntityImpl
