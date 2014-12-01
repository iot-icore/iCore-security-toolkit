/**
 */
package data.type.impl;

import data.type.DataType;
import data.type.DataTypePackage;
import data.type.TypePackage;

import java.util.Collection;

import models.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.type.impl.DataTypePackageImpl#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link data.type.impl.DataTypePackageImpl#getEPackage <em>EPackage</em>}</li>
 *   <li>{@link data.type.impl.DataTypePackageImpl#getSuPackages <em>Su Packages</em>}</li>
 *   <li>{@link data.type.impl.DataTypePackageImpl#getSuperPackages <em>Super Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataTypePackageImpl extends ElementImpl implements DataTypePackage {
    /**
     * The cached value of the '{@link #getDataTypes() <em>Data Types</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataTypes()
     * @generated
     * @ordered
     */
    protected EList<DataType> dataTypes;

    /**
     * The cached value of the '{@link #getEPackage() <em>EPackage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEPackage()
     * @generated
     * @ordered
     */
    protected EPackage ePackage;

    /**
     * The cached value of the '{@link #getSuPackages() <em>Su Packages</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSuPackages()
     * @generated
     * @ordered
     */
    protected EList<DataTypePackage> suPackages;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataTypePackageImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.DATA_TYPE_PACKAGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DataType> getDataTypes() {
        if (dataTypes == null) {
            dataTypes = new EObjectContainmentEList<DataType>(DataType.class, this, TypePackage.DATA_TYPE_PACKAGE__DATA_TYPES);
        }
        return dataTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EPackage getEPackage() {
        if (ePackage != null && ePackage.eIsProxy()) {
            InternalEObject oldEPackage = (InternalEObject)ePackage;
            ePackage = (EPackage)eResolveProxy(oldEPackage);
            if (ePackage != oldEPackage) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypePackage.DATA_TYPE_PACKAGE__EPACKAGE, oldEPackage, ePackage));
            }
        }
        return ePackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EPackage basicGetEPackage() {
        return ePackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEPackage(EPackage newEPackage) {
        EPackage oldEPackage = ePackage;
        ePackage = newEPackage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.DATA_TYPE_PACKAGE__EPACKAGE, oldEPackage, ePackage));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DataTypePackage> getSuPackages() {
        if (suPackages == null) {
            suPackages = new EObjectContainmentWithInverseEList<DataTypePackage>(DataTypePackage.class, this, TypePackage.DATA_TYPE_PACKAGE__SU_PACKAGES, TypePackage.DATA_TYPE_PACKAGE__SUPER_PACKAGES);
        }
        return suPackages;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataTypePackage getSuperPackages() {
        if (eContainerFeatureID() != TypePackage.DATA_TYPE_PACKAGE__SUPER_PACKAGES) return null;
        return (DataTypePackage)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSuperPackages(DataTypePackage newSuperPackages, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newSuperPackages, TypePackage.DATA_TYPE_PACKAGE__SUPER_PACKAGES, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSuperPackages(DataTypePackage newSuperPackages) {
        if (newSuperPackages != eInternalContainer() || (eContainerFeatureID() != TypePackage.DATA_TYPE_PACKAGE__SUPER_PACKAGES && newSuperPackages != null)) {
            if (EcoreUtil.isAncestor(this, newSuperPackages))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newSuperPackages != null)
                msgs = ((InternalEObject)newSuperPackages).eInverseAdd(this, TypePackage.DATA_TYPE_PACKAGE__SU_PACKAGES, DataTypePackage.class, msgs);
            msgs = basicSetSuperPackages(newSuperPackages, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.DATA_TYPE_PACKAGE__SUPER_PACKAGES, newSuperPackages, newSuperPackages));
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
            case TypePackage.DATA_TYPE_PACKAGE__SU_PACKAGES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuPackages()).basicAdd(otherEnd, msgs);
            case TypePackage.DATA_TYPE_PACKAGE__SUPER_PACKAGES:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetSuperPackages((DataTypePackage)otherEnd, msgs);
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
            case TypePackage.DATA_TYPE_PACKAGE__DATA_TYPES:
                return ((InternalEList<?>)getDataTypes()).basicRemove(otherEnd, msgs);
            case TypePackage.DATA_TYPE_PACKAGE__SU_PACKAGES:
                return ((InternalEList<?>)getSuPackages()).basicRemove(otherEnd, msgs);
            case TypePackage.DATA_TYPE_PACKAGE__SUPER_PACKAGES:
                return basicSetSuperPackages(null, msgs);
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
            case TypePackage.DATA_TYPE_PACKAGE__SUPER_PACKAGES:
                return eInternalContainer().eInverseRemove(this, TypePackage.DATA_TYPE_PACKAGE__SU_PACKAGES, DataTypePackage.class, msgs);
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
            case TypePackage.DATA_TYPE_PACKAGE__DATA_TYPES:
                return getDataTypes();
            case TypePackage.DATA_TYPE_PACKAGE__EPACKAGE:
                if (resolve) return getEPackage();
                return basicGetEPackage();
            case TypePackage.DATA_TYPE_PACKAGE__SU_PACKAGES:
                return getSuPackages();
            case TypePackage.DATA_TYPE_PACKAGE__SUPER_PACKAGES:
                return getSuperPackages();
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
            case TypePackage.DATA_TYPE_PACKAGE__DATA_TYPES:
                getDataTypes().clear();
                getDataTypes().addAll((Collection<? extends DataType>)newValue);
                return;
            case TypePackage.DATA_TYPE_PACKAGE__EPACKAGE:
                setEPackage((EPackage)newValue);
                return;
            case TypePackage.DATA_TYPE_PACKAGE__SU_PACKAGES:
                getSuPackages().clear();
                getSuPackages().addAll((Collection<? extends DataTypePackage>)newValue);
                return;
            case TypePackage.DATA_TYPE_PACKAGE__SUPER_PACKAGES:
                setSuperPackages((DataTypePackage)newValue);
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
            case TypePackage.DATA_TYPE_PACKAGE__DATA_TYPES:
                getDataTypes().clear();
                return;
            case TypePackage.DATA_TYPE_PACKAGE__EPACKAGE:
                setEPackage((EPackage)null);
                return;
            case TypePackage.DATA_TYPE_PACKAGE__SU_PACKAGES:
                getSuPackages().clear();
                return;
            case TypePackage.DATA_TYPE_PACKAGE__SUPER_PACKAGES:
                setSuperPackages((DataTypePackage)null);
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
            case TypePackage.DATA_TYPE_PACKAGE__DATA_TYPES:
                return dataTypes != null && !dataTypes.isEmpty();
            case TypePackage.DATA_TYPE_PACKAGE__EPACKAGE:
                return ePackage != null;
            case TypePackage.DATA_TYPE_PACKAGE__SU_PACKAGES:
                return suPackages != null && !suPackages.isEmpty();
            case TypePackage.DATA_TYPE_PACKAGE__SUPER_PACKAGES:
                return getSuperPackages() != null;
        }
        return super.eIsSet(featureID);
    }

} //DataTypePackageImpl
