/**
 */
package behavior.pattern.impl;

import behavior.instantiation.AbstractInteractionContributionOfType;

import behavior.pattern.BehaviorPattern;
import behavior.pattern.InteractionContributionPattern;
import behavior.pattern.PatternPackage;

import behavior.type.InteractionContributionType;

import models.impl.PatternImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Contribution Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.pattern.impl.InteractionContributionPatternImpl#getParticipantBehaviorPattern <em>Participant Behavior Pattern</em>}</li>
 *   <li>{@link behavior.pattern.impl.InteractionContributionPatternImpl#getType <em>Type</em>}</li>
 *   <li>{@link behavior.pattern.impl.InteractionContributionPatternImpl#getContributionOfType <em>Contribution Of Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionContributionPatternImpl extends PatternImpl implements InteractionContributionPattern {
    /**
     * The cached value of the '{@link #getParticipantBehaviorPattern() <em>Participant Behavior Pattern</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParticipantBehaviorPattern()
     * @generated
     * @ordered
     */
    protected BehaviorPattern participantBehaviorPattern;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected InteractionContributionType type;

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
    protected InteractionContributionPatternImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PatternPackage.Literals.INTERACTION_CONTRIBUTION_PATTERN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorPattern getParticipantBehaviorPattern() {
        return participantBehaviorPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParticipantBehaviorPattern(BehaviorPattern newParticipantBehaviorPattern, NotificationChain msgs) {
        BehaviorPattern oldParticipantBehaviorPattern = participantBehaviorPattern;
        participantBehaviorPattern = newParticipantBehaviorPattern;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternPackage.INTERACTION_CONTRIBUTION_PATTERN__PARTICIPANT_BEHAVIOR_PATTERN, oldParticipantBehaviorPattern, newParticipantBehaviorPattern);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParticipantBehaviorPattern(BehaviorPattern newParticipantBehaviorPattern) {
        if (newParticipantBehaviorPattern != participantBehaviorPattern) {
            NotificationChain msgs = null;
            if (participantBehaviorPattern != null)
                msgs = ((InternalEObject)participantBehaviorPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternPackage.INTERACTION_CONTRIBUTION_PATTERN__PARTICIPANT_BEHAVIOR_PATTERN, null, msgs);
            if (newParticipantBehaviorPattern != null)
                msgs = ((InternalEObject)newParticipantBehaviorPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternPackage.INTERACTION_CONTRIBUTION_PATTERN__PARTICIPANT_BEHAVIOR_PATTERN, null, msgs);
            msgs = basicSetParticipantBehaviorPattern(newParticipantBehaviorPattern, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.INTERACTION_CONTRIBUTION_PATTERN__PARTICIPANT_BEHAVIOR_PATTERN, newParticipantBehaviorPattern, newParticipantBehaviorPattern));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionContributionType getType() {
        if (type != null && type.eIsProxy()) {
            InternalEObject oldType = (InternalEObject)type;
            type = (InteractionContributionType)eResolveProxy(oldType);
            if (type != oldType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.INTERACTION_CONTRIBUTION_PATTERN__TYPE, oldType, type));
            }
        }
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionContributionType basicGetType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(InteractionContributionType newType) {
        InteractionContributionType oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.INTERACTION_CONTRIBUTION_PATTERN__TYPE, oldType, type));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.INTERACTION_CONTRIBUTION_PATTERN__CONTRIBUTION_OF_TYPE, oldContributionOfType, contributionOfType));
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
    public void setContributionOfType(AbstractInteractionContributionOfType newContributionOfType) {
        AbstractInteractionContributionOfType oldContributionOfType = contributionOfType;
        contributionOfType = newContributionOfType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.INTERACTION_CONTRIBUTION_PATTERN__CONTRIBUTION_OF_TYPE, oldContributionOfType, contributionOfType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PatternPackage.INTERACTION_CONTRIBUTION_PATTERN__PARTICIPANT_BEHAVIOR_PATTERN:
                return basicSetParticipantBehaviorPattern(null, msgs);
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
            case PatternPackage.INTERACTION_CONTRIBUTION_PATTERN__PARTICIPANT_BEHAVIOR_PATTERN:
                return getParticipantBehaviorPattern();
            case PatternPackage.INTERACTION_CONTRIBUTION_PATTERN__TYPE:
                if (resolve) return getType();
                return basicGetType();
            case PatternPackage.INTERACTION_CONTRIBUTION_PATTERN__CONTRIBUTION_OF_TYPE:
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
            case PatternPackage.INTERACTION_CONTRIBUTION_PATTERN__PARTICIPANT_BEHAVIOR_PATTERN:
                setParticipantBehaviorPattern((BehaviorPattern)newValue);
                return;
            case PatternPackage.INTERACTION_CONTRIBUTION_PATTERN__TYPE:
                setType((InteractionContributionType)newValue);
                return;
            case PatternPackage.INTERACTION_CONTRIBUTION_PATTERN__CONTRIBUTION_OF_TYPE:
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
            case PatternPackage.INTERACTION_CONTRIBUTION_PATTERN__PARTICIPANT_BEHAVIOR_PATTERN:
                setParticipantBehaviorPattern((BehaviorPattern)null);
                return;
            case PatternPackage.INTERACTION_CONTRIBUTION_PATTERN__TYPE:
                setType((InteractionContributionType)null);
                return;
            case PatternPackage.INTERACTION_CONTRIBUTION_PATTERN__CONTRIBUTION_OF_TYPE:
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
            case PatternPackage.INTERACTION_CONTRIBUTION_PATTERN__PARTICIPANT_BEHAVIOR_PATTERN:
                return participantBehaviorPattern != null;
            case PatternPackage.INTERACTION_CONTRIBUTION_PATTERN__TYPE:
                return type != null;
            case PatternPackage.INTERACTION_CONTRIBUTION_PATTERN__CONTRIBUTION_OF_TYPE:
                return contributionOfType != null;
        }
        return super.eIsSet(featureID);
    }

} //InteractionContributionPatternImpl
