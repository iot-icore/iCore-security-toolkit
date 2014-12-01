/**
 */
package structure.type.impl;

import java.util.Collection;

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

import structure.instantiation.AbstractInteractionPointParticipationOfType;
import structure.instantiation.ActivityPointInstantiation;
import structure.instantiation.EntityInstantiation;
import structure.instantiation.InstantiationPackage;

import structure.type.EntityType;
import structure.type.EntityTypePackage;
import structure.type.TypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link structure.type.impl.EntityTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link structure.type.impl.EntityTypeImpl#getInteractionPointParticipations <em>Interaction Point Participations</em>}</li>
 *   <li>{@link structure.type.impl.EntityTypeImpl#getInstantiations <em>Instantiations</em>}</li>
 *   <li>{@link structure.type.impl.EntityTypeImpl#getContainedInstantiations <em>Contained Instantiations</em>}</li>
 *   <li>{@link structure.type.impl.EntityTypeImpl#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link structure.type.impl.EntityTypeImpl#getSubTypes <em>Sub Types</em>}</li>
 *   <li>{@link structure.type.impl.EntityTypeImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link structure.type.impl.EntityTypeImpl#getActivityPoints <em>Activity Points</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityTypeImpl extends ElementImpl implements EntityType {
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
     * The cached value of the '{@link #getInteractionPointParticipations() <em>Interaction Point Participations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInteractionPointParticipations()
     * @generated
     * @ordered
     */
    protected EList<AbstractInteractionPointParticipationOfType> interactionPointParticipations;

    /**
     * The cached value of the '{@link #getInstantiations() <em>Instantiations</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstantiations()
     * @generated
     * @ordered
     */
    protected EList<EntityInstantiation> instantiations;

    /**
     * The cached value of the '{@link #getContainedInstantiations() <em>Contained Instantiations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContainedInstantiations()
     * @generated
     * @ordered
     */
    protected EList<EntityInstantiation> containedInstantiations;

    /**
     * The cached value of the '{@link #getSuperTypes() <em>Super Types</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSuperTypes()
     * @generated
     * @ordered
     */
    protected EList<EntityType> superTypes;

    /**
     * The cached value of the '{@link #getSubTypes() <em>Sub Types</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubTypes()
     * @generated
     * @ordered
     */
    protected EList<EntityType> subTypes;

    /**
     * The cached value of the '{@link #getActivityPoints() <em>Activity Points</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActivityPoints()
     * @generated
     * @ordered
     */
    protected EList<ActivityPointInstantiation> activityPoints;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EntityTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.ENTITY_TYPE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ENTITY_TYPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AbstractInteractionPointParticipationOfType> getInteractionPointParticipations() {
        if (interactionPointParticipations == null) {
            interactionPointParticipations = new EObjectContainmentWithInverseEList<AbstractInteractionPointParticipationOfType>(AbstractInteractionPointParticipationOfType.class, this, TypePackage.ENTITY_TYPE__INTERACTION_POINT_PARTICIPATIONS, InstantiationPackage.ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__ENTITY_TYPE);
        }
        return interactionPointParticipations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EntityInstantiation> getInstantiations() {
        if (instantiations == null) {
            instantiations = new EObjectWithInverseResolvingEList<EntityInstantiation>(EntityInstantiation.class, this, TypePackage.ENTITY_TYPE__INSTANTIATIONS, InstantiationPackage.ENTITY_INSTANTIATION__TYPE);
        }
        return instantiations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EntityInstantiation> getContainedInstantiations() {
        if (containedInstantiations == null) {
            containedInstantiations = new EObjectContainmentWithInverseEList<EntityInstantiation>(EntityInstantiation.class, this, TypePackage.ENTITY_TYPE__CONTAINED_INSTANTIATIONS, InstantiationPackage.ENTITY_INSTANTIATION__CONTAINER_TYPE);
        }
        return containedInstantiations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EntityType> getSuperTypes() {
        if (superTypes == null) {
            superTypes = new EObjectWithInverseResolvingEList.ManyInverse<EntityType>(EntityType.class, this, TypePackage.ENTITY_TYPE__SUPER_TYPES, TypePackage.ENTITY_TYPE__SUB_TYPES);
        }
        return superTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EntityType> getSubTypes() {
        if (subTypes == null) {
            subTypes = new EObjectWithInverseResolvingEList.ManyInverse<EntityType>(EntityType.class, this, TypePackage.ENTITY_TYPE__SUB_TYPES, TypePackage.ENTITY_TYPE__SUPER_TYPES);
        }
        return subTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityTypePackage getPackage() {
        if (eContainerFeatureID() != TypePackage.ENTITY_TYPE__PACKAGE) return null;
        return (EntityTypePackage)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPackage(EntityTypePackage newPackage, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newPackage, TypePackage.ENTITY_TYPE__PACKAGE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPackage(EntityTypePackage newPackage) {
        if (newPackage != eInternalContainer() || (eContainerFeatureID() != TypePackage.ENTITY_TYPE__PACKAGE && newPackage != null)) {
            if (EcoreUtil.isAncestor(this, newPackage))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newPackage != null)
                msgs = ((InternalEObject)newPackage).eInverseAdd(this, TypePackage.ENTITY_TYPE_PACKAGE__ENTITY_TYPES, EntityTypePackage.class, msgs);
            msgs = basicSetPackage(newPackage, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ENTITY_TYPE__PACKAGE, newPackage, newPackage));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ActivityPointInstantiation> getActivityPoints() {
        if (activityPoints == null) {
            activityPoints = new EObjectContainmentWithInverseEList<ActivityPointInstantiation>(ActivityPointInstantiation.class, this, TypePackage.ENTITY_TYPE__ACTIVITY_POINTS, InstantiationPackage.ACTIVITY_POINT_INSTANTIATION__ENTITY_TYPE);
        }
        return activityPoints;
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
            case TypePackage.ENTITY_TYPE__INTERACTION_POINT_PARTICIPATIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInteractionPointParticipations()).basicAdd(otherEnd, msgs);
            case TypePackage.ENTITY_TYPE__INSTANTIATIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstantiations()).basicAdd(otherEnd, msgs);
            case TypePackage.ENTITY_TYPE__CONTAINED_INSTANTIATIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainedInstantiations()).basicAdd(otherEnd, msgs);
            case TypePackage.ENTITY_TYPE__SUPER_TYPES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuperTypes()).basicAdd(otherEnd, msgs);
            case TypePackage.ENTITY_TYPE__SUB_TYPES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubTypes()).basicAdd(otherEnd, msgs);
            case TypePackage.ENTITY_TYPE__PACKAGE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetPackage((EntityTypePackage)otherEnd, msgs);
            case TypePackage.ENTITY_TYPE__ACTIVITY_POINTS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityPoints()).basicAdd(otherEnd, msgs);
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
            case TypePackage.ENTITY_TYPE__INTERACTION_POINT_PARTICIPATIONS:
                return ((InternalEList<?>)getInteractionPointParticipations()).basicRemove(otherEnd, msgs);
            case TypePackage.ENTITY_TYPE__INSTANTIATIONS:
                return ((InternalEList<?>)getInstantiations()).basicRemove(otherEnd, msgs);
            case TypePackage.ENTITY_TYPE__CONTAINED_INSTANTIATIONS:
                return ((InternalEList<?>)getContainedInstantiations()).basicRemove(otherEnd, msgs);
            case TypePackage.ENTITY_TYPE__SUPER_TYPES:
                return ((InternalEList<?>)getSuperTypes()).basicRemove(otherEnd, msgs);
            case TypePackage.ENTITY_TYPE__SUB_TYPES:
                return ((InternalEList<?>)getSubTypes()).basicRemove(otherEnd, msgs);
            case TypePackage.ENTITY_TYPE__PACKAGE:
                return basicSetPackage(null, msgs);
            case TypePackage.ENTITY_TYPE__ACTIVITY_POINTS:
                return ((InternalEList<?>)getActivityPoints()).basicRemove(otherEnd, msgs);
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
            case TypePackage.ENTITY_TYPE__PACKAGE:
                return eInternalContainer().eInverseRemove(this, TypePackage.ENTITY_TYPE_PACKAGE__ENTITY_TYPES, EntityTypePackage.class, msgs);
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
            case TypePackage.ENTITY_TYPE__NAME:
                return getName();
            case TypePackage.ENTITY_TYPE__INTERACTION_POINT_PARTICIPATIONS:
                return getInteractionPointParticipations();
            case TypePackage.ENTITY_TYPE__INSTANTIATIONS:
                return getInstantiations();
            case TypePackage.ENTITY_TYPE__CONTAINED_INSTANTIATIONS:
                return getContainedInstantiations();
            case TypePackage.ENTITY_TYPE__SUPER_TYPES:
                return getSuperTypes();
            case TypePackage.ENTITY_TYPE__SUB_TYPES:
                return getSubTypes();
            case TypePackage.ENTITY_TYPE__PACKAGE:
                return getPackage();
            case TypePackage.ENTITY_TYPE__ACTIVITY_POINTS:
                return getActivityPoints();
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
            case TypePackage.ENTITY_TYPE__NAME:
                setName((String)newValue);
                return;
            case TypePackage.ENTITY_TYPE__INTERACTION_POINT_PARTICIPATIONS:
                getInteractionPointParticipations().clear();
                getInteractionPointParticipations().addAll((Collection<? extends AbstractInteractionPointParticipationOfType>)newValue);
                return;
            case TypePackage.ENTITY_TYPE__INSTANTIATIONS:
                getInstantiations().clear();
                getInstantiations().addAll((Collection<? extends EntityInstantiation>)newValue);
                return;
            case TypePackage.ENTITY_TYPE__CONTAINED_INSTANTIATIONS:
                getContainedInstantiations().clear();
                getContainedInstantiations().addAll((Collection<? extends EntityInstantiation>)newValue);
                return;
            case TypePackage.ENTITY_TYPE__SUPER_TYPES:
                getSuperTypes().clear();
                getSuperTypes().addAll((Collection<? extends EntityType>)newValue);
                return;
            case TypePackage.ENTITY_TYPE__SUB_TYPES:
                getSubTypes().clear();
                getSubTypes().addAll((Collection<? extends EntityType>)newValue);
                return;
            case TypePackage.ENTITY_TYPE__PACKAGE:
                setPackage((EntityTypePackage)newValue);
                return;
            case TypePackage.ENTITY_TYPE__ACTIVITY_POINTS:
                getActivityPoints().clear();
                getActivityPoints().addAll((Collection<? extends ActivityPointInstantiation>)newValue);
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
            case TypePackage.ENTITY_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case TypePackage.ENTITY_TYPE__INTERACTION_POINT_PARTICIPATIONS:
                getInteractionPointParticipations().clear();
                return;
            case TypePackage.ENTITY_TYPE__INSTANTIATIONS:
                getInstantiations().clear();
                return;
            case TypePackage.ENTITY_TYPE__CONTAINED_INSTANTIATIONS:
                getContainedInstantiations().clear();
                return;
            case TypePackage.ENTITY_TYPE__SUPER_TYPES:
                getSuperTypes().clear();
                return;
            case TypePackage.ENTITY_TYPE__SUB_TYPES:
                getSubTypes().clear();
                return;
            case TypePackage.ENTITY_TYPE__PACKAGE:
                setPackage((EntityTypePackage)null);
                return;
            case TypePackage.ENTITY_TYPE__ACTIVITY_POINTS:
                getActivityPoints().clear();
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
            case TypePackage.ENTITY_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case TypePackage.ENTITY_TYPE__INTERACTION_POINT_PARTICIPATIONS:
                return interactionPointParticipations != null && !interactionPointParticipations.isEmpty();
            case TypePackage.ENTITY_TYPE__INSTANTIATIONS:
                return instantiations != null && !instantiations.isEmpty();
            case TypePackage.ENTITY_TYPE__CONTAINED_INSTANTIATIONS:
                return containedInstantiations != null && !containedInstantiations.isEmpty();
            case TypePackage.ENTITY_TYPE__SUPER_TYPES:
                return superTypes != null && !superTypes.isEmpty();
            case TypePackage.ENTITY_TYPE__SUB_TYPES:
                return subTypes != null && !subTypes.isEmpty();
            case TypePackage.ENTITY_TYPE__PACKAGE:
                return getPackage() != null;
            case TypePackage.ENTITY_TYPE__ACTIVITY_POINTS:
                return activityPoints != null && !activityPoints.isEmpty();
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

} //EntityTypeImpl
