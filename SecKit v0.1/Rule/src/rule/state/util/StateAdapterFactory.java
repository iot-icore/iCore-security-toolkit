/**
 */
package rule.state.util;

import models.Element;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import rule.state.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see rule.state.StatePackage
 * @generated
 */
public class StateAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static StatePackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StateAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = StatePackage.eINSTANCE;
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
    protected StateSwitch<Adapter> modelSwitch =
        new StateSwitch<Adapter>() {
            @Override
            public Adapter caseState(State object) {
                return createStateAdapter();
            }
            @Override
            public Adapter caseEventPatternState(EventPatternState object) {
                return createEventPatternStateAdapter();
            }
            @Override
            public Adapter caseRepState(RepState object) {
                return createRepStateAdapter();
            }
            @Override
            public Adapter caseTimeBoundedState(TimeBoundedState object) {
                return createTimeBoundedStateAdapter();
            }
            @Override
            public Adapter caseCounterState(CounterState object) {
                return createCounterStateAdapter();
            }
            @Override
            public Adapter caseRepSinceState(RepSinceState object) {
                return createRepSinceStateAdapter();
            }
            @Override
            public Adapter caseAbstractState(AbstractState object) {
                return createAbstractStateAdapter();
            }
            @Override
            public Adapter caseElement(Element object) {
                return createElementAdapter();
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
     * Creates a new adapter for an object of class '{@link rule.state.State <em>State</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.state.State
     * @generated
     */
    public Adapter createStateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.state.EventPatternState <em>Event Pattern State</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.state.EventPatternState
     * @generated
     */
    public Adapter createEventPatternStateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.state.RepState <em>Rep State</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.state.RepState
     * @generated
     */
    public Adapter createRepStateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.state.TimeBoundedState <em>Time Bounded State</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.state.TimeBoundedState
     * @generated
     */
    public Adapter createTimeBoundedStateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.state.CounterState <em>Counter State</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.state.CounterState
     * @generated
     */
    public Adapter createCounterStateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.state.RepSinceState <em>Rep Since State</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.state.RepSinceState
     * @generated
     */
    public Adapter createRepSinceStateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.state.AbstractState <em>Abstract State</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.state.AbstractState
     * @generated
     */
    public Adapter createAbstractStateAdapter() {
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

} //StateAdapterFactory
