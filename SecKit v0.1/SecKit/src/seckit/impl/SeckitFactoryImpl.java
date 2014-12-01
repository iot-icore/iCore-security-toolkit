/**
 */
package seckit.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import seckit.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SeckitFactoryImpl extends EFactoryImpl implements SeckitFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SeckitFactory init() {
        try {
            SeckitFactory theSeckitFactory = (SeckitFactory)EPackage.Registry.INSTANCE.getEFactory(SeckitPackage.eNS_URI);
            if (theSeckitFactory != null) {
                return theSeckitFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new SeckitFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SeckitFactoryImpl() {
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
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT: return createSystemDesignViewpoint();
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT: return createSystemRuntimeViewpoint();
            case SeckitPackage.SYSTEM_VIEWPOINTS: return createSystemViewpoints();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SystemDesignViewpoint createSystemDesignViewpoint() {
        SystemDesignViewpointImpl systemDesignViewpoint = new SystemDesignViewpointImpl();
        return systemDesignViewpoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SystemRuntimeViewpoint createSystemRuntimeViewpoint() {
        SystemRuntimeViewpointImpl systemRuntimeViewpoint = new SystemRuntimeViewpointImpl();
        return systemRuntimeViewpoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SystemViewpoints createSystemViewpoints() {
        SystemViewpointsImpl systemViewpoints = new SystemViewpointsImpl();
        return systemViewpoints;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SeckitPackage getSeckitPackage() {
        return (SeckitPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static SeckitPackage getPackage() {
        return SeckitPackage.eINSTANCE;
    }

} //SeckitFactoryImpl
