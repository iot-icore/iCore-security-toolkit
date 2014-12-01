/**
 */
package structure.instantiation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import structure.instantiation.AbstractInteractionPointParticipationOfType;
import structure.instantiation.DelegatedInteractionPointParticipation;
import structure.instantiation.EntityInstantiation;
import structure.instantiation.InstantiationPackage;
import structure.instantiation.InteractionPointInstantiation;
import structure.instantiation.InteractionPointParticipationOfInstantiation;
import structure.instantiation.LocalizableInstantiation;
import structure.instantiation.LocationInstantiation;

import structure.type.InteractionPointType;
import structure.type.TypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Point Participation Of Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link structure.instantiation.impl.InteractionPointParticipationOfInstantiationImpl#getLocationInstantiation <em>Location Instantiation</em>}</li>
 *   <li>{@link structure.instantiation.impl.InteractionPointParticipationOfInstantiationImpl#getInteractionPointType <em>Interaction Point Type</em>}</li>
 *   <li>{@link structure.instantiation.impl.InteractionPointParticipationOfInstantiationImpl#getParticipationOfType <em>Participation Of Type</em>}</li>
 *   <li>{@link structure.instantiation.impl.InteractionPointParticipationOfInstantiationImpl#getDelegatedFrom <em>Delegated From</em>}</li>
 *   <li>{@link structure.instantiation.impl.InteractionPointParticipationOfInstantiationImpl#getEntityInstantiation <em>Entity Instantiation</em>}</li>
 *   <li>{@link structure.instantiation.impl.InteractionPointParticipationOfInstantiationImpl#getInteractionPoint <em>Interaction Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionPointParticipationOfInstantiationImpl extends InteractionPointParticipationInstantiationImpl implements InteractionPointParticipationOfInstantiation {
    /**
     * The cached value of the '{@link #getLocationInstantiation() <em>Location Instantiation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocationInstantiation()
     * @generated
     * @ordered
     */
    protected LocationInstantiation locationInstantiation;

    /**
     * The cached value of the '{@link #getInteractionPointType() <em>Interaction Point Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInteractionPointType()
     * @generated
     * @ordered
     */
    protected InteractionPointType interactionPointType;

    /**
     * The cached value of the '{@link #getParticipationOfType() <em>Participation Of Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParticipationOfType()
     * @generated
     * @ordered
     */
    protected AbstractInteractionPointParticipationOfType participationOfType;

    /**
     * The cached value of the '{@link #getDelegatedFrom() <em>Delegated From</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDelegatedFrom()
     * @generated
     * @ordered
     */
    protected DelegatedInteractionPointParticipation delegatedFrom;

    /**
     * The cached value of the '{@link #getInteractionPoint() <em>Interaction Point</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInteractionPoint()
     * @generated
     * @ordered
     */
    protected InteractionPointInstantiation interactionPoint;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InteractionPointParticipationOfInstantiationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstantiationPackage.Literals.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LocationInstantiation getLocationInstantiation() {
        return locationInstantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLocationInstantiation(LocationInstantiation newLocationInstantiation, NotificationChain msgs) {
        LocationInstantiation oldLocationInstantiation = locationInstantiation;
        locationInstantiation = newLocationInstantiation;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__LOCATION_INSTANTIATION, oldLocationInstantiation, newLocationInstantiation);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocationInstantiation(LocationInstantiation newLocationInstantiation) {
        if (newLocationInstantiation != locationInstantiation) {
            NotificationChain msgs = null;
            if (locationInstantiation != null)
                msgs = ((InternalEObject)locationInstantiation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__LOCATION_INSTANTIATION, null, msgs);
            if (newLocationInstantiation != null)
                msgs = ((InternalEObject)newLocationInstantiation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__LOCATION_INSTANTIATION, null, msgs);
            msgs = basicSetLocationInstantiation(newLocationInstantiation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__LOCATION_INSTANTIATION, newLocationInstantiation, newLocationInstantiation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionPointType getInteractionPointType() {
        if (interactionPointType != null && interactionPointType.eIsProxy()) {
            InternalEObject oldInteractionPointType = (InternalEObject)interactionPointType;
            interactionPointType = (InteractionPointType)eResolveProxy(oldInteractionPointType);
            if (interactionPointType != oldInteractionPointType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__INTERACTION_POINT_TYPE, oldInteractionPointType, interactionPointType));
            }
        }
        return interactionPointType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionPointType basicGetInteractionPointType() {
        return interactionPointType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInteractionPointType(InteractionPointType newInteractionPointType, NotificationChain msgs) {
        InteractionPointType oldInteractionPointType = interactionPointType;
        interactionPointType = newInteractionPointType;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__INTERACTION_POINT_TYPE, oldInteractionPointType, newInteractionPointType);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInteractionPointType(InteractionPointType newInteractionPointType) {
        if (newInteractionPointType != interactionPointType) {
            NotificationChain msgs = null;
            if (interactionPointType != null)
                msgs = ((InternalEObject)interactionPointType).eInverseRemove(this, TypePackage.INTERACTION_POINT_TYPE__PARTICIPATIONS, InteractionPointType.class, msgs);
            if (newInteractionPointType != null)
                msgs = ((InternalEObject)newInteractionPointType).eInverseAdd(this, TypePackage.INTERACTION_POINT_TYPE__PARTICIPATIONS, InteractionPointType.class, msgs);
            msgs = basicSetInteractionPointType(newInteractionPointType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__INTERACTION_POINT_TYPE, newInteractionPointType, newInteractionPointType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractInteractionPointParticipationOfType getParticipationOfType() {
        if (participationOfType != null && participationOfType.eIsProxy()) {
            InternalEObject oldParticipationOfType = (InternalEObject)participationOfType;
            participationOfType = (AbstractInteractionPointParticipationOfType)eResolveProxy(oldParticipationOfType);
            if (participationOfType != oldParticipationOfType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__PARTICIPATION_OF_TYPE, oldParticipationOfType, participationOfType));
            }
        }
        return participationOfType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractInteractionPointParticipationOfType basicGetParticipationOfType() {
        return participationOfType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParticipationOfType(AbstractInteractionPointParticipationOfType newParticipationOfType, NotificationChain msgs) {
        AbstractInteractionPointParticipationOfType oldParticipationOfType = participationOfType;
        participationOfType = newParticipationOfType;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__PARTICIPATION_OF_TYPE, oldParticipationOfType, newParticipationOfType);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParticipationOfType(AbstractInteractionPointParticipationOfType newParticipationOfType) {
        if (newParticipationOfType != participationOfType) {
            NotificationChain msgs = null;
            if (participationOfType != null)
                msgs = ((InternalEObject)participationOfType).eInverseRemove(this, InstantiationPackage.ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__PARTICIPATION_OF_INSTANTIATION, AbstractInteractionPointParticipationOfType.class, msgs);
            if (newParticipationOfType != null)
                msgs = ((InternalEObject)newParticipationOfType).eInverseAdd(this, InstantiationPackage.ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__PARTICIPATION_OF_INSTANTIATION, AbstractInteractionPointParticipationOfType.class, msgs);
            msgs = basicSetParticipationOfType(newParticipationOfType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__PARTICIPATION_OF_TYPE, newParticipationOfType, newParticipationOfType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DelegatedInteractionPointParticipation getDelegatedFrom() {
        if (delegatedFrom != null && delegatedFrom.eIsProxy()) {
            InternalEObject oldDelegatedFrom = (InternalEObject)delegatedFrom;
            delegatedFrom = (DelegatedInteractionPointParticipation)eResolveProxy(oldDelegatedFrom);
            if (delegatedFrom != oldDelegatedFrom) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__DELEGATED_FROM, oldDelegatedFrom, delegatedFrom));
            }
        }
        return delegatedFrom;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DelegatedInteractionPointParticipation basicGetDelegatedFrom() {
        return delegatedFrom;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDelegatedFrom(DelegatedInteractionPointParticipation newDelegatedFrom, NotificationChain msgs) {
        DelegatedInteractionPointParticipation oldDelegatedFrom = delegatedFrom;
        delegatedFrom = newDelegatedFrom;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__DELEGATED_FROM, oldDelegatedFrom, newDelegatedFrom);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDelegatedFrom(DelegatedInteractionPointParticipation newDelegatedFrom) {
        if (newDelegatedFrom != delegatedFrom) {
            NotificationChain msgs = null;
            if (delegatedFrom != null)
                msgs = ((InternalEObject)delegatedFrom).eInverseRemove(this, InstantiationPackage.DELEGATED_INTERACTION_POINT_PARTICIPATION__DELEGATED_TO, DelegatedInteractionPointParticipation.class, msgs);
            if (newDelegatedFrom != null)
                msgs = ((InternalEObject)newDelegatedFrom).eInverseAdd(this, InstantiationPackage.DELEGATED_INTERACTION_POINT_PARTICIPATION__DELEGATED_TO, DelegatedInteractionPointParticipation.class, msgs);
            msgs = basicSetDelegatedFrom(newDelegatedFrom, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__DELEGATED_FROM, newDelegatedFrom, newDelegatedFrom));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityInstantiation getEntityInstantiation() {
        if (eContainerFeatureID() != InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__ENTITY_INSTANTIATION) return null;
        return (EntityInstantiation)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEntityInstantiation(EntityInstantiation newEntityInstantiation, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newEntityInstantiation, InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__ENTITY_INSTANTIATION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEntityInstantiation(EntityInstantiation newEntityInstantiation) {
        if (newEntityInstantiation != eInternalContainer() || (eContainerFeatureID() != InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__ENTITY_INSTANTIATION && newEntityInstantiation != null)) {
            if (EcoreUtil.isAncestor(this, newEntityInstantiation))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newEntityInstantiation != null)
                msgs = ((InternalEObject)newEntityInstantiation).eInverseAdd(this, InstantiationPackage.ENTITY_INSTANTIATION__INTERACTION_POINT_PARTICIPATIONS, EntityInstantiation.class, msgs);
            msgs = basicSetEntityInstantiation(newEntityInstantiation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__ENTITY_INSTANTIATION, newEntityInstantiation, newEntityInstantiation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionPointInstantiation getInteractionPoint() {
        if (interactionPoint != null && interactionPoint.eIsProxy()) {
            InternalEObject oldInteractionPoint = (InternalEObject)interactionPoint;
            interactionPoint = (InteractionPointInstantiation)eResolveProxy(oldInteractionPoint);
            if (interactionPoint != oldInteractionPoint) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__INTERACTION_POINT, oldInteractionPoint, interactionPoint));
            }
        }
        return interactionPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionPointInstantiation basicGetInteractionPoint() {
        return interactionPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInteractionPoint(InteractionPointInstantiation newInteractionPoint, NotificationChain msgs) {
        InteractionPointInstantiation oldInteractionPoint = interactionPoint;
        interactionPoint = newInteractionPoint;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__INTERACTION_POINT, oldInteractionPoint, newInteractionPoint);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInteractionPoint(InteractionPointInstantiation newInteractionPoint) {
        if (newInteractionPoint != interactionPoint) {
            NotificationChain msgs = null;
            if (interactionPoint != null)
                msgs = ((InternalEObject)interactionPoint).eInverseRemove(this, InstantiationPackage.INTERACTION_POINT_INSTANTIATION__PARTICIPATIONS, InteractionPointInstantiation.class, msgs);
            if (newInteractionPoint != null)
                msgs = ((InternalEObject)newInteractionPoint).eInverseAdd(this, InstantiationPackage.INTERACTION_POINT_INSTANTIATION__PARTICIPATIONS, InteractionPointInstantiation.class, msgs);
            msgs = basicSetInteractionPoint(newInteractionPoint, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__INTERACTION_POINT, newInteractionPoint, newInteractionPoint));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__INTERACTION_POINT_TYPE:
                if (interactionPointType != null)
                    msgs = ((InternalEObject)interactionPointType).eInverseRemove(this, TypePackage.INTERACTION_POINT_TYPE__PARTICIPATIONS, InteractionPointType.class, msgs);
                return basicSetInteractionPointType((InteractionPointType)otherEnd, msgs);
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__PARTICIPATION_OF_TYPE:
                if (participationOfType != null)
                    msgs = ((InternalEObject)participationOfType).eInverseRemove(this, InstantiationPackage.ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__PARTICIPATION_OF_INSTANTIATION, AbstractInteractionPointParticipationOfType.class, msgs);
                return basicSetParticipationOfType((AbstractInteractionPointParticipationOfType)otherEnd, msgs);
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__DELEGATED_FROM:
                if (delegatedFrom != null)
                    msgs = ((InternalEObject)delegatedFrom).eInverseRemove(this, InstantiationPackage.DELEGATED_INTERACTION_POINT_PARTICIPATION__DELEGATED_TO, DelegatedInteractionPointParticipation.class, msgs);
                return basicSetDelegatedFrom((DelegatedInteractionPointParticipation)otherEnd, msgs);
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__ENTITY_INSTANTIATION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetEntityInstantiation((EntityInstantiation)otherEnd, msgs);
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__INTERACTION_POINT:
                if (interactionPoint != null)
                    msgs = ((InternalEObject)interactionPoint).eInverseRemove(this, InstantiationPackage.INTERACTION_POINT_INSTANTIATION__PARTICIPATIONS, InteractionPointInstantiation.class, msgs);
                return basicSetInteractionPoint((InteractionPointInstantiation)otherEnd, msgs);
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
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__LOCATION_INSTANTIATION:
                return basicSetLocationInstantiation(null, msgs);
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__INTERACTION_POINT_TYPE:
                return basicSetInteractionPointType(null, msgs);
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__PARTICIPATION_OF_TYPE:
                return basicSetParticipationOfType(null, msgs);
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__DELEGATED_FROM:
                return basicSetDelegatedFrom(null, msgs);
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__ENTITY_INSTANTIATION:
                return basicSetEntityInstantiation(null, msgs);
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__INTERACTION_POINT:
                return basicSetInteractionPoint(null, msgs);
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
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__ENTITY_INSTANTIATION:
                return eInternalContainer().eInverseRemove(this, InstantiationPackage.ENTITY_INSTANTIATION__INTERACTION_POINT_PARTICIPATIONS, EntityInstantiation.class, msgs);
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
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__LOCATION_INSTANTIATION:
                return getLocationInstantiation();
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__INTERACTION_POINT_TYPE:
                if (resolve) return getInteractionPointType();
                return basicGetInteractionPointType();
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__PARTICIPATION_OF_TYPE:
                if (resolve) return getParticipationOfType();
                return basicGetParticipationOfType();
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__DELEGATED_FROM:
                if (resolve) return getDelegatedFrom();
                return basicGetDelegatedFrom();
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__ENTITY_INSTANTIATION:
                return getEntityInstantiation();
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__INTERACTION_POINT:
                if (resolve) return getInteractionPoint();
                return basicGetInteractionPoint();
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
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__LOCATION_INSTANTIATION:
                setLocationInstantiation((LocationInstantiation)newValue);
                return;
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__INTERACTION_POINT_TYPE:
                setInteractionPointType((InteractionPointType)newValue);
                return;
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__PARTICIPATION_OF_TYPE:
                setParticipationOfType((AbstractInteractionPointParticipationOfType)newValue);
                return;
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__DELEGATED_FROM:
                setDelegatedFrom((DelegatedInteractionPointParticipation)newValue);
                return;
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__ENTITY_INSTANTIATION:
                setEntityInstantiation((EntityInstantiation)newValue);
                return;
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__INTERACTION_POINT:
                setInteractionPoint((InteractionPointInstantiation)newValue);
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
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__LOCATION_INSTANTIATION:
                setLocationInstantiation((LocationInstantiation)null);
                return;
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__INTERACTION_POINT_TYPE:
                setInteractionPointType((InteractionPointType)null);
                return;
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__PARTICIPATION_OF_TYPE:
                setParticipationOfType((AbstractInteractionPointParticipationOfType)null);
                return;
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__DELEGATED_FROM:
                setDelegatedFrom((DelegatedInteractionPointParticipation)null);
                return;
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__ENTITY_INSTANTIATION:
                setEntityInstantiation((EntityInstantiation)null);
                return;
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__INTERACTION_POINT:
                setInteractionPoint((InteractionPointInstantiation)null);
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
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__LOCATION_INSTANTIATION:
                return locationInstantiation != null;
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__INTERACTION_POINT_TYPE:
                return interactionPointType != null;
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__PARTICIPATION_OF_TYPE:
                return participationOfType != null;
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__DELEGATED_FROM:
                return delegatedFrom != null;
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__ENTITY_INSTANTIATION:
                return getEntityInstantiation() != null;
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__INTERACTION_POINT:
                return interactionPoint != null;
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
        if (baseClass == LocalizableInstantiation.class) {
            switch (derivedFeatureID) {
                case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__LOCATION_INSTANTIATION: return InstantiationPackage.LOCALIZABLE_INSTANTIATION__LOCATION_INSTANTIATION;
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
        if (baseClass == LocalizableInstantiation.class) {
            switch (baseFeatureID) {
                case InstantiationPackage.LOCALIZABLE_INSTANTIATION__LOCATION_INSTANTIATION: return InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__LOCATION_INSTANTIATION;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //InteractionPointParticipationOfInstantiationImpl
