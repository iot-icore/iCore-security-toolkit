/**
 */
package behavior.variable.impl;

import behavior.variable.*;

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
public class VariableFactoryImpl extends EFactoryImpl implements VariableFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static VariableFactory init() {
        try {
            VariableFactory theVariableFactory = (VariableFactory)EPackage.Registry.INSTANCE.getEFactory(VariablePackage.eNS_URI);
            if (theVariableFactory != null) {
                return theVariableFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new VariableFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VariableFactoryImpl() {
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
            case VariablePackage.ACTIVITY_TYPE_VARIABLE: return createActivityTypeVariable();
            case VariablePackage.ACTIVITY_INSTANTIATION_VARIABLE: return createActivityInstantiationVariable();
            case VariablePackage.ACTIVITY_INSTANCE_VARIABLE: return createActivityInstanceVariable();
            case VariablePackage.BEHAVIOR_TYPE_VARIABLE: return createBehaviorTypeVariable();
            case VariablePackage.BEHAVIOR_INSTANTIATION_VARIABLE: return createBehaviorInstantiationVariable();
            case VariablePackage.BEHAVIOR_INSTANCE_VARIABLE: return createBehaviorInstanceVariable();
            case VariablePackage.FLOW_POINT_TYPE_VARIABLE: return createFlowPointTypeVariable();
            case VariablePackage.FLOW_POINT_INSTANCE_VARIABLE: return createFlowPointInstanceVariable();
            case VariablePackage.FLOW_POINT_INSTANTIATION_VARIABLE: return createFlowPointInstantiationVariable();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityTypeVariable createActivityTypeVariable() {
        ActivityTypeVariableImpl activityTypeVariable = new ActivityTypeVariableImpl();
        return activityTypeVariable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityInstantiationVariable createActivityInstantiationVariable() {
        ActivityInstantiationVariableImpl activityInstantiationVariable = new ActivityInstantiationVariableImpl();
        return activityInstantiationVariable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityInstanceVariable createActivityInstanceVariable() {
        ActivityInstanceVariableImpl activityInstanceVariable = new ActivityInstanceVariableImpl();
        return activityInstanceVariable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorTypeVariable createBehaviorTypeVariable() {
        BehaviorTypeVariableImpl behaviorTypeVariable = new BehaviorTypeVariableImpl();
        return behaviorTypeVariable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorInstantiationVariable createBehaviorInstantiationVariable() {
        BehaviorInstantiationVariableImpl behaviorInstantiationVariable = new BehaviorInstantiationVariableImpl();
        return behaviorInstantiationVariable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorInstanceVariable createBehaviorInstanceVariable() {
        BehaviorInstanceVariableImpl behaviorInstanceVariable = new BehaviorInstanceVariableImpl();
        return behaviorInstanceVariable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FlowPointTypeVariable createFlowPointTypeVariable() {
        FlowPointTypeVariableImpl flowPointTypeVariable = new FlowPointTypeVariableImpl();
        return flowPointTypeVariable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FlowPointInstanceVariable createFlowPointInstanceVariable() {
        FlowPointInstanceVariableImpl flowPointInstanceVariable = new FlowPointInstanceVariableImpl();
        return flowPointInstanceVariable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FlowPointInstantiationVariable createFlowPointInstantiationVariable() {
        FlowPointInstantiationVariableImpl flowPointInstantiationVariable = new FlowPointInstantiationVariableImpl();
        return flowPointInstantiationVariable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VariablePackage getVariablePackage() {
        return (VariablePackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static VariablePackage getPackage() {
        return VariablePackage.eINSTANCE;
    }

} //VariableFactoryImpl
