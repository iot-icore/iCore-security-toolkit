/**
 */
package context.instance.util;

import context.instance.*;

import data.instance.AbstractDataInstance;
import data.instance.Addressable;
import data.instance.Data;

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
 * @see context.instance.InstancePackage
 * @generated
 */
public class InstanceAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static InstancePackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InstanceAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = InstancePackage.eINSTANCE;
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
    protected InstanceSwitch<Adapter> modelSwitch =
        new InstanceSwitch<Adapter>() {
            @Override
            public Adapter caseContext(Context object) {
                return createContextAdapter();
            }
            @Override
            public Adapter caseContextSituation(ContextSituation object) {
                return createContextSituationAdapter();
            }
            @Override
            public Adapter caseEntityRole(EntityRole object) {
                return createEntityRoleAdapter();
            }
            @Override
            public Adapter caseNumericPrecision(NumericPrecision object) {
                return createNumericPrecisionAdapter();
            }
            @Override
            public Adapter caseQualityOfContext(QualityOfContext object) {
                return createQualityOfContextAdapter();
            }
            @Override
            public Adapter casePrecision(Precision object) {
                return createPrecisionAdapter();
            }
            @Override
            public Adapter caseElement(Element object) {
                return createElementAdapter();
            }
            @Override
            public Adapter caseAbstractDataInstance(AbstractDataInstance object) {
                return createAbstractDataInstanceAdapter();
            }
            @Override
            public Adapter caseAddressable(Addressable object) {
                return createAddressableAdapter();
            }
            @Override
            public Adapter caseData(Data object) {
                return createDataAdapter();
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
     * Creates a new adapter for an object of class '{@link context.instance.Context <em>Context</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.instance.Context
     * @generated
     */
    public Adapter createContextAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link context.instance.ContextSituation <em>Context Situation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.instance.ContextSituation
     * @generated
     */
    public Adapter createContextSituationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link context.instance.EntityRole <em>Entity Role</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.instance.EntityRole
     * @generated
     */
    public Adapter createEntityRoleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link context.instance.NumericPrecision <em>Numeric Precision</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.instance.NumericPrecision
     * @generated
     */
    public Adapter createNumericPrecisionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link context.instance.QualityOfContext <em>Quality Of Context</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.instance.QualityOfContext
     * @generated
     */
    public Adapter createQualityOfContextAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link context.instance.Precision <em>Precision</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see context.instance.Precision
     * @generated
     */
    public Adapter createPrecisionAdapter() {
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
     * Creates a new adapter for an object of class '{@link data.instance.AbstractDataInstance <em>Abstract Data Instance</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.instance.AbstractDataInstance
     * @generated
     */
    public Adapter createAbstractDataInstanceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.instance.Addressable <em>Addressable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.instance.Addressable
     * @generated
     */
    public Adapter createAddressableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link data.instance.Data <em>Data</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see data.instance.Data
     * @generated
     */
    public Adapter createDataAdapter() {
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

} //InstanceAdapterFactory
