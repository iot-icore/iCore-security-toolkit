/**
 */
package behavior.constraint.impl;

import behavior.constraint.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class ConstraintFactoryImpl extends EFactoryImpl implements ConstraintFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ConstraintFactory init() {
        try {
            ConstraintFactory theConstraintFactory = (ConstraintFactory)EPackage.Registry.INSTANCE.getEFactory(ConstraintPackage.eNS_URI);
            if (theConstraintFactory != null) {
                return theConstraintFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ConstraintFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConstraintFactoryImpl() {
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
            case ConstraintPackage.REFERENCE_DATA_ESTABLISHMENT: return createReferenceDataEstablishment();
            case ConstraintPackage.DATA_ESTABLISHMENT: return createDataEstablishment();
            case ConstraintPackage.STATIC_DATA_ESTABLISHMENT: return createStaticDataEstablishment();
            case ConstraintPackage.DATA_ESTABLISHMENT_FROM_VARIABLE: return createDataEstablishmentFromVariable();
            case ConstraintPackage.IDENTITY_ESTABLISHMENT: return createIdentityEstablishment();
            case ConstraintPackage.IDENTITY_ESTABLISHMENT_FROM_VARIABLE: return createIdentityEstablishmentFromVariable();
            case ConstraintPackage.REFERENCE_IDENTITY_ESTABLISHMENT: return createReferenceIdentityEstablishment();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case ConstraintPackage.CONSTRAINT_TYPE:
                return createConstraintTypeFromString(eDataType, initialValue);
            case ConstraintPackage.ATTRIBUTE_VALUE_ESTABLISHMENT_TYPES:
                return createAttributeValueEstablishmentTypesFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case ConstraintPackage.CONSTRAINT_TYPE:
                return convertConstraintTypeToString(eDataType, instanceValue);
            case ConstraintPackage.ATTRIBUTE_VALUE_ESTABLISHMENT_TYPES:
                return convertAttributeValueEstablishmentTypesToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReferenceDataEstablishment createReferenceDataEstablishment() {
        ReferenceDataEstablishmentImpl referenceDataEstablishment = new ReferenceDataEstablishmentImpl();
        return referenceDataEstablishment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataEstablishment createDataEstablishment() {
        DataEstablishmentImpl dataEstablishment = new DataEstablishmentImpl();
        return dataEstablishment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StaticDataEstablishment createStaticDataEstablishment() {
        StaticDataEstablishmentImpl staticDataEstablishment = new StaticDataEstablishmentImpl();
        return staticDataEstablishment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataEstablishmentFromVariable createDataEstablishmentFromVariable() {
        DataEstablishmentFromVariableImpl dataEstablishmentFromVariable = new DataEstablishmentFromVariableImpl();
        return dataEstablishmentFromVariable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityEstablishment createIdentityEstablishment() {
        IdentityEstablishmentImpl identityEstablishment = new IdentityEstablishmentImpl();
        return identityEstablishment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityEstablishmentFromVariable createIdentityEstablishmentFromVariable() {
        IdentityEstablishmentFromVariableImpl identityEstablishmentFromVariable = new IdentityEstablishmentFromVariableImpl();
        return identityEstablishmentFromVariable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReferenceIdentityEstablishment createReferenceIdentityEstablishment() {
        ReferenceIdentityEstablishmentImpl referenceIdentityEstablishment = new ReferenceIdentityEstablishmentImpl();
        return referenceIdentityEstablishment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConstraintType createConstraintTypeFromString(EDataType eDataType, String initialValue) {
        ConstraintType result = ConstraintType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertConstraintTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeValueEstablishmentTypes createAttributeValueEstablishmentTypesFromString(EDataType eDataType, String initialValue) {
        AttributeValueEstablishmentTypes result = AttributeValueEstablishmentTypes.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAttributeValueEstablishmentTypesToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConstraintPackage getConstraintPackage() {
        return (ConstraintPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ConstraintPackage getPackage() {
        return ConstraintPackage.eINSTANCE;
    }

} //ConstraintFactoryImpl
