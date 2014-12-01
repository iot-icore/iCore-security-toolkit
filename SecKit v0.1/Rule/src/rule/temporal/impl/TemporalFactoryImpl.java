/**
 */
package rule.temporal.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rule.temporal.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TemporalFactoryImpl extends EFactoryImpl implements TemporalFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TemporalFactory init() {
        try {
            TemporalFactory theTemporalFactory = (TemporalFactory)EPackage.Registry.INSTANCE.getEFactory(TemporalPackage.eNS_URI);
            if (theTemporalFactory != null) {
                return theTemporalFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new TemporalFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TemporalFactoryImpl() {
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
            case TemporalPackage.ALWAYS: return createAlways();
            case TemporalPackage.SINCE: return createSince();
            case TemporalPackage.BEFORE: return createBefore();
            case TemporalPackage.WITHIN: return createWithin();
            case TemporalPackage.DURING: return createDuring();
            case TemporalPackage.EVENTUALLY: return createEventually();
            case TemporalPackage.REPEAT_LIMIT: return createRepeatLimit();
            case TemporalPackage.REPEAT_SINCE: return createRepeatSince();
            case TemporalPackage.REPEAT_MAXIMUM: return createRepeatMaximum();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Always createAlways() {
        AlwaysImpl always = new AlwaysImpl();
        return always;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Since createSince() {
        SinceImpl since = new SinceImpl();
        return since;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Before createBefore() {
        BeforeImpl before = new BeforeImpl();
        return before;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Within createWithin() {
        WithinImpl within = new WithinImpl();
        return within;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public During createDuring() {
        DuringImpl during = new DuringImpl();
        return during;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Eventually createEventually() {
        EventuallyImpl eventually = new EventuallyImpl();
        return eventually;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RepeatLimit createRepeatLimit() {
        RepeatLimitImpl repeatLimit = new RepeatLimitImpl();
        return repeatLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RepeatSince createRepeatSince() {
        RepeatSinceImpl repeatSince = new RepeatSinceImpl();
        return repeatSince;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RepeatMaximum createRepeatMaximum() {
        RepeatMaximumImpl repeatMaximum = new RepeatMaximumImpl();
        return repeatMaximum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TemporalPackage getTemporalPackage() {
        return (TemporalPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static TemporalPackage getPackage() {
        return TemporalPackage.eINSTANCE;
    }

} //TemporalFactoryImpl
