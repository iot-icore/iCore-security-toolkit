/**
 */
package context.management.impl;

import context.management.ContextProviderCharacterization;
import context.management.ManagementPackage;

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
 * An implementation of the model object '<em><b>Context Provider Characterization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link context.management.impl.ContextProviderCharacterizationImpl#getContextOwners <em>Context Owners</em>}</li>
 *   <li>{@link context.management.impl.ContextProviderCharacterizationImpl#getOwnerContextAttributeRef <em>Owner Context Attribute Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextProviderCharacterizationImpl extends MinimalEObjectImpl.Container implements ContextProviderCharacterization {
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
     * The default value of the '{@link #getOwnerContextAttributeRef() <em>Owner Context Attribute Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnerContextAttributeRef()
     * @generated
     * @ordered
     */
    protected static final String OWNER_CONTEXT_ATTRIBUTE_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOwnerContextAttributeRef() <em>Owner Context Attribute Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnerContextAttributeRef()
     * @generated
     * @ordered
     */
    protected String ownerContextAttributeRef = OWNER_CONTEXT_ATTRIBUTE_REF_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ContextProviderCharacterizationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ManagementPackage.Literals.CONTEXT_PROVIDER_CHARACTERIZATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AbstractIdentity> getContextOwners() {
        if (contextOwners == null) {
            contextOwners = new EObjectResolvingEList<AbstractIdentity>(AbstractIdentity.class, this, ManagementPackage.CONTEXT_PROVIDER_CHARACTERIZATION__CONTEXT_OWNERS);
        }
        return contextOwners;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOwnerContextAttributeRef() {
        return ownerContextAttributeRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOwnerContextAttributeRef(String newOwnerContextAttributeRef) {
        String oldOwnerContextAttributeRef = ownerContextAttributeRef;
        ownerContextAttributeRef = newOwnerContextAttributeRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ManagementPackage.CONTEXT_PROVIDER_CHARACTERIZATION__OWNER_CONTEXT_ATTRIBUTE_REF, oldOwnerContextAttributeRef, ownerContextAttributeRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ManagementPackage.CONTEXT_PROVIDER_CHARACTERIZATION__CONTEXT_OWNERS:
                return getContextOwners();
            case ManagementPackage.CONTEXT_PROVIDER_CHARACTERIZATION__OWNER_CONTEXT_ATTRIBUTE_REF:
                return getOwnerContextAttributeRef();
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
            case ManagementPackage.CONTEXT_PROVIDER_CHARACTERIZATION__CONTEXT_OWNERS:
                getContextOwners().clear();
                getContextOwners().addAll((Collection<? extends AbstractIdentity>)newValue);
                return;
            case ManagementPackage.CONTEXT_PROVIDER_CHARACTERIZATION__OWNER_CONTEXT_ATTRIBUTE_REF:
                setOwnerContextAttributeRef((String)newValue);
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
            case ManagementPackage.CONTEXT_PROVIDER_CHARACTERIZATION__CONTEXT_OWNERS:
                getContextOwners().clear();
                return;
            case ManagementPackage.CONTEXT_PROVIDER_CHARACTERIZATION__OWNER_CONTEXT_ATTRIBUTE_REF:
                setOwnerContextAttributeRef(OWNER_CONTEXT_ATTRIBUTE_REF_EDEFAULT);
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
            case ManagementPackage.CONTEXT_PROVIDER_CHARACTERIZATION__CONTEXT_OWNERS:
                return contextOwners != null && !contextOwners.isEmpty();
            case ManagementPackage.CONTEXT_PROVIDER_CHARACTERIZATION__OWNER_CONTEXT_ATTRIBUTE_REF:
                return OWNER_CONTEXT_ATTRIBUTE_REF_EDEFAULT == null ? ownerContextAttributeRef != null : !OWNER_CONTEXT_ATTRIBUTE_REF_EDEFAULT.equals(ownerContextAttributeRef);
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
        result.append(" (ownerContextAttributeRef: ");
        result.append(ownerContextAttributeRef);
        result.append(')');
        return result.toString();
    }

} //ContextProviderCharacterizationImpl
