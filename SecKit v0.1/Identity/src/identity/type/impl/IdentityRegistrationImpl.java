/**
 */
package identity.type.impl;

import identity.type.IdentityAttributeInstantiation;
import identity.type.IdentityRegistration;
import identity.type.TypePackage;

import java.util.Collection;

import models.impl.ElementImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identity Registration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link identity.type.impl.IdentityRegistrationImpl#getRequiredAttributes <em>Required Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdentityRegistrationImpl extends ElementImpl implements IdentityRegistration {
    /**
     * The cached value of the '{@link #getRequiredAttributes() <em>Required Attributes</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRequiredAttributes()
     * @generated
     * @ordered
     */
    protected EList<IdentityAttributeInstantiation> requiredAttributes;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IdentityRegistrationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.IDENTITY_REGISTRATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<IdentityAttributeInstantiation> getRequiredAttributes() {
        if (requiredAttributes == null) {
            requiredAttributes = new EObjectContainmentEList<IdentityAttributeInstantiation>(IdentityAttributeInstantiation.class, this, TypePackage.IDENTITY_REGISTRATION__REQUIRED_ATTRIBUTES);
        }
        return requiredAttributes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TypePackage.IDENTITY_REGISTRATION__REQUIRED_ATTRIBUTES:
                return ((InternalEList<?>)getRequiredAttributes()).basicRemove(otherEnd, msgs);
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
            case TypePackage.IDENTITY_REGISTRATION__REQUIRED_ATTRIBUTES:
                return getRequiredAttributes();
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
            case TypePackage.IDENTITY_REGISTRATION__REQUIRED_ATTRIBUTES:
                getRequiredAttributes().clear();
                getRequiredAttributes().addAll((Collection<? extends IdentityAttributeInstantiation>)newValue);
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
            case TypePackage.IDENTITY_REGISTRATION__REQUIRED_ATTRIBUTES:
                getRequiredAttributes().clear();
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
            case TypePackage.IDENTITY_REGISTRATION__REQUIRED_ATTRIBUTES:
                return requiredAttributes != null && !requiredAttributes.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //IdentityRegistrationImpl
