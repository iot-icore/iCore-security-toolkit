/**
 */
package models.util;

import models.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see models.ModelsPackage
 * @generated
 */
public class ModelsAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ModelsPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelsAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = ModelsPackage.eINSTANCE;
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
    protected ModelsSwitch<Adapter> modelSwitch =
        new ModelsSwitch<Adapter>() {
            @Override
            public Adapter caseMultiplicity(Multiplicity object) {
                return createMultiplicityAdapter();
            }
            @Override
            public Adapter caseInstantiationHierarchy(InstantiationHierarchy object) {
                return createInstantiationHierarchyAdapter();
            }
            @Override
            public Adapter caseModel(Model object) {
                return createModelAdapter();
            }
            @Override
            public Adapter caseInstantiationReference(InstantiationReference object) {
                return createInstantiationReferenceAdapter();
            }
            @Override
            public Adapter caseElement(Element object) {
                return createElementAdapter();
            }
            @Override
            public Adapter caseInstanceHiearchy(InstanceHiearchy object) {
                return createInstanceHiearchyAdapter();
            }
            @Override
            public Adapter caseHiearchy(Hiearchy object) {
                return createHiearchyAdapter();
            }
            @Override
            public Adapter caseReference(Reference object) {
                return createReferenceAdapter();
            }
            @Override
            public Adapter caseMonetaryAmount(MonetaryAmount object) {
                return createMonetaryAmountAdapter();
            }
            @Override
            public Adapter caseCurrency(Currency object) {
                return createCurrencyAdapter();
            }
            @Override
            public Adapter caseQuality(Quality object) {
                return createQualityAdapter();
            }
            @Override
            public Adapter casePattern(Pattern object) {
                return createPatternAdapter();
            }
            @Override
            public Adapter caseShape(Shape object) {
                return createShapeAdapter();
            }
            @Override
            public Adapter caseDiagram(Diagram object) {
                return createDiagramAdapter();
            }
            @Override
            public Adapter caseVisualElement(VisualElement object) {
                return createVisualElementAdapter();
            }
            @Override
            public Adapter caseTreeNode(TreeNode object) {
                return createTreeNodeAdapter();
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
     * Creates a new adapter for an object of class '{@link models.Multiplicity <em>Multiplicity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.Multiplicity
     * @generated
     */
    public Adapter createMultiplicityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link models.InstantiationHierarchy <em>Instantiation Hierarchy</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.InstantiationHierarchy
     * @generated
     */
    public Adapter createInstantiationHierarchyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link models.Model <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.Model
     * @generated
     */
    public Adapter createModelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link models.InstantiationReference <em>Instantiation Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.InstantiationReference
     * @generated
     */
    public Adapter createInstantiationReferenceAdapter() {
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
     * Creates a new adapter for an object of class '{@link models.InstanceHiearchy <em>Instance Hiearchy</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.InstanceHiearchy
     * @generated
     */
    public Adapter createInstanceHiearchyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link models.Hiearchy <em>Hiearchy</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.Hiearchy
     * @generated
     */
    public Adapter createHiearchyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link models.Reference <em>Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.Reference
     * @generated
     */
    public Adapter createReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link models.MonetaryAmount <em>Monetary Amount</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.MonetaryAmount
     * @generated
     */
    public Adapter createMonetaryAmountAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link models.Currency <em>Currency</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.Currency
     * @generated
     */
    public Adapter createCurrencyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link models.Quality <em>Quality</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.Quality
     * @generated
     */
    public Adapter createQualityAdapter() {
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
     * Creates a new adapter for an object of class '{@link models.Shape <em>Shape</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.Shape
     * @generated
     */
    public Adapter createShapeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link models.Diagram <em>Diagram</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.Diagram
     * @generated
     */
    public Adapter createDiagramAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link models.VisualElement <em>Visual Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.VisualElement
     * @generated
     */
    public Adapter createVisualElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link models.TreeNode <em>Tree Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.TreeNode
     * @generated
     */
    public Adapter createTreeNodeAdapter() {
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

} //ModelsAdapterFactory
