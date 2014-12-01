/**
 */
package role.impl;

import java.util.Collection;

import models.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import role.RoleDesignModel;
import role.RolePackage;
import role.RoleType;
import role.RoleTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link role.impl.RoleTypePackageImpl#getRoleTypes <em>Role Types</em>}</li>
 *   <li>{@link role.impl.RoleTypePackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link role.impl.RoleTypePackageImpl#getSubPackages <em>Sub Packages</em>}</li>
 *   <li>{@link role.impl.RoleTypePackageImpl#getSuperPackage <em>Super Package</em>}</li>
 *   <li>{@link role.impl.RoleTypePackageImpl#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleTypePackageImpl extends ElementImpl implements RoleTypePackage {
    /**
     * The cached value of the '{@link #getRoleTypes() <em>Role Types</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRoleTypes()
     * @generated
     * @ordered
     */
    protected EList<RoleType> roleTypes;

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
     * The cached value of the '{@link #getSubPackages() <em>Sub Packages</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubPackages()
     * @generated
     * @ordered
     */
    protected EList<RoleTypePackage> subPackages;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RoleTypePackageImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RolePackage.Literals.ROLE_TYPE_PACKAGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RoleType> getRoleTypes() {
        if (roleTypes == null) {
            roleTypes = new EObjectContainmentEList<RoleType>(RoleType.class, this, RolePackage.ROLE_TYPE_PACKAGE__ROLE_TYPES);
        }
        return roleTypes;
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
            eNotify(new ENotificationImpl(this, Notification.SET, RolePackage.ROLE_TYPE_PACKAGE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RoleTypePackage> getSubPackages() {
        if (subPackages == null) {
            subPackages = new EObjectContainmentWithInverseEList<RoleTypePackage>(RoleTypePackage.class, this, RolePackage.ROLE_TYPE_PACKAGE__SUB_PACKAGES, RolePackage.ROLE_TYPE_PACKAGE__SUPER_PACKAGE);
        }
        return subPackages;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RoleTypePackage getSuperPackage() {
        if (eContainerFeatureID() != RolePackage.ROLE_TYPE_PACKAGE__SUPER_PACKAGE) return null;
        return (RoleTypePackage)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSuperPackage(RoleTypePackage newSuperPackage, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newSuperPackage, RolePackage.ROLE_TYPE_PACKAGE__SUPER_PACKAGE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSuperPackage(RoleTypePackage newSuperPackage) {
        if (newSuperPackage != eInternalContainer() || (eContainerFeatureID() != RolePackage.ROLE_TYPE_PACKAGE__SUPER_PACKAGE && newSuperPackage != null)) {
            if (EcoreUtil.isAncestor(this, newSuperPackage))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newSuperPackage != null)
                msgs = ((InternalEObject)newSuperPackage).eInverseAdd(this, RolePackage.ROLE_TYPE_PACKAGE__SUB_PACKAGES, RoleTypePackage.class, msgs);
            msgs = basicSetSuperPackage(newSuperPackage, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RolePackage.ROLE_TYPE_PACKAGE__SUPER_PACKAGE, newSuperPackage, newSuperPackage));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RoleDesignModel getModel() {
        if (eContainerFeatureID() != RolePackage.ROLE_TYPE_PACKAGE__MODEL) return null;
        return (RoleDesignModel)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetModel(RoleDesignModel newModel, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newModel, RolePackage.ROLE_TYPE_PACKAGE__MODEL, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModel(RoleDesignModel newModel) {
        if (newModel != eInternalContainer() || (eContainerFeatureID() != RolePackage.ROLE_TYPE_PACKAGE__MODEL && newModel != null)) {
            if (EcoreUtil.isAncestor(this, newModel))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newModel != null)
                msgs = ((InternalEObject)newModel).eInverseAdd(this, RolePackage.ROLE_DESIGN_MODEL__PACKAGES, RoleDesignModel.class, msgs);
            msgs = basicSetModel(newModel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RolePackage.ROLE_TYPE_PACKAGE__MODEL, newModel, newModel));
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
            case RolePackage.ROLE_TYPE_PACKAGE__SUB_PACKAGES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubPackages()).basicAdd(otherEnd, msgs);
            case RolePackage.ROLE_TYPE_PACKAGE__SUPER_PACKAGE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetSuperPackage((RoleTypePackage)otherEnd, msgs);
            case RolePackage.ROLE_TYPE_PACKAGE__MODEL:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetModel((RoleDesignModel)otherEnd, msgs);
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
            case RolePackage.ROLE_TYPE_PACKAGE__ROLE_TYPES:
                return ((InternalEList<?>)getRoleTypes()).basicRemove(otherEnd, msgs);
            case RolePackage.ROLE_TYPE_PACKAGE__SUB_PACKAGES:
                return ((InternalEList<?>)getSubPackages()).basicRemove(otherEnd, msgs);
            case RolePackage.ROLE_TYPE_PACKAGE__SUPER_PACKAGE:
                return basicSetSuperPackage(null, msgs);
            case RolePackage.ROLE_TYPE_PACKAGE__MODEL:
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
            case RolePackage.ROLE_TYPE_PACKAGE__SUPER_PACKAGE:
                return eInternalContainer().eInverseRemove(this, RolePackage.ROLE_TYPE_PACKAGE__SUB_PACKAGES, RoleTypePackage.class, msgs);
            case RolePackage.ROLE_TYPE_PACKAGE__MODEL:
                return eInternalContainer().eInverseRemove(this, RolePackage.ROLE_DESIGN_MODEL__PACKAGES, RoleDesignModel.class, msgs);
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
            case RolePackage.ROLE_TYPE_PACKAGE__ROLE_TYPES:
                return getRoleTypes();
            case RolePackage.ROLE_TYPE_PACKAGE__NAME:
                return getName();
            case RolePackage.ROLE_TYPE_PACKAGE__SUB_PACKAGES:
                return getSubPackages();
            case RolePackage.ROLE_TYPE_PACKAGE__SUPER_PACKAGE:
                return getSuperPackage();
            case RolePackage.ROLE_TYPE_PACKAGE__MODEL:
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
            case RolePackage.ROLE_TYPE_PACKAGE__ROLE_TYPES:
                getRoleTypes().clear();
                getRoleTypes().addAll((Collection<? extends RoleType>)newValue);
                return;
            case RolePackage.ROLE_TYPE_PACKAGE__NAME:
                setName((String)newValue);
                return;
            case RolePackage.ROLE_TYPE_PACKAGE__SUB_PACKAGES:
                getSubPackages().clear();
                getSubPackages().addAll((Collection<? extends RoleTypePackage>)newValue);
                return;
            case RolePackage.ROLE_TYPE_PACKAGE__SUPER_PACKAGE:
                setSuperPackage((RoleTypePackage)newValue);
                return;
            case RolePackage.ROLE_TYPE_PACKAGE__MODEL:
                setModel((RoleDesignModel)newValue);
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
            case RolePackage.ROLE_TYPE_PACKAGE__ROLE_TYPES:
                getRoleTypes().clear();
                return;
            case RolePackage.ROLE_TYPE_PACKAGE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case RolePackage.ROLE_TYPE_PACKAGE__SUB_PACKAGES:
                getSubPackages().clear();
                return;
            case RolePackage.ROLE_TYPE_PACKAGE__SUPER_PACKAGE:
                setSuperPackage((RoleTypePackage)null);
                return;
            case RolePackage.ROLE_TYPE_PACKAGE__MODEL:
                setModel((RoleDesignModel)null);
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
            case RolePackage.ROLE_TYPE_PACKAGE__ROLE_TYPES:
                return roleTypes != null && !roleTypes.isEmpty();
            case RolePackage.ROLE_TYPE_PACKAGE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case RolePackage.ROLE_TYPE_PACKAGE__SUB_PACKAGES:
                return subPackages != null && !subPackages.isEmpty();
            case RolePackage.ROLE_TYPE_PACKAGE__SUPER_PACKAGE:
                return getSuperPackage() != null;
            case RolePackage.ROLE_TYPE_PACKAGE__MODEL:
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

} //RoleTypePackageImpl
