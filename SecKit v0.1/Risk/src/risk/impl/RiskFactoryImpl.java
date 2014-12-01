/**
 */
package risk.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import risk.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RiskFactoryImpl extends EFactoryImpl implements RiskFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static RiskFactory init() {
        try {
            RiskFactory theRiskFactory = (RiskFactory)EPackage.Registry.INSTANCE.getEFactory(RiskPackage.eNS_URI);
            if (theRiskFactory != null) {
                return theRiskFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new RiskFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RiskFactoryImpl() {
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
            case RiskPackage.RISK_DESIGN_MODEL: return createRiskDesignModel();
            case RiskPackage.RISK_RUNTIME_MODEL: return createRiskRuntimeModel();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RiskDesignModel createRiskDesignModel() {
        RiskDesignModelImpl riskDesignModel = new RiskDesignModelImpl();
        return riskDesignModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RiskRuntimeModel createRiskRuntimeModel() {
        RiskRuntimeModelImpl riskRuntimeModel = new RiskRuntimeModelImpl();
        return riskRuntimeModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RiskPackage getRiskPackage() {
        return (RiskPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static RiskPackage getPackage() {
        return RiskPackage.eINSTANCE;
    }

} //RiskFactoryImpl
