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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import structure.instantiation.InstantiationPackage;
import structure.instantiation.InteractionPointParticipationInstantiation;

import structure.type.EntityTypePackage;
import structure.type.InteractionPointParticipationType;
import structure.type.LocalizableType;
import structure.type.LocationType;
import structure.type.TypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Point Participation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link structure.type.impl.InteractionPointParticipationTypeImpl#getLocationType <em>Location Type</em>}</li>
 *   <li>{@link structure.type.impl.InteractionPointParticipationTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link structure.type.impl.InteractionPointParticipationTypeImpl#getInstantiations <em>Instantiations</em>}</li>
 *   <li>{@link structure.type.impl.InteractionPointParticipationTypeImpl#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionPointParticipationTypeImpl extends ElementImpl implements InteractionPointParticipationType {
    /**
     * The cached value of the '{@link #getLocationType() <em>Location Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocationType()
     * @generated
     * @ordered
     */
    protected LocationType locationType;

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
     * The cached value of the '{@link #getInstantiations() <em>Instantiations</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstantiations()
     * @generated
     * @ordered
     */
    protected EList<InteractionPointParticipationInstantiation> instantiations;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InteractionPointParticipationTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.INTERACTION_POINT_PARTICIPATION_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LocationType getLocationType() {
        if (locationType != null && locationType.eIsProxy()) {
            InternalEObject oldLocationType = (InternalEObject)locationType;
            locationType = (LocationType)eResolveProxy(oldLocationType);
            if (locationType != oldLocationType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypePackage.INTERACTION_POINT_PARTICIPATION_TYPE__LOCATION_TYPE, oldLocationType, locationType));
            }
        }
        return locationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LocationType basicGetLocationType() {
        return locationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocationType(LocationType newLocationType) {
        LocationType oldLocationType = locationType;
        locationType = newLocationType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.INTERACTION_POINT_PARTICIPATION_TYPE__LOCATION_TYPE, oldLocationType, locationType));
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
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.INTERACTION_POINT_PARTICIPATION_TYPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InteractionPointParticipationInstantiation> getInstantiations() {
        if (instantiations == null) {
            instantiations = new EObjectWithInverseResolvingEList<InteractionPointParticipationInstantiation>(InteractionPointParticipationInstantiation.class, this, TypePackage.INTERACTION_POINT_PARTICIPATION_TYPE__INSTANTIATIONS, InstantiationPackage.INTERACTION_POINT_PARTICIPATION_INSTANTIATION__PARTICIPATION_TYPE);
        }
        return instantiations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityTypePackage getPackage() {
        if (eContainerFeatureID() != TypePackage.INTERACTION_POINT_PARTICIPATION_TYPE__PACKAGE) return null;
        return (EntityTypePackage)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPackage(EntityTypePackage newPackage, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newPackage, TypePackage.INTERACTION_POINT_PARTICIPATION_TYPE__PACKAGE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPackage(EntityTypePackage newPackage) {
        if (newPackage != eInternalContainer() || (eContainerFeatureID() != TypePackage.INTERACTION_POINT_PARTICIPATION_TYPE__PACKAGE && newPackage != null)) {
            if (EcoreUtil.isAncestor(this, newPackage))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newPackage != null)
                msgs = ((InternalEObject)newPackage).eInverseAdd(this, TypePackage.ENTITY_TYPE_PACKAGE__PARTICIPATION_TYPES, EntityTypePackage.class, msgs);
            msgs = basicSetPackage(newPackage, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.INTERACTION_POINT_PARTICIPATION_TYPE__PACKAGE, newPackage, newPackage));
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
            case TypePackage.INTERACTION_POINT_PARTICIPATION_TYPE__INSTANTIATIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstantiations()).basicAdd(otherEnd, msgs);
            case TypePackage.INTERACTION_POINT_PARTICIPATION_TYPE__PACKAGE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetPackage((EntityTypePackage)otherEnd, msgs);
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
            case TypePackage.INTERACTION_POINT_PARTICIPATION_TYPE__INSTANTIATIONS:
                return ((InternalEList<?>)getInstantiations()).basicRemove(otherEnd, msgs);
            case TypePackage.INTERACTION_POINT_PARTICIPATION_TYPE__PACKAGE:
                return basicSetPackage(null, msgs);
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
            case TypePackage.INTERACTION_POINT_PARTICIPATION_TYPE__PACKAGE:
                return eInternalContainer().eInverseRemove(this, TypePackage.ENTITY_TYPE_PACKAGE__PARTICIPATION_TYPES, EntityTypePackage.class, msgs);
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
            case TypePackage.INTERACTION_POINT_PARTICIPATION_TYPE__LOCATION_TYPE:
                if (resolve) return getLocationType();
                return basicGetLocationType();
            case TypePackage.INTERACTION_POINT_PARTICIPATION_TYPE__NAME:
                return getName();
            case TypePackage.INTERACTION_POINT_PARTICIPATION_TYPE__INSTANTIATIONS:
                return getInstantiations();
            case TypePackage.INTERACTION_POINT_PARTICIPATION_TYPE__PACKAGE:
                return getPackage();
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
            case TypePackage.INTERACTION_POINT_PARTICIPATION_TYPE__LOCATION_TYPE:
                setLocationType((LocationType)newValue);
                return;
            case TypePackage.INTERACTION_POINT_PARTICIPATION_TYPE__NAME:
                setName((String)newValue);
                return;
            case TypePackage.INTERACTION_POINT_PARTICIPATION_TYPE__INSTANTIATIONS:
                getInstantiations().clear();
                getInstantiations().addAll((Collection<? extends InteractionPointParticipationInstantiation>)newValue);
                return;
            case TypePackage.INTERACTION_POINT_PARTICIPATION_TYPE__PACKAGE:
                setPackage((EntityTypePackage)newValue);
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
            case TypePackage.INTERACTION_POINT_PARTICIPATION_TYPE__LOCATION_TYPE:
                setLocationType((LocationType)null);
                return;
            case TypePackage.INTERACTION_POINT_PARTICIPATION_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case TypePackage.INTERACTION_POINT_PARTICIPATION_TYPE__INSTANTIATIONS:
                getInstantiations().clear();
                return;
            case TypePackage.INTERACTION_POINT_PARTICIPATION_TYPE__PACKAGE:
                setPackage((EntityTypePackage)null);
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
            case TypePackage.INTERACTION_POINT_PARTICIPATION_TYPE__LOCATION_TYPE:
                return locationType != null;
            case TypePackage.INTERACTION_POINT_PARTICIPATION_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case TypePackage.INTERACTION_POINT_PARTICIPATION_TYPE__INSTANTIATIONS:
                return instantiations != null && !instantiations.isEmpty();
            case TypePackage.INTERACTION_POINT_PARTICIPATION_TYPE__PACKAGE:
                return getPackage() != null;
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
        if (baseClass == LocalizableType.class) {
            switch (derivedFeatureID) {
                case TypePackage.INTERACTION_POINT_PARTICIPATION_TYPE__LOCATION_TYPE: return TypePackage.LOCALIZABLE_TYPE__LOCATION_TYPE;
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
        if (baseClass == LocalizableType.class) {
            switch (baseFeatureID) {
                case TypePackage.LOCALIZABLE_TYPE__LOCATION_TYPE: return TypePackage.INTERACTION_POINT_PARTICIPATION_TYPE__LOCATION_TYPE;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //InteractionPointParticipationTypeImpl
