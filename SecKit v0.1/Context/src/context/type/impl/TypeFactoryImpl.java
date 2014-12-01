/**
 */
package context.type.impl;

import context.type.*;

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
public class TypeFactoryImpl extends EFactoryImpl implements TypeFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TypeFactory init() {
        try {
            TypeFactory theTypeFactory = (TypeFactory)EPackage.Registry.INSTANCE.getEFactory(TypePackage.eNS_URI);
            if (theTypeFactory != null) {
                return theTypeFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new TypeFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeFactoryImpl() {
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
            case TypePackage.CONTEXT_SITUATION_TYPE: return createContextSituationType();
            case TypePackage.CONTEXT_INFORMATION_TYPE: return createContextInformationType();
            case TypePackage.CONTEXT_TYPE_PACKAGE: return createContextTypePackage();
            case TypePackage.ENTITY_ROLE_TYPE: return createEntityRoleType();
            case TypePackage.COMPOSITE_CONTEXT_SITUATION_TYPE: return createCompositeContextSituationType();
            case TypePackage.SITUATION_ROLE_TYPE: return createSituationRoleType();
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
            case TypePackage.ORIGIN_TYPE:
                return createOriginTypeFromString(eDataType, initialValue);
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
            case TypePackage.ORIGIN_TYPE:
                return convertOriginTypeToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextSituationType createContextSituationType() {
        ContextSituationTypeImpl contextSituationType = new ContextSituationTypeImpl();
        return contextSituationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextInformationType createContextInformationType() {
        ContextInformationTypeImpl contextInformationType = new ContextInformationTypeImpl();
        return contextInformationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextTypePackage createContextTypePackage() {
        ContextTypePackageImpl contextTypePackage = new ContextTypePackageImpl();
        return contextTypePackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityRoleType createEntityRoleType() {
        EntityRoleTypeImpl entityRoleType = new EntityRoleTypeImpl();
        return entityRoleType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CompositeContextSituationType createCompositeContextSituationType() {
        CompositeContextSituationTypeImpl compositeContextSituationType = new CompositeContextSituationTypeImpl();
        return compositeContextSituationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SituationRoleType createSituationRoleType() {
        SituationRoleTypeImpl situationRoleType = new SituationRoleTypeImpl();
        return situationRoleType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OriginType createOriginTypeFromString(EDataType eDataType, String initialValue) {
        OriginType result = OriginType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertOriginTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypePackage getTypePackage() {
        return (TypePackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static TypePackage getPackage() {
        return TypePackage.eINSTANCE;
    }

} //TypeFactoryImpl
