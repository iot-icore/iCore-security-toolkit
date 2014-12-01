/**
 */
package behavior.pattern.impl;

import behavior.pattern.*;

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
public class PatternFactoryImpl extends EFactoryImpl implements PatternFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static PatternFactory init() {
        try {
            PatternFactory thePatternFactory = (PatternFactory)EPackage.Registry.INSTANCE.getEFactory(PatternPackage.eNS_URI);
            if (thePatternFactory != null) {
                return thePatternFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new PatternFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PatternFactoryImpl() {
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
            case PatternPackage.BEHAVIOR_PATTERN: return createBehaviorPattern();
            case PatternPackage.ACTIVITY_PATTERN: return createActivityPattern();
            case PatternPackage.ACTION_PATTERN: return createActionPattern();
            case PatternPackage.INTERACTION_PATTERN: return createInteractionPattern();
            case PatternPackage.INTERACTION_CONTRIBUTION_PATTERN: return createInteractionContributionPattern();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorPattern createBehaviorPattern() {
        BehaviorPatternImpl behaviorPattern = new BehaviorPatternImpl();
        return behaviorPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityPattern createActivityPattern() {
        ActivityPatternImpl activityPattern = new ActivityPatternImpl();
        return activityPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActionPattern createActionPattern() {
        ActionPatternImpl actionPattern = new ActionPatternImpl();
        return actionPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionPattern createInteractionPattern() {
        InteractionPatternImpl interactionPattern = new InteractionPatternImpl();
        return interactionPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionContributionPattern createInteractionContributionPattern() {
        InteractionContributionPatternImpl interactionContributionPattern = new InteractionContributionPatternImpl();
        return interactionContributionPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PatternPackage getPatternPackage() {
        return (PatternPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static PatternPackage getPackage() {
        return PatternPackage.eINSTANCE;
    }

} //PatternFactoryImpl
