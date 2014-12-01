/**
 */
package behavior.type.impl;

import behavior.BehaviorDesignModel;
import behavior.BehaviorPackage;

import behavior.type.AbstractBehaviorType;
import behavior.type.BehaviorTypePackage;
import behavior.type.DataProducerType;
import behavior.type.TypePackage;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Type Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.type.impl.BehaviorTypePackageImpl#getBehaviorTypes <em>Behavior Types</em>}</li>
 *   <li>{@link behavior.type.impl.BehaviorTypePackageImpl#getSubPackages <em>Sub Packages</em>}</li>
 *   <li>{@link behavior.type.impl.BehaviorTypePackageImpl#getDataProducerTypes <em>Data Producer Types</em>}</li>
 *   <li>{@link behavior.type.impl.BehaviorTypePackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link behavior.type.impl.BehaviorTypePackageImpl#getSuperPackage <em>Super Package</em>}</li>
 *   <li>{@link behavior.type.impl.BehaviorTypePackageImpl#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviorTypePackageImpl extends ElementImpl implements BehaviorTypePackage {
    /**
     * The cached value of the '{@link #getBehaviorTypes() <em>Behavior Types</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBehaviorTypes()
     * @generated
     * @ordered
     */
    protected EList<AbstractBehaviorType> behaviorTypes;

    /**
     * The cached value of the '{@link #getSubPackages() <em>Sub Packages</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubPackages()
     * @generated
     * @ordered
     */
    protected EList<BehaviorTypePackage> subPackages;

    /**
     * The cached value of the '{@link #getDataProducerTypes() <em>Data Producer Types</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataProducerTypes()
     * @generated
     * @ordered
     */
    protected EList<DataProducerType> dataProducerTypes;

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
    protected BehaviorTypePackageImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.BEHAVIOR_TYPE_PACKAGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AbstractBehaviorType> getBehaviorTypes() {
        if (behaviorTypes == null) {
            behaviorTypes = new EObjectContainmentWithInverseEList<AbstractBehaviorType>(AbstractBehaviorType.class, this, TypePackage.BEHAVIOR_TYPE_PACKAGE__BEHAVIOR_TYPES, TypePackage.ABSTRACT_BEHAVIOR_TYPE__PACKAGE);
        }
        return behaviorTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<BehaviorTypePackage> getSubPackages() {
        if (subPackages == null) {
            subPackages = new EObjectContainmentWithInverseEList<BehaviorTypePackage>(BehaviorTypePackage.class, this, TypePackage.BEHAVIOR_TYPE_PACKAGE__SUB_PACKAGES, TypePackage.BEHAVIOR_TYPE_PACKAGE__SUPER_PACKAGE);
        }
        return subPackages;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DataProducerType> getDataProducerTypes() {
        if (dataProducerTypes == null) {
            dataProducerTypes = new EObjectContainmentWithInverseEList<DataProducerType>(DataProducerType.class, this, TypePackage.BEHAVIOR_TYPE_PACKAGE__DATA_PRODUCER_TYPES, TypePackage.DATA_PRODUCER_TYPE__PACKAGE);
        }
        return dataProducerTypes;
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
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.BEHAVIOR_TYPE_PACKAGE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorTypePackage getSuperPackage() {
        if (eContainerFeatureID() != TypePackage.BEHAVIOR_TYPE_PACKAGE__SUPER_PACKAGE) return null;
        return (BehaviorTypePackage)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSuperPackage(BehaviorTypePackage newSuperPackage, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newSuperPackage, TypePackage.BEHAVIOR_TYPE_PACKAGE__SUPER_PACKAGE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSuperPackage(BehaviorTypePackage newSuperPackage) {
        if (newSuperPackage != eInternalContainer() || (eContainerFeatureID() != TypePackage.BEHAVIOR_TYPE_PACKAGE__SUPER_PACKAGE && newSuperPackage != null)) {
            if (EcoreUtil.isAncestor(this, newSuperPackage))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newSuperPackage != null)
                msgs = ((InternalEObject)newSuperPackage).eInverseAdd(this, TypePackage.BEHAVIOR_TYPE_PACKAGE__SUB_PACKAGES, BehaviorTypePackage.class, msgs);
            msgs = basicSetSuperPackage(newSuperPackage, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.BEHAVIOR_TYPE_PACKAGE__SUPER_PACKAGE, newSuperPackage, newSuperPackage));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorDesignModel getModel() {
        if (eContainerFeatureID() != TypePackage.BEHAVIOR_TYPE_PACKAGE__MODEL) return null;
        return (BehaviorDesignModel)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetModel(BehaviorDesignModel newModel, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newModel, TypePackage.BEHAVIOR_TYPE_PACKAGE__MODEL, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModel(BehaviorDesignModel newModel) {
        if (newModel != eInternalContainer() || (eContainerFeatureID() != TypePackage.BEHAVIOR_TYPE_PACKAGE__MODEL && newModel != null)) {
            if (EcoreUtil.isAncestor(this, newModel))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newModel != null)
                msgs = ((InternalEObject)newModel).eInverseAdd(this, BehaviorPackage.BEHAVIOR_DESIGN_MODEL__PACKAGES, BehaviorDesignModel.class, msgs);
            msgs = basicSetModel(newModel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.BEHAVIOR_TYPE_PACKAGE__MODEL, newModel, newModel));
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
            case TypePackage.BEHAVIOR_TYPE_PACKAGE__BEHAVIOR_TYPES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getBehaviorTypes()).basicAdd(otherEnd, msgs);
            case TypePackage.BEHAVIOR_TYPE_PACKAGE__SUB_PACKAGES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubPackages()).basicAdd(otherEnd, msgs);
            case TypePackage.BEHAVIOR_TYPE_PACKAGE__DATA_PRODUCER_TYPES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getDataProducerTypes()).basicAdd(otherEnd, msgs);
            case TypePackage.BEHAVIOR_TYPE_PACKAGE__SUPER_PACKAGE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetSuperPackage((BehaviorTypePackage)otherEnd, msgs);
            case TypePackage.BEHAVIOR_TYPE_PACKAGE__MODEL:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetModel((BehaviorDesignModel)otherEnd, msgs);
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
            case TypePackage.BEHAVIOR_TYPE_PACKAGE__BEHAVIOR_TYPES:
                return ((InternalEList<?>)getBehaviorTypes()).basicRemove(otherEnd, msgs);
            case TypePackage.BEHAVIOR_TYPE_PACKAGE__SUB_PACKAGES:
                return ((InternalEList<?>)getSubPackages()).basicRemove(otherEnd, msgs);
            case TypePackage.BEHAVIOR_TYPE_PACKAGE__DATA_PRODUCER_TYPES:
                return ((InternalEList<?>)getDataProducerTypes()).basicRemove(otherEnd, msgs);
            case TypePackage.BEHAVIOR_TYPE_PACKAGE__SUPER_PACKAGE:
                return basicSetSuperPackage(null, msgs);
            case TypePackage.BEHAVIOR_TYPE_PACKAGE__MODEL:
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
            case TypePackage.BEHAVIOR_TYPE_PACKAGE__SUPER_PACKAGE:
                return eInternalContainer().eInverseRemove(this, TypePackage.BEHAVIOR_TYPE_PACKAGE__SUB_PACKAGES, BehaviorTypePackage.class, msgs);
            case TypePackage.BEHAVIOR_TYPE_PACKAGE__MODEL:
                return eInternalContainer().eInverseRemove(this, BehaviorPackage.BEHAVIOR_DESIGN_MODEL__PACKAGES, BehaviorDesignModel.class, msgs);
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
            case TypePackage.BEHAVIOR_TYPE_PACKAGE__BEHAVIOR_TYPES:
                return getBehaviorTypes();
            case TypePackage.BEHAVIOR_TYPE_PACKAGE__SUB_PACKAGES:
                return getSubPackages();
            case TypePackage.BEHAVIOR_TYPE_PACKAGE__DATA_PRODUCER_TYPES:
                return getDataProducerTypes();
            case TypePackage.BEHAVIOR_TYPE_PACKAGE__NAME:
                return getName();
            case TypePackage.BEHAVIOR_TYPE_PACKAGE__SUPER_PACKAGE:
                return getSuperPackage();
            case TypePackage.BEHAVIOR_TYPE_PACKAGE__MODEL:
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
            case TypePackage.BEHAVIOR_TYPE_PACKAGE__BEHAVIOR_TYPES:
                getBehaviorTypes().clear();
                getBehaviorTypes().addAll((Collection<? extends AbstractBehaviorType>)newValue);
                return;
            case TypePackage.BEHAVIOR_TYPE_PACKAGE__SUB_PACKAGES:
                getSubPackages().clear();
                getSubPackages().addAll((Collection<? extends BehaviorTypePackage>)newValue);
                return;
            case TypePackage.BEHAVIOR_TYPE_PACKAGE__DATA_PRODUCER_TYPES:
                getDataProducerTypes().clear();
                getDataProducerTypes().addAll((Collection<? extends DataProducerType>)newValue);
                return;
            case TypePackage.BEHAVIOR_TYPE_PACKAGE__NAME:
                setName((String)newValue);
                return;
            case TypePackage.BEHAVIOR_TYPE_PACKAGE__SUPER_PACKAGE:
                setSuperPackage((BehaviorTypePackage)newValue);
                return;
            case TypePackage.BEHAVIOR_TYPE_PACKAGE__MODEL:
                setModel((BehaviorDesignModel)newValue);
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
            case TypePackage.BEHAVIOR_TYPE_PACKAGE__BEHAVIOR_TYPES:
                getBehaviorTypes().clear();
                return;
            case TypePackage.BEHAVIOR_TYPE_PACKAGE__SUB_PACKAGES:
                getSubPackages().clear();
                return;
            case TypePackage.BEHAVIOR_TYPE_PACKAGE__DATA_PRODUCER_TYPES:
                getDataProducerTypes().clear();
                return;
            case TypePackage.BEHAVIOR_TYPE_PACKAGE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case TypePackage.BEHAVIOR_TYPE_PACKAGE__SUPER_PACKAGE:
                setSuperPackage((BehaviorTypePackage)null);
                return;
            case TypePackage.BEHAVIOR_TYPE_PACKAGE__MODEL:
                setModel((BehaviorDesignModel)null);
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
            case TypePackage.BEHAVIOR_TYPE_PACKAGE__BEHAVIOR_TYPES:
                return behaviorTypes != null && !behaviorTypes.isEmpty();
            case TypePackage.BEHAVIOR_TYPE_PACKAGE__SUB_PACKAGES:
                return subPackages != null && !subPackages.isEmpty();
            case TypePackage.BEHAVIOR_TYPE_PACKAGE__DATA_PRODUCER_TYPES:
                return dataProducerTypes != null && !dataProducerTypes.isEmpty();
            case TypePackage.BEHAVIOR_TYPE_PACKAGE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case TypePackage.BEHAVIOR_TYPE_PACKAGE__SUPER_PACKAGE:
                return getSuperPackage() != null;
            case TypePackage.BEHAVIOR_TYPE_PACKAGE__MODEL:
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

} //BehaviorTypePackageImpl
