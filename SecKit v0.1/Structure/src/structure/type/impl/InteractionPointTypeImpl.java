/**
 */
package structure.type.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import structure.instantiation.InstantiationPackage;
import structure.instantiation.InteractionPointParticipationOfInstantiation;

import structure.type.InteractionPointParticipationType;
import structure.type.InteractionPointType;
import structure.type.TypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Point Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link structure.type.impl.InteractionPointTypeImpl#getParticipations <em>Participations</em>}</li>
 *   <li>{@link structure.type.impl.InteractionPointTypeImpl#getParticipationType <em>Participation Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionPointTypeImpl extends ActivityPointTypeImpl implements InteractionPointType {
    /**
     * The cached value of the '{@link #getParticipations() <em>Participations</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParticipations()
     * @generated
     * @ordered
     */
    protected EList<InteractionPointParticipationOfInstantiation> participations;

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
    protected InteractionPointTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.INTERACTION_POINT_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InteractionPointParticipationOfInstantiation> getParticipations() {
        if (participations == null) {
            participations = new EObjectWithInverseResolvingEList<InteractionPointParticipationOfInstantiation>(InteractionPointParticipationOfInstantiation.class, this, TypePackage.INTERACTION_POINT_TYPE__PARTICIPATIONS, InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__INTERACTION_POINT_TYPE);
        }
        return participations;
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypePackage.INTERACTION_POINT_TYPE__PARTICIPATION_TYPE, oldParticipationType, participationType));
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
    public void setParticipationType(InteractionPointParticipationType newParticipationType) {
        InteractionPointParticipationType oldParticipationType = participationType;
        participationType = newParticipationType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.INTERACTION_POINT_TYPE__PARTICIPATION_TYPE, oldParticipationType, participationType));
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
            case TypePackage.INTERACTION_POINT_TYPE__PARTICIPATIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getParticipations()).basicAdd(otherEnd, msgs);
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
            case TypePackage.INTERACTION_POINT_TYPE__PARTICIPATIONS:
                return ((InternalEList<?>)getParticipations()).basicRemove(otherEnd, msgs);
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
            case TypePackage.INTERACTION_POINT_TYPE__PARTICIPATIONS:
                return getParticipations();
            case TypePackage.INTERACTION_POINT_TYPE__PARTICIPATION_TYPE:
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
            case TypePackage.INTERACTION_POINT_TYPE__PARTICIPATIONS:
                getParticipations().clear();
                getParticipations().addAll((Collection<? extends InteractionPointParticipationOfInstantiation>)newValue);
                return;
            case TypePackage.INTERACTION_POINT_TYPE__PARTICIPATION_TYPE:
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
            case TypePackage.INTERACTION_POINT_TYPE__PARTICIPATIONS:
                getParticipations().clear();
                return;
            case TypePackage.INTERACTION_POINT_TYPE__PARTICIPATION_TYPE:
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
            case TypePackage.INTERACTION_POINT_TYPE__PARTICIPATIONS:
                return participations != null && !participations.isEmpty();
            case TypePackage.INTERACTION_POINT_TYPE__PARTICIPATION_TYPE:
                return participationType != null;
        }
        return super.eIsSet(featureID);
    }

} //InteractionPointTypeImpl
