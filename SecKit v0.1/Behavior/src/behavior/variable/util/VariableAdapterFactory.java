/**
 */
package behavior.variable.util;

import behavior.variable.*;

import models.Element;

import models.variable.VariableDeclaration;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see behavior.variable.VariablePackage
 * @generated
 */
public class VariableAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static VariablePackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VariableAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = VariablePackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VariableSwitch<Adapter> modelSwitch =
        new VariableSwitch<Adapter>() {
            @Override
            public Adapter caseActivityVariable(ActivityVariable object) {
                return createActivityVariableAdapter();
            }
            @Override
            public Adapter caseActivityTypeVariable(ActivityTypeVariable object) {
                return createActivityTypeVariableAdapter();
            }
            @Override
            public Adapter caseActivityInstantiationVariable(ActivityInstantiationVariable object) {
                return createActivityInstantiationVariableAdapter();
            }
            @Override
            public Adapter caseActivityInstanceVariable(ActivityInstanceVariable object) {
                return createActivityInstanceVariableAdapter();
            }
            @Override
            public Adapter caseFlowPointVariable(FlowPointVariable object) {
                return createFlowPointVariableAdapter();
            }
            @Override
            public Adapter caseBehaviorVariable(BehaviorVariable object) {
                return createBehaviorVariableAdapter();
            }
            @Override
            public Adapter caseBehaviorTypeVariable(BehaviorTypeVariable object) {
                return createBehaviorTypeVariableAdapter();
            }
            @Override
            public Adapter caseBehaviorInstantiationVariable(BehaviorInstantiationVariable object) {
                return createBehaviorInstantiationVariableAdapter();
            }
            @Override
            public Adapter caseBehaviorInstanceVariable(BehaviorInstanceVariable object) {
                return createBehaviorInstanceVariableAdapter();
            }
            @Override
            public Adapter caseFlowPointTypeVariable(FlowPointTypeVariable object) {
                return createFlowPointTypeVariableAdapter();
            }
            @Override
            public Adapter caseFlowPointInstanceVariable(FlowPointInstanceVariable object) {
                return createFlowPointInstanceVariableAdapter();
            }
            @Override
            public Adapter caseFlowPointInstantiationVariable(FlowPointInstantiationVariable object) {
                return createFlowPointInstantiationVariableAdapter();
            }
            @Override
            public Adapter caseElement(Element object) {
                return createElementAdapter();
            }
            @Override
            public Adapter caseVariableDeclaration(VariableDeclaration object) {
                return createVariableDeclarationAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link behavior.variable.ActivityVariable <em>Activity Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.variable.ActivityVariable
     * @generated
     */
    public Adapter createActivityVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.variable.ActivityTypeVariable <em>Activity Type Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.variable.ActivityTypeVariable
     * @generated
     */
    public Adapter createActivityTypeVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.variable.ActivityInstantiationVariable <em>Activity Instantiation Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.variable.ActivityInstantiationVariable
     * @generated
     */
    public Adapter createActivityInstantiationVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.variable.ActivityInstanceVariable <em>Activity Instance Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.variable.ActivityInstanceVariable
     * @generated
     */
    public Adapter createActivityInstanceVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.variable.FlowPointVariable <em>Flow Point Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.variable.FlowPointVariable
     * @generated
     */
    public Adapter createFlowPointVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.variable.BehaviorVariable <em>Behavior Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.variable.BehaviorVariable
     * @generated
     */
    public Adapter createBehaviorVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.variable.BehaviorTypeVariable <em>Behavior Type Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.variable.BehaviorTypeVariable
     * @generated
     */
    public Adapter createBehaviorTypeVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.variable.BehaviorInstantiationVariable <em>Behavior Instantiation Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.variable.BehaviorInstantiationVariable
     * @generated
     */
    public Adapter createBehaviorInstantiationVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.variable.BehaviorInstanceVariable <em>Behavior Instance Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.variable.BehaviorInstanceVariable
     * @generated
     */
    public Adapter createBehaviorInstanceVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.variable.FlowPointTypeVariable <em>Flow Point Type Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.variable.FlowPointTypeVariable
     * @generated
     */
    public Adapter createFlowPointTypeVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.variable.FlowPointInstanceVariable <em>Flow Point Instance Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.variable.FlowPointInstanceVariable
     * @generated
     */
    public Adapter createFlowPointInstanceVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.variable.FlowPointInstantiationVariable <em>Flow Point Instantiation Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.variable.FlowPointInstantiationVariable
     * @generated
     */
    public Adapter createFlowPointInstantiationVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link models.Element <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.Element
     * @generated
     */
    public Adapter createElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link models.variable.VariableDeclaration <em>Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.variable.VariableDeclaration
     * @generated
     */
    public Adapter createVariableDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //VariableAdapterFactory
