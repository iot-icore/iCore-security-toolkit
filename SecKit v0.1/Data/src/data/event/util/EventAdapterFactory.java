/**
 */
package data.event.util;

import data.event.*;

import models.Element;
import models.Pattern;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import rule.condition.Arity;
import rule.condition.Atom;
import rule.condition.EventPattern;
import rule.condition.Nullary;

import rule.event.Event;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see data.event.EventPackage
 * @generated
 */
public class EventAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static EventPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = EventPackage.eINSTANCE;
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
    protected EventSwitch<Adapter> modelSwitch =
        new EventSwitch<Adapter>() {
            @Override
            public Adapter caseDataEvent(DataEvent object) {
                return createDataEventAdapter();
            }
            @Override
            public Adapter caseAbstractDataEventPattern(AbstractDataEventPattern object) {
                return createAbstractDataEventPatternAdapter();
            }
            @Override
            public Adapter caseDataEventPattern(DataEventPattern object) {
                return createDataEventPatternAdapter();
            }
            @Override
            public Adapter caseElement(Element object) {
                return createElementAdapter();
            }
            @Override
            public Adapter caseEvent(Event object) {
                return createEventAdapter();
            }
            @Override
            public Adapter casePattern(Pattern object) {
                return createPatternAdapter();
            }
            @Override
            public Adapter caseArity(Arity object) {
                return createArityAdapter();
            }
            @Override
            public Adapter caseNullary(Nullary object) {
                return createNullaryAdapter();
            }
            @Override
            public Adapter caseAtom(Atom object) {
                return createAtomAdapter();
            }
            @Override
            public Adapter caseEventPattern(EventPattern object) {
                return createEventPatternAdapter();
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
     * Creates a new adapter for an object of class '{@link data.event.DataEvent <em>Data Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.event.DataEvent
     * @generated
     */
    public Adapter createDataEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.event.AbstractDataEventPattern <em>Abstract Data Event Pattern</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.event.AbstractDataEventPattern
     * @generated
     */
    public Adapter createAbstractDataEventPatternAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.event.DataEventPattern <em>Data Event Pattern</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.event.DataEventPattern
     * @generated
     */
    public Adapter createDataEventPatternAdapter() {
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
     * Creates a new adapter for an object of class '{@link rule.event.Event <em>Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.event.Event
     * @generated
     */
    public Adapter createEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link models.Pattern <em>Pattern</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.Pattern
     * @generated
     */
    public Adapter createPatternAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.condition.Arity <em>Arity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.condition.Arity
     * @generated
     */
    public Adapter createArityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.condition.Nullary <em>Nullary</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.condition.Nullary
     * @generated
     */
    public Adapter createNullaryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.condition.Atom <em>Atom</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.condition.Atom
     * @generated
     */
    public Adapter createAtomAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.condition.EventPattern <em>Event Pattern</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.condition.EventPattern
     * @generated
     */
    public Adapter createEventPatternAdapter() {
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

} //EventAdapterFactory
