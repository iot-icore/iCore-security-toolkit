/**
 */
package identity.impl;

import identity.*;

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
public class IdentityFactoryImpl extends EFactoryImpl implements IdentityFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static IdentityFactory init() {
        try {
            IdentityFactory theIdentityFactory = (IdentityFactory)EPackage.Registry.INSTANCE.getEFactory(IdentityPackage.eNS_URI);
            if (theIdentityFactory != null) {
                return theIdentityFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new IdentityFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityFactoryImpl() {
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
            case IdentityPackage.IDENTITY_DESIGN_MODEL: return createIdentityDesignModel();
            case IdentityPackage.IDENTITY_RUNTIME_MODEL: return createIdentityRuntimeModel();
            case IdentityPackage.IDENTITY_INSTANCE_VARIABLE: return createIdentityInstanceVariable();
            case IdentityPackage.IDENTITY_ATTRIBUTE_VARIABLE: return createIdentityAttributeVariable();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityDesignModel createIdentityDesignModel() {
        IdentityDesignModelImpl identityDesignModel = new IdentityDesignModelImpl();
        return identityDesignModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityRuntimeModel createIdentityRuntimeModel() {
        IdentityRuntimeModelImpl identityRuntimeModel = new IdentityRuntimeModelImpl();
        return identityRuntimeModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityInstanceVariable createIdentityInstanceVariable() {
        IdentityInstanceVariableImpl identityInstanceVariable = new IdentityInstanceVariableImpl();
        return identityInstanceVariable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityAttributeVariable createIdentityAttributeVariable() {
        IdentityAttributeVariableImpl identityAttributeVariable = new IdentityAttributeVariableImpl();
        return identityAttributeVariable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityPackage getIdentityPackage() {
        return (IdentityPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static IdentityPackage getPackage() {
        return IdentityPackage.eINSTANCE;
    }

} //IdentityFactoryImpl
