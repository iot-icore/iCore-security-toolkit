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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import structure.StructuralDesignModel;
import structure.StructurePackage;

import structure.type.ActivityPointType;
import structure.type.EntityType;
import structure.type.EntityTypePackage;
import structure.type.InteractionPointParticipationType;
import structure.type.LocationType;
import structure.type.TypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Type Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link structure.type.impl.EntityTypePackageImpl#getSubPackages <em>Sub Packages</em>}</li>
 *   <li>{@link structure.type.impl.EntityTypePackageImpl#getEntityTypes <em>Entity Types</em>}</li>
 *   <li>{@link structure.type.impl.EntityTypePackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link structure.type.impl.EntityTypePackageImpl#getLocationTypes <em>Location Types</em>}</li>
 *   <li>{@link structure.type.impl.EntityTypePackageImpl#getParticipationTypes <em>Participation Types</em>}</li>
 *   <li>{@link structure.type.impl.EntityTypePackageImpl#getActivityPointTypes <em>Activity Point Types</em>}</li>
 *   <li>{@link structure.type.impl.EntityTypePackageImpl#getSuperPackage <em>Super Package</em>}</li>
 *   <li>{@link structure.type.impl.EntityTypePackageImpl#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityTypePackageImpl extends ElementImpl implements EntityTypePackage {
    /**
     * The cached value of the '{@link #getSubPackages() <em>Sub Packages</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubPackages()
     * @generated
     * @ordered
     */
    protected EList<EntityTypePackage> subPackages;

    /**
     * The cached value of the '{@link #getEntityTypes() <em>Entity Types</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntityTypes()
     * @generated
     * @ordered
     */
    protected EList<EntityType> entityTypes;

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
     * The cached value of the '{@link #getLocationTypes() <em>Location Types</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocationTypes()
     * @generated
     * @ordered
     */
    protected EList<LocationType> locationTypes;

    /**
     * The cached value of the '{@link #getParticipationTypes() <em>Participation Types</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParticipationTypes()
     * @generated
     * @ordered
     */
    protected EList<InteractionPointParticipationType> participationTypes;

    /**
     * The cached value of the '{@link #getActivityPointTypes() <em>Activity Point Types</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActivityPointTypes()
     * @generated
     * @ordered
     */
    protected EList<ActivityPointType> activityPointTypes;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EntityTypePackageImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.ENTITY_TYPE_PACKAGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EntityTypePackage> getSubPackages() {
        if (subPackages == null) {
            subPackages = new EObjectContainmentWithInverseEList<EntityTypePackage>(EntityTypePackage.class, this, TypePackage.ENTITY_TYPE_PACKAGE__SUB_PACKAGES, TypePackage.ENTITY_TYPE_PACKAGE__SUPER_PACKAGE);
        }
        return subPackages;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EntityType> getEntityTypes() {
        if (entityTypes == null) {
            entityTypes = new EObjectContainmentWithInverseEList<EntityType>(EntityType.class, this, TypePackage.ENTITY_TYPE_PACKAGE__ENTITY_TYPES, TypePackage.ENTITY_TYPE__PACKAGE);
        }
        return entityTypes;
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
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ENTITY_TYPE_PACKAGE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<LocationType> getLocationTypes() {
        if (locationTypes == null) {
            locationTypes = new EObjectContainmentWithInverseEList<LocationType>(LocationType.class, this, TypePackage.ENTITY_TYPE_PACKAGE__LOCATION_TYPES, TypePackage.LOCATION_TYPE__PACKAGE);
        }
        return locationTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InteractionPointParticipationType> getParticipationTypes() {
        if (participationTypes == null) {
            participationTypes = new EObjectContainmentWithInverseEList<InteractionPointParticipationType>(InteractionPointParticipationType.class, this, TypePackage.ENTITY_TYPE_PACKAGE__PARTICIPATION_TYPES, TypePackage.INTERACTION_POINT_PARTICIPATION_TYPE__PACKAGE);
        }
        return participationTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ActivityPointType> getActivityPointTypes() {
        if (activityPointTypes == null) {
            activityPointTypes = new EObjectContainmentWithInverseEList<ActivityPointType>(ActivityPointType.class, this, TypePackage.ENTITY_TYPE_PACKAGE__ACTIVITY_POINT_TYPES, TypePackage.ACTIVITY_POINT_TYPE__PACKAGE);
        }
        return activityPointTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityTypePackage getSuperPackage() {
        if (eContainerFeatureID() != TypePackage.ENTITY_TYPE_PACKAGE__SUPER_PACKAGE) return null;
        return (EntityTypePackage)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSuperPackage(EntityTypePackage newSuperPackage, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newSuperPackage, TypePackage.ENTITY_TYPE_PACKAGE__SUPER_PACKAGE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSuperPackage(EntityTypePackage newSuperPackage) {
        if (newSuperPackage != eInternalContainer() || (eContainerFeatureID() != TypePackage.ENTITY_TYPE_PACKAGE__SUPER_PACKAGE && newSuperPackage != null)) {
            if (EcoreUtil.isAncestor(this, newSuperPackage))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newSuperPackage != null)
                msgs = ((InternalEObject)newSuperPackage).eInverseAdd(this, TypePackage.ENTITY_TYPE_PACKAGE__SUB_PACKAGES, EntityTypePackage.class, msgs);
            msgs = basicSetSuperPackage(newSuperPackage, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ENTITY_TYPE_PACKAGE__SUPER_PACKAGE, newSuperPackage, newSuperPackage));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StructuralDesignModel getModel() {
        if (eContainerFeatureID() != TypePackage.ENTITY_TYPE_PACKAGE__MODEL) return null;
        return (StructuralDesignModel)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetModel(StructuralDesignModel newModel, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newModel, TypePackage.ENTITY_TYPE_PACKAGE__MODEL, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModel(StructuralDesignModel newModel) {
        if (newModel != eInternalContainer() || (eContainerFeatureID() != TypePackage.ENTITY_TYPE_PACKAGE__MODEL && newModel != null)) {
            if (EcoreUtil.isAncestor(this, newModel))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newModel != null)
                msgs = ((InternalEObject)newModel).eInverseAdd(this, StructurePackage.STRUCTURAL_DESIGN_MODEL__ENTITY_TYPE_PACKAGES, StructuralDesignModel.class, msgs);
            msgs = basicSetModel(newModel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ENTITY_TYPE_PACKAGE__MODEL, newModel, newModel));
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
            case TypePackage.ENTITY_TYPE_PACKAGE__SUB_PACKAGES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubPackages()).basicAdd(otherEnd, msgs);
            case TypePackage.ENTITY_TYPE_PACKAGE__ENTITY_TYPES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntityTypes()).basicAdd(otherEnd, msgs);
            case TypePackage.ENTITY_TYPE_PACKAGE__LOCATION_TYPES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocationTypes()).basicAdd(otherEnd, msgs);
            case TypePackage.ENTITY_TYPE_PACKAGE__PARTICIPATION_TYPES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getParticipationTypes()).basicAdd(otherEnd, msgs);
            case TypePackage.ENTITY_TYPE_PACKAGE__ACTIVITY_POINT_TYPES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityPointTypes()).basicAdd(otherEnd, msgs);
            case TypePackage.ENTITY_TYPE_PACKAGE__SUPER_PACKAGE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetSuperPackage((EntityTypePackage)otherEnd, msgs);
            case TypePackage.ENTITY_TYPE_PACKAGE__MODEL:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetModel((StructuralDesignModel)otherEnd, msgs);
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
            case TypePackage.ENTITY_TYPE_PACKAGE__SUB_PACKAGES:
                return ((InternalEList<?>)getSubPackages()).basicRemove(otherEnd, msgs);
            case TypePackage.ENTITY_TYPE_PACKAGE__ENTITY_TYPES:
                return ((InternalEList<?>)getEntityTypes()).basicRemove(otherEnd, msgs);
            case TypePackage.ENTITY_TYPE_PACKAGE__LOCATION_TYPES:
                return ((InternalEList<?>)getLocationTypes()).basicRemove(otherEnd, msgs);
            case TypePackage.ENTITY_TYPE_PACKAGE__PARTICIPATION_TYPES:
                return ((InternalEList<?>)getParticipationTypes()).basicRemove(otherEnd, msgs);
            case TypePackage.ENTITY_TYPE_PACKAGE__ACTIVITY_POINT_TYPES:
                return ((InternalEList<?>)getActivityPointTypes()).basicRemove(otherEnd, msgs);
            case TypePackage.ENTITY_TYPE_PACKAGE__SUPER_PACKAGE:
                return basicSetSuperPackage(null, msgs);
            case TypePackage.ENTITY_TYPE_PACKAGE__MODEL:
                return basicSetModel(null, msgs);
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
            case TypePackage.ENTITY_TYPE_PACKAGE__SUPER_PACKAGE:
                return eInternalContainer().eInverseRemove(this, TypePackage.ENTITY_TYPE_PACKAGE__SUB_PACKAGES, EntityTypePackage.class, msgs);
            case TypePackage.ENTITY_TYPE_PACKAGE__MODEL:
                return eInternalContainer().eInverseRemove(this, StructurePackage.STRUCTURAL_DESIGN_MODEL__ENTITY_TYPE_PACKAGES, StructuralDesignModel.class, msgs);
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
            case TypePackage.ENTITY_TYPE_PACKAGE__SUB_PACKAGES:
                return getSubPackages();
            case TypePackage.ENTITY_TYPE_PACKAGE__ENTITY_TYPES:
                return getEntityTypes();
            case TypePackage.ENTITY_TYPE_PACKAGE__NAME:
                return getName();
            case TypePackage.ENTITY_TYPE_PACKAGE__LOCATION_TYPES:
                return getLocationTypes();
            case TypePackage.ENTITY_TYPE_PACKAGE__PARTICIPATION_TYPES:
                return getParticipationTypes();
            case TypePackage.ENTITY_TYPE_PACKAGE__ACTIVITY_POINT_TYPES:
                return getActivityPointTypes();
            case TypePackage.ENTITY_TYPE_PACKAGE__SUPER_PACKAGE:
                return getSuperPackage();
            case TypePackage.ENTITY_TYPE_PACKAGE__MODEL:
                return getModel();
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
            case TypePackage.ENTITY_TYPE_PACKAGE__SUB_PACKAGES:
                getSubPackages().clear();
                getSubPackages().addAll((Collection<? extends EntityTypePackage>)newValue);
                return;
            case TypePackage.ENTITY_TYPE_PACKAGE__ENTITY_TYPES:
                getEntityTypes().clear();
                getEntityTypes().addAll((Collection<? extends EntityType>)newValue);
                return;
            case TypePackage.ENTITY_TYPE_PACKAGE__NAME:
                setName((String)newValue);
                return;
            case TypePackage.ENTITY_TYPE_PACKAGE__LOCATION_TYPES:
                getLocationTypes().clear();
                getLocationTypes().addAll((Collection<? extends LocationType>)newValue);
                return;
            case TypePackage.ENTITY_TYPE_PACKAGE__PARTICIPATION_TYPES:
                getParticipationTypes().clear();
                getParticipationTypes().addAll((Collection<? extends InteractionPointParticipationType>)newValue);
                return;
            case TypePackage.ENTITY_TYPE_PACKAGE__ACTIVITY_POINT_TYPES:
                getActivityPointTypes().clear();
                getActivityPointTypes().addAll((Collection<? extends ActivityPointType>)newValue);
                return;
            case TypePackage.ENTITY_TYPE_PACKAGE__SUPER_PACKAGE:
                setSuperPackage((EntityTypePackage)newValue);
                return;
            case TypePackage.ENTITY_TYPE_PACKAGE__MODEL:
                setModel((StructuralDesignModel)newValue);
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
            case TypePackage.ENTITY_TYPE_PACKAGE__SUB_PACKAGES:
                getSubPackages().clear();
                return;
            case TypePackage.ENTITY_TYPE_PACKAGE__ENTITY_TYPES:
                getEntityTypes().clear();
                return;
            case TypePackage.ENTITY_TYPE_PACKAGE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case TypePackage.ENTITY_TYPE_PACKAGE__LOCATION_TYPES:
                getLocationTypes().clear();
                return;
            case TypePackage.ENTITY_TYPE_PACKAGE__PARTICIPATION_TYPES:
                getParticipationTypes().clear();
                return;
            case TypePackage.ENTITY_TYPE_PACKAGE__ACTIVITY_POINT_TYPES:
                getActivityPointTypes().clear();
                return;
            case TypePackage.ENTITY_TYPE_PACKAGE__SUPER_PACKAGE:
                setSuperPackage((EntityTypePackage)null);
                return;
            case TypePackage.ENTITY_TYPE_PACKAGE__MODEL:
                setModel((StructuralDesignModel)null);
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
            case TypePackage.ENTITY_TYPE_PACKAGE__SUB_PACKAGES:
                return subPackages != null && !subPackages.isEmpty();
            case TypePackage.ENTITY_TYPE_PACKAGE__ENTITY_TYPES:
                return entityTypes != null && !entityTypes.isEmpty();
            case TypePackage.ENTITY_TYPE_PACKAGE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case TypePackage.ENTITY_TYPE_PACKAGE__LOCATION_TYPES:
                return locationTypes != null && !locationTypes.isEmpty();
            case TypePackage.ENTITY_TYPE_PACKAGE__PARTICIPATION_TYPES:
                return participationTypes != null && !participationTypes.isEmpty();
            case TypePackage.ENTITY_TYPE_PACKAGE__ACTIVITY_POINT_TYPES:
                return activityPointTypes != null && !activityPointTypes.isEmpty();
            case TypePackage.ENTITY_TYPE_PACKAGE__SUPER_PACKAGE:
                return getSuperPackage() != null;
            case TypePackage.ENTITY_TYPE_PACKAGE__MODEL:
                return getModel() != null;
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

} //EntityTypePackageImpl
