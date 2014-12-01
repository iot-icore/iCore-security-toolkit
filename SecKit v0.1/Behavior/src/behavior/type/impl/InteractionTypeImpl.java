/**
 */
package behavior.type.impl;

import behavior.instance.InstancePackage;
import behavior.instance.Interaction;

import behavior.type.InteractionContributionType;
import behavior.type.InteractionPatternType;
import behavior.type.InteractionType;
import behavior.type.TypePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.type.impl.InteractionTypeImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link behavior.type.impl.InteractionTypeImpl#getInteractionPattern <em>Interaction Pattern</em>}</li>
 *   <li>{@link behavior.type.impl.InteractionTypeImpl#getContributionTypes <em>Contribution Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionTypeImpl extends ActivityTypeImpl implements InteractionType {
    /**
     * The cached value of the '{@link #getInstances() <em>Instances</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstances()
     * @generated
     * @ordered
     */
    protected EList<Interaction> instances;

    /**
     * The default value of the '{@link #getInteractionPattern() <em>Interaction Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInteractionPattern()
     * @generated
     * @ordered
     */
    protected static final InteractionPatternType INTERACTION_PATTERN_EDEFAULT = InteractionPatternType.MESSAGE_PASSING;

    /**
     * The cached value of the '{@link #getInteractionPattern() <em>Interaction Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInteractionPattern()
     * @generated
     * @ordered
     */
    protected InteractionPatternType interactionPattern = INTERACTION_PATTERN_EDEFAULT;

    /**
     * The cached value of the '{@link #getContributionTypes() <em>Contribution Types</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContributionTypes()
     * @generated
     * @ordered
     */
    protected EList<InteractionContributionType> contributionTypes;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InteractionTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.INTERACTION_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Interaction> getInstances() {
        if (instances == null) {
            instances = new EObjectWithInverseResolvingEList<Interaction>(Interaction.class, this, TypePackage.INTERACTION_TYPE__INSTANCES, InstancePackage.INTERACTION__TYPE);
        }
        return instances;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionPatternType getInteractionPattern() {
        return interactionPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInteractionPattern(InteractionPatternType newInteractionPattern) {
        InteractionPatternType oldInteractionPattern = interactionPattern;
        interactionPattern = newInteractionPattern == null ? INTERACTION_PATTERN_EDEFAULT : newInteractionPattern;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.INTERACTION_TYPE__INTERACTION_PATTERN, oldInteractionPattern, interactionPattern));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InteractionContributionType> getContributionTypes() {
        if (contributionTypes == null) {
            contributionTypes = new EObjectContainmentWithInverseEList<InteractionContributionType>(InteractionContributionType.class, this, TypePackage.INTERACTION_TYPE__CONTRIBUTION_TYPES, TypePackage.INTERACTION_CONTRIBUTION_TYPE__INTERACTION_TYPE);
        }
        return contributionTypes;
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
            case TypePackage.INTERACTION_TYPE__INSTANCES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstances()).basicAdd(otherEnd, msgs);
            case TypePackage.INTERACTION_TYPE__CONTRIBUTION_TYPES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getContributionTypes()).basicAdd(otherEnd, msgs);
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
            case TypePackage.INTERACTION_TYPE__INSTANCES:
                return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
            case TypePackage.INTERACTION_TYPE__CONTRIBUTION_TYPES:
                return ((InternalEList<?>)getContributionTypes()).basicRemove(otherEnd, msgs);
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
            case TypePackage.INTERACTION_TYPE__INSTANCES:
                return getInstances();
            case TypePackage.INTERACTION_TYPE__INTERACTION_PATTERN:
                return getInteractionPattern();
            case TypePackage.INTERACTION_TYPE__CONTRIBUTION_TYPES:
                return getContributionTypes();
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
            case TypePackage.INTERACTION_TYPE__INSTANCES:
                getInstances().clear();
                getInstances().addAll((Collection<? extends Interaction>)newValue);
                return;
            case TypePackage.INTERACTION_TYPE__INTERACTION_PATTERN:
                setInteractionPattern((InteractionPatternType)newValue);
                return;
            case TypePackage.INTERACTION_TYPE__CONTRIBUTION_TYPES:
                getContributionTypes().clear();
                getContributionTypes().addAll((Collection<? extends InteractionContributionType>)newValue);
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
            case TypePackage.INTERACTION_TYPE__INSTANCES:
                getInstances().clear();
                return;
            case TypePackage.INTERACTION_TYPE__INTERACTION_PATTERN:
                setInteractionPattern(INTERACTION_PATTERN_EDEFAULT);
                return;
            case TypePackage.INTERACTION_TYPE__CONTRIBUTION_TYPES:
                getContributionTypes().clear();
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
            case TypePackage.INTERACTION_TYPE__INSTANCES:
                return instances != null && !instances.isEmpty();
            case TypePackage.INTERACTION_TYPE__INTERACTION_PATTERN:
                return interactionPattern != INTERACTION_PATTERN_EDEFAULT;
            case TypePackage.INTERACTION_TYPE__CONTRIBUTION_TYPES:
                return contributionTypes != null && !contributionTypes.isEmpty();
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
        result.append(" (interactionPattern: ");
        result.append(interactionPattern);
        result.append(')');
        return result.toString();
    }

} //InteractionTypeImpl
