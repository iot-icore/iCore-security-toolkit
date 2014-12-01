/**
 */
package seckit.util;

import models.Element;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import seckit.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see seckit.SeckitPackage
 * @generated
 */
public class SeckitAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static SeckitPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SeckitAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = SeckitPackage.eINSTANCE;
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
    protected SeckitSwitch<Adapter> modelSwitch =
        new SeckitSwitch<Adapter>() {
            @Override
            public Adapter caseSystemDesignViewpoint(SystemDesignViewpoint object) {
                return createSystemDesignViewpointAdapter();
            }
            @Override
            public Adapter caseSystemRuntimeViewpoint(SystemRuntimeViewpoint object) {
                return createSystemRuntimeViewpointAdapter();
            }
            @Override
            public Adapter caseSystemViewpoint(SystemViewpoint object) {
                return createSystemViewpointAdapter();
            }
            @Override
            public Adapter caseSystemViewpoints(SystemViewpoints object) {
                return createSystemViewpointsAdapter();
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
     * Creates a new adapter for an object of class '{@link seckit.SystemDesignViewpoint <em>System Design Viewpoint</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see seckit.SystemDesignViewpoint
     * @generated
     */
    public Adapter createSystemDesignViewpointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link seckit.SystemRuntimeViewpoint <em>System Runtime Viewpoint</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see seckit.SystemRuntimeViewpoint
     * @generated
     */
    public Adapter createSystemRuntimeViewpointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link seckit.SystemViewpoint <em>System Viewpoint</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see seckit.SystemViewpoint
     * @generated
     */
    public Adapter createSystemViewpointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link seckit.SystemViewpoints <em>System Viewpoints</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see seckit.SystemViewpoints
     * @generated
     */
    public Adapter createSystemViewpointsAdapter() {
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

} //SeckitAdapterFactory
