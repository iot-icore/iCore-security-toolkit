/**
 */
package models.variable.impl;

import models.variable.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VariableFactoryImpl extends EFactoryImpl implements VariableFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static VariableFactory init() {
        try {
            VariableFactory theVariableFactory = (VariableFactory)EPackage.Registry.INSTANCE.getEFactory(VariablePackage.eNS_URI);
            if (theVariableFactory != null) {
                return theVariableFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new VariableFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VariableFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case VariablePackage.REFERENCE_VARIABLE_ASSIGNMENT: return createReferenceVariableAssignment();
            case VariablePackage.XPATH_VARIABLE_ASSIGNMENT: return createXPathVariableAssignment();
            case VariablePackage.STRING_ASSIGNMENT: return createStringAssignment();
            case VariablePackage.REG_EXP_VARIABLE_ASSIGNMENT: return createRegExpVariableAssignment();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReferenceVariableAssignment createReferenceVariableAssignment() {
        ReferenceVariableAssignmentImpl referenceVariableAssignment = new ReferenceVariableAssignmentImpl();
        return referenceVariableAssignment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XPathVariableAssignment createXPathVariableAssignment() {
        XPathVariableAssignmentImpl xPathVariableAssignment = new XPathVariableAssignmentImpl();
        return xPathVariableAssignment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StringAssignment createStringAssignment() {
        StringAssignmentImpl stringAssignment = new StringAssignmentImpl();
        return stringAssignment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RegExpVariableAssignment createRegExpVariableAssignment() {
        RegExpVariableAssignmentImpl regExpVariableAssignment = new RegExpVariableAssignmentImpl();
        return regExpVariableAssignment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VariablePackage getVariablePackage() {
        return (VariablePackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static VariablePackage getPackage() {
        return VariablePackage.eINSTANCE;
    }

} //VariableFactoryImpl
