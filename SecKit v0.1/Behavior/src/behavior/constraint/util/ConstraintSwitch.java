/**
 */
package behavior.constraint.util;

import behavior.constraint.*;

import models.Element;

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
 * @see behavior.constraint.ConstraintPackage
 * @generated
 */
public class ConstraintSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ConstraintPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConstraintSwitch() {
        if (modelPackage == null) {
            modelPackage = ConstraintPackage.eINSTANCE;
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
            case ConstraintPackage.DATA_CONSTRAINT: {
                DataConstraint dataConstraint = (DataConstraint)theEObject;
                T result = caseDataConstraint(dataConstraint);
                if (result == null) result = caseConstraint(dataConstraint);
                if (result == null) result = caseElement(dataConstraint);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ConstraintPackage.REFERENCE_DATA_ESTABLISHMENT: {
                ReferenceDataEstablishment referenceDataEstablishment = (ReferenceDataEstablishment)theEObject;
                T result = caseReferenceDataEstablishment(referenceDataEstablishment);
                if (result == null) result = caseDataEstablishment(referenceDataEstablishment);
                if (result == null) result = caseDataConstraint(referenceDataEstablishment);
                if (result == null) result = caseConstraint(referenceDataEstablishment);
                if (result == null) result = caseElement(referenceDataEstablishment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ConstraintPackage.DATA_ESTABLISHMENT: {
                DataEstablishment dataEstablishment = (DataEstablishment)theEObject;
                T result = caseDataEstablishment(dataEstablishment);
                if (result == null) result = caseDataConstraint(dataEstablishment);
                if (result == null) result = caseConstraint(dataEstablishment);
                if (result == null) result = caseElement(dataEstablishment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ConstraintPackage.VALUE_CHECKING_CONSTRAINT: {
                ValueCheckingConstraint valueCheckingConstraint = (ValueCheckingConstraint)theEObject;
                T result = caseValueCheckingConstraint(valueCheckingConstraint);
                if (result == null) result = caseDataConstraint(valueCheckingConstraint);
                if (result == null) result = caseConstraint(valueCheckingConstraint);
                if (result == null) result = caseElement(valueCheckingConstraint);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ConstraintPackage.RANGE_OF_VALUES: {
                RangeOfValues rangeOfValues = (RangeOfValues)theEObject;
                T result = caseRangeOfValues(rangeOfValues);
                if (result == null) result = caseValueCheckingConstraint(rangeOfValues);
                if (result == null) result = caseDataConstraint(rangeOfValues);
                if (result == null) result = caseConstraint(rangeOfValues);
                if (result == null) result = caseElement(rangeOfValues);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ConstraintPackage.SET_OF_VALUES: {
                SetOfValues setOfValues = (SetOfValues)theEObject;
                T result = caseSetOfValues(setOfValues);
                if (result == null) result = caseValueCheckingConstraint(setOfValues);
                if (result == null) result = caseDataConstraint(setOfValues);
                if (result == null) result = caseConstraint(setOfValues);
                if (result == null) result = caseElement(setOfValues);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ConstraintPackage.STATIC_DATA_ESTABLISHMENT: {
                StaticDataEstablishment staticDataEstablishment = (StaticDataEstablishment)theEObject;
                T result = caseStaticDataEstablishment(staticDataEstablishment);
                if (result == null) result = caseDataEstablishment(staticDataEstablishment);
                if (result == null) result = caseDataConstraint(staticDataEstablishment);
                if (result == null) result = caseConstraint(staticDataEstablishment);
                if (result == null) result = caseElement(staticDataEstablishment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ConstraintPackage.DATA_ESTABLISHMENT_FROM_VARIABLE: {
                DataEstablishmentFromVariable dataEstablishmentFromVariable = (DataEstablishmentFromVariable)theEObject;
                T result = caseDataEstablishmentFromVariable(dataEstablishmentFromVariable);
                if (result == null) result = caseDataEstablishment(dataEstablishmentFromVariable);
                if (result == null) result = caseVariableEstablishment(dataEstablishmentFromVariable);
                if (result == null) result = caseDataConstraint(dataEstablishmentFromVariable);
                if (result == null) result = caseConstraint(dataEstablishmentFromVariable);
                if (result == null) result = caseElement(dataEstablishmentFromVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ConstraintPackage.IDENTITY_CONSTRAINT: {
                IdentityConstraint identityConstraint = (IdentityConstraint)theEObject;
                T result = caseIdentityConstraint(identityConstraint);
                if (result == null) result = caseConstraint(identityConstraint);
                if (result == null) result = caseElement(identityConstraint);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ConstraintPackage.IDENTITY_ESTABLISHMENT: {
                IdentityEstablishment identityEstablishment = (IdentityEstablishment)theEObject;
                T result = caseIdentityEstablishment(identityEstablishment);
                if (result == null) result = caseIdentityConstraint(identityEstablishment);
                if (result == null) result = caseConstraint(identityEstablishment);
                if (result == null) result = caseElement(identityEstablishment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ConstraintPackage.CONSTRAINT: {
                Constraint constraint = (Constraint)theEObject;
                T result = caseConstraint(constraint);
                if (result == null) result = caseElement(constraint);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ConstraintPackage.IDENTITY_ESTABLISHMENT_FROM_VARIABLE: {
                IdentityEstablishmentFromVariable identityEstablishmentFromVariable = (IdentityEstablishmentFromVariable)theEObject;
                T result = caseIdentityEstablishmentFromVariable(identityEstablishmentFromVariable);
                if (result == null) result = caseIdentityEstablishment(identityEstablishmentFromVariable);
                if (result == null) result = caseVariableEstablishment(identityEstablishmentFromVariable);
                if (result == null) result = caseIdentityConstraint(identityEstablishmentFromVariable);
                if (result == null) result = caseConstraint(identityEstablishmentFromVariable);
                if (result == null) result = caseElement(identityEstablishmentFromVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ConstraintPackage.VARIABLE_ESTABLISHMENT: {
                VariableEstablishment variableEstablishment = (VariableEstablishment)theEObject;
                T result = caseVariableEstablishment(variableEstablishment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ConstraintPackage.REFERENCE_IDENTITY_ESTABLISHMENT: {
                ReferenceIdentityEstablishment referenceIdentityEstablishment = (ReferenceIdentityEstablishment)theEObject;
                T result = caseReferenceIdentityEstablishment(referenceIdentityEstablishment);
                if (result == null) result = caseIdentityEstablishment(referenceIdentityEstablishment);
                if (result == null) result = caseIdentityConstraint(referenceIdentityEstablishment);
                if (result == null) result = caseConstraint(referenceIdentityEstablishment);
                if (result == null) result = caseElement(referenceIdentityEstablishment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Constraint</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Constraint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataConstraint(DataConstraint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Reference Data Establishment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Reference Data Establishment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReferenceDataEstablishment(ReferenceDataEstablishment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Establishment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Establishment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataEstablishment(DataEstablishment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Value Checking Constraint</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Value Checking Constraint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseValueCheckingConstraint(ValueCheckingConstraint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Range Of Values</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Range Of Values</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRangeOfValues(RangeOfValues object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Set Of Values</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Set Of Values</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSetOfValues(SetOfValues object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Static Data Establishment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Static Data Establishment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStaticDataEstablishment(StaticDataEstablishment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Establishment From Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Establishment From Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataEstablishmentFromVariable(DataEstablishmentFromVariable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identity Constraint</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identity Constraint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentityConstraint(IdentityConstraint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identity Establishment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identity Establishment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentityEstablishment(IdentityEstablishment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConstraint(Constraint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identity Establishment From Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identity Establishment From Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentityEstablishmentFromVariable(IdentityEstablishmentFromVariable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Variable Establishment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Variable Establishment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVariableEstablishment(VariableEstablishment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Reference Identity Establishment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Reference Identity Establishment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReferenceIdentityEstablishment(ReferenceIdentityEstablishment object) {
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

} //ConstraintSwitch
