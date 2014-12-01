/**
 */
package models.util;

import models.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see models.ModelsPackage
 * @generated
 */
public class ModelsSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ModelsPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelsSwitch() {
        if (modelPackage == null) {
            modelPackage = ModelsPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case ModelsPackage.MULTIPLICITY: {
                Multiplicity multiplicity = (Multiplicity)theEObject;
                T result = caseMultiplicity(multiplicity);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelsPackage.INSTANTIATION_HIERARCHY: {
                InstantiationHierarchy instantiationHierarchy = (InstantiationHierarchy)theEObject;
                T result = caseInstantiationHierarchy(instantiationHierarchy);
                if (result == null) result = caseHiearchy(instantiationHierarchy);
                if (result == null) result = caseElement(instantiationHierarchy);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelsPackage.MODEL: {
                Model model = (Model)theEObject;
                T result = caseModel(model);
                if (result == null) result = caseElement(model);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelsPackage.INSTANTIATION_REFERENCE: {
                InstantiationReference instantiationReference = (InstantiationReference)theEObject;
                T result = caseInstantiationReference(instantiationReference);
                if (result == null) result = caseReference(instantiationReference);
                if (result == null) result = caseElement(instantiationReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelsPackage.ELEMENT: {
                Element element = (Element)theEObject;
                T result = caseElement(element);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelsPackage.INSTANCE_HIEARCHY: {
                InstanceHiearchy instanceHiearchy = (InstanceHiearchy)theEObject;
                T result = caseInstanceHiearchy(instanceHiearchy);
                if (result == null) result = caseHiearchy(instanceHiearchy);
                if (result == null) result = caseElement(instanceHiearchy);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelsPackage.HIEARCHY: {
                Hiearchy hiearchy = (Hiearchy)theEObject;
                T result = caseHiearchy(hiearchy);
                if (result == null) result = caseElement(hiearchy);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelsPackage.REFERENCE: {
                Reference reference = (Reference)theEObject;
                T result = caseReference(reference);
                if (result == null) result = caseElement(reference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelsPackage.MONETARY_AMOUNT: {
                MonetaryAmount monetaryAmount = (MonetaryAmount)theEObject;
                T result = caseMonetaryAmount(monetaryAmount);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelsPackage.CURRENCY: {
                Currency currency = (Currency)theEObject;
                T result = caseCurrency(currency);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelsPackage.QUALITY: {
                Quality quality = (Quality)theEObject;
                T result = caseQuality(quality);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelsPackage.PATTERN: {
                Pattern pattern = (Pattern)theEObject;
                T result = casePattern(pattern);
                if (result == null) result = caseElement(pattern);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelsPackage.SHAPE: {
                Shape shape = (Shape)theEObject;
                T result = caseShape(shape);
                if (result == null) result = caseVisualElement(shape);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelsPackage.DIAGRAM: {
                Diagram diagram = (Diagram)theEObject;
                T result = caseDiagram(diagram);
                if (result == null) result = caseVisualElement(diagram);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelsPackage.VISUAL_ELEMENT: {
                VisualElement visualElement = (VisualElement)theEObject;
                T result = caseVisualElement(visualElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelsPackage.TREE_NODE: {
                TreeNode treeNode = (TreeNode)theEObject;
                T result = caseTreeNode(treeNode);
                if (result == null) result = caseVisualElement(treeNode);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Multiplicity</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Multiplicity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMultiplicity(Multiplicity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Instantiation Hierarchy</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Instantiation Hierarchy</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInstantiationHierarchy(InstantiationHierarchy object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Model</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModel(Model object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Instantiation Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Instantiation Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInstantiationReference(InstantiationReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseElement(Element object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Instance Hiearchy</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Instance Hiearchy</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInstanceHiearchy(InstanceHiearchy object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Hiearchy</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Hiearchy</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHiearchy(Hiearchy object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReference(Reference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Monetary Amount</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Monetary Amount</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMonetaryAmount(MonetaryAmount object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Currency</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Currency</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCurrency(Currency object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Quality</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Quality</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseQuality(Quality object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pattern</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pattern</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePattern(Pattern object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Shape</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Shape</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseShape(Shape object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Diagram</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Diagram</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiagram(Diagram object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Visual Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Visual Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVisualElement(VisualElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Tree Node</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Tree Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTreeNode(TreeNode object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //ModelsSwitch
