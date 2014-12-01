/**
 */
package risk.type.impl;

import java.util.Collection;

import models.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import risk.type.Asset;
import risk.type.Stakeholder;
import risk.type.TypePackage;

import structure.instantiation.EntityInstantiation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stakeholder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link risk.type.impl.StakeholderImpl#getOwnedEntityInstantiations <em>Owned Entity Instantiations</em>}</li>
 *   <li>{@link risk.type.impl.StakeholderImpl#getAssetsToProtect <em>Assets To Protect</em>}</li>
 *   <li>{@link risk.type.impl.StakeholderImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StakeholderImpl extends ElementImpl implements Stakeholder {
    /**
     * The cached value of the '{@link #getOwnedEntityInstantiations() <em>Owned Entity Instantiations</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedEntityInstantiations()
     * @generated
     * @ordered
     */
    protected EList<EntityInstantiation> ownedEntityInstantiations;

    /**
     * The cached value of the '{@link #getAssetsToProtect() <em>Assets To Protect</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssetsToProtect()
     * @generated
     * @ordered
     */
    protected EList<Asset> assetsToProtect;

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
    protected StakeholderImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.STAKEHOLDER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EntityInstantiation> getOwnedEntityInstantiations() {
        if (ownedEntityInstantiations == null) {
            ownedEntityInstantiations = new EObjectResolvingEList<EntityInstantiation>(EntityInstantiation.class, this, TypePackage.STAKEHOLDER__OWNED_ENTITY_INSTANTIATIONS);
        }
        return ownedEntityInstantiations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Asset> getAssetsToProtect() {
        if (assetsToProtect == null) {
            assetsToProtect = new EObjectWithInverseResolvingEList.ManyInverse<Asset>(Asset.class, this, TypePackage.STAKEHOLDER__ASSETS_TO_PROTECT, TypePackage.ASSET__INTERESTED_STAKEHOLDER);
        }
        return assetsToProtect;
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
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.STAKEHOLDER__NAME, oldName, name));
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
            case TypePackage.STAKEHOLDER__ASSETS_TO_PROTECT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssetsToProtect()).basicAdd(otherEnd, msgs);
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
            case TypePackage.STAKEHOLDER__ASSETS_TO_PROTECT:
                return ((InternalEList<?>)getAssetsToProtect()).basicRemove(otherEnd, msgs);
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
            case TypePackage.STAKEHOLDER__OWNED_ENTITY_INSTANTIATIONS:
                return getOwnedEntityInstantiations();
            case TypePackage.STAKEHOLDER__ASSETS_TO_PROTECT:
                return getAssetsToProtect();
            case TypePackage.STAKEHOLDER__NAME:
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
            case TypePackage.STAKEHOLDER__OWNED_ENTITY_INSTANTIATIONS:
                getOwnedEntityInstantiations().clear();
                getOwnedEntityInstantiations().addAll((Collection<? extends EntityInstantiation>)newValue);
                return;
            case TypePackage.STAKEHOLDER__ASSETS_TO_PROTECT:
                getAssetsToProtect().clear();
                getAssetsToProtect().addAll((Collection<? extends Asset>)newValue);
                return;
            case TypePackage.STAKEHOLDER__NAME:
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
            case TypePackage.STAKEHOLDER__OWNED_ENTITY_INSTANTIATIONS:
                getOwnedEntityInstantiations().clear();
                return;
            case TypePackage.STAKEHOLDER__ASSETS_TO_PROTECT:
                getAssetsToProtect().clear();
                return;
            case TypePackage.STAKEHOLDER__NAME:
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
            case TypePackage.STAKEHOLDER__OWNED_ENTITY_INSTANTIATIONS:
                return ownedEntityInstantiations != null && !ownedEntityInstantiations.isEmpty();
            case TypePackage.STAKEHOLDER__ASSETS_TO_PROTECT:
                return assetsToProtect != null && !assetsToProtect.isEmpty();
            case TypePackage.STAKEHOLDER__NAME:
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

} //StakeholderImpl
