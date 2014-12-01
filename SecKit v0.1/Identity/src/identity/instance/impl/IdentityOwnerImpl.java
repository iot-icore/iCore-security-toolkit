/**
 */
package identity.instance.impl;

import identity.instance.AbstractIdentity;
import identity.instance.IdentityOwner;
import identity.instance.InstancePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identity Owner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link identity.instance.impl.IdentityOwnerImpl#getIdentities <em>Identities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdentityOwnerImpl extends MinimalEObjectImpl.Container implements IdentityOwner {
    /**
     * The cached value of the '{@link #getIdentities() <em>Identities</em>}' reference list.
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
    protected IdentityOwnerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstancePackage.Literals.IDENTITY_OWNER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AbstractIdentity> getIdentities() {
        if (identities == null) {
            identities = new EObjectWithInverseResolvingEList<AbstractIdentity>(AbstractIdentity.class, this, InstancePackage.IDENTITY_OWNER__IDENTITIES, InstancePackage.ABSTRACT_IDENTITY__OWNER);
        }
        return identities;
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
            case InstancePackage.IDENTITY_OWNER__IDENTITIES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getIdentities()).basicAdd(otherEnd, msgs);
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
            case InstancePackage.IDENTITY_OWNER__IDENTITIES:
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
            case InstancePackage.IDENTITY_OWNER__IDENTITIES:
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
            case InstancePackage.IDENTITY_OWNER__IDENTITIES:
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
            case InstancePackage.IDENTITY_OWNER__IDENTITIES:
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
            case InstancePackage.IDENTITY_OWNER__IDENTITIES:
                return identities != null && !identities.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //IdentityOwnerImpl
