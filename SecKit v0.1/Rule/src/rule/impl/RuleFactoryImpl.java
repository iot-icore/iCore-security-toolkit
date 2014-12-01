/**
 */
package rule.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rule.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RuleFactoryImpl extends EFactoryImpl implements RuleFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static RuleFactory init() {
        try {
            RuleFactory theRuleFactory = (RuleFactory)EPackage.Registry.INSTANCE.getEFactory(RulePackage.eNS_URI);
            if (theRuleFactory != null) {
                return theRuleFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new RuleFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuleFactoryImpl() {
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
            case RulePackage.RULE_DESIGN_MODEL: return createRuleDesignModel();
            case RulePackage.RULE_RUNTIME_MODEL: return createRuleRuntimeModel();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuleDesignModel createRuleDesignModel() {
        RuleDesignModelImpl ruleDesignModel = new RuleDesignModelImpl();
        return ruleDesignModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuleRuntimeModel createRuleRuntimeModel() {
        RuleRuntimeModelImpl ruleRuntimeModel = new RuleRuntimeModelImpl();
        return ruleRuntimeModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RulePackage getRulePackage() {
        return (RulePackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static RulePackage getPackage() {
        return RulePackage.eINSTANCE;
    }

} //RuleFactoryImpl
