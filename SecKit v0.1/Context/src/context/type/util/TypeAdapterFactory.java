/**
 */
package context.type.util;

import context.type.*;

import data.type.DataType;

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
 * @see context.type.TypePackage
 * @generated
 */
public class TypeAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static TypePackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = TypePackage.eINSTANCE;
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
    protected TypeSwitch<Adapter> modelSwitch =
        new TypeSwitch<Adapter>() {
            @Override
            public Adapter caseContextSituationType(ContextSituationType object) {
                return createContextSituationTypeAdapter();
            }
            @Override
            public Adapter caseContextInformationType(ContextInformationType object) {
                return createContextInformationTypeAdapter();
            }
            @Override
            public Adapter caseContextTypePackage(ContextTypePackage object) {
                return createContextTypePackageAdapter();
            }
            @Override
            public Adapter caseEntityRoleType(EntityRoleType object) {
                return createEntityRoleTypeAdapter();
            }
            @Override
            public Adapter caseCompositeContextSituationType(CompositeContextSituationType object) {
                return createCompositeContextSituationTypeAdapter();
            }
            @Override
            public Adapter caseSituationRoleType(SituationRoleType object) {
                return createSituationRoleTypeAdapter();
            }
            @Override
            public Adapter caseElement(Element object) {
                return createElementAdapter();
            }
            @Override
            public Adapter caseDataType(DataType object) {
                return createDataTypeAdapter();
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
     * Creates a new adapter for an object of class '{@link context.type.ContextSituationType <em>Context Situation Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.type.ContextSituationType
     * @generated
     */
    public Adapter createContextSituationTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link context.type.ContextInformationType <em>Context Information Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.type.ContextInformationType
     * @generated
     */
    public Adapter createContextInformationTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link context.type.ContextTypePackage <em>Context Type Package</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.type.ContextTypePackage
     * @generated
     */
    public Adapter createContextTypePackageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link context.type.EntityRoleType <em>Entity Role Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.type.EntityRoleType
     * @generated
     */
    public Adapter createEntityRoleTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link context.type.CompositeContextSituationType <em>Composite Context Situation Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.type.CompositeContextSituationType
     * @generated
     */
    public Adapter createCompositeContextSituationTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link context.type.SituationRoleType <em>Situation Role Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.type.SituationRoleType
     * @generated
     */
    public Adapter createSituationRoleTypeAdapter() {
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
     * Creates a new adapter for an object of class '{@link data.type.DataType <em>Data Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.type.DataType
     * @generated
     */
    public Adapter createDataTypeAdapter() {
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

} //TypeAdapterFactory
