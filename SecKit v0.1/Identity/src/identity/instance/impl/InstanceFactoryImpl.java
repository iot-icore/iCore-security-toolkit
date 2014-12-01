/**
 */
package identity.instance.impl;

import identity.instance.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstanceFactoryImpl extends EFactoryImpl implements InstanceFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static InstanceFactory init() {
        try {
            InstanceFactory theInstanceFactory = (InstanceFactory)EPackage.Registry.INSTANCE.getEFactory(InstancePackage.eNS_URI);
            if (theInstanceFactory != null) {
                return theInstanceFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new InstanceFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InstanceFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case InstancePackage.DIGITAL_IDENTITY: return createDigitalIdentity();
            case InstancePackage.IDENTITY_ATTRIBUTE: return createIdentityAttribute();
            case InstancePackage.IDENTITY_REALM: return createIdentityRealm();
            case InstancePackage.SELF_SIGNED_IDENTITY: return createSelfSignedIdentity();
            case InstancePackage.IDENTITY_FEDERATION: return createIdentityFederation();
            case InstancePackage.IDENTITY_OWNER: return createIdentityOwner();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DigitalIdentity createDigitalIdentity() {
        DigitalIdentityImpl digitalIdentity = new DigitalIdentityImpl();
        return digitalIdentity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityAttribute createIdentityAttribute() {
        IdentityAttributeImpl identityAttribute = new IdentityAttributeImpl();
        return identityAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityRealm createIdentityRealm() {
        IdentityRealmImpl identityRealm = new IdentityRealmImpl();
        return identityRealm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SelfSignedIdentity createSelfSignedIdentity() {
        SelfSignedIdentityImpl selfSignedIdentity = new SelfSignedIdentityImpl();
        return selfSignedIdentity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityFederation createIdentityFederation() {
        IdentityFederationImpl identityFederation = new IdentityFederationImpl();
        return identityFederation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityOwner createIdentityOwner() {
        IdentityOwnerImpl identityOwner = new IdentityOwnerImpl();
        return identityOwner;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InstancePackage getInstancePackage() {
        return (InstancePackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static InstancePackage getPackage() {
        return InstancePackage.eINSTANCE;
    }

} //InstanceFactoryImpl
