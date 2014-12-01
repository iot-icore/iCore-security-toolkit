/**
 */
package identity.impl;

import identity.IdentityPackage;
import identity.IdentityRuntimeModel;

import identity.instance.AbstractIdentity;
import identity.instance.IdentityRealm;

import identity.type.AttributeVerificationMethod;

import java.util.Collection;

import models.impl.ModelImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runtime Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link identity.impl.IdentityRuntimeModelImpl#getIdentityRealms <em>Identity Realms</em>}</li>
 *   <li>{@link identity.impl.IdentityRuntimeModelImpl#getVerificationMethods <em>Verification Methods</em>}</li>
 *   <li>{@link identity.impl.IdentityRuntimeModelImpl#getIdentities <em>Identities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdentityRuntimeModelImpl extends ModelImpl implements IdentityRuntimeModel {
    /**
     * The cached value of the '{@link #getIdentityRealms() <em>Identity Realms</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdentityRealms()
     * @generated
     * @ordered
     */
    protected EList<IdentityRealm> identityRealms;

    /**
     * The cached value of the '{@link #getVerificationMethods() <em>Verification Methods</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVerificationMethods()
     * @generated
     * @ordered
     */
    protected EList<AttributeVerificationMethod> verificationMethods;

    /**
     * The cached value of the '{@link #getIdentities() <em>Identities</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdentities()
     * @generated
     * @ordered
     */
    protected EList<AbstractIdentity> identities;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IdentityRuntimeModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return IdentityPackage.Literals.IDENTITY_RUNTIME_MODEL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<IdentityRealm> getIdentityRealms() {
        if (identityRealms == null) {
            identityRealms = new EObjectContainmentEList<IdentityRealm>(IdentityRealm.class, this, IdentityPackage.IDENTITY_RUNTIME_MODEL__IDENTITY_REALMS);
        }
        return identityRealms;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AttributeVerificationMethod> getVerificationMethods() {
        if (verificationMethods == null) {
            verificationMethods = new EObjectContainmentEList<AttributeVerificationMethod>(AttributeVerificationMethod.class, this, IdentityPackage.IDENTITY_RUNTIME_MODEL__VERIFICATION_METHODS);
        }
        return verificationMethods;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AbstractIdentity> getIdentities() {
        if (identities == null) {
            identities = new EObjectContainmentEList<AbstractIdentity>(AbstractIdentity.class, this, IdentityPackage.IDENTITY_RUNTIME_MODEL__IDENTITIES);
        }
        return identities;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case IdentityPackage.IDENTITY_RUNTIME_MODEL__IDENTITY_REALMS:
                return ((InternalEList<?>)getIdentityRealms()).basicRemove(otherEnd, msgs);
            case IdentityPackage.IDENTITY_RUNTIME_MODEL__VERIFICATION_METHODS:
                return ((InternalEList<?>)getVerificationMethods()).basicRemove(otherEnd, msgs);
            case IdentityPackage.IDENTITY_RUNTIME_MODEL__IDENTITIES:
                return ((InternalEList<?>)getIdentities()).basicRemove(otherEnd, msgs);
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
            case IdentityPackage.IDENTITY_RUNTIME_MODEL__IDENTITY_REALMS:
                return getIdentityRealms();
            case IdentityPackage.IDENTITY_RUNTIME_MODEL__VERIFICATION_METHODS:
                return getVerificationMethods();
            case IdentityPackage.IDENTITY_RUNTIME_MODEL__IDENTITIES:
                return getIdentities();
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
            case IdentityPackage.IDENTITY_RUNTIME_MODEL__IDENTITY_REALMS:
                getIdentityRealms().clear();
                getIdentityRealms().addAll((Collection<? extends IdentityRealm>)newValue);
                return;
            case IdentityPackage.IDENTITY_RUNTIME_MODEL__VERIFICATION_METHODS:
                getVerificationMethods().clear();
                getVerificationMethods().addAll((Collection<? extends AttributeVerificationMethod>)newValue);
                return;
            case IdentityPackage.IDENTITY_RUNTIME_MODEL__IDENTITIES:
                getIdentities().clear();
                getIdentities().addAll((Collection<? extends AbstractIdentity>)newValue);
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
            case IdentityPackage.IDENTITY_RUNTIME_MODEL__IDENTITY_REALMS:
                getIdentityRealms().clear();
                return;
            case IdentityPackage.IDENTITY_RUNTIME_MODEL__VERIFICATION_METHODS:
                getVerificationMethods().clear();
                return;
            case IdentityPackage.IDENTITY_RUNTIME_MODEL__IDENTITIES:
                getIdentities().clear();
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
            case IdentityPackage.IDENTITY_RUNTIME_MODEL__IDENTITY_REALMS:
                return identityRealms != null && !identityRealms.isEmpty();
            case IdentityPackage.IDENTITY_RUNTIME_MODEL__VERIFICATION_METHODS:
                return verificationMethods != null && !verificationMethods.isEmpty();
            case IdentityPackage.IDENTITY_RUNTIME_MODEL__IDENTITIES:
                return identities != null && !identities.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //IdentityRuntimeModelImpl
