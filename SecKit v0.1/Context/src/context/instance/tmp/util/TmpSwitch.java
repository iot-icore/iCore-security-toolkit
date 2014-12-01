/**
 */
package context.instance.tmp.util;

import context.instance.Context;
import context.instance.ContextSituation;

import context.instance.tmp.*;

import context.type.ContextInformationType;
import context.type.ContextSituationType;

import data.instance.AbstractDataInstance;
import data.instance.Addressable;
import data.instance.Data;

import data.type.DataType;

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
 * @see context.instance.tmp.TmpPackage
 * @generated
 */
public class TmpSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static TmpPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TmpSwitch() {
        if (modelPackage == null) {
            modelPackage = TmpPackage.eINSTANCE;
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
            case TmpPackage.TEMPERATURE_MEASUREMENT: {
                TemperatureMeasurement temperatureMeasurement = (TemperatureMeasurement)theEObject;
                T result = caseTemperatureMeasurement(temperatureMeasurement);
                if (result == null) result = caseContext(temperatureMeasurement);
                if (result == null) result = caseData(temperatureMeasurement);
                if (result == null) result = caseAbstractDataInstance(temperatureMeasurement);
                if (result == null) result = caseAddressable(temperatureMeasurement);
                if (result == null) result = caseElement(temperatureMeasurement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TmpPackage.NEARBY_MEASUREMENT: {
                NearbyMeasurement nearbyMeasurement = (NearbyMeasurement)theEObject;
                T result = caseNearbyMeasurement(nearbyMeasurement);
                if (result == null) result = caseContextSituation(nearbyMeasurement);
                if (result == null) result = caseElement(nearbyMeasurement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TmpPackage.EVENT_PRECISION: {
                EventPrecision eventPrecision = (EventPrecision)theEObject;
                T result = caseEventPrecision(eventPrecision);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TmpPackage.MATERIAL_RELATION_CONTEXT: {
                MaterialRelationContext materialRelationContext = (MaterialRelationContext)theEObject;
                T result = caseMaterialRelationContext(materialRelationContext);
                if (result == null) result = caseContextInformationType(materialRelationContext);
                if (result == null) result = caseDataType(materialRelationContext);
                if (result == null) result = caseElement(materialRelationContext);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TmpPackage.INTRINSIC_SITUATIONS: {
                IntrinsicSituations intrinsicSituations = (IntrinsicSituations)theEObject;
                T result = caseIntrinsicSituations(intrinsicSituations);
                if (result == null) result = caseContextSituationType(intrinsicSituations);
                if (result == null) result = caseElement(intrinsicSituations);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TmpPackage.RELATIONAL_SITUATION: {
                RelationalSituation relationalSituation = (RelationalSituation)theEObject;
                T result = caseRelationalSituation(relationalSituation);
                if (result == null) result = caseMaterialRelationContext(relationalSituation);
                if (result == null) result = caseContextInformationType(relationalSituation);
                if (result == null) result = caseDataType(relationalSituation);
                if (result == null) result = caseElement(relationalSituation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TmpPackage.FRIENDSHIP: {
                Friendship friendship = (Friendship)theEObject;
                T result = caseFriendship(friendship);
                if (result == null) result = caseRelationalSituation(friendship);
                if (result == null) result = caseMaterialRelationContext(friendship);
                if (result == null) result = caseContextInformationType(friendship);
                if (result == null) result = caseDataType(friendship);
                if (result == null) result = caseElement(friendship);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TmpPackage.FORMAL_RELATION_SITUATION: {
                FormalRelationSituation formalRelationSituation = (FormalRelationSituation)theEObject;
                T result = caseFormalRelationSituation(formalRelationSituation);
                if (result == null) result = caseContextSituationType(formalRelationSituation);
                if (result == null) result = caseElement(formalRelationSituation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TmpPackage.SITUATION_OF_SITUATIONS: {
                SituationOfSituations situationOfSituations = (SituationOfSituations)theEObject;
                T result = caseSituationOfSituations(situationOfSituations);
                if (result == null) result = caseContextSituationType(situationOfSituations);
                if (result == null) result = caseElement(situationOfSituations);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TmpPackage.RECURRENT_FEVER: {
                RecurrentFever recurrentFever = (RecurrentFever)theEObject;
                T result = caseRecurrentFever(recurrentFever);
                if (result == null) result = caseSituationOfSituations(recurrentFever);
                if (result == null) result = caseContextSituationType(recurrentFever);
                if (result == null) result = caseElement(recurrentFever);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TmpPackage.COMBINED_SITUATION: {
                CombinedSituation combinedSituation = (CombinedSituation)theEObject;
                T result = caseCombinedSituation(combinedSituation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TmpPackage.INTRINSIC_CONTEXT: {
                IntrinsicContext intrinsicContext = (IntrinsicContext)theEObject;
                T result = caseIntrinsicContext(intrinsicContext);
                if (result == null) result = caseContextInformationType(intrinsicContext);
                if (result == null) result = caseDataType(intrinsicContext);
                if (result == null) result = caseElement(intrinsicContext);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TmpPackage.FEVER: {
                Fever fever = (Fever)theEObject;
                T result = caseFever(fever);
                if (result == null) result = caseIntrinsicSituations(fever);
                if (result == null) result = caseContextSituationType(fever);
                if (result == null) result = caseElement(fever);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TmpPackage.AVAILABLE_DEVICES: {
                AvailableDevices availableDevices = (AvailableDevices)theEObject;
                T result = caseAvailableDevices(availableDevices);
                if (result == null) result = caseMaterialRelationContext(availableDevices);
                if (result == null) result = caseContextInformationType(availableDevices);
                if (result == null) result = caseDataType(availableDevices);
                if (result == null) result = caseElement(availableDevices);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TmpPackage.FORMAL_RELATION_CONTEXT: {
                FormalRelationContext formalRelationContext = (FormalRelationContext)theEObject;
                T result = caseFormalRelationContext(formalRelationContext);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Temperature Measurement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Temperature Measurement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTemperatureMeasurement(TemperatureMeasurement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Nearby Measurement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Nearby Measurement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNearbyMeasurement(NearbyMeasurement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Event Precision</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Event Precision</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEventPrecision(EventPrecision object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Material Relation Context</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Material Relation Context</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMaterialRelationContext(MaterialRelationContext object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Intrinsic Situations</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Intrinsic Situations</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIntrinsicSituations(IntrinsicSituations object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Relational Situation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Relational Situation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRelationalSituation(RelationalSituation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Friendship</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Friendship</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFriendship(Friendship object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Formal Relation Situation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Formal Relation Situation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFormalRelationSituation(FormalRelationSituation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Situation Of Situations</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Situation Of Situations</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSituationOfSituations(SituationOfSituations object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Recurrent Fever</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Recurrent Fever</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRecurrentFever(RecurrentFever object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Combined Situation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Combined Situation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCombinedSituation(CombinedSituation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Intrinsic Context</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Intrinsic Context</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIntrinsicContext(IntrinsicContext object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Fever</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Fever</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFever(Fever object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Available Devices</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Available Devices</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAvailableDevices(AvailableDevices object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Formal Relation Context</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Formal Relation Context</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFormalRelationContext(FormalRelationContext object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Abstract Data Instance</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Data Instance</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractDataInstance(AbstractDataInstance object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Addressable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Addressable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAddressable(Addressable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseData(Data object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Context</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseContext(Context object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Context Situation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Context Situation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseContextSituation(ContextSituation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataType(DataType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Context Information Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Context Information Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseContextInformationType(ContextInformationType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Context Situation Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Context Situation Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseContextSituationType(ContextSituationType object) {
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

} //TmpSwitch
