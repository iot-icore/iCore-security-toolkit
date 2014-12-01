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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import structure.instance.InstancePackage;
import structure.instance.InteractionPointParticipation;

import structure.instantiation.InstantiationPackage;
import structure.instantiation.InteractionPointParticipationInstantiation;

import structure.type.InteractionPointParticipationType;
import structure.type.TypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Point Participation Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link structure.instantiation.impl.InteractionPointParticipationInstantiationImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link structure.instantiation.impl.InteractionPointParticipationInstantiationImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link structure.instantiation.impl.InteractionPointParticipationInstantiationImpl#getParticipationType <em>Participation Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class InteractionPointParticipationInstantiationImpl extends ElementImpl implements InteractionPointParticipationInstantiation {
    /**
     * The cached value of the '{@link #getInstances() <em>Instances</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstances()
     * @generated
     * @ordered
     */
    protected EList<InteractionPointParticipation> instances;

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
     * The cached value of the '{@link #getParticipationType() <em>Participation Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParticipationType()
     * @generated
     * @ordered
     */
    protected InteractionPointParticipationType participationType;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InteractionPointParticipationInstantiationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstantiationPackage.Literals.INTERACTION_POINT_PARTICIPATION_INSTANTIATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InteractionPointParticipation> getInstances() {
        if (instances == null) {
            instances = new EObjectWithInverseResolvingEList<InteractionPointParticipation>(InteractionPointParticipation.class, this, InstantiationPackage.INTERACTION_POINT_PARTICIPATION_INSTANTIATION__INSTANCES, InstancePackage.INTERACTION_POINT_PARTICIPATION__INSTANTIATION);
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstantiationPackage.INTERACTION_POINT_PARTICIPATION_INSTANTIATION__MULTIPLICITY, oldMultiplicity, newMultiplicity);
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
                msgs = ((InternalEObject)multiplicity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstantiationPackage.INTERACTION_POINT_PARTICIPATION_INSTANTIATION__MULTIPLICITY, null, msgs);
            if (newMultiplicity != null)
                msgs = ((InternalEObject)newMultiplicity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstantiationPackage.INTERACTION_POINT_PARTICIPATION_INSTANTIATION__MULTIPLICITY, null, msgs);
            msgs = basicSetMultiplicity(newMultiplicity, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.INTERACTION_POINT_PARTICIPATION_INSTANTIATION__MULTIPLICITY, newMultiplicity, newMultiplicity));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionPointParticipationType getParticipationType() {
        if (participationType != null && participationType.eIsProxy()) {
            InternalEObject oldParticipationType = (InternalEObject)participationType;
            participationType = (InteractionPointParticipationType)eResolveProxy(oldParticipationType);
            if (participationType != oldParticipationType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstantiationPackage.INTERACTION_POINT_PARTICIPATION_INSTANTIATION__PARTICIPATION_TYPE, oldParticipationType, participationType));
            }
        }
        return participationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionPointParticipationType basicGetParticipationType() {
        return participationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParticipationType(InteractionPointParticipationType newParticipationType, NotificationChain msgs) {
        InteractionPointParticipationType oldParticipationType = participationType;
        participationType = newParticipationType;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstantiationPackage.INTERACTION_POINT_PARTICIPATION_INSTANTIATION__PARTICIPATION_TYPE, oldParticipationType, newParticipationType);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParticipationType(InteractionPointParticipationType newParticipationType) {
        if (newParticipationType != participationType) {
            NotificationChain msgs = null;
            if (participationType != null)
                msgs = ((InternalEObject)participationType).eInverseRemove(this, TypePackage.INTERACTION_POINT_PARTICIPATION_TYPE__INSTANTIATIONS, InteractionPointParticipationType.class, msgs);
            if (newParticipationType != null)
                msgs = ((InternalEObject)newParticipationType).eInverseAdd(this, TypePackage.INTERACTION_POINT_PARTICIPATION_TYPE__INSTANTIATIONS, InteractionPointParticipationType.class, msgs);
            msgs = basicSetParticipationType(newParticipationType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.INTERACTION_POINT_PARTICIPATION_INSTANTIATION__PARTICIPATION_TYPE, newParticipationType, newParticipationType));
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
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_INSTANTIATION__INSTANCES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstances()).basicAdd(otherEnd, msgs);
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_INSTANTIATION__PARTICIPATION_TYPE:
                if (participationType != null)
                    msgs = ((InternalEObject)participationType).eInverseRemove(this, TypePackage.INTERACTION_POINT_PARTICIPATION_TYPE__INSTANTIATIONS, InteractionPointParticipationType.class, msgs);
                return basicSetParticipationType((InteractionPointParticipationType)otherEnd, msgs);
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
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_INSTANTIATION__INSTANCES:
                return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_INSTANTIATION__MULTIPLICITY:
                return basicSetMultiplicity(null, msgs);
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_INSTANTIATION__PARTICIPATION_TYPE:
                return basicSetParticipationType(null, msgs);
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
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_INSTANTIATION__INSTANCES:
                return getInstances();
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_INSTANTIATION__MULTIPLICITY:
                return getMultiplicity();
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_INSTANTIATION__PARTICIPATION_TYPE:
                if (resolve) return getParticipationType();
                return basicGetParticipationType();
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
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_INSTANTIATION__INSTANCES:
                getInstances().clear();
                getInstances().addAll((Collection<? extends InteractionPointParticipation>)newValue);
                return;
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_INSTANTIATION__MULTIPLICITY:
                setMultiplicity((Multiplicity)newValue);
                return;
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_INSTANTIATION__PARTICIPATION_TYPE:
                setParticipationType((InteractionPointParticipationType)newValue);
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
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_INSTANTIATION__INSTANCES:
                getInstances().clear();
                return;
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_INSTANTIATION__MULTIPLICITY:
                setMultiplicity((Multiplicity)null);
                return;
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_INSTANTIATION__PARTICIPATION_TYPE:
                setParticipationType((InteractionPointParticipationType)null);
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
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_INSTANTIATION__INSTANCES:
                return instances != null && !instances.isEmpty();
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_INSTANTIATION__MULTIPLICITY:
                return multiplicity != null;
            case InstantiationPackage.INTERACTION_POINT_PARTICIPATION_INSTANTIATION__PARTICIPATION_TYPE:
                return participationType != null;
        }
        return super.eIsSet(featureID);
    }

} //InteractionPointParticipationInstantiationImpl
