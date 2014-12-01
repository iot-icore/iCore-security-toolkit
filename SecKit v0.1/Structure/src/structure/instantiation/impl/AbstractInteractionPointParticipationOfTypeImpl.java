/**
 */
package structure.instantiation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import structure.instantiation.AbstractInteractionPointParticipationOfType;
import structure.instantiation.InstantiationPackage;
import structure.instantiation.InteractionPointParticipationOfInstantiation;

import structure.type.EntityType;
import structure.type.TypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Interaction Point Participation Of Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link structure.instantiation.impl.AbstractInteractionPointParticipationOfTypeImpl#getParticipationOfInstantiation <em>Participation Of Instantiation</em>}</li>
 *   <li>{@link structure.instantiation.impl.AbstractInteractionPointParticipationOfTypeImpl#getEntityType <em>Entity Type</em>}</li>
 *   <li>{@link structure.instantiation.impl.AbstractInteractionPointParticipationOfTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractInteractionPointParticipationOfTypeImpl extends InteractionPointParticipationInstantiationImpl implements AbstractInteractionPointParticipationOfType {
    /**
     * The cached value of the '{@link #getParticipationOfInstantiation() <em>Participation Of Instantiation</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParticipationOfInstantiation()
     * @generated
     * @ordered
     */
    protected EList<InteractionPointParticipationOfInstantiation> participationOfInstantiation;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AbstractInteractionPointParticipationOfTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstantiationPackage.Literals.ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InteractionPointParticipationOfInstantiation> getParticipationOfInstantiation() {
        if (participationOfInstantiation == null) {
            participationOfInstantiation = new EObjectWithInverseResolvingEList<InteractionPointParticipationOfInstantiation>(InteractionPointParticipationOfInstantiation.class, this, InstantiationPackage.ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__PARTICIPATION_OF_INSTANTIATION, InstantiationPackage.INTERACTION_POINT_PARTICIPATION_OF_INSTANTIATION__PARTICIPATION_OF_TYPE);
        }
        return participationOfInstantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityType getEntityType() {
        if (eContainerFeatureID() != InstantiationPackage.ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__ENTITY_TYPE) return null;
        return (EntityType)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEntityType(EntityType newEntityType, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newEntityType, InstantiationPackage.ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__ENTITY_TYPE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEntityType(EntityType newEntityType) {
        if (newEntityType != eInternalContainer() || (eContainerFeatureID() != InstantiationPackage.ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__ENTITY_TYPE && newEntityType != null)) {
            if (EcoreUtil.isAncestor(this, newEntityType))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newEntityType != null)
                msgs = ((InternalEObject)newEntityType).eInverseAdd(this, TypePackage.ENTITY_TYPE__INTERACTION_POINT_PARTICIPATIONS, EntityType.class, msgs);
            msgs = basicSetEntityType(newEntityType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__ENTITY_TYPE, newEntityType, newEntityType));
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
            eNotify(new ENotificationImpl(this, Notification.SET, InstantiationPackage.ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__NAME, oldName, name));
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
            case InstantiationPackage.ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__PARTICIPATION_OF_INSTANTIATION:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getParticipationOfInstantiation()).basicAdd(otherEnd, msgs);
            case InstantiationPackage.ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__ENTITY_TYPE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetEntityType((EntityType)otherEnd, msgs);
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
            case InstantiationPackage.ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__PARTICIPATION_OF_INSTANTIATION:
                return ((InternalEList<?>)getParticipationOfInstantiation()).basicRemove(otherEnd, msgs);
            case InstantiationPackage.ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__ENTITY_TYPE:
                return basicSetEntityType(null, msgs);
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
            case InstantiationPackage.ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__ENTITY_TYPE:
                return eInternalContainer().eInverseRemove(this, TypePackage.ENTITY_TYPE__INTERACTION_POINT_PARTICIPATIONS, EntityType.class, msgs);
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
            case InstantiationPackage.ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__PARTICIPATION_OF_INSTANTIATION:
                return getParticipationOfInstantiation();
            case InstantiationPackage.ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__ENTITY_TYPE:
                return getEntityType();
            case InstantiationPackage.ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__NAME:
                return getName();
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
            case InstantiationPackage.ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__PARTICIPATION_OF_INSTANTIATION:
                getParticipationOfInstantiation().clear();
                getParticipationOfInstantiation().addAll((Collection<? extends InteractionPointParticipationOfInstantiation>)newValue);
                return;
            case InstantiationPackage.ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__ENTITY_TYPE:
                setEntityType((EntityType)newValue);
                return;
            case InstantiationPackage.ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__NAME:
                setName((String)newValue);
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
            case InstantiationPackage.ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__PARTICIPATION_OF_INSTANTIATION:
                getParticipationOfInstantiation().clear();
                return;
            case InstantiationPackage.ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__ENTITY_TYPE:
                setEntityType((EntityType)null);
                return;
            case InstantiationPackage.ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__NAME:
                setName(NAME_EDEFAULT);
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
            case InstantiationPackage.ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__PARTICIPATION_OF_INSTANTIATION:
                return participationOfInstantiation != null && !participationOfInstantiation.isEmpty();
            case InstantiationPackage.ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__ENTITY_TYPE:
                return getEntityType() != null;
            case InstantiationPackage.ABSTRACT_INTERACTION_POINT_PARTICIPATION_OF_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //AbstractInteractionPointParticipationOfTypeImpl
