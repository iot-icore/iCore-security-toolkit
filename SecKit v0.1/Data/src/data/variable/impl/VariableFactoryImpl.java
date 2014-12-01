/**
 */
package data.variable.impl;

import data.variable.*;

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
            case VariablePackage.DATA_TYPE_VARIABLE: return createDataTypeVariable();
            case VariablePackage.DATA_INSTANTIATION_VARIABLE: return createDataInstantiationVariable();
            case VariablePackage.DATA_INSTANCE_VARIABLE: return createDataInstanceVariable();
            case VariablePackage.DATA_INSTANCE_ASSIGNMENT: return createDataInstanceAssignment();
            case VariablePackage.DATA_INSTANTIATION_ASSIGNMENT: return createDataInstantiationAssignment();
            case VariablePackage.DATA_TYPE_ASSIGNMENT: return createDataTypeAssignment();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataTypeVariable createDataTypeVariable() {
        DataTypeVariableImpl dataTypeVariable = new DataTypeVariableImpl();
        return dataTypeVariable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataInstantiationVariable createDataInstantiationVariable() {
        DataInstantiationVariableImpl dataInstantiationVariable = new DataInstantiationVariableImpl();
        return dataInstantiationVariable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataInstanceVariable createDataInstanceVariable() {
        DataInstanceVariableImpl dataInstanceVariable = new DataInstanceVariableImpl();
        return dataInstanceVariable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataInstanceAssignment createDataInstanceAssignment() {
        DataInstanceAssignmentImpl dataInstanceAssignment = new DataInstanceAssignmentImpl();
        return dataInstanceAssignment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataInstantiationAssignment createDataInstantiationAssignment() {
        DataInstantiationAssignmentImpl dataInstantiationAssignment = new DataInstantiationAssignmentImpl();
        return dataInstantiationAssignment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataTypeAssignment createDataTypeAssignment() {
        DataTypeAssignmentImpl dataTypeAssignment = new DataTypeAssignmentImpl();
        return dataTypeAssignment;
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
