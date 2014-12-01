/**
 */
package identity.type.impl;

import identity.IdentityDesignModel;
import identity.IdentityPackage;

import identity.type.IdentityAttributeType;
import identity.type.IdentityType;
import identity.type.IdentityTypePackage;
import identity.type.TypePackage;

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
 * An implementation of the model object '<em><b>Identity Type Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link identity.type.impl.IdentityTypePackageImpl#getIdentityTypes <em>Identity Types</em>}</li>
 *   <li>{@link identity.type.impl.IdentityTypePackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link identity.type.impl.IdentityTypePackageImpl#getModel <em>Model</em>}</li>
 *   <li>{@link identity.type.impl.IdentityTypePackageImpl#getAttributeTypes <em>Attribute Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdentityTypePackageImpl extends ElementImpl implements IdentityTypePackage {
    /**
     * The cached value of the '{@link #getIdentityTypes() <em>Identity Types</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdentityTypes()
     * @generated
     * @ordered
     */
    protected EList<IdentityType> identityTypes;

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
     * The cached value of the '{@link #getAttributeTypes() <em>Attribute Types</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttributeTypes()
     * @generated
     * @ordered
     */
    protected EList<IdentityAttributeType> attributeTypes;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IdentityTypePackageImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.IDENTITY_TYPE_PACKAGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<IdentityType> getIdentityTypes() {
        if (identityTypes == null) {
            identityTypes = new EObjectContainmentWithInverseEList<IdentityType>(IdentityType.class, this, TypePackage.IDENTITY_TYPE_PACKAGE__IDENTITY_TYPES, TypePackage.IDENTITY_TYPE__PACKAGE);
        }
        return identityTypes;
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
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.IDENTITY_TYPE_PACKAGE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityDesignModel getModel() {
        if (eContainerFeatureID() != TypePackage.IDENTITY_TYPE_PACKAGE__MODEL) return null;
        return (IdentityDesignModel)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetModel(IdentityDesignModel newModel, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newModel, TypePackage.IDENTITY_TYPE_PACKAGE__MODEL, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModel(IdentityDesignModel newModel) {
        if (newModel != eInternalContainer() || (eContainerFeatureID() != TypePackage.IDENTITY_TYPE_PACKAGE__MODEL && newModel != null)) {
            if (EcoreUtil.isAncestor(this, newModel))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newModel != null)
                msgs = ((InternalEObject)newModel).eInverseAdd(this, IdentityPackage.IDENTITY_DESIGN_MODEL__PACKAGES, IdentityDesignModel.class, msgs);
            msgs = basicSetModel(newModel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.IDENTITY_TYPE_PACKAGE__MODEL, newModel, newModel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<IdentityAttributeType> getAttributeTypes() {
        if (attributeTypes == null) {
            attributeTypes = new EObjectContainmentWithInverseEList<IdentityAttributeType>(IdentityAttributeType.class, this, TypePackage.IDENTITY_TYPE_PACKAGE__ATTRIBUTE_TYPES, TypePackage.IDENTITY_ATTRIBUTE_TYPE__PACKAGE);
        }
        return attributeTypes;
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
            case TypePackage.IDENTITY_TYPE_PACKAGE__IDENTITY_TYPES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getIdentityTypes()).basicAdd(otherEnd, msgs);
            case TypePackage.IDENTITY_TYPE_PACKAGE__MODEL:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetModel((IdentityDesignModel)otherEnd, msgs);
            case TypePackage.IDENTITY_TYPE_PACKAGE__ATTRIBUTE_TYPES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttributeTypes()).basicAdd(otherEnd, msgs);
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
            case TypePackage.IDENTITY_TYPE_PACKAGE__IDENTITY_TYPES:
                return ((InternalEList<?>)getIdentityTypes()).basicRemove(otherEnd, msgs);
            case TypePackage.IDENTITY_TYPE_PACKAGE__MODEL:
                return basicSetModel(null, msgs);
            case TypePackage.IDENTITY_TYPE_PACKAGE__ATTRIBUTE_TYPES:
                return ((InternalEList<?>)getAttributeTypes()).basicRemove(otherEnd, msgs);
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
            case TypePackage.IDENTITY_TYPE_PACKAGE__MODEL:
                return eInternalContainer().eInverseRemove(this, IdentityPackage.IDENTITY_DESIGN_MODEL__PACKAGES, IdentityDesignModel.class, msgs);
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
            case TypePackage.IDENTITY_TYPE_PACKAGE__IDENTITY_TYPES:
                return getIdentityTypes();
            case TypePackage.IDENTITY_TYPE_PACKAGE__NAME:
                return getName();
            case TypePackage.IDENTITY_TYPE_PACKAGE__MODEL:
                return getModel();
            case TypePackage.IDENTITY_TYPE_PACKAGE__ATTRIBUTE_TYPES:
                return getAttributeTypes();
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
            case TypePackage.IDENTITY_TYPE_PACKAGE__IDENTITY_TYPES:
                getIdentityTypes().clear();
                getIdentityTypes().addAll((Collection<? extends IdentityType>)newValue);
                return;
            case TypePackage.IDENTITY_TYPE_PACKAGE__NAME:
                setName((String)newValue);
                return;
            case TypePackage.IDENTITY_TYPE_PACKAGE__MODEL:
                setModel((IdentityDesignModel)newValue);
                return;
            case TypePackage.IDENTITY_TYPE_PACKAGE__ATTRIBUTE_TYPES:
                getAttributeTypes().clear();
                getAttributeTypes().addAll((Collection<? extends IdentityAttributeType>)newValue);
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
            case TypePackage.IDENTITY_TYPE_PACKAGE__IDENTITY_TYPES:
                getIdentityTypes().clear();
                return;
            case TypePackage.IDENTITY_TYPE_PACKAGE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case TypePackage.IDENTITY_TYPE_PACKAGE__MODEL:
                setModel((IdentityDesignModel)null);
                return;
            case TypePackage.IDENTITY_TYPE_PACKAGE__ATTRIBUTE_TYPES:
                getAttributeTypes().clear();
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
            case TypePackage.IDENTITY_TYPE_PACKAGE__IDENTITY_TYPES:
                return identityTypes != null && !identityTypes.isEmpty();
            case TypePackage.IDENTITY_TYPE_PACKAGE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case TypePackage.IDENTITY_TYPE_PACKAGE__MODEL:
                return getModel() != null;
            case TypePackage.IDENTITY_TYPE_PACKAGE__ATTRIBUTE_TYPES:
                return attributeTypes != null && !attributeTypes.isEmpty();
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

} //IdentityTypePackageImpl
