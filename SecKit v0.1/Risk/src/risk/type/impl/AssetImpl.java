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
import risk.type.MonetaryAmount;
import risk.type.Stakeholder;
import risk.type.TypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link risk.type.impl.AssetImpl#getValue <em>Value</em>}</li>
 *   <li>{@link risk.type.impl.AssetImpl#getInterestedStakeholder <em>Interested Stakeholder</em>}</li>
 *   <li>{@link risk.type.impl.AssetImpl#getIndirectlyImpacts <em>Indirectly Impacts</em>}</li>
 *   <li>{@link risk.type.impl.AssetImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssetImpl extends ElementImpl implements Asset {
    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected MonetaryAmount value;

    /**
     * The cached value of the '{@link #getInterestedStakeholder() <em>Interested Stakeholder</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInterestedStakeholder()
     * @generated
     * @ordered
     */
    protected EList<Stakeholder> interestedStakeholder;

    /**
     * The cached value of the '{@link #getIndirectlyImpacts() <em>Indirectly Impacts</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIndirectlyImpacts()
     * @generated
     * @ordered
     */
    protected EList<Asset> indirectlyImpacts;

    /**
     * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected static final String DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected String description = DESCRIPTION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AssetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.ASSET;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MonetaryAmount getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetValue(MonetaryAmount newValue, NotificationChain msgs) {
        MonetaryAmount oldValue = value;
        value = newValue;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypePackage.ASSET__VALUE, oldValue, newValue);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValue(MonetaryAmount newValue) {
        if (newValue != value) {
            NotificationChain msgs = null;
            if (value != null)
                msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypePackage.ASSET__VALUE, null, msgs);
            if (newValue != null)
                msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypePackage.ASSET__VALUE, null, msgs);
            msgs = basicSetValue(newValue, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ASSET__VALUE, newValue, newValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Stakeholder> getInterestedStakeholder() {
        if (interestedStakeholder == null) {
            interestedStakeholder = new EObjectWithInverseResolvingEList.ManyInverse<Stakeholder>(Stakeholder.class, this, TypePackage.ASSET__INTERESTED_STAKEHOLDER, TypePackage.STAKEHOLDER__ASSETS_TO_PROTECT);
        }
        return interestedStakeholder;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Asset> getIndirectlyImpacts() {
        if (indirectlyImpacts == null) {
            indirectlyImpacts = new EObjectResolvingEList<Asset>(Asset.class, this, TypePackage.ASSET__INDIRECTLY_IMPACTS);
        }
        return indirectlyImpacts;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDescription(String newDescription) {
        String oldDescription = description;
        description = newDescription;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ASSET__DESCRIPTION, oldDescription, description));
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
            case TypePackage.ASSET__INTERESTED_STAKEHOLDER:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInterestedStakeholder()).basicAdd(otherEnd, msgs);
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
            case TypePackage.ASSET__VALUE:
                return basicSetValue(null, msgs);
            case TypePackage.ASSET__INTERESTED_STAKEHOLDER:
                return ((InternalEList<?>)getInterestedStakeholder()).basicRemove(otherEnd, msgs);
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
            case TypePackage.ASSET__VALUE:
                return getValue();
            case TypePackage.ASSET__INTERESTED_STAKEHOLDER:
                return getInterestedStakeholder();
            case TypePackage.ASSET__INDIRECTLY_IMPACTS:
                return getIndirectlyImpacts();
            case TypePackage.ASSET__DESCRIPTION:
                return getDescription();
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
            case TypePackage.ASSET__VALUE:
                setValue((MonetaryAmount)newValue);
                return;
            case TypePackage.ASSET__INTERESTED_STAKEHOLDER:
                getInterestedStakeholder().clear();
                getInterestedStakeholder().addAll((Collection<? extends Stakeholder>)newValue);
                return;
            case TypePackage.ASSET__INDIRECTLY_IMPACTS:
                getIndirectlyImpacts().clear();
                getIndirectlyImpacts().addAll((Collection<? extends Asset>)newValue);
                return;
            case TypePackage.ASSET__DESCRIPTION:
                setDescription((String)newValue);
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
            case TypePackage.ASSET__VALUE:
                setValue((MonetaryAmount)null);
                return;
            case TypePackage.ASSET__INTERESTED_STAKEHOLDER:
                getInterestedStakeholder().clear();
                return;
            case TypePackage.ASSET__INDIRECTLY_IMPACTS:
                getIndirectlyImpacts().clear();
                return;
            case TypePackage.ASSET__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
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
            case TypePackage.ASSET__VALUE:
                return value != null;
            case TypePackage.ASSET__INTERESTED_STAKEHOLDER:
                return interestedStakeholder != null && !interestedStakeholder.isEmpty();
            case TypePackage.ASSET__INDIRECTLY_IMPACTS:
                return indirectlyImpacts != null && !indirectlyImpacts.isEmpty();
            case TypePackage.ASSET__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
        result.append(" (description: ");
        result.append(description);
        result.append(')');
        return result.toString();
    }

} //AssetImpl
