/**
 */
package behavior.causality.util;

import behavior.causality.*;

import models.Element;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see behavior.causality.CausalityPackage
 * @generated
 */
public class CausalityAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static CausalityPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CausalityAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = CausalityPackage.eINSTANCE;
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
    protected CausalitySwitch<Adapter> modelSwitch =
        new CausalitySwitch<Adapter>() {
            @Override
            public Adapter casePointCondition(PointCondition object) {
                return createPointConditionAdapter();
            }
            @Override
            public Adapter caseExitPointCondition(ExitPointCondition object) {
                return createExitPointConditionAdapter();
            }
            @Override
            public Adapter caseEntryPointCondition(EntryPointCondition object) {
                return createEntryPointConditionAdapter();
            }
            @Override
            public Adapter caseBinaryCausalityCondition(BinaryCausalityCondition object) {
                return createBinaryCausalityConditionAdapter();
            }
            @Override
            public Adapter caseOrCondition(OrCondition object) {
                return createOrConditionAdapter();
            }
            @Override
            public Adapter caseAndCondition(AndCondition object) {
                return createAndConditionAdapter();
            }
            @Override
            public Adapter caseCausalityParameter(CausalityParameter object) {
                return createCausalityParameterAdapter();
            }
            @Override
            public Adapter caseCausalityCondition(CausalityCondition object) {
                return createCausalityConditionAdapter();
            }
            @Override
            public Adapter caseCausalityRelation(CausalityRelation object) {
                return createCausalityRelationAdapter();
            }
            @Override
            public Adapter caseCausalityConstraint(CausalityConstraint object) {
                return createCausalityConstraintAdapter();
            }
            @Override
            public Adapter caseBasicCausalityCondition(BasicCausalityCondition object) {
                return createBasicCausalityConditionAdapter();
            }
            @Override
            public Adapter caseStartCondition(StartCondition object) {
                return createStartConditionAdapter();
            }
            @Override
            public Adapter caseDisablingCondition(DisablingCondition object) {
                return createDisablingConditionAdapter();
            }
            @Override
            public Adapter caseEnablingCondition(EnablingCondition object) {
                return createEnablingConditionAdapter();
            }
            @Override
            public Adapter caseSynchronizationCondition(SynchronizationCondition object) {
                return createSynchronizationConditionAdapter();
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
     * Creates a new adapter for an object of class '{@link behavior.causality.PointCondition <em>Point Condition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.causality.PointCondition
     * @generated
     */
    public Adapter createPointConditionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.causality.ExitPointCondition <em>Exit Point Condition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.causality.ExitPointCondition
     * @generated
     */
    public Adapter createExitPointConditionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.causality.EntryPointCondition <em>Entry Point Condition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.causality.EntryPointCondition
     * @generated
     */
    public Adapter createEntryPointConditionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.causality.BinaryCausalityCondition <em>Binary Causality Condition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.causality.BinaryCausalityCondition
     * @generated
     */
    public Adapter createBinaryCausalityConditionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.causality.OrCondition <em>Or Condition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.causality.OrCondition
     * @generated
     */
    public Adapter createOrConditionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.causality.AndCondition <em>And Condition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.causality.AndCondition
     * @generated
     */
    public Adapter createAndConditionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.causality.CausalityParameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.causality.CausalityParameter
     * @generated
     */
    public Adapter createCausalityParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.causality.CausalityCondition <em>Condition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.causality.CausalityCondition
     * @generated
     */
    public Adapter createCausalityConditionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.causality.CausalityRelation <em>Relation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.causality.CausalityRelation
     * @generated
     */
    public Adapter createCausalityRelationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.causality.CausalityConstraint <em>Constraint</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.causality.CausalityConstraint
     * @generated
     */
    public Adapter createCausalityConstraintAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.causality.BasicCausalityCondition <em>Basic Causality Condition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.causality.BasicCausalityCondition
     * @generated
     */
    public Adapter createBasicCausalityConditionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.causality.StartCondition <em>Start Condition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.causality.StartCondition
     * @generated
     */
    public Adapter createStartConditionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.causality.DisablingCondition <em>Disabling Condition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.causality.DisablingCondition
     * @generated
     */
    public Adapter createDisablingConditionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.causality.EnablingCondition <em>Enabling Condition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.causality.EnablingCondition
     * @generated
     */
    public Adapter createEnablingConditionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.causality.SynchronizationCondition <em>Synchronization Condition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.causality.SynchronizationCondition
     * @generated
     */
    public Adapter createSynchronizationConditionAdapter() {
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

} //CausalityAdapterFactory
