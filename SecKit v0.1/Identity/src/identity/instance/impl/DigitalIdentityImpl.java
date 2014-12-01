/**
 */
package identity.instance.impl;

import identity.instance.AbstractIdentity;
import identity.instance.DigitalIdentity;
import identity.instance.InstancePackage;

import identity.type.AuthenticationCredential;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Digital Identity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link identity.instance.impl.DigitalIdentityImpl#getIssuer <em>Issuer</em>}</li>
 *   <li>{@link identity.instance.impl.DigitalIdentityImpl#getAuthenticationCredentials <em>Authentication Credentials</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DigitalIdentityImpl extends SelfSignedIdentityImpl implements DigitalIdentity {
    /**
     * The cached value of the '{@link #getIssuer() <em>Issuer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIssuer()
     * @generated
     * @ordered
     */
    protected AbstractIdentity issuer;

    /**
     * The cached value of the '{@link #getAuthenticationCredentials() <em>Authentication Credentials</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuthenticationCredentials()
     * @generated
     * @ordered
     */
    protected EList<AuthenticationCredential> authenticationCredentials;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DigitalIdentityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstancePackage.Literals.DIGITAL_IDENTITY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractIdentity getIssuer() {
        if (issuer != null && issuer.eIsProxy()) {
            InternalEObject oldIssuer = (InternalEObject)issuer;
            issuer = (AbstractIdentity)eResolveProxy(oldIssuer);
            if (issuer != oldIssuer) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.DIGITAL_IDENTITY__ISSUER, oldIssuer, issuer));
            }
        }
        return issuer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractIdentity basicGetIssuer() {
        return issuer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIssuer(AbstractIdentity newIssuer) {
        AbstractIdentity oldIssuer = issuer;
        issuer = newIssuer;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.DIGITAL_IDENTITY__ISSUER, oldIssuer, issuer));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AuthenticationCredential> getAuthenticationCredentials() {
        if (authenticationCredentials == null) {
            authenticationCredentials = new EObjectContainmentEList<AuthenticationCredential>(AuthenticationCredential.class, this, InstancePackage.DIGITAL_IDENTITY__AUTHENTICATION_CREDENTIALS);
        }
        return authenticationCredentials;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case InstancePackage.DIGITAL_IDENTITY__AUTHENTICATION_CREDENTIALS:
                return ((InternalEList<?>)getAuthenticationCredentials()).basicRemove(otherEnd, msgs);
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
            case InstancePackage.DIGITAL_IDENTITY__ISSUER:
                if (resolve) return getIssuer();
                return basicGetIssuer();
            case InstancePackage.DIGITAL_IDENTITY__AUTHENTICATION_CREDENTIALS:
                return getAuthenticationCredentials();
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
            case InstancePackage.DIGITAL_IDENTITY__ISSUER:
                setIssuer((AbstractIdentity)newValue);
                return;
            case InstancePackage.DIGITAL_IDENTITY__AUTHENTICATION_CREDENTIALS:
                getAuthenticationCredentials().clear();
                getAuthenticationCredentials().addAll((Collection<? extends AuthenticationCredential>)newValue);
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
            case InstancePackage.DIGITAL_IDENTITY__ISSUER:
                setIssuer((AbstractIdentity)null);
                return;
            case InstancePackage.DIGITAL_IDENTITY__AUTHENTICATION_CREDENTIALS:
                getAuthenticationCredentials().clear();
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
            case InstancePackage.DIGITAL_IDENTITY__ISSUER:
                return issuer != null;
            case InstancePackage.DIGITAL_IDENTITY__AUTHENTICATION_CREDENTIALS:
                return authenticationCredentials != null && !authenticationCredentials.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //DigitalIdentityImpl
