/**
 */
package behavior.instantiation.impl;

import behavior.instantiation.AbstractInteractionContributionOfType;
import behavior.instantiation.BehaviorInstantiation;
import behavior.instantiation.DelegatedInteractionContribution;
import behavior.instantiation.InstantiationPackage;
import behavior.instantiation.InteractionContributionOfInstantiation;
import behavior.instantiation.InteractionInstantiation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Contribution Of Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.instantiation.impl.InteractionContributionOfInstantiationImpl#getBehaviorInstantiation <em>Behavior Instantiation</em>}</li>
 *   <li>{@link behavior.instantiation.impl.InteractionContributionOfInstantiationImpl#getDelegatedFrom <em>Delegated From</em>}</li>
 *   <li>{@link behavior.instantiation.impl.InteractionContributionOfInstantiationImpl#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link behavior.instantiation.impl.InteractionContributionOfInstantiationImpl#getContributionOfType <em>Contribution Of Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionContributionOfInstantiationImpl extends InteractionContributionInstantiationImpl implements InteractionContributionOfInstantiation {
    /**
     * The cached value of the '{@link #getDelegatedFrom() <em>Delegated From</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDelegatedFrom()
     * @generated
     * @ordered
     */
    protected DelegatedInteractionContribution delegatedFrom;

    /**
     * The cached value of the '{@link #getInteraction() <em>Interaction</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInteraction()
     * @generated
     * @ordered
     */
    protected InteractionInstantiation interaction;

    /**
     * The cached value of the '{@link #getContributionOfType() <em>Contribution Of Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContributionOfType()
     * @generated
     * @ordered
     */
    protected AbstractInteractionContributionOfType contributionOfType;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InteractionContributionOfInstantiationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstantiationPackage.Literals.INTERACTION_CONTRIBUTION_OF_INSTANTIATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorInstantiation getBehaviorInstantiation() {
        if (eContainerFeatureID() != InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__BEHAVIOR_INSTANTIATION) return null;
        return (BehaviorInstantiation)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBehaviorInstantiation(BehaviorInstantiation newBehaviorInstantiation, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newBehaviorInstantiation, InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__BEHAVIOR_INSTANTIATION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBehaviorInstantiation(BehaviorInstantiation newBehaviorInstantiation) {
        if (newBehaviorInstantiation != eInternalContainer() || (eContainerFeatureID() != InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__BEHAVIOR_INSTANTIATION && newBehaviorInstantiation != null)) {
            if (EcoreUtil.isAncestor(this, newBehaviorInstantiation))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newBehaviorInstantiation != null)
                msgs = ((InternalEObject)newBehaviorInstantiation).eInverseAdd(this, InstantiationPackage.BEHAVIOR_INSTANTIATION__CONTRIBUTIONS, BehaviorInstantiation.class, msgs);
            msgs = basicSetBehaviorInstantiation(newBehaviorInstantiation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__BEHAVIOR_INSTANTIATION, newBehaviorInstantiation, newBehaviorInstantiation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DelegatedInteractionContribution getDelegatedFrom() {
        if (delegatedFrom != null && delegatedFrom.eIsProxy()) {
            InternalEObject oldDelegatedFrom = (InternalEObject)delegatedFrom;
            delegatedFrom = (DelegatedInteractionContribution)eResolveProxy(oldDelegatedFrom);
            if (delegatedFrom != oldDelegatedFrom) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__DELEGATED_FROM, oldDelegatedFrom, delegatedFrom));
            }
        }
        return delegatedFrom;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DelegatedInteractionContribution basicGetDelegatedFrom() {
        return delegatedFrom;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDelegatedFrom(DelegatedInteractionContribution newDelegatedFrom, NotificationChain msgs) {
        DelegatedInteractionContribution oldDelegatedFrom = delegatedFrom;
        delegatedFrom = newDelegatedFrom;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__DELEGATED_FROM, oldDelegatedFrom, newDelegatedFrom);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDelegatedFrom(DelegatedInteractionContribution newDelegatedFrom) {
        if (newDelegatedFrom != delegatedFrom) {
            NotificationChain msgs = null;
            if (delegatedFrom != null)
                msgs = ((InternalEObject)delegatedFrom).eInverseRemove(this, InstantiationPackage.DELEGATED_INTERACTION_CONTRIBUTION__DELEGATED_TO, DelegatedInteractionContribution.class, msgs);
            if (newDelegatedFrom != null)
                msgs = ((InternalEObject)newDelegatedFrom).eInverseAdd(this, InstantiationPackage.DELEGATED_INTERACTION_CONTRIBUTION__DELEGATED_TO, DelegatedInteractionContribution.class, msgs);
            msgs = basicSetDelegatedFrom(newDelegatedFrom, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__DELEGATED_FROM, newDelegatedFrom, newDelegatedFrom));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionInstantiation getInteraction() {
        if (interaction != null && interaction.eIsProxy()) {
            InternalEObject oldInteraction = (InternalEObject)interaction;
            interaction = (InteractionInstantiation)eResolveProxy(oldInteraction);
            if (interaction != oldInteraction) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__INTERACTION, oldInteraction, interaction));
            }
        }
        return interaction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionInstantiation basicGetInteraction() {
        return interaction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInteraction(InteractionInstantiation newInteraction, NotificationChain msgs) {
        InteractionInstantiation oldInteraction = interaction;
        interaction = newInteraction;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__INTERACTION, oldInteraction, newInteraction);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInteraction(InteractionInstantiation newInteraction) {
        if (newInteraction != interaction) {
            NotificationChain msgs = null;
            if (interaction != null)
                msgs = ((InternalEObject)interaction).eInverseRemove(this, InstantiationPackage.INTERACTION_INSTANTIATION__CONTRIBUTIONS, InteractionInstantiation.class, msgs);
            if (newInteraction != null)
                msgs = ((InternalEObject)newInteraction).eInverseAdd(this, InstantiationPackage.INTERACTION_INSTANTIATION__CONTRIBUTIONS, InteractionInstantiation.class, msgs);
            msgs = basicSetInteraction(newInteraction, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__INTERACTION, newInteraction, newInteraction));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractInteractionContributionOfType getContributionOfType() {
        if (contributionOfType != null && contributionOfType.eIsProxy()) {
            InternalEObject oldContributionOfType = (InternalEObject)contributionOfType;
            contributionOfType = (AbstractInteractionContributionOfType)eResolveProxy(oldContributionOfType);
            if (contributionOfType != oldContributionOfType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__CONTRIBUTION_OF_TYPE, oldContributionOfType, contributionOfType));
            }
        }
        return contributionOfType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractInteractionContributionOfType basicGetContributionOfType() {
        return contributionOfType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetContributionOfType(AbstractInteractionContributionOfType newContributionOfType, NotificationChain msgs) {
        AbstractInteractionContributionOfType oldContributionOfType = contributionOfType;
        contributionOfType = newContributionOfType;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__CONTRIBUTION_OF_TYPE, oldContributionOfType, newContributionOfType);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContributionOfType(AbstractInteractionContributionOfType newContributionOfType) {
        if (newContributionOfType != contributionOfType) {
            NotificationChain msgs = null;
            if (contributionOfType != null)
                msgs = ((InternalEObject)contributionOfType).eInverseRemove(this, InstantiationPackage.ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__CONTRIBUTION_OF_INSTANTIATIONS, AbstractInteractionContributionOfType.class, msgs);
            if (newContributionOfType != null)
                msgs = ((InternalEObject)newContributionOfType).eInverseAdd(this, InstantiationPackage.ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__CONTRIBUTION_OF_INSTANTIATIONS, AbstractInteractionContributionOfType.class, msgs);
            msgs = basicSetContributionOfType(newContributionOfType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__CONTRIBUTION_OF_TYPE, newContributionOfType, newContributionOfType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__BEHAVIOR_INSTANTIATION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetBehaviorInstantiation((BehaviorInstantiation)otherEnd, msgs);
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__DELEGATED_FROM:
                if (delegatedFrom != null)
                    msgs = ((InternalEObject)delegatedFrom).eInverseRemove(this, InstantiationPackage.DELEGATED_INTERACTION_CONTRIBUTION__DELEGATED_TO, DelegatedInteractionContribution.class, msgs);
                return basicSetDelegatedFrom((DelegatedInteractionContribution)otherEnd, msgs);
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__INTERACTION:
                if (interaction != null)
                    msgs = ((InternalEObject)interaction).eInverseRemove(this, InstantiationPackage.INTERACTION_INSTANTIATION__CONTRIBUTIONS, InteractionInstantiation.class, msgs);
                return basicSetInteraction((InteractionInstantiation)otherEnd, msgs);
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__CONTRIBUTION_OF_TYPE:
                if (contributionOfType != null)
                    msgs = ((InternalEObject)contributionOfType).eInverseRemove(this, InstantiationPackage.ABSTRACT_INTERACTION_CONTRIBUTION_OF_TYPE__CONTRIBUTION_OF_INSTANTIATIONS, AbstractInteractionContributionOfType.class, msgs);
                return basicSetContributionOfType((AbstractInteractionContributionOfType)otherEnd, msgs);
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
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__BEHAVIOR_INSTANTIATION:
                return basicSetBehaviorInstantiation(null, msgs);
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__DELEGATED_FROM:
                return basicSetDelegatedFrom(null, msgs);
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__INTERACTION:
                return basicSetInteraction(null, msgs);
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__CONTRIBUTION_OF_TYPE:
                return basicSetContributionOfType(null, msgs);
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
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__BEHAVIOR_INSTANTIATION:
                return eInternalContainer().eInverseRemove(this, InstantiationPackage.BEHAVIOR_INSTANTIATION__CONTRIBUTIONS, BehaviorInstantiation.class, msgs);
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
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__BEHAVIOR_INSTANTIATION:
                return getBehaviorInstantiation();
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__DELEGATED_FROM:
                if (resolve) return getDelegatedFrom();
                return basicGetDelegatedFrom();
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__INTERACTION:
                if (resolve) return getInteraction();
                return basicGetInteraction();
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__CONTRIBUTION_OF_TYPE:
                if (resolve) return getContributionOfType();
                return basicGetContributionOfType();
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
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__BEHAVIOR_INSTANTIATION:
                setBehaviorInstantiation((BehaviorInstantiation)newValue);
                return;
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__DELEGATED_FROM:
                setDelegatedFrom((DelegatedInteractionContribution)newValue);
                return;
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__INTERACTION:
                setInteraction((InteractionInstantiation)newValue);
                return;
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__CONTRIBUTION_OF_TYPE:
                setContributionOfType((AbstractInteractionContributionOfType)newValue);
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
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__BEHAVIOR_INSTANTIATION:
                setBehaviorInstantiation((BehaviorInstantiation)null);
                return;
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__DELEGATED_FROM:
                setDelegatedFrom((DelegatedInteractionContribution)null);
                return;
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__INTERACTION:
                setInteraction((InteractionInstantiation)null);
                return;
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__CONTRIBUTION_OF_TYPE:
                setContributionOfType((AbstractInteractionContributionOfType)null);
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
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__BEHAVIOR_INSTANTIATION:
                return getBehaviorInstantiation() != null;
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__DELEGATED_FROM:
                return delegatedFrom != null;
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__INTERACTION:
                return interaction != null;
            case InstantiationPackage.INTERACTION_CONTRIBUTION_OF_INSTANTIATION__CONTRIBUTION_OF_TYPE:
                return contributionOfType != null;
        }
        return super.eIsSet(featureID);
    }

} //InteractionContributionOfInstantiationImpl
