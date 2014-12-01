/**
 */
package data.instantiation.util;

import data.instantiation.*;

import models.Element;
import models.Hiearchy;
import models.InstantiationHierarchy;
import models.InstantiationReference;
import models.Reference;

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
 * @see data.instantiation.InstantiationPackage
 * @generated
 */
public class InstantiationSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static InstantiationPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InstantiationSwitch() {
        if (modelPackage == null) {
            modelPackage = InstantiationPackage.eINSTANCE;
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
            case InstantiationPackage.ADDRESS_INSTANTIATION: {
                AddressInstantiation addressInstantiation = (AddressInstantiation)theEObject;
                T result = caseAddressInstantiation(addressInstantiation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.DATA_INSTANTIATION: {
                DataInstantiation dataInstantiation = (DataInstantiation)theEObject;
                T result = caseDataInstantiation(dataInstantiation);
                if (result == null) result = caseAbstractDataInstantiation(dataInstantiation);
                if (result == null) result = caseElement(dataInstantiation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.ABSTRACT_DATA_INSTANTIATION: {
                AbstractDataInstantiation abstractDataInstantiation = (AbstractDataInstantiation)theEObject;
                T result = caseAbstractDataInstantiation(abstractDataInstantiation);
                if (result == null) result = caseElement(abstractDataInstantiation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.DATA_INSTANTIATION_HIERARCHY: {
                DataInstantiationHierarchy dataInstantiationHierarchy = (DataInstantiationHierarchy)theEObject;
                T result = caseDataInstantiationHierarchy(dataInstantiationHierarchy);
                if (result == null) result = caseInstantiationHierarchy(dataInstantiationHierarchy);
                if (result == null) result = caseHiearchy(dataInstantiationHierarchy);
                if (result == null) result = caseElement(dataInstantiationHierarchy);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.DATA_INSTANTIATION_REFERENCE: {
                DataInstantiationReference dataInstantiationReference = (DataInstantiationReference)theEObject;
                T result = caseDataInstantiationReference(dataInstantiationReference);
                if (result == null) result = caseInstantiationReference(dataInstantiationReference);
                if (result == null) result = caseReference(dataInstantiationReference);
                if (result == null) result = caseElement(dataInstantiationReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstantiationPackage.ADDRESS_SPACE_INSTANTIATION: {
                AddressSpaceInstantiation addressSpaceInstantiation = (AddressSpaceInstantiation)theEObject;
                T result = caseAddressSpaceInstantiation(addressSpaceInstantiation);
                if (result == null) result = caseElement(addressSpaceInstantiation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Address Instantiation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Address Instantiation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAddressInstantiation(AddressInstantiation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Instantiation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Instantiation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataInstantiation(DataInstantiation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Data Instantiation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Data Instantiation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractDataInstantiation(AbstractDataInstantiation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Instantiation Hierarchy</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Instantiation Hierarchy</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataInstantiationHierarchy(DataInstantiationHierarchy object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Instantiation Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Instantiation Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataInstantiationReference(DataInstantiationReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Address Space Instantiation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Address Space Instantiation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAddressSpaceInstantiation(AddressSpaceInstantiation object) {
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

} //InstantiationSwitch
