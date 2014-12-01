/**
 */
package identity.instance.util;

import data.instance.AbstractDataInstance;
import data.instance.Addressable;
import data.instance.Data;

import identity.instance.*;

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
 * @see identity.instance.InstancePackage
 * @generated
 */
public class InstanceSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static InstancePackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InstanceSwitch() {
        if (modelPackage == null) {
            modelPackage = InstancePackage.eINSTANCE;
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
            case InstancePackage.ABSTRACT_IDENTITY: {
                AbstractIdentity abstractIdentity = (AbstractIdentity)theEObject;
                T result = caseAbstractIdentity(abstractIdentity);
                if (result == null) result = caseElement(abstractIdentity);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstancePackage.DIGITAL_IDENTITY: {
                DigitalIdentity digitalIdentity = (DigitalIdentity)theEObject;
                T result = caseDigitalIdentity(digitalIdentity);
                if (result == null) result = caseSelfSignedIdentity(digitalIdentity);
                if (result == null) result = caseAbstractIdentity(digitalIdentity);
                if (result == null) result = caseElement(digitalIdentity);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstancePackage.IDENTITY_ATTRIBUTE: {
                IdentityAttribute identityAttribute = (IdentityAttribute)theEObject;
                T result = caseIdentityAttribute(identityAttribute);
                if (result == null) result = caseData(identityAttribute);
                if (result == null) result = caseAbstractDataInstance(identityAttribute);
                if (result == null) result = caseAddressable(identityAttribute);
                if (result == null) result = caseElement(identityAttribute);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstancePackage.IDENTITY_REALM: {
                IdentityRealm identityRealm = (IdentityRealm)theEObject;
                T result = caseIdentityRealm(identityRealm);
                if (result == null) result = caseElement(identityRealm);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstancePackage.SELF_SIGNED_IDENTITY: {
                SelfSignedIdentity selfSignedIdentity = (SelfSignedIdentity)theEObject;
                T result = caseSelfSignedIdentity(selfSignedIdentity);
                if (result == null) result = caseAbstractIdentity(selfSignedIdentity);
                if (result == null) result = caseElement(selfSignedIdentity);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstancePackage.IDENTITY_FEDERATION: {
                IdentityFederation identityFederation = (IdentityFederation)theEObject;
                T result = caseIdentityFederation(identityFederation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case InstancePackage.IDENTITY_OWNER: {
                IdentityOwner identityOwner = (IdentityOwner)theEObject;
                T result = caseIdentityOwner(identityOwner);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Identity</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Identity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractIdentity(AbstractIdentity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Digital Identity</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Digital Identity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDigitalIdentity(DigitalIdentity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identity Attribute</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identity Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentityAttribute(IdentityAttribute object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identity Realm</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identity Realm</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentityRealm(IdentityRealm object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Self Signed Identity</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Self Signed Identity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSelfSignedIdentity(SelfSignedIdentity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identity Federation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identity Federation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentityFederation(IdentityFederation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identity Owner</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identity Owner</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentityOwner(IdentityOwner object) {
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

} //InstanceSwitch
