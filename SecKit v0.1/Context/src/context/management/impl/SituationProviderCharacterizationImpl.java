/**
 */
package context.management.impl;

import context.management.ManagementPackage;
import context.management.SituationProviderCharacterization;

import identity.instance.AbstractIdentity;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Situation Provider Characterization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link context.management.impl.SituationProviderCharacterizationImpl#getContextOwners <em>Context Owners</em>}</li>
 *   <li>{@link context.management.impl.SituationProviderCharacterizationImpl#getOwnerSituationAttributeRef <em>Owner Situation Attribute Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SituationProviderCharacterizationImpl extends MinimalEObjectImpl.Container implements SituationProviderCharacterization {
    /**
     * The cached value of the '{@link #getContextOwners() <em>Context Owners</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextOwners()
     * @generated
     * @ordered
     */
    protected EList<AbstractIdentity> contextOwners;

    /**
     * The default value of the '{@link #getOwnerSituationAttributeRef() <em>Owner Situation Attribute Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnerSituationAttributeRef()
     * @generated
     * @ordered
     */
    protected static final String OWNER_SITUATION_ATTRIBUTE_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOwnerSituationAttributeRef() <em>Owner Situation Attribute Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnerSituationAttributeRef()
     * @generated
     * @ordered
     */
    protected String ownerSituationAttributeRef = OWNER_SITUATION_ATTRIBUTE_REF_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SituationProviderCharacterizationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ManagementPackage.Literals.SITUATION_PROVIDER_CHARACTERIZATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AbstractIdentity> getContextOwners() {
        if (contextOwners == null) {
            contextOwners = new EObjectResolvingEList<AbstractIdentity>(AbstractIdentity.class, this, ManagementPackage.SITUATION_PROVIDER_CHARACTERIZATION__CONTEXT_OWNERS);
        }
        return contextOwners;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOwnerSituationAttributeRef() {
        return ownerSituationAttributeRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOwnerSituationAttributeRef(String newOwnerSituationAttributeRef) {
        String oldOwnerSituationAttributeRef = ownerSituationAttributeRef;
        ownerSituationAttributeRef = newOwnerSituationAttributeRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ManagementPackage.SITUATION_PROVIDER_CHARACTERIZATION__OWNER_SITUATION_ATTRIBUTE_REF, oldOwnerSituationAttributeRef, ownerSituationAttributeRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ManagementPackage.SITUATION_PROVIDER_CHARACTERIZATION__CONTEXT_OWNERS:
                return getContextOwners();
            case ManagementPackage.SITUATION_PROVIDER_CHARACTERIZATION__OWNER_SITUATION_ATTRIBUTE_REF:
                return getOwnerSituationAttributeRef();
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
            case ManagementPackage.SITUATION_PROVIDER_CHARACTERIZATION__CONTEXT_OWNERS:
                getContextOwners().clear();
                getContextOwners().addAll((Collection<? extends AbstractIdentity>)newValue);
                return;
            case ManagementPackage.SITUATION_PROVIDER_CHARACTERIZATION__OWNER_SITUATION_ATTRIBUTE_REF:
                setOwnerSituationAttributeRef((String)newValue);
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
            case ManagementPackage.SITUATION_PROVIDER_CHARACTERIZATION__CONTEXT_OWNERS:
                getContextOwners().clear();
                return;
            case ManagementPackage.SITUATION_PROVIDER_CHARACTERIZATION__OWNER_SITUATION_ATTRIBUTE_REF:
                setOwnerSituationAttributeRef(OWNER_SITUATION_ATTRIBUTE_REF_EDEFAULT);
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
            case ManagementPackage.SITUATION_PROVIDER_CHARACTERIZATION__CONTEXT_OWNERS:
                return contextOwners != null && !contextOwners.isEmpty();
            case ManagementPackage.SITUATION_PROVIDER_CHARACTERIZATION__OWNER_SITUATION_ATTRIBUTE_REF:
                return OWNER_SITUATION_ATTRIBUTE_REF_EDEFAULT == null ? ownerSituationAttributeRef != null : !OWNER_SITUATION_ATTRIBUTE_REF_EDEFAULT.equals(ownerSituationAttributeRef);
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
        result.append(" (ownerSituationAttributeRef: ");
        result.append(ownerSituationAttributeRef);
        result.append(')');
        return result.toString();
    }

} //SituationProviderCharacterizationImpl
