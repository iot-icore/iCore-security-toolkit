/**
 */
package identity.instance.impl;

import data.instance.impl.DataImpl;

import identity.instance.IdentityAttribute;
import identity.instance.InstancePackage;

import identity.type.AttributeVerificationMethod;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identity Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link identity.instance.impl.IdentityAttributeImpl#getVerificationMethod <em>Verification Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdentityAttributeImpl extends DataImpl implements IdentityAttribute {
    /**
     * The cached value of the '{@link #getVerificationMethod() <em>Verification Method</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVerificationMethod()
     * @generated
     * @ordered
     */
    protected EList<AttributeVerificationMethod> verificationMethod;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IdentityAttributeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstancePackage.Literals.IDENTITY_ATTRIBUTE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AttributeVerificationMethod> getVerificationMethod() {
        if (verificationMethod == null) {
            verificationMethod = new EObjectResolvingEList<AttributeVerificationMethod>(AttributeVerificationMethod.class, this, InstancePackage.IDENTITY_ATTRIBUTE__VERIFICATION_METHOD);
        }
        return verificationMethod;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case InstancePackage.IDENTITY_ATTRIBUTE__VERIFICATION_METHOD:
                return getVerificationMethod();
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
            case InstancePackage.IDENTITY_ATTRIBUTE__VERIFICATION_METHOD:
                getVerificationMethod().clear();
                getVerificationMethod().addAll((Collection<? extends AttributeVerificationMethod>)newValue);
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
            case InstancePackage.IDENTITY_ATTRIBUTE__VERIFICATION_METHOD:
                getVerificationMethod().clear();
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
            case InstancePackage.IDENTITY_ATTRIBUTE__VERIFICATION_METHOD:
                return verificationMethod != null && !verificationMethod.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //IdentityAttributeImpl
