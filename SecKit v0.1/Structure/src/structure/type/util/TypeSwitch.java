/**
 */
package structure.type.util;

import models.Element;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import structure.type.*;

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
 * @see structure.type.TypePackage
 * @generated
 */
public class TypeSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static TypePackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeSwitch() {
        if (modelPackage == null) {
            modelPackage = TypePackage.eINSTANCE;
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
            case TypePackage.LOCATION_TYPE: {
                LocationType locationType = (LocationType)theEObject;
                T result = caseLocationType(locationType);
                if (result == null) result = caseElement(locationType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.INTERACTION_POINT_PARTICIPATION_TYPE: {
                InteractionPointParticipationType interactionPointParticipationType = (InteractionPointParticipationType)theEObject;
                T result = caseInteractionPointParticipationType(interactionPointParticipationType);
                if (result == null) result = caseElement(interactionPointParticipationType);
                if (result == null) result = caseLocalizableType(interactionPointParticipationType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.ACTION_POINT_TYPE: {
                ActionPointType actionPointType = (ActionPointType)theEObject;
                T result = caseActionPointType(actionPointType);
                if (result == null) result = caseActivityPointType(actionPointType);
                if (result == null) result = caseLocalizableType(actionPointType);
                if (result == null) result = caseElement(actionPointType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.INTERACTION_POINT_TYPE: {
                InteractionPointType interactionPointType = (InteractionPointType)theEObject;
                T result = caseInteractionPointType(interactionPointType);
                if (result == null) result = caseActivityPointType(interactionPointType);
                if (result == null) result = caseElement(interactionPointType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.ENTITY_TYPE_PACKAGE: {
                EntityTypePackage entityTypePackage = (EntityTypePackage)theEObject;
                T result = caseEntityTypePackage(entityTypePackage);
                if (result == null) result = caseElement(entityTypePackage);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.ENTITY_TYPE: {
                EntityType entityType = (EntityType)theEObject;
                T result = caseEntityType(entityType);
                if (result == null) result = caseElement(entityType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.ACTIVITY_POINT_TYPE: {
                ActivityPointType activityPointType = (ActivityPointType)theEObject;
                T result = caseActivityPointType(activityPointType);
                if (result == null) result = caseElement(activityPointType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.LOCALIZABLE_TYPE: {
                LocalizableType localizableType = (LocalizableType)theEObject;
                T result = caseLocalizableType(localizableType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Location Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Location Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLocationType(LocationType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interaction Point Participation Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interaction Point Participation Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInteractionPointParticipationType(InteractionPointParticipationType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Action Point Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Action Point Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActionPointType(ActionPointType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interaction Point Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interaction Point Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInteractionPointType(InteractionPointType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entity Type Package</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entity Type Package</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntityTypePackage(EntityTypePackage object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entity Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entity Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntityType(EntityType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Activity Point Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Activity Point Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActivityPointType(ActivityPointType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Localizable Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Localizable Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLocalizableType(LocalizableType object) {
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

} //TypeSwitch
