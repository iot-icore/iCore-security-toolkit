/**
 */
package rule.propositional.util;

import models.Element;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import rule.condition.Arity;
import rule.condition.Atom;
import rule.condition.Binary;
import rule.condition.Multiary;
import rule.condition.Operator;
import rule.condition.Unary;

import rule.propositional.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see rule.propositional.PropositionalPackage
 * @generated
 */
public class PropositionalAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static PropositionalPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PropositionalAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = PropositionalPackage.eINSTANCE;
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
    protected PropositionalSwitch<Adapter> modelSwitch =
        new PropositionalSwitch<Adapter>() {
            @Override
            public Adapter caseAnd(And object) {
                return createAndAdapter();
            }
            @Override
            public Adapter caseOr(Or object) {
                return createOrAdapter();
            }
            @Override
            public Adapter caseNot(Not object) {
                return createNotAdapter();
            }
            @Override
            public Adapter caseImplies(Implies object) {
                return createImpliesAdapter();
            }
            @Override
            public Adapter casePropositionalOperator(PropositionalOperator object) {
                return createPropositionalOperatorAdapter();
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
            public Adapter caseMultiary(Multiary object) {
                return createMultiaryAdapter();
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
     * Creates a new adapter for an object of class '{@link rule.propositional.And <em>And</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.propositional.And
     * @generated
     */
    public Adapter createAndAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.propositional.Or <em>Or</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.propositional.Or
     * @generated
     */
    public Adapter createOrAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.propositional.Not <em>Not</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.propositional.Not
     * @generated
     */
    public Adapter createNotAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.propositional.Implies <em>Implies</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.propositional.Implies
     * @generated
     */
    public Adapter createImpliesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.propositional.PropositionalOperator <em>Operator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.propositional.PropositionalOperator
     * @generated
     */
    public Adapter createPropositionalOperatorAdapter() {
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
     * Creates a new adapter for an object of class '{@link rule.condition.Multiary <em>Multiary</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.condition.Multiary
     * @generated
     */
    public Adapter createMultiaryAdapter() {
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

} //PropositionalAdapterFactory
