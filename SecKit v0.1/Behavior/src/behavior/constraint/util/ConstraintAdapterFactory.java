/**
 */
package behavior.constraint.util;

import behavior.constraint.*;

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
 * @see behavior.constraint.ConstraintPackage
 * @generated
 */
public class ConstraintAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ConstraintPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConstraintAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = ConstraintPackage.eINSTANCE;
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
    protected ConstraintSwitch<Adapter> modelSwitch =
        new ConstraintSwitch<Adapter>() {
            @Override
            public Adapter caseDataConstraint(DataConstraint object) {
                return createDataConstraintAdapter();
            }
            @Override
            public Adapter caseReferenceDataEstablishment(ReferenceDataEstablishment object) {
                return createReferenceDataEstablishmentAdapter();
            }
            @Override
            public Adapter caseDataEstablishment(DataEstablishment object) {
                return createDataEstablishmentAdapter();
            }
            @Override
            public Adapter caseValueCheckingConstraint(ValueCheckingConstraint object) {
                return createValueCheckingConstraintAdapter();
            }
            @Override
            public Adapter caseRangeOfValues(RangeOfValues object) {
                return createRangeOfValuesAdapter();
            }
            @Override
            public Adapter caseSetOfValues(SetOfValues object) {
                return createSetOfValuesAdapter();
            }
            @Override
            public Adapter caseStaticDataEstablishment(StaticDataEstablishment object) {
                return createStaticDataEstablishmentAdapter();
            }
            @Override
            public Adapter caseDataEstablishmentFromVariable(DataEstablishmentFromVariable object) {
                return createDataEstablishmentFromVariableAdapter();
            }
            @Override
            public Adapter caseIdentityConstraint(IdentityConstraint object) {
                return createIdentityConstraintAdapter();
            }
            @Override
            public Adapter caseIdentityEstablishment(IdentityEstablishment object) {
                return createIdentityEstablishmentAdapter();
            }
            @Override
            public Adapter caseConstraint(Constraint object) {
                return createConstraintAdapter();
            }
            @Override
            public Adapter caseIdentityEstablishmentFromVariable(IdentityEstablishmentFromVariable object) {
                return createIdentityEstablishmentFromVariableAdapter();
            }
            @Override
            public Adapter caseVariableEstablishment(VariableEstablishment object) {
                return createVariableEstablishmentAdapter();
            }
            @Override
            public Adapter caseReferenceIdentityEstablishment(ReferenceIdentityEstablishment object) {
                return createReferenceIdentityEstablishmentAdapter();
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
     * Creates a new adapter for an object of class '{@link behavior.constraint.DataConstraint <em>Data Constraint</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.constraint.DataConstraint
     * @generated
     */
    public Adapter createDataConstraintAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.constraint.ReferenceDataEstablishment <em>Reference Data Establishment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.constraint.ReferenceDataEstablishment
     * @generated
     */
    public Adapter createReferenceDataEstablishmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.constraint.DataEstablishment <em>Data Establishment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.constraint.DataEstablishment
     * @generated
     */
    public Adapter createDataEstablishmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.constraint.ValueCheckingConstraint <em>Value Checking Constraint</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.constraint.ValueCheckingConstraint
     * @generated
     */
    public Adapter createValueCheckingConstraintAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.constraint.RangeOfValues <em>Range Of Values</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.constraint.RangeOfValues
     * @generated
     */
    public Adapter createRangeOfValuesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.constraint.SetOfValues <em>Set Of Values</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.constraint.SetOfValues
     * @generated
     */
    public Adapter createSetOfValuesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.constraint.StaticDataEstablishment <em>Static Data Establishment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.constraint.StaticDataEstablishment
     * @generated
     */
    public Adapter createStaticDataEstablishmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.constraint.DataEstablishmentFromVariable <em>Data Establishment From Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.constraint.DataEstablishmentFromVariable
     * @generated
     */
    public Adapter createDataEstablishmentFromVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.constraint.IdentityConstraint <em>Identity Constraint</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.constraint.IdentityConstraint
     * @generated
     */
    public Adapter createIdentityConstraintAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.constraint.IdentityEstablishment <em>Identity Establishment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.constraint.IdentityEstablishment
     * @generated
     */
    public Adapter createIdentityEstablishmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.constraint.Constraint <em>Constraint</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.constraint.Constraint
     * @generated
     */
    public Adapter createConstraintAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.constraint.IdentityEstablishmentFromVariable <em>Identity Establishment From Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.constraint.IdentityEstablishmentFromVariable
     * @generated
     */
    public Adapter createIdentityEstablishmentFromVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.constraint.VariableEstablishment <em>Variable Establishment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.constraint.VariableEstablishment
     * @generated
     */
    public Adapter createVariableEstablishmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.constraint.ReferenceIdentityEstablishment <em>Reference Identity Establishment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.constraint.ReferenceIdentityEstablishment
     * @generated
     */
    public Adapter createReferenceIdentityEstablishmentAdapter() {
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

} //ConstraintAdapterFactory
