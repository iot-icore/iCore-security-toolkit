/**
 */
package role.impl;

import identity.pattern.IdentityPattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import role.IdentityRolePattern;
import role.RolePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identity Role Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link role.impl.IdentityRolePatternImpl#getIdentityPattern <em>Identity Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdentityRolePatternImpl extends AbstractRolePatternImpl implements IdentityRolePattern {
    /**
     * The cached value of the '{@link #getIdentityPattern() <em>Identity Pattern</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdentityPattern()
     * @generated
     * @ordered
     */
    protected IdentityPattern identityPattern;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IdentityRolePatternImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RolePackage.Literals.IDENTITY_ROLE_PATTERN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityPattern getIdentityPattern() {
        return identityPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIdentityPattern(IdentityPattern newIdentityPattern, NotificationChain msgs) {
        IdentityPattern oldIdentityPattern = identityPattern;
        identityPattern = newIdentityPattern;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RolePackage.IDENTITY_ROLE_PATTERN__IDENTITY_PATTERN, oldIdentityPattern, newIdentityPattern);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIdentityPattern(IdentityPattern newIdentityPattern) {
        if (newIdentityPattern != identityPattern) {
            NotificationChain msgs = null;
            if (identityPattern != null)
                msgs = ((InternalEObject)identityPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RolePackage.IDENTITY_ROLE_PATTERN__IDENTITY_PATTERN, null, msgs);
            if (newIdentityPattern != null)
                msgs = ((InternalEObject)newIdentityPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RolePackage.IDENTITY_ROLE_PATTERN__IDENTITY_PATTERN, null, msgs);
            msgs = basicSetIdentityPattern(newIdentityPattern, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RolePackage.IDENTITY_ROLE_PATTERN__IDENTITY_PATTERN, newIdentityPattern, newIdentityPattern));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case RolePackage.IDENTITY_ROLE_PATTERN__IDENTITY_PATTERN:
                return basicSetIdentityPattern(null, msgs);
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
            case RolePackage.IDENTITY_ROLE_PATTERN__IDENTITY_PATTERN:
                return getIdentityPattern();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case RolePackage.IDENTITY_ROLE_PATTERN__IDENTITY_PATTERN:
                setIdentityPattern((IdentityPattern)newValue);
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
            case RolePackage.IDENTITY_ROLE_PATTERN__IDENTITY_PATTERN:
                setIdentityPattern((IdentityPattern)null);
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
            case RolePackage.IDENTITY_ROLE_PATTERN__IDENTITY_PATTERN:
                return identityPattern != null;
        }
        return super.eIsSet(featureID);
    }

} //IdentityRolePatternImpl
