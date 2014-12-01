/**
 */
package structure.variable.util;

import models.Element;

import models.variable.VariableDeclaration;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import structure.variable.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see structure.variable.VariablePackage
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
            public Adapter caseEntityTypeVariable(EntityTypeVariable object) {
                return createEntityTypeVariableAdapter();
            }
            @Override
            public Adapter caseEntityInstantiationVariable(EntityInstantiationVariable object) {
                return createEntityInstantiationVariableAdapter();
            }
            @Override
            public Adapter caseEntityInstanceVariable(EntityInstanceVariable object) {
                return createEntityInstanceVariableAdapter();
            }
            @Override
            public Adapter caseEntityVariable(EntityVariable object) {
                return createEntityVariableAdapter();
            }
            @Override
            public Adapter caseEntityInstantiationHierarchyVariable(EntityInstantiationHierarchyVariable object) {
                return createEntityInstantiationHierarchyVariableAdapter();
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
     * Creates a new adapter for an object of class '{@link structure.variable.EntityTypeVariable <em>Entity Type Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.variable.EntityTypeVariable
     * @generated
     */
    public Adapter createEntityTypeVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.variable.EntityInstantiationVariable <em>Entity Instantiation Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.variable.EntityInstantiationVariable
     * @generated
     */
    public Adapter createEntityInstantiationVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.variable.EntityInstanceVariable <em>Entity Instance Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.variable.EntityInstanceVariable
     * @generated
     */
    public Adapter createEntityInstanceVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.variable.EntityVariable <em>Entity Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.variable.EntityVariable
     * @generated
     */
    public Adapter createEntityVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link structure.variable.EntityInstantiationHierarchyVariable <em>Entity Instantiation Hierarchy Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see structure.variable.EntityInstantiationHierarchyVariable
     * @generated
     */
    public Adapter createEntityInstantiationHierarchyVariableAdapter() {
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
