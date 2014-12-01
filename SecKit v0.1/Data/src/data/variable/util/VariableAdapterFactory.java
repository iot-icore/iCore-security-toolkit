/**
 */
package data.variable.util;

import data.variable.*;

import models.Element;

import models.variable.StaticAssignment;
import models.variable.VariableAssignment;
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
 * @see data.variable.VariablePackage
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
            public Adapter caseDataTypeVariable(DataTypeVariable object) {
                return createDataTypeVariableAdapter();
            }
            @Override
            public Adapter caseDataInstantiationVariable(DataInstantiationVariable object) {
                return createDataInstantiationVariableAdapter();
            }
            @Override
            public Adapter caseDataInstanceVariable(DataInstanceVariable object) {
                return createDataInstanceVariableAdapter();
            }
            @Override
            public Adapter caseDataInstanceAssignment(DataInstanceAssignment object) {
                return createDataInstanceAssignmentAdapter();
            }
            @Override
            public Adapter caseDataInstantiationAssignment(DataInstantiationAssignment object) {
                return createDataInstantiationAssignmentAdapter();
            }
            @Override
            public Adapter caseDataTypeAssignment(DataTypeAssignment object) {
                return createDataTypeAssignmentAdapter();
            }
            @Override
            public Adapter caseDataVariable(DataVariable object) {
                return createDataVariableAdapter();
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
            public Adapter caseVariableAssignment(VariableAssignment object) {
                return createVariableAssignmentAdapter();
            }
            @Override
            public Adapter caseStaticAssignment(StaticAssignment object) {
                return createStaticAssignmentAdapter();
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
     * Creates a new adapter for an object of class '{@link data.variable.DataTypeVariable <em>Data Type Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.variable.DataTypeVariable
     * @generated
     */
    public Adapter createDataTypeVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.variable.DataInstantiationVariable <em>Data Instantiation Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.variable.DataInstantiationVariable
     * @generated
     */
    public Adapter createDataInstantiationVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.variable.DataInstanceVariable <em>Data Instance Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.variable.DataInstanceVariable
     * @generated
     */
    public Adapter createDataInstanceVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.variable.DataInstanceAssignment <em>Data Instance Assignment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.variable.DataInstanceAssignment
     * @generated
     */
    public Adapter createDataInstanceAssignmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.variable.DataInstantiationAssignment <em>Data Instantiation Assignment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.variable.DataInstantiationAssignment
     * @generated
     */
    public Adapter createDataInstantiationAssignmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.variable.DataTypeAssignment <em>Data Type Assignment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.variable.DataTypeAssignment
     * @generated
     */
    public Adapter createDataTypeAssignmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.variable.DataVariable <em>Data Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.variable.DataVariable
     * @generated
     */
    public Adapter createDataVariableAdapter() {
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
     * Creates a new adapter for an object of class '{@link models.variable.VariableAssignment <em>Assignment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.variable.VariableAssignment
     * @generated
     */
    public Adapter createVariableAssignmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link models.variable.StaticAssignment <em>Static Assignment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.variable.StaticAssignment
     * @generated
     */
    public Adapter createStaticAssignmentAdapter() {
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
