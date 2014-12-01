/**
 */
package rule.temporal.util;

import models.Element;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import rule.condition.Arity;
import rule.condition.Atom;
import rule.condition.Binary;
import rule.condition.Operator;
import rule.condition.Unary;

import rule.temporal.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see rule.temporal.TemporalPackage
 * @generated
 */
public class TemporalAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static TemporalPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TemporalAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = TemporalPackage.eINSTANCE;
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
    protected TemporalSwitch<Adapter> modelSwitch =
        new TemporalSwitch<Adapter>() {
            @Override
            public Adapter caseAlways(Always object) {
                return createAlwaysAdapter();
            }
            @Override
            public Adapter caseSince(Since object) {
                return createSinceAdapter();
            }
            @Override
            public Adapter caseBefore(Before object) {
                return createBeforeAdapter();
            }
            @Override
            public Adapter caseWithin(Within object) {
                return createWithinAdapter();
            }
            @Override
            public Adapter caseDuring(During object) {
                return createDuringAdapter();
            }
            @Override
            public Adapter caseCardinalityOperator(CardinalityOperator object) {
                return createCardinalityOperatorAdapter();
            }
            @Override
            public Adapter caseTimeBoundedTemporalOperator(TimeBoundedTemporalOperator object) {
                return createTimeBoundedTemporalOperatorAdapter();
            }
            @Override
            public Adapter casePastTemporalOperator(PastTemporalOperator object) {
                return createPastTemporalOperatorAdapter();
            }
            @Override
            public Adapter caseTimeBoundedOccurrence(TimeBoundedOccurrence object) {
                return createTimeBoundedOccurrenceAdapter();
            }
            @Override
            public Adapter caseEventually(Eventually object) {
                return createEventuallyAdapter();
            }
            @Override
            public Adapter caseRepeatLimit(RepeatLimit object) {
                return createRepeatLimitAdapter();
            }
            @Override
            public Adapter caseRepeatSince(RepeatSince object) {
                return createRepeatSinceAdapter();
            }
            @Override
            public Adapter caseRepeatMaximum(RepeatMaximum object) {
                return createRepeatMaximumAdapter();
            }
            @Override
            public Adapter caseElement(Element object) {
                return createElementAdapter();
            }
            @Override
            public Adapter caseAtom(Atom object) {
                return createAtomAdapter();
            }
            @Override
            public Adapter caseOperator(Operator object) {
                return createOperatorAdapter();
            }
            @Override
            public Adapter caseArity(Arity object) {
                return createArityAdapter();
            }
            @Override
            public Adapter caseUnary(Unary object) {
                return createUnaryAdapter();
            }
            @Override
            public Adapter caseBinary(Binary object) {
                return createBinaryAdapter();
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
     * Creates a new adapter for an object of class '{@link rule.temporal.Always <em>Always</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.temporal.Always
     * @generated
     */
    public Adapter createAlwaysAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.temporal.Since <em>Since</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.temporal.Since
     * @generated
     */
    public Adapter createSinceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.temporal.Before <em>Before</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.temporal.Before
     * @generated
     */
    public Adapter createBeforeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.temporal.Within <em>Within</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.temporal.Within
     * @generated
     */
    public Adapter createWithinAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.temporal.During <em>During</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.temporal.During
     * @generated
     */
    public Adapter createDuringAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.temporal.CardinalityOperator <em>Cardinality Operator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.temporal.CardinalityOperator
     * @generated
     */
    public Adapter createCardinalityOperatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.temporal.TimeBoundedTemporalOperator <em>Time Bounded Temporal Operator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.temporal.TimeBoundedTemporalOperator
     * @generated
     */
    public Adapter createTimeBoundedTemporalOperatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.temporal.PastTemporalOperator <em>Past Temporal Operator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.temporal.PastTemporalOperator
     * @generated
     */
    public Adapter createPastTemporalOperatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.temporal.TimeBoundedOccurrence <em>Time Bounded Occurrence</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.temporal.TimeBoundedOccurrence
     * @generated
     */
    public Adapter createTimeBoundedOccurrenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.temporal.Eventually <em>Eventually</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.temporal.Eventually
     * @generated
     */
    public Adapter createEventuallyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.temporal.RepeatLimit <em>Repeat Limit</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.temporal.RepeatLimit
     * @generated
     */
    public Adapter createRepeatLimitAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.temporal.RepeatSince <em>Repeat Since</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.temporal.RepeatSince
     * @generated
     */
    public Adapter createRepeatSinceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.temporal.RepeatMaximum <em>Repeat Maximum</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.temporal.RepeatMaximum
     * @generated
     */
    public Adapter createRepeatMaximumAdapter() {
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
     * Creates a new adapter for an object of class '{@link rule.condition.Operator <em>Operator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.condition.Operator
     * @generated
     */
    public Adapter createOperatorAdapter() {
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
     * Creates a new adapter for an object of class '{@link rule.condition.Unary <em>Unary</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.condition.Unary
     * @generated
     */
    public Adapter createUnaryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.condition.Binary <em>Binary</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.condition.Binary
     * @generated
     */
    public Adapter createBinaryAdapter() {
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

} //TemporalAdapterFactory
